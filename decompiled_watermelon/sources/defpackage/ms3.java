package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ms3  reason: default package */
/* loaded from: classes.dex */
public final class ms3 extends yn4 implements mv3, zb, xz3 {
    public final zf3 Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public lz0 i0;
    public mi2 k0;
    public boolean p0;
    public Object s0;
    public boolean w0;
    public int c0 = Preference.DEFAULT_ORDER;
    public int d0 = Preference.DEFAULT_ORDER;
    public tf3 e0 = tf3.NotUsed;
    public long j0 = 0;
    public js3 l0 = js3.IsNotPlaced;
    public final wf3 m0 = new wf3(this, 1);
    public final o24 n0 = new o24(new ms3[16]);
    public boolean o0 = true;
    public final ls3 q0 = new ls3(this, 0);
    public boolean r0 = true;
    public long t0 = nz0.b(0, 0, 0, 0, 15);
    public final ls3 u0 = new ls3(this, 2);
    public final ls3 v0 = new ls3(this, 1);

    public ms3(zf3 zf3Var) {
        this.Y = zf3Var;
        this.s0 = zf3Var.p.m0;
    }

    public final void B0() {
        rf3 rf3Var;
        this.w0 = true;
        zf3 zf3Var = this.Y;
        vf3 u = zf3Var.a.u();
        js3 js3Var = this.l0;
        if ((js3Var != js3.IsPlacedInLookahead && !zf3Var.c) || (js3Var != js3.IsPlacedInApproach && zf3Var.c)) {
            w0();
            if (this.Z && u != null) {
                u.S(false);
            }
        }
        if (u != null) {
            zf3 zf3Var2 = u.B0;
            if (!this.Z && ((rf3Var = zf3Var2.d) == rf3.LayingOut || rf3Var == rf3.LookaheadLayingOut)) {
                if (this.d0 != Integer.MAX_VALUE) {
                    mz2.c("Place was called on a node which was placed already");
                }
                int i = zf3Var2.h;
                this.d0 = i;
                zf3Var2.h = i + 1;
            }
        } else {
            this.d0 = 0;
        }
        v();
    }

