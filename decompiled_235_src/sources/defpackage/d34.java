package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d34  reason: default package */
/* loaded from: classes.dex */
public final class d34 extends dx4 implements x24, nc, z74 {
    public float A0;
    public boolean B0;
    public qn2 C0;
    public float E0;
    public boolean G0;
    public final wm3 Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;
    public boolean i0;
    public qn2 k0;
    public float l0;
    public Object n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean w0;
    public int d0 = Integer.MAX_VALUE;
    public int e0 = Integer.MAX_VALUE;
    public qm3 h0 = qm3.NotUsed;
    public long j0 = 0;
    public boolean m0 = true;
    public final tm3 t0 = new tm3(this, 0);
    public final ua4 u0 = new ua4(new d34[16]);
    public boolean v0 = true;
    public long x0 = s21.b(0, 0, 0, 0, 15);
    public final c34 y0 = new c34(this, 1);
    public final c34 z0 = new c34(this, 0);
    public long D0 = 0;
    public final c34 F0 = new c34(this, 2);

    public d34(wm3 wm3Var) {
        this.Y = wm3Var;
    }

    public final void A0(long j, float f, qn2 qn2Var) {
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        if (sm3Var.K0) {
            p53.a("place is called on a deactivated node");
        }
        wm3Var.d = om3.LayingOut;
        this.j0 = j;
        this.l0 = f;
        this.k0 = qn2Var;
        this.B0 = false;
        zp4 a = vm3.a(sm3Var2);
        if (!this.r0 && this.o0) {
            eg4 a2 = wm3Var.a();
            a2.o1(i93.c(j, a2.X), f, qn2Var);
            z0();
        } else {
            this.t0.g = false;
            wm3Var.f(false);
            this.C0 = qn2Var;
            this.D0 = j;
            this.E0 = f;
            bq4 snapshotObserver = ((te) a).getSnapshotObserver();
            snapshotObserver.a.d(sm3Var2, snapshotObserver.f, this.F0);
        }
        wm3Var.d = om3.Idle;
        if (wm3Var.a().g0 && (wm3Var.k || wm3Var.j)) {
            requestLayout();
        }
        this.g0 = true;
    }

    @Override // defpackage.dx4, defpackage.x24
    public final Object B() {
        return this.n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:24:0x0052->B:25:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        om3 om3Var;
        om3 om3Var2;
        om3 om3Var3;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        try {
            if (sm3Var.K0) {
                p53.a("measure is called on a deactivated node");
            }
            zp4 a = vm3.a(sm3Var2);
            sm3 v = sm3Var2.v();
            boolean z2 = true;
            if (!sm3Var2.A0 && (v == null || !v.A0)) {
                z = false;
                sm3Var2.A0 = z;
                if (!sm3Var2.q() && q21.b(this.R, j)) {
                    ((te) a).i(sm3Var2, false);
                    sm3Var2.X();
                    return false;
                }
                this.t0.f = false;
                ua4 z3 = sm3Var2.z();
                Object[] objArr = z3.A;
                i = z3.L;
                for (i2 = 0; i2 < i; i2++) {
                    ((sm3) objArr[i2]).C0.p.t0.c = false;
                }
                this.f0 = true;
                j2 = wm3Var.a().L;
                m0(j);
                om3Var = wm3Var.d;
                om3Var2 = om3.Idle;
                if (om3Var == om3Var2) {
                    p53.c("layout state is not idle before measure starts");
                }
                this.x0 = j;
                om3Var3 = om3.Measuring;
                wm3Var.d = om3Var3;
                this.q0 = false;
                bq4 snapshotObserver = ((te) vm3.a(sm3Var2)).getSnapshotObserver();
                snapshotObserver.a.d(sm3Var2, snapshotObserver.c, this.y0);
                if (wm3Var.d == om3Var3) {
                    this.r0 = true;
                    this.s0 = true;
                    wm3Var.d = om3Var2;
                }
                if (q93.b(wm3Var.a().L, j2) && wm3Var.a().A == this.A && wm3Var.a().B == this.B) {
                    z2 = false;
                }
                l0((wm3Var.a().B & 4294967295L) | (wm3Var.a().A << 32));
                return z2;
            }
            z = true;
            sm3Var2.A0 = z;
            if (!sm3Var2.q()) {
                ((te) a).i(sm3Var2, false);
                sm3Var2.X();
                return false;
            }
            this.t0.f = false;
            ua4 z32 = sm3Var2.z();
            Object[] objArr2 = z32.A;
            i = z32.L;
            while (i2 < i) {
            }
            this.f0 = true;
            j2 = wm3Var.a().L;
            m0(j);
            om3Var = wm3Var.d;
            om3Var2 = om3.Idle;
            if (om3Var == om3Var2) {
            }
            this.x0 = j;
            om3Var3 = om3.Measuring;
            wm3Var.d = om3Var3;
            this.q0 = false;
            bq4 snapshotObserver2 = ((te) vm3.a(sm3Var2)).getSnapshotObserver();
            snapshotObserver2.a.d(sm3Var2, snapshotObserver2.c, this.y0);
            if (wm3Var.d == om3Var3) {
            }
            if (q93.b(wm3Var.a().L, j2)) {
                z2 = false;
            }
            l0((wm3Var.a().B & 4294967295L) | (wm3Var.a().A << 32));
            return z2;
        } catch (Throwable th) {
            sm3Var.Y(th);
            throw null;
        }
    }

