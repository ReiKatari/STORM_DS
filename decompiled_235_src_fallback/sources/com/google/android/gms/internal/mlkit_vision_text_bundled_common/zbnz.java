package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbnz extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa {
    public zbnz() {
            r1 = this;
            java.lang.String r0 = "com.google.mlkit.vision.text.aidls.ITextRecognizer"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbb
    public final boolean zba(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L54
            r0 = 2
            if (r2 == r0) goto L4d
            r0 = 3
            if (r2 == r0) goto L2c
            r0 = 4
            if (r2 == r0) goto Le
            r1 = 0
            return r1
        Le:
            android.os.IBinder r2 = r3.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zba(r3, r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbb(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf[] r1 = r1.zbe(r2, r0)
            r4.writeNoException()
            r4.writeTypedArray(r1, r5)
            goto L5a
        L2c:
            android.os.IBinder r2 = r3.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zba(r3, r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.zbb(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r1 = r1.zbb(r2, r0)
            r4.writeNoException()
            r4.writeInt(r5)
            r1.writeToParcel(r4, r5)
            goto L5a
        L4d:
            r1.zbd()
            r4.writeNoException()
            goto L5a
        L54:
            r1.zbc()
            r4.writeNoException()
        L5a:
            return r5
    }
}
