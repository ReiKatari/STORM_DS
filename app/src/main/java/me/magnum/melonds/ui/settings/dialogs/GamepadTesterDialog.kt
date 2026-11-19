package me.magnum.melonds.ui.settings.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color as AndroidColor
import android.graphics.drawable.ColorDrawable
import android.view.InputDevice
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.ViewGroup
import android.view.Window
import androidx.activity.ComponentDialog
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import java.util.Locale
import kotlin.math.hypot

private data class GamepadTesterState(
    val deviceName: String? = null,
    val leftX: Float = 0f,
    val leftY: Float = 0f,
    val rightX: Float = 0f,
    val rightY: Float = 0f,
    val l2: Float = 0f,
    val r2: Float = 0f,
    val hatX: Float = 0f,
    val hatY: Float = 0f,
    val pressedButtons: Set<String> = emptySet(),
)

fun showGamepadTesterDialog(
    context: Context,
    deadzonePercent: Int,
): Dialog {
    val state = mutableStateOf(GamepadTesterState(deviceName = findFirstConnectedGamepadName()))

    val dialog = object : ComponentDialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen) {
        override fun dispatchKeyEvent(event: KeyEvent): Boolean {
            if (event.keyCode == KeyEvent.KEYCODE_BACK) {
                return super.dispatchKeyEvent(event)
            }
            val label = mapKeyCodeToLabel(event.keyCode)
            if (label != null) {
                val devName = event.device?.name?.takeIf { it.isNotBlank() } ?: state.value.deviceName
                val current = state.value
                val nextButtons = when (event.action) {
                    KeyEvent.ACTION_DOWN -> current.pressedButtons + label
                    KeyEvent.ACTION_UP -> current.pressedButtons - label
                    else -> current.pressedButtons
                }
                state.value = current.copy(
                    deviceName = devName,
                    pressedButtons = nextButtons,
                )
                return true
            }
            return super.dispatchKeyEvent(event)
        }

        override fun dispatchGenericMotionEvent(ev: MotionEvent): Boolean {
            val isJoystick = (ev.source and InputDevice.SOURCE_JOYSTICK) == InputDevice.SOURCE_JOYSTICK ||
                (ev.source and InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD ||
                (ev.source and InputDevice.SOURCE_CLASS_JOYSTICK) == InputDevice.SOURCE_CLASS_JOYSTICK
            if (isJoystick) {
                val devName = ev.device?.name?.takeIf { it.isNotBlank() } ?: state.value.deviceName
                val lx = ev.getAxisValue(MotionEvent.AXIS_X).coerceIn(-1f, 1f)
                val ly = ev.getAxisValue(MotionEvent.AXIS_Y).coerceIn(-1f, 1f)
                val rx = (ev.getAxisValue(MotionEvent.AXIS_Z).takeIf { kotlin.math.abs(it) > 0.001f }
                    ?: ev.getAxisValue(MotionEvent.AXIS_RX)).coerceIn(-1f, 1f)
                val ry = (ev.getAxisValue(MotionEvent.AXIS_RZ).takeIf { kotlin.math.abs(it) > 0.001f }
                    ?: ev.getAxisValue(MotionEvent.AXIS_RY)).coerceIn(-1f, 1f)
                val l2 = maxOf(
                    ev.getAxisValue(MotionEvent.AXIS_LTRIGGER),
                    ev.getAxisValue(MotionEvent.AXIS_BRAKE),
                ).coerceIn(0f, 1f)
                val r2 = maxOf(
                    ev.getAxisValue(MotionEvent.AXIS_RTRIGGER),
                    ev.getAxisValue(MotionEvent.AXIS_GAS),
                ).coerceIn(0f, 1f)
                val hx = ev.getAxisValue(MotionEvent.AXIS_HAT_X).coerceIn(-1f, 1f)
                val hy = ev.getAxisValue(MotionEvent.AXIS_HAT_Y).coerceIn(-1f, 1f)

                val current = state.value
                val hatButtons = mutableSetOf<String>()
                if (hx < -0.5f) hatButtons.add("LEFT")
                if (hx > 0.5f) hatButtons.add("RIGHT")
                if (hy < -0.5f) hatButtons.add("UP")
                if (hy > 0.5f) hatButtons.add("DOWN")

                val cleanedButtons = current.pressedButtons - setOf("UP", "DOWN", "LEFT", "RIGHT") + hatButtons
                state.value = current.copy(
                    deviceName = devName,
                    leftX = lx,
                    leftY = ly,
                    rightX = rx,
                    rightY = ry,
                    l2 = l2,
                    r2 = r2,
                    hatX = hx,
                    hatY = hy,
                    pressedButtons = cleanedButtons,
                )
                return true
            }
            return super.dispatchGenericMotionEvent(ev)
        }
    }

    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.apply {
        setBackgroundDrawable(ColorDrawable(AndroidColor.TRANSPARENT))
        setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        applyImmersiveFullscreen()
    }
    dialog.setOnShowListener { dialog.window?.applyImmersiveFullscreen() }

    val composeView = ComposeView(context).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
        setContent {
            MelonTheme {
                GamepadTesterDialogContent(
                    testerState = state.value,
                    deadzonePercent = deadzonePercent.coerceIn(5, 40),
                    onDismiss = { dialog.dismiss() },
                )
            }
        }
    }

    dialog.setContentView(composeView)
    dialog.show()
    dialog.window?.applyImmersiveFullscreen()
    return dialog
}

