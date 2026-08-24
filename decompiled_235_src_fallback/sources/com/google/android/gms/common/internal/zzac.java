package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzac extends defpackage.u28 implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzac() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // defpackage.u28
    public final boolean zza(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L35
            r0 = 2
            if (r3 == r0) goto L22
            r0 = 3
            if (r3 == r0) goto Lb
            r2 = 0
            return r2
        Lb:
            int r3 = r4.readInt()
            android.os.IBinder r0 = r4.readStrongBinder()
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzk> r1 = com.google.android.gms.common.internal.zzk.CREATOR
            android.os.Parcelable r1 = defpackage.w28.a(r4, r1)
            com.google.android.gms.common.internal.zzk r1 = (com.google.android.gms.common.internal.zzk) r1
            defpackage.w28.b(r4)
            r2.zzc(r3, r0, r1)
            goto L4b
        L22:
            int r3 = r4.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = defpackage.w28.a(r4, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            defpackage.w28.b(r4)
            r2.zzb(r3, r0)
            goto L4b
        L35:
            int r3 = r4.readInt()
            android.os.IBinder r0 = r4.readStrongBinder()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = defpackage.w28.a(r4, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            defpackage.w28.b(r4)
            r2.onPostInitComplete(r3, r0, r1)
        L4b:
            r5.writeNoException()
            return r6
    }
}
