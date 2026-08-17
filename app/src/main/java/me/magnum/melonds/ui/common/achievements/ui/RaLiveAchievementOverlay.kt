package me.magnum.melonds.ui.common.achievements.ui

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono

data class LiveAchievementEvent(
    val id: String,
    val title: String,
    val description: String,
    val points: Int,
    val isHardcore: Boolean = true
)

@Composable
fun RaLiveAchievementOverlay(
    event: LiveAchievementEvent?,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var visible by remember(event) { mutableStateOf(event != null) }

    LaunchedEffect(event) {
        if (event != null) {
            visible = true
            delay(4500)
            visible = false
            delay(400)
            onDismiss()
        }
    }

    AnimatedVisibility(
        visible = visible && event != null,
        enter = slideInVertically(initialOffsetY = { -it }, animationSpec = tween(400)) + fadeIn(),
        exit = slideOutVertically(targetOffsetY = { -it }, animationSpec = tween(300)) + fadeOut(),
        modifier = modifier
    ) {
        if (event != null) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .shadow(16.dp, RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFF18181B).copy(alpha = 0.96f),
                                Color(0xFF27272A).copy(alpha = 0.94f)
                            )
                        )
                    )
                    .border(
                        1.dp,
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFFEAB308).copy(alpha = 0.8f),
                                Color(0xFFF97316).copy(alpha = 0.5f)
                            )
                        ),
                        RoundedCornerShape(16.dp)
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Trophy Circle Badge
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(
                                Brush.radialGradient(
                                    listOf(Color(0xFFFACC15), Color(0xFFCA8A04))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.EmojiEvents,
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    // Content: Title, Description & Badge
                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "ДОСТИЖЕНИЕ РАЗБЛОКИРОВАНО",
                                color = Color(0xFFFACC15),
                                fontFamily = WatermelonMono,
                                fontSize = 8.5.sp,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 0.6.sp
                            )
                            Spacer(Modifier.weight(1f))
                            Text(
                                text = "+${event.points} PTS",
                                color = Color.White,
                                fontFamily = WatermelonMono,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(Color(0xFFEAB308).copy(alpha = 0.25f))
                                    .padding(horizontal = 4.dp, vertical = 1.dp)
                            )
                        }

                        Spacer(Modifier.height(2.dp))

                        Text(
                            text = event.title,
                            color = Color.White,
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        Text(
                            text = event.description,
                            color = Color.White.copy(alpha = 0.75f),
                            fontFamily = SpaceGrotesk,
                            fontSize = 10.5.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
    }
}
