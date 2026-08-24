package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.Result zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zab;

    public zacy(com.google.android.gms.common.api.internal.zada r1, com.google.android.gms.common.api.Result r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.lang.ThreadLocal r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            r0.set(r1)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.internal.zada r1 = r5.zab     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.ResultTransform r1 = com.google.android.gms.common.api.internal.zada.zaa(r1)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.ResultTransform r1 = (com.google.android.gms.common.api.ResultTransform) r1     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.Result r2 = r5.zaa     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.PendingResult r1 = r1.onSuccess(r2)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.internal.zada r2 = r5.zab     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.internal.zacz r3 = com.google.android.gms.common.api.internal.zada.zab(r2)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            com.google.android.gms.common.api.internal.zacz r2 = com.google.android.gms.common.api.internal.zada.zab(r2)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            r4 = 0
            android.os.Message r1 = r2.obtainMessage(r4, r1)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            r3.sendMessage(r1)     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            com.google.android.gms.common.api.Result r1 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r0, r1)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            java.lang.ref.WeakReference r0 = com.google.android.gms.common.api.internal.zada.zae(r0)
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            if (r0 == 0) goto L7d
        L45:
            com.google.android.gms.common.api.internal.zada r5 = r5.zab
            r0.zap(r5)
            return
        L4b:
            r0 = move-exception
            goto L7e
        L4d:
            r0 = move-exception
            com.google.android.gms.common.api.internal.zada r1 = r5.zab     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.common.api.internal.zacz r2 = com.google.android.gms.common.api.internal.zada.zab(r1)     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.common.api.internal.zacz r1 = com.google.android.gms.common.api.internal.zada.zab(r1)     // Catch: java.lang.Throwable -> L4b
            r3 = 1
            android.os.Message r0 = r1.obtainMessage(r3, r0)     // Catch: java.lang.Throwable -> L4b
            r2.sendMessage(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.ThreadLocal r0 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            com.google.android.gms.common.api.Result r1 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r0, r1)
            com.google.android.gms.common.api.internal.zada r0 = r5.zab
            java.lang.ref.WeakReference r0 = com.google.android.gms.common.api.internal.zada.zae(r0)
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.GoogleApiClient r0 = (com.google.android.gms.common.api.GoogleApiClient) r0
            if (r0 == 0) goto L7d
            goto L45
        L7d:
            return
        L7e:
            java.lang.ThreadLocal r1 = com.google.android.gms.common.api.internal.BasePendingResult.zaa
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.set(r2)
            com.google.android.gms.common.api.internal.zada r1 = r5.zab
            com.google.android.gms.common.api.Result r2 = r5.zaa
            com.google.android.gms.common.api.internal.zada.zaf(r1, r2)
            com.google.android.gms.common.api.internal.zada r1 = r5.zab
            java.lang.ref.WeakReference r1 = com.google.android.gms.common.api.internal.zada.zae(r1)
            java.lang.Object r1 = r1.get()
            com.google.android.gms.common.api.GoogleApiClient r1 = (com.google.android.gms.common.api.GoogleApiClient) r1
            if (r1 != 0) goto L9b
            goto La0
        L9b:
            com.google.android.gms.common.api.internal.zada r5 = r5.zab
            r1.zap(r5)
        La0:
            throw r0
    }
}
