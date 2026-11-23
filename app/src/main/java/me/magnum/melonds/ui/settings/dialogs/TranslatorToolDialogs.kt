package me.magnum.melonds.ui.settings.dialogs

import android.app.Dialog
import android.content.Context
import android.os.SystemClock
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.GTranslate
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SdCard
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.preference.PreferenceManager
import com.google.android.gms.tasks.Task
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.common.model.RemoteModelManager
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.TranslateRemoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import me.magnum.melonds.R
import me.magnum.melonds.common.network.SharedOkHttpClient
import me.magnum.melonds.translator.GameTranslatorManager
import me.magnum.melonds.translator.engine.CustomAiEngine
import me.magnum.melonds.translator.engine.DeepLEngine
import me.magnum.melonds.translator.engine.GoogleTranslateEngine
import me.magnum.melonds.translator.engine.MlKitOnDeviceTranslateEngine
import me.magnum.melonds.translator.engine.TranslationException
import me.magnum.melonds.translator.model.TranslatorEngineType
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import java.io.File
import java.util.Locale
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

private const val ESTIMATED_MLKIT_MODEL_MB = 30

data class MlKitModelLanguageSpec(
    val langCode: String,
    val badgeCode: String,
    val titleResId: Int,
)

val MLKIT_MANAGED_MODELS: List<MlKitModelLanguageSpec> = listOf(
    MlKitModelLanguageSpec(TranslateLanguage.JAPANESE, "JA", R.string.translator_mlkit_lang_ja),
    MlKitModelLanguageSpec(TranslateLanguage.ENGLISH, "EN", R.string.translator_mlkit_lang_en),
    MlKitModelLanguageSpec(TranslateLanguage.CHINESE, "ZH", R.string.translator_mlkit_lang_zh),
    MlKitModelLanguageSpec(TranslateLanguage.KOREAN, "KO", R.string.translator_mlkit_lang_ko),
    MlKitModelLanguageSpec(TranslateLanguage.RUSSIAN, "RU", R.string.translator_mlkit_lang_ru),
)

suspend fun fetchDownloadedMlKitPackCount(): Int = withContext(Dispatchers.IO) {
    val manager = RemoteModelManager.getInstance()
    val downloaded = manager.getDownloadedModels(TranslateRemoteModel::class.java).awaitResult()
    val downloadedCodes = downloaded.map { it.language.lowercase(Locale.ROOT) }.toSet()
    MLKIT_MANAGED_MODELS.count { it.langCode.lowercase(Locale.ROOT) in downloadedCodes }
}

private suspend fun <T> Task<T>.awaitResult(): T = suspendCancellableCoroutine { continuation ->
    addOnSuccessListener { result ->
        if (continuation.isActive) continuation.resume(result)
    }
    addOnFailureListener { exception ->
        if (continuation.isActive) continuation.resumeWithException(exception)
    }
    addOnCanceledListener {
        if (continuation.isActive) continuation.cancel()
    }
}

fun showTranslatorApiTestDialog(context: Context): Dialog {
    return showSettingsComposeDialog(context) { dismiss ->
        val colors = remember(context) { AppThemeManager.getCurrentWatermelonColors(context) }
        CompositionLocalProvider(LocalWatermelonColors provides colors) {
            TranslatorApiTestDialogContent(onDismiss = dismiss)
        }
    }
}

fun showMlKitModelsManagerDialog(
    context: Context,
    onModelsChanged: () -> Unit,
): Dialog {
    return showSettingsComposeDialog(context) { dismiss ->
        val colors = remember(context) { AppThemeManager.getCurrentWatermelonColors(context) }
        CompositionLocalProvider(LocalWatermelonColors provides colors) {
            MlKitModelsManagerDialogContent(
                onModelsChanged = onModelsChanged,
                onDismiss = dismiss,
            )
        }
    }
}

private data class TranslatorApiTestResult(
    val engineName: String,
    val langPair: String,
    val isSuccess: Boolean,
    val latencyMs: Long,
    val originalText: String,
    val translatedText: String?,
    val errorMessage: String?,
)

