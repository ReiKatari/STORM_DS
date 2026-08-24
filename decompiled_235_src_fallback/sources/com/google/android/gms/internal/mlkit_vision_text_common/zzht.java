package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzht implements defpackage.qh4 {
    static final com.google.android.gms.internal.mlkit_vision_text_common.zzht zza = null;
    private static final defpackage.na2 zzb = null;
    private static final defpackage.na2 zzc = null;
    private static final defpackage.na2 zzd = null;
    private static final defpackage.na2 zze = null;
    private static final defpackage.na2 zzf = null;
    private static final defpackage.na2 zzg = null;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzht r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzht
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zza = r0
            r0 = 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "maxMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzb = r0
            r0 = 2
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "minMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzc = r0
            r0 = 3
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "avgMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzd = r0
            r0 = 4
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "firstQuartileMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zze = r0
            r0 = 5
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "medianMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzf = r0
            r0 = 6
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "thirdQuartileMs"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzg = r0
            return
    }

    private zzht() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zznw r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zznw) r2
            rh4 r3 = (defpackage.rh4) r3
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzb
            java.lang.Long r0 = r2.zzc()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzc
            java.lang.Long r0 = r2.zze()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzd
            java.lang.Long r0 = r2.zza()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zze
            java.lang.Long r0 = r2.zzb()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzf
            java.lang.Long r0 = r2.zzd()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzht.zzg
            java.lang.Long r2 = r2.zzf()
            r3.add(r1, r2)
            return
    }
}
