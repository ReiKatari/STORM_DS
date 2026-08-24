package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zap extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final java.util.concurrent.atomic.AtomicReference zab;
    protected final com.google.android.gms.common.GoogleApiAvailability zac;
    private final android.os.Handler zad;

    public zap(com.google.android.gms.common.api.internal.LifecycleFragment r2, com.google.android.gms.common.GoogleApiAvailability r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r2.<init>(r0)
            r1.zab = r2
            b08 r2 = new b08
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.zad = r2
            r1.zac = r3
            return
    }

    private final void zaa(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            r1 = 0
            r0.set(r1)
            r2.zab(r3, r4)
            return
    }

    private final void zad() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            r1 = 0
            r0.set(r1)
            r2.zac()
            return
    }

    private static final int zae(com.google.android.gms.common.api.internal.zam r0) {
            if (r0 != 0) goto L4
            r0 = -1
            return r0
        L4:
            int r0 = r0.zaa()
            return r0
    }

    public static /* bridge */ /* synthetic */ void zaf(com.google.android.gms.common.api.internal.zap r0, com.google.android.gms.common.ConnectionResult r1, int r2) {
            r0.zaa(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zap r0) {
            r0.zad()
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            r1 = 1
            if (r3 == r1) goto L30
            r4 = 2
            if (r3 == r4) goto Lf
            goto L5b
        Lf:
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zac
            android.app.Activity r4 = r2.getActivity()
            int r3 = r3.isGooglePlayServicesAvailable(r4)
            if (r3 != 0) goto L1f
            r2.zad()
            return
        L1f:
            if (r0 == 0) goto L68
            com.google.android.gms.common.ConnectionResult r4 = r0.zab()
            int r4 = r4.getErrorCode()
            r5 = 18
            if (r4 != r5) goto L5b
            if (r3 != r5) goto L5b
            goto L68
        L30:
            r3 = -1
            if (r4 != r3) goto L37
            r2.zad()
            return
        L37:
            if (r4 != 0) goto L5b
            if (r0 == 0) goto L68
            r3 = 13
            if (r5 == 0) goto L45
            java.lang.String r4 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r5.getIntExtra(r4, r3)
        L45:
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
            com.google.android.gms.common.ConnectionResult r5 = r0.zab()
            java.lang.String r5 = r5.toString()
            r1 = 0
            r4.<init>(r3, r1, r5)
            int r3 = zae(r0)
            r2.zaa(r4, r3)
            return
        L5b:
            if (r0 == 0) goto L68
            com.google.android.gms.common.ConnectionResult r3 = r0.zab()
            int r4 = r0.zaa()
            r2.zaa(r3, r4)
        L68:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 13
            r1 = 0
            r3.<init>(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = r2.zab
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zam r0 = (com.google.android.gms.common.api.internal.zam) r0
            int r0 = zae(r0)
            r2.zaa(r3, r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            if (r4 == 0) goto L34
            java.util.concurrent.atomic.AtomicReference r3 = r3.zab
            java.lang.String r0 = "resolving_error"
            r1 = 0
            boolean r0 = r4.getBoolean(r0, r1)
            if (r0 == 0) goto L30
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            java.lang.String r1 = "failed_status"
            int r1 = r4.getInt(r1)
            java.lang.String r2 = "failed_resolution"
            android.os.Parcelable r2 = r4.getParcelable(r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            r0.<init>(r1, r2)
            java.lang.String r1 = "failed_client_id"
            r2 = -1
            int r4 = r4.getInt(r1, r2)
            com.google.android.gms.common.api.internal.zam r1 = new com.google.android.gms.common.api.internal.zam
            r1.<init>(r0, r4)
            goto L31
        L30:
            r1 = 0
        L31:
            r3.set(r1)
        L34:
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.util.concurrent.atomic.AtomicReference r2 = r2.zab
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zam r2 = (com.google.android.gms.common.api.internal.zam) r2
            if (r2 != 0) goto Le
            return
        Le:
            java.lang.String r0 = "resolving_error"
            r1 = 1
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "failed_client_id"
            int r1 = r2.zaa()
            r3.putInt(r0, r1)
            com.google.android.gms.common.ConnectionResult r0 = r2.zab()
            int r0 = r0.getErrorCode()
            java.lang.String r1 = "failed_status"
            r3.putInt(r1, r0)
            com.google.android.gms.common.ConnectionResult r2 = r2.zab()
            android.app.PendingIntent r2 = r2.getResolution()
            java.lang.String r0 = "failed_resolution"
            r3.putParcelable(r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
            r1 = this;
            super.onStart()
            r0 = 1
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
            r1 = this;
            super.onStop()
            r0 = 0
            r1.zaa = r0
            return
    }

    public abstract void zab(com.google.android.gms.common.ConnectionResult r1, int r2);

    public abstract void zac();

    public final void zah(com.google.android.gms.common.ConnectionResult r2, int r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zam r0 = new com.google.android.gms.common.api.internal.zam
            r0.<init>(r2, r3)
        L5:
            java.util.concurrent.atomic.AtomicReference r2 = r1.zab
        L7:
            r3 = 0
            boolean r3 = r2.compareAndSet(r3, r0)
            if (r3 == 0) goto L19
            android.os.Handler r2 = r1.zad
            com.google.android.gms.common.api.internal.zao r3 = new com.google.android.gms.common.api.internal.zao
            r3.<init>(r1, r0)
            r2.post(r3)
            return
        L19:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L7
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L5
            return
    }
}
