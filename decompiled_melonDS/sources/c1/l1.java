package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 extends b3.o implements a4.p, z3.c, a4.x1, a4.a0 {

    /* renamed from: i0  reason: collision with root package name */
    public h3.c f2462i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f2463j0;

    /* renamed from: k0  reason: collision with root package name */
    public q1 f2464k0;

    /* renamed from: l0  reason: collision with root package name */
    public l3.b f2465l0;

    /* renamed from: m0  reason: collision with root package name */
    public final z3.d f2466m0;

    public l1(q1 q1Var) {
        this.f2464k0 = q1Var;
        this.f2465l0 = (l3.b) q1Var.f2512g0.getValue();
        z3.d dVar = new z3.d(n1.f2479a);
        dVar.f14960c.setValue(q1Var);
        this.f2466m0 = dVar;
    }

    @Override // b3.o
    public final void G0() {
        a4.l.p(this, this.f2464k0.e().f2502i);
        R0();
        this.f2464k0.A.setValue(Boolean.TRUE);
    }

    @Override // b3.o
    public final void H0() {
        this.f2462i0 = pc.a.h(h3.b.d(a4.l.s(this).a0(0L), P0().a0(0L)), zb.k.T(a4.l.s(this).L));
        Q0(null);
        q1 q1Var = this.f2464k0;
        q1Var.f2510e0 = null;
        q1Var.f2511f0 = null;
        q1Var.A.setValue(Boolean.FALSE);
        this.f2463j0 = false;
    }

    @Override // b3.o
    public final void I0() {
        this.f2462i0 = null;
        l3.b bVar = this.f2465l0;
        if (bVar != null) {
            ((b4.x) a4.l.u(this)).getGraphicsContext().a(bVar);
        }
        Q0(((b4.x) a4.l.u(this)).getGraphicsContext().b());
    }

    @Override // a4.x1
    public final void J() {
        this.f2464k0.e().b();
        a4.l.p(this, this.f2464k0.e().f2502i);
    }

    public final y3.w0 O0(y3.g gVar, y3.u0 u0Var, long j2) {
        long j10;
        boolean z10;
        h3.c c4 = this.f2464k0.d().c();
        if (c4 == null) {
            h2 h2Var = this.f2464k0.e().f2496c;
            h2Var.i();
            c4 = h2Var.d().f((p1) h2Var.f2431c);
        }
        if (c4 != null) {
            long I = zb.k.I(c4.c());
            int i2 = (int) (I >> 32);
            int i10 = (int) (I & 4294967295L);
            if (i2 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
                boolean z11 = false;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i2 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= 0) {
                    z11 = true;
                }
                if (!(z11 & z10)) {
                    x4.i.a("width and height must be >= 0");
                }
                j2 = x4.b.h(i2, i2, i10, i10);
            } else {
                StringBuilder sb2 = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb2.append(this.f2464k0.d().c());
                a0.j.n(sb2, ", current bounds: ", this.f2464k0.e().f2496c.d().c());
                return null;
            }
        }
        y3.i1 e6 = u0Var.e(j2);
        if (this.f2464k0.e().f2496c.d().d()) {
            j10 = this.f2464k0.e().f2495b.A.a(a4.l.s(this)).Z();
            int i11 = e6.A;
            int i12 = e6.B;
            ((v1) this.f2464k0.Y.getValue()).getClass();
        } else {
            j10 = (e6.A << 32) | (e6.B & 4294967295L);
        }
        return gVar.u0((int) (j10 >> 32), (int) (j10 & 4294967295L), zb.r.A, new k1(this, e6));
    }

    public final y3.z P0() {
        y3.z zVar = this.f2464k0.e().f2495b.X;
        if (zVar != null) {
            return zVar;
        }
        a0.j.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void Q0(l3.b bVar) {
        if (bVar == null) {
            l3.b bVar2 = this.f2465l0;
            if (bVar2 != null) {
                ((b4.x) a4.l.u(this)).getGraphicsContext().a(bVar2);
            }
        } else {
            this.f2464k0.f2512g0.setValue(bVar);
        }
        this.f2465l0 = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nc.l, mc.a] */
    public final void R0() {
        Object b10;
        a4.n1 n1Var;
        rd.k kVar = n1.f2479a;
        q1 q1Var = this.f2464k0;
        z3.a aVar = z3.a.f14958b;
        z3.d dVar = this.f2466m0;
        if (dVar == aVar) {
            x3.a.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!dVar.m(kVar)) {
            x3.a.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + kVar + " was not found.");
        }
        if (kVar != dVar.f14959b) {
            x3.a.c("Check failed.");
        }
        dVar.f14960c.setValue(q1Var);
        q1 q1Var2 = this.f2464k0;
        if (!this.A.f1777h0) {
            x3.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.A.f1777h0) {
            x3.a.c("visitAncestors called on an unattached node");
        }
        b3.o oVar = this.A.X;
        a4.o0 t5 = a4.l.t(this);
        loop0: while (true) {
            if (t5 != null) {
                if ((t5.A0.f268f.R & 32) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 32) != 0) {
                            b3.o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof z3.c) {
                                    z3.c cVar = (z3.c) oVar2;
                                    if (cVar.g().m(kVar)) {
                                        b10 = cVar.g().x(kVar);
                                        break loop0;
                                    }
                                } else if ((oVar2.L & 32) != 0 && (oVar2 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (b3.o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = a4.l.e(bVar);
                            }
                            continue;
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar = n1Var.f267e;
                } else {
                    oVar = null;
                }
            } else {
                b10 = ((nc.l) kVar.B).b();
                break;
            }
        }
        q1Var2.f2510e0 = (q1) b10;
        Q0(((b4.x) a4.l.u(this)).getGraphicsContext().b());
        this.f2463j0 = false;
        this.f2464k0.f2511f0 = this;
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        y3.i1 e6 = u0Var.e(j2);
        return x0Var.u0(e6.A, e6.B, zb.r.A, new k1(e6, this));
    }

    @Override // z3.c
    public final p7.j g() {
        return this.f2466m0;
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        w1 w1Var;
        h3.c c4 = this.f2464k0.e().f2496c.d().c();
        q1 q1Var = this.f2464k0;
        i3.h hVar = null;
        if (q1Var.g() && c4 != null) {
            r0Var.getLayoutDirection();
            x4.c cVar = a4.l.t(this).f295t0;
            ((z1) this.f2464k0.f2507b0.getValue()).getClass();
            q1 q1Var2 = (q1) ((w1) this.f2464k0.f2508c0.getValue()).f2545c.getValue();
            if (q1Var2 != null) {
                q1 q1Var3 = q1Var2.f2510e0;
                if (q1Var3 != null) {
                    w1Var = (w1) q1Var3.f2508c0.getValue();
                } else {
                    w1Var = null;
                }
                if (w1Var != null) {
                    q1 q1Var4 = (q1) w1Var.f2545c.getValue();
                    if (q1Var4 != null) {
                        hVar = q1Var4.f2509d0;
                    } else {
                        a0.j.h("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                        return;
                    }
                }
            } else {
                a0.j.h("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
        }
        q1Var.f2509d0 = hVar;
        l3.b bVar = (l3.b) this.f2464k0.f2512g0.getValue();
        if (bVar != null) {
            g gVar = new g(4, r0Var);
            long c10 = r0Var.A.c();
            bVar.e(r0Var, r0Var.getLayoutDirection(), (((int) Float.intBitsToFloat((int) (c10 >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (c10 & 4294967295L))) & 4294967295L), new a4.q0(r0Var, r0Var.B, gVar, 0));
            q1 q1Var5 = this.f2464k0;
            if (q1Var5.e().f2496c.d().d() && (q1Var5.g() || !q1Var5.f())) {
                return;
            }
            k0.d.t(r0Var, bVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb2.append((Object) this.f2464k0.e().f2494a);
        boolean b10 = this.f2464k0.d().b();
        boolean z10 = this.f1777h0;
        sb2.append(",target: ");
        sb2.append(b10);
        sb2.append(", is attached: ");
        sb2.append(z10);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
