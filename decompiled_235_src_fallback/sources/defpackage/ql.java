package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql  reason: default package */
/* loaded from: classes.dex */
public final class ql extends defpackage.z64 implements defpackage.fy0, defpackage.mo1, defpackage.kj3 {
    public final defpackage.r94 k0;
    public final boolean l0;
    public final float m0;
    public final defpackage.dh1 n0;
    public final defpackage.ch1 o0;
    public defpackage.ka0 p0;
    public float q0;
    public long r0;
    public boolean s0;
    public final defpackage.ca4 t0;
    public defpackage.gq5 u0;
    public defpackage.hq5 v0;

    public ql(defpackage.r94 r1, boolean r2, float r3, defpackage.dh1 r4, defpackage.ch1 r5) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r0.n0 = r4
            r0.o0 = r5
            r1 = 0
            r0.r0 = r1
            ca4 r1 = new ca4
            r1.<init>()
            r0.t0 = r1
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r4 = this;
            w61 r0 = r4.F0()
            bf4 r1 = new bf4
            r2 = 11
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r5 = this;
            gq5 r0 = r5.u0
            if (r0 == 0) goto L39
            r1 = 0
            r5.v0 = r1
            defpackage.f04.I(r5)
            ap3 r1 = r0.R
            java.lang.Object r2 = r1.B
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r5)
            hq5 r2 = (defpackage.hq5) r2
            if (r2 == 0) goto L39
            r2.c()
            java.lang.Object r3 = r1.B
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r4 = r3.get(r5)
            hq5 r4 = (defpackage.hq5) r4
            if (r4 == 0) goto L31
            java.lang.Object r1 = r1.L
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.remove(r4)
            ql r1 = (defpackage.ql) r1
        L31:
            r3.remove(r5)
            java.util.ArrayList r5 = r0.L
            r5.add(r2)
        L39:
            return
    }

    public final void R0(defpackage.n25 r12) {
            r11 = this;
            boolean r0 = r12 instanceof defpackage.l25
            if (r0 == 0) goto L107
            r2 = r12
            l25 r2 = (defpackage.l25) r2
            long r4 = r11.r0
            float r12 = r11.q0
            gq5 r0 = r11.u0
            r1 = 0
            if (r0 == 0) goto L11
            goto L59
        L11:
            nq6 r0 = defpackage.kf.f
            java.lang.Object r0 = defpackage.hf.K(r11, r0)
            android.view.View r0 = (android.view.View) r0
        L19:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 != 0) goto L32
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r3 = r3.getParent()
            boolean r6 = r3 instanceof android.view.View
            if (r6 == 0) goto L2a
            r0 = r3
            goto L19
        L2a:
            java.lang.String r11 = "Couldn't find a valid parent for "
            java.lang.String r12 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            defpackage.u34.A(r0, r12, r11)
            return
        L32:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
            r6 = r1
        L39:
            if (r6 >= r3) goto L4a
            android.view.View r7 = r0.getChildAt(r6)
            boolean r8 = r7 instanceof defpackage.gq5
            if (r8 == 0) goto L47
            gq5 r7 = (defpackage.gq5) r7
            r0 = r7
            goto L57
        L47:
            int r6 = r6 + 1
            goto L39
        L4a:
            gq5 r3 = new gq5
            android.content.Context r6 = r0.getContext()
            r3.<init>(r6)
            r0.addView(r3)
            r0 = r3
        L57:
            r11.u0 = r0
        L59:
            java.util.ArrayList r3 = r0.B
            ap3 r6 = r0.R
            java.lang.Object r7 = r6.B
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r8 = r6.B
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.lang.Object r6 = r6.L
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r7 = r7.get(r11)
            hq5 r7 = (defpackage.hq5) r7
            if (r7 == 0) goto L74
        L71:
            r1 = r7
            goto Le2
        L74:
            java.util.ArrayList r7 = r0.L
            r7.getClass()
            boolean r9 = r7.isEmpty()
            r10 = 0
            if (r9 == 0) goto L82
            r7 = r10
            goto L86
        L82:
            java.lang.Object r7 = r7.remove(r1)
        L86:
            hq5 r7 = (defpackage.hq5) r7
            if (r7 != 0) goto Ldb
            int r7 = r0.d0
            int r9 = defpackage.hf.U(r3)
            if (r7 <= r9) goto La2
            hq5 r7 = new hq5
            android.content.Context r9 = r0.getContext()
            r7.<init>(r9)
            r0.addView(r7)
            r3.add(r7)
            goto Lcc
        La2:
            int r7 = r0.d0
            java.lang.Object r3 = r3.get(r7)
            r7 = r3
            hq5 r7 = (defpackage.hq5) r7
            java.lang.Object r3 = r6.get(r7)
            ql r3 = (defpackage.ql) r3
            if (r3 == 0) goto Lcc
            r3.v0 = r10
            defpackage.f04.I(r3)
            java.lang.Object r9 = r8.get(r3)
            hq5 r9 = (defpackage.hq5) r9
            if (r9 == 0) goto Lc6
            java.lang.Object r9 = r6.remove(r9)
            ql r9 = (defpackage.ql) r9
        Lc6:
            r8.remove(r3)
            r7.c()
        Lcc:
            int r3 = r0.d0
            int r9 = r0.A
            int r9 = r9 + (-1)
            if (r3 >= r9) goto Ld9
            int r3 = r3 + 1
            r0.d0 = r3
            goto Ldb
        Ld9:
            r0.d0 = r1
        Ldb:
            r8.put(r11, r7)
            r6.put(r7, r11)
            goto L71
        Le2:
            int r6 = defpackage.u24.E(r12)
            dh1 r12 = r11.n0
            long r7 = r12.a()
            ch1 r12 = r11.o0
            java.lang.Object r12 = r12.c()
            eq5 r12 = (defpackage.eq5) r12
            float r9 = r12.d
            a5 r10 = new a5
            r12 = 2
            r10.<init>(r11, r12)
            boolean r3 = r11.l0
            r1.b(r2, r3, r4, r6, r7, r9, r10)
            r11.v0 = r1
            defpackage.f04.I(r11)
            return
        L107:
            boolean r0 = r12 instanceof defpackage.m25
            if (r0 == 0) goto L113
            hq5 r11 = r11.v0
            if (r11 == 0) goto L11e
            r11.d()
            return
        L113:
            boolean r12 = r12 instanceof defpackage.k25
            if (r12 == 0) goto L11e
            hq5 r11 = r11.v0
            if (r11 == 0) goto L11e
            r11.d()
        L11e:
            return
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long r6) {
            r5 = this;
            r0 = 1
            r5.s0 = r0
            sm3 r0 = defpackage.nc1.f0(r5)
            qh1 r0 = r0.u0
            long r6 = defpackage.qo2.S(r6)
            r5.r0 = r6
            float r6 = r5.m0
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L48
            long r6 = r5.r0
            float r1 = defpackage.xi6.e(r6)
            float r6 = defpackage.xi6.c(r6)
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            r3 = 32
            long r1 = r1 << r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            long r6 = r6 | r1
            float r6 = defpackage.jk4.d(r6)
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            boolean r7 = r5.l0
            if (r7 == 0) goto L4c
            r7 = 1092616192(0x41200000, float:10.0)
            float r7 = r0.e0(r7)
            float r6 = r6 + r7
            goto L4c
        L48:
            float r6 = r0.e0(r6)
        L4c:
            r5.q0 = r6
            ca4 r6 = r5.t0
            java.lang.Object[] r7 = r6.a
            int r0 = r6.b
            r1 = 0
        L55:
            if (r1 >= r0) goto L61
            r2 = r7[r1]
            n25 r2 = (defpackage.n25) r2
            r5.R0(r2)
            int r1 = r1 + 1
            goto L55
        L61:
            r6.d()
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r15) {
            r14 = this;
            zj0 r0 = r15.A
            r15.b()
            ka0 r1 = r14.p0
            if (r1 == 0) goto L70
            float r5 = r14.q0
            dh1 r2 = r14.n0
            long r2 = r2.a()
            java.lang.Object r4 = r1.c
            gn r4 = (defpackage.gn) r4
            java.lang.Object r4 = r4.d()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L70
            long r3 = defpackage.kt0.c(r4, r2)
            boolean r1 = r1.a
            if (r1 == 0) goto L67
            long r1 = r0.e()
            float r9 = defpackage.xi6.e(r1)
            long r1 = r0.e()
            float r10 = defpackage.xi6.c(r1)
            bt r1 = r0.B
            long r12 = r1.L()
            xj0 r2 = r1.G()
            r2.h()
            java.lang.Object r2 = r1.B     // Catch: java.lang.Throwable -> L61
            r6 = r2
            os0 r6 = (defpackage.os0) r6     // Catch: java.lang.Throwable -> L61
            r7 = 0
            r8 = 0
            r11 = 1
            r6.Q(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L61
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r2 = r15
            defpackage.no1.j0(r2, r3, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L61
            defpackage.xg6.v(r1, r12)
            goto L70
        L61:
            r0 = move-exception
            r14 = r0
            defpackage.xg6.v(r1, r12)
            throw r14
        L67:
            r2 = r15
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r6 = 0
            defpackage.no1.j0(r2, r3, r5, r6, r8, r9)
        L70:
            bt r15 = r0.B
            xj0 r15 = r15.G()
            hq5 r0 = r14.v0
            if (r0 == 0) goto L9c
            long r1 = r14.r0
            float r3 = r14.q0
            int r3 = defpackage.u24.E(r3)
            dh1 r4 = r14.n0
            long r4 = r4.a()
            ch1 r14 = r14.o0
            java.lang.Object r14 = r14.c()
            eq5 r14 = (defpackage.eq5) r14
            float r6 = r14.d
            r0.e(r1, r3, r4, r6)
            android.graphics.Canvas r14 = defpackage.xd.a(r15)
            r0.draw(r14)
        L9c:
            return
    }
}
