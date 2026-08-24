package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzf> CREATOR = null;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzg r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR = r0
            return
    }

    public zzf(int r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            r4 = 3
            int r1 = r2.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 4
            int r1 = r2.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 5
            int r1 = r2.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 6
            float r2 = r2.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r3, r4, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
