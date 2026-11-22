package me.magnum.melonds.impl

import me.magnum.melonds.domain.model.VulkanDriverInfo
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport.AdrenoSubFamily
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport.GpuVendorFamily
import me.magnum.melonds.impl.AdrenoVulkanDriverSupport.MaliArchFamily
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class VulkanDriverSupportTest {
    @get:Rule val temp = TemporaryFolder()

    @Test
    fun panvkIsSelectedByMetadataOrAsTheOnlyDriver() {
        val panvk = temp.newFile("libvulkan_panfrost.so")
        assertEquals(panvk, AdrenoVulkanDriverManager.selectDriverFile(temp.root, null, false))
        temp.newFile("vulkan.adreno.so")
        assertEquals(panvk.canonicalFile, AdrenoVulkanDriverManager.selectDriverFile(temp.root, panvk.name, false))
    }

    @Test
    fun packagesWithMultipleDriversNeedMetadataOutsideAdreno() {
        val adreno = temp.newFile("vulkan.adreno.so")
        temp.newFile("libvulkan_panfrost.so")
        assertEquals(adreno, AdrenoVulkanDriverManager.selectDriverFile(temp.root, null, true))
        val exception = assertThrows(AdrenoVulkanDriverManager.ImportException::class.java) {
            AdrenoVulkanDriverManager.selectDriverFile(temp.root, null, false)
        }
        assertEquals(AdrenoVulkanDriverManager.ImportException.Reason.AmbiguousDriver, exception.reason)
    }

    @Test
    fun oldPendingPathResolvesOnlyTheSelectedPackageAndSubdirectory() {
        val firstId = "00000000-0000-0000-0000-000000000001"
        val selectedId = "00000000-0000-0000-0000-000000000002"
        val name = "libvulkan_panfrost.so"
        val selectedRoot = temp.newFolder("driver-$selectedId")
        temp.newFolder("driver-$firstId").resolve(name).writeText("first")
        selectedRoot.resolve(name).writeText("different ABI")
        val arm64 = selectedRoot.resolve("arm64").apply { mkdir() }
        val selected = arm64.resolve(name).apply { writeText("selected") }
        val storedDir = selectedRoot.resolve("../../alias/pending-$selectedId/arm64")
        val entry = VulkanDriverInfo(selectedId, "PanVK", storedDir.path, name)
        assertEquals(selected, AdrenoVulkanDriverManager.resolveInstalledLibrary(temp.root, entry))
        assertEquals(selected, AdrenoVulkanDriverManager.resolveInstalledLibrary(temp.root, entry.copy(driverDir = arm64.path)))
        assertTrue(selected.delete())
        assertNull(AdrenoVulkanDriverManager.resolveInstalledLibrary(temp.root, entry))
    }

    @Test
    fun resolvedLegacyDriverKeepsItsOwnLibrary() {
        val library = temp.newFile("old-driver.so")
        val legacy = VulkanDriverInfo("legacy", "Legacy driver", temp.root.path, library.name)
        assertEquals(library, AdrenoVulkanDriverManager.resolveInstalledLibrary(temp.root, legacy))
    }

    @Test
    fun arm64LoaderIsIndependentOfGpuVendor() {
        assertTrue(AdrenoVulkanDriverSupport.isLoaderAvailable(true, 28, arrayOf("arm64-v8a"), true))
        assertFalse(AdrenoVulkanDriverSupport.isAdrenoGpu("Mali-G52"))
        assertTrue(AdrenoVulkanDriverSupport.isAdrenoGpu("Adreno (TM) 740"))
    }

    @Test
    fun requiresLoaderBuildSupportedOsAndArm64Process() {
        val arm64 = arrayOf("arm64-v8a")
        assertFalse(AdrenoVulkanDriverSupport.isLoaderAvailable(false, 35, arm64, true))
        assertFalse(AdrenoVulkanDriverSupport.isLoaderAvailable(true, 27, arm64, true))
        assertFalse(AdrenoVulkanDriverSupport.isLoaderAvailable(true, 35, arm64, false))
        assertFalse(AdrenoVulkanDriverSupport.isLoaderAvailable(true, 35, arrayOf("x86_64"), true))
    }

    @Test
    fun classifiesMaliArchFamiliesCorrectly() {
        listOf("Mali-G31", "Mali-G51", "Mali-G52 MC2", "Mali-G76").forEach {
            assertEquals(it, MaliArchFamily.V7_BIFROST, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-G57", "Mali-G68", "Mali-G77", "Mali-G78", "Mali-G78AE").forEach {
            assertEquals(it, MaliArchFamily.V9_VALHALL, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-G310", "Mali-G510", "Mali-G610", "Mali-G710 MC10").forEach {
            assertEquals(it, MaliArchFamily.V10_VALHALL, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-G615", "Immortalis-G715 MC11").forEach {
            assertEquals(it, MaliArchFamily.V11_VALHALL, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-G620", "Immortalis-G720 MC12").forEach {
            assertEquals(it, MaliArchFamily.V12_FIFTH_GEN, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-T760", "Mali-T880", "Mali-G71", "Mali-G72 MP18").forEach {
            assertEquals(it, MaliArchFamily.UNSUPPORTED_MIDGARD_OR_V6, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        listOf("Mali-G925", "Immortalis-G925 MC12").forEach {
            assertEquals(it, MaliArchFamily.UNSUPPORTED_V13_PLUS, AdrenoVulkanDriverSupport.classifyMaliArchFamily(it))
        }
        assertEquals(MaliArchFamily.NON_MALI, AdrenoVulkanDriverSupport.classifyMaliArchFamily("Adreno (TM) 750"))
    }

    @Test
    fun malisx2RequiresMaliV7ToV12Api29Plus64BitAndKbase() {
        val supportedFamilies = listOf(
            MaliArchFamily.V7_BIFROST,
            MaliArchFamily.V9_VALHALL,
            MaliArchFamily.V10_VALHALL,
            MaliArchFamily.V11_VALHALL,
            MaliArchFamily.V12_FIFTH_GEN,
        )
        supportedFamilies.forEach { family ->
            assertTrue(
                "Supported family $family",
                AdrenoVulkanDriverSupport.isMalisx2Supported(family, sdkInt = 29, is64BitProcess = true, hasKbaseKernel = true),
            )
            assertFalse(
                "API < 29 rejected for $family",
                AdrenoVulkanDriverSupport.isMalisx2Supported(family, sdkInt = 28, is64BitProcess = true, hasKbaseKernel = true),
            )
            assertFalse(
                "32-bit rejected for $family",
                AdrenoVulkanDriverSupport.isMalisx2Supported(family, sdkInt = 34, is64BitProcess = false, hasKbaseKernel = true),
            )
            assertFalse(
                "Missing /dev/mali0 rejected for $family",
                AdrenoVulkanDriverSupport.isMalisx2Supported(family, sdkInt = 34, is64BitProcess = true, hasKbaseKernel = false),
            )
        }

        listOf(
            MaliArchFamily.UNSUPPORTED_MIDGARD_OR_V6,
            MaliArchFamily.UNSUPPORTED_V13_PLUS,
            MaliArchFamily.UNKNOWN_MALI,
            MaliArchFamily.NON_MALI,
        ).forEach { unsupported ->
            assertFalse(
                "Unsupported family $unsupported",
                AdrenoVulkanDriverSupport.isMalisx2Supported(unsupported, sdkInt = 35, is64BitProcess = true, hasKbaseKernel = true),
            )
        }
    }

    @Test
    fun driverCompatibilityEnforcesMalisx2MatrixAndAudit43() {
        // malisx2 / PanVK allowed on Mali v7-v12 with API 29+ / 64-bit / kbase
        assertTrue(
            AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                driverName = "malisx2-v1.0 libvulkan_panfrost.so",
                sourceRepo = "malisx2",
                subFamily = AdrenoSubFamily.NON_ADRENO,
                vendorFamily = GpuVendorFamily.ARM_MALI,
                maliArch = MaliArchFamily.V10_VALHALL,
                malisx2Supported = true,
            )
        )
        // Rejected on Adreno, Midgard/v6, v13+ G925, and when malisx2Supported = false (e.g. API < 29)
        assertFalse(
            AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                driverName = "malisx2-v1.0 libvulkan_panfrost.so",
                sourceRepo = "malisx2",
                subFamily = AdrenoSubFamily.ADRENO_7XX_MODERN,
                vendorFamily = GpuVendorFamily.ADRENO,
                maliArch = MaliArchFamily.NON_MALI,
                malisx2Supported = true,
            )
        )
        assertFalse(
            AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                driverName = "malisx2-v1.0 libvulkan_panfrost.so",
                sourceRepo = "malisx2",
                subFamily = AdrenoSubFamily.NON_ADRENO,
                vendorFamily = GpuVendorFamily.ARM_MALI,
                maliArch = MaliArchFamily.UNSUPPORTED_MIDGARD_OR_V6,
                malisx2Supported = false,
            )
        )
        assertFalse(
            AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                driverName = "malisx2-v1.0 libvulkan_panfrost.so",
                sourceRepo = "malisx2",
                subFamily = AdrenoSubFamily.NON_ADRENO,
                vendorFamily = GpuVendorFamily.ARM_MALI,
                maliArch = MaliArchFamily.UNSUPPORTED_V13_PLUS,
                malisx2Supported = false,
            )
        )

        // Audit [4.3]: installed storm_driver and crueter_8elite remain compatible on Adreno 8xx / 840+
        listOf("storm_driver", "crueter_8elite").forEach { repoId ->
            assertTrue(
                AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                    driverName = "Qualcomm Vulkan Driver vulkan.adreno.so",
                    description = "Extracted from meta.json without repo title",
                    version = "512.762.12",
                    sourceRepo = repoId,
                    subFamily = AdrenoSubFamily.ADRENO_8XX_ELITE,
                    vendorFamily = GpuVendorFamily.ADRENO,
                )
            )
            assertTrue(
                AdrenoVulkanDriverSupport.isDriverCompatibleWithCurrentGpu(
                    driverName = "Qualcomm Vulkan Driver vulkan.adreno.so",
                    description = "Extracted from meta.json without repo title",
                    version = "512.762.12",
                    sourceRepo = repoId,
                    subFamily = AdrenoSubFamily.ADRENO_840_PLUS,
                    vendorFamily = GpuVendorFamily.ADRENO,
                )
            )
        }
    }

    @Test
    fun safDisplayNameAndZipMagicByteValidationAudit41() {
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName(null))
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName(""))
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName("driver_download"))
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName("Turnip-25.1.0"))
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName("malisx2-v1.0.zip"))
        assertFalse(AdrenoVulkanDriverManager.isKnownNonZipFileName("driver.adpkg"))

        assertTrue(AdrenoVulkanDriverManager.isKnownNonZipFileName("notes.txt"))
        assertTrue(AdrenoVulkanDriverManager.isKnownNonZipFileName("malisx2.tar.gz"))
        assertTrue(AdrenoVulkanDriverManager.isKnownNonZipFileName("driver.7z"))
        assertTrue(AdrenoVulkanDriverManager.isKnownNonZipFileName("libvulkan_freedreno.so"))

        val validZip = temp.newFile("extensionless_archive")
        val validBytes = ByteArray(2048) { 0 }
        validBytes[0] = 0x50
        validBytes[1] = 0x4B
        validBytes[2] = 0x03
        validBytes[3] = 0x04
        validZip.writeBytes(validBytes)
        AdrenoVulkanDriverManager.validateArchiveFile(validZip)

        val invalidZip = temp.newFile("fake.zip")
        invalidZip.writeBytes(ByteArray(2048) { 'A'.code.toByte() })
        val ex = assertThrows(AdrenoVulkanDriverManager.ImportException::class.java) {
            AdrenoVulkanDriverManager.validateArchiveFile(invalidZip)
        }
        assertEquals(AdrenoVulkanDriverManager.ImportException.Reason.InvalidArchive, ex.reason)
    }

    @Test
    fun freedrenoSettingsValidationAndKeys() {
        assertEquals("video_freedreno_fd_dev_features", FreedrenoSettings.preferenceKey("FD_DEV_FEATURES"))
        assertEquals("video_freedreno_tu_debug", FreedrenoSettings.preferenceKey("TU_DEBUG"))
        assertEquals("video_freedreno_fd_mesa_debug", FreedrenoSettings.preferenceKey("FD_MESA_DEBUG"))

        assertTrue(FreedrenoSettings.isValid(""))
        assertTrue(FreedrenoSettings.isValid("noconform,sysmem"))
        assertFalse(FreedrenoSettings.isValid("line1\nline2"))
        assertFalse(FreedrenoSettings.isValid("a".repeat(2049)))
    }
}
