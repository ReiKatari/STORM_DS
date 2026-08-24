package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu0  reason: default package */
/* loaded from: classes.dex */
public final class gu0 extends h0 {
    public on2 H0;
    public boolean I0;
    public final u94 J0;
    public final u94 K0;
    public vy4 L0;
    public ap6 M0;
    public ap6 N0;
    public boolean O0;
    public boolean P0;
    public long Q0;
    public boolean R0;
    public s43 S0;
    public ap6 T0;
    public ap6 U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public boolean Y0;

    public gu0(on2 on2Var, on2 on2Var2, r94 r94Var, boolean z) {
        super(r94Var, null, false, z, null, null, on2Var);
        this.H0 = on2Var2;
        this.I0 = true;
        int i = wy3.a;
        this.J0 = new u94(6);
        this.K0 = new u94(6);
        this.Q0 = -1L;
        this.X0 = -1L;
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void I() {
        super.I();
        g1(false);
    }

    @Override // defpackage.z64
    public final void L0() {
        j1();
    }

    @Override // defpackage.h0
    public final void U0(gb6 gb6Var) {
        if (this.H0 != null) {
            a5 a5Var = new a5(this, 17);
            fg3[] fg3VarArr = eb6.a;
            gb6Var.a(sa6.c, new y1(null, a5Var));
        }
    }

    @Override // defpackage.h0
    public final void c1() {
        j1();
    }

    @Override // defpackage.h0
    public final boolean d1(KeyEvent keyEvent) {
        boolean z;
        long m = xk2.m(keyEvent);
        if (this.H0 != null) {
            u94 u94Var = this.J0;
            if (u94Var.d(m) == null) {
                u94Var.g(m, hv.L(F0(), null, null, new fu0(this, null, 2), 3));
                z = true;
                eu0 eu0Var = (eu0) this.K0.d(m);
                return z;
            }
        }
        z = false;
        eu0 eu0Var2 = (eu0) this.K0.d(m);
        return z;
    }

    @Override // defpackage.h0
    public final void e1(KeyEvent keyEvent) {
        long m = xk2.m(keyEvent);
        u94 u94Var = this.J0;
        boolean z = false;
        if (u94Var.d(m) != null) {
            rc3 rc3Var = (rc3) u94Var.d(m);
            if (rc3Var != null) {
                if (rc3Var.e()) {
                    rc3Var.h(null);
                } else {
                    z = true;
                }
            }
            u94Var.f(m);
        }
        if (!z) {
            this.s0.c();
        }
    }

    @Override // defpackage.a53
    public final void f0() {
        g1(true);
    }

    public final void g1(boolean z) {
        if (z) {
            this.S0 = null;
            ap6 ap6Var = this.T0;
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            this.T0 = null;
            ap6 ap6Var2 = this.U0;
            if (ap6Var2 != null) {
                ap6Var2.h(null);
            }
            this.U0 = null;
            this.V0 = false;
            this.W0 = false;
            this.X0 = -1L;
            this.Y0 = false;
        } else {
            this.L0 = null;
            ap6 ap6Var3 = this.M0;
            if (ap6Var3 != null) {
                ap6Var3.h(null);
            }
            this.M0 = null;
            ap6 ap6Var4 = this.N0;
            if (ap6Var4 != null) {
                ap6Var4.h(null);
            }
            this.N0 = null;
            this.O0 = false;
            this.P0 = false;
            this.Q0 = -1L;
            this.R0 = false;
        }
        X0(z);
    }

    public final void h1(long j, s43 s43Var) {
        if (this.r0 && !this.Y0) {
            Y0(s43Var.c, true);
            this.X0 = j;
            if (!this.W0 && !this.V0) {
                this.s0.c();
            }
        }
        this.S0 = null;
        this.Y0 = false;
        this.V0 = false;
        ap6 ap6Var = this.T0;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.T0 = null;
        this.W0 = false;
    }

    public final void i1(long j, vy4 vy4Var) {
        if (this.r0 && !this.R0) {
            Y0(vy4Var.c, false);
            this.Q0 = j;
            if (!this.P0 && !this.O0) {
                this.s0.c();
            }
        }
        this.L0 = null;
        this.R0 = false;
        this.O0 = false;
        ap6 ap6Var = this.M0;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.M0 = null;
        this.P0 = false;
    }

    public final void j1() {
        char c;
        long j;
        long j2;
        char c2;
        u94 u94Var = this.J0;
        Object[] objArr = u94Var.c;
        long[] jArr = u94Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((rc3) objArr[(i << 3) + i3]).h(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        u94Var.a();
        u94 u94Var2 = this.K0;
        Object[] objArr2 = u94Var2.c;
        long[] jArr2 = u94Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) >= j) {
                            j4 >>= 8;
                        } else {
                            ((eu0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
            }
        }
        u94Var2.a();
    }

    @Override // defpackage.a53
    public final void u(ei eiVar, py4 py4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) eiVar.L;
        b1();
        if (this.r0 && this.v0 == null) {
            vr2 vr2Var = new vr2(this);
            R0(vr2Var);
            this.v0 = vr2Var;
        }
        int i = 0;
        if (py4Var == py4.Main) {
            if (this.S0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (jx2.k((s43) arrayList.get(i2))) {
                        s43 s43Var = (s43) arrayList.get(0);
                        s43Var.i = true;
                        this.S0 = s43Var;
                        if (this.r0) {
                            ap6 ap6Var = this.U0;
                            if (ap6Var != null && ap6Var.e()) {
                                ((fo7) hf.K(this, ky0.t)).getClass();
                                if (s43Var.b - this.X0 < 40) {
                                    this.Y0 = true;
                                    return;
                                }
                                this.V0 = true;
                                ap6 ap6Var2 = this.U0;
                                if (ap6Var2 != null) {
                                    ap6Var2.h(null);
                                }
                                this.U0 = null;
                            }
                            this.W0 = false;
                            Z0(s43Var);
                            if (this.H0 != null) {
                                this.T0 = hv.L(F0(), null, null, new fu0(this, null, 1), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            } else if (this.W0) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    s43 s43Var2 = (s43) arrayList.get(i3);
                    if (!s43Var2.h || s43Var2.d) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            ((s43) arrayList.get(i)).i = true;
                            i++;
                        }
                        return;
                    }
                }
                s43 s43Var3 = (s43) arrayList.get(0);
                s43Var3.i = true;
                long j = s43Var3.b;
                s43 s43Var4 = this.S0;
                s43Var4.getClass();
                h1(j, s43Var4);
            } else {
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    s43 s43Var5 = (s43) arrayList.get(i4);
                    if (s43Var5.i || !s43Var5.h || s43Var5.d) {
                        float f = ((fo7) hf.K(this, ky0.t)).f();
                        int size5 = arrayList.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            s43 s43Var6 = (s43) arrayList.get(i5);
                            long j2 = s43Var6.c;
                            s43 s43Var7 = this.S0;
                            s43Var7.getClass();
                            if (Math.abs(jk4.d(jk4.e(j2, s43Var7.c))) > f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (s43Var6.i || z) {
                                g1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                s43 s43Var8 = (s43) arrayList.get(0);
                s43Var8.i = true;
                long j3 = s43Var8.b;
                s43 s43Var9 = this.S0;
                s43Var9.getClass();
                h1(j3, s43Var9);
            }
        } else if (py4Var == py4.Final && this.S0 != null && !this.W0) {
            int size6 = arrayList.size();
            while (i < size6) {
                s43 s43Var10 = (s43) arrayList.get(i);
                if (s43Var10.i && s43Var10 != this.S0) {
                    g1(true);
                    return;
                }
                i++;
            }
        }
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void w(oy4 oy4Var, py4 py4Var, long j) {
        boolean z;
        super.w(oy4Var, py4Var, j);
        if (py4Var == py4.Main) {
            if (this.L0 == null) {
                if (hz6.e(oy4Var, true)) {
                    vy4 vy4Var = (vy4) oy4Var.a.get(0);
                    vy4Var.a();
                    this.L0 = vy4Var;
                    if (this.r0) {
                        ap6 ap6Var = this.N0;
                        if (ap6Var != null && ap6Var.e()) {
                            ((fo7) hf.K(this, ky0.t)).getClass();
                            if (vy4Var.b - this.Q0 < 40) {
                                this.R0 = true;
                                return;
                            }
                            this.O0 = true;
                            ap6 ap6Var2 = this.N0;
                            if (ap6Var2 != null) {
                                ap6Var2.h(null);
                            }
                            this.N0 = null;
                        }
                        this.P0 = false;
                        a1(vy4Var);
                        if (this.H0 != null) {
                            this.M0 = hv.L(F0(), null, null, new fu0(this, null, 0), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (oy4Var.c == 2) {
                z = true;
            } else {
                z = false;
            }
            List list = oy4Var.a;
            if (z && !this.P0 && this.r0 && this.H0 != null) {
                ap6 ap6Var3 = this.M0;
                if (ap6Var3 != null) {
                    ap6Var3.h(null);
                }
                this.M0 = null;
                on2 on2Var = this.H0;
                if (on2Var != null) {
                    on2Var.c();
                }
                if (this.I0) {
                    ((lx4) ((tv2) hf.K(this, ky0.l))).a(0);
                }
                this.P0 = true;
            }
            if (this.P0) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!ej2.p((vy4) list.get(i))) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((vy4) list.get(i2)).a();
                        }
                        return;
                    }
                }
                vy4 vy4Var2 = (vy4) list.get(0);
                vy4Var2.a();
                long j2 = vy4Var2.b;
                vy4 vy4Var3 = this.L0;
                vy4Var3.getClass();
                i1(j2, vy4Var3);
                return;
            }
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (!ej2.o((vy4) list.get(i3))) {
                    long W0 = W0(j);
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        vy4 vy4Var4 = (vy4) list.get(i4);
                        if (vy4Var4.c() || ej2.K(vy4Var4, j, W0)) {
                            g1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            vy4 vy4Var5 = (vy4) list.get(0);
            vy4Var5.a();
            long j3 = vy4Var5.b;
            vy4 vy4Var6 = this.L0;
            vy4Var6.getClass();
            i1(j3, vy4Var6);
        } else if (py4Var == py4.Final && this.L0 != null && !this.P0) {
            List list2 = oy4Var.a;
            int size5 = list2.size();
            for (int i5 = 0; i5 < size5; i5++) {
                vy4 vy4Var7 = (vy4) list2.get(i5);
                if (vy4Var7.c() && vy4Var7 != this.L0) {
                    g1(false);
                    return;
                }
            }
        }
    }
}
