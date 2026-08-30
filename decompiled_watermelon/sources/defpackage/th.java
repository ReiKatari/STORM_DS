package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: th  reason: default package */
/* loaded from: classes.dex */
public final class th {
    public final String a = "offline_ra_ledger_signing_key_v1";

    public final KeyPair a() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        KeyStore.PrivateKeyEntry privateKeyEntry = null;
        keyStore.load(null);
        String str = this.a;
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
        }
        if (privateKeyEntry != null) {
            return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).build();
        build.getClass();
        keyPairGenerator.initialize(build);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        generateKeyPair.getClass();
        return generateKeyPair;
    }
}
