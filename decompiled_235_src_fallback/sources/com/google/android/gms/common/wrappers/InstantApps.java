package com.google.android.gms.common.wrappers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InstantApps {
    private static android.content.Context zza;
    private static java.lang.Boolean zzb;

    public InstantApps() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized boolean isInstantApp(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.common.wrappers.InstantApps> r0 = com.google.android.gms.common.wrappers.InstantApps.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = com.google.android.gms.common.wrappers.InstantApps.zza     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1a
            java.lang.Boolean r3 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            if (r2 == r1) goto L12
            goto L1a
        L12:
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return r4
        L18:
            r4 = move-exception
            goto L4e
        L1a:
            r2 = 0
            com.google.android.gms.common.wrappers.InstantApps.zzb = r2     // Catch: java.lang.Throwable -> L18
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L32
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L18
            boolean r4 = defpackage.wa2.y(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L18
            goto L44
        L32:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L40
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L40
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L40
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L18 java.lang.ClassNotFoundException -> L40
            goto L44
        L40:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.common.wrappers.InstantApps.zzb = r4     // Catch: java.lang.Throwable -> L18
        L44:
            com.google.android.gms.common.wrappers.InstantApps.zza = r1     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r4 = com.google.android.gms.common.wrappers.InstantApps.zzb     // Catch: java.lang.Throwable -> L18
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return r4
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }
}
