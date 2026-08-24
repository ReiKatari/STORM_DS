package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk2  reason: default package */
/* loaded from: classes.dex */
public abstract class gk2 implements defpackage.s23 {
    public final java.lang.Object A;
    public final defpackage.s23 B;
    public final java.util.HashSet L;

    public gk2(defpackage.s23 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.A = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.L = r0
            r1.B = r2
            return
    }

    @Override // defpackage.s23
    public defpackage.i23 S() {
            r0 = this;
            s23 r0 = r0.B
            i23 r0 = r0.S()
            return r0
    }

    @Override // java.lang.AutoCloseable
    public void close() {
            r3 = this;
            s23 r0 = r3.B
            r0.close()
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L25
            java.util.HashSet r2 = r3.L     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r0 = r1.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            fk2 r1 = (defpackage.fk2) r1
            r1.c(r3)
            goto L14
        L24:
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public final void e(defpackage.fk2 r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            java.util.HashSet r1 = r1.L     // Catch: java.lang.Throwable -> La
            r1.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // defpackage.s23
    public final int getFormat() {
            r0 = this;
            s23 r0 = r0.B
            int r0 = r0.getFormat()
            return r0
    }

    @Override // defpackage.s23
    public int getHeight() {
            r0 = this;
            s23 r0 = r0.B
            int r0 = r0.getHeight()
            return r0
    }

    @Override // defpackage.s23
    public int getWidth() {
            r0 = this;
            s23 r0 = r0.B
            int r0 = r0.getWidth()
            return r0
    }

    @Override // defpackage.s23
    public defpackage.r23[] j() {
            r0 = this;
            s23 r0 = r0.B
            r23[] r0 = r0.j()
            return r0
    }
}
