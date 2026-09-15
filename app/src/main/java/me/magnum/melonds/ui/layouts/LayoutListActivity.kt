package me.magnum.melonds.ui.layouts

import android.graphics.Color
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import me.magnum.melonds.ui.layouts.ui.LayoutsScreen
import me.magnum.melonds.ui.layouts.viewmodel.LayoutsViewModel
import me.magnum.melonds.ui.theme.MelonTheme

@AndroidEntryPoint
class LayoutListActivity : AppCompatActivity() {

    private val viewModel: LayoutsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(me.magnum.melonds.ui.theme.AppThemeManager.currentTheme.getThemeResId())
        window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN)
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(Color.TRANSPARENT))
        val insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.decorView)
        insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.navigationBars())
        insetsController.systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        super.onCreate(savedInstanceState)
        setContent {
            MelonTheme {
                LayoutsScreen(
                    viewModel = viewModel,
                    onNavigateBack = ::finish,
                )
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            val insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.decorView)
            insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.navigationBars())
            insetsController.systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
}