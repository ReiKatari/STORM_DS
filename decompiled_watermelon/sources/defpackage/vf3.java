package defpackage;

import androidx.preference.Preference;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf3  reason: default package */
/* loaded from: classes.dex */
public final class vf3 implements au0, xg4, nu0 {
    public static final wq5 K0 = new wq5("Undefined intrinsics block and it is required", 1);
    public static final qf3 L0 = new Object();
    public static final pj M0 = new pj(4);
    public final boolean A;
    public final zc0 A0;
    public int B;
    public final zf3 B0;
    public jg3 C0;
    public m74 D0;
    public boolean E0;
    public zy3 F0;
    public zy3 G0;
    public boolean H0;
    public int I0;
    public boolean J0;
    public boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean c0;
    public vf3 d0;
    public int e0;
    public final ci3 f0;
    public o24 g0;
    public boolean h0;
    public vf3 i0;
    public wg4 j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public ez5 n0;
    public boolean o0;
    public final o24 p0;
    public boolean q0;
    public tv3 r0;
    public k91 s0;
    public od1 t0;
    public sd3 u0;
    public fa7 v0;
    public lv0 w0;
    public tf3 x0;
    public tf3 y0;
    public boolean z0;

    public vf3(int i, boolean z) {
        this.A = z;
        this.B = i;
        this.R = 9223372034707292159L;
        this.X = true;
        this.Y = true;
        this.f0 = new ci3(4, new o24(new vf3[16]), new dj(10, this));
        this.p0 = new o24(new vf3[16]);
        this.q0 = true;
        this.r0 = K0;
        this.t0 = yf3.a;
        this.u0 = sd3.Ltr;
        this.v0 = L0;
        lv0.j.getClass();
        this.w0 = kv0.b;
        tf3 tf3Var = tf3.NotUsed;
        this.x0 = tf3Var;
        this.y0 = tf3Var;
        this.A0 = new zc0(this);
        this.B0 = new zf3(this);
        this.E0 = true;
        this.F0 = wy3.a;
    }

    public static void T(vf3 vf3Var, boolean z, int i) {
        boolean z2;
        vf3 u;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if (vf3Var.d0 == null) {
            mz2.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        wg4 wg4Var = vf3Var.j0;
        if (wg4Var != null && !vf3Var.l0 && !vf3Var.A) {
            ((ee) wg4Var).w(vf3Var, true, z, z2);
            if (z3) {
                ms3 ms3Var = vf3Var.B0.q;
                ms3Var.getClass();
                zf3 zf3Var = ms3Var.Y;
                vf3 u2 = zf3Var.a.u();
                tf3 tf3Var = zf3Var.a.x0;
                if (u2 != null && tf3Var != tf3.NotUsed) {
                    while (u2.x0 == tf3Var && (u = u2.u()) != null) {
                        u2 = u;
                    }
                    int i2 = ks3.b[tf3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (u2.d0 != null) {
                                u2.S(z);
                                return;
                            } else {
                                u2.U(z);
                                return;
                            }
                        }
                        i.n("Intrinsics isn't used by the parent");
                    } else if (u2.d0 != null) {
                        T(u2, z, 6);
                    } else {
                        V(u2, z, 6);
                    }
                }
            }
        }
    }

