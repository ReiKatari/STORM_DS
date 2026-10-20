package me.magnum.melonds.ui.emulator.input

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.domain.model.Input
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sign

/**
 * High-Precision Motion & Gyroscope Engine for STORM DS.
 * Features:
 * - Ultra-responsive 6-DOF Gyroscope tracking (SENSOR_DELAY_GAME / FASTEST)
 * - Exponential Moving Average (EMA) jitter suppression filter
 * - Real-time stationary bias auto-calibration & drift compensation
 * - Non-linear acceleration curve for micro-aiming precision & fast flick-turns
 * - Full DS Touchscreen Stylus Aiming (Metroid Prime Hunters, CoD, Dementium, Moon)
 * - Dynamic D-Pad tilt steering (Mario Kart DS, Sonic Rush)
 * - Slot-2 Analog hardware sensor mapping
 */
class MotionSensorManager(
    context: Context,
    private val onMotionTilt: ((x: Float, y: Float, z: Float) -> Unit)? = null,
    private val onDirectionalTilt: ((input: Input, pressed: Boolean) -> Unit)? = null,
    private val onShakeDetected: ((active: Boolean) -> Unit)? = null
) : SensorEventListener {

    enum class GyroMode {
        OFF,
        TOUCH_AIM,      // Virtual Stylus cursor for FPS games (Metroid, CoD, etc.)
        DPAD_STEER,     // Tilt steering (Mario Kart DS)
        SLOT2_ANALOG    // GBA slot-2 motion sensor
    }

    // Configurable parameters
    var gyroMode: GyroMode = GyroMode.OFF
    var shakeMicEnabled: Boolean = false
    var threeDParallaxEnabled: Boolean = false
    var motionPakEnabled: Boolean = false
    var solarSensorAutoEnabled: Boolean = true
    var pedometerAutoEnabled: Boolean = true
    var gyroSensitivityX: Float = 1.25f
    var gyroSensitivityY: Float = 1.25f
    var invertX: Boolean = false
    var invertY: Boolean = false
    var deadzoneX: Float = 0.015f
    var deadzoneY: Float = 0.015f
    var deadzone: Float = 0.015f
    var accelerationPower: Float = 1.4f
    var gyroAimButtonRequired: Boolean = false
    var isAimButtonPressed: Boolean = false
    private var isShakeMicActive: Boolean = false
    private var lastShakeTimeMs: Long = 0L

    private val sensorManager = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
    private val accelerometer = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    private val gyroscope = sensorManager?.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
    private val lightSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_LIGHT)
    private val stepCounterSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

    private var isListening = false
    private var hasTiltCenter = false
    private var tiltCenterAx = 0f
    private var tiltCenterAy = 0f
    private var smoothedTiltX = 0f
    private var smoothedTiltY = 0f
    private var lastGyroRawX = 0f
    private var lastGyroRawY = 0f
    private var lastGyroRawZ = 0f
    private var lastStepCounterBaseline: Int? = null

    // EMA Filter state (low-pass smoothing)
    private val alphaEMA = 0.65f
    private var filteredGyroX = 0f
    private var filteredGyroY = 0f
    private var filteredGyroZ = 0f

    // Auto-calibration / Drift compensation
    private var gyroBiasX = 0f
    private var gyroBiasY = 0f
    private var gyroBiasZ = 0f
    private var stationarySamples = 0
    private val maxStationarySamples = 80
    private var lastAccel = floatArrayOf(0f, 0f, 0f)

    // Virtual Touchscreen Cursor (NDS bottom screen: 256x192)
    private var virtualTouchX = 128f
    private var virtualTouchY = 96f
    private var isTouchingScreen = false

    // D-Pad tracking
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
        lightSensor?.let {
            runCatching { sensorManager?.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL) }
        }
        stepCounterSensor?.let {
            runCatching { sensorManager?.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL) }
        }
        isListening = true
    }

    fun stopListening() {
        if (!isListening || sensorManager == null) return
        sensorManager.unregisterListener(this)
        isListening = false
        if (isTouchingScreen) {
            MelonEmulator.onScreenRelease()
            isTouchingScreen = false
        }
        if (isShakeMicActive) {
            isShakeMicActive = false
            onShakeDetected?.invoke(false)
        }
        resetDirectionalTilt()
    }

    fun recenterTouchCursor() {
        virtualTouchX = 128f
        virtualTouchY = 96f
    }

    fun calibrateCenter() {
        recenterTouchCursor()
        filteredGyroX = 0f
        filteredGyroY = 0f
        filteredGyroZ = 0f
        tiltCenterAx = lastAccel[0]
        tiltCenterAy = lastAccel[1]
        hasTiltCenter = true
        smoothedTiltX = 0f
        smoothedTiltY = 0f
        runCatching { MelonEmulator.setVulkanGyroTilt(0f, 0f) }
        if (isTouchingScreen) {
            MelonEmulator.onScreenRelease()
            isTouchingScreen = false
        }
    }

    private fun resetDirectionalTilt() {
        if (lastLeft) { onDirectionalTilt?.invoke(Input.LEFT, false); lastLeft = false }
        if (lastRight) { onDirectionalTilt?.invoke(Input.RIGHT, false); lastRight = false }
        if (lastUp) { onDirectionalTilt?.invoke(Input.UP, false); lastUp = false }
        if (lastDown) { onDirectionalTilt?.invoke(Input.DOWN, false); lastDown = false }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null) return

        when (event.sensor.type) {
            Sensor.TYPE_ACCELEROMETER -> processAccelerometer(event.values)
            Sensor.TYPE_GYROSCOPE -> processGyroscope(event.values)
            Sensor.TYPE_LIGHT -> processLightSensor(event.values)
            Sensor.TYPE_STEP_COUNTER -> processStepCounter(event.values)
        }
    }

    private fun processLightSensor(values: FloatArray) {
        if (!solarSensorAutoEnabled || values.isEmpty()) return
        val lux = values[0].coerceAtLeast(0f)
        val bars = when {
            lux < 5f -> 0
            lux < 25f -> 1
            lux < 60f -> 2
            lux < 150f -> 3
            lux < 350f -> 4
            lux < 750f -> 5
            lux < 1500f -> 6
            lux < 3000f -> 7
            lux < 6000f -> 8
            lux < 12000f -> 9
            else -> 10
        }
        runCatching { MelonEmulator.setSolarSensorLightLevel(bars) }
    }

    private fun processStepCounter(values: FloatArray) {
        if (!pedometerAutoEnabled || values.isEmpty()) return
        val totalSteps = values[0].toInt()
        val prev = lastStepCounterBaseline
        if (prev != null && totalSteps > prev) {
            val delta = (totalSteps - prev).coerceIn(1, 500)
            runCatching { MelonEmulator.addIrPedometerSteps(delta) }
        }
        lastStepCounterBaseline = totalSteps
    }

    private fun processAccelerometer(values: FloatArray) {
        val ax = values[0]
        val ay = values[1]
        val az = values[2]

        onMotionTilt?.invoke(ax, ay, az)

        if (!hasTiltCenter) {
            tiltCenterAx = ax
            tiltCenterAy = ay
            hasTiltCenter = true
        } else {
            // Gently adapt center over long periods so holding posture stays centered
            tiltCenterAx += (ax - tiltCenterAx) * 0.004f
            tiltCenterAy += (ay - tiltCenterAy) * 0.004f
        }

        if (threeDParallaxEnabled) {
            val relX = ((ax - tiltCenterAx) / 4.5f).coerceIn(-1f, 1f)
            val relY = ((ay - tiltCenterAy) / 4.5f).coerceIn(-1f, 1f)
            smoothedTiltX = smoothedTiltX * 0.78f + (-relX) * 0.22f
            smoothedTiltY = smoothedTiltY * 0.78f + relY * 0.22f
            runCatching { MelonEmulator.setVulkanGyroTilt(smoothedTiltX, smoothedTiltY) }
        }

        if (motionPakEnabled) {
            runCatching {
                MelonEmulator.setHardwareMotionState(
                    ax, ay, az,
                    lastGyroRawX, lastGyroRawY, lastGyroRawZ
                )
            }
        }

        if (shakeMicEnabled) {
            val magnitude = kotlin.math.sqrt(ax * ax + ay * ay + az * az)
            val deltaFromGravity = abs(magnitude - SensorManager.GRAVITY_EARTH)
            val now = android.os.SystemClock.uptimeMillis()
            if (deltaFromGravity > 10.5f) {
                lastShakeTimeMs = now
                if (!isShakeMicActive) {
                    isShakeMicActive = true
                    onShakeDetected?.invoke(true)
                }
            } else if (isShakeMicActive && now - lastShakeTimeMs > 600L) {
                isShakeMicActive = false
                onShakeDetected?.invoke(false)
            }
        } else if (isShakeMicActive) {
            isShakeMicActive = false
            onShakeDetected?.invoke(false)
        }

        // Stationary detection for automatic zero-drift calibration
        val motionDelta = abs(ax - lastAccel[0]) + abs(ay - lastAccel[1]) + abs(az - lastAccel[2])
        if (motionDelta < 0.08f) {
            stationarySamples++
        } else {
            stationarySamples = 0
        }
        lastAccel[0] = ax
        lastAccel[1] = ay
        lastAccel[2] = az
    }

    private fun processGyroscope(values: FloatArray) {
        val gx = values[0]
        val gy = values[1]
        val gz = values[2]
        lastGyroRawX = gx - gyroBiasX
        lastGyroRawY = gy - gyroBiasY
        lastGyroRawZ = gz - gyroBiasZ
        if (motionPakEnabled) {
            runCatching {
                MelonEmulator.setHardwareMotionState(
                    lastAccel[0], lastAccel[1], lastAccel[2],
                    lastGyroRawX, lastGyroRawY, lastGyroRawZ
                )
            }
        }
        if (gyroMode == GyroMode.OFF) return

        // 1. Continuous stationary drift compensation
        if (stationarySamples > 15) {
            gyroBiasX += (gx - gyroBiasX) * 0.02f
            gyroBiasY += (gy - gyroBiasY) * 0.02f
            gyroBiasZ += (gz - gyroBiasZ) * 0.02f
            if (stationarySamples > maxStationarySamples) stationarySamples = maxStationarySamples
            return // Ignore output while stationary to prevent microscopic drift
        }

        var rawX = gx - gyroBiasX
        var rawY = gy - gyroBiasY
        var rawZ = gz - gyroBiasZ

        // 2. Separate X/Y Deadzones
        val effDeadzoneX = if (deadzoneX > 0f) deadzoneX else deadzone
        val effDeadzoneY = if (deadzoneY > 0f) deadzoneY else deadzone
        if (abs(rawX) < effDeadzoneX) rawX = 0f
        if (abs(rawY) < effDeadzoneY) rawY = 0f
        if (abs(rawZ) < effDeadzoneX) rawZ = 0f

        // 3. Exponential Moving Average (EMA) filtering
        filteredGyroX = alphaEMA * rawX + (1f - alphaEMA) * filteredGyroX
        filteredGyroY = alphaEMA * rawY + (1f - alphaEMA) * filteredGyroY
        filteredGyroZ = alphaEMA * rawZ + (1f - alphaEMA) * filteredGyroZ

        if (gyroAimButtonRequired && !isAimButtonPressed) {
            if (isTouchingScreen) {
                MelonEmulator.onScreenRelease()
                isTouchingScreen = false
            }
            return
        }

        // 4. Non-linear velocity scaling (micro-aiming + rapid turn)
        val speedX = sign(filteredGyroX) * abs(filteredGyroX).pow(accelerationPower) * gyroSensitivityX * 12f
        val speedY = sign(filteredGyroY) * abs(filteredGyroY).pow(accelerationPower) * gyroSensitivityY * 12f

        val deltaX = if (invertX) -speedY else speedY
        val deltaY = if (invertY) -speedX else speedX

        when (gyroMode) {
            GyroMode.TOUCH_AIM -> {
                // Map pitch/roll deltas to DS touch screen bounds
                virtualTouchX = (virtualTouchX - deltaX).coerceIn(0f, 255f)
                virtualTouchY = (virtualTouchY - deltaY).coerceIn(0f, 191f)

                if (abs(deltaX) > 0.02f || abs(deltaY) > 0.02f) {
                    MelonEmulator.onScreenTouch(virtualTouchX.toInt(), virtualTouchY.toInt())
                    isTouchingScreen = true
                }
            }
            GyroMode.DPAD_STEER -> {
                val steerThreshold = 1.2f
                val left = deltaX < -steerThreshold
                val right = deltaX > steerThreshold
                val up = deltaY < -steerThreshold
                val down = deltaY > steerThreshold

                if (left != lastLeft) {
                    lastLeft = left
                    onDirectionalTilt?.invoke(Input.LEFT, left)
                    if (left) MelonEmulator.onInputDown(Input.LEFT) else MelonEmulator.onInputUp(Input.LEFT)
                }
                if (right != lastRight) {
                    lastRight = right
                    onDirectionalTilt?.invoke(Input.RIGHT, right)
                    if (right) MelonEmulator.onInputDown(Input.RIGHT) else MelonEmulator.onInputUp(Input.RIGHT)
                }
                if (up != lastUp) {
                    lastUp = up
                    onDirectionalTilt?.invoke(Input.UP, up)
                    if (up) MelonEmulator.onInputDown(Input.UP) else MelonEmulator.onInputUp(Input.UP)
                }
                if (down != lastDown) {
                    lastDown = down
                    onDirectionalTilt?.invoke(Input.DOWN, down)
                    if (down) MelonEmulator.onInputDown(Input.DOWN) else MelonEmulator.onInputUp(Input.DOWN)
                }
            }
            GyroMode.SLOT2_ANALOG -> {
                val analogX = (deltaX / 10f).coerceIn(-1f, 1f)
                val analogY = (deltaY / 10f).coerceIn(-1f, 1f)
                MelonEmulator.setSlot2AnalogInput(analogX, analogY)
            }
            GyroMode.OFF -> {}
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}
