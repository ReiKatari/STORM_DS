package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzgk implements defpackage.qh4 {
    static final com.google.android.gms.internal.mlkit_vision_text_common.zzgk zza = null;
    private static final defpackage.na2 zzb = null;
    private static final defpackage.na2 zzc = null;
    private static final defpackage.na2 zzd = null;
    private static final defpackage.na2 zze = null;
    private static final defpackage.na2 zzf = null;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzgk
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zza = r0
            r0 = 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "errorCode"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzb = r0
            r0 = 2
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "hasResult"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzc = r0
            r0 = 3
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "isColdCall"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzd = r0
            r0 = 4
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "imageInfo"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zze = r0
            r0 = 5
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "recognizerOptions"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzf = r0
            return
    }

    private zzgk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzes r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzes) r3
            rh4 r4 = (defpackage.rh4) r4
            na2 r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzou r0 = r3.zza()
            r4.add(r2, r0)
            na2 r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzc
            r0 = 0
            r4.add(r2, r0)
            na2 r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzd
            java.lang.Boolean r1 = r3.zzc()
            r4.add(r2, r1)
            na2 r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zze
            r4.add(r2, r0)
            na2 r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzgk.zzf
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r3 = r3.zzb()
            r4.add(r2, r3)
            return
    }
}
