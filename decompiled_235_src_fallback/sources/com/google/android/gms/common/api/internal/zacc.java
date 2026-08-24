package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zacc extends com.google.android.gms.common.api.internal.zap {
    private com.google.android.gms.tasks.TaskCompletionSource zad;

    private zacc(com.google.android.gms.common.api.internal.LifecycleFragment r2) {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r1.<init>(r2, r0)
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            r1.zad = r2
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = r1.mLifecycleFragment
            java.lang.String r0 = "GmsAvailabilityHelper"
            r2.addCallback(r0, r1)
            return
    }

    public static com.google.android.gms.common.api.internal.zacc zaa(android.app.Activity r2) {
            com.google.android.gms.common.api.internal.LifecycleFragment r2 = com.google.android.gms.common.api.internal.LifecycleCallback.getFragment(r2)
            java.lang.String r0 = "GmsAvailabilityHelper"
            java.lang.Class<com.google.android.gms.common.api.internal.zacc> r1 = com.google.android.gms.common.api.internal.zacc.class
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r2.getCallbackOrNull(r0, r1)
            com.google.android.gms.common.api.internal.zacc r0 = (com.google.android.gms.common.api.internal.zacc) r0
            if (r0 == 0) goto L24
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.zad
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            boolean r2 = r2.isComplete()
            if (r2 == 0) goto L23
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            r0.zad = r2
        L23:
            return r0
        L24:
            com.google.android.gms.common.api.internal.zacc r0 = new com.google.android.gms.common.api.internal.zacc
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
            r2 = this;
            super.onDestroy()
            com.google.android.gms.tasks.TaskCompletionSource r2 = r2.zad
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Host activity was destroyed before Google Play services could be made available."
            r0.<init>(r1)
            r2.trySetException(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(com.google.android.gms.common.ConnectionResult r4, int r5) {
            r3 = this;
            java.lang.String r5 = r4.getErrorMessage()
            if (r5 != 0) goto L8
            java.lang.String r5 = "Error connecting to Google Play services"
        L8:
            com.google.android.gms.tasks.TaskCompletionSource r3 = r3.zad
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            int r2 = r4.getErrorCode()
            r1.<init>(r4, r5, r2)
            r0.<init>(r1)
            r3.setException(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
            r3 = this;
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = r3.mLifecycleFragment
            android.app.Activity r0 = r0.getLifecycleActivity()
            if (r0 != 0) goto L1a
            com.google.android.gms.tasks.TaskCompletionSource r3 = r3.zad
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 8
            r1.<init>(r2)
            r0.<init>(r1)
            r3.trySetException(r0)
            return
        L1a:
            com.google.android.gms.common.GoogleApiAvailability r1 = r3.zac
            int r0 = r1.isGooglePlayServicesAvailable(r0)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r3.zad
            r2 = 0
            if (r0 != 0) goto L29
            r1.trySetResult(r2)
            return
        L29:
            com.google.android.gms.tasks.Task r1 = r1.getTask()
            boolean r1 = r1.isComplete()
            if (r1 != 0) goto L3c
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r2)
            r0 = 0
            r3.zah(r1, r0)
        L3c:
            return
    }

    public final com.google.android.gms.tasks.Task zad() {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zad
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            return r0
    }
}
