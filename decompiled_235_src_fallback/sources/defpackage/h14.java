package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h14  reason: default package */
/* loaded from: classes.dex */
public abstract class h14 {
    public static final android.security.keystore.KeyGenParameterSpec a = null;

    static {
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r1 = 3
            java.lang.String r2 = "_androidx_security_master_key_"
            r0.<init>(r2, r1)
            java.lang.String r1 = "GCM"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r1)
            java.lang.String r1 = "NoPadding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r1)
            r1 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r1)
            android.security.keystore.KeyGenParameterSpec r0 = r0.build()
            defpackage.h14.a = r0
            return
    }
}
