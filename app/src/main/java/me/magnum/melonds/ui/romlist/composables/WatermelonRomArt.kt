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

fun romPlatformLabel(rom: Rom): String = when {
    rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut -> "DSiWare"
    rom.isDsiEnhanced -> "DSi"
    else -> "DS"
}

fun resolveRomRegionBadge(rom: Rom): Pair<String, String>? {
    val candidates = listOf(rom.fileName, rom.name, rom.uri.lastPathSegment.orEmpty())
    for (raw in candidates) {
        val s = raw.uppercase()
        if (s.containsAny("(USA", "[USA", " (U)", " [U]", "(US)", "[US]", " USA.", " USA ", "_USA_", "-USA-", "(USA,", "[USA,", "(EN,JA,FR,DE,ES,IT)", "(EN,ES)", "(EN,FR)")) {
            return "🇺🇸" to "USA"
        }
        if (s.containsAny("(EUROPE", "[EUROPE", "(EUR", "[EUR", " (E)", " [E]", "(EU)", "[EU]", " EUR.", " EUR ", "_EUR_", "-EUR-", "(EN)", "[EN]", "(EN,", "[EN,", "EUROPEAN", "PAL")) {
            return "🇪🇺" to "EUR"
        }
        if (s.containsAny("(JAPAN", "[JAPAN", "(JAP", "[JAP", "(JPN", "[JPN", " (J)", " [J]", "(JP)", "[JP]", " JPN.", " JPN ", "_JPN_", "-JPN-", "NTSC-J")) {
            return "🇯🇵" to "JPN"
        }
        if (s.containsAny("(KOREA", "[KOREA", "(KOR", "[KOR", " (K)", " [K]", "(KO)", "[KO]", " KOR.", " KOR ")) {
            return "🇰🇷" to "KOR"
        }
        if (s.containsAny("(CHINA", "[CHINA", "(CHN", "[CHN", " (C)", " [C]", "(ZH)", "[ZH]", " CHN.", " CHN ")) {
            return "🇨🇳" to "CHN"
        }
        if (s.containsAny("(GERMANY", "[GERMANY", "(GER", "[GER", " (DE)", " [DE]", "(DE,", "[DE,")) {
            return "🇩🇪" to "GER"
        }
        if (s.containsAny("(FRANCE", "[FRANCE", "(FRA", "[FRA", " (FR)", " [FR]", "(FR,", "[FR,")) {
            return "🇫🇷" to "FRA"
        }
        if (s.containsAny("(ITALY", "[ITALY", "(ITA", "[ITA", " (IT)", " [IT]", "(IT,", "[IT,")) {
            return "🇮🇹" to "ITA"
        }
        if (s.containsAny("(SPAIN", "[SPAIN", "(SPA", "[SPA", " (ES)", " [ES]", "(ES,", "[ES,")) {
            return "🇪🇸" to "SPA"
        }
        if (s.containsAny("(RUSSIA", "[RUSSIA", "(RUS", "[RUS", " (RU)", " [RU]", "(RU,", "[RU,")) {
            return "🇷🇺" to "RUS"
        }
        if (s.containsAny("(AUSTRALIA", "[AUSTRALIA", "(AUS", "[AUS", " (AU)", " [AU]")) {
            return "🇦🇺" to "AUS"
        }
        if (s.containsAny("(WORLD", "[WORLD", "(GLOBAL", "[GLOBAL", "(WLD", "[WLD", " (W)", " [W]")) {
            return "🌐" to "WLD"
        }
    }
    return "🌐" to "DS"
}

private fun String.containsAny(vararg terms: String): Boolean {
    return terms.any { this.contains(it) }
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
    val (bgColor, fgColor) = when (text) {
        "DSiWare" -> Color(0xFF6200EA).copy(alpha = 0.70f) to Color(0xFFE1BEE7)
        "DSi E." -> Color(0xFF00695C).copy(alpha = 0.75f) to Color(0xFF80E27E)
        else -> Color.Black.copy(alpha = 0.55f) to Color.White
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(3.dp))
            .background(bgColor)
            .padding(horizontal = 4.dp, vertical = 1.5.dp),
    ) {
        Text(
            text = text,
            fontFamily = WatermelonMono,
            fontSize = fontSize,
            lineHeight = fontSize * 1.15f,
            fontWeight = FontWeight.Bold,
            color = fgColor,
            letterSpacing = 0.5.sp,
        )
    }
}

