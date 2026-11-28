package me.magnum.melonds.sgw

import me.magnum.melonds.domain.model.rom.Rom

object SgwVersionMatcher {
    private val PAREN_OR_BRACKET = Regex("""\([^)]*\)|\[[^\]]*]""")
    private val EXPLICIT_VERSION_REGEX = Regex("""(?i)(?:^|[\s._\-\[\(])(?:v|ver|rev|build)[\s._-]*\d+(?:\.\d+)*""")
    private val EXTRACT_EXPLICIT_VERSION_REGEX = Regex("""(?i)(?:^|[\s._\-\[\(])(?:v|ver|rev)[\s._-]*(\d+(?:\.\d+)*)""")
    private val EXTRACT_DOTTED_VERSION_REGEX = Regex("""(?:^|[\s._\-\[\(])(\d+\.\d+(?:\.\d+)*)(?:$|[\s._\-\]\)])""")
    private val TRANSLATION_TAG_REGEX = Regex(
        """(?i)(?:^|[\s._\-\[\(\{+,/])(?:rus|ru|russian|rusub|перевод|русификатор|storm[\s._-]*team)(?:$|[\s._\-\]\)\}+,/])"""
    )
    private val CYRILLIC_REGEX = Regex("""[\u0400-\u04FF]""")

    fun normalizeTitle(rawTitle: String): String {
        val withoutExt = rawTitle.replace(Regex("""(?i)\.(nds|dsi|srl|zip|7z|rar)$"""), "")
        val strippedMeta = PAREN_OR_BRACKET.replace(withoutExt, " ")
        val withoutVer = EXPLICIT_VERSION_REGEX.replace(strippedMeta, " ")
        return withoutVer
            .lowercase()
            .replace(Regex("""[^\p{L}\p{N}]+"""), " ")
            .trim()
    }

    fun extractVersion(rawNameOrTitle: String): String? {
        val m = EXTRACT_EXPLICIT_VERSION_REGEX.find(rawNameOrTitle)
            ?: EXTRACT_DOTTED_VERSION_REGEX.find(rawNameOrTitle)
        return m?.groupValues?.getOrNull(1)?.trim()?.takeIf { it.isNotBlank() }
    }

    fun hasTranslationMarker(rawName: String): Boolean {
        return TRANSLATION_TAG_REGEX.containsMatchIn(rawName) || CYRILLIC_REGEX.containsMatchIn(rawName)
    }

    fun compareVersions(a: String?, b: String?): Int {
        val aParts = parseVersionParts(a)
        val bParts = parseVersionParts(b)
        if (aParts.isEmpty() && bParts.isEmpty()) return 0
        if (aParts.isEmpty()) return -1
        if (bParts.isEmpty()) return 1

        val len = maxOf(aParts.size, bParts.size)
        for (i in 0 until len) {
            val av = aParts.getOrElse(i) { 0 }
            val bv = bParts.getOrElse(i) { 0 }
            if (av != bv) return av.compareTo(bv)
        }
        return 0
    }

    fun isRemoteNewer(localVer: String?, remoteVer: String?): Boolean {
        if (parseVersionParts(remoteVer).isEmpty()) return false
        if (localVer.isNullOrBlank()) {
            return compareVersions("1.0", remoteVer) < 0
        }
        return compareVersions(localVer, remoteVer) < 0
    }

    private fun parseVersionParts(ver: String?): List<Int> {
        if (ver.isNullOrBlank()) return emptyList()
        val clean = ver.trim().removePrefix("v").removePrefix("V")
        return Regex("""\d+""").findAll(clean).mapNotNull { it.value.toIntOrNull() }.toList()
    }

    data class LocalRomDescriptor(
        val id: String,
        val name: String,
        val fileName: String,
        val customName: String? = null,
        val isShortcut: Boolean = false,
        val platform: SgwPlatform = SgwPlatform.NDS,
    )

