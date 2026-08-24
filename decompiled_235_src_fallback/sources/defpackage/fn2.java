package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn2  reason: default package */
/* loaded from: classes.dex */
public abstract class fn2 implements defpackage.s03 {
    @Override // defpackage.s03
    public final void a(defpackage.my4 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // defpackage.s03
    public final void b(defpackage.b63 r2) {
            r1 = this;
            r2.getClass()
            int[] r0 = defpackage.en2.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 3
            if (r2 != r0) goto L1b
            rv1 r1 = (defpackage.rv1) r1
            boolean r2 = r1.B
            if (r2 != 0) goto L15
            goto L1b
        L15:
            r2 = 0
            r1.B = r2
            r1.g()
        L1b:
            return
    }

    @Override // defpackage.s03
    public final void c(defpackage.b63 r6) {
            r5 = this;
            r6.getClass()
            int[] r0 = defpackage.en2.a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 0
            java.lang.String r1 = "binding"
            r2 = 1
            r3 = 0
            switch(r6) {
                case 1: goto L185;
                case 2: goto L181;
                case 3: goto L16a;
                case 4: goto L13d;
                case 5: goto L10e;
                case 6: goto L100;
                case 7: goto Ld2;
                case 8: goto Lce;
                case 9: goto L90;
                case 10: goto L8c;
                case 11: goto L7e;
                case 12: goto L15;
                default: goto L13;
            }
        L13:
            goto L180
        L15:
            rv1 r5 = (defpackage.rv1) r5
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            s8 r5 = r5.B0
            if (r5 == 0) goto L7a
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r5 = r5.m
            boolean r6 = r5.l0
            r6 = r6 ^ r2
            r5.l0 = r6
            java.util.List r6 = r5.getLayoutComponentViews()
            java.util.Iterator r6 = r6.iterator()
        L2c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r6.next()
            zj3 r1 = (defpackage.zj3) r1
            nj3 r2 = r1.b
            android.view.View r1 = r1.a
            nj3 r3 = defpackage.nj3.BUTTON_TRANSLATE
            r4 = 8
            if (r2 != r3) goto L46
            r1.setVisibility(r4)
            goto L2c
        L46:
            nj3 r3 = defpackage.nj3.DPAD
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTONS
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTON_L
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTON_R
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTON_START
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTON_SELECT
            if (r2 == r3) goto L2c
            nj3 r3 = defpackage.nj3.BUTTON_TOGGLE_EXTRA_BUTTONS
            if (r2 == r3) goto L2c
            boolean r2 = r2.isScreen()
            if (r2 == 0) goto L69
            goto L2c
        L69:
            boolean r2 = r5.l0
            if (r2 == 0) goto L6e
            r4 = r0
        L6e:
            r1.setVisibility(r4)
            goto L2c
        L72:
            nj3 r6 = defpackage.nj3.BUTTON_TOGGLE_EXTRA_BUTTONS
            boolean r0 = r5.l0
            r5.h(r6, r0)
            return
        L7a:
            defpackage.nb3.a0(r1)
            throw r3
        L7e:
            rv1 r5 = (defpackage.rv1) r5
            int r6 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            hq2 r5 = r5.V()
            r5.j(r0)
            return
        L8c:
            r5.f()
            return
        L90:
            rv1 r5 = (defpackage.rv1) r5
            int r6 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            sz1 r5 = r5.W()
            of6 r6 = r5.J0
            tp6 r1 = r5.p0
            java.lang.Object r1 = r1.getValue()
            hy1 r1 = (defpackage.hy1) r1
            boolean r2 = r1 instanceof defpackage.dy1
            if (r2 == 0) goto Lc4
            sx1 r2 = r5.w
            boolean r2 = r2.b()
            if (r2 == 0) goto Lbe
            o41 r6 = r5.z
            p02 r2 = new p02
            dy1 r1 = (defpackage.dy1) r1
            r2.<init>(r5, r1, r3, r0)
            r5 = 3
            defpackage.hv.L(r6, r3, r3, r2, r5)
            return
        Lbe:
            p67 r5 = defpackage.p67.a
            r6.k(r5)
            return
        Lc4:
            boolean r5 = r1 instanceof defpackage.cy1
            if (r5 == 0) goto L180
            q67 r5 = defpackage.q67.a
            r6.k(r5)
            return
        Lce:
            r5.e()
            return
        Ld2:
            rv1 r5 = (defpackage.rv1) r5
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            s8 r6 = r5.B0
            if (r6 == 0) goto Lfc
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r6 = r6.m
            boolean r0 = r6.j0
            r0 = r0 ^ r2
            r6.j0 = r0
            r6.j()
            c92 r6 = r5.K0
            if (r6 == 0) goto Lf5
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r6.L
            boolean r1 = r0.j0
            r1 = r1 ^ r2
            r0.j0 = r1
            r0.j()
            r6.b()
        Lf5:
            r5.U0()
            r5.o0()
            return
        Lfc:
            defpackage.nb3.a0(r1)
            throw r3
        L100:
            rv1 r5 = (defpackage.rv1) r5
            int r6 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            sz1 r5 = r5.W()
            r5.S0()
            return
        L10e:
            rv1 r5 = (defpackage.rv1) r5
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            s8 r6 = r5.B0
            if (r6 == 0) goto L139
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r6 = r6.m
            boolean r0 = r6.i0
            r0 = r0 ^ r2
            r6.i0 = r0
            nj3 r1 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            r6.h(r1, r0)
            r6.k()
            c92 r5 = r5.K0
            if (r5 == 0) goto L180
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r5 = r5.L
            if (r5 == 0) goto L180
            boolean r6 = r5.i0
            r6 = r6 ^ r2
            r5.i0 = r6
            r5.h(r1, r6)
            r5.k()
            return
        L139:
            defpackage.nb3.a0(r1)
            throw r3
        L13d:
            rv1 r5 = (defpackage.rv1) r5
            boolean r6 = r5.L
            r6 = r6 ^ r2
            r5.L = r6
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r5.R
            s8 r2 = r0.B0
            if (r2 == 0) goto L166
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r1 = r2.m
            nj3 r2 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            r1.h(r2, r6)
            c92 r6 = r0.K0
            if (r6 == 0) goto L15e
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r6 = r6.L
            if (r6 == 0) goto L15e
            boolean r0 = r5.L
            r6.h(r2, r0)
        L15e:
            me.magnum.melonds.MelonEmulator r6 = me.magnum.melonds.MelonEmulator.a
            boolean r5 = r5.L
            r6.setMicrophoneEnabled(r5)
            return
        L166:
            defpackage.nb3.a0(r1)
            throw r3
        L16a:
            rv1 r5 = (defpackage.rv1) r5
            boolean r6 = r5.B
            if (r6 != 0) goto L180
            int r6 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = r5.R
            sz1 r6 = r6.W()
            r6.getClass()
            r5.B = r2
            r5.g()
        L180:
            return
        L181:
            r5.d()
            return
        L185:
            rv1 r5 = (defpackage.rv1) r5
            int r6 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            sz1 r5 = r5.W()
            r5.M0(r2)
            return
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();
}
