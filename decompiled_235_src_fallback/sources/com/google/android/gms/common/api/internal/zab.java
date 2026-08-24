package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zab extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final java.lang.ref.WeakReference zaa;

    public zab(com.google.android.gms.common.api.internal.zaa r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zaa
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.zaa r0 = (com.google.android.gms.common.api.internal.zaa) r0
            if (r0 == 0) goto Le
            com.google.android.gms.common.api.internal.zaa.zab(r0, r2)
            return r1
        Le:
            java.lang.String r1 = "The target activity has already been GC'd"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }
}
