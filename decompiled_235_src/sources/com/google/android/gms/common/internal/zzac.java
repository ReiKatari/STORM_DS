package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzac extends u28 implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.u28
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                w28.b(parcel);
                zzc(parcel.readInt(), parcel.readStrongBinder(), (zzk) w28.a(parcel, zzk.CREATOR));
            } else {
                w28.b(parcel);
                zzb(parcel.readInt(), (Bundle) w28.a(parcel, Bundle.CREATOR));
            }
        } else {
            w28.b(parcel);
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) w28.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
