package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzq extends o28 implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(d13 d13Var, String str, boolean z) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(d13 d13Var, String str, boolean z) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final d13 zzh(d13 d13Var, String str, int i) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(2, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }

    public final d13 zzi(d13 d13Var, String str, int i, d13 d13Var2) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(i);
        w28.d(zza, d13Var2);
        Parcel zzB = zzB(8, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }

    public final d13 zzj(d13 d13Var, String str, int i) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(4, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }

    public final d13 zzk(d13 d13Var, String str, boolean z, long j) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        Parcel zzB = zzB(7, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }
}
