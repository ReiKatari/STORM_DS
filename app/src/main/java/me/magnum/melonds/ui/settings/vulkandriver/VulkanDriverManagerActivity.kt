package me.magnum.melonds.ui.settings.vulkandriver

import android.graphics.Color
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.MelonTheme

import me.magnum.melonds.extensions.applyImmersiveFullscreen

@AndroidEntryPoint
class VulkanDriverManagerActivity : AppCompatActivity() {

    private val viewModel by viewModels<VulkanDriverManagerViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(AppThemeManager.currentTheme.getThemeResId())
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        super.onCreate(savedInstanceState)
        window.applyImmersiveFullscreen()

        setContent {
            MelonTheme {
                VulkanDriverManagerScreen(
                    viewModel = viewModel,
                    onBackClick = { finish() }
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        window.applyImmersiveFullscreen()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.applyImmersiveFullscreen()
        }
    }
}
