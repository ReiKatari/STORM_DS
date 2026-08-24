package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzq> CREATOR = null;
    private final boolean zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;

    static {
            com.google.android.gms.common.zzr r0 = new com.google.android.gms.common.zzr
            r0.<init>()
            com.google.android.gms.common.zzq.CREATOR = r0
            return
    }

    public zzq(boolean r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            int r1 = com.google.android.gms.common.zzy.zza(r3)
            int r1 = r1 + (-1)
            r0.zzc = r1
            int r1 = com.google.android.gms.common.zzd.zza(r4)
            int r1 = r1 + (-1)
            r0.zzd = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            boolean r1 = r3.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            java.lang.String r0 = r3.zzb
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r0, r1)
            r0 = 3
            int r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            int r3 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final java.lang.String zza() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    public final boolean zzb() {
            r0 = this;
            boolean r0 = r0.zza
            return r0
    }

    public final int zzc() {
            r0 = this;
            int r0 = r0.zzd
            int r0 = com.google.android.gms.common.zzd.zza(r0)
            return r0
    }

    public final int zzd() {
            r0 = this;
            int r0 = r0.zzc
            int r0 = com.google.android.gms.common.zzy.zza(r0)
            return r0
    }
}
