package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzms {
    private static com.google.android.gms.internal.mlkit_vision_common.zzmr zza;

    public static synchronized com.google.android.gms.internal.mlkit_vision_common.zzmj zza(com.google.android.gms.internal.mlkit_vision_common.zzme r3) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzms> r0 = com.google.android.gms.internal.mlkit_vision_common.zzms.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmr r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.zza     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_common.zzmr r1 = new com.google.android.gms.internal.mlkit_vision_common.zzmr     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_common.zzms.zza = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1c
        L12:
            com.google.android.gms.internal.mlkit_vision_common.zzmr r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.zza     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_common.zzmj r3 = (com.google.android.gms.internal.mlkit_vision_common.zzmj) r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r3
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_common.zzmj zzb(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_common.zzms> r1 = com.google.android.gms.internal.mlkit_vision_common.zzms.class
            monitor-enter(r1)
            java.lang.String r0 = "vision-common"
            com.google.android.gms.internal.mlkit_vision_common.zzmd r0 = com.google.android.gms.internal.mlkit_vision_common.zzme.zzd(r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_common.zzme r0 = r0.zzd()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_vision_common.zzmj r0 = zza(r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
