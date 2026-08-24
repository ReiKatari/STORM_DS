package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzbj extends com.google.android.gms.internal.mlkit_vision_text_common.zzbk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzbk zzc;

    public zzbj(com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1, int r2, int r3) {
            r0 = this;
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zza(r3, r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r2.zzc
            int r2 = r2.zza
            int r3 = r3 + r2
            java.lang.Object r2 = r0.get(r3)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r0.zzf(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzb() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            int r2 = r2.zzb
            int r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzc() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r1.zzc
            int r0 = r0.zzc()
            int r1 = r1.zza
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final java.lang.Object[] zze() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r0.zzc
            java.lang.Object[] r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbk zzf(int r2, int r3) {
            r1 = this;
            int r0 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zzc(r2, r3, r0)
            int r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = r1.zzc
            int r2 = r2 + r0
            int r3 = r3 + r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = r1.zzf(r2, r3)
            return r1
    }
}
