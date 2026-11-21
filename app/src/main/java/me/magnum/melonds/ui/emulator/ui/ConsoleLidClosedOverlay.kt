package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.ui.common.RequestInitialFocus
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun ConsoleLidClosedOverlay(
    onOpenLid: () -> Unit,
) {
    val colors = watermelon
    val openButtonFocusRequester = remember { FocusRequester() }

    BackHandler(onBack = onOpenLid)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.88f))
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (
                        event.key == Key.Back ||
                            event.key == Key.Escape ||
                            event.key == Key.ButtonB ||
                            event.key == Key.ButtonA ||
                            event.key == Key.Enter ||
                            event.key == Key.DirectionCenter
                        )
                ) {
                    onOpenLid()
                    true
                } else {
                    false
                }
            }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onOpenLid,
            ),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(24.dp)
                .widthIn(max = 420.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(colors.surface)
                .border(1.5.dp, colors.line, RoundedCornerShape(24.dp))
                .padding(horizontal = 24.dp, vertical = 28.dp),
        ) {
            // Sleep / Lid Icon Badge
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(colors.surface2)
                    .border(1.5.dp, colors.green.copy(alpha = 0.6f), CircleShape),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.Bedtime,
                    contentDescription = null,
                    tint = colors.green,
                    modifier = Modifier.size(32.dp),
                )
            }

            Spacer(Modifier.height(16.dp))

            Text(
                text = "Консоль закрыта",
                fontFamily = SpaceGrotesk,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = colors.text,
                textAlign = TextAlign.Center,
            )

            Spacer(Modifier.height(4.dp))

            Text(
                text = "РЕЖИМ СНА (SLEEP MODE)",
                fontFamily = WatermelonMono,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp,
                color = colors.green,
                letterSpacing = 1.sp,
                textAlign = TextAlign.Center,
            )

            Spacer(Modifier.height(10.dp))

            Text(
                text = "Экраны выключены, консоль находится в режиме энергосбережения.",
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                color = colors.text2,
                textAlign = TextAlign.Center,
                lineHeight = 18.sp,
            )

            Spacer(Modifier.height(20.dp))

            // Action Button to open lid
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(openButtonFocusRequester)
                    .clip(RoundedCornerShape(14.dp))
                    .background(colors.surface2)
                    .border(1.5.dp, colors.green, RoundedCornerShape(14.dp))
                    .clickable(onClick = onOpenLid)
                    .padding(vertical = 12.dp, horizontal = 16.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Filled.LockOpen,
                        contentDescription = null,
                        tint = colors.green,
                        modifier = Modifier.size(18.dp),
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Открыть консоль",
                        fontFamily = SpaceGrotesk,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = colors.green,
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Text(
                text = "или коснитесь экрана в любом месте",
                fontFamily = WatermelonMono,
                fontSize = 10.sp,
                color = colors.text3,
                textAlign = TextAlign.Center,
            )
        }

        RequestInitialFocus(openButtonFocusRequester)
    }
}
