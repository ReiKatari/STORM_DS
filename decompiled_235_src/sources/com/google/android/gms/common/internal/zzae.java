package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzae extends o28 implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) {
        Parcel zza = zza();
        w28.c(zza, zzoVar);
        Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) w28.a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) {
        Parcel zza = zza();
        w28.c(zza, zzoVar);
        Parcel zzB = zzB(8, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) w28.a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() {
        boolean z;
        Parcel zzB = zzB(9, zza());
        int i = w28.a;
        if (zzB.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        zzB.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, d13 d13Var) {
        boolean z;
        Parcel zza = zza();
        w28.c(zza, zzsVar);
        w28.d(zza, d13Var);
        Parcel zzB = zzB(5, zza);
        if (zzB.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        zzB.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() {
        boolean z;
        Parcel zzB = zzB(7, zza());
        int i = w28.a;
        if (zzB.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        zzB.recycle();
        return z;
    }
}
