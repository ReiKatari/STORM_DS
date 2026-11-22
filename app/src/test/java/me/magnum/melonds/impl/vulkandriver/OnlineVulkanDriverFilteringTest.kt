package me.magnum.melonds.impl.vulkandriver

import me.magnum.melonds.impl.AdrenoVulkanDriverSupport.AdrenoSubFamily
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

class OnlineVulkanDriverFilteringTest {

    private fun buildSampleGroup(
        id: String,
        displayName: String,
        category: DriverRepoCategory,
        releases: List<VulkanDriverRelease>,
        isLoading: Boolean = false,
        error: String? = null,
    ): VulkanDriverRepoGroup {
        return VulkanDriverRepoGroup(
            spec = VulkanDriverRepoSpec(
                id = id,
                displayName = displayName,
                repoPath = "test/$id",
                category = category,
                useTagName = true,
                sortByPublishTime = true,
            ),
            releases = releases,
            isLoading = isLoading,
            fromCache = false,
            error = error,
        )
    }

    private fun releaseWithAsset(
        repoId: String,
        title: String,
        tagName: String,
        assetName: String,
        notes: String = "",
    ): VulkanDriverRelease {
        return VulkanDriverRelease(
            id = "$repoId:$tagName",
            repoId = repoId,
            repoDisplayName = repoId,
            title = title,
            tagName = tagName,
            publishedAt = "2026-11-22",
            releaseNotes = notes,
            assets = listOf(
                VulkanDriverAsset(
                    name = assetName,
                    downloadUrl = "https://example.invalid/$assetName",
                    sizeBytes = 1024L,
                )
            ),
        )
    }

    @Test
    fun nonAdrenoAndLegacyExcludeAllAdrenoReposAndRecommendSystem() {
        val sampleGroups = listOf(
            buildSampleGroup("storm_driver", "STORM DRIVER", DriverRepoCategory.STORM, emptyList()),
            buildSampleGroup("kimchi", "KIMCHI Turnip", DriverRepoCategory.TURNIP, emptyList()),
            buildSampleGroup("crueter_8elite", "GameHub 8xx", DriverRepoCategory.QUALCOMM_8XX, emptyList()),
            buildSampleGroup("vauzi_710", "Vauzi 710", DriverRepoCategory.ADRENO_710, emptyList()),
        )

        listOf(AdrenoSubFamily.NON_ADRENO, AdrenoSubFamily.ADRENO_LEGACY_OR_UNKNOWN).forEach { family ->
            assertTrue(OnlineVulkanDriverRepository.getRecommendedRepoIdsFor(family).isEmpty())
            assertNull(OnlineVulkanDriverRepository.getRecommendedDriverDisplayTitle(family))
            OnlineVulkanDriverRepository.ALL_REPOSITORIES.forEach { spec ->
                assertFalse(
                    "Repo ${spec.id} must be filtered on $family",
                    OnlineVulkanDriverRepository.isRepoSupportedOnDevice(spec.id, family),
                )
            }
            val filtered = OnlineVulkanDriverRepository.filterCompatibleGroups(sampleGroups, family)
            assertTrue(filtered.isEmpty())
            assertEquals(
                listOf(DriverRepoCategory.ALL),
                OnlineVulkanDriverRepository.getAvailableCategories(filtered),
            )
        }
    }