    public final void C0(long j, mi2 mi2Var) {
        rf3 rf3Var;
        zf3 zf3Var = this.Y;
        vf3 vf3Var = zf3Var.a;
        vf3 vf3Var2 = zf3Var.a;
        try {
            vf3 u = vf3Var.u();
            if (u != null) {
                rf3Var = u.B0.d;
            } else {
                rf3Var = null;
            }
            rf3 rf3Var2 = rf3.LookaheadLayingOut;
            if (rf3Var == rf3Var2) {
                zf3Var.c = false;
            }
            if (vf3Var2.J0) {
                mz2.a("place is called on a deactivated node");
            }
            zf3Var.d = rf3Var2;
            boolean z = true;
            this.g0 = true;
            this.w0 = false;
            if (!a33.a(j, this.j0)) {
                if (zf3Var.n || zf3Var.m) {
                    zf3Var.f = true;
                }
                x0();
            }
            wg4 a = yf3.a(vf3Var2);
            this.j0 = j;
            if (!zf3Var.f) {
                if (this.l0 == js3.IsNotPlaced) {
                    z = false;
                }
                if (z) {
                    hs3 W0 = zf3Var.a().W0();
                    W0.getClass();
                    W0.Q0(a33.c(j, W0.X));
                    B0();
                    this.k0 = mi2Var;
                    zf3Var.d = rf3.Idle;
                }
            }
            zf3Var.h(false);
            this.m0.g = false;
            yg4 snapshotObserver = ((ee) a).getSnapshotObserver();
            snapshotObserver.a.d(vf3Var2, snapshotObserver.g, this.v0);
            this.k0 = mi2Var;
            zf3Var.d = rf3.Idle;
        } catch (Throwable th) {
            vf3Var.Y(th);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F0(long r14) {
        /*
            r13 = this;
            zf3 r0 = r13.Y
            vf3 r1 = r0.a
            vf3 r2 = r0.a
            boolean r3 = r1.J0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.mz2.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbb
        L13:
            vf3 r3 = r2.u()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.z0     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.z0     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.z0 = r3     // Catch: java.lang.Throwable -> L10
            zf3 r3 = r2.B0     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            lz0 r3 = r13.i0     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.lz0.b(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            wg4 r13 = r2.j0     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            ee r13 = (defpackage.ee) r13     // Catch: java.lang.Throwable -> L10
            r13.i(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.X()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            lz0 r3 = new lz0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.i0 = r3     // Catch: java.lang.Throwable -> L10
            r13.q0(r14)     // Catch: java.lang.Throwable -> L10
            wf3 r3 = r13.m0     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            o24 r2 = r2.y()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.A     // Catch: java.lang.Throwable -> L10
            int r2 = r2.L     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            vf3 r7 = (defpackage.vf3) r7     // Catch: java.lang.Throwable -> L10
            zf3 r7 = r7.B0     // Catch: java.lang.Throwable -> L10
            ms3 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            wf3 r7 = r7.m0     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.h0     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.L     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.h0 = r5     // Catch: java.lang.Throwable -> L10
            m74 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            hs3 r4 = r4.W0()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L8f
            goto L94
        L8f:
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.mz2.c(r7)     // Catch: java.lang.Throwable -> L10
        L94:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.A     // Catch: java.lang.Throwable -> L10
            int r15 = r4.B     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.p0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.A     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lba
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.B     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lb9
            goto Lba
        Lb9:
            return r6
        Lba:
            return r5
        Lbb:
            r1.Y(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms3.F0(long):boolean");
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        z0();
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.T(i);
    }

    @Override // defpackage.zb
    public final int Z() {
        return this.d0;
    }

    @Override // defpackage.zb
    public final void b0() {
        vf3.T(this.Y.a, false, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == defpackage.rf3.LookaheadLayingOut) goto L39;
     */
    @Override // defpackage.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yn4 c(long r6) {
        /*
            r5 = this;
            zf3 r0 = r5.Y
            vf3 r1 = r0.a
            vf3 r2 = r0.a
            vf3 r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            zf3 r1 = r1.B0
            rf3 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            rf3 r4 = defpackage.rf3.LookaheadMeasuring
            if (r1 == r4) goto L27
            vf3 r1 = r2.u()
            if (r1 == 0) goto L22
            zf3 r1 = r1.B0
            rf3 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            rf3 r4 = defpackage.rf3.LookaheadLayingOut
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            vf3 r0 = r2.u()
            if (r0 == 0) goto L69
            zf3 r0 = r0.B0
            tf3 r1 = r5.e0
            tf3 r4 = defpackage.tf3.NotUsed
            if (r1 == r4) goto L42
            boolean r1 = r2.z0
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.mz2.c(r1)
        L42:
            rf3 r1 = r0.d
            int[] r4 = defpackage.ks3.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L64
            r4 = 2
            if (r1 == r4) goto L64
            r4 = 3
            if (r1 == r4) goto L61
            r4 = 4
            if (r1 != r4) goto L59
            goto L61
        L59:
            java.lang.String r5 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            rf3 r6 = r0.d
            defpackage.f81.A(r6, r5)
            return r3
        L61:
            tf3 r0 = defpackage.tf3.InLayoutBlock
            goto L66
        L64:
            tf3 r0 = defpackage.tf3.InMeasureBlock
        L66:
            r5.e0 = r0
            goto L6d
        L69:
            tf3 r0 = defpackage.tf3.NotUsed
            r5.e0 = r0
        L6d:
            tf3 r0 = r2.x0
            tf3 r1 = defpackage.tf3.NotUsed
            if (r0 != r1) goto L76
            r2.e()
        L76:
            r5.F0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms3.c(long):yn4");
    }

    @Override // defpackage.zb
    public final wf3 e() {
        return this.m0;
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        z0();
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.e0(i);
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        z0();
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.f(i);
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        z0();
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.g0(i);
    }

    @Override // defpackage.yn4
    public final int j0(ds2 ds2Var) {
        rf3 rf3Var;
        zf3 zf3Var = this.Y;
        vf3 u = zf3Var.a.u();
        rf3 rf3Var2 = null;
        if (u != null) {
            rf3Var = u.B0.d;
        } else {
            rf3Var = null;
        }
        rf3 rf3Var3 = rf3.LookaheadMeasuring;
        wf3 wf3Var = this.m0;
        if (rf3Var == rf3Var3) {
            wf3Var.c = true;
        } else {
            vf3 u2 = zf3Var.a.u();
            if (u2 != null) {
                rf3Var2 = u2.B0.d;
            }
            if (rf3Var2 == rf3.LookaheadLayingOut) {
                wf3Var.d = true;
            }
        }
        this.f0 = true;
        hs3 W0 = zf3Var.a().W0();
        W0.getClass();
        int j0 = W0.j0(ds2Var);
        this.f0 = false;
        return j0;
    }

    @Override // defpackage.yn4
    public final int k0() {
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.k0();
    }

    @Override // defpackage.yn4, defpackage.mv3
    public final Object l() {
        return this.s0;
    }

    @Override // defpackage.yn4
    public final int l0() {
        hs3 W0 = this.Y.a().W0();
        W0.getClass();
        return W0.l0();
    }

    @Override // defpackage.zb
    public final void n(yb ybVar) {
        o24 y = this.Y.a.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            ms3 ms3Var = ((vf3) objArr[i2]).B0.q;
            ms3Var.getClass();
            ybVar.n(ms3Var);
        }
    }

    @Override // defpackage.yn4
    public final void o0(long j, float f, mi2 mi2Var) {
        C0(j, mi2Var);
    }

    @Override // defpackage.xz3
    public final void p(boolean z) {
        Boolean bool;
        hs3 W0;
        zf3 zf3Var = this.Y;
        hs3 W02 = zf3Var.a().W0();
        if (W02 != null) {
            bool = Boolean.valueOf(W02.d0);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (W0 = zf3Var.a().W0()) != null) {
            W0.d0 = z;
        }
    }

    @Override // defpackage.zb
    public final vz2 r() {
        return (vz2) this.Y.a.A0.d;
    }

    public final boolean r0() {
        zf3 zf3Var = this.Y;
        if (!mj2.J(zf3Var.a) && !zf3Var.c) {
            return false;
        }
        return true;
    }

    @Override // defpackage.zb
    public final void requestLayout() {
        this.Y.a.S(false);
    }

    @Override // defpackage.zb
    public final zb t() {
        zf3 zf3Var;
        vf3 u = this.Y.a.u();
        if (u != null && (zf3Var = u.B0) != null) {
            return zf3Var.q;
        }
        return null;
    }

    public final void t0(boolean z) {
        if (!z || !r0()) {
            if (z || r0()) {
                this.l0 = js3.IsNotPlaced;
                o24 y = this.Y.a.y();
                Object[] objArr = y.A;
                int i = y.L;
                for (int i2 = 0; i2 < i; i2++) {
                    ms3 ms3Var = ((vf3) objArr[i2]).B0.q;
                    ms3Var.getClass();
                    ms3Var.t0(true);
                }
            }
        }
    }

    @Override // defpackage.zb
    public final void v() {
        lz0 lz0Var;
        this.p0 = true;
        wf3 wf3Var = this.m0;
        wf3Var.h();
        zf3 zf3Var = this.Y;
        boolean z = zf3Var.f;
        vf3 vf3Var = zf3Var.a;
        if (z) {
            o24 y = vf3Var.y();
            Object[] objArr = y.A;
            int i = y.L;
            for (int i2 = 0; i2 < i; i2++) {
                vf3 vf3Var2 = (vf3) objArr[i2];
                zf3 zf3Var2 = vf3Var2.B0;
                if (zf3Var2.e && vf3Var2.s() == tf3.InMeasureBlock) {
                    ms3 ms3Var = zf3Var2.q;
                    ms3Var.getClass();
                    ms3 ms3Var2 = zf3Var2.q;
                    if (ms3Var2 != null) {
                        lz0Var = ms3Var2.i0;
                    } else {
                        lz0Var = null;
                    }
                    lz0Var.getClass();
                    if (ms3Var.F0(lz0Var.a)) {
                        vf3.T(vf3Var, false, 7);
                    }
                }
            }
        }
        uz2 uz2Var = r().P0;
        uz2Var.getClass();
        if (zf3Var.g || (!this.f0 && !uz2Var.f0 && zf3Var.f)) {
            zf3Var.f = false;
            rf3 rf3Var = zf3Var.d;
            zf3Var.d = rf3.LookaheadLayingOut;
            zf3Var.i(false);
            yg4 snapshotObserver = ((ee) yf3.a(vf3Var)).getSnapshotObserver();
            snapshotObserver.a.d(vf3Var, snapshotObserver.h, this.q0);
            zf3Var.d = rf3Var;
            if (zf3Var.m && uz2Var.f0) {
                requestLayout();
            }
            zf3Var.g = false;
        }
        if (wf3Var.d) {
            wf3Var.e = true;
        }
        if (wf3Var.b && wf3Var.e()) {
            wf3Var.g();
        }
        this.p0 = false;
    }

    public final void w0() {
        js3 js3Var = this.l0;
        zf3 zf3Var = this.Y;
        boolean z = zf3Var.c;
        vf3 vf3Var = zf3Var.a;
        if (z) {
            this.l0 = js3.IsPlacedInApproach;
        } else {
            this.l0 = js3.IsPlacedInLookahead;
        }
        if (js3Var != js3.IsPlacedInLookahead && zf3Var.e) {
            vf3.T(vf3Var, true, 6);
        }
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            ms3 ms3Var = vf3Var2.B0.q;
            if (ms3Var != null) {
                if (ms3Var.d0 != Integer.MAX_VALUE) {
                    ms3Var.w0();
                    vf3.W(vf3Var2);
                }
            } else {
                i.i("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    public final void x0() {
        zf3 zf3Var = this.Y;
        if (zf3Var.o > 0) {
            o24 y = zf3Var.a.y();
            Object[] objArr = y.A;
            int i = y.L;
            for (int i2 = 0; i2 < i; i2++) {
                vf3 vf3Var = (vf3) objArr[i2];
                zf3 zf3Var2 = vf3Var.B0;
                if ((zf3Var2.m || zf3Var2.n) && !zf3Var2.f) {
                    vf3Var.S(false);
                }
                ms3 ms3Var = zf3Var2.q;
                if (ms3Var != null) {
                    ms3Var.x0();
                }
            }
        }
    }

    public final void z0() {
        tf3 tf3Var;
        zf3 zf3Var = this.Y;
        vf3.T(zf3Var.a, false, 7);
        vf3 vf3Var = zf3Var.a;
        vf3 u = vf3Var.u();
        if (u != null && vf3Var.x0 == tf3.NotUsed) {
            int i = ks3.a[u.B0.d.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    tf3Var = u.x0;
                } else {
                    tf3Var = tf3.InLayoutBlock;
                }
            } else {
                tf3Var = tf3.InMeasureBlock;
            }
            vf3Var.x0 = tf3Var;
        }
    }
}
