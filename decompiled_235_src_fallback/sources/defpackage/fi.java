package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi  reason: default package */
/* loaded from: classes.dex */
public final class fi {
    public final java.lang.String a;

    public fi() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "offline_ra_ledger_signing_key_v1"
            r1.a = r0
            return
    }

    public final java.security.KeyPair a() {
            r4 = this;
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)
            r2 = 0
            r1.load(r2)
            java.lang.String r4 = r4.a
            java.security.KeyStore$Entry r1 = r1.getEntry(r4, r2)
            boolean r3 = r1 instanceof java.security.KeyStore.PrivateKeyEntry
            if (r3 == 0) goto L17
            r2 = r1
            java.security.KeyStore$PrivateKeyEntry r2 = (java.security.KeyStore.PrivateKeyEntry) r2
        L17:
            if (r2 == 0) goto L2b
            java.security.KeyPair r4 = new java.security.KeyPair
            java.security.cert.Certificate r0 = r2.getCertificate()
            java.security.PublicKey r0 = r0.getPublicKey()
            java.security.PrivateKey r1 = r2.getPrivateKey()
            r4.<init>(r0, r1)
            return r4
        L2b:
            java.lang.String r1 = "EC"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r1, r0)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 12
            r1.<init>(r4, r2)
            java.lang.String r4 = "SHA-256"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r1.setDigests(r4)
            java.security.spec.ECGenParameterSpec r1 = new java.security.spec.ECGenParameterSpec
            java.lang.String r2 = "secp256r1"
            r1.<init>(r2)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setAlgorithmParameterSpec(r1)
            android.security.keystore.KeyGenParameterSpec r4 = r4.build()
            r4.getClass()
            r0.initialize(r4)
            java.security.KeyPair r4 = r0.generateKeyPair()
            r4.getClass()
            return r4
    }
}
