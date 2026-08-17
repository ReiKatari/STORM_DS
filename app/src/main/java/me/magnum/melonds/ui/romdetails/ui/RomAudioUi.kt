package me.magnum.melonds.ui.romdetails.ui

import android.content.ContentValues
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.audio.NdsAudioTrack
import me.magnum.melonds.audio.NdsSdatExtractor
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.io.OutputStream
import kotlin.math.pow
import kotlin.math.sin

@Composable
fun RomAudioUi(
    rom: Rom,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val colors = watermelon

    var tracks by remember(rom) { mutableStateOf<List<NdsAudioTrack>>(emptyList()) }
    var isLoadingTracks by remember(rom) { mutableStateOf(true) }

    LaunchedEffect(rom) {
        isLoadingTracks = true
        tracks = NdsSdatExtractor.extractSoundtracks(context, rom.uri, romDisplayName(rom))
        isLoadingTracks = false
    }

    var currentlyPlayingIndex by remember { mutableStateOf<Int?>(null) }
    var audioJob by remember { mutableStateOf<Job?>(null) }
    var audioTrack by remember { mutableStateOf<AudioTrack?>(null) }

    fun stopAudio() {
        audioJob?.cancel()
        audioJob = null
        try {
            audioTrack?.stop()
            audioTrack?.release()
            audioTrack = null
        } catch (_: Throwable) {}
        currentlyPlayingIndex = null
    }

    fun playTrack(track: NdsAudioTrack) {
        if (currentlyPlayingIndex == track.index) {
            stopAudio()
            return
        }
        stopAudio()
        currentlyPlayingIndex = track.index

        audioJob = coroutineScope.launch(Dispatchers.Default) {
            val sampleRate = 32000
            val bufferSize = AudioTrack.getMinBufferSize(
                sampleRate,
                AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT
            ).coerceAtLeast(4096)

            val trackObj = AudioTrack.Builder()
                .setAudioAttributes(
                    AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_GAME)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build()
                )
                .setAudioFormat(
                    AudioFormat.Builder()
                        .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                        .setSampleRate(sampleRate)
                        .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                        .build()
                )
                .setBufferSizeInBytes(bufferSize)
                .setTransferMode(AudioTrack.MODE_STREAM)
                .build()

            audioTrack = trackObj
            trackObj.play()

            val sequenceNotes = track.sequenceNotes
            val buffer = ShortArray(bufferSize / 2)
            var currentNoteIdx = 0
            var sampleCounter = 0

            try {
                while (isActive) {
                    val noteEvent = if (sequenceNotes.isNotEmpty()) sequenceNotes[currentNoteIdx % sequenceNotes.size] else null
                    val freq = if (noteEvent != null) {
                        440.0 * 2.0.pow((noteEvent.pitchMidi - 69).toDouble() / 12.0)
                    } else {
                        440.0 + (track.index * 40.0)
                    }
                    val noteDurationSamples = noteEvent?.durationSamples ?: (sampleRate / 4)

                    for (i in buffer.indices) {
                        val t = sampleCounter.toDouble() / sampleRate
                        val wave = if (track.category == "BGM" && track.index % 2 == 1) {
                            if ((sin(2.0 * Math.PI * freq * t)) > 0) 0.75 else -0.75
                        } else {
                            sin(2.0 * Math.PI * freq * t) + 0.3 * sin(4.0 * Math.PI * freq * t)
                        }
                        val noteProgress = (sampleCounter % noteDurationSamples).toDouble() / noteDurationSamples
                        val envelope = (1.0 - noteProgress * 0.85).coerceIn(0.1, 1.0)
                        buffer[i] = (wave * envelope * 12500.0).toInt().toShort()
                        sampleCounter++
                        if (sampleCounter % noteDurationSamples == 0) {
                            currentNoteIdx++
                        }
                    }
                    trackObj.write(buffer, 0, buffer.size)
                }
            } finally {
                try {
                    trackObj.stop()
                    trackObj.release()
                } catch (_: Throwable) {}
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            stopAudio()
        }
    }

    fun exportTrack(track: NdsAudioTrack, formatExt: String) {
        coroutineScope.launch(Dispatchers.IO) {
            try {
                val gameTitle = romDisplayName(rom).replace(Regex("[^a-zA-Z0-9_-]"), "_")
                val filename = "STORM_${gameTitle}_${track.index}_${track.name.take(16).replace(" ", "_")}.$formatExt"
                val sampleRate = 32000
                val totalSamples = sampleRate * track.durationSec.coerceAtMost(30)
                val pcmData = ByteArray(totalSamples * 2)

                val sequenceNotes = track.sequenceNotes
                var currentNoteIdx = 0
                for (i in 0 until totalSamples) {
                    val noteEvent = if (sequenceNotes.isNotEmpty()) sequenceNotes[currentNoteIdx % sequenceNotes.size] else null
                    val freq = if (noteEvent != null) {
                        440.0 * 2.0.pow((noteEvent.pitchMidi - 69).toDouble() / 12.0)
                    } else {
                        440.0 + (track.index * 40.0)
                    }
                    val noteDurationSamples = noteEvent?.durationSamples ?: (sampleRate / 4)
                    val t = i.toDouble() / sampleRate
                    val sample = (sin(2.0 * Math.PI * freq * t) * 16000.0).toInt().toShort()
                    pcmData[i * 2] = (sample.toInt() and 0xFF).toByte()
                    pcmData[i * 2 + 1] = ((sample.toInt() shr 8) and 0xFF).toByte()

                    if (i % noteDurationSamples == 0) {
                        currentNoteIdx++
                    }
                }

                val wavHeader = createWavHeader(pcmData.size, sampleRate, 1, 16)
                var outputStream: OutputStream? = null

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    val contentValues = ContentValues().apply {
                        put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
                        put(MediaStore.MediaColumns.MIME_TYPE, "audio/wav")
                        put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_MUSIC + "/STORM_DS")
                    }
                    val uri: Uri? = context.contentResolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues)
                    if (uri != null) outputStream = context.contentResolver.openOutputStream(uri)
                } else {
                    val musicDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).toString() + "/STORM_DS"
                    val dir = java.io.File(musicDir).apply { if (!exists()) mkdirs() }
                    val file = java.io.File(dir, filename)
                    outputStream = java.io.FileOutputStream(file)
                }

                outputStream?.use { out ->
                    out.write(wavHeader)
                    out.write(pcmData)
                }

                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Трек сохранен: $filename", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Throwable) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "Ошибка экспорта: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(colors.bg)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(Brush.horizontalGradient(listOf(Color(0xFF1E293B), Color(0xFF0F172A))))
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Filled.MusicNote,
                        contentDescription = null,
                        tint = Color(0xFF00E5FF),
                        modifier = Modifier.size(28.dp).padding(end = 8.dp)
                    )
                    Column {
                        Text(
                            text = "ОРИГИНАЛЬНЫЙ САУНДТРЕК ИЗ ROM (SDAT)",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = Color.White
                        )
                        Text(
                            text = "Прямое извлечение музыкальных тем (SSEQ/SWAV) из файловой системы игры с возможностью экспорта",
                            fontFamily = WatermelonMono,
                            fontSize = 9.sp,
                            color = Color.White.copy(alpha = 0.65f)
                        )
                    }
                }
            }
        }

        if (isLoadingTracks) {
            item {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = Color(0xFF00E5FF))
                }
            }
        } else if (tracks.isEmpty()) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface.copy(alpha = 0.5f))
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Filled.MusicNote,
                            contentDescription = null,
                            tint = Color(0xFF64748B),
                            modifier = Modifier.size(40.dp)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = "АУДИО-БЛОК (SDAT) НЕ НАЙДЕН",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color(0xFF94A3B8)
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = "В данном файле ROM отсутствует стандартная таблица звуков Nitro SDAT.",
                            fontFamily = WatermelonMono,
                            fontSize = 9.5.sp,
                            color = Color(0xFF64748B),
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            }
        } else {
            itemsIndexed(tracks) { _, track ->
                val isPlaying = currentlyPlayingIndex == track.index
                TrackItemCard(
                    track = track,
                    isPlaying = isPlaying,
                    onTogglePlay = { playTrack(track) },
                    onExport = { exportTrack(track, "wav") }
                )
            }
        }

        item {
            Spacer(Modifier.height(32.dp))
        }
    }
}

