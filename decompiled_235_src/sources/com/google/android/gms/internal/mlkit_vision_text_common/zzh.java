package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    public final void zzd() {
        zzc(2, zza());
    }

    public final zzl[] zze(d13 d13Var, zzd zzdVar) {
        Parcel zza = zza();
        zzc.zzb(zza, d13Var);
        zzc.zza(zza, zzdVar);
        Parcel zzb = zzb(1, zza);
        zzl[] zzlVarArr = (zzl[]) zzb.createTypedArray(zzl.CREATOR);
        zzb.recycle();
        return zzlVarArr;
    }
}
