package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzss {
    private static com.google.android.gms.internal.mlkit_common.zzsr zza;

    public static synchronized com.google.android.gms.internal.mlkit_common.zzsh zza(com.google.android.gms.internal.mlkit_common.zzsb r3) {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzss> r0 = com.google.android.gms.internal.mlkit_common.zzss.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_common.zzsr r1 = com.google.android.gms.internal.mlkit_common.zzss.zza     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            com.google.android.gms.internal.mlkit_common.zzsr r1 = new com.google.android.gms.internal.mlkit_common.zzsr     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_common.zzss.zza = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1c
        L12:
            com.google.android.gms.internal.mlkit_common.zzsr r1 = com.google.android.gms.internal.mlkit_common.zzss.zza     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_common.zzsh r3 = (com.google.android.gms.internal.mlkit_common.zzsh) r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r3
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public static synchronized com.google.android.gms.internal.mlkit_common.zzsh zzb(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzss> r1 = com.google.android.gms.internal.mlkit_common.zzss.class
            monitor-enter(r1)
            java.lang.String r0 = "common"
            com.google.android.gms.internal.mlkit_common.zzsa r0 = com.google.android.gms.internal.mlkit_common.zzsb.zzd(r0)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_common.zzsb r0 = r0.zzd()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.mlkit_common.zzsh r0 = zza(r0)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
