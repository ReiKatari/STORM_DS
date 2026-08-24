package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz2  reason: default package */
/* loaded from: classes.dex */
public final class wz2 extends defpackage.pw {
    public final /* synthetic */ defpackage.xz2 n;

    public wz2(defpackage.xz2 r1) {
            r0 = this;
            r0.n = r1
            r0.<init>()
            return
    }

    @Override // defpackage.pw
    public final java.io.IOException k(java.io.IOException r1) {
            r0 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.pw
    public final void l() {
            r8 = this;
            xz2 r0 = r8.n
            a62 r1 = defpackage.a62.CANCEL
            r0.e(r1)
            xz2 r8 = r8.n
            qz2 r8 = r8.B
            monitor-enter(r8)
            long r0 = r8.j0     // Catch: java.lang.Throwable -> L42
            long r2 = r8.i0     // Catch: java.lang.Throwable -> L42
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            monitor-exit(r8)
            return
        L16:
            r0 = 1
            long r2 = r2 + r0
            r8.i0 = r2     // Catch: java.lang.Throwable -> L42
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L42
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r2
            r8.k0 = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r8)
            pz6 r2 = r8.d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.L
            java.lang.String r3 = " ping"
            java.lang.String r3 = defpackage.i61.n(r0, r1, r3)
            er2 r6 = new er2
            r0 = 2
            r6.<init>(r8, r0)
            r7 = 6
            r4 = 0
            defpackage.pz6.b(r2, r3, r4, r6, r7)
            return
        L42:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
    }

    public final void m() {
            r1 = this;
            boolean r0 = r1.j()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            java.io.IOException r1 = r1.k(r0)
            throw r1
    }
}
