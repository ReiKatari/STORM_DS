package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f202a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f204c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f205d;

    /* renamed from: i  reason: collision with root package name */
    public x4.a f210i;

    /* renamed from: b  reason: collision with root package name */
    public final n f203b = new n();

    /* renamed from: e  reason: collision with root package name */
    public final a0.g f206e = new a0.g(4);

    /* renamed from: f  reason: collision with root package name */
    public final p2.b f207f = new p2.b(new o0[16]);

    /* renamed from: g  reason: collision with root package name */
    public final long f208g = 1;

    /* renamed from: h  reason: collision with root package name */
    public final p2.b f209h = new p2.b(new d1[16]);

    public f1(o0 o0Var) {
        this.f202a = o0Var;
    }

    public static boolean b(o0 o0Var, x4.a aVar) {
        x4.a aVar2;
        boolean E0;
        o0 o0Var2 = o0Var.f280d0;
        t0 t0Var = o0Var.B0;
        if (o0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (o0Var2 != null) {
                c1 c1Var = t0Var.f349q;
                c1Var.getClass();
                E0 = c1Var.E0(aVar.f14337a);
            }
            E0 = false;
        } else {
            c1 c1Var2 = t0Var.f349q;
            if (c1Var2 != null) {
                aVar2 = c1Var2.f167h0;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && o0Var2 != null) {
                c1Var2.getClass();
                E0 = c1Var2.E0(aVar2.f14337a);
            }
            E0 = false;
        }
        o0 u4 = o0Var.u();
        if (E0 && u4 != null) {
            if (u4.f280d0 == null) {
                o0.X(u4, false, 3);
                return E0;
            } else if (o0Var.s() == k0.InMeasureBlock) {
                o0.V(u4, false, 3);
                return E0;
            } else if (o0Var.s() == k0.InLayoutBlock) {
                u4.U(false);
            }
        }
        return E0;
    }

    public static boolean c(o0 o0Var, x4.a aVar) {
        boolean Q;
        if (aVar != null) {
            Q = o0Var.P(aVar);
        } else {
            Q = o0.Q(o0Var);
        }
        o0 u4 = o0Var.u();
        if (Q && u4 != null) {
            if (o0Var.r() == k0.InMeasureBlock) {
                o0.X(u4, false, 3);
                return Q;
            } else if (o0Var.r() == k0.InLayoutBlock) {
                u4.W(false);
            }
        }
        return Q;
    }

    public static boolean h(o0 o0Var) {
        c1 c1Var;
        p0 p0Var;
        if (o0Var.B0.f338e) {
            if (o0Var.s() != k0.NotUsed || ((c1Var = o0Var.B0.f349q) != null && (p0Var = c1Var.f171l0) != null && p0Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean i(o0 o0Var) {
        i0 i0Var;
        if (o0Var.q()) {
            do {
                if (o0Var.r() == k0.NotUsed && !o0Var.B0.f348p.f236r0.e()) {
                    o0 u4 = o0Var.u();
                    if (u4 != null) {
                        i0Var = u4.B0.f337d;
                    } else {
                        i0Var = null;
                    }
                    if (i0Var != i0.Measuring) {
                        return false;
                    }
                }
                o0Var = o0Var.u();
                if (o0Var == null) {
                    return false;
                }
            } while (!o0Var.I());
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r4 < r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            a0.g r1 = r7.f206e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.B
            p2.b r8 = (p2.b) r8
            a4.o0 r2 = r7.f202a
            int r3 = r2.I0
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.H0 = r0
        L17:
            java.lang.Object r8 = r1.B
            p2.b r8 = (p2.b) r8
            int r2 = r8.L
            if (r2 == 0) goto L62
            a4.z1 r3 = a4.z1.f377b
            java.lang.Object[] r4 = r8.A
            r5 = 0
            java.util.Arrays.sort(r4, r5, r2, r3)
            int r2 = r8.L
            java.lang.Object r3 = r1.L
            a4.o0[] r3 = (a4.o0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            a4.o0[] r3 = new a4.o0[r3]
        L3a:
            r4 = 0
            r1.L = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.A
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            r8.getClass()
            boolean r0 = r8.H0
            if (r0 == 0) goto L5b
            a0.g.j(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.L = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f1.a(boolean):void");
    }

    public final void d() {
        p2.b bVar = this.f209h;
        int i2 = bVar.L;
        if (i2 != 0) {
            Object[] objArr = bVar.A;
            for (int i10 = 0; i10 < i2; i10++) {
                d1 d1Var = (d1) objArr[i10];
                if (d1Var.f182a.H()) {
                    boolean z10 = d1Var.f183b;
                    o0 o0Var = d1Var.f182a;
                    boolean z11 = d1Var.f184c;
                    if (!z10) {
                        o0.X(o0Var, z11, 2);
                    } else {
                        o0.V(o0Var, z11, 2);
                    }
                }
            }
            bVar.g();
        }
    }

    public final void e(o0 o0Var) {
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (nc.k.a(o0Var2.J(), Boolean.TRUE) && !o0Var2.J0) {
                if (this.f203b.m(o0Var2)) {
                    o0Var2.K();
                }
                e(o0Var2);
            }
        }
    }

    public final void f(o0 o0Var, boolean z10) {
        boolean q10;
        if (!this.f204c) {
            x3.a.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10) {
            q10 = o0Var.B0.f338e;
        } else {
            q10 = o0Var.q();
        }
        if (q10) {
            x3.a.a("node not yet measured");
        }
        g(o0Var, z10);
    }

    public final void g(o0 o0Var, boolean z10) {
        boolean q10;
        c1 c1Var;
        p0 p0Var;
        boolean q11;
        boolean q12;
        p2.b z11 = o0Var.z();
        Object[] objArr = z11.A;
        int i2 = z11.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if ((!z10 && (o0Var2.r() == k0.InMeasureBlock || o0Var2.B0.f348p.f236r0.e())) || (z10 && (o0Var2.s() == k0.InMeasureBlock || ((c1Var = o0Var2.B0.f349q) != null && (p0Var = c1Var.f171l0) != null && p0Var.e())))) {
                boolean o5 = l.o(o0Var2);
                t0 t0Var = o0Var2.B0;
                if (o5 && !z10) {
                    if (t0Var.f338e && this.f203b.m(o0Var2)) {
                        m(o0Var2, true, false);
                    } else {
                        f(o0Var2, true);
                    }
                }
                if (z10) {
                    q11 = t0Var.f338e;
                } else {
                    q11 = o0Var2.q();
                }
                if (q11) {
                    m(o0Var2, z10, false);
                }
                if (z10) {
                    q12 = t0Var.f338e;
                } else {
                    q12 = o0Var2.q();
                }
                if (!q12) {
                    g(o0Var2, z10);
                }
            }
        }
        if (z10) {
            q10 = o0Var.B0.f338e;
        } else {
            q10 = o0Var.q();
        }
        if (q10) {
            m(o0Var, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final boolean j(b4.s sVar) {
        boolean z10;
        b3.o oVar;
        int i2;
        boolean z11;
        o0 o0Var;
        boolean z12;
        n nVar = this.f203b;
        o0 o0Var2 = this.f202a;
        if (!o0Var2.H()) {
            x3.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!o0Var2.I()) {
            x3.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f204c) {
            x3.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z13 = false;
        if (this.f210i != null) {
            this.f204c = true;
            this.f205d = true;
            try {
                boolean y10 = nVar.y();
                a0.b bVar = (a0.b) nVar.B;
                if (y10) {
                    z10 = false;
                    while (true) {
                        a0.b bVar2 = (a0.b) nVar.R;
                        a0.b bVar3 = (a0.b) nVar.L;
                        if (!((m2) bVar.B).isEmpty()) {
                            o0Var = (o0) ((m2) bVar.B).first();
                            bVar.W(o0Var);
                            if (o0Var.f280d0 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11 = false;
                        } else if (!((m2) bVar3.B).isEmpty()) {
                            o0Var = (o0) ((m2) bVar3.B).first();
                            bVar3.W(o0Var);
                            if (o0Var.f280d0 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z11 = true;
                        } else if (((m2) bVar2.B).isEmpty()) {
                            break;
                        } else {
                            o0 o0Var3 = (o0) ((m2) bVar2.B).first();
                            bVar2.W(o0Var3);
                            z11 = true;
                            o0Var = o0Var3;
                            z12 = false;
                        }
                        boolean m = m(o0Var, z12, z11);
                        if (!z11) {
                            if (o0Var.B0.f339f) {
                                nVar.j(o0Var, x.LookaheadPlacement);
                            }
                            if (o0Var.p()) {
                                nVar.j(o0Var, x.Placement);
                            }
                        }
                        if (o0Var == o0Var2 && m) {
                            z10 = true;
                        }
                    }
                    if (sVar != null) {
                        sVar.b();
                    }
                } else {
                    z10 = false;
                }
            } finally {
            }
        } else {
            z10 = false;
        }
        p2.b bVar4 = this.f207f;
        Object[] objArr = bVar4.A;
        int i10 = bVar4.L;
        int i11 = 0;
        while (i11 < i10) {
            n1 n1Var = ((o0) objArr[i11]).A0;
            v vVar = n1Var.f265c;
            int i12 = 4194304;
            boolean g10 = s1.g(4194304);
            if (g10) {
                oVar = vVar.N0;
            } else {
                oVar = vVar.N0.X;
                if (oVar == null) {
                    i11++;
                    z13 = false;
                }
            }
            i3.k0 k0Var = r1.I0;
            b3.o Z0 = vVar.Z0(g10);
            boolean z14 = z13;
            while (Z0 != null && (Z0.R & i12) != 0) {
                if ((Z0.L & i12) != 0) {
                    b3.o oVar2 = Z0;
                    p2.b bVar5 = null;
                    boolean z15 = z14;
                    while (oVar2 != null) {
                        if (oVar2 instanceof z) {
                            ((z) oVar2).s(n1Var.f265c);
                        } else if ((oVar2.L & i12) != 0 && (oVar2 instanceof k)) {
                            b3.o oVar3 = ((k) oVar2).f247j0;
                            int i13 = z15;
                            while (oVar3 != null) {
                                int i14 = i12;
                                if ((oVar3.L & i14) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (bVar5 == null) {
                                            bVar5 = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            bVar5.b(oVar2);
                                            oVar2 = null;
                                        }
                                        bVar5.b(oVar3);
                                    }
                                }
                                oVar3 = oVar3.Y;
                                i12 = i14;
                                i13 = i13;
                            }
                            i2 = i12;
                            if (i13 == 1) {
                                i12 = i2;
                                z15 = false;
                            }
                            oVar2 = l.e(bVar5);
                            i12 = i2;
                            z15 = false;
                        }
                        i2 = i12;
                        oVar2 = l.e(bVar5);
                        i12 = i2;
                        z15 = false;
                    }
                }
                int i15 = i12;
                if (Z0 != oVar) {
                    Z0 = Z0.Y;
                    i12 = i15;
                    z14 = false;
                }
            }
            i11++;
            z13 = false;
        }
        bVar4.g();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [a4.o0, java.lang.Object] */
    public final void k(o0 o0Var, long j2) {
        b3.o oVar;
        if (o0Var.J0) {
            return;
        }
        o0 o0Var2 = this.f202a;
        if (o0Var.equals(o0Var2)) {
            x3.a.a("measureAndLayout called on root");
        }
        if (!o0Var2.H()) {
            x3.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!o0Var2.I()) {
            x3.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f204c) {
            x3.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z10 = false;
        if (this.f210i != null) {
            this.f204c = true;
            this.f205d = false;
            try {
                n nVar = this.f203b;
                ((a0.b) nVar.B).W(o0Var);
                ((a0.b) nVar.L).W(o0Var);
                ((a0.b) nVar.R).W(o0Var);
                if ((b(o0Var, new x4.a(j2)) || o0Var.B0.f339f) && nc.k.a(o0Var.J(), Boolean.TRUE)) {
                    o0Var.K();
                }
                e(o0Var);
                c(o0Var, new x4.a(j2));
                if (o0Var.p() && o0Var.I()) {
                    o0Var.T();
                    a0.g gVar = this.f206e;
                    gVar.getClass();
                    if (o0Var.I0 > 0) {
                        ((p2.b) gVar.B).b(o0Var);
                        o0Var.H0 = true;
                    }
                }
                d();
            } finally {
            }
        }
        p2.b bVar = this.f207f;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        int i10 = 0;
        while (i10 < i2) {
            n1 n1Var = ((o0) objArr[i10]).A0;
            v vVar = n1Var.f265c;
            boolean g10 = s1.g(4194304);
            if (g10) {
                oVar = vVar.N0;
            } else {
                oVar = vVar.N0.X;
                if (oVar == null) {
                    i10++;
                    z10 = false;
                }
            }
            i3.k0 k0Var = r1.I0;
            b3.o Z0 = vVar.Z0(g10);
            while (Z0 != null && (Z0.R & 4194304) != 0) {
                if ((Z0.L & 4194304) != 0) {
                    b3.o oVar2 = Z0;
                    p2.b bVar2 = null;
                    while (oVar2 != null) {
                        if (oVar2 instanceof z) {
                            ((z) oVar2).s(n1Var.f265c);
                        } else if ((oVar2.L & 4194304) != 0 && (oVar2 instanceof k)) {
                            b3.o oVar3 = ((k) oVar2).f247j0;
                            ?? r15 = z10;
                            while (oVar3 != null) {
                                if ((oVar3.L & 4194304) != 0) {
                                    r15++;
                                    if (r15 == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (bVar2 == null) {
                                            bVar2 = new p2.b(new b3.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            bVar2.b(oVar2);
                                            oVar2 = null;
                                        }
                                        bVar2.b(oVar3);
                                    }
                                }
                                oVar3 = oVar3.Y;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z10 = false;
                            }
                        }
                        oVar2 = l.e(bVar2);
                        z10 = false;
                    }
                }
                if (Z0 != oVar) {
                    Z0 = Z0.Y;
                    z10 = false;
                }
            }
            i10++;
            z10 = false;
        }
        bVar.g();
    }

    public final void l() {
        n nVar = this.f203b;
        if (nVar.y()) {
            o0 o0Var = this.f202a;
            if (!o0Var.H()) {
                x3.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!o0Var.I()) {
                x3.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f204c) {
                x3.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f210i != null) {
                this.f204c = true;
                this.f205d = false;
                try {
                    if (!((m2) ((a0.b) nVar.R).B).isEmpty() && !((m2) ((a0.b) nVar.B).B).isEmpty()) {
                        if (o0Var.f280d0 != null) {
                            o(o0Var, true);
                        } else {
                            n(o0Var);
                        }
                    }
                    o(o0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f204c = false;
                        this.f205d = false;
                    }
                }
            }
        }
    }

    public final boolean m(o0 o0Var, boolean z10, boolean z11) {
        x4.a aVar;
        boolean z12;
        y3.h1 placementScope;
        v vVar;
        o0 u4;
        c1 c1Var;
        p0 p0Var;
        boolean z13 = o0Var.J0;
        t0 t0Var = o0Var.B0;
        boolean z14 = false;
        if (z13 || (!o0Var.I() && !t0Var.f348p.f233n0 && !i(o0Var) && !nc.k.a(o0Var.J(), Boolean.TRUE) && !h(o0Var) && !t0Var.f348p.f236r0.e() && ((c1Var = t0Var.f349q) == null || (p0Var = c1Var.f171l0) == null || !p0Var.e()))) {
            return false;
        }
        o0 o0Var2 = this.f202a;
        if (o0Var == o0Var2) {
            aVar = this.f210i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z10) {
            if (t0Var.f338e) {
                z14 = b(o0Var, aVar);
            }
            if (z11 && ((z14 || t0Var.f339f) && nc.k.a(o0Var.J(), Boolean.TRUE))) {
                o0Var.K();
            }
        } else {
            if (o0Var.q()) {
                z12 = c(o0Var, aVar);
            } else {
                z12 = false;
            }
            if (z11 && o0Var.p() && (o0Var == o0Var2 || ((u4 = o0Var.u()) != null && u4.I() && t0Var.f348p.f233n0))) {
                if (o0Var == o0Var2) {
                    if (o0Var.f299x0 == k0.NotUsed) {
                        o0Var.f();
                    }
                    o0 u10 = o0Var.u();
                    if (u10 == null || (vVar = u10.A0.f265c) == null || (placementScope = vVar.f363f0) == null) {
                        placementScope = ((b4.x) s0.a(o0Var)).getPlacementScope();
                    }
                    y3.h1.n(placementScope, t0Var.f348p, 0, 0);
                } else {
                    o0Var.T();
                }
                a0.g gVar = this.f206e;
                gVar.getClass();
                if (o0Var.I0 > 0) {
                    ((p2.b) gVar.B).b(o0Var);
                    o0Var.H0 = true;
                }
            }
            z14 = z12;
        }
        d();
        return z14;
    }

    public final void n(o0 o0Var) {
        p2.b z10 = o0Var.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (o0Var2.r() == k0.InMeasureBlock || o0Var2.B0.f348p.f236r0.e()) {
                if (l.o(o0Var2)) {
                    o(o0Var2, true);
                } else {
                    n(o0Var2);
                }
            }
        }
    }

    public final void o(o0 o0Var, boolean z10) {
        x4.a aVar;
        if (o0Var.J0) {
            return;
        }
        if (o0Var == this.f202a) {
            aVar = this.f210i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z10) {
            b(o0Var, aVar);
        } else {
            c(o0Var, aVar);
        }
    }

    public final boolean p(o0 o0Var, boolean z10) {
        int i2 = e1.f193a[o0Var.B0.f337d.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    if (!o0Var.q() || z10) {
                        o0Var.B0.f348p.f234o0 = true;
                        if (!o0Var.J0 && (o0Var.I() || i(o0Var))) {
                            o0 u4 = o0Var.u();
                            if (u4 == null || !u4.q()) {
                                this.f203b.j(o0Var, x.Measurement);
                            }
                            if (!this.f205d) {
                                return true;
                            }
                        }
                    }
                } else {
                    m9.o.o();
                    return false;
                }
            } else {
                this.f209h.b(new d1(o0Var, false, z10));
            }
        }
        return false;
    }

    public final void q(long j2) {
        boolean b10;
        x xVar;
        x4.a aVar = this.f210i;
        if (aVar == null) {
            b10 = false;
        } else {
            b10 = x4.a.b(aVar.f14337a, j2);
        }
        if (!b10) {
            if (this.f204c) {
                x3.a.a("updateRootConstraints called while measuring");
            }
            this.f210i = new x4.a(j2);
            o0 o0Var = this.f202a;
            o0 o0Var2 = o0Var.f280d0;
            t0 t0Var = o0Var.B0;
            if (o0Var2 != null) {
                t0Var.f338e = true;
            }
            t0Var.f348p.f234o0 = true;
            if (o0Var2 != null) {
                xVar = x.LookaheadMeasurement;
            } else {
                xVar = x.Measurement;
            }
            this.f203b.j(o0Var, xVar);
        }
    }
}
