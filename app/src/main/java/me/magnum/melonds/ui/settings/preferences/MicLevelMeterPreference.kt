package me.magnum.melonds.ui.settings.preferences

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.media.AudioFormat
import android.media.AudioRecord
import android.media.MediaRecorder
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.View
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import me.magnum.melonds.R
import me.magnum.melonds.extensions.isMicrophonePermissionGranted
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.math.abs
import kotlin.math.sqrt

class MicVuBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {

    var levelNormalized: Float = 0f
        set(value) {
            field = value.coerceIn(0f, 1f)
            invalidate()
        }

    var peakNormalized: Float = 0f
        set(value) {
            field = value.coerceIn(0f, 1f)
            invalidate()
        }

    var gateThresholdNormalized: Float = 0.25f
        set(value) {
            field = value.coerceIn(0f, 1f)
            invalidate()
        }

    var isGateEnabled: Boolean = true
        set(value) {
            field = value
            invalidate()
        }

    var isActive: Boolean = false
        set(value) {
            field = value
            invalidate()
        }

    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0x3364748B
        style = Paint.Style.FILL
    }
    private val segInactivePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0x2694A3B8
        style = Paint.Style.FILL
    }
    private val segGreenPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFF22C55E.toInt()
        style = Paint.Style.FILL
    }
    private val segYellowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFFF59E0B.toInt()
        style = Paint.Style.FILL
    }
    private val segRedPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFFEF4444.toInt()
        style = Paint.Style.FILL
    }
    private val segMutedPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFF64748B.toInt()
        style = Paint.Style.FILL
    }
    private val thresholdPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFFFFFFFF.toInt()
        strokeWidth = 3f
        style = Paint.Style.STROKE
    }
    private val rect = RectF()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0f || h <= 0f) return

        val radius = h * 0.35f
        rect.set(0f, 0f, w, h)
        canvas.drawRoundRect(rect, radius, radius, bgPaint)

        val segments = 24
        val pad = 4f
        val gap = 3f
        val usableW = (w - pad * 2f).coerceAtLeast(1f)
        val segW = ((usableW - gap * (segments - 1)) / segments).coerceAtLeast(2f)
        val top = pad
        val bottom = h - pad
        val segRadius = 2.5f

        val gatePassed = !isGateEnabled || levelNormalized >= gateThresholdNormalized

        for (i in 0 until segments) {
            val frac = (i + 0.5f) / segments.toFloat()
            val left = pad + i * (segW + gap)
            rect.set(left, top, left + segW, bottom)
            val lit = isActive && (frac <= levelNormalized || abs(frac - peakNormalized) < (0.6f / segments))
            val paint = if (!lit) {
                segInactivePaint
            } else if (!gatePassed) {
                segMutedPaint
            } else if (frac < 0.65f) {
                segGreenPaint
            } else if (frac < 0.85f) {
                segYellowPaint
            } else {
                segRedPaint
            }
            canvas.drawRoundRect(rect, segRadius, segRadius, paint)
        }

        if (isGateEnabled && gateThresholdNormalized > 0.01f) {
            val markerX = (pad + usableW * gateThresholdNormalized).coerceIn(pad, w - pad)
            canvas.drawLine(markerX, 1f, markerX, h - 1f, thresholdPaint)
        }
    }
}

class MicLevelMeterPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = androidx.preference.R.attr.preferenceStyle,
) : Preference(context, attrs, defStyleAttr) {

    var onPermissionRequired: (() -> Unit)? = null

    private var vuBarView: MicVuBarView? = null
    private val running = AtomicBoolean(false)
    private var captureThread: Thread? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    private var gateThresholdPercent: Int = 25
    private var gateEnabled: Boolean = true
    private var lastLevel: Float = 0f
    private var peakLevel: Float = 0f

    init {
        layoutResource = R.layout.preference_mic_vu_meter
        isPersistent = false
        summary = context.getString(R.string.mic_vu_meter_idle)
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        vuBarView = holder.findViewById(R.id.mic_vu_bar_view) as? MicVuBarView
        syncBarView()
    }

    override fun onClick() {
        super.onClick()
        if (running.get()) {
            stopListening()
        } else {
            if (!context.isMicrophonePermissionGranted()) {
                summary = context.getString(R.string.mic_vu_meter_no_permission)
                onPermissionRequired?.invoke()
                return
            }
            startListening()
        }
    }

    override fun onDetached() {
        stopListening()
        super.onDetached()
    }

    fun setGateSettings(enabled: Boolean, thresholdPercent: Int) {
        gateEnabled = enabled
        gateThresholdPercent = thresholdPercent.coerceIn(0, 100)
        syncBarView()
    }

    private fun syncBarView() {
        vuBarView?.apply {
            isActive = running.get()
            isGateEnabled = gateEnabled
            gateThresholdNormalized = gateThresholdPercent / 100f
            levelNormalized = if (running.get()) lastLevel else 0f
            peakNormalized = if (running.get()) peakLevel else 0f
        }
    }

    @SuppressLint("MissingPermission")
    fun startListening() {
        if (!running.compareAndSet(false, true)) return
        summary = context.getString(R.string.mic_vu_meter_active)
        peakLevel = 0f
        lastLevel = 0f
        syncBarView()

        val sampleRate = 16000
        val minBuf = AudioRecord.getMinBufferSize(
            sampleRate,
            AudioFormat.CHANNEL_IN_MONO,
            AudioFormat.ENCODING_PCM_16BIT,
        ).coerceAtLeast(1024)

        val thread = Thread({
            var recorder: AudioRecord? = null
            try {
                recorder = AudioRecord(
                    MediaRecorder.AudioSource.MIC,
                    sampleRate,
                    AudioFormat.CHANNEL_IN_MONO,
                    AudioFormat.ENCODING_PCM_16BIT,
                    minBuf * 2,
                )
                if (recorder.state != AudioRecord.STATE_INITIALIZED) {
                    mainHandler.post { stopListening() }
                    return@Thread
                }
                recorder.startRecording()
                val buf = ShortArray(512)
                var smoothed = 0f
                var localPeak = 0f
                while (running.get()) {
                    val read = recorder.read(buf, 0, buf.size)
                    if (read > 0) {
                        var sumSq = 0.0
                        for (i in 0 until read) {
                            val s = buf[i].toDouble()
                            sumSq += s * s
                        }
                        val rms = sqrt(sumSq / read.toDouble()).toFloat()
                        // Map native MicInputOboeCallback scale (0..~4500 RMS) into 0..1 meter bar
                        val normalized = (rms / 4200f).coerceIn(0f, 1f)
                        smoothed = smoothed * 0.45f + normalized * 0.55f
                        localPeak = maxOf(smoothed, localPeak * 0.94f)
                        val levelSnap = smoothed
                        val peakSnap = localPeak
                        mainHandler.post {
                            if (running.get()) {
                                lastLevel = levelSnap
                                peakLevel = peakSnap
                                syncBarView()
                            }
                        }
                    }
                }
            } catch (_: Throwable) {
                mainHandler.post { stopListening() }
            } finally {
                runCatching { recorder?.stop() }
                runCatching { recorder?.release() }
            }
        }, "StormMicVuMeter").apply {
            isDaemon = true
            start()
        }
        captureThread = thread
    }

    fun stopListening() {
        val wasRunning = running.getAndSet(false)
        captureThread?.interrupt()
        captureThread = null
        lastLevel = 0f
        peakLevel = 0f
        if (wasRunning) {
            mainHandler.post {
                summary = context.getString(R.string.mic_vu_meter_idle)
                syncBarView()
            }
        } else {
            syncBarView()
        }
    }
}
