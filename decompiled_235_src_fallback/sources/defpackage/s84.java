package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s84  reason: default package */
/* loaded from: classes.dex */
public final class s84 extends android.os.Binder implements defpackage.v03 {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService d;

    public s84(androidx.room.MultiInstanceInvalidationService r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            java.lang.String r1 = defpackage.v03.b
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // defpackage.v03
    public final void b(java.lang.String[] r8, int r9) {
            r7 = this;
            r8.getClass()
            androidx.room.MultiInstanceInvalidationService r7 = r7.d
            t84 r0 = r7.L
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r7.B     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.lang.String r7 = "ROOM"
            java.lang.String r8 = "Remote invalidation client ID not registered"
            android.util.Log.w(r7, r8)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L1f:
            r7 = move-exception
            goto L6e
        L21:
            t84 r2 = r7.L     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            r3 = 0
        L28:
            t84 r4 = r7.L
            if (r3 >= r2) goto L69
            java.lang.Object r4 = r4.getBroadcastCookie(r3)     // Catch: java.lang.Throwable -> L56
            r4.getClass()     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L56
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L56
            java.util.LinkedHashMap r6 = r7.B     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L56
            if (r9 == r5) goto L60
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L4a
            goto L60
        L4a:
            t84 r4 = r7.L     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            android.os.IInterface r4 = r4.getBroadcastItem(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            u03 r4 = (defpackage.u03) r4     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r4.a(r8)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            goto L60
        L56:
            r8 = move-exception
            goto L63
        L58:
            r4 = move-exception
            java.lang.String r5 = "ROOM"
            java.lang.String r6 = "Error invoking a remote callback"
            android.util.Log.w(r5, r6, r4)     // Catch: java.lang.Throwable -> L56
        L60:
            int r3 = r3 + 1
            goto L28
        L63:
            t84 r7 = r7.L     // Catch: java.lang.Throwable -> L1f
            r7.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            throw r8     // Catch: java.lang.Throwable -> L1f
        L69:
            r4.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            return
        L6e:
            monitor-exit(r0)
            throw r7
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            r5 = this;
            java.lang.String r0 = defpackage.v03.b
            r1 = 1
            if (r6 < r1) goto Ld
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r2) goto Ld
            r7.enforceInterface(r0)
        Ld:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r6 != r2) goto L16
            r8.writeString(r0)
            return r1
        L16:
            r0 = 0
            if (r6 == r1) goto L73
            r2 = 2
            if (r6 == r2) goto L30
            r0 = 3
            if (r6 == r0) goto L24
            boolean r5 = super.onTransact(r6, r7, r8, r9)
            return r5
        L24:
            int r6 = r7.readInt()
            java.lang.String[] r7 = r7.createStringArray()
            r5.b(r7, r6)
            return r1
        L30:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L37
            goto L4e
        L37:
            java.lang.String r9 = defpackage.u03.a
            android.os.IInterface r9 = r6.queryLocalInterface(r9)
            if (r9 == 0) goto L47
            boolean r0 = r9 instanceof defpackage.u03
            if (r0 == 0) goto L47
            r0 = r9
            u03 r0 = (defpackage.u03) r0
            goto L4e
        L47:
            t03 r0 = new t03
            r0.<init>()
            r0.d = r6
        L4e:
            int r6 = r7.readInt()
            r0.getClass()
            androidx.room.MultiInstanceInvalidationService r5 = r5.d
            t84 r7 = r5.L
            monitor-enter(r7)
            t84 r9 = r5.L     // Catch: java.lang.Throwable -> L70
            r9.unregister(r0)     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap r5 = r5.B     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r5.remove(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L70
            monitor-exit(r7)
            r8.writeNoException()
            return r1
        L70:
            r5 = move-exception
            monitor-exit(r7)
            throw r5
        L73:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L7a
            goto L91
        L7a:
            java.lang.String r9 = defpackage.u03.a
            android.os.IInterface r9 = r6.queryLocalInterface(r9)
            if (r9 == 0) goto L8a
            boolean r0 = r9 instanceof defpackage.u03
            if (r0 == 0) goto L8a
            r0 = r9
            u03 r0 = (defpackage.u03) r0
            goto L91
        L8a:
            t03 r0 = new t03
            r0.<init>()
            r0.d = r6
        L91:
            java.lang.String r6 = r7.readString()
            r0.getClass()
            r7 = 0
            if (r6 != 0) goto L9c
            goto Lc6
        L9c:
            androidx.room.MultiInstanceInvalidationService r5 = r5.d
            t84 r9 = r5.L
            monitor-enter(r9)
            int r2 = r5.A     // Catch: java.lang.Throwable -> Lbd
            int r2 = r2 + r1
            r5.A = r2     // Catch: java.lang.Throwable -> Lbd
            t84 r3 = r5.L     // Catch: java.lang.Throwable -> Lbd
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r3.register(r0, r4)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lbf
            java.util.LinkedHashMap r5 = r5.B     // Catch: java.lang.Throwable -> Lbd
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lbd
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> Lbd
            r7 = r2
            goto Lc5
        Lbd:
            r5 = move-exception
            goto Lcd
        Lbf:
            int r6 = r5.A     // Catch: java.lang.Throwable -> Lbd
            int r6 = r6 + (-1)
            r5.A = r6     // Catch: java.lang.Throwable -> Lbd
        Lc5:
            monitor-exit(r9)
        Lc6:
            r8.writeNoException()
            r8.writeInt(r7)
            return r1
        Lcd:
            monitor-exit(r9)
            throw r5
    }
}
