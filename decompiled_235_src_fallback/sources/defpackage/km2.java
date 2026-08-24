package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km2  reason: default package */
/* loaded from: classes.dex */
public final class km2 implements java.lang.AutoCloseable {
    public final java.lang.Object A;
    public final defpackage.pu B;
    public boolean L;

    public km2() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.A = r0
            pu r0 = new pu
            r0.<init>()
            r1.B = r0
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            boolean r1 = r2.L     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            r1 = 1
            r2.L = r1     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            pu r0 = r2.B
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1f
            pu r2 = r2.B
            r2.clear()
            return
        L1f:
            java.lang.ClassCastException r2 = defpackage.i61.j(r0)
            throw r2
        L24:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void e(defpackage.kk5 r2) {
            r1 = this;
            r2.getClass()
            java.lang.Object r2 = r1.A
            monitor-enter(r2)
            boolean r0 = r1.L     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lc
            monitor-exit(r2)
            return
        Lc:
            pu r1 = r1.B     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L1a
            monitor-exit(r2)
            return
        L1a:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L22
        L22:
            r1 = move-exception
            goto L2a
        L24:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L22
        L2a:
            monitor-exit(r2)
            throw r1
    }
}
