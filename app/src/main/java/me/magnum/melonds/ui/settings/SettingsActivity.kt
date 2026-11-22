package me.magnum.melonds.ui.settings

import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.compose.ui.graphics.toArgb
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
    private var accentChangeListener: ((String) -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        me.magnum.melonds.ui.theme.AppThemeManager.applyEdgeToEdgeTheme(this)
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        val updateThemeStyles: (String) -> Unit = { _ ->
            val colors = me.magnum.melonds.ui.theme.AppThemeManager.getCurrentWatermelonColors(this)
            val bgInt = colors.bg.toArgb()
            val surface2Int = colors.surface2.toArgb()
            val accentInt = colors.green.toArgb()
            val textInt = colors.text.toArgb()
            val text2Int = colors.text2.toArgb()
            val lineInt = colors.line.toArgb()
            val density = resources.displayMetrics.density

            binding.root.setBackgroundColor(bgInt)
            binding.viewStatusBarBackground.setBackgroundColor(bgInt)
            binding.toolbar.setBackgroundColor(bgInt)
            binding.toolbarDivider.setBackgroundColor(lineInt)
            binding.textSettingsTitle.setTextColor(textInt)
            binding.textSettingsSubtitle.setTextColor(text2Int)
            androidx.core.widget.ImageViewCompat.setImageTintList(
                binding.imgSettingsIcon,
                ColorStateList.valueOf(accentInt),
            )

            binding.btnReturnToGame.background = GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                cornerRadius = 8f * density
                setColor(colors.greenDim.toArgb())
                setStroke((1f * density).toInt().coerceAtLeast(1), accentInt)
            }
            (binding.btnReturnToGame.getChildAt(0) as? ImageView)?.let {
                androidx.core.widget.ImageViewCompat.setImageTintList(it, ColorStateList.valueOf(accentInt))
            }
            (binding.btnReturnToGame.getChildAt(1) as? TextView)?.setTextColor(accentInt)

            binding.settingsFooter.btnSettingsBack.background = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(surface2Int)
                setStroke((1.5f * density).toInt().coerceAtLeast(1), accentInt)
            }
            (binding.settingsFooter.btnSettingsBack.getChildAt(0) as? ImageView)?.let {
                androidx.core.widget.ImageViewCompat.setImageTintList(it, ColorStateList.valueOf(textInt))
            }
        }
        accentChangeListener = updateThemeStyles
        updateThemeStyles("")
        me.magnum.melonds.ui.theme.AppThemeManager.addAccentChangeListener(updateThemeStyles)

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

    override fun onDestroy() {
        accentChangeListener?.let {
            me.magnum.melonds.ui.theme.AppThemeManager.removeAccentChangeListener(it)
        }
        accentChangeListener = null
        super.onDestroy()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            if (!supportFragmentManager.popBackStackImmediate()) {
                finish()
            }
            return true
        } else if (id == R.id.action_search_settings) {
            openSearchDialog()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun openSearchDialog() {
        SettingsSearchDialog(this, this).show()
    }

    fun navigateToPreference(fragmentClassName: String, preferenceKey: String?, preferenceRootKey: String? = null) {
        val current = supportFragmentManager.fragments.lastOrNull()
        val currentRootKey = current?.arguments?.getString(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT)
        if (current != null &&
            current::class.java.name == fragmentClassName &&
            current is PreferenceFragmentCompat &&
            currentRootKey == preferenceRootKey
        ) {
            if (preferenceKey != null) {
                current.scrollToPreference(preferenceKey)
            }
            return
        }

        val fragment = supportFragmentManager.fragmentFactory.instantiate(classLoader, fragmentClassName).apply {
            if (preferenceKey != null || preferenceRootKey != null) {
                arguments = bundleOf(
                    PreferenceFragmentCompat.ARG_PREFERENCE_ROOT to preferenceRootKey,
                ).apply {
                    if (preferenceKey != null) {
                        putString("target_preference_key", preferenceKey)
                    }
                }
            }
        }

        supportFragmentManager.commit {
            setCustomAnimations(
                R.anim.fragment_translate_enter_push,
                R.anim.fragment_translate_exit_push,
                R.anim.fragment_translate_enter_pop,
                R.anim.fragment_translate_exit_pop
            )
            replace(binding.settingsContainer.id, fragment)
            addToBackStack(null)
        }

        if (preferenceKey != null) {
            supportFragmentManager.registerFragmentLifecycleCallbacks(object : androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks() {
                override fun onFragmentViewCreated(fm: androidx.fragment.app.FragmentManager, f: androidx.fragment.app.Fragment, v: View, savedInstanceState: Bundle?) {
                    if (f === fragment) {
                        fm.unregisterFragmentLifecycleCallbacks(this)
                        v.post {
                            (f as? PreferenceFragmentCompat)?.scrollToPreference(preferenceKey)
                        }
                    }
                }
            }, false)
        }
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
                R.drawable.ic_settings to getString(R.string.settings_sub_general)
            is me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment ->
                R.drawable.ic_folder to getString(R.string.settings_sub_roms)
            is me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment ->
                R.drawable.ic_video to getString(R.string.settings_sub_video)
            is me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment ->
                R.drawable.ic_audio to getString(R.string.settings_sub_audio)
            is me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragment ->
                R.drawable.ic_input to getString(R.string.settings_sub_input)
            is me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment ->
                R.drawable.ic_trophy to getString(R.string.settings_sub_ra)
            is me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment ->
                R.drawable.ic_translate to getString(R.string.settings_sub_translator)
            is me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment,
            is me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment ->
                R.drawable.ic_firmware to getString(R.string.settings_sub_firmware)
            is me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment ->
                R.drawable.ic_file to getString(R.string.settings_sub_save)
            is me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment ->
                R.drawable.ic_cheat to getString(R.string.settings_sub_cheats)
            is me.magnum.melonds.ui.settings.fragments.AboutPreferencesFragment ->
                R.drawable.ic_info to getString(R.string.settings_sub_about)
            is me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment ->
                R.drawable.ic_settings to getString(R.string.settings_sub_main)
            else -> {
                val rootKey = fragment?.arguments?.getString(PreferenceFragmentCompat.ARG_PREFERENCE_ROOT)
                when {
                    rootKey == "video_retroarch_shader_settings" ||
                        lower.contains("видео") || lower.contains("video") || lower.contains("график") ||
                        lower.contains("vidéo") || lower.contains("graph") || lower.contains("shader") ||
                        lower.contains("视频") || lower.contains("图形") || lower.contains("ビデオ") || lower.contains("映像") ->
                        R.drawable.ic_video to getString(R.string.settings_sub_video)
                    lower.contains("звук") || lower.contains("audio") || lower.contains("микрофон") ||
                        lower.contains("ton") || lower.contains("son") || lower.contains("音频") || lower.contains("オーディオ") ->
                        R.drawable.ic_audio to getString(R.string.settings_sub_audio)
                    lower.contains("управлен") || lower.contains("input") || lower.contains("клавиш") || lower.contains("расклад") ||
                        lower.contains("eingabe") || lower.contains("steuer") || lower.contains("contrôl") || lower.contains("entrée") ||
                        lower.contains("输入") || lower.contains("控制") || lower.contains("入力") || lower.contains("操作") ->
                        R.drawable.ic_input to getString(R.string.settings_sub_input)
                    lower.contains("папк") || lower.contains("rom") || lower.contains("игр") ||
                        lower.contains("spiel") || lower.contains("jeu") || lower.contains("游戏") || lower.contains("ゲーム") ->
                        R.drawable.ic_folder to getString(R.string.settings_sub_roms)
                    lower.contains("достижен") || lower.contains("achievement") ||
                        lower.contains("erfolg") || lower.contains("succès") || lower.contains("成就") || lower.contains("実績") ->
                        R.drawable.ic_trophy to getString(R.string.settings_sub_ra)
                    lower.contains("перемотк") || lower.contains("rewind") ||
                        lower.contains("rückspul") || lower.contains("rembobin") || lower.contains("倒带") || lower.contains("巻き戻し") ->
                        R.drawable.ic_clock to getString(R.string.settings_sub_rewind)
                    lower.contains("перевод") || lower.contains("translat") ||
                        lower.contains("übersetz") || lower.contains("traduc") || lower.contains("翻译") || lower.contains("翻訳") ->
                        R.drawable.ic_translate to getString(R.string.settings_sub_translator)
                    lower.contains("bios") || lower.contains("firmware") || lower.contains("nand") || lower.contains("систем") ||
                        lower.contains("system") || lower.contains("système") || lower.contains("系统") || lower.contains("システム") ->
                        R.drawable.ic_firmware to getString(R.string.settings_sub_firmware)
                    lower.contains("чит") || lower.contains("cheat") ||
                        lower.contains("triche") || lower.contains("金手指") || lower.contains("チート") ->
                        R.drawable.ic_cheat to getString(R.string.settings_sub_cheats)
                    else ->
                        R.drawable.ic_settings to getString(R.string.settings_sub_default)
                }
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
