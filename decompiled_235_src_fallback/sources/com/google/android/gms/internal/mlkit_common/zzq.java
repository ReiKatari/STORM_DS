package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzq {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.mlkit_common.zzo zzb;
    private com.google.android.gms.internal.mlkit_common.zzo zzc;

    public /* synthetic */ zzq(java.lang.String r1, com.google.android.gms.internal.mlkit_common.zzp r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzo r2 = new com.google.android.gms.internal.mlkit_common.zzo
            r2.<init>()
            r0.zzb = r2
            r0.zzc = r2
            r1.getClass()
            r0.zza = r1
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            java.lang.String r1 = r4.zza
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.google.android.gms.internal.mlkit_common.zzo r4 = r4.zzb
            com.google.android.gms.internal.mlkit_common.zzo r4 = r4.zzc
            java.lang.String r1 = ""
        L17:
            if (r4 == 0) goto L51
            java.lang.Object r2 = r4.zzb
            r0.append(r1)
            java.lang.String r1 = r4.zza
            if (r1 == 0) goto L2a
            r0.append(r1)
            r1 = 61
            r0.append(r1)
        L2a:
            if (r2 == 0) goto L49
            java.lang.Class r1 = r2.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L49
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.util.Arrays.deepToString(r1)
            int r2 = r1.length()
            int r2 = r2 + (-1)
            r3 = 1
            r0.append(r1, r3, r2)
            goto L4c
        L49:
            r0.append(r2)
        L4c:
            com.google.android.gms.internal.mlkit_common.zzo r4 = r4.zzc
            java.lang.String r1 = ", "
            goto L17
        L51:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final com.google.android.gms.internal.mlkit_common.zzq zza(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzo r0 = new com.google.android.gms.internal.mlkit_common.zzo
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzo r1 = r2.zzc
            r1.zzc = r0
            r2.zzc = r0
            r0.zzb = r4
            r0.zza = r3
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzq zzb(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r3)
            com.google.android.gms.internal.mlkit_common.zzn r3 = new com.google.android.gms.internal.mlkit_common.zzn
            r0 = 0
            r3.<init>(r0)
            com.google.android.gms.internal.mlkit_common.zzo r0 = r1.zzc
            r0.zzc = r3
            r1.zzc = r3
            r3.zzb = r2
            java.lang.String r2 = "isManifestFile"
            r3.zza = r2
            return r1
    }
}
