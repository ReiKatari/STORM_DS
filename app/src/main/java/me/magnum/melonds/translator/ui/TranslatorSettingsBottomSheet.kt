package me.magnum.melonds.translator.ui

import android.content.SharedPreferences
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.translator.GameTranslatorManager
import me.magnum.melonds.translator.model.TranslatorEngineType
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import me.magnum.melonds.translator.model.TranslatorTriggerMode
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.melonds.translator.tts.GameTtsManager

@Composable
fun TranslatorSettingsContent(
    preferences: SharedPreferences,
    onClose: () -> Unit,
    onSyncOverlay: () -> Unit,
    onStartAutoTranslate: () -> Unit,
    onOpenRegionEditor: () -> Unit,
    onPreviewTts: () -> Unit
) {
    val context = LocalContext.current
    val lang = context.resources.configuration.locales.get(0)?.language?.lowercase().orEmpty()
    var enginePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_ENGINE, "google") ?: "google") }
    var triggerModePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_TRIGGER_MODE, "on_demand") ?: "on_demand") }
    var overlayStylePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_OVERLAY_STYLE, "smart_background_match") ?: "smart_background_match") }

    var ttsEnabled by remember { mutableStateOf(preferences.getBoolean(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, false)) }
    var voiceEnginePref by remember { mutableStateOf(preferences.getString(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge") }
    var ttsLangPref by remember { mutableStateOf(preferences.getString(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto") }

    var voiceModelPref by remember { mutableStateOf(preferences.getString("translator_local_voice_model", "auto_multi") ?: "auto_multi") }
    var voicePitchVariance by remember { mutableStateOf(preferences.getInt(GameTtsManager.PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE, 65).coerceIn(0, 100).toFloat()) }
    var ttsSpeed by remember { mutableStateOf(preferences.getInt(GameTtsManager.PREF_TRANSLATOR_TTS_SPEED, 100).coerceIn(50, 200).toFloat()) }
    var showVoiceModelDialog by remember { mutableStateOf(false) }
    var showVoiceEngineDialog by remember { mutableStateOf(false) }
    var showTtsLangDialog by remember { mutableStateOf(false) }

    var fontSizeScale by remember { mutableStateOf(preferences.getInt(GameTranslatorManager.PREF_TRANSLATOR_FONT_SIZE_SCALE, 100).coerceIn(50, 200).toFloat()) }
    var bubbleOpacity by remember { mutableStateOf(preferences.getInt(GameTranslatorManager.PREF_TRANSLATOR_BUBBLE_OPACITY, 90).coerceIn(10, 100).toFloat()) }
    var pauseOnTranslate by remember { mutableStateOf(preferences.getBoolean(GameTranslatorManager.PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)) }
    var showFloatingButton by remember { mutableStateOf(preferences.getBoolean(GameTranslatorManager.PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, true)) }

    val voiceModelOptions = remember(context) {
        val values = context.resources.getStringArray(R.array.translator_local_voice_model_values)
        val titles = context.resources.getStringArray(R.array.translator_local_voice_model_options)
        values.indices.map { i -> values[i] to (titles.getOrNull(i) ?: values[i]) }
    }

    val ttsSpeedLabel = remember(lang) {
        when (lang) {
            "ru" -> "Скорость речи озвучки (%)"
            "de" -> "Sprechgeschwindigkeit (%)"
            "fr" -> "Vitesse de parole (%)"
            "zh" -> "语音朗读语速 (%)"
            "ja" -> "音声読み上げ速度 (%)"
            else -> "Speech rate (%)"
        }
    }

    val updatePref = { key: String, value: Any ->
        when (value) {
            is String -> preferences.edit().putString(key, value).apply()
            is Boolean -> preferences.edit().putBoolean(key, value).apply()
            is Int -> preferences.edit().putInt(key, value).apply()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(watermelon.surface)
            .padding(top = 16.dp)
    ) {
        // Handle bar
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(4.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(watermelon.surface3)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = context.getString(R.string.category_translator),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = watermelon.text,
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {
            // General Settings Card
            SettingsSectionTitle(context.getString(R.string.category_general))
            SettingsCard {
                SettingsSwitch(
                    label = context.getString(R.string.translator_pause_on_translate),
                    checked = pauseOnTranslate,
                    onCheckedChange = { 
                        pauseOnTranslate = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, it)
                    }
                )
                Divider(color = watermelon.line)
                SettingsSwitch(
                    label = context.getString(R.string.translator_show_floating_button),
                    checked = showFloatingButton,
                    onCheckedChange = {
                        showFloatingButton = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, it)
                        onSyncOverlay()
                    }
                )
                Divider(color = watermelon.line)
                SettingsOption(
                    label = context.getString(R.string.translator_engine),
                    value = TranslatorEngineType.fromPreference(enginePref).displayName.substringBefore(" ("),
                    onClick = {
                        val engines = TranslatorEngineType.entries.map { it.preferenceValue to it.displayName.substringBefore(" (") }
                        val nextIdx = (engines.indexOfFirst { it.first == enginePref } + 1) % engines.size
                        enginePref = engines[nextIdx].first
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_ENGINE, enginePref)
                        onSyncOverlay()
                    }
                )
                Divider(color = watermelon.line)
                SettingsOption(
                    label = context.getString(R.string.translator_trigger_mode),
                    value = when (TranslatorTriggerMode.fromPreference(triggerModePref)) {
                        TranslatorTriggerMode.ON_DEMAND -> context.getString(R.string.translator_trigger_mode_on_demand)
                        TranslatorTriggerMode.AUTO_SCREEN_CHANGE -> context.getString(R.string.translator_trigger_mode_auto)
                    },
                    onClick = {
                        triggerModePref = if (triggerModePref == "on_demand") "auto_screen_change" else "on_demand"
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_TRIGGER_MODE, triggerModePref)
                        onStartAutoTranslate()
                    }
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Visual Settings Card
            SettingsSectionTitle(context.getString(R.string.translator_overlay_style))
            SettingsCard {
                SettingsOption(
                    label = context.getString(R.string.translator_overlay_style),
                    value = when (TranslatorOverlayStyle.fromPreference(overlayStylePref)) {
                        TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> context.getString(R.string.translator_style_smart_match)
                        TranslatorOverlayStyle.SEMI_TRANSPARENT -> context.getString(R.string.translator_style_semi_transparent)
                        TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> context.getString(R.string.translator_style_neon_bubble)
                        TranslatorOverlayStyle.OUTLINE_ONLY -> context.getString(R.string.translator_style_outline_only)
                    },
                    onClick = {
                        val styles = TranslatorOverlayStyle.entries.map { it.preferenceValue }
                        val nextIdx = (styles.indexOf(overlayStylePref) + 1) % styles.size
                        overlayStylePref = styles[nextIdx]
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_OVERLAY_STYLE, overlayStylePref)
                        onSyncOverlay()
                    }
                )
                Divider(color = watermelon.line)
                SettingsSlider(
                    label = context.getString(R.string.translator_font_size_scale),
                    value = fontSizeScale,
                    valueRange = 50f..200f,
                    steps = 14,
                    valueText = "${fontSizeScale.toInt()}%",
                    onValueChange = { 
                        fontSizeScale = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_FONT_SIZE_SCALE, it.toInt())
                        onSyncOverlay()
                    }
                )
                Divider(color = watermelon.line)
                SettingsSlider(
                    label = context.getString(R.string.translator_bubble_opacity),
                    value = bubbleOpacity,
                    valueRange = 10f..100f,
                    steps = 17,
                    valueText = "${bubbleOpacity.toInt()}%",
                    onValueChange = { 
                        bubbleOpacity = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_BUBBLE_OPACITY, it.toInt())
                        onSyncOverlay()
                    }
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Voice Settings Card
            SettingsSectionTitle(context.getString(R.string.category_translator_tts))
            SettingsCard {
                SettingsSwitch(
                    label = context.getString(R.string.translator_tts_enabled),
                    checked = ttsEnabled,
                    onCheckedChange = { 
                        ttsEnabled = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, it)
                    }
                )
                if (ttsEnabled) {
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = context.getString(R.string.translator_tts_voice_engine_title),
                        value = when(voiceEnginePref) {
                            "neural_edge" -> "⚡ ${context.getString(R.string.translator_voice_engine_neural)}"
                            "local_multi" -> "🎙️ ${context.getString(R.string.translator_voice_engine_local_multi)}"
                            else -> "🤖 ${context.getString(R.string.translator_voice_engine_system)}"
                        },
                        onClick = {
                            showVoiceEngineDialog = true
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = context.getString(R.string.translator_tts_lang_title),
                        value = when(ttsLangPref) {
                            "auto" -> "🌐 ${context.getString(R.string.lang_auto)}"
                            "ru" -> "🇷🇺 ${context.getString(R.string.lang_ru)}"
                            "en" -> "🇬🇧 ${context.getString(R.string.lang_en)}"
                            "ja" -> "🇯🇵 ${context.getString(R.string.lang_ja)}"
                            "zh" -> "🇨🇳 ${context.getString(R.string.lang_zh)}"
                            "de" -> "🇩🇪 ${context.getString(R.string.lang_de)}"
                            "fr" -> "🇫🇷 ${context.getString(R.string.lang_fr)}"
                            "es" -> "🇪🇸 ${context.getString(R.string.lang_es)}"
                            else -> ttsLangPref.uppercase()
                        },
                        onClick = {
                            showTtsLangDialog = true
                        }
                    )
                    if (voiceEnginePref != "single") {
                        Divider(color = watermelon.line)
                        val currentModelLabel = voiceModelOptions.firstOrNull { it.first == voiceModelPref }?.second
                            ?: voiceModelOptions.firstOrNull()?.second.orEmpty()
                        SettingsOption(
                            label = context.getString(R.string.translator_local_voice_model_title),
                            value = currentModelLabel.substringBefore(" ("),
                            onClick = {
                                showVoiceModelDialog = true
                            }
                        )
                        Divider(color = watermelon.line)
                        SettingsSlider(
                            label = context.getString(R.string.translator_local_voice_pitch_variance_title),
                            value = voicePitchVariance,
                            valueRange = 0f..100f,
                            steps = 19,
                            valueText = "${voicePitchVariance.toInt()}%",
                            onValueChange = {
                                voicePitchVariance = it
                                updatePref(GameTtsManager.PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE, it.toInt())
                            }
                        )
                    }
                    Divider(color = watermelon.line)
                    SettingsSlider(
                        label = ttsSpeedLabel,
                        value = ttsSpeed,
                        valueRange = 50f..200f,
                        steps = 14,
                        valueText = "${ttsSpeed.toInt()}%",
                        onValueChange = {
                            ttsSpeed = it
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_SPEED, it.toInt())
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = context.getString(R.string.translator_preview_voice),
                        value = "",
                        onClick = onPreviewTts
                    )
                }
            }

            if (showVoiceEngineDialog) {
                val engines = listOf(
                    "neural_edge" to "⚡ ${context.getString(R.string.translator_voice_engine_neural)}",
                    "local_multi" to "🎙️ ${context.getString(R.string.translator_voice_engine_local_multi)}",
                    "single" to "🤖 ${context.getString(R.string.translator_voice_engine_system)}"
                )
                AlertDialog(
                    onDismissRequest = { showVoiceEngineDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = context.getString(R.string.translator_tts_voice_engine_title),
                            color = watermelon.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    },
                    text = {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            engines.forEach { (id, title) ->
                                val isSelected = id == voiceEnginePref
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (isSelected) watermelon.green.copy(alpha = 0.15f) else androidx.compose.ui.graphics.Color.Transparent)
                                        .clickable {
                                            voiceEnginePref = id
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, id)
                                            showVoiceEngineDialog = false
                                        }
                                        .padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = title,
                                        color = if (isSelected) watermelon.green else watermelon.text,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        fontSize = 13.sp,
                                        modifier = Modifier.weight(1f)
                                    )
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            voiceEnginePref = id
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, id)
                                            showVoiceEngineDialog = false
                                        },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = watermelon.green,
                                            unselectedColor = watermelon.text2
                                        )
                                    )
                                }
                            }
                        }
                    },
                    buttons = {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(onClick = { showVoiceEngineDialog = false }) {
                                Text(context.getString(R.string.close), color = watermelon.green, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                )
            }

            if (showTtsLangDialog) {
                val languages = listOf(
                    "auto" to "🌐 ${context.getString(R.string.lang_auto)}",
                    "ru" to "🇷🇺 ${context.getString(R.string.lang_ru)}",
                    "en" to "🇬🇧 ${context.getString(R.string.lang_en)}",
                    "ja" to "🇯🇵 ${context.getString(R.string.lang_ja)}",
                    "zh" to "🇨🇳 ${context.getString(R.string.lang_zh)}",
                    "de" to "🇩🇪 ${context.getString(R.string.lang_de)}",
                    "fr" to "🇫🇷 ${context.getString(R.string.lang_fr)}",
                    "es" to "🇪🇸 ${context.getString(R.string.lang_es)}"
                )
                AlertDialog(
                    onDismissRequest = { showTtsLangDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = context.getString(R.string.translator_tts_lang_title),
                            color = watermelon.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    },
                    text = {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            languages.forEach { (code, title) ->
                                val isSelected = code == ttsLangPref
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (isSelected) watermelon.green.copy(alpha = 0.15f) else androidx.compose.ui.graphics.Color.Transparent)
                                        .clickable {
                                            ttsLangPref = code
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, code)
                                            showTtsLangDialog = false
                                        }
                                        .padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = title,
                                        color = if (isSelected) watermelon.green else watermelon.text,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        fontSize = 13.sp,
                                        modifier = Modifier.weight(1f)
                                    )
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            ttsLangPref = code
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, code)
                                            showTtsLangDialog = false
                                        },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = watermelon.green,
                                            unselectedColor = watermelon.text2
                                        )
                                    )
                                }
                            }
                        }
                    },
                    buttons = {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(onClick = { showTtsLangDialog = false }) {
                                Text(context.getString(R.string.close), color = watermelon.green, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                )
            }

            if (showVoiceModelDialog) {
                AlertDialog(
                    onDismissRequest = { showVoiceModelDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = "🎭 ${context.getString(R.string.translator_voice_model_dialog_title)}",
                            color = watermelon.text,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    },
                    text = {
                        androidx.compose.foundation.lazy.LazyColumn(
                            modifier = Modifier.fillMaxWidth().heightIn(max = 420.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            items(voiceModelOptions.size) { index ->
                                val (packId, packDisplayName) = voiceModelOptions[index]
                                val isSelected = packId == voiceModelPref
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (isSelected) watermelon.green.copy(alpha = 0.15f) else androidx.compose.ui.graphics.Color.Transparent)
                                        .clickable {
                                            voiceModelPref = packId
                                            updatePref("translator_local_voice_model", voiceModelPref)
                                            showVoiceModelDialog = false
                                        }
                                        .padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = packDisplayName,
                                        color = if (isSelected) watermelon.green else watermelon.text,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        fontSize = 13.sp,
                                        modifier = Modifier.weight(1f)
                                    )
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            voiceModelPref = packId
                                            updatePref("translator_local_voice_model", voiceModelPref)
                                            showVoiceModelDialog = false
                                        },
                                        colors = RadioButtonDefaults.colors(
                                            selectedColor = watermelon.green,
                                            unselectedColor = watermelon.text2
                                        )
                                    )
                                }
                            }
                        }
                    },
                    buttons = {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(onClick = { showVoiceModelDialog = false }) {
                                Text(context.getString(R.string.close), color = watermelon.green, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = onOpenRegionEditor,
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = watermelon.green, contentColor = watermelon.surface)
                ) {
                    Text(context.getString(R.string.translator_regions_title), fontWeight = FontWeight.Bold)
                }
                Button(
                    onClick = {
                        val intent = android.content.Intent(context, me.magnum.melonds.ui.settings.SettingsActivity::class.java).apply {
                            putExtra(me.magnum.melonds.ui.settings.SettingsActivity.KEY_ENTRY_POINT, me.magnum.melonds.ui.settings.SettingsActivity.TRANSLATOR_ENTRY_POINT)
                        }
                        context.startActivity(intent)
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = watermelon.surface3, contentColor = watermelon.text)
                ) {
                    Text(context.getString(R.string.translator_action_all_settings), fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun SettingsSectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = watermelon.text2,
        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
    )
}

@Composable
fun SettingsCard(content: @Composable ColumnScope.() -> Unit) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = watermelon.surface2,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(content = content)
    }
}

@Composable
fun SettingsOption(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, color = watermelon.text, fontSize = 16.sp)
        Text(text = value, color = watermelon.green, fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun SettingsSwitch(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onCheckedChange(!checked) }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, color = watermelon.text, fontSize = 16.sp)
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(checkedThumbColor = watermelon.green, checkedTrackColor = watermelon.green.copy(alpha = 0.5f))
        )
    }
}

@Composable
fun SettingsSlider(
    label: String,
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    steps: Int,
    valueText: String,
    onValueChange: (Float) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = label, color = watermelon.text, fontSize = 16.sp)
            Text(text = valueText, color = watermelon.green, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        }
        Slider(
            value = value,
            onValueChange = onValueChange,
            valueRange = valueRange,
            steps = steps,
            colors = SliderDefaults.colors(thumbColor = watermelon.green, activeTrackColor = watermelon.green)
        )
    }
}
