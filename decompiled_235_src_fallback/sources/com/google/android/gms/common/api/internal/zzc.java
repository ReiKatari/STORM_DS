package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzd zzc;

    public zzc(com.google.android.gms.common.api.internal.zzd r1, com.google.android.gms.common.api.internal.LifecycleCallback r2, java.lang.String r3) {
            r0 = this;
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.common.api.internal.zzd r0 = r3.zzc
            int r1 = com.google.android.gms.common.api.internal.zzd.zza(r0)
            if (r1 <= 0) goto L1f
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r3.zza
            android.os.Bundle r2 = com.google.android.gms.common.api.internal.zzd.zzb(r0)
            if (r2 == 0) goto L1b
            java.lang.String r2 = r3.zzb
            android.os.Bundle r0 = com.google.android.gms.common.api.internal.zzd.zzb(r0)
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r1.onCreate(r0)
        L1f:
            com.google.android.gms.common.api.internal.zzd r0 = r3.zzc
            int r0 = com.google.android.gms.common.api.internal.zzd.zza(r0)
            r1 = 2
            if (r0 < r1) goto L2d
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r3.zza
            r0.onStart()
        L2d:
            com.google.android.gms.common.api.internal.zzd r0 = r3.zzc
            int r0 = com.google.android.gms.common.api.internal.zzd.zza(r0)
            r1 = 3
            if (r0 < r1) goto L3b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r3.zza
            r0.onResume()
        L3b:
            com.google.android.gms.common.api.internal.zzd r0 = r3.zzc
            int r0 = com.google.android.gms.common.api.internal.zzd.zza(r0)
            r1 = 4
            if (r0 < r1) goto L49
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r3.zza
            r0.onStop()
        L49:
            com.google.android.gms.common.api.internal.zzd r0 = r3.zzc
            int r0 = com.google.android.gms.common.api.internal.zzd.zza(r0)
            r1 = 5
            if (r0 < r1) goto L57
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = r3.zza
            r3.onDestroy()
        L57:
            return
    }
}
