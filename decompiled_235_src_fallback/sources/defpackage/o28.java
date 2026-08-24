package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o28  reason: default package */
/* loaded from: classes.dex */
public abstract class o28 implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    public o28(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.zza
            return r0
    }

    public final android.os.Parcel zzB(int r3, android.os.Parcel r4) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r2.zza     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r1 = 0
            r2.transact(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r4.recycle()
            return r0
        L11:
            r2 = move-exception
            goto L18
        L13:
            r2 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L11
        L18:
            r4.recycle()
            throw r2
    }

    public final void zzC(int r3, android.os.Parcel r4) {
            r2 = this;
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r2.zza     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r1 = 0
            r2.transact(r0, r4, r3, r1)     // Catch: java.lang.Throwable -> L15
            r3.readException()     // Catch: java.lang.Throwable -> L15
            r4.recycle()
            r3.recycle()
            return
        L15:
            r2 = move-exception
            r4.recycle()
            r3.recycle()
            throw r2
    }

    public final void zzD(int r3, android.os.Parcel r4) {
            r2 = this;
            android.os.IBinder r2 = r2.zza     // Catch: java.lang.Throwable -> Lc
            r3 = 0
            r0 = 1
            r1 = 2
            r2.transact(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> Lc
            r4.recycle()
            return
        Lc:
            r2 = move-exception
            r4.recycle()
            throw r2
    }

    public final android.os.Parcel zza() {
            r1 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r1.zzb
            r0.writeInterfaceToken(r1)
            return r0
    }
}
