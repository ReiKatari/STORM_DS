package defpackage;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h0  reason: default package */
/* loaded from: classes.dex */
public abstract class h0 extends zg1 implements yy4, bh3, va6, ub7, fy0, gi4, a53, ur2 {
    public static final cs1 G0 = new cs1(21);
    public long A0;
    public l25 B0;
    public r94 C0;
    public boolean D0;
    public ap6 E0;
    public final cs1 F0;
    public r94 m0;
    public n43 n0;
    public boolean o0;
    public String p0;
    public mq5 q0;
    public boolean r0;
    public on2 s0;
    public final di2 t0;
    public n43 u0;
    public vr2 v0;
    public xg1 w0;
    public l25 x0;
    public oy2 y0;
    public final u94 z0;

    public h0(r94 r94Var, n43 n43Var, boolean z, boolean z2, String str, mq5 mq5Var, on2 on2Var) {
        this.m0 = r94Var;
        this.n0 = n43Var;
        this.o0 = z;
        this.p0 = str;
        this.q0 = mq5Var;
        this.r0 = z2;
        this.s0 = on2Var;
        this.t0 = new di2(r94Var, 0, new a0(1, this, h0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = wy3.a;
        this.z0 = new u94(6);
        this.A0 = 0L;
        r94 r94Var2 = this.m0;
        this.C0 = r94Var2;
        this.D0 = r94Var2 == null;
        this.F0 = G0;
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        mq5 mq5Var = this.q0;
        if (mq5Var != null) {
            eb6.d(gb6Var, mq5Var.a);
        }
        String str = this.p0;
        x xVar = new x(this, 1);
        fg3[] fg3VarArr = eb6.a;
        gb6Var.a(sa6.b, new y1(str, xVar));
        if (this.r0) {
            this.t0.A0(gb6Var);
        } else {
            gb6Var.a(bb6.j, jg7.a);
        }
        U0(gb6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.bh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(KeyEvent keyEvent) {
        boolean z;
        b1();
        long m = xk2.m(keyEvent);
        boolean z2 = this.r0;
        u94 u94Var = this.z0;
        if (z2 && xk2.u(keyEvent) == 2 && mb3.G(keyEvent)) {
            if (!u94Var.b(m)) {
                l25 l25Var = new l25(this.A0);
                u94Var.g(m, l25Var);
                if (this.m0 != null) {
                    hv.L(F0(), null, null, new f0(this, l25Var, null, 2), 3);
                }
                z = true;
            } else {
                z = false;
            }
            if (!d1(keyEvent) && !z) {
                return false;
            }
        } else {
            if (this.r0 && xk2.u(keyEvent) == 1 && mb3.G(keyEvent)) {
                l25 l25Var2 = (l25) u94Var.f(m);
                if (l25Var2 != null) {
                    if (this.m0 != null) {
                        hv.L(F0(), null, null, new f0(this, l25Var2, null, 3), 3);
                    }
                    e1(keyEvent);
                }
                if (l25Var2 != null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.va6
    public final boolean C0() {
        return true;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public void I() {
        oy2 oy2Var;
        r94 r94Var = this.m0;
        if (r94Var != null && (oy2Var = this.y0) != null) {
            r94Var.b(new py2(oy2Var));
        }
        this.y0 = null;
    }

    @Override // defpackage.z64
    public final void J0() {
        l0();
        if (!this.D0) {
            b1();
        }
        if (this.r0) {
            R0(this.t0);
        }
    }

    @Override // defpackage.z64
    public final void K0() {
        V0();
        if (this.C0 == null) {
            this.m0 = null;
        }
        xg1 xg1Var = this.w0;
        if (xg1Var != null) {
            S0(xg1Var);
        }
        this.w0 = null;
        vr2 vr2Var = this.v0;
        if (vr2Var != null) {
            S0(vr2Var);
        }
        this.v0 = null;
    }

    public final void V0() {
        r94 r94Var = this.m0;
        u94 u94Var = this.z0;
        if (r94Var != null) {
            l25 l25Var = this.x0;
            if (l25Var != null) {
                r94Var.b(new k25(l25Var));
            }
            l25 l25Var2 = this.B0;
            if (l25Var2 != null) {
                r94Var.b(new k25(l25Var2));
            }
            oy2 oy2Var = this.y0;
            if (oy2Var != null) {
                r94Var.b(new py2(oy2Var));
            }
            Object[] objArr = u94Var.c;
            long[] jArr = u94Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r94Var.b(new k25((l25) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        this.x0 = null;
        this.B0 = null;
        this.y0 = null;
        u94Var.a();
    }

    public final long W0(long j) {
        long v0 = nc1.f0(this).u0.v0(((fo7) hf.K(this, ky0.t)).d());
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (v0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (v0 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32);
    }

    public final void X0(boolean z) {
        l25 l25Var;
        il1 il1Var;
        r94 r94Var = this.m0;
        if (r94Var != null) {
            ap6 ap6Var = this.E0;
            if (ap6Var != null && ap6Var.e()) {
                ap6 ap6Var2 = this.E0;
                if (ap6Var2 != null) {
                    ap6Var2.h(null);
                }
            } else {
                if (z) {
                    l25Var = this.B0;
                } else {
                    l25Var = this.x0;
                }
                if (l25Var != null) {
                    k25 k25Var = new k25(l25Var);
                    rc3 rc3Var = (rc3) ((o41) F0()).B.Z(vs0.h0);
                    if (rc3Var != null) {
                        il1Var = rc3Var.a0(new y(0, r94Var, k25Var));
                    } else {
                        il1Var = null;
                    }
                    hv.L(F0(), null, null, new b0(r94Var, k25Var, il1Var, (r41) null, 0), 3);
                }
            }
            if (z) {
                this.B0 = null;
            } else {
                this.x0 = null;
            }
        }
    }

    public final void Y0(long j, boolean z) {
        l25 l25Var;
        r94 r94Var = this.m0;
        if (r94Var != null) {
            ap6 ap6Var = this.E0;
            if (ap6Var != null && ap6Var.e()) {
                ap6Var.h(null);
                hv.L(F0(), null, null, new c0(0, j, (r41) null, ap6Var, r94Var), 3);
            } else {
                if (z) {
                    l25Var = this.B0;
                } else {
                    l25Var = this.x0;
                }
                if (l25Var != null) {
                    hv.L(F0(), null, null, new d0(l25Var, r94Var, null), 3);
                }
            }
            if (z) {
                this.B0 = null;
            } else {
                this.x0 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zg5, java.lang.Object] */
    public final void Z0(s43 s43Var) {
        r94 r94Var = this.m0;
        if (r94Var != null) {
            l25 l25Var = new l25(s43Var.c);
            ?? obj = new Object();
            ii2.V(this, vr2.l0, new y00(3, new y(14, s43Var, obj)));
            if (!obj.A && !pr0.a(this)) {
                this.B0 = l25Var;
                hv.L(F0(), null, null, new d0(r94Var, l25Var, null, 1), 3);
                return;
            }
            this.E0 = hv.L(F0(), null, null, new e0(r94Var, l25Var, this, null, 0), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zg5, java.lang.Object] */
    public final void a1(vy4 vy4Var) {
        r94 r94Var = this.m0;
        if (r94Var != null) {
            l25 l25Var = new l25(vy4Var.c);
            ?? obj = new Object();
            ii2.V(this, vr2.l0, new y00(3, new y(15, vy4Var, obj)));
            if (!obj.A && !pr0.a(this)) {
                this.x0 = l25Var;
                hv.L(F0(), null, null, new d0(r94Var, l25Var, null, 2), 3);
                return;
            }
            this.E0 = hv.L(F0(), null, null, new e0(r94Var, l25Var, this, null, 1), 3);
        }
    }

    public final void b1() {
        n43 n43Var;
        if (this.w0 == null) {
            if (this.o0) {
                n43Var = this.u0;
            } else {
                n43Var = this.n0;
            }
            if (n43Var != null) {
                if (this.m0 == null) {
                    this.m0 = new r94();
                }
                this.t0.V0(this.m0);
                r94 r94Var = this.m0;
                r94Var.getClass();
                xg1 a = n43Var.a(r94Var);
                R0(a);
                this.w0 = a;
            }
        }
    }

    public abstract boolean d1(KeyEvent keyEvent);

    public abstract void e1(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
        if (r3.w0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(r94 r94Var, n43 n43Var, boolean z, boolean z2, String str, mq5 mq5Var, on2 on2Var) {
        boolean z3;
        boolean z4;
        xg1 xg1Var;
        boolean z5 = true;
        boolean z6 = false;
        if (!nb3.k(this.C0, r94Var)) {
            V0();
            this.C0 = r94Var;
            this.m0 = r94Var;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!nb3.k(this.n0, n43Var)) {
            this.n0 = n43Var;
            z3 = true;
        }
        if (this.o0 != z) {
            this.o0 = z;
            if (z) {
                l0();
            }
            z3 = true;
        }
        boolean z7 = this.r0;
        di2 di2Var = this.t0;
        if (z7 != z2) {
            if (z2) {
                R0(di2Var);
            } else {
                S0(di2Var);
                V0();
            }
            bl2.G(this);
            this.r0 = z2;
        }
        if (!nb3.k(this.p0, str)) {
            this.p0 = str;
            bl2.G(this);
        }
        if (!nb3.k(this.q0, mq5Var)) {
            this.q0 = mq5Var;
            bl2.G(this);
        }
        this.s0 = on2Var;
        boolean z8 = this.D0;
        r94 r94Var2 = this.C0;
        if (r94Var2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z8 != z4) {
            if (r94Var2 == null) {
                z6 = true;
            }
            this.D0 = z6;
            if (!z6) {
            }
        }
        z5 = z3;
        if (z5 && ((xg1Var = this.w0) != null || !this.D0)) {
            if (xg1Var != null) {
                S0(xg1Var);
            }
            this.w0 = null;
            b1();
        }
        di2Var.V0(this.m0);
    }

    @Override // defpackage.bh3
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.gi4
    public final void l0() {
        if (this.o0) {
            jx2.B(this, new x(this, 0));
        }
    }

    @Override // defpackage.ub7
    public final Object n() {
        return this.F0;
    }

    public void w(oy4 oy4Var, py4 py4Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.A0 = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        b1();
        if (this.r0) {
            if (this.v0 == null) {
                vr2 vr2Var = new vr2(this);
                R0(vr2Var);
                this.v0 = vr2Var;
            }
            if (py4Var == py4.Main) {
                int i = oy4Var.f;
                if (i == 4) {
                    hv.L(F0(), null, null, new g0(this, null, 0), 3);
                } else if (i == 5) {
                    hv.L(F0(), null, null, new g0(this, null, 1), 3);
                }
            }
        }
    }

    public void c1() {
    }

    public void U0(gb6 gb6Var) {
    }
}
