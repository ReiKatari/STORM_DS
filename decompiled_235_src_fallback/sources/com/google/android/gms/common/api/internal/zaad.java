package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaad {
    private final java.util.Map zaa;
    private final java.util.Map zab;

    public zaad() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.zaa = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.zab = r0
            return
    }

    public static /* bridge */ /* synthetic */ java.util.Map zaa(com.google.android.gms.common.api.internal.zaad r0) {
            java.util.Map r0 = r0.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zab(com.google.android.gms.common.api.internal.zaad r0) {
            java.util.Map r0 = r0.zab
            return r0
    }

    private final void zah(boolean r4, com.google.android.gms.common.api.Status r5) {
            r3 = this;
            java.util.Map r0 = r3.zaa
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L77
            java.util.Map r2 = r3.zaa     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            java.util.Map r2 = r3.zab
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L74
            java.util.Map r3 = r3.zab     // Catch: java.lang.Throwable -> L74
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            java.util.Set r3 = r1.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r4 != 0) goto L38
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1e
        L38:
            java.lang.Object r1 = r1.getKey()
            com.google.android.gms.common.api.internal.BasePendingResult r1 = (com.google.android.gms.common.api.internal.BasePendingResult) r1
            r1.forceFailureUnlessReady(r5)
            goto L1e
        L42:
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r4 != 0) goto L64
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4a
        L64:
            java.lang.Object r0 = r0.getKey()
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            com.google.android.gms.common.api.ApiException r1 = new com.google.android.gms.common.api.ApiException
            r1.<init>(r5)
            r0.trySetException(r1)
            goto L4a
        L73:
            return
        L74:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r3
        L77:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r3
    }

    public final void zac(com.google.android.gms.common.api.internal.BasePendingResult r2, boolean r3) {
            r1 = this;
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.util.Map r0 = r1.zaa
            r0.put(r2, r3)
            com.google.android.gms.common.api.internal.zaab r3 = new com.google.android.gms.common.api.internal.zaab
            r3.<init>(r1, r2)
            r2.addStatusListener(r3)
            return
    }

    public final void zad(com.google.android.gms.tasks.TaskCompletionSource r2, boolean r3) {
            r1 = this;
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.util.Map r0 = r1.zab
            r0.put(r2, r3)
            com.google.android.gms.tasks.Task r3 = r2.getTask()
            com.google.android.gms.common.api.internal.zaac r0 = new com.google.android.gms.common.api.internal.zaac
            r0.<init>(r1, r2)
            r3.addOnCompleteListener(r0)
            return
    }

    public final void zae(int r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
            r0.append(r4)
            goto L18
        L10:
            r2 = 3
            if (r4 != r2) goto L18
            java.lang.String r4 = " due to dead object exception."
            r0.append(r4)
        L18:
            if (r5 == 0) goto L22
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L22:
            java.lang.String r4 = r0.toString()
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 20
            r5.<init>(r0, r4)
            r3.zah(r1, r5)
            return
    }

    public final void zaf() {
            r2 = this;
            r0 = 0
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r2.zah(r0, r1)
            return
    }

    public final boolean zag() {
            r1 = this;
            java.util.Map r0 = r1.zaa
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            java.util.Map r1 = r1.zab
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
