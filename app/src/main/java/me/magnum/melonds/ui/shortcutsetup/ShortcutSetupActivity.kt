package me.magnum.melonds.ui.shortcutsetup

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.applyCanvas
import androidx.core.graphics.createBitmap
import androidx.core.graphics.drawable.IconCompat
import androidx.core.graphics.drawable.toBitmap
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import androidx.fragment.app.commit
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.databinding.ActivityShortcutSetupBinding
import me.magnum.melonds.domain.model.RomIconFiltering
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.emulator.EmulatorActivity
import me.magnum.melonds.ui.romlist.NoRomSearchDirectoriesFragment
import me.magnum.melonds.ui.romlist.RomIcon
import me.magnum.melonds.ui.romlist.RomListFragment
import me.magnum.melonds.ui.romlist.RomListViewModel
import me.magnum.melonds.ui.romlist.composables.romDisplayName

@AndroidEntryPoint
class ShortcutSetupActivity : AppCompatActivity() {
    companion object {
        private const val FRAGMENT_ROM_LIST = "rom_list"
        private const val FRAGMENT_NO_ROM_DIRECTORIES = "no_rom_directory"
    }

    private val viewModel: RomListViewModel by viewModels()
    private lateinit var binding: ActivityShortcutSetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        me.magnum.melonds.ui.theme.AppThemeManager.applyEdgeToEdgeTheme(this)
        super.onCreate(savedInstanceState)
        binding = ActivityShortcutSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        var defaultContentInsetLeft = -1
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout())
            if (defaultContentInsetLeft == -1) {
                defaultContentInsetLeft = binding.toolbar.contentInsetLeft
            }

            binding.toolbar.setContentInsetsAbsolute(defaultContentInsetLeft + insets.left, binding.toolbar.contentInsetRight)
            binding.toolbar.updatePadding(
                left = insets.left,
                right = insets.right,
            )
            binding.viewStatusBarBackground.updateLayoutParams {
                height = insets.top
            }
            binding.layoutRoot.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                leftMargin = insets.left
                rightMargin = insets.right
            }

            windowInsets.inset(insets.left, insets.top, insets.right, 0)
        }

        (supportFragmentManager.findFragmentByTag(FRAGMENT_ROM_LIST) as? RomListFragment)
            ?.setRomSelectedListener { onRomSelected(it) }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.hasSearchDirectories.collectLatest { hasDirectories ->
                    if (hasDirectories) {
                        addRomListFragment()
                    } else {
                        addNoSearchDirectoriesFragment()
                    }
                }
            }
        }
    }

    private fun addRomListFragment() {
        var fragment = supportFragmentManager.findFragmentByTag(FRAGMENT_ROM_LIST) as? RomListFragment
        if (fragment == null) {
            fragment = RomListFragment.newInstance(
                allowRomConfiguration = false,
                enableCriteria = RomListFragment.RomEnableCriteria.ENABLE_ALL,
                isShortcutPickerMode = true,
            )
            supportFragmentManager.commit(allowStateLoss = true) {
                replace(binding.layoutRoot.id, fragment, FRAGMENT_ROM_LIST)
            }
        }
        fragment.setRomSelectedListener { onRomSelected(it) }
    }

    private fun addNoSearchDirectoriesFragment() {
        var fragment = supportFragmentManager.findFragmentByTag(FRAGMENT_NO_ROM_DIRECTORIES) as? NoRomSearchDirectoriesFragment
        if (fragment == null) {
            fragment = NoRomSearchDirectoriesFragment.newInstance(isShortcutPickerMode = true)
            supportFragmentManager.commit(allowStateLoss = true) {
                replace(binding.layoutRoot.id, fragment, FRAGMENT_NO_ROM_DIRECTORIES)
            }
        }
    }

    private fun onRomSelected(rom: Rom) {
        val intent = Intent("${packageName}.LAUNCH_ROM").apply {
            setPackage(packageName)
            putExtra(EmulatorActivity.KEY_URI, rom.uri.toString())
        }

        lifecycleScope.launch {
            val romIcon = viewModel.getRomIcon(rom)
            val safeLabel = romDisplayName(rom).ifBlank {
                rom.name.ifBlank { rom.fileName.ifBlank { getString(R.string.app_name) } }
            }
            val shortcutInfo = ShortcutInfoCompat.Builder(this@ShortcutSetupActivity, rom.uri.toString())
                .setShortLabel(safeLabel)
                .setIcon(IconCompat.createWithAdaptiveBitmap(buildShortcutBitmap(romIcon)))
                .setIntent(intent)
                .build()

            val shortcutIntent = ShortcutManagerCompat.createShortcutResultIntent(this@ShortcutSetupActivity, shortcutInfo)

            setResult(RESULT_OK, shortcutIntent)
            finish()
        }
    }

    private fun buildShortcutBitmap(romIcon: RomIcon): Bitmap {
        val iconBitmap = romIcon.bitmap
            ?: ContextCompat.getDrawable(this, R.drawable.logo_splash)?.toBitmap(102, 102)
            ?: BitmapFactory.decodeResource(resources, R.drawable.logo_splash)
        val shortcutBitmap = createBitmap(256, 256)

        return shortcutBitmap.applyCanvas {
            drawRect(Rect(0, 0, width, height), Paint().apply { color = Color.WHITE })
            val iconRect = Rect(77, 77, shortcutBitmap.width - 77, shortcutBitmap.height - 77)
            drawBitmap(iconBitmap, null, iconRect, Paint().apply { isFilterBitmap = romIcon.filtering == RomIconFiltering.LINEAR })
        }
    }
}