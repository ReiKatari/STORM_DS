package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class OptionalPendingResultImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.OptionalPendingResult<R> {
    private final com.google.android.gms.common.api.internal.BasePendingResult zaa;

    public OptionalPendingResultImpl(com.google.android.gms.common.api.PendingResult r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.api.internal.BasePendingResult r1 = (com.google.android.gms.common.api.internal.BasePendingResult) r1
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            r0.addStatusListener(r1)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            com.google.android.gms.common.api.Result r0 = r0.await()
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            com.google.android.gms.common.api.Result r0 = r0.await(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            r0.cancel()
            return
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final R get() {
            r3 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r3.zaa
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L13
            com.google.android.gms.common.api.internal.BasePendingResult r3 = r3.zaa
            r0 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.gms.common.api.Result r3 = r3.await(r0, r2)
            return r3
        L13:
            java.lang.String r3 = "Result is not available. Check that isDone() returns true before calling get()."
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            boolean r0 = r0.isReady()
            return r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            r0.setResultCallback(r1)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            r0.setResultCallback(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r0.zaa
            com.google.android.gms.common.api.TransformedResult r0 = r0.then(r1)
            return r0
    }
}
