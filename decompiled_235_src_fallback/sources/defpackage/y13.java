package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y13  reason: default package */
/* loaded from: classes.dex */
public final class y13 extends defpackage.t13 {
    public final java.util.concurrent.Executor r0;
    public final java.lang.Object s0;
    public defpackage.s23 t0;
    public defpackage.x13 u0;

    public y13(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.s0 = r0
            r1.r0 = r2
            return
    }

    @Override // defpackage.t13
    public final defpackage.s23 a(defpackage.v23 r1) {
            r0 = this;
            s23 r0 = r1.a()
            return r0
    }

    @Override // defpackage.t13
    public final void d() {
            r2 = this;
            java.lang.Object r0 = r2.s0
            monitor-enter(r0)
            s23 r1 = r2.t0     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r2.t0 = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @Override // defpackage.t13
    public final void f(defpackage.s23 r6) {
            r5 = this;
            java.lang.Object r0 = r5.s0
            monitor-enter(r0)
            boolean r1 = r5.q0     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            r6.close()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r5 = move-exception
            goto L5a
        Le:
            x13 r1 = r5.u0     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L39
            i23 r1 = r6.S()     // Catch: java.lang.Throwable -> Lc
            long r1 = r1.c()     // Catch: java.lang.Throwable -> Lc
            x13 r3 = r5.u0     // Catch: java.lang.Throwable -> Lc
            s23 r3 = r3.B     // Catch: java.lang.Throwable -> Lc
            i23 r3 = r3.S()     // Catch: java.lang.Throwable -> Lc
            long r3 = r3.c()     // Catch: java.lang.Throwable -> Lc
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L2e
            r6.close()     // Catch: java.lang.Throwable -> Lc
            goto L37
        L2e:
            s23 r1 = r5.t0     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L35
            r1.close()     // Catch: java.lang.Throwable -> Lc
        L35:
            r5.t0 = r6     // Catch: java.lang.Throwable -> Lc
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L39:
            x13 r1 = new x13     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r6, r5)     // Catch: java.lang.Throwable -> Lc
            r5.u0 = r1     // Catch: java.lang.Throwable -> Lc
            gx3 r5 = r5.c(r1)     // Catch: java.lang.Throwable -> Lc
            d51 r6 = new d51     // Catch: java.lang.Throwable -> Lc
            r2 = 29
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lc
            uj1 r1 = defpackage.u24.j()     // Catch: java.lang.Throwable -> Lc
            uo2 r2 = new uo2     // Catch: java.lang.Throwable -> Lc
            r3 = 0
            r2.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> Lc
            r5.a(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r5
    }
}
