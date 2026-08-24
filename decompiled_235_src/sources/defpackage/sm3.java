package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm3  reason: default package */
/* loaded from: classes.dex */
public final class sm3 implements ww0, aq4, jx0 {
    public static final q16 L0 = new q16("Undefined intrinsics block and it is required", 1);
    public static final nm3 M0 = new Object();
    public static final bk N0 = new bk(4);
    public final boolean A;
    public boolean A0;
    public int B;
    public final if0 B0;
    public final wm3 C0;
    public gn3 D0;
    public eg4 E0;
    public boolean F0;
    public a74 G0;
    public a74 H0;
    public boolean I0;
    public int J0;
    public boolean K0;
    public boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean d0;
    public sm3 e0;
    public int f0;
    public final ap3 g0;
    public ua4 h0;
    public boolean i0;
    public sm3 j0;
    public zp4 k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public ta6 o0;
    public boolean p0;
    public final ua4 q0;
    public boolean r0;
    public e34 s0;
    public yc1 t0;
    public qh1 u0;
    public kk3 v0;
    public fo7 w0;
    public hy0 x0;
    public qm3 y0;
    public qm3 z0;

    public sm3(boolean z, int i) {
        this.A = z;
        this.B = i;
        this.R = 9223372034707292159L;
        this.X = true;
        this.Y = true;
        this.g0 = new ap3(6, new ua4(new sm3[16]), new pj(this, 10));
        this.q0 = new ua4(new sm3[16]);
        this.r0 = true;
        this.s0 = L0;
        this.u0 = vm3.a;
        this.v0 = kk3.Ltr;
        this.w0 = M0;
        hy0.j.getClass();
        this.x0 = gy0.b;
        qm3 qm3Var = qm3.NotUsed;
        this.y0 = qm3Var;
        this.z0 = qm3Var;
        this.B0 = new if0(this);
        this.C0 = new wm3(this);
        this.F0 = true;
        this.G0 = x64.a;
    }

