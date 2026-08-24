package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbc {
    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc.class
            r0.getClassLoader()
            return
    }

    private zbc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Parcelable zba(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zbb(android.os.Parcel r2) {
            int r2 = r2.dataAvail()
            if (r2 > 0) goto L7
            return
        L7:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            java.lang.String r1 = "Parcel data not fully consumed, unread size: "
            java.lang.String r2 = defpackage.lb1.g(r2, r1)
            r0.<init>(r2)
            throw r0
    }

    public static void zbc(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.writeStrongBinder(r1)
            return
        L7:
            android.os.IBinder r1 = r1.asBinder()
            r0.writeStrongBinder(r1)
            return
    }
}
