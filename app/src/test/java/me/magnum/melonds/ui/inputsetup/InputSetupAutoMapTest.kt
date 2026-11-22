package me.magnum.melonds.ui.inputsetup

import android.view.KeyEvent
import android.view.MotionEvent
import androidx.lifecycle.SavedStateHandle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.lang.reflect.Proxy

@OptIn(ExperimentalCoroutinesApi::class)
class InputSetupAutoMapTest {

    @Before
    fun setUp() {
        Dispatchers.setMain(UnconfinedTestDispatcher())
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun standardGamepadConfiguration_mapsNintendoAbxyWithoutCollisions() {
        val config = ControllerConfiguration.standardGamepadConfiguration()

        assertEquals(Input.A, config.keyToInput(KeyEvent.KEYCODE_BUTTON_B))
        assertEquals(Input.B, config.keyToInput(KeyEvent.KEYCODE_BUTTON_A))
        assertEquals(Input.X, config.keyToInput(KeyEvent.KEYCODE_BUTTON_Y))
        assertEquals(Input.Y, config.keyToInput(KeyEvent.KEYCODE_BUTTON_X))

        assertEquals(Input.L, config.keyToInput(KeyEvent.KEYCODE_BUTTON_L1))
        assertEquals(Input.R, config.keyToInput(KeyEvent.KEYCODE_BUTTON_R1))
        assertEquals(Input.START, config.keyToInput(KeyEvent.KEYCODE_BUTTON_START))
        assertEquals(Input.SELECT, config.keyToInput(KeyEvent.KEYCODE_BUTTON_SELECT))
        assertEquals(Input.FAST_FORWARD, config.keyToInput(KeyEvent.KEYCODE_BUTTON_THUMBR))
        assertEquals(Input.SWAP_SCREENS, config.keyToInput(KeyEvent.KEYCODE_BUTTON_THUMBL))
        assertEquals(Input.PAUSE, config.keyToInput(KeyEvent.KEYCODE_BUTTON_MODE))

        assertEquals(Input.UP, config.keyToInput(KeyEvent.KEYCODE_DPAD_UP))
        assertEquals(Input.DOWN, config.keyToInput(KeyEvent.KEYCODE_DPAD_DOWN))
        assertEquals(Input.LEFT, config.keyToInput(KeyEvent.KEYCODE_DPAD_LEFT))
        assertEquals(Input.RIGHT, config.keyToInput(KeyEvent.KEYCODE_DPAD_RIGHT))

        assertEquals(
            Input.UP,
            config.axisToInput(MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.NEGATIVE),
        )
        assertEquals(
            Input.DOWN,
            config.axisToInput(MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.POSITIVE),
        )
        assertEquals(
            Input.LEFT,
            config.axisToInput(MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.NEGATIVE),
        )
        assertEquals(
            Input.RIGHT,
            config.axisToInput(MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.POSITIVE),
        )

        val faceInputs = listOf(Input.A, Input.B, Input.X, Input.Y)
        faceInputs.forEach { faceInput ->
            val entry = config.inputMapper.first { it.input == faceInput }
            assertEquals(InputConfig.Assignment.None, entry.altAssignment)
        }
    }

    @Test
    fun standardGamepadInputConfigs_hasStrictlyUniqueKeyAndAxisBindings() {
        val configs = ControllerConfiguration.standardGamepadInputConfigs()
        val seenKeys = mutableSetOf<Int>()
        val seenAxes = mutableSetOf<Pair<Int, InputConfig.Assignment.Axis.Direction>>()

        configs.forEach { cfg ->
            listOf(cfg.assignment, cfg.altAssignment).forEach { assignment ->
                when (assignment) {
                    is InputConfig.Assignment.Key -> {
                        assertTrue(
                            "Duplicate keyCode ${assignment.keyCode} on ${cfg.input}",
                            seenKeys.add(assignment.keyCode),
                        )
                    }
                    is InputConfig.Assignment.Axis -> {
                        val axisKey = assignment.axisCode to assignment.direction
                        assertTrue(
                            "Duplicate axis $axisKey on ${cfg.input}",
                            seenAxes.add(axisKey),
                        )
                    }
                    else -> Unit
                }
            }
        }
    }

    @Test
    fun viewModelAutoMapAndClearAll_updatesStateAndPersistsNonCollidingConfig() = runTest {
        var persistedConfig: ControllerConfiguration? = null
        val settingsRepo = Proxy.newProxyInstance(
            SettingsRepository::class.java.classLoader,
            arrayOf(SettingsRepository::class.java),
        ) { _, method, args ->
            when (method.name) {
                "getControllerConfiguration" -> ControllerConfiguration(emptyList())
                "setControllerConfiguration" -> {
                    persistedConfig = args?.firstOrNull() as? ControllerConfiguration
                    Unit
                }
                else -> null
            }
        } as SettingsRepository

        val romsRepo = Proxy.newProxyInstance(
            RomsRepository::class.java.classLoader,
            arrayOf(RomsRepository::class.java),
        ) { _, _, _ -> null } as RomsRepository

        val viewModel = InputSetupViewModel(
            settingsRepository = settingsRepo,
            romsRepository = romsRepo,
            savedStateHandle = SavedStateHandle(),
        )

        viewModel.autoMapStandardGamepad()

        val mapped = ControllerConfiguration(viewModel.inputConfiguration.value)
        assertEquals(Input.A, mapped.keyToInput(KeyEvent.KEYCODE_BUTTON_B))
        assertEquals(Input.B, mapped.keyToInput(KeyEvent.KEYCODE_BUTTON_A))
        assertEquals(Input.X, mapped.keyToInput(KeyEvent.KEYCODE_BUTTON_Y))
        assertEquals(Input.Y, mapped.keyToInput(KeyEvent.KEYCODE_BUTTON_X))
        assertEquals(Input.A, persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_B))
        assertEquals(Input.B, persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_A))
        assertEquals(Input.X, persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_Y))
        assertEquals(Input.Y, persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_X))

        viewModel.clearAllAssignments()

        val cleared = ControllerConfiguration(viewModel.inputConfiguration.value)
        assertTrue(cleared.inputMapper.none { it.hasKeyAssigned() })
        assertNull(persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_A))
        assertNull(persistedConfig?.keyToInput(KeyEvent.KEYCODE_BUTTON_B))
    }
}
