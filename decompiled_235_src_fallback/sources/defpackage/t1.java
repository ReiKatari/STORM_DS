package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t1  reason: default package */
/* loaded from: classes.dex */
public abstract class t1 {
    public defpackage.u1[] A;
    public int B;
    public int L;
    public defpackage.yt6 R;

    public final defpackage.u1 d() {
            r4 = this;
            monitor-enter(r4)
            u1[] r0 = r4.A     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            u1[] r0 = r4.f()     // Catch: java.lang.Throwable -> Lc
            r4.A = r0     // Catch: java.lang.Throwable -> Lc
            goto L21
        Lc:
            r0 = move-exception
            goto L4a
        Le:
            int r1 = r4.B     // Catch: java.lang.Throwable -> Lc
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r2) goto L21
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lc
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> Lc
            r1 = r0
            u1[] r1 = (defpackage.u1[]) r1     // Catch: java.lang.Throwable -> Lc
            r4.A = r1     // Catch: java.lang.Throwable -> Lc
            u1[] r0 = (defpackage.u1[]) r0     // Catch: java.lang.Throwable -> Lc
        L21:
            int r1 = r4.L     // Catch: java.lang.Throwable -> Lc
        L23:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L2d
            u1 r2 = r4.e()     // Catch: java.lang.Throwable -> Lc
            r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
        L2d:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r3) goto L33
            r1 = 0
        L33:
            boolean r3 = r2.a(r4)     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L23
            r4.L = r1     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.B     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            int r0 = r0 + r1
            r4.B = r0     // Catch: java.lang.Throwable -> Lc
            yt6 r0 = r4.R     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r4)
            if (r0 == 0) goto L49
            r0.x(r1)
        L49:
            return r2
        L4a:
            monitor-exit(r4)
            throw r0
    }

    public abstract defpackage.u1 e();

    public abstract defpackage.u1[] f();

    public final void g(defpackage.u1 r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.B     // Catch: java.lang.Throwable -> Lf
            r1 = -1
            int r0 = r0 + r1
            r5.B = r0     // Catch: java.lang.Throwable -> Lf
            yt6 r2 = r5.R     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r0 != 0) goto L11
            r5.L = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r6 = move-exception
            goto L2e
        L11:
            r6.getClass()     // Catch: java.lang.Throwable -> Lf
            r41[] r6 = r6.b(r5)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            int r5 = r6.length
        L1a:
            if (r3 >= r5) goto L28
            r0 = r6[r3]
            if (r0 == 0) goto L25
            jg7 r4 = defpackage.jg7.a
            r0.i(r4)
        L25:
            int r3 = r3 + 1
            goto L1a
        L28:
            if (r2 == 0) goto L2d
            r2.x(r1)
        L2d:
            return
        L2e:
            monitor-exit(r5)
            throw r6
    }

    public final defpackage.yt6 i() {
            r5 = this;
            monitor-enter(r5)
            yt6 r0 = r5.R     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            yt6 r0 = new yt6     // Catch: java.lang.Throwable -> L1c
            int r1 = r5.B     // Catch: java.lang.Throwable -> L1c
            m80 r2 = defpackage.m80.DROP_OLDEST     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            r0.k(r1)     // Catch: java.lang.Throwable -> L1c
            r5.R = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            goto L20
        L1e:
            monitor-exit(r5)
            return r0
        L20:
            monitor-exit(r5)
            throw r0
    }
}
