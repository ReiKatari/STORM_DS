package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m74  reason: default package */
/* loaded from: classes.dex */
public abstract class m74 extends fs3 implements mv3, rd3, xg4 {
    public static final rf5 J0 = new rf5();
    public static final rc3 K0 = new rc3();
    public static final float[] L0 = kv3.a();
    public static final j74 M0 = new Object();
    public static final jo1 N0 = new jo1(14);
    public boolean B0;
    public boolean C0;
    public pn2 D0;
    public oh0 E0;
    public ze F0;
    public boolean H0;
    public vg4 I0;
    public final vf3 j0;
    public boolean k0;
    public boolean l0;
    public m74 m0;
    public m74 n0;
    public boolean o0;
    public boolean p0;
    public mi2 q0;
    public od1 r0;
    public sd3 s0;
    public uv3 u0;
    public s14 v0;
    public float x0;
    public c24 y0;
    public rc3 z0;
    public float t0 = 0.8f;
    public long w0 = 0;
    public y26 A0 = iq2.g;
    public final l74 G0 = new l74(this, 1);

    public m74(vf3 vf3Var) {
        this.j0 = vf3Var;
        this.r0 = vf3Var.t0;
        this.s0 = vf3Var.u0;
    }

    public static m74 t1(rd3 rd3Var) {
        is3 is3Var;
        m74 m74Var;
        if (rd3Var instanceof is3) {
            is3Var = (is3) rd3Var;
        } else {
            is3Var = null;
        }
        if (is3Var != null && (m74Var = is3Var.A.j0) != null) {
            return m74Var;
        }
        rd3Var.getClass();
        return (m74) rd3Var;
    }

