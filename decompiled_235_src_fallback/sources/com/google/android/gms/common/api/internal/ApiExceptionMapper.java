package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    public ApiExceptionMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final java.lang.Exception getException(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiException r0 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            return r0
    }
}
