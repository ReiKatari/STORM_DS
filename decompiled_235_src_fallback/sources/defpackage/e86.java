package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e86  reason: default package */
/* loaded from: classes.dex */
public final class e86 extends defpackage.yn1 implements defpackage.bh3, defpackage.va6 {
    public defpackage.sg F0;
    public defpackage.sd2 G0;
    public final defpackage.eb H0;
    public final defpackage.wd1 I0;
    public final defpackage.m86 J0;
    public final defpackage.g60 K0;
    public final defpackage.vh2 L0;
    public final defpackage.p31 M0;
    public defpackage.y36 N0;
    public defpackage.c86 O0;
    public defpackage.m84 P0;
    public defpackage.z87 Q0;

    public e86(defpackage.sg r11, defpackage.z70 r12, defpackage.sd2 r13, defpackage.r94 r14, defpackage.lo4 r15, defpackage.f86 r16, boolean r17, boolean r18) {
            r10 = this;
            r9 = r17
            r76 r0 = defpackage.y76.a
            r10.<init>(r0, r9, r14, r15)
            r10.F0 = r11
            r10.G0 = r13
            eb r6 = new eb
            r0 = 14
            r6.<init>(r0)
            r10.H0 = r6
            wd1 r0 = new wd1
            or4 r1 = defpackage.y76.d
            s35 r3 = new s35
            r3.<init>(r1)
            oc1 r1 = new oc1
            r1.<init>(r3)
            r0.<init>(r1)
            r10.I0 = r0
            sg r2 = r10.F0
            sd2 r1 = r10.G0
            if (r1 != 0) goto L2f
            r3 = r0
            goto L30
        L2f:
            r3 = r1
        L30:
            m86 r0 = new m86
            a86 r8 = new a86
            r1 = 0
            r8.<init>(r10, r1)
            r7 = r10
            r4 = r15
            r1 = r16
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r3 = r0
            r0 = r6
            r10.J0 = r3
            g60 r8 = new g60
            r8.<init>(r9, r3)
            r10.K0 = r8
            vh2 r1 = new vh2
            r2 = 10
            r4 = 2
            r5 = 0
            r1.<init>(r4, r5, r2)
            r10.R0(r1)
            r10.L0 = r1
            p31 r1 = new p31
            a86 r6 = new a86
            r2 = 1
            r6.<init>(r10, r2)
            r5 = r12
            r2 = r15
            r4 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r10.R0(r1)
            r10.M0 = r1
            ge4 r2 = new ge4
            r2.<init>(r8, r0)
            r10.R0(r2)
            w70 r0 = new w70
            r0.<init>()
            r0.k0 = r1
            r10.R0(r0)
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r5) {
            r4 = this;
            boolean r0 = r4.o0
            r1 = 0
            if (r0 == 0) goto L1c
            y36 r0 = r4.N0
            if (r0 == 0) goto Ld
            c86 r0 = r4.O0
            if (r0 != 0) goto L1c
        Ld:
            y36 r0 = new y36
            r2 = 1
            r0.<init>(r4, r2)
            r4.N0 = r0
            c86 r0 = new c86
            r0.<init>(r4, r1)
            r4.O0 = r0
        L1c:
            y36 r0 = r4.N0
            if (r0 == 0) goto L2c
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.sa6.d
            y1 r3 = new y1
            r3.<init>(r1, r0)
            r5.a(r2, r3)
        L2c:
            c86 r4 = r4.O0
            if (r4 == 0) goto L37
            fg3[] r0 = defpackage.eb6.a
            fb6 r0 = defpackage.sa6.e
            r5.a(r0, r4)
        L37:
            return
    }

