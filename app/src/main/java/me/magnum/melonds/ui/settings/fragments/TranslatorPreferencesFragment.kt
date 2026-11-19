package me.magnum.melonds.ui.settings.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.preference.EditTextPreference
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceCategory
import androidx.preference.SeekBarPreference
import androidx.preference.SwitchPreferenceCompat
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.translator.GameTranslatorManager
import me.magnum.melonds.translator.engine.TranslationCache
import me.magnum.melonds.translator.tts.GameTtsManager
import me.magnum.melonds.ui.settings.PreferenceFragmentTitleProvider
import me.magnum.melonds.ui.settings.dialogs.MLKIT_MANAGED_MODELS
import me.magnum.melonds.ui.settings.dialogs.fetchDownloadedMlKitPackCount
import me.magnum.melonds.ui.settings.dialogs.showMlKitModelsManagerDialog
import me.magnum.melonds.ui.settings.dialogs.showTranslatorApiTestDialog

@AndroidEntryPoint
class TranslatorPreferencesFragment : BasePreferenceFragment(), PreferenceFragmentTitleProvider {

    private var ttsManagerInstance: GameTtsManager? = null
    private val fragmentScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private var mlkitModelsPref: Preference? = null

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.pref_translator, rootKey)

        val translatorEnabledPref = findPreference<SwitchPreferenceCompat>(GameTranslatorManager.PREF_TRANSLATOR_ENABLED)
        val enginePref = findPreference<ListPreference>(GameTranslatorManager.PREF_TRANSLATOR_ENGINE)
        val triggerModePref = findPreference<ListPreference>(GameTranslatorManager.PREF_TRANSLATOR_TRIGGER_MODE)
        val pauseOnTranslatePref = findPreference<SwitchPreferenceCompat>(GameTranslatorManager.PREF_TRANSLATOR_PAUSE_ON_TRANSLATE)
        val showFloatingBtnPref = findPreference<SwitchPreferenceCompat>(GameTranslatorManager.PREF_TRANSLATOR_SHOW_FLOATING_BUTTON)
        val floatingOpacityPref = findPreference<SeekBarPreference>(GameTranslatorManager.PREF_TRANSLATOR_FLOATING_BUTTON_OPACITY)
        val testApiPref = findPreference<Preference>("translator_test_api")
        mlkitModelsPref = findPreference("translator_mlkit_models")

        val ttsEnabledPref = findPreference<SwitchPreferenceCompat>(GameTranslatorManager.PREF_TRANSLATOR_TTS_ENABLED)
        val voiceEnginePref = findPreference<ListPreference>(GameTtsManager.PREF_TRANSLATOR_TTS_VOICE_ENGINE)
        val ttsLangPref = findPreference<ListPreference>(GameTtsManager.PREF_TRANSLATOR_TTS_LANG)
        val voiceModelPref = findPreference<ListPreference>("translator_local_voice_model")
        val pitchVariancePref = findPreference<SeekBarPreference>(GameTtsManager.PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE)
        val ttsSpeedPref = findPreference<SeekBarPreference>(GameTtsManager.PREF_TRANSLATOR_TTS_SPEED)
        val voicePitchPref = findPreference<SeekBarPreference>(GameTtsManager.PREF_TRANSLATOR_VOICE_PITCH)
        val testVoicePref = findPreference<Preference>("pref_translator_test_voice")

        val bubbleOpacityPref = findPreference<SeekBarPreference>(GameTranslatorManager.PREF_TRANSLATOR_BUBBLE_OPACITY)
        val fontSizeScalePref = findPreference<SeekBarPreference>(GameTranslatorManager.PREF_TRANSLATOR_FONT_SIZE_SCALE)

        val apiKeysCategory = findPreference<PreferenceCategory>("pref_category_api_keys")
        val deeplKeyPref = findPreference<EditTextPreference>(GameTranslatorManager.PREF_TRANSLATOR_DEEPL_KEY)
        val customAiKeyPref = findPreference<EditTextPreference>(GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_KEY)
        val customAiEndpointPref = findPreference<EditTextPreference>(GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT)
        val customAiModelPref = findPreference<EditTextPreference>(GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_MODEL)

        // 1. Live % summaries (all 10 locales, zero em-dashes)
        floatingOpacityPref?.apply {
            val baseSummary = getString(R.string.translator_floating_button_opacity_summary)
            summary = "${value}% - $baseSummary"
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 35
                summary = "${intVal}% - $baseSummary"
                true
            }
        }

        voicePitchPref?.apply {
            val baseSummary = getString(R.string.translator_voice_pitch_summary)
            fun formatPitch(v: Int): String = "${if (v >= 0) "+" else ""}${v}% - $baseSummary"
            summary = formatPitch(value)
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 0
                summary = formatPitch(intVal)
                true
            }
        }

        pitchVariancePref?.apply {
            summary = getString(R.string.translator_pitch_variance_summary, value)
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 65
                summary = getString(R.string.translator_pitch_variance_summary, intVal)
                true
            }
        }

        ttsSpeedPref?.apply {
            summary = getString(R.string.translator_tts_speed_summary, value)
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 100
                summary = getString(R.string.translator_tts_speed_summary, intVal)
                true
            }
        }

        bubbleOpacityPref?.apply {
            summary = getString(R.string.translator_bubble_opacity_summary, value)
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 90
                summary = getString(R.string.translator_bubble_opacity_summary, intVal)
                true
            }
        }

        fontSizeScalePref?.apply {
            summary = getString(R.string.translator_font_scale_summary, value)
            setOnPreferenceChangeListener { _, newValue ->
                val intVal = (newValue as? Int) ?: 100
                summary = getString(R.string.translator_font_scale_summary, intVal)
                true
            }
        }

        // 2. Context-aware visibility and enabled state (never clobbering saved user switches)
        fun refreshConditionalPreferences(
            enabledOverride: Boolean? = null,
            engineOverride: String? = null,
            triggerModeOverride: String? = null,
            showFloatingOverride: Boolean? = null,
            ttsEnabledOverride: Boolean? = null,
            voiceEngineOverride: String? = null,
        ) {
            val translatorOn = enabledOverride ?: (translatorEnabledPref?.isChecked == true)
            val engineVal = engineOverride ?: (enginePref?.value ?: "google")
            val triggerVal = triggerModeOverride ?: (triggerModePref?.value ?: "on_demand")
            val floatingOn = showFloatingOverride ?: (showFloatingBtnPref?.isChecked == true)
            val ttsOn = ttsEnabledOverride ?: (ttsEnabledPref?.isChecked == true)
            val voiceEng = voiceEngineOverride ?: (voiceEnginePref?.value ?: "neural_edge")

            val effectiveTtsActive = translatorOn && ttsOn
            val isMultiVoice = voiceEng != "single"

            // Pause on translate only applies in manual on-demand mode
            val showPause = translatorOn && triggerVal != "auto_screen_change"
            pauseOnTranslatePref?.isVisible = showPause
            pauseOnTranslatePref?.isEnabled = showPause

            // Floating button opacity only visible when floating button is enabled
            val showFloatOpacity = translatorOn && floatingOn
            floatingOpacityPref?.isVisible = showFloatOpacity
            floatingOpacityPref?.isEnabled = showFloatOpacity

            // TTS dependent controls (voice pitch works in ALL modes including single!)
            voiceEnginePref?.isEnabled = effectiveTtsActive
            ttsLangPref?.isEnabled = effectiveTtsActive
            ttsSpeedPref?.isEnabled = effectiveTtsActive
            voicePitchPref?.isVisible = true
            voicePitchPref?.isEnabled = effectiveTtsActive
            voiceModelPref?.isVisible = isMultiVoice
            voiceModelPref?.isEnabled = isMultiVoice && effectiveTtsActive
            pitchVariancePref?.isVisible = isMultiVoice
            pitchVariancePref?.isEnabled = isMultiVoice && effectiveTtsActive
            testVoicePref?.isEnabled = effectiveTtsActive

            // API keys category only relevant for DeepL / Custom AI
            val isDeepL = translatorOn && engineVal == "deepl"
            val isCustomAi = translatorOn && engineVal == "custom_ai"
            apiKeysCategory?.isVisible = isDeepL || isCustomAi
            deeplKeyPref?.isVisible = isDeepL
            customAiKeyPref?.isVisible = isCustomAi
            customAiEndpointPref?.isVisible = isCustomAi
            customAiModelPref?.isVisible = isCustomAi

            testApiPref?.isEnabled = translatorOn
            mlkitModelsPref?.isEnabled = translatorOn
        }

        refreshConditionalPreferences()

        translatorEnabledPref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(enabledOverride = newValue as? Boolean ?: false)
            true
        }
        enginePref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(engineOverride = newValue as? String)
            true
        }
        triggerModePref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(triggerModeOverride = newValue as? String)
            true
        }
        showFloatingBtnPref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(showFloatingOverride = newValue as? Boolean ?: false)
            true
        }
        ttsEnabledPref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(ttsEnabledOverride = newValue as? Boolean ?: false)
            true
        }
        voiceEnginePref?.setOnPreferenceChangeListener { _, newValue ->
            refreshConditionalPreferences(voiceEngineOverride = newValue as? String)
            true
        }

        // 3. Test Voice Button (respects translator_tts_lang / translator_target_lang across all supported languages)
        testVoicePref?.setOnPreferenceClickListener {
            try {
                if (ttsManagerInstance == null) {
                    ttsManagerInstance = GameTtsManager(requireContext())
                }
                val prefs = preferenceManager.sharedPreferences
                val ttsLangVal = prefs?.getString(GameTtsManager.PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
                val targetLangVal = prefs?.getString(GameTranslatorManager.PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"
                val effectiveLang = if (ttsLangVal == "auto" || ttsLangVal.isBlank()) targetLangVal else ttsLangVal
                val selectedModel = voiceModelPref?.value ?: "auto_gender_neural"
                val multiDemo = selectedModel == "auto_gender_neural" || selectedModel == "auto_multi"

                Toast.makeText(requireContext(), R.string.translator_test_voice_playing, Toast.LENGTH_SHORT).show()
                ttsManagerInstance?.speak(buildTestVoiceSample(effectiveLang, multiDemo), effectiveLang)
            } catch (e: Throwable) {
                Toast.makeText(requireContext(), e.message ?: "TTS Error", Toast.LENGTH_SHORT).show()
            }
            true
        }

        // 4. Reset OCR regions and floating TR button position (live-synced to running game overlay)
        findPreference<Preference>("pref_translator_regions")?.apply {
            isVisible = true
            title = getString(R.string.translator_regions_reset_title)
            summary = getString(R.string.translator_regions_reset_summary)
            setOnPreferenceClickListener {
                val prefs = preferenceManager.sharedPreferences
                if (prefs != null) {
                    val editor = prefs.edit()
                    prefs.all.keys
                        .filter { it == GameTranslatorManager.PREF_TRANSLATOR_SAVED_REGIONS || it.startsWith("${GameTranslatorManager.PREF_TRANSLATOR_SAVED_REGIONS}_") }
                        .forEach { editor.remove(it) }
                    editor.remove("pref_translator_float_btn_x_ratio")
                    editor.remove("pref_translator_float_btn_y_ratio")
                    editor.apply()
                }
                Toast.makeText(requireContext(), R.string.translator_regions_reset_toast, Toast.LENGTH_SHORT).show()
                true
            }
        }

        // 5. Clear translation cache (disk + live RAM invalidation in active GameTranslatorManager)
        findPreference<Preference>("pref_translator_clear_cache")?.apply {
            isVisible = true
            title = getString(R.string.translator_clear_cache_title)
            summary = getString(R.string.translator_clear_cache_summary)
            setOnPreferenceClickListener {
                TranslationCache(requireContext()).clear()
                preferenceManager.sharedPreferences?.edit()
                    ?.putLong("translator_cache_clear_epoch", System.currentTimeMillis())
                    ?.apply()
                Toast.makeText(requireContext(), R.string.translator_clear_cache_toast, Toast.LENGTH_SHORT).show()
                true
            }
        }

        // 6. Test translation and API
        testApiPref?.setOnPreferenceClickListener {
            showTranslatorApiTestDialog(requireContext())
            true
        }

        // 7. Offline ML Kit models manager
        mlkitModelsPref?.setOnPreferenceClickListener {
            showMlKitModelsManagerDialog(requireContext()) {
                refreshMlKitModelsSummary()
            }
            true
        }
        refreshMlKitModelsSummary()

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

    private fun buildTestVoiceSample(langCode: String, multiActor: Boolean): String {
        return when (langCode.lowercase().take(2)) {
            "ru" -> if (multiActor) {
                "Майя: Феникс, смотри! Мы нашли важную улику!\nФеникс: Отлично, Майя! Теперь у нас есть шанс в суде!"
            } else {
                "Система голосовой озвучки STORM DS настроена и готова к игре!"
            }
            "ja" -> if (multiActor) {
                "真宵：なるほどくん、新しい証拠が見つかったよ！\n成歩堂：よし、これで法廷で戦える！"
            } else {
                "STORM DSの音声読み上げシステムは準備完了です。"
            }
            "zh" -> if (multiActor) {
                "真宵：成步堂，我们找到了重要证据！\n成步堂：太好了，现在我们有机会赢了！"
            } else {
                "STORM DS 语音朗读系统已准备就绪。"
            }
            "de" -> if (multiActor) {
                "Maya: Phoenix, schau mal! Wir haben einen wichtigen Beweis gefunden!\nPhoenix: Großartig, Maya! Jetzt haben wir eine Chance vor Gericht!"
            } else {
                "Die STORM DS Sprachausgabe ist bereit für das Spiel."
            }
            "fr" -> if (multiActor) {
                "Maya : Phoenix, regarde ! Nous avons trouvé une preuve importante !\nPhoenix : Génial, Maya ! Maintenant nous avons une chance au tribunal !"
            } else {
                "La synthèse vocale STORM DS est configurée et prête à jouer."
            }
            "es" -> if (multiActor) {
                "Maya: ¡Phoenix, mira! ¡Encontramos una prueba importante!\nPhoenix: ¡Excelente, Maya! ¡Ahora tenemos una oportunidad en el juicio!"
            } else {
                "El sistema de voz de STORM DS está configurado y listo para jugar."
            }
            "it" -> if (multiActor) {
                "Maya: Phoenix, guarda! Abbiamo trovato una prova importante!\nPhoenix: Fantastico, Maya! Ora abbiamo una possibilità in tribunale!"
            } else {
                "Il sistema vocale di STORM DS è pronto per il gioco."
            }
            "pt" -> if (multiActor) {
                "Maya: Phoenix, olha! Encontramos uma prova importante!\nPhoenix: Excelente, Maya! Agora temos uma chance no tribunal!"
            } else {
                "O sistema de voz do STORM DS está configurado e pronto para jogar."
            }
            "uk" -> if (multiActor) {
                "Майя: Феніксе, дивись! Ми знайшли важливий доказ!\nФенікс: Чудово, Майя! Тепер у нас є шанс у суді!"
            } else {
                "Система голосового озвучення STORM DS налаштована та готова до гри!"
            }
            else -> if (multiActor) {
                "Maya: Phoenix, look! We found a crucial piece of evidence!\nPhoenix: Great work, Maya! Now we have a real chance in court!"
            } else {
                "STORM DS voice synthesis is configured and ready to play!"
            }
        }
    }

    override fun onResume() {
        super.onResume()
        refreshMlKitModelsSummary()
    }

    private fun refreshMlKitModelsSummary() {
        val pref = mlkitModelsPref ?: return
        fragmentScope.launch {
            val count = runCatching { fetchDownloadedMlKitPackCount() }.getOrNull()
            if (!isAdded || context == null) return@launch
            if (count != null) {
                pref.summary = getString(
                    R.string.translator_mlkit_models_summary,
                    count,
                    MLKIT_MANAGED_MODELS.size,
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentScope.cancel()
        mlkitModelsPref = null
        ttsManagerInstance?.destroy()
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
