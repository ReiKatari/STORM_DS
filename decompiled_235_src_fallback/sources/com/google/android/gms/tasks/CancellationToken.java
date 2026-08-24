package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class CancellationToken {
    public CancellationToken() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean isCancellationRequested();

    public abstract com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener r1);
}