    public final void F0() {
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        if (sm3Var.I() && wm3Var.l > 0) {
            wm3 wm3Var2 = sm3Var2.C0;
            if ((wm3Var2.j || wm3Var2.k) && !wm3Var2.p.r0) {
                sm3Var2.U(false);
            }
            ua4 z = sm3Var2.z();
            Object[] objArr = z.A;
            int i = z.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((sm3) objArr[i2]).C0.p.F0();
            }
        }
    }

    @Override // defpackage.nc
    public final void G(mc mcVar) {
        ua4 z = this.Y.a.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            mcVar.g(((sm3) objArr[i2]).C0.p);
        }
    }

    @Override // defpackage.z74
    public final void H(boolean z) {
        wm3 wm3Var = this.Y;
        if (z != wm3Var.a().e0) {
            wm3Var.a().e0 = z;
            this.G0 = true;
        }
    }

    @Override // defpackage.nc
    public final void I() {
        q21 q21Var;
        boolean z;
        this.w0 = true;
        tm3 tm3Var = this.t0;
        tm3Var.h();
        boolean z2 = this.r0;
        wm3 wm3Var = this.Y;
        if (z2) {
            ua4 z3 = wm3Var.a.z();
            Object[] objArr = z3.A;
            int i = z3.L;
            for (int i2 = 0; i2 < i; i2++) {
                sm3 sm3Var = (sm3) objArr[i2];
                boolean q = sm3Var.q();
                wm3 wm3Var2 = sm3Var.C0;
                if (q && sm3Var.s() == qm3.InMeasureBlock) {
                    d34 d34Var = wm3Var2.p;
                    if (d34Var.f0) {
                        q21Var = new q21(d34Var.R);
                    } else {
                        q21Var = null;
                    }
                    if (q21Var != null) {
                        if (sm3Var.y0 == qm3.NotUsed) {
                            sm3Var.e();
                        }
                        z = wm3Var2.p.C0(q21Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        sm3.V(wm3Var.a, false, 7);
                    }
                }
            }
        }
        if (this.s0 || (!this.i0 && !f().g0 && this.r0)) {
            this.r0 = false;
            om3 om3Var = wm3Var.d;
            wm3Var.d = om3.LayingOut;
            wm3Var.g(false);
            sm3 sm3Var2 = wm3Var.a;
            bq4 snapshotObserver = ((te) vm3.a(sm3Var2)).getSnapshotObserver();
            snapshotObserver.a.d(sm3Var2, snapshotObserver.e, this.z0);
            wm3Var.d = om3Var;
            this.s0 = false;
        }
        if (tm3Var.d) {
            tm3Var.e = true;
        }
        if (tm3Var.b && tm3Var.e()) {
            tm3Var.g();
        }
        this.w0 = false;
    }

    @Override // defpackage.nc
    public final void S() {
        sm3.V(this.Y.a, false, 7);
    }

    @Override // defpackage.x24
    public final int V(int i) {
        wm3 wm3Var = this.Y;
        if (bl2.J(wm3Var.a)) {
            rz3 rz3Var = wm3Var.q;
            rz3Var.getClass();
            return rz3Var.V(i);
        }
        x0();
        return wm3Var.a().V(i);
    }

    @Override // defpackage.dx4
    public final int X(ey2 ey2Var) {
        om3 om3Var;
        wm3 wm3Var = this.Y;
        sm3 v = wm3Var.a.v();
        om3 om3Var2 = null;
        if (v != null) {
            om3Var = v.C0.d;
        } else {
            om3Var = null;
        }
        om3 om3Var3 = om3.Measuring;
        tm3 tm3Var = this.t0;
        if (om3Var == om3Var3) {
            tm3Var.c = true;
        } else {
            sm3 v2 = wm3Var.a.v();
            if (v2 != null) {
                om3Var2 = v2.C0.d;
            }
            if (om3Var2 == om3.LayingOut) {
                tm3Var.d = true;
            }
        }
        this.i0 = true;
        int X = wm3Var.a().X(ey2Var);
        this.i0 = false;
        return X;
    }

    @Override // defpackage.dx4
    public final int Z() {
        return this.Y.a().Z();
    }

    @Override // defpackage.nc
    public final tm3 b() {
        return this.t0;
    }

    @Override // defpackage.x24
    public final int c(int i) {
        wm3 wm3Var = this.Y;
        if (bl2.J(wm3Var.a)) {
            rz3 rz3Var = wm3Var.q;
            rz3Var.getClass();
            return rz3Var.c(i);
        }
        x0();
        return wm3Var.a().c(i);
    }

    @Override // defpackage.dx4
    public final int d0() {
        return this.Y.a().d0();
    }

    @Override // defpackage.nc
    public final y53 f() {
        return (y53) this.Y.a.B0.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002e, B:21:0x0032, B:23:0x003a, B:26:0x0043, B:27:0x0045, B:29:0x0049, B:31:0x004f, B:33:0x0057, B:36:0x0065, B:38:0x0070, B:39:0x0074, B:35:0x005b, B:40:0x0088, B:42:0x008c, B:44:0x0090, B:45:0x0095, B:12:0x001e, B:14:0x0022, B:16:0x0026, B:18:0x002a), top: B:49:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002e, B:21:0x0032, B:23:0x003a, B:26:0x0043, B:27:0x0045, B:29:0x0049, B:31:0x004f, B:33:0x0057, B:36:0x0065, B:38:0x0070, B:39:0x0074, B:35:0x005b, B:40:0x0088, B:42:0x008c, B:44:0x0090, B:45:0x0095, B:12:0x001e, B:14:0x0022, B:16:0x0026, B:18:0x002a), top: B:49:0x0007 }] */
    @Override // defpackage.dx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(long j, float f, qn2 qn2Var) {
        rz3 rz3Var;
        rz3 rz3Var2;
        rz3 rz3Var3;
        eg4 eg4Var;
        sm3 v;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        try {
            this.p0 = true;
            if (i93.a(j, this.j0)) {
                if (qn2Var == this.k0) {
                    if (this.G0) {
                    }
                    rz3Var = wm3Var.q;
                    if (rz3Var != null) {
                        wm3 wm3Var2 = rz3Var.Y;
                        if (rz3Var.m0 == oz3.IsNotPlaced && !bl2.J(wm3Var2.a)) {
                            wm3Var2.c = true;
                        }
                    }
                    rz3Var2 = wm3Var.q;
                    if (rz3Var2 != null && rz3Var2.s0()) {
                        eg4Var = wm3Var.a().o0;
                        if (eg4Var != null || (r3 = eg4Var.h0) == null) {
                            cx4 placementScope = ((te) vm3.a(sm3Var2)).getPlacementScope();
                        }
                        rz3 rz3Var4 = wm3Var.q;
                        rz3Var4.getClass();
                        v = sm3Var2.v();
                        if (v != null) {
                            v.C0.h = 0;
                        }
                        rz3Var4.e0 = Integer.MAX_VALUE;
                        cx4.j(placementScope, rz3Var4, (int) (j >> 32), (int) (4294967295L & j));
                    }
                    rz3Var3 = wm3Var.q;
                    if (rz3Var3 != null && !rz3Var3.h0) {
                        p53.c("Error: Placement happened before lookahead.");
                    }
                    A0(j, f, qn2Var);
                }
            }
            if (wm3Var.k || wm3Var.j || this.G0) {
                this.r0 = true;
                this.G0 = false;
            }
            rz3Var = wm3Var.q;
            if (rz3Var != null) {
            }
            rz3Var2 = wm3Var.q;
            if (rz3Var2 != null) {
                eg4Var = wm3Var.a().o0;
                if (eg4Var != null) {
                }
                cx4 placementScope2 = ((te) vm3.a(sm3Var2)).getPlacementScope();
                rz3 rz3Var42 = wm3Var.q;
                rz3Var42.getClass();
                v = sm3Var2.v();
                if (v != null) {
                }
                rz3Var42.e0 = Integer.MAX_VALUE;
                cx4.j(placementScope2, rz3Var42, (int) (j >> 32), (int) (4294967295L & j));
            }
            rz3Var3 = wm3Var.q;
            if (rz3Var3 != null) {
                p53.c("Error: Placement happened before lookahead.");
            }
            A0(j, f, qn2Var);
        } catch (Throwable th) {
            sm3Var.Y(th);
            throw null;
        }
    }

    @Override // defpackage.nc
    public final nc j() {
        wm3 wm3Var;
        sm3 v = this.Y.a.v();
        if (v != null && (wm3Var = v.C0) != null) {
            return wm3Var.p;
        }
        return null;
    }

    @Override // defpackage.x24
    public final int n(int i) {
        wm3 wm3Var = this.Y;
        if (bl2.J(wm3Var.a)) {
            rz3 rz3Var = wm3Var.q;
            rz3Var.getClass();
            return rz3Var.n(i);
        }
        x0();
        return wm3Var.a().n(i);
    }

    @Override // defpackage.nc
    public final int o() {
        return this.e0;
    }

    @Override // defpackage.nc
    public final void requestLayout() {
        this.Y.a.U(false);
    }

    public final List s0() {
        wm3 wm3Var = this.Y;
        wm3Var.a.f0();
        boolean z = this.v0;
        ua4 ua4Var = this.u0;
        if (!z) {
            return ua4Var.f();
        }
        sm3 sm3Var = wm3Var.a;
        ua4 z2 = sm3Var.z();
        Object[] objArr = z2.A;
        int i = z2.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (ua4Var.L <= i2) {
                ua4Var.b(sm3Var2.C0.p);
            } else {
                d34 d34Var = sm3Var2.C0.p;
                Object[] objArr2 = ua4Var.A;
                Object obj = objArr2[i2];
                objArr2[i2] = d34Var;
            }
        }
        ua4Var.m(((ua4) ((aa4) sm3Var.n()).B).L, ua4Var.L);
        this.v0 = false;
        return ua4Var.f();
    }

    @Override // defpackage.x24
    public final int u(int i) {
        wm3 wm3Var = this.Y;
        if (bl2.J(wm3Var.a)) {
            rz3 rz3Var = wm3Var.q;
            rz3Var.getClass();
            return rz3Var.u(i);
        }
        x0();
        return wm3Var.a().u(i);
    }

    public final void u0() {
        boolean z = this.o0;
        this.o0 = true;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        if0 if0Var = sm3Var.B0;
        if (!z) {
            ((y53) if0Var.d).j1();
            ((te) vm3.a(sm3Var)).getRectManager().f(wm3Var.a);
            if (sm3Var.q()) {
                sm3.V(sm3Var, true, 6);
            } else if (sm3Var.C0.e) {
                sm3.T(sm3Var, true, 6);
            }
        }
        eg4 eg4Var = ((y53) if0Var.d).n0;
        for (eg4 eg4Var2 = (eg4) if0Var.e; !nb3.k(eg4Var2, eg4Var) && eg4Var2 != null; eg4Var2 = eg4Var2.n0) {
            if (eg4Var2.I0) {
                eg4Var2.f1();
            }
        }
        ua4 z2 = sm3Var.z();
        Object[] objArr = z2.A;
        int i = z2.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (sm3Var2.w() != Integer.MAX_VALUE) {
                sm3Var2.C0.p.u0();
                sm3.W(sm3Var2);
            }
        }
    }

    public final void w0() {
        if (this.o0) {
            this.o0 = false;
            wm3 wm3Var = this.Y;
            sm3 sm3Var = wm3Var.a;
            sm3 sm3Var2 = wm3Var.a;
            ((te) vm3.a(sm3Var)).getRectManager().g(sm3Var2);
            if0 if0Var = sm3Var2.B0;
            eg4 eg4Var = ((y53) if0Var.d).n0;
            for (eg4 eg4Var2 = (eg4) if0Var.e; !nb3.k(eg4Var2, eg4Var) && eg4Var2 != null; eg4Var2 = eg4Var2.n0) {
                eg4Var2.l1();
                eg4Var2.q1();
            }
            ua4 z = sm3Var2.z();
            Object[] objArr = z.A;
            int i = z.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((sm3) objArr[i2]).C0.p.w0();
            }
        }
    }

    public final void x0() {
        qm3 qm3Var;
        wm3 wm3Var = this.Y;
        sm3.V(wm3Var.a, false, 7);
        sm3 sm3Var = wm3Var.a;
        sm3 v = sm3Var.v();
        if (v != null && sm3Var.y0 == qm3.NotUsed) {
            int i = b34.a[v.C0.d.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    qm3Var = v.y0;
                } else {
                    qm3Var = qm3.InLayoutBlock;
                }
            } else {
                qm3Var = qm3.InMeasureBlock;
            }
            sm3Var.y0 = qm3Var;
        }
    }

    @Override // defpackage.x24
    public final dx4 y(long j) {
        qm3 qm3Var;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        qm3 qm3Var2 = sm3Var.y0;
        qm3 qm3Var3 = qm3.NotUsed;
        if (qm3Var2 == qm3Var3) {
            sm3Var.e();
        }
        if (bl2.J(sm3Var2)) {
            rz3 rz3Var = wm3Var.q;
            rz3Var.getClass();
            rz3Var.f0 = qm3Var3;
            rz3Var.y(j);
        }
        sm3 v = sm3Var2.v();
        if (v != null) {
            wm3 wm3Var2 = v.C0;
            if (this.h0 != qm3Var3 && !sm3Var2.A0) {
                p53.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = b34.a[wm3Var2.d.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    qm3Var = qm3.InLayoutBlock;
                } else {
                    e41.z(wm3Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                qm3Var = qm3.InMeasureBlock;
            }
            this.h0 = qm3Var;
        } else {
            this.h0 = qm3Var3;
        }
        C0(j);
        return this;
    }

    public final void z0() {
        this.B0 = true;
        wm3 wm3Var = this.Y;
        sm3 v = wm3Var.a.v();
        float f = f().y0;
        sm3 sm3Var = wm3Var.a;
        if0 if0Var = sm3Var.B0;
        eg4 eg4Var = (eg4) if0Var.e;
        y53 y53Var = (y53) if0Var.d;
        while (eg4Var != y53Var) {
            eg4Var.getClass();
            mm3 mm3Var = (mm3) eg4Var;
            f += mm3Var.y0;
            eg4Var = mm3Var.n0;
        }
        if (f != this.A0) {
            this.A0 = f;
            if (v != null) {
                v.O();
            }
            if (v != null) {
                v.C();
            }
        }
        if (!f().g0) {
            boolean z = this.o0;
            if (!z || this.t0.d()) {
                u0();
            }
            if (!z) {
                if (v != null) {
                    v.C();
                }
                if (this.Z && v != null) {
                    v.U(false);
                }
            } else {
                ((y53) sm3Var.B0.d).j1();
            }
        }
        if (v != null) {
            wm3 wm3Var2 = v.C0;
            if (!this.Z && wm3Var2.d == om3.LayingOut) {
                if (this.e0 != Integer.MAX_VALUE) {
                    p53.c("Place was called on a node which was placed already");
                }
                int i = wm3Var2.i;
                this.e0 = i;
                wm3Var2.i = i + 1;
            }
        } else {
            this.e0 = 0;
        }
        I();
    }
}
