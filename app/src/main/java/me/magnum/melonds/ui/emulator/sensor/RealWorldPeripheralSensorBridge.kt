package me.magnum.melonds.ui.emulator.sensor

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Build
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat
import me.magnum.melonds.MelonEmulator

/**
 * RealWorldPeripheralSensorBridge connects Android device hardware sensors to MelonDS Slot-2 peripherals:
 * 1. Sensor.TYPE_LIGHT: logarithmic conversion of 0..15000 lx into 0..10 Boktai solar bars.
 * 2. Sensor.TYPE_STEP_COUNTER: hardware pedometer tracking with Android 10+ ACTIVITY_RECOGNITION support.
 */
class RealWorldPeripheralSensorBridge(
    private val context: Context,
    private val onStepsAdded: ((delta: Int, total: Int) -> Unit)? = null,
) : SensorEventListener {

    val currentLux = mutableFloatStateOf(0f)
    val currentBars = mutableIntStateOf(0)
    val isLightSensorActive = mutableStateOf(false)
    val isPedometerActive = mutableStateOf(false)
    val totalStepsCount = mutableIntStateOf(0)

    private val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
    private val lightSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_LIGHT)
    private val stepCounterSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

    private var initialStepBaseline: Int? = null
    private var lastHardwareSteps: Int? = null

    fun hasActivityRecognitionPermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.ACTIVITY_RECOGNITION
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            true
        }
    }

    fun startLightSensor(): Boolean {
        if (lightSensor == null || sensorManager == null) return false
        if (isLightSensorActive.value) return true
        val registered = sensorManager.registerListener(
            this,
            lightSensor,
            SensorManager.SENSOR_DELAY_UI
        )
        isLightSensorActive.value = registered
        return registered
    }

    fun stopLightSensor() {
        if (!isLightSensorActive.value || sensorManager == null) return
        lightSensor?.let { sensorManager.unregisterListener(this, it) }
        isLightSensorActive.value = false
    }

    fun startStepCounter(): Boolean {
        if (stepCounterSensor == null || sensorManager == null) return false
        if (!hasActivityRecognitionPermission()) return false
        if (isPedometerActive.value) return true

        val registered = sensorManager.registerListener(
            this,
            stepCounterSensor,
            SensorManager.SENSOR_DELAY_UI
        )
        isPedometerActive.value = registered
        if (registered) {
            totalStepsCount.intValue = runCatching { MelonEmulator.getIrPedometerStepCount() }.getOrDefault(0)
        }
        return registered
    }

    fun stopStepCounter() {
        if (!isPedometerActive.value || sensorManager == null) return
        stepCounterSensor?.let { sensorManager.unregisterListener(this, it) }
        isPedometerActive.value = false
        initialStepBaseline = null
        lastHardwareSteps = null
    }

    fun stopAll() {
        stopLightSensor()
        stopStepCounter()
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null) return

        when (event.sensor.type) {
            Sensor.TYPE_LIGHT -> {
                if (event.values.isEmpty()) return
                val lux = event.values[0].coerceAtLeast(0f)
                currentLux.floatValue = lux
                val bars = luxToSolarBars(lux)
                currentBars.intValue = bars
                runCatching { MelonEmulator.setSolarSensorLightLevel(bars) }
            }
            Sensor.TYPE_STEP_COUNTER -> {
                if (event.values.isEmpty()) return
                val totalHardwareSteps = event.values[0].toInt()
                val prev = lastHardwareSteps
                if (prev == null) {
                    initialStepBaseline = totalHardwareSteps
                    lastHardwareSteps = totalHardwareSteps
                    return
                }
                val delta = (totalHardwareSteps - prev).coerceAtLeast(0)
                if (delta > 0) {
                    lastHardwareSteps = totalHardwareSteps
                    runCatching { MelonEmulator.addIrPedometerSteps(delta) }
                    val currentSteps = runCatching { MelonEmulator.getIrPedometerStepCount() }.getOrDefault(totalStepsCount.intValue + delta)
                    totalStepsCount.intValue = currentSteps
                    onStepsAdded?.invoke(delta, currentSteps)
                }
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}

    companion object {
        const val SOLAR_LEVEL_AUTO = -2

        /**
         * Logarithmic conversion of ambient lux (0..15000 lx) into 0..10 solar bar levels.
         */
        fun luxToSolarBars(lux: Float): Int {
            return when {
                lux < 2f -> 0
                lux < 15f -> 1
                lux < 50f -> 2
                lux < 150f -> 3
                lux < 400f -> 4
                lux < 1000f -> 5
                lux < 2500f -> 6
                lux < 5000f -> 7
                lux < 8500f -> 8
                lux < 12000f -> 9
                else -> 10
            }
        }
    }
}
