package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzr extends o28 implements IInterface {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final d13 zze(d13 d13Var, String str, int i, d13 d13Var2) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(i);
        w28.d(zza, d13Var2);
        Parcel zzB = zzB(2, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }

    public final d13 zzf(d13 d13Var, String str, int i, d13 d13Var2) {
        Parcel zza = zza();
        w28.d(zza, d13Var);
        zza.writeString(str);
        zza.writeInt(i);
        w28.d(zza, d13Var2);
        Parcel zzB = zzB(3, zza);
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }
}
