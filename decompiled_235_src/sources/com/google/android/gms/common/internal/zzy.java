package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzy extends o28 implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final d13 zzd() {
        Parcel zzB = zzB(1, zza());
        d13 c = zh4.c(zzB.readStrongBinder());
        zzB.recycle();
        return c;
    }
}