    public static void T(sm3 sm3Var, boolean z, int i) {
        boolean z2;
        sm3 v;
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
        if (sm3Var.e0 == null) {
            p53.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        zp4 zp4Var = sm3Var.k0;
        if (zp4Var != null && !sm3Var.m0 && !sm3Var.A) {
            ((te) zp4Var).w(sm3Var, true, z, z2);
            if (z3) {
                rz3 rz3Var = sm3Var.C0.q;
                rz3Var.getClass();
                wm3 wm3Var = rz3Var.Y;
                sm3 v2 = wm3Var.a.v();
                qm3 qm3Var = wm3Var.a.y0;
                if (v2 != null && qm3Var != qm3.NotUsed) {
                    while (v2.y0 == qm3Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int i2 = pz3.b[qm3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (v2.e0 != null) {
                                v2.S(z);
                                return;
                            } else {
                                v2.U(z);
                                return;
                            }
                        }
                        i.m("Intrinsics isn't used by the parent");
                    } else if (v2.e0 != null) {
                        T(v2, z, 6);
                    } else {
                        V(v2, z, 6);
                    }
                }
            }
        }
    }

    public static void V(sm3 sm3Var, boolean z, int i) {
        boolean z2;
        boolean z3;
        zp4 zp4Var;
        sm3 v;
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
        if (!sm3Var.m0 && !sm3Var.A && (zp4Var = sm3Var.k0) != null) {
            ((te) zp4Var).w(sm3Var, false, z, z2);
            if (z3) {
                wm3 wm3Var = sm3Var.C0.p.Y;
                sm3 v2 = wm3Var.a.v();
                qm3 qm3Var = wm3Var.a.y0;
                if (v2 != null && qm3Var != qm3.NotUsed) {
                    while (v2.y0 == qm3Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int i2 = b34.b[qm3Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            v2.U(z);
                            return;
                        } else {
                            i.m("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    V(v2, z, 6);
                }
            }
        }
    }

    public static void W(sm3 sm3Var) {
        int i = rm3.a[sm3Var.C0.d.ordinal()];
        wm3 wm3Var = sm3Var.C0;
        if (i == 1) {
            if (wm3Var.e) {
                T(sm3Var, true, 6);
                return;
            }
            if (wm3Var.f) {
                sm3Var.S(true);
            }
            if (sm3Var.q()) {
                V(sm3Var, true, 6);
                return;
            } else if (sm3Var.p()) {
                sm3Var.U(true);
                return;
            } else {
                return;
            }
        }
        e41.z(wm3Var.d, "Unexpected state ");
    }

    private final String j(sm3 sm3Var) {
        String str;
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(sm3Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        sm3 sm3Var2 = sm3Var.j0;
        if (sm3Var2 != null) {
            str = sm3Var2.g(0);
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void A(long j, zx2 zx2Var, int i, boolean z) {
        if0 if0Var = this.B0;
        op5 op5Var = eg4.K0;
        ((eg4) if0Var.e).d1(eg4.N0, ((eg4) if0Var.e).V0(j, true), zx2Var, i, z);
    }

    public final void B(int i, sm3 sm3Var) {
        if (sm3Var.j0 != null && sm3Var.k0 != null) {
            p53.c(j(sm3Var));
        }
        sm3Var.j0 = this;
        ap3 ap3Var = this.g0;
        ((ua4) ap3Var.B).a(i, sm3Var);
        ((pj) ap3Var.L).c();
        O();
        if (sm3Var.A) {
            this.f0++;
        }
        G();
        zp4 zp4Var = this.k0;
        if (zp4Var != null) {
            sm3Var.d(zp4Var);
        }
        if (sm3Var.C0.l > 0) {
            wm3 wm3Var = this.C0;
            wm3Var.d(wm3Var.l + 1);
        }
        if (sm3Var.J0 > 0) {
            a0(this.J0 + 1);
        }
    }

    public final void C() {
        yp4 yp4Var;
        if (this.F0) {
            if0 if0Var = this.B0;
            eg4 eg4Var = (y53) if0Var.d;
            eg4 eg4Var2 = ((eg4) if0Var.e).o0;
            this.E0 = null;
            while (true) {
                if (nb3.k(eg4Var, eg4Var2)) {
                    break;
                }
                if (eg4Var != null) {
                    yp4Var = eg4Var.J0;
                } else {
                    yp4Var = null;
                }
                if (yp4Var != null) {
                    this.E0 = eg4Var;
                    break;
                } else if (eg4Var != null) {
                    eg4Var = eg4Var.o0;
                } else {
                    eg4Var = null;
                }
            }
            this.F0 = false;
        }
        eg4 eg4Var3 = this.E0;
        if (eg4Var3 != null && eg4Var3.J0 == null) {
            throw i61.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (eg4Var3 != null) {
            eg4Var3.f1();
            return;
        }
        sm3 v = v();
        if (v != null) {
            v.C();
            return;
        }
        zp4 zp4Var = this.k0;
        if (zp4Var != null) {
            ((te) zp4Var).invalidate();
        }
    }

    public final void D() {
        if0 if0Var = this.B0;
        eg4 eg4Var = (eg4) if0Var.e;
        y53 y53Var = (y53) if0Var.d;
        while (eg4Var != y53Var) {
            eg4Var.getClass();
            mm3 mm3Var = (mm3) eg4Var;
            yp4 yp4Var = mm3Var.J0;
            if (yp4Var != null) {
                ((xt2) yp4Var).c();
            }
            eg4Var = mm3Var.n0;
        }
        yp4 yp4Var2 = ((y53) if0Var.d).J0;
        if (yp4Var2 != null) {
            ((xt2) yp4Var2).c();
        }
    }

    public final void E() {
        if (this.A) {
            sm3 v = v();
            if (v != null) {
                v.E();
            }
        } else if (this.e0 != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dh5, java.lang.Object] */
    public final void F() {
        if (this.p0) {
            return;
        }
        if (((ag4) this.B0.c).Y != null || this.H0 != null) {
            this.n0 = true;
            return;
        }
        ta6 ta6Var = this.o0;
        this.p0 = true;
        ?? obj = new Object();
        obj.A = new ta6();
        bq4 snapshotObserver = ((te) vm3.a(this)).getSnapshotObserver();
        le leVar = new le(7, this, obj);
        snapshotObserver.a.d(this, snapshotObserver.d, leVar);
        this.p0 = false;
        this.o0 = (ta6) obj.A;
        this.n0 = false;
        te teVar = (te) vm3.a(this);
        teVar.getSemanticsOwner().b(this, ta6Var);
        teVar.y();
    }

    public final void G() {
        sm3 sm3Var;
        if (this.f0 > 0) {
            this.i0 = true;
        }
        if (this.A && (sm3Var = this.j0) != null) {
            sm3Var.G();
        }
    }

    public final boolean H() {
        if (this.k0 != null) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.C0.p.o0;
    }

    public final Boolean J() {
        boolean z;
        rz3 rz3Var = this.C0.q;
        if (rz3Var != null) {
            if (rz3Var.m0 != oz3.IsNotPlaced) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void K() {
        sm3 v;
        if (this.y0 == qm3.NotUsed) {
            f();
        }
        rz3 rz3Var = this.C0.q;
        rz3Var.getClass();
        boolean z = true;
        try {
            rz3Var.Z = true;
            if (!rz3Var.h0) {
                p53.c("replace() called on item that was not placed");
            }
            rz3Var.x0 = false;
            if (rz3Var.m0 == oz3.IsNotPlaced) {
                z = false;
            }
            rz3Var.C0(rz3Var.k0, rz3Var.l0);
            if (z && !rz3Var.x0 && (v = rz3Var.Y.a.v()) != null) {
                v.S(false);
            }
            rz3Var.Z = false;
        } catch (Throwable th) {
            rz3Var.Z = false;
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
            ap3 ap3Var = this.g0;
            pj pjVar = (pj) ap3Var.L;
            Object l = ((ua4) ap3Var.B).l(i4);
            pjVar.c();
            ((ua4) ap3Var.B).a(i6, (sm3) l);
            pjVar.c();
        }
        O();
        G();
        E();
    }

    public final void M(sm3 sm3Var) {
        wm3 wm3Var;
        if (sm3Var.C0.l > 0) {
            this.C0.d(wm3Var.l - 1);
        }
        if (this.k0 != null) {
            sm3Var.h();
        }
        sm3Var.j0 = null;
        if (sm3Var.J0 > 0) {
            a0(this.J0 - 1);
        }
        ((eg4) sm3Var.B0.e).o0 = null;
        if (sm3Var.A) {
            this.f0--;
            ua4 ua4Var = (ua4) sm3Var.g0.B;
            Object[] objArr = ua4Var.A;
            int i = ua4Var.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((eg4) ((sm3) objArr[i2]).B0.e).o0 = null;
            }
        }
        G();
        O();
    }

    public final void N(eg4 eg4Var) {
        rf5 rf5Var;
        boolean z;
        zp4 zp4Var = this.k0;
        if (zp4Var != null) {
            rf5Var = ((te) zp4Var).getRectManager();
        } else {
            rf5Var = null;
        }
        wm3 wm3Var = this.C0;
        int i = 0;
        if (wm3Var.d == om3.Idle && !q() && !p()) {
            z = false;
        } else {
            z = true;
        }
        if (this.Z && rf5Var != null) {
            if (eg4Var == ((eg4) this.B0.e)) {
                this.Y = true;
                if (!z) {
                    rf5Var.f(this);
                }
            } else {
                this.X = true;
                ua4 z2 = z();
                Object[] objArr = z2.A;
                int i2 = z2.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    sm3 sm3Var = (sm3) objArr[i3];
                    sm3Var.Y = true;
                    if (!z) {
                        rf5Var.f(sm3Var);
                    }
                }
                if (this.Z) {
                    rf5Var.e = true;
                    ei eiVar = rf5Var.b;
                    int i4 = this.B & 33554431;
                    long[] jArr = (long[]) eiVar.L;
                    int i5 = eiVar.B;
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
                rf5Var.i();
            }
        }
        wm3Var.p.F0();
    }

    public final void O() {
        if (this.A) {
            sm3 v = v();
            if (v != null) {
                v.O();
                return;
            }
            return;
        }
        this.r0 = true;
    }

    public final void P() {
        ap3 ap3Var = this.g0;
        int i = ((ua4) ap3Var.B).L;
        while (true) {
            i--;
            ua4 ua4Var = (ua4) ap3Var.B;
            if (-1 < i) {
                M((sm3) ua4Var.A[i]);
            } else {
                ua4Var.g();
                ((pj) ap3Var.L).c();
                return;
            }
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            p53.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            ap3 ap3Var = this.g0;
            M((sm3) ((ua4) ap3Var.B).A[i3]);
            Object l = ((ua4) ap3Var.B).l(i3);
            ((pj) ap3Var.L).c();
            sm3 sm3Var = (sm3) l;
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void R() {
        sm3 v;
        if (this.y0 == qm3.NotUsed) {
            f();
        }
        d34 d34Var = this.C0.p;
        wm3 wm3Var = d34Var.Y;
        try {
            d34Var.Z = true;
            if (!d34Var.g0) {
                p53.c("replace called on unplaced item");
            }
            boolean z = d34Var.o0;
            d34Var.A0(d34Var.j0, d34Var.l0, d34Var.k0);
            if (z && !d34Var.B0 && (v = wm3Var.a.v()) != null) {
                v.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z) {
        zp4 zp4Var;
        if (!this.A && (zp4Var = this.k0) != null) {
            ((te) zp4Var).x(this, true, z);
        }
    }

    public final void U(boolean z) {
        zp4 zp4Var;
        if (!this.A && (zp4Var = this.k0) != null) {
            ((te) zp4Var).x(this, false, z);
        }
    }

    public final void X() {
        ua4 z = z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var = (sm3) objArr[i2];
            qm3 qm3Var = sm3Var.z0;
            sm3Var.y0 = qm3Var;
            if (qm3Var != qm3.NotUsed) {
                sm3Var.X();
            }
        }
    }

    public final void Y(Throwable th) {
        hy0 hy0Var = this.x0;
        nq6 nq6Var = dy0.a;
        xv4 xv4Var = (xv4) hy0Var;
        xv4Var.getClass();
        cy0 cy0Var = (cy0) q60.U(xv4Var, nq6Var);
        if (cy0Var != null) {
            nw7.s0(th, new q6(18, cy0Var, this));
        }
        throw th;
    }

    public final void Z(qh1 qh1Var) {
        if (!nb3.k(this.u0, qh1Var)) {
            this.u0 = qh1Var;
            E();
            sm3 v = v();
            if (v != null) {
                v.C();
            } else {
                zp4 zp4Var = this.k0;
                if (zp4Var != null) {
                    ((te) zp4Var).invalidate();
                }
            }
            D();
            for (z64 z64Var = (z64) this.B0.g; z64Var != null; z64Var = z64Var.Y) {
                z64Var.d();
            }
        }
    }

    @Override // defpackage.ww0
    public final void a() {
        gn3 gn3Var = this.D0;
        if (gn3Var != null) {
            gn3Var.a();
        }
        if0 if0Var = this.B0;
        eg4 eg4Var = ((y53) if0Var.d).n0;
        for (eg4 eg4Var2 = (eg4) if0Var.e; !nb3.k(eg4Var2, eg4Var) && eg4Var2 != null; eg4Var2 = eg4Var2.n0) {
            eg4Var2.k1();
        }
    }

    public final void a0(int i) {
        sm3 v;
        sm3 v2;
        int i2 = this.J0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.a0(v2.J0 + 1);
            }
            if (i == 0 && this.J0 > 0 && (v = v()) != null) {
                v.a0(v.J0 - 1);
            }
            this.J0 = i;
        }
    }

    @Override // defpackage.ww0
    public final void b() {
        nd ndVar;
        gn3 gn3Var = this.D0;
        if (gn3Var != null) {
            gn3Var.i(true);
        }
        this.K0 = true;
        z64 z64Var = (vy6) this.B0.f;
        for (z64 z64Var2 = z64Var; z64Var2 != null; z64Var2 = z64Var2.X) {
            if (z64Var2.j0) {
                z64Var2.M0();
            }
        }
        for (z64 z64Var3 = z64Var; z64Var3 != null; z64Var3 = z64Var3.X) {
            if (z64Var3.j0) {
                z64Var3.O0();
            }
        }
        while (z64Var != null) {
            if (z64Var.j0) {
                z64Var.I0();
            }
            z64Var = z64Var.X;
        }
        if (H()) {
            this.o0 = null;
            this.n0 = false;
        }
        zp4 zp4Var = this.k0;
        if (zp4Var != null) {
            te teVar = (te) zp4Var;
            if (te.d() && (ndVar = teVar.L0) != null && ndVar.d0.f(this.B)) {
                ndVar.A.v(ndVar.L, this.B, false);
            }
        }
    }

    public final void b0(sm3 sm3Var) {
        if (!nb3.k(sm3Var, this.e0)) {
            this.e0 = sm3Var;
            wm3 wm3Var = this.C0;
            if (sm3Var != null) {
                if (wm3Var.q == null) {
                    wm3Var.q = new rz3(wm3Var);
                }
                if0 if0Var = this.B0;
                eg4 eg4Var = ((y53) if0Var.d).n0;
                for (eg4 eg4Var2 = (eg4) if0Var.e; !nb3.k(eg4Var2, eg4Var) && eg4Var2 != null; eg4Var2 = eg4Var2.n0) {
                    eg4Var2.T0();
                }
            } else {
                wm3Var.q = null;
                wm3Var.f = false;
                wm3Var.e = false;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eg4, z64] */
    public final void c(a74 a74Var) {
        int i;
        ?? r7;
        ua4 ua4Var;
        boolean z;
        if0 if0Var;
        ag4 ag4Var;
        ua4 ua4Var2;
        boolean z2;
        y53 y53Var;
        boolean z3;
        boolean z4;
        if0 if0Var2;
        boolean z5;
        boolean z6;
        mc mcVar;
        if0 if0Var3 = this.B0;
        boolean g = if0Var3.g(16);
        z64 z64Var = (vy6) if0Var3.f;
        boolean g2 = if0Var3.g(1024);
        this.G0 = a74Var;
        y53 y53Var2 = (y53) if0Var3.d;
        sm3 sm3Var = (sm3) if0Var3.b;
        z64 z64Var2 = (z64) if0Var3.g;
        ag4 ag4Var2 = (ag4) if0Var3.c;
        if (z64Var2 == ag4Var2) {
            p53.c("padChain called on already padded chain");
        }
        z64 z64Var3 = (z64) if0Var3.g;
        z64Var3.X = ag4Var2;
        ag4Var2.Y = z64Var3;
        ua4 ua4Var3 = (ua4) if0Var3.h;
        if (ua4Var3 != null) {
            i = ua4Var3.L;
        } else {
            i = 0;
        }
        ua4 ua4Var4 = (ua4) if0Var3.i;
        if (ua4Var4 == null) {
            ua4Var4 = new ua4(new y64[16]);
        }
        ua4 ua4Var5 = (ua4) if0Var3.j;
        ua4Var5.b(a74Var);
        mc mcVar2 = null;
        while (true) {
            int i2 = ua4Var5.L;
            if (i2 == 0) {
                break;
            }
            a74 a74Var2 = (a74) ua4Var5.l(i2 - 1);
            if (a74Var2 instanceof iu0) {
                iu0 iu0Var = (iu0) a74Var2;
                ua4Var5.b(iu0Var.b);
                ua4Var5.b(iu0Var.a);
            } else if (a74Var2 instanceof y64) {
                ua4Var4.b(a74Var2);
            } else {
                if (mcVar2 == null) {
                    mcVar = new mc(ua4Var4, 20);
                    mcVar2 = mcVar;
                } else {
                    mcVar = mcVar2;
                }
                a74Var2.a(mcVar);
            }
        }
        int i3 = ua4Var4.L;
        if (i3 == i) {
            z64 z64Var4 = ag4Var2.Y;
            if0 if0Var4 = if0Var3;
            int i4 = 0;
            while (z64Var4 != null && i4 < i) {
                if (ua4Var3 != null) {
                    y64 y64Var = (y64) ua4Var3.A[i4];
                    y64 y64Var2 = (y64) ua4Var4.A[i4];
                    if (nb3.k(y64Var, y64Var2)) {
                        if0Var2 = if0Var4;
                        z6 = true;
                    } else {
                        if0Var2 = if0Var4;
                        if (y64Var.getClass() == y64Var2.getClass()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (z6) {
                        if (z6) {
                            if0.l(y64Var, y64Var2, z64Var4);
                        }
                        z64Var4 = z64Var4.Y;
                        i4++;
                        if0Var4 = if0Var2;
                    } else {
                        z64Var4 = z64Var4.X;
                        break;
                    }
                } else {
                    throw i61.e("expected prior modifier list to be non-empty");
                }
            }
            if0Var2 = if0Var4;
            if (i4 < i) {
                if (ua4Var3 != null) {
                    if (z64Var4 != null) {
                        if (sm3Var.H0 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ua4Var = ua4Var3;
                        ua4Var2 = ua4Var4;
                        z4 = false;
                        z64 z64Var5 = z64Var4;
                        if0Var = if0Var2;
                        if0Var.j(i4, ua4Var, ua4Var2, z64Var5, !z5);
                        ag4Var = ag4Var2;
                        z2 = true;
                        r7 = z4;
                    } else {
                        throw i61.e("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw i61.e("expected prior modifier list to be non-empty");
                }
            } else {
                if0Var3 = if0Var2;
                z3 = false;
                if0Var = if0Var3;
                ua4Var = ua4Var3;
                ag4Var = ag4Var2;
                ua4Var2 = ua4Var4;
                z2 = false;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z4 = false;
            z3 = false;
            a74 a74Var3 = sm3Var.H0;
            if (a74Var3 != null && i == 0) {
                z64 z64Var6 = ag4Var2;
                for (int i5 = 0; i5 < ua4Var4.L; i5++) {
                    z64Var6 = if0.c((y64) ua4Var4.A[i5], z64Var6);
                }
                int i6 = 0;
                for (z64 z64Var7 = z64Var.X; z64Var7 != null && z64Var7 != ag4Var2; z64Var7 = z64Var7.X) {
                    i6 |= z64Var7.L;
                    z64Var7.R = i6;
                }
                if0Var = if0Var3;
                ua4Var = ua4Var3;
                ag4Var = ag4Var2;
                ua4Var2 = ua4Var4;
                z2 = true;
                r7 = z4;
            } else if (i3 == 0) {
                if (ua4Var3 != null) {
                    z64 z64Var8 = ag4Var2.Y;
                    for (int i7 = 0; z64Var8 != null && i7 < ua4Var3.L; i7++) {
                        z64Var8 = if0.d(z64Var8).Y;
                    }
                    sm3 v = sm3Var.v();
                    if (v != null) {
                        y53Var = (y53) v.B0.d;
                    } else {
                        y53Var = null;
                    }
                    y53Var2.o0 = y53Var;
                    if0Var3.e = y53Var2;
                    if0Var = if0Var3;
                    ua4Var = ua4Var3;
                    ag4Var = ag4Var2;
                    ua4Var2 = ua4Var4;
                    z2 = false;
                    r7 = z3;
                } else {
                    throw i61.e("expected prior modifier list to be non-empty");
                }
            } else {
                if (ua4Var3 == null) {
                    ua4Var3 = new ua4(new y64[16]);
                }
                ua4Var = ua4Var3;
                if (a74Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if0Var = if0Var3;
                ag4Var = ag4Var2;
                ua4Var2 = ua4Var4;
                if0Var.j(0, ua4Var, ua4Var2, ag4Var, !z);
                z2 = true;
            }
        }
        if0Var.h = ua4Var2;
        if (ua4Var != null) {
            ua4Var.g();
        } else {
            ua4Var = r7;
        }
        if0Var.i = ua4Var;
        z64 z64Var9 = ag4Var.Y;
        if (z64Var9 != null) {
            z64Var = z64Var9;
        }
        z64Var.X = r7;
        ag4Var.Y = r7;
        ag4Var.R = -1;
        ag4Var.d0 = r7;
        if (z64Var == ag4Var) {
            p53.c("trimChain did not update the head");
        }
        if0Var.g = z64Var;
        if (z2) {
            if0Var.k();
        }
        boolean g3 = if0Var.g(16);
        boolean g4 = if0Var.g(1024);
        this.C0.j();
        if (this.e0 == null && if0Var.g(512)) {
            b0(this);
        }
        if (g != g3 || g2 != g4) {
            rf5 rectManager = ((te) vm3.a(this)).getRectManager();
            rectManager.getClass();
            if (H()) {
                ei eiVar = rectManager.b;
                int i8 = this.B & 33554431;
                long[] jArr = (long[]) eiVar.L;
                int i9 = eiVar.B;
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

    public final void c0(e34 e34Var) {
        if (!nb3.k(this.s0, e34Var)) {
            this.s0 = e34Var;
            yc1 yc1Var = this.t0;
            if (yc1Var != null) {
                ((vs4) yc1Var.B).setValue(e34Var);
            }
            E();
        }
    }

    public final void d(zp4 zp4Var) {
        y53 y53Var;
        int i;
        sm3 sm3Var;
        nd ndVar;
        ta6 x;
        zp4 zp4Var2;
        String str;
        if (this.k0 != null) {
            p53.c("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        sm3 sm3Var2 = this.j0;
        if (sm3Var2 != null && !nb3.k(sm3Var2.k0, zp4Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(zp4Var);
            sb.append(") than the parent's owner(");
            sm3 v = v();
            if (v != null) {
                zp4Var2 = v.k0;
            } else {
                zp4Var2 = null;
            }
            sb.append(zp4Var2);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            sm3 sm3Var3 = this.j0;
            if (sm3Var3 != null) {
                str = sm3Var3.g(0);
            } else {
                str = null;
            }
            sb.append(str);
            p53.c(sb.toString());
        }
        sm3 v2 = v();
        wm3 wm3Var = this.C0;
        if (v2 == null) {
            wm3Var.p.o0 = true;
            ((te) zp4Var).getRectManager().f(this);
            rz3 rz3Var = wm3Var.q;
            if (rz3Var != null) {
                rz3Var.m0 = oz3.IsPlacedInLookahead;
            }
        }
        if0 if0Var = this.B0;
        eg4 eg4Var = (eg4) if0Var.e;
        if (v2 != null) {
            y53Var = (y53) v2.B0.d;
        } else {
            y53Var = null;
        }
        eg4Var.o0 = y53Var;
        this.k0 = zp4Var;
        if (v2 != null) {
            i = v2.l0;
        } else {
            i = -1;
        }
        this.l0 = i + 1;
        a74 a74Var = this.H0;
        if (a74Var != null) {
            c(a74Var);
        }
        this.H0 = null;
        ((te) zp4Var).getLayoutNodes().i(this.B, this);
        if (this.d0) {
            b0(this);
        } else {
            sm3 sm3Var4 = this.j0;
            if (sm3Var4 == null || (sm3Var = sm3Var4.e0) == null) {
                sm3Var = this.e0;
            }
            b0(sm3Var);
            if (this.e0 == null && if0Var.g(512)) {
                b0(this);
            }
        }
        if (!this.K0) {
            for (z64 z64Var = (z64) if0Var.g; z64Var != null; z64Var = z64Var.Y) {
                z64Var.H0();
            }
        }
        ua4 ua4Var = (ua4) this.g0.B;
        Object[] objArr = ua4Var.A;
        int i2 = ua4Var.L;
        for (int i3 = 0; i3 < i2; i3++) {
            ((sm3) objArr[i3]).d(zp4Var);
        }
        if (!this.K0) {
            if0Var.i();
        }
        E();
        if (v2 != null) {
            v2.E();
        }
        wm3Var.j();
        if (!this.K0 && if0Var.g(8)) {
            F();
        }
        te teVar = (te) zp4Var;
        if (te.d() && (ndVar = teVar.L0) != null && (x = x()) != null && x.A.b(bb6.r)) {
            ndVar.d0.a(this.B);
            ndVar.A.v(ndVar.L, this.B, true);
        }
    }

    public final void d0(a74 a74Var) {
        if (this.A && this.G0 != x64.a) {
            p53.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.K0) {
            p53.a("modifier is updated when deactivated");
        }
        if (H()) {
            c(a74Var);
            if (this.n0) {
                F();
                return;
            }
            return;
        }
        this.H0 = a74Var;
    }

    public final void e() {
        this.z0 = this.y0;
        this.y0 = qm3.NotUsed;
        ua4 z = z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var = (sm3) objArr[i2];
            if (sm3Var.y0 != qm3.NotUsed) {
                sm3Var.e();
            }
        }
    }

    public final void e0(fo7 fo7Var) {
        if (!nb3.k(this.w0, fo7Var)) {
            this.w0 = fo7Var;
            z64 z64Var = (z64) this.B0.g;
            if ((z64Var.R & 16) != 0) {
                while (z64Var != null) {
                    if ((z64Var.L & 16) != 0) {
                        z64 z64Var2 = z64Var;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            if (z64Var2 instanceof yy4) {
                                ((yy4) z64Var2).x0();
                            } else if ((z64Var2.L & 16) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 16) != 0) {
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
                    if ((z64Var.R & 16) != 0) {
                        z64Var = z64Var.Y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        this.z0 = this.y0;
        this.y0 = qm3.NotUsed;
        ua4 z = z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var = (sm3) objArr[i2];
            if (sm3Var.y0 == qm3.InLayoutBlock) {
                sm3Var.f();
            }
        }
    }

    public final void f0() {
        if (this.f0 > 0 && this.i0) {
            this.i0 = false;
            ua4 ua4Var = this.h0;
            if (ua4Var == null) {
                ua4Var = new ua4(new sm3[16]);
                this.h0 = ua4Var;
            }
            ua4Var.g();
            ua4 ua4Var2 = (ua4) this.g0.B;
            Object[] objArr = ua4Var2.A;
            int i = ua4Var2.L;
            for (int i2 = 0; i2 < i; i2++) {
                sm3 sm3Var = (sm3) objArr[i2];
                if (sm3Var.A) {
                    ua4Var.c(ua4Var.L, sm3Var.z());
                } else {
                    ua4Var.b(sm3Var);
                }
            }
            wm3 wm3Var = this.C0;
            wm3Var.p.v0 = true;
            rz3 rz3Var = wm3Var.q;
            if (rz3Var != null) {
                rz3Var.p0 = true;
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
        ua4 z = z();
        Object[] objArr = z.A;
        int i3 = z.L;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((sm3) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void h() {
        nd ndVar;
        tm3 tm3Var;
        zp4 zp4Var = this.k0;
        String str = null;
        if (zp4Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            sm3 v = v();
            if (v != null) {
                str = v.g(0);
            }
            sb.append(str);
            p53.d(sb.toString());
            e41.c();
            return;
        }
        sm3 v2 = v();
        wm3 wm3Var = this.C0;
        if (v2 != null) {
            v2.C();
            v2.E();
            d34 d34Var = wm3Var.p;
            qm3 qm3Var = qm3.NotUsed;
            d34Var.h0 = qm3Var;
            rz3 rz3Var = wm3Var.q;
            if (rz3Var != null) {
                rz3Var.f0 = qm3Var;
            }
        }
        tm3 tm3Var2 = wm3Var.p.t0;
        tm3Var2.b = true;
        tm3Var2.c = false;
        tm3Var2.e = false;
        tm3Var2.d = false;
        tm3Var2.f = false;
        tm3Var2.g = false;
        tm3Var2.h = null;
        rz3 rz3Var2 = wm3Var.q;
        if (rz3Var2 != null && (tm3Var = rz3Var2.n0) != null) {
            tm3Var.b = true;
            tm3Var.c = false;
            tm3Var.e = false;
            tm3Var.d = false;
            tm3Var.f = false;
            tm3Var.g = false;
            tm3Var.h = null;
        }
        if0 if0Var = this.B0;
        z64 z64Var = (vy6) if0Var.f;
        eg4 eg4Var = ((y53) if0Var.d).n0;
        for (eg4 eg4Var2 = (eg4) if0Var.e; !nb3.k(eg4Var2, eg4Var) && eg4Var2 != null; eg4Var2 = eg4Var2.n0) {
            eg4Var2.q1();
            if (eg4Var2.k0.I()) {
                eg4Var2.l1();
            }
        }
        for (z64 z64Var2 = z64Var; z64Var2 != null; z64Var2 = z64Var2.X) {
            if (z64Var2.j0) {
                z64Var2.O0();
            }
        }
        this.m0 = true;
        ua4 ua4Var = (ua4) this.g0.B;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((sm3) objArr[i2]).h();
        }
        this.m0 = false;
        while (z64Var != null) {
            if (z64Var.j0) {
                z64Var.I0();
            }
            z64Var = z64Var.X;
        }
        te teVar = (te) zp4Var;
        teVar.getLayoutNodes().g(this.B);
        a34 a34Var = teVar.U0;
        bt btVar = a34Var.b;
        ((d51) btVar.B).o(this);
        ((d51) btVar.L).o(this);
        ((d51) btVar.R).o(this);
        ((ua4) a34Var.e.B).j(this);
        teVar.M0 = true;
        if (te.d() && (ndVar = teVar.L0) != null && ndVar.d0.f(this.B)) {
            ndVar.A.v(ndVar.L, this.B, false);
        }
        teVar.getRectManager().g(this);
        this.k0 = null;
        b0(null);
        this.l0 = 0;
        d34 d34Var2 = wm3Var.p;
        d34Var2.e0 = Integer.MAX_VALUE;
        d34Var2.d0 = Integer.MAX_VALUE;
        d34Var2.o0 = false;
        rz3 rz3Var3 = wm3Var.q;
        if (rz3Var3 != null) {
            rz3Var3.e0 = Integer.MAX_VALUE;
            rz3Var3.d0 = Integer.MAX_VALUE;
            rz3Var3.m0 = oz3.IsNotPlaced;
        }
        if (if0Var.g(8)) {
            ta6 ta6Var = this.o0;
            this.o0 = null;
            this.n0 = false;
            teVar.getSemanticsOwner().b(this, ta6Var);
            teVar.y();
        }
    }

    public final void i(xj0 xj0Var, ut2 ut2Var) {
        try {
            ((eg4) this.B0.e).R0(xj0Var, ut2Var);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        q21 q21Var;
        if (this.e0 != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        d34 d34Var = this.C0.p;
        if (d34Var.f0) {
            q21Var = new q21(d34Var.R);
        } else {
            q21Var = null;
        }
        zp4 zp4Var = this.k0;
        if (q21Var != null) {
            if (zp4Var != null) {
                ((te) zp4Var).t(this, q21Var.a);
            }
        } else if (zp4Var != null) {
            ((te) zp4Var).s(true);
        }
    }

    public final List l() {
        rz3 rz3Var = this.C0.q;
        rz3Var.getClass();
        ua4 ua4Var = rz3Var.o0;
        wm3 wm3Var = rz3Var.Y;
        wm3Var.a.n();
        if (!rz3Var.p0) {
            return ua4Var.f();
        }
        sm3 sm3Var = wm3Var.a;
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (ua4Var.L <= i2) {
                rz3 rz3Var2 = sm3Var2.C0.q;
                rz3Var2.getClass();
                ua4Var.b(rz3Var2);
            } else {
                rz3 rz3Var3 = sm3Var2.C0.q;
                rz3Var3.getClass();
                Object[] objArr2 = ua4Var.A;
                Object obj = objArr2[i2];
                objArr2[i2] = rz3Var3;
            }
        }
        ua4Var.m(((ua4) ((aa4) sm3Var.n()).B).L, ua4Var.L);
        rz3Var.p0 = false;
        return ua4Var.f();
    }

    public final List m() {
        return this.C0.p.s0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((ua4) this.g0.B).f();
    }

    public final boolean p() {
        return this.C0.p.r0;
    }

    public final boolean q() {
        return this.C0.p.q0;
    }

    @Override // defpackage.aq4
    public final boolean r() {
        return H();
    }

    public final qm3 s() {
        return this.C0.p.h0;
    }

    public final qm3 t() {
        qm3 qm3Var;
        rz3 rz3Var = this.C0.q;
        if (rz3Var != null && (qm3Var = rz3Var.f0) != null) {
            return qm3Var;
        }
        return qm3.NotUsed;
    }

    public final String toString() {
        return ej2.U(this) + " children: " + ((ua4) ((aa4) n()).B).L + " measurePolicy: " + this.s0 + " deactivated: " + this.K0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yc1, java.lang.Object] */
    public final yc1 u() {
        yc1 yc1Var = this.t0;
        if (yc1Var == null) {
            e34 e34Var = this.s0;
            ?? obj = new Object();
            obj.A = this;
            obj.B = np2.Y(e34Var);
            this.t0 = obj;
            return obj;
        }
        return yc1Var;
    }

    public final sm3 v() {
        sm3 sm3Var = this.j0;
        while (sm3Var != null && sm3Var.A) {
            sm3Var = sm3Var.j0;
        }
        return sm3Var;
    }

    public final int w() {
        return this.C0.p.e0;
    }

    public final ta6 x() {
        if (H() && !this.K0 && this.B0.g(8)) {
            return this.o0;
        }
        return null;
    }

    public final ua4 y() {
        boolean z = this.r0;
        ua4 ua4Var = this.q0;
        if (z) {
            ua4Var.g();
            ua4Var.c(ua4Var.L, z());
            Arrays.sort(ua4Var.A, 0, ua4Var.L, N0);
            this.r0 = false;
        }
        return ua4Var;
    }

    public final ua4 z() {
        f0();
        if (this.f0 == 0) {
            return (ua4) this.g0.B;
        }
        ua4 ua4Var = this.h0;
        ua4Var.getClass();
        return ua4Var;
    }

    public sm3(int i) {
        this((i & 1) == 0, ua6.a.addAndGet(1));
    }
}
