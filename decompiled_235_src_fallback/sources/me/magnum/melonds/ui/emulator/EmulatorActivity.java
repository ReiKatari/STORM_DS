package me.magnum.melonds.ui.emulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorActivity extends defpackage.sx2 {
    public static final /* synthetic */ int Z1 = 0;
    public defpackage.ac A1;
    public defpackage.s8 B0;
    public final defpackage.wp5 B1;
    public final defpackage.go3 C0;
    public final defpackage.vs4 C1;
    public defpackage.x86 D0;
    public final defpackage.vs4 D1;
    public defpackage.pi1 E0;
    public final defpackage.vs4 E1;
    public defpackage.uv4 F0;
    public final defpackage.vs4 F1;
    public defpackage.iu3 G0;
    public final defpackage.vs4 G1;
    public defpackage.at H0;
    public final defpackage.vs4 H1;
    public defpackage.kd6 I0;
    public final defpackage.vs4 I1;
    public defpackage.e70 J0;
    public final defpackage.vs4 J1;
    public defpackage.c92 K0;
    public final defpackage.vs4 K1;
    public me.magnum.melonds.domain.model.Rect L0;
    public final defpackage.vs4 L1;
    public me.magnum.melonds.domain.model.Rect M0;
    public final defpackage.vs4 M1;
    public android.os.Handler N0;
    public final defpackage.vs4 N1;
    public final defpackage.zk1 O0;
    public final defpackage.vs4 O1;
    public final defpackage.lz0 P0;
    public final defpackage.mm6 P1;
    public defpackage.s9 Q0;
    public defpackage.ah2 Q1;
    public defpackage.bt R0;
    public float R1;
    public defpackage.om2 S0;
    public float S1;
    public defpackage.oq0 T0;
    public defpackage.mu4 T1;
    public defpackage.c91 U0;
    public boolean U1;
    public defpackage.q33 V0;
    public final defpackage.bt V1;
    public defpackage.e73 W0;
    public float W1;
    public defpackage.b36 X0;
    public float X1;
    public java.lang.String Y0;
    public boolean Y1;
    public java.lang.String Z0;
    public defpackage.g15 a1;
    public defpackage.ae6 b1;
    public defpackage.ce6 c1;
    public defpackage.t26 d1;
    public me.magnum.melonds.ui.emulator.EmulatorActivity.a e1;
    public me.magnum.melonds.ui.emulator.b f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public defpackage.u82 l1;
    public final defpackage.rv1 m1;
    public final defpackage.ex6 n1;
    public final defpackage.ex6 o1;
    public final defpackage.i9 p1;
    public final defpackage.i9 q1;
    public final defpackage.i9 r1;
    public final defpackage.i9 s1;
    public final defpackage.i9 t1;
    public final defpackage.i9 u1;
    public final defpackage.d00 v1;
    public defpackage.ac w1;
    public defpackage.ac x1;
    public defpackage.ac y1;
    public defpackage.ac z1;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity.a[] $VALUES = null;
        public static final me.magnum.melonds.ui.emulator.EmulatorActivity.a OPEN_GL = null;
        public static final me.magnum.melonds.ui.emulator.EmulatorActivity.a VULKAN = null;

        private static final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity.a[] $values() {
                me.magnum.melonds.ui.emulator.EmulatorActivity$a r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.OPEN_GL
                me.magnum.melonds.ui.emulator.EmulatorActivity$a r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.VULKAN
                me.magnum.melonds.ui.emulator.EmulatorActivity$a[] r0 = new me.magnum.melonds.ui.emulator.EmulatorActivity.a[]{r0, r1}
                return r0
        }

        static {
                me.magnum.melonds.ui.emulator.EmulatorActivity$a r0 = new me.magnum.melonds.ui.emulator.EmulatorActivity$a
                java.lang.String r1 = "OPEN_GL"
                r2 = 0
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.emulator.EmulatorActivity.a.OPEN_GL = r0
                me.magnum.melonds.ui.emulator.EmulatorActivity$a r0 = new me.magnum.melonds.ui.emulator.EmulatorActivity$a
                java.lang.String r1 = "VULKAN"
                r2 = 1
                r0.<init>(r1, r2)
                me.magnum.melonds.ui.emulator.EmulatorActivity.a.VULKAN = r0
                me.magnum.melonds.ui.emulator.EmulatorActivity$a[] r0 = $values()
                me.magnum.melonds.ui.emulator.EmulatorActivity.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                me.magnum.melonds.ui.emulator.EmulatorActivity.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.$ENTRIES
                return r0
        }

        public static me.magnum.melonds.ui.emulator.EmulatorActivity.a valueOf(java.lang.String r1) {
                java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity$a> r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                me.magnum.melonds.ui.emulator.EmulatorActivity$a r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity.a) r1
                return r1
        }

        public static me.magnum.melonds.ui.emulator.EmulatorActivity.a[] values() {
                me.magnum.melonds.ui.emulator.EmulatorActivity$a[] r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.$VALUES
                java.lang.Object r0 = r0.clone()
                me.magnum.melonds.ui.emulator.EmulatorActivity$a[] r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity.a[]) r0
                return r0
        }
    }

    public EmulatorActivity() {
            r9 = this;
            r0 = 0
            r9.<init>(r0)
            wu1 r1 = new wu1
            r2 = 10
            r1.<init>(r9, r2)
            cw1 r3 = new cw1
            r3.<init>(r9, r0)
            uo7 r4 = new uo7
            java.lang.Class<sz1> r5 = defpackage.sz1.class
            ar0 r5 = defpackage.gh5.a(r5)
            cw1 r6 = new cw1
            r7 = 1
            r6.<init>(r9, r7)
            a10 r8 = new a10
            r8.<init>(r1, r9)
            r4.<init>(r5, r6, r3, r8)
            r9.C0 = r4
            zk1 r1 = new zk1
            r1.<init>(r9, r7)
            r9.O0 = r1
            lz0 r1 = new lz0
            r1.<init>()
            r9.P0 = r1
            t26 r1 = defpackage.t26.c
            r9.d1 = r1
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.OPEN_GL
            r9.e1 = r1
            r9.h1 = r7
            u82 r1 = defpackage.u82.MELON_DUAL_DS
            r9.l1 = r1
            rv1 r1 = new rv1
            r1.<init>(r9)
            r9.m1 = r1
            bv1 r1 = new bv1
            r1.<init>(r9, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r9.n1 = r2
            bv1 r1 = new bv1
            r2 = 18
            r1.<init>(r9, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r9.o1 = r2
            c9 r1 = new c9
            r2 = 5
            r1.<init>(r2)
            iu1 r3 = new iu1
            r4 = 2
            r3.<init>(r9, r4)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.p1 = r1
            c9 r1 = new c9
            r1.<init>(r2)
            iu1 r3 = new iu1
            r4 = 3
            r3.<init>(r9, r4)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.q1 = r1
            c9 r1 = new c9
            r1.<init>(r2)
            iu1 r3 = new iu1
            r5 = 4
            r3.<init>(r9, r5)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.r1 = r1
            c9 r1 = new c9
            r1.<init>(r2)
            iu1 r3 = new iu1
            r3.<init>(r9, r2)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.s1 = r1
            c9 r1 = new c9
            r1.<init>(r2)
            iu1 r3 = new iu1
            r3.<init>(r9, r0)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.t1 = r1
            c9 r1 = new c9
            r1.<init>(r4)
            iu1 r3 = new iu1
            r3.<init>(r9, r7)
            d9 r1 = r9.s(r1, r3)
            i9 r1 = (defpackage.i9) r1
            r9.u1 = r1
            d00 r1 = new d00
            r1.<init>(r9, r7)
            r9.v1 = r1
            wp5 r1 = new wp5
            pu1 r3 = new pu1
            r3.<init>(r9, r0)
            r1.<init>()
            r9.B1 = r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r0)
            r9.C1 = r1
            vs4 r1 = defpackage.np2.Y(r0)
            r9.D1 = r1
            vs4 r1 = defpackage.np2.Y(r0)
            r9.E1 = r1
            r1 = 0
            vs4 r3 = defpackage.np2.Y(r1)
            r9.F1 = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            vs4 r3 = defpackage.np2.Y(r3)
            r9.G1 = r3
            vs4 r0 = defpackage.np2.Y(r0)
            r9.H1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.I1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.J1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.K1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.L1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.M1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.N1 = r0
            vs4 r0 = defpackage.np2.Y(r1)
            r9.O1 = r0
            mm6 r0 = new mm6
            r0.<init>()
            r9.P1 = r0
            bt r0 = new bt
            bv1 r1 = new bv1
            r1.<init>(r9, r5)
            bv1 r3 = new bv1
            r3.<init>(r9, r2)
            r0.<init>(r1, r3)
            r9.V1 = r0
            return
    }

    public static final java.lang.Object B(me.magnum.melonds.ui.emulator.EmulatorActivity r14, defpackage.s41 r15) {
            vs4 r0 = r14.M1
            boolean r1 = r15 instanceof defpackage.aw1
            if (r1 == 0) goto L15
            r1 = r15
            aw1 r1 = (defpackage.aw1) r1
            int r2 = r1.f0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f0 = r2
            goto L1a
        L15:
            aw1 r1 = new aw1
            r1.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r1.d0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.f0
            r4 = 3
            r5 = 2
            r6 = 1
            jg7 r7 = defpackage.jg7.a
            r8 = 0
            if (r3 == 0) goto L50
            if (r3 == r6) goto L4a
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L35
            b36 r1 = r1.R
            defpackage.oi2.Y(r15)
            goto L123
        L35:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r8
        L3b:
            int r3 = r1.Z
            int r5 = r1.Y
            int r6 = r1.X
            b36 r9 = r1.R
            defpackage.oi2.Y(r15)
            r10 = r3
            r3 = r9
            goto L10a
        L4a:
            b36 r3 = r1.R
            defpackage.oi2.Y(r15)
            goto L8f
        L50:
            defpackage.oi2.Y(r15)
            b36 r3 = r14.X0
            if (r3 != 0) goto L59
            goto L161
        L59:
            po5 r15 = r3.d
            me.magnum.melonds.domain.model.VideoFiltering r9 = r3.b
            me.magnum.melonds.domain.model.VideoFiltering r10 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r9 != r10) goto L161
            me.magnum.melonds.domain.model.VideoRenderer r9 = r3.a
            me.magnum.melonds.domain.model.VideoRenderer r10 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r9 != r10) goto L69
            goto L161
        L69:
            java.lang.String r9 = r15.a
            if (r9 == 0) goto L161
            int r9 = r9.length()
            if (r9 != 0) goto L75
            goto L161
        L75:
            hp5 r15 = r15.b
            hp5 r9 = defpackage.hp5.NATIVE
            if (r15 != r9) goto L8f
            wv1 r15 = new wv1
            r9 = 6
            r15.<init>(r14, r8, r9)
            r1.R = r3
            r1.f0 = r6
            r9 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r15 = defpackage.xk2.N(r9, r15, r1)
            if (r15 != r2) goto L8f
            goto L121
        L8f:
            r14.S0(r3)
            java.lang.String r15 = r14.Y0
            if (r15 != 0) goto L98
            goto L161
        L98:
            java.lang.String r9 = r14.Z0
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La2
            goto L161
        La2:
            r14.Z0 = r15
            me.magnum.melonds.domain.model.VideoRenderer r15 = r3.a
            me.magnum.melonds.domain.model.VideoRenderer r9 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            if (r15 != r9) goto Lac
        Laa:
            r15 = r6
            goto Lb1
        Lac:
            int r15 = r3.c
            if (r15 >= r6) goto Lb1
            goto Laa
        Lb1:
            int r9 = r15 * 256
            int r10 = r15 * 386
            s8 r11 = r14.B0
            java.lang.String r12 = "binding"
            if (r11 == 0) goto L15d
            android.widget.TextView r11 = r11.j
            r13 = 2131952029(0x7f13019d, float:1.954049E38)
            r11.setText(r13)
            s8 r11 = r14.B0
            if (r11 == 0) goto L159
            android.widget.ProgressBar r11 = r11.g
            r13 = 0
            r11.setVisibility(r13)
            s8 r11 = r14.B0
            if (r11 == 0) goto L155
            android.widget.ProgressBar r11 = r11.g
            r11.setIndeterminate(r6)
            s8 r6 = r14.B0
            if (r6 == 0) goto L151
            android.widget.TextView r6 = r6.k
            r6.setVisibility(r13)
            s8 r6 = r14.B0
            if (r6 == 0) goto L14d
            android.widget.TextView r6 = r6.k
            r11 = 2131952035(0x7f1301a3, float:1.9540501E38)
            r6.setText(r11)
            r6 = 2131952030(0x7f13019e, float:1.9540491E38)
            java.lang.String r6 = r14.getString(r6)
            r0.setValue(r6)
            r1.R = r3
            r1.X = r15
            r1.Y = r9
            r1.Z = r10
            r1.f0 = r5
            r5 = 150(0x96, double:7.4E-322)
            java.lang.Object r5 = defpackage.q60.t(r5, r1)
            if (r5 != r2) goto L108
            goto L121
        L108:
            r6 = r15
            r5 = r9
        L10a:
            xe1 r15 = defpackage.xk1.a
            bw1 r9 = new bw1
            r9.<init>(r14, r5, r10, r8)
            r1.R = r3
            r1.X = r6
            r1.Y = r5
            r1.Z = r10
            r1.f0 = r4
            java.lang.Object r15 = defpackage.hv.d0(r15, r9, r1)
            if (r15 != r2) goto L122
        L121:
            return r2
        L122:
            r1 = r3
        L123:
            java.lang.Number r15 = (java.lang.Number) r15
            long r2 = r15.longValue()
            r15 = 2131952024(0x7f130198, float:1.954048E38)
            java.lang.String r15 = r14.getString(r15)
            r0.setValue(r15)
            po5 r15 = r1.d
            java.lang.String r15 = r15.a
            if (r15 == 0) goto L149
            ce6 r0 = r14.c1
            if (r0 == 0) goto L143
            be6 r1 = defpackage.be6.OPEN_GL
            r0.a(r15, r1, r2)
            goto L149
        L143:
            java.lang.String r14 = "shaderCompileTimeStore"
            defpackage.nb3.a0(r14)
            throw r8
        L149:
            r14.S()
            return r7
        L14d:
            defpackage.nb3.a0(r12)
            throw r8
        L151:
            defpackage.nb3.a0(r12)
            throw r8
        L155:
            defpackage.nb3.a0(r12)
            throw r8
        L159:
            defpackage.nb3.a0(r12)
            throw r8
        L15d:
            defpackage.nb3.a0(r12)
            throw r8
        L161:
            return r7
    }

    public static final void C(me.magnum.melonds.ui.emulator.EmulatorActivity r6) {
            vs4 r0 = r6.M1
            vs4 r1 = r6.H1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L76
            s8 r1 = r6.B0
            r2 = 0
            java.lang.String r3 = "binding"
            if (r1 == 0) goto L72
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r1.m
            r4 = 4
            r1.setVisibility(r4)
            s8 r1 = r6.B0
            if (r1 == 0) goto L6e
            android.widget.TextView r1 = r1.i
            r4 = 8
            r1.setVisibility(r4)
            s8 r1 = r6.B0
            if (r1 == 0) goto L6a
            android.widget.TextView r1 = r1.j
            r5 = 0
            r1.setVisibility(r5)
            s8 r1 = r6.B0
            if (r1 == 0) goto L66
            android.widget.ProgressBar r1 = r1.g
            r1.setVisibility(r5)
            s8 r1 = r6.B0
            if (r1 == 0) goto L62
            android.widget.TextView r1 = r1.k
            r1.setVisibility(r4)
            s8 r1 = r6.B0
            if (r1 == 0) goto L5e
            android.widget.TextView r1 = r1.j
            r2 = 2131952024(0x7f130198, float:1.954048E38)
            r1.setText(r2)
            java.lang.Object r1 = r0.getValue()
            if (r1 != 0) goto L76
            java.lang.String r6 = r6.getString(r2)
            r0.setValue(r6)
            return
        L5e:
            defpackage.nb3.a0(r3)
            throw r2
        L62:
            defpackage.nb3.a0(r3)
            throw r2
        L66:
            defpackage.nb3.a0(r3)
            throw r2
        L6a:
            defpackage.nb3.a0(r3)
            throw r2
        L6e:
            defpackage.nb3.a0(r3)
            throw r2
        L72:
            defpackage.nb3.a0(r3)
            throw r2
        L76:
            return
    }

    public static final void m0(defpackage.bh5 r1, defpackage.bh5 r2, me.magnum.melonds.domain.model.Rect r3, float r4) {
            if (r3 == 0) goto L20
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L8
            goto L20
        L8:
            int r4 = r1.A
            int r0 = r3.getWidth()
            int r4 = java.lang.Math.max(r4, r0)
            r1.A = r4
            int r1 = r2.A
            int r3 = r3.getHeight()
            int r1 = java.lang.Math.max(r1, r3)
            r2.A = r1
        L20:
            return
    }

    public static java.lang.String n0(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ": "
            java.lang.String r1 = defpackage.lb1.m(r1, r0, r2)
            return r1
    }

    public final void A0() {
            r4 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 19
            r1.<init>(r4, r2)
            java.lang.String r2 = "Engine A (Main) BG mode"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            ou1 r2 = new ou1
            r3 = 20
            r2.<init>(r4, r3)
            java.lang.String r3 = "Engine B (Sub) BG mode"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            ou1 r1 = new ou1
            r2 = 21
            r1.<init>(r4, r2)
            java.lang.String r2 = "Background mode override"
            r4.K0(r2, r0, r1)
            return
    }

    public final void B0() {
            r8 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 0
            r1.<init>(r8, r2)
            java.lang.String r2 = "OBJ master"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            ou1 r2 = new ou1
            r3 = 1
            r2.<init>(r8, r3)
            java.lang.String r3 = "OBJ priority enables"
            r1.<init>(r3, r2)
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 2
            r3.<init>(r8, r4)
            java.lang.String r4 = "OBJ OAM order / Z buckets"
            r2.<init>(r4, r3)
            bk5 r3 = new bk5
            ou1 r4 = new ou1
            r5 = 3
            r4.<init>(r8, r5)
            java.lang.String r5 = "OBJ vertical bands"
            r3.<init>(r5, r4)
            bk5 r4 = new bk5
            ou1 r5 = new ou1
            r6 = 4
            r5.<init>(r8, r6)
            java.lang.String r6 = "OBJ transform and storage type"
            r4.<init>(r6, r5)
            bk5 r5 = new bk5
            ou1 r6 = new ou1
            r7 = 5
            r6.<init>(r8, r7)
            java.lang.String r7 = "OBJ effects and masks"
            r5.<init>(r7, r6)
            bk5[] r0 = new defpackage.bk5[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = defpackage.hf.c0(r0)
            ou1 r1 = new ou1
            r2 = 6
            r1.<init>(r8, r2)
            java.lang.String r2 = "OBJ / Sprites"
            r8.K0(r2, r0, r1)
            return
    }

    public final void C0() {
            r4 = this;
            bk5 r0 = new bk5
            wu1 r1 = new wu1
            r2 = 9
            r1.<init>(r4, r2)
            java.lang.String r2 = "Engine A (Main) OBJ OAM order"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            wu1 r2 = new wu1
            r3 = 11
            r2.<init>(r4, r3)
            java.lang.String r3 = "Engine B (Sub) OBJ OAM order"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            wu1 r1 = new wu1
            r2 = 12
            r1.<init>(r4, r2)
            java.lang.String r2 = "OBJ OAM order / Z buckets"
            r4.K0(r2, r0, r1)
            return
    }

    public final void D(android.widget.LinearLayout r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            r4 = 2
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r4, r1)
            r4 = 4
            int r2 = r2.R(r4)
            r4 = 0
            r0.setPadding(r4, r4, r4, r2)
            r3.addView(r0)
            return
    }

    public final void D0(boolean r13) {
            r12 = this;
            nj5 r0 = r12.d0()
            vr4 r1 = r12.P()
            java.lang.Object r2 = r1.A
            r4 = r2
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r1 = r1.B
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            if (r13 == 0) goto L16
            java.lang.String r2 = "Engine A (Main) OBJ OAM order"
            goto L18
        L16:
            java.lang.String r2 = "Engine B (Sub) OBJ OAM order"
        L18:
            java.lang.String r3 = "OBJ OAM order / Z buckets"
            r12.G(r4, r3)
            java.lang.String r3 = "Filters sprites by OAM index order. For equal OBJ priority, lower OAM indices are drawn later by `DrawSprites` and appear closer to the viewer; this gives practical Z-position control for composite sprites."
            r12.D(r4, r3)
            xu1 r9 = new xu1
            r10 = 3
            r9.<init>(r13, r0, r10)
            uu1 r11 = new uu1
            r3 = 5
            r11.<init>(r13, r0, r12, r3)
            r12.H(r4, r2)
            java.util.List r13 = defpackage.dw1.d
            java.util.Iterator r13 = r13.iterator()
        L37:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r13.next()
            pj5 r0 = (defpackage.pj5) r0
            java.lang.String r5 = r0.b
            java.lang.String r6 = r0.c
            java.lang.Object r3 = r9.c()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r7 = r0.a
            r8 = 1
            int r7 = r8 << r7
            r3 = r3 & r7
            if (r3 != 0) goto L5b
        L59:
            r7 = r8
            goto L5d
        L5b:
            r8 = 0
            goto L59
        L5d:
            t00 r8 = new t00
            r3 = 12
            r8.<init>(r0, r9, r11, r3)
            r3 = r12
            r3.I(r4, r5, r6, r7, r8)
            goto L37
        L69:
            r3 = r12
            bv1 r12 = new bv1
            r12.<init>(r3, r10)
            r3.M0(r2, r1, r12)
            return
    }

    public final void E(android.widget.LinearLayout r4, defpackage.nj5 r5, int r6, java.lang.String r7, java.lang.String r8, defpackage.on2 r9) {
            r3 = this;
            int r0 = r5.m
            r0 = r0 & r6
            r1 = 0
            if (r0 == 0) goto La
            r0 = 1
        L7:
            r2 = r6
            r6 = r8
            goto Lc
        La:
            r0 = r1
            goto L7
        Lc:
            zu1 r8 = new zu1
            r8.<init>(r5, r2, r1, r9)
            r5 = r7
            r7 = r0
            r3.I(r4, r5, r6, r7, r8)
            return
    }

    public final void E0() {
            r4 = this;
            bk5 r0 = new bk5
            wu1 r1 = new wu1
            r2 = 2
            r1.<init>(r4, r2)
            java.lang.String r2 = "Engine A (Main) OBJ priorities"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            wu1 r2 = new wu1
            r3 = 3
            r2.<init>(r4, r3)
            java.lang.String r3 = "Engine B (Sub) OBJ priorities"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            wu1 r1 = new wu1
            r2 = 4
            r1.<init>(r4, r2)
            java.lang.String r2 = "OBJ priority enables"
            r4.K0(r2, r0, r1)
            return
    }

    public final void F(android.widget.LinearLayout r8, java.lang.String r9, defpackage.on2 r10, defpackage.qn2 r11, java.lang.String r12, java.lang.String r13) {
            r7 = this;
            r7.H(r8, r9)
            java.util.List r9 = defpackage.dw1.c
            java.util.Iterator r9 = r9.iterator()
        L9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r9.next()
            qj5 r0 = (defpackage.qj5) r0
            java.lang.String r3 = r0.b
            int r1 = r0.a
            java.lang.String r2 = r0.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r6 = ". "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = defpackage.i61.n(r4, r5, r13)
            java.lang.Object r2 = r10.c()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5 = 1
            int r1 = r5 << r1
            r1 = r1 & r2
            if (r1 != 0) goto L48
            goto L49
        L48:
            r5 = 0
        L49:
            t00 r6 = new t00
            r1 = 11
            r6.<init>(r0, r10, r11, r1)
            r1 = r7
            r2 = r8
            r1.I(r2, r3, r4, r5, r6)
            goto L9
        L56:
            return
    }

    public final void F0(boolean r11) {
            r10 = this;
            nj5 r0 = r10.d0()
            vr4 r1 = r10.P()
            java.lang.Object r2 = r1.A
            r4 = r2
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r1 = r1.B
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            if (r11 == 0) goto L17
            java.lang.String r2 = "Engine A (Main) OBJ priorities"
        L15:
            r5 = r2
            goto L1a
        L17:
            java.lang.String r2 = "Engine B (Sub) OBJ priorities"
            goto L15
        L1a:
            java.lang.String r2 = "OBJ priority enables"
            r10.G(r4, r2)
            java.lang.String r2 = "Disables sprite layers by OAM Attribute 2 priority bits 10-11. Priority 0 is closest to the viewer; priority 3 is furthest back."
            r10.D(r4, r2)
            xu1 r6 = new xu1
            r2 = 2
            r6.<init>(r11, r0, r2)
            uu1 r7 = new uu1
            r3 = 4
            r7.<init>(r11, r0, r10, r3)
            java.lang.String r8 = "OBJ priority"
            java.lang.String r9 = "Code gate: `attrib[2] & 0x0C00`, then `InterleaveSprites(0x40000 | priority << 16)`."
            r3 = r10
            r3.F(r4, r5, r6, r7, r8, r9)
            bv1 r10 = new bv1
            r10.<init>(r3, r2)
            r3.M0(r5, r1, r10)
            return
    }

    public final void G(android.widget.LinearLayout r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            android.graphics.Typeface r4 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r4, r1)
            r4 = 2
            r1 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r4, r1)
            r4 = 12
            int r4 = r2.R(r4)
            r1 = 4
            int r2 = r2.R(r1)
            r1 = 0
            r0.setPadding(r1, r4, r1, r2)
            r3.addView(r0)
            return
    }

    public final void G0() {
            r6 = this;
            boolean r0 = r6.Y()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2131952435(0x7f130333, float:1.9541313E38)
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            kw3 r1 = defpackage.hf.I()
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 22
            r3.<init>(r6, r4)
            java.lang.String r4 = "Renderer output and primitive buckets"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 23
            r3.<init>(r6, r4)
            java.lang.String r4 = "Polygon material and effects"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 24
            r3.<init>(r6, r4)
            java.lang.String r4 = "Depth, fog and screen bands"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            r3 = 2131952436(0x7f130334, float:1.9541315E38)
            java.lang.String r3 = r6.getString(r3)
            r3.getClass()
            ou1 r4 = new ou1
            r5 = 25
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
            kw3 r1 = defpackage.hf.A(r1)
            ou1 r2 = new ou1
            r3 = 26
            r2.<init>(r6, r3)
            r6.K0(r0, r1, r2)
            return
    }

    public final void H(android.widget.LinearLayout r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r4)
            android.graphics.Typeface r4 = r0.getTypeface()
            r1 = 1
            r0.setTypeface(r4, r1)
            r4 = 1096810496(0x41600000, float:14.0)
            r1 = 2
            r0.setTextSize(r1, r4)
            r4 = 8
            int r4 = r2.R(r4)
            int r2 = r2.R(r1)
            r1 = 0
            r0.setPadding(r1, r4, r1, r2)
            r3.addView(r0)
            return
    }

    public final void H0() {
            r4 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 29
            r1.<init>(r4, r2)
            java.lang.String r2 = "Depth and fog mode"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            wu1 r2 = new wu1
            r3 = 0
            r2.<init>(r4, r3)
            java.lang.String r3 = "Screen bands"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            wu1 r1 = new wu1
            r2 = 1
            r1.<init>(r4, r2)
            java.lang.String r2 = "Depth, fog and screen bands"
            r4.K0(r2, r0, r1)
            return
    }

    public final void I(android.widget.LinearLayout r6, java.lang.String r7, java.lang.String r8, boolean r9, defpackage.qn2 r10) {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            r1 = 1
            r0.setOrientation(r1)
            r2 = 6
            int r3 = r5.R(r2)
            int r2 = r5.R(r2)
            r4 = 0
            r0.setPadding(r4, r3, r4, r2)
            androidx.appcompat.widget.SwitchCompat r2 = new androidx.appcompat.widget.SwitchCompat
            r3 = 0
            r2.<init>(r5, r3)
            r2.setText(r7)
            r2.setChecked(r9)
            r7 = 16
            r2.setGravity(r7)
            r7 = 1096810496(0x41600000, float:14.0)
            r9 = 2
            r2.setTextSize(r9, r7)
            r2.setSingleLine(r4)
            r2.setEllipsize(r3)
            jq0 r7 = new jq0
            r7.<init>(r10, r1)
            r2.setOnCheckedChangeListener(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r1 = -2
            r7.<init>(r10, r1)
            r0.addView(r2, r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r5)
            r7.setText(r8)
            r8 = 1094713344(0x41400000, float:12.0)
            r7.setTextSize(r9, r8)
            r8 = 4
            int r5 = r5.R(r8)
            r7.setPadding(r5, r4, r4, r4)
            r0.addView(r7)
            r6.addView(r0)
            return
    }

    public final void I0() {
            r4 = this;
            bk5 r0 = new bk5
            wu1 r1 = new wu1
            r2 = 19
            r1.<init>(r4, r2)
            java.lang.String r2 = "Texture state"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            wu1 r2 = new wu1
            r3 = 20
            r2.<init>(r4, r3)
            java.lang.String r3 = "Polygon mode"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            wu1 r1 = new wu1
            r2 = 21
            r1.<init>(r4, r2)
            java.lang.String r2 = "Polygon material and effects"
            r4.K0(r2, r0, r1)
            return
    }

    public final void J(android.widget.LinearLayout r4, defpackage.rj5 r5, int r6, java.lang.String r7, java.lang.String r8) {
            r3 = this;
            int r0 = r5.a
            r0 = r0 & r6
            r1 = 1
            if (r0 == 0) goto La
            r0 = r1
        L7:
            r2 = r6
            r6 = r8
            goto Lc
        La:
            r0 = 0
            goto L7
        Lc:
            zu1 r8 = new zu1
            r8.<init>(r5, r2, r1, r3)
            r5 = r7
            r7 = r0
            r3.I(r4, r5, r6, r7, r8)
            return
    }

    public final void J0() {
            r5 = this;
            bk5 r0 = new bk5
            wu1 r1 = new wu1
            r2 = 14
            r1.<init>(r5, r2)
            java.lang.String r2 = "3D renderer output"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            wu1 r2 = new wu1
            r3 = 15
            r2.<init>(r5, r3)
            java.lang.String r3 = "Primitive buckets"
            r1.<init>(r3, r2)
            bk5 r2 = new bk5
            wu1 r3 = new wu1
            r4 = 16
            r3.<init>(r5, r4)
            java.lang.String r4 = "Blend buckets"
            r2.<init>(r4, r3)
            bk5[] r0 = new defpackage.bk5[]{r0, r1, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            wu1 r1 = new wu1
            r2 = 17
            r1.<init>(r5, r2)
            java.lang.String r2 = "Renderer output and primitives"
            r5.K0(r2, r0, r1)
            return
    }

    public final void K(defpackage.jq1 r9) {
            r8 = this;
            jq1 r0 = defpackage.jq1.OFF
            if (r9 == r0) goto L93
            c92 r0 = r8.K0
            if (r0 != 0) goto La
            goto L93
        La:
            int[] r0 = me.magnum.melonds.ui.emulator.a.d
            int r9 = r9.ordinal()
            r9 = r0[r9]
            r0 = 1
            if (r9 == r0) goto L24
            r1 = 2
            if (r9 == r1) goto L21
            r8 = 3
            if (r9 != r8) goto L1d
            goto L93
        L1d:
            defpackage.i.d()
            return
        L21:
            nj3 r9 = defpackage.nj3.BOTTOM_SCREEN
            goto L26
        L24:
            nj3 r9 = defpackage.nj3.TOP_SCREEN
        L26:
            s8 r1 = r8.B0
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 == 0) goto L8f
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r1.m
            nj3 r4 = defpackage.nj3.TOP_SCREEN
            zj3 r1 = r1.d(r4)
            r5 = 0
            if (r1 == 0) goto L3a
            r1 = r0
            goto L3b
        L3a:
            r1 = r5
        L3b:
            s8 r6 = r8.B0
            if (r6 == 0) goto L8b
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r6 = r6.m
            nj3 r7 = defpackage.nj3.BOTTOM_SCREEN
            zj3 r6 = r6.d(r7)
            if (r6 == 0) goto L4b
            r6 = r0
            goto L4c
        L4b:
            r6 = r5
        L4c:
            if (r1 == 0) goto L51
            if (r6 != 0) goto L51
            goto L5e
        L51:
            if (r6 == 0) goto L56
            if (r1 != 0) goto L56
            goto L5b
        L56:
            if (r1 == 0) goto L59
            goto L5e
        L59:
            if (r6 == 0) goto L5d
        L5b:
            r4 = r7
            goto L5e
        L5d:
            r4 = r3
        L5e:
            if (r4 != 0) goto L61
            goto L93
        L61:
            if (r4 == r9) goto L64
            r5 = r0
        L64:
            s8 r9 = r8.B0
            if (r9 == 0) goto L87
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r9 = r9.m
            boolean r1 = r9.j0
            if (r1 == r5) goto L74
            r1 = r1 ^ r0
            r9.j0 = r1
            r9.j()
        L74:
            c92 r8 = r8.K0
            if (r8 == 0) goto L93
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r8 = r8.L
            if (r8 == 0) goto L93
            boolean r9 = r8.j0
            if (r9 == r5) goto L93
            r9 = r9 ^ r0
            r8.j0 = r9
            r8.j()
            return
        L87:
            defpackage.nb3.a0(r2)
            throw r3
        L8b:
            defpackage.nb3.a0(r2)
            throw r3
        L8f:
            defpackage.nb3.a0(r2)
            throw r3
        L93:
            return
    }

    public final void K0(java.lang.String r8, java.util.List r9, defpackage.on2 r10) {
            r7 = this;
            boolean r0 = r7.Y()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            if (r10 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            bt r3 = r7.V1
            ex1 r4 = defpackage.ex1.PAUSE_MENU
            r3.z(r4)
            zb r3 = new zb
            r3.<init>(r7)
            java.lang.Object r4 = r3.L
            wb r4 = (defpackage.wb) r4
            r4.d = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r9, r5)
            r8.<init>(r5)
            java.util.Iterator r5 = r9.iterator()
        L2e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L40
            java.lang.Object r6 = r5.next()
            bk5 r6 = (defpackage.bk5) r6
            java.lang.String r6 = r6.a
            r8.add(r6)
            goto L2e
        L40:
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.Object[] r8 = r8.toArray(r5)
            java.lang.CharSequence[] r8 = (java.lang.CharSequence[]) r8
            ax r5 = new ax
            r5.<init>(r9, r1)
            r3.v(r8, r5)
            r8 = 0
            if (r10 == 0) goto L59
            r9 = 2131952286(0x7f13029e, float:1.954101E38)
            r3.x(r9, r8)
        L59:
            if (r0 == 0) goto L69
            java.lang.String r9 = r7.h0()
            r4.k = r9
            r4.l = r8
            java.lang.String r9 = "+1 Frame"
            r4.g = r9
            r4.h = r8
        L69:
            ku1 r8 = new ku1
            r8.<init>(r7, r2)
            r4.o = r8
            lu1 r8 = new lu1
            r8.<init>(r7, r2)
            r4.n = r8
            ac r8 = r3.l()
            mu1 r9 = new mu1
            r9.<init>(r10, r8, r7)
            r8.setOnShowListener(r9)
            r8.show()
            return
    }

    public final void L(defpackage.nj5 r17) {
            r16 = this;
            r0 = r17
            boolean r1 = r16.Y()
            if (r1 != 0) goto L9
            return
        L9:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r2 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r3 = r0.a
            int r4 = r0.b
            int r5 = r0.c
            int r6 = r0.d
            int r7 = r0.e
            int r8 = r0.f
            int r9 = r0.g
            int r10 = r0.h
            int r11 = r0.i
            int r12 = r0.j
            int r13 = r0.k
            int r14 = r0.l
            int r15 = r0.m
            r2.setRenderer2DDebugControls(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r16.a0()
            return
    }

    public final void L0() {
            r6 = this;
            r0 = 2131952440(0x7f130338, float:1.9541323E38)
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            kw3 r1 = defpackage.hf.I()
            bk5 r2 = new bk5
            r3 = 2131952437(0x7f130335, float:1.9541317E38)
            java.lang.String r3 = r6.getString(r3)
            r3.getClass()
            bv1 r4 = new bv1
            r5 = 20
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
            boolean r2 = r6.Y()
            if (r2 == 0) goto L72
            bk5 r2 = new bk5
            java.lang.String r3 = r6.h0()
            bv1 r4 = new bv1
            r5 = 21
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
            bk5 r2 = new bk5
            r3 = 2131952433(0x7f130331, float:1.9541309E38)
            java.lang.String r3 = r6.getString(r3)
            r3.getClass()
            bv1 r4 = new bv1
            r5 = 22
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
            bk5 r2 = new bk5
            r3 = 2131952435(0x7f130333, float:1.9541313E38)
            java.lang.String r3 = r6.getString(r3)
            r3.getClass()
            bv1 r4 = new bv1
            r5 = 23
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
        L72:
            kw3 r1 = defpackage.hf.A(r1)
            r2 = 0
            r6.K0(r0, r1, r2)
            return
    }

    public final void M() {
            r3 = this;
            me.magnum.melonds.ui.emulator.b r0 = r3.f1
            r1 = 0
            if (r0 == 0) goto L13
            android.os.Handler r2 = r3.N0
            if (r2 == 0) goto Ld
            r2.removeCallbacks(r0)
            goto L13
        Ld:
            java.lang.String r3 = "handler"
            defpackage.nb3.a0(r3)
            throw r1
        L13:
            r3.f1 = r1
            r0 = 0
            r3.g1 = r0
            return
    }

    public final void M0(java.lang.String r3, android.widget.ScrollView r4, defpackage.on2 r5) {
            r2 = this;
            boolean r0 = r2.Y()
            if (r0 != 0) goto L7
            return
        L7:
            bt r0 = r2.V1
            ex1 r1 = defpackage.ex1.PAUSE_MENU
            r0.z(r1)
            zb r0 = new zb
            r0.<init>(r2)
            java.lang.Object r1 = r0.L
            wb r1 = (defpackage.wb) r1
            r1.d = r3
            r0.A(r4)
            r3 = 2131952286(0x7f13029e, float:1.954101E38)
            r4 = 0
            r0.x(r3, r4)
            java.lang.String r3 = r2.h0()
            r1.k = r3
            r1.l = r4
            java.lang.String r3 = "+1 Frame"
            r1.g = r3
            r1.h = r4
            ku1 r3 = new ku1
            r4 = 2
            r3.<init>(r2, r4)
            r1.o = r3
            lu1 r3 = new lu1
            r3.<init>(r2, r4)
            r1.n = r3
            ac r3 = r0.l()
            mu1 r4 = new mu1
            r4.<init>(r3, r2, r5)
            r3.setOnShowListener(r4)
            r3.show()
            return
    }

    public final void N() {
            r2 = this;
            bt r0 = r2.V1
            ex1 r1 = defpackage.ex1.REWIND_WINDOW
            r0.T(r1)
            vs4 r0 = r2.L1
            r1 = 0
            r0.setValue(r1)
            boolean r0 = r2.U1
            if (r0 == 0) goto L18
            r0 = 0
            r2.U1 = r0
            r2.i0()
            return
        L18:
            sz1 r2 = r2.W()
            r2.T0()
            return
    }

    public final void N0(int r2, boolean r3, java.lang.String r4, defpackage.qn2 r5) {
            r1 = this;
            if (r3 != 0) goto Le
            r2 = 2131952496(0x7f130370, float:1.9541436E38)
            r3 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
            return
        Le:
            android.widget.EditText r3 = new android.widget.EditText
            r3.<init>(r1)
            r0 = 524289(0x80001, float:7.34685E-40)
            r3.setInputType(r0)
            r0 = 0
            r3.setSingleLine(r0)
            if (r4 != 0) goto L21
            java.lang.String r4 = ""
        L21:
            r3.setText(r4)
            android.text.Editable r4 = r3.getText()
            int r4 = r4.length()
            r3.setSelection(r4)
            zb r4 = new zb
            r4.<init>(r1)
            r4.z(r2)
            r4.A(r3)
            nu1 r1 = new nu1
            r1.<init>(r0, r5, r3)
            r2 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r4.y(r2, r1)
            r1 = 2131951750(0x7f130086, float:1.9539923E38)
            r2 = 0
            r4.x(r1, r2)
            r4.B()
            return
    }

    public final defpackage.om2 O(me.magnum.melonds.ui.emulator.EmulatorActivity.a r2) {
            r1 = this;
            int[] r0 = me.magnum.melonds.ui.emulator.a.e
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 != r0) goto L14
            xr7 r2 = new xr7
            r2.<init>(r1)
            return r2
        L14:
            defpackage.i.d()
            r1 = 0
            return r1
        L19:
            pm4 r1 = new pm4
            r1.<init>()
            return r1
    }

    public final void O0() {
            r4 = this;
            boolean r0 = r4.Y()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            boolean r0 = r4.h1
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            sz1 r4 = r4.W()
            o41 r0 = r4.z
            hz1 r1 = new hz1
            r2 = 12
            r3 = 0
            r1.<init>(r2, r3, r4)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    public final defpackage.vr4 P() {
            r5 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 24
            int r2 = r5.R(r1)
            r3 = 12
            int r3 = r5.R(r3)
            int r1 = r5.R(r1)
            r4 = 8
            int r4 = r5.R(r4)
            r0.setPadding(r2, r3, r1, r4)
            android.widget.ScrollView r1 = new android.widget.ScrollView
            r1.<init>(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r5.<init>(r2, r3)
            r1.addView(r0, r5)
            vr4 r5 = new vr4
            r5.<init>(r0, r1)
            return r5
    }

    public final void P0() {
            r1 = this;
            boolean r0 = r1.h1
            if (r0 == 0) goto Ld
            sz1 r1 = r1.W()
            r0 = 0
            r1.M0(r0)
            return
        Ld:
            sz1 r1 = r1.W()
            r1.T0()
            return
    }

    public final void Q() {
            r3 = this;
            vs4 r0 = r3.N1
            java.lang.Object r1 = r0.getValue()
            if (r1 == 0) goto L1a
            r1 = 0
            r0.setValue(r1)
            bt r0 = r3.V1
            ex1 r2 = defpackage.ex1.SAVE_STATES_DIALOG
            r0.T(r2)
            c92 r3 = r3.K0
            if (r3 == 0) goto L1a
            r3.a(r1)
        L1a:
            return
    }

    public final void Q0() {
            r1 = this;
            boolean r0 = r1.Y()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r1.h1
            r0 = r0 ^ 1
            r1.h1 = r0
            r1.P0()
            return
    }

    public final int R(int r1) {
            r0 = this;
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    public final void R0() {
            r8 = this;
            boolean r0 = r8.i1
            if (r0 == 0) goto L6
            goto L198
        L6:
            android.view.Display r0 = defpackage.ge7.D(r8)
            r0.getClass()
            x86 r1 = r8.D0
            r2 = 0
            if (r1 == 0) goto L19f
            android.view.Display r1 = defpackage.x86.a(r8)
            u82 r3 = r8.l1
            u82 r4 = defpackage.u82.MELON_DUAL_DS
            if (r3 != r4) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            pi1 r3 = r8.E0
            if (r3 == 0) goto L199
            ok3 r0 = r3.b(r0, r1)
            sz1 r3 = r8.W()
            r3.getClass()
            ci0 r3 = r3.u
            java.lang.Object r3 = r3.f
            tp6 r3 = (defpackage.tp6) r3
            r3.getClass()
            r3.m(r2, r0)
            rv1 r0 = r8.m1
            boolean r3 = r8.i1
            if (r3 == 0) goto L41
            goto L198
        L41:
            c92 r3 = r8.K0
            if (r3 == 0) goto L54
            android.view.Display r3 = r3.getDisplay()
            if (r3 == 0) goto L54
            int r3 = r3.getDisplayId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L55
        L54:
            r3 = r2
        L55:
            if (r1 == 0) goto L60
            int r4 = r1.getDisplayId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L61
        L60:
            r4 = r2
        L61:
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L69
            goto L198
        L69:
            c92 r3 = r8.K0
            if (r3 == 0) goto L70
            r3.dismiss()
        L70:
            r8.K0 = r2
            if (r1 == 0) goto L198
            c92 r3 = new c92
            om2 r4 = r8.S0
            if (r4 == 0) goto L192
            boolean r5 = r8.k1
            r3.<init>(r8, r1, r4, r5)
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r3.L
            wb1 r4 = new wb1
            r5 = 8
            r6 = 0
            r4.<init>(r5, r6)
            r1.setLayoutComponentViewBuilderFactory(r4)
            r1.setFrontendInputHandler(r0)
            q33 r4 = r8.V0
            if (r4 == 0) goto L18c
            r1.setSystemInputHandler(r4)
            sz1 r4 = r8.W()
            de5 r4 = r4.u0
            rp6 r4 = r4.A
            java.lang.Object r4 = r4.getValue()
            w26 r4 = (defpackage.w26) r4
            if (r4 == 0) goto Lc7
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r5 = r3.L
            sn3 r7 = defpackage.sn3.SECONDARY_SCREEN
            r5.getClass()
            r7.getClass()
            r5.f0 = r4
            ff7 r4 = r4.e
            r5.e(r4, r7)
            r5.i()
            r5.k()
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            boolean r7 = r5.i0
            r5.h(r4, r7)
            r3.b()
        Lc7:
            nj3 r4 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            boolean r5 = r0.A
            r1.h(r4, r5)
            nj3 r4 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            boolean r0 = r0.L
            r1.h(r4, r0)
            lz0 r0 = r8.P0
            de5 r0 = r0.f
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            oz0 r0 = (defpackage.oz0) r0
            r1.setConnectedControllersState(r0)
            sz1 r0 = r8.W()
            de5 r0 = r0.y0
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            b36 r0 = (defpackage.b36) r0
            r3.e0 = r0
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r1 = r3.Z
            fx1 r1 = r1.f0
            r4 = 1
            if (r1 == 0) goto L109
            c91 r1 = (defpackage.c91) r1
            java.lang.Object r5 = r1.b
            monitor-enter(r5)
            r1.c = r0     // Catch: java.lang.Throwable -> L106
            r1.d = r4     // Catch: java.lang.Throwable -> L106
            monitor-exit(r5)
            goto L109
        L106:
            r8 = move-exception
            monitor-exit(r5)
            throw r8
        L109:
            r3.b()
            sz1 r0 = r8.W()
            de5 r0 = r0.C0
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            t26 r0 = (defpackage.t26) r0
            r0.getClass()
            r3.d0 = r0
            c91 r1 = r3.Y
            r1.getClass()
            java.lang.Object r5 = r1.o
            monitor-enter(r5)
            r1.p = r0     // Catch: java.lang.Throwable -> L189
            r1.q = r4     // Catch: java.lang.Throwable -> L189
            r1.e = r4     // Catch: java.lang.Throwable -> L189
            r1.f = r6     // Catch: java.lang.Throwable -> L189
            monitor-exit(r5)
            r3.b()
            s8 r0 = r8.B0
            if (r0 == 0) goto L183
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            boolean r0 = r0.j0
            if (r0 == 0) goto L14a
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r3.L
            boolean r1 = r0.j0
            r1 = r1 ^ r4
            r0.j0 = r1
            r0.j()
            r3.b()
        L14a:
            bt r0 = r8.V1
            boolean r0 = r0.M()
            if (r0 == 0) goto L157
            android.view.View r0 = r3.R
            r0.setVisibility(r6)
        L157:
            r3.show()
            r8.K0 = r3
            vs4 r0 = r8.G1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17f
            c92 r0 = r8.K0
            if (r0 == 0) goto L17f
            cv1 r1 = new cv1
            r2 = 3
            r1.<init>(r8, r2)
            zv0 r2 = new zv0
            r3 = -1623931774(0xffffffff9f34c482, float:-3.827903E-20)
            r2.<init>(r3, r4, r1)
            r0.a(r2)
        L17f:
            r8.o0()
            return
        L183:
            java.lang.String r8 = "binding"
            defpackage.nb3.a0(r8)
            throw r2
        L189:
            r8 = move-exception
            monitor-exit(r5)
            throw r8
        L18c:
            java.lang.String r8 = "melonTouchHandler"
            defpackage.nb3.a0(r8)
            throw r2
        L192:
            java.lang.String r8 = "frameRenderCoordinator"
            defpackage.nb3.a0(r8)
            throw r2
        L198:
            return
        L199:
            java.lang.String r8 = "deviceLayoutDisplayMapper"
            defpackage.nb3.a0(r8)
            throw r2
        L19f:
            java.lang.String r8 = "secondaryDisplaySelector"
            defpackage.nb3.a0(r8)
            throw r2
    }

    public final void S() {
            r18 = this;
            r1 = r18
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> L9
            java.lang.String[] r0 = r0.consumeShaderDiagnostics()     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r0 = move-exception
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L10:
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L16
            r0 = 0
        L16:
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L1c
            goto L19d
        L1c:
            int r2 = r0.length
            if (r2 != 0) goto L21
            goto L19d
        L21:
            ae6 r2 = r1.b1
            if (r2 == 0) goto L1e6
            monitor-enter(r2)
            int r4 = r0.length     // Catch: java.lang.Throwable -> L31
            r6 = 1
            if (r4 != 0) goto L34
            yt1 r0 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)
            r16 = 0
            goto L181
        L31:
            r0 = move-exception
            goto L1e4
        L34:
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            int r7 = r0.length     // Catch: java.lang.Throwable -> L31
            r10 = 0
            r11 = r10
        L40:
            r12 = 9
            if (r11 >= r7) goto Lac
            r13 = r0[r11]     // Catch: java.lang.Throwable -> L31
            char[] r14 = new char[r6]     // Catch: java.lang.Throwable -> L31
            r14[r10] = r12     // Catch: java.lang.Throwable -> L31
            r12 = 6
            java.util.List r12 = defpackage.qs6.J0(r13, r14, r12)     // Catch: java.lang.Throwable -> L31
            int r13 = r12.size()     // Catch: java.lang.Throwable -> L31
            r14 = 5
            if (r13 >= r14) goto L5e
            r3 = r7
            r17 = r10
            r5 = r11
            r7 = 0
            r16 = 0
            goto La0
        L5e:
            r13 = r7
            zd6 r7 = new zd6     // Catch: java.lang.Throwable -> L31
            java.lang.Object r15 = r12.get(r10)     // Catch: java.lang.Throwable -> L31
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L31
            r16 = 0
            java.lang.Object r3 = r12.get(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = "OK"
            boolean r3 = defpackage.nb3.k(r3, r10)     // Catch: java.lang.Throwable -> L31
            r10 = 2
            java.lang.Object r10 = r12.get(r10)     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L31
            r6 = 3
            java.lang.Object r6 = r12.get(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L31
            r5 = 4
            java.lang.Object r5 = r12.get(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = defpackage.gt0.K0(r14, r12)     // Catch: java.lang.Throwable -> L31
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L31
            if (r12 != 0) goto L92
            java.lang.String r12 = ""
        L92:
            r14 = r12
            r12 = r10
            r10 = r15
            r15 = r14
            r14 = r5
            r5 = r11
            r17 = 0
            r11 = r3
            r3 = r13
            r13 = r6
            r7.<init>(r8, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L31
        La0:
            if (r7 == 0) goto La5
            r4.add(r7)     // Catch: java.lang.Throwable -> L31
        La5:
            int r11 = r5 + 1
            r7 = r3
            r10 = r17
            r6 = 1
            goto L40
        Lac:
            r17 = r10
            r16 = 0
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lbb
            yt1 r0 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)
            goto L181
        Lbb:
            java.io.File r0 = r2.a     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.isFile()     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto Lca
            java.io.File r0 = r2.a     // Catch: java.lang.Throwable -> L17f
            java.util.ArrayList r0 = defpackage.jc2.A0(r0)     // Catch: java.lang.Throwable -> L17f
            goto Lcc
        Lca:
            yt1 r0 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L17f
        Lcc:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17f
            r5 = 10
            int r6 = defpackage.ht0.v0(r4, r5)     // Catch: java.lang.Throwable -> L17f
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L17f
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L17f
            r10 = r17
        Ldd:
            if (r10 >= r6) goto L164
            java.lang.Object r7 = r4.get(r10)     // Catch: java.lang.Throwable -> L17f
            int r10 = r10 + 1
            zd6 r7 = (defpackage.zd6) r7     // Catch: java.lang.Throwable -> L17f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17f
            r8.<init>()     // Catch: java.lang.Throwable -> L17f
            java.text.SimpleDateFormat r9 = r2.b     // Catch: java.lang.Throwable -> L17f
            java.util.Date r11 = new java.util.Date     // Catch: java.lang.Throwable -> L17f
            long r13 = r7.a     // Catch: java.lang.Throwable -> L17f
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r9.format(r11)     // Catch: java.lang.Throwable -> L17f
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            r8.append(r12)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r7.b     // Catch: java.lang.Throwable -> L17f
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            r8.append(r12)     // Catch: java.lang.Throwable -> L17f
            boolean r9 = r7.c     // Catch: java.lang.Throwable -> L17f
            if (r9 == 0) goto L10e
            java.lang.String r9 = "OK"
            goto L110
        L10e:
            java.lang.String r9 = "FAIL"
        L110:
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            r8.append(r12)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r7.d     // Catch: java.lang.Throwable -> L17f
            java.lang.String r11 = "retroarch-shaders/installed/"
            r13 = 47
            java.lang.String r14 = defpackage.qs6.O0(r13, r9, r9)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = defpackage.qs6.N0(r9, r11, r14)     // Catch: java.lang.Throwable -> L17f
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            r8.append(r12)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r7.e     // Catch: java.lang.Throwable -> L17f
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = " -> "
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r7.f     // Catch: java.lang.Throwable -> L17f
            r8.append(r9)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r9 = r7.g     // Catch: java.lang.Throwable -> L17f
            boolean r9 = defpackage.qs6.v0(r9)     // Catch: java.lang.Throwable -> L17f
            if (r9 != 0) goto L15b
            r8.append(r12)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = r7.g     // Catch: java.lang.Throwable -> L17f
            r9 = 32
            java.lang.String r7 = r7.replace(r5, r9)     // Catch: java.lang.Throwable -> L17f
            r7.getClass()     // Catch: java.lang.Throwable -> L17f
            r11 = 13
            java.lang.String r7 = r7.replace(r11, r9)     // Catch: java.lang.Throwable -> L17f
            r7.getClass()     // Catch: java.lang.Throwable -> L17f
            r8.append(r7)     // Catch: java.lang.Throwable -> L17f
        L15b:
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L17f
            r3.add(r7)     // Catch: java.lang.Throwable -> L17f
            goto Ldd
        L164:
            java.util.ArrayList r0 = defpackage.gt0.V0(r0, r3)     // Catch: java.lang.Throwable -> L17f
            r3 = 200(0xc8, float:2.8E-43)
            java.util.List r5 = defpackage.gt0.f1(r3, r0)     // Catch: java.lang.Throwable -> L17f
            java.io.File r0 = r2.a     // Catch: java.lang.Throwable -> L17f
            java.lang.String r6 = "\n"
            java.lang.String r8 = "\n"
            r9 = 0
            r10 = 58
            r7 = 0
            java.lang.String r3 = defpackage.gt0.P0(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L17f
            defpackage.jc2.F0(r0, r3)     // Catch: java.lang.Throwable -> L17f
        L17f:
            monitor-exit(r2)
            r0 = r4
        L181:
            java.util.Iterator r0 = r0.iterator()
        L185:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L197
            java.lang.Object r2 = r0.next()
            r3 = r2
            zd6 r3 = (defpackage.zd6) r3
            boolean r3 = r3.c
            if (r3 != 0) goto L185
            goto L199
        L197:
            r2 = r16
        L199:
            zd6 r2 = (defpackage.zd6) r2
            if (r2 != 0) goto L19e
        L19d:
            return
        L19e:
            java.lang.String r0 = r2.g
            kv3 r3 = new kv3
            r3.<init>(r0)
        L1a5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1ba
            java.lang.Object r0 = r3.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.qs6.v0(r4)
            if (r4 != 0) goto L1a5
            r3 = r0
            goto L1bc
        L1ba:
            r3 = r16
        L1bc:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L1c2
            java.lang.String r3 = ""
        L1c2:
            java.lang.String r0 = r2.d
            java.lang.String r2 = "retroarch-shaders/installed/"
            r13 = 47
            java.lang.String r4 = defpackage.qs6.O0(r13, r0, r0)
            java.lang.String r0 = defpackage.qs6.N0(r0, r2, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            r2 = 2131952631(0x7f1303f7, float:1.954171E38)
            java.lang.String r0 = r1.getString(r2, r0)
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            return
        L1e4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
        L1e6:
            r16 = 0
            java.lang.String r0 = "shaderCompatibilityLog"
            defpackage.nb3.a0(r0)
            throw r16
    }

    public final void S0(defpackage.b36 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            if (r1 == 0) goto Lf
            me.magnum.melonds.domain.model.VideoFiltering r5 = r1.b
            goto L10
        Lf:
            r5 = r4
        L10:
            me.magnum.melonds.domain.model.VideoFiltering r6 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            r7 = 1
            if (r5 != r6) goto L1d
            me.magnum.melonds.domain.model.VideoRenderer r5 = r1.a
            me.magnum.melonds.domain.model.VideoRenderer r6 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r5 == r6) goto L1d
            r9 = r7
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r1 == 0) goto L27
            po5 r5 = r1.d
            if (r5 == 0) goto L27
            java.lang.String r5 = r5.a
            goto L28
        L27:
            r5 = r4
        L28:
            if (r9 == 0) goto L2c
            r10 = r5
            goto L2d
        L2c:
            r10 = r4
        L2d:
            if (r9 == 0) goto L53
            if (r1 == 0) goto L53
            po5 r5 = r1.d
            if (r5 == 0) goto L53
            java.util.Map r5 = r5.e
            if (r5 == 0) goto L53
            java.util.Set r5 = r5.entrySet()
            if (r5 == 0) goto L53
            r11 = r5
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            vn0 r15 = new vn0
            r4 = 25
            r15.<init>(r4)
            r16 = 30
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            java.lang.String r4 = defpackage.gt0.P0(r11, r12, r13, r14, r15, r16)
        L53:
            r11 = r4
            if (r9 == 0) goto L62
            if (r1 == 0) goto L62
            po5 r4 = r1.d
            if (r4 == 0) goto L62
            boolean r4 = r4.f
            if (r4 != r7) goto L62
            r12 = r7
            goto L63
        L62:
            r12 = r2
        L63:
            if (r1 == 0) goto L7e
            po5 r4 = r1.d
            if (r4 == 0) goto L7e
            hp5 r4 = r4.b
            if (r4 == 0) goto L7e
            java.lang.String r4 = r4.name()
            if (r4 == 0) goto L7e
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
        L7c:
            r13 = r4
            goto L81
        L7e:
            java.lang.String r4 = "vulkan_ir"
            goto L7c
        L81:
            if (r9 == 0) goto L88
            vr4 r3 = r0.l0()
            goto L8e
        L88:
            vr4 r4 = new vr4
            r4.<init>(r3, r3)
            r3 = r4
        L8e:
            java.lang.Object r4 = r3.B
            java.lang.Object r3 = r3.A
            if (r9 == 0) goto L9c
            if (r1 == 0) goto L9c
            po5 r1 = r1.d
            if (r1 == 0) goto L9c
            int r2 = r1.c
        L9c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r5 = "|"
            r1.append(r5)
            r1.append(r10)
            r1.append(r5)
            r1.append(r11)
            r1.append(r5)
            r1.append(r13)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r6 = "x"
            r1.append(r6)
            r1.append(r4)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r0.Y0
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto Ldb
            if (r12 != 0) goto Ldb
            goto Lf0
        Ldb:
            r0.Y0 = r1
            me.magnum.melonds.MelonEmulator r8 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> Lf0
            int r14 = r3.intValue()     // Catch: java.lang.Throwable -> Lf0
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> Lf0
            int r15 = r4.intValue()     // Catch: java.lang.Throwable -> Lf0
            r16 = r2
            r8.configureOpenGlRetroArchFilter(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            return
    }

    public final java.lang.String T(java.lang.Long r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r4 = 0
            return r4
        L4:
            long r0 = r5.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L16
            r5 = 2131952322(0x7f1302c2, float:1.9541083E38)
            java.lang.String r4 = r4.getString(r5)
            return r4
        L16:
            long r0 = r5.longValue()
            r2 = 86399999(0x5265bff, double:4.26872713E-316)
            long r0 = r0 + r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            r2 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L29
            r0 = r2
        L29:
            int r5 = (int) r0
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 2131886081(0x7f120001, float:1.940673E38)
            java.lang.String r4 = r4.getQuantityString(r1, r5, r0)
            return r4
    }

    public final void T0(defpackage.ac r3) {
            r2 = this;
            r0 = -3
            android.widget.Button r0 = r3.h(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = r2.h0()
            r0.setText(r1)
        Le:
            r0 = -1
            android.widget.Button r3 = r3.h(r0)
            if (r3 == 0) goto L1a
            boolean r2 = r2.h1
            r3.setEnabled(r2)
        L1a:
            return
    }

    public final defpackage.e84 U() {
            r0 = this;
            ex6 r0 = r0.o1
            java.lang.Object r0 = r0.getValue()
            e84 r0 = (defpackage.e84) r0
            return r0
    }

    public final void U0() {
            r31 = this;
            r0 = r31
            boolean r1 = r0.i1
            if (r1 != 0) goto L216
            boolean r1 = r0.j1
            if (r1 == 0) goto Lc
            goto L216
        Lc:
            qv1 r1 = r0.k0()
            me.magnum.melonds.domain.model.Rect r2 = r1.h
            me.magnum.melonds.domain.model.Rect r3 = r1.b
            vs4 r4 = r0.O1
            r4.setValue(r1)
            b36 r4 = r0.X0
            r0.S0(r4)
            c91 r5 = r0.U0
            if (r5 == 0) goto L20e
            me.magnum.melonds.domain.model.Rect r6 = r1.a
            me.magnum.melonds.domain.model.Rect r7 = r1.b
            float r8 = r1.c
            float r9 = r1.d
            boolean r10 = r1.f
            me.magnum.melonds.domain.model.Rect r11 = r1.g
            me.magnum.melonds.domain.model.Rect r12 = r1.h
            float r13 = r1.i
            boolean r14 = r1.j
            r5.e(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            om2 r5 = r0.S0
            if (r5 == 0) goto L206
            s8 r6 = r0.B0
            java.lang.String r7 = "binding"
            if (r6 == 0) goto L1fe
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r8 = r6.h
            me.magnum.melonds.domain.model.Rect r9 = r1.a
            float r13 = r1.c
            float r14 = r1.d
            boolean r15 = r1.e
            boolean r10 = r1.f
            me.magnum.melonds.domain.model.Rect r11 = r1.g
            float r12 = r1.i
            boolean r1 = r1.j
            b36 r4 = r0.X0
            r20 = r1
            if (r4 != 0) goto L5e
        L59:
            r30 = r2
            r7 = 0
            goto L17e
        L5e:
            po5 r1 = r4.d
            r16 = r6
            me.magnum.melonds.domain.model.VideoRenderer r6 = r4.a
            r17 = r7
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r6 == r7) goto L6b
            goto L59
        L6b:
            if (r16 == 0) goto L1f8
            vr4 r6 = r8.getCurrentSurfaceSize()
            java.lang.Object r7 = r6.A
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.B
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r7 <= 0) goto L84
            goto L8e
        L84:
            s8 r7 = r0.B0
            if (r7 == 0) goto L1f2
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r7 = r7.h
            int r7 = r7.getWidth()
        L8e:
            if (r6 <= 0) goto L91
            goto L9b
        L91:
            s8 r6 = r0.B0
            if (r6 == 0) goto L1ec
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r6 = r6.h
            int r6 = r6.getHeight()
        L9b:
            if (r11 != 0) goto La2
            if (r2 != 0) goto La2
            r16 = 1
            goto La4
        La2:
            r16 = 0
        La4:
            if (r9 == 0) goto Lb3
            int r17 = r9.getWidth()
            if (r17 <= 0) goto Lb3
            int r17 = r9.getHeight()
            if (r17 <= 0) goto Lb3
            goto Lb4
        Lb3:
            r9 = 0
        Lb4:
            if (r3 == 0) goto Lc6
            int r17 = r3.getWidth()
            if (r17 <= 0) goto Lc6
            int r17 = r3.getHeight()
            if (r17 <= 0) goto Lc6
            r17 = r6
            r6 = r3
            goto Lc9
        Lc6:
            r17 = r6
            r6 = 0
        Lc9:
            if (r9 != 0) goto Lcf
            if (r6 != 0) goto Lcf
            if (r16 != 0) goto Ld7
        Lcf:
            r30 = r2
            r16 = r10
            r18 = r11
            r2 = 0
            goto L10e
        Ld7:
            if (r7 <= 0) goto Ldb
            if (r17 > 0) goto Le3
        Ldb:
            r30 = r2
            r16 = r10
            r18 = r11
            r2 = 0
            goto L107
        Le3:
            int r6 = r17 / 2
            r9 = 1
            int r6 = java.lang.Math.max(r9, r6)
            r16 = r10
            int r10 = r17 - r6
            int r10 = java.lang.Math.max(r9, r10)
            me.magnum.melonds.domain.model.Rect r9 = new me.magnum.melonds.domain.model.Rect
            r30 = r2
            r2 = 0
            r9.<init>(r2, r2, r7, r6)
            r18 = r11
            me.magnum.melonds.domain.model.Rect r11 = new me.magnum.melonds.domain.model.Rect
            r11.<init>(r2, r6, r7, r10)
            vr4 r6 = new vr4
            r6.<init>(r9, r11)
            goto L114
        L107:
            vr4 r6 = new vr4
            r7 = 0
            r6.<init>(r7, r7)
            goto L114
        L10e:
            vr4 r7 = new vr4
            r7.<init>(r9, r6)
            r6 = r7
        L114:
            java.lang.Object r7 = r6.A
            r11 = r7
            me.magnum.melonds.domain.model.Rect r11 = (me.magnum.melonds.domain.model.Rect) r11
            java.lang.Object r6 = r6.B
            me.magnum.melonds.domain.model.Rect r6 = (me.magnum.melonds.domain.model.Rect) r6
            if (r18 == 0) goto L12e
            int r7 = r18.getWidth()
            if (r7 <= 0) goto L12e
            int r7 = r18.getHeight()
            if (r7 <= 0) goto L12e
            r17 = r18
            goto L130
        L12e:
            r17 = 0
        L130:
            if (r30 == 0) goto L141
            int r7 = r30.getWidth()
            if (r7 <= 0) goto L141
            int r7 = r30.getHeight()
            if (r7 <= 0) goto L141
            r18 = r30
            goto L143
        L141:
            r18 = 0
        L143:
            t26 r7 = r0.d1
            me.magnum.melonds.domain.model.layout.BackgroundMode r7 = r7.b
            me.magnum.melonds.domain.model.VideoFiltering r4 = r4.b
            me.magnum.melonds.domain.model.VideoFiltering r9 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r4 != r9) goto L150
            r23 = 1
            goto L152
        L150:
            r23 = r2
        L152:
            java.lang.String r9 = r1.a
            hp5 r10 = r1.b
            java.lang.String r10 = r10.name()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r25 = r10.toLowerCase(r2)
            r25.getClass()
            int r2 = r1.c
            java.util.Map r10 = r1.e
            boolean r1 = r1.f
            r27 = r10
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r10 = new me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig
            r28 = r1
            r26 = r2
            r22 = r4
            r21 = r7
            r24 = r9
            r19 = r12
            r12 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r7 = r10
        L17e:
            t26 r1 = r0.d1
            r5.e(r8, r7, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L216
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L216
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L216
            boolean r1 = r1.isAttachedToWindow()
            r9 = 1
            if (r1 != r9) goto L216
            boolean r1 = r0.k1
            if (r1 == 0) goto L1dd
            r1 = r30
            me.magnum.melonds.domain.model.Rect[] r1 = new me.magnum.melonds.domain.model.Rect[]{r3, r1}
            java.util.ArrayList r1 = defpackage.fv.C0(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r1, r2)
            r4.<init>(r2)
            int r2 = r1.size()
            r3 = 0
        L1ba:
            if (r3 >= r2) goto L1de
            java.lang.Object r5 = r1.get(r3)
            int r3 = r3 + 1
            me.magnum.melonds.domain.model.Rect r5 = (me.magnum.melonds.domain.model.Rect) r5
            android.graphics.Rect r6 = new android.graphics.Rect
            int r7 = r5.getX()
            int r8 = r5.getY()
            int r9 = r5.getRight()
            int r5 = r5.getBottom()
            r6.<init>(r7, r8, r9, r5)
            r4.add(r6)
            goto L1ba
        L1dd:
            r4 = 0
        L1de:
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L216
            if (r4 != 0) goto L1e8
            yt1 r4 = defpackage.yt1.A
        L1e8:
            defpackage.yz0.o(r0, r4)
            return
        L1ec:
            defpackage.nb3.a0(r17)
            r29 = 0
            throw r29
        L1f2:
            r29 = 0
            defpackage.nb3.a0(r17)
            throw r29
        L1f8:
            r29 = 0
            defpackage.nb3.a0(r17)
            throw r29
        L1fe:
            r17 = r7
            r29 = 0
            defpackage.nb3.a0(r17)
            throw r29
        L206:
            r29 = 0
            java.lang.String r0 = "frameRenderCoordinator"
            defpackage.nb3.a0(r0)
            throw r29
        L20e:
            r29 = 0
            java.lang.String r0 = "mainScreenRenderer"
            defpackage.nb3.a0(r0)
            throw r29
        L216:
            return
    }

    public final defpackage.hq2 V() {
            r0 = this;
            ex6 r0 = r0.n1
            java.lang.Object r0 = r0.getValue()
            hq2 r0 = (defpackage.hq2) r0
            return r0
    }

    public final defpackage.sz1 W() {
            r0 = this;
            go3 r0 = r0.C0
            java.lang.Object r0 = r0.getValue()
            sz1 r0 = (defpackage.sz1) r0
            return r0
    }

    public final boolean X() {
            r1 = this;
            vs4 r0 = r1.F1
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L31
            vs4 r0 = r1.N1
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L31
            mm6 r0 = r1.P1
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            vs4 r0 = r1.E1
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L31
            vs4 r1 = r1.L1
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r1 = 0
            return r1
        L31:
            r1 = 1
            return r1
    }

    public final boolean Y() {
            r0 = this;
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean Z(int r5) {
            r4 = this;
            ah2 r0 = r4.Q1
            s8 r1 = r4.B0
            r2 = 0
            java.lang.String r3 = "binding"
            if (r1 == 0) goto L39
            androidx.compose.ui.platform.ComposeView r1 = r1.d
            boolean r1 = r1.hasFocus()
            if (r1 != 0) goto L1f
            s8 r4 = r4.B0
            if (r4 == 0) goto L1b
            androidx.compose.ui.platform.ComposeView r4 = r4.d
            r4.requestFocus()
            goto L1f
        L1b:
            defpackage.nb3.a0(r3)
            throw r2
        L1f:
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L2b
            r2 = r0
            eh2 r2 = (defpackage.eh2) r2
            boolean r5 = r2.g(r5, r1)
            goto L2c
        L2b:
            r5 = r4
        L2c:
            if (r5 != 0) goto L38
            if (r0 == 0) goto L37
            r4 = 7
            eh2 r0 = (defpackage.eh2) r0
            boolean r4 = r0.g(r4, r1)
        L37:
            return r4
        L38:
            return r5
        L39:
            defpackage.nb3.a0(r3)
            throw r2
    }

    public final void a0() {
            r1 = this;
            boolean r0 = r1.Y()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            boolean r0 = r1.h1
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            r1.O0()
            return
    }

    public final void b0() {
            r2 = this;
            mm6 r0 = r2.P1
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L11
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
        L11:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            vs4 r0 = r2.F1
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L22
            r2.i0()
        L22:
            return
    }

    public final void c0(defpackage.ov1 r3) {
            r2 = this;
            bt r0 = r2.V1
            ex1 r1 = defpackage.ex1.PAUSE_MENU
            r0.z(r1)
            mm6 r0 = r2.P1
            r0.add(r3)
            r3 = 0
            r2.j0(r3)
            return
    }

    public final defpackage.nj5 d0() {
            r17 = this;
            boolean r0 = r17.Y()
            if (r0 != 0) goto Lc
            nj5 r0 = new nj5
            r0.<init>()
            return r0
        Lc:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r0 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r0 = r0.getRenderer2DDebugControls()
            if (r0 == 0) goto L4b
            int r1 = r0.length
            r2 = 13
            if (r1 < r2) goto L4b
            nj5 r3 = new nj5
            r1 = 0
            r4 = r0[r1]
            r1 = 1
            r5 = r0[r1]
            r1 = 2
            r6 = r0[r1]
            r1 = 3
            r7 = r0[r1]
            r1 = 4
            r8 = r0[r1]
            r1 = 5
            r9 = r0[r1]
            r1 = 6
            r10 = r0[r1]
            r1 = 7
            r11 = r0[r1]
            r1 = 8
            r12 = r0[r1]
            r1 = 9
            r13 = r0[r1]
            r1 = 10
            r14 = r0[r1]
            r1 = 11
            r15 = r0[r1]
            r1 = 12
            r16 = r0[r1]
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L4b:
            nj5 r0 = new nj5
            r0.<init>()
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            r1.getClass()
            bt r2 = r0.V1
            boolean r2 = r2.M()
            r3 = 1025(0x401, float:1.436E-42)
            r4 = 16777232(0x1000010, float:2.3509932E-38)
            r5 = 16
            java.lang.String r6 = "nativeInputListener"
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto La8
            boolean r2 = r0.X()
            if (r2 == 0) goto L86
            int r2 = r1.getAction()
            if (r2 != r7) goto L86
            r2 = 15
            float r2 = r1.getAxisValue(r2)
            float r7 = r1.getAxisValue(r5)
            int r11 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r11 <= 0) goto L44
            float r11 = r0.R1
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 > 0) goto L44
            qg2 r10 = new qg2
            r11 = 4
            r10.<init>(r11)
            goto L7a
        L44:
            r11 = -1090519040(0xffffffffbf000000, float:-0.5)
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 >= 0) goto L57
            float r12 = r0.R1
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 < 0) goto L57
            qg2 r10 = new qg2
            r11 = 3
            r10.<init>(r11)
            goto L7a
        L57:
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 <= 0) goto L68
            float r12 = r0.S1
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 > 0) goto L68
            qg2 r10 = new qg2
            r11 = 6
            r10.<init>(r11)
            goto L7a
        L68:
            int r10 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r10 >= 0) goto L79
            float r10 = r0.S1
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L79
            qg2 r10 = new qg2
            r11 = 5
            r10.<init>(r11)
            goto L7a
        L79:
            r10 = r9
        L7a:
            r0.R1 = r2
            r0.S1 = r7
            if (r10 == 0) goto L86
            int r1 = r10.a
            r0.Z(r1)
            return r8
        L86:
            e73 r2 = r0.W0
            if (r2 == 0) goto La4
            boolean r5 = r1.isFromSource(r5)
            if (r5 != 0) goto L9c
            boolean r4 = r1.isFromSource(r4)
            if (r4 != 0) goto L9c
            boolean r3 = r1.isFromSource(r3)
            if (r3 == 0) goto L9f
        L9c:
            r2.a(r1)
        L9f:
            boolean r0 = super.dispatchGenericMotionEvent(r23)
            return r0
        La4:
            defpackage.nb3.a0(r6)
            throw r9
        La8:
            e73 r2 = r0.W0
            if (r2 == 0) goto L213
            s03 r6 = r2.c
            s03 r11 = r2.b
            boolean r5 = r1.isFromSource(r5)
            if (r5 != 0) goto Lc2
            boolean r4 = r1.isFromSource(r4)
            if (r4 != 0) goto Lc2
            boolean r3 = r1.isFromSource(r3)
            if (r3 == 0) goto L20d
        Lc2:
            boolean r3 = r2.a(r1)
            java.util.LinkedHashMap r4 = r2.d
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld5:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L101
            java.lang.Object r12 = r4.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            b73 r13 = (defpackage.b73) r13
            java.lang.Integer r13 = r13.a
            if (r13 == 0) goto Lf5
            int r14 = r1.getDeviceId()
            int r13 = r13.intValue()
            if (r13 != r14) goto Ld5
        Lf5:
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            r5.put(r13, r12)
            goto Ld5
        L101:
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L109:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L202
            java.lang.Object r12 = r4.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            b73 r13 = (defpackage.b73) r13
            java.lang.Object r12 = r12.getValue()
            c73 r12 = (defpackage.c73) r12
            int r14 = r13.b
            d63 r15 = r13.c
            float r14 = r1.getAxisValue(r14)
            int[] r16 = defpackage.d73.a
            int r17 = r15.ordinal()
            r18 = r9
            r9 = r16[r17]
            r16 = r10
            r10 = 0
            r17 = 0
            if (r9 == r8) goto L147
            if (r9 != r7) goto L143
            int r9 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r9 <= 0) goto L14c
        L140:
            r14 = r17
            goto L14c
        L143:
            defpackage.i.d()
            return r10
        L147:
            int r9 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r9 >= 0) goto L14c
            goto L140
        L14c:
            boolean r9 = r12.b
            if (r9 == 0) goto L159
            float r9 = java.lang.Math.abs(r14)
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 >= 0) goto L1f6
            goto L161
        L159:
            float r9 = java.lang.Math.abs(r14)
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 < 0) goto L1f6
        L161:
            u41 r9 = r2.a
            int r13 = r13.b
            r9.getClass()
            java.util.ArrayList r9 = r9.b
            int r7 = r9.size()
            r8 = r10
        L16f:
            if (r8 >= r7) goto L1bb
            java.lang.Object r20 = r9.get(r8)
            int r8 = r8 + 1
            r10 = r20
            i63 r10 = (defpackage.i63) r10
            h63 r0 = r10.b
            h63 r10 = r10.c
            h63[] r0 = new defpackage.h63[]{r0, r10}
            java.util.List r0 = defpackage.hf.c0(r0)
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L18e
            goto L1b7
        L18e:
            java.util.Iterator r0 = r0.iterator()
        L192:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L1b7
            java.lang.Object r10 = r0.next()
            h63 r10 = (defpackage.h63) r10
            r21 = r0
            boolean r0 = r10 instanceof defpackage.e63
            if (r0 == 0) goto L1a7
            e63 r10 = (defpackage.e63) r10
            goto L1a9
        L1a7:
            r10 = r18
        L1a9:
            if (r10 == 0) goto L1b4
            int r0 = r10.b
            if (r0 != r13) goto L1b4
            d63 r0 = r10.c
            if (r0 != r15) goto L1b4
            goto L1bd
        L1b4:
            r0 = r21
            goto L192
        L1b7:
            r10 = 0
            r0 = r22
            goto L16f
        L1bb:
            r20 = r18
        L1bd:
            r0 = r20
            i63 r0 = (defpackage.i63) r0
            if (r0 == 0) goto L1c6
            b63 r0 = r0.a
            goto L1c8
        L1c6:
            r0 = r18
        L1c8:
            if (r0 == 0) goto L1f6
            boolean r7 = r12.b
            if (r7 == 0) goto L1e3
            r7 = 0
            r12.b = r7
            r8 = 1
            r2.c(r0, r7, r8)
            boolean r7 = r0.isSystemInput()
            if (r7 == 0) goto L1df
            r11.b(r0)
            goto L1f6
        L1df:
            r6.b(r0)
            goto L1f6
        L1e3:
            r8 = 1
            r12.b = r8
            r2.c(r0, r8, r8)
            boolean r7 = r0.isSystemInput()
            if (r7 == 0) goto L1f3
            r11.c(r0)
            goto L1f6
        L1f3:
            r6.c(r0)
        L1f6:
            r12.a = r14
            r0 = r22
            r10 = r16
            r9 = r18
            r7 = 2
            r8 = 1
            goto L109
        L202:
            if (r3 != 0) goto L20a
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L20d
        L20a:
            r19 = 1
            goto L212
        L20d:
            boolean r0 = super.dispatchGenericMotionEvent(r23)
            return r0
        L212:
            return r19
        L213:
            r18 = r9
            defpackage.nb3.a0(r6)
            throw r18
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r15) {
            r14 = this;
            r15.getClass()
            bt r0 = r14.V1
            boolean r0 = r0.M()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Ld5
            e73 r0 = r14.W0
            if (r0 == 0) goto Lcf
            s03 r3 = r0.c
            s03 r4 = r0.b
            u41 r5 = r0.a
            int r6 = r15.getKeyCode()
            java.util.ArrayList r5 = r5.b
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L23:
            if (r9 >= r7) goto L61
            java.lang.Object r10 = r5.get(r9)
            int r9 = r9 + 1
            i63 r10 = (defpackage.i63) r10
            h63 r11 = r10.b
            h63 r12 = r10.c
            h63[] r11 = new defpackage.h63[]{r11, r12}
            java.util.List r11 = defpackage.hf.c0(r11)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L40
            goto L23
        L40:
            java.util.Iterator r11 = r11.iterator()
        L44:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L23
            java.lang.Object r12 = r11.next()
            h63 r12 = (defpackage.h63) r12
            boolean r13 = r12 instanceof defpackage.f63
            if (r13 == 0) goto L57
            f63 r12 = (defpackage.f63) r12
            goto L58
        L57:
            r12 = r2
        L58:
            if (r12 == 0) goto L44
            int r12 = r12.b
            if (r12 != r6) goto L44
            b63 r5 = r10.a
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 != 0) goto L66
            goto Ld5
        L66:
            r6 = 16
            boolean r6 = r15.isFromSource(r6)
            if (r6 != 0) goto La3
            r6 = 16777232(0x1000010, float:2.3509932E-38)
            boolean r7 = r15.isFromSource(r6)
            if (r7 != 0) goto La3
            r7 = 1025(0x401, float:1.436E-42)
            boolean r9 = r15.isFromSource(r7)
            if (r9 != 0) goto La3
            r9 = 513(0x201, float:7.19E-43)
            boolean r9 = r15.isFromSource(r9)
            if (r9 != 0) goto La3
            android.view.InputDevice r9 = r15.getDevice()
            if (r9 == 0) goto L94
            boolean r6 = r9.supportsSource(r6)
            if (r6 != r1) goto L94
            goto La3
        L94:
            android.view.InputDevice r6 = r15.getDevice()
            if (r6 == 0) goto La1
            boolean r6 = r6.supportsSource(r7)
            if (r6 != r1) goto La1
            goto La3
        La1:
            r6 = r8
            goto La4
        La3:
            r6 = r1
        La4:
            int r7 = r15.getAction()
            if (r7 == 0) goto Lbe
            if (r7 == r1) goto Lad
            goto Ld5
        Lad:
            r0.c(r5, r8, r6)
            boolean r14 = r5.isSystemInput()
            if (r14 == 0) goto Lba
            r4.b(r5)
            return r1
        Lba:
            r3.b(r5)
            return r1
        Lbe:
            r0.c(r5, r1, r6)
            boolean r14 = r5.isSystemInput()
            if (r14 == 0) goto Lcb
            r4.c(r5)
            return r1
        Lcb:
            r3.c(r5)
            return r1
        Lcf:
            java.lang.String r14 = "nativeInputListener"
            defpackage.nb3.a0(r14)
            throw r2
        Ld5:
            boolean r0 = r14.X()
            if (r0 == 0) goto L120
            int r0 = r15.getAction()
            if (r0 != 0) goto L120
            int r0 = r15.getKeyCode()
            switch(r0) {
                case 19: goto Lff;
                case 20: goto Lf8;
                case 21: goto Lf1;
                case 22: goto Lea;
                default: goto Le8;
            }
        Le8:
            r0 = r2
            goto L105
        Lea:
            qg2 r0 = new qg2
            r3 = 4
            r0.<init>(r3)
            goto L105
        Lf1:
            qg2 r0 = new qg2
            r3 = 3
            r0.<init>(r3)
            goto L105
        Lf8:
            qg2 r0 = new qg2
            r3 = 6
            r0.<init>(r3)
            goto L105
        Lff:
            qg2 r0 = new qg2
            r3 = 5
            r0.<init>(r3)
        L105:
            if (r0 == 0) goto L120
            int r0 = r0.a
            boolean r0 = r14.Z(r0)
            if (r0 != 0) goto L11f
            s8 r14 = r14.B0
            if (r14 == 0) goto L119
            androidx.compose.ui.platform.ComposeView r14 = r14.d
            r14.dispatchKeyEvent(r15)
            return r1
        L119:
            java.lang.String r14 = "binding"
            defpackage.nb3.a0(r14)
            throw r2
        L11f:
            return r1
        L120:
            boolean r14 = super.dispatchKeyEvent(r15)
            return r14
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            r8.getClass()
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L24
            android.view.Window r0 = r7.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L24
            r2 = 30
            if (r1 < r2) goto L20
            r1 = 16
            r0.performHapticFeedback(r1)     // Catch: java.lang.Throwable -> L24
            goto L24
        L20:
            r1 = 3
            r0.performHapticFeedback(r1)     // Catch: java.lang.Throwable -> L24
        L24:
            int r0 = r8.getPointerCount()
            r1 = 0
            l93 r0 = defpackage.gi2.R(r1, r0)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3e
        L3c:
            r0 = r1
            goto L5a
        L3e:
            java.util.Iterator r0 = r0.iterator()
        L42:
            r2 = r0
            k93 r2 = (defpackage.k93) r2
            boolean r2 = r2.L
            if (r2 == 0) goto L3c
            r2 = r0
            e93 r2 = (defpackage.e93) r2
            int r2 = r2.nextInt()
            int r2 = r8.getToolType(r2)
            if (r2 == r3) goto L59
            r5 = 4
            if (r2 != r5) goto L42
        L59:
            r0 = r4
        L5a:
            if (r0 != 0) goto L102
            int r2 = r8.getPointerCount()
            if (r2 != r3) goto L102
            int r0 = r8.getActionMasked()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r4) goto L8e
            r3 = 5
            if (r0 == r3) goto L72
            r3 = 6
            if (r0 == r3) goto L8e
            goto L106
        L72:
            float r0 = r8.getX(r1)
            float r3 = r8.getX(r4)
            float r3 = r3 + r0
            float r3 = r3 / r2
            r7.W1 = r3
            float r0 = r8.getY(r1)
            float r1 = r8.getY(r4)
            float r1 = r1 + r0
            float r1 = r1 / r2
            r7.X1 = r1
            r7.Y1 = r4
            goto L106
        L8e:
            boolean r0 = r7.Y1
            if (r0 == 0) goto L106
            float r0 = r8.getX(r1)
            int r3 = r8.getPointerCount()
            if (r3 <= r4) goto La1
            float r3 = r8.getX(r4)
            goto La5
        La1:
            float r3 = r8.getX(r1)
        La5:
            float r0 = r0 + r3
            float r0 = r0 / r2
            float r3 = r8.getY(r1)
            int r5 = r8.getPointerCount()
            if (r5 <= r4) goto Lb6
            float r5 = r8.getY(r4)
            goto Lba
        Lb6:
            float r5 = r8.getY(r1)
        Lba:
            float r3 = r3 + r5
            float r3 = r3 / r2
            float r2 = r7.W1
            float r0 = r0 - r2
            float r2 = r7.X1
            float r3 = r3 - r2
            float r2 = java.lang.Math.abs(r0)
            r5 = 1127481344(0x43340000, float:180.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto Ld4
            float r2 = java.lang.Math.abs(r3)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lff
        Ld4:
            float r2 = java.lang.Math.abs(r0)
            float r6 = java.lang.Math.abs(r3)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            rv1 r6 = r7.m1
            if (r2 <= 0) goto Lee
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lea
            r6.d()
            goto Lff
        Lea:
            r6.f()
            goto Lff
        Lee:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lfc
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r6.R
            sz1 r0 = r0.W()
            r0.M0(r4)
            goto Lff
        Lfc:
            r6.e()
        Lff:
            r7.Y1 = r1
            goto L106
        L102:
            if (r0 == 0) goto L106
            r7.Y1 = r1
        L106:
            boolean r7 = super.dispatchTouchEvent(r8)
            return r7
    }

    public final defpackage.rj5 e0() {
            r2 = this;
            boolean r2 = r2.Y()
            if (r2 != 0) goto Lc
            rj5 r2 = new rj5
            r2.<init>()
            return r2
        Lc:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r2 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int[] r2 = r2.getRenderer3DDebugControls()
            if (r2 == 0) goto L21
            int r0 = r2.length
            r1 = 1
            if (r0 < r1) goto L21
            rj5 r0 = new rj5
            r1 = 0
            r2 = r2[r1]
            r0.<init>(r2)
            return r0
        L21:
            rj5 r2 = new rj5
            r2.<init>()
            return r2
    }

    public final boolean f0() {
            r2 = this;
            mm6 r0 = r2.P1
            java.lang.Object r0 = defpackage.gt0.R0(r0)
            ov1 r0 = (defpackage.ov1) r0
            boolean r1 = r0 instanceof defpackage.nv1
            if (r1 == 0) goto L28
            nv1 r0 = (defpackage.nv1) r0
            java.lang.String r0 = r0.a
            r1 = 2131952569(0x7f1303b9, float:1.9541584E38)
            java.lang.String r1 = r2.getString(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            sz1 r2 = r2.W()
            xz5 r0 = defpackage.xz5.ROM_SETTINGS
            r2.K0(r0)
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    public final void g0() {
            r3 = this;
            r3.M()
            ac r0 = r3.w1
            if (r0 == 0) goto La
            r0.dismiss()
        La:
            r0 = 0
            r3.w1 = r0
            ac r1 = r3.x1
            if (r1 == 0) goto L14
            r1.dismiss()
        L14:
            r3.x1 = r0
            ac r1 = r3.y1
            if (r1 == 0) goto L1d
            r1.dismiss()
        L1d:
            r3.y1 = r0
            ac r1 = r3.z1
            if (r1 == 0) goto L26
            r1.dismiss()
        L26:
            r3.z1 = r0
            ac r1 = r3.A1
            if (r1 == 0) goto L2f
            r1.dismiss()
        L2f:
            r3.A1 = r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r2 = r3.C1
            r2.setValue(r1)
            vs4 r2 = r3.D1
            r2.setValue(r1)
            vs4 r2 = r3.E1
            r2.setValue(r1)
            oq0 r1 = r3.T0
            if (r1 == 0) goto L49
            r1.a()
        L49:
            c92 r1 = r3.K0
            if (r1 == 0) goto L50
            r1.dismiss()     // Catch: java.lang.Throwable -> L50
        L50:
            r3.K0 = r0
            boolean r1 = r3.j1
            if (r1 != 0) goto L74
            om2 r1 = r3.S0
            if (r1 == 0) goto L74
            s8 r2 = r3.B0
            if (r2 == 0) goto L63
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r2 = r2.h
            r1.d(r2)
        L63:
            om2 r1 = r3.S0
            if (r1 == 0) goto L6e
            r1.stop()
            r0 = 1
            r3.j1 = r0
            goto L74
        L6e:
            java.lang.String r3 = "frameRenderCoordinator"
            defpackage.nb3.a0(r3)
            throw r0
        L74:
            return
    }

    public final java.lang.String h0() {
            r1 = this;
            boolean r0 = r1.h1
            if (r0 == 0) goto Lc
            r0 = 2131952358(0x7f1302e6, float:1.9541156E38)
        L7:
            java.lang.String r1 = r1.getString(r0)
            goto L10
        Lc:
            r0 = 2131952304(0x7f1302b0, float:1.9541047E38)
            goto L7
        L10:
            java.lang.String r0 = "Pause Emulation: "
            java.lang.String r1 = defpackage.i61.m(r0, r1)
            return r1
    }

    public final void i0() {
            r1 = this;
            mu4 r0 = r1.T1
            if (r0 == 0) goto La
            vs4 r1 = r1.F1
            r1.setValue(r0)
            return
        La:
            sz1 r1 = r1.W()
            r1.T0()
            return
    }

    public final void j0(int r5) {
            r4 = this;
            s8 r0 = r4.B0
            r1 = 0
            if (r0 == 0) goto L4d
            androidx.compose.ui.platform.ComposeView r0 = r0.d
            r2 = 0
            r0.setFocusable(r2)
            r0.setFocusableInTouchMode(r2)
            r3 = 262144(0x40000, float:3.67342E-40)
            r0.setDescendantFocusability(r3)
            int r3 = r0.getChildCount()
            if (r3 <= 0) goto L1b
            r3 = r0
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 == 0) goto L24
            android.view.View r2 = r3.getChildAt(r2)
            if (r2 != 0) goto L25
        L24:
            r2 = r0
        L25:
            r3 = 1
            r2.setFocusableInTouchMode(r3)
            boolean r3 = r2.requestFocusFromTouch()
            if (r3 != 0) goto L32
            r2.requestFocus()
        L32:
            android.view.View r2 = r0.findFocus()
            if (r2 == 0) goto L3b
            if (r2 == r0) goto L3b
            r1 = r2
        L3b:
            if (r1 != 0) goto L4c
            r1 = 12
            if (r5 >= r1) goto L4c
            om r1 = new om
            r2 = 3
            r1.<init>(r4, r5, r2)
            r4 = 32
            r0.postDelayed(r1, r4)
        L4c:
            return
        L4d:
            java.lang.String r4 = "binding"
            defpackage.nb3.a0(r4)
            throw r1
    }

    public final defpackage.qv1 k0() {
            r18 = this;
            r0 = r18
            s8 r1 = r0.B0
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 == 0) goto L1a1
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r1.m
            boolean r4 = r1.j0
            if (r4 == 0) goto L19
            nj3 r4 = defpackage.nj3.BOTTOM_SCREEN
            nj3 r5 = defpackage.nj3.TOP_SCREEN
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
            goto L22
        L19:
            nj3 r4 = defpackage.nj3.TOP_SCREEN
            nj3 r5 = defpackage.nj3.BOTTOM_SCREEN
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
        L22:
            java.lang.Object r4 = r6.A
            nj3 r4 = (defpackage.nj3) r4
            java.lang.Object r5 = r6.B
            nj3 r5 = (defpackage.nj3) r5
            zj3 r1 = r1.d(r4)
            s8 r4 = r0.B0
            if (r4 == 0) goto L19d
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r4 = r4.m
            zj3 r4 = r4.d(r5)
            s8 r5 = r0.B0
            if (r5 == 0) goto L199
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r2 = r5.m
            nj3 r5 = defpackage.nj3.HYBRID_SCREEN
            zj3 r2 = r2.d(r5)
            if (r2 == 0) goto L87
            me.magnum.melonds.domain.model.Rect r5 = r2.b()
            int r6 = r5.getHeight()
            int r6 = r6 / 2
            r7 = 1
            int r6 = java.lang.Math.max(r7, r6)
            int r8 = r5.getHeight()
            int r8 = r8 - r6
            int r7 = java.lang.Math.max(r7, r8)
            me.magnum.melonds.domain.model.Rect r8 = new me.magnum.melonds.domain.model.Rect
            int r9 = r5.getX()
            int r10 = r5.getY()
            int r11 = r5.getWidth()
            r8.<init>(r9, r10, r11, r6)
            me.magnum.melonds.domain.model.Rect r9 = new me.magnum.melonds.domain.model.Rect
            int r10 = r5.getX()
            int r11 = r5.getY()
            int r11 = r11 + r6
            int r5 = r5.getWidth()
            r9.<init>(r10, r11, r5, r7)
            vr4 r5 = new vr4
            r5.<init>(r8, r9)
            goto L8c
        L87:
            vr4 r5 = new vr4
            r5.<init>(r3, r3)
        L8c:
            java.lang.Object r6 = r5.A
            r14 = r6
            me.magnum.melonds.domain.model.Rect r14 = (me.magnum.melonds.domain.model.Rect) r14
            java.lang.Object r5 = r5.B
            r15 = r5
            me.magnum.melonds.domain.model.Rect r15 = (me.magnum.melonds.domain.model.Rect) r15
            if (r1 == 0) goto Laf
            me.magnum.melonds.domain.model.Rect r5 = r1.b()
            int r6 = r5.getWidth()
            if (r6 <= 0) goto La9
            int r6 = r5.getHeight()
            if (r6 <= 0) goto La9
            goto Laa
        La9:
            r5 = r3
        Laa:
            if (r5 != 0) goto Lad
            goto Laf
        Lad:
            r6 = r5
            goto Lb2
        Laf:
            me.magnum.melonds.domain.model.Rect r5 = r0.L0
            goto Lad
        Lb2:
            if (r4 == 0) goto Lc7
            me.magnum.melonds.domain.model.Rect r5 = r4.b()
            int r7 = r5.getWidth()
            if (r7 <= 0) goto Lc5
            int r7 = r5.getHeight()
            if (r7 <= 0) goto Lc5
            r3 = r5
        Lc5:
            if (r3 != 0) goto Lc9
        Lc7:
            me.magnum.melonds.domain.model.Rect r3 = r0.M0
        Lc9:
            java.lang.String r5 = defpackage.v15.b(r0)
            r13 = 0
            android.content.SharedPreferences r5 = r0.getSharedPreferences(r5, r13)
            java.lang.String r7 = "video_console_skin_enabled"
            boolean r5 = r5.getBoolean(r7, r13)
            if (r5 == 0) goto L143
            if (r6 == 0) goto L143
            if (r3 == 0) goto L143
            int r5 = r6.getX()
            int r7 = r3.getX()
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            r7 = 30
            if (r5 >= r7) goto L143
            int r5 = r6.getBottom()
            int r7 = r3.getY()
            int r7 = r7 + 16
            if (r5 > r7) goto L143
            android.content.res.Resources r5 = r0.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r7 = 1099956224(0x41900000, float:18.0)
            float r5 = r5 * r7
            int r5 = (int) r5
            int r7 = r3.getY()
            int r8 = r6.getBottom()
            int r7 = r7 - r8
            if (r7 >= 0) goto L115
            r7 = r13
        L115:
            if (r7 >= r5) goto L143
            int r5 = r5 - r7
            int r7 = r5 / 2
            int r5 = r5 - r7
            int r8 = r6.getY()
            int r8 = r8 - r7
            if (r8 >= 0) goto L123
            r8 = r13
        L123:
            int r7 = r3.getY()
            int r5 = r5 + r7
            r11 = 13
            r12 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            me.magnum.melonds.domain.model.Rect r6 = me.magnum.melonds.domain.model.Rect.copy$default(r6, r7, r8, r9, r10, r11, r12)
            r12 = 13
            r7 = r13
            r13 = 0
            r8 = 0
            r11 = 0
            r9 = r7
            r7 = r3
            r3 = r9
            r9 = r5
            me.magnum.melonds.domain.model.Rect r5 = me.magnum.melonds.domain.model.Rect.copy$default(r7, r8, r9, r10, r11, r12, r13)
            r9 = r5
        L141:
            r8 = r6
            goto L147
        L143:
            r7 = r3
            r3 = r13
            r9 = r7
            goto L141
        L147:
            if (r8 == 0) goto L157
            int r5 = r8.getWidth()
            if (r5 <= 0) goto L157
            int r5 = r8.getHeight()
            if (r5 <= 0) goto L157
            r0.L0 = r8
        L157:
            if (r9 == 0) goto L167
            int r5 = r9.getWidth()
            if (r5 <= 0) goto L167
            int r5 = r9.getHeight()
            if (r5 <= 0) goto L167
            r0.M0 = r9
        L167:
            qv1 r7 = new qv1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L171
            float r5 = r1.c
            r10 = r5
            goto L172
        L171:
            r10 = r0
        L172:
            if (r4 == 0) goto L178
            float r5 = r4.c
            r11 = r5
            goto L179
        L178:
            r11 = r0
        L179:
            if (r1 == 0) goto L17f
            boolean r13 = r1.d
            r12 = r13
            goto L180
        L17f:
            r12 = r3
        L180:
            if (r4 == 0) goto L185
            boolean r13 = r4.d
            goto L186
        L185:
            r13 = r3
        L186:
            if (r2 == 0) goto L18a
            float r0 = r2.c
        L18a:
            r16 = r0
            if (r2 == 0) goto L193
            boolean r0 = r2.d
            r17 = r0
            goto L195
        L193:
            r17 = r3
        L195:
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        L199:
            defpackage.nb3.a0(r2)
            throw r3
        L19d:
            defpackage.nb3.a0(r2)
            throw r3
        L1a1:
            defpackage.nb3.a0(r2)
            throw r3
    }

    public final defpackage.vr4 l0() {
            r5 = this;
            bh5 r0 = new bh5
            r0.<init>()
            bh5 r1 = new bh5
            r1.<init>()
            qv1 r5 = r5.k0()     // Catch: java.lang.Throwable -> L28
            float r2 = r5.i     // Catch: java.lang.Throwable -> L28
            me.magnum.melonds.domain.model.Rect r3 = r5.a     // Catch: java.lang.Throwable -> L28
            float r4 = r5.c     // Catch: java.lang.Throwable -> L28
            m0(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L28
            me.magnum.melonds.domain.model.Rect r3 = r5.b     // Catch: java.lang.Throwable -> L28
            float r4 = r5.d     // Catch: java.lang.Throwable -> L28
            m0(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L28
            me.magnum.melonds.domain.model.Rect r3 = r5.g     // Catch: java.lang.Throwable -> L28
            m0(r0, r1, r3, r2)     // Catch: java.lang.Throwable -> L28
            me.magnum.melonds.domain.model.Rect r5 = r5.h     // Catch: java.lang.Throwable -> L28
            m0(r0, r1, r5, r2)     // Catch: java.lang.Throwable -> L28
        L28:
            int r5 = r0.A
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = r1.A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            vr4 r1 = new vr4
            r1.<init>(r5, r0)
            return r1
    }

    public final void o0() {
            r2 = this;
            r2.M()
            boolean r0 = r2.i1
            if (r0 == 0) goto L8
            goto Le
        L8:
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r0 = r2.e1
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.VULKAN
            if (r0 == r1) goto Lf
        Le:
            return
        Lf:
            r0 = 0
            r2.g1 = r0
            me.magnum.melonds.ui.emulator.b r0 = new me.magnum.melonds.ui.emulator.b
            r0.<init>(r2)
            r2.f1 = r0
            android.os.Handler r2 = r2.N0
            if (r2 == 0) goto L21
            r2.post(r0)
            return
        L21:
            java.lang.String r2 = "handler"
            defpackage.nb3.a0(r2)
            r2 = 0
            throw r2
    }

    @Override // defpackage.jq, defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            r3.getClass()
            super.onConfigurationChanged(r3)
            r0 = 0
            r2.L0 = r0
            r2.M0 = r0
            int r3 = r3.orientation
            r1 = 1
            if (r3 != r1) goto L13
            ko4 r3 = defpackage.ko4.PORTRAIT
            goto L15
        L13:
            ko4 r3 = defpackage.ko4.LANDSCAPE
        L15:
            sz1 r1 = r2.W()
            r1.getClass()
            r3.getClass()
            ci0 r1 = r1.u
            java.lang.Object r1 = r1.d
            tp6 r1 = (defpackage.tp6) r1
            r1.getClass()
            r1.m(r0, r3)
            android.os.Handler r3 = r2.N0
            if (r3 == 0) goto L3a
            yu1 r0 = new yu1
            r1 = 11
            r0.<init>(r2, r1)
            r3.post(r0)
            return
        L3a:
            java.lang.String r2 = "handler"
            defpackage.nb3.a0(r2)
            throw r0
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r23) {
            r22 = this;
            r0 = r22
            super.onCreate(r23)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r0.getMainLooper()
            r1.<init>(r2)
            r0.N0 = r1
            kd6 r1 = r0.I0
            r2 = 0
            if (r1 == 0) goto L4a8
            ng6 r1 = (defpackage.ng6) r1
            u82 r1 = r1.m()
            r0.l1 = r1
            iu3 r1 = r0.G0
            if (r1 == 0) goto L4a2
            r1.a = r0
            mf5 r3 = new mf5
            r4 = 3
            r3.<init>(r1, r4)
            ku3 r1 = r0.A
            r1.a(r3)
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r3 = 2131623964(0x7f0e001c, float:1.8875094E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r3, r2, r5)
            r3 = 2131427657(0x7f0b0149, float:1.8476936E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r9 = r6
            androidx.compose.ui.platform.ComposeView r9 = (androidx.compose.ui.platform.ComposeView) r9
            if (r9 == 0) goto L490
            r3 = 2131427661(0x7f0b014d, float:1.8476945E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r10 = r6
            androidx.compose.ui.platform.ComposeView r10 = (androidx.compose.ui.platform.ComposeView) r10
            if (r10 == 0) goto L490
            r3 = 2131427665(0x7f0b0151, float:1.8476953E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r11 = r6
            androidx.compose.ui.platform.ComposeView r11 = (androidx.compose.ui.platform.ComposeView) r11
            if (r11 == 0) goto L490
            r3 = 2131427666(0x7f0b0152, float:1.8476955E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r12 = r6
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            if (r12 == 0) goto L490
            r8 = r1
            androidx.constraintlayout.motion.widget.MotionLayout r8 = (androidx.constraintlayout.motion.widget.MotionLayout) r8
            r3 = 2131427685(0x7f0b0165, float:1.8476993E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r13 = r6
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            if (r13 == 0) goto L490
            r3 = 2131427815(0x7f0b01e7, float:1.8477257E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r14 = r6
            android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
            if (r14 == 0) goto L490
            r3 = 2131427927(0x7f0b0257, float:1.8477484E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r15 = r6
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r15 = (me.magnum.melonds.ui.emulator.EmulatorSurfaceView) r15
            if (r15 == 0) goto L490
            r3 = 2131427967(0x7f0b027f, float:1.8477565E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r16 = r6
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L490
            r3 = 2131427968(0x7f0b0280, float:1.8477567E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r17 = r6
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L490
            r3 = 2131427969(0x7f0b0281, float:1.847757E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r18 = r6
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L490
            r3 = 2131427971(0x7f0b0283, float:1.8477573E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r19 = r6
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L490
            r3 = 2131428068(0x7f0b02e4, float:1.847777E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r20 = r6
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r20 = (me.magnum.melonds.ui.emulator.RuntimeLayoutView) r20
            if (r20 == 0) goto L490
            r3 = 2131428074(0x7f0b02ea, float:1.8477782E38)
            android.view.View r6 = defpackage.gi2.B(r1, r3)
            r21 = r6
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r21 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView) r21
            if (r21 == 0) goto L490
            s8 r7 = new s8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.B0 = r7
            tq r1 = r0.v()
            r3 = 1
            r1.i(r3)
            s8 r1 = r0.B0
            java.lang.String r6 = "binding"
            if (r1 == 0) goto L48c
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r1.a
            r0.setContentView(r1)
            android.view.Window r1 = r0.getWindow()
            r1.getClass()
            android.view.View r7 = r1.getDecorView()
            s35 r8 = new s35
            r8.<init>(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 35
            if (r7 < r9) goto L115
            av7 r9 = new av7
            r9.<init>(r1, r8)
            goto L12e
        L115:
            r9 = 30
            if (r7 < r9) goto L11f
            zu7 r9 = new zu7
            r9.<init>(r1, r8)
            goto L12e
        L11f:
            r9 = 26
            if (r7 < r9) goto L129
            xu7 r9 = new xu7
            r9.<init>(r1, r8)
            goto L12e
        L129:
            wu7 r9 = new wu7
            r9.<init>(r1, r8)
        L12e:
            r1 = 2
            r9.a(r1)
            r9.e()
            s8 r8 = r0.B0
            if (r8 == 0) goto L488
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r8.a
            h61 r9 = new h61
            r10 = 7
            r9.<init>(r0, r10)
            java.util.WeakHashMap r11 = defpackage.ao7.a
            defpackage.sn7.c(r8, r9)
            il4 r8 = r0.b()
            d00 r9 = r0.v1
            r8.b(r9)
            s9 r8 = new s9
            d51 r9 = new d51
            r11 = 18
            r9.<init>(r0, r11)
            r8.<init>(r0, r9)
            r0.Q0 = r8
            bt r8 = new bt
            au3 r9 = defpackage.bl2.C(r0)
            lz0 r11 = r0.P0
            r8.<init>(r0, r9, r11)
            r0.R0 = r8
            sz1 r8 = r0.W()
            kd6 r8 = r8.c
            ng6 r8 = (defpackage.ng6) r8
            me.magnum.melonds.domain.model.VideoRenderer r8 = r8.e()
            me.magnum.melonds.domain.model.VideoRenderer r9 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r8 != r9) goto L17d
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r8 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.VULKAN
            goto L17f
        L17d:
            me.magnum.melonds.ui.emulator.EmulatorActivity$a r8 = me.magnum.melonds.ui.emulator.EmulatorActivity.a.OPEN_GL
        L17f:
            r0.e1 = r8
            om2 r8 = r0.O(r8)
            r0.S0 = r8
            r9 = 33
            if (r7 < r9) goto L191
            qq0 r7 = new qq0
            r7.<init>(r8)
            goto L196
        L191:
            pq0 r7 = new pq0
            r7.<init>(r8)
        L196:
            r0.T0 = r7
            q33 r7 = new q33
            r7.<init>()
            r0.V0 = r7
            c91 r7 = new c91
            r7.<init>(r0)
            r0.U0 = r7
            s8 r8 = r0.B0
            if (r8 == 0) goto L484
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r8 = r8.h
            r8.setRenderer(r7)
            s8 r7 = r0.B0
            if (r7 == 0) goto L480
            android.widget.TextView r7 = r7.i
            r8 = 4
            r7.setVisibility(r8)
            s8 r7 = r0.B0
            if (r7 == 0) goto L47c
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r7 = r7.m
            wb1 r8 = new wb1
            r9 = 8
            r8.<init>(r9, r5)
            r7.setLayoutComponentViewBuilderFactory(r8)
            s8 r7 = r0.B0
            if (r7 == 0) goto L478
            android.widget.RelativeLayout r7 = r7.e
            tu1 r8 = new tu1
            r8.<init>(r0, r3)
            r7.setOnClickListener(r8)
            s8 r7 = r0.B0
            if (r7 == 0) goto L474
            androidx.recyclerview.widget.RecyclerView r7 = r7.f
            androidx.recyclerview.widget.LinearLayoutManager r8 = new androidx.recyclerview.widget.LinearLayoutManager
            r7.getContext()
            r8.<init>(r5, r3)
            r7.setLayoutManager(r8)
            rr1 r8 = new rr1
            r8.<init>()
            r7.i(r8)
            wp5 r8 = r0.B1
            r7.setAdapter(r8)
            s8 r7 = r0.B0
            if (r7 == 0) goto L470
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r7 = r7.m
            rv1 r8 = r0.m1
            r7.setFrontendInputHandler(r8)
            q33 r8 = r0.V0
            if (r8 == 0) goto L46a
            r7.setSystemInputHandler(r8)
            hq2 r7 = r0.V()
            s8 r8 = r0.B0
            if (r8 == 0) goto L466
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r8 = r8.n
            r7.getClass()
            r7.l = r8
            r7.i()
            xp2 r11 = new xp2
            r11.<init>(r7, r5)
            r8.setOnTriggerTranslationRequested(r11)
            xp2 r11 = new xp2
            r12 = 5
            r11.<init>(r7, r12)
            r8.setOnFloatingButtonLongClickListener(r11)
            zp2 r11 = new zp2
            r11.<init>(r7, r5)
            r8.setOnLassoRegionSelected(r11)
            zp2 r11 = new zp2
            r11.<init>(r7, r3)
            r8.setOnSpeakWordRequested(r11)
            xp2 r11 = new xp2
            r13 = 6
            r11.<init>(r7, r13)
            r8.setOnDismissRequested(r11)
            zp2 r11 = new zp2
            r11.<init>(r7, r1)
            r8.setOnRegionsSaved(r11)
            android.content.SharedPreferences r11 = r7.f
            java.lang.String r13 = "translator_enabled"
            boolean r11 = r11.getBoolean(r13, r5)
            if (r11 == 0) goto L25c
            r8.setVisibility(r5)
            r7.h()
            goto L268
        L25c:
            r8.setVisibility(r9)
            ap6 r8 = r7.m
            if (r8 == 0) goto L266
            r8.h(r2)
        L266:
            r7.m = r2
        L268:
            hq2 r7 = r0.V()
            pu1 r8 = new pu1
            r8.<init>(r0, r3)
            r7.q = r8
            al0 r7 = new al0
            r7.<init>(r0, r3)
            s8 r8 = r0.B0
            if (r8 == 0) goto L462
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r8 = r8.m
            r8.addOnLayoutChangeListener(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            r7.getClass()
            int r7 = r7.orientation
            if (r7 != r3) goto L293
            ko4 r7 = defpackage.ko4.PORTRAIT
            goto L295
        L293:
            ko4 r7 = defpackage.ko4.LANDSCAPE
        L295:
            sz1 r8 = r0.W()
            r8.getClass()
            r7.getClass()
            ci0 r8 = r8.u
            java.lang.Object r8 = r8.d
            tp6 r8 = (defpackage.tp6) r8
            r8.getClass()
            r8.m(r2, r7)
            android.view.Window r7 = r0.getWindow()
            r8 = 128(0x80, float:1.8E-43)
            r7.addFlags(r8)
            java.lang.String r7 = defpackage.v15.b(r0)
            android.content.SharedPreferences r7 = r0.getSharedPreferences(r7, r5)
            java.lang.String r8 = "video_console_skin_enabled"
            boolean r7 = r7.getBoolean(r8, r5)
            java.lang.String r8 = defpackage.v15.b(r0)
            android.content.SharedPreferences r8 = r0.getSharedPreferences(r8, r5)
            java.lang.String r11 = "video_console_skin_type"
            java.lang.String r13 = "ds_lite_black"
            java.lang.String r8 = r8.getString(r11, r13)
            if (r8 != 0) goto L2d5
            goto L2d6
        L2d5:
            r13 = r8
        L2d6:
            s8 r8 = r0.B0
            r11 = 13
            if (r7 == 0) goto L31c
            if (r8 == 0) goto L318
            androidx.compose.ui.platform.ComposeView r7 = r8.c
            r7.setVisibility(r5)
            s8 r7 = r0.B0
            if (r7 == 0) goto L314
            androidx.compose.ui.platform.ComposeView r7 = r7.c
            r7.setClickable(r5)
            s8 r7 = r0.B0
            if (r7 == 0) goto L310
            androidx.compose.ui.platform.ComposeView r7 = r7.c
            r7.setFocusable(r5)
            s8 r5 = r0.B0
            if (r5 == 0) goto L30c
            androidx.compose.ui.platform.ComposeView r5 = r5.c
            ql1 r7 = new ql1
            r7.<init>(r11, r0, r13)
            zv0 r8 = new zv0
            r9 = 798279560(0x2f94c788, float:2.706282E-10)
            r8.<init>(r9, r3, r7)
            r5.setContent(r8)
            goto L323
        L30c:
            defpackage.nb3.a0(r6)
            throw r2
        L310:
            defpackage.nb3.a0(r6)
            throw r2
        L314:
            defpackage.nb3.a0(r6)
            throw r2
        L318:
            defpackage.nb3.a0(r6)
            throw r2
        L31c:
            if (r8 == 0) goto L45e
            androidx.compose.ui.platform.ComposeView r5 = r8.c
            r5.setVisibility(r9)
        L323:
            s8 r5 = r0.B0
            if (r5 == 0) goto L45a
            androidx.compose.ui.platform.ComposeView r5 = r5.b
            cv1 r7 = new cv1
            r7.<init>(r0, r3)
            zv0 r8 = new zv0
            r9 = 553795587(0x21024003, float:4.413043E-19)
            r8.<init>(r9, r3, r7)
            r5.setContent(r8)
            s8 r5 = r0.B0
            if (r5 == 0) goto L456
            androidx.compose.ui.platform.ComposeView r5 = r5.d
            cv1 r7 = new cv1
            r7.<init>(r0, r1)
            zv0 r1 = new zv0
            r8 = 47377708(0x2d2ed2c, float:3.0992857E-37)
            r1.<init>(r8, r3, r7)
            r5.setContent(r1)
            s8 r1 = r0.B0
            if (r1 == 0) goto L452
            androidx.compose.ui.platform.ComposeView r1 = r1.d
            r1.setFocusable(r3)
            s8 r1 = r0.B0
            if (r1 == 0) goto L44e
            androidx.compose.ui.platform.ComposeView r1 = r1.d
            r1.setFocusableInTouchMode(r3)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r5.<init>(r0, r2, r3)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r5.<init>(r0, r2, r4)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r5.<init>(r0, r2, r12)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r5.<init>(r0, r2, r10)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 9
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 11
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r5.<init>(r0, r2, r11)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 15
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 17
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 19
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 21
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 23
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 25
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 27
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            tv1 r5 = new tv1
            r6 = 29
            r5.<init>(r0, r2, r6)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            wv1 r5 = new wv1
            r5.<init>(r0, r2, r3)
            defpackage.hv.L(r1, r2, r2, r5, r4)
            au3 r1 = defpackage.bl2.C(r0)
            wv1 r3 = new wv1
            r3.<init>(r0, r2, r4)
            defpackage.hv.L(r1, r2, r2, r3, r4)
            au3 r1 = defpackage.bl2.C(r0)
            wv1 r3 = new wv1
            r3.<init>(r0, r2, r12)
            defpackage.hv.L(r1, r2, r2, r3, r4)
            return
        L44e:
            defpackage.nb3.a0(r6)
            throw r2
        L452:
            defpackage.nb3.a0(r6)
            throw r2
        L456:
            defpackage.nb3.a0(r6)
            throw r2
        L45a:
            defpackage.nb3.a0(r6)
            throw r2
        L45e:
            defpackage.nb3.a0(r6)
            throw r2
        L462:
            defpackage.nb3.a0(r6)
            throw r2
        L466:
            defpackage.nb3.a0(r6)
            throw r2
        L46a:
            java.lang.String r0 = "melonTouchHandler"
            defpackage.nb3.a0(r0)
            throw r2
        L470:
            defpackage.nb3.a0(r6)
            throw r2
        L474:
            defpackage.nb3.a0(r6)
            throw r2
        L478:
            defpackage.nb3.a0(r6)
            throw r2
        L47c:
            defpackage.nb3.a0(r6)
            throw r2
        L480:
            defpackage.nb3.a0(r6)
            throw r2
        L484:
            defpackage.nb3.a0(r6)
            throw r2
        L488:
            defpackage.nb3.a0(r6)
            throw r2
        L48c:
            defpackage.nb3.a0(r6)
            throw r2
        L490:
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.u34.x(r0)
            return
        L4a2:
            java.lang.String r0 = "lifecycleOwnerProvider"
            defpackage.nb3.a0(r0)
            throw r2
        L4a8:
            java.lang.String r0 = "settingsRepository"
            defpackage.nb3.a0(r0)
            throw r2
    }

    @Override // defpackage.sx2, defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
            r4 = this;
            super.onDestroy()
            hq2 r0 = r4.V()
            ap6 r1 = r0.m
            r2 = 0
            if (r1 == 0) goto Lf
            r1.h(r2)
        Lf:
            r0.m = r2
            qq2 r1 = r0.p
            r1.getClass()
            android.media.MediaPlayer r3 = r1.g     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L1d
            r3.stop()     // Catch: java.lang.Throwable -> L36
        L1d:
            android.media.MediaPlayer r3 = r1.g     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L24
            r3.release()     // Catch: java.lang.Throwable -> L36
        L24:
            r1.g = r2     // Catch: java.lang.Throwable -> L36
            android.speech.tts.TextToSpeech r3 = r1.c     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L2d
            r3.stop()     // Catch: java.lang.Throwable -> L36
        L2d:
            android.speech.tts.TextToSpeech r3 = r1.c     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L34
            r3.shutdown()     // Catch: java.lang.Throwable -> L36
        L34:
            r1.c = r2     // Catch: java.lang.Throwable -> L36
        L36:
            o41 r1 = r0.j
            defpackage.g04.x(r1, r2)
            ci r0 = r0.i
            r1 = 0
            r0.B = r1
            boolean r3 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            java.lang.Object r0 = r0.L
            android.app.Activity r0 = (android.app.Activity) r0
            me.magnum.melonds.translator.capture.ScreenCaptureService.B = r1
            me.magnum.melonds.translator.capture.ScreenCaptureService.L = r2
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.translator.capture.ScreenCaptureService> r2 = me.magnum.melonds.translator.capture.ScreenCaptureService.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "me.magnum.melonds.translator.STOP_CAPTURE"
            r1.setAction(r2)
            r0.stopService(r1)
            r4.g0()
            return
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onNewIntent(android.content.Intent r7) {
            r6 = this;
            r7.getClass()
            super.onNewIntent(r7)
            android.os.Bundle r0 = r7.getExtras()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r2 = "boot_firmware_only"
            boolean r2 = r0.getBoolean(r2)
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            java.lang.String r2 = "boot_firmware_console"
            r5 = -1
            int r0 = r0.getInt(r2, r5)
            if (r0 != r5) goto L24
            goto La9
        L24:
            t52 r2 = me.magnum.melonds.domain.model.ConsoleType.getEntries()
            u52 r2 = (defpackage.u52) r2
            java.lang.Object r0 = r2.get(r0)
            me.magnum.melonds.domain.model.ConsoleType r0 = (me.magnum.melonds.domain.model.ConsoleType) r0
            bj3 r4 = new bj3
            r4.<init>(r0)
            goto La9
        L37:
            if (r0 == 0) goto L46
            java.lang.String r2 = "rom"
            java.lang.Class<wz5> r5 = defpackage.wz5.class
            java.lang.Object r2 = defpackage.nc1.R(r0, r2, r5)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            wz5 r2 = (defpackage.wz5) r2
            goto L47
        L46:
            r2 = r4
        L47:
            if (r2 == 0) goto L4c
            pq5 r5 = r2.A
            goto L4d
        L4c:
            r5 = r4
        L4d:
            if (r5 == 0) goto L57
            cj3 r4 = new cj3
            pq5 r0 = r2.A
            r4.<init>(r0)
            goto La9
        L57:
            android.net.Uri r2 = r7.getData()
            if (r2 == 0) goto L6a
            ej3 r4 = new ej3
            android.net.Uri r0 = r7.getData()
            r0.getClass()
            r4.<init>(r0)
            goto La9
        L6a:
            if (r0 == 0) goto L81
            java.lang.String r2 = "PATH"
            boolean r5 = r0.containsKey(r2)
            if (r5 != r3) goto L81
            java.lang.String r0 = r0.getString(r2)
            r0.getClass()
            dj3 r4 = new dj3
            r4.<init>(r0)
            goto La9
        L81:
            if (r0 == 0) goto La9
            java.lang.String r2 = "uri"
            boolean r5 = r0.containsKey(r2)
            if (r5 != r3) goto La9
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L9a
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto La2
        L9a:
            boolean r2 = r0 instanceof android.net.Uri
            if (r2 == 0) goto La1
            android.net.Uri r0 = (android.net.Uri) r0
            goto La2
        La1:
            r0 = r4
        La2:
            if (r0 == 0) goto La9
            ej3 r4 = new ej3
            r4.<init>(r0)
        La9:
            if (r4 != 0) goto Lac
            goto L110
        Lac:
            sz1 r0 = r6.W()
            de5 r0 = r0.q0
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            hy1 r0 = (defpackage.hy1) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L110
            sz1 r0 = r6.W()
            r0.M0(r1)
            bt r0 = r6.V1
            ex1 r2 = defpackage.ex1.SWITCH_NEW_ROM_DIALOG
            r0.z(r2)
            zb r0 = new zb
            r0.<init>(r6)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            r5 = 2131952722(0x7f130452, float:1.9541895E38)
            java.lang.String r5 = r6.getString(r5)
            r2.d = r5
            r5 = 2131952209(0x7f130251, float:1.9540854E38)
            java.lang.String r5 = r6.getString(r5)
            r2.f = r5
            qu1 r5 = new qu1
            r5.<init>(r6, r7, r4, r1)
            r7 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r0.y(r7, r5)
            qo0 r7 = new qo0
            r7.<init>(r3)
            r1 = 2131952291(0x7f1302a3, float:1.954102E38)
            r0.x(r1, r7)
            ku1 r7 = new ku1
            r7.<init>(r6, r3)
            r2.o = r7
            lu1 r7 = new lu1
            r7.<init>(r6, r3)
            r2.n = r7
            r0.B()
        L110:
            return
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
            r4 = this;
            super.onPause()
            e84 r0 = r4.U()
            boolean r1 = r0.k
            r2 = 0
            if (r1 == 0) goto L39
            android.hardware.SensorManager r1 = r0.h
            if (r1 != 0) goto L11
            goto L39
        L11:
            r1.unregisterListener(r0)
            r0.k = r2
            boolean r1 = r0.w
            if (r1 == 0) goto L21
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            r1.onScreenRelease()
            r0.w = r2
        L21:
            boolean r1 = r0.x
            if (r1 == 0) goto L27
            r0.x = r2
        L27:
            boolean r1 = r0.y
            if (r1 == 0) goto L2d
            r0.y = r2
        L2d:
            boolean r1 = r0.z
            if (r1 == 0) goto L33
            r0.z = r2
        L33:
            boolean r1 = r0.A
            if (r1 == 0) goto L39
            r0.A = r2
        L39:
            r4.M()
            g15 r0 = r4.a1
            r1 = 0
            if (r0 == 0) goto L4f
            android.os.Handler r3 = r4.N0
            if (r3 == 0) goto L49
            r3.removeCallbacks(r0)
            goto L4f
        L49:
            java.lang.String r4 = "handler"
            defpackage.nb3.a0(r4)
            throw r1
        L4f:
            r4.a1 = r1
            rv1 r0 = r4.m1
            boolean r3 = r0.B
            if (r3 != 0) goto L58
            goto L5d
        L58:
            r0.B = r2
            r0.g()
        L5d:
            android.view.Window r0 = r4.getWindow()
            r3 = 128(0x80, float:1.8E-43)
            r0.clearFlags(r3)
            oq0 r0 = r4.T0
            if (r0 == 0) goto L7f
            r0.a()
            boolean r0 = r4.i1
            if (r0 != 0) goto L7e
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L7e
            sz1 r4 = r4.W()
            r4.M0(r2)
        L7e:
            return
        L7f:
            java.lang.String r4 = "choreographerFrameRenderer"
            defpackage.nb3.a0(r4)
            throw r1
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
            r8 = this;
            super.onResume()
            r8.r0()
            r8.p0()
            r8.q0()
            oq0 r0 = r8.T0
            r1 = 0
            if (r0 == 0) goto L13a
            r0.b()
            g15 r0 = r8.a1
            java.lang.String r2 = "handler"
            if (r0 == 0) goto L26
            android.os.Handler r3 = r8.N0
            if (r3 == 0) goto L22
            r3.removeCallbacks(r0)
            goto L26
        L22:
            defpackage.nb3.a0(r2)
            throw r1
        L26:
            g15 r0 = new g15
            r3 = 7
            r0.<init>(r8, r3)
            r8.a1 = r0
            android.os.Handler r3 = r8.N0
            if (r3 == 0) goto L136
            r1 = 1500(0x5dc, double:7.41E-321)
            r3.postDelayed(r0, r1)
            hq2 r0 = r8.V()
            r0.i()
            java.lang.String r0 = defpackage.v15.b(r8)
            r1 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = "pref_motion_gyro_enabled"
            r3 = 1
            boolean r2 = r0.getBoolean(r2, r3)
            if (r2 == 0) goto Lf3
            java.lang.String r2 = "pref_motion_gyro_mode"
            java.lang.String r4 = "touch_aim"
            java.lang.String r2 = r0.getString(r2, r4)
            e84 r5 = r8.U()
            if (r2 == 0) goto L94
            int r6 = r2.hashCode()
            r7 = -145771109(0xfffffffff74fb59b, float:-4.212847E33)
            if (r6 == r7) goto L88
            r7 = -108455103(0xfffffffff9891b41, float:-8.898718E34)
            if (r6 == r7) goto L7c
            r7 = 364105797(0x15b3d045, float:7.2626116E-26)
            if (r6 == r7) goto L72
            goto L94
        L72:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L79
            goto L94
        L79:
            c84 r2 = defpackage.c84.TOUCH_AIM
            goto L96
        L7c:
            java.lang.String r4 = "dpad_steer"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L85
            goto L94
        L85:
            c84 r2 = defpackage.c84.DPAD_STEER
            goto L96
        L88:
            java.lang.String r4 = "slot2_analog"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L91
            goto L94
        L91:
            c84 r2 = defpackage.c84.SLOT2_ANALOG
            goto L96
        L94:
            c84 r2 = defpackage.c84.OFF
        L96:
            r5.getClass()
            r2.getClass()
            r5.a = r2
            e84 r2 = r8.U()
            java.lang.String r4 = "pref_motion_gyro_sensitivity_x"
            r5 = 125(0x7d, float:1.75E-43)
            int r4 = r0.getInt(r4, r5)
            float r4 = (float) r4
            r6 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r6
            r2.b = r4
            e84 r2 = r8.U()
            java.lang.String r4 = "pref_motion_gyro_sensitivity_y"
            int r4 = r0.getInt(r4, r5)
            float r4 = (float) r4
            float r4 = r4 / r6
            r2.c = r4
            e84 r2 = r8.U()
            java.lang.String r4 = "pref_motion_gyro_invert_x"
            boolean r4 = r0.getBoolean(r4, r1)
            r2.d = r4
            e84 r2 = r8.U()
            java.lang.String r4 = "pref_motion_gyro_invert_y"
            boolean r0 = r0.getBoolean(r4, r1)
            r2.e = r0
            e84 r0 = r8.U()
            android.hardware.SensorManager r1 = r0.h
            boolean r2 = r0.k
            if (r2 != 0) goto Lf3
            if (r1 != 0) goto Le3
            goto Lf3
        Le3:
            android.hardware.Sensor r2 = r0.i
            if (r2 == 0) goto Lea
            r1.registerListener(r0, r2, r3)
        Lea:
            android.hardware.Sensor r2 = r0.j
            if (r2 == 0) goto Lf1
            r1.registerListener(r0, r2, r3)
        Lf1:
            r0.k = r3
        Lf3:
            bt r0 = r8.V1
            boolean r0 = r0.M()
            if (r0 != 0) goto L135
            sz1 r0 = r8.W()
            java.util.concurrent.atomic.AtomicInteger r1 = r0.j0
            int r1 = r1.get()
            if (r1 != 0) goto L135
            eb r1 = r0.h0
            java.lang.Object r1 = r1.R
            tp6 r1 = (defpackage.tp6) r1
            java.lang.Object r1 = r1.getValue()
            uc5 r2 = defpackage.uc5.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L135
            s35 r0 = r0.V
            java.lang.Object r0 = r0.A
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            if (r0 != 0) goto L135
            android.view.Window r0 = r8.getWindow()
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
            sz1 r8 = r8.W()
            r8.T0()
        L135:
            return
        L136:
            defpackage.nb3.a0(r2)
            throw r1
        L13a:
            java.lang.String r8 = "choreographerFrameRenderer"
            defpackage.nb3.a0(r8)
            throw r1
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
            r9 = this;
            super.onStart()
            boolean r0 = r9.i1
            if (r0 == 0) goto L8
            return
        L8:
            r9.R0()
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r0 = r9.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            r1 = 0
            if (r0 == 0) goto L1b
            zk1 r2 = r9.O0
            r0.registerDisplayListener(r2, r1)
        L1b:
            java.lang.Class<android.hardware.input.InputManager> r0 = android.hardware.input.InputManager.class
            java.lang.Object r0 = r9.getSystemService(r0)
            android.hardware.input.InputManager r0 = (android.hardware.input.InputManager) r0
            lz0 r2 = r9.P0
            if (r0 == 0) goto L2a
            r0.registerInputDeviceListener(r2, r1)
        L2a:
            o41 r0 = r2.a
            if (r0 == 0) goto L31
            defpackage.g04.x(r0, r1)
        L31:
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            jv2 r0 = r0.Y
            o41 r0 = defpackage.g04.i(r0)
            a6 r3 = new a6
            r4 = 11
            r3.<init>(r2, r1, r4)
            r4 = 3
            defpackage.hv.L(r0, r1, r1, r3, r4)
            r2.a = r0
            tp6 r0 = r2.c
        L4a:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r4 = android.view.InputDevice.getDeviceIds()
            r4.getClass()
            int r5 = r4.length
            r6 = 0
        L5f:
            if (r6 >= r5) goto L75
            r7 = r4[r6]
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            if (r7 == 0) goto L72
            boolean r8 = defpackage.lz0.a(r7)
            if (r8 == 0) goto L72
            r3.add(r7)
        L72:
            int r6 = r6 + 1
            goto L5f
        L75:
            boolean r2 = r0.j(r2, r3)
            if (r2 == 0) goto L4a
            om2 r0 = r9.S0
            if (r0 == 0) goto L8f
            s8 r9 = r9.B0
            if (r9 == 0) goto L89
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r9 = r9.h
            r0.c(r9)
            return
        L89:
            java.lang.String r9 = "binding"
            defpackage.nb3.a0(r9)
            throw r1
        L8f:
            java.lang.String r9 = "frameRenderCoordinator"
            defpackage.nb3.a0(r9)
            throw r1
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
            r3 = this;
            super.onStop()
            r3.M()
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L15
            zk1 r1 = r3.O0
            r0.unregisterDisplayListener(r1)
        L15:
            java.lang.Class<android.hardware.input.InputManager> r0 = android.hardware.input.InputManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.hardware.input.InputManager r0 = (android.hardware.input.InputManager) r0
            lz0 r1 = r3.P0
            if (r0 == 0) goto L24
            r0.unregisterInputDeviceListener(r1)
        L24:
            o41 r0 = r1.a
            r2 = 0
            if (r0 == 0) goto L2c
            defpackage.g04.x(r0, r2)
        L2c:
            tp6 r0 = r1.c
            r0.getClass()
            yt1 r1 = defpackage.yt1.A
            r0.m(r2, r1)
            boolean r0 = r3.j1
            if (r0 != 0) goto L54
            om2 r0 = r3.S0
            if (r0 == 0) goto L4e
            s8 r3 = r3.B0
            if (r3 == 0) goto L48
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r3 = r3.h
            r0.d(r3)
            return
        L48:
            java.lang.String r3 = "binding"
            defpackage.nb3.a0(r3)
            throw r2
        L4e:
            java.lang.String r3 = "frameRenderCoordinator"
            defpackage.nb3.a0(r3)
            throw r2
        L54:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r3) {
            r2 = this;
            super.onWindowFocusChanged(r3)
            android.view.Window r2 = r2.getWindow()
            r2.getClass()
            android.view.View r3 = r2.getDecorView()
            s35 r0 = new s35
            r0.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r3 < r1) goto L1f
            av7 r3 = new av7
            r3.<init>(r2, r0)
            goto L38
        L1f:
            r1 = 30
            if (r3 < r1) goto L29
            zu7 r3 = new zu7
            r3.<init>(r2, r0)
            goto L38
        L29:
            r1 = 26
            if (r3 < r1) goto L33
            xu7 r3 = new xu7
            r3.<init>(r2, r0)
            goto L38
        L33:
            wu7 r3 = new wu7
            r3.<init>(r2, r0)
        L38:
            r2 = 2
            r3.a(r2)
            r3.e()
            return
    }

    public final void p0() {
            r8 = this;
            sz1 r0 = r8.W()
            mk2 r0 = r0.s0()
            mk2 r1 = defpackage.mk2.HIDDEN
            r2 = 0
            java.lang.String r3 = "binding"
            if (r0 == r1) goto Lc7
            vs4 r1 = r8.H1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1f
            goto Lc7
        L1f:
            java.lang.String r1 = defpackage.v15.b(r8)
            r4 = 0
            android.content.SharedPreferences r1 = r8.getSharedPreferences(r1, r4)
            java.lang.String r5 = "video_console_skin_enabled"
            boolean r1 = r1.getBoolean(r5, r4)
            o11 r5 = new o11
            r5.<init>()
            android.content.res.Resources r6 = r8.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            if (r1 == 0) goto L44
            r1 = 1105199104(0x41e00000, float:28.0)
        L41:
            float r1 = r1 * r6
            int r1 = (int) r1
            goto L47
        L44:
            r1 = 1090519040(0x41000000, float:8.0)
            goto L41
        L47:
            r7 = 1094713344(0x41400000, float:12.0)
            float r7 = r7 * r6
            int r6 = (int) r7
            int[] r7 = me.magnum.melonds.ui.emulator.a.b
            int r0 = r0.ordinal()
            r0 = r7[r0]
            switch(r0) {
                case 1: goto L87;
                case 2: goto L7e;
                case 3: goto L75;
                case 4: goto L6c;
                case 5: goto L63;
                case 6: goto L5a;
                case 7: goto L8f;
                default: goto L56;
            }
        L56:
            defpackage.i.d()
            return
        L5a:
            r5.l = r4
            r5.h = r4
            r5.bottomMargin = r6
            r5.rightMargin = r6
            goto L8f
        L63:
            r5.l = r4
            r5.e = r4
            r5.h = r4
            r5.bottomMargin = r6
            goto L8f
        L6c:
            r5.l = r4
            r5.e = r4
            r5.bottomMargin = r6
            r5.leftMargin = r6
            goto L8f
        L75:
            r5.i = r4
            r5.h = r4
            r5.topMargin = r1
            r5.rightMargin = r6
            goto L8f
        L7e:
            r5.i = r4
            r5.e = r4
            r5.h = r4
            r5.topMargin = r1
            goto L8f
        L87:
            r5.i = r4
            r5.e = r4
            r5.topMargin = r1
            r5.leftMargin = r6
        L8f:
            s8 r0 = r8.B0
            if (r0 == 0) goto Lc3
            android.widget.TextView r0 = r0.i
            r0.setLayoutParams(r5)
            s8 r0 = r8.B0
            if (r0 == 0) goto Lbf
            android.widget.TextView r0 = r0.i
            r1 = 1148829696(0x4479c000, float:999.0)
            r0.setElevation(r1)
            s8 r0 = r8.B0
            if (r0 == 0) goto Lbb
            android.widget.TextView r0 = r0.i
            r0.bringToFront()
            s8 r0 = r8.B0
            if (r0 == 0) goto Lb7
            android.widget.TextView r0 = r0.i
            r0.setVisibility(r4)
            goto Ld2
        Lb7:
            defpackage.nb3.a0(r3)
            throw r2
        Lbb:
            defpackage.nb3.a0(r3)
            throw r2
        Lbf:
            defpackage.nb3.a0(r3)
            throw r2
        Lc3:
            defpackage.nb3.a0(r3)
            throw r2
        Lc7:
            s8 r0 = r8.B0
            if (r0 == 0) goto Ld6
            android.widget.TextView r0 = r0.i
            r1 = 8
            r0.setVisibility(r1)
        Ld2:
            r8.q0()
            return
        Ld6:
            defpackage.nb3.a0(r3)
            throw r2
    }

    public final void q0() {
            r13 = this;
            java.lang.String r0 = defpackage.v15.b(r13)
            r1 = 0
            android.content.SharedPreferences r0 = r13.getSharedPreferences(r0, r1)
            java.lang.String r2 = "resolution_hud_position"
            java.lang.String r3 = "hidden"
            java.lang.String r2 = r0.getString(r2, r3)
            if (r2 != 0) goto L14
            r2 = r3
        L14:
            boolean r3 = r2.equals(r3)
            r4 = 0
            r5 = 8
            java.lang.String r6 = "binding"
            if (r3 != 0) goto L21f
            vs4 r3 = r13.H1
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L2f
            goto L21f
        L2f:
            java.lang.String r3 = "video_renderer"
            java.lang.String r7 = "opengl"
            java.lang.String r3 = r0.getString(r3, r7)
            if (r3 != 0) goto L3a
            goto L3b
        L3a:
            r7 = r3
        L3b:
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r7.toUpperCase(r3)     // Catch: java.lang.Throwable -> L49
            r3.getClass()     // Catch: java.lang.Throwable -> L49
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.valueOf(r3)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r3 = move-exception
            em5 r7 = new em5
            r7.<init>(r3)
            r3 = r7
        L50:
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL
            boolean r8 = r3 instanceof defpackage.em5
            if (r8 == 0) goto L57
            r3 = r7
        L57:
            me.magnum.melonds.domain.model.VideoRenderer r3 = (me.magnum.melonds.domain.model.VideoRenderer) r3
            java.lang.String r7 = "video_internal_resolution"
            java.lang.String r8 = "1"
            java.lang.String r7 = r0.getString(r7, r8)
            r8 = 1
            if (r7 == 0) goto L6f
            java.lang.Integer r7 = defpackage.xs6.h0(r7)
            if (r7 == 0) goto L6f
            int r7 = r7.intValue()
            goto L70
        L6f:
            r7 = r8
        L70:
            if (r7 >= r8) goto L73
            r7 = r8
        L73:
            me.magnum.melonds.domain.model.VideoRenderer r9 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE
            if (r3 != r9) goto L78
            r7 = r8
        L78:
            int[] r9 = me.magnum.melonds.ui.emulator.a.c
            int r3 = r3.ordinal()
            r3 = r9[r3]
            if (r3 == r8) goto L91
            r9 = 2
            if (r3 == r9) goto L8e
            r9 = 3
            if (r3 == r9) goto L8b
            java.lang.String r3 = "Compute"
            goto L93
        L8b:
            java.lang.String r3 = "Vulkan"
            goto L93
        L8e:
            java.lang.String r3 = "OpenGL"
            goto L93
        L91:
            java.lang.String r3 = "Software"
        L93:
            int r9 = r7 * 256
            int r10 = r7 * 384
            s8 r11 = r13.B0
            if (r11 == 0) goto L21b
            android.widget.TextView r11 = r11.l
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r3 = " | "
            r12.append(r3)
            r12.append(r9)
            java.lang.String r3 = "x"
            r12.append(r3)
            r12.append(r10)
            java.lang.String r3 = " ("
            r12.append(r3)
            r12.append(r7)
            java.lang.String r3 = "x)"
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            r11.setText(r3)
            java.lang.String r3 = "video_console_skin_enabled"
            boolean r0 = r0.getBoolean(r3, r1)
            android.content.res.Resources r3 = r13.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r7 = 1105199104(0x41e00000, float:28.0)
            if (r0 == 0) goto Le1
            float r0 = r7 * r3
        Ldf:
            int r0 = (int) r0
            goto Le5
        Le1:
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 * r3
            goto Ldf
        Le5:
            r9 = 1094713344(0x41400000, float:12.0)
            float r9 = r9 * r3
            int r9 = (int) r9
            s8 r10 = r13.B0
            if (r10 == 0) goto L217
            android.widget.TextView r10 = r10.i
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L10c
            s8 r10 = r13.B0
            if (r10 == 0) goto L108
            android.widget.TextView r10 = r10.i
            java.lang.CharSequence r10 = r10.getText()
            if (r10 == 0) goto L10c
            int r10 = r10.length()
            if (r10 <= 0) goto L10c
            goto L10d
        L108:
            defpackage.nb3.a0(r6)
            throw r4
        L10c:
            r8 = r1
        L10d:
            sz1 r10 = r13.W()
            mk2 r10 = r10.s0()
            o11 r11 = new o11
            r11.<init>()
            int r12 = r2.hashCode()
            switch(r12) {
                case -1699597560: goto L1b5;
                case -1580828439: goto L199;
                case -1113993601: goto L17d;
                case -966253391: goto L161;
                case -609197669: goto L141;
                case 116576946: goto L123;
                default: goto L121;
            }
        L121:
            goto L1bd
        L123:
            java.lang.String r12 = "top_right"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L12d
            goto L1bd
        L12d:
            r11.i = r1
            r11.h = r1
            if (r8 == 0) goto L13b
            mk2 r2 = defpackage.mk2.TOP_RIGHT
            if (r10 != r2) goto L13b
            float r0 = (float) r0
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
        L13b:
            r11.topMargin = r0
            r11.rightMargin = r9
            goto L1df
        L141:
            java.lang.String r0 = "bottom_left"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14b
            goto L1bd
        L14b:
            r11.l = r1
            r11.e = r1
            if (r8 == 0) goto L15a
            mk2 r0 = defpackage.mk2.BOTTOM_LEFT
            if (r10 != r0) goto L15a
            float r0 = (float) r9
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
            goto L15b
        L15a:
            r0 = r9
        L15b:
            r11.bottomMargin = r0
            r11.leftMargin = r9
            goto L1df
        L161:
            java.lang.String r12 = "top_left"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L16a
            goto L1bd
        L16a:
            r11.i = r1
            r11.e = r1
            if (r8 == 0) goto L178
            mk2 r2 = defpackage.mk2.TOP_LEFT
            if (r10 != r2) goto L178
            float r0 = (float) r0
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
        L178:
            r11.topMargin = r0
            r11.leftMargin = r9
            goto L1df
        L17d:
            java.lang.String r9 = "top_center"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L186
            goto L1bd
        L186:
            r11.i = r1
            r11.e = r1
            r11.h = r1
            if (r8 == 0) goto L196
            mk2 r2 = defpackage.mk2.TOP_CENTER
            if (r10 != r2) goto L196
            float r0 = (float) r0
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
        L196:
            r11.topMargin = r0
            goto L1df
        L199:
            java.lang.String r0 = "bottom_center"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a2
            goto L1bd
        L1a2:
            r11.l = r1
            r11.e = r1
            r11.h = r1
            if (r8 == 0) goto L1b2
            mk2 r0 = defpackage.mk2.BOTTOM_CENTER
            if (r10 != r0) goto L1b2
            float r0 = (float) r9
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r9 = (int) r7
        L1b2:
            r11.bottomMargin = r9
            goto L1df
        L1b5:
            java.lang.String r0 = "bottom_right"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1cb
        L1bd:
            s8 r13 = r13.B0
            if (r13 == 0) goto L1c7
            android.widget.TextView r13 = r13.l
            r13.setVisibility(r5)
            return
        L1c7:
            defpackage.nb3.a0(r6)
            throw r4
        L1cb:
            r11.l = r1
            r11.h = r1
            if (r8 == 0) goto L1da
            mk2 r0 = defpackage.mk2.BOTTOM_RIGHT
            if (r10 != r0) goto L1da
            float r0 = (float) r9
            float r7 = r7 * r3
            float r7 = r7 + r0
            int r0 = (int) r7
            goto L1db
        L1da:
            r0 = r9
        L1db:
            r11.bottomMargin = r0
            r11.rightMargin = r9
        L1df:
            s8 r0 = r13.B0
            if (r0 == 0) goto L213
            android.widget.TextView r0 = r0.l
            r0.setLayoutParams(r11)
            s8 r0 = r13.B0
            if (r0 == 0) goto L20f
            android.widget.TextView r0 = r0.l
            r0.setVisibility(r1)
            s8 r0 = r13.B0
            if (r0 == 0) goto L20b
            android.widget.TextView r0 = r0.l
            r0.bringToFront()
            s8 r13 = r13.B0
            if (r13 == 0) goto L207
            android.widget.TextView r13 = r13.l
            r0 = 1148829696(0x4479c000, float:999.0)
            r13.setElevation(r0)
            return
        L207:
            defpackage.nb3.a0(r6)
            throw r4
        L20b:
            defpackage.nb3.a0(r6)
            throw r4
        L20f:
            defpackage.nb3.a0(r6)
            throw r4
        L213:
            defpackage.nb3.a0(r6)
            throw r4
        L217:
            defpackage.nb3.a0(r6)
            throw r4
        L21b:
            defpackage.nb3.a0(r6)
            throw r4
        L21f:
            s8 r13 = r13.B0
            if (r13 == 0) goto L229
            android.widget.TextView r13 = r13.l
            r13.setVisibility(r5)
            return
        L229:
            defpackage.nb3.a0(r6)
            throw r4
    }

    public final void r0() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            sz1 r3 = r3.W()
            kd6 r3 = r3.c
            ng6 r3 = (defpackage.ng6) r3
            android.content.SharedPreferences r3 = r3.b
            java.lang.String r1 = "enable_sustained_performance"
            r2 = 0
            boolean r3 = r3.getBoolean(r1, r2)
            r0.setSustainedPerformanceMode(r3)
            return
    }

    public final void s0() {
            r5 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 15
            r1.<init>(r5, r2)
            java.lang.String r2 = "Tile background types"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            ou1 r2 = new ou1
            r3 = 16
            r2.<init>(r5, r3)
            java.lang.String r3 = "Bitmap background types"
            r1.<init>(r3, r2)
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 17
            r3.<init>(r5, r4)
            java.lang.String r4 = "Special background types"
            r2.<init>(r4, r3)
            bk5[] r0 = new defpackage.bk5[]{r0, r1, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            ou1 r1 = new ou1
            r2 = 18
            r1.<init>(r5, r2)
            java.lang.String r2 = "Background type enables"
            r5.K0(r2, r0, r1)
            return
    }

    public final void t0() {
            r6 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 10
            r1.<init>(r6, r2)
            java.lang.String r2 = "Engine A (Main) BG layers"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            ou1 r2 = new ou1
            r3 = 11
            r2.<init>(r6, r3)
            java.lang.String r3 = "Engine B (Sub) BG layers"
            r1.<init>(r3, r2)
            bk5 r2 = new bk5
            ou1 r3 = new ou1
            r4 = 12
            r3.<init>(r6, r4)
            java.lang.String r4 = "Engine A (Main) BG priorities"
            r2.<init>(r4, r3)
            bk5 r3 = new bk5
            ou1 r4 = new ou1
            r5 = 13
            r4.<init>(r6, r5)
            java.lang.String r5 = "Engine B (Sub) BG priorities"
            r3.<init>(r5, r4)
            bk5[] r0 = new defpackage.bk5[]{r0, r1, r2, r3}
            java.util.List r0 = defpackage.hf.c0(r0)
            ou1 r1 = new ou1
            r2 = 14
            r1.<init>(r6, r2)
            java.lang.String r2 = "BG layers and priorities"
            r6.K0(r2, r0, r1)
            return
    }

    public final void u0(boolean r14) {
            r13 = this;
            nj5 r0 = r13.d0()
            vr4 r1 = r13.P()
            java.lang.Object r2 = r1.A
            r4 = r2
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r1 = r1.B
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            if (r14 == 0) goto L16
            java.lang.String r2 = "Engine A (Main) BG layers"
            goto L18
        L16:
            java.lang.String r2 = "Engine B (Sub) BG layers"
        L18:
            r13.G(r4, r2)
            java.lang.String r3 = "Disables individual BG0-BG3 draw gates before `DrawBG_*` or `DrawBG_3D`; this is independent from the game's DISPCNT enable bits."
            r13.D(r4, r3)
            xu1 r9 = new xu1
            r10 = 0
            r9.<init>(r14, r0, r10)
            uu1 r11 = new uu1
            r12 = 1
            r11.<init>(r14, r0, r13, r12)
            r13.H(r4, r2)
            java.util.List r14 = defpackage.dw1.b
            java.util.Iterator r14 = r14.iterator()
        L35:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r14.next()
            lj5 r0 = (defpackage.lj5) r0
            java.lang.String r5 = r0.b
            java.lang.String r6 = r0.c
            java.lang.Object r3 = r9.c()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r7 = r0.a
            int r7 = r12 << r7
            r3 = r3 & r7
            if (r3 != 0) goto L58
            r7 = r12
            goto L59
        L58:
            r7 = r10
        L59:
            t00 r8 = new t00
            r3 = 10
            r8.<init>(r0, r9, r11, r3)
            r3 = r13
            r3.I(r4, r5, r6, r7, r8)
            goto L35
        L65:
            r3 = r13
            wu1 r13 = new wu1
            r14 = 6
            r13.<init>(r3, r14)
            r3.M0(r2, r1, r13)
            return
    }

    public final void v0(boolean r11) {
            r10 = this;
            nj5 r0 = r10.d0()
            vr4 r1 = r10.P()
            java.lang.Object r2 = r1.A
            r4 = r2
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r1 = r1.B
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            if (r11 == 0) goto L17
            java.lang.String r2 = "Engine A (Main) BG priorities"
        L15:
            r5 = r2
            goto L1a
        L17:
            java.lang.String r2 = "Engine B (Sub) BG priorities"
            goto L15
        L1a:
            r10.G(r4, r5)
            java.lang.String r2 = "Disables BG layers by Nintendo DS BGCNT priority bits 0-1. Priority 0 is closest to the viewer; priority 3 is furthest back."
            r10.D(r4, r2)
            xu1 r6 = new xu1
            r2 = 1
            r6.<init>(r11, r0, r2)
            uu1 r7 = new uu1
            r2 = 3
            r7.<init>(r11, r0, r10, r2)
            java.lang.String r8 = "BGCNT priority"
            java.lang.String r9 = "Code gate: `bgCnt[n] & 0x3` inside `DrawScanlineBGMode`."
            r3 = r10
            r3.F(r4, r5, r6, r7, r8, r9)
            wu1 r10 = new wu1
            r11 = 23
            r10.<init>(r3, r11)
            r3.M0(r5, r1, r10)
            return
    }

    public final void w0() {
            r4 = this;
            bk5 r0 = new bk5
            ou1 r1 = new ou1
            r2 = 7
            r1.<init>(r4, r2)
            java.lang.String r2 = "Top screen compMode"
            r0.<init>(r2, r1)
            bk5 r1 = new bk5
            ou1 r2 = new ou1
            r3 = 8
            r2.<init>(r4, r3)
            java.lang.String r3 = "Bottom screen compMode"
            r1.<init>(r3, r2)
            bk5[] r0 = new defpackage.bk5[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            ou1 r1 = new ou1
            r2 = 9
            r1.<init>(r4, r2)
            java.lang.String r2 = "Packed compMode override"
            r4.K0(r2, r0, r1)
            return
    }

    public final void x0(boolean r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            nj5 r2 = r0.d0()
            vr4 r3 = r0.P()
            java.lang.Object r4 = r3.A
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r3 = r3.B
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            if (r1 == 0) goto L19
            java.lang.String r5 = "Top screen compMode"
            goto L1b
        L19:
            java.lang.String r5 = "Bottom screen compMode"
        L1b:
            r0.G(r4, r5)
            java.lang.String r6 = "Forces the compositor mode stored in the packed control plane. Native keeps the value produced by `DrawScanline_BGOBJ`; the override is applied independently to top and bottom snapshots before Vulkan consumes them."
            r0.D(r4, r6)
            if (r1 == 0) goto L28
            int r6 = r2.c
            goto L2a
        L28:
            int r6 = r2.d
        L2a:
            uu1 r7 = new uu1
            r8 = 0
            r7.<init>(r1, r2, r0, r8)
            r0.H(r4, r5)
            java.util.List r1 = defpackage.dw1.a
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            android.widget.RadioGroup r9 = new android.widget.RadioGroup
            r9.<init>(r0)
            r10 = 1
            r9.setOrientation(r10)
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r11 = r1.hasNext()
            r12 = -1
            r13 = 0
            if (r11 == 0) goto L92
            java.lang.Object r11 = r1.next()
            mj5 r11 = (defpackage.mj5) r11
            android.widget.RadioButton r14 = new android.widget.RadioButton
            r14.<init>(r0)
            int r15 = android.view.View.generateViewId()
            r14.setId(r15)
            java.lang.String r15 = r11.b
            r14.setText(r15)
            r15 = 2
            r10 = 1096810496(0x41600000, float:14.0)
            r14.setTextSize(r15, r10)
            r14.setSingleLine(r8)
            r14.setEllipsize(r13)
            r10 = 4
            r14.setMaxLines(r10)
            int r10 = r14.getId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r11 = r11.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r2.put(r10, r11)
            android.widget.RadioGroup$LayoutParams r10 = new android.widget.RadioGroup$LayoutParams
            r11 = -2
            r10.<init>(r12, r11)
            r9.addView(r14, r10)
            r10 = 1
            goto L47
        L92:
            java.util.Set r1 = r2.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r1.next()
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r6) goto L9c
            r13 = r8
        Lb6:
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            if (r13 == 0) goto Lc5
            java.lang.Object r1 = r13.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto Lf1
        Lc5:
            java.util.Set r1 = r2.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Lcf:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L10b
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto Lcf
            java.lang.Object r1 = r6.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        Lf1:
            r9.check(r1)
            av1 r1 = new av1
            r6 = 1
            r1.<init>(r2, r7, r6)
            r9.setOnCheckedChangeListener(r1)
            r4.addView(r9)
            ou1 r1 = new ou1
            r2 = 27
            r1.<init>(r0, r2)
            r0.M0(r5, r3, r1)
            return
        L10b:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            defpackage.fa6.e(r0)
            return
    }

    public final void y0() {
            r6 = this;
            boolean r0 = r6.Y()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2131952433(0x7f130331, float:1.9541309E38)
            java.lang.String r0 = r6.getString(r0)
            r0.getClass()
            kw3 r1 = defpackage.hf.I()
            bk5 r2 = new bk5
            bv1 r3 = new bv1
            r4 = 11
            r3.<init>(r6, r4)
            java.lang.String r4 = "Background mode override"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            bv1 r3 = new bv1
            r4 = 12
            r3.<init>(r6, r4)
            java.lang.String r4 = "Packed compMode override"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            bv1 r3 = new bv1
            r4 = 13
            r3.<init>(r6, r4)
            java.lang.String r4 = "BG layers and priorities"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            bv1 r3 = new bv1
            r4 = 14
            r3.<init>(r6, r4)
            java.lang.String r4 = "Background type enables"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            bv1 r3 = new bv1
            r4 = 15
            r3.<init>(r6, r4)
            java.lang.String r4 = "OBJ / Sprites layers"
            r2.<init>(r4, r3)
            r1.add(r2)
            bk5 r2 = new bk5
            r3 = 2131952434(0x7f130332, float:1.954131E38)
            java.lang.String r3 = r6.getString(r3)
            r3.getClass()
            bv1 r4 = new bv1
            r5 = 16
            r4.<init>(r6, r5)
            r2.<init>(r3, r4)
            r1.add(r2)
            kw3 r1 = defpackage.hf.A(r1)
            bv1 r2 = new bv1
            r3 = 17
            r2.<init>(r6, r3)
            r6.K0(r0, r1, r2)
            return
    }

    public final void z0(boolean r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            nj5 r2 = r0.d0()
            vr4 r3 = r0.P()
            java.lang.Object r4 = r3.A
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r3 = r3.B
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            if (r1 == 0) goto L19
            java.lang.String r5 = "Engine A (Main) BG mode"
            goto L1b
        L19:
            java.lang.String r5 = "Engine B (Sub) BG mode"
        L1b:
            r0.G(r4, r5)
            java.lang.String r6 = "Forces the Nintendo DS BG mode used by `DrawScanline_BGOBJ`. Native keeps `CurUnit->DispCnt & 0x7`."
            r0.D(r4, r6)
            if (r1 == 0) goto L28
            int r6 = r2.a
            goto L2a
        L28:
            int r6 = r2.b
        L2a:
            uu1 r7 = new uu1
            r8 = 2
            r7.<init>(r1, r2, r0, r8)
            r0.H(r4, r5)
            java.util.List r2 = defpackage.dw1.a
            kw3 r2 = defpackage.hf.I()
            oj5 r9 = new oj5
            java.lang.String r10 = "Native DISPCNT mode - use CurUnit->DispCnt & 0x7"
            r11 = -1
            r9.<init>(r11, r10)
            r2.add(r9)
            oj5 r9 = new oj5
            java.lang.String r10 = "Mode 0 - 4 Static layers. Code: DrawScanlineBGMode<0>(); BG0-BG3 use DrawBG_Text."
            r12 = 0
            r9.<init>(r12, r10)
            r2.add(r9)
            oj5 r9 = new oj5
            java.lang.String r10 = "Mode 1 - 3 Static layers + 1 Affine layer. Code: BG0-BG2 DrawBG_Text, BG3 DrawBG_Affine."
            r13 = 1
            r9.<init>(r13, r10)
            r2.add(r9)
            oj5 r9 = new oj5
            java.lang.String r10 = "Mode 2 - 2 Static layers + 2 Affine layers. Code: BG0/BG1 DrawBG_Text, BG2/BG3 DrawBG_Affine."
            r9.<init>(r8, r10)
            r2.add(r9)
            oj5 r9 = new oj5
            r10 = 3
            java.lang.String r14 = "Mode 3 - 3 Static layers + 1 Affine Extended layer. Code: BG3 DrawBG_Extended."
            r9.<init>(r10, r14)
            r2.add(r9)
            oj5 r9 = new oj5
            java.lang.String r10 = "Mode 4 - 2 Static layers + 1 Affine layer + 1 Affine Extended layer. Code: BG2 DrawBG_Affine, BG3 DrawBG_Extended."
            r14 = 4
            r9.<init>(r14, r10)
            r2.add(r9)
            oj5 r9 = new oj5
            r10 = 5
            java.lang.String r15 = "Mode 5 - 2 Static layers + 2 Affine Extended layers. Code: BG2/BG3 DrawBG_Extended."
            r9.<init>(r10, r15)
            r2.add(r9)
            if (r1 == 0) goto L92
            oj5 r1 = new oj5
            r9 = 6
            java.lang.String r10 = "Mode 6 - 1 3D background layer + 1 Large screen. Code: BG0 DrawBG_3D, BG2 DrawBG_Large. Main only."
            r1.<init>(r9, r10)
            r2.add(r1)
        L92:
            kw3 r1 = defpackage.hf.A(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            android.widget.RadioGroup r9 = new android.widget.RadioGroup
            r9.<init>(r0)
            r9.setOrientation(r13)
            java.util.ListIterator r1 = r1.listIterator(r12)
        La7:
            r10 = r1
            xx2 r10 = (defpackage.xx2) r10
            boolean r13 = r10.hasNext()
            r15 = 0
            if (r13 == 0) goto Lf3
            java.lang.Object r10 = r10.next()
            oj5 r10 = (defpackage.oj5) r10
            android.widget.RadioButton r13 = new android.widget.RadioButton
            r13.<init>(r0)
            int r11 = android.view.View.generateViewId()
            r13.setId(r11)
            java.lang.String r11 = r10.b
            r13.setText(r11)
            r11 = 1096810496(0x41600000, float:14.0)
            r13.setTextSize(r8, r11)
            r13.setSingleLine(r12)
            r13.setEllipsize(r15)
            r13.setMaxLines(r14)
            int r11 = r13.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r10 = r10.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.put(r11, r10)
            android.widget.RadioGroup$LayoutParams r10 = new android.widget.RadioGroup$LayoutParams
            r11 = -2
            r15 = -1
            r10.<init>(r15, r11)
            r9.addView(r13, r10)
            r11 = -1
            goto La7
        Lf3:
            java.util.Set r1 = r2.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        Lfd:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L117
            java.lang.Object r8 = r1.next()
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r6) goto Lfd
            r15 = r8
        L117:
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            if (r15 == 0) goto L126
            java.lang.Object r1 = r15.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L153
        L126:
            java.util.Set r1 = r2.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L130:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L16c
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r15 = -1
            if (r8 != r15) goto L130
            java.lang.Object r1 = r6.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L153:
            r9.check(r1)
            av1 r1 = new av1
            r1.<init>(r2, r7, r12)
            r9.setOnCheckedChangeListener(r1)
            r4.addView(r9)
            wu1 r1 = new wu1
            r2 = 8
            r1.<init>(r0, r2)
            r0.M0(r5, r3, r1)
            return
        L16c:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            defpackage.fa6.e(r0)
            return
    }
}
