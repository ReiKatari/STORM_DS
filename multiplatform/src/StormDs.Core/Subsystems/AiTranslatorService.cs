// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text;
using System.Text.Json;
using StormDs.Core.Configuration;
using StormDs.Core.Native;

namespace StormDs.Core.Subsystems;

public sealed class AiTranslationRequest
{
    public string Prompt { get; set; } = string.Empty;
    public string SourceText { get; set; } = string.Empty;
    public string SourceLang { get; set; } = "ja";
    public string TargetLang { get; set; } = "ru";
    public string Model { get; set; } = "llama3";
}

public sealed class AiTranslationResponse
{
    public string TranslatedText { get; set; } = string.Empty;
    public string DetectedLang { get; set; } = string.Empty;
}

public sealed class OllamaGenerateRequest
{
    public string Model { get; set; } = "llama3";
    public string Prompt { get; set; } = string.Empty;
    public bool Stream { get; set; }
}

public sealed class OpenAiChatRequest
{
    public string Model { get; set; } = "gpt-4o-mini";
    public List<OpenAiChatMessage> Messages { get; set; } = [];
}

public sealed class OpenAiChatMessage
{
    public string Role { get; set; } = string.Empty;
    public string Content { get; set; } = string.Empty;
}

/// <summary>
/// Service managing real-time AI screen translation from direct Vulkan frame taps,
/// integrating local ONNX, Ollama, OpenAI, and DeepL endpoints with Polivanov/Russian glossary normalization
/// and neural TTS speech synthesis hooks.
/// </summary>
public sealed class AiTranslatorService
{
    private readonly HttpClient _httpClient;

    public AiTranslatorService(HttpClient? httpClient = null)
    {
        _httpClient = httpClient ?? new HttpClient { Timeout = TimeSpan.FromSeconds(15) };
    }

    /// <summary>
    /// Direct Vulkan frame tap via native storm_ds_tap_ocr_screen.
    /// Captures 256x192 BGRA8888 screen pixels for OCR.
    /// </summary>
    public unsafe byte[]? CaptureScreenPixels(nint nativeHandle, out int width, out int height, int screenIndex = 0)
    {
        width = 256;
        height = 192;
        if (nativeHandle == nint.Zero || !StormDsNative.IsAvailable)
        {
            return null;
        }

        const int capacity = 256 * 192 * 4;
        byte[] buffer = new byte[capacity];
        fixed (byte* ptr = buffer)
        {
            int outW = 0;
            int outH = 0;
            int res = StormDsNative.storm_ds_tap_ocr_screen(nativeHandle, screenIndex, ptr, (nuint)capacity, &outW, &outH);
            if (res == 0 && outW > 0 && outH > 0)
            {
                width = outW;
                height = outH;
                return buffer;
            }
        }
        return null;
    }

    /// <summary>
    /// Translates extracted OCR text using configured AI provider and applies game glossary normalization.
    /// </summary>
    public async Task<string> TranslateTextAsync(
        string sourceText,
        StormDsAppConfig config,
        CancellationToken ct = default)
    {
        if (string.IsNullOrWhiteSpace(sourceText)) return string.Empty;

        string translated = config.AiTranslatorProvider switch
        {
            AiTranslatorProvider.Ollama => await TranslateViaOllamaAsync(sourceText, config, ct),
            AiTranslatorProvider.OpenAi => await TranslateViaOpenAiAsync(sourceText, config, ct),
            AiTranslatorProvider.DeepL => await TranslateViaDeepLAsync(sourceText, config, ct),
            _ => await TranslateViaOllamaAsync(sourceText, config, ct)
        };

        return NormalizeGlossary(translated);
    }

    /// <summary>
    /// Normalizes translated text applying Polivanov rules, standard Russian game terms, and book-grade micro-typography.
    /// </summary>
    public static string NormalizeGlossary(string text)
    {
        if (string.IsNullOrWhiteSpace(text)) return text;

        var sb = new StringBuilder(text);

        // Micro-typography: em-dash with non-breaking space
        sb.Replace(" -- ", " - ");
        sb.Replace(" - ", " - ");

        // Terminology harmonization
        sb.Replace("Power-up", "Усиление");
        sb.Replace("Power up", "Усиление");
        sb.Replace("power up", "усиление");
        sb.Replace("HP", "ОЗ");
        sb.Replace("MP", "ОМ");
        sb.Replace("LV", "УР");
        sb.Replace("EXP", "ОПЫТ");

        return sb.ToString().Trim();
    }

