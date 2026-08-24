package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf6  reason: default package */
/* loaded from: classes.dex */
public final class lf6 implements defpackage.il1 {
    public final defpackage.of6 A;
    public final long B;
    public final java.lang.Object L;
    public final defpackage.rj0 R;

    public lf6(defpackage.of6 r1, long r2, java.lang.Object r4, defpackage.rj0 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r4
            r0.R = r5
            return
    }

    @Override // defpackage.il1
    public final void dispose() {
            r6 = this;
            of6 r0 = r6.A
            monitor-enter(r0)
            long r1 = r6.B     // Catch: java.lang.Throwable -> L2b
            long r3 = r0.q()     // Catch: java.lang.Throwable -> L2b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            java.lang.Object[] r1 = r0.d0     // Catch: java.lang.Throwable -> L2b
            r1.getClass()     // Catch: java.lang.Throwable -> L2b
            long r2 = r6.B     // Catch: java.lang.Throwable -> L2b
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L2b
            int r5 = r1.length     // Catch: java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            r4 = r4 & r5
            r4 = r1[r4]     // Catch: java.lang.Throwable -> L2b
            if (r4 == r6) goto L21
            monitor-exit(r0)
            return
        L21:
            gr1 r6 = defpackage.pf6.a     // Catch: java.lang.Throwable -> L2b
            defpackage.pf6.c(r1, r2, r6)     // Catch: java.lang.Throwable -> L2b
            r0.l()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            return
        L2b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }
}