    @Test
    fun adreno6xxFiltersOut8xxAnd710AndPlacesRecommendedFirst() {
        val groups = listOf(
            buildSampleGroup(
                "amaral",
                "Amaral",
                DriverRepoCategory.TURNIP,
                listOf(releaseWithAsset("amaral", "Turnip v25", "v25", "turnip_a6xx_a7xx.zip")),
            ),
            buildSampleGroup(
                "crueter_8elite",
                "GameHub 8xx",
                DriverRepoCategory.QUALCOMM_8XX,
                listOf(releaseWithAsset("crueter_8elite", "8Elite 849.0", "849", "gamehub_8elite.zip")),
            ),
            buildSampleGroup(
                "vauzi_710",
                "Vauzi 710",
                DriverRepoCategory.ADRENO_710,
                listOf(releaseWithAsset("vauzi_710", "Vauzi 710 v17", "v17", "vauzi_a710.zip")),
            ),
            buildSampleGroup(
                "kimchi",
                "KIMCHI Turnip",
                DriverRepoCategory.TURNIP,
                listOf(
                    releaseWithAsset("kimchi", "Turnip 25.0 A6xx", "v25.0", "turnip_v25_a6xx.zip"),
                    releaseWithAsset("kimchi", "Turnip 8Elite Only", "v25-8elite", "turnip_8elite_gen8.zip"),
                    releaseWithAsset("kimchi", "Turnip A710 Special", "v25-710", "turnip_a710.zip"),
                ),
            ),
            buildSampleGroup(
                "storm_driver",
                "STORM DRIVER",
                DriverRepoCategory.STORM,
                listOf(releaseWithAsset("storm_driver", "STORM DRIVER 12.0.0", "12.0.0", "STORM_DRIVER_12.0.0.zip")),
            ),
        )

        val filtered = OnlineVulkanDriverRepository.filterCompatibleGroups(groups, AdrenoSubFamily.ADRENO_6XX)
        assertEquals(listOf("storm_driver", "kimchi", "amaral"), filtered.map { it.spec.id })

        val kimchiAssets = filtered.first { it.spec.id == "kimchi" }.releases.flatMap { it.assets }.map { it.name }
        assertEquals(listOf("turnip_v25_a6xx.zip"), kimchiAssets)

        val categories = OnlineVulkanDriverRepository.getAvailableCategories(filtered)
        assertEquals(listOf(DriverRepoCategory.ALL, DriverRepoCategory.STORM, DriverRepoCategory.TURNIP), categories)
        assertNotNull(OnlineVulkanDriverRepository.getRecommendedDriverDisplayTitle(AdrenoSubFamily.ADRENO_6XX))
    }

    @Test
    fun adreno710KeepsVauzi710AndRejects8Elite() {
        val groups = listOf(
            buildSampleGroup(
                "vauzi_710",
                "Vauzi 710",
                DriverRepoCategory.ADRENO_710,
                listOf(releaseWithAsset("vauzi_710", "Vauzi 710/720", "v17", "turnip_710_720.zip")),
            ),
            buildSampleGroup(
                "crueter_8elite",
                "GameHub 8xx",
                DriverRepoCategory.QUALCOMM_8XX,
                listOf(releaseWithAsset("crueter_8elite", "8Elite", "849", "gamehub_8elite.zip")),
            ),
            buildSampleGroup(
                "storm_driver",
                "STORM DRIVER",
                DriverRepoCategory.STORM,
                listOf(releaseWithAsset("storm_driver", "STORM DRIVER 12.0.0", "12.0.0", "STORM_DRIVER_12.0.0.zip")),
            ),
        )

        val filtered = OnlineVulkanDriverRepository.filterCompatibleGroups(groups, AdrenoSubFamily.ADRENO_710_720)
        assertEquals(listOf("storm_driver", "vauzi_710"), filtered.map { it.spec.id })
        assertTrue(OnlineVulkanDriverRepository.getAvailableCategories(filtered).contains(DriverRepoCategory.ADRENO_710))
    }

