package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class PendingResultFacade<A extends com.google.android.gms.common.api.Result, B extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<B> {
    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final B await() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final B await(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super B> r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super B> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super B, ? extends S> r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