    public static void V(vf3 vf3Var, boolean z, int i) {
        boolean z2;
        boolean z3;
        wg4 wg4Var;
        vf3 u;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!vf3Var.l0 && !vf3Var.A && (wg4Var = vf3Var.j0) != null) {
            ((ee) wg4Var).w(vf3Var, false, z, z2);
            if (z3) {
                zf3 zf3Var = vf3Var.B0.p.Y;
                vf3 u2 = zf3Var.a.u();
                tf3 tf3Var = zf3Var.a.x0;
                if (u2 != null && tf3Var != tf3.NotUsed) {
                    while (u2.x0 == tf3Var && (u = u2.u()) != null) {
                        u2 = u;
                    }
                    int i2 = qv3.b[tf3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            u2.U(z);
                            return;
                        } else {
                            i.n("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    V(u2, z, 6);
                }
            }
        }
    }

    public static void W(vf3 vf3Var) {
        int i = uf3.a[vf3Var.B0.d.ordinal()];
        zf3 zf3Var = vf3Var.B0;
        if (i == 1) {
            if (zf3Var.e) {
                T(vf3Var, true, 6);
                return;
            }
            if (zf3Var.f) {
                vf3Var.S(true);
            }
            if (vf3Var.q()) {
                V(vf3Var, true, 6);
                return;
            } else if (vf3Var.p()) {
                vf3Var.U(true);
                return;
            } else {
                return;
            }
        }
        f81.A(zf3Var.d, "Unexpected state ");
    }

    private final String j(vf3 vf3Var) {
        String str;
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(vf3Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        vf3 vf3Var2 = vf3Var.i0;
        if (vf3Var2 != null) {
            str = vf3Var2.g(0);
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void A(int i, vf3 vf3Var) {
        if (vf3Var.i0 != null && vf3Var.j0 != null) {
            mz2.c(j(vf3Var));
        }
        vf3Var.i0 = this;
        ci3 ci3Var = this.f0;
        ((o24) ci3Var.B).a(i, vf3Var);
        ((dj) ci3Var.L).c();
        O();
        if (vf3Var.A) {
            this.e0++;
        }
        G();
        wg4 wg4Var = this.j0;
        if (wg4Var != null) {
            vf3Var.d(wg4Var);
        }
        if (vf3Var.B0.l > 0) {
            zf3 zf3Var = this.B0;
            zf3Var.d(zf3Var.l + 1);
        }
        if (vf3Var.I0 > 0) {
            a0(this.I0 + 1);
        }
    }

    public final void B() {
        vg4 vg4Var;
        if (this.E0) {
            zc0 zc0Var = this.A0;
            m74 m74Var = (vz2) zc0Var.d;
            m74 m74Var2 = ((m74) zc0Var.e).n0;
            this.D0 = null;
            while (true) {
                if (b53.x(m74Var, m74Var2)) {
                    break;
                }
                if (m74Var != null) {
                    vg4Var = m74Var.I0;
                } else {
                    vg4Var = null;
                }
                if (vg4Var != null) {
                    this.D0 = m74Var;
                    break;
                } else if (m74Var != null) {
                    m74Var = m74Var.n0;
                } else {
                    m74Var = null;
                }
            }
            this.E0 = false;
        }
        m74 m74Var3 = this.D0;
        if (m74Var3 != null && m74Var3.I0 == null) {
            throw b31.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (m74Var3 != null) {
            m74Var3.f1();
            return;
        }
        vf3 u = u();
        if (u != null) {
            u.B();
            return;
        }
        wg4 wg4Var = this.j0;
        if (wg4Var != null) {
            ((ee) wg4Var).invalidate();
        }
    }

    public final void C() {
        zc0 zc0Var = this.A0;
        m74 m74Var = (m74) zc0Var.e;
        vz2 vz2Var = (vz2) zc0Var.d;
        while (m74Var != vz2Var) {
            m74Var.getClass();
            pf3 pf3Var = (pf3) m74Var;
            vg4 vg4Var = pf3Var.I0;
            if (vg4Var != null) {
                ((tn2) vg4Var).c();
            }
            m74Var = pf3Var.m0;
        }
        vg4 vg4Var2 = ((vz2) zc0Var.d).I0;
        if (vg4Var2 != null) {
            ((tn2) vg4Var2).c();
        }
    }

    @Override // defpackage.xg4
    public final boolean D() {
        return H();
    }

    public final void E() {
        if (this.A) {
            vf3 u = u();
            if (u != null) {
                u.E();
            }
        } else if (this.d0 != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, n75] */
    public final void F() {
        if (this.o0) {
            return;
        }
        if (((i74) this.A0.c).Y != null || this.G0 != null) {
            this.m0 = true;
            return;
        }
        ez5 ez5Var = this.n0;
        this.o0 = true;
        ?? obj = new Object();
        obj.A = new ez5();
        yg4 snapshotObserver = ((ee) yf3.a(this)).getSnapshotObserver();
        wd wdVar = new wd(7, this, obj);
        snapshotObserver.a.d(this, snapshotObserver.d, wdVar);
        this.o0 = false;
        this.n0 = (ez5) obj.A;
        this.m0 = false;
        ee eeVar = (ee) yf3.a(this);
        eeVar.getSemanticsOwner().b(this, ez5Var);
        eeVar.y();
    }

    public final void G() {
        vf3 vf3Var;
        if (this.e0 > 0) {
            this.h0 = true;
        }
        if (this.A && (vf3Var = this.i0) != null) {
            vf3Var.G();
        }
    }

    public final boolean H() {
        if (this.j0 != null) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.B0.p.n0;
    }

    public final Boolean J() {
        boolean z;
        ms3 ms3Var = this.B0.q;
        if (ms3Var != null) {
            if (ms3Var.l0 != js3.IsNotPlaced) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void K() {
        vf3 u;
        if (this.x0 == tf3.NotUsed) {
            f();
        }
        ms3 ms3Var = this.B0.q;
        ms3Var.getClass();
        boolean z = true;
        try {
            ms3Var.Z = true;
            if (!ms3Var.g0) {
                mz2.c("replace() called on item that was not placed");
            }
            ms3Var.w0 = false;
            if (ms3Var.l0 == js3.IsNotPlaced) {
                z = false;
            }
            ms3Var.C0(ms3Var.j0, ms3Var.k0);
            if (z && !ms3Var.w0 && (u = ms3Var.Y.a.u()) != null) {
                u.S(false);
            }
            ms3Var.Z = false;
        } catch (Throwable th) {
            ms3Var.Z = false;
            throw th;
        }
    }

    public final void L(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            int i6 = i > i2 ? i2 + i5 : (i2 + i3) - 2;
            ci3 ci3Var = this.f0;
            dj djVar = (dj) ci3Var.L;
            Object l = ((o24) ci3Var.B).l(i4);
            djVar.c();
            ((o24) ci3Var.B).a(i6, (vf3) l);
            djVar.c();
        }
        O();
        G();
        E();
    }

    public final void M(vf3 vf3Var) {
        zf3 zf3Var;
        if (vf3Var.B0.l > 0) {
            this.B0.d(zf3Var.l - 1);
        }
        if (this.j0 != null) {
            vf3Var.h();
        }
        vf3Var.i0 = null;
        if (vf3Var.I0 > 0) {
            a0(this.I0 - 1);
        }
        ((m74) vf3Var.A0.e).n0 = null;
        if (vf3Var.A) {
            this.e0--;
            o24 o24Var = (o24) vf3Var.f0.B;
            Object[] objArr = o24Var.A;
            int i = o24Var.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((m74) ((vf3) objArr[i2]).A0.e).n0 = null;
            }
        }
        G();
        O();
    }

    public final void N(m74 m74Var) {
        b65 b65Var;
        boolean z;
        wg4 wg4Var = this.j0;
        if (wg4Var != null) {
            b65Var = ((ee) wg4Var).getRectManager();
        } else {
            b65Var = null;
        }
        zf3 zf3Var = this.B0;
        int i = 0;
        if (zf3Var.d == rf3.Idle && !q() && !p()) {
            z = false;
        } else {
            z = true;
        }
        if (this.Z && b65Var != null) {
            if (m74Var == ((m74) this.A0.e)) {
                this.Y = true;
                if (!z) {
                    b65Var.f(this);
                }
            } else {
                this.X = true;
                o24 y = y();
                Object[] objArr = y.A;
                int i2 = y.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    vf3 vf3Var = (vf3) objArr[i3];
                    vf3Var.Y = true;
                    if (!z) {
                        b65Var.f(vf3Var);
                    }
                }
                if (this.Z) {
                    b65Var.e = true;
                    sh shVar = b65Var.b;
                    int i4 = this.B & 33554431;
                    long[] jArr = (long[]) shVar.c;
                    int i5 = shVar.b;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                b65Var.i();
            }
        }
        zf3Var.p.F0();
    }

    public final void O() {
        if (this.A) {
            vf3 u = u();
            if (u != null) {
                u.O();
                return;
            }
            return;
        }
        this.q0 = true;
    }

    public final void P() {
        ci3 ci3Var = this.f0;
        int i = ((o24) ci3Var.B).L;
        while (true) {
            i--;
            o24 o24Var = (o24) ci3Var.B;
            if (-1 < i) {
                M((vf3) o24Var.A[i]);
            } else {
                o24Var.h();
                ((dj) ci3Var.L).c();
                return;
            }
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            mz2.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            ci3 ci3Var = this.f0;
            M((vf3) ((o24) ci3Var.B).A[i3]);
            Object l = ((o24) ci3Var.B).l(i3);
            ((dj) ci3Var.L).c();
            vf3 vf3Var = (vf3) l;
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void R() {
        vf3 u;
        if (this.x0 == tf3.NotUsed) {
            f();
        }
        sv3 sv3Var = this.B0.p;
        zf3 zf3Var = sv3Var.Y;
        try {
            sv3Var.Z = true;
            if (!sv3Var.f0) {
                mz2.c("replace called on unplaced item");
            }
            boolean z = sv3Var.n0;
            sv3Var.B0(sv3Var.i0, sv3Var.k0, sv3Var.j0);
            if (z && !sv3Var.A0 && (u = zf3Var.a.u()) != null) {
                u.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z) {
        wg4 wg4Var;
        if (!this.A && (wg4Var = this.j0) != null) {
            ((ee) wg4Var).x(this, true, z);
        }
    }

    public final void U(boolean z) {
        wg4 wg4Var;
        if (!this.A && (wg4Var = this.j0) != null) {
            ((ee) wg4Var).x(this, false, z);
        }
    }

    public final void X() {
        o24 y = y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var = (vf3) objArr[i2];
            tf3 tf3Var = vf3Var.y0;
            vf3Var.x0 = tf3Var;
            if (tf3Var != tf3.NotUsed) {
                vf3Var.X();
            }
        }
    }

    public final void Y(Throwable th) {
        lv0 lv0Var = this.w0;
        ye6 ye6Var = hv0.a;
        sm4 sm4Var = (sm4) lv0Var;
        sm4Var.getClass();
        gv0 gv0Var = (gv0) l.L(sm4Var, ye6Var);
        if (gv0Var != null) {
            f34.U(th, new p6(19, gv0Var, this));
        }
        throw th;
    }

    public final void Z(od1 od1Var) {
        if (!b53.x(this.t0, od1Var)) {
            this.t0 = od1Var;
            E();
            vf3 u = u();
            if (u != null) {
                u.B();
            } else {
                wg4 wg4Var = this.j0;
                if (wg4Var != null) {
                    ((ee) wg4Var).invalidate();
                }
            }
            C();
            for (yy3 yy3Var = (yy3) this.A0.g; yy3Var != null; yy3Var = yy3Var.Y) {
                yy3Var.a();
            }
        }
    }

    @Override // defpackage.au0
    public final void a() {
        jg3 jg3Var = this.C0;
        if (jg3Var != null) {
            jg3Var.a();
        }
        zc0 zc0Var = this.A0;
        m74 m74Var = ((vz2) zc0Var.d).m0;
        for (m74 m74Var2 = (m74) zc0Var.e; !b53.x(m74Var2, m74Var) && m74Var2 != null; m74Var2 = m74Var2.m0) {
            m74Var2.k1();
        }
    }

    public final void a0(int i) {
        vf3 u;
        vf3 u2;
        int i2 = this.I0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (u2 = u()) != null) {
                u2.a0(u2.I0 + 1);
            }
            if (i == 0 && this.I0 > 0 && (u = u()) != null) {
                u.a0(u.I0 - 1);
            }
            this.I0 = i;
        }
    }

    @Override // defpackage.au0
    public final void b() {
        yc ycVar;
        jg3 jg3Var = this.C0;
        if (jg3Var != null) {
            jg3Var.i(true);
        }
        this.J0 = true;
        yy3 yy3Var = (lm6) this.A0.f;
        for (yy3 yy3Var2 = yy3Var; yy3Var2 != null; yy3Var2 = yy3Var2.X) {
            if (yy3Var2.i0) {
                yy3Var2.M0();
            }
        }
        for (yy3 yy3Var3 = yy3Var; yy3Var3 != null; yy3Var3 = yy3Var3.X) {
            if (yy3Var3.i0) {
                yy3Var3.O0();
            }
        }
        while (yy3Var != null) {
            if (yy3Var.i0) {
                yy3Var.I0();
            }
            yy3Var = yy3Var.X;
        }
        if (H()) {
            this.n0 = null;
            this.m0 = false;
        }
        wg4 wg4Var = this.j0;
        if (wg4Var != null) {
            ee eeVar = (ee) wg4Var;
            if (ee.e() && (ycVar = eeVar.K0) != null && ycVar.c0.f(this.B)) {
                ycVar.A.C(ycVar.L, this.B, false);
            }
        }
    }

    public final void b0(vf3 vf3Var) {
        if (!b53.x(vf3Var, this.d0)) {
            this.d0 = vf3Var;
            zf3 zf3Var = this.B0;
            if (vf3Var != null) {
                if (zf3Var.q == null) {
                    zf3Var.q = new ms3(zf3Var);
                }
                zc0 zc0Var = this.A0;
                m74 m74Var = ((vz2) zc0Var.d).m0;
                for (m74 m74Var2 = (m74) zc0Var.e; !b53.x(m74Var2, m74Var) && m74Var2 != null; m74Var2 = m74Var2.m0) {
                    m74Var2.T0();
                }
            } else {
                zf3Var.q = null;
                zf3Var.f = false;
                zf3Var.e = false;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [yy3, m74] */
    public final void c(zy3 zy3Var) {
        int i;
        ?? r7;
        o24 o24Var;
        boolean z;
        zc0 zc0Var;
        i74 i74Var;
        o24 o24Var2;
        boolean z2;
        vz2 vz2Var;
        boolean z3;
        boolean z4;
        zc0 zc0Var2;
        boolean z5;
        boolean z6;
        yb ybVar;
        zc0 zc0Var3 = this.A0;
        boolean g = zc0Var3.g(16);
        yy3 yy3Var = (lm6) zc0Var3.f;
        boolean g2 = zc0Var3.g(1024);
        this.F0 = zy3Var;
        vz2 vz2Var2 = (vz2) zc0Var3.d;
        vf3 vf3Var = (vf3) zc0Var3.b;
        yy3 yy3Var2 = (yy3) zc0Var3.g;
        i74 i74Var2 = (i74) zc0Var3.c;
        if (yy3Var2 == i74Var2) {
            mz2.c("padChain called on already padded chain");
        }
        yy3 yy3Var3 = (yy3) zc0Var3.g;
        yy3Var3.X = i74Var2;
        i74Var2.Y = yy3Var3;
        o24 o24Var3 = (o24) zc0Var3.h;
        if (o24Var3 != null) {
            i = o24Var3.L;
        } else {
            i = 0;
        }
        o24 o24Var4 = (o24) zc0Var3.i;
        if (o24Var4 == null) {
            o24Var4 = new o24(new xy3[16]);
        }
        o24 o24Var5 = (o24) zc0Var3.j;
        o24Var5.b(zy3Var);
        yb ybVar2 = null;
        while (true) {
            int i2 = o24Var5.L;
            if (i2 == 0) {
                break;
            }
            zy3 zy3Var2 = (zy3) o24Var5.l(i2 - 1);
            if (zy3Var2 instanceof vr0) {
                vr0 vr0Var = (vr0) zy3Var2;
                o24Var5.b(vr0Var.b);
                o24Var5.b(vr0Var.a);
            } else if (zy3Var2 instanceof xy3) {
                o24Var4.b(zy3Var2);
            } else {
                if (ybVar2 == null) {
                    ybVar = new yb(21, o24Var4);
                    ybVar2 = ybVar;
                } else {
                    ybVar = ybVar2;
                }
                zy3Var2.b(ybVar);
            }
        }
        int i3 = o24Var4.L;
        if (i3 == i) {
            yy3 yy3Var4 = i74Var2.Y;
            zc0 zc0Var4 = zc0Var3;
            int i4 = 0;
            while (yy3Var4 != null && i4 < i) {
                if (o24Var3 != null) {
                    xy3 xy3Var = (xy3) o24Var3.A[i4];
                    xy3 xy3Var2 = (xy3) o24Var4.A[i4];
                    if (b53.x(xy3Var, xy3Var2)) {
                        zc0Var2 = zc0Var4;
                        z6 = true;
                    } else {
                        zc0Var2 = zc0Var4;
                        if (xy3Var.getClass() == xy3Var2.getClass()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (z6) {
                        if (z6) {
                            zc0.l(xy3Var, xy3Var2, yy3Var4);
                        }
                        yy3Var4 = yy3Var4.Y;
                        i4++;
                        zc0Var4 = zc0Var2;
                    } else {
                        yy3Var4 = yy3Var4.X;
                        break;
                    }
                } else {
                    throw b31.e("expected prior modifier list to be non-empty");
                }
            }
            zc0Var2 = zc0Var4;
            if (i4 < i) {
                if (o24Var3 != null) {
                    if (yy3Var4 != null) {
                        if (vf3Var.G0 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        o24Var = o24Var3;
                        o24Var2 = o24Var4;
                        z4 = false;
                        yy3 yy3Var5 = yy3Var4;
                        zc0Var = zc0Var2;
                        zc0Var.j(i4, o24Var, o24Var2, yy3Var5, !z5);
                        i74Var = i74Var2;
                        z2 = true;
                        r7 = z4;
                    } else {
                        throw b31.e("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw b31.e("expected prior modifier list to be non-empty");
                }
            } else {
                zc0Var3 = zc0Var2;
                z3 = false;
                zc0Var = zc0Var3;
                o24Var = o24Var3;
                i74Var = i74Var2;
                o24Var2 = o24Var4;
                z2 = false;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z4 = false;
            z3 = false;
            zy3 zy3Var3 = vf3Var.G0;
            if (zy3Var3 != null && i == 0) {
                yy3 yy3Var6 = i74Var2;
                for (int i5 = 0; i5 < o24Var4.L; i5++) {
                    yy3Var6 = zc0.c((xy3) o24Var4.A[i5], yy3Var6);
                }
                int i6 = 0;
                for (yy3 yy3Var7 = yy3Var.X; yy3Var7 != null && yy3Var7 != i74Var2; yy3Var7 = yy3Var7.X) {
                    i6 |= yy3Var7.L;
                    yy3Var7.R = i6;
                }
                zc0Var = zc0Var3;
                o24Var = o24Var3;
                i74Var = i74Var2;
                o24Var2 = o24Var4;
                z2 = true;
                r7 = z4;
            } else if (i3 == 0) {
                if (o24Var3 != null) {
                    yy3 yy3Var8 = i74Var2.Y;
                    for (int i7 = 0; yy3Var8 != null && i7 < o24Var3.L; i7++) {
                        yy3Var8 = zc0.d(yy3Var8).Y;
                    }
                    vf3 u = vf3Var.u();
                    if (u != null) {
                        vz2Var = (vz2) u.A0.d;
                    } else {
                        vz2Var = null;
                    }
                    vz2Var2.n0 = vz2Var;
                    zc0Var3.e = vz2Var2;
                    zc0Var = zc0Var3;
                    o24Var = o24Var3;
                    i74Var = i74Var2;
                    o24Var2 = o24Var4;
                    z2 = false;
                    r7 = z3;
                } else {
                    throw b31.e("expected prior modifier list to be non-empty");
                }
            } else {
                if (o24Var3 == null) {
                    o24Var3 = new o24(new xy3[16]);
                }
                o24Var = o24Var3;
                if (zy3Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                zc0Var = zc0Var3;
                i74Var = i74Var2;
                o24Var2 = o24Var4;
                zc0Var.j(0, o24Var, o24Var2, i74Var, !z);
                z2 = true;
            }
        }
        zc0Var.h = o24Var2;
        if (o24Var != null) {
            o24Var.h();
        } else {
            o24Var = r7;
        }
        zc0Var.i = o24Var;
        yy3 yy3Var9 = i74Var.Y;
        if (yy3Var9 != null) {
            yy3Var = yy3Var9;
        }
        yy3Var.X = r7;
        i74Var.Y = r7;
        i74Var.R = -1;
        i74Var.c0 = r7;
        if (yy3Var == i74Var) {
            mz2.c("trimChain did not update the head");
        }
        zc0Var.g = yy3Var;
        if (z2) {
            zc0Var.k();
        }
        boolean g3 = zc0Var.g(16);
        boolean g4 = zc0Var.g(1024);
        this.B0.j();
        if (this.d0 == null && zc0Var.g(512)) {
            b0(this);
        }
        if (g != g3 || g2 != g4) {
            b65 rectManager = ((ee) yf3.a(this)).getRectManager();
            rectManager.getClass();
            if (H()) {
                sh shVar = rectManager.b;
                int i8 = this.B & 33554431;
                long[] jArr = (long[]) shVar.c;
                int i9 = shVar.b;
                for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                    int i11 = i10 + 2;
                    long j = jArr[i11];
                    if ((((int) j) & 33554431) == i8) {
                        jArr[i11] = ((-6917529027641081857L) & j) | ((g4 ? 1L : 0L) * 2305843009213693952L) | ((g3 ? 1L : 0L) * 4611686018427387904L);
                        return;
                    }
                }
            }
        }
    }

    public final void c0(tv3 tv3Var) {
        if (!b53.x(this.r0, tv3Var)) {
            this.r0 = tv3Var;
            k91 k91Var = this.s0;
            if (k91Var != null) {
                ((tj4) k91Var.B).setValue(tv3Var);
            }
            E();
        }
    }

    public final void d(wg4 wg4Var) {
        vz2 vz2Var;
        int i;
        vf3 vf3Var;
        yc ycVar;
        ez5 w;
        wg4 wg4Var2;
        String str;
        if (this.j0 != null) {
            mz2.c("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        vf3 vf3Var2 = this.i0;
        if (vf3Var2 != null && !b53.x(vf3Var2.j0, wg4Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(wg4Var);
            sb.append(") than the parent's owner(");
            vf3 u = u();
            if (u != null) {
                wg4Var2 = u.j0;
            } else {
                wg4Var2 = null;
            }
            sb.append(wg4Var2);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            vf3 vf3Var3 = this.i0;
            if (vf3Var3 != null) {
                str = vf3Var3.g(0);
            } else {
                str = null;
            }
            sb.append(str);
            mz2.c(sb.toString());
        }
        vf3 u2 = u();
        zf3 zf3Var = this.B0;
        if (u2 == null) {
            zf3Var.p.n0 = true;
            ((ee) wg4Var).getRectManager().f(this);
            ms3 ms3Var = zf3Var.q;
            if (ms3Var != null) {
                ms3Var.l0 = js3.IsPlacedInLookahead;
            }
        }
        zc0 zc0Var = this.A0;
        m74 m74Var = (m74) zc0Var.e;
        if (u2 != null) {
            vz2Var = (vz2) u2.A0.d;
        } else {
            vz2Var = null;
        }
        m74Var.n0 = vz2Var;
        this.j0 = wg4Var;
        if (u2 != null) {
            i = u2.k0;
        } else {
            i = -1;
        }
        this.k0 = i + 1;
        zy3 zy3Var = this.G0;
        if (zy3Var != null) {
            c(zy3Var);
        }
        this.G0 = null;
        ((ee) wg4Var).m7getLayoutNodes().i(this.B, this);
        if (this.c0) {
            b0(this);
        } else {
            vf3 vf3Var4 = this.i0;
            if (vf3Var4 == null || (vf3Var = vf3Var4.d0) == null) {
                vf3Var = this.d0;
            }
            b0(vf3Var);
            if (this.d0 == null && zc0Var.g(512)) {
                b0(this);
            }
        }
        if (!this.J0) {
            for (yy3 yy3Var = (yy3) zc0Var.g; yy3Var != null; yy3Var = yy3Var.Y) {
                yy3Var.H0();
            }
        }
        o24 o24Var = (o24) this.f0.B;
        Object[] objArr = o24Var.A;
        int i2 = o24Var.L;
        for (int i3 = 0; i3 < i2; i3++) {
            ((vf3) objArr[i3]).d(wg4Var);
        }
        if (!this.J0) {
            zc0Var.i();
        }
        E();
        if (u2 != null) {
            u2.E();
        }
        zf3Var.j();
        if (!this.J0 && zc0Var.g(8)) {
            F();
        }
        ee eeVar = (ee) wg4Var;
        if (ee.e() && (ycVar = eeVar.K0) != null && (w = w()) != null && w.A.b(mz5.r)) {
            ycVar.c0.a(this.B);
            ycVar.A.C(ycVar.L, this.B, true);
        }
    }

    public final void d0(zy3 zy3Var) {
        if (this.A && this.F0 != wy3.a) {
            mz2.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.J0) {
            mz2.a("modifier is updated when deactivated");
        }
        if (H()) {
            c(zy3Var);
            if (this.m0) {
                F();
                return;
            }
            return;
        }
        this.G0 = zy3Var;
    }

    public final void e() {
        this.y0 = this.x0;
        this.x0 = tf3.NotUsed;
        o24 y = y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var = (vf3) objArr[i2];
            if (vf3Var.x0 != tf3.NotUsed) {
                vf3Var.e();
            }
        }
    }

    public final void e0(fa7 fa7Var) {
        if (!b53.x(this.v0, fa7Var)) {
            this.v0 = fa7Var;
            yy3 yy3Var = (yy3) this.A0.g;
            if ((yy3Var.R & 16) != 0) {
                while (yy3Var != null) {
                    if ((yy3Var.L & 16) != 0) {
                        yy3 yy3Var2 = yy3Var;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            if (yy3Var2 instanceof up4) {
                                ((up4) yy3Var2).k0();
                            } else if ((yy3Var2.L & 16) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 16) != 0) {
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
                    if ((yy3Var.R & 16) != 0) {
                        yy3Var = yy3Var.Y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        this.y0 = this.x0;
        this.x0 = tf3.NotUsed;
        o24 y = y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var = (vf3) objArr[i2];
            if (vf3Var.x0 == tf3.InLayoutBlock) {
                vf3Var.f();
            }
        }
    }

    public final void f0() {
        if (this.e0 > 0 && this.h0) {
            this.h0 = false;
            o24 o24Var = this.g0;
            if (o24Var == null) {
                o24Var = new o24(new vf3[16]);
                this.g0 = o24Var;
            }
            o24Var.h();
            o24 o24Var2 = (o24) this.f0.B;
            Object[] objArr = o24Var2.A;
            int i = o24Var2.L;
            for (int i2 = 0; i2 < i; i2++) {
                vf3 vf3Var = (vf3) objArr[i2];
                if (vf3Var.A) {
                    o24Var.c(o24Var.L, vf3Var.y());
                } else {
                    o24Var.b(vf3Var);
                }
            }
            zf3 zf3Var = this.B0;
            zf3Var.p.u0 = true;
            ms3 ms3Var = zf3Var.q;
            if (ms3Var != null) {
                ms3Var.o0 = true;
            }
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        o24 y = y();
        Object[] objArr = y.A;
        int i3 = y.L;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((vf3) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void h() {
        yc ycVar;
        wf3 wf3Var;
        wg4 wg4Var = this.j0;
        String str = null;
        if (wg4Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            vf3 u = u();
            if (u != null) {
                str = u.g(0);
            }
            sb.append(str);
            mz2.d(sb.toString());
            f81.c();
            return;
        }
        vf3 u2 = u();
        zf3 zf3Var = this.B0;
        if (u2 != null) {
            u2.B();
            u2.E();
            sv3 sv3Var = zf3Var.p;
            tf3 tf3Var = tf3.NotUsed;
            sv3Var.g0 = tf3Var;
            ms3 ms3Var = zf3Var.q;
            if (ms3Var != null) {
                ms3Var.e0 = tf3Var;
            }
        }
        wf3 wf3Var2 = zf3Var.p.s0;
        wf3Var2.b = true;
        wf3Var2.c = false;
        wf3Var2.e = false;
        wf3Var2.d = false;
        wf3Var2.f = false;
        wf3Var2.g = false;
        wf3Var2.h = null;
        ms3 ms3Var2 = zf3Var.q;
        if (ms3Var2 != null && (wf3Var = ms3Var2.m0) != null) {
            wf3Var.b = true;
            wf3Var.c = false;
            wf3Var.e = false;
            wf3Var.d = false;
            wf3Var.f = false;
            wf3Var.g = false;
            wf3Var.h = null;
        }
        zc0 zc0Var = this.A0;
        yy3 yy3Var = (lm6) zc0Var.f;
        m74 m74Var = ((vz2) zc0Var.d).m0;
        for (m74 m74Var2 = (m74) zc0Var.e; !b53.x(m74Var2, m74Var) && m74Var2 != null; m74Var2 = m74Var2.m0) {
            m74Var2.q1();
            if (m74Var2.j0.I()) {
                m74Var2.l1();
            }
        }
        for (yy3 yy3Var2 = yy3Var; yy3Var2 != null; yy3Var2 = yy3Var2.X) {
            if (yy3Var2.i0) {
                yy3Var2.O0();
            }
        }
        this.l0 = true;
        o24 o24Var = (o24) this.f0.B;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((vf3) objArr[i2]).h();
        }
        this.l0 = false;
        while (yy3Var != null) {
            if (yy3Var.i0) {
                yy3Var.I0();
            }
            yy3Var = yy3Var.X;
        }
        ee eeVar = (ee) wg4Var;
        eeVar.m7getLayoutNodes().g(this.B);
        pv3 pv3Var = eeVar.T0;
        os osVar = pv3Var.b;
        ((t71) osVar.B).r(this);
        ((t71) osVar.L).r(this);
        ((t71) osVar.R).r(this);
        ((o24) pv3Var.e.B).k(this);
        eeVar.L0 = true;
        if (ee.e() && (ycVar = eeVar.K0) != null && ycVar.c0.f(this.B)) {
            ycVar.A.C(ycVar.L, this.B, false);
        }
        eeVar.getRectManager().g(this);
        this.j0 = null;
        b0(null);
        this.k0 = 0;
        sv3 sv3Var2 = zf3Var.p;
        sv3Var2.d0 = Preference.DEFAULT_ORDER;
        sv3Var2.c0 = Preference.DEFAULT_ORDER;
        sv3Var2.n0 = false;
        ms3 ms3Var3 = zf3Var.q;
        if (ms3Var3 != null) {
            ms3Var3.d0 = Preference.DEFAULT_ORDER;
            ms3Var3.c0 = Preference.DEFAULT_ORDER;
            ms3Var3.l0 = js3.IsNotPlaced;
        }
        if (zc0Var.g(8)) {
            ez5 ez5Var = this.n0;
            this.n0 = null;
            this.m0 = false;
            eeVar.getSemanticsOwner().b(this, ez5Var);
            eeVar.y();
        }
    }

    public final void i(oh0 oh0Var, pn2 pn2Var) {
        try {
            ((m74) this.A0.e).R0(oh0Var, pn2Var);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        lz0 lz0Var;
        if (this.d0 != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        sv3 sv3Var = this.B0.p;
        if (sv3Var.e0) {
            lz0Var = new lz0(sv3Var.R);
        } else {
            lz0Var = null;
        }
        wg4 wg4Var = this.j0;
        if (lz0Var != null) {
            if (wg4Var != null) {
                ((ee) wg4Var).t(this, lz0Var.a);
            }
        } else if (wg4Var != null) {
            ((ee) wg4Var).s(true);
        }
    }

    public final List l() {
        ms3 ms3Var = this.B0.q;
        ms3Var.getClass();
        o24 o24Var = ms3Var.n0;
        zf3 zf3Var = ms3Var.Y;
        zf3Var.a.n();
        if (!ms3Var.o0) {
            return o24Var.g();
        }
        vf3 vf3Var = zf3Var.a;
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (o24Var.L <= i2) {
                ms3 ms3Var2 = vf3Var2.B0.q;
                ms3Var2.getClass();
                o24Var.b(ms3Var2);
            } else {
                ms3 ms3Var3 = vf3Var2.B0.q;
                ms3Var3.getClass();
                Object[] objArr2 = o24Var.A;
                Object obj = objArr2[i2];
                objArr2[i2] = ms3Var3;
            }
        }
        o24Var.m(((o24) ((u14) vf3Var.n()).B).L, o24Var.L);
        ms3Var.o0 = false;
        return o24Var.g();
    }

    public final List m() {
        return this.B0.p.r0();
    }

    public final List n() {
        return y().g();
    }

    public final List o() {
        return ((o24) this.f0.B).g();
    }

    public final boolean p() {
        return this.B0.p.q0;
    }

    public final boolean q() {
        return this.B0.p.p0;
    }

    public final tf3 r() {
        return this.B0.p.g0;
    }

    public final tf3 s() {
        tf3 tf3Var;
        ms3 ms3Var = this.B0.q;
        if (ms3Var != null && (tf3Var = ms3Var.e0) != null) {
            return tf3Var;
        }
        return tf3.NotUsed;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k91, java.lang.Object] */
    public final k91 t() {
        k91 k91Var = this.s0;
        if (k91Var == null) {
            tv3 tv3Var = this.r0;
            ?? obj = new Object();
            obj.A = this;
            obj.B = me2.G(tv3Var);
            this.s0 = obj;
            return obj;
        }
        return k91Var;
    }

    public final String toString() {
        return me2.T(this) + " children: " + ((o24) ((u14) n()).B).L + " measurePolicy: " + this.r0 + " deactivated: " + this.J0;
    }

    public final vf3 u() {
        vf3 vf3Var = this.i0;
        while (vf3Var != null && vf3Var.A) {
            vf3Var = vf3Var.i0;
        }
        return vf3Var;
    }

    public final int v() {
        return this.B0.p.d0;
    }

    public final ez5 w() {
        if (H() && !this.J0 && this.A0.g(8)) {
            return this.n0;
        }
        return null;
    }

    public final o24 x() {
        boolean z = this.q0;
        o24 o24Var = this.p0;
        if (z) {
            o24Var.h();
            o24Var.c(o24Var.L, y());
            Arrays.sort(o24Var.A, 0, o24Var.L, M0);
            this.q0 = false;
        }
        return o24Var;
    }

    public final o24 y() {
        f0();
        if (this.e0 == 0) {
            return (o24) this.f0.B;
        }
        o24 o24Var = this.g0;
        o24Var.getClass();
        return o24Var;
    }

    public final void z(long j, yr2 yr2Var, int i, boolean z) {
        zc0 zc0Var = this.A0;
        rf5 rf5Var = m74.J0;
        ((m74) zc0Var.e).d1(m74.M0, ((m74) zc0Var.e).V0(j, true), yr2Var, i, z);
    }

    public vf3(int i) {
        this(fz5.a.addAndGet(1), (i & 1) == 0);
    }
}
