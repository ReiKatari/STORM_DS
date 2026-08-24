package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zam extends defpackage.gz7 implements android.os.IInterface {
    public zam(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ISignInButtonCreator"
            r1.<init>(r2, r0)
            return
    }

    public final defpackage.d13 zae(defpackage.d13 r2, com.google.android.gms.common.internal.zax r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.c(r0, r3)
            r2 = 2
            android.os.Parcel r1 = r1.zab(r2, r0)
            android.os.IBinder r2 = r1.readStrongBinder()
            d13 r2 = defpackage.zh4.c(r2)
            r1.recycle()
            return r2
    }
}
