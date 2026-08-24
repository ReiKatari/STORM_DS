package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz3  reason: default package */
/* loaded from: classes.dex */
public final class rz3 extends dx4 implements x24, nc, z74 {
    public final wm3 Y;
    public boolean Z;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public q21 j0;
    public qn2 l0;
    public boolean q0;
    public Object t0;
    public boolean x0;
    public int d0 = Integer.MAX_VALUE;
    public int e0 = Integer.MAX_VALUE;
    public qm3 f0 = qm3.NotUsed;
    public long k0 = 0;
    public oz3 m0 = oz3.IsNotPlaced;
    public final tm3 n0 = new tm3(this, 1);
    public final ua4 o0 = new ua4(new rz3[16]);
    public boolean p0 = true;
    public final qz3 r0 = new qz3(this, 0);
    public boolean s0 = true;
    public long u0 = s21.b(0, 0, 0, 0, 15);
    public final qz3 v0 = new qz3(this, 2);
    public final qz3 w0 = new qz3(this, 1);

    public rz3(wm3 wm3Var) {
        this.Y = wm3Var;
        this.t0 = wm3Var.p.n0;
    }

    public final void A0() {
        om3 om3Var;
        this.x0 = true;
        wm3 wm3Var = this.Y;
        sm3 v = wm3Var.a.v();
        oz3 oz3Var = this.m0;
        if ((oz3Var != oz3.IsPlacedInLookahead && !wm3Var.c) || (oz3Var != oz3.IsPlacedInApproach && wm3Var.c)) {
            w0();
            if (this.Z && v != null) {
                v.S(false);
            }
        }
        if (v != null) {
            wm3 wm3Var2 = v.C0;
            if (!this.Z && ((om3Var = wm3Var2.d) == om3.LayingOut || om3Var == om3.LookaheadLayingOut)) {
                if (this.e0 != Integer.MAX_VALUE) {
                    p53.c("Place was called on a node which was placed already");
                }
                int i = wm3Var2.h;
                this.e0 = i;
                wm3Var2.h = i + 1;
            }
        } else {
            this.e0 = 0;
        }
        I();
    }

    @Override // defpackage.dx4, defpackage.x24
    public final Object B() {
        return this.t0;
    }

