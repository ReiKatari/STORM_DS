package defpackage;

import android.security.keystore.KeyGenParameterSpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eu3  reason: default package */
/* loaded from: classes.dex */
public abstract class eu3 {
    public static final KeyGenParameterSpec a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
