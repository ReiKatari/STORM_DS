package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzr extends defpackage.o28 implements android.os.IInterface {
    public zzr(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            r1.<init>(r2, r0)
            return
    }

    public final defpackage.d13 zze(defpackage.d13 r2, java.lang.String r3, int r4, defpackage.d13 r5) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            defpackage.w28.d(r0, r5)
            r2 = 2
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }

    public final defpackage.d13 zzf(defpackage.d13 r2, java.lang.String r3, int r4, defpackage.d13 r5) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            defpackage.w28.d(r0, r5)
            r2 = 3
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }
}