private val failedCoverUrls = java.util.Collections.synchronizedSet(mutableSetOf<String>())

fun getCustomCoverFile(context: Context, rom: Rom): java.io.File? {
    val clean = rom.fileName.substringBeforeLast('.').trim()
    val coversDir = java.io.File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/covers")
    val file = java.io.File(coversDir, "$clean.png")
    return if (file.exists()) file else null
}

fun getGameTdbCover3dUrl(rom: Rom): String? {
    if (rom.isDsiWareTitle || rom.isInstalledDsiWareShortcut) return null
    val clean = rom.fileName.uppercase()
    val region = when {
        clean.contains("JAP") || clean.contains("JPN") || clean.contains("(J)") -> "JA"
        clean.contains("EUR") || clean.contains("(E)") -> "EN"
        else -> "US"
    }
    val code = if (rom.name.length == 4 && rom.name.all { it.isLetterOrDigit() }) {
        rom.name.uppercase()
    } else {
        rom.fileName.filter { it.isLetterOrDigit() }.take(4).uppercase()
    }
    val url = if (code.length == 4 && !code.startsWith("NDS", true)) "https://art.gametdb.com/ds/cover3D/$region/$code.png" else null
    return if (url != null && !failedCoverUrls.contains(url)) url else null
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
    val customCover = remember(rom.fileName) { getCustomCoverFile(context, rom) }
    val gameTdbUrl = remember(rom.fileName) { getGameTdbCover3dUrl(rom) }
    var gameTdbFailed by remember(rom.uri) { mutableStateOf(gameTdbUrl == null || failedCoverUrls.contains(gameTdbUrl)) }
    var boxArtFailed by remember(rom.uri, boxArtUrl) { mutableStateOf(boxArtUrl == null || failedCoverUrls.contains(boxArtUrl)) }
    var raFailed by remember(rom.uri, raCoverUrl) { mutableStateOf(raCoverUrl == null || failedCoverUrls.contains(raCoverUrl)) }
    var artLoaded by remember(rom.uri, boxArtUrl, raCoverUrl, customCover) { mutableStateOf(false) }

    val prefs = remember { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }
    val isScraperProEnabled = remember { prefs.getBoolean("rom_gametdb_covers_enabled", false) }
    val isRaCoversEnabled = remember { prefs.getBoolean("rom_ra_covers_enabled", true) }

    val activeModel: Any? = when {
        customCover != null -> customCover
        isScraperProEnabled && gameTdbUrl != null && !gameTdbFailed && !failedCoverUrls.contains(gameTdbUrl) -> gameTdbUrl
        isScraperProEnabled && boxArtUrl != null && !boxArtFailed && !failedCoverUrls.contains(boxArtUrl) -> boxArtUrl
        isRaCoversEnabled && raCoverUrl != null && !raFailed && !failedCoverUrls.contains(raCoverUrl) -> raCoverUrl
        gameTdbUrl != null && !gameTdbFailed && !failedCoverUrls.contains(gameTdbUrl) -> gameTdbUrl
        boxArtUrl != null && !boxArtFailed && !failedCoverUrls.contains(boxArtUrl) -> boxArtUrl
        raCoverUrl != null && !raFailed && !failedCoverUrls.contains(raCoverUrl) -> raCoverUrl
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
            if (activeModel == null) {
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
        if (activeModel != null) {
            if (!artLoaded) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center).size(22.dp),
                    color = Color.White.copy(alpha = 0.85f),
                    strokeWidth = 2.dp,
                )
            }
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(activeModel)
                    .crossfade(true)
                    .diskCachePolicy(coil.request.CachePolicy.ENABLED)
                    .memoryCachePolicy(coil.request.CachePolicy.ENABLED)
                    .networkCachePolicy(coil.request.CachePolicy.ENABLED)
                    .listener(
                        onSuccess = { _, _ ->
                            artLoaded = true
                            onArtLoadedChanged(true)
                        },
                        onError = { _, _ ->
                            if (activeModel is String) {
                                failedCoverUrls.add(activeModel)
                            }
                            if (activeModel == boxArtUrl) {
                                boxArtFailed = true
                            } else if (activeModel == raCoverUrl) {
                                raFailed = true
                            } else if (activeModel == gameTdbUrl) {
                                gameTdbFailed = true
                            }
                            artLoaded = false
                            onArtLoadedChanged(false)
                        },
                    )
                    .build(),
                contentDescription = title,
                contentScale = contentScale,
                filterQuality = FilterQuality.High,
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
