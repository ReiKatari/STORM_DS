package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gz7  reason: default package */
/* loaded from: classes.dex */
public abstract class gz7 implements android.os.IInterface {
    private final android.os.IBinder zaa;
    private final java.lang.String zab;

    public gz7(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.zaa
            return r0
    }

    public final android.os.Parcel zaa() {
            r1 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r1.zab
            r0.writeInterfaceToken(r1)
            return r0
    }

    public final android.os.Parcel zab(int r3, android.os.Parcel r4) {
            r2 = this;
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r2.zaa     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r0 = 2
            r1 = 0
            r2.transact(r0, r4, r3, r1)     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r3.readException()     // Catch: java.lang.Throwable -> L12 java.lang.RuntimeException -> L14
            r4.recycle()
            return r3
        L12:
            r2 = move-exception
            goto L19
        L14:
            r2 = move-exception
            r3.recycle()     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L19:
            r4.recycle()
            throw r2
    }

    public final void zac(int r3, android.os.Parcel r4) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r2.zaa     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.transact(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L14
            r0.readException()     // Catch: java.lang.Throwable -> L14
            r4.recycle()
            r0.recycle()
            return
        L14:
            r2 = move-exception
            r4.recycle()
            r0.recycle()
            throw r2
    }

    public final void zad(int r2, android.os.Parcel r3) {
            r1 = this;
            android.os.IBinder r1 = r1.zaa     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            r0 = 1
            r1.transact(r0, r3, r2, r0)     // Catch: java.lang.Throwable -> Lb
            r3.recycle()
            return
        Lb:
            r1 = move-exception
            r3.recycle()
            throw r1
    }
}
