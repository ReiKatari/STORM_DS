package com.google.android.gms.common.wrappers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zza = null;
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zzb;

    static {
            com.google.android.gms.common.wrappers.Wrappers r0 = new com.google.android.gms.common.wrappers.Wrappers
            r0.<init>()
            com.google.android.gms.common.wrappers.Wrappers.zza = r0
            return
    }

    public Wrappers() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context r1) {
            com.google.android.gms.common.wrappers.Wrappers r0 = com.google.android.gms.common.wrappers.Wrappers.zza
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = r0.zza(r1)
            return r1
    }

    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = r1.zzb     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L19
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L1d
        L12:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = new com.google.android.gms.common.wrappers.PackageManagerWrapper     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r1.zzb = r0     // Catch: java.lang.Throwable -> L10
        L19:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = r1.zzb     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
