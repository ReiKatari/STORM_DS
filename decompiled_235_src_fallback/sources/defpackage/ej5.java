package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej5  reason: default package */
/* loaded from: classes.dex */
public final class ej5 implements defpackage.w61, defpackage.bj5 {
    public static final defpackage.wj0 R = null;
    public final defpackage.l61 A;
    public final defpackage.ej5 B;
    public volatile defpackage.l61 L;

    static {
            wj0 r0 = new wj0
            r1 = 0
            r0.<init>(r1)
            defpackage.ej5.R = r0
            return
    }

    public ej5(defpackage.l61 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r0
            return
    }

    @Override // defpackage.w61
    public final defpackage.l61 A() {
            r6 = this;
            l61 r0 = r6.L
            if (r0 == 0) goto L8
            wj0 r1 = defpackage.ej5.R
            if (r0 != r1) goto L73
        L8:
            l61 r0 = r6.A
            cs1 r1 = defpackage.cy0.B
            j61 r0 = r0.Z(r1)
            cy0 r0 = (defpackage.cy0) r0
            if (r0 == 0) goto L1a
            dj5 r1 = new dj5
            r1.<init>(r0, r6)
            goto L1c
        L1a:
            vt1 r1 = defpackage.vt1.A
        L1c:
            ej5 r0 = r6.B
            monitor-enter(r0)
            l61 r2 = r6.L     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L43
            l61 r2 = r6.A     // Catch: java.lang.Throwable -> L41
            vs0 r3 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> L41
            j61 r3 = r2.Z(r3)     // Catch: java.lang.Throwable -> L41
            rc3 r3 = (defpackage.rc3) r3     // Catch: java.lang.Throwable -> L41
            tc3 r4 = new tc3     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            l61 r2 = r2.N(r4)     // Catch: java.lang.Throwable -> L41
            vt1 r3 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L41
            l61 r2 = r2.N(r3)     // Catch: java.lang.Throwable -> L41
            l61 r1 = r2.N(r1)     // Catch: java.lang.Throwable -> L41
            goto L6f
        L41:
            r6 = move-exception
            goto L77
        L43:
            wj0 r3 = defpackage.ej5.R     // Catch: java.lang.Throwable -> L41
            if (r2 != r3) goto L6e
            l61 r2 = r6.A     // Catch: java.lang.Throwable -> L41
            vs0 r3 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> L41
            j61 r3 = r2.Z(r3)     // Catch: java.lang.Throwable -> L41
            rc3 r3 = (defpackage.rc3) r3     // Catch: java.lang.Throwable -> L41
            tc3 r4 = new tc3     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            zj2 r3 = new zj2     // Catch: java.lang.Throwable -> L41
            r5 = 0
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L41
            r4.s(r3)     // Catch: java.lang.Throwable -> L41
            l61 r2 = r2.N(r4)     // Catch: java.lang.Throwable -> L41
            vt1 r3 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L41
            l61 r2 = r2.N(r3)     // Catch: java.lang.Throwable -> L41
            l61 r1 = r2.N(r1)     // Catch: java.lang.Throwable -> L41
            goto L6f
        L6e:
            r1 = r2
        L6f:
            r6.L = r1     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            r0 = r1
        L73:
            r0.getClass()
            return r0
        L77:
            monitor-exit(r0)
            throw r6
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            r0.d()
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r0 = this;
            r0.d()
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r0 = this;
            return
    }

    public final void d() {
            r3 = this;
            ej5 r0 = r3.B
            monitor-enter(r0)
            l61 r1 = r3.L     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            wj0 r1 = defpackage.ej5.R     // Catch: java.lang.Throwable -> Lc
            r3.L = r1     // Catch: java.lang.Throwable -> Lc
            goto L17
        Lc:
            r3 = move-exception
            goto L19
        Le:
            zj2 r3 = new zj2     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            defpackage.yh2.m(r1, r3)     // Catch: java.lang.Throwable -> Lc
        L17:
            monitor-exit(r0)
            return
        L19:
            monitor-exit(r0)
            throw r3
    }
}
