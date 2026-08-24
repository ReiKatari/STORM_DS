package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzq extends defpackage.o28 implements android.os.IInterface {
    public zzq(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            r1.<init>(r2, r0)
            return
    }

    public final int zze() {
            r2 = this;
            r0 = 6
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            int r0 = r2.readInt()
            r2.recycle()
            return r0
    }

    public final int zzf(defpackage.d13 r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 3
            android.os.Parcel r1 = r1.zzB(r2, r0)
            int r2 = r1.readInt()
            r1.recycle()
            return r2
    }

    public final int zzg(defpackage.d13 r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 5
            android.os.Parcel r1 = r1.zzB(r2, r0)
            int r2 = r1.readInt()
            r1.recycle()
            return r2
    }

    public final defpackage.d13 zzh(defpackage.d13 r2, java.lang.String r3, int r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 2
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }

    public final defpackage.d13 zzi(defpackage.d13 r2, java.lang.String r3, int r4, defpackage.d13 r5) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            defpackage.w28.d(r0, r5)
            r2 = 8
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }

    public final defpackage.d13 zzj(defpackage.d13 r2, java.lang.String r3, int r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 4
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }

    public final defpackage.d13 zzk(defpackage.d13 r2, java.lang.String r3, boolean r4, long r5) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.d(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeLong(r5)
            r2 = 7
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }
}
