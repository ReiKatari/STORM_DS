package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tr0  reason: default package */
/* loaded from: classes.dex */
public final class tr0 extends g0 {
    public ki2 G0;
    public boolean H0;
    public final o14 I0;
    public final o14 J0;
    public rp4 K0;
    public kd6 L0;
    public kd6 M0;
    public boolean N0;
    public boolean O0;
    public long P0;
    public boolean Q0;
    public oy2 R0;
    public kd6 S0;
    public kd6 T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public boolean X0;

    public tr0(ki2 ki2Var, ki2 ki2Var2, l14 l14Var, boolean z) {
        super(l14Var, null, false, z, null, null, ki2Var);
        this.G0 = ki2Var2;
        this.H0 = true;
        int i = rr3.a;
        this.I0 = new o14(6);
        this.J0 = new o14(6);
        this.P0 = -1L;
        this.W0 = -1L;
    }

    @Override // defpackage.wy2
    public final void E() {
        g1(true);
    }

    @Override // defpackage.wy2
    public final void L(sh shVar, lp4 lp4Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) shVar.c;
        b1();
        if (this.q0 && this.u0 == null) {
            ql2 ql2Var = new ql2(this);
            R0(ql2Var);
            this.u0 = ql2Var;
        }
        int i = 0;
        if (lp4Var == lp4.Main) {
            if (this.R0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (nk2.r((oy2) arrayList.get(i2))) {
                        oy2 oy2Var = (oy2) arrayList.get(0);
                        oy2Var.i = true;
                        this.R0 = oy2Var;
                        if (this.q0) {
                            kd6 kd6Var = this.T0;
                            if (kd6Var != null && kd6Var.d()) {
                                ((fa7) mh7.t(this, ov0.t)).getClass();
                                if (oy2Var.b - this.W0 < 40) {
                                    this.X0 = true;
                                    return;
                                }
                                this.U0 = true;
                                kd6 kd6Var2 = this.T0;
                                if (kd6Var2 != null) {
                                    kd6Var2.i(null);
                                }
                                this.T0 = null;
                            }
                            this.V0 = false;
                            Z0(oy2Var);
                            if (this.G0 != null) {
                                this.S0 = tq5.w(F0(), null, null, new sr0(this, null, 1), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            } else if (this.V0) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    oy2 oy2Var2 = (oy2) arrayList.get(i3);
                    if (!oy2Var2.h || oy2Var2.d) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            ((oy2) arrayList.get(i)).i = true;
                            i++;
                        }
                        return;
                    }
                }
                oy2 oy2Var3 = (oy2) arrayList.get(0);
                oy2Var3.i = true;
                long j = oy2Var3.b;
                oy2 oy2Var4 = this.R0;
                oy2Var4.getClass();
                h1(j, oy2Var4);
            } else {
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    oy2 oy2Var5 = (oy2) arrayList.get(i4);
                    if (oy2Var5.i || !oy2Var5.h || oy2Var5.d) {
                        float d = ((fa7) mh7.t(this, ov0.t)).d();
                        int size5 = arrayList.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            oy2 oy2Var6 = (oy2) arrayList.get(i5);
                            long j2 = oy2Var6.c;
                            oy2 oy2Var7 = this.R0;
                            oy2Var7.getClass();
                            if (Math.abs(mb4.c(mb4.d(j2, oy2Var7.c))) > d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (oy2Var6.i || z) {
                                g1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                oy2 oy2Var8 = (oy2) arrayList.get(0);
                oy2Var8.i = true;
                long j3 = oy2Var8.b;
                oy2 oy2Var9 = this.R0;
                oy2Var9.getClass();
                h1(j3, oy2Var9);
            }
        } else if (lp4Var == lp4.Final && this.R0 != null && !this.V0) {
            int size6 = arrayList.size();
            while (i < size6) {
                oy2 oy2Var10 = (oy2) arrayList.get(i);
                if (oy2Var10.i && oy2Var10 != this.R0) {
                    g1(true);
                    return;
                }
                i++;
            }
        }
    }

    @Override // defpackage.yy3
    public final void L0() {
        j1();
    }

    @Override // defpackage.g0, defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        boolean z;
        super.O(kp4Var, lp4Var, j);
        if (lp4Var == lp4.Main) {
            if (this.K0 == null) {
                if (xm6.e(kp4Var, true)) {
                    rp4 rp4Var = (rp4) kp4Var.a.get(0);
                    rp4Var.a();
                    this.K0 = rp4Var;
                    if (this.q0) {
                        kd6 kd6Var = this.M0;
                        if (kd6Var != null && kd6Var.d()) {
                            ((fa7) mh7.t(this, ov0.t)).getClass();
                            if (rp4Var.b - this.P0 < 40) {
                                this.Q0 = true;
                                return;
                            }
                            this.N0 = true;
                            kd6 kd6Var2 = this.M0;
                            if (kd6Var2 != null) {
                                kd6Var2.i(null);
                            }
                            this.M0 = null;
                        }
                        this.O0 = false;
                        a1(rp4Var);
                        if (this.G0 != null) {
                            this.L0 = tq5.w(F0(), null, null, new sr0(this, null, 0), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (kp4Var.c == 2) {
                z = true;
            } else {
                z = false;
            }
            List list = kp4Var.a;
            if (z && !this.O0 && this.q0 && this.G0 != null) {
                kd6 kd6Var3 = this.L0;
                if (kd6Var3 != null) {
                    kd6Var3.i(null);
                }
                this.L0 = null;
                ki2 ki2Var = this.G0;
                if (ki2Var != null) {
                    ki2Var.c();
                }
                if (this.H0) {
                    ((ho4) ((sp2) mh7.t(this, ov0.l))).a(0);
                }
                this.O0 = true;
            }
            if (this.O0) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!ve2.q((rp4) list.get(i))) {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((rp4) list.get(i2)).a();
                        }
                        return;
                    }
                }
                rp4 rp4Var2 = (rp4) list.get(0);
                rp4Var2.a();
                long j2 = rp4Var2.b;
                rp4 rp4Var3 = this.K0;
                rp4Var3.getClass();
                i1(j2, rp4Var3);
                return;
            }
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (!ve2.p((rp4) list.get(i3))) {
                    long W0 = W0(j);
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        rp4 rp4Var4 = (rp4) list.get(i4);
                        if (rp4Var4.b() || ve2.H(rp4Var4, j, W0)) {
                            g1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            rp4 rp4Var5 = (rp4) list.get(0);
            rp4Var5.a();
            long j3 = rp4Var5.b;
            rp4 rp4Var6 = this.K0;
            rp4Var6.getClass();
            i1(j3, rp4Var6);
        } else if (lp4Var == lp4.Final && this.K0 != null && !this.O0) {
            List list2 = kp4Var.a;
            int size5 = list2.size();
            for (int i5 = 0; i5 < size5; i5++) {
                rp4 rp4Var7 = (rp4) list2.get(i5);
                if (rp4Var7.b() && rp4Var7 != this.K0) {
                    g1(false);
                    return;
                }
            }
        }
    }

    @Override // defpackage.g0
    public final void U0(rz5 rz5Var) {
        if (this.G0 != null) {
            b5 b5Var = new b5(17, this);
            l93[] l93VarArr = pz5.a;
            rz5Var.b(dz5.c, new w1(null, b5Var));
        }
    }

    @Override // defpackage.g0
    public final void c1() {
        j1();
    }

    @Override // defpackage.g0
    public final boolean d1(KeyEvent keyEvent) {
        boolean z;
        long w = hi2.w(keyEvent);
        if (this.G0 != null) {
            o14 o14Var = this.I0;
            if (o14Var.d(w) == null) {
                o14Var.g(w, tq5.w(F0(), null, null, new sr0(this, null, 2), 3));
                z = true;
                rr0 rr0Var = (rr0) this.J0.d(w);
                return z;
            }
        }
        z = false;
        rr0 rr0Var2 = (rr0) this.J0.d(w);
        return z;
    }

    @Override // defpackage.g0
    public final void e1(KeyEvent keyEvent) {
        long w = hi2.w(keyEvent);
        o14 o14Var = this.I0;
        boolean z = false;
        if (o14Var.d(w) != null) {
            c63 c63Var = (c63) o14Var.d(w);
            if (c63Var != null) {
                if (c63Var.d()) {
                    c63Var.i(null);
                } else {
                    z = true;
                }
            }
            o14Var.f(w);
        }
        if (!z) {
            this.r0.c();
        }
    }

    public final void g1(boolean z) {
        if (z) {
            this.R0 = null;
            kd6 kd6Var = this.S0;
            if (kd6Var != null) {
                kd6Var.i(null);
            }
            this.S0 = null;
            kd6 kd6Var2 = this.T0;
            if (kd6Var2 != null) {
                kd6Var2.i(null);
            }
            this.T0 = null;
            this.U0 = false;
            this.V0 = false;
            this.W0 = -1L;
            this.X0 = false;
        } else {
            this.K0 = null;
            kd6 kd6Var3 = this.L0;
            if (kd6Var3 != null) {
                kd6Var3.i(null);
            }
            this.L0 = null;
            kd6 kd6Var4 = this.M0;
            if (kd6Var4 != null) {
                kd6Var4.i(null);
            }
            this.M0 = null;
            this.N0 = false;
            this.O0 = false;
            this.P0 = -1L;
            this.Q0 = false;
        }
        X0(z);
    }

    public final void h1(long j, oy2 oy2Var) {
        if (this.q0 && !this.X0) {
            Y0(oy2Var.c, true);
            this.W0 = j;
            if (!this.V0 && !this.U0) {
                this.r0.c();
            }
        }
        this.R0 = null;
        this.X0 = false;
        this.U0 = false;
        kd6 kd6Var = this.S0;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.S0 = null;
        this.V0 = false;
    }

    public final void i1(long j, rp4 rp4Var) {
        if (this.q0 && !this.Q0) {
            Y0(rp4Var.c, false);
            this.P0 = j;
            if (!this.O0 && !this.N0) {
                this.r0.c();
            }
        }
        this.K0 = null;
        this.Q0 = false;
        this.N0 = false;
        kd6 kd6Var = this.L0;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.L0 = null;
        this.O0 = false;
    }

    public final void j1() {
        char c;
        long j;
        long j2;
        char c2;
        o14 o14Var = this.I0;
        Object[] objArr = o14Var.c;
        long[] jArr = o14Var.a;
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
                            ((c63) objArr[(i << 3) + i3]).i(null);
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
        o14Var.a();
        o14 o14Var2 = this.J0;
        Object[] objArr2 = o14Var2.c;
        long[] jArr2 = o14Var2.a;
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
                            ((rr0) objArr2[(i4 << 3) + i6]).getClass();
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
        o14Var2.a();
    }

    @Override // defpackage.g0, defpackage.up4
    public final void q0() {
        super.q0();
        g1(false);
    }
}
