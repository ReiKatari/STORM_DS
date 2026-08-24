package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la0  reason: default package */
/* loaded from: classes.dex */
public final class la0 implements java.io.Closeable, java.io.Flushable {
    public final defpackage.kk1 A;

    public la0(java.io.File r7, long r8) {
            r6 = this;
            xf3 r1 = defpackage.db2.A
            java.lang.String r0 = defpackage.lt4.B
            lt4 r2 = defpackage.w31.q(r7)
            r1.getClass()
            qz6 r5 = defpackage.qz6.l
            r5.getClass()
            r6.<init>()
            kk1 r0 = new kk1
            r3 = r8
            r0.<init>(r1, r2, r3, r5)
            r6.A = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            kk1 r0 = r0.A
            r0.close()
            return
    }

    public final void e(defpackage.pa r5) {
            r4 = this;
            r5.getClass()
            kk1 r4 = r4.A
            java.lang.Object r5 = r5.B
            i03 r5 = (defpackage.i03) r5
            java.lang.String r5 = defpackage.g04.K(r5)
            monitor-enter(r4)
            r5.getClass()     // Catch: java.lang.Throwable -> L35
            r4.r()     // Catch: java.lang.Throwable -> L35
            r4.e()     // Catch: java.lang.Throwable -> L35
            defpackage.kk1.N(r5)     // Catch: java.lang.Throwable -> L35
            java.util.LinkedHashMap r0 = r4.e0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L35
            dk1 r5 = (defpackage.dk1) r5     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L26
            monitor-exit(r4)
            return
        L26:
            r4.F(r5)     // Catch: java.lang.Throwable -> L35
            long r0 = r4.Z     // Catch: java.lang.Throwable -> L35
            long r2 = r4.L     // Catch: java.lang.Throwable -> L35
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L37
            r5 = 0
            r4.k0 = r5     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r5 = move-exception
            goto L39
        L37:
            monitor-exit(r4)
            return
        L39:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r5
    }

    @Override // java.io.Flushable
    public final void flush() {
            r0 = this;
            kk1 r0 = r0.A
            r0.flush()
            return
    }
}
