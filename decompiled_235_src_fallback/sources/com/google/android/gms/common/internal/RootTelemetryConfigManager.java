package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RootTelemetryConfigManager {
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb = null;
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    static {
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb = r0
            return
    }

    private RootTelemetryConfigManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance() {
            java.lang.Class<com.google.android.gms.common.internal.RootTelemetryConfigManager> r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.class
            monitor-enter(r0)
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = new com.google.android.gms.common.internal.RootTelemetryConfigManager     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.common.internal.RootTelemetryConfigManager.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig() {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.zzc
            return r0
    }

    public final synchronized void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto Lb
            com.google.android.gms.common.internal.RootTelemetryConfiguration r3 = com.google.android.gms.common.internal.RootTelemetryConfigManager.zzb     // Catch: java.lang.Throwable -> L9
            r2.zzc = r3     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r3 = move-exception
            goto L20
        Lb:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r2.zzc     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L1c
            int r0 = r0.getVersion()     // Catch: java.lang.Throwable -> L9
            int r1 = r3.getVersion()     // Catch: java.lang.Throwable -> L9
            if (r0 >= r1) goto L1a
            goto L1c
        L1a:
            monitor-exit(r2)
            return
        L1c:
            r2.zzc = r3     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }
}