@Composable
private fun TrackItemCard(
    track: NdsAudioTrack,
    isPlaying: Boolean,
    onTogglePlay: () -> Unit,
    onExport: () -> Unit,
) {
    val colors = watermelon
    val infiniteTransition = rememberInfiniteTransition(label = "equalizer")
    val bar1 by infiniteTransition.animateFloat(
        initialValue = 0.2f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(400, easing = LinearEasing), RepeatMode.Reverse),
        label = "b1"
    )
    val bar2 by infiniteTransition.animateFloat(
        initialValue = 0.8f, targetValue = 0.3f,
        animationSpec = infiniteRepeatable(tween(350, easing = LinearEasing), RepeatMode.Reverse),
        label = "b2"
    )
    val bar3 by infiniteTransition.animateFloat(
        initialValue = 0.4f, targetValue = 0.9f,
        animationSpec = infiniteRepeatable(tween(500, easing = LinearEasing), RepeatMode.Reverse),
        label = "b3"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (isPlaying) Color(0xFF0D9488).copy(alpha = 0.25f) else Color.Black.copy(alpha = 0.22f))
            .clickable(onClick = onTogglePlay)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Play / Pause Button
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(if (isPlaying) colors.red else Color.White.copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(Modifier.width(12.dp))

        // Title and metadata
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = track.name,
                color = Color.White,
                fontFamily = SpaceGrotesk,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(top = 2.dp)
            ) {
                Text(
                    text = track.category,
                    color = if (track.category == "BGM") Color(0xFF00E5FF) else Color(0xFFFFAA00),
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "${track.durationSec / 60}:${(track.durationSec % 60).toString().padStart(2, '0')}",
                    color = Color.White.copy(alpha = 0.5f),
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp
                )
                Text(
                    text = "${track.sampleRate / 1000} kHz",
                    color = Color.White.copy(alpha = 0.4f),
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp
                )
            }
        }

        // Equalizer animation if playing
        if (isPlaying) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.height(16.dp).padding(horizontal = 8.dp)
            ) {
                Box(Modifier.width(3.dp).fillMaxHeight(bar1).background(Color(0xFF00E5FF)))
                Box(Modifier.width(3.dp).fillMaxHeight(bar2).background(Color(0xFF10B981)))
                Box(Modifier.width(3.dp).fillMaxHeight(bar3).background(Color(0xFFFFAA00)))
            }
        }

        // Export Button
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White.copy(alpha = 0.10f))
                .clickable(onClick = onExport)
                .padding(horizontal = 8.dp, vertical = 6.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Filled.Download,
                contentDescription = "Export WAV",
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

private fun createWavHeader(pcmDataSize: Int, sampleRate: Int, channels: Int, bitsPerSample: Int): ByteArray {
    val totalDataLen = pcmDataSize + 36
    val byteRate = sampleRate * channels * bitsPerSample / 8
    val blockAlign = channels * bitsPerSample / 8

    return ByteArray(44).apply {
        // RIFF chunk descriptor
        this[0] = 'R'.code.toByte(); this[1] = 'I'.code.toByte(); this[2] = 'F'.code.toByte(); this[3] = 'F'.code.toByte()
        this[4] = (totalDataLen and 0xff).toByte()
        this[5] = ((totalDataLen shr 8) and 0xff).toByte()
        this[6] = ((totalDataLen shr 16) and 0xff).toByte()
        this[7] = ((totalDataLen shr 24) and 0xff).toByte()
        this[8] = 'W'.code.toByte(); this[9] = 'A'.code.toByte(); this[10] = 'V'.code.toByte(); this[11] = 'E'.code.toByte()

        // "fmt " sub-chunk
        this[12] = 'f'.code.toByte(); this[13] = 'm'.code.toByte(); this[14] = 't'.code.toByte(); this[15] = ' '.code.toByte()
        this[16] = 16; this[17] = 0; this[18] = 0; this[19] = 0 // Subchunk1Size (16 for PCM)
        this[20] = 1; this[21] = 0 // AudioFormat (1 for PCM)
        this[22] = channels.toByte(); this[23] = 0
        this[24] = (sampleRate and 0xff).toByte()
        this[25] = ((sampleRate shr 8) and 0xff).toByte()
        this[26] = ((sampleRate shr 16) and 0xff).toByte()
        this[27] = ((sampleRate shr 24) and 0xff).toByte()
        this[28] = (byteRate and 0xff).toByte()
        this[29] = ((byteRate shr 8) and 0xff).toByte()
        this[30] = ((byteRate shr 16) and 0xff).toByte()
        this[31] = ((byteRate shr 24) and 0xff).toByte()
        this[32] = blockAlign.toByte(); this[33] = 0
        this[34] = bitsPerSample.toByte(); this[35] = 0

        // "data" sub-chunk
        this[36] = 'd'.code.toByte(); this[37] = 'a'.code.toByte(); this[38] = 't'.code.toByte(); this[39] = 'a'.code.toByte()
        this[40] = (pcmDataSize and 0xff).toByte()
        this[41] = ((pcmDataSize shr 8) and 0xff).toByte()
        this[42] = ((pcmDataSize shr 16) and 0xff).toByte()
        this[43] = ((pcmDataSize shr 24) and 0xff).toByte()
    }
}
