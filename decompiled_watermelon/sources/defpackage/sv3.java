package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sv3  reason: default package */
/* loaded from: classes.dex */
public final class sv3 extends yn4 implements mv3, zb, xz3 {
    public boolean A0;
    public mi2 B0;
    public float D0;
    public boolean F0;
    public final zf3 Y;
    public boolean Z;
    public boolean e0;
    public boolean f0;
    public boolean h0;
    public mi2 j0;
    public float k0;
    public Object m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean v0;
    public float z0;
    public int c0 = Preference.DEFAULT_ORDER;
    public int d0 = Preference.DEFAULT_ORDER;
    public tf3 g0 = tf3.NotUsed;
    public long i0 = 0;
    public boolean l0 = true;
    public final wf3 s0 = new wf3(this, 0);
    public final o24 t0 = new o24(new sv3[16]);
    public boolean u0 = true;
    public long w0 = nz0.b(0, 0, 0, 0, 15);
    public final rv3 x0 = new rv3(this, 1);
    public final rv3 y0 = new rv3(this, 0);
    public long C0 = 0;
    public final rv3 E0 = new rv3(this, 2);

    public sv3(zf3 zf3Var) {
        this.Y = zf3Var;
    }

    public final void B0(long j, float f, mi2 mi2Var) {
        zf3 zf3Var = this.Y;
        vf3 vf3Var = zf3Var.a;
        vf3 vf3Var2 = zf3Var.a;
        if (vf3Var.J0) {
            mz2.a("place is called on a deactivated node");
        }
        zf3Var.d = rf3.LayingOut;
        this.i0 = j;
        this.k0 = f;
        this.j0 = mi2Var;
        this.A0 = false;
        wg4 a = yf3.a(vf3Var2);
        if (!this.q0 && this.n0) {
            m74 a2 = zf3Var.a();
            a2.o1(a33.c(j, a2.X), f, mi2Var);
            z0();
        } else {
            this.s0.g = false;
            zf3Var.f(false);
            this.B0 = mi2Var;
            this.C0 = j;
            this.D0 = f;
            yg4 snapshotObserver = ((ee) a).getSnapshotObserver();
            snapshotObserver.a.d(vf3Var2, snapshotObserver.f, this.E0);
        }
        zf3Var.d = rf3.Idle;
        if (zf3Var.a().f0 && (zf3Var.k || zf3Var.j)) {
            requestLayout();
        }
        this.f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:24:0x0052->B:25:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv3.C0(long):boolean");
    }

