package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zboc extends zbb implements zbod {
    public zboc() {
        super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    public static zbod asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        if (queryLocalInterface instanceof zbod) {
            return (zbod) queryLocalInterface;
        }
        return new zbob(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zbc.zbb(parcel);
            zboa newTextRecognizerWithOptions = newTextRecognizerWithOptions(zh4.c(parcel.readStrongBinder()), (zbom) zbc.zba(parcel, zbom.CREATOR));
            parcel2.writeNoException();
            zbc.zbc(parcel2, newTextRecognizerWithOptions);
        } else {
            d13 c = zh4.c(parcel.readStrongBinder());
            zbc.zbb(parcel);
            zboa newTextRecognizer = newTextRecognizer(c);
            parcel2.writeNoException();
            zbc.zbc(parcel2, newTextRecognizer);
        }
        return true;
    }
}
