package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzun {
    private static com.google.android.gms.internal.mlkit_vision_text_common.zzum zza;

    public static synchronized com.google.android.gms.internal.mlkit_vision_text_common.zzuc zza(com.google.android.gms.internal.mlkit_vision_text_common.zztu r3) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_common.zzun> r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzum r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.zza     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_text_common.zzum r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzum     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_text_common.zzun.zza = r1     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1c
        L12:
            com.google.android.gms.internal.mlkit_vision_text_common.zzum r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.zza     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuc) r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r3
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public static synchronized com.google.android.gms.internal.mlkit_vision_text_common.zzuc zzb(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_common.zzun> r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzun.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zztt r1 = com.google.android.gms.internal.mlkit_vision_text_common.zztu.zzd(r1)     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_text_common.zztu r1 = r1.zzd()     // Catch: java.lang.Throwable -> L11
            com.google.android.gms.internal.mlkit_vision_text_common.zzuc r1 = zza(r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
