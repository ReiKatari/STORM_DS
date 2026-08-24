package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzdc {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final defpackage.qh4 zzc;

    public zzdc(java.util.Map r1, java.util.Map r2, defpackage.qh4 r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final byte[] zza(java.lang.Object r5) {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzcz r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzcz     // Catch: java.io.IOException -> L13
            java.util.Map r2 = r4.zza     // Catch: java.io.IOException -> L13
            java.util.Map r3 = r4.zzb     // Catch: java.io.IOException -> L13
            qh4 r4 = r4.zzc     // Catch: java.io.IOException -> L13
            r1.<init>(r0, r2, r3, r4)     // Catch: java.io.IOException -> L13
            r1.zzf(r5)     // Catch: java.io.IOException -> L13
        L13:
            byte[] r4 = r0.toByteArray()
            return r4
    }
}
