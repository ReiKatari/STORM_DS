package me.magnum.melonds.ui.romlist.composables

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import kotlin.math.absoluteValue
import kotlin.time.Duration

import me.magnum.melonds.ui.romlist.RomDisplayNameManager

val DsBoxArtAspectRatio: Float = 512f / 458f

fun romDisplayName(rom: Rom): String {
    if (!rom.config.customName.isNullOrBlank()) {
        return rom.config.customName!!
    }
    if (RomDisplayNameManager.currentMode == "internal_name" && rom.name.isNotBlank()) {
        return rom.name
    }
    val fileBase = rom.fileName.substringBeforeLast('.')
    if (fileBase.isNotBlank()) {
        return fileBase
    }
    return rom.name
}

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

fun resolveRomRegionBadge(rom: Rom): Pair<String, String>? {
    val name = rom.fileName.uppercase()
    return when {
        "(USA)" in name || "(US)" in name || " (U)" in name || "(USA," in name || "(US," in name -> "🇺🇸" to "USA"
        "(EUROPE)" in name || "(EUR)" in name || " (E)" in name || "(EU)" in name || "(EN," in name || "(EN)" in name -> "🇪🇺" to "EUR"
        "(JAPAN)" in name || "(JAP)" in name || "(JPN)" in name || " (J)" in name -> "🇯🇵" to "JPN"
        "(KOREA)" in name || "(KOR)" in name || " (K)" in name -> "🇰🇷" to "KOR"
        "(CHINA)" in name || "(CHN)" in name || " (C)" in name -> "🇨🇳" to "CHN"
        "(GERMANY)" in name || "(GER)" in name || " (DE)" in name || "(DE," in name -> "🇩🇪" to "GER"
        "(FRANCE)" in name || "(FRA)" in name || " (FR)" in name || "(FR," in name -> "🇫🇷" to "FRA"
        "(ITALY)" in name || "(ITA)" in name || " (IT)" in name || "(IT," in name -> "🇮🇹" to "ITA"
        "(SPAIN)" in name || "(SPA)" in name || " (ES)" in name || "(ES," in name -> "🇪🇸" to "SPA"
        "(RUSSIA)" in name || "(RUS)" in name || " (RU)" in name || "(RU," in name -> "🇷🇺" to "RUS"
        "(AUSTRALIA)" in name || "(AUS)" in name || "(AU)" in name -> "🇦🇺" to "AUS"
        "(WORLD)" in name || "(GLOBAL)" in name -> "🌐" to "WLD"
        else -> null
    }
}

fun resolveRomRegionFlag(rom: Rom): String {
    return resolveRomRegionBadge(rom)?.first ?: ""
}

@Composable
fun RegionBadge(
    flag: String,
    code: String,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(Color.Black.copy(alpha = 0.40f))
            .padding(horizontal = 4.5.dp, vertical = 2.dp),
    ) {
        Text(
            text = flag,
            fontSize = 10.5.sp,
            lineHeight = 11.sp,
        )
        Spacer(Modifier.width(3.dp))
        Text(
            text = code,
            color = Color(0xFFE2E8F0),
            fontFamily = WatermelonMono,
            fontSize = 8.sp,
            lineHeight = 9.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp,
        )
    }
}

fun formatHoursLabel(duration: Duration): String {
    if (duration == Duration.ZERO) return ""
    val hours = duration.inWholeHours
    val minutes = duration.inWholeMinutes % 60
    return if (hours > 0) "${hours}h ${minutes}m" else "${minutes}m"
}

fun romIconRequest(context: Context, rom: Rom): ImageRequest {
    return ImageRequest.Builder(context)
        .data(rom)
        .memoryCacheKey("rom-icon:${rom.uri}")
        .crossfade(false)
        .build()
}

@Composable
fun PlatformBadge(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 8.sp,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(3.dp))
            .background(Color.Black.copy(alpha = 0.55f))
            .padding(horizontal = 4.dp, vertical = 1.5.dp),
    ) {
        Text(
            text = text,
            fontFamily = WatermelonMono,
            fontSize = fontSize,
            lineHeight = fontSize * 1.15f,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            letterSpacing = 0.5.sp,
        )
    }
}

@Composable
fun WatermelonRomArt(
    rom: Rom,
    boxArtUrl: String?,
    raCoverUrl: String?,
    modifier: Modifier = Modifier,
    initialsFontSize: TextUnit = 44.sp,
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
                    CircularProgressIndicator(
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
                CircularProgressIndicator(
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

@Composable
fun RomMiniIcon(
    rom: Rom,
    raCoverUrl: String?,
    modifier: Modifier = Modifier,
    size: Dp = 22.dp,
) {
    val title = romDisplayName(rom)
    val context = LocalContext.current
    val shape = CircleShape

    Box(
        modifier = modifier
            .size(size)
            .clip(shape)
            .background(romGradient(title)),
        contentAlignment = Alignment.Center,
    ) {
        AsyncImage(
            model = romIconRequest(context, rom),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            filterQuality = FilterQuality.None,
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Composable
fun ScanlinesOverlay(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color.Transparent,
                        Color.Black.copy(alpha = 0.12f),
                    )
                )
            )
    )
}
