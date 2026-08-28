package me.magnum.melonds.ui.dsiwaremanager

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import me.magnum.melonds.ui.dsiwaremanager.ui.DSiWareManagerScreen
import me.magnum.melonds.ui.theme.MelonTheme

@AndroidEntryPoint
class DSiWareManagerActivity : AppCompatActivity() {

    private val viewModel by viewModels<DSiWareManagerViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(me.magnum.melonds.ui.theme.AppThemeManager.currentTheme.getThemeResId())
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        super.onCreate(savedInstanceState)
        applyImmersiveMode()

        setContent {
            MelonTheme {
                DSiWareManagerScreen(
                    viewModel = viewModel,
                    onBackClick = { finish() },
                )
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            applyImmersiveMode()
        }
    }

    private fun applyImmersiveMode() {
        window.applyImmersiveFullscreen()
    }
}