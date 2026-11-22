package me.magnum.melonds.impl.emulator

import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class FirmwareLaunchTest {

    @Test
    fun runtimeConsoleDs_mapsToConsoleTypeDs_withoutForcingCustomBios() {
        val targetConsole = RuntimeConsoleType.DS.targetConsoleType
        assertEquals(ConsoleType.DS, targetConsole)
        assertFalse(
            AndroidEmulatorManager.shouldUseCustomBios(
                baseUseCustomBios = false,
                consoleType = targetConsole!!,
            ),
        )
    }

    @Test
    fun dsConsoleWithGlobalCustomBiosEnabled_usesCustomBios() {
        assertTrue(
            AndroidEmulatorManager.shouldUseCustomBios(
                baseUseCustomBios = true,
                consoleType = ConsoleType.DS,
            ),
        )
    }

    @Test
    fun dsiConsole_alwaysRequiresCustomBios_evenWhenGlobalDisabled() {
        assertEquals(ConsoleType.DSi, RuntimeConsoleType.DSi.targetConsoleType)
        assertTrue(
            AndroidEmulatorManager.shouldUseCustomBios(
                baseUseCustomBios = false,
                consoleType = ConsoleType.DSi,
            ),
        )
        assertTrue(
            AndroidEmulatorManager.shouldUseCustomBios(
                baseUseCustomBios = true,
                consoleType = ConsoleType.DSi,
            ),
        )
    }

    @Test
    fun runtimeConsoleDefault_hasNullTargetConsoleType() {
        assertNull(RuntimeConsoleType.DEFAULT.targetConsoleType)
    }
}