    @Test
    fun adreno7xxModernExcludes710And8Elite() {
        assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("vauzi_710", AdrenoSubFamily.ADRENO_7XX_MODERN))
        assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("crueter_8elite", AdrenoSubFamily.ADRENO_7XX_MODERN))
        assertTrue(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("kimchi", AdrenoSubFamily.ADRENO_7XX_MODERN))
        assertEquals(
            listOf("storm_driver", "kimchi", "mrpurple", "weabchan", "whitebelyash"),
            OnlineVulkanDriverRepository.getRecommendedRepoIdsFor(AdrenoSubFamily.ADRENO_7XX_MODERN),
        )
    }

    @Test
    fun adreno8xxAnd840PlusFilterLegacyTurnipAndSurfaceGen8AndGen5Drivers() {
        val groups = listOf(
            buildSampleGroup(
                "vauzi_710",
                "Vauzi 710",
                DriverRepoCategory.ADRENO_710,
                listOf(releaseWithAsset("vauzi_710", "Vauzi 710", "v17", "turnip_710.zip")),
            ),
            buildSampleGroup(
                "mrpurple",
                "Mr. Purple",
                DriverRepoCategory.TURNIP,
                listOf(releaseWithAsset("mrpurple", "Purple T20", "t20", "purple_a7xx_only.zip")),
            ),
            buildSampleGroup(
                "crueter_8elite",
                "GameHub 8xx",
                DriverRepoCategory.QUALCOMM_8XX,
                listOf(releaseWithAsset("crueter_8elite", "GameHub 849.0 Gen5", "849", "gamehub_840_gen5.zip")),
            ),
            buildSampleGroup(
                "storm_driver",
                "STORM DRIVER",
                DriverRepoCategory.STORM,
                listOf(releaseWithAsset("storm_driver", "STORM DRIVER 12.0.0", "12.0.0", "STORM_DRIVER_12.0.0.zip")),
            ),
        )

        val elite = OnlineVulkanDriverRepository.filterCompatibleGroups(groups, AdrenoSubFamily.ADRENO_8XX_ELITE)
        assertEquals(listOf("storm_driver", "crueter_8elite"), elite.map { it.spec.id })

        val gen5 = OnlineVulkanDriverRepository.filterCompatibleGroups(groups, AdrenoSubFamily.ADRENO_840_PLUS)
        assertEquals(listOf("storm_driver", "crueter_8elite"), gen5.map { it.spec.id })
    }

    @Test
    fun appLogPreferenceDefaultsToTrueInPrefSystemXml() {
        val candidates = listOf(
            File("src/main/res/xml/pref_system.xml"),
            File("app/src/main/res/xml/pref_system.xml"),
        )
        val xmlFile = candidates.firstOrNull { it.isFile }
        assertNotNull("pref_system.xml must exist", xmlFile)
        val content = xmlFile!!.readText(Charsets.UTF_8)
        assertTrue(content.contains("android:key=\"system_app_log_file_enabled\""))
        assertTrue(
            Regex("""android:key="system_app_log_file_enabled"[\s\S]{0,400}?android:defaultValue="true"""")
                .containsMatchIn(content)
        )
    }

    @Test
    fun malisx2RepositoryIsConfiguredAndFilteredStrictlyToSupportedMali() {
        val malisx2Spec = OnlineVulkanDriverRepository.ALL_REPOSITORIES.firstOrNull { it.id == "malisx2" }
        assertNotNull(malisx2Spec)
        assertEquals("bmdhacks/malisx2", malisx2Spec!!.repoPath)

        // Supported Mali v7-v12 (API >= 29, 64-bit, /dev/mali0) enables ONLY malisx2
        assertTrue(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("malisx2", AdrenoSubFamily.NON_ADRENO, malisx2Supported = true))
        assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("storm_driver", AdrenoSubFamily.NON_ADRENO, malisx2Supported = true))
        assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("kimchi", AdrenoSubFamily.NON_ADRENO, malisx2Supported = true))
        assertEquals(
            listOf("malisx2"),
            OnlineVulkanDriverRepository.getRecommendedRepoIdsFor(AdrenoSubFamily.NON_ADRENO, malisx2Supported = true),
        )
        assertEquals(
            "malisx2 (Arm Mali PanVK)",
            OnlineVulkanDriverRepository.getRecommendedDriverDisplayTitle(AdrenoSubFamily.NON_ADRENO, malisx2Supported = true),
        )

        // Unsupported Mali / non-Mali / Adreno exclude malisx2
        assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("malisx2", AdrenoSubFamily.NON_ADRENO, malisx2Supported = false))
        listOf(
            AdrenoSubFamily.ADRENO_6XX,
            AdrenoSubFamily.ADRENO_710_720,
            AdrenoSubFamily.ADRENO_7XX_MODERN,
            AdrenoSubFamily.ADRENO_8XX_ELITE,
            AdrenoSubFamily.ADRENO_840_PLUS,
        ).forEach { adrenoFamily ->
            assertFalse(OnlineVulkanDriverRepository.isRepoSupportedOnDevice("malisx2", adrenoFamily, malisx2Supported = true))
        }

        // Asset filtering accepts only malisx2-*.zip and ignores .tar.gz / .sha256 / non-malisx2 archives
        assertTrue(
            OnlineVulkanDriverRepository.isAssetSupportedOnDevice(
                repoId = "malisx2",
                releaseTitle = "malisx2 v1.0",
                releaseNotes = "",
                tagName = "v1.0",
                assetName = "malisx2-v1.0-arm64.zip",
                subFamily = AdrenoSubFamily.NON_ADRENO,
                malisx2Supported = true,
            )
        )
        listOf(
            "malisx2-v1.0-arm64.tar.gz",
            "malisx2-v1.0-arm64.zip.sha256",
            "malisx2-v1.0-arm64.sha256.zip",
            "Source code (zip)",
            "other-driver.zip",
        ).forEach { rejectedAsset ->
            assertFalse(
                "Asset $rejectedAsset must be rejected for malisx2",
                OnlineVulkanDriverRepository.isAssetSupportedOnDevice(
                    repoId = "malisx2",
                    releaseTitle = "malisx2 v1.0",
                    releaseNotes = "",
                    tagName = "v1.0",
                    assetName = rejectedAsset,
                    subFamily = AdrenoSubFamily.NON_ADRENO,
                    malisx2Supported = true,
                )
            )
        }
    }

    @Test
    fun audit42Rejects8xxFalsePositivesFromReleaseNotesOrAuroraAndDropsEmptyGroups() {
        // Release notes saying "no Adreno 840 support" or generic "aurora" must NOT match 8xx/840+
        assertFalse(
            OnlineVulkanDriverRepository.isAssetSupportedOnDevice(
                repoId = "balemuni",
                releaseTitle = "Balemuni Aurora Turnip",
                releaseNotes = "This build has no Adreno 840 support and no 8 Elite support.",
                tagName = "v25.0",
                assetName = "turnip_a6xx_a7xx.zip",
                subFamily = AdrenoSubFamily.ADRENO_840_PLUS,
            )
        )
        assertFalse(
            OnlineVulkanDriverRepository.isAssetSupportedOnDevice(
                repoId = "balemuni",
                releaseTitle = "Balemuni Aurora Turnip",
                releaseNotes = "Mentioning Adreno 830 / 840 in changelog: not supported yet.",
                tagName = "v25.0",
                assetName = "turnip_a6xx_a7xx.zip",
                subFamily = AdrenoSubFamily.ADRENO_8XX_ELITE,
            )
        )

        // Empty non-loading groups (including error groups with 0 releases) are filtered out, loading groups remain
        val groups = listOf(
            buildSampleGroup("kimchi", "KIMCHI", DriverRepoCategory.TURNIP, emptyList(), isLoading = false, error = "HTTP 403"),
            buildSampleGroup("mrpurple", "Mr. Purple", DriverRepoCategory.TURNIP, emptyList(), isLoading = false, error = null),
            buildSampleGroup("weabchan", "Weab-Chan", DriverRepoCategory.TURNIP, emptyList(), isLoading = true, error = null),
            buildSampleGroup(
                "storm_driver",
                "STORM DRIVER",
                DriverRepoCategory.STORM,
                listOf(releaseWithAsset("storm_driver", "STORM DRIVER 12.0.0", "12.0.0", "STORM_DRIVER_12.0.0.zip")),
                isLoading = false,
            ),
        )
        val filtered = OnlineVulkanDriverRepository.filterCompatibleGroups(groups, AdrenoSubFamily.ADRENO_7XX_MODERN)
        assertEquals(listOf("storm_driver", "weabchan"), filtered.map { it.spec.id })
    }
}
