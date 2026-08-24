package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e86  reason: default package */
/* loaded from: classes.dex */
public final class e86 extends yn1 implements bh3, va6 {
    public sg F0;
    public sd2 G0;
    public final eb H0;
    public final wd1 I0;
    public final m86 J0;
    public final g60 K0;
    public final vh2 L0;
    public final p31 M0;
    public y36 N0;
    public c86 O0;
    public m84 P0;
    public z87 Q0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [w70, xg1, z64] */
    /* JADX WARN: Type inference failed for: r10v0, types: [e86, zg1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sd2] */
    public e86(sg sgVar, z70 z70Var, sd2 sd2Var, r94 r94Var, lo4 lo4Var, f86 f86Var, boolean z, boolean z2) {
        super(y76.a, z, r94Var, lo4Var);
        wd1 wd1Var;
        this.F0 = sgVar;
        this.G0 = sd2Var;
        eb ebVar = new eb(14);
        this.H0 = ebVar;
        wd1 wd1Var2 = new wd1(new oc1(new s35((qh1) y76.d)));
        this.I0 = wd1Var2;
        sg sgVar2 = this.F0;
        ?? r1 = this.G0;
        if (r1 == 0) {
            wd1Var = wd1Var2;
        } else {
            wd1Var = r1;
        }
        m86 m86Var = new m86(f86Var, sgVar2, wd1Var, lo4Var, z2, ebVar, this, new a86(this, 0));
        this.J0 = m86Var;
        g60 g60Var = new g60(z, m86Var);
        this.K0 = g60Var;
        vh2 vh2Var = new vh2(2, null, 10);
        R0(vh2Var);
        this.L0 = vh2Var;
        p31 p31Var = new p31(lo4Var, m86Var, z2, z70Var, new a86(this, 1));
        R0(p31Var);
        this.M0 = p31Var;
        R0(new ge4(g60Var, ebVar));
        ?? z64Var = new z64();
        z64Var.k0 = p31Var;
        R0(z64Var);
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        if (this.o0 && (this.N0 == null || this.O0 == null)) {
            this.N0 = new y36(this, 1);
            this.O0 = new c86(this, null);
        }
        y36 y36Var = this.N0;
        if (y36Var != null) {
            fg3[] fg3VarArr = eb6.a;
            gb6Var.a(sa6.d, new y1(null, y36Var));
        }
        c86 c86Var = this.O0;
        if (c86Var != null) {
            fg3[] fg3VarArr2 = eb6.a;
            gb6Var.a(sa6.e, c86Var);
        }
    }

