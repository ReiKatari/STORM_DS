package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzln implements defpackage.qh4 {
    static final com.google.android.gms.internal.mlkit_vision_text_common.zzln zza = null;
    private static final defpackage.na2 zzb = null;
    private static final defpackage.na2 zzc = null;
    private static final defpackage.na2 zzd = null;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzln r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzln
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzln.zza = r0
            r0 = 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "inferenceCommonLogEvent"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzb = r0
            r0 = 2
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "imageInfo"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzc = r0
            r0 = 3
            com.google.android.gms.internal.mlkit_vision_text_common.zzcx r0 = defpackage.xg6.k(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "recognizerOptions"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzd = r0
            return
    }

    private zzln() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.y32
    public final /* bridge */ /* synthetic */ void encode(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzrz r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzrz) r2
            rh4 r3 = (defpackage.rh4) r3
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzoj r0 = r2.zzb()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzod r0 = r2.zza()
            r3.add(r1, r0)
            na2 r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzln.zzd
            com.google.android.gms.internal.mlkit_vision_text_common.zzsd r2 = r2.zzc()
            r3.add(r1, r2)
            return
    }
}