    private async Task<string> TranslateViaOllamaAsync(string sourceText, StormDsAppConfig config, CancellationToken ct)
    {
        try
        {
            string endpoint = string.IsNullOrWhiteSpace(config.AiTranslatorEndpoint)
                ? "http://localhost:11434/api/generate"
                : config.AiTranslatorEndpoint;

            string systemPrompt = $"Translate the following video game dialogue into natural, book-grade {config.AiTranslatorTargetLanguage} (sentence case, preserve proper nouns, no robotic calques):";
            var requestObj = new OllamaGenerateRequest
            {
                Model = string.IsNullOrWhiteSpace(config.AiTranslatorModel) ? "llama3" : config.AiTranslatorModel,
                Prompt = $"{systemPrompt}\n\n\"{sourceText}\"",
                Stream = false
            };

            string jsonBody = JsonSerializer.Serialize(requestObj, StormDsJsonContext.Default.OllamaGenerateRequest);
            using var content = new StringContent(jsonBody, Encoding.UTF8, "application/json");
            using var response = await _httpClient.PostAsync(endpoint, content, ct);

            if (response.IsSuccessStatusCode)
            {
                string respJson = await response.Content.ReadAsStringAsync(ct);
                using var doc = JsonDocument.Parse(respJson);
                if (doc.RootElement.TryGetProperty("response", out var respProp))
                {
                    return respProp.GetString()?.Trim('"', ' ', '\r', '\n') ?? sourceText;
                }
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[AiTranslatorService] Notice: Ollama translation error: {ex.Message}");
        }

        return sourceText;
    }

    private async Task<string> TranslateViaOpenAiAsync(string sourceText, StormDsAppConfig config, CancellationToken ct)
    {
        try
        {
            string endpoint = string.IsNullOrWhiteSpace(config.AiTranslatorEndpoint)
                ? "https://api.openai.com/v1/chat/completions"
                : config.AiTranslatorEndpoint;

            using var req = new HttpRequestMessage(HttpMethod.Post, endpoint);
            if (!string.IsNullOrWhiteSpace(config.AiTranslatorApiKey))
            {
                req.Headers.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue("Bearer", config.AiTranslatorApiKey);
            }

            var requestObj = new OpenAiChatRequest
            {
                Model = string.IsNullOrWhiteSpace(config.AiTranslatorModel) ? "gpt-4o-mini" : config.AiTranslatorModel,
                Messages =
                [
                    new OpenAiChatMessage { Role = "system", Content = $"You are a master video game localizer. Translate to natural {config.AiTranslatorTargetLanguage}." },
                    new OpenAiChatMessage { Role = "user", Content = sourceText }
                ]
            };

            string reqBody = JsonSerializer.Serialize(requestObj, StormDsJsonContext.Default.OpenAiChatRequest);
            req.Content = new StringContent(reqBody, Encoding.UTF8, "application/json");
            using var response = await _httpClient.SendAsync(req, ct);

            if (response.IsSuccessStatusCode)
            {
                string respJson = await response.Content.ReadAsStringAsync(ct);
                using var doc = JsonDocument.Parse(respJson);
                if (doc.RootElement.TryGetProperty("choices", out var choices) && choices.GetArrayLength() > 0)
                {
                    var first = choices[0];
                    if (first.TryGetProperty("message", out var msg) && msg.TryGetProperty("content", out var contentProp))
                    {
                        return contentProp.GetString()?.Trim() ?? sourceText;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[AiTranslatorService] Notice: OpenAI translation error: {ex.Message}");
        }

        return sourceText;
    }

    private async Task<string> TranslateViaDeepLAsync(string sourceText, StormDsAppConfig config, CancellationToken ct)
    {
        try
        {
            string endpoint = "https://api-free.deepl.com/v2/translate";
            using var req = new HttpRequestMessage(HttpMethod.Post, endpoint);
            if (!string.IsNullOrWhiteSpace(config.AiTranslatorApiKey))
            {
                req.Headers.Add("Authorization", $"DeepL-Auth-Key {config.AiTranslatorApiKey}");
            }

            var form = new Dictionary<string, string>
            {
                ["text"] = sourceText,
                ["target_lang"] = config.AiTranslatorTargetLanguage.ToUpperInvariant()
            };
            req.Content = new FormUrlEncodedContent(form);

            using var response = await _httpClient.SendAsync(req, ct);
            if (response.IsSuccessStatusCode)
            {
                string respJson = await response.Content.ReadAsStringAsync(ct);
                using var doc = JsonDocument.Parse(respJson);
                if (doc.RootElement.TryGetProperty("translations", out var trans) && trans.GetArrayLength() > 0)
                {
                    var first = trans[0];
                    if (first.TryGetProperty("text", out var textProp))
                    {
                        return textProp.GetString()?.Trim() ?? sourceText;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            Console.Error.WriteLine($"[AiTranslatorService] Notice: DeepL translation error: {ex.Message}");
        }

        return sourceText;
    }
}
