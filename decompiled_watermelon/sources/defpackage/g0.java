package defpackage;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g0  reason: default package */
/* loaded from: classes.dex */
public abstract class g0 extends xc1 implements up4, ia3, gz5, zx6, jv0, m94, wy2, pl2 {
    public static final y60 F0 = new y60(20);
    public jt4 A0;
    public l14 B0;
    public boolean C0;
    public kd6 D0;
    public final y60 E0;
    public l14 l0;
    public jy2 m0;
    public boolean n0;
    public String o0;
    public og5 p0;
    public boolean q0;
    public ki2 r0;
    public final kd2 s0;
    public jy2 t0;
    public ql2 u0;
    public vc1 v0;
    public jt4 w0;
    public ns2 x0;
    public final o14 y0;
    public long z0;

    public g0(l14 l14Var, jy2 jy2Var, boolean z, boolean z2, String str, og5 og5Var, ki2 ki2Var) {
        this.l0 = l14Var;
        this.m0 = jy2Var;
        this.n0 = z;
        this.o0 = str;
        this.p0 = og5Var;
        this.q0 = z2;
        this.r0 = ki2Var;
        this.s0 = new kd2(l14Var, 0, new z(1, this, g0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = rr3.a;
        this.y0 = new o14(6);
        this.z0 = 0L;
        l14 l14Var2 = this.l0;
        this.B0 = l14Var2;
        this.C0 = l14Var2 == null;
        this.E0 = F0;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.yy3
    public final void J0() {
        Q();
        if (!this.C0) {
            b1();
        }
        if (this.q0) {
            R0(this.s0);
        }
    }

    @Override // defpackage.yy3
    public final void K0() {
        V0();
        if (this.B0 == null) {
            this.l0 = null;
        }
        vc1 vc1Var = this.v0;
        if (vc1Var != null) {
            S0(vc1Var);
        }
        this.v0 = null;
        ql2 ql2Var = this.u0;
        if (ql2Var != null) {
            S0(ql2Var);
        }
        this.u0 = null;
    }

    public void O(kp4 kp4Var, lp4 lp4Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.z0 = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        b1();
        if (this.q0) {
            if (this.u0 == null) {
                ql2 ql2Var = new ql2(this);
                R0(ql2Var);
                this.u0 = ql2Var;
            }
            if (lp4Var == lp4.Main) {
                int i = kp4Var.f;
                if (i == 4) {
                    tq5.w(F0(), null, null, new f0(this, null, 0), 3);
                } else if (i == 5) {
                    tq5.w(F0(), null, null, new f0(this, null, 1), 3);
                }
            }
        }
    }

    @Override // defpackage.m94
    public final void Q() {
        if (this.n0) {
            nk2.Q(this, new w(this, 0));
        }
    }

    public final void V0() {
        l14 l14Var = this.l0;
        o14 o14Var = this.y0;
        if (l14Var != null) {
            jt4 jt4Var = this.w0;
            if (jt4Var != null) {
                l14Var.b(new it4(jt4Var));
            }
            jt4 jt4Var2 = this.A0;
            if (jt4Var2 != null) {
                l14Var.b(new it4(jt4Var2));
            }
            ns2 ns2Var = this.x0;
            if (ns2Var != null) {
                l14Var.b(new os2(ns2Var));
            }
            Object[] objArr = o14Var.c;
            long[] jArr = o14Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                l14Var.b(new it4((jt4) objArr[(i << 3) + i3]));
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
        this.w0 = null;
        this.A0 = null;
        this.x0 = null;
        o14Var.a();
    }

    public final long W0(long j) {
        long i0 = l.P(this).t0.i0(((fa7) mh7.t(this, ov0.t)).g());
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (i0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, Float.intBitsToFloat((int) (i0 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32);
    }

    public final void X0(boolean z) {
        jt4 jt4Var;
        eh1 eh1Var;
        l14 l14Var = this.l0;
        if (l14Var != null) {
            kd6 kd6Var = this.D0;
            if (kd6Var != null && kd6Var.d()) {
                kd6 kd6Var2 = this.D0;
                if (kd6Var2 != null) {
                    kd6Var2.i(null);
                }
            } else {
                if (z) {
                    jt4Var = this.A0;
                } else {
                    jt4Var = this.w0;
                }
                if (jt4Var != null) {
                    it4 it4Var = new it4(jt4Var);
                    c63 c63Var = (c63) ((g11) F0()).B.I(k45.d0);
                    if (c63Var != null) {
                        eh1Var = c63Var.R(new x(0, l14Var, it4Var));
                    } else {
                        eh1Var = null;
                    }
                    tq5.w(F0(), null, null, new a0(l14Var, it4Var, eh1Var, (j11) null, 0), 3);
                }
            }
            if (z) {
                this.A0 = null;
            } else {
                this.w0 = null;
            }
        }
    }

    public final void Y0(long j, boolean z) {
        jt4 jt4Var;
        l14 l14Var = this.l0;
        if (l14Var != null) {
            kd6 kd6Var = this.D0;
            if (kd6Var != null && kd6Var.d()) {
                kd6Var.i(null);
                tq5.w(F0(), null, null, new b0(0, j, (j11) null, kd6Var, l14Var), 3);
            } else {
                if (z) {
                    jt4Var = this.A0;
                } else {
                    jt4Var = this.w0;
                }
                if (jt4Var != null) {
                    tq5.w(F0(), null, null, new c0(jt4Var, l14Var, null), 3);
                }
            }
            if (z) {
                this.A0 = null;
            } else {
                this.w0 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j75, java.lang.Object] */
    public final void Z0(oy2 oy2Var) {
        l14 l14Var = this.l0;
        if (l14Var != null) {
            jt4 jt4Var = new jt4(oy2Var.c);
            ?? obj = new Object();
            ve2.W(this, ql2.k0, new hz(3, new x(15, oy2Var, obj)));
            if (!obj.A && !fp0.a(this)) {
                this.A0 = jt4Var;
                tq5.w(F0(), null, null, new c0(l14Var, jt4Var, null, 1), 3);
                return;
            }
            this.D0 = tq5.w(F0(), null, null, new d0(l14Var, jt4Var, this, null, 0), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j75, java.lang.Object] */
    public final void a1(rp4 rp4Var) {
        l14 l14Var = this.l0;
        if (l14Var != null) {
            jt4 jt4Var = new jt4(rp4Var.c);
            ?? obj = new Object();
            ve2.W(this, ql2.k0, new hz(3, new x(16, rp4Var, obj)));
            if (!obj.A && !fp0.a(this)) {
                this.w0 = jt4Var;
                tq5.w(F0(), null, null, new c0(l14Var, jt4Var, null, 2), 3);
                return;
            }
            this.D0 = tq5.w(F0(), null, null, new d0(l14Var, jt4Var, this, null, 1), 3);
        }
    }

    public final void b1() {
        jy2 jy2Var;
        if (this.v0 == null) {
            if (this.n0) {
                jy2Var = this.t0;
            } else {
                jy2Var = this.m0;
            }
            if (jy2Var != null) {
                if (this.l0 == null) {
                    this.l0 = new l14();
                }
                this.s0.V0(this.l0);
                l14 l14Var = this.l0;
                l14Var.getClass();
                vc1 a = jy2Var.a(l14Var);
                R0(a);
                this.v0 = a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.ia3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.b1()
            long r0 = defpackage.hi2.w(r12)
            boolean r2 = r11.q0
            r3 = 3
            r4 = 0
            o14 r5 = r11.y0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.hi2.C(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = defpackage.a53.M(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            jt4 r2 = new jt4
            long r9 = r11.z0
            r2.<init>(r9)
            r5.g(r0, r2)
            l14 r0 = r11.l0
            if (r0 == 0) goto L3e
            o31 r0 = r11.F0()
            e0 r1 = new e0
            r1.<init>(r11, r2, r4, r8)
            defpackage.tq5.w(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.d1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.q0
            if (r2 == 0) goto L78
            int r2 = defpackage.hi2.C(r12)
            if (r2 != r6) goto L78
            boolean r2 = defpackage.a53.M(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            jt4 r0 = (defpackage.jt4) r0
            if (r0 == 0) goto L75
            l14 r1 = r11.l0
            if (r1 == 0) goto L72
            o31 r1 = r11.F0()
            e0 r2 = new e0
            r2.<init>(r11, r0, r4, r3)
            defpackage.tq5.w(r1, r4, r4, r2, r3)
        L72:
            r11.e1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0.c0(android.view.KeyEvent):boolean");
    }

    public abstract boolean d1(KeyEvent keyEvent);

    public abstract void e1(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
        if (r3.v0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1(defpackage.l14 r4, defpackage.jy2 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.og5 r9, defpackage.ki2 r10) {
        /*
            r3 = this;
            l14 r0 = r3.B0
            boolean r0 = defpackage.b53.x(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.V0()
            r3.B0 = r4
            r3.l0 = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            jy2 r0 = r3.m0
            boolean r0 = defpackage.b53.x(r0, r5)
            if (r0 != 0) goto L1f
            r3.m0 = r5
            r4 = r1
        L1f:
            boolean r5 = r3.n0
            if (r5 == r6) goto L2b
            r3.n0 = r6
            if (r6 == 0) goto L2a
            r3.Q()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.q0
            kd2 r6 = r3.s0
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.R0(r6)
            goto L3d
        L37:
            r3.S0(r6)
            r3.V0()
        L3d:
            defpackage.nl2.M(r3)
            r3.q0 = r7
        L42:
            java.lang.String r5 = r3.o0
            boolean r5 = defpackage.b53.x(r5, r8)
            if (r5 != 0) goto L4f
            r3.o0 = r8
            defpackage.nl2.M(r3)
        L4f:
            og5 r5 = r3.p0
            boolean r5 = defpackage.b53.x(r5, r9)
            if (r5 != 0) goto L5c
            r3.p0 = r9
            defpackage.nl2.M(r3)
        L5c:
            r3.r0 = r10
            boolean r5 = r3.C0
            l14 r7 = r3.B0
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.C0 = r2
            if (r2 != 0) goto L75
            vc1 r5 = r3.v0
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            vc1 r4 = r3.v0
            if (r4 != 0) goto L80
            boolean r5 = r3.C0
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.S0(r4)
        L85:
            r4 = 0
            r3.v0 = r4
            r3.b1()
        L8b:
            l14 r3 = r3.l0
            r6.V0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0.f1(l14, jy2, boolean, boolean, java.lang.String, og5, ki2):void");
    }

    @Override // defpackage.ia3
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        og5 og5Var = this.p0;
        if (og5Var != null) {
            pz5.d(rz5Var, og5Var.a);
        }
        String str = this.o0;
        w wVar = new w(this, 1);
        l93[] l93VarArr = pz5.a;
        rz5Var.b(dz5.b, new w1(str, wVar));
        if (this.q0) {
            this.s0.p0(rz5Var);
        } else {
            rz5Var.b(mz5.j, o27.a);
        }
        U0(rz5Var);
    }

    public void q0() {
        ns2 ns2Var;
        l14 l14Var = this.l0;
        if (l14Var != null && (ns2Var = this.x0) != null) {
            l14Var.b(new os2(ns2Var));
        }
        this.x0 = null;
    }

    @Override // defpackage.zx6
    public final Object t() {
        return this.E0;
    }

    @Override // defpackage.gz5
    public final boolean t0() {
        return true;
    }

    public void c1() {
    }

    public void U0(rz5 rz5Var) {
    }
}
