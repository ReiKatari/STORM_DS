package me.magnum.melonds

import me.magnum.melonds.domain.model.Version
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class VersionTest {
    @Test
    fun testEqualVersions() {
        val version1 = Version(Version.ReleaseType.ALPHA, 1, 1, 0)
        val version2 = Version(Version.ReleaseType.ALPHA, 1, 1, 0)

        assert(version1 == version2)
    }

    @Test
    fun testPatchDifference() {
        val lowest = Version(Version.ReleaseType.ALPHA, 1, 1, 0)
        val highest = Version(Version.ReleaseType.ALPHA, 1, 1, 1)

        assert(lowest < highest)
    }

    @Test
    fun testMinorDifference() {
        val lowest = Version(Version.ReleaseType.ALPHA, 1, 0, 1)
        val highest = Version(Version.ReleaseType.ALPHA, 1, 1, 0)

        assert(lowest < highest)
    }

    @Test
    fun testMajorDifference() {
        val lowest = Version(Version.ReleaseType.ALPHA, 1, 1, 1)
        val highest = Version(Version.ReleaseType.ALPHA, 2, 0, 0)

        assert(lowest < highest)
    }

    @Test
    fun testReleaseTypeDifference() {
        val alpha = Version(Version.ReleaseType.ALPHA, 1, 0, 0)
        val beta = Version(Version.ReleaseType.BETA, 1, 0, 0)
        val rc = Version(Version.ReleaseType.RC, 1, 0, 0, 1)
        val final = Version(Version.ReleaseType.FINAL, 1, 0, 0)

        assert(alpha < beta)
        assert(beta < rc)
        assert(rc < final)
    }

    @Test
    fun testAlphaToString() {
        val version = Version(Version.ReleaseType.ALPHA, 1, 0, 0)

        assertEquals("alpha-1.0.0", version.toString())
    }

    @Test
    fun testBetaToString() {
        val version = Version(Version.ReleaseType.BETA, 1, 0, 0)

        assertEquals("beta-1.0.0", version.toString())
    }

    @Test
    fun testFinalToString() {
        val version = Version(Version.ReleaseType.FINAL, 1, 0, 0)

        assertEquals("1.0.0", version.toString())
    }

    @Test
    fun testAlphaFromString() {
        val version = Version.fromString("alpha-1.2.3")

        assertEquals(Version.ReleaseType.ALPHA, version.type)
        assertEquals(1, version.major)
        assertEquals(2, version.minor)
        assertEquals(3, version.patch)
    }

    @Test
    fun testBetaFromString() {
        val version = Version.fromString("beta-3.2.1")

        assertEquals(Version.ReleaseType.BETA, version.type)
        assertEquals(3, version.major)
        assertEquals(2, version.minor)
        assertEquals(1, version.patch)
    }

    @Test
    fun testFinalFromString() {
        val version = Version.fromString("1.2.3")

        assertEquals(Version.ReleaseType.FINAL, version.type)
        assertEquals(1, version.major)
        assertEquals(2, version.minor)
        assertEquals(3, version.patch)
    }

    @Test
    fun testNightlyFromString() {
        val version = Version.fromString("nightly-release")

        assertEquals(Version.Nightly, version)
    }

    @Test
    fun testInvalidFromString() {
        try {
            Version.fromString("wrong-1.2.3")
            fail("Did not throw")
        } catch (e: Exception) {
        }
    }

    @Test
    fun parsesForkVersionFormats() {
        assertEquals(Version(Version.ReleaseType.FINAL, 1, 2, 3), Version.fromString("v1.2.3"))
        assertEquals(Version(Version.ReleaseType.RC, 1, 2, 3, 4), Version.fromString("1.2.3-rc4"))
        assertEquals(Version(Version.ReleaseType.RC, 1, 2, 3, 4), Version.fromString("1.2.3.rc4"))
        assertEquals(Version(Version.ReleaseType.BETA, 1, 2, 3, 2), Version.fromString("1.2.3-beta2"))
        assertEquals(Version(Version.ReleaseType.ALPHA, 1, 2, 3, 7), Version.fromString("1.2.3-alpha7"))
        assertEquals(Version(Version.ReleaseType.RC, 1, 2, 3, 3, 1), Version.fromString("1.2.3.rc3.fix"))
        assertEquals(Version(Version.ReleaseType.RC, 1, 2, 3, 3, 2), Version.fromString("1.2.3.rc3.fix2"))
    }

    @Test
    fun comparesBaseVersionBeforePrereleaseRank() {
        val newerBaseAlpha = Version.fromString("2.0.0-alpha1")
        val olderStable = Version.fromString("1.9.9")
        assert(newerBaseAlpha > olderStable)
        assert(Version.fromString("2.0.0") > Version.fromString("2.0.0-rc9"))
    }
}