private fun buildTestSamplePhrase(sourceLang: String, targetLang: String): Pair<String, String> {
    val src = sourceLang.lowercase(Locale.ROOT).trim()
    val tgt = targetLang.lowercase(Locale.ROOT).trim()
    return when {
        src.startsWith("ja") -> "冒険の準備はできましたか？" to "ja"
        src.startsWith("zh") -> "欢迎来到STORM DS！准备好冒险了吗？" to "zh"
        src.startsWith("ko") -> "STORM DS에 오신 것을 환영합니다! 모험을 떠날 준비가 되었나요?" to "ko"
        src.startsWith("de") -> "Willkommen bei STORM DS! Bereit für das Abenteuer?" to "de"
        src.startsWith("fr") -> "Bienvenue dans STORM DS ! Prêt pour l'aventure ?" to "fr"
        src.startsWith("es") -> "¡Bienvenido a STORM DS! ¿Listo para la aventura?" to "es"
        src.startsWith("it") -> "Benvenuti in STORM DS! Pronti per l'avventura?" to "it"
        (src == "auto" || src.isBlank()) && tgt.startsWith("en") -> "冒険の準備はできましたか？" to "ja"
        else -> "Welcome to STORM DS! Ready for adventure." to (if (src.isBlank()) "auto" else src)
    }
}

private fun resolveEngineDisplayName(
    context: Context,
    engineType: TranslatorEngineType,
    customModel: String,
): String {
    return when (engineType) {
        TranslatorEngineType.GOOGLE -> context.getString(R.string.translator_engine_google)
        TranslatorEngineType.MLKIT_OFFLINE -> context.getString(R.string.translator_engine_offline)
        TranslatorEngineType.DEEPL -> context.getString(R.string.translator_engine_deepl)
        TranslatorEngineType.CUSTOM_AI -> {
            val base = context.getString(R.string.translator_engine_custom_ai)
            val cleanModel = customModel.trim()
            if (cleanModel.isNotEmpty()) "$base ($cleanModel)" else base
        }
    }
}

