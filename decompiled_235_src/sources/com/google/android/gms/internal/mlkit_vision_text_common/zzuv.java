package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuv extends zza implements IInterface {
    public zzuv(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final zzvf zzd(d13 d13Var, zzuq zzuqVar) {
        zzvf createFromParcel;
        Parcel zza = zza();
        zzc.zzb(zza, d13Var);
        zzc.zza(zza, zzuqVar);
        Parcel zzb = zzb(3, zza);
        Parcelable.Creator<zzvf> creator = zzvf.CREATOR;
        if (zzb.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(zzb);
        }
        zzvf zzvfVar = createFromParcel;
        zzb.recycle();
        return zzvfVar;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
