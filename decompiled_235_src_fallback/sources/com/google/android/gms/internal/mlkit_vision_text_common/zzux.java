package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzux extends com.google.android.gms.internal.mlkit_vision_text_common.zzb implements com.google.android.gms.internal.mlkit_vision_text_common.zzuy {
    public static com.google.android.gms.internal.mlkit_vision_text_common.zzuy zza(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_common.zzuy
            if (r1 == 0) goto L11
            com.google.android.gms.internal.mlkit_vision_text_common.zzuy r0 = (com.google.android.gms.internal.mlkit_vision_text_common.zzuy) r0
            return r0
        L11:
            com.google.android.gms.internal.mlkit_vision_text_common.zzuw r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuw
            r0.<init>(r2)
            return r0
    }
}
