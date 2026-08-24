package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg4  reason: default package */
/* loaded from: classes.dex */
public abstract class eg4 extends kz3 implements x24, jk3, aq4 {
    public static final op5 K0 = new op5();
    public static final jj3 L0 = new jj3();
    public static final float[] M0 = v24.a();
    public static final bg4 N0 = new Object();
    public static final q61 O0 = new Object();
    public jj3 A0;
    public boolean C0;
    public boolean D0;
    public ut2 E0;
    public xj0 F0;
    public pf G0;
    public boolean I0;
    public yp4 J0;
    public final sm3 k0;
    public boolean l0;
    public boolean m0;
    public eg4 n0;
    public eg4 o0;
    public boolean p0;
    public boolean q0;
    public qn2 r0;
    public qh1 s0;
    public kk3 t0;
    public f34 v0;
    public y94 w0;
    public float y0;
    public ia4 z0;
    public float u0 = 0.8f;
    public long x0 = 0;
    public ke6 B0 = u24.m;
    public final dg4 H0 = new dg4(this, 1);

    public eg4(sm3 sm3Var) {
        this.k0 = sm3Var;
        this.s0 = sm3Var.u0;
        this.t0 = sm3Var.v0;
    }

    public static eg4 t1(jk3 jk3Var) {
        nz3 nz3Var;
        eg4 eg4Var;
        if (jk3Var instanceof nz3) {
            nz3Var = (nz3) jk3Var;
        } else {
            nz3Var = null;
        }
        if (nz3Var != null && (eg4Var = nz3Var.A.k0) != null) {
            return eg4Var;
        }
        jk3Var.getClass();
        return (eg4) jk3Var;
    }

