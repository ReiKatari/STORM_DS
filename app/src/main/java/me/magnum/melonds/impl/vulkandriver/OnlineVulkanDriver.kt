package me.magnum.melonds.impl.vulkandriver

import me.magnum.melonds.impl.AdrenoVulkanDriverSupport

data class OnlineVulkanDriver(
    val id: String,
    val name: String,
    val version: String,
    val releaseDate: String,
    val supportedGpuSeries: Set<AdrenoVulkanDriverSupport.GpuSeries>,
    val description: String,
    val downloadUrl: String,
    val fileSizeMb: Double,
    val isRecommended: Boolean = false,
) {
    val formattedReleaseDate: String
        get() {
            val parts = releaseDate.split("-")
            return if (parts.size == 3) {
                "${parts[2]}.${parts[1]}.${parts[0]}"
            } else {
                releaseDate
            }
        }
}
