package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    public Response(T r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public T getResult() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.zza
            return r0
    }

    public void setResult(T r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