    @Override // defpackage.jk3
    public final long A(long j) {
        if (!Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        jk3 w = ej2.w(this);
        te teVar = (te) vm3.a(this.k0);
        teVar.z();
        return R(w, jk4.e(v24.b(j, teVar.Z0), w.P(0L)), true);
    }

    @Override // defpackage.dx4, defpackage.x24
    public final Object B() {
        sm3 sm3Var = this.k0;
        if (!sm3Var.B0.g(64)) {
            return null;
        }
        Y0();
        Object obj = null;
        for (z64 z64Var = (vy6) sm3Var.B0.f; z64Var != null; z64Var = z64Var.X) {
            if ((z64Var.L & 64) != 0) {
                z64 z64Var2 = z64Var;
                ua4 ua4Var = null;
                while (z64Var2 != null) {
                    if (z64Var2 instanceof xs4) {
                        obj = ((xs4) z64Var2).t(sm3Var.u0, obj);
                    } else if ((z64Var2.L & 64) != 0 && (z64Var2 instanceof zg1)) {
                        int i = 0;
                        for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                            if ((z64Var3.L & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    z64Var2 = z64Var3;
                                } else {
                                    if (ua4Var == null) {
                                        ua4Var = new ua4(new z64[16]);
                                    }
                                    if (z64Var2 != null) {
                                        ua4Var.b(z64Var2);
                                        z64Var2 = null;
                                    }
                                    ua4Var.b(z64Var3);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    z64Var2 = nc1.A(ua4Var);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.kz3
    public final boolean C0() {
        if (this.v0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jk3
    public final jk3 D() {
        boolean z = Y0().j0;
        sm3 sm3Var = this.k0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (sm3 sm3Var2 = sm3Var; sm3Var2 != null; sm3Var2 = sm3Var2.v()) {
                sb.append("\n|");
                sb.append(sm3Var2);
                sb.append(" isAttached=");
                sb.append(sm3Var2.H());
                sb.append(" modifier=");
                sb.append(sm3Var2.G0);
                sb.append(" tail=");
                sb.append(Y0());
            }
            p53.c(sb.toString());
        }
        h1();
        return ((eg4) sm3Var.B0.e).o0;
    }

    @Override // defpackage.kz3
    public final sm3 F0() {
        return this.k0;
    }

    @Override // defpackage.kz3
    public final f34 G0() {
        f34 f34Var = this.v0;
        if (f34Var != null) {
            return f34Var;
        }
        i.m("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.kz3
    public final kz3 H0() {
        return this.o0;
    }

    @Override // defpackage.kz3
    public final long I0() {
        return this.x0;
    }

    @Override // defpackage.jk3
    public final long J(jk3 jk3Var, long j) {
        return R(jk3Var, j, true);
    }

    @Override // defpackage.kz3
    public final void M0() {
        h0(this.x0, this.y0, this.r0);
    }

    @Override // defpackage.jk3
    public final long N(long j) {
        if (!Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return R(ej2.w(this), ((te) vm3.a(this.k0)).D(j), true);
    }

    public final void N0(eg4 eg4Var, ia4 ia4Var, boolean z) {
        if (eg4Var != this) {
            eg4 eg4Var2 = this.o0;
            if (eg4Var2 != null) {
                eg4Var2.N0(eg4Var, ia4Var, z);
            }
            long j = this.x0;
            float f = (int) (j >> 32);
            ia4Var.a -= f;
            ia4Var.c -= f;
            float f2 = (int) (j & 4294967295L);
            ia4Var.b -= f2;
            ia4Var.d -= f2;
            yp4 yp4Var = this.J0;
            if (yp4Var != null) {
                xt2 xt2Var = (xt2) yp4Var;
                float[] a = xt2Var.a();
                if (!xt2Var.o0) {
                    if (a == null) {
                        ia4Var.a = RecyclerView.B1;
                        ia4Var.b = RecyclerView.B1;
                        ia4Var.c = RecyclerView.B1;
                        ia4Var.d = RecyclerView.B1;
                    } else {
                        v24.c(a, ia4Var);
                    }
                }
                if (this.q0 && z) {
                    long j2 = this.L;
                    ia4Var.a(RecyclerView.B1, RecyclerView.B1, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    @Override // defpackage.jk3
    public final of5 O(jk3 jk3Var, boolean z) {
        if (!Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!jk3Var.t()) {
            p53.c("LayoutCoordinates " + jk3Var + " is not attached!");
        }
        eg4 t1 = t1(jk3Var);
        t1.h1();
        eg4 U0 = U0(t1);
        ia4 ia4Var = this.z0;
        if (ia4Var == null) {
            ia4Var = new ia4();
            this.z0 = ia4Var;
        }
        ia4Var.a = RecyclerView.B1;
        ia4Var.b = RecyclerView.B1;
        ia4Var.c = (int) (jk3Var.m() >> 32);
        ia4Var.d = (int) (jk3Var.m() & 4294967295L);
        while (t1 != U0) {
            t1.p1(ia4Var, z, false);
            if (ia4Var.b()) {
                return of5.e;
            }
            t1 = t1.o0;
            t1.getClass();
        }
        N0(U0, ia4Var, z);
        return new of5(ia4Var.a, ia4Var.b, ia4Var.c, ia4Var.d);
    }

    public final long O0(eg4 eg4Var, long j, boolean z) {
        if (eg4Var == this) {
            return j;
        }
        eg4 eg4Var2 = this.o0;
        if (eg4Var2 != null && !nb3.k(eg4Var, eg4Var2)) {
            return V0(eg4Var2.O0(eg4Var, j, z), z);
        }
        return V0(j, z);
    }

    @Override // defpackage.jk3
    public final long P(long j) {
        if (!Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        h1();
        while (this != null) {
            sm3 sm3Var = this.k0;
            if (this == ((eg4) sm3Var.B0.e) && !sm3Var.L) {
                long b = ((te) vm3.a(sm3Var)).getRectManager().b(sm3Var);
                if (!i93.a(b, 9223372034707292159L)) {
                    return kn2.U(j, b);
                }
            }
            yp4 yp4Var = this.J0;
            if (yp4Var != null) {
                xt2 xt2Var = (xt2) yp4Var;
                float[] b2 = xt2Var.b();
                if (!xt2Var.o0) {
                    j = v24.b(j, b2);
                }
            }
            j = kn2.U(j, this.x0);
            this = this.o0;
        }
        return j;
    }

    public final long P0(long j) {
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, (Float.intBitsToFloat((int) (j >> 32)) - d0()) / 2.0f)) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, (Float.intBitsToFloat((int) (j & 4294967295L)) - Z()) / 2.0f)) & 4294967295L);
    }

    public final float Q0(long j, long j2) {
        float d0;
        float Z;
        if (d0() >= Float.intBitsToFloat((int) (j2 >> 32)) && Z() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long P0 = P0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (P0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (P0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat3 < RecyclerView.B1) {
            d0 = -intBitsToFloat3;
        } else {
            d0 = intBitsToFloat3 - d0();
        }
        float max = Math.max((float) RecyclerView.B1, d0);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat4 < RecyclerView.B1) {
            Z = -intBitsToFloat4;
        } else {
            Z = intBitsToFloat4 - Z();
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Z)) & 4294967295L);
        if (intBitsToFloat > RecyclerView.B1 || intBitsToFloat2 > RecyclerView.B1) {
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

    @Override // defpackage.jk3
    public final long R(jk3 jk3Var, long j, boolean z) {
        if (jk3Var instanceof nz3) {
            nz3 nz3Var = (nz3) jk3Var;
            nz3Var.A.k0.h1();
            return nz3Var.R(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        eg4 t1 = t1(jk3Var);
        t1.h1();
        eg4 U0 = U0(t1);
        while (t1 != U0) {
            yp4 yp4Var = t1.J0;
            if (yp4Var != null) {
                xt2 xt2Var = (xt2) yp4Var;
                float[] b = xt2Var.b();
                if (!xt2Var.o0) {
                    j = v24.b(j, b);
                }
            }
            if (z || !t1.e0) {
                j = kn2.U(j, t1.x0);
            }
            t1 = t1.o0;
            t1.getClass();
        }
        return O0(U0, j, z);
    }

    public final void R0(xj0 xj0Var, ut2 ut2Var) {
        boolean z;
        yp4 yp4Var = this.J0;
        if (yp4Var != null) {
            xt2 xt2Var = (xt2) yp4Var;
            zj0 zj0Var = xt2Var.i0;
            xt2Var.g();
            if (xt2Var.A.a.M() > RecyclerView.B1) {
                z = true;
            } else {
                z = false;
            }
            xt2Var.p0 = z;
            bt btVar = zj0Var.B;
            btVar.V(xj0Var);
            btVar.L = ut2Var;
            oi2.u(zj0Var, xt2Var.A);
            return;
        }
        long j = this.x0;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        xj0Var.o(f, f2);
        S0(xj0Var, ut2Var);
        xj0Var.o(-f, -f2);
    }

    public final void S0(xj0 xj0Var, ut2 ut2Var) {
        eg4 eg4Var;
        xj0 xj0Var2;
        ut2 ut2Var2;
        z64 Z0 = Z0(4);
        if (Z0 == null) {
            n1(xj0Var, ut2Var);
            return;
        }
        sm3 sm3Var = this.k0;
        sm3Var.getClass();
        um3 sharedDrawScope = ((te) vm3.a(sm3Var)).getSharedDrawScope();
        long S = qo2.S(this.L);
        sharedDrawScope.getClass();
        ua4 ua4Var = null;
        while (Z0 != null) {
            if (Z0 instanceof mo1) {
                eg4Var = this;
                xj0Var2 = xj0Var;
                ut2Var2 = ut2Var;
                sharedDrawScope.c(xj0Var2, S, eg4Var, (mo1) Z0, ut2Var2);
            } else {
                eg4Var = this;
                xj0Var2 = xj0Var;
                ut2Var2 = ut2Var;
                if ((Z0.L & 4) != 0 && (Z0 instanceof zg1)) {
                    int i = 0;
                    for (z64 z64Var = ((zg1) Z0).l0; z64Var != null; z64Var = z64Var.Y) {
                        if ((z64Var.L & 4) != 0) {
                            i++;
                            if (i == 1) {
                                Z0 = z64Var;
                            } else {
                                if (ua4Var == null) {
                                    ua4Var = new ua4(new z64[16]);
                                }
                                if (Z0 != null) {
                                    ua4Var.b(Z0);
                                    Z0 = null;
                                }
                                ua4Var.b(z64Var);
                            }
                        }
                    }
                    if (i == 1) {
                        xj0Var = xj0Var2;
                        this = eg4Var;
                        ut2Var = ut2Var2;
                    }
                }
            }
            Z0 = nc1.A(ua4Var);
            xj0Var = xj0Var2;
            this = eg4Var;
            ut2Var = ut2Var2;
        }
    }

    public abstract void T0();

    public final eg4 U0(eg4 eg4Var) {
        sm3 sm3Var = eg4Var.k0;
        sm3 sm3Var2 = this.k0;
        if (sm3Var == sm3Var2) {
            z64 Y0 = eg4Var.Y0();
            z64 Y02 = Y0();
            if (!Y02.A.j0) {
                p53.c("visitLocalAncestors called on an unattached node");
            }
            for (z64 z64Var = Y02.A.X; z64Var != null; z64Var = z64Var.X) {
                if ((z64Var.L & 2) != 0 && z64Var == Y0) {
                    return eg4Var;
                }
            }
            return this;
        }
        while (sm3Var.l0 > sm3Var2.l0) {
            sm3Var = sm3Var.v();
            sm3Var.getClass();
        }
        sm3 sm3Var3 = sm3Var2;
        while (sm3Var3.l0 > sm3Var.l0) {
            sm3Var3 = sm3Var3.v();
            sm3Var3.getClass();
        }
        while (sm3Var != sm3Var3) {
            sm3Var = sm3Var.v();
            sm3Var3 = sm3Var3.v();
            if (sm3Var != null) {
                if (sm3Var3 == null) {
                }
            }
            i.h("layouts are not part of the same hierarchy");
            return null;
        }
        if (sm3Var3 != sm3Var2) {
            if (sm3Var != eg4Var.k0) {
                return (y53) sm3Var.B0.d;
            }
            return eg4Var;
        }
        return this;
    }

    public final long V0(long j, boolean z) {
        if (z || !this.e0) {
            long j2 = this.x0;
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32))) << 32);
        }
        yp4 yp4Var = this.J0;
        if (yp4Var != null) {
            xt2 xt2Var = (xt2) yp4Var;
            float[] a = xt2Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!xt2Var.o0) {
                return v24.b(j, a);
            }
        }
        return j;
    }

    public abstract mz3 W0();

    public final long X0() {
        return this.s0.v0(this.k0.w0.d());
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.k0.u0.Y();
    }

    public abstract z64 Y0();

    public final z64 Z0(int i) {
        boolean g = fg4.g(i);
        z64 Y0 = Y0();
        if (g || (Y0 = Y0.X) != null) {
            for (z64 a1 = a1(g); a1 != null && (a1.R & i) != 0; a1 = a1.Y) {
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

    @Override // defpackage.qh1
    public final float a() {
        return this.k0.u0.a();
    }

    public final z64 a1(boolean z) {
        z64 Y0;
        if0 if0Var = this.k0.B0;
        if (((eg4) if0Var.e) == this) {
            return (z64) if0Var.g;
        }
        eg4 eg4Var = this.o0;
        if (z) {
            if (eg4Var != null && (Y0 = eg4Var.Y0()) != null) {
                return Y0.Y;
            }
            return null;
        } else if (eg4Var != null) {
            return eg4Var.Y0();
        } else {
            return null;
        }
    }

    public final void b1(z64 z64Var, cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z) {
        if (z64Var == null) {
            e1(cg4Var, j, zx2Var, i, z);
        } else if (!cg4Var.d(z64Var)) {
            b1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z);
        } else {
            int i2 = zx2Var.L;
            ca4 ca4Var = zx2Var.A;
            zx2Var.b(i2 + 1, ca4Var.b);
            zx2Var.L++;
            ca4Var.a(z64Var);
            zx2Var.B.a(yh2.a(-1.0f, z, false));
            b1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z);
            zx2Var.L = i2;
        }
    }

    public final void c1(z64 z64Var, cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z, float f) {
        if (z64Var == null) {
            e1(cg4Var, j, zx2Var, i, z);
        } else if (!cg4Var.d(z64Var)) {
            c1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f);
        } else {
            int i2 = zx2Var.L;
            ca4 ca4Var = zx2Var.A;
            zx2Var.b(i2 + 1, ca4Var.b);
            zx2Var.L++;
            ca4Var.a(z64Var);
            zx2Var.B.a(yh2.a(f, z, false));
            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f, true);
            zx2Var.L = i2;
        }
    }

    @Override // defpackage.jk3
    public final long d(long j) {
        long P = P(j);
        te teVar = (te) vm3.a(this.k0);
        teVar.z();
        return v24.b(P, teVar.Y0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (defpackage.vy7.U(r18.a(), defpackage.yh2.a(r2, r7, false)) > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z) {
        float f;
        boolean z2;
        boolean z3;
        z64 Z0 = Z0(cg4Var.c());
        if (!z1(j)) {
            if (i == 1) {
                float Q0 = Q0(j, X0());
                if ((Float.floatToRawIntBits(Q0) & Integer.MAX_VALUE) < 2139095040) {
                    if (zx2Var.L != zx2Var.A.b - 1) {
                        if (vy7.U(zx2Var.a(), yh2.a(Q0, false, false)) <= 0) {
                            return;
                        }
                    }
                    c1(Z0, cg4Var, j, zx2Var, i, false, Q0);
                }
            }
        } else if (Z0 == null) {
            e1(cg4Var, j, zx2Var, i, z);
        } else {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat >= RecyclerView.B1 && intBitsToFloat2 >= RecyclerView.B1 && intBitsToFloat < d0() && intBitsToFloat2 < Z()) {
                b1(Z0, cg4Var, j, zx2Var, i, z);
                return;
            }
            if (i == 1) {
                f = Q0(j, X0());
            } else {
                f = Float.POSITIVE_INFINITY;
            }
            if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
                if (zx2Var.L == zx2Var.A.b - 1) {
                    z2 = z;
                } else {
                    z2 = z;
                }
                z3 = true;
                m1(Z0, cg4Var, j, zx2Var, i, z2, f, z3);
            }
            z2 = z;
            z3 = false;
            m1(Z0, cg4Var, j, zx2Var, i, z2, f, z3);
        }
    }

    public void e1(cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z) {
        eg4 eg4Var = this.n0;
        if (eg4Var != null) {
            eg4Var.d1(cg4Var, eg4Var.V0(j, true), zx2Var, i, z);
        }
    }

    public final void f1() {
        yp4 yp4Var = this.J0;
        if (yp4Var != null) {
            ((xt2) yp4Var).c();
            return;
        }
        eg4 eg4Var = this.o0;
        if (eg4Var != null) {
            eg4Var.f1();
        }
    }

    public final boolean g1() {
        if (this.J0 != null && this.u0 <= RecyclerView.B1) {
            return true;
        }
        eg4 eg4Var = this.o0;
        if (eg4Var != null) {
            return eg4Var.g1();
        }
        return false;
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.k0.v0;
    }

    public final void h1() {
        this.k0.C0.b();
    }

    public final void i1() {
        qn2 qn2Var;
        z64 z64Var;
        boolean g = fg4.g(128);
        z64 a1 = a1(g);
        if (a1 != null && (a1.A.R & 128) != 0) {
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                if (g) {
                    z64Var = Y0();
                } else {
                    z64Var = Y0().X;
                    if (z64Var == null) {
                    }
                }
                for (z64 a12 = a1(g); a12 != null; a12 = a12.Y) {
                    if ((a12.R & 128) == 0) {
                        break;
                    }
                    if ((a12.L & 128) != 0) {
                        z64 z64Var2 = a12;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            if (z64Var2 instanceof j34) {
                                ((j34) z64Var2).b(this.L);
                            } else if ((z64Var2.L & 128) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 128) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var2 = z64Var3;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var2 != null) {
                                                ua4Var.b(z64Var2);
                                                z64Var2 = null;
                                            }
                                            ua4Var.b(z64Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var2 = nc1.A(ua4Var);
                        }
                    }
                    if (a12 == z64Var) {
                        break;
                    }
                }
            } finally {
                ln2.V(t, N, qn2Var);
            }
        }
    }

    public final void j1() {
        boolean g = fg4.g(Compress.MAXWINSIZE);
        z64 Y0 = Y0();
        if (g || (Y0 = Y0.X) != null) {
            for (z64 a1 = a1(g); a1 != null && (a1.R & Compress.MAXWINSIZE) != 0; a1 = a1.Y) {
                if ((a1.L & Compress.MAXWINSIZE) != 0) {
                    z64 z64Var = a1;
                    ua4 ua4Var = null;
                    while (z64Var != null) {
                        if (z64Var instanceof kj3) {
                            ((kj3) z64Var).m(this);
                        } else if ((z64Var.L & Compress.MAXWINSIZE) != 0 && (z64Var instanceof zg1)) {
                            int i = 0;
                            for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                if ((z64Var2.L & Compress.MAXWINSIZE) != 0) {
                                    i++;
                                    if (i == 1) {
                                        z64Var = z64Var2;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var != null) {
                                            ua4Var.b(z64Var);
                                            z64Var = null;
                                        }
                                        ua4Var.b(z64Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        z64Var = nc1.A(ua4Var);
                    }
                }
                if (a1 == Y0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.jk3
    public final void k(float[] fArr) {
        zp4 a = vm3.a(this.k0);
        eg4 t1 = t1(ej2.w(this));
        w1(t1, fArr);
        if (a instanceof te) {
            ((te) a).q(fArr);
            return;
        }
        long w = t1.w(0L);
        if ((9223372034707292159L & w) != 9205357640488583168L) {
            v24.f(fArr, Float.intBitsToFloat((int) (w >> 32)), Float.intBitsToFloat((int) (w & 4294967295L)));
        }
    }

    public final void k1() {
        this.p0 = true;
        this.H0.c();
        q1();
        if (!i93.a(this.x0, 0L)) {
            this.k0.N(this);
        }
    }

    @Override // defpackage.jk3
    public final void l(jk3 jk3Var, float[] fArr) {
        eg4 t1 = t1(jk3Var);
        t1.h1();
        eg4 U0 = U0(t1);
        v24.d(fArr);
        t1.w1(U0, fArr);
        v1(U0, fArr);
    }

    public final void l1() {
        boolean g = fg4.g(1048576);
        z64 a1 = a1(g);
        if (a1 != null && (a1.A.R & 1048576) != 0) {
            z64 Y0 = Y0();
            if (g || (Y0 = Y0.X) != null) {
                for (z64 a12 = a1(g); a12 != null && (a12.R & 1048576) != 0; a12 = a12.Y) {
                    if ((a12.L & 1048576) != 0) {
                        z64 z64Var = a12;
                        ua4 ua4Var = null;
                        while (z64Var != null) {
                            if ((z64Var.L & 1048576) != 0 && (z64Var instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                    if ((z64Var2.L & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var = z64Var2;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var != null) {
                                                ua4Var.b(z64Var);
                                                z64Var = null;
                                            }
                                            ua4Var.b(z64Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var = nc1.A(ua4Var);
                        }
                    }
                    if (a12 == Y0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.jk3
    public final long m() {
        return this.L;
    }

    public final void m1(z64 z64Var, cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z, float f, boolean z2) {
        int p;
        int p2;
        if (z64Var == null) {
            e1(cg4Var, j, zx2Var, i, z);
        } else if (!cg4Var.d(z64Var)) {
            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f, z2);
        } else {
            int i2 = i;
            boolean z3 = z;
            char c = 3;
            if (i2 == 3 || i2 == 4) {
                z64 z64Var2 = z64Var;
                ua4 ua4Var = null;
                while (true) {
                    if (z64Var2 == null) {
                        break;
                    }
                    int i3 = 0;
                    if (z64Var2 instanceof yy4) {
                        long o = ((yy4) z64Var2).o();
                        int i4 = (int) (j >> 32);
                        float intBitsToFloat = Float.intBitsToFloat(i4);
                        sm3 sm3Var = this.k0;
                        kk3 kk3Var = sm3Var.v0;
                        int i5 = s87.b;
                        int i6 = ((Long.MIN_VALUE & o) > 0L ? 1 : ((Long.MIN_VALUE & o) == 0L ? 0 : -1));
                        if (i6 != 0 && kk3Var != kk3.Ltr) {
                            p = x31.p(2, o);
                        } else {
                            p = x31.p(0, o);
                        }
                        if (intBitsToFloat >= (-p)) {
                            float intBitsToFloat2 = Float.intBitsToFloat(i4);
                            int d0 = d0();
                            kk3 kk3Var2 = sm3Var.v0;
                            if (i6 != 0 && kk3Var2 != kk3.Ltr) {
                                p2 = x31.p(0, o);
                            } else {
                                p2 = x31.p(2, o);
                            }
                            if (intBitsToFloat2 < d0 + p2) {
                                int i7 = (int) (j & 4294967295L);
                                float intBitsToFloat3 = Float.intBitsToFloat(i7);
                                int i8 = s87.b;
                                if (intBitsToFloat3 >= (-x31.p(1, o))) {
                                    if (Float.intBitsToFloat(i7) < x31.p(3, o) + Z()) {
                                        t94 t94Var = zx2Var.B;
                                        ca4 ca4Var = zx2Var.A;
                                        int i9 = zx2Var.L;
                                        int i10 = ca4Var.b;
                                        if (i9 == i10 - 1) {
                                            zx2Var.b(i9 + 1, i10);
                                            zx2Var.L++;
                                            ca4Var.a(z64Var);
                                            t94Var.a(yh2.a(RecyclerView.B1, z3, true));
                                            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i2, z3, f, z2);
                                            zx2Var.L = i9;
                                            return;
                                        }
                                        long a = zx2Var.a();
                                        int i11 = zx2Var.L;
                                        if (vy7.n0(a)) {
                                            int i12 = ca4Var.b;
                                            int i13 = i12 - 1;
                                            zx2Var.L = i13;
                                            zx2Var.b(i12, ca4Var.b);
                                            zx2Var.L++;
                                            ca4Var.a(z64Var);
                                            t94Var.a(yh2.a(RecyclerView.B1, z3, true));
                                            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z3, f, z2);
                                            zx2Var.L = i13;
                                            if (vy7.m0(zx2Var.a()) < RecyclerView.B1) {
                                                zx2Var.b(i11 + 1, zx2Var.L + 1);
                                            }
                                            zx2Var.L = i11;
                                            return;
                                        } else if (vy7.m0(a) > RecyclerView.B1) {
                                            int i14 = zx2Var.L;
                                            zx2Var.b(i14 + 1, ca4Var.b);
                                            zx2Var.L++;
                                            ca4Var.a(z64Var);
                                            t94Var.a(yh2.a(RecyclerView.B1, z3, true));
                                            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z3, f, z2);
                                            zx2Var.L = i14;
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
                        if ((z64Var2.L & 16) != 0 && (z64Var2 instanceof zg1)) {
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & 16) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var == null) {
                                            ua4Var = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var.b(z64Var3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                                i2 = i;
                                z3 = z;
                                c = c2;
                            }
                        }
                        z64Var2 = nc1.A(ua4Var);
                        i2 = i;
                        z3 = z;
                        c = c2;
                    }
                }
            }
            if (z2) {
                c1(z64Var, cg4Var, j, zx2Var, i, z, f);
            } else {
                s1(z64Var, cg4Var, j, zx2Var, i, z, f);
            }
        }
    }

    public abstract void n1(xj0 xj0Var, ut2 ut2Var);

    public final void o1(long j, float f, qn2 qn2Var) {
        x1(qn2Var, false);
        boolean a = i93.a(this.x0, j);
        sm3 sm3Var = this.k0;
        if (!a) {
            ((te) vm3.a(sm3Var)).J(-4.0f);
            this.x0 = j;
            yp4 yp4Var = this.J0;
            if (yp4Var != null) {
                ((xt2) yp4Var).d(j);
            } else {
                eg4 eg4Var = this.o0;
                if (eg4Var != null) {
                    eg4Var.f1();
                }
            }
            sm3Var.N(this);
            kz3.K0(this);
            zp4 zp4Var = sm3Var.k0;
            if (zp4Var != null) {
                ((te) zp4Var).v(sm3Var);
            }
        }
        this.y0 = f;
        if (this == ((eg4) sm3Var.B0.e)) {
            ((te) vm3.a(sm3Var)).getRectManager().f(sm3Var);
        }
        if (!this.g0) {
            x0(G0());
        }
    }

    public final void p1(ia4 ia4Var, boolean z, boolean z2) {
        long j;
        yp4 yp4Var = this.J0;
        if (yp4Var != null) {
            if (this.q0) {
                if (z2) {
                    long X0 = X0();
                    float f = ia4Var.a;
                    float f2 = ia4Var.b;
                    if (ia4Var.c >= RecyclerView.B1) {
                        long j2 = this.L;
                        if (f <= ((int) (j2 >> 32)) && ia4Var.d >= RecyclerView.B1 && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (X0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (X0 & 4294967295L));
                            float f3 = (intBitsToFloat - (ia4Var.c - ia4Var.a)) / 2.0f;
                            if (f3 > RecyclerView.B1) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (ia4Var.d - ia4Var.b)) / 2.0f;
                            if (f5 > RecyclerView.B1) {
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
                            ia4Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
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
                    ia4Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.L;
                    ia4Var.a(RecyclerView.B1, RecyclerView.B1, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (ia4Var.b()) {
                    return;
                }
            }
            xt2 xt2Var = (xt2) yp4Var;
            float[] b = xt2Var.b();
            if (!xt2Var.o0) {
                if (b == null) {
                    ia4Var.a = RecyclerView.B1;
                    ia4Var.b = RecyclerView.B1;
                    ia4Var.c = RecyclerView.B1;
                    ia4Var.d = RecyclerView.B1;
                } else {
                    v24.c(b, ia4Var);
                }
            }
        }
        long j5 = this.x0;
        float f9 = (int) (j5 >> 32);
        ia4Var.a += f9;
        ia4Var.c += f9;
        float f10 = (int) (j5 & 4294967295L);
        ia4Var.b += f10;
        ia4Var.d += f10;
    }

    public final void q1() {
        if (this.J0 != null) {
            x1(null, false);
            this.k0.U(false);
        }
    }

    @Override // defpackage.aq4
    public final boolean r() {
        if (this.J0 != null && !this.p0 && this.k0.H()) {
            return true;
        }
        return false;
    }

    public final void r1(f34 f34Var) {
        eg4 eg4Var;
        f34 f34Var2 = this.v0;
        if (f34Var != f34Var2) {
            this.v0 = f34Var;
            sm3 sm3Var = this.k0;
            int i = 0;
            if (f34Var2 == null || f34Var.getWidth() != f34Var2.getWidth() || f34Var.getHeight() != f34Var2.getHeight()) {
                int width = f34Var.getWidth();
                int height = f34Var.getHeight();
                yp4 yp4Var = this.J0;
                if (yp4Var != null) {
                    ((xt2) yp4Var).e((width << 32) | (height & 4294967295L));
                } else if (sm3Var.I() && (eg4Var = this.o0) != null) {
                    eg4Var.f1();
                }
                l0((height & 4294967295L) | (width << 32));
                if (this.r0 != null) {
                    y1(false);
                }
                boolean g = fg4.g(4);
                z64 Y0 = Y0();
                if (g || (Y0 = Y0.X) != null) {
                    for (z64 a1 = a1(g); a1 != null && (a1.R & 4) != 0; a1 = a1.Y) {
                        if ((a1.L & 4) != 0) {
                            z64 z64Var = a1;
                            ua4 ua4Var = null;
                            while (z64Var != null) {
                                if (z64Var instanceof mo1) {
                                    ((mo1) z64Var).O();
                                } else if ((z64Var.L & 4) != 0 && (z64Var instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var2 = ((zg1) z64Var).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                        if ((z64Var2.L & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var = z64Var2;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var != null) {
                                                    ua4Var.b(z64Var);
                                                    z64Var = null;
                                                }
                                                ua4Var.b(z64Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var = nc1.A(ua4Var);
                            }
                        }
                        if (a1 == Y0) {
                            break;
                        }
                    }
                }
                zp4 zp4Var = sm3Var.k0;
                if (zp4Var != null) {
                    ((te) zp4Var).v(sm3Var);
                }
                sm3Var.N(this);
            }
            y94 y94Var = this.w0;
            if ((y94Var != null && y94Var.e != 0) || !f34Var.b().isEmpty()) {
                y94 y94Var2 = this.w0;
                Map b = f34Var.b();
                if (y94Var2 != null && y94Var2.e == b.size()) {
                    Object[] objArr = y94Var2.b;
                    int[] iArr = y94Var2.c;
                    long[] jArr = y94Var2.a;
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
                                        Integer num = (Integer) b.get((ey2) obj);
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
                sm3Var.C0.p.t0.f();
                y94 y94Var3 = this.w0;
                if (y94Var3 == null) {
                    y94 y94Var4 = th4.a;
                    y94Var3 = new y94();
                    this.w0 = y94Var3;
                }
                y94Var3.a();
                for (Map.Entry entry : f34Var.b().entrySet()) {
                    y94Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final void s1(z64 z64Var, cg4 cg4Var, long j, zx2 zx2Var, int i, boolean z, float f) {
        int i2;
        int i3;
        if (z64Var == null) {
            e1(cg4Var, j, zx2Var, i, z);
        } else if (!cg4Var.d(z64Var)) {
            s1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f);
        } else if (cg4Var.b(z64Var)) {
            t94 t94Var = zx2Var.B;
            ca4 ca4Var = zx2Var.A;
            int i4 = zx2Var.L;
            int i5 = ca4Var.b;
            if (i4 == i5 - 1) {
                int i6 = i4 + 1;
                zx2Var.b(i6, i5);
                zx2Var.L++;
                ca4Var.a(z64Var);
                t94Var.a(yh2.a(f, z, false));
                m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f, false);
                zx2Var.L = i4;
                if (i6 != ca4Var.b - 1 && !vy7.n0(zx2Var.a())) {
                    return;
                }
                int i7 = zx2Var.L;
                int i8 = i7 + 1;
                ca4Var.k(i8);
                if (i8 >= 0 && i8 < (i3 = t94Var.b)) {
                    long[] jArr = t94Var.a;
                    long j2 = jArr[i8];
                    if (i8 != i3 - 1) {
                        fv.s0(jArr, jArr, i8, i7 + 2, i3);
                    }
                    t94Var.b--;
                    return;
                }
                e41.q("Index must be between 0 and size");
                return;
            }
            long a = zx2Var.a();
            int i9 = zx2Var.L;
            int i10 = ca4Var.b;
            int i11 = i10 - 1;
            zx2Var.L = i11;
            zx2Var.b(i10, ca4Var.b);
            zx2Var.L++;
            ca4Var.a(z64Var);
            t94Var.a(yh2.a(f, z, false));
            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f, false);
            zx2Var.L = i11;
            long a2 = zx2Var.a();
            if (zx2Var.L + 1 < ca4Var.b - 1 && vy7.U(a, a2) > 0) {
                int i12 = i9 + 1;
                boolean n0 = vy7.n0(a2);
                int i13 = zx2Var.L;
                if (n0) {
                    i2 = i13 + 2;
                } else {
                    i2 = i13 + 1;
                }
                zx2Var.b(i12, i2);
            } else {
                zx2Var.b(zx2Var.L + 1, ca4Var.b);
            }
            zx2Var.L = i9;
        } else {
            m1(ln2.g(z64Var, cg4Var.c()), cg4Var, j, zx2Var, i, z, f, false);
        }
    }

    @Override // defpackage.jk3
    public final boolean t() {
        return Y0().j0;
    }

    public final of5 u1() {
        if (Y0().j0) {
            jk3 w = ej2.w(this);
            ia4 ia4Var = this.z0;
            if (ia4Var == null) {
                ia4Var = new ia4();
                this.z0 = ia4Var;
            }
            long P0 = P0(X0());
            int i = (int) (P0 >> 32);
            ia4Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (P0 & 4294967295L);
            ia4Var.b = -Float.intBitsToFloat(i2);
            ia4Var.c = Float.intBitsToFloat(i) + d0();
            ia4Var.d = Float.intBitsToFloat(i2) + Z();
            while (this != w) {
                this.p1(ia4Var, false, true);
                if (!ia4Var.b()) {
                    this = this.o0;
                    this.getClass();
                }
            }
            return new of5(ia4Var.a, ia4Var.b, ia4Var.c, ia4Var.d);
        }
        return of5.e;
    }

    public final void v1(eg4 eg4Var, float[] fArr) {
        float[] a;
        if (!nb3.k(eg4Var, this)) {
            eg4 eg4Var2 = this.o0;
            eg4Var2.getClass();
            eg4Var2.v1(eg4Var, fArr);
            if (!i93.a(this.x0, 0L)) {
                float[] fArr2 = M0;
                v24.d(fArr2);
                long j = this.x0;
                v24.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
                v24.e(fArr, fArr2);
            }
            yp4 yp4Var = this.J0;
            if (yp4Var != null && (a = ((xt2) yp4Var).a()) != null) {
                v24.e(fArr, a);
            }
        }
    }

    @Override // defpackage.jk3
    public final long w(long j) {
        if (!Y0().j0) {
            p53.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((te) vm3.a(this.k0)).r(P(j));
    }

    public final void w1(eg4 eg4Var, float[] fArr) {
        while (!this.equals(eg4Var)) {
            yp4 yp4Var = this.J0;
            if (yp4Var != null) {
                v24.e(fArr, ((xt2) yp4Var).b());
            }
            long j = this.x0;
            if (!i93.a(j, 0L)) {
                float[] fArr2 = M0;
                v24.d(fArr2);
                v24.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                v24.e(fArr, fArr2);
            }
            this = this.o0;
            this.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(qn2 qn2Var, boolean z) {
        boolean z2;
        zp4 zp4Var;
        ua4 ua4Var;
        Reference poll;
        pf pfVar;
        ua4 ua4Var2;
        Reference poll2;
        Object obj;
        sm3 sm3Var = this.k0;
        if (!z && this.r0 == qn2Var && nb3.k(this.s0, sm3Var.u0) && this.t0 == sm3Var.v0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.s0 = sm3Var.u0;
        this.t0 = sm3Var.v0;
        boolean H = sm3Var.H();
        dg4 dg4Var = this.H0;
        if (H && qn2Var != null) {
            this.r0 = qn2Var;
            if (this.J0 == null) {
                zp4 a = vm3.a(sm3Var);
                pf pfVar2 = this.G0;
                if (pfVar2 == null) {
                    pf pfVar3 = new pf(2, this, new dg4(this, 0));
                    this.G0 = pfVar3;
                    pfVar = pfVar3;
                } else {
                    pfVar = pfVar2;
                }
                te teVar = (te) a;
                rr6 rr6Var = teVar.t1;
                do {
                    ua4Var2 = (ua4) rr6Var.B;
                    poll2 = ((ReferenceQueue) rr6Var.L).poll();
                    if (poll2 != null) {
                        ua4Var2.j(poll2);
                        continue;
                    }
                } while (poll2 != null);
                while (true) {
                    int i = ua4Var2.L;
                    if (i != 0) {
                        obj = ((Reference) ua4Var2.l(i - 1)).get();
                        if (obj != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                yp4 yp4Var = (yp4) obj;
                if (yp4Var != null) {
                    xt2 xt2Var = (xt2) yp4Var;
                    tt2 tt2Var = xt2Var.B;
                    if (tt2Var != null) {
                        if (!xt2Var.A.s) {
                            p53.a("layer should have been released before reuse");
                        }
                        xt2Var.A = tt2Var.b();
                        xt2Var.Z = false;
                        xt2Var.R = pfVar;
                        xt2Var.X = dg4Var;
                        xt2Var.m0 = false;
                        xt2Var.n0 = false;
                        xt2Var.o0 = true;
                        v24.d(xt2Var.d0);
                        float[] fArr = xt2Var.e0;
                        if (fArr != null) {
                            v24.d(fArr);
                        }
                        xt2Var.k0 = i97.b;
                        xt2Var.p0 = false;
                        xt2Var.Y = 9223372034707292159L;
                        xt2Var.l0 = null;
                        xt2Var.j0 = 0;
                    } else {
                        throw i61.e("currently reuse is only supported when we manage the layer lifecycle");
                    }
                } else {
                    yp4Var = new xt2(teVar.getGraphicsContext().b(), teVar.getGraphicsContext(), teVar, pfVar, dg4Var);
                }
                xt2 xt2Var2 = (xt2) yp4Var;
                xt2Var2.e(this.L);
                xt2Var2.d(this.x0);
                this.J0 = yp4Var;
                y1(true);
                sm3Var.F0 = true;
                dg4Var.c();
                return;
            } else if (z2) {
                y1(true);
                return;
            } else {
                return;
            }
        }
        this.r0 = null;
        yp4 yp4Var2 = this.J0;
        if (yp4Var2 != null) {
            xt2 xt2Var3 = (xt2) yp4Var2;
            if (!nj2.w(xt2Var3.b())) {
                sm3Var.N(this);
            }
            xt2Var3.R = null;
            xt2Var3.X = null;
            xt2Var3.Z = true;
            xt2Var3.f(false);
            tt2 tt2Var2 = xt2Var3.B;
            if (tt2Var2 != null) {
                tt2Var2.a(xt2Var3.A);
                te teVar2 = xt2Var3.L;
                rr6 rr6Var2 = teVar2.t1;
                do {
                    ua4Var = (ua4) rr6Var2.B;
                    poll = ((ReferenceQueue) rr6Var2.L).poll();
                    if (poll != null) {
                        ua4Var.j(poll);
                        continue;
                    }
                } while (poll != null);
                ua4Var.b(new WeakReference(xt2Var3, (ReferenceQueue) rr6Var2.L));
                teVar2.D0.j(xt2Var3);
            }
            this.J0 = null;
            sm3Var.F0 = true;
            dg4Var.c();
            if (Y0().j0 && sm3Var.I() && (zp4Var = sm3Var.k0) != null) {
                ((te) zp4Var).v(sm3Var);
            }
        }
        this.I0 = false;
    }

    public final void y1(boolean z) {
        char c;
        te teVar;
        boolean z2;
        te teVar2;
        boolean z3;
        zp4 zp4Var;
        on2 on2Var;
        on2 on2Var2;
        yp4 yp4Var = this.J0;
        qn2 qn2Var = this.r0;
        if (yp4Var != null) {
            if (qn2Var != null) {
                op5 op5Var = K0;
                op5Var.b();
                sm3 sm3Var = this.k0;
                op5Var.l0 = sm3Var.u0;
                op5Var.m0 = sm3Var.v0;
                op5Var.k0 = qo2.S(this.L);
                ((te) vm3.a(sm3Var)).getSnapshotObserver().a.d(this, hh2.e0, new le(8, qn2Var, this));
                jj3 jj3Var = this.A0;
                if (jj3Var == null) {
                    jj3Var = new jj3();
                    this.A0 = jj3Var;
                }
                jj3 jj3Var2 = L0;
                jj3Var2.getClass();
                jj3Var2.a = jj3Var.a;
                jj3Var2.b = jj3Var.b;
                jj3Var2.c = jj3Var.c;
                jj3Var2.d = jj3Var.d;
                jj3Var2.e = jj3Var.e;
                jj3Var2.f = jj3Var.f;
                jj3Var2.g = jj3Var.g;
                float f = op5Var.B;
                jj3Var.a = f;
                jj3Var.b = op5Var.L;
                jj3Var.c = op5Var.X;
                jj3Var.d = op5Var.Y;
                jj3Var.e = op5Var.f0;
                jj3Var.f = op5Var.g0;
                long j = op5Var.h0;
                jj3Var.g = j;
                xt2 xt2Var = (xt2) yp4Var;
                te teVar3 = xt2Var.L;
                int i = op5Var.A | xt2Var.j0;
                xt2Var.h0 = op5Var.m0;
                xt2Var.g0 = op5Var.l0;
                int i2 = i & 4096;
                if (i2 != 0) {
                    xt2Var.k0 = j;
                }
                if ((i & 1) != 0) {
                    wt2 wt2Var = xt2Var.A.a;
                    if (wt2Var.b() != f) {
                        wt2Var.z(f);
                    }
                }
                if ((i & 2) != 0) {
                    ut2 ut2Var = xt2Var.A;
                    float f2 = op5Var.L;
                    wt2 wt2Var2 = ut2Var.a;
                    if (wt2Var2.N() != f2) {
                        wt2Var2.m(f2);
                    }
                }
                if ((i & 4) != 0) {
                    ut2 ut2Var2 = xt2Var.A;
                    float f3 = op5Var.R;
                    wt2 wt2Var3 = ut2Var2.a;
                    if (wt2Var3.a() != f3) {
                        wt2Var3.t(f3);
                    }
                }
                if ((i & 8) != 0) {
                    ut2 ut2Var3 = xt2Var.A;
                    float f4 = op5Var.X;
                    wt2 wt2Var4 = ut2Var3.a;
                    if (wt2Var4.C() != f4) {
                        wt2Var4.I(f4);
                    }
                }
                if ((i & 16) != 0) {
                    ut2 ut2Var4 = xt2Var.A;
                    float f5 = op5Var.Y;
                    wt2 wt2Var5 = ut2Var4.a;
                    if (wt2Var5.u() != f5) {
                        wt2Var5.f(f5);
                    }
                }
                if ((i & 32) != 0) {
                    ut2 ut2Var5 = xt2Var.A;
                    float f6 = op5Var.Z;
                    wt2 wt2Var6 = ut2Var5.a;
                    if (wt2Var6.M() != f6) {
                        wt2Var6.c(f6);
                        ut2Var5.g = true;
                        ut2Var5.a();
                    }
                    if (op5Var.Z > RecyclerView.B1 && !xt2Var.p0 && (on2Var2 = xt2Var.X) != null) {
                        on2Var2.c();
                    }
                }
                if ((i & 64) != 0) {
                    ut2 ut2Var6 = xt2Var.A;
                    long j2 = op5Var.d0;
                    wt2 wt2Var7 = ut2Var6.a;
                    if (!kt0.d(j2, wt2Var7.r())) {
                        wt2Var7.x(j2);
                    }
                }
                if ((i & 128) != 0) {
                    ut2 ut2Var7 = xt2Var.A;
                    long j3 = op5Var.e0;
                    wt2 wt2Var8 = ut2Var7.a;
                    if (!kt0.d(j3, wt2Var8.w())) {
                        wt2Var8.J(j3);
                    }
                }
                if ((i & 1024) != 0) {
                    ut2 ut2Var8 = xt2Var.A;
                    float f7 = op5Var.f0;
                    wt2 wt2Var9 = ut2Var8.a;
                    if (wt2Var9.p() != f7) {
                        wt2Var9.e(f7);
                    }
                }
                if ((i & 256) != 0) {
                    wt2 wt2Var10 = xt2Var.A.a;
                    if (wt2Var10.F() != RecyclerView.B1) {
                        wt2Var10.s();
                    }
                }
                if ((i & 512) != 0) {
                    wt2 wt2Var11 = xt2Var.A.a;
                    if (wt2Var11.n() != RecyclerView.B1) {
                        wt2Var11.v();
                    }
                }
                if ((i & 2048) != 0) {
                    ut2 ut2Var9 = xt2Var.A;
                    float f8 = op5Var.g0;
                    wt2 wt2Var12 = ut2Var9.a;
                    if (wt2Var12.A() != f8) {
                        wt2Var12.L(f8);
                    }
                }
                if (i2 != 0) {
                    c = ' ';
                    boolean a = i97.a(xt2Var.k0, i97.b);
                    ut2 ut2Var10 = xt2Var.A;
                    if (a) {
                        if (!jk4.c(ut2Var10.v, 9205357640488583168L)) {
                            ut2Var10.v = 9205357640488583168L;
                            ut2Var10.a.q(9205357640488583168L);
                        }
                    } else {
                        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (xt2Var.k0 & 4294967295L)) * ((int) (xt2Var.Y & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (xt2Var.k0 >> 32)) * ((int) (xt2Var.Y >> 32))) << 32);
                        if (!jk4.c(ut2Var10.v, floatToRawIntBits)) {
                            ut2Var10.v = floatToRawIntBits;
                            ut2Var10.a.q(floatToRawIntBits);
                        }
                    }
                } else {
                    c = ' ';
                }
                if ((i & 16384) != 0) {
                    ut2 ut2Var11 = xt2Var.A;
                    boolean z4 = op5Var.j0;
                    if (ut2Var11.w != z4) {
                        ut2Var11.w = z4;
                        ut2Var11.g = true;
                        ut2Var11.a();
                    }
                }
                if ((131072 & i) != 0) {
                    ut2 ut2Var12 = xt2Var.A;
                    m50 m50Var = op5Var.n0;
                    wt2 wt2Var13 = ut2Var12.a;
                    if (!nb3.k(wt2Var13.d(), m50Var)) {
                        wt2Var13.D(m50Var);
                    }
                }
                if ((262144 & i) != 0) {
                    wt2 wt2Var14 = xt2Var.A.a;
                    if (!nb3.k(wt2Var14.l(), null)) {
                        wt2Var14.y();
                    }
                }
                if ((524288 & i) != 0) {
                    ut2 ut2Var13 = xt2Var.A;
                    int i3 = op5Var.o0;
                    wt2 wt2Var15 = ut2Var13.a;
                    if (wt2Var15.O() != i3) {
                        wt2Var15.h(i3);
                    }
                }
                if ((32768 & i) != 0) {
                    wt2 wt2Var16 = xt2Var.A.a;
                    if (wt2Var16.k() != 0) {
                        wt2Var16.H(0);
                    }
                }
                if ((i & 7963) != 0) {
                    xt2Var.m0 = true;
                    xt2Var.n0 = true;
                }
                if (!nb3.k(xt2Var.l0, op5Var.p0)) {
                    mp2 mp2Var = op5Var.p0;
                    xt2Var.l0 = mp2Var;
                    if (mp2Var == null) {
                        teVar = teVar3;
                    } else {
                        ut2 ut2Var14 = xt2Var.A;
                        if (mp2Var instanceof qo4) {
                            of5 of5Var = ((qo4) mp2Var).f;
                            float f9 = of5Var.a;
                            float f10 = of5Var.b;
                            teVar = teVar3;
                            ut2Var14.f(RecyclerView.B1, (Float.floatToRawIntBits(f9) << c) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(of5Var.c - f9) << c) | (Float.floatToRawIntBits(of5Var.d - f10) & 4294967295L));
                        } else {
                            teVar = teVar3;
                            if (mp2Var instanceof po4) {
                                hj hjVar = ((po4) mp2Var).f;
                                ut2Var14.k = null;
                                ut2Var14.i = 9205357640488583168L;
                                ut2Var14.h = 0L;
                                ut2Var14.j = RecyclerView.B1;
                                ut2Var14.g = true;
                                ut2Var14.n = false;
                                ut2Var14.l = hjVar;
                                ut2Var14.a();
                            } else if (mp2Var instanceof ro4) {
                                ro4 ro4Var = (ro4) mp2Var;
                                hj hjVar2 = ro4Var.g;
                                if (hjVar2 != null) {
                                    ut2Var14.k = null;
                                    ut2Var14.i = 9205357640488583168L;
                                    ut2Var14.h = 0L;
                                    ut2Var14.j = RecyclerView.B1;
                                    ut2Var14.g = true;
                                    ut2Var14.n = false;
                                    ut2Var14.l = hjVar2;
                                    ut2Var14.a();
                                } else {
                                    u16 u16Var = ro4Var.f;
                                    float f11 = u16Var.b;
                                    float f12 = u16Var.a;
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f12) << c) | (Float.floatToRawIntBits(f11) & 4294967295L);
                                    float f13 = u16Var.d - f11;
                                    ut2Var14.f(Float.intBitsToFloat((int) (u16Var.h >> c)), floatToRawIntBits2, (Float.floatToRawIntBits(u16Var.c - f12) << c) | (Float.floatToRawIntBits(f13) & 4294967295L));
                                }
                            } else {
                                i.d();
                                return;
                            }
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((mp2Var instanceof po4) || ((mp2Var instanceof ro4) && !mp2.P(((ro4) mp2Var).f))) && (on2Var = xt2Var.X) != null)) {
                            on2Var.c();
                        }
                    }
                    z2 = true;
                } else {
                    teVar = teVar3;
                    z2 = false;
                }
                xt2Var.j0 = op5Var.A;
                if (i != 0 || z2) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = teVar.getParent();
                        if (parent != null) {
                            teVar2 = teVar;
                            parent.onDescendantInvalidated(teVar2, teVar2);
                        } else {
                            teVar2 = teVar;
                        }
                    } else {
                        teVar2 = teVar;
                        teVar2.invalidate();
                    }
                    if (te.m()) {
                        teVar2.J(RecyclerView.B1);
                    }
                }
                boolean z5 = this.q0;
                this.q0 = op5Var.j0;
                this.u0 = op5Var.R;
                if (jj3Var2.a == jj3Var.a && jj3Var2.b == jj3Var.b && jj3Var2.c == jj3Var.c && jj3Var2.d == jj3Var.d && jj3Var2.e == jj3Var.e && jj3Var2.f == jj3Var.f && i97.a(jj3Var2.g, jj3Var.g)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && ((!z3 || z5 != this.q0) && (zp4Var = sm3Var.k0) != null)) {
                    ((te) zp4Var).v(sm3Var);
                }
                if (!z3) {
                    sm3Var.N(this);
                    if (sm3Var.J0 > 0) {
                        te teVar4 = (te) vm3.a(sm3Var);
                        ap3 ap3Var = teVar4.U0.e;
                        ap3Var.getClass();
                        if (sm3Var.J0 > 0) {
                            ((ua4) ap3Var.B).b(sm3Var);
                            sm3Var.I0 = true;
                        }
                        teVar4.C(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw i61.e("updateLayerParameters requires a non-null layerBlock");
        } else if (qn2Var == null) {
        } else {
            p53.c("null layer with a non-null layerBlock");
        }
    }

    @Override // defpackage.kz3
    public final kz3 z0() {
        return this.n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z1(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            yp4 yp4Var = this.J0;
            if (yp4Var != null && this.q0) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                ut2 ut2Var = ((xt2) yp4Var).A;
                if (ut2Var.w) {
                    mp2 d = ut2Var.d();
                    if (d instanceof qo4) {
                        of5 of5Var = ((qo4) d).f;
                        if (of5Var.a > intBitsToFloat || intBitsToFloat >= of5Var.c || of5Var.b > intBitsToFloat2 || intBitsToFloat2 >= of5Var.d) {
                            z = false;
                            z2 = true;
                        }
                    } else {
                        if (d instanceof ro4) {
                            u16 u16Var = ((ro4) d).f;
                            float f = u16Var.c;
                            float f2 = u16Var.b;
                            float f3 = u16Var.d;
                            float f4 = u16Var.a;
                            long j2 = u16Var.f;
                            long j3 = u16Var.h;
                            z = false;
                            z2 = true;
                            long j4 = u16Var.g;
                            long j5 = u16Var.e;
                            if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                                int i = (int) (j5 >> 32);
                                float intBitsToFloat3 = Float.intBitsToFloat(i);
                                int i2 = (int) (j2 >> 32);
                                if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                                    int i3 = (int) (j3 >> 32);
                                    float intBitsToFloat4 = Float.intBitsToFloat(i3);
                                    int i4 = (int) (j4 >> 32);
                                    if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                        int i5 = (int) (j5 & 4294967295L);
                                        int i6 = (int) (j3 & 4294967295L);
                                        if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                            int i7 = (int) (j2 & 4294967295L);
                                            int i8 = (int) (j4 & 4294967295L);
                                            if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                                float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                                float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                                float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                                float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                                float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                                float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                                float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                                float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                                if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                                    z3 = uj2.Z(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, u16Var.e);
                                                } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                                    z3 = uj2.Z(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, u16Var.h);
                                                } else if (intBitsToFloat > intBitsToFloat7 && intBitsToFloat2 < intBitsToFloat8) {
                                                    z3 = uj2.Z(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, u16Var.f);
                                                } else {
                                                    if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                        z3 = uj2.Z(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, u16Var.g);
                                                    }
                                                    z3 = z2;
                                                }
                                            }
                                        }
                                    }
                                }
                                hj a = lj.a();
                                hj.c(a, u16Var);
                                z3 = uj2.W(intBitsToFloat, intBitsToFloat2, a);
                            }
                        } else {
                            z = false;
                            z2 = true;
                            if (d instanceof po4) {
                                z3 = uj2.W(intBitsToFloat, intBitsToFloat2, ((po4) d).f);
                            } else {
                                i.d();
                                return false;
                            }
                        }
                        if (z3) {
                            return z2;
                        }
                        return z;
                    }
                    z3 = z;
                    if (z3) {
                    }
                }
                z = false;
                z2 = true;
                z3 = z2;
                if (z3) {
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.kz3
    public final jk3 A0() {
        return this;
    }
}
