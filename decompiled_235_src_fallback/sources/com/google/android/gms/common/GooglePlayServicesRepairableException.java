package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int r1, java.lang.String r2, android.content.Intent r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.zza = r1
            return
    }

    public int getConnectionStatusCode() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }
}
