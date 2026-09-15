package me.magnum.melonds.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun WatermelonScreenScaffold(
    title: String,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    hints: List<GamepadHint> = defaultScreenHints(),
    actions: @Composable (() -> Unit)? = null,
    scaffoldState: androidx.compose.material.ScaffoldState = androidx.compose.material.rememberScaffoldState(),
    content: @Composable (PaddingValues) -> Unit,
) {
    val colors = watermelon
    Scaffold(
        modifier = modifier,
        scaffoldState = scaffoldState,
        backgroundColor = colors.bg,
        contentWindowInsets = WindowInsets.safeDrawing,
        topBar = {
            Column(
                Modifier
                    .background(colors.bg)
                    .windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.displayCutout.only(WindowInsetsSides.Top)))
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal))
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                ) {
                    Text(
                        text = title,
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )
                    actions?.invoke()
                }
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
            }
        },
        bottomBar = {
            Column(
                modifier = Modifier
                    .background(colors.bg)
                    .navigationBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, bottom = 16.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    UnifiedBackButton(onClick = onBack)
                }
            }
        },
        content = content,
    )
}

@Composable
private fun defaultScreenHints(): List<GamepadHint> = listOf(
    GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
    GamepadHint("A", stringResource(R.string.pause_hint_accept)),
    GamepadHint("B", stringResource(R.string.pause_hint_back)),
)
