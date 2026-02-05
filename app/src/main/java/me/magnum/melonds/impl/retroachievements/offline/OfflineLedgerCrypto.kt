package me.magnum.melonds.impl.retroachievements.offline

import kotlinx.serialization.protobuf.ProtoBuf
import java.security.MessageDigest

object OfflineLedgerCodec {
    val proto: ProtoBuf = ProtoBuf {
        encodeDefaults = true
    }

    fun encodeFile(file: OfflineLedgerFile): ByteArray {
        return proto.encodeToByteArray(OfflineLedgerFile.serializer(), file)
    }

    fun decodeFile(bytes: ByteArray): OfflineLedgerFile {
        return proto.decodeFromByteArray(OfflineLedgerFile.serializer(), bytes)
    }

    fun encodePayload(payload: OfflineLedgerPayload): ByteArray {
        return proto.encodeToByteArray(OfflineLedgerPayload.serializer(), payload)
    }
}

fun sha256(bytes: ByteArray): ByteArray {
    return MessageDigest.getInstance("SHA-256").digest(bytes)
}

fun sha256Hex(bytes: ByteArray): String {
    return sha256(bytes).toHexString()
}

fun ByteArray.toHexString(): String {
    return joinToString(separator = "") { "%02x".format(it.toInt() and 0xff) }
}

interface OfflineLedgerSigner {
    fun sign(payloadHash: ByteArray): ByteArray
    fun verify(payloadHash: ByteArray, signature: ByteArray): Boolean
}
