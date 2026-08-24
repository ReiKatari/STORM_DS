package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ox3  reason: default package */
/* loaded from: classes.dex */
public final class ox3 implements defpackage.jk5, defpackage.bt2 {
    public final java.util.concurrent.CopyOnWriteArrayList A;

    public ox3() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.A = r0
            return
    }

    @Override // defpackage.jk5
    public final void D(defpackage.yk5 r1, long r2, defpackage.uh r4) {
            r0 = this;
            r1.getClass()
            long r1 = r1.X()
            r0.d(r1, r4)
            return
    }

    @Override // defpackage.bt2
    public final void a() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            gm5 r0 = (defpackage.gm5) r0
            r0.c()
            goto L9
        L19:
            return
    }

    @Override // defpackage.bt2
    public final void b() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            gm5 r0 = (defpackage.gm5) r0
            r0.c()
            goto L9
        L19:
            return
    }

    @Override // defpackage.bt2
    public final void c() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            gm5 r0 = (defpackage.gm5) r0
            r0.c()
            goto L9
        L19:
            return
    }

    public final void d(long r11, defpackage.uh r13) {
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r0.next()
            gm5 r1 = (defpackage.gm5) r1
            r1.getClass()
            r13.getClass()
            tu0 r2 = r1.R
            boolean r2 = r2.W()
            if (r2 != 0) goto Lcd
            tu0 r2 = r1.R
            boolean r2 = r2.isCancelled()
            if (r2 == 0) goto L2d
            goto Lcd
        L2d:
            monitor-enter(r1)
            zk5 r2 = r1.Z     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Lc8
            long r2 = r2.a     // Catch: java.lang.Throwable -> Lc6
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            goto Lc8
        L3a:
            monitor-exit(r1)
            android.hardware.camera2.CaptureResult$Key r2 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            r2.getClass()
            android.hardware.camera2.CaptureResult r3 = r13.A
            java.lang.Object r2 = r3.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            android.hardware.camera2.CaptureResult r3 = r13.A
            long r3 = r3.getFrameNumber()
            if (r2 == 0) goto L56
            java.lang.Long r5 = r1.Y
            if (r5 != 0) goto L56
            r1.Y = r2
        L56:
            java.lang.Long r5 = r1.Y
            java.lang.Long r6 = r1.L
            if (r6 == 0) goto L7f
            if (r5 == 0) goto L7f
            if (r2 == 0) goto L7f
            long r6 = r2.longValue()
            long r8 = r5.longValue()
            long r6 = r6 - r8
            java.lang.Long r2 = r1.L
            long r8 = r2.longValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7f
            tu0 r2 = r1.R
            fm5 r3 = new fm5
            r4 = 2
            r3.<init>(r4, r13)
            r2.b0(r3)
            goto Lcd
        L7f:
            nm2 r2 = r1.X
            if (r2 != 0) goto L8a
            nm2 r2 = new nm2
            r2.<init>(r3)
            r1.X = r2
        L8a:
            nm2 r2 = r1.X
            if (r2 == 0) goto Laa
            java.lang.Integer r5 = r1.B
            if (r5 == 0) goto Laa
            long r6 = r2.a
            long r3 = r3 - r6
            int r2 = r5.intValue()
            long r5 = (long) r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Laa
            tu0 r2 = r1.R
            fm5 r3 = new fm5
            r4 = 1
            r3.<init>(r4, r13)
            r2.b0(r3)
            goto Lcd
        Laa:
            qn2 r2 = r1.A
            java.lang.Object r2 = r2.g(r13)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lba
            goto L9
        Lba:
            tu0 r2 = r1.R
            fm5 r3 = new fm5
            r4 = 0
            r3.<init>(r4, r13)
            r2.b0(r3)
            goto Lcd
        Lc6:
            r10 = move-exception
            goto Lcb
        Lc8:
            monitor-exit(r1)
            goto L9
        Lcb:
            monitor-exit(r1)
            throw r10
        Lcd:
            java.util.concurrent.CopyOnWriteArrayList r2 = r10.A
            r2.remove(r1)
            goto L9
        Ld4:
            return
    }

    @Override // defpackage.jk5
    public final void k(defpackage.yk5 r5) {
            r4 = this;
            r5.getClass()
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.A
            java.util.Iterator r4 = r4.iterator()
            r4.getClass()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            gm5 r0 = (defpackage.gm5) r0
            long r1 = r5.X()
            monitor-enter(r0)
            zk5 r3 = r0.Z     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L2b
            zk5 r3 = new zk5     // Catch: java.lang.Throwable -> L29
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r0.Z = r3     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r4 = move-exception
            goto L2d
        L2b:
            monitor-exit(r0)
            goto Lc
        L2d:
            monitor-exit(r0)
            throw r4
        L2f:
            return
    }

    @Override // defpackage.jk5
    public final void x(defpackage.yk5 r1, long r2, defpackage.th r4) {
            r0 = this;
            long r1 = r1.X()
            hh7 r3 = r4.L
            uh r3 = (defpackage.uh) r3
            r0.d(r1, r3)
            return
    }
}
