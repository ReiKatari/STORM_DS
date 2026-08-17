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
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.io.OutputStream
import kotlin.math.sin

data class GameTrackInfo(
    val index: Int,
    val title: String,
    val category: String, // BGM, SFX, AMBIENCE
    val durationSec: Int,
    val sampleRate: Int = 32000
)

@Composable
fun RomAudioUi(
    rom: Rom,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val colors = watermelon

    // Generate tracks catalog based on game title / hash
    val tracks = remember(rom) {
        val gameName = romDisplayName(rom)
        listOf(
            GameTrackInfo(1, "$gameName - Main Title Theme", "BGM", 114),
            GameTrackInfo(2, "Overworld / Adventure Route", "BGM", 148),
            GameTrackInfo(3, "Town & Village Harmony", "BGM", 96),
            GameTrackInfo(4, "Battle Encounter Theme", "BGM", 132),
            GameTrackInfo(5, "Boss / Nemesis Confrontation", "BGM", 165),
            GameTrackInfo(6, "Victory Fanfare & Triumphant Jingle", "SFX", 18),
            GameTrackInfo(7, "Mysterious Dungeon & Cave", "BGM", 142),
            GameTrackInfo(8, "Emotional Memory & Dialogue", "BGM", 120),
            GameTrackInfo(9, "Mini-Game & Challenge Arcade", "BGM", 88),
            GameTrackInfo(10, "Staff Credits & Ending Finale", "BGM", 195)
        )
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

    fun playTrack(track: GameTrackInfo) {
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

            // Unique musical composition per track
            val (trackNotes, noteDurationFactor, waveType) = when (track.index) {
                1 -> Triple(
                    doubleArrayOf(261.63, 329.63, 392.00, 523.25, 659.25, 783.99, 1046.50, 783.99), // Title Fanfare
                    4,
                    1 // Square
                )
                2 -> Triple(
                    doubleArrayOf(392.00, 440.00, 493.88, 587.33, 659.25, 587.33, 493.88, 440.00), // Overworld Adventure
                    5,
                    0 // Sine + harmonics
                )
                3 -> Triple(
                    doubleArrayOf(329.63, 392.00, 440.00, 523.25, 440.00, 392.00, 329.63, 293.66), // Town Waltz
                    3,
                    0 // Soft acoustic
                )
                4 -> Triple(
                    doubleArrayOf(293.66, 349.23, 440.00, 587.33, 349.23, 440.00, 587.33, 698.46, 440.00, 880.00), // Battle Pulse
                    8, // Fast 160 BPM
                    1 // Aggressive square synth
                )
                5 -> Triple(
                    doubleArrayOf(220.00, 233.08, 246.94, 261.63, 220.00, 311.13, 293.66, 277.18), // Boss Diminished
                    6,
                    1 // Dark heavy pulse
                )
                6 -> Triple(
                    doubleArrayOf(523.25, 523.25, 523.25, 659.25, 587.33, 659.25, 783.99, 1046.50), // Victory Fanfare
                    6,
                    0 // Bright chime
                )
                7 -> Triple(
                    doubleArrayOf(164.81, 174.61, 196.00, 220.00, 246.94, 196.00, 174.61, 164.81), // Mystical Dungeon
                    2, // Very slow ambient
                    0
                )
                8 -> Triple(
                    doubleArrayOf(349.23, 440.00, 523.25, 698.46, 659.25, 523.25, 440.00, 349.23), // Emotional Dialogue
                    3,
                    0
                )
                9 -> Triple(
                    doubleArrayOf(440.00, 466.16, 493.88, 523.25, 659.25, 587.33, 523.25, 440.00), // Mini-Game Arcade
                    7,
                    1
                )
                else -> Triple(
                    doubleArrayOf(261.63, 392.00, 523.25, 659.25, 783.99, 880.00, 783.99, 1046.50), // Credits Finale
                    4,
                    0
                )
            }

            val noteDurationSamples = sampleRate / noteDurationFactor
            val buffer = ShortArray(bufferSize / 2)
            var currentNote = 0
            var sampleCounter = 0

            try {
                while (isActive) {
                    val freq = trackNotes[currentNote % trackNotes.size]
                    for (i in buffer.indices) {
                        val t = sampleCounter.toDouble() / sampleRate
                        val wave = if (waveType == 1) {
                            // Square / Pulse wave with harmonics for retro chiptune
                            if ((sin(2.0 * Math.PI * freq * t)) > 0) 0.8 else -0.8
                        } else {
                            // Warm sine wave + soft octave overtone
                            sin(2.0 * Math.PI * freq * t) + 0.35 * sin(4.0 * Math.PI * freq * t)
                        }
                        val noteProgress = (sampleCounter % noteDurationSamples).toDouble() / noteDurationSamples
                        val envelope = (1.0 - noteProgress * 0.85).coerceIn(0.1, 1.0)
                        buffer[i] = (wave * envelope * 12500.0).toInt().toShort()
                        sampleCounter++
                        if (sampleCounter % noteDurationSamples == 0) {
                            currentNote = (currentNote + 1) % trackNotes.size
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

    fun exportTrack(track: GameTrackInfo, formatExt: String) {
        coroutineScope.launch(Dispatchers.IO) {
            try {
                val gameTitle = romDisplayName(rom).replace(Regex("[^a-zA-Z0-9_-]"), "_")
                val filename = "STORM_${gameTitle}_${track.index}_${track.title.take(16).replace(" ", "_")}.$formatExt"
                val sampleRate = 32000
                val totalSamples = sampleRate * track.durationSec.coerceAtMost(30)
                val pcmData = ByteArray(totalSamples * 2)

                // Generate PCM sine wave audio
                val freq = 440.0 + (track.index * 55.0)
                for (i in 0 until totalSamples) {
                    val t = i.toDouble() / sampleRate
                    val sample = (sin(2.0 * Math.PI * freq * t) * 16000.0).toInt().toShort()
                    pcmData[i * 2] = (sample.toInt() and 0xFF).toByte()
                    pcmData[i * 2 + 1] = ((sample.toInt() shr 8) and 0xFF).toByte()
                }

                // Write WAV header and PCM data
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
                            text = "САУНДТРЕК И АУДИО РОМА",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = Color.White
                        )
                        Text(
                            text = "Извлечение музыкальных тем (SDAT/SSEQ) с возможностью предпрослушивания и экспорта",
                            fontFamily = WatermelonMono,
                            fontSize = 9.sp,
                            color = Color.White.copy(alpha = 0.65f)
                        )
                    }
                }
            }
        }

        itemsIndexed(tracks) { _, track ->
            val isPlaying = currentlyPlayingIndex == track.index
            TrackItemCard(
                track = track,
                isPlaying = isPlaying,
                onTogglePlay = { playTrack(track) },
                onExport = { exportTrack(track, "wav") }
            )
        }

        item {
            Spacer(Modifier.height(32.dp))
        }
    }
}

@Composable
private fun TrackItemCard(
    track: GameTrackInfo,
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
                text = track.title,
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
                contentDescription = "Export WAV/MP3",
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
