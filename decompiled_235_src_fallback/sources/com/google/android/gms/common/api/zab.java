package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.Batch zaa;

    public zab(com.google.android.gms.common.api.Batch r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r4) {
            r3 = this;
            com.google.android.gms.common.api.Batch r0 = r3.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.Batch.zab(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.Batch r1 = r3.zaa     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isCanceled()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L68
        L13:
            boolean r1 = r4.isCanceled()     // Catch: java.lang.Throwable -> L11
            r2 = 1
            if (r1 == 0) goto L20
            com.google.android.gms.common.api.Batch r4 = r3.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch.zad(r4, r2)     // Catch: java.lang.Throwable -> L11
            goto L2b
        L20:
            boolean r4 = r4.isSuccess()     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L2b
            com.google.android.gms.common.api.Batch r4 = r3.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch.zac(r4, r2)     // Catch: java.lang.Throwable -> L11
        L2b:
            com.google.android.gms.common.api.Batch r4 = r3.zaa     // Catch: java.lang.Throwable -> L11
            int r1 = com.google.android.gms.common.api.Batch.zaa(r4)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + (-1)
            com.google.android.gms.common.api.Batch.zae(r4, r1)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.Batch r4 = r3.zaa     // Catch: java.lang.Throwable -> L11
            int r1 = com.google.android.gms.common.api.Batch.zaa(r4)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L66
            boolean r1 = com.google.android.gms.common.api.Batch.zah(r4)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L48
            com.google.android.gms.common.api.Batch.zaf(r4)     // Catch: java.lang.Throwable -> L11
            goto L66
        L48:
            boolean r4 = com.google.android.gms.common.api.Batch.zag(r4)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L56
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L11
            r1 = 13
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L11
            goto L58
        L56:
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS     // Catch: java.lang.Throwable -> L11
        L58:
            com.google.android.gms.common.api.Batch r3 = r3.zaa     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.BatchResult r1 = new com.google.android.gms.common.api.BatchResult     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.common.api.PendingResult[] r2 = com.google.android.gms.common.api.Batch.zai(r3)     // Catch: java.lang.Throwable -> L11
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L11
            r3.setResult(r1)     // Catch: java.lang.Throwable -> L11
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }
}
