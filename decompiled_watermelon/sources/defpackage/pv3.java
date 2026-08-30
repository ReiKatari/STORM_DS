package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pv3  reason: default package */
/* loaded from: classes.dex */
public final class pv3 {
    public final vf3 a;
    public boolean c;
    public boolean d;
    public lz0 i;
    public final os b = new os(11);
    public final ci3 e = new ci3(7);
    public final o24 f = new o24(new vf3[16]);
    public final long g = 1;
    public final o24 h = new o24(new nv3[16]);

    public pv3(vf3 vf3Var) {
        this.a = vf3Var;
    }

    public static final boolean a(pv3 pv3Var, vf3 vf3Var, boolean z) {
        lz0 lz0Var;
        boolean z2;
        xn4 placementScope;
        vz2 vz2Var;
        vf3 u;
        vf3 vf3Var2 = pv3Var.a;
        boolean z3 = vf3Var.J0;
        zf3 zf3Var = vf3Var.B0;
        boolean z4 = false;
        if (!z3 && k(vf3Var)) {
            if (vf3Var == vf3Var2) {
                lz0Var = pv3Var.i;
                lz0Var.getClass();
            } else {
                lz0Var = null;
            }
            if (z) {
                if (zf3Var.e) {
                    z4 = c(vf3Var, lz0Var);
                }
                if ((z4 || zf3Var.f) && b53.x(vf3Var.J(), Boolean.TRUE)) {
                    vf3Var.K();
                }
            } else {
                if (vf3Var.q()) {
                    z2 = d(vf3Var, lz0Var);
                } else {
                    z2 = false;
                }
                if (vf3Var.p() && (vf3Var == vf3Var2 || ((u = vf3Var.u()) != null && u.I() && zf3Var.p.o0))) {
                    if (vf3Var == vf3Var2) {
                        if (vf3Var.x0 == tf3.NotUsed) {
                            vf3Var.f();
                        }
                        vf3 u2 = vf3Var.u();
                        if (u2 == null || (vz2Var = (vz2) u2.A0.d) == null || (placementScope = vz2Var.g0) == null) {
                            placementScope = ((ee) yf3.a(vf3Var)).getPlacementScope();
                        }
                        xn4.m(placementScope, zf3Var.p, 0, 0);
                    } else {
                        vf3Var.R();
                    }
                    ci3 ci3Var = pv3Var.e;
                    ci3Var.getClass();
                    if (vf3Var.I0 > 0) {
                        ((o24) ci3Var.B).b(vf3Var);
                        vf3Var.H0 = true;
                    }
                }
                z4 = z2;
            }
            pv3Var.e();
        }
        return z4;
    }

    public static boolean c(vf3 vf3Var, lz0 lz0Var) {
        lz0 lz0Var2;
        boolean F0;
        vf3 vf3Var2 = vf3Var.d0;
        zf3 zf3Var = vf3Var.B0;
        if (vf3Var2 == null) {
            return false;
        }
        if (lz0Var != null) {
            if (vf3Var2 != null) {
                ms3 ms3Var = zf3Var.q;
                ms3Var.getClass();
                F0 = ms3Var.F0(lz0Var.a);
            }
            F0 = false;
        } else {
            ms3 ms3Var2 = zf3Var.q;
            if (ms3Var2 != null) {
                lz0Var2 = ms3Var2.i0;
            } else {
                lz0Var2 = null;
            }
            if (lz0Var2 != null && vf3Var2 != null) {
                ms3Var2.getClass();
                F0 = ms3Var2.F0(lz0Var2.a);
            }
            F0 = false;
        }
        vf3 u = vf3Var.u();
        if (F0 && u != null) {
            if (u.d0 == null) {
                vf3.V(u, false, 3);
                return F0;
            } else if (vf3Var.s() == tf3.InMeasureBlock) {
                vf3.T(u, false, 3);
                return F0;
            } else if (vf3Var.s() == tf3.InLayoutBlock) {
                u.S(false);
            }
        }
        return F0;
    }

