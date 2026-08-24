package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r1) {
            r0 = this;
            java.lang.Thread r0 = com.github.junrar.Archive.ExtractorExecutorHolder.a(r1)
            return r0
    }
}
