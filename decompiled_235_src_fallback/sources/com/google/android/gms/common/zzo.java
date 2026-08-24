package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzo> CREATOR = null;
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
            com.google.android.gms.common.zzp r0 = new com.google.android.gms.common.zzp
            r0.<init>()
            com.google.android.gms.common.zzo.CREATOR = r0
            return
    }

    public zzo(java.lang.String r1, boolean r2, boolean r3, android.os.IBinder r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            d13 r1 = defpackage.zh4.c(r4)
            java.lang.Object r1 = defpackage.zh4.d(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.zzd = r1
            r0.zze = r5
            r0.zzf = r6
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
            boolean r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            android.content.Context r5 = r3.zzd
            zh4 r1 = new zh4
            r1.<init>(r5)
            r5 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r5, r1, r2)
            r5 = 5
            boolean r1 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 6
            boolean r3 = r3.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
