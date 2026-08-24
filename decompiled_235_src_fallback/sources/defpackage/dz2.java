package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz2  reason: default package */
/* loaded from: classes.dex */
public final class dz2 implements defpackage.ui6 {
    public final defpackage.lk2 A;
    public boolean B;
    public final /* synthetic */ defpackage.hz2 L;

    public dz2(defpackage.hz2 r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            lk2 r0 = new lk2
            bt r2 = r2.c
            java.lang.Object r2 = r2.R
            ee5 r2 = (defpackage.ee5) r2
            ui6 r2 = r2.A
            b67 r2 = r2.b()
            r0.<init>(r2)
            r1.A = r0
            return
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r5, long r6) {
            r4 = this;
            boolean r0 = r4.B
            java.lang.String r1 = "closed"
            if (r0 != 0) goto L31
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            hz2 r4 = r4.L
            bt r4 = r4.c
            java.lang.Object r4 = r4.R
            ee5 r4 = (defpackage.ee5) r4
            boolean r0 = r4.L
            if (r0 != 0) goto L2d
            k80 r0 = r4.B
            r0.p0(r6)
            r4.e()
            java.lang.String r0 = "\r\n"
            r4.H(r0)
            r4.O(r5, r6)
            r4.H(r0)
            return
        L2d:
            defpackage.i.m(r1)
            return
        L31:
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            lk2 r0 = r0.A
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.B     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            r0 = 1
            r3.B = r0     // Catch: java.lang.Throwable -> L2c
            hz2 r0 = r3.L     // Catch: java.lang.Throwable -> L2c
            bt r0 = r0.c     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.R     // Catch: java.lang.Throwable -> L2c
            ee5 r0 = (defpackage.ee5) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "0\r\n\r\n"
            r0.H(r1)     // Catch: java.lang.Throwable -> L2c
            lk2 r0 = r3.A     // Catch: java.lang.Throwable -> L2c
            b67 r1 = r0.e     // Catch: java.lang.Throwable -> L2c
            a67 r2 = defpackage.b67.d     // Catch: java.lang.Throwable -> L2c
            r0.e = r2     // Catch: java.lang.Throwable -> L2c
            r1.a()     // Catch: java.lang.Throwable -> L2c
            r1.b()     // Catch: java.lang.Throwable -> L2c
            hz2 r0 = r3.L     // Catch: java.lang.Throwable -> L2c
            r1 = 3
            r0.d = r1     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final synchronized void flush() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.B     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            hz2 r0 = r1.L     // Catch: java.lang.Throwable -> L14
            bt r0 = r0.c     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.R     // Catch: java.lang.Throwable -> L14
            ee5 r0 = (defpackage.ee5) r0     // Catch: java.lang.Throwable -> L14
            r0.flush()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }
}