@Composable
private fun TranslatorApiTestDialogContent(
    onDismiss: () -> Unit,
) {
    val context = LocalContext.current
    val colors = AppThemeManager.getCurrentWatermelonColors(context)
    var runTrigger by remember { mutableIntStateOf(0) }
    var isTesting by remember { mutableStateOf(true) }
    var testResult by remember { mutableStateOf<TranslatorApiTestResult?>(null) }

    LaunchedEffect(runTrigger) {
        isTesting = true
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val enginePref = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_ENGINE, "google") ?: "google"
        val engineType = TranslatorEngineType.fromPreference(enginePref)
        val sourceLang = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_SOURCE_LANG, "auto") ?: "auto"
        val targetLang = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"
        val deeplKey = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_DEEPL_KEY, "").orEmpty()
        val customAiKey = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_KEY, "").orEmpty()
        val customAiEndpoint = prefs.getString(
            GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT,
            "https://api.openai.com/v1/chat/completions",
        ).orEmpty()
        val customAiModel = prefs.getString(GameTranslatorManager.PREF_TRANSLATOR_CUSTOM_AI_MODEL, "gpt-4o-mini").orEmpty()

        val (samplePhrase, effectiveSource) = buildTestSamplePhrase(sourceLang, targetLang)
        val engineName = resolveEngineDisplayName(context, engineType, customAiModel)
        val langPair = context.getString(
            R.string.translator_test_api_lang_pair,
            effectiveSource.uppercase(Locale.ROOT),
            targetLang.uppercase(Locale.ROOT),
        )

        val result = withContext(Dispatchers.IO) {
            val client = SharedOkHttpClient.instance.newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .build()

            val engine = when (engineType) {
                TranslatorEngineType.GOOGLE -> GoogleTranslateEngine(
                    client = client,
                    fallbackOffline = MlKitOnDeviceTranslateEngine(context, downloadIfMissing = false),
                    context = context,
                )
                TranslatorEngineType.MLKIT_OFFLINE -> MlKitOnDeviceTranslateEngine(
                    context = context,
                    downloadIfMissing = true,
                )
                TranslatorEngineType.DEEPL -> DeepLEngine(
                    client = client,
                    context = context,
                    apiKeyProvider = { deeplKey },
                )
                TranslatorEngineType.CUSTOM_AI -> CustomAiEngine(
                    client = client,
                    context = context,
                    apiKeyProvider = { customAiKey },
                    endpointProvider = { customAiEndpoint },
                    modelProvider = { customAiModel },
                )
            }

            val startMs = SystemClock.elapsedRealtime()
            val timeoutMs = if (engineType == TranslatorEngineType.MLKIT_OFFLINE) 30_000L else 20_000L
            try {
                val translated = withTimeout(timeoutMs) {
                    engine.translate(samplePhrase, effectiveSource, targetLang)
                }
                val elapsed = (SystemClock.elapsedRealtime() - startMs).coerceAtLeast(1L)
                if (translated.isBlank()) {
                    TranslatorApiTestResult(
                        engineName = engineName,
                        langPair = langPair,
                        isSuccess = false,
                        latencyMs = elapsed,
                        originalText = samplePhrase,
                        translatedText = null,
                        errorMessage = context.getString(R.string.translator_error_network),
                    )
                } else {
                    TranslatorApiTestResult(
                        engineName = engineName,
                        langPair = langPair,
                        isSuccess = true,
                        latencyMs = elapsed,
                        originalText = samplePhrase,
                        translatedText = translated,
                        errorMessage = null,
                    )
                }
            } catch (t: Throwable) {
                val elapsed = (SystemClock.elapsedRealtime() - startMs).coerceAtLeast(1L)
                val detailed = when (t) {
                    is TranslationException -> t.userMessage.ifBlank { t.message }
                    else -> t.message?.takeIf { it.isNotBlank() } ?: t.javaClass.simpleName
                }
                TranslatorApiTestResult(
                    engineName = engineName,
                    langPair = langPair,
                    isSuccess = false,
                    latencyMs = elapsed,
                    originalText = samplePhrase,
                    translatedText = null,
                    errorMessage = detailed ?: context.getString(R.string.translator_error_network),
                )
            }
        }

        testResult = result
        isTesting = false
    }

    SettingsDialogScaffold(
        title = stringResource(R.string.translator_test_api_dialog_title),
        subtitle = testResult?.langPair ?: stringResource(R.string.translator_test_api_summary),
        icon = Icons.Filled.GTranslate,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            if (isTesting) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                        .padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                ) {
                    CircularProgressIndicator(
                        color = colors.green,
                        strokeWidth = 2.5.dp,
                        modifier = Modifier.size(24.dp),
                    )
                    Text(
                        text = stringResource(R.string.translator_test_api_running),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                    )
                }
            } else {
                val res = testResult
                if (res != null) {
                    // Engine and status summary card
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                            .padding(14.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        Text(
                            text = stringResource(R.string.translator_test_api_engine_label),
                            color = colors.text2,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            text = res.engineName,
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            val statusColor = if (res.isSuccess) colors.green else colors.red
                            val statusBg = if (res.isSuccess) colors.greenDim else colors.redGlow
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(statusBg)
                                    .border(1.dp, statusColor.copy(alpha = 0.6f), RoundedCornerShape(10.dp))
                                    .padding(horizontal = 10.dp, vertical = 6.dp),
                            ) {
                                Icon(
                                    imageVector = if (res.isSuccess) Icons.Filled.CheckCircle else Icons.Filled.Warning,
                                    contentDescription = null,
                                    tint = statusColor,
                                    modifier = Modifier.size(16.dp),
                                )
                                Text(
                                    text = "${stringResource(R.string.translator_test_api_status_label)}: ${
                                        stringResource(
                                            if (res.isSuccess) R.string.translator_test_api_status_ok
                                            else R.string.translator_test_api_status_error,
                                        )
                                    }",
                                    color = statusColor,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.5.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(5.dp),
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(colors.surface3)
                                    .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                                    .padding(horizontal = 10.dp, vertical = 6.dp),
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Bolt,
                                    contentDescription = null,
                                    tint = colors.green,
                                    modifier = Modifier.size(15.dp),
                                )
                                Text(
                                    text = "${stringResource(R.string.translator_test_api_latency_label)}: ${
                                        stringResource(R.string.translator_test_api_latency_value, res.latencyMs.toInt())
                                    }",
                                    color = colors.text,
                                    fontFamily = WatermelonMono,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold,
                                )
                            }
                        }
                    }

                    // Original phrase card
                    TestResultTextCard(
                        label = stringResource(R.string.translator_test_api_original_label),
                        body = res.originalText,
                        colors = colors,
                        borderColor = colors.line,
                        bodyColor = colors.text,
                    )

                    // Translated text or error card
                    if (res.isSuccess && !res.translatedText.isNullOrBlank()) {
                        TestResultTextCard(
                            label = stringResource(R.string.translator_test_api_translated_label),
                            body = res.translatedText,
                            colors = colors,
                            borderColor = colors.green.copy(alpha = 0.65f),
                            bodyColor = colors.text,
                        )
                    } else {
                        TestResultTextCard(
                            label = stringResource(R.string.translator_test_api_error_label),
                            body = res.errorMessage ?: stringResource(R.string.translator_error_network),
                            colors = colors,
                            borderColor = colors.red.copy(alpha = 0.7f),
                            bodyColor = colors.red,
                        )
                    }
                }
            }

            // Re-run button
            val onAccentText = if (colors.green.luminance() > 0.45f) Color(0xFF0A0A0F) else Color.White
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (isTesting) colors.surface3 else colors.green)
                    .clickable(enabled = !isTesting) { runTrigger++ }
                    .padding(horizontal = 16.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = null,
                    tint = if (isTesting) colors.text3 else onAccentText,
                    modifier = Modifier.size(18.dp),
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = stringResource(R.string.translator_test_api_retry),
                    color = if (isTesting) colors.text3 else onAccentText,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Composable
private fun TestResultTextCard(
    label: String,
    body: String,
    colors: WatermelonColors,
    borderColor: Color,
    bodyColor: Color,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(colors.surface2)
            .border(1.2.dp, borderColor, RoundedCornerShape(14.dp))
            .padding(14.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        Text(
            text = label,
            color = colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = 11.5.sp,
            fontWeight = FontWeight.SemiBold,
        )
        Text(
            text = body,
            color = bodyColor,
            fontFamily = SpaceGrotesk,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            lineHeight = 20.sp,
        )
    }
}

private enum class MlKitBusyAction {
    DOWNLOADING,
    DELETING,
}

private data class MlKitModelUiState(
    val spec: MlKitModelLanguageSpec,
    val isDownloaded: Boolean = false,
    val diskBytes: Long? = null,
    val busyAction: MlKitBusyAction? = null,
)

@Composable
private fun MlKitModelsManagerDialogContent(
    onModelsChanged: () -> Unit,
    onDismiss: () -> Unit,
) {
    val context = LocalContext.current
    val colors = AppThemeManager.getCurrentWatermelonColors(context)
    val scope = rememberCoroutineScope()

    var isRefreshing by remember { mutableStateOf(true) }
    var modelStates by remember {
        mutableStateOf(MLKIT_MANAGED_MODELS.map { MlKitModelUiState(spec = it) })
    }
    var errorBanner by remember { mutableStateOf<String?>(null) }

    suspend fun reloadModelStates() {
        isRefreshing = true
        try {
            val loaded = queryMlKitModelStates(context)
            modelStates = modelStates.map { existing ->
                val fresh = loaded[existing.spec.langCode]
                existing.copy(
                    isDownloaded = fresh?.first == true,
                    diskBytes = fresh?.second,
                )
            }
        } catch (t: Throwable) {
            errorBanner = context.getString(
                R.string.translator_mlkit_action_error,
                t.message?.takeIf { it.isNotBlank() } ?: t.javaClass.simpleName,
            )
        } finally {
            isRefreshing = false
        }
    }

    LaunchedEffect(Unit) {
        reloadModelStates()
    }

    val downloadedCount = modelStates.count { it.isDownloaded }
    val subtitleText = if (isRefreshing && downloadedCount == 0) {
        stringResource(R.string.translator_mlkit_models_dialog_subtitle)
    } else {
        stringResource(R.string.translator_mlkit_models_summary, downloadedCount, MLKIT_MANAGED_MODELS.size)
    }

    SettingsDialogScaffold(
        title = stringResource(R.string.translator_mlkit_models_title),
        subtitle = subtitleText,
        icon = Icons.Filled.Language,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            if (!errorBanner.isNullOrBlank()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.redGlow)
                        .border(1.dp, colors.red.copy(alpha = 0.7f), RoundedCornerShape(12.dp))
                        .padding(horizontal = 12.dp, vertical = 10.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.Warning,
                        contentDescription = null,
                        tint = colors.red,
                        modifier = Modifier.size(18.dp),
                    )
                    Text(
                        text = errorBanner.orEmpty(),
                        color = colors.red,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.weight(1f),
                    )
                }
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 420.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(modelStates, key = { it.spec.langCode }) { item ->
                    val isBusy = item.busyAction != null
                    val cardBorder = if (item.isDownloaded) colors.green.copy(alpha = 0.6f) else colors.line
                    val sizeLabel = if (item.diskBytes != null && item.diskBytes >= 1024L * 1024L) {
                        stringResource(
                            R.string.translator_mlkit_size_exact,
                            item.diskBytes.toDouble() / (1024.0 * 1024.0),
                        )
                    } else {
                        stringResource(R.string.translator_mlkit_size_approx, ESTIMATED_MLKIT_MODEL_MB)
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(colors.surface2)
                            .border(1.2.dp, cardBorder, RoundedCornerShape(14.dp))
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                    ) {
                        // Language code badge
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(if (item.isDownloaded) colors.greenDim else colors.surface3)
                                .border(
                                    1.dp,
                                    if (item.isDownloaded) colors.green.copy(alpha = 0.7f) else colors.line,
                                    RoundedCornerShape(10.dp),
                                ),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = item.spec.badgeCode,
                                color = if (item.isDownloaded) colors.green else colors.text2,
                                fontFamily = WatermelonMono,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        Spacer(Modifier.width(12.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(item.spec.titleResId),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                softWrap = true,
                            )
                            Spacer(Modifier.height(2.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
                                val statusText = when (item.busyAction) {
                                    MlKitBusyAction.DOWNLOADING -> stringResource(R.string.translator_mlkit_status_downloading)
                                    MlKitBusyAction.DELETING -> stringResource(R.string.translator_mlkit_status_deleting)
                                    null -> if (item.isDownloaded) {
                                        stringResource(R.string.translator_mlkit_status_downloaded)
                                    } else {
                                        stringResource(R.string.translator_mlkit_status_not_downloaded)
                                    }
                                }
                                val statusColor = when {
                                    item.busyAction != null -> colors.green
                                    item.isDownloaded -> colors.green
                                    else -> colors.text3
                                }
                                Text(
                                    text = statusText,
                                    color = statusColor,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.SemiBold,
                                )

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(3.dp),
                                ) {
                                    Icon(
                                        imageVector = Icons.Filled.SdCard,
                                        contentDescription = null,
                                        tint = colors.text3,
                                        modifier = Modifier.size(12.dp),
                                    )
                                    Text(
                                        text = sizeLabel,
                                        color = colors.text2,
                                        fontFamily = WatermelonMono,
                                        fontSize = 11.5.sp,
                                    )
                                }
                            }
                        }

                        Spacer(Modifier.width(8.dp))

                        // 1-tap Download / Delete button
                        val onAccentText = if (colors.green.luminance() > 0.45f) Color(0xFF0A0A0F) else Color.White
                        val actionBg = when {
                            isBusy -> colors.surface3
                            item.isDownloaded -> colors.redGlow
                            else -> colors.green
                        }
                        val actionBorder = when {
                            isBusy -> colors.line
                            item.isDownloaded -> colors.red.copy(alpha = 0.65f)
                            else -> colors.green
                        }
                        val actionContentColor = when {
                            isBusy -> colors.green
                            item.isDownloaded -> colors.red
                            else -> onAccentText
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(5.dp),
                            modifier = Modifier
                                .height(36.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(actionBg)
                                .border(1.dp, actionBorder, RoundedCornerShape(10.dp))
                                .clickable(enabled = !isBusy && !isRefreshing) {
                                    errorBanner = null
                                    val targetLangCode = item.spec.langCode
                                    val action = if (item.isDownloaded) MlKitBusyAction.DELETING else MlKitBusyAction.DOWNLOADING
                                    modelStates = modelStates.map {
                                        if (it.spec.langCode == targetLangCode) it.copy(busyAction = action) else it
                                    }
                                    scope.launch {
                                        try {
                                            withContext(Dispatchers.IO) {
                                                val manager = RemoteModelManager.getInstance()
                                                val model = TranslateRemoteModel.Builder(targetLangCode).build()
                                                if (action == MlKitBusyAction.DELETING) {
                                                    MlKitOnDeviceTranslateEngine.closeAll()
                                                    manager.deleteDownloadedModel(model).awaitResult()
                                                } else {
                                                    val conditions = DownloadConditions.Builder().build()
                                                    manager.download(model, conditions).awaitResult()
                                                }
                                            }
                                            reloadModelStates()
                                            onModelsChanged()
                                        } catch (t: Throwable) {
                                            errorBanner = context.getString(
                                                R.string.translator_mlkit_action_error,
                                                t.message?.takeIf { it.isNotBlank() } ?: t.javaClass.simpleName,
                                            )
                                            reloadModelStates()
                                        } finally {
                                            modelStates = modelStates.map {
                                                if (it.spec.langCode == targetLangCode) it.copy(busyAction = null) else it
                                            }
                                        }
                                    }
                                }
                                .padding(horizontal = 11.dp),
                        ) {
                            if (isBusy) {
                                CircularProgressIndicator(
                                    color = colors.green,
                                    strokeWidth = 2.dp,
                                    modifier = Modifier.size(15.dp),
                                )
                            } else {
                                Icon(
                                    imageVector = if (item.isDownloaded) Icons.Filled.DeleteOutline else Icons.Filled.Download,
                                    contentDescription = null,
                                    tint = actionContentColor,
                                    modifier = Modifier.size(16.dp),
                                )
                                Text(
                                    text = stringResource(
                                        if (item.isDownloaded) R.string.translator_mlkit_delete
                                        else R.string.translator_mlkit_download,
                                    ),
                                    color = actionContentColor,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }
                }
            }

            // Refresh status footer button
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(42.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                    .clickable(enabled = !isRefreshing) {
                        errorBanner = null
                        scope.launch {
                            reloadModelStates()
                            onModelsChanged()
                        }
                    }
                    .padding(horizontal = 14.dp),
            ) {
                if (isRefreshing) {
                    CircularProgressIndicator(
                        color = colors.green,
                        strokeWidth = 2.dp,
                        modifier = Modifier.size(16.dp),
                    )
                } else {
                    Icon(
                        imageVector = Icons.Filled.Refresh,
                        contentDescription = null,
                        tint = colors.green,
                        modifier = Modifier.size(17.dp),
                    )
                }
                Spacer(Modifier.width(8.dp))
                Text(
                    text = stringResource(R.string.translator_mlkit_refresh),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }
}

private suspend fun queryMlKitModelStates(context: Context): Map<String, Pair<Boolean, Long?>> =
    withContext(Dispatchers.IO) {
        val manager = RemoteModelManager.getInstance()
        val downloaded = manager.getDownloadedModels(TranslateRemoteModel::class.java).awaitResult()
        val downloadedCodes = downloaded.map { it.language.lowercase(Locale.ROOT) }.toSet()

        val diskSizes = scanMlKitModelDirSizes(context)
        MLKIT_MANAGED_MODELS.associate { spec ->
            val code = spec.langCode.lowercase(Locale.ROOT)
            val isDownloaded = code in downloadedCodes
            val sizeBytes = if (isDownloaded) diskSizes[code] else null
            spec.langCode to (isDownloaded to sizeBytes)
        }
    }

private fun scanMlKitModelDirSizes(context: Context): Map<String, Long> {
    val result = mutableMapOf<String, Long>()
    val roots = listOfNotNull(context.noBackupFilesDir, context.filesDir)
    val managedCodes = MLKIT_MANAGED_MODELS.map { it.langCode.lowercase(Locale.ROOT) }

    for (root in roots) {
        val mlkitDirs = root.listFiles()?.filter { file ->
            file.isDirectory && (
                file.name.contains("mlkit", ignoreCase = true) ||
                    file.name.contains("translate", ignoreCase = true)
                )
        }.orEmpty()

        for (dir in mlkitDirs) {
            dir.walkTopDown().maxDepth(4).forEach { entry ->
                if (!entry.isDirectory) return@forEach
                val lowerName = entry.name.lowercase(Locale.ROOT)
                for (code in managedCodes) {
                    val matchesCode = lowerName == code ||
                        lowerName.endsWith("_$code") ||
                        lowerName.startsWith("${code}_") ||
                        lowerName.contains("_${code}_") ||
                        lowerName.endsWith("-$code") ||
                        lowerName.startsWith("$code-")
                    if (matchesCode && (entry.absolutePath.contains("translate", ignoreCase = true) || dir.name.contains("translate", ignoreCase = true))) {
                        val size = directoryByteSize(entry)
                        if (size >= 1024L * 1024L) {
                            result[code] = maxOf(result[code] ?: 0L, size)
                        }
                    }
                }
            }
        }
    }
    return result
}

private fun directoryByteSize(dir: File): Long {
    var total = 0L
    dir.walkTopDown().forEach { f ->
        if (f.isFile) {
            total += f.length()
        }
    }
    return total
}
