package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum zzot extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_text_common.zzcv {
    public static final com.google.android.gms.internal.mlkit_vision_text_common.zzot zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_text_common.zzot zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_text_common.zzot zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_text_common.zzot zzd = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzot[] zze = null;
    private final int zzf;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzot
            java.lang.String r1 = "TYPE_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzot.zza = r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzot
            java.lang.String r2 = "TYPE_THIN"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzb = r1
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzot
            java.lang.String r3 = "TYPE_THICK"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzc = r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzot r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzot
            java.lang.String r4 = "TYPE_GMV"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzot.zzd = r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzot[] r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzot[]{r0, r1, r2, r3}
            com.google.android.gms.internal.mlkit_vision_text_common.zzot.zze = r0
            return
    }

    zzot(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzot[] values() {
            com.google.android.gms.internal.mlkit_vision_text_common.zzot[] r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzot.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_text_common.zzot[] r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzot[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcv
    public final int zza() {
            r0 = this;
            int r0 = r0.zzf
            return r0
    }
}
