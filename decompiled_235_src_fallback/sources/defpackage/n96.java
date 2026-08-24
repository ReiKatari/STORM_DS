package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n96  reason: default package */
/* loaded from: classes.dex */
public final class n96 extends defpackage.gx0 {
    public static final defpackage.wo s = null;
    public static final defpackage.wo t = null;
    public final defpackage.vs4 b;
    public final defpackage.vs4 c;
    public java.lang.Object d;
    public defpackage.ga7 e;
    public long f;
    public final defpackage.t46 g;
    public defpackage.qm6 h;
    public final defpackage.rs4 i;
    public defpackage.rj0 j;
    public final defpackage.hb4 k;
    public final defpackage.eb4 l;
    public long m;
    public final defpackage.ca4 n;
    public defpackage.g96 o;
    public final defpackage.f96 p;
    public float q;
    public final defpackage.f96 r;

    static {
            wo r0 = new wo
            r1 = 0
            r0.<init>(r1)
            defpackage.n96.s = r0
            wo r0 = new wo
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1)
            defpackage.n96.t = r0
            return
    }

    public n96(defpackage.sb4 r3) {
            r2 = this;
            r0 = 3
            r2.<init>(r0)
            vs4 r0 = defpackage.np2.Y(r3)
            r2.b = r0
            vs4 r0 = defpackage.np2.Y(r3)
            r2.c = r0
            r2.d = r3
            t46 r3 = new t46
            r0 = 4
            r3.<init>(r2, r0)
            r2.g = r3
            rs4 r3 = new rs4
            r0 = 0
            r3.<init>(r0)
            r2.i = r3
            hb4 r3 = new hb4
            r3.<init>()
            r2.k = r3
            eb4 r3 = new eb4
            r3.<init>()
            r2.l = r3
            r0 = -9223372036854775808
            r2.m = r0
            ca4 r3 = new ca4
            r3.<init>()
            r2.n = r3
            f96 r3 = new f96
            r0 = 0
            r3.<init>(r2, r0)
            r2.p = r3
            f96 r3 = new f96
            r0 = 1
            r3.<init>(r2, r0)
            r2.r = r3
            return
    }

    public static final void o(defpackage.n96 r10) {
            rs4 r0 = r10.i
            ga7 r1 = r10.e
            if (r1 != 0) goto L7
            return
        L7:
            g96 r2 = r10.o
            r3 = 0
            if (r2 != 0) goto L5d
            long r4 = r10.f
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L5c
            float r2 = r0.h()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1f
            goto L5c
        L1f:
            vs4 r2 = r10.c
            java.lang.Object r2 = r2.getValue()
            vs4 r4 = r10.b
            java.lang.Object r4 = r4.getValue()
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto L32
            goto L5c
        L32:
            g96 r2 = new g96
            r2.<init>()
            float r4 = r0.h()
            r2.d = r4
            long r4 = r10.f
            r2.g = r4
            double r4 = (double) r4
            float r6 = r0.h()
            double r6 = (double) r6
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 - r6
            double r8 = r8 * r4
            long r4 = defpackage.u24.F(r8)
            r2.h = r4
            r4 = 0
            float r0 = r0.h()
            wo r5 = r2.e
            r5.e(r4, r0)
            goto L5d
        L5c:
            r2 = r3
        L5d:
            if (r2 == 0) goto L6b
            long r4 = r10.f
            r2.g = r4
            ca4 r0 = r10.n
            r0.a(r2)
            r1.m(r2)
        L6b:
            r10.o = r3
            return
    }

    public static final java.lang.Object p(defpackage.n96 r12, defpackage.s41 r13) {
            ca4 r0 = r12.n
            boolean r1 = r13 instanceof defpackage.i96
            if (r1 == 0) goto L15
            r1 = r13
            i96 r1 = (defpackage.i96) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            i96 r1 = new i96
            r1.<init>(r12, r13)
        L1a:
            l61 r13 = r1.B
            java.lang.Object r2 = r1.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.Y
            r5 = 2
            r6 = 1
            r7 = -9223372036854775808
            jg7 r9 = defpackage.jg7.a
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2f
            goto L36
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L36:
            defpackage.oi2.Y(r2)
            goto L72
        L3a:
            defpackage.oi2.Y(r2)
            boolean r2 = r0.h()
            if (r2 == 0) goto L48
            g96 r2 = r12.o
            if (r2 != 0) goto L48
            return r9
        L48:
            r13.getClass()
            float r2 = defpackage.kj2.y(r13)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5a
            r12.t()
            r12.m = r7
            return r9
        L5a:
            long r10 = r12.m
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L72
            f96 r2 = r12.p
            r1.Y = r6
            r13.getClass()
            um r13 = defpackage.ii2.x(r13)
            java.lang.Object r13 = r13.a(r2, r1)
            if (r13 != r3) goto L72
            goto L88
        L72:
            boolean r13 = r0.i()
            if (r13 != 0) goto L80
            g96 r13 = r12.o
            if (r13 == 0) goto L7d
            goto L80
        L7d:
            r12.m = r7
            return r9
        L80:
            r1.Y = r5
            java.lang.Object r13 = r12.s(r1)
            if (r13 != r3) goto L72
        L88:
            return r3
    }

    public static final java.lang.Object q(defpackage.n96 r8, defpackage.s41 r9) {
            hb4 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.l96
            if (r1 == 0) goto L15
            r1 = r9
            l96 r1 = (defpackage.l96) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            l96 r1 = new l96
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            java.lang.Object r0 = r1.R
            defpackage.oi2.Y(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L35:
            java.lang.Object r3 = r1.R
            defpackage.oi2.Y(r9)
            r9 = r3
            goto L50
        L3c:
            defpackage.oi2.Y(r9)
            vs4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.R = r9
            r1.Z = r6
            java.lang.Object r3 = r0.e(r1)
            if (r3 != r2) goto L50
            goto L6b
        L50:
            r1.R = r9
            r1.Z = r5
            rj0 r3 = new rj0
            r41 r1 = defpackage.np2.V(r1)
            r3.<init>(r6, r1)
            r3.v()
            r8.j = r3
            r0.h(r4)
            java.lang.Object r0 = r3.s()
            if (r0 != r2) goto L6c
        L6b:
            return r2
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.nb3.k(r9, r0)
            if (r9 == 0) goto L78
            jg7 r8 = defpackage.jg7.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.m = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
    }

    public static final java.lang.Object r(defpackage.n96 r8, defpackage.s41 r9) {
            hb4 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.m96
            if (r1 == 0) goto L15
            r1 = r9
            m96 r1 = (defpackage.m96) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            m96 r1 = new m96
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            java.lang.Object r0 = r1.R
            defpackage.oi2.Y(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L35:
            java.lang.Object r3 = r1.R
            defpackage.oi2.Y(r9)
            r9 = r3
            goto L50
        L3c:
            defpackage.oi2.Y(r9)
            vs4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.R = r9
            r1.Z = r6
            java.lang.Object r3 = r0.e(r1)
            if (r3 != r2) goto L50
            goto L77
        L50:
            java.lang.Object r3 = r8.d
            boolean r3 = defpackage.nb3.k(r9, r3)
            if (r3 == 0) goto L5c
            r0.h(r4)
            goto L81
        L5c:
            r1.R = r9
            r1.Z = r5
            rj0 r3 = new rj0
            r41 r1 = defpackage.np2.V(r1)
            r3.<init>(r6, r1)
            r3.v()
            r8.j = r3
            r0.h(r4)
            java.lang.Object r0 = r3.s()
            if (r0 != r2) goto L78
        L77:
            return r2
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.nb3.k(r9, r0)
            if (r1 == 0) goto L84
        L81:
            jg7 r8 = defpackage.jg7.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
    }

    public static void u(defpackage.g96 r8, long r9) {
            long r0 = r8.a
            long r3 = r0 + r9
            r8.a = r3
            long r9 = r8.h
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L11
            r8.d = r1
            return
        L11:
            ll7 r2 = r8.b
            wo r5 = r8.e
            r0 = 0
            if (r2 == 0) goto L33
            wo r9 = r8.f
            if (r9 != 0) goto L1e
            wo r9 = defpackage.n96.s
        L1e:
            r7 = r9
            wo r6 = defpackage.n96.t
            ap r9 = r2.q(r3, r5, r6, r7)
            wo r9 = (defpackage.wo) r9
            float r9 = r9.a(r0)
            r10 = 0
            float r9 = defpackage.gi2.p(r9, r10, r1)
            r8.d = r9
            return
        L33:
            float r0 = r5.a(r0)
            float r2 = (float) r3
            float r9 = (float) r9
            float r2 = r2 / r9
            float r9 = r1 - r2
            float r9 = r9 * r0
            float r2 = r2 * r1
            float r2 = r2 + r9
            r8.d = r2
            return
    }

    @Override // defpackage.gx0
    public final java.lang.Object f() {
            r0 = this;
            vs4 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // defpackage.gx0
    public final java.lang.Object h() {
            r0 = this;
            vs4 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // defpackage.gx0
    public final void l(java.lang.Object r1) {
            r0 = this;
            vs4 r0 = r0.c
            r0.setValue(r1)
            return
    }

    @Override // defpackage.gx0
    public final void m(defpackage.ga7 r3) {
            r2 = this;
            ga7 r0 = r2.e
            if (r0 == 0) goto L21
            if (r3 == r0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "
            r0.<init>(r1)
            ga7 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", new instance: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.t05.b(r0)
        L21:
            r2.e = r3
            return
    }

    @Override // defpackage.gx0
    public final void n() {
            r1 = this;
            r0 = 0
            r1.e = r0
            qm6 r0 = r1.h
            if (r0 == 0) goto La
            r0.b(r1)
        La:
            return
    }

    public final java.lang.Object s(defpackage.s41 r4) {
            r3 = this;
            l61 r0 = r4.b()
            float r0 = defpackage.kj2.y(r0)
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            jg7 r2 = defpackage.jg7.a
            if (r1 > 0) goto L13
            r3.t()
            return r2
        L13:
            r3.q = r0
            l61 r0 = r4.b()
            um r0 = defpackage.ii2.x(r0)
            f96 r3 = r3.r
            java.lang.Object r3 = r0.a(r3, r4)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L28
            return r3
        L28:
            return r2
    }

    public final void t() {
            r1 = this;
            ga7 r0 = r1.e
            if (r0 == 0) goto L7
            r0.c()
        L7:
            ca4 r0 = r1.n
            r0.d()
            g96 r0 = r1.o
            if (r0 == 0) goto L1b
            r0 = 0
            r1.o = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.x(r0)
            r1.w()
        L1b:
            return
    }

    public final java.lang.Object v(float r9, java.lang.Object r10, defpackage.hw6 r11) {
            r8 = this;
            r0 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 > 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc
            goto L1d
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expecting fraction between 0 and 1. Got "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            defpackage.t05.a(r0)
        L1d:
            ga7 r5 = r8.e
            if (r5 != 0) goto L22
            goto L3c
        L22:
            vs4 r0 = r8.b
            java.lang.Object r3 = r0.getValue()
            k96 r1 = new k96
            r7 = 0
            r4 = r8
            r6 = r9
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            eb4 r8 = r4.l
            java.lang.Object r8 = defpackage.eb4.a(r8, r1, r11)
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            if (r8 != r9) goto L3c
            return r8
        L3c:
            jg7 r8 = defpackage.jg7.a
            return r8
    }

    public final void w() {
            r5 = this;
            ga7 r0 = r5.e
            if (r0 != 0) goto L5
            return
        L5:
            rs4 r5 = r5.i
            float r5 = r5.h()
            double r1 = (double) r5
            ii1 r5 = r0.l
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            long r3 = r5.longValue()
            double r3 = (double) r3
            double r1 = r1 * r3
            long r1 = defpackage.u24.F(r1)
            r0.l(r1)
            return
    }

    public final void x(float r1) {
            r0 = this;
            rs4 r0 = r0.i
            r0.i(r1)
            return
    }

    public final void y(defpackage.qm6 r3) {
            r2 = this;
            qm6 r0 = r2.h
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L2c
            qm6 r0 = r2.h
            if (r0 == 0) goto Lf
            r0.b(r2)
        Lf:
            qm6 r0 = r2.h
            if (r0 == 0) goto L1a
            h61 r0 = r0.h
            if (r0 == 0) goto L1a
            r0.d()
        L1a:
            r2.h = r3
            if (r3 == 0) goto L21
            r3.e()
        L21:
            qm6 r3 = r2.h
            if (r3 == 0) goto L2c
            h37 r0 = defpackage.n16.q
            t46 r1 = r2.g
            r3.d(r2, r0, r1)
        L2c:
            return
    }
}
