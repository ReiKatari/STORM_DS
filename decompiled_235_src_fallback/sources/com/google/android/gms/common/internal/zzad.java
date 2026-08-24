package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzad implements com.google.android.gms.common.internal.IGmsServiceBroker {
    private final android.os.IBinder zza;

    public zzad(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void getService(com.google.android.gms.common.internal.IGmsCallbacks r4, com.google.android.gms.common.internal.GetServiceRequest r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L16
            android.os.IBinder r4 = r4.asBinder()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r3 = move-exception
            goto L39
        L16:
            r4 = 0
        L17:
            r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L14
            r4 = 0
            if (r5 == 0) goto L25
            r2 = 1
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.internal.zzn.zza(r5, r0, r4)     // Catch: java.lang.Throwable -> L14
            goto L28
        L25:
            r0.writeInt(r4)     // Catch: java.lang.Throwable -> L14
        L28:
            android.os.IBinder r3 = r3.zza     // Catch: java.lang.Throwable -> L14
            r5 = 46
            r3.transact(r5, r0, r1, r4)     // Catch: java.lang.Throwable -> L14
            r1.readException()     // Catch: java.lang.Throwable -> L14
            r1.recycle()
            r0.recycle()
            return
        L39:
            r1.recycle()
            r0.recycle()
            throw r3
    }
}
