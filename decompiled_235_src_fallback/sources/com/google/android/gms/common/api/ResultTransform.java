package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> {
    public ResultTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.common.api.PendingResult<S> createFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zacp r0 = new com.google.android.gms.common.api.internal.zacp
            r0.<init>(r1)
            return r0
    }

    public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            return r1
    }

    public abstract com.google.android.gms.common.api.PendingResult<S> onSuccess(R r1);
}
