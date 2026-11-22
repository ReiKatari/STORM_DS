package me.magnum.melonds.impl

import android.content.ContextWrapper
import android.net.Uri
import kotlinx.coroutines.test.runTest
import me.magnum.melonds.domain.model.AudioBitrate
import me.magnum.melonds.domain.model.AudioInterpolation
import me.magnum.melonds.domain.model.AudioLatency
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.model.DSiProfile
import me.magnum.melonds.domain.model.DSiProfileSettings
import me.magnum.melonds.domain.model.DldiSdCardConfiguration
import me.magnum.melonds.domain.model.EmulatorConfiguration
import me.magnum.melonds.domain.model.FirmwareConfiguration
import me.magnum.melonds.domain.model.MicSource
import me.magnum.melonds.domain.model.RendererConfiguration
import me.magnum.melonds.domain.model.RetroArchShaderConfiguration
import me.magnum.melonds.domain.model.RetroArchShaderSourceResolution
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.VulkanPipelineProfile
import me.magnum.melonds.domain.repositories.DSiWareMetadataRepository
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.lang.reflect.Proxy

class DsiRestorationTest {

    private fun testConfiguration(): EmulatorConfiguration {
        return EmulatorConfiguration(
            useCustomBios = true,
            showBootScreen = false,
            dsBios7Uri = null,
            dsBios9Uri = null,
            dsFirmwareUri = null,
            dsiBios7Uri = null,
            dsiBios9Uri = null,
            dsiFirmwareUri = null,
            dsiNandUri = null,
            internalDirectory = "",
            fastForwardSpeedMultiplier = 2.0f,
            frameLimitSpeedMultiplier = 1.0f,
            rewindEnabled = false,
            rewindPeriodSeconds = 10,
            rewindWindowSeconds = 60,
            useJit = true,
            hgEngineFixEnabled = false,
            consoleType = ConsoleType.DSi,
            soundEnabled = false,
            audioInterpolation = AudioInterpolation.NONE,
            audioBitrate = AudioBitrate.AUTO,
            volume = 256,
            audioLatency = AudioLatency.MEDIUM,
            micSource = MicSource.NONE,
            firmwareConfiguration = FirmwareConfiguration(
                nickname = "Player",
                message = "",
                language = 1,
                favouriteColour = 0,
                birthdayMonth = 1,
                birthdayDay = 1,
                randomizeMacAddress = false,
                internalMacAddress = null,
            ),
            rendererConfiguration = RendererConfiguration(
                renderer = VideoRenderer.SOFTWARE,
                videoFiltering = VideoFiltering.NONE,
                threadedRendering = false,
                vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY,
                internalResolutionScaling = 1,
                rendererDebugToolsEnabled = false,
                rendererDebugBgObjEnabled = false,
                rendererDebugLatchTraceEnabled = false,
                conservativeCoverageEnabled = false,
                conservativeCoveragePx = 0f,
                conservativeCoverageDepthBias = 0f,
                conservativeCoverageApplyRepeat = false,
                conservativeCoverageApplyClamp = false,
                debug3dClearMagenta = false,
                retroArchShader = RetroArchShaderConfiguration(
                    presetPath = null,
                    sourceResolution = RetroArchShaderSourceResolution.VULKAN_IR,
                    passCount = 0,
                    sourceBytes = 0L,
                    parameterOverrides = emptyMap(),
                    clearHistory = false,
                ),
            ),
            dldiSdCardConfiguration = DldiSdCardConfiguration(
                enabled = false,
                imagePath = null,
                imageSize = 0,
                folderSync = false,
                folderPath = null,
            ),
        )
    }

    private fun createTestNandManager(): AndroidDSiNandManager {
        val dummyContext = ContextWrapper(null)
        val settingsRepo = Proxy.newProxyInstance(
            SettingsRepository::class.java.classLoader,
            arrayOf(SettingsRepository::class.java),
        ) { _, _, _ -> null } as SettingsRepository
        val metadataRepo = Proxy.newProxyInstance(
            DSiWareMetadataRepository::class.java.classLoader,
            arrayOf(DSiWareMetadataRepository::class.java),
        ) { _, _, _ -> null } as DSiWareMetadataRepository
        val verifier = object : ConfigurationDirectoryVerifier(settingsRepo) {
            override fun checkDsConfigurationDirectory(directory: Uri?): ConfigurationDirResult =
                ConfigurationDirResult(ConsoleType.DS, ConfigurationDirResult.Status.UNSET, emptyArray(), emptyArray())

            override fun checkDsiConfigurationDirectory(directory: Uri?): ConfigurationDirResult =
                ConfigurationDirResult(ConsoleType.DSi, ConfigurationDirResult.Status.UNSET, emptyArray(), emptyArray())
        }
        return AndroidDSiNandManager(
            context = dummyContext,
            settingsRepository = settingsRepo,
            dsiWareMetadataRepository = metadataRepo,
            biosDirectoryVerifier = verifier,
            dsiWareTitlesMetadataStore = DSiWareTitlesMetadataStore(dummyContext),
        )
    }

    @Test
    fun nandSession_closePreventsIllegalStateAndReleasesLockForNextSession() = runTest {
        val manager = createTestNandManager()
        val firstSession = manager.acquireSession()
        assertNotNull(firstSession)
        // Only one exclusive NAND session can be acquired at a time
        assertNull(manager.acquireSession())

        firstSession!!.close()
        // Calling withNand after close must return null rather than throwing IllegalStateException
        val resultAfterClose = firstSession.withNand(testConfiguration()) { true }
        assertNull(resultAfterClose)

        val secondSession = manager.acquireSession()
        assertNotNull(secondSession)
        val missingBiosResult = secondSession!!.withNand(testConfiguration()) { true }
        assertNull(missingBiosResult)
        secondSession.close()

        val thirdSession = manager.acquireSession()
        assertNotNull(thirdSession)
        thirdSession!!.close()
    }

    @Test
    fun dsiProfileSettings_resolvesDefaultAndRemovesSafely() {
        val p1 = DSiProfile("00000000-0000-0000-0000-000000000001", "Primary", "file:///storage/emulated/0/STORM DS/bios/dsi")
        val p2 = DSiProfile("00000000-0000-0000-0000-000000000002", "Secondary", "file:///storage/emulated/0/Custom/dsi")

        val settings = DSiProfileSettings(profiles = listOf(p1, p2), defaultProfileId = p1.id)
        assertEquals(p1, settings.resolve())
        assertEquals(p2, settings.resolve(p2.id))

        val withoutSecond = settings.without(p2.id)
        assertEquals(p1, withoutSecond.resolve())

        val withoutDefault = settings.without(p1.id)
        assertNull(withoutDefault.defaultProfileId)
        assertNull(withoutDefault.resolve())
    }

    @Test
    fun settingsBackupManager_excludesDsiProfilesKey() {
        val field = SettingsBackupManager::class.java.getDeclaredField("EXCLUDED_PREF_KEYS")
        field.isAccessible = true
        @Suppress("UNCHECKED_CAST")
        val excluded = field.get(null) as Set<String>
        assertTrue(excluded.contains("bios_dir"))
        assertTrue(excluded.contains("dsi_bios_dir"))
        assertTrue(excluded.contains("dsi_profiles"))
    }
}
