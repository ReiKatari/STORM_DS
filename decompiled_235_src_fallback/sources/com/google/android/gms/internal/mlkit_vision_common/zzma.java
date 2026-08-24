package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzma extends com.google.android.gms.internal.mlkit_vision_common.zzme {
    private final java.lang.String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzma(java.lang.String r1, boolean r2, int r3, com.google.android.gms.internal.mlkit_vision_common.zzlz r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.mlkit_vision_common.zzme
            r2 = 0
            if (r1 == 0) goto L28
            com.google.android.gms.internal.mlkit_vision_common.zzme r5 = (com.google.android.gms.internal.mlkit_vision_common.zzme) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            boolean r1 = r4.zzb
            boolean r3 = r5.zzc()
            if (r1 != r3) goto L28
            int r4 = r4.zzc
            int r5 = r5.zza()
            if (r4 != r5) goto L28
            return r0
        L28:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            r2 = 1
            boolean r3 = r4.zzb
            if (r2 == r3) goto L12
            r2 = 1237(0x4d5, float:1.733E-42)
            goto L14
        L12:
            r2 = 1231(0x4cf, float:1.725E-42)
        L14:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r4 = r4.zzc
            r4 = r4 ^ r0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.zza
            boolean r1 = r4.zzb
            int r4 = r4.zzc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MLKitLoggingOptions{libraryName="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", enableFirelog="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", firelogEventType="
            r2.append(r0)
            java.lang.String r0 = "}"
            java.lang.String r4 = defpackage.lb1.o(r2, r4, r0)
            return r4
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final java.lang.String zzb() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
            r0 = this;
            boolean r0 = r0.zzb
            return r0
    }
}