    fun findUpdates(
        localRoms: List<Rom>,
        mainEntries: List<SgwGameEntry>,
        translationEntries: List<SgwGameEntry>,
    ): List<SgwUpdateCandidate> {
        if (localRoms.isEmpty()) return emptyList()
        val romById = HashMap<String, Rom>(localRoms.size)
        val descriptors = localRoms.mapIndexed { idx, rom ->
            val keyId = "$idx:${rom.fileName}"
            romById[keyId] = rom
            val localPlatform = if (rom.isDsiWareTitle || rom.fileName.endsWith(".dsi", ignoreCase = true)) {
                SgwPlatform.DSI
            } else {
                SgwPlatform.NDS
            }
            LocalRomDescriptor(
                id = keyId,
                name = rom.name,
                fileName = rom.fileName,
                customName = rom.config.customName,
                isShortcut = rom.isInstalledDsiWareShortcut,
                platform = localPlatform,
            )
        }
        return findUpdatesForDescriptors(descriptors, mainEntries, translationEntries)
            .mapNotNull { (desc, entry, reason, localVer) ->
                val rom = romById[desc.id] ?: return@mapNotNull null
                SgwUpdateCandidate(rom, localVer, entry, reason)
            }
    }

    data class DescriptorUpdateMatch(
        val descriptor: LocalRomDescriptor,
        val remoteEntry: SgwGameEntry,
        val reason: SgwUpdateReason,
        val localVersion: String?,
    )

    fun findUpdatesForDescriptors(
        descriptors: List<LocalRomDescriptor>,
        mainEntries: List<SgwGameEntry>,
        translationEntries: List<SgwGameEntry>,
    ): List<DescriptorUpdateMatch> {
        if (descriptors.isEmpty()) return emptyList()

        val mainByPlatformTitle = mainEntries.groupBy { it.platform to it.normalizedTitle }
        val transByPlatformTitle = translationEntries.groupBy { it.platform to it.normalizedTitle }
        val updates = ArrayList<DescriptorUpdateMatch>()

        for (desc in descriptors) {
            if (desc.isShortcut) continue
            val localDisplay = desc.customName?.takeIf { it.isNotBlank() } ?: desc.name
            val key = normalizeTitle(desc.fileName).ifBlank { normalizeTitle(localDisplay) }
            if (key.length < 2) continue

            val localVer = extractVersion(desc.fileName) ?: extractVersion(desc.name)
            val localTranslated = hasTranslationMarker(desc.fileName) || hasTranslationMarker(desc.name)

            val lookupKey = desc.platform to key
            val transMatch = transByPlatformTitle[lookupKey]?.maxWithOrNull { a, b -> compareVersions(a.version, b.version) }
            val mainMatch = mainByPlatformTitle[lookupKey]?.maxWithOrNull { a, b -> compareVersions(a.version, b.version) }

            val candidate = selectBestCandidate(desc, localVer, localTranslated, mainMatch, transMatch)
            if (candidate != null) {
                updates.add(candidate)
            }
        }
        return updates
    }

    private fun selectBestCandidate(
        desc: LocalRomDescriptor,
        localVer: String?,
        localTranslated: Boolean,
        mainMatch: SgwGameEntry?,
        transMatch: SgwGameEntry?,
    ): DescriptorUpdateMatch? {
        if (transMatch != null) {
            if (!localTranslated) {
                return DescriptorUpdateMatch(desc, transMatch, SgwUpdateReason.RUSSIAN_TRANSLATION_AVAILABLE, localVer)
            }
            if (isRemoteNewer(localVer, transMatch.version)) {
                return DescriptorUpdateMatch(desc, transMatch, SgwUpdateReason.TRANSLATION_UPDATE, localVer)
            }
        }
        if (mainMatch != null) {
            if (isRemoteNewer(localVer, mainMatch.version)) {
                return DescriptorUpdateMatch(desc, mainMatch, SgwUpdateReason.NEWER_VERSION, localVer)
            }
        }
        return null
    }
}
