package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum zzmm extends java.lang.Enum implements com.google.android.gms.internal.mlkit_common.zzba {
    public static final com.google.android.gms.internal.mlkit_common.zzmm zza = null;
    public static final com.google.android.gms.internal.mlkit_common.zzmm zzb = null;
    private static final /* synthetic */ com.google.android.gms.internal.mlkit_common.zzmm[] zzc = null;
    private final int zzd;

    static {
            com.google.android.gms.internal.mlkit_common.zzmm r0 = new com.google.android.gms.internal.mlkit_common.zzmm
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.mlkit_common.zzmm.zza = r0
            com.google.android.gms.internal.mlkit_common.zzmm r1 = new com.google.android.gms.internal.mlkit_common.zzmm
            java.lang.String r2 = "TRANSLATE"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.google.android.gms.internal.mlkit_common.zzmm.zzb = r1
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = new com.google.android.gms.internal.mlkit_common.zzmm[]{r0, r1}
            com.google.android.gms.internal.mlkit_common.zzmm.zzc = r0
            return
    }

    zzmm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzd = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzmm[] values() {
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = com.google.android.gms.internal.mlkit_common.zzmm.zzc
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = (com.google.android.gms.internal.mlkit_common.zzmm[]) r0
            return r0
    }

    public static com.google.android.gms.internal.mlkit_common.zzmm zzb(int r5) {
            com.google.android.gms.internal.mlkit_common.zzmm[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zzd
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.internal.mlkit_common.zzmm r5 = com.google.android.gms.internal.mlkit_common.zzmm.zza
            return r5
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
            r0 = this;
            int r0 = r0.zzd
            return r0
    }
}
