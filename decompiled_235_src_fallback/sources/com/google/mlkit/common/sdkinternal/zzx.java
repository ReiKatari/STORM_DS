package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzx implements java.io.Closeable {
    final /* synthetic */ com.google.mlkit.common.sdkinternal.TaskQueue zza;

    public /* synthetic */ zzx(com.google.mlkit.common.sdkinternal.TaskQueue r1, com.google.mlkit.common.sdkinternal.zzw r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = com.google.mlkit.common.sdkinternal.TaskQueue.zza(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Object r0 = r0.getAndSet(r1)
            java.lang.Thread r0 = (java.lang.Thread) r0
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            com.google.mlkit.common.sdkinternal.TaskQueue r0 = r2.zza
            java.util.concurrent.atomic.AtomicReference r0 = com.google.mlkit.common.sdkinternal.TaskQueue.zza(r0)
            r1 = 0
            r0.set(r1)
            com.google.mlkit.common.sdkinternal.TaskQueue r2 = r2.zza
            com.google.mlkit.common.sdkinternal.TaskQueue.zzb(r2)
            return
    }
}
