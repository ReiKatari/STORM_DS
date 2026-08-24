package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum zzio extends java.lang.Enum implements com.google.android.gms.internal.mlkit_vision_common.zzag {
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zza = null;
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zzb = null;
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zzc = null;
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zzd = null;
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zze = null;
    public static final com.google.android.gms.internal.mlkit_vision_common.zzio zzf = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_vision_common.zzio[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzio r0 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r1 = "SOURCE_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zza = r0
            com.google.android.gms.internal.mlkit_vision_common.zzio r1 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r2 = "BITMAP"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zzb = r1
            com.google.android.gms.internal.mlkit_vision_common.zzio r2 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r3 = "BYTEARRAY"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zzc = r2
            com.google.android.gms.internal.mlkit_vision_common.zzio r3 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r4 = "BYTEBUFFER"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zzd = r3
            com.google.android.gms.internal.mlkit_vision_common.zzio r4 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r5 = "FILEPATH"
            r6 = 4
            r4.<init>(r5, r6, r6)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zze = r4
            com.google.android.gms.internal.mlkit_vision_common.zzio r5 = new com.google.android.gms.internal.mlkit_vision_common.zzio
            java.lang.String r6 = "ANDROID_MEDIA_IMAGE"
            r7 = 5
            r5.<init>(r6, r7, r7)
            com.google.android.gms.internal.mlkit_vision_common.zzio.zzf = r5
            com.google.android.gms.internal.mlkit_vision_common.zzio[] r0 = new com.google.android.gms.internal.mlkit_vision_common.zzio[]{r0, r1, r2, r3, r4, r5}
            com.google.android.gms.internal.mlkit_vision_common.zzio.zzg = r0
            return
    }

    zzio(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzio[] values() {
            com.google.android.gms.internal.mlkit_vision_common.zzio[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzio.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_vision_common.zzio[] r0 = (com.google.android.gms.internal.mlkit_vision_common.zzio[]) r0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
            r0 = this;
            int r0 = r0.zzh
            return r0
    }
}
