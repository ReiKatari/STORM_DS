package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzus extends zza implements zzuu {
    public zzus(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuu
    public final zzuv zzd(d13 d13Var, d13 d13Var2, zzvh zzvhVar) {
        Parcel zza = zza();
        zzc.zzb(zza, d13Var);
        zzuv zzuvVar = null;
        zzc.zzb(zza, null);
        zzc.zza(zza, zzvhVar);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof zzuv) {
                zzuvVar = (zzuv) queryLocalInterface;
            } else {
                zzuvVar = new zzuv(readStrongBinder);
            }
        }
        zzb.recycle();
        return zzuvVar;
    }
}
