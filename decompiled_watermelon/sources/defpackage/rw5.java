package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rw5  reason: default package */
/* loaded from: classes.dex */
public final class rw5 extends sj1 implements ia3, gz5 {
    public eg E0;
    public a92 F0;
    public final q9 G0;
    public final aa1 H0;
    public final ax5 I0;
    public final i40 J0;
    public final ed2 K0;
    public final k01 L0;
    public bt5 M0;
    public pw5 N0;
    public h04 O0;
    public mw6 P0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [yy3, vc1, s50] */
    /* JADX WARN: Type inference failed for: r10v0, types: [rw5, xc1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a92] */
    public rw5(eg egVar, v50 v50Var, a92 a92Var, l14 l14Var, jf4 jf4Var, sw5 sw5Var, boolean z, boolean z2) {
        super(lw5.a, z, l14Var, jf4Var);
        aa1 aa1Var;
        this.E0 = egVar;
        this.F0 = a92Var;
        q9 q9Var = new q9(14);
        this.G0 = q9Var;
        aa1 aa1Var2 = new aa1(new x81(new dz4((od1) lw5.d)));
        this.H0 = aa1Var2;
        eg egVar2 = this.E0;
        ?? r1 = this.F0;
        if (r1 == 0) {
            aa1Var = aa1Var2;
        } else {
            aa1Var = r1;
        }
        ax5 ax5Var = new ax5(sw5Var, egVar2, aa1Var, jf4Var, z2, q9Var, this, new nw5(this, 0));
        this.I0 = ax5Var;
        i40 i40Var = new i40(z, ax5Var);
        this.J0 = i40Var;
        ed2 ed2Var = new ed2(2, null, 10);
        R0(ed2Var);
        this.K0 = ed2Var;
        k01 k01Var = new k01(jf4Var, ax5Var, z2, v50Var, new nw5(this, 1));
        R0(k01Var);
        this.L0 = k01Var;
        R0(new a64(i40Var, q9Var));
        ?? yy3Var = new yy3();
        yy3Var.j0 = k01Var;
        R0(yy3Var);
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        if (this.i0) {
            od1 od1Var = l.P(this).t0;
            aa1 aa1Var = this.H0;
            aa1Var.getClass();
            aa1Var.a = new x81(new dz4(od1Var));
        }
        h04 h04Var = this.O0;
        if (h04Var != null) {
            h04Var.c = l.P(this).t0;
        }
        mw6 mw6Var = this.P0;
        if (mw6Var != null) {
            mw6Var.c = l.P(this).t0;
        }
    }

