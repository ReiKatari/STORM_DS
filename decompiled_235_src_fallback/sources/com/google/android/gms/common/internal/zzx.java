package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzx extends defpackage.o28 implements com.google.android.gms.common.internal.ICancelToken {
    public zzx(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            r2.zzD(r0, r1)
            return
    }
}
