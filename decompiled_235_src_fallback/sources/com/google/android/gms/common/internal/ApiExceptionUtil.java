package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ApiExceptionUtil {
    public ApiExceptionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.api.ApiException fromStatus(com.google.android.gms.common.api.Status r1) {
            boolean r0 = r1.hasResolution()
            if (r0 == 0) goto Lc
            com.google.android.gms.common.api.ResolvableApiException r0 = new com.google.android.gms.common.api.ResolvableApiException
            r0.<init>(r1)
            return r0
        Lc:
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            r0.<init>(r1)
            return r0
    }
}
