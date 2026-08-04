package me.magnum.melonds.ui.romlist.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import kotlin.math.absoluteValue
import kotlin.time.Duration

val DsBoxArtAspectRatio: Float = 512f / 458f

fun romDisplayName(rom: Rom): String = rom.config.customName ?: rom.name

fun romInitials(title: String): String {
    val words = title.split(' ', '-', ':', '_').filter { it.isNotBlank() && it.first().isLetterOrDigit() }
    return when {
        words.isEmpty() -> title.take(1).uppercase()
        words.size == 1 -> words[0].take(1).uppercase()
        else -> (words[0].take(1) + words[1].take(1)).uppercase()
    }
}

fun romGradient(title: String): Brush {
    val hash = title.hashCode()
    val h1 = (hash.absoluteValue % 360).toFloat()
    val h2 = ((hash / 360).absoluteValue % 360).toFloat()
    val start = Color.hsl(h1, 0.68f, 0.47f)
    val end = Color.hsl(h2, 0.60f, 0.26f)
    return Brush.linearGradient(colors = listOf(start, end))
}

fun romPlatformLabel(rom: Rom): String = if (rom.isDsiWareTitle) "DSi" else "DS"

fun formatHoursLabel(duration: Duration): String {
    if (duration == Duration.ZERO) return ""
    val hours = duration.inWholeHours
    val minutes = duration.inWholeMinutes % 60
    return when {
        hours >= 1 -> "%dh %02dm".format(hours, minutes)
        minutes >= 1 -> "${minutes}m"
        else -> "<1m"
    }
}

@Composable
fun ScanlinesOverlay(modifier: Modifier = Modifier, alpha: Float = 0.045f) {
    val lineColor = Color.White.copy(alpha = alpha)
    Spacer(
        modifier = modifier
            .fillMaxSize()
            .drawWithCache {
                val periodPx = 3.dp.toPx()
                val lineStop = (1.dp.toPx() / periodPx).coerceIn(0f, 1f)
                val brush = Brush.verticalGradient(
                    0f to lineColor,
                    lineStop to lineColor,
                    lineStop to Color.Transparent,
                    1f to Color.Transparent,
                    startY = 0f,
                    endY = periodPx,
                    tileMode = TileMode.Repeated,
                )
                onDrawBehind {
                    drawRect(brush = brush)
                }
            },
    )
}

@Composable
fun PlatformBadge(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: androidx.compose.ui.unit.TextUnit = 8.sp,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(Color.Black.copy(alpha = 0.35f))
            .padding(horizontal = 6.dp, vertical = 2.dp),
    ) {
        Text(
            text = text,
            color = Color.White,
            fontFamily = WatermelonMono,
            fontSize = fontSize,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.5.sp,
            lineHeight = fontSize,
        )
    }
}

@Composable
fun RomMiniIcon(
    rom: Rom,
    modifier: Modifier = Modifier,
    raCoverUrl: String? = null,
    size: Dp = 27.dp,
) {
    val context = LocalContext.current
    var raFailed by remember(rom.uri, raCoverUrl) { mutableStateOf(false) }
    Box(
        modifier = modifier
            .size(size)
            .clip(RoundedCornerShape(6.dp))
            .border(1.5.dp, Color.White.copy(alpha = 0.6f), RoundedCornerShape(6.dp))
            .background(Color.Black.copy(alpha = 0.3f)),
    ) {
        if (raCoverUrl != null && !raFailed) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(raCoverUrl)
                    .listener(onError = { _, _ -> raFailed = true })
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            AsyncImage(
                model = romIconRequest(context, rom),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                filterQuality = FilterQuality.None,
                modifier = Modifier.fillMaxSize().scale(1.5f),
            )
        }
    }
}

fun romIconRequest(context: android.content.Context, rom: Rom): ImageRequest {
    return ImageRequest.Builder(context)
        .data(rom)
        .memoryCacheKey("rom-icon:${rom.uri}")
        .crossfade(false)
        .build()
}

@Composable
fun WatermelonRomArt(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    modifier: Modifier = Modifier,
    initialsFontSize: androidx.compose.ui.unit.TextUnit = 44.sp,
    contentScale: ContentScale = ContentScale.Crop,
    boxArtLoading: Boolean = false,
    onArtLoadedChanged: (Boolean) -> Unit = {},
) {
    val context = LocalContext.current
    var boxArtFailed by remember(rom.uri, boxArtUrl) { mutableStateOf(false) }
    var raFailed by remember(rom.uri, raCoverUrl) { mutableStateOf(false) }
    var artLoaded by remember(rom.uri, boxArtUrl, raCoverUrl) { mutableStateOf(false) }

    val activeUrl = when {
        boxArtUrl != null && !boxArtFailed -> boxArtUrl
        raCoverUrl != null && !raFailed -> raCoverUrl
        else -> null
    }

    val title = romDisplayName(rom)
    Box(modifier = modifier.background(romGradient(title))) {
        if (!artLoaded) {
            Text(
                text = romInitials(title),
                color = Color.White.copy(alpha = 0.18f),
                fontFamily = SpaceGrotesk,
                fontWeight = FontWeight.Bold,
                fontSize = initialsFontSize,
                modifier = Modifier.align(Alignment.Center),
            )
            if (activeUrl == null) {
                if (boxArtLoading) {
                    androidx.compose.material.CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center).size(22.dp),
                        color = Color.White.copy(alpha = 0.85f),
                        strokeWidth = 2.dp,
                    )
                } else {
                    AsyncImage(
                        model = romIconRequest(context, rom),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        filterQuality = FilterQuality.None,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxSize(),
                    )
                }
            }
        }
        if (activeUrl != null) {
            if (!artLoaded) {
                androidx.compose.material.CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center).size(22.dp),
                    color = Color.White.copy(alpha = 0.85f),
                    strokeWidth = 2.dp,
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(activeUrl)
                    .crossfade(true)
                    .listener(
                        onSuccess = { _, _ ->
                            artLoaded = true
                            onArtLoadedChanged(true)
                        },
                        onError = { _, _ ->
                            if (activeUrl == boxArtUrl) boxArtFailed = true else raFailed = true
                            artLoaded = false
                            onArtLoadedChanged(false)
                        },
                    )
                    .build(),
                contentDescription = title,
                contentScale = contentScale,
                modifier = Modifier.fillMaxSize(),
            )
        }
        ScanlinesOverlay()
    }
}
