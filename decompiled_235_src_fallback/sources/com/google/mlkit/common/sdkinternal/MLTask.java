package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.MLTaskInput;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class MLTask<T, S extends com.google.mlkit.common.sdkinternal.MLTaskInput> extends com.google.mlkit.common.sdkinternal.ModelResource {
    public MLTask() {
            r0 = this;
            r0.<init>()
            return
    }

    public MLTask(com.google.mlkit.common.sdkinternal.TaskQueue r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract T run(S r1);
}