    public final void C0(long j, qn2 qn2Var) {
        om3 om3Var;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        try {
            sm3 v = sm3Var.v();
            if (v != null) {
                om3Var = v.C0.d;
            } else {
                om3Var = null;
            }
            om3 om3Var2 = om3.LookaheadLayingOut;
            if (om3Var == om3Var2) {
                wm3Var.c = false;
            }
            if (sm3Var2.K0) {
                p53.a("place is called on a deactivated node");
            }
            wm3Var.d = om3Var2;
            boolean z = true;
            this.h0 = true;
            this.x0 = false;
            if (!i93.a(j, this.k0)) {
                if (wm3Var.n || wm3Var.m) {
                    wm3Var.f = true;
                }
                x0();
            }
            zp4 a = vm3.a(sm3Var2);
            this.k0 = j;
            if (!wm3Var.f) {
                if (this.m0 == oz3.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    mz3 W0 = wm3Var.a().W0();
                    W0.getClass();
                    W0.Q0(i93.c(j, W0.X));
                    A0();
                    this.l0 = qn2Var;
                    wm3Var.d = om3.Idle;
                }
            }
            wm3Var.h(false);
            this.n0.g = false;
            bq4 snapshotObserver = ((te) a).getSnapshotObserver();
            snapshotObserver.a.d(sm3Var2, snapshotObserver.g, this.w0);
            this.l0 = qn2Var;
            wm3Var.d = om3.Idle;
        } catch (Throwable th) {
            sm3Var.Y(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:30:0x0062->B:31:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x007a, B:36:0x0082, B:40:0x0094, B:42:0x00b1, B:39:0x008f), top: B:49:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F0(long j) {
        boolean z;
        int i;
        int i2;
        long j2;
        mz3 W0;
        boolean b;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        try {
            if (sm3Var.K0) {
                p53.a("measure is called on a deactivated node");
            }
            sm3 v = sm3Var2.v();
            if (!sm3Var2.A0 && (v == null || !v.A0)) {
                z = false;
                sm3Var2.A0 = z;
                if (!sm3Var2.C0.e) {
                    q21 q21Var = this.j0;
                    if (q21Var == null) {
                        b = false;
                    } else {
                        b = q21.b(q21Var.a, j);
                    }
                    if (b) {
                        zp4 zp4Var = sm3Var2.k0;
                        if (zp4Var != null) {
                            ((te) zp4Var).i(sm3Var2, true);
                        }
                        sm3Var2.X();
                        return false;
                    }
                }
                this.j0 = new q21(j);
                m0(j);
                this.n0.f = false;
                ua4 z2 = sm3Var2.z();
                Object[] objArr = z2.A;
                i = z2.L;
                for (i2 = 0; i2 < i; i2++) {
                    rz3 rz3Var = ((sm3) objArr[i2]).C0.q;
                    rz3Var.getClass();
                    rz3Var.n0.c = false;
                }
                if (!this.i0) {
                    j2 = this.L;
                } else {
                    j2 = -9223372034707292160L;
                }
                this.i0 = true;
                W0 = wm3Var.a().W0();
                if (W0 != null) {
                    p53.c("Lookahead result from lookaheadRemeasure cannot be null");
                }
                wm3Var.c(j);
                l0((W0.A << 32) | (W0.B & 4294967295L));
                if (((int) (j2 >> 32)) == W0.A || ((int) (j2 & 4294967295L)) != W0.B) {
                    return true;
                }
                return false;
            }
            z = true;
            sm3Var2.A0 = z;
            if (!sm3Var2.C0.e) {
            }
            this.j0 = new q21(j);
            m0(j);
            this.n0.f = false;
            ua4 z22 = sm3Var2.z();
            Object[] objArr2 = z22.A;
            i = z22.L;
            while (i2 < i) {
            }
            if (!this.i0) {
            }
            this.i0 = true;
            W0 = wm3Var.a().W0();
            if (W0 != null) {
            }
            wm3Var.c(j);
            l0((W0.A << 32) | (W0.B & 4294967295L));
            if (((int) (j2 >> 32)) == W0.A) {
            }
            return true;
        } catch (Throwable th) {
            sm3Var.Y(th);
            throw null;
        }
    }

    @Override // defpackage.nc
    public final void G(mc mcVar) {
        ua4 z = this.Y.a.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            rz3 rz3Var = ((sm3) objArr[i2]).C0.q;
            rz3Var.getClass();
            mcVar.g(rz3Var);
        }
    }

    @Override // defpackage.z74
    public final void H(boolean z) {
        Boolean bool;
        mz3 W0;
        wm3 wm3Var = this.Y;
        mz3 W02 = wm3Var.a().W0();
        if (W02 != null) {
            bool = Boolean.valueOf(W02.e0);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (W0 = wm3Var.a().W0()) != null) {
            W0.e0 = z;
        }
    }

    @Override // defpackage.nc
    public final void I() {
        q21 q21Var;
        this.q0 = true;
        tm3 tm3Var = this.n0;
        tm3Var.h();
        wm3 wm3Var = this.Y;
        boolean z = wm3Var.f;
        sm3 sm3Var = wm3Var.a;
        if (z) {
            ua4 z2 = sm3Var.z();
            Object[] objArr = z2.A;
            int i = z2.L;
            for (int i2 = 0; i2 < i; i2++) {
                sm3 sm3Var2 = (sm3) objArr[i2];
                wm3 wm3Var2 = sm3Var2.C0;
                if (wm3Var2.e && sm3Var2.t() == qm3.InMeasureBlock) {
                    rz3 rz3Var = wm3Var2.q;
                    rz3Var.getClass();
                    rz3 rz3Var2 = wm3Var2.q;
                    if (rz3Var2 != null) {
                        q21Var = rz3Var2.j0;
                    } else {
                        q21Var = null;
                    }
                    q21Var.getClass();
                    if (rz3Var.F0(q21Var.a)) {
                        sm3.T(sm3Var, false, 7);
                    }
                }
            }
        }
        x53 x53Var = f().Q0;
        x53Var.getClass();
        if (wm3Var.g || (!this.g0 && !x53Var.g0 && wm3Var.f)) {
            wm3Var.f = false;
            om3 om3Var = wm3Var.d;
            wm3Var.d = om3.LookaheadLayingOut;
            wm3Var.i(false);
            bq4 snapshotObserver = ((te) vm3.a(sm3Var)).getSnapshotObserver();
            snapshotObserver.a.d(sm3Var, snapshotObserver.h, this.r0);
            wm3Var.d = om3Var;
            if (wm3Var.m && x53Var.g0) {
                requestLayout();
            }
            wm3Var.g = false;
        }
        if (tm3Var.d) {
            tm3Var.e = true;
        }
        if (tm3Var.b && tm3Var.e()) {
            tm3Var.g();
        }
        this.q0 = false;
    }

    @Override // defpackage.nc
    public final void S() {
        sm3.T(this.Y.a, false, 7);
    }

    @Override // defpackage.x24
    public final int V(int i) {
        z0();
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.V(i);
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
        om3 om3Var3 = om3.LookaheadMeasuring;
        tm3 tm3Var = this.n0;
        if (om3Var == om3Var3) {
            tm3Var.c = true;
        } else {
            sm3 v2 = wm3Var.a.v();
            if (v2 != null) {
                om3Var2 = v2.C0.d;
            }
            if (om3Var2 == om3.LookaheadLayingOut) {
                tm3Var.d = true;
            }
        }
        this.g0 = true;
        mz3 W0 = wm3Var.a().W0();
        W0.getClass();
        int X = W0.X(ey2Var);
        this.g0 = false;
        return X;
    }

    @Override // defpackage.dx4
    public final int Z() {
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.Z();
    }

    @Override // defpackage.nc
    public final tm3 b() {
        return this.n0;
    }

    @Override // defpackage.x24
    public final int c(int i) {
        z0();
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.c(i);
    }

    @Override // defpackage.dx4
    public final int d0() {
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.d0();
    }

    @Override // defpackage.nc
    public final y53 f() {
        return (y53) this.Y.a.B0.d;
    }

    @Override // defpackage.dx4
    public final void h0(long j, float f, qn2 qn2Var) {
        C0(j, qn2Var);
    }

    @Override // defpackage.nc
    public final nc j() {
        wm3 wm3Var;
        sm3 v = this.Y.a.v();
        if (v != null && (wm3Var = v.C0) != null) {
            return wm3Var.q;
        }
        return null;
    }

    @Override // defpackage.x24
    public final int n(int i) {
        z0();
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.n(i);
    }

    @Override // defpackage.nc
    public final int o() {
        return this.e0;
    }

    @Override // defpackage.nc
    public final void requestLayout() {
        this.Y.a.S(false);
    }

    public final boolean s0() {
        wm3 wm3Var = this.Y;
        if (!bl2.J(wm3Var.a) && !wm3Var.c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x24
    public final int u(int i) {
        z0();
        mz3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.u(i);
    }

    public final void u0(boolean z) {
        if (!z || !s0()) {
            if (z || s0()) {
                this.m0 = oz3.IsNotPlaced;
                ua4 z2 = this.Y.a.z();
                Object[] objArr = z2.A;
                int i = z2.L;
                for (int i2 = 0; i2 < i; i2++) {
                    rz3 rz3Var = ((sm3) objArr[i2]).C0.q;
                    rz3Var.getClass();
                    rz3Var.u0(true);
                }
            }
        }
    }

    public final void w0() {
        oz3 oz3Var = this.m0;
        wm3 wm3Var = this.Y;
        boolean z = wm3Var.c;
        sm3 sm3Var = wm3Var.a;
        if (z) {
            this.m0 = oz3.IsPlacedInApproach;
        } else {
            this.m0 = oz3.IsPlacedInLookahead;
        }
        if (oz3Var != oz3.IsPlacedInLookahead && wm3Var.e) {
            sm3.T(sm3Var, true, 6);
        }
        ua4 z2 = sm3Var.z();
        Object[] objArr = z2.A;
        int i = z2.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            rz3 rz3Var = sm3Var2.C0.q;
            if (rz3Var != null) {
                if (rz3Var.e0 != Integer.MAX_VALUE) {
                    rz3Var.w0();
                    sm3.W(sm3Var2);
                }
            } else {
                i.h("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void x0() {
        wm3 wm3Var = this.Y;
        if (wm3Var.o > 0) {
            ua4 z = wm3Var.a.z();
            Object[] objArr = z.A;
            int i = z.L;
            for (int i2 = 0; i2 < i; i2++) {
                sm3 sm3Var = (sm3) objArr[i2];
                wm3 wm3Var2 = sm3Var.C0;
                if ((wm3Var2.m || wm3Var2.n) && !wm3Var2.f) {
                    sm3Var.S(false);
                }
                rz3 rz3Var = wm3Var2.q;
                if (rz3Var != null) {
                    rz3Var.x0();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == defpackage.om3.LookaheadLayingOut) goto L39;
     */
    @Override // defpackage.x24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dx4 y(long j) {
        om3 om3Var;
        qm3 qm3Var;
        om3 om3Var2;
        wm3 wm3Var = this.Y;
        sm3 sm3Var = wm3Var.a;
        sm3 sm3Var2 = wm3Var.a;
        sm3 v = sm3Var.v();
        if (v != null) {
            om3Var = v.C0.d;
        } else {
            om3Var = null;
        }
        if (om3Var != om3.LookaheadMeasuring) {
            sm3 v2 = sm3Var2.v();
            if (v2 != null) {
                om3Var2 = v2.C0.d;
            } else {
                om3Var2 = null;
            }
        }
        wm3Var.b = false;
        sm3 v3 = sm3Var2.v();
        if (v3 != null) {
            wm3 wm3Var2 = v3.C0;
            if (this.f0 != qm3.NotUsed && !sm3Var2.A0) {
                p53.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = pz3.a[wm3Var2.d.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    e41.z(wm3Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                qm3Var = qm3.InLayoutBlock;
            } else {
                qm3Var = qm3.InMeasureBlock;
            }
            this.f0 = qm3Var;
        } else {
            this.f0 = qm3.NotUsed;
        }
        if (sm3Var2.y0 == qm3.NotUsed) {
            sm3Var2.e();
        }
        F0(j);
        return this;
    }

    public final void z0() {
        qm3 qm3Var;
        wm3 wm3Var = this.Y;
        sm3.T(wm3Var.a, false, 7);
        sm3 sm3Var = wm3Var.a;
        sm3 v = sm3Var.v();
        if (v != null && sm3Var.y0 == qm3.NotUsed) {
            int i = pz3.a[v.C0.d.ordinal()];
            if (i != 2) {
                if (i != 3) {
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
}
