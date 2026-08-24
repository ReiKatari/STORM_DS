package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzus extends com.google.android.gms.internal.mlkit_vision_text_common.zza implements com.google.android.gms.internal.mlkit_vision_text_common.zzuu {
    public zzus(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuu
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzuv zzd(defpackage.d13 r1, defpackage.d13 r2, com.google.android.gms.internal.mlkit_vision_text_common.zzvh r3) {
            r0 = this;
            android.os.Parcel r2 = r0.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r2, r1)
            r1 = 0
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zza(r2, r3)
            r3 = 1
            android.os.Parcel r0 = r0.zzb(r3, r2)
            android.os.IBinder r2 = r0.readStrongBinder()
            if (r2 != 0) goto L1a
            goto L2c
        L1a:
            java.lang.String r1 = "com.google.mlkit.vision.text.aidls.ITextRecognizer"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            if (r3 == 0) goto L27
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r1 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuv) r1
            goto L2c
        L27:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            r1.<init>(r2)
        L2c:
            r0.recycle()
            return r1
    }
}
