package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kd2  reason: default package */
/* loaded from: classes.dex */
public final class kd2 extends xc1 implements gz5, fm2, jv0, m94, zx6 {
    public static final so1 r0 = new so1(3);
    public l14 l0;
    public final mi2 m0;
    public bc2 n0;
    public mj3 o0;
    public m74 p0;
    public final ed2 q0;

    public kd2(l14 l14Var, int i, z zVar) {
        this.l0 = l14Var;
        this.m0 = zVar;
        ed2 ed2Var = new ed2(i, new h4(2, this, kd2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 4), 10);
        R0(ed2Var);
        this.q0 = ed2Var;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void L0() {
        mj3 mj3Var = this.o0;
        if (mj3Var != null) {
            mj3Var.b();
        }
        this.o0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n75] */
    @Override // defpackage.m94
    public final void Q() {
        ?? obj = new Object();
        nk2.Q(this, new jd2(0, (Object) obj, this));
        mj3 mj3Var = (mj3) obj.A;
        if (this.q0.W0().isFocused()) {
            mj3 mj3Var2 = this.o0;
            if (mj3Var2 != null) {
                mj3Var2.b();
            }
            if (mj3Var != null) {
                mj3Var.a();
            } else {
                mj3Var = null;
            }
            this.o0 = mj3Var;
        }
    }

    public final void U0(l14 l14Var, l33 l33Var) {
        eh1 eh1Var;
        if (this.i0) {
            c63 c63Var = (c63) ((g11) F0()).B.I(k45.d0);
            if (c63Var != null) {
                eh1Var = c63Var.R(new x(28, l14Var, l33Var));
            } else {
                eh1Var = null;
            }
            tq5.w(F0(), null, null, new wx1(l14Var, l33Var, eh1Var, (j11) null, 6), 3);
            return;
        }
        l14Var.b(l33Var);
    }

    public final void V0(l14 l14Var) {
        bc2 bc2Var;
        if (!b53.x(this.l0, l14Var)) {
            l14 l14Var2 = this.l0;
            if (l14Var2 != null && (bc2Var = this.n0) != null) {
                l14Var2.b(new cc2(bc2Var));
            }
            this.n0 = null;
            this.l0 = l14Var;
        }
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        boolean isFocused = this.q0.W0().isFocused();
        l93[] l93VarArr = pz5.a;
        qz5 qz5Var = mz5.l;
        l93 l93Var = pz5.a[4];
        rz5Var.b(qz5Var, Boolean.valueOf(isFocused));
        rz5Var.b(dz5.w, new w1(null, new i4(0, this, kd2.class, "requestFocus", "requestFocus()Z", 0, 0, 5)));
    }

    @Override // defpackage.zx6
    public final Object t() {
        return r0;
    }

    @Override // defpackage.fm2
    public final void y(m74 m74Var) {
        this.p0 = m74Var;
        if (this.q0.W0().isFocused()) {
            boolean z = m74Var.Y0().i0;
            hm1 hm1Var = ld2.j0;
            if (z) {
                m74 m74Var2 = this.p0;
                if (m74Var2 != null && m74Var2.Y0().i0 && this.i0) {
                    ve2.y(this, hm1Var);
                }
            } else if (this.i0) {
                ve2.y(this, hm1Var);
            }
        }
    }
}