    @Override // defpackage.bh3
    public final boolean B(android.view.KeyEvent r11) {
            r10 = this;
            boolean r0 = r10.o0
            r1 = 0
            if (r0 == 0) goto La6
            long r2 = defpackage.xk2.m(r11)
            long r4 = defpackage.kg3.G
            boolean r0 = defpackage.kg3.a(r2, r4)
            if (r0 != 0) goto L21
            int r0 = r11.getKeyCode()
            long r2 = defpackage.qo2.e(r0)
            long r4 = defpackage.kg3.F
            boolean r0 = defpackage.kg3.a(r2, r4)
            if (r0 == 0) goto La6
        L21:
            int r0 = defpackage.xk2.u(r11)
            r2 = 2
            if (r0 != r2) goto La6
            boolean r0 = r11.isCtrlPressed()
            if (r0 != 0) goto La6
            m86 r0 = r10.J0
            lo4 r0 = r0.d
            lo4 r2 = defpackage.lo4.Vertical
            r3 = 1
            if (r0 != r2) goto L38
            r1 = r3
        L38:
            r0 = 0
            r2 = 32
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            p31 r6 = r10.M0
            if (r1 == 0) goto L6d
            long r6 = r6.S0()
            long r6 = r6 & r4
            int r1 = (int) r6
            int r11 = r11.getKeyCode()
            long r6 = defpackage.qo2.e(r11)
            long r8 = defpackage.kg3.F
            boolean r11 = defpackage.kg3.a(r6, r8)
            if (r11 == 0) goto L5c
            float r11 = (float) r1
            goto L5e
        L5c:
            float r11 = (float) r1
            float r11 = -r11
        L5e:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r11
            long r0 = r0 << r2
            long r4 = r4 & r6
            long r0 = r0 | r4
        L6b:
            r6 = r0
            goto L95
        L6d:
            long r6 = r6.S0()
            long r6 = r6 >> r2
            int r1 = (int) r6
            int r11 = r11.getKeyCode()
            long r6 = defpackage.qo2.e(r11)
            long r8 = defpackage.kg3.F
            boolean r11 = defpackage.kg3.a(r6, r8)
            if (r11 == 0) goto L85
            float r11 = (float) r1
            goto L87
        L85:
            float r11 = (float) r1
            float r11 = -r11
        L87:
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r11
            long r6 = r6 << r2
            long r0 = r0 & r4
            long r0 = r0 | r6
            goto L6b
        L95:
            w61 r11 = r10.F0()
            c86 r4 = new c86
            r9 = 0
            r8 = 0
            r5 = r10
            r4.<init>(r5, r6, r8, r9)
            r10 = 3
            defpackage.hv.L(r11, r8, r8, r4, r10)
            return r3
        La6:
            return r1
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r3 = this;
            boolean r0 = r3.j0
            if (r0 != 0) goto L5
            goto L1c
        L5:
            sm3 r0 = defpackage.nc1.f0(r3)
            qh1 r0 = r0.u0
            wd1 r1 = r3.I0
            r1.getClass()
            s35 r2 = new s35
            r2.<init>(r0)
            oc1 r0 = new oc1
            r0.<init>(r2)
            r1.a = r0
        L1c:
            m84 r0 = r3.P0
            if (r0 == 0) goto L28
            sm3 r1 = defpackage.nc1.f0(r3)
            qh1 r1 = r1.u0
            r0.c = r1
        L28:
            z87 r0 = r3.Q0
            if (r0 == 0) goto L34
            sm3 r3 = defpackage.nc1.f0(r3)
            qh1 r3 = r3.u0
            r0.c = r3
        L34:
            return
    }

    @Override // defpackage.yn1
    public final java.lang.Object Y0(defpackage.xn1 r5, defpackage.xn1 r6) {
            r4 = this;
            xa4 r0 = defpackage.xa4.UserInput
            vy5 r1 = new vy5
            r2 = 0
            r3 = 3
            m86 r4 = r4.J0
            r1.<init>(r5, r4, r2, r3)
            java.lang.Object r4 = r4.f(r0, r1, r6)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L14
            return r4
        L14:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r3 = this;
            r3.I()
            boolean r0 = r3.j0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            sm3 r0 = defpackage.nc1.f0(r3)
            qh1 r0 = r0.u0
            wd1 r1 = r3.I0
            r1.getClass()
            s35 r2 = new s35
            r2.<init>(r0)
            oc1 r0 = new oc1
            r0.<init>(r2)
            r1.a = r0
        L1f:
            m84 r0 = r3.P0
            if (r0 == 0) goto L2b
            sm3 r1 = defpackage.nc1.f0(r3)
            qh1 r1 = r1.u0
            r0.c = r1
        L2b:
            z87 r0 = r3.Q0
            if (r0 == 0) goto L37
            sm3 r3 = defpackage.nc1.f0(r3)
            qh1 r3 = r3.u0
            r0.c = r3
        L37:
            return
    }

    @Override // defpackage.yn1
    public final void d1(long r1) {
            r0 = this;
            return
    }

