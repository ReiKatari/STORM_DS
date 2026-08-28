package me.magnum.melonds.ui.settings

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.collectAsState
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.commit
import androidx.fragment.app.commitNow
import androidx.core.os.bundleOf
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceScreen
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.R
import me.magnum.melonds.databinding.ActivitySettingsBinding
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment

@AndroidEntryPoint
class SettingsActivity :
    AppCompatActivity(),
    PreferenceFragmentCompat.OnPreferenceStartFragmentCallback,
    PreferenceFragmentCompat.OnPreferenceStartScreenCallback {

    private val externalInfoController by lazy { me.magnum.melonds.ui.common.ExternalInfoDisplayController(this) }
    private val externalSettingsTitle = kotlinx.coroutines.flow.MutableStateFlow("")

    data class FocusedPref(val title: String, val summary: String?, val icon: android.graphics.drawable.Drawable?)
    private val focusedPreference = kotlinx.coroutines.flow.MutableStateFlow<FocusedPref?>(null)

    fun onPreferenceFocused(preference: androidx.preference.Preference) {
        focusedPreference.value = FocusedPref(
            title = preference.title?.toString() ?: "",
            summary = preference.summary?.toString(),
            icon = preference.icon,
        )
    }

    override fun onStart() {
        super.onStart()
        externalInfoController.attach()
        externalSettingsTitle.value = supportActionBar?.title?.toString() ?: getString(me.magnum.melonds.R.string.settings)
        supportFragmentManager.addOnBackStackChangedListener(externalTitleListener)
        externalInfoController.setContent {
            val title = externalSettingsTitle.collectAsState().value
            val focused = focusedPreference.collectAsState().value
            me.magnum.melonds.ui.common.ExternalSettingInfo(
                iconDrawable = focused?.icon,
                title = focused?.title?.takeIf { it.isNotBlank() } ?: title,
                description = focused?.summary,
                crumb = getString(me.magnum.melonds.R.string.settings) + " › " + title,
            )
        }
    }

    override fun onStop() {
        supportFragmentManager.removeOnBackStackChangedListener(externalTitleListener)
        externalInfoController.detach()
        super.onStop()
    }

    private val externalTitleListener = androidx.fragment.app.FragmentManager.OnBackStackChangedListener {
        binding.root.post {
            externalSettingsTitle.value = supportActionBar?.title?.toString() ?: ""
            focusedPreference.value = null
        }
    }

    companion object {
        const val KEY_ENTRY_POINT = "entry_point"
        const val KEY_IN_GAME = "in_game"
        const val KEY_LOCK_INPUT_MAPPING = "lock_input_mapping"
        const val KEY_LOCK_INPUT_LAYOUT = "lock_input_layout"
        const val KEY_LOCK_VIDEO_FILTERING = "lock_video_filtering"
        const val KEY_RA_RUNTIME_IDENTITY_LOCKED = "ra_runtime_identity_locked"
        const val KEY_RA_IN_GAME_LOGOUT_SUPPORTED = "ra_in_game_logout_supported"
        const val KEY_RA_LOGOUT_REQUESTED = "ra_logout_requested"

        const val CUSTOM_FIRMWARE_ENTRY_POINT = "custom_firmware_entry_point"
        const val TRANSLATOR_ENTRY_POINT = "translator"
        const val KEY_RETURN_DIRECT_TO_GAME = "return_direct_to_game"
    }

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        me.magnum.melonds.ui.theme.AppThemeManager.init(this)
        setTheme(me.magnum.melonds.ui.theme.AppThemeManager.currentTheme.getThemeResId())
        val isLight = me.magnum.melonds.ui.theme.AppThemeManager.currentTheme == me.magnum.melonds.ui.Theme.LIGHT
        if (isLight) {
            enableEdgeToEdge(statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT))
        } else {
            enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        }
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        val updateBackButtonStyle = { _: String? ->
            val color = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor()
            val dynamicShape = android.graphics.drawable.GradientDrawable().apply {
                shape = android.graphics.drawable.GradientDrawable.OVAL
                setColor(getColor(R.color.watermelonSurface2))
                setStroke((1.5f * resources.displayMetrics.density).toInt(), color)
            }
            binding.settingsFooter.btnSettingsBack.background = dynamicShape
        }
        updateBackButtonStyle(null)
        me.magnum.melonds.ui.theme.AppThemeManager.addAccentChangeListener(updateBackButtonStyle)

        binding.settingsFooter.btnSettingsBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        var defaultContentInsetStartWithNavigation = -1
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout())
            if (defaultContentInsetStartWithNavigation == -1) {
                defaultContentInsetStartWithNavigation = binding.toolbar.contentInsetStartWithNavigation
            }

            val startInset = if (binding.toolbar.layoutDirection == View.LAYOUT_DIRECTION_LTR) insets.left else insets.right
            binding.toolbar.contentInsetStartWithNavigation = defaultContentInsetStartWithNavigation + startInset
            binding.toolbar.updatePadding(
                left = insets.left,
                right = insets.right,
            )
            binding.viewStatusBarBackground.updateLayoutParams {
                height = insets.top
            }
            binding.settingsContainer.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                leftMargin = insets.left
                rightMargin = insets.right
            }
            binding.settingsFooter.root.updatePadding(
                left = insets.left,
                right = insets.right,
                bottom = insets.bottom,
            )

            windowInsets.inset(insets.left, insets.top, insets.right, insets.bottom)
        }

        supportFragmentManager.addOnBackStackChangedListener {
            updateTitle()
        }

        if (savedInstanceState == null) {
            val entryPoint = when (intent.extras?.getString(KEY_ENTRY_POINT)) {
                CUSTOM_FIRMWARE_ENTRY_POINT -> CustomFirmwarePreferencesFragment::class
                TRANSLATOR_ENTRY_POINT -> me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment::class
                else -> MainPreferencesFragment::class
            }

            supportFragmentManager.commitNow {
                replace(binding.settingsContainer.id, entryPoint.java, null)
            }
        }
        updateTitle()
        applyImmersiveMode()
    }

    private fun applyImmersiveMode() {
        window.applyImmersiveFullscreen()
    }

    override fun onResume() {
        super.onResume()
        applyImmersiveMode()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            applyImmersiveMode()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            if (!supportFragmentManager.popBackStackImmediate()) {
                finish()
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun updateTitle() {
        val fragment = supportFragmentManager.fragments.lastOrNull()
        val title = if (fragment is PreferenceFragmentTitleProvider) {
            fragment.getTitle()
        } else {
            getString(R.string.settings)
        }
        supportActionBar?.title = ""

        val (iconRes, subtitle) = getMetadataForFragment(fragment, title)
        binding.textSettingsTitle.text = title
        binding.textSettingsSubtitle.text = subtitle
        binding.imgSettingsIcon.setImageResource(iconRes)

        val isInGame = intent.getBooleanExtra(KEY_IN_GAME, false)
        binding.btnReturnToGame.visibility = if (isInGame) View.VISIBLE else View.GONE
        binding.btnReturnToGame.setOnClickListener {
            val returnIntent = android.content.Intent().apply {
                putExtra(KEY_RETURN_DIRECT_TO_GAME, true)
            }
            setResult(RESULT_OK, returnIntent)
            finish()
        }
    }

    private fun getMetadataForFragment(fragment: androidx.fragment.app.Fragment?, title: String): Pair<Int, String> {
        val lower = title.lowercase()
        return when (fragment) {
            is me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment ->
                R.drawable.ic_settings to "Интерфейс, темы, язык и режим работы"
            is me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment ->
                R.drawable.ic_folder to "Папки, сканирование и список игр"
            is me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment ->
                R.drawable.ic_video to "Графика, рендеринг 3D и шейдеры"
            is me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment ->
                R.drawable.ic_audio to "Звуковые эффекты, громкость и микрофон"
            is me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragment ->
                R.drawable.ic_input to "Геймпады, маппинг клавиш и сенсорные кнопки"
            is me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment ->
                R.drawable.ic_trophy to "Достижения, учетная запись и хардкор"
            is me.magnum.melonds.ui.settings.fragments.RewindPreferencesFragment ->
                R.drawable.ic_clock to "Параметры и интервалы перемотки времени"
            is me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment ->
                R.drawable.ic_translate to "Перевод текста и оверлей перевода"
            is me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment ->
                R.drawable.ic_firmware to "BIOS, NAND, прошивка и системные настройки"
            is me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment ->
                R.drawable.ic_file to "Файлы сохранений и резервные копии"
            is me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment ->
                R.drawable.ic_cheat to "Глобальные чит-коды и базы данных"
            is me.magnum.melonds.ui.settings.fragments.AboutPreferencesFragment ->
                R.drawable.ic_info to "О проекте STORM DS и разработчиках"
            is me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment ->
                R.drawable.ic_settings to "Параметры и конфигурация эмулятора"
            else -> when {
                lower.contains("видео") || lower.contains("video") || lower.contains("график") ->
                    R.drawable.ic_video to "Графика, рендеринг 3D и шейдеры"
                lower.contains("звук") || lower.contains("audio") || lower.contains("микрофон") ->
                    R.drawable.ic_audio to "Звуковые эффекты, громкость и микрофон"
                lower.contains("управлен") || lower.contains("input") || lower.contains("клавиш") || lower.contains("расклад") ->
                    R.drawable.ic_input to "Геймпады, маппинг клавиш и сенсорные кнопки"
                lower.contains("папк") || lower.contains("rom") || lower.contains("игр") ->
                    R.drawable.ic_folder to "Папки, сканирование и список игр"
                lower.contains("достижен") || lower.contains("achievement") ->
                    R.drawable.ic_trophy to "Достижения, учетная запись и хардкор"
                lower.contains("перемотк") || lower.contains("rewind") ->
                    R.drawable.ic_clock to "Параметры и интервалы перемотки времени"
                lower.contains("перевод") || lower.contains("translat") ->
                    R.drawable.ic_translate to "Перевод текста и оверлей перевода"
                lower.contains("bios") || lower.contains("firmware") || lower.contains("nand") || lower.contains("систем") ->
                    R.drawable.ic_firmware to "BIOS, NAND, прошивка и системные настройки"
                lower.contains("чит") || lower.contains("cheat") ->
                    R.drawable.ic_cheat to "Глобальные чит-коды и базы данных"
                else ->
                    R.drawable.ic_settings to "Параметры и настройки"
            }
        }
    }

    override fun onPreferenceStartScreen(caller: PreferenceFragmentCompat, pref: PreferenceScreen): Boolean {
        val classLoader = caller.javaClass.classLoader ?: this.classLoader
        val fragment = supportFragmentManager.fragmentFactory.instantiate(
            classLoader,
            caller::class.java.name,
        ).apply {
            arguments = bundleOf(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT to pref.key)
        }

        supportFragmentManager.commit {
            setCustomAnimations(R.anim.fragment_translate_enter_push, R.anim.fragment_translate_exit_push, R.anim.fragment_translate_enter_pop, R.anim.fragment_translate_exit_pop)
            replace(binding.settingsContainer.id, fragment)
            addToBackStack(null)
        }
        return true
    }

    override fun onPreferenceStartFragment(caller: PreferenceFragmentCompat, pref: Preference): Boolean {
        val fragmentClassName = pref.fragment ?: return false
        val classLoader = caller.javaClass.classLoader ?: this.classLoader

        val fragment = supportFragmentManager.fragmentFactory.instantiate(classLoader, fragmentClassName).apply {
            arguments = pref.extras
        }

        supportFragmentManager.commit {
            setCustomAnimations(R.anim.fragment_translate_enter_push, R.anim.fragment_translate_exit_push, R.anim.fragment_translate_enter_pop, R.anim.fragment_translate_exit_pop)
            replace(binding.settingsContainer.id, fragment)
            addToBackStack(null)
        }
        return true
    }
}
