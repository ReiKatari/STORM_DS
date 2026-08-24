package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzag {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    public zzag(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final java.lang.IllegalArgumentException zza() {
            r7 = this;
            java.lang.Object r0 = r7.zzc
            java.lang.Object r1 = r7.zzb
            java.lang.Object r7 = r7.zza
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = " and "
            java.lang.String r5 = "Multiple entries with same key: "
            java.lang.String r6 = "="
            java.lang.StringBuilder r1 = defpackage.i61.u(r5, r3, r6, r1, r4)
            r1.append(r7)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r2.<init>(r7)
            return r2
    }
}
