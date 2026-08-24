package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuw extends com.google.android.gms.internal.mlkit_vision_text_common.zza implements com.google.android.gms.internal.mlkit_vision_text_common.zzuy {
    public zzuw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzuv zzd(defpackage.d13 r3) {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r0, r3)
            r3 = 1
            android.os.Parcel r2 = r2.zzb(r3, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L14
            r3 = 0
            goto L28
        L14:
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizer"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            if (r1 == 0) goto L22
            r3 = r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuv) r3
            goto L28
        L22:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            r0.<init>(r3)
            r3 = r0
        L28:
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzuv zze(defpackage.d13 r2, com.google.android.gms.internal.mlkit_vision_text_common.zzvh r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zzb(r0, r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzc.zza(r0, r3)
            r2 = 2
            android.os.Parcel r1 = r1.zzb(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L17
            r2 = 0
            goto L2b
        L17:
            java.lang.String r3 = "com.google.mlkit.vision.text.aidls.ITextRecognizer"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            if (r0 == 0) goto L25
            r2 = r3
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuv) r2
            goto L2b
        L25:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuv r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuv
            r3.<init>(r2)
            r2 = r3
        L2b:
            r1.recycle()
            return r2
    }
}
