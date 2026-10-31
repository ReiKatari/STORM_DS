package me.magnum.melonds.ui.emulator.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun FrameAdvanceHudOverlay(
    visible: Boolean,
    frameCounter: Int = 0,
    onStepNextFrame: () -> Unit,
    onResumeGame: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon

    AnimatedVisibility(
        visible = visible,
        enter = fadeIn() + slideInVertically { -it },
        exit = fadeOut() + slideOutVertically { -it },
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(top = 10.dp, start = 14.dp, end = 14.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            val pillShape = RoundedCornerShape(20.dp)
            Row(
                modifier = Modifier
                    .shadow(elevation = 8.dp, shape = pillShape, ambientColor = colors.shadow, spotColor = colors.shadow)
                    .clip(pillShape)
                    .background(colors.surface)
                    .border(1.dp, colors.green.copy(alpha = 0.55f), pillShape)
                    .padding(horizontal = 12.dp, vertical = 7.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                // Status Section
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.greenDim)
                            .padding(4.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Pause,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(14.dp),
                        )
                    }

                    Text(
                        text = stringResource(R.string.frame_advance_paused_status),
                        color = colors.text,
                        fontFamily = Manrope,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    if (frameCounter > 0) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(6.dp))
                                .padding(horizontal = 5.dp, vertical = 1.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "+$frameCounter",
                                color = colors.green,
                                fontFamily = WatermelonMono,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(2.dp))

                // Step Button [⏭ +1 кадр]
                val stepShape = RoundedCornerShape(12.dp)
                Row(
                    modifier = Modifier
                        .clip(stepShape)
                        .background(colors.surface2)
                        .border(1.dp, colors.line, stepShape)
                        .bouncingClickable { onStepNextFrame() }
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.SkipNext,
                        contentDescription = null,
                        tint = colors.text,
                        modifier = Modifier.size(15.dp),
                    )
                    Text(
                        text = stringResource(R.string.frame_advance_step_btn),
                        color = colors.text,
                        fontFamily = Manrope,
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                // Resume Button [▶ Продолжить]
                val resumeShape = RoundedCornerShape(12.dp)
                Row(
                    modifier = Modifier
                        .clip(resumeShape)
                        .background(colors.green)
                        .border(1.dp, colors.green, resumeShape)
                        .bouncingClickable { onResumeGame() }
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.PlayArrow,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(15.dp),
                    )
                    Text(
                        text = stringResource(R.string.frame_advance_resume_btn),
                        color = Color.White,
                        fontFamily = Manrope,
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}
