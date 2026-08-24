package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class OptionalPendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public OptionalPendingResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract R get();

    public abstract boolean isDone();
}
