package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzz extends defpackage.u28 implements com.google.android.gms.common.internal.zzaa {
    public zzz() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.common.internal.zzaa zzg(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zzaa
            if (r1 == 0) goto Ld
            com.google.android.gms.common.internal.zzaa r0 = (com.google.android.gms.common.internal.zzaa) r0
            return r0
        Ld:
            com.google.android.gms.common.internal.zzy r0 = new com.google.android.gms.common.internal.zzy
            r0.<init>(r2)
            return r0
    }

    @Override // defpackage.u28
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L13
            r4 = 2
            if (r1 == r4) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0.zzc()
            r3.writeNoException()
            r3.writeInt(r0)
            goto L1d
        L13:
            d13 r0 = r0.zzd()
            r3.writeNoException()
            defpackage.w28.d(r3, r0)
        L1d:
            return r2
    }
}
