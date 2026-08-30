package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.t2 f1909a = new n2.n1(l2.L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dc.a a(d2.o r4, a9.d r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof b4.m2
            if (r0 == 0) goto L13
            r0 = r6
            b4.m2 r0 = (b4.m2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            b4.m2 r0 = new b4.m2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
        L28:
            r4 = 0
            return r4
        L2a:
            p7.j.I(r6)
            goto L57
        L2e:
            p7.j.I(r6)
            b3.o r6 = r4.A
            boolean r6 = r6.f1777h0
            if (r6 == 0) goto L5f
            a4.c2 r6 = a4.l.u(r4)
            a4.o0 r4 = a4.l.t(r4)
            n2.a0 r4 = r4.f298w0
            v2.g r4 = (v2.g) r4
            r4.getClass()
            n2.t2 r2 = b4.o2.f1909a
            java.lang.Object r4 = n2.s.x(r4, r2)
            if (r4 != 0) goto L5b
            r0.X = r3
            dc.a r4 = b(r6, r5, r0)
            if (r4 != r1) goto L57
            return r1
        L57:
            wa.b.a()
            goto L28
        L5b:
            m9.o.b()
            goto L28
        L5f:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            a0.j.h(r4)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.o2.a(d2.o, a9.d, ec.c):dc.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dc.a b(a4.c2 r4, mc.p r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof b4.n2
            if (r0 == 0) goto L13
            r0 = r6
            b4.n2 r0 = (b4.n2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            b4.n2 r0 = new b4.n2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            r4 = 2
            if (r2 == r4) goto L2d
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
        L2b:
            r4 = 0
            return r4
        L2d:
            p7.j.I(r6)
            wa.b.a()
            goto L2b
        L34:
            p7.j.I(r6)
            goto L46
        L38:
            p7.j.I(r6)
            r0.X = r3
            b4.x r4 = (b4.x) r4
            dc.a r4 = r4.F(r5, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            wa.b.a()
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.o2.b(a4.c2, mc.p, ec.c):dc.a");
    }
}
