package com.google.android.gms.common.util.concurrent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public HandlerExecutor(android.os.Looper r2) {
            r1 = this;
            r1.<init>()
            x28 r0 = new x28
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            android.os.Handler r0 = r0.zza
            r0.post(r1)
            return
    }
}
