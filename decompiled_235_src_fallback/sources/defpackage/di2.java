package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di2  reason: default package */
/* loaded from: classes.dex */
public final class di2 extends defpackage.zg1 implements defpackage.va6, defpackage.ks2, defpackage.fy0, defpackage.gi4, defpackage.ub7 {
    public static final defpackage.q61 s0 = null;
    public defpackage.r94 m0;
    public final defpackage.qn2 n0;
    public defpackage.sg2 o0;
    public defpackage.lq3 p0;
    public defpackage.eg4 q0;
    public final defpackage.vh2 r0;

    static {
            q61 r0 = new q61
            r0.<init>()
            defpackage.di2.s0 = r0
            return
    }

    public di2(defpackage.r94 r10, int r11, defpackage.a0 r12) {
            r9 = this;
            r9.<init>()
            r9.m0 = r10
            r9.n0 = r12
            h4 r0 = new h4
            r7 = 0
            r8 = 4
            r1 = 2
            java.lang.Class<di2> r3 = defpackage.di2.class
            java.lang.String r4 = "onFocusStateChange"
            java.lang.String r5 = "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            vh2 r9 = new vh2
            r10 = 10
            r9.<init>(r11, r0, r10)
            r2.R0(r9)
            r2.r0 = r9
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r12) {
            r11 = this;
            vh2 r0 = r11.r0
            sh2 r0 = r0.W0()
            boolean r0 = r0.isFocused()
            fg3[] r1 = defpackage.eb6.a
            fb6 r1 = defpackage.bb6.l
            fg3[] r2 = defpackage.eb6.a
            r3 = 4
            r2 = r2[r3]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.a(r1, r0)
            i4 r2 = new i4
            r9 = 0
            r10 = 5
            r3 = 0
            java.lang.Class<di2> r5 = defpackage.di2.class
            java.lang.String r6 = "requestFocus"
            java.lang.String r7 = "requestFocus()Z"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            fb6 r11 = defpackage.sa6.w
            y1 r0 = new y1
            r1 = 0
            r0.<init>(r1, r2)
            r12.a(r11, r0)
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void L0() {
            r1 = this;
            lq3 r0 = r1.p0
            if (r0 == 0) goto L7
            r0.b()
        L7:
            r0 = 0
            r1.p0 = r0
            return
    }

    public final void U0(defpackage.r94 r8, defpackage.t93 r9) {
            r7 = this;
            boolean r0 = r7.j0
            if (r0 == 0) goto L36
            w61 r0 = r7.F0()
            o41 r0 = (defpackage.o41) r0
            l61 r0 = r0.B
            vs0 r1 = defpackage.vs0.h0
            j61 r0 = r0.Z(r1)
            rc3 r0 = (defpackage.rc3) r0
            r5 = 0
            if (r0 == 0) goto L23
            bi2 r1 = new bi2
            r2 = 0
            r1.<init>(r2, r8, r9)
            il1 r0 = r0.a0(r1)
            r4 = r0
            goto L24
        L23:
            r4 = r5
        L24:
            w61 r7 = r7.F0()
            u12 r1 = new u12
            r6 = 8
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 3
            defpackage.hv.L(r7, r5, r5, r1, r8)
            return
        L36:
            r2 = r8
            r3 = r9
            r2.b(r3)
            return
    }

    public final void V0(defpackage.r94 r4) {
            r3 = this;
            r94 r0 = r3.m0
            boolean r0 = defpackage.nb3.k(r0, r4)
            if (r0 != 0) goto L1d
            r94 r0 = r3.m0
            if (r0 == 0) goto L18
            sg2 r1 = r3.o0
            if (r1 == 0) goto L18
            tg2 r2 = new tg2
            r2.<init>(r1)
            r0.b(r2)
        L18:
            r0 = 0
            r3.o0 = r0
            r3.m0 = r4
        L1d:
            return
    }

    @Override // defpackage.ks2
    public final void d0(defpackage.eg4 r2) {
            r1 = this;
            r1.q0 = r2
            vh2 r0 = r1.r0
            sh2 r0 = r0.W0()
            boolean r0 = r0.isFocused()
            if (r0 != 0) goto Lf
            goto L34
        Lf:
            z64 r2 = r2.Y0()
            boolean r2 = r2.j0
            jd1 r0 = defpackage.ei2.k0
            if (r2 == 0) goto L2d
            eg4 r2 = r1.q0
            if (r2 == 0) goto L34
            z64 r2 = r2.Y0()
            boolean r2 = r2.j0
            if (r2 == 0) goto L34
            boolean r2 = r1.j0
            if (r2 == 0) goto L34
            defpackage.ii2.t(r1, r0)
            return
        L2d:
            boolean r2 = r1.j0
            if (r2 == 0) goto L34
            defpackage.ii2.t(r1, r0)
        L34:
            return
    }

    @Override // defpackage.gi4
    public final void l0() {
            r3 = this;
            dh5 r0 = new dh5
            r0.<init>()
            ci2 r1 = new ci2
            r2 = 0
            r1.<init>(r2, r0, r3)
            defpackage.jx2.B(r3, r1)
            java.lang.Object r0 = r0.A
            lq3 r0 = (defpackage.lq3) r0
            vh2 r1 = r3.r0
            sh2 r1 = r1.W0()
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L2e
            lq3 r1 = r3.p0
            if (r1 == 0) goto L25
            r1.b()
        L25:
            if (r0 == 0) goto L2b
            r0.a()
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r3.p0 = r0
        L2e:
            return
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            q61 r0 = defpackage.di2.s0
            return r0
    }
}
