package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbnz extends zbb implements zboa {
    public zbnz() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    zbc.zbb(parcel);
                    zbf[] zbe = zbe(zh4.c(parcel.readStrongBinder()), (zbnx) zbc.zba(parcel, zbnx.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(zbe, 1);
                } else {
                    zbc.zbb(parcel);
                    zbok zbb = zbb(zh4.c(parcel.readStrongBinder()), (zbnx) zbc.zba(parcel, zbnx.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    zbb.writeToParcel(parcel2, 1);
                }
            } else {
                zbd();
                parcel2.writeNoException();
            }
        } else {
            zbc();
            parcel2.writeNoException();
        }
        return true;
    }
}
