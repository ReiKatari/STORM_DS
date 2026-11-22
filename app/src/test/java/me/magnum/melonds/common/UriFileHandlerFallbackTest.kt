package me.magnum.melonds.common

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class UriFileHandlerFallbackTest {

    private class FakeDescriptor(val fd: Int) {
        var truncated = false
        var closed = false
        var detached = false
    }

    @Test
    fun resolveWriteModes_cascadesTruncatingModesInOrder() {
        assertEquals(listOf("wt", "rwt", "rw"), UriFileHandler.resolveWriteModes("wt"))
        assertEquals(listOf("rwt", "rw"), UriFileHandler.resolveWriteModes("rwt"))
        assertEquals(listOf("w"), UriFileHandler.resolveWriteModes("w"))
        assertEquals(listOf("wa"), UriFileHandler.resolveWriteModes("wa"))
        assertEquals(listOf("r"), UriFileHandler.resolveWriteModes("r"))
    }

    @Test
    fun openSafFileDescriptorWithFallback_returnsDirectlyWhenWtSucceeds() {
        val attempted = mutableListOf<String>()
        val descriptor = FakeDescriptor(11)

        val fd = UriFileHandler.openSafFileDescriptorWithFallback(
            requestedMode = "wt",
            openDescriptor = { mode ->
                attempted.add(mode)
                descriptor
            },
            truncateDescriptor = { it.truncated = true },
            closeDescriptor = { it.closed = true },
            detachDescriptor = {
                it.detached = true
                it.fd
            },
        )

        assertEquals(11, fd)
        assertEquals(listOf("wt"), attempted)
        assertTrue(descriptor.detached)
        assertEquals(false, descriptor.truncated)
        assertEquals(false, descriptor.closed)
    }

    @Test
    fun openSafFileDescriptorWithFallback_fallsBackFromWtToRwtWithoutManualTruncate() {
        val attempted = mutableListOf<String>()
        val descriptor = FakeDescriptor(22)

        val fd = UriFileHandler.openSafFileDescriptorWithFallback(
            requestedMode = "wt",
            openDescriptor = { mode ->
                attempted.add(mode)
                if (mode == "wt") throw IllegalArgumentException("wt unsupported")
                descriptor
            },
            truncateDescriptor = { it.truncated = true },
            closeDescriptor = { it.closed = true },
            detachDescriptor = {
                it.detached = true
                it.fd
            },
        )

        assertEquals(22, fd)
        assertEquals(listOf("wt", "rwt"), attempted)
        assertTrue(descriptor.detached)
        assertEquals(false, descriptor.truncated)
    }

    @Test
    fun openSafFileDescriptorWithFallback_fallsBackToRwAndTruncatesBeforeDetach() {
        val attempted = mutableListOf<String>()
        val events = mutableListOf<String>()
        val descriptor = FakeDescriptor(33)

        val fd = UriFileHandler.openSafFileDescriptorWithFallback(
            requestedMode = "wt",
            openDescriptor = { mode ->
                attempted.add(mode)
                when (mode) {
                    "wt" -> throw IllegalArgumentException("wt unsupported")
                    "rwt" -> null
                    "rw" -> descriptor
                    else -> null
                }
            },
            truncateDescriptor = {
                it.truncated = true
                events.add("truncate")
            },
            closeDescriptor = {
                it.closed = true
                events.add("close")
            },
            detachDescriptor = {
                it.detached = true
                events.add("detach")
                it.fd
            },
        )

        assertEquals(33, fd)
        assertEquals(listOf("wt", "rwt", "rw"), attempted)
        assertEquals(listOf("truncate", "detach"), events)
        assertTrue(descriptor.truncated)
        assertTrue(descriptor.detached)
        assertEquals(false, descriptor.closed)
    }

    @Test
    fun openSafFileDescriptorWithFallback_closesDescriptorIfTruncateFails() {
        val descriptor = FakeDescriptor(44)

        val fd = UriFileHandler.openSafFileDescriptorWithFallback(
            requestedMode = "rwt",
            openDescriptor = { mode ->
                if (mode == "rwt") null else descriptor
            },
            truncateDescriptor = { throw IllegalStateException("ftruncate failed") },
            closeDescriptor = { it.closed = true },
            detachDescriptor = { it.fd },
        )

        assertNull(fd)
        assertTrue(descriptor.closed)
    }
}
