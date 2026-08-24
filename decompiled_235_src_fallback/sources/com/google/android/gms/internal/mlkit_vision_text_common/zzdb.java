package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzdb implements defpackage.z32 {
    public static final /* synthetic */ int zza = 0;
    private static final defpackage.qh4 zzb = null;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final defpackage.qh4 zze;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzda r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzda
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzdb.zzb = r0
            return
    }

    public zzdb() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            qh4 r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzdb.zzb
            r1.zze = r0
            return
    }

    public final /* bridge */ /* synthetic */ defpackage.z32 registerEncoder(java.lang.Class r2, defpackage.lk7 r3) {
            r1 = this;
            java.util.Map r0 = r1.zzd
            r0.put(r2, r3)
            java.util.Map r3 = r1.zzc
            r3.remove(r2)
            return r1
    }

    @Override // defpackage.z32
    public final /* bridge */ /* synthetic */ defpackage.z32 registerEncoder(java.lang.Class r2, defpackage.qh4 r3) {
            r1 = this;
            java.util.Map r0 = r1.zzc
            r0.put(r2, r3)
            java.util.Map r3 = r1.zzd
            r3.remove(r2)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzdc zza() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzdc r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzdc
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map r2 = r4.zzc
            r1.<init>(r2)
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map r3 = r4.zzd
            r2.<init>(r3)
            qh4 r4 = r4.zze
            r0.<init>(r1, r2, r4)
            return r0
    }
}
