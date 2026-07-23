package me.magnum.melonds.common.retroarch

import me.magnum.melonds.domain.model.RetroArchShaderSource
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class RetroArchShaderRootResolverTest {

    @Test
    fun `explicit preference wins over everything else`() {
        assertEquals(
            RetroArchShaderSource.INTERNAL,
            RetroArchShaderRootResolver.resolveSource("internal", hasPickedFolder = true, hasInternalInstall = false),
        )
        assertEquals(
            RetroArchShaderSource.FOLDER,
            RetroArchShaderRootResolver.resolveSource("folder", hasPickedFolder = false, hasInternalInstall = true),
        )
    }

    @Test
    fun `existing folder users are migrated without touching anything`() {
        assertEquals(
            RetroArchShaderSource.FOLDER,
            RetroArchShaderRootResolver.resolveSource(null, hasPickedFolder = true, hasInternalInstall = false),
        )
    }

    @Test
    fun `a picked folder takes precedence over an install when nothing was chosen`() {
        assertEquals(
            RetroArchShaderSource.FOLDER,
            RetroArchShaderRootResolver.resolveSource(null, hasPickedFolder = true, hasInternalInstall = true),
        )
    }

    @Test
    fun `an install alone resolves to the internal library`() {
        assertEquals(
            RetroArchShaderSource.INTERNAL,
            RetroArchShaderRootResolver.resolveSource(null, hasPickedFolder = false, hasInternalInstall = true),
        )
    }

    @Test
    fun `nothing configured returns null so the chooser is shown`() {
        assertNull(RetroArchShaderRootResolver.resolveSource(null, hasPickedFolder = false, hasInternalInstall = false))
    }

    @Test
    fun `an unrecognised preference value falls through to the other rules`() {
        assertEquals(
            RetroArchShaderSource.FOLDER,
            RetroArchShaderRootResolver.resolveSource("nonsense", hasPickedFolder = true, hasInternalInstall = false),
        )
        assertNull(
            RetroArchShaderRootResolver.resolveSource("nonsense", hasPickedFolder = false, hasInternalInstall = false),
        )
    }

    @Test
    fun `an explicit choice survives its library going missing`() {
        assertEquals(
            RetroArchShaderSource.INTERNAL,
            RetroArchShaderRootResolver.resolveSource("internal", hasPickedFolder = false, hasInternalInstall = false),
        )
    }
}
