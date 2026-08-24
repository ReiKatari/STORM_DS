package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response(T t) {
        this.zza = t;
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t) {
        this.zza = t;
    }

    public Response() {
    }
}
