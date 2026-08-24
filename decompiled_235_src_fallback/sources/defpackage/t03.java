package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t03  reason: default package */
/* loaded from: classes.dex */
public final class t03 implements defpackage.u03 {
    public android.os.IBinder d;

    @Override // defpackage.u03
    public final void a(java.lang.String[] r3) {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = defpackage.u03.a     // Catch: java.lang.Throwable -> L17
            r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
            r0.writeStringArray(r3)     // Catch: java.lang.Throwable -> L17
            android.os.IBinder r2 = r2.d     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r1 = 1
            r2.transact(r1, r0, r3, r1)     // Catch: java.lang.Throwable -> L17
            r0.recycle()
            return
        L17:
            r2 = move-exception
            r0.recycle()
            throw r2
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            android.os.IBinder r0 = r0.d
            return r0
    }
}
