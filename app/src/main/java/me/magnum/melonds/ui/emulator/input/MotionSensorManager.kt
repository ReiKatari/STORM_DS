package me.magnum.melonds.ui.emulator.input

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import me.magnum.melonds.domain.model.Input

/**
 * Smartphone Motion & Gyroscope Sensor Manager for NDS Cartridges & Tilt Control.
 * Bridges phone tilt / rotation into NDS hardware tilt and virtual stick / D-Pad inputs.
 */
class MotionSensorManager(
    private val context: Context,
    private val onMotionTilt: (x: Float, y: Float, z: Float) -> Unit,
    private val onDirectionalTilt: (input: Input, pressed: Boolean) -> Unit
) : SensorEventListener {

    private val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
    private val accelerometer = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    private val gyroscope = sensorManager?.getDefaultSensor(Sensor.TYPE_GYROSCOPE)

    private var isListening = false
    private var lastLeft = false
    private var lastRight = false
    private var lastUp = false
    private var lastDown = false

    fun startListening() {
        if (isListening || sensorManager == null) return
        accelerometer?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME)
        }
        gyroscope?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_GAME)
        }
        isListening = true
    }

    fun stopListening() {
        if (!isListening || sensorManager == null) return
        sensorManager.unregisterListener(this)
        isListening = false
        resetDirectionalTilt()
    }

    private fun resetDirectionalTilt() {
        if (lastLeft) { onDirectionalTilt(Input.LEFT, false); lastLeft = false }
        if (lastRight) { onDirectionalTilt(Input.RIGHT, false); lastRight = false }
        if (lastUp) { onDirectionalTilt(Input.UP, false); lastUp = false }
        if (lastDown) { onDirectionalTilt(Input.DOWN, false); lastDown = false }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null) return

        if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            val ax = event.values[0]
            val ay = event.values[1]
            val az = event.values[2]

            onMotionTilt(ax, ay, az)

            // Tilt thresholds (deadzone ~ 2.5 m/s^2)
            val tiltThreshold = 2.8f

            val left = ax > tiltThreshold
            val right = ax < -tiltThreshold
            val up = ay < -tiltThreshold
            val down = ay > tiltThreshold

            if (left != lastLeft) {
                lastLeft = left
                onDirectionalTilt(Input.LEFT, left)
            }
            if (right != lastRight) {
                lastRight = right
                onDirectionalTilt(Input.RIGHT, right)
            }
            if (up != lastUp) {
                lastUp = up
                onDirectionalTilt(Input.UP, up)
            }
            if (down != lastDown) {
                lastDown = down
                onDirectionalTilt(Input.DOWN, down)
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}
