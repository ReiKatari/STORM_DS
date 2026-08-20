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
    var enginePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_ENGINE, "google") ?: "google") }
    var triggerModePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_TRIGGER_MODE, "on_demand") ?: "on_demand") }
    var overlayStylePref by remember { mutableStateOf(preferences.getString(GameTranslatorManager.PREF_TRANSLATOR_OVERLAY_STYLE, "smart_background_match") ?: "smart_background_match") }
    
    var ttsEnabled by remember { mutableStateOf(preferences.getBoolean(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, false)) }
    var voiceEnginePref by remember { mutableStateOf(preferences.getString(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge") }
    var ttsLangPref by remember { mutableStateOf(preferences.getString(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto") }
    
    var fontSizeScale by remember { mutableStateOf(preferences.getInt(GameTranslatorManager.PREF_TRANSLATOR_FONT_SIZE_SCALE, 100).toFloat()) }
    var bubbleOpacity by remember { mutableStateOf(preferences.getInt(GameTranslatorManager.PREF_TRANSLATOR_BUBBLE_OPACITY, 90).toFloat()) }
    var pauseOnTranslate by remember { mutableStateOf(preferences.getBoolean(GameTranslatorManager.PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)) }

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
            text = "Настройки перевода",
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
            SettingsSectionTitle("Основные")
            SettingsCard {
                SettingsSwitch(
                    label = "Пауза при переводе",
                    checked = pauseOnTranslate,
                    onCheckedChange = { 
                        pauseOnTranslate = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, it)
                    }
                )
                Divider(color = watermelon.line)
                SettingsOption(
                    label = "Движок перевода",
                    value = TranslatorEngineType.fromPreference(enginePref).displayName.substringBefore(" ("),
                    onClick = {
                        val engines = TranslatorEngineType.entries.map { it.preferenceValue to it.displayName.substringBefore(" (") }
                        val nextIdx = (engines.indexOfFirst { it.first == enginePref } + 1) % engines.size
                        enginePref = engines[nextIdx].first
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_ENGINE, enginePref)
                    }
                )
                Divider(color = watermelon.line)
                SettingsOption(
                    label = "Режим активации",
                    value = when (TranslatorTriggerMode.fromPreference(triggerModePref)) {
                        TranslatorTriggerMode.ON_DEMAND -> "По кнопке"
                        TranslatorTriggerMode.AUTO_SCREEN_CHANGE -> "Автоматически"
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
            SettingsSectionTitle("Внешний вид")
            SettingsCard {
                SettingsOption(
                    label = "Стиль наложения",
                    value = when (TranslatorOverlayStyle.fromPreference(overlayStylePref)) {
                        TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> "С фоном"
                        TranslatorOverlayStyle.SEMI_TRANSPARENT -> "Полупрозрачный"
                        TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> "Бабл"
                        TranslatorOverlayStyle.OUTLINE_ONLY -> "Только контур"
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
                    label = "Размер шрифта",
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
                    label = "Непрозрачность фона",
                    value = bubbleOpacity,
                    valueRange = 0f..100f,
                    steps = 19,
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
            SettingsSectionTitle("Озвучка (TTS)")
            SettingsCard {
                SettingsSwitch(
                    label = "Включить озвучку",
                    checked = ttsEnabled,
                    onCheckedChange = { 
                        ttsEnabled = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, it)
                    }
                )
                if (ttsEnabled) {
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = "Голос",
                        value = when(voiceEnginePref) {
                            "neural_edge" -> "Живой Edge"
                            "local_multi" -> "Многоголосая"
                            else -> "Стандартный"
                        },
                        onClick = {
                            val engines = listOf("neural_edge", "local_multi", "single")
                            val nextIdx = (engines.indexOf(voiceEnginePref) + 1) % engines.size
                            voiceEnginePref = engines[nextIdx]
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, voiceEnginePref)
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, voiceEnginePref == "neural_edge")
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, voiceEnginePref != "single")
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = "Язык",
                        value = if (ttsLangPref == "auto") "Авто" else ttsLangPref.uppercase(),
                        onClick = {
                            val langs = listOf("auto", "ru", "en", "ja", "zh")
                            val nextIdx = (langs.indexOf(ttsLangPref) + 1) % langs.size
                            ttsLangPref = langs[nextIdx]
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, ttsLangPref)
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = "Проверить голос ▶️",
                        value = "",
                        onClick = onPreviewTts
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(
                onClick = onOpenRegionEditor,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(backgroundColor = watermelon.green, contentColor = watermelon.surface)
            ) {
                Text("Настроить зоны перевода (OCR)", fontWeight = FontWeight.Bold)
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
