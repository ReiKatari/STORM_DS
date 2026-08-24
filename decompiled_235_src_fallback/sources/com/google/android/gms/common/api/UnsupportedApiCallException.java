package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature zza;

    public UnsupportedApiCallException(com.google.android.gms.common.Feature r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            com.google.android.gms.common.Feature r1 = r1.zza
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Missing "
            java.lang.String r1 = r0.concat(r1)
            return r1
    }
}