    @Override // defpackage.sj1, defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        int i;
        int i2;
        List list = kp4Var.a;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            } else if (((Boolean) this.m0.n(new xp4(((rp4) list.get(i3)).i))).booleanValue()) {
                super.O(kp4Var, lp4Var, j);
                break;
            } else {
                i3++;
            }
        }
        if (this.p0 == null) {
            ql2 ql2Var = new ql2(this);
            R0(ql2Var);
            this.p0 = ql2Var;
        }
        if (this.n0) {
            lp4 lp4Var2 = lp4.Initial;
            ax5 ax5Var = this.I0;
            if (lp4Var == lp4Var2 && kp4Var.f == 6) {
                if (this.O0 == null) {
                    this.O0 = new h04(ax5Var, new bq0(8, ViewConfiguration.get(se.S(this).getContext())), new dt0(2, this, rw5.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 3), l.P(this).t0);
                }
                h04 h04Var = this.O0;
                if (h04Var != null) {
                    o31 F0 = F0();
                    if (h04Var.h == null) {
                        h04Var.h = tq5.w(F0, null, null, new ba1(h04Var, null, 27), 3);
                    }
                }
            }
            h04 h04Var2 = this.O0;
            if (h04Var2 != null && kp4Var.f == 6) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        if (((rp4) list.get(i4)).b()) {
                            break;
                        }
                        i4++;
                    } else {
                        if (lp4Var == lp4.Initial && h04Var2.d) {
                            h04Var2.f(kp4Var);
                            w74.a(kp4Var);
                        }
                        if (lp4Var == lp4.Main && !h04Var2.d && h04Var2.f(kp4Var)) {
                            w74.a(kp4Var);
                        }
                    }
                }
            }
            if (lp4Var == lp4.Initial && ((i2 = kp4Var.f) == 10 || i2 == 11 || i2 == 12)) {
                if (this.P0 == null) {
                    i = 10;
                    this.P0 = new mw6(ax5Var, new dt0(2, this, rw5.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 4), l.P(this).t0);
                } else {
                    i = 10;
                }
                mw6 mw6Var = this.P0;
                if (mw6Var != null) {
                    o31 F02 = F0();
                    if (mw6Var.g == null) {
                        mw6Var.g = tq5.w(F02, null, null, new qk5(mw6Var, null), 3);
                    }
                }
            } else {
                i = 10;
            }
            mw6 mw6Var2 = this.P0;
            if (mw6Var2 != null) {
                int i5 = kp4Var.f;
                if (i5 == i || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((rp4) list.get(i6)).b()) {
                            return;
                        }
                    }
                    if (lp4Var == lp4.Initial && mw6Var2.d) {
                        mw6Var2.d(kp4Var);
                        w74.a(kp4Var);
                    }
                    if (lp4Var == lp4.Main && !mw6Var2.d && mw6Var2.d(kp4Var)) {
                        w74.a(kp4Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.sj1
    public final Object Y0(rj1 rj1Var, rj1 rj1Var2) {
        r24 r24Var = r24.UserInput;
        ax5 ax5Var = this.I0;
        Object f = ax5Var.f(r24Var, new wx1(rj1Var, ax5Var, null, 29), rj1Var2);
        if (f == p31.COROUTINE_SUSPENDED) {
            return f;
        }
        return o27.a;
    }

    @Override // defpackage.vc1
    public final void a() {
        q0();
        if (this.i0) {
            od1 od1Var = l.P(this).t0;
            aa1 aa1Var = this.H0;
            aa1Var.getClass();
            aa1Var.a = new x81(new dz4(od1Var));
        }
        h04 h04Var = this.O0;
        if (h04Var != null) {
            h04Var.c = l.P(this).t0;
        }
        mw6 mw6Var = this.P0;
        if (mw6Var != null) {
            mw6Var.c = l.P(this).t0;
        }
    }

    @Override // defpackage.ia3
    public final boolean c0(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.n0 || ((!r93.a(hi2.w(keyEvent), r93.G) && !r93.a(jk2.f(keyEvent.getKeyCode()), r93.F)) || hi2.C(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.I0.d == jf4.Vertical) {
            z = true;
        }
        k01 k01Var = this.L0;
        if (z) {
            int S0 = (int) (k01Var.S0() & 4294967295L);
            if (r93.a(jk2.f(keyEvent.getKeyCode()), r93.F)) {
                f2 = S0;
            } else {
                f2 = -S0;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
        } else {
            int S02 = (int) (k01Var.S0() >> 32);
            if (r93.a(jk2.f(keyEvent.getKeyCode()), r93.F)) {
                f = S02;
            } else {
                f = -S02;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        tq5.w(F0(), null, null, new pw5(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.sj1
    public final void e1(bj1 bj1Var) {
        tq5.w(this.G0.C(), null, null, new v74(bj1Var, this, null, 15), 3);
    }

    @Override // defpackage.sj1
    public final boolean j1() {
        float f;
        float f2;
        float f3;
        float f4;
        ax5 ax5Var = this.I0;
        if (!ax5Var.a.b()) {
            eg egVar = ax5Var.b;
            if (egVar != null) {
                gn1 gn1Var = egVar.c;
                EdgeEffect edgeEffect = gn1Var.d;
                if (edgeEffect != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f4 = ip.e(edgeEffect);
                    } else {
                        f4 = 0.0f;
                    }
                    if (f4 != RecyclerView.A1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect2 = gn1Var.e;
                if (edgeEffect2 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f3 = ip.e(edgeEffect2);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f3 != RecyclerView.A1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect3 = gn1Var.f;
                if (edgeEffect3 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f2 = ip.e(edgeEffect3);
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != RecyclerView.A1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect4 = gn1Var.g;
                if (edgeEffect4 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f = ip.e(edgeEffect4);
                    } else {
                        f = 0.0f;
                    }
                    if (f == RecyclerView.A1) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void m1(eg egVar, v50 v50Var, a92 a92Var, l14 l14Var, jf4 jf4Var, sw5 sw5Var, boolean z, boolean z2) {
        boolean z3;
        a92 a92Var2;
        boolean z4 = true;
        boolean z5 = false;
        if (this.n0 != z) {
            this.J0.A = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (a92Var == null) {
            a92Var2 = this.H0;
        } else {
            a92Var2 = a92Var;
        }
        ax5 ax5Var = this.I0;
        if (!b53.x(ax5Var.a, sw5Var)) {
            ax5Var.a = sw5Var;
            z5 = true;
        }
        ax5Var.b = egVar;
        if (ax5Var.d != jf4Var) {
            ax5Var.d = jf4Var;
            z5 = true;
        }
        if (ax5Var.e != z2) {
            ax5Var.e = z2;
        } else {
            z4 = z5;
        }
        ax5Var.c = a92Var2;
        ax5Var.f = this.G0;
        k01 k01Var = this.L0;
        k01Var.j0 = jf4Var;
        k01Var.l0 = z2;
        k01Var.m0 = v50Var;
        this.E0 = egVar;
        this.F0 = a92Var;
        fu5 fu5Var = lw5.a;
        jf4 jf4Var2 = ax5Var.d;
        jf4 jf4Var3 = jf4.Vertical;
        if (jf4Var2 != jf4Var3) {
            jf4Var3 = jf4.Horizontal;
        }
        l1(fu5Var, z, l14Var, jf4Var3, z4);
        if (z3) {
            this.M0 = null;
            this.N0 = null;
            nl2.M(this);
        }
    }

    @Override // defpackage.ia3
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        if (this.n0 && (this.M0 == null || this.N0 == null)) {
            this.M0 = new bt5(1, this);
            this.N0 = new pw5(this, null);
        }
        bt5 bt5Var = this.M0;
        if (bt5Var != null) {
            l93[] l93VarArr = pz5.a;
            rz5Var.b(dz5.d, new w1(null, bt5Var));
        }
        pw5 pw5Var = this.N0;
        if (pw5Var != null) {
            l93[] l93VarArr2 = pz5.a;
            rz5Var.b(dz5.e, pw5Var);
        }
    }

    @Override // defpackage.sj1
    public final void d1(long j) {
    }
}
