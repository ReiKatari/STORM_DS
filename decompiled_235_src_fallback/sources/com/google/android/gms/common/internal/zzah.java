package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzah {
    private static final java.lang.Object zza = null;
    private static boolean zzb;
    private static java.lang.String zzc;
    private static int zzd;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.zzah.zza = r0
            return
    }

    public static int zza(android.content.Context r0) {
            zzc(r0)
            int r0 = com.google.android.gms.common.internal.zzah.zzd
            return r0
    }

    public static java.lang.String zzb(android.content.Context r0) {
            zzc(r0)
            java.lang.String r0 = com.google.android.gms.common.internal.zzah.zzc
            return r0
    }

    private static void zzc(android.content.Context r3) {
            java.lang.Object r0 = com.google.android.gms.common.internal.zzah.zza
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.common.internal.zzah.zzb     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L3d
        Lb:
            r1 = 1
            com.google.android.gms.common.internal.zzah.zzb = r1     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: java.lang.Throwable -> L9
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            if (r3 != 0) goto L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L22:
            java.lang.String r1 = "com.google.app.id"
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            com.google.android.gms.common.internal.zzah.zzc = r1     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            java.lang.String r1 = "com.google.android.gms.version"
            int r3 = r3.getInt(r1)     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            com.google.android.gms.common.internal.zzah.zzd = r3     // Catch: java.lang.Throwable -> L9 android.content.pm.PackageManager.NameNotFoundException -> L33
            goto L3b
        L33:
            r3 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r2 = "This should never happen."
            android.util.Log.wtf(r1, r2, r3)     // Catch: java.lang.Throwable -> L9
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }
}
