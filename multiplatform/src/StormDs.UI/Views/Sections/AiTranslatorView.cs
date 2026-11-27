// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System;
using Avalonia;
using Avalonia.Controls;
using Avalonia.Layout;
using Avalonia.Media;
using Storm.AuroraFluid.Kit.Controls;
using Storm.AuroraFluid.Kit.Icons;
using Storm.AuroraFluid.Kit.Services;
using StormDs.UI.Common;

namespace StormDs.UI.Views.Sections;

/// <summary>
/// Real-time AI Screen Translator and Neural TTS workspace section.
/// Allows testing configured AI translation providers (ONNX/Ollama/OpenAI/DeepL) and inspecting emulator frame taps.
/// </summary>
public class AiTranslatorView : ScrollViewer
{
    private readonly TextBlock _providerStatusText;
    private readonly TextBox _inputBox;
    private readonly TextBox _outputBox;
    private readonly TextBlock _statusText;

    public AiTranslatorView()
    {
        Margin = new Thickness(16, 8, 16, 8);
        Padding = new Thickness(0, 0, 14, 0);

        var rootStack = new StackPanel { Spacing = 14 };

        var card = new AuroraGlassCard { Padding = new Thickness(18), SpotlightEnabled = true };
        var stack = new StackPanel { Spacing = 10 };

        var titleRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 8, VerticalAlignment = VerticalAlignment.Center };
        titleRow.Children.Add(new AuroraVectorIcon { Kind = AuroraIconKind.AiTranslatorSpark, Size = 22, VerticalAlignment = VerticalAlignment.Center });
        var titleBlock = new TextBlock { Text = "ИИ-ПЕРЕВОДЧИК ЭКРАНА И ОЗВУЧКА TTS", FontSize = 15, FontWeight = FontWeight.Bold };
        titleRow.Children.Add(titleBlock);
        stack.Children.Add(titleRow);

        _providerStatusText = new TextBlock { FontSize = 12 };
        stack.Children.Add(_providerStatusText);

        var inputLabel = new TextBlock { Text = "Исходный текст (например, японский или английский диалог из игры):", FontSize = 11.5 };
        stack.Children.Add(inputLabel);

        _inputBox = new TextBox
        {
            Text = "HPがピンチだ！回復アイテムを使おう！",
            Height = 76,
            AcceptsReturn = true,
            TextWrapping = TextWrapping.Wrap
        };
        stack.Children.Add(_inputBox);

        _outputBox = new TextBox
        {
            IsReadOnly = true,
            Height = 76,
            TextWrapping = TextWrapping.Wrap,
            PlaceholderText = "Здесь появится переведенный текст..."
        };

        _statusText = new TextBlock { FontSize = 11 };

        var btnRow = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 10 };
        var translateBtn = CreateBtn(AuroraIconKind.AiTranslatorSpark, "Перевести тест через ИИ", async () =>
        {
            string src = _inputBox.Text ?? string.Empty;
            if (string.IsNullOrWhiteSpace(src)) return;
            _statusText.Text = "Отправка запроса к выбранному провайдеру...";
            try
            {
                string translated = await StormDsUiState.Instance.AiTranslatorService.TranslateTextAsync(
                    src,
                    StormDsUiState.Instance.AppConfig);
                _outputBox.Text = string.IsNullOrWhiteSpace(translated)
                    ? "(Провайдер вернул пустой ответ - проверьте Endpoint и API ключ в настройках)"
                    : translated;
                _statusText.Text = "Перевод завершен";
            }
            catch (Exception ex)
            {
                _outputBox.Text = $"Ошибка: {ex.Message}";
                _statusText.Text = "Не удалось выполнить запрос";
            }
        });

        var tapBtn = CreateBtn(AuroraIconKind.ScreenshotCamera, "Снять кадр эмулятора для OCR", () =>
        {
            if (!StormDsUiState.Instance.IsEmulationActive || StormDsUiState.Instance.EngineService.NativeHandle == nint.Zero)
            {
                _statusText.Text = "Запустите игру для захвата кадра OCR напрямую из ядра.";
                return;
            }
            var px = StormDsUiState.Instance.AiTranslatorService.CaptureScreenPixels(
                StormDsUiState.Instance.EngineService.NativeHandle,
                out int w,
                out int h,
                0);
            _statusText.Text = px != null
                ? $"Кадр {w}x{h} ({px.Length} байт) успешно захвачен из видеопамяти."
                : "Ядро вернуло пустой буфер кадра.";
        });

        var settingsBtn = CreateBtn(AuroraIconKind.SettingsCore, "Настроить модель ИИ", () =>
        {
            StormDsUiState.Instance.SetNavSection(NavSectionKind.Settings);
        });

        btnRow.Children.Add(translateBtn);
        btnRow.Children.Add(tapBtn);
        btnRow.Children.Add(settingsBtn);
        stack.Children.Add(btnRow);

        var outputLabel = new TextBlock { Text = "Результат перевода (с игровой глоссарной нормализацией):", FontSize = 11.5 };
        stack.Children.Add(outputLabel);
        stack.Children.Add(_outputBox);
        stack.Children.Add(_statusText);

        card.Content = stack;
        rootStack.Children.Add(card);
        Content = rootStack;

        StormThemeBrushes.BindTheme(this, () =>
        {
            titleBlock.Foreground = StormThemeBrushes.Accent;
            _providerStatusText.Foreground = StormThemeBrushes.SecondaryText;
            inputLabel.Foreground = StormThemeBrushes.BodyText;
            outputLabel.Foreground = StormThemeBrushes.BodyText;
            _statusText.Foreground = StormThemeBrushes.AccentSecondary;
            RefreshConfig();
        });

        StormDsUiState.Instance.SettingsSaved += RefreshConfig;
        RefreshConfig();
    }

    public void RefreshConfig()
    {
        var cfg = StormDsUiState.Instance.AppConfig;
        _providerStatusText.Text = $"Провайдер: {cfg.AiTranslatorProvider} | Модель: {cfg.AiTranslatorModel} | Endpoint: {cfg.AiTranslatorEndpoint} | TTS: {(cfg.AiTranslatorAutoSpeakTts ? "Включен" : "Отключен")}";
    }

    private static AuroraVolumetricButton CreateBtn(AuroraIconKind icon, string text, Action onClick)
    {
        var btn = new AuroraVolumetricButton { Height = 32, Padding = new Thickness(12, 2) };
        var sp = new StackPanel { Orientation = Orientation.Horizontal, Spacing = 6, VerticalAlignment = VerticalAlignment.Center };
        sp.Children.Add(new AuroraVectorIcon { Kind = icon, Size = 14, VerticalAlignment = VerticalAlignment.Center });
        sp.Children.Add(new TextBlock { Text = text, FontSize = 11.5, FontWeight = FontWeight.SemiBold, VerticalAlignment = VerticalAlignment.Center });
        btn.Content = sp;
        btn.Click += (_, _) =>
        {
            AuroraTactileFeedbackService.Instance.PlayClick();
            onClick();
        };
        return btn;
    }
}
