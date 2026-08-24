package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmw {
    private static com.google.android.gms.internal.mlkit_vision_common.zzmw zza;

    private zzmw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_common.zzmw zza() {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzmw> r0 = com.google.android.gms.internal.mlkit_vision_common.zzmw.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmw r1 = com.google.android.gms.internal.mlkit_vision_common.zzmw.zza     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.google.android.gms.internal.mlkit_vision_common.zzmw r1 = new com.google.android.gms.internal.mlkit_vision_common.zzmw     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.google.android.gms.internal.mlkit_vision_common.zzmw r1 = com.google.android.gms.internal.mlkit_vision_common.zzmw.zza     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static final boolean zzb() {
            java.lang.String r0 = "mlkit-dev-profiling"
            boolean r0 = com.google.android.gms.internal.mlkit_vision_common.zzmv.zza(r0)
            return r0
    }
}
