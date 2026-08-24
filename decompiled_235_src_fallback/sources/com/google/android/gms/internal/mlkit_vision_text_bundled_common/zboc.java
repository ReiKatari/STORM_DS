package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zboc extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod {
    public zboc() {
            r1 = this;
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod asInterface(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
            if (r1 == 0) goto L11
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod) r0
            return r0
        L11:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbob r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbob
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L26
            r0 = 2
            if (r2 == r0) goto L8
            r1 = 0
            return r1
        L8:
            android.os.IBinder r2 = r3.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zba(r3, r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbb(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa r1 = r1.newTextRecognizerWithOptions(r2, r0)
            r4.writeNoException()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbc(r4, r1)
            goto L3b
        L26:
            android.os.IBinder r2 = r3.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbb(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa r1 = r1.newTextRecognizer(r2)
            r4.writeNoException()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbc(r4, r1)
        L3b:
            return r5
    }
}