    @Override // defpackage.fs3
    public final boolean C0() {
        if (this.u0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xg4
    public final boolean D() {
        if (this.I0 != null && !this.o0 && this.j0.H()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rd3
    public final long E(long j) {
        if (!Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return R(me2.s(this), ((ee) yf3.a(this.j0)).D(j), true);
    }

    @Override // defpackage.fs3
    public final vf3 F0() {
        return this.j0;
    }

    @Override // defpackage.fs3
    public final uv3 G0() {
        uv3 uv3Var = this.u0;
        if (uv3Var != null) {
            return uv3Var;
        }
        i.n("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.rd3
    public final void H(float[] fArr) {
        wg4 a = yf3.a(this.j0);
        m74 t1 = t1(me2.s(this));
        w1(t1, fArr);
        if (a instanceof ee) {
            ((ee) a).q(fArr);
            return;
        }
        long a2 = t1.a(0L);
        if ((9223372034707292159L & a2) != 9205357640488583168L) {
            kv3.f(fArr, Float.intBitsToFloat((int) (a2 >> 32)), Float.intBitsToFloat((int) (a2 & 4294967295L)));
        }
    }

    @Override // defpackage.fs3
    public final fs3 H0() {
        return this.n0;
    }

    @Override // defpackage.fs3
    public final long I0() {
        return this.w0;
    }

    @Override // defpackage.rd3
    public final void K(rd3 rd3Var, float[] fArr) {
        m74 t1 = t1(rd3Var);
        t1.h1();
        m74 U0 = U0(t1);
        kv3.d(fArr);
        t1.w1(U0, fArr);
        v1(U0, fArr);
    }

    @Override // defpackage.rd3
    public final y55 L(rd3 rd3Var, boolean z) {
        if (!Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!rd3Var.c0()) {
            mz2.c("LayoutCoordinates " + rd3Var + " is not attached!");
        }
        m74 t1 = t1(rd3Var);
        t1.h1();
        m74 U0 = U0(t1);
        c24 c24Var = this.y0;
        if (c24Var == null) {
            c24Var = new c24();
            this.y0 = c24Var;
        }
        c24Var.a = RecyclerView.A1;
        c24Var.b = RecyclerView.A1;
        c24Var.c = (int) (rd3Var.O() >> 32);
        c24Var.d = (int) (rd3Var.O() & 4294967295L);
        while (t1 != U0) {
            t1.p1(c24Var, z, false);
            if (c24Var.b()) {
                return y55.e;
            }
            t1 = t1.n0;
            t1.getClass();
        }
        N0(U0, c24Var, z);
        return new y55(c24Var.a, c24Var.b, c24Var.c, c24Var.d);
    }

    @Override // defpackage.fs3
    public final void M0() {
        o0(this.w0, this.x0, this.q0);
    }

    public final void N0(m74 m74Var, c24 c24Var, boolean z) {
        if (m74Var != this) {
            m74 m74Var2 = this.n0;
            if (m74Var2 != null) {
                m74Var2.N0(m74Var, c24Var, z);
            }
            long j = this.w0;
            float f = (int) (j >> 32);
            c24Var.a -= f;
            c24Var.c -= f;
            float f2 = (int) (j & 4294967295L);
            c24Var.b -= f2;
            c24Var.d -= f2;
            vg4 vg4Var = this.I0;
            if (vg4Var != null) {
                tn2 tn2Var = (tn2) vg4Var;
                float[] a = tn2Var.a();
                if (!tn2Var.n0) {
                    if (a == null) {
                        c24Var.a = RecyclerView.A1;
                        c24Var.b = RecyclerView.A1;
                        c24Var.c = RecyclerView.A1;
                        c24Var.d = RecyclerView.A1;
                    } else {
                        kv3.c(a, c24Var);
                    }
                }
                if (this.p0 && z) {
                    long j2 = this.L;
                    c24Var.a(RecyclerView.A1, RecyclerView.A1, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    @Override // defpackage.rd3
    public final long O() {
        return this.L;
    }

    public final long O0(m74 m74Var, long j, boolean z) {
        if (m74Var == this) {
            return j;
        }
        m74 m74Var2 = this.n0;
        if (m74Var2 != null && !b53.x(m74Var, m74Var2)) {
            return V0(m74Var2.O0(m74Var, j, z), z);
        }
        return V0(j, z);
    }

    public final long P0(long j) {
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, (Float.intBitsToFloat((int) (j >> 32)) - l0()) / 2.0f)) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, (Float.intBitsToFloat((int) (j & 4294967295L)) - k0()) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.rd3
    public final long Q(long j) {
        if (!Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        h1();
        while (this != null) {
            vf3 vf3Var = this.j0;
            if (this == ((m74) vf3Var.A0.e) && !vf3Var.L) {
                long b = ((ee) yf3.a(vf3Var)).getRectManager().b(vf3Var);
                if (!a33.a(b, 9223372034707292159L)) {
                    return mj2.M(j, b);
                }
            }
            vg4 vg4Var = this.I0;
            if (vg4Var != null) {
                tn2 tn2Var = (tn2) vg4Var;
                float[] b2 = tn2Var.b();
                if (!tn2Var.n0) {
                    j = kv3.b(j, b2);
                }
            }
            j = mj2.M(j, this.w0);
            this = this.n0;
        }
        return j;
    }

    public final float Q0(long j, long j2) {
        float l0;
        float k0;
        if (l0() >= Float.intBitsToFloat((int) (j2 >> 32)) && k0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long P0 = P0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (P0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (P0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat3 < RecyclerView.A1) {
            l0 = -intBitsToFloat3;
        } else {
            l0 = intBitsToFloat3 - l0();
        }
        float max = Math.max((float) RecyclerView.A1, l0);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat4 < RecyclerView.A1) {
            k0 = -intBitsToFloat4;
        } else {
            k0 = intBitsToFloat4 - k0();
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.A1, k0)) & 4294967295L);
        if (intBitsToFloat > RecyclerView.A1 || intBitsToFloat2 > RecyclerView.A1) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i);
                    float intBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.rd3
    public final long R(rd3 rd3Var, long j, boolean z) {
        if (rd3Var instanceof is3) {
            is3 is3Var = (is3) rd3Var;
            is3Var.A.j0.h1();
            return is3Var.R(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        m74 t1 = t1(rd3Var);
        t1.h1();
        m74 U0 = U0(t1);
        while (t1 != U0) {
            vg4 vg4Var = t1.I0;
            if (vg4Var != null) {
                tn2 tn2Var = (tn2) vg4Var;
                float[] b = tn2Var.b();
                if (!tn2Var.n0) {
                    j = kv3.b(j, b);
                }
            }
            if (z || !t1.d0) {
                j = mj2.M(j, t1.w0);
            }
            t1 = t1.n0;
            t1.getClass();
        }
        return O0(U0, j, z);
    }

    public final void R0(oh0 oh0Var, pn2 pn2Var) {
        boolean z;
        vg4 vg4Var = this.I0;
        if (vg4Var != null) {
            tn2 tn2Var = (tn2) vg4Var;
            rh0 rh0Var = tn2Var.h0;
            tn2Var.g();
            if (tn2Var.A.a.I() > RecyclerView.A1) {
                z = true;
            } else {
                z = false;
            }
            tn2Var.o0 = z;
            os osVar = rh0Var.B;
            osVar.N(oh0Var);
            osVar.L = pn2Var;
            sn2.v(rh0Var, tn2Var.A);
            return;
        }
        long j = this.w0;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        oh0Var.g(f, f2);
        S0(oh0Var, pn2Var);
        oh0Var.g(-f, -f2);
    }

    public final void S0(oh0 oh0Var, pn2 pn2Var) {
        m74 m74Var;
        oh0 oh0Var2;
        pn2 pn2Var2;
        yy3 Z0 = Z0(4);
        if (Z0 == null) {
            n1(oh0Var, pn2Var);
            return;
        }
        vf3 vf3Var = this.j0;
        vf3Var.getClass();
        xf3 sharedDrawScope = ((ee) yf3.a(vf3Var)).getSharedDrawScope();
        long U = hk2.U(this.L);
        sharedDrawScope.getClass();
        o24 o24Var = null;
        while (Z0 != null) {
            if (Z0 instanceof gk1) {
                m74Var = this;
                oh0Var2 = oh0Var;
                pn2Var2 = pn2Var;
                sharedDrawScope.c(oh0Var2, U, m74Var, (gk1) Z0, pn2Var2);
            } else {
                m74Var = this;
                oh0Var2 = oh0Var;
                pn2Var2 = pn2Var;
                if ((Z0.L & 4) != 0 && (Z0 instanceof xc1)) {
                    int i = 0;
                    for (yy3 yy3Var = ((xc1) Z0).k0; yy3Var != null; yy3Var = yy3Var.Y) {
                        if ((yy3Var.L & 4) != 0) {
                            i++;
                            if (i == 1) {
                                Z0 = yy3Var;
                            } else {
                                if (o24Var == null) {
                                    o24Var = new o24(new yy3[16]);
                                }
                                if (Z0 != null) {
                                    o24Var.b(Z0);
                                    Z0 = null;
                                }
                                o24Var.b(yy3Var);
                            }
                        }
                    }
                    if (i == 1) {
                        oh0Var = oh0Var2;
                        this = m74Var;
                        pn2Var = pn2Var2;
                    }
                }
            }
            Z0 = l.p(o24Var);
            oh0Var = oh0Var2;
            this = m74Var;
            pn2Var = pn2Var2;
        }
    }

    public abstract void T0();

    public final m74 U0(m74 m74Var) {
        vf3 vf3Var = m74Var.j0;
        vf3 vf3Var2 = this.j0;
        if (vf3Var == vf3Var2) {
            yy3 Y0 = m74Var.Y0();
            yy3 Y02 = Y0();
            if (!Y02.A.i0) {
                mz2.c("visitLocalAncestors called on an unattached node");
            }
            for (yy3 yy3Var = Y02.A.X; yy3Var != null; yy3Var = yy3Var.X) {
                if ((yy3Var.L & 2) != 0 && yy3Var == Y0) {
                    return m74Var;
                }
            }
            return this;
        }
        while (vf3Var.k0 > vf3Var2.k0) {
            vf3Var = vf3Var.u();
            vf3Var.getClass();
        }
        vf3 vf3Var3 = vf3Var2;
        while (vf3Var3.k0 > vf3Var.k0) {
            vf3Var3 = vf3Var3.u();
            vf3Var3.getClass();
        }
        while (vf3Var != vf3Var3) {
            vf3Var = vf3Var.u();
            vf3Var3 = vf3Var3.u();
            if (vf3Var != null) {
                if (vf3Var3 == null) {
                }
            }
            i.i("layouts are not part of the same hierarchy");
            return null;
        }
        if (vf3Var3 != vf3Var2) {
            if (vf3Var != m74Var.j0) {
                return (vz2) vf3Var.A0.d;
            }
            return m74Var;
        }
        return this;
    }

    public final long V0(long j, boolean z) {
        if (z || !this.d0) {
            long j2 = this.w0;
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32))) << 32);
        }
        vg4 vg4Var = this.I0;
        if (vg4Var != null) {
            tn2 tn2Var = (tn2) vg4Var;
            float[] a = tn2Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!tn2Var.n0) {
                return kv3.b(j, a);
            }
        }
        return j;
    }

    public abstract hs3 W0();

    public final long X0() {
        return this.r0.i0(this.j0.v0.g());
    }

    public abstract yy3 Y0();

    public final yy3 Z0(int i) {
        boolean g = n74.g(i);
        yy3 Y0 = Y0();
        if (g || (Y0 = Y0.X) != null) {
            for (yy3 a1 = a1(g); a1 != null && (a1.R & i) != 0; a1 = a1.Y) {
                if ((a1.L & i) != 0) {
                    return a1;
                }
                if (a1 == Y0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.rd3
    public final long a(long j) {
        if (!Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ee) yf3.a(this.j0)).r(Q(j));
    }

    public final yy3 a1(boolean z) {
        yy3 Y0;
        zc0 zc0Var = this.j0.A0;
        if (((m74) zc0Var.e) == this) {
            return (yy3) zc0Var.g;
        }
        m74 m74Var = this.n0;
        if (z) {
            if (m74Var != null && (Y0 = m74Var.Y0()) != null) {
                return Y0.Y;
            }
            return null;
        } else if (m74Var != null) {
            return m74Var.Y0();
        } else {
            return null;
        }
    }

    @Override // defpackage.od1
    public final float b() {
        return this.j0.t0.b();
    }

    public final void b1(yy3 yy3Var, k74 k74Var, long j, yr2 yr2Var, int i, boolean z) {
        if (yy3Var == null) {
            e1(k74Var, j, yr2Var, i, z);
        } else if (!k74Var.g(yy3Var)) {
            b1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z);
        } else {
            int i2 = yr2Var.L;
            w14 w14Var = yr2Var.A;
            yr2Var.c(i2 + 1, w14Var.b);
            yr2Var.L++;
            w14Var.a(yy3Var);
            yr2Var.B.a(nk2.e(-1.0f, z, false));
            b1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z);
            yr2Var.L = i2;
        }
    }

    @Override // defpackage.rd3
    public final boolean c0() {
        return Y0().i0;
    }

    public final void c1(yy3 yy3Var, k74 k74Var, long j, yr2 yr2Var, int i, boolean z, float f) {
        if (yy3Var == null) {
            e1(k74Var, j, yr2Var, i, z);
        } else if (!k74Var.g(yy3Var)) {
            c1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f);
        } else {
            int i2 = yr2Var.L;
            w14 w14Var = yr2Var.A;
            yr2Var.c(i2 + 1, w14Var.b);
            yr2Var.L++;
            w14Var.a(yy3Var);
            yr2Var.B.a(nk2.e(f, z, false));
            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f, true);
            yr2Var.L = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (defpackage.f34.y(r18.b(), defpackage.nk2.e(r2, r7, false)) > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(defpackage.k74 r15, long r16, defpackage.yr2 r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.e()
            yy3 r1 = r14.Z0(r0)
            boolean r0 = r14.z1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.X0()
            float r0 = r14.Q0(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.L
            w14 r7 = r5.A
            int r7 = r7.b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = defpackage.nk2.e(r0, r8, r8)
            long r9 = r5.b()
            int r2 = defpackage.f34.y(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.c1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.e1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.l0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.k0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.b1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.X0()
            float r2 = r14.Q0(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.L
            w14 r9 = r5.A
            int r9 = r9.b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = defpackage.nk2.e(r2, r7, r8)
            long r12 = r5.b()
            int r9 = defpackage.f34.y(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.m1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m74.d1(k74, long, yr2, int, boolean):void");
    }

    public void e1(k74 k74Var, long j, yr2 yr2Var, int i, boolean z) {
        m74 m74Var = this.m0;
        if (m74Var != null) {
            m74Var.d1(k74Var, m74Var.V0(j, true), yr2Var, i, z);
        }
    }

    public final void f1() {
        vg4 vg4Var = this.I0;
        if (vg4Var != null) {
            ((tn2) vg4Var).c();
            return;
        }
        m74 m74Var = this.n0;
        if (m74Var != null) {
            m74Var.f1();
        }
    }

    public final boolean g1() {
        if (this.I0 != null && this.t0 <= RecyclerView.A1) {
            return true;
        }
        m74 m74Var = this.n0;
        if (m74Var != null) {
            return m74Var.g1();
        }
        return false;
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.j0.u0;
    }

    @Override // defpackage.rd3
    public final long h(long j) {
        if (!Y0().i0) {
            mz2.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        rd3 s = me2.s(this);
        ee eeVar = (ee) yf3.a(this.j0);
        eeVar.z();
        return R(s, mb4.d(kv3.b(j, eeVar.Y0), s.Q(0L)), true);
    }

    public final void h1() {
        this.j0.B0.b();
    }

    public final void i1() {
        mi2 mi2Var;
        yy3 yy3Var;
        boolean g = n74.g(128);
        yy3 a1 = a1(g);
        if (a1 != null && (a1.A.R & 128) != 0) {
            ga6 z = io2.z();
            if (z != null) {
                mi2Var = z.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z);
            try {
                if (g) {
                    yy3Var = Y0();
                } else {
                    yy3Var = Y0().X;
                    if (yy3Var == null) {
                    }
                }
                for (yy3 a12 = a1(g); a12 != null; a12 = a12.Y) {
                    if ((a12.R & 128) == 0) {
                        break;
                    }
                    if ((a12.L & 128) != 0) {
                        yy3 yy3Var2 = a12;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            if (yy3Var2 instanceof yv3) {
                                ((yv3) yy3Var2).c(this.L);
                            } else if ((yy3Var2.L & 128) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 128) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var2 = yy3Var3;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var2 != null) {
                                                o24Var.b(yy3Var2);
                                                yy3Var2 = null;
                                            }
                                            o24Var.b(yy3Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var2 = l.p(o24Var);
                        }
                    }
                    if (a12 == yy3Var) {
                        break;
                    }
                }
            } finally {
                io2.l0(z, Y, mi2Var);
            }
        }
    }

    public final void j1() {
        boolean g = n74.g(4194304);
        yy3 Y0 = Y0();
        if (g || (Y0 = Y0.X) != null) {
            for (yy3 a1 = a1(g); a1 != null && (a1.R & 4194304) != 0; a1 = a1.Y) {
                if ((a1.L & 4194304) != 0) {
                    yy3 yy3Var = a1;
                    o24 o24Var = null;
                    while (yy3Var != null) {
                        if (yy3Var instanceof sc3) {
                            ((sc3) yy3Var).s(this);
                        } else if ((yy3Var.L & 4194304) != 0 && (yy3Var instanceof xc1)) {
                            int i = 0;
                            for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                                if ((yy3Var2.L & 4194304) != 0) {
                                    i++;
                                    if (i == 1) {
                                        yy3Var = yy3Var2;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var != null) {
                                            o24Var.b(yy3Var);
                                            yy3Var = null;
                                        }
                                        o24Var.b(yy3Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        yy3Var = l.p(o24Var);
                    }
                }
                if (a1 == Y0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.rd3
    public final long k(long j) {
        long Q = Q(j);
        ee eeVar = (ee) yf3.a(this.j0);
        eeVar.z();
        return kv3.b(Q, eeVar.X0);
    }

    public final void k1() {
        this.o0 = true;
        this.G0.c();
        q1();
        if (!a33.a(this.w0, 0L)) {
            this.j0.N(this);
        }
    }

    @Override // defpackage.yn4, defpackage.mv3
    public final Object l() {
        vf3 vf3Var = this.j0;
        if (!vf3Var.A0.g(64)) {
            return null;
        }
        Y0();
        Object obj = null;
        for (yy3 yy3Var = (lm6) vf3Var.A0.f; yy3Var != null; yy3Var = yy3Var.X) {
            if ((yy3Var.L & 64) != 0) {
                yy3 yy3Var2 = yy3Var;
                o24 o24Var = null;
                while (yy3Var2 != null) {
                    if (yy3Var2 instanceof vj4) {
                        obj = ((vj4) yy3Var2).K(vf3Var.t0, obj);
                    } else if ((yy3Var2.L & 64) != 0 && (yy3Var2 instanceof xc1)) {
                        int i = 0;
                        for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                            if ((yy3Var3.L & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    yy3Var2 = yy3Var3;
                                } else {
                                    if (o24Var == null) {
                                        o24Var = new o24(new yy3[16]);
                                    }
                                    if (yy3Var2 != null) {
                                        o24Var.b(yy3Var2);
                                        yy3Var2 = null;
                                    }
                                    o24Var.b(yy3Var3);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    yy3Var2 = l.p(o24Var);
                }
            }
        }
        return obj;
    }

    public final void l1() {
        boolean g = n74.g(1048576);
        yy3 a1 = a1(g);
        if (a1 != null && (a1.A.R & 1048576) != 0) {
            yy3 Y0 = Y0();
            if (g || (Y0 = Y0.X) != null) {
                for (yy3 a12 = a1(g); a12 != null && (a12.R & 1048576) != 0; a12 = a12.Y) {
                    if ((a12.L & 1048576) != 0) {
                        yy3 yy3Var = a12;
                        o24 o24Var = null;
                        while (yy3Var != null) {
                            if ((yy3Var.L & 1048576) != 0 && (yy3Var instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                                    if ((yy3Var2.L & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var = yy3Var2;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var != null) {
                                                o24Var.b(yy3Var);
                                                yy3Var = null;
                                            }
                                            o24Var.b(yy3Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var = l.p(o24Var);
                        }
                    }
                    if (a12 == Y0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.rd3
    public final rd3 m() {
        boolean z = Y0().i0;
        vf3 vf3Var = this.j0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (vf3 vf3Var2 = vf3Var; vf3Var2 != null; vf3Var2 = vf3Var2.u()) {
                sb.append("\n|");
                sb.append(vf3Var2);
                sb.append(" isAttached=");
                sb.append(vf3Var2.H());
                sb.append(" modifier=");
                sb.append(vf3Var2.F0);
                sb.append(" tail=");
                sb.append(Y0());
            }
            mz2.c(sb.toString());
        }
        h1();
        return ((m74) vf3Var.A0.e).n0;
    }

    public final void m1(yy3 yy3Var, k74 k74Var, long j, yr2 yr2Var, int i, boolean z, float f, boolean z2) {
        int f2;
        int f3;
        if (yy3Var == null) {
            e1(k74Var, j, yr2Var, i, z);
        } else if (!k74Var.g(yy3Var)) {
            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f, z2);
        } else {
            int i2 = i;
            boolean z3 = z;
            char c = 3;
            if (i2 == 3 || i2 == 4) {
                yy3 yy3Var2 = yy3Var;
                o24 o24Var = null;
                while (true) {
                    if (yy3Var2 == null) {
                        break;
                    }
                    int i3 = 0;
                    if (yy3Var2 instanceof up4) {
                        long v = ((up4) yy3Var2).v();
                        int i4 = (int) (j >> 32);
                        float intBitsToFloat = Float.intBitsToFloat(i4);
                        vf3 vf3Var = this.j0;
                        sd3 sd3Var = vf3Var.u0;
                        int i5 = fw6.b;
                        int i6 = ((Long.MIN_VALUE & v) > 0L ? 1 : ((Long.MIN_VALUE & v) == 0L ? 0 : -1));
                        if (i6 != 0 && sd3Var != sd3.Ltr) {
                            f2 = so1.f(2, v);
                        } else {
                            f2 = so1.f(0, v);
                        }
                        if (intBitsToFloat >= (-f2)) {
                            float intBitsToFloat2 = Float.intBitsToFloat(i4);
                            int l0 = l0();
                            sd3 sd3Var2 = vf3Var.u0;
                            if (i6 != 0 && sd3Var2 != sd3.Ltr) {
                                f3 = so1.f(0, v);
                            } else {
                                f3 = so1.f(2, v);
                            }
                            if (intBitsToFloat2 < l0 + f3) {
                                int i7 = (int) (j & 4294967295L);
                                float intBitsToFloat3 = Float.intBitsToFloat(i7);
                                int i8 = fw6.b;
                                if (intBitsToFloat3 >= (-so1.f(1, v))) {
                                    if (Float.intBitsToFloat(i7) < so1.f(3, v) + k0()) {
                                        n14 n14Var = yr2Var.B;
                                        w14 w14Var = yr2Var.A;
                                        int i9 = yr2Var.L;
                                        int i10 = w14Var.b;
                                        if (i9 == i10 - 1) {
                                            yr2Var.c(i9 + 1, i10);
                                            yr2Var.L++;
                                            w14Var.a(yy3Var);
                                            n14Var.a(nk2.e(RecyclerView.A1, z3, true));
                                            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i2, z3, f, z2);
                                            yr2Var.L = i9;
                                            return;
                                        }
                                        long b = yr2Var.b();
                                        int i11 = yr2Var.L;
                                        if (f34.I(b)) {
                                            int i12 = w14Var.b;
                                            int i13 = i12 - 1;
                                            yr2Var.L = i13;
                                            yr2Var.c(i12, w14Var.b);
                                            yr2Var.L++;
                                            w14Var.a(yy3Var);
                                            n14Var.a(nk2.e(RecyclerView.A1, z3, true));
                                            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z3, f, z2);
                                            yr2Var.L = i13;
                                            if (f34.G(yr2Var.b()) < RecyclerView.A1) {
                                                yr2Var.c(i11 + 1, yr2Var.L + 1);
                                            }
                                            yr2Var.L = i11;
                                            return;
                                        } else if (f34.G(b) > RecyclerView.A1) {
                                            int i14 = yr2Var.L;
                                            yr2Var.c(i14 + 1, w14Var.b);
                                            yr2Var.L++;
                                            w14Var.a(yy3Var);
                                            n14Var.a(nk2.e(RecyclerView.A1, z3, true));
                                            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z3, f, z2);
                                            yr2Var.L = i14;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        char c2 = c;
                        if ((yy3Var2.L & 16) != 0 && (yy3Var2 instanceof xc1)) {
                            for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                if ((yy3Var3.L & 16) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var == null) {
                                            o24Var = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var.b(yy3Var3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                                i2 = i;
                                z3 = z;
                                c = c2;
                            }
                        }
                        yy3Var2 = l.p(o24Var);
                        i2 = i;
                        z3 = z;
                        c = c2;
                    }
                }
            }
            if (z2) {
                c1(yy3Var, k74Var, j, yr2Var, i, z, f);
            } else {
                s1(yy3Var, k74Var, j, yr2Var, i, z, f);
            }
        }
    }

    public abstract void n1(oh0 oh0Var, pn2 pn2Var);

    @Override // defpackage.od1
    public final float o() {
        return this.j0.t0.o();
    }

    public final void o1(long j, float f, mi2 mi2Var) {
        x1(mi2Var, false);
        boolean a = a33.a(this.w0, j);
        vf3 vf3Var = this.j0;
        if (!a) {
            ((ee) yf3.a(vf3Var)).J(-4.0f);
            this.w0 = j;
            vg4 vg4Var = this.I0;
            if (vg4Var != null) {
                ((tn2) vg4Var).d(j);
            } else {
                m74 m74Var = this.n0;
                if (m74Var != null) {
                    m74Var.f1();
                }
            }
            vf3Var.N(this);
            fs3.K0(this);
            wg4 wg4Var = vf3Var.j0;
            if (wg4Var != null) {
                ((ee) wg4Var).v(vf3Var);
            }
        }
        this.x0 = f;
        if (this == ((m74) vf3Var.A0.e)) {
            ((ee) yf3.a(vf3Var)).getRectManager().f(vf3Var);
        }
        if (!this.f0) {
            x0(G0());
        }
    }

    public final void p1(c24 c24Var, boolean z, boolean z2) {
        long j;
        vg4 vg4Var = this.I0;
        if (vg4Var != null) {
            if (this.p0) {
                if (z2) {
                    long X0 = X0();
                    float f = c24Var.a;
                    float f2 = c24Var.b;
                    if (c24Var.c >= RecyclerView.A1) {
                        long j2 = this.L;
                        if (f <= ((int) (j2 >> 32)) && c24Var.d >= RecyclerView.A1 && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (X0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (X0 & 4294967295L));
                            float f3 = (intBitsToFloat - (c24Var.c - c24Var.a)) / 2.0f;
                            if (f3 > RecyclerView.A1) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (c24Var.d - c24Var.b)) / 2.0f;
                            if (f5 > RecyclerView.A1) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.L;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (X0 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (X0 & 4294967295L);
                            c24Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.L;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (X0 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (X0 & 4294967295L);
                    c24Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.L;
                    c24Var.a(RecyclerView.A1, RecyclerView.A1, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (c24Var.b()) {
                    return;
                }
            }
            tn2 tn2Var = (tn2) vg4Var;
            float[] b = tn2Var.b();
            if (!tn2Var.n0) {
                if (b == null) {
                    c24Var.a = RecyclerView.A1;
                    c24Var.b = RecyclerView.A1;
                    c24Var.c = RecyclerView.A1;
                    c24Var.d = RecyclerView.A1;
                } else {
                    kv3.c(b, c24Var);
                }
            }
        }
        long j5 = this.w0;
        float f9 = (int) (j5 >> 32);
        c24Var.a += f9;
        c24Var.c += f9;
        float f10 = (int) (j5 & 4294967295L);
        c24Var.b += f10;
        c24Var.d += f10;
    }

    public final void q1() {
        if (this.I0 != null) {
            x1(null, false);
            this.j0.U(false);
        }
    }

    public final void r1(uv3 uv3Var) {
        m74 m74Var;
        uv3 uv3Var2 = this.u0;
        if (uv3Var != uv3Var2) {
            this.u0 = uv3Var;
            vf3 vf3Var = this.j0;
            int i = 0;
            if (uv3Var2 == null || uv3Var.c() != uv3Var2.c() || uv3Var.a() != uv3Var2.a()) {
                int c = uv3Var.c();
                int a = uv3Var.a();
                vg4 vg4Var = this.I0;
                if (vg4Var != null) {
                    ((tn2) vg4Var).e((c << 32) | (a & 4294967295L));
                } else if (vf3Var.I() && (m74Var = this.n0) != null) {
                    m74Var.f1();
                }
                p0((a & 4294967295L) | (c << 32));
                if (this.q0 != null) {
                    y1(false);
                }
                boolean g = n74.g(4);
                yy3 Y0 = Y0();
                if (g || (Y0 = Y0.X) != null) {
                    for (yy3 a1 = a1(g); a1 != null && (a1.R & 4) != 0; a1 = a1.Y) {
                        if ((a1.L & 4) != 0) {
                            yy3 yy3Var = a1;
                            o24 o24Var = null;
                            while (yy3Var != null) {
                                if (yy3Var instanceof gk1) {
                                    ((gk1) yy3Var).x0();
                                } else if ((yy3Var.L & 4) != 0 && (yy3Var instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var2 = ((xc1) yy3Var).k0; yy3Var2 != null; yy3Var2 = yy3Var2.Y) {
                                        if ((yy3Var2.L & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var = yy3Var2;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var != null) {
                                                    o24Var.b(yy3Var);
                                                    yy3Var = null;
                                                }
                                                o24Var.b(yy3Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var = l.p(o24Var);
                            }
                        }
                        if (a1 == Y0) {
                            break;
                        }
                    }
                }
                wg4 wg4Var = vf3Var.j0;
                if (wg4Var != null) {
                    ((ee) wg4Var).v(vf3Var);
                }
                vf3Var.N(this);
            }
            s14 s14Var = this.v0;
            if ((s14Var != null && s14Var.e != 0) || !uv3Var.e().isEmpty()) {
                s14 s14Var2 = this.v0;
                Map e = uv3Var.e();
                if (s14Var2 != null && s14Var2.e == e.size()) {
                    Object[] objArr = s14Var2.b;
                    int[] iArr = s14Var2.c;
                    long[] jArr = s14Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        loop0: while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = i; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i3 << 3) + i5;
                                        Object obj = objArr[i6];
                                        int i7 = iArr[i6];
                                        Integer num = (Integer) e.get((ds2) obj);
                                        if (num == null || num.intValue() != i7) {
                                            break loop0;
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    return;
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                vf3Var.B0.p.s0.f();
                s14 s14Var3 = this.v0;
                if (s14Var3 == null) {
                    s14 s14Var4 = a94.a;
                    s14Var3 = new s14();
                    this.v0 = s14Var3;
                }
                s14Var3.a();
                for (Map.Entry entry : uv3Var.e().entrySet()) {
                    s14Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final void s1(yy3 yy3Var, k74 k74Var, long j, yr2 yr2Var, int i, boolean z, float f) {
        int i2;
        int i3;
        if (yy3Var == null) {
            e1(k74Var, j, yr2Var, i, z);
        } else if (!k74Var.g(yy3Var)) {
            s1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f);
        } else if (k74Var.d(yy3Var)) {
            n14 n14Var = yr2Var.B;
            w14 w14Var = yr2Var.A;
            int i4 = yr2Var.L;
            int i5 = w14Var.b;
            if (i4 == i5 - 1) {
                int i6 = i4 + 1;
                yr2Var.c(i6, i5);
                yr2Var.L++;
                w14Var.a(yy3Var);
                n14Var.a(nk2.e(f, z, false));
                m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f, false);
                yr2Var.L = i4;
                if (i6 != w14Var.b - 1 && !f34.I(yr2Var.b())) {
                    return;
                }
                int i7 = yr2Var.L;
                int i8 = i7 + 1;
                w14Var.k(i8);
                if (i8 >= 0 && i8 < (i3 = n14Var.b)) {
                    long[] jArr = n14Var.a;
                    long j2 = jArr[i8];
                    if (i8 != i3 - 1) {
                        nu.e0(jArr, jArr, i8, i7 + 2, i3);
                    }
                    n14Var.b--;
                    return;
                }
                f81.q("Index must be between 0 and size");
                return;
            }
            long b = yr2Var.b();
            int i9 = yr2Var.L;
            int i10 = w14Var.b;
            int i11 = i10 - 1;
            yr2Var.L = i11;
            yr2Var.c(i10, w14Var.b);
            yr2Var.L++;
            w14Var.a(yy3Var);
            n14Var.a(nk2.e(f, z, false));
            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f, false);
            yr2Var.L = i11;
            long b2 = yr2Var.b();
            if (yr2Var.L + 1 < w14Var.b - 1 && f34.y(b, b2) > 0) {
                int i12 = i9 + 1;
                boolean I = f34.I(b2);
                int i13 = yr2Var.L;
                if (I) {
                    i2 = i13 + 2;
                } else {
                    i2 = i13 + 1;
                }
                yr2Var.c(i12, i2);
            } else {
                yr2Var.c(yr2Var.L + 1, w14Var.b);
            }
            yr2Var.L = i9;
        } else {
            m1(gk2.n(yy3Var, k74Var.e()), k74Var, j, yr2Var, i, z, f, false);
        }
    }

    public final y55 u1() {
        if (Y0().i0) {
            rd3 s = me2.s(this);
            c24 c24Var = this.y0;
            if (c24Var == null) {
                c24Var = new c24();
                this.y0 = c24Var;
            }
            long P0 = P0(X0());
            int i = (int) (P0 >> 32);
            c24Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (P0 & 4294967295L);
            c24Var.b = -Float.intBitsToFloat(i2);
            c24Var.c = Float.intBitsToFloat(i) + l0();
            c24Var.d = Float.intBitsToFloat(i2) + k0();
            while (this != s) {
                this.p1(c24Var, false, true);
                if (!c24Var.b()) {
                    this = this.n0;
                    this.getClass();
                }
            }
            return new y55(c24Var.a, c24Var.b, c24Var.c, c24Var.d);
        }
        return y55.e;
    }

    public final void v1(m74 m74Var, float[] fArr) {
        float[] a;
        if (!b53.x(m74Var, this)) {
            m74 m74Var2 = this.n0;
            m74Var2.getClass();
            m74Var2.v1(m74Var, fArr);
            if (!a33.a(this.w0, 0L)) {
                float[] fArr2 = L0;
                kv3.d(fArr2);
                long j = this.w0;
                kv3.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
                kv3.e(fArr, fArr2);
            }
            vg4 vg4Var = this.I0;
            if (vg4Var != null && (a = ((tn2) vg4Var).a()) != null) {
                kv3.e(fArr, a);
            }
        }
    }

    public final void w1(m74 m74Var, float[] fArr) {
        while (!this.equals(m74Var)) {
            vg4 vg4Var = this.I0;
            if (vg4Var != null) {
                kv3.e(fArr, ((tn2) vg4Var).b());
            }
            long j = this.w0;
            if (!a33.a(j, 0L)) {
                float[] fArr2 = L0;
                kv3.d(fArr2);
                kv3.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                kv3.e(fArr, fArr2);
            }
            this = this.n0;
            this.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(defpackage.mi2 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m74.x1(mi2, boolean):void");
    }

    @Override // defpackage.rd3
    public final long y(rd3 rd3Var, long j) {
        return R(rd3Var, j, true);
    }

    public final void y1(boolean z) {
        char c;
        ee eeVar;
        boolean z2;
        ee eeVar2;
        boolean z3;
        wg4 wg4Var;
        ki2 ki2Var;
        ki2 ki2Var2;
        vg4 vg4Var = this.I0;
        mi2 mi2Var = this.q0;
        if (vg4Var != null) {
            if (mi2Var != null) {
                rf5 rf5Var = J0;
                rf5Var.a();
                vf3 vf3Var = this.j0;
                rf5Var.j0 = vf3Var.t0;
                rf5Var.k0 = vf3Var.u0;
                rf5Var.i0 = hk2.U(this.L);
                ((ee) yf3.a(vf3Var)).getSnapshotObserver().a.d(this, qc2.c0, new wd(8, mi2Var, this));
                rc3 rc3Var = this.z0;
                if (rc3Var == null) {
                    rc3Var = new rc3();
                    this.z0 = rc3Var;
                }
                rc3 rc3Var2 = K0;
                rc3Var2.getClass();
                rc3Var2.a = rc3Var.a;
                rc3Var2.b = rc3Var.b;
                rc3Var2.c = rc3Var.c;
                rc3Var2.d = rc3Var.d;
                rc3Var2.e = rc3Var.e;
                rc3Var2.f = rc3Var.f;
                float f = rf5Var.B;
                rc3Var.a = f;
                rc3Var.b = rf5Var.L;
                rc3Var.c = rf5Var.X;
                rc3Var.d = rf5Var.d0;
                rc3Var.e = rf5Var.e0;
                long j = rf5Var.f0;
                rc3Var.f = j;
                tn2 tn2Var = (tn2) vg4Var;
                ee eeVar3 = tn2Var.L;
                int i = rf5Var.A | tn2Var.i0;
                tn2Var.g0 = rf5Var.k0;
                tn2Var.f0 = rf5Var.j0;
                int i2 = i & 4096;
                if (i2 != 0) {
                    tn2Var.j0 = j;
                }
                if ((i & 1) != 0) {
                    rn2 rn2Var = tn2Var.A.a;
                    if (rn2Var.d() != f) {
                        rn2Var.o(f);
                    }
                }
                if ((i & 2) != 0) {
                    pn2 pn2Var = tn2Var.A;
                    float f2 = rf5Var.L;
                    rn2 rn2Var2 = pn2Var.a;
                    if (rn2Var2.K() != f2) {
                        rn2Var2.E(f2);
                    }
                }
                if ((i & 4) != 0) {
                    pn2 pn2Var2 = tn2Var.A;
                    float f3 = rf5Var.R;
                    rn2 rn2Var3 = pn2Var2.a;
                    if (rn2Var3.a() != f3) {
                        rn2Var3.c(f3);
                    }
                }
                if ((i & 8) != 0) {
                    rn2 rn2Var4 = tn2Var.A.a;
                    if (rn2Var4.t() != RecyclerView.A1) {
                        rn2Var4.v();
                    }
                }
                if ((i & 16) != 0) {
                    pn2 pn2Var3 = tn2Var.A;
                    float f4 = rf5Var.X;
                    rn2 rn2Var5 = pn2Var3.a;
                    if (rn2Var5.f() != f4) {
                        rn2Var5.j(f4);
                    }
                }
                if ((i & 32) != 0) {
                    pn2 pn2Var4 = tn2Var.A;
                    float f5 = rf5Var.Y;
                    rn2 rn2Var6 = pn2Var4.a;
                    if (rn2Var6.I() != f5) {
                        rn2Var6.e(f5);
                        pn2Var4.g = true;
                        pn2Var4.a();
                    }
                    if (rf5Var.Y > RecyclerView.A1 && !tn2Var.o0 && (ki2Var2 = tn2Var.X) != null) {
                        ki2Var2.c();
                    }
                }
                if ((i & 64) != 0) {
                    pn2 pn2Var5 = tn2Var.A;
                    long j2 = rf5Var.Z;
                    rn2 rn2Var7 = pn2Var5.a;
                    if (!xq0.c(j2, rn2Var7.O())) {
                        rn2Var7.l(j2);
                    }
                }
                if ((i & 128) != 0) {
                    pn2 pn2Var6 = tn2Var.A;
                    long j3 = rf5Var.c0;
                    rn2 rn2Var8 = pn2Var6.a;
                    if (!xq0.c(j3, rn2Var8.k())) {
                        rn2Var8.D(j3);
                    }
                }
                if ((i & 1024) != 0) {
                    pn2 pn2Var7 = tn2Var.A;
                    float f6 = rf5Var.d0;
                    rn2 rn2Var9 = pn2Var7.a;
                    if (rn2Var9.L() != f6) {
                        rn2Var9.h(f6);
                    }
                }
                if ((i & 256) != 0) {
                    rn2 rn2Var10 = tn2Var.A.a;
                    if (rn2Var10.z() != RecyclerView.A1) {
                        rn2Var10.b();
                    }
                }
                if ((i & 512) != 0) {
                    rn2 rn2Var11 = tn2Var.A.a;
                    if (rn2Var11.G() != RecyclerView.A1) {
                        rn2Var11.i();
                    }
                }
                if ((i & 2048) != 0) {
                    pn2 pn2Var8 = tn2Var.A;
                    float f7 = rf5Var.e0;
                    rn2 rn2Var12 = pn2Var8.a;
                    if (rn2Var12.q() != f7) {
                        rn2Var12.H(f7);
                    }
                }
                if (i2 != 0) {
                    c = ' ';
                    boolean a = sw6.a(tn2Var.j0, sw6.b);
                    pn2 pn2Var9 = tn2Var.A;
                    if (a) {
                        if (!mb4.b(pn2Var9.v, 9205357640488583168L)) {
                            pn2Var9.v = 9205357640488583168L;
                            pn2Var9.a.N(9205357640488583168L);
                        }
                    } else {
                        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (tn2Var.j0 & 4294967295L)) * ((int) (tn2Var.Y & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (tn2Var.j0 >> 32)) * ((int) (tn2Var.Y >> 32))) << 32);
                        if (!mb4.b(pn2Var9.v, floatToRawIntBits)) {
                            pn2Var9.v = floatToRawIntBits;
                            pn2Var9.a.N(floatToRawIntBits);
                        }
                    }
                } else {
                    c = ' ';
                }
                if ((i & 16384) != 0) {
                    pn2 pn2Var10 = tn2Var.A;
                    boolean z4 = rf5Var.h0;
                    if (pn2Var10.w != z4) {
                        pn2Var10.w = z4;
                        pn2Var10.g = true;
                        pn2Var10.a();
                    }
                }
                if ((131072 & i) != 0) {
                    pn2 pn2Var11 = tn2Var.A;
                    o30 o30Var = rf5Var.l0;
                    rn2 rn2Var13 = pn2Var11.a;
                    if (!b53.x(rn2Var13.g(), o30Var)) {
                        rn2Var13.u(o30Var);
                    }
                }
                if ((262144 & i) != 0) {
                    rn2 rn2Var14 = tn2Var.A.a;
                    if (!b53.x(rn2Var14.B(), null)) {
                        rn2Var14.n();
                    }
                }
                if ((524288 & i) != 0) {
                    pn2 pn2Var12 = tn2Var.A;
                    int i3 = rf5Var.m0;
                    rn2 rn2Var15 = pn2Var12.a;
                    if (rn2Var15.M() != i3) {
                        rn2Var15.p(i3);
                    }
                }
                if ((32768 & i) != 0) {
                    rn2 rn2Var16 = tn2Var.A.a;
                    if (rn2Var16.y() != 0) {
                        rn2Var16.C(0);
                    }
                }
                if ((i & 7963) != 0) {
                    tn2Var.l0 = true;
                    tn2Var.m0 = true;
                }
                if (!b53.x(tn2Var.k0, rf5Var.n0)) {
                    jk2 jk2Var = rf5Var.n0;
                    tn2Var.k0 = jk2Var;
                    if (jk2Var == null) {
                        eeVar = eeVar3;
                    } else {
                        pn2 pn2Var13 = tn2Var.A;
                        if (jk2Var instanceof of4) {
                            y55 y55Var = ((of4) jk2Var).d;
                            float f8 = y55Var.a;
                            float f9 = y55Var.b;
                            eeVar = eeVar3;
                            pn2Var13.f((Float.floatToRawIntBits(f8) << c) | (Float.floatToRawIntBits(f9) & 4294967295L), (Float.floatToRawIntBits(y55Var.c - f8) << c) | (Float.floatToRawIntBits(y55Var.d - f9) & 4294967295L), RecyclerView.A1);
                        } else {
                            eeVar = eeVar3;
                            if (jk2Var instanceof nf4) {
                                vi viVar = ((nf4) jk2Var).d;
                                pn2Var13.k = null;
                                pn2Var13.i = 9205357640488583168L;
                                pn2Var13.h = 0L;
                                pn2Var13.j = RecyclerView.A1;
                                pn2Var13.g = true;
                                pn2Var13.n = false;
                                pn2Var13.l = viVar;
                                pn2Var13.a();
                            } else if (jk2Var instanceof pf4) {
                                pf4 pf4Var = (pf4) jk2Var;
                                vi viVar2 = pf4Var.e;
                                if (viVar2 != null) {
                                    pn2Var13.k = null;
                                    pn2Var13.i = 9205357640488583168L;
                                    pn2Var13.h = 0L;
                                    pn2Var13.j = RecyclerView.A1;
                                    pn2Var13.g = true;
                                    pn2Var13.n = false;
                                    pn2Var13.l = viVar2;
                                    pn2Var13.a();
                                } else {
                                    ar5 ar5Var = pf4Var.d;
                                    float f10 = ar5Var.b;
                                    float f11 = ar5Var.a;
                                    pn2Var13.f((Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(ar5Var.c - f11) << c) | (Float.floatToRawIntBits(ar5Var.d - f10) & 4294967295L), Float.intBitsToFloat((int) (ar5Var.h >> c)));
                                }
                            } else {
                                i.c();
                                return;
                            }
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((jk2Var instanceof nf4) || ((jk2Var instanceof pf4) && !sn2.G(((pf4) jk2Var).d))) && (ki2Var = tn2Var.X) != null)) {
                            ki2Var.c();
                        }
                    }
                    z2 = true;
                } else {
                    eeVar = eeVar3;
                    z2 = false;
                }
                tn2Var.i0 = rf5Var.A;
                if (i != 0 || z2) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = eeVar.getParent();
                        if (parent != null) {
                            eeVar2 = eeVar;
                            parent.onDescendantInvalidated(eeVar2, eeVar2);
                        } else {
                            eeVar2 = eeVar;
                        }
                    } else {
                        eeVar2 = eeVar;
                        eeVar2.invalidate();
                    }
                    if (ee.m()) {
                        eeVar2.J(RecyclerView.A1);
                    }
                }
                boolean z5 = this.p0;
                this.p0 = rf5Var.h0;
                this.t0 = rf5Var.R;
                if (rc3Var2.a == rc3Var.a && rc3Var2.b == rc3Var.b && rc3Var2.c == rc3Var.c && rc3Var2.d == rc3Var.d && rc3Var2.e == rc3Var.e && sw6.a(rc3Var2.f, rc3Var.f)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && ((!z3 || z5 != this.p0) && (wg4Var = vf3Var.j0) != null)) {
                    ((ee) wg4Var).v(vf3Var);
                }
                if (!z3) {
                    vf3Var.N(this);
                    if (vf3Var.I0 > 0) {
                        ee eeVar4 = (ee) yf3.a(vf3Var);
                        ci3 ci3Var = eeVar4.T0.e;
                        ci3Var.getClass();
                        if (vf3Var.I0 > 0) {
                            ((o24) ci3Var.B).b(vf3Var);
                            vf3Var.H0 = true;
                        }
                        eeVar4.C(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw b31.e("updateLayerParameters requires a non-null layerBlock");
        } else if (mi2Var == null) {
        } else {
            mz2.c("null layer with a non-null layerBlock");
        }
    }

    @Override // defpackage.fs3
    public final fs3 z0() {
        return this.m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z1(long r24) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m74.z1(long):boolean");
    }

    @Override // defpackage.fs3
    public final rd3 B0() {
        return this;
    }
}
