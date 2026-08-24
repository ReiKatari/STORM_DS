package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacz extends defpackage.b08 {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    public zacz(com.google.android.gms.common.api.internal.zada r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            if (r0 == 0) goto L33
            r3 = 1
            if (r0 == r3) goto L1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TransformationResultHandler received unknown message type: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TransformedResultImpl"
            android.util.Log.e(r4, r3)
            return
        L1b:
            java.lang.Object r3 = r4.obj
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            java.lang.String r4 = r3.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Runtime exception on the transformation worker thread: "
            java.lang.String r1 = "TransformedResultImpl"
            java.lang.String r4 = r0.concat(r4)
            android.util.Log.e(r1, r4)
            throw r3
        L33:
            java.lang.Object r4 = r4.obj
            com.google.android.gms.common.api.PendingResult r4 = (com.google.android.gms.common.api.PendingResult) r4
            com.google.android.gms.common.api.internal.zada r0 = r3.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.internal.zada.zad(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zada r3 = r3.zaa     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.common.api.internal.zada r3 = com.google.android.gms.common.api.internal.zada.zac(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.common.api.internal.zada r3 = (com.google.android.gms.common.api.internal.zada) r3     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L5b
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "Transform returned null"
            r2 = 13
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.common.api.internal.zada.zag(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L6c
        L59:
            r3 = move-exception
            goto L6e
        L5b:
            boolean r1 = r4 instanceof com.google.android.gms.common.api.internal.zacp     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L69
            com.google.android.gms.common.api.internal.zacp r4 = (com.google.android.gms.common.api.internal.zacp) r4     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.common.api.Status r4 = r4.zaa()     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.common.api.internal.zada.zag(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L6c
        L69:
            r3.zai(r4)     // Catch: java.lang.Throwable -> L59
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r3
    }
}
