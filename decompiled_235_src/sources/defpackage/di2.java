package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di2  reason: default package */
/* loaded from: classes.dex */
public final class di2 extends zg1 implements va6, ks2, fy0, gi4, ub7 {
    public static final q61 s0 = new Object();
    public r94 m0;
    public final qn2 n0;
    public sg2 o0;
    public lq3 p0;
    public eg4 q0;
    public final vh2 r0;

    public di2(r94 r94Var, int i, a0 a0Var) {
        this.m0 = r94Var;
        this.n0 = a0Var;
        vh2 vh2Var = new vh2(i, new h4(2, this, di2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 4), 10);
        R0(vh2Var);
        this.r0 = vh2Var;
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        boolean isFocused = this.r0.W0().isFocused();
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.l;
        fg3 fg3Var = eb6.a[4];
        gb6Var.a(fb6Var, Boolean.valueOf(isFocused));
        gb6Var.a(sa6.w, new y1(null, new i4(0, this, di2.class, "requestFocus", "requestFocus()Z", 0, 0, 5)));
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void L0() {
        lq3 lq3Var = this.p0;
        if (lq3Var != null) {
            lq3Var.b();
        }
        this.p0 = null;
    }

    public final void U0(r94 r94Var, t93 t93Var) {
        il1 il1Var;
        if (this.j0) {
            rc3 rc3Var = (rc3) ((o41) F0()).B.Z(vs0.h0);
            if (rc3Var != null) {
                il1Var = rc3Var.a0(new bi2(0, r94Var, t93Var));
            } else {
                il1Var = null;
            }
            hv.L(F0(), null, null, new u12(r94Var, t93Var, il1Var, (r41) null, 8), 3);
            return;
        }
        r94Var.b(t93Var);
    }

    public final void V0(r94 r94Var) {
        sg2 sg2Var;
        if (!nb3.k(this.m0, r94Var)) {
            r94 r94Var2 = this.m0;
            if (r94Var2 != null && (sg2Var = this.o0) != null) {
                r94Var2.b(new tg2(sg2Var));
            }
            this.o0 = null;
            this.m0 = r94Var;
        }
    }

    @Override // defpackage.ks2
    public final void d0(eg4 eg4Var) {
        this.q0 = eg4Var;
        if (this.r0.W0().isFocused()) {
            boolean z = eg4Var.Y0().j0;
            jd1 jd1Var = ei2.k0;
            if (z) {
                eg4 eg4Var2 = this.q0;
                if (eg4Var2 != null && eg4Var2.Y0().j0 && this.j0) {
                    ii2.t(this, jd1Var);
                }
            } else if (this.j0) {
                ii2.t(this, jd1Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dh5, java.lang.Object] */
    @Override // defpackage.gi4
    public final void l0() {
        ?? obj = new Object();
        jx2.B(this, new ci2(0, (Object) obj, this));
        lq3 lq3Var = (lq3) obj.A;
        if (this.r0.W0().isFocused()) {
            lq3 lq3Var2 = this.p0;
            if (lq3Var2 != null) {
                lq3Var2.b();
            }
            if (lq3Var != null) {
                lq3Var.a();
            } else {
                lq3Var = null;
            }
            this.p0 = lq3Var;
        }
    }

    @Override // defpackage.ub7
    public final Object n() {
        return s0;
    }
}
