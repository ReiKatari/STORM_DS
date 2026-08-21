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
    
    var voiceActorStudioEnabled by remember { mutableStateOf(preferences.getBoolean("translator_local_voice_actor_studio", false)) }
    var voiceModelPref by remember { mutableStateOf(preferences.getString("translator_local_voice_model", "auto_multi") ?: "auto_multi") }
    var voicePitchVariance by remember { mutableStateOf(preferences.getInt("translator_local_voice_pitch_variance", 65).toFloat()) }
    var showVoiceModelDialog by remember { mutableStateOf(false) }
    var showVoiceEngineDialog by remember { mutableStateOf(false) }
    var showTtsLangDialog by remember { mutableStateOf(false) }

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
                    label = "Включить озвучку диалогов",
                    checked = ttsEnabled || voiceActorStudioEnabled,
                    onCheckedChange = { 
                        ttsEnabled = it
                        updatePref(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, it)
                        if (!it && voiceActorStudioEnabled) {
                            voiceActorStudioEnabled = false
                            updatePref("translator_local_voice_actor_studio", false)
                        }
                    }
                )
                if (ttsEnabled || voiceActorStudioEnabled) {
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = "Голос / Движок озвучки",
                        value = when(voiceEnginePref) {
                            "neural_edge" -> "⚡ Нейро-голоса Edge Cloud"
                            "local_multi" -> "🎙️ Локальный AI Studio (Piper INT8)"
                            else -> "🤖 Системный Android TTS"
                        },
                        onClick = {
                            showVoiceEngineDialog = true
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsOption(
                        label = "Язык озвучки",
                        value = when(ttsLangPref) {
                            "auto" -> "🌐 Автовыбор (по языку)"
                            "ru" -> "🇷🇺 Русский"
                            "en" -> "🇬🇧 Английский"
                            "ja" -> "🇯🇵 Японский"
                            "zh" -> "🇨🇳 Китайский"
                            "de" -> "🇩🇪 Немецкий"
                            "fr" -> "🇫🇷 Французский"
                            "es" -> "🇪🇸 Испанский"
                            else -> ttsLangPref.uppercase()
                        },
                        onClick = {
                            showTtsLangDialog = true
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

            // AI Voice Actor Studio Card
            SettingsSectionTitle("AI Voice Actor Studio (Piper INT8)")
            SettingsCard {
                SettingsSwitch(
                    label = "AI Voice Actor Studio",
                    checked = voiceActorStudioEnabled,
                    onCheckedChange = { 
                        voiceActorStudioEnabled = it
                        updatePref("translator_local_voice_actor_studio", it)
                        if (it) {
                            ttsEnabled = true
                            updatePref(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED, true)
                            voiceEnginePref = "local_multi"
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE, "local_multi")
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, false)
                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
                        }
                    }
                )
                if (voiceActorStudioEnabled) {
                    Divider(color = watermelon.line)
                    val availablePacks = me.magnum.melonds.translator.tts.LocalAiVoiceActorStudio.getAvailableModelPacks(context)
                    val currentPack = availablePacks.firstOrNull { it.id == voiceModelPref } ?: availablePacks.first()
                    SettingsOption(
                        label = "Пакет нейромоделей",
                        value = currentPack.displayName,
                        onClick = {
                            showVoiceModelDialog = true
                        }
                    )
                    Divider(color = watermelon.line)
                    SettingsSlider(
                        label = "Вариативность тембра",
                        value = voicePitchVariance,
                        valueRange = 0f..100f,
                        steps = 19,
                        valueText = "${voicePitchVariance.toInt()}%",
                        onValueChange = { 
                            voicePitchVariance = it
                            updatePref("translator_local_voice_pitch_variance", it.toInt())
                        }
                    )
                }
            }

            if (showVoiceEngineDialog) {
                val engines = listOf(
                    "neural_edge" to "⚡ Нейро-голоса Edge Cloud (Высокое качество, 24 характера)",
                    "local_multi" to "🎙️ Локальный AI Voice Actor Studio (Piper INT8 оффлайн)",
                    "single" to "🤖 Системный Android TTS (Базовый синтезатор)"
                )
                AlertDialog(
                    onDismissRequest = { showVoiceEngineDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = "Движок и режим озвучки",
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
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, id == "neural_edge")
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, id != "single")
                                            if (id == "local_multi") {
                                                voiceActorStudioEnabled = true
                                                updatePref("translator_local_voice_actor_studio", true)
                                            }
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
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_NEURAL_ENABLED, id == "neural_edge")
                                            updatePref(GameTtsManager.PREF_TRANSLATOR_TTS_MULTI_VOICE, id != "single")
                                            if (id == "local_multi") {
                                                voiceActorStudioEnabled = true
                                                updatePref("translator_local_voice_actor_studio", true)
                                            }
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
                                Text("Закрыть", color = watermelon.green, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                )
            }

            if (showTtsLangDialog) {
                val languages = listOf(
                    "auto" to "🌐 Автовыбор (по языку перевода)",
                    "ru" to "🇷🇺 Русский (ru)",
                    "en" to "🇬🇧 Английский (en)",
                    "ja" to "🇯🇵 Японский (ja)",
                    "zh" to "🇨🇳 Китайский (zh)",
                    "de" to "🇩🇪 Немецкий (de)",
                    "fr" to "🇫🇷 Французский (fr)",
                    "es" to "🇪🇸 Испанский (es)"
                )
                AlertDialog(
                    onDismissRequest = { showTtsLangDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = "Язык озвучки",
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
                                Text("Закрыть", color = watermelon.green, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                )
            }

            if (showVoiceModelDialog) {
                val availablePacks = me.magnum.melonds.translator.tts.LocalAiVoiceActorStudio.getAvailableModelPacks(context)
                AlertDialog(
                    onDismissRequest = { showVoiceModelDialog = false },
                    backgroundColor = watermelon.surface,
                    shape = RoundedCornerShape(16.dp),
                    title = {
                        Text(
                            text = "🎭 Пакет нейромоделей голоса (24 голоса)",
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
                            items(availablePacks.size) { index ->
                                val pack = availablePacks[index]
                                val isSelected = pack.id == voiceModelPref
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(if (isSelected) watermelon.green.copy(alpha = 0.15f) else androidx.compose.ui.graphics.Color.Transparent)
                                        .clickable {
                                            voiceModelPref = pack.id
                                            updatePref("translator_local_voice_model", voiceModelPref)
                                            showVoiceModelDialog = false
                                        }
                                        .padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = pack.displayName,
                                        color = if (isSelected) watermelon.green else watermelon.text,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        fontSize = 13.sp,
                                        modifier = Modifier.weight(1f)
                                    )
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = {
                                            voiceModelPref = pack.id
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
                                Text("Закрыть", color = watermelon.green, fontWeight = FontWeight.Bold)
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
                    Text("Зоны OCR", fontWeight = FontWeight.Bold)
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
                    Text("Все настройки ⚙️", fontWeight = FontWeight.Bold)
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
