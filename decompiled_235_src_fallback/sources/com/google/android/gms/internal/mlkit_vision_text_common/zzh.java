package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzh extends com.google.android.gms.internal.mlkit_vision_text_common.zza implements android.os.IInterface {
    public zzh(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"
            r1.<init>(r2, r0)
            return
    }

    public final void zzd() {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            r2.zzc(r0, r1)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzl[] zze(defpackage.d13 r2, com.google.android.gms.internal.mlkit_vision_text_common.zzd r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r0, r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zza(r0, r3)
            r2 = 1
            android.os.Parcel r1 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzl> r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzl.CREATOR
            java.lang.Object[] r2 = r1.createTypedArray(r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzl[] r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl[]) r2
            r1.recycle()
            return r2
    }
}
