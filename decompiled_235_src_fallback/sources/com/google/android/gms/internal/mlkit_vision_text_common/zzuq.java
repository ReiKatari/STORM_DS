package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzuq> CREATOR = null;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzur r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzur
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzuq.CREATOR = r0
            return
    }

    public zzuq(int r1, int r2, int r3, int r4, long r5) {
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
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            r5 = 2
            int r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 3
            int r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 4
            int r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 5
            long r1 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
