package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmp implements com.google.android.gms.internal.mlkit_vision_common.zzmc {
    private defpackage.o55 zza;
    private final defpackage.o55 zzb;
    private final com.google.android.gms.internal.mlkit_vision_common.zzme zzc;

    public zzmp(android.content.Context r3, com.google.android.gms.internal.mlkit_vision_common.zzme r4) {
            r2 = this;
            r2.<init>()
            r2.zzc = r4
            fa0 r4 = defpackage.fa0.e
            defpackage.sb7.b(r3)
            sb7 r3 = defpackage.sb7.a()
            m44 r3 = r3.c(r4)
            java.util.Set r4 = defpackage.fa0.d
            c42 r0 = new c42
            java.lang.String r1 = "json"
            r0.<init>(r1)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L2d
            ho3 r4 = new ho3
            com.google.android.gms.internal.mlkit_vision_common.zzmm r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmm
            r0.<init>(r3)
            r4.<init>(r0)
            r2.zza = r4
        L2d:
            ho3 r4 = new ho3
            com.google.android.gms.internal.mlkit_vision_common.zzmn r0 = new com.google.android.gms.internal.mlkit_vision_common.zzmn
            r0.<init>(r3)
            r4.<init>(r0)
            r2.zzb = r4
            return
    }

    public static defpackage.i62 zzb(com.google.android.gms.internal.mlkit_vision_common.zzme r1, com.google.android.gms.internal.mlkit_vision_common.zzmb r2) {
            int r1 = r1.zza()
            r0 = 0
            byte[] r1 = r2.zzd(r1, r0)
            gy r2 = new gy
            b35 r0 = defpackage.b35.VERY_LOW
            r2.<init>(r1, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(com.google.android.gms.internal.mlkit_vision_common.zzmb r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzme r0 = r1.zzc
            int r0 = r0.zza()
            if (r0 != 0) goto L1c
            o55 r0 = r1.zza
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            rb7 r0 = (defpackage.rb7) r0
            com.google.android.gms.internal.mlkit_vision_common.zzme r1 = r1.zzc
            i62 r1 = zzb(r1, r2)
            r0.a(r1)
        L1b:
            return
        L1c:
            o55 r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            rb7 r0 = (defpackage.rb7) r0
            com.google.android.gms.internal.mlkit_vision_common.zzme r1 = r1.zzc
            i62 r1 = zzb(r1, r2)
            r0.a(r1)
            return
    }
}
