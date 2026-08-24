package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzc {
    static {
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_common.zzc> r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzc.class
            r0.getClassLoader()
            return
    }

    private zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(android.os.Parcel r1, android.os.Parcelable r2) {
            r0 = 1
            r1.writeInt(r0)
            r0 = 0
            r2.writeToParcel(r1, r0)
            return
    }

    public static void zzb(android.os.Parcel r0, android.os.IInterface r1) {
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
