package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzay extends com.google.android.gms.internal.mlkit_vision_text_common.zzam {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzba zza;
    private final java.lang.Object zzb;
    private int zzc;

    public zzay(com.google.android.gms.internal.mlkit_vision_text_common.zzba r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzg(r1, r2)
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    private final void zza() {
            r3 = this;
            int r0 = r3.zzc
            r1 = -1
            if (r0 == r1) goto L1f
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r3.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.lang.Object r0 = r3.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r3.zza
            int r2 = r3.zzc
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzg(r1, r2)
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r0, r1)
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            return
        L1f:
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r3.zza
            java.lang.Object r1 = r3.zzb
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd(r0, r1)
            r3.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r2.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r2.zzb
            java.lang.Object r2 = r0.get(r2)
            return r2
        Lf:
            r2.zza()
            int r0 = r2.zzc
            r1 = -1
            if (r0 != r1) goto L19
            r2 = 0
            return r2
        L19:
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r2 = r2.zza
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzj(r2, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r3.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.Object r3 = r3.zzb
            java.lang.Object r3 = r0.put(r3, r4)
            return r3
        Lf:
            r3.zza()
            int r0 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r3.zza
            r2 = -1
            if (r0 != r2) goto L20
            java.lang.Object r3 = r3.zzb
            r1.put(r3, r4)
            r3 = 0
            return r3
        L20:
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzj(r1, r0)
            int r3 = r3.zzc
            com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzn(r1, r3, r4)
            return r0
    }
}
