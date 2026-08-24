package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg4  reason: default package */
/* loaded from: classes.dex */
public final class yg4 {
    public final java.lang.String a;
    public final android.app.Notification b;

    public yg4(java.lang.String r1, android.app.Notification r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final void a(defpackage.y03 r4) {
            r3 = this;
            java.lang.String r0 = r3.a
            android.app.Notification r3 = r3.b
            w03 r4 = (defpackage.w03) r4
            r4.getClass()
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = defpackage.y03.c     // Catch: java.lang.Throwable -> L2c
            r1.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
            r1.writeString(r0)     // Catch: java.lang.Throwable -> L2c
            r0 = 2002(0x7d2, float:2.805E-42)
            r1.writeInt(r0)     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r1.writeString(r0)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r1.writeTypedObject(r3, r2)     // Catch: java.lang.Throwable -> L2c
            android.os.IBinder r3 = r4.d     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            r3.transact(r4, r1, r0, r4)     // Catch: java.lang.Throwable -> L2c
            r1.recycle()
            return
        L2c:
            r3 = move-exception
            r1.recycle()
            throw r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NotifyTask[packageName:"
            r0.<init>(r1)
            java.lang.String r2 = r2.a
            java.lang.String r1 = ", id:2002, tag:null]"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
