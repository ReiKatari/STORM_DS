package me.magnum.melonds.ui.common

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import kotlinx.coroutines.delay
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun RequestInitialFocus(focusRequester: FocusRequester) {
    LaunchedEffect(focusRequester) {
        repeat(12) {
            if (runCatching { focusRequester.requestFocus() }.isSuccess) {
                return@LaunchedEffect
            }
            delay(30)
        }
    }
}

@Composable
fun WatermelonSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val colors = watermelon
    val trackColor by animateColorAsState(
        targetValue = if (checked) colors.green else colors.switchOff,
        animationSpec = tween(180),
        label = "switch_track",
    )
    val knobOffset by animateDpAsState(
        targetValue = if (checked) 19.dp else 0.dp,
        animationSpec = tween(180),
        label = "switch_knob",
    )
    Box(
        modifier = modifier
            .size(width = 44.dp, height = 25.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(trackColor)
            .let {
                if (onCheckedChange != null && enabled) {
                    it.clickable { onCheckedChange(!checked) }
                } else {
                    it
                }
            }
            .padding(3.dp),
        contentAlignment = Alignment.CenterStart,
    ) {
        Box(
            modifier = Modifier
                .offset(x = knobOffset)
                .size(19.dp)
                .shadow(2.dp, CircleShape)
                .clip(CircleShape)
                .background(Color.White),
        )
    }
}

@Composable
fun WatermelonSectionLabel(
    text: String,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    Text(
        text = text.uppercase(),
        color = colors.text3,
        fontFamily = WatermelonMono,
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.8.sp,
        modifier = modifier.padding(start = 2.dp, top = 20.dp, bottom = 9.dp),
    )
}

@Composable
fun WatermelonCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    val colors = watermelon
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(colors.surface)
            .border(1.dp, colors.line, RoundedCornerShape(15.dp)),
        content = content,
    )
}

@Composable
fun WatermelonRowSeparator() {
    val colors = watermelon
    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
}

data class GamepadHint(val button: String?, val label: String)

@Composable
fun GamepadHintsFooter(
    hints: List<GamepadHint>,
    modifier: Modifier = Modifier,
    showTopBorder: Boolean = true,
) {
    val colors = watermelon
    Column(modifier = modifier.fillMaxWidth()) {
        if (showTopBorder) {
            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(18.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 8.dp),
        ) {
            hints.forEach { hint ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (hint.button == null) {
                        Icon(
                            imageVector = Icons.Filled.SportsEsports,
                            contentDescription = null,
                            tint = colors.text3,
                            modifier = Modifier.size(15.dp),
                        )
                    } else {
                        Box(
                            modifier = Modifier
                                .size(17.dp)
                                .border(1.5.dp, colors.text3, CircleShape),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = hint.button,
                                color = colors.text3,
                                fontSize = 9.sp,
                                lineHeight = 9.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                            )
                        }
                    }
                    Text(
                        text = hint.label,
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 6.dp),
                    )
                }
            }
        }
    }
}
