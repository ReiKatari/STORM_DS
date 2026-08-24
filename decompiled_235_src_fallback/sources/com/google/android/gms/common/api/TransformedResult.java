package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class TransformedResult<R extends com.google.android.gms.common.api.Result> {
    public TransformedResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> r1);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r1);
}
