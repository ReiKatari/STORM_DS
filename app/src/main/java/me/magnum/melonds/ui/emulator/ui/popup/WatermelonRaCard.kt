package me.magnum.melonds.ui.emulator.ui.popup

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.ui.theme.DarkWatermelonColors
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono

@Composable
fun WatermelonRaCard(
    modifier: Modifier = Modifier,
    iconUrl: String?,
    iconShape: Shape = RoundedCornerShape(10.dp),
    eyebrowIcon: ImageVector = Icons.Filled.EmojiEvents,
    eyebrow: String,
    title: String,
    subtitle: String = "",
    subtitleMaxLines: Int = 1,
    accent: Color = WatermelonColors.gold,
) {
    val colors = DarkWatermelonColors
    val shape = RoundedCornerShape(15.dp)
    Box(
        modifier = modifier
            .padding(12.dp)
            .widthIn(max = 400.dp)
            .shadow(10.dp, shape)
            .clip(shape)
            .background(colors.surface2)
            .border(1.dp, accent.copy(alpha = 0.35f), shape),
    ) {
        Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
            if (iconUrl.isNullOrBlank()) {
                Box(
                    modifier = Modifier.size(48.dp).clip(iconShape).background(accent.copy(alpha = 0.18f)),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(eyebrowIcon, null, tint = accent, modifier = Modifier.size(26.dp))
                }
            } else {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(iconUrl)
                        .crossfade(false)
                        .build(),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp).clip(iconShape),
                )
            }

            Column(Modifier.padding(start = 12.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(eyebrowIcon, null, tint = accent, modifier = Modifier.size(12.dp))
                    Text(
                        text = eyebrow,
                        color = accent,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.8.sp,
                        modifier = Modifier.padding(start = 5.dp),
                    )
                }
                Text(
                    text = title,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 2.dp),
                )
                if (subtitle.isNotBlank()) {
                    Text(
                        text = subtitle,
                        color = colors.text2,
                        fontFamily = Manrope,
                        fontSize = 11.5.sp,
                        lineHeight = 15.sp,
                        maxLines = subtitleMaxLines,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }
}

val RaAvatarShape: Shape = CircleShape
