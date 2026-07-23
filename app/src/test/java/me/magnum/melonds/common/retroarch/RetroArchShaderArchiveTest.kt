package me.magnum.melonds.common.retroarch

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class RetroArchShaderArchiveTest {

    @get:Rule
    val temporaryFolder = TemporaryFolder()

    private fun createZip(name: String, entries: Map<String, String>): File {
        val zipFile = temporaryFolder.newFile(name)
        ZipOutputStream(zipFile.outputStream()).use { zip ->
            entries.forEach { (entryName, content) ->
                zip.putNextEntry(ZipEntry(entryName))
                zip.write(content.toByteArray())
                zip.closeEntry()
            }
        }
        return zipFile
    }

    @Test
    fun `extracts the whole tree and reports progress`() = runTest {
        val zip = createZip(
            "shaders.zip",
            mapOf(
                "shaders_slang/crt/crt-lottes.slangp" to "shader0 = crt-lottes.slang",
                "shaders_slang/crt/crt-lottes.slang" to "// shader",
            ),
        )
        val destination = File(temporaryFolder.root, "pending")

        var lastDone = 0
        var lastTotal = 0
        RetroArchShaderArchive.extract(zip, destination) { done, total ->
            lastDone = done
            lastTotal = total
        }

        assertTrue(File(destination, "shaders_slang/crt/crt-lottes.slangp").isFile)
        assertTrue(File(destination, "shaders_slang/crt/crt-lottes.slang").isFile)
        assertEquals(2, lastTotal)
        assertEquals(2, lastDone)
    }

    @Test
    fun `rejects entries that escape the destination`() = runTest {
        val zip = createZip("evil.zip", mapOf("../../evil.txt" to "pwned"))
        val destination = File(temporaryFolder.root, "pending")

        val failed = runCatching {
            RetroArchShaderArchive.extract(zip, destination) { _, _ -> }
        }.exceptionOrNull()

        assertTrue(failed is RetroArchShaderArchive.InvalidArchiveException)
        assertFalse(File(temporaryFolder.root, "evil.txt").exists())
        assertFalse(File(temporaryFolder.root.parentFile, "evil.txt").exists())
    }

    @Test
    fun `a corrupt archive fails before writing anything`() = runTest {
        val notAZip = temporaryFolder.newFile("broken.zip").apply { writeText("this is not a zip") }
        val destination = File(temporaryFolder.root, "pending")

        val failed = runCatching {
            RetroArchShaderArchive.extract(notAZip, destination) { _, _ -> }
        }.exceptionOrNull()

        assertTrue(failed is RetroArchShaderArchive.InvalidArchiveException)
        assertEquals(0, destination.listFiles()?.size ?: 0)
    }

    @Test
    fun `detects a single top level directory`() {
        val root = temporaryFolder.newFolder("collapse")
        File(root, "shaders_slang/crt").mkdirs()

        assertEquals("shaders_slang", RetroArchShaderArchive.detectRootSubdirectory(root))
    }

    @Test
    fun `does not collapse when the tree is already at the top level`() {
        val root = temporaryFolder.newFolder("flat")
        File(root, "crt").mkdirs()
        File(root, "handheld").mkdirs()

        assertNull(RetroArchShaderArchive.detectRootSubdirectory(root))
    }

    @Test
    fun `does not collapse when files sit next to the directory`() {
        val root = temporaryFolder.newFolder("mixed")
        File(root, "shaders_slang").mkdirs()
        File(root, "README.md").writeText("readme")

        assertNull(RetroArchShaderArchive.detectRootSubdirectory(root))
    }
}
