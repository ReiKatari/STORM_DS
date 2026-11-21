package me.magnum.melonds.impl.vulkandriver

enum class DriverRepoCategory {
    ALL,
    STORM,
    TURNIP,
    QUALCOMM_8XX,
    ADRENO_710,
}

data class VulkanDriverRepoSpec(
    val id: String,
    val displayName: String,
    val repoPath: String,
    val category: DriverRepoCategory,
    val useTagName: Boolean,
    val sortByPublishTime: Boolean,
)

data class VulkanDriverAsset(
    val name: String,
    val downloadUrl: String,
    val sizeBytes: Long,
    val mirrorUrls: List<String> = emptyList(),
) {
    fun allUrls(): List<String> = (listOf(downloadUrl) + mirrorUrls).filter { it.isNotBlank() }.distinct()
}

data class VulkanDriverRelease(
    val id: String,
    val repoId: String,
    val repoDisplayName: String,
    val title: String,
    val tagName: String,
    val publishedAt: String,
    val releaseNotes: String,
    val assets: List<VulkanDriverAsset>,
    val isFromOfflineFallback: Boolean = false,
)

data class VulkanDriverRepoGroup(
    val spec: VulkanDriverRepoSpec,
    val releases: List<VulkanDriverRelease> = emptyList(),
    val isLoading: Boolean = false,
    val fromCache: Boolean = false,
    val error: String? = null,
)
