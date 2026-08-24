package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rv1  reason: default package */
/* loaded from: classes.dex */
public final class rv1 extends defpackage.fn2 {
    public boolean A;
    public boolean B;
    public boolean L;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity R;

    public rv1(me.magnum.melonds.ui.emulator.EmulatorActivity r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r1 = 1
            r0.L = r1
            return
    }

    @Override // defpackage.fn2
    public final void d() {
            r4 = this;
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = r4.R
            sz1 r1 = r0.W()
            r1.getClass()
            boolean r1 = r4.A
            r1 = r1 ^ 1
            r4.A = r1
            s8 r2 = r0.B0
            if (r2 == 0) goto L2d
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r2 = r2.m
            nj3 r3 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            r2.h(r3, r1)
            c92 r0 = r0.K0
            if (r0 == 0) goto L29
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.L
            if (r0 == 0) goto L29
            boolean r1 = r4.A
            r0.h(r3, r1)
        L29:
            r4.g()
            return
        L2d:
            java.lang.String r4 = "binding"
            defpackage.nb3.a0(r4)
            r4 = 0
            throw r4
    }

    @Override // defpackage.fn2
    public final void e() {
            r5 = this;
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = r5.R
            sz1 r5 = r5.W()
            tp6 r0 = r5.p0
            java.lang.Object r0 = r0.getValue()
            hy1 r0 = (defpackage.hy1) r0
            boolean r1 = r0 instanceof defpackage.dy1
            if (r1 == 0) goto L24
            o41 r1 = r5.z
            p02 r2 = new p02
            dy1 r0 = (defpackage.dy1) r0
            r3 = 1
            r4 = 0
            r2.<init>(r5, r0, r4, r3)
            r5 = 3
            defpackage.hv.L(r1, r4, r4, r2, r5)
            return
        L24:
            boolean r0 = r0 instanceof defpackage.cy1
            if (r0 == 0) goto L2f
            of6 r5 = r5.J0
            r67 r0 = defpackage.r67.a
            r5.k(r0)
        L2f:
            return
    }

    @Override // defpackage.fn2
    public final void f() {
            r4 = this;
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = r4.R
            sz1 r4 = r4.W()
            of6 r0 = r4.J0
            kd6 r1 = r4.c
            ng6 r1 = (defpackage.ng6) r1
            android.content.SharedPreferences r1 = r1.b
            java.lang.String r2 = "enable_rewind"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L1f
            t77 r4 = defpackage.t77.a
            r0.k(r4)
            return
        L1f:
            sx1 r1 = r4.w
            boolean r1 = r1.b()
            if (r1 != 0) goto L2d
            s77 r4 = defpackage.s77.a
            r0.k(r4)
            return
        L2d:
            o41 r0 = r4.z
            hz1 r1 = new hz1
            r2 = 14
            r3 = 0
            r1.<init>(r2, r3, r4)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    public final void g() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 != 0) goto Lb
            boolean r1 = r1.B
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.setFastForwardEnabled(r1)
            return
    }
}
