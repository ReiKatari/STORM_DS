package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ExecutorSelector {
    private final defpackage.o55 zza;

    public ExecutorSelector(defpackage.o55 r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public java.util.concurrent.Executor getExecutorToUse(java.util.concurrent.Executor r1) {
            r0 = this;
            if (r1 == 0) goto L3
            return r1
        L3:
            o55 r0 = r0.zza
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            return r0
    }
}
