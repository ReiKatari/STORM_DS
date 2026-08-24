package com.google.android.gms.common.internal.service;

import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zaj extends hz7 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // defpackage.hz7
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            kz7.b(parcel);
            zab(readInt);
            return true;
        }
        return false;
    }
}
