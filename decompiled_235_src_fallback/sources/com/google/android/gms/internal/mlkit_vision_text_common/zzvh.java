package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzvh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzvh> CREATOR = null;
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;
    private final int zze;
    private final java.lang.String zzf;
    private final boolean zzg;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzvi r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvi
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzvh.CREATOR = r0
            return
    }

    public zzvh(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, int r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzf = r6
            r0.zze = r5
            r0.zzd = r4
            r0.zzg = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 2
            java.lang.String r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 3
            java.lang.String r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 4
            boolean r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 5
            int r1 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 6
            java.lang.String r1 = r3.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 7
            boolean r3 = r3.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
