package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzab extends defpackage.o28 implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzab(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int r2, android.os.IBinder r3, android.os.Bundle r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeInt(r2)
            r0.writeStrongBinder(r3)
            defpackage.w28.c(r0, r4)
            r2 = 1
            r1.zzC(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int r1, android.os.Bundle r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int r1, android.os.IBinder r2, com.google.android.gms.common.internal.zzk r3) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