    @Override // defpackage.yn1
    public final void e1(defpackage.hn1 r5) {
            r4 = this;
            eb r0 = r4.H0
            w61 r0 = r0.D()
            bf4 r1 = new bf4
            r2 = 15
            r3 = 0
            r1.<init>(r5, r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    @Override // defpackage.yn1
    public final boolean j1() {
            r4 = this;
            m86 r4 = r4.J0
            f86 r0 = r4.a
            boolean r0 = r0.a()
            if (r0 != 0) goto L5d
            sg r4 = r4.b
            if (r4 == 0) goto L5b
            mr1 r4 = r4.c
            android.widget.EdgeEffect r0 = r4.d
            r1 = 31
            r2 = 0
            if (r0 == 0) goto L25
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L20
            float r0 = defpackage.up.e(r0)
            goto L21
        L20:
            r0 = r2
        L21:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5d
        L25:
            android.widget.EdgeEffect r0 = r4.e
            if (r0 == 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L32
            float r0 = defpackage.up.e(r0)
            goto L33
        L32:
            r0 = r2
        L33:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5d
        L37:
            android.widget.EdgeEffect r0 = r4.f
            if (r0 == 0) goto L49
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L44
            float r0 = defpackage.up.e(r0)
            goto L45
        L44:
            r0 = r2
        L45:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5d
        L49:
            android.widget.EdgeEffect r4 = r4.g
            if (r4 == 0) goto L5b
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L56
            float r4 = defpackage.up.e(r4)
            goto L57
        L56:
            r4 = r2
        L57:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L5d
        L5b:
            r4 = 0
            return r4
        L5d:
            r4 = 1
            return r4
    }

    @Override // defpackage.bh3
    public final boolean k(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public final void m1(defpackage.sg r7, defpackage.z70 r8, defpackage.sd2 r9, defpackage.r94 r10, defpackage.lo4 r11, defpackage.f86 r12, boolean r13, boolean r14) {
            r6 = this;
            boolean r0 = r6.o0
            r1 = 1
            r2 = 0
            if (r0 == r13) goto Lc
            g60 r0 = r6.K0
            r0.A = r13
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r9 != 0) goto L12
            wd1 r3 = r6.I0
            goto L13
        L12:
            r3 = r9
        L13:
            m86 r4 = r6.J0
            f86 r5 = r4.a
            boolean r5 = defpackage.nb3.k(r5, r12)
            if (r5 != 0) goto L20
            r4.a = r12
            r2 = r1
        L20:
            r4.b = r7
            lo4 r12 = r4.d
            if (r12 == r11) goto L29
            r4.d = r11
            r2 = r1
        L29:
            boolean r12 = r4.e
            if (r12 == r14) goto L30
            r4.e = r14
            goto L31
        L30:
            r1 = r2
        L31:
            r4.c = r3
            eb r12 = r6.H0
            r4.f = r12
            p31 r12 = r6.M0
            r12.k0 = r11
            r12.m0 = r14
            r12.n0 = r8
            r6.F0 = r7
            r6.G0 = r9
            r76 r7 = defpackage.y76.a
            lo4 r8 = r4.d
            lo4 r9 = defpackage.lo4.Vertical
            if (r8 != r9) goto L51
        L4b:
            r8 = r10
            r10 = r9
            r9 = r8
            r8 = r13
            r11 = r1
            goto L54
        L51:
            lo4 r9 = defpackage.lo4.Horizontal
            goto L4b
        L54:
            r6.l1(r7, r8, r9, r10, r11)
            if (r0 == 0) goto L61
            r7 = 0
            r6.N0 = r7
            r6.O0 = r7
            defpackage.bl2.G(r6)
        L61:
            return
    }

    @Override // defpackage.yn1, defpackage.yy4
    public final void w(defpackage.oy4 r19, defpackage.py4 r20, long r21) {
            r18 = this;
            r2 = r18
            r8 = r19
            r9 = r20
            java.util.List r10 = r8.a
            int r0 = r10.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L31
            java.lang.Object r3 = r10.get(r1)
            vy4 r3 = (defpackage.vy4) r3
            qn2 r4 = r2.n0
            int r3 = r3.i
            bz4 r5 = new bz4
            r5.<init>(r3)
            java.lang.Object r3 = r4.g(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2e
            super.w(r19, r20, r21)
            goto L31
        L2e:
            int r1 = r1 + 1
            goto Ld
        L31:
            vr2 r0 = r2.q0
            if (r0 != 0) goto L3f
            vr2 r0 = new vr2
            r0.<init>(r2)
            r2.R0(r0)
            r2.q0 = r0
        L3f:
            boolean r0 = r2.o0
            if (r0 == 0) goto L186
            py4 r0 = defpackage.py4.Initial
            r12 = 3
            r13 = 0
            m86 r14 = r2.J0
            r15 = 6
            if (r9 != r0) goto La6
            int r0 = r8.f
            if (r0 != r15) goto La6
            m84 r0 = r2.P0
            if (r0 != 0) goto L8d
            m84 r0 = new m84
            os0 r1 = new os0
            android.view.View r3 = defpackage.jw2.z(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            r4 = 8
            r1.<init>(r3, r4)
            r3 = r0
            yv0 r0 = new yv0
            r6 = 4
            r7 = 3
            r4 = r1
            r1 = 2
            r5 = r3
            java.lang.Class<e86> r3 = defpackage.e86.class
            r16 = r4
            java.lang.String r4 = "onWheelScrollStopped"
            r17 = r5
            java.lang.String r5 = "onWheelScrollStopped-TH1AsA0(J)V"
            r15 = r16
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            sm3 r1 = defpackage.nc1.f0(r2)
            qh1 r1 = r1.u0
            r11.<init>(r14, r15, r0, r1)
            r2.P0 = r11
        L8d:
            m84 r0 = r2.P0
            if (r0 == 0) goto La6
            w61 r1 = r2.F0()
            ap6 r3 = r0.h
            if (r3 != 0) goto La6
            xd1 r3 = new xd1
            r4 = 28
            r3.<init>(r0, r13, r4)
            ap6 r1 = defpackage.hv.L(r1, r13, r13, r3, r12)
            r0.h = r1
        La6:
            m84 r0 = r2.P0
            if (r0 == 0) goto Le5
            int r1 = r8.f
            r3 = 6
            if (r1 != r3) goto Le5
            int r1 = r10.size()
            r3 = 0
        Lb4:
            if (r3 >= r1) goto Lc6
            java.lang.Object r4 = r10.get(r3)
            vy4 r4 = (defpackage.vy4) r4
            boolean r4 = r4.c()
            if (r4 == 0) goto Lc3
            goto Le5
        Lc3:
            int r3 = r3 + 1
            goto Lb4
        Lc6:
            py4 r1 = defpackage.py4.Initial
            if (r9 != r1) goto Ld4
            boolean r1 = r0.d
            if (r1 == 0) goto Ld4
            r0.f(r8)
            defpackage.ng4.a(r8)
        Ld4:
            py4 r1 = defpackage.py4.Main
            if (r9 != r1) goto Le5
            boolean r1 = r0.d
            if (r1 != 0) goto Le5
            boolean r0 = r0.f(r8)
            if (r0 == 0) goto Le5
            defpackage.ng4.a(r8)
        Le5:
            py4 r0 = defpackage.py4.Initial
            r11 = 12
            r15 = 11
            r1 = 10
            if (r9 != r0) goto L13d
            int r0 = r8.f
            if (r0 != r1) goto Lf4
            goto Lf9
        Lf4:
            if (r0 != r15) goto Lf7
            goto Lf9
        Lf7:
            if (r0 != r11) goto L13d
        Lf9:
            z87 r0 = r2.Q0
            if (r0 != 0) goto L124
            z87 r0 = new z87
            r3 = r0
            yv0 r0 = new yv0
            r6 = 4
            r7 = 4
            r4 = r1
            r1 = 2
            r5 = r3
            java.lang.Class<e86> r3 = defpackage.e86.class
            r16 = r4
            java.lang.String r4 = "onTrackpadScrollStopped"
            r17 = r5
            java.lang.String r5 = "onTrackpadScrollStopped-TH1AsA0(J)V"
            r15 = r16
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            sm3 r1 = defpackage.nc1.f0(r2)
            qh1 r1 = r1.u0
            r11.<init>(r14, r0, r1)
            r2.Q0 = r11
            goto L125
        L124:
            r15 = r1
        L125:
            z87 r0 = r2.Q0
            if (r0 == 0) goto L13e
            w61 r1 = r2.F0()
            ap6 r3 = r0.g
            if (r3 != 0) goto L13e
            kp5 r3 = new kp5
            r3.<init>(r0, r13)
            ap6 r1 = defpackage.hv.L(r1, r13, r13, r3, r12)
            r0.g = r1
            goto L13e
        L13d:
            r15 = r1
        L13e:
            z87 r0 = r2.Q0
            if (r0 == 0) goto L186
            int r1 = r8.f
            if (r1 != r15) goto L147
            goto L150
        L147:
            r2 = 11
            if (r1 != r2) goto L14c
            goto L150
        L14c:
            r2 = 12
            if (r1 != r2) goto L186
        L150:
            int r1 = r10.size()
            r11 = 0
        L155:
            if (r11 >= r1) goto L167
            java.lang.Object r2 = r10.get(r11)
            vy4 r2 = (defpackage.vy4) r2
            boolean r2 = r2.c()
            if (r2 == 0) goto L164
            goto L186
        L164:
            int r11 = r11 + 1
            goto L155
        L167:
            py4 r1 = defpackage.py4.Initial
            if (r9 != r1) goto L175
            boolean r1 = r0.d
            if (r1 == 0) goto L175
            r0.d(r8)
            defpackage.ng4.a(r8)
        L175:
            py4 r1 = defpackage.py4.Main
            if (r9 != r1) goto L186
            boolean r1 = r0.d
            if (r1 != 0) goto L186
            boolean r0 = r0.d(r8)
            if (r0 == 0) goto L186
            defpackage.ng4.a(r8)
        L186:
            return
    }
}
