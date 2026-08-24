package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi  reason: default package */
/* loaded from: classes.dex */
public final class fi {
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
