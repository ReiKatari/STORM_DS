package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public ResultCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onFailure(com.google.android.gms.common.api.Status r1);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r3) {
            r2 = this;
            com.google.android.gms.common.api.Status r0 = r3.getStatus()
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto Le
            r2.onSuccess(r3)
            return
        Le:
            r2.onFailure(r0)
            boolean r2 = r3 instanceof com.google.android.gms.common.api.Releasable
            if (r2 == 0) goto L2c
            r2 = r3
            com.google.android.gms.common.api.Releasable r2 = (com.google.android.gms.common.api.Releasable) r2     // Catch: java.lang.RuntimeException -> L1c
            r2.release()     // Catch: java.lang.RuntimeException -> L1c
            return
        L1c:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "ResultCallbacks"
            java.lang.String r1 = "Unable to release "
            java.lang.String r3 = r1.concat(r3)
            android.util.Log.w(r0, r3, r2)
        L2c:
            return
    }

    public abstract void onSuccess(R r1);
}
