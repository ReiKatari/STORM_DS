package me.magnum.melonds.impl

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.File

class VulkanPresenterSpirvTest {

    private fun resolveRepoFile(relativePath: String): File {
        val cwd = File(System.getProperty("user.dir") ?: ".")
        val direct = File(cwd, relativePath)
        if (direct.isFile) return direct
        val parent = cwd.parentFile
        if (parent != null) {
            val fromParent = File(parent, relativePath)
            if (fromParent.isFile) return fromParent
        }
        error("Unable to locate $relativePath from ${cwd.absolutePath}")
    }

    private fun parseSpirvBytesFromHeader(file: File): IntArray {
        val text = file.readText(Charsets.UTF_8)
        val hexRegex = Regex("0x([0-9a-fA-F]{2})")
        val out = ByteArrayOutputStream()
        for (match in hexRegex.findAll(text)) {
            out.write(match.groupValues[1].toInt(16))
        }
        val bytes = out.toByteArray()
        assertTrue("${file.name} should be 4-byte aligned SPIR-V", bytes.size >= 20 && bytes.size % 4 == 0)
        val words = IntArray(bytes.size / 4)
        for (i in words.indices) {
            val b0 = bytes[i * 4].toInt() and 0xFF
            val b1 = bytes[i * 4 + 1].toInt() and 0xFF
            val b2 = bytes[i * 4 + 2].toInt() and 0xFF
            val b3 = bytes[i * 4 + 3].toInt() and 0xFF
            words[i] = b0 or (b1 shl 8) or (b2 shl 16) or (b3 shl 24)
        }
        return words
    }

    private fun countFunctions(words: IntArray): Int {
        var funcs = 0
        var i = 5
        while (i < words.size) {
            val wc = words[i] ushr 16
            val op = words[i] and 0xFFFF
            assertTrue("Invalid SPIR-V wordCount=0 at word $i", wc > 0)
            if (op == 54) funcs++
            i += wc
        }
        return funcs
    }

    @Test
    fun primaryPresenterFragSpirv_isCompactMultiFunctionSpirv10() {
        val header = resolveRepoFile("app/src/main/cpp/renderer/VulkanSurfacePresenterFragmentShaderData.h")
        val words = parseSpirvBytesFromHeader(header)

        assertTrue("Expected SPIR-V magic 0x07230203", words[0] == 0x07230203)
        assertTrue("Expected SPIR-V 1.0 (0x00010000), got 0x${words[1].toString(16)}", words[1] == 0x00010000)

        val bound = words[3]
        assertTrue("Adreno 619 requires SPIR-V bound < 65535, got $bound", bound in 1 until 65535)

        val funcs = countFunctions(words)
        assertTrue("Expected non-inlined multi-function SPIR-V (>1 OpFunction), got $funcs", funcs > 1)
    }

    @Test
    fun fallbackPresenterFragSpirv_isLightweightAndMinimal() {
        val header = resolveRepoFile("app/src/main/cpp/renderer/VulkanSurfacePresenterFallbackFragmentShaderData.h")
        val words = parseSpirvBytesFromHeader(header)
        val byteSize = words.size * 4

        assertTrue("Expected SPIR-V magic 0x07230203", words[0] == 0x07230203)
        assertTrue("Expected SPIR-V 1.0 (0x00010000), got 0x${words[1].toString(16)}", words[1] == 0x00010000)

        val bound = words[3]
        assertTrue("Fallback presenter SPIR-V bound must stay < 1000, got $bound", bound in 1 until 1000)
        assertTrue("Fallback presenter SPIR-V size must stay < 32768 bytes, got $byteSize", byteSize < 32768)
    }

    @Test
    fun surfacePresenterCpp_omitsDeadStorageBindingsAndWiresFallbackShader() {
        val cpp = resolveRepoFile("app/src/main/cpp/renderer/VulkanSurfacePresenter.cpp").readText(Charsets.UTF_8)
        val start = cpp.indexOf("bool VulkanSurfacePresenter::createCommonResources()")
        val end = cpp.indexOf("void VulkanSurfacePresenter::destroyCommonResources()")
        assertTrue("Could not locate createCommonResources()", start >= 0 && end > start)

        val createBlock = cpp.substring(start, end)
        assertFalse("Unused binding 7 must not be declared", createBlock.contains(".binding = 7"))
        assertFalse("Unused binding 8 must not be declared", createBlock.contains(".binding = 8"))
        assertFalse("Unused binding 9 must not be declared", createBlock.contains(".binding = 9"))
        assertFalse("Unused binding 10 must not be declared", createBlock.contains(".binding = 10"))
        assertTrue("Fallback fragment shader must be created", createBlock.contains("fallbackFragmentShaderModule"))
    }
}
