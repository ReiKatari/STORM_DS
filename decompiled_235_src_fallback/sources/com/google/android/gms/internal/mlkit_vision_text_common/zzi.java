package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzi extends com.google.android.gms.internal.mlkit_vision_text_common.zza implements com.google.android.gms.internal.mlkit_vision_text_common.zzk {
    public zzi(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzk
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzh zzd(defpackage.d13 r2, com.google.android.gms.internal.mlkit_vision_text_common.zzp r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r0, r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zza(r0, r3)
            r2 = 1
            android.os.Parcel r1 = r1.zzb(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L17
            r2 = 0
            goto L2b
        L17:
            java.lang.String r3 = "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzh
            if (r0 == 0) goto L25
            r2 = r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzh) r2
            goto L2b
        L25:
            com.google.android.gms.internal.mlkit_vision_text_common.zzh r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzh
            r3.<init>(r2)
            r2 = r3
        L2b:
            r1.recycle()
            return r2
    }
}