    public final void F0() {
        zf3 zf3Var = this.Y;
        vf3 vf3Var = zf3Var.a;
        vf3 vf3Var2 = zf3Var.a;
        if (vf3Var.I() && zf3Var.l > 0) {
            zf3 zf3Var2 = vf3Var2.B0;
            if ((zf3Var2.j || zf3Var2.k) && !zf3Var2.p.q0) {
                vf3Var2.U(false);
            }
            o24 y = vf3Var2.y();
            Object[] objArr = y.A;
            int i = y.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((vf3) objArr[i2]).B0.p.F0();
            }
        }
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        zf3 zf3Var = this.Y;
        if (mj2.J(zf3Var.a)) {
            ms3 ms3Var = zf3Var.q;
            ms3Var.getClass();
            return ms3Var.T(i);
        }
        x0();
        return zf3Var.a().T(i);
    }

    @Override // defpackage.zb
    public final int Z() {
        return this.d0;
    }

    @Override // defpackage.zb
    public final void b0() {
        vf3.V(this.Y.a, false, 7);
    }

    @Override // defpackage.mv3
    public final yn4 c(long j) {
        tf3 tf3Var;
        zf3 zf3Var = this.Y;
        vf3 vf3Var = zf3Var.a;
        vf3 vf3Var2 = zf3Var.a;
        tf3 tf3Var2 = vf3Var.x0;
        tf3 tf3Var3 = tf3.NotUsed;
        if (tf3Var2 == tf3Var3) {
            vf3Var.e();
        }
        if (mj2.J(vf3Var2)) {
            ms3 ms3Var = zf3Var.q;
            ms3Var.getClass();
            ms3Var.e0 = tf3Var3;
            ms3Var.c(j);
        }
        vf3 u = vf3Var2.u();
        if (u != null) {
            zf3 zf3Var2 = u.B0;
            if (this.g0 != tf3Var3 && !vf3Var2.z0) {
                mz2.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = qv3.a[zf3Var2.d.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    tf3Var = tf3.InLayoutBlock;
                } else {
                    f81.A(zf3Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                tf3Var = tf3.InMeasureBlock;
            }
            this.g0 = tf3Var;
        } else {
            this.g0 = tf3Var3;
        }
        C0(j);
        return this;
    }

    @Override // defpackage.zb
    public final wf3 e() {
        return this.s0;
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        zf3 zf3Var = this.Y;
        if (mj2.J(zf3Var.a)) {
            ms3 ms3Var = zf3Var.q;
            ms3Var.getClass();
            return ms3Var.e0(i);
        }
        x0();
        return zf3Var.a().e0(i);
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        zf3 zf3Var = this.Y;
        if (mj2.J(zf3Var.a)) {
            ms3 ms3Var = zf3Var.q;
            ms3Var.getClass();
            return ms3Var.f(i);
        }
        x0();
        return zf3Var.a().f(i);
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        zf3 zf3Var = this.Y;
        if (mj2.J(zf3Var.a)) {
            ms3 ms3Var = zf3Var.q;
            ms3Var.getClass();
            return ms3Var.g0(i);
        }
        x0();
        return zf3Var.a().g0(i);
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
        rf3 rf3Var3 = rf3.Measuring;
        wf3 wf3Var = this.s0;
        if (rf3Var == rf3Var3) {
            wf3Var.c = true;
        } else {
            vf3 u2 = zf3Var.a.u();
            if (u2 != null) {
                rf3Var2 = u2.B0.d;
            }
            if (rf3Var2 == rf3.LayingOut) {
                wf3Var.d = true;
            }
        }
        this.h0 = true;
        int j0 = zf3Var.a().j0(ds2Var);
        this.h0 = false;
        return j0;
    }

    @Override // defpackage.yn4
    public final int k0() {
        return this.Y.a().k0();
    }

    @Override // defpackage.yn4, defpackage.mv3
    public final Object l() {
        return this.m0;
    }

    @Override // defpackage.yn4
    public final int l0() {
        return this.Y.a().l0();
    }

    @Override // defpackage.zb
    public final void n(yb ybVar) {
        o24 y = this.Y.a.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            ybVar.n(((vf3) objArr[i2]).B0.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002e, B:21:0x0032, B:23:0x003a, B:26:0x0043, B:27:0x0045, B:29:0x0049, B:31:0x004f, B:33:0x0057, B:36:0x0065, B:38:0x0070, B:39:0x0074, B:35:0x005b, B:40:0x0088, B:42:0x008c, B:44:0x0090, B:45:0x0095, B:12:0x001e, B:14:0x0022, B:16:0x0026, B:18:0x002a), top: B:49:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:19:0x002e, B:21:0x0032, B:23:0x003a, B:26:0x0043, B:27:0x0045, B:29:0x0049, B:31:0x004f, B:33:0x0057, B:36:0x0065, B:38:0x0070, B:39:0x0074, B:35:0x005b, B:40:0x0088, B:42:0x008c, B:44:0x0090, B:45:0x0095, B:12:0x001e, B:14:0x0022, B:16:0x0026, B:18:0x002a), top: B:49:0x0007 }] */
    @Override // defpackage.yn4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(long r9, float r11, defpackage.mi2 r12) {
        /*
            r8 = this;
            zf3 r0 = r8.Y
            vf3 r1 = r0.a
            vf3 r2 = r0.a
            r3 = 1
            r8.o0 = r3     // Catch: java.lang.Throwable -> L1b
            long r4 = r8.i0     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.a33.a(r9, r4)     // Catch: java.lang.Throwable -> L1b
            r5 = 0
            if (r4 == 0) goto L1e
            mi2 r4 = r8.j0     // Catch: java.lang.Throwable -> L1b
            if (r12 != r4) goto L1e
            boolean r4 = r8.F0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2e
            goto L1e
        L1b:
            r8 = move-exception
            goto L99
        L1e:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2a
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L2a
            boolean r4 = r8.F0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2e
        L2a:
            r8.q0 = r3     // Catch: java.lang.Throwable -> L1b
            r8.F0 = r5     // Catch: java.lang.Throwable -> L1b
        L2e:
            ms3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L45
            zf3 r6 = r4.Y     // Catch: java.lang.Throwable -> L1b
            js3 r4 = r4.l0     // Catch: java.lang.Throwable -> L1b
            js3 r7 = defpackage.js3.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r4 != r7) goto L45
            vf3 r4 = r6.a     // Catch: java.lang.Throwable -> L1b
            boolean r4 = defpackage.mj2.J(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L43
            goto L45
        L43:
            r6.c = r3     // Catch: java.lang.Throwable -> L1b
        L45:
            ms3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L88
            boolean r4 = r4.r0()     // Catch: java.lang.Throwable -> L1b
            if (r4 != r3) goto L88
            m74 r3 = r0.a()     // Catch: java.lang.Throwable -> L1b
            m74 r3 = r3.n0     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L5b
            gs3 r3 = r3.g0     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L65
        L5b:
            wg4 r3 = defpackage.yf3.a(r2)     // Catch: java.lang.Throwable -> L1b
            ee r3 = (defpackage.ee) r3     // Catch: java.lang.Throwable -> L1b
            xn4 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L1b
        L65:
            ms3 r4 = r0.q     // Catch: java.lang.Throwable -> L1b
            r4.getClass()     // Catch: java.lang.Throwable -> L1b
            vf3 r2 = r2.u()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L74
            zf3 r2 = r2.B0     // Catch: java.lang.Throwable -> L1b
            r2.h = r5     // Catch: java.lang.Throwable -> L1b
        L74:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.d0 = r2     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L1b
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L1b
            defpackage.xn4.k(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L1b
        L88:
            ms3 r0 = r0.q     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L95
            boolean r0 = r0.g0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L95
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.mz2.c(r0)     // Catch: java.lang.Throwable -> L1b
        L95:
            r8.B0(r9, r11, r12)     // Catch: java.lang.Throwable -> L1b
            return
        L99:
            r1.Y(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv3.o0(long, float, mi2):void");
    }

    @Override // defpackage.xz3
    public final void p(boolean z) {
        zf3 zf3Var = this.Y;
        if (z != zf3Var.a().d0) {
            zf3Var.a().d0 = z;
            this.F0 = true;
        }
    }

    @Override // defpackage.zb
    public final vz2 r() {
        return (vz2) this.Y.a.A0.d;
    }

    public final List r0() {
        zf3 zf3Var = this.Y;
        zf3Var.a.f0();
        boolean z = this.u0;
        o24 o24Var = this.t0;
        if (!z) {
            return o24Var.g();
        }
        vf3 vf3Var = zf3Var.a;
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (o24Var.L <= i2) {
                o24Var.b(vf3Var2.B0.p);
            } else {
                sv3 sv3Var = vf3Var2.B0.p;
                Object[] objArr2 = o24Var.A;
                Object obj = objArr2[i2];
                objArr2[i2] = sv3Var;
            }
        }
        o24Var.m(((o24) ((u14) vf3Var.n()).B).L, o24Var.L);
        this.u0 = false;
        return o24Var.g();
    }

    @Override // defpackage.zb
    public final void requestLayout() {
        this.Y.a.U(false);
    }

    @Override // defpackage.zb
    public final zb t() {
        zf3 zf3Var;
        vf3 u = this.Y.a.u();
        if (u != null && (zf3Var = u.B0) != null) {
            return zf3Var.p;
        }
        return null;
    }

    public final void t0() {
        boolean z = this.n0;
        this.n0 = true;
        zf3 zf3Var = this.Y;
        vf3 vf3Var = zf3Var.a;
        zc0 zc0Var = vf3Var.A0;
        if (!z) {
            ((vz2) zc0Var.d).j1();
            ((ee) yf3.a(vf3Var)).getRectManager().f(zf3Var.a);
            if (vf3Var.q()) {
                vf3.V(vf3Var, true, 6);
            } else if (vf3Var.B0.e) {
                vf3.T(vf3Var, true, 6);
            }
        }
        m74 m74Var = ((vz2) zc0Var.d).m0;
        for (m74 m74Var2 = (m74) zc0Var.e; !b53.x(m74Var2, m74Var) && m74Var2 != null; m74Var2 = m74Var2.m0) {
            if (m74Var2.H0) {
                m74Var2.f1();
            }
        }
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (vf3Var2.v() != Integer.MAX_VALUE) {
                vf3Var2.B0.p.t0();
                vf3.W(vf3Var2);
            }
        }
    }

    @Override // defpackage.zb
    public final void v() {
        lz0 lz0Var;
        boolean z;
        this.v0 = true;
        wf3 wf3Var = this.s0;
        wf3Var.h();
        boolean z2 = this.q0;
        zf3 zf3Var = this.Y;
        if (z2) {
            o24 y = zf3Var.a.y();
            Object[] objArr = y.A;
            int i = y.L;
            for (int i2 = 0; i2 < i; i2++) {
                vf3 vf3Var = (vf3) objArr[i2];
                boolean q = vf3Var.q();
                zf3 zf3Var2 = vf3Var.B0;
                if (q && vf3Var.r() == tf3.InMeasureBlock) {
                    sv3 sv3Var = zf3Var2.p;
                    if (sv3Var.e0) {
                        lz0Var = new lz0(sv3Var.R);
                    } else {
                        lz0Var = null;
                    }
                    if (lz0Var != null) {
                        if (vf3Var.x0 == tf3.NotUsed) {
                            vf3Var.e();
                        }
                        z = zf3Var2.p.C0(lz0Var.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        vf3.V(zf3Var.a, false, 7);
                    }
                }
            }
        }
        if (this.r0 || (!this.h0 && !r().f0 && this.q0)) {
            this.q0 = false;
            rf3 rf3Var = zf3Var.d;
            zf3Var.d = rf3.LayingOut;
            zf3Var.g(false);
            vf3 vf3Var2 = zf3Var.a;
            yg4 snapshotObserver = ((ee) yf3.a(vf3Var2)).getSnapshotObserver();
            snapshotObserver.a.d(vf3Var2, snapshotObserver.e, this.y0);
            zf3Var.d = rf3Var;
            this.r0 = false;
        }
        if (wf3Var.d) {
            wf3Var.e = true;
        }
        if (wf3Var.b && wf3Var.e()) {
            wf3Var.g();
        }
        this.v0 = false;
    }

    public final void w0() {
        if (this.n0) {
            this.n0 = false;
            zf3 zf3Var = this.Y;
            vf3 vf3Var = zf3Var.a;
            vf3 vf3Var2 = zf3Var.a;
            ((ee) yf3.a(vf3Var)).getRectManager().g(vf3Var2);
            zc0 zc0Var = vf3Var2.A0;
            m74 m74Var = ((vz2) zc0Var.d).m0;
            for (m74 m74Var2 = (m74) zc0Var.e; !b53.x(m74Var2, m74Var) && m74Var2 != null; m74Var2 = m74Var2.m0) {
                m74Var2.l1();
                m74Var2.q1();
            }
            o24 y = vf3Var2.y();
            Object[] objArr = y.A;
            int i = y.L;
            for (int i2 = 0; i2 < i; i2++) {
                ((vf3) objArr[i2]).B0.p.w0();
            }
        }
    }

    public final void x0() {
        tf3 tf3Var;
        zf3 zf3Var = this.Y;
        vf3.V(zf3Var.a, false, 7);
        vf3 vf3Var = zf3Var.a;
        vf3 u = vf3Var.u();
        if (u != null && vf3Var.x0 == tf3.NotUsed) {
            int i = qv3.a[u.B0.d.ordinal()];
            if (i != 1) {
                if (i != 2) {
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

    public final void z0() {
        this.A0 = true;
        zf3 zf3Var = this.Y;
        vf3 u = zf3Var.a.u();
        float f = r().x0;
        vf3 vf3Var = zf3Var.a;
        zc0 zc0Var = vf3Var.A0;
        m74 m74Var = (m74) zc0Var.e;
        vz2 vz2Var = (vz2) zc0Var.d;
        while (m74Var != vz2Var) {
            m74Var.getClass();
            pf3 pf3Var = (pf3) m74Var;
            f += pf3Var.x0;
            m74Var = pf3Var.m0;
        }
        if (f != this.z0) {
            this.z0 = f;
            if (u != null) {
                u.O();
            }
            if (u != null) {
                u.B();
            }
        }
        if (!r().f0) {
            boolean z = this.n0;
            if (!z || this.s0.d()) {
                t0();
            }
            if (!z) {
                if (u != null) {
                    u.B();
                }
                if (this.Z && u != null) {
                    u.U(false);
                }
            } else {
                ((vz2) vf3Var.A0.d).j1();
            }
        }
        if (u != null) {
            zf3 zf3Var2 = u.B0;
            if (!this.Z && zf3Var2.d == rf3.LayingOut) {
                if (this.d0 != Integer.MAX_VALUE) {
                    mz2.c("Place was called on a node which was placed already");
                }
                int i = zf3Var2.i;
                this.d0 = i;
                zf3Var2.i = i + 1;
            }
        } else {
            this.d0 = 0;
        }
        v();
    }
}
