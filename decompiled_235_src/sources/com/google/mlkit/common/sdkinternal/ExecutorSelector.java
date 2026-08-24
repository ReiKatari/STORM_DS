package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ExecutorSelector {
    private final o55 zza;

    public ExecutorSelector(o55 o55Var) {
        this.zza = o55Var;
    }

    public Executor getExecutorToUse(Executor executor) {
        if (executor != null) {
            return executor;
        }
        return (Executor) this.zza.get();
    }
}
