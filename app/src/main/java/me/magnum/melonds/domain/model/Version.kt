package me.magnum.melonds.domain.model

data class Version(
    val type: ReleaseType,
    val major: Int,
    val minor: Int,
    val patch: Int,
    val qualifierNumber: Int = 0,
    val revisionNumber: Int = 0,
) : Comparable<Version> {
    enum class ReleaseType {
        ALPHA,
        BETA,
        RC,
        FINAL,
        NIGHTLY,
    }

    companion object {
        val Nightly = Version(ReleaseType.NIGHTLY, -1, -1, -1)

        private val standardPattern = Regex(
            """^v?(\d+)\.(\d+)\.(\d+)(?:[-.](alpha|beta|rc)(?:[-.]?(\d+))?)?(?:[-.]fix(\d*))?$""",
            RegexOption.IGNORE_CASE,
        )
        private val legacyPattern = Regex(
            """^(alpha|beta|rc)-v?(\d+)\.(\d+)\.(\d+)(?:[-.]?(\d+))?$""",
            RegexOption.IGNORE_CASE,
        )

        fun fromString(versionString: String): Version {
            val normalized = versionString.trim()
            if (normalized.equals("nightly", true) || normalized.equals("nightly-release", true)) {
                return Nightly
            }

            standardPattern.matchEntire(normalized)?.let { match ->
                val qualifier = match.groupValues[4]
                return Version(
                    type = qualifier.toReleaseType(),
                    major = match.groupValues[1].toInt(),
                    minor = match.groupValues[2].toInt(),
                    patch = match.groupValues[3].toInt(),
                    qualifierNumber = match.groupValues[5].toIntOrNull() ?: 0,
                    revisionNumber = match.groupValues[6].let {
                        when {
                            it.isEmpty() && normalized.endsWith(".fix", true) -> 1
                            it.isEmpty() -> 0
                            else -> it.toInt()
                        }
                    },
                )
            }

            legacyPattern.matchEntire(normalized)?.let { match ->
                return Version(
                    type = match.groupValues[1].toReleaseType(),
                    major = match.groupValues[2].toInt(),
                    minor = match.groupValues[3].toInt(),
                    patch = match.groupValues[4].toInt(),
                    qualifierNumber = match.groupValues[5].toIntOrNull() ?: 0,
                )
            }

            throw IllegalArgumentException("Invalid version string: $versionString")
        }

        fun parseOrNull(versionString: String?): Version? {
            return versionString?.let { runCatching { fromString(it) }.getOrNull() }
        }

        private fun String.toReleaseType(): ReleaseType = when (lowercase()) {
            "" -> ReleaseType.FINAL
            "alpha" -> ReleaseType.ALPHA
            "beta" -> ReleaseType.BETA
            "rc" -> ReleaseType.RC
            else -> throw IllegalArgumentException("Unknown release qualifier: $this")
        }
    }

    override fun compareTo(other: Version): Int {
        if (type == ReleaseType.NIGHTLY || other.type == ReleaseType.NIGHTLY) {
            return when {
                type == other.type -> 0
                type == ReleaseType.NIGHTLY -> -1
                else -> 1
            }
        }

        compareValuesBy(this, other, Version::major, Version::minor, Version::patch)
            .takeIf { it != 0 }
            ?.let { return it }

        val typeComparison = releaseRank(type).compareTo(releaseRank(other.type))
        if (typeComparison != 0) return typeComparison
        val qualifierComparison = qualifierNumber.compareTo(other.qualifierNumber)
        if (qualifierComparison != 0) return qualifierComparison
        return revisionNumber.compareTo(other.revisionNumber)
    }

    override fun toString(): String {
        return when (type) {
            ReleaseType.NIGHTLY -> "nightly"
            ReleaseType.FINAL -> "$major.$minor.$patch"
            ReleaseType.ALPHA -> legacyOrNumbered("alpha") + revisionSuffix()
            ReleaseType.BETA -> legacyOrNumbered("beta") + revisionSuffix()
            ReleaseType.RC -> "$major.$minor.$patch-rc$qualifierNumber${revisionSuffix()}"
        }
    }

    private fun legacyOrNumbered(label: String): String {
        return if (qualifierNumber == 0) {
            "$label-$major.$minor.$patch"
        } else {
            "$major.$minor.$patch-$label$qualifierNumber"
        }
    }

    fun isSameArtifactVersion(other: Version): Boolean {
        return type == other.type &&
            major == other.major &&
            minor == other.minor &&
            patch == other.patch &&
            qualifierNumber == other.qualifierNumber
    }

    private fun revisionSuffix(): String = when (revisionNumber) {
        0 -> ""
        1 -> ".fix"
        else -> ".fix$revisionNumber"
    }

    private fun releaseRank(type: ReleaseType): Int = when (type) {
        ReleaseType.ALPHA -> 0
        ReleaseType.BETA -> 1
        ReleaseType.RC -> 2
        ReleaseType.FINAL -> 3
        ReleaseType.NIGHTLY -> -1
    }
}
