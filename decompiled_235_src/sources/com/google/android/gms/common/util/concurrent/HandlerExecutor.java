package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    public HandlerExecutor(Looper looper) {
        this.zza = new x28(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
