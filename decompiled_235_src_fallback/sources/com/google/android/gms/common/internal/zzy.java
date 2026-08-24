package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzy extends defpackage.o28 implements com.google.android.gms.common.internal.zzaa {
    public zzy(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            int r0 = r2.readInt()
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final defpackage.d13 zzd() {
            r2 = this;
            r0 = 1
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            android.os.IBinder r0 = r2.readStrongBinder()
            d13 r0 = defpackage.zh4.c(r0)
            r2.recycle()
            return r0
    }
}
