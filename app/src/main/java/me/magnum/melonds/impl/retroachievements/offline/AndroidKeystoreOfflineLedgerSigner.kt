package me.magnum.melonds.impl.retroachievements.offline

import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import java.security.KeyPairGenerator
import java.security.KeyStore
import java.security.Signature
import java.security.spec.ECGenParameterSpec

class AndroidKeystoreOfflineLedgerSigner(
    private val keyAlias: String = DEFAULT_KEY_ALIAS,
) : OfflineLedgerSigner {

    companion object {
        const val DEFAULT_KEY_ALIAS = "offline_ra_ledger_signing_key_v1"
        private const val ANDROID_KEYSTORE = "AndroidKeyStore"
        private const val KEY_ALGORITHM = KeyProperties.KEY_ALGORITHM_EC
        private const val SIGNATURE_ALGORITHM = "SHA256withECDSA"
        private const val EC_CURVE = "secp256r1"
    }

    override fun sign(payloadHash: ByteArray): ByteArray {
        val privateKey = ensureKeyPair().private
        val signature = Signature.getInstance(SIGNATURE_ALGORITHM)
        signature.initSign(privateKey)
        signature.update(payloadHash)
        return signature.sign()
    }

    override fun verify(payloadHash: ByteArray, signature: ByteArray): Boolean {
        val publicKey = ensureKeyPair().public
        val verifier = Signature.getInstance(SIGNATURE_ALGORITHM)
        verifier.initVerify(publicKey)
        verifier.update(payloadHash)
        return verifier.verify(signature)
    }

    private fun ensureKeyPair(): java.security.KeyPair {
        val keyStore = KeyStore.getInstance(ANDROID_KEYSTORE).apply { load(null) }
        val existingEntry = keyStore.getEntry(keyAlias, null) as? KeyStore.PrivateKeyEntry
        if (existingEntry != null) {
            return java.security.KeyPair(existingEntry.certificate.publicKey, existingEntry.privateKey)
        }

        val keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM, ANDROID_KEYSTORE)
        val parameterSpec = KeyGenParameterSpec.Builder(
            keyAlias,
            KeyProperties.PURPOSE_SIGN or KeyProperties.PURPOSE_VERIFY,
        )
            .setDigests(KeyProperties.DIGEST_SHA256)
            .setAlgorithmParameterSpec(ECGenParameterSpec(EC_CURVE))
            .build()

        keyPairGenerator.initialize(parameterSpec)
        return keyPairGenerator.generateKeyPair()
    }
}