    public static boolean d(vf3 vf3Var, lz0 lz0Var) {
        lz0 lz0Var2;
        boolean z;
        if (lz0Var != null) {
            if (vf3Var.x0 == tf3.NotUsed) {
                vf3Var.e();
            }
            z = vf3Var.B0.p.C0(lz0Var.a);
        } else {
            sv3 sv3Var = vf3Var.B0.p;
            if (sv3Var.e0) {
                lz0Var2 = new lz0(sv3Var.R);
            } else {
                lz0Var2 = null;
            }
            if (lz0Var2 != null) {
                if (vf3Var.x0 == tf3.NotUsed) {
                    vf3Var.e();
                }
                z = vf3Var.B0.p.C0(lz0Var2.a);
            } else {
                vf3Var.getClass();
                z = false;
            }
        }
        vf3 u = vf3Var.u();
        if (z && u != null) {
            if (vf3Var.r() == tf3.InMeasureBlock) {
                vf3.V(u, false, 3);
                return z;
            } else if (vf3Var.r() == tf3.InLayoutBlock) {
                u.U(false);
            }
        }
        return z;
    }

    public static boolean i(vf3 vf3Var) {
        ms3 ms3Var;
        wf3 wf3Var;
        if (vf3Var.B0.e) {
            if (vf3Var.s() != tf3.NotUsed || ((ms3Var = vf3Var.B0.q) != null && (wf3Var = ms3Var.m0) != null && wf3Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(vf3 vf3Var) {
        rf3 rf3Var;
        if (vf3Var.q()) {
            do {
                if (vf3Var.r() == tf3.NotUsed && !vf3Var.B0.p.s0.e()) {
                    vf3 u = vf3Var.u();
                    if (u != null) {
                        rf3Var = u.B0.d;
                    } else {
                        rf3Var = null;
                    }
                    if (rf3Var != rf3.Measuring) {
                        return false;
                    }
                }
                vf3Var = vf3Var.u();
                if (vf3Var == null) {
                    return false;
                }
            } while (!vf3Var.I());
            return true;
        }
        return false;
    }

    public static boolean k(vf3 vf3Var) {
        ms3 ms3Var;
        wf3 wf3Var;
        zf3 zf3Var = vf3Var.B0;
        if (vf3Var.I() || zf3Var.p.o0 || j(vf3Var) || b53.x(vf3Var.J(), Boolean.TRUE) || i(vf3Var) || zf3Var.p.s0.e() || ((ms3Var = zf3Var.q) != null && (wf3Var = ms3Var.m0) != null && wf3Var.e())) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        ci3 ci3Var = this.e;
        if (z) {
            o24 o24Var = (o24) ci3Var.B;
            vf3 vf3Var = this.a;
            if (vf3Var.I0 > 0) {
                o24Var.h();
                o24Var.b(vf3Var);
                vf3Var.H0 = true;
            }
        }
        if (((o24) ci3Var.B).L != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                ci3Var.r();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        o24 o24Var = this.h;
        int i = o24Var.L;
        if (i != 0) {
            Object[] objArr = o24Var.A;
            for (int i2 = 0; i2 < i; i2++) {
                nv3 nv3Var = (nv3) objArr[i2];
                if (nv3Var.a.H()) {
                    boolean z = nv3Var.b;
                    vf3 vf3Var = nv3Var.a;
                    boolean z2 = nv3Var.c;
                    if (!z) {
                        vf3.V(vf3Var, z2, 2);
                    } else {
                        vf3.T(vf3Var, z2, 2);
                    }
                }
            }
            o24Var.h();
        }
    }

    public final void f(vf3 vf3Var) {
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (b53.x(vf3Var2.J(), Boolean.TRUE) && !vf3Var2.J0) {
                if (this.b.m(vf3Var2)) {
                    vf3Var2.K();
                }
                f(vf3Var2);
            }
        }
    }

    public final void g(vf3 vf3Var, boolean z) {
        boolean q;
        if (!this.c) {
            mz2.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            q = vf3Var.B0.e;
        } else {
            q = vf3Var.q();
        }
        if (q) {
            mz2.a("node not yet measured");
        }
        h(vf3Var, z);
    }

    public final void h(vf3 vf3Var, boolean z) {
        boolean q;
        ms3 ms3Var;
        wf3 wf3Var;
        boolean q2;
        boolean q3;
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if ((!z && (vf3Var2.r() == tf3.InMeasureBlock || vf3Var2.B0.p.s0.e())) || (z && (vf3Var2.s() == tf3.InMeasureBlock || ((ms3Var = vf3Var2.B0.q) != null && (wf3Var = ms3Var.m0) != null && wf3Var.e())))) {
                boolean J = mj2.J(vf3Var2);
                zf3 zf3Var = vf3Var2.B0;
                if (J && !z) {
                    if (zf3Var.e && this.b.m(vf3Var2)) {
                        o(vf3Var2, true);
                    } else {
                        g(vf3Var2, true);
                    }
                }
                if (z) {
                    q2 = zf3Var.e;
                } else {
                    q2 = vf3Var2.q();
                }
                if (q2) {
                    o(vf3Var2, z);
                }
                if (z) {
                    q3 = zf3Var.e;
                } else {
                    q3 = vf3Var2.q();
                }
                if (!q3) {
                    h(vf3Var2, z);
                }
            }
        }
        if (z) {
            q = vf3Var.B0.e;
        } else {
            q = vf3Var.q();
        }
        if (q) {
            o(vf3Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(vd vdVar) {
        boolean z;
        yy3 yy3Var;
        boolean z2;
        vf3 vf3Var;
        boolean z3;
        boolean o;
        os osVar = this.b;
        vf3 vf3Var2 = this.a;
        if (!vf3Var2.H()) {
            mz2.a("performMeasureAndLayout called with unattached root");
        }
        if (!vf3Var2.I()) {
            mz2.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            mz2.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean I = osVar.I();
                t71 t71Var = (t71) osVar.B;
                if (I) {
                    z = false;
                    while (true) {
                        t71 t71Var2 = (t71) osVar.R;
                        t71 t71Var3 = (t71) osVar.L;
                        if (!((pb6) t71Var.B).isEmpty()) {
                            vf3Var = (vf3) ((pb6) t71Var.B).first();
                            t71Var.r(vf3Var);
                            if (vf3Var.d0 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        } else if (!((pb6) t71Var3.B).isEmpty()) {
                            vf3Var = (vf3) ((pb6) t71Var3.B).first();
                            t71Var3.r(vf3Var);
                            if (vf3Var.d0 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = true;
                        } else if (((pb6) t71Var2.B).isEmpty()) {
                            break;
                        } else {
                            vf3 vf3Var3 = (vf3) ((pb6) t71Var2.B).first();
                            t71Var2.r(vf3Var3);
                            z2 = true;
                            vf3Var = vf3Var3;
                            z3 = false;
                        }
                        if (z2) {
                            o = a(this, vf3Var, z3);
                        } else {
                            o = o(vf3Var, z3);
                            if (vf3Var.B0.f) {
                                osVar.k(vf3Var, j53.LookaheadPlacement);
                            }
                            if (vf3Var.p()) {
                                osVar.k(vf3Var, j53.Placement);
                            }
                        }
                        if (vf3Var == vf3Var2 && o) {
                            z = true;
                        }
                    }
                    if (vdVar != null) {
                        vdVar.c();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        o24 o24Var = this.f;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        int i2 = 0;
        while (i2 < i) {
            zc0 zc0Var = ((vf3) objArr[i2]).A0;
            vz2 vz2Var = (vz2) zc0Var.d;
            boolean g = n74.g(4194304);
            if (g) {
                yy3Var = vz2Var.O0;
            } else {
                yy3Var = vz2Var.O0.X;
                if (yy3Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            rf5 rf5Var = m74.J0;
            yy3 a1 = vz2Var.a1(g);
            while (a1 != null && (a1.R & 4194304) != 0) {
                if ((a1.L & 4194304) != 0) {
                    yy3 yy3Var2 = a1;
                    o24 o24Var2 = null;
                    while (yy3Var2 != null) {
                        if (yy3Var2 instanceof sc3) {
                            ((sc3) yy3Var2).s((vz2) zc0Var.d);
                        } else if ((yy3Var2.L & 4194304) != 0 && (yy3Var2 instanceof xc1)) {
                            yy3 yy3Var3 = ((xc1) yy3Var2).k0;
                            ?? r15 = z4;
                            while (yy3Var3 != null) {
                                if ((yy3Var3.L & 4194304) != 0) {
                                    r15++;
                                    if (r15 == 1) {
                                        yy3Var2 = yy3Var3;
                                    } else {
                                        if (o24Var2 == null) {
                                            o24Var2 = new o24(new yy3[16]);
                                        }
                                        if (yy3Var2 != null) {
                                            o24Var2.b(yy3Var2);
                                            yy3Var2 = null;
                                        }
                                        o24Var2.b(yy3Var3);
                                    }
                                }
                                yy3Var3 = yy3Var3.Y;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                            }
                        }
                        yy3Var2 = l.p(o24Var2);
                        z4 = false;
                    }
                }
                if (a1 != yy3Var) {
                    a1 = a1.Y;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        o24Var.h();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.vf3 r13, long r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv3.m(vf3, long):void");
    }

    public final void n() {
        boolean z;
        os osVar = this.b;
        if (osVar.I()) {
            vf3 vf3Var = this.a;
            if (!vf3Var.H()) {
                mz2.a("performMeasureAndLayout called with unattached root");
            }
            if (!vf3Var.I()) {
                mz2.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                mz2.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((pb6) ((t71) osVar.R).B).isEmpty() && !((pb6) ((t71) osVar.B).B).isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (vf3Var.d0 != null) {
                            q(vf3Var, true);
                        } else {
                            p(vf3Var);
                        }
                    }
                    q(vf3Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(vf3 vf3Var, boolean z) {
        lz0 lz0Var;
        boolean z2 = false;
        if (!vf3Var.J0 && k(vf3Var)) {
            if (vf3Var == this.a) {
                lz0Var = this.i;
                lz0Var.getClass();
            } else {
                lz0Var = null;
            }
            if (z) {
                if (vf3Var.B0.e) {
                    z2 = c(vf3Var, lz0Var);
                }
            } else if (vf3Var.q()) {
                z2 = d(vf3Var, lz0Var);
            }
            e();
        }
        return z2;
    }

    public final void p(vf3 vf3Var) {
        o24 y = vf3Var.y();
        Object[] objArr = y.A;
        int i = y.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var2 = (vf3) objArr[i2];
            if (vf3Var2.r() == tf3.InMeasureBlock || vf3Var2.B0.p.s0.e()) {
                if (mj2.J(vf3Var2)) {
                    q(vf3Var2, true);
                } else {
                    p(vf3Var2);
                }
            }
        }
    }

    public final void q(vf3 vf3Var, boolean z) {
        lz0 lz0Var;
        if (vf3Var.J0) {
            return;
        }
        if (vf3Var == this.a) {
            lz0Var = this.i;
            lz0Var.getClass();
        } else {
            lz0Var = null;
        }
        if (z) {
            c(vf3Var, lz0Var);
        } else {
            d(vf3Var, lz0Var);
        }
    }

    public final boolean r(vf3 vf3Var, boolean z) {
        int i = ov3.a[vf3Var.B0.d.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (!vf3Var.q() || z) {
                        vf3Var.B0.p.p0 = true;
                        if (!vf3Var.J0 && (vf3Var.I() || j(vf3Var))) {
                            vf3 u = vf3Var.u();
                            if (u == null || !u.q()) {
                                this.b.k(vf3Var, j53.Measurement);
                            }
                            if (!this.d) {
                                return true;
                            }
                        }
                    }
                } else {
                    i.c();
                    return false;
                }
            } else {
                this.h.b(new nv3(vf3Var, false, z));
            }
        }
        return false;
    }

    public final void s(long j) {
        boolean b;
        j53 j53Var;
        lz0 lz0Var = this.i;
        if (lz0Var == null) {
            b = false;
        } else {
            b = lz0.b(lz0Var.a, j);
        }
        if (!b) {
            if (this.c) {
                mz2.a("updateRootConstraints called while measuring");
            }
            this.i = new lz0(j);
            vf3 vf3Var = this.a;
            vf3 vf3Var2 = vf3Var.d0;
            zf3 zf3Var = vf3Var.B0;
            if (vf3Var2 != null) {
                zf3Var.e = true;
            }
            zf3Var.p.p0 = true;
            if (vf3Var2 != null) {
                j53Var = j53.LookaheadMeasurement;
            } else {
                j53Var = j53.Measurement;
            }
            this.b.k(vf3Var, j53Var);
        }
    }
}
