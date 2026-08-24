package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzd> CREATOR = null;
    public int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    public int zze;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zze r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zze
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzd.CREATOR = r0
            return
    }

    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    public zzd(int r1, int r2, int r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 2
            int r1 = r3.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            int r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            int r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 5
            long r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            r0 = 6
            int r3 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
