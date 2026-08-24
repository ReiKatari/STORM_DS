package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzl extends com.google.android.gms.common.zzj {
    private static final java.lang.ref.WeakReference zza = null;
    private java.lang.ref.WeakReference zzb;

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.zzl.zza = r0
            return
    }

    public zzl(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = com.google.android.gms.common.zzl.zza
            r0.zzb = r1
            return
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
            r2 = this;
            monitor-enter(r2)
            java.lang.ref.WeakReference r0 = r2.zzb     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            byte[] r0 = r2.zzb()     // Catch: java.lang.Throwable -> L17
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L17
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r2.zzb = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L1b
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
