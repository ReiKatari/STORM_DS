package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.preference.EditTextPreference
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreferenceCompat
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.translator.engine.TranslationCache
import me.magnum.melonds.translator.tts.GameTtsManager
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider

@AndroidEntryPoint
class TranslatorPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private var ttsManagerInstance: GameTtsManager? = null

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_translator, rootKey)

        val lang = resources.configuration.locales.get(0)?.language?.lowercase().orEmpty()

        val translatorEnabledPref = findPreference<SwitchPreferenceCompat>("translator_enabled")
        val ttsEnabledPref = findPreference<SwitchPreferenceCompat>("translator_tts_enabled")
        val voiceEnginePref = findPreference<ListPreference>(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE)
        val voiceModelPref = findPreference<ListPreference>("translator_local_voice_model")
        val pitchVariancePref = findPreference<SeekBarPreference>(GameTtsManager.PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE)
        val ttsSpeedPref = findPreference<SeekBarPreference>(GameTtsManager.PREF_TRANSLATOR_TTS_SPEED)
        val voicePitchPref = findPreference<SeekBarPreference>("translator_voice_pitch")
        val floatingOpacityPref = findPreference<SeekBarPreference>("translator_floating_button_opacity")
        val testVoicePref = findPreference<Preference>("pref_translator_test_voice")

        // 1. Floating button opacity live % summary
        floatingOpacityPref?.apply {
            val baseSummary = summary?.toString().orEmpty()
            summary = "${value}% — $baseSummary"
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 35
                summary = "${intVal}% — $baseSummary"
                true
            }
        }

        // 2. Voice pitch live % summary
        voicePitchPref?.apply {
            val baseSummary = summary?.toString().orEmpty()
            val sign = if (value >= 0) "+" else ""
            summary = "${sign}${value}% — $baseSummary"
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 0
                val s = if (intVal >= 0) "+" else ""
                summary = "${s}${intVal}% — $baseSummary"
                true
            }
        }

        // 3. Speech speed live % summary
        ttsSpeedPref?.apply {
            title = when (lang) {
                "ru" -> "Скорость речи озвучки (%)"
                "de" -> "Sprechgeschwindigkeit (%)"
                "fr" -> "Vitesse de parole (%)"
                "zh" -> "语音朗读语速 (%)"
                "ja" -> "音声読み上げ速度 (%)"
                else -> "Speech rate (%)"
            }
            summary = when (lang) {
                "ru" -> "${value}% — Темп произношения переведённых реплик (100% — стандартный)"
                "de" -> "${value}% — Sprechtempo für übersetzte Dialoge (100% ist Standard)"
                "fr" -> "${value}% — Cadence de lecture des dialogues traduits (100% par défaut)"
                "zh" -> "${value}% — 调整已翻译对话的朗读速度（100% 为标准语速）"
                "ja" -> "${value}% — 翻訳されたセリフの読み上げテンポ（100%が標準）"
                else -> "${value}% — Playback speed for translated dialogue (100% is normal)"
            }
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 100
                summary = when (lang) {
                    "ru" -> "${intVal}% — Темп произношения переведённых реплик (100% — стандартный)"
                    "de" -> "${intVal}% — Sprechtempo für übersetzte Dialoge (100% ist Standard)"
                    "fr" -> "${intVal}% — Cadence de lecture des dialogues traduits (100% par défaut)"
                    "zh" -> "${intVal}% — 调整已翻译对话的朗读速度（100% 为标准语速）"
                    "ja" -> "${intVal}% — 翻訳されたセリフの読み上げテンポ（100%が標準）"
                    else -> "${intVal}% — Playback speed for translated dialogue (100% is normal)"
                }
                true
            }
        }

        fun updateMultiVoiceControlsState(engineValue: String?, ttsActive: Boolean) {
            val isMultiVoice = (engineValue ?: "neural_edge") != "single"
            voiceModelPref?.isVisible = isMultiVoice
            voiceModelPref?.isEnabled = isMultiVoice && ttsActive
            pitchVariancePref?.isVisible = isMultiVoice
            pitchVariancePref?.isEnabled = isMultiVoice && ttsActive
            voicePitchPref?.isVisible = isMultiVoice
            voicePitchPref?.isEnabled = isMultiVoice && ttsActive
            testVoicePref?.isEnabled = ttsActive
        }

        updateMultiVoiceControlsState(voiceEnginePref?.value, ttsEnabledPref?.isChecked == true)

        translatorEnabledPref?.setOnPreferenceChangeListener { _, newValue ->
            val isEnabled = newValue as? Boolean ?: false
            if (!isEnabled) {
                ttsEnabledPref?.isChecked = false
                updateMultiVoiceControlsState(voiceEnginePref?.value, false)
            }
            true
        }

        ttsEnabledPref?.setOnPreferenceChangeListener { _, newValue ->
            val isTtsEnabled = newValue as? Boolean ?: false
            updateMultiVoiceControlsState(voiceEnginePref?.value, isTtsEnabled)
            true
        }

        voiceEnginePref?.setOnPreferenceChangeListener { _, newValue ->
            val chosen = newValue as? String ?: "neural_edge"
            updateMultiVoiceControlsState(chosen, ttsEnabledPref?.isChecked == true)
            true
        }

        // 4. Test Voice Button
        testVoicePref?.setOnPreferenceClickListener {
            try {
                if (ttsManagerInstance == null) {
                    ttsManagerInstance = GameTtsManager(requireContext())
                }
                val selectedModel = voiceModelPref?.value ?: "auto_gender_neural"
                val toastMsg = getString(R.string.translator_test_voice_playing)
                Toast.makeText(requireContext(), toastMsg, Toast.LENGTH_SHORT).show()

                if (selectedModel == "auto_gender_neural") {
                    ttsManagerInstance?.speak(
                        "Майя: Феникс, смотри! Мы нашли важную улику!\nФеникс: Отлично, Майя! Теперь у нас есть шанс в суде!",
                        "ru"
                    )
                } else {
                    ttsManagerInstance?.speak(
                        "Система голосовой озвучки STORM DS настроена и готова к игре!",
                        "ru"
                    )
                }
            } catch (e: Throwable) {
                Toast.makeText(requireContext(), e.message ?: "TTS Error", Toast.LENGTH_SHORT).show()
            }
            true
        }

        findPreference<Preference>("pref_translator_regions")?.apply {
            isVisible = true
            title = when (lang) {
                "ru" -> "Сбросить зоны OCR и позицию кнопки"
                "de" -> "OCR-Bereiche und Tastenposition zurücksetzen"
                "fr" -> "Réinitialiser les zones OCR et la position du bouton"
                "zh" -> "重置 OCR 区域与悬浮按钮位置"
                "ja" -> "OCR領域とボタン位置をリセット"
                else -> "Reset OCR regions and button position"
            }
            summary = when (lang) {
                "ru" -> "Очистить сохранённые области захвата текста и вернуть кнопку TR на место по умолчанию"
                "de" -> "Gespeicherte Erfassungsbereiche löschen und TR-Taste zurücksetzen"
                "fr" -> "Effacer les zones de capture enregistrées et replacer le bouton TR par défaut"
                "zh" -> "清除已保存的屏幕识别区域并将 TR 按钮恢复到默认位置"
                "ja" -> "保存されたテキスト認識領域を消去し、TRボタンを初期位置に戻します"
                else -> "Clear saved capture areas and restore the floating TR button to its default position"
            }
            setOnPreferenceClickListener {
                val prefs = preferenceManager.sharedPreferences
                if (prefs != null) {
                    val editor = prefs.edit()
                    prefs.all.keys
                        .filter { it == "translator_saved_regions" || it.startsWith("translator_saved_regions_") }
                        .forEach { editor.remove(it) }
                    editor.remove("pref_translator_float_btn_x_ratio")
                    editor.remove("pref_translator_float_btn_y_ratio")
                    editor.apply()
                }
                val toastText = when (lang) {
                    "ru" -> "Зоны захвата OCR и позиция кнопки сброшены"
                    "de" -> "OCR-Erfassungsbereiche und Tastenposition zurückgesetzt"
                    "fr" -> "Zones OCR et position du bouton réinitialisées"
                    "zh" -> "OCR 识别区域和按钮位置已重置"
                    "ja" -> "OCR領域とボタンの位置をリセットしました"
                    else -> "OCR capture regions and button position reset"
                }
                Toast.makeText(requireContext(), toastText, Toast.LENGTH_SHORT).show()
                true
            }
        }

        findPreference<Preference>("pref_translator_clear_cache")?.apply {
            isVisible = true
            title = when (lang) {
                "ru" -> "Очистить кэш переводов"
                "de" -> "Übersetzungscache leeren"
                "fr" -> "Vider le cache de traduction"
                "zh" -> "清除翻译缓存"
                "ja" -> "翻訳キャッシュを消去"
                else -> "Clear translation cache"
            }
            summary = when (lang) {
                "ru" -> "Удалить сохранённые переводы диалогов из памяти и с диска"
                "de" -> "Gespeicherte Dialogübersetzungen aus Speicher und Datenträger löschen"
                "fr" -> "Supprimer les traductions de dialogues mises en cache en mémoire et sur le disque"
                "zh" -> "删除内存和磁盘中已缓存的游戏对话翻译"
                "ja" -> "メモリとディスクに保存された翻訳キャッシュを削除します"
                else -> "Remove cached dialogue translations from memory and disk"
            }
            setOnPreferenceClickListener {
                TranslationCache(requireContext()).clear()
                val toastText = when (lang) {
                    "ru" -> "Кэш переводов очищен"
                    "de" -> "Übersetzungscache geleert"
                    "fr" -> "Cache de traduction vidé"
                    "zh" -> "翻译缓存已清除"
                    "ja" -> "翻訳キャッシュを消去しました"
                    else -> "Translation cache cleared"
                }
                Toast.makeText(requireContext(), toastText, Toast.LENGTH_SHORT).show()
                true
            }
        }

        SECRET_KEYS.forEach { key ->
            findPreference<EditTextPreference>(key)?.apply {
                summaryProvider = Preference.SummaryProvider<EditTextPreference> { pref ->
                    maskSecret(pref.text) ?: pref.context.getString(R.string.not_set)
                }
                setOnBindEditTextListener { editText ->
                    editText.inputType = android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        ttsManagerInstance?.stop()
        ttsManagerInstance = null
    }

    override fun isPasswordPreference(preference: EditTextPreference): Boolean {
        return preference.key in SECRET_KEYS
    }

    private fun maskSecret(value: String?): String? {
        val secret = value?.trim().orEmpty()
        if (secret.isEmpty()) return null
        return if (secret.length <= 4) "••••" else "••••" + secret.takeLast(4)
    }

    override fun getTitle(): String {
        return getString(R.string.category_translator)
    }

    private companion object {
        val SECRET_KEYS = setOf("translator_deepl_key", "translator_custom_ai_key")
    }
}