    @Override // defpackage.bh3
    public final boolean B(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.o0 || ((!kg3.a(xk2.m(keyEvent), kg3.G) && !kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.F)) || xk2.u(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.J0.d == lo4.Vertical) {
            z = true;
        }
        p31 p31Var = this.M0;
        if (z) {
            int S0 = (int) (p31Var.S0() & 4294967295L);
            if (kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.F)) {
                f2 = S0;
            } else {
                f2 = -S0;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
        } else {
            int S02 = (int) (p31Var.S0() >> 32);
            if (kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.F)) {
                f = S02;
            } else {
                f = -S02;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        hv.L(F0(), null, null, new c86(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.z64
    public final void J0() {
        if (this.j0) {
            qh1 qh1Var = nc1.f0(this).u0;
            wd1 wd1Var = this.I0;
            wd1Var.getClass();
            wd1Var.a = new oc1(new s35(qh1Var));
        }
        m84 m84Var = this.P0;
        if (m84Var != null) {
            m84Var.c = nc1.f0(this).u0;
        }
        z87 z87Var = this.Q0;
        if (z87Var != null) {
            z87Var.c = nc1.f0(this).u0;
        }
    }

    @Override // defpackage.yn1
    public final Object Y0(xn1 xn1Var, xn1 xn1Var2) {
        xa4 xa4Var = xa4.UserInput;
        m86 m86Var = this.J0;
        Object f = m86Var.f(xa4Var, new vy5(xn1Var, m86Var, (r41) null, 3), xn1Var2);
        if (f == x61.COROUTINE_SUSPENDED) {
            return f;
        }
        return jg7.a;
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
        I();
        if (this.j0) {
            qh1 qh1Var = nc1.f0(this).u0;
            wd1 wd1Var = this.I0;
            wd1Var.getClass();
            wd1Var.a = new oc1(new s35(qh1Var));
        }
        m84 m84Var = this.P0;
        if (m84Var != null) {
            m84Var.c = nc1.f0(this).u0;
        }
        z87 z87Var = this.Q0;
        if (z87Var != null) {
            z87Var.c = nc1.f0(this).u0;
        }
    }

    @Override // defpackage.yn1
    public final void e1(hn1 hn1Var) {
        hv.L(this.H0.D(), null, null, new bf4(hn1Var, this, null, 15), 3);
    }

    @Override // defpackage.yn1
    public final boolean j1() {
        float f;
        float f2;
        float f3;
        float f4;
        m86 m86Var = this.J0;
        if (!m86Var.a.a()) {
            sg sgVar = m86Var.b;
            if (sgVar != null) {
                mr1 mr1Var = sgVar.c;
                EdgeEffect edgeEffect = mr1Var.d;
                if (edgeEffect != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f4 = up.e(edgeEffect);
                    } else {
                        f4 = 0.0f;
                    }
                    if (f4 != RecyclerView.B1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect2 = mr1Var.e;
                if (edgeEffect2 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f3 = up.e(edgeEffect2);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f3 != RecyclerView.B1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect3 = mr1Var.f;
                if (edgeEffect3 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f2 = up.e(edgeEffect3);
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != RecyclerView.B1) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect4 = mr1Var.g;
                if (edgeEffect4 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f = up.e(edgeEffect4);
                    } else {
                        f = 0.0f;
                    }
                    if (f == RecyclerView.B1) {
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

    @Override // defpackage.bh3
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    public final void m1(sg sgVar, z70 z70Var, sd2 sd2Var, r94 r94Var, lo4 lo4Var, f86 f86Var, boolean z, boolean z2) {
        boolean z3;
        sd2 sd2Var2;
        boolean z4 = true;
        boolean z5 = false;
        if (this.o0 != z) {
            this.K0.A = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (sd2Var == null) {
            sd2Var2 = this.I0;
        } else {
            sd2Var2 = sd2Var;
        }
        m86 m86Var = this.J0;
        if (!nb3.k(m86Var.a, f86Var)) {
            m86Var.a = f86Var;
            z5 = true;
        }
        m86Var.b = sgVar;
        if (m86Var.d != lo4Var) {
            m86Var.d = lo4Var;
            z5 = true;
        }
        if (m86Var.e != z2) {
            m86Var.e = z2;
        } else {
            z4 = z5;
        }
        m86Var.c = sd2Var2;
        m86Var.f = this.H0;
        p31 p31Var = this.M0;
        p31Var.k0 = lo4Var;
        p31Var.m0 = z2;
        p31Var.n0 = z70Var;
        this.F0 = sgVar;
        this.G0 = sd2Var;
        r76 r76Var = y76.a;
        lo4 lo4Var2 = m86Var.d;
        lo4 lo4Var3 = lo4.Vertical;
        if (lo4Var2 != lo4Var3) {
            lo4Var3 = lo4.Horizontal;
        }
        l1(r76Var, z, r94Var, lo4Var3, z4);
        if (z3) {
            this.N0 = null;
            this.O0 = null;
            bl2.G(this);
        }
    }

    @Override // defpackage.yn1, defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        int i;
        int i2;
        List list = oy4Var.a;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            } else if (((Boolean) this.n0.g(new bz4(((vy4) list.get(i3)).i))).booleanValue()) {
                super.w(oy4Var, py4Var, j);
                break;
            } else {
                i3++;
            }
        }
        if (this.q0 == null) {
            vr2 vr2Var = new vr2(this);
            R0(vr2Var);
            this.q0 = vr2Var;
        }
        if (this.o0) {
            py4 py4Var2 = py4.Initial;
            m86 m86Var = this.J0;
            if (py4Var == py4Var2 && oy4Var.f == 6) {
                if (this.P0 == null) {
                    this.P0 = new m84(m86Var, new os0(ViewConfiguration.get(jw2.z(this).getContext()), 8), new yv0(2, this, e86.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 3), nc1.f0(this).u0);
                }
                m84 m84Var = this.P0;
                if (m84Var != null) {
                    w61 F0 = F0();
                    if (m84Var.h == null) {
                        m84Var.h = hv.L(F0, null, null, new xd1(m84Var, null, 28), 3);
                    }
                }
            }
            m84 m84Var2 = this.P0;
            if (m84Var2 != null && oy4Var.f == 6) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        if (((vy4) list.get(i4)).c()) {
                            break;
                        }
                        i4++;
                    } else {
                        if (py4Var == py4.Initial && m84Var2.d) {
                            m84Var2.f(oy4Var);
                            ng4.a(oy4Var);
                        }
                        if (py4Var == py4.Main && !m84Var2.d && m84Var2.f(oy4Var)) {
                            ng4.a(oy4Var);
                        }
                    }
                }
            }
            if (py4Var == py4.Initial && ((i2 = oy4Var.f) == 10 || i2 == 11 || i2 == 12)) {
                if (this.Q0 == null) {
                    i = 10;
                    this.Q0 = new z87(m86Var, new yv0(2, this, e86.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 4), nc1.f0(this).u0);
                } else {
                    i = 10;
                }
                z87 z87Var = this.Q0;
                if (z87Var != null) {
                    w61 F02 = F0();
                    if (z87Var.g == null) {
                        z87Var.g = hv.L(F02, null, null, new kp5(z87Var, null), 3);
                    }
                }
            } else {
                i = 10;
            }
            z87 z87Var2 = this.Q0;
            if (z87Var2 != null) {
                int i5 = oy4Var.f;
                if (i5 == i || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((vy4) list.get(i6)).c()) {
                            return;
                        }
                    }
                    if (py4Var == py4.Initial && z87Var2.d) {
                        z87Var2.d(oy4Var);
                        ng4.a(oy4Var);
                    }
                    if (py4Var == py4.Main && !z87Var2.d && z87Var2.d(oy4Var)) {
                        ng4.a(oy4Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.yn1
    public final void d1(long j) {
    }
}
