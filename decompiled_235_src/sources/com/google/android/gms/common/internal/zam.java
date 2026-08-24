package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zam extends gz7 implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final d13 zae(d13 d13Var, zax zaxVar) {
        Parcel zaa = zaa();
        kz7.d(zaa, d13Var);
        kz7.c(zaa, zaxVar);
        Parcel zab = zab(2, zaa);
        d13 c = zh4.c(zab.readStrongBinder());
        zab.recycle();
        return c;
    }
}
