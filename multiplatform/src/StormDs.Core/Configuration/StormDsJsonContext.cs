// Copyright (c) 2026 STORM TEAM. All rights reserved.
// Licensed under the Apache License, Version 2.0.

using System.Text.Json.Serialization;
using StormDs.Core.Library;
using StormDs.Core.Subsystems;

namespace StormDs.Core.Configuration;

[JsonSourceGenerationOptions(
    WriteIndented = true,
    PropertyNamingPolicy = JsonKnownNamingPolicy.CamelCase,
    GenerationMode = JsonSourceGenerationMode.Default)]
[JsonSerializable(typeof(StormDsAppConfig))]
[JsonSerializable(typeof(ScreenLayoutMode))]
[JsonSerializable(typeof(ScreenScaleMode))]
[JsonSerializable(typeof(PerRomProfile))]
[JsonSerializable(typeof(VulkanCompatDatabase))]
[JsonSerializable(typeof(VulkanCompatProfileEntry))]
[JsonSerializable(typeof(List<VulkanCompatProfileEntry>))]
[JsonSerializable(typeof(RomMetadataRecord))]
[JsonSerializable(typeof(List<RomMetadataRecord>))]
[JsonSerializable(typeof(ActionReplayCheat))]
[JsonSerializable(typeof(List<ActionReplayCheat>))]
[JsonSerializable(typeof(RetroAchievementsQueueItem))]
[JsonSerializable(typeof(List<RetroAchievementsQueueItem>))]
[JsonSerializable(typeof(DsiTitleMetadata))]
[JsonSerializable(typeof(List<DsiTitleMetadata>))]
[JsonSerializable(typeof(DsiNandSummaryModel))]
[JsonSerializable(typeof(AiTranslationRequest))]
[JsonSerializable(typeof(AiTranslationResponse))]
[JsonSerializable(typeof(OllamaGenerateRequest))]
[JsonSerializable(typeof(OpenAiChatRequest))]
[JsonSerializable(typeof(OpenAiChatMessage))]
[JsonSerializable(typeof(List<OpenAiChatMessage>))]
[JsonSerializable(typeof(Dictionary<string, string>))]
[JsonSerializable(typeof(List<string>))]
public partial class StormDsJsonContext : JsonSerializerContext
{
}
