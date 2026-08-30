package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 extends nc.l implements mc.l {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ y3.i1 L;
    public final /* synthetic */ l1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, y3.i1 i1Var) {
        super(1);
        this.R = l1Var;
        this.L = i1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        long j2;
        l1 l1Var;
        y3.z zVar;
        h3.b bVar;
        long j10;
        h3.c h2;
        long j11;
        y3.z e6;
        switch (this.B) {
            case 0:
                y3.h1 h1Var = (y3.h1) obj;
                l1 l1Var2 = this.R;
                l1Var2.f2463j0 = true;
                l1Var2.f2462i0 = null;
                f2 d4 = l1Var2.f2464k0.e().f2496c.d();
                boolean h10 = l1Var2.f2464k0.h();
                y3.i1 i1Var = this.L;
                if (!h10) {
                    y3.h1.k(h1Var, i1Var, 0, 0);
                } else if (d4.d()) {
                    b9.e e10 = d4.e();
                    if (e10 != null) {
                        n2.f1 f1Var = (n2.f1) e10.B;
                        n2.f1 f1Var2 = (n2.f1) e10.R;
                        n2.f1 f1Var3 = (n2.f1) e10.L;
                        h3.c c4 = d4.c();
                        if (c4 != null) {
                            long j12 = 0;
                            if (l1Var2.f2464k0.e().f2495b.b()) {
                                y3.z e11 = h1Var.e();
                                if (e11 == null) {
                                    y3.h1.k(h1Var, i1Var, 0, 0);
                                } else {
                                    boolean b10 = l1Var2.f2464k0.e().f2496c.d().b();
                                    long C = l1Var2.P0().C(e11, 0L);
                                    q1 q1Var = l1Var2.f2464k0;
                                    if (!b10) {
                                        j2 = 4294967295L;
                                        l1Var = l1Var2;
                                        z10 = b10;
                                        q1Var.d().a(c4, pc.a.h(h3.b.e(((h3.b) f1Var3.getValue()).f6050a, ((h3.b) f1Var2.getValue()).f6050a), ((h3.e) f1Var.getValue()).f6064a), new j1(0));
                                        zVar = e11;
                                        bVar = null;
                                    } else {
                                        z10 = b10;
                                        j2 = 4294967295L;
                                        l1Var = l1Var2;
                                        zVar = e11;
                                        bVar = null;
                                        q1Var.d().a(c4, pc.a.h(h3.b.e(((h3.b) f1Var3.getValue()).f6050a, ((h3.b) f1Var2.getValue()).f6050a), ((h3.e) f1Var.getValue()).f6064a), null);
                                    }
                                    l1 l1Var3 = l1Var;
                                    h3.c c10 = l1Var3.f2464k0.d().c();
                                    if (c10 != null) {
                                        bVar = new h3.b(h3.b.e(h3.b.d(c10.d(), ((h3.b) f1Var3.getValue()).f6050a), ((h3.b) ((n2.f1) e10.X).getValue()).f6050a));
                                    }
                                    if (!l1Var3.f2464k0.d().b() && z10) {
                                        if (bVar != null) {
                                            j11 = bVar.f6050a;
                                        } else {
                                            j11 = c4.d();
                                        }
                                    } else {
                                        if (bVar != null) {
                                            j10 = bVar.f6050a;
                                        } else {
                                            j10 = C;
                                        }
                                        if (bVar == null) {
                                            h2 = pc.a.h(C, zb.k.T(zVar.Z()));
                                        } else {
                                            h2 = pc.a.h(bVar.f6050a, c10.c());
                                        }
                                        l1Var3.f2464k0.e().f2496c.d().i(h2);
                                        j11 = j10;
                                    }
                                    long d10 = h3.b.d(j11, C);
                                    y3.h1.k(h1Var, i1Var, Math.round(Float.intBitsToFloat((int) (d10 >> 32))), Math.round(Float.intBitsToFloat((int) (d10 & j2))));
                                }
                            } else if (!l1Var2.f2464k0.d().b()) {
                                y3.z e12 = h1Var.e();
                                if (e12 != null) {
                                    j12 = p7.n.u(h3.b.d(c4.d(), l1Var2.P0().C(e12, 0L)));
                                }
                                y3.h1.k(h1Var, i1Var, (int) (j12 >> 32), (int) (j12 & 4294967295L));
                            } else {
                                y3.h1.k(h1Var, i1Var, 0, 0);
                            }
                        } else {
                            fj.j.t(d4, "Match State is configured, but current bounds is null. State = ");
                        }
                    } else {
                        fj.j.t(d4, "Match State is configured, but target data is null. State = ");
                    }
                    return null;
                } else {
                    y3.h1.k(h1Var, i1Var, 0, 0);
                }
                return yb.y.f14813a;
            default:
                y3.h1 h1Var2 = (y3.h1) obj;
                y3.h1.k(h1Var2, this.L, 0, 0);
                l1 l1Var4 = this.R;
                p1 e13 = l1Var4.f2464k0.e();
                q1 q1Var2 = l1Var4.f2464k0;
                h2 h2Var = e13.f2496c;
                h2Var.i();
                if (!nc.k.a(h2Var.d(), i1.f2444a) && q1Var2.h()) {
                    f2 d11 = h2Var.d();
                    if (q1Var2.d().b() && d11.b() && (e6 = h1Var2.e()) != null) {
                        long T = zb.k.T(e6.Z());
                        y1 y1Var = q1Var2.e().f2495b;
                        y3.z zVar2 = q1Var2.e().f2495b.Y;
                        if (zVar2 != null) {
                            long d12 = y1Var.A.d(zVar2, e6);
                            y1 y1Var2 = q1Var2.e().f2495b;
                            y3.z zVar3 = q1Var2.e().f2495b.Y;
                            if (zVar3 != null) {
                                long J = y3.z.J(zVar3, e6, 2);
                                f2 d13 = h2Var.d();
                                p1 p1Var = (p1) h2Var.f2431c;
                                l1 l1Var5 = (l1) h2Var.f2436h;
                                l1Var5.getClass();
                                ((n2.f1) h2Var.f2432d).setValue(d13.a(p1Var, l1Var5, T, d12, J));
                            } else {
                                a0.j.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            }
                        } else {
                            a0.j.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        return null;
                    }
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(y3.i1 i1Var, l1 l1Var) {
        super(1);
        this.L = i1Var;
        this.R = l1Var;
    }
}
