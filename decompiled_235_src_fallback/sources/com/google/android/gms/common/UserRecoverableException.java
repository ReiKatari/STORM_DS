package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(java.lang.String r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r1.zza
            r0.<init>(r1)
            return r0
    }
}
