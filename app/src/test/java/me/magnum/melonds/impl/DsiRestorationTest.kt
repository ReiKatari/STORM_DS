package me.magnum.melonds.impl

import android.content.ContextWrapper
import android.content.SharedPreferences
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
import me.magnum.melonds.utils.getFloatCompat
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

    private class InMemorySharedPreferences : SharedPreferences {
        private val data = LinkedHashMap<String, Any?>()

        override fun getAll(): MutableMap<String, *> = LinkedHashMap(data)

        override fun getString(key: String?, defValue: String?): String? {
            if (key == null || !data.containsKey(key)) return defValue
            return data[key] as String?
        }

        @Suppress("UNCHECKED_CAST")
        override fun getStringSet(key: String?, defValues: MutableSet<String>?): MutableSet<String>? {
            if (key == null || !data.containsKey(key)) return defValues
            return data[key] as MutableSet<String>?
        }

        override fun getInt(key: String?, defValue: Int): Int {
            if (key == null || !data.containsKey(key)) return defValue
            return data[key] as Int
        }

        override fun getLong(key: String?, defValue: Long): Long {
            if (key == null || !data.containsKey(key)) return defValue
            return data[key] as Long
        }

        override fun getFloat(key: String?, defValue: Float): Float {
            if (key == null || !data.containsKey(key)) return defValue
            return data[key] as Float
        }

        override fun getBoolean(key: String?, defValue: Boolean): Boolean {
            if (key == null || !data.containsKey(key)) return defValue
            return data[key] as Boolean
        }

        override fun contains(key: String?): Boolean = key != null && data.containsKey(key)

        override fun edit(): SharedPreferences.Editor = object : SharedPreferences.Editor {
            private val pending = LinkedHashMap<String, Any?>()
            private val removals = LinkedHashSet<String>()
            private var clearAll = false

            override fun putString(key: String?, value: String?): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = value
                }
            }

            override fun putStringSet(key: String?, values: MutableSet<String>?): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = values?.toMutableSet()
                }
            }

            override fun putInt(key: String?, value: Int): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = value
                }
            }

            override fun putLong(key: String?, value: Long): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = value
                }
            }

            override fun putFloat(key: String?, value: Float): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = value
                }
            }

            override fun putBoolean(key: String?, value: Boolean): SharedPreferences.Editor = apply {
                if (key != null) {
                    removals.remove(key)
                    pending[key] = value
                }
            }

            override fun remove(key: String?): SharedPreferences.Editor = apply {
                if (key != null) {
                    pending.remove(key)
                    removals.add(key)
                }
            }

            override fun clear(): SharedPreferences.Editor = apply {
                clearAll = true
                pending.clear()
                removals.clear()
            }

            override fun commit(): Boolean {
                if (clearAll) {
                    data.clear()
                }
                for (r in removals) {
                    data.remove(r)
                }
                for ((k, v) in pending) {
                    data[k] = v
                }
                return true
            }

            override fun apply() {
                commit()
            }
        }

        override fun registerOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) = Unit
        override fun unregisterOnSharedPreferenceChangeListener(listener: SharedPreferences.OnSharedPreferenceChangeListener?) = Unit
    }

    @Test
    fun sharedPreferences_getFloatCompat_handlesIntegerAndSelfHeals() {
        val prefs = InMemorySharedPreferences()
        prefs.edit().putInt("pref_button_cluster_spread", 1).apply()

        val resolved = prefs.getFloatCompat("pref_button_cluster_spread", 0.5f)
        assertEquals(1.0f, resolved, 0.0001f)
        assertEquals(1.0f, prefs.getFloat("pref_button_cluster_spread", 0.5f), 0.0001f)
    }

    @Test
    fun settingsBackupManager_restoresFloatKeysFromJsonIntegers() {
        val prefs = InMemorySharedPreferences()
        SettingsBackupManager.restoreSettingsEntries(
            preferences = prefs,
            entries = mapOf(
                "pref_button_cluster_spread" to 1,
                "pref_button_cluster_inner_scale" to 1,
                "slow_motion_speed" to 1,
                "volume" to 166,
            ),
            includeLocalKeys = true,
        )

        assertEquals(1.0f, prefs.getFloat("pref_button_cluster_spread", 0.0f), 0.0001f)
        assertEquals(1.0f, prefs.getFloat("pref_button_cluster_inner_scale", 0.0f), 0.0001f)
        assertEquals(1.0f, prefs.getFloat("slow_motion_speed", 0.0f), 0.0001f)
        assertEquals(166, prefs.getInt("volume", 0))
    }
}