private fun findFirstConnectedGamepadName(): String? {
    for (id in InputDevice.getDeviceIds()) {
        val dev = InputDevice.getDevice(id) ?: continue
        if (dev.isVirtual) continue
        val src = dev.sources
        if ((src and InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD ||
            (src and InputDevice.SOURCE_JOYSTICK) == InputDevice.SOURCE_JOYSTICK
        ) {
            return dev.name?.takeIf { it.isNotBlank() } ?: "Gamepad $id"
        }
    }
    return null
}

private fun mapKeyCodeToLabel(keyCode: Int): String? {
    return when (keyCode) {
        KeyEvent.KEYCODE_BUTTON_A -> "A"
        KeyEvent.KEYCODE_BUTTON_B -> "B"
        KeyEvent.KEYCODE_BUTTON_X -> "X"
        KeyEvent.KEYCODE_BUTTON_Y -> "Y"
        KeyEvent.KEYCODE_BUTTON_L1 -> "L1"
        KeyEvent.KEYCODE_BUTTON_R1 -> "R1"
        KeyEvent.KEYCODE_BUTTON_L2 -> "L2"
        KeyEvent.KEYCODE_BUTTON_R2 -> "R2"
        KeyEvent.KEYCODE_BUTTON_THUMBL -> "L3"
        KeyEvent.KEYCODE_BUTTON_THUMBR -> "R3"
        KeyEvent.KEYCODE_BUTTON_START -> "START"
        KeyEvent.KEYCODE_BUTTON_SELECT -> "SELECT"
        KeyEvent.KEYCODE_BUTTON_MODE -> "HOME"
        KeyEvent.KEYCODE_DPAD_UP -> "UP"
        KeyEvent.KEYCODE_DPAD_DOWN -> "DOWN"
        KeyEvent.KEYCODE_DPAD_LEFT -> "LEFT"
        KeyEvent.KEYCODE_DPAD_RIGHT -> "RIGHT"
        else -> null
    }
}

@Composable
private fun GamepadTesterDialogContent(
    testerState: GamepadTesterState,
    deadzonePercent: Int,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    val deadzoneNorm = deadzonePercent / 100f

    SettingsDialogScaffold(
        title = stringResource(R.string.input_gamepad_tester_title),
        subtitle = testerState.deviceName ?: stringResource(R.string.gamepad_tester_no_device),
        icon = Icons.Filled.SportsEsports,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
        ) {
            // Deadzone pill
            Text(
                text = stringResource(R.string.gamepad_tester_deadzone_label, deadzonePercent),
                color = colors.green,
                fontFamily = WatermelonMono,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )

            // Dual analog sticks
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                AnalogStickCard(
                    label = stringResource(R.string.gamepad_tester_left_stick),
                    x = testerState.leftX,
                    y = testerState.leftY,
                    deadzone = deadzoneNorm,
                    modifier = Modifier.weight(1f),
                )
                AnalogStickCard(
                    label = stringResource(R.string.gamepad_tester_right_stick),
                    x = testerState.rightX,
                    y = testerState.rightY,
                    deadzone = deadzoneNorm,
                    modifier = Modifier.weight(1f),
                )
            }

            // Analog triggers L2 / R2
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = stringResource(R.string.gamepad_tester_triggers),
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                TriggerBarRow(label = "L2", value = testerState.l2)
                TriggerBarRow(label = "R2", value = testerState.r2)
            }

            // Pressed buttons grid
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = stringResource(R.string.gamepad_tester_pressed_buttons),
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                val rows = listOf(
                    listOf("UP", "DOWN", "LEFT", "RIGHT", "A", "B", "X", "Y"),
                    listOf("L1", "R1", "L2", "R2", "L3", "R3", "START", "SELECT"),
                )
                rows.forEach { row ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                    ) {
                        row.forEach { btn ->
                            val active = btn in testerState.pressedButtons ||
                                (btn == "L2" && testerState.l2 > 0.25f) ||
                                (btn == "R2" && testerState.r2 > 0.25f)
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(if (active) colors.green else colors.bg)
                                    .border(
                                        width = 1.dp,
                                        color = if (active) colors.green else colors.line,
                                        shape = RoundedCornerShape(8.dp),
                                    )
                                    .padding(vertical = 7.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(
                                    text = btn,
                                    color = if (active) Color.Black else colors.text2,
                                    fontFamily = WatermelonMono,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    textAlign = TextAlign.Center,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun AnalogStickCard(
    label: String,
    x: Float,
    y: Float,
    deadzone: Float,
    modifier: Modifier = Modifier,
) {
    val colors = LocalWatermelonColors.current
    val magnitude = hypot(x, y)
    val outsideDeadzone = magnitude >= deadzone

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(colors.surface2)
            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        Text(
            text = label,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
        )
        Canvas(
            modifier = Modifier
                .size(112.dp)
                .padding(4.dp),
        ) {
            val radius = size.minDimension / 2f
            val center = Offset(size.width / 2f, size.height / 2f)

            // Outer ring
            drawCircle(
                color = colors.bg,
                radius = radius,
                center = center,
            )
            drawCircle(
                color = colors.line,
                radius = radius,
                center = center,
                style = Stroke(width = 2f),
            )
            // Crosshair
            drawLine(colors.line.copy(alpha = 0.5f), Offset(center.x - radius, center.y), Offset(center.x + radius, center.y), 1f)
            drawLine(colors.line.copy(alpha = 0.5f), Offset(center.x, center.y - radius), Offset(center.x, center.y + radius), 1f)

            // Deadzone ring
            drawCircle(
                color = colors.green.copy(alpha = 0.14f),
                radius = radius * deadzone,
                center = center,
            )
            drawCircle(
                color = colors.green.copy(alpha = 0.55f),
                radius = radius * deadzone,
                center = center,
                style = Stroke(width = 1.5f),
            )

            // Stick vector + dot
            val clampedX = x.coerceIn(-1f, 1f)
            val clampedY = y.coerceIn(-1f, 1f)
            val dotPos = Offset(center.x + clampedX * radius * 0.90f, center.y + clampedY * radius * 0.90f)
            drawLine(
                color = if (outsideDeadzone) colors.green else colors.text2,
                start = center,
                end = dotPos,
                strokeWidth = 3f,
            )
            drawCircle(
                color = if (outsideDeadzone) colors.green else Color(0xFFF59E0B),
                radius = 9f,
                center = dotPos,
            )
        }
        Text(
            text = String.format(Locale.US, "X:%+.2f  Y:%+.2f", x, y),
            color = if (outsideDeadzone) colors.green else colors.text2,
            fontFamily = WatermelonMono,
            fontSize = 11.sp,
        )
    }
}

@Composable
private fun TriggerBarRow(
    label: String,
    value: Float,
) {
    val colors = LocalWatermelonColors.current
    val pct = (value.coerceIn(0f, 1f) * 100f).toInt()
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = label,
            color = colors.text,
            fontFamily = WatermelonMono,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(26.dp),
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .height(12.dp)
                .clip(CircleShape)
                .background(colors.bg)
                .border(1.dp, colors.line, CircleShape),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(value.coerceIn(0f, 1f))
                    .clip(CircleShape)
                    .background(colors.green),
            )
        }
        Text(
            text = "$pct%",
            color = colors.text2,
            fontFamily = WatermelonMono,
            fontSize = 11.sp,
            modifier = Modifier.width(38.dp),
            textAlign = TextAlign.End,
        )
    }
}
