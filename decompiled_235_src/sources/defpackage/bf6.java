package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bf6  reason: default package */
/* loaded from: classes.dex */
public final class bf6 extends aj3 implements qn2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ dx4 L;
    public final /* synthetic */ cf6 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf6(cf6 cf6Var, dx4 dx4Var) {
        super(1);
        this.R = cf6Var;
        this.L = dx4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j;
        long j2;
        char c;
        long j3;
        long j4;
        of5 b;
        long j5;
        jk3 d;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        cf6 cf6Var = this.R;
        dx4 dx4Var = this.L;
        jk4 jk4Var = null;
        switch (i) {
            case 0:
                cx4 cx4Var = (cx4) obj;
                cf6Var.l0 = true;
                cf6Var.k0 = null;
                zg6 d2 = cf6Var.m0.e().c.d();
                if (!cf6Var.m0.h()) {
                    cx4.j(cx4Var, dx4Var, 0, 0);
                    return jg7Var;
                } else if (d2.d()) {
                    eb e = d2.e();
                    if (e != null) {
                        of5 c2 = d2.c();
                        if (c2 != null) {
                            long j6 = 0;
                            if (cf6Var.m0.e().b.a()) {
                                jk3 d3 = cx4Var.d();
                                if (d3 == null) {
                                    cx4.j(cx4Var, dx4Var, 0, 0);
                                    return jg7Var;
                                }
                                boolean b2 = cf6Var.m0.e().c.d().b();
                                long J = cf6Var.S0().J(d3, 0L);
                                kn2.L(e);
                                if6 if6Var = cf6Var.m0;
                                if (!b2) {
                                    j = 4294967295L;
                                    if6Var.d().a(c2, kn2.L(e), new af6(0));
                                } else {
                                    j = 4294967295L;
                                    if6Var.d().a(c2, kn2.L(e), null);
                                }
                                of5 c3 = cf6Var.m0.d().c();
                                if (c3 != null) {
                                    j2 = J;
                                    c = ' ';
                                    jk4Var = new jk4(jk4.f(jk4.e(c3.d(), ((jk4) ((vs4) e.L).getValue()).a), ((jk4) ((vs4) e.X).getValue()).a));
                                } else {
                                    j2 = J;
                                    c = ' ';
                                }
                                if (!cf6Var.m0.d().b() && b2) {
                                    if (jk4Var != null) {
                                        j5 = jk4Var.a;
                                    } else {
                                        j5 = c2.d();
                                    }
                                    j4 = j2;
                                } else {
                                    if (jk4Var != null) {
                                        j3 = jk4Var.a;
                                    } else {
                                        j3 = j2;
                                    }
                                    if (jk4Var == null) {
                                        j4 = j2;
                                        b = kj2.b(j4, qo2.S(d3.m()));
                                    } else {
                                        j4 = j2;
                                        b = kj2.b(jk4Var.a, c3.c());
                                    }
                                    cf6Var.m0.e().c.d().i(b);
                                    j5 = j3;
                                }
                                long e2 = jk4.e(j5, j4);
                                cx4.j(cx4Var, dx4Var, Math.round(Float.intBitsToFloat((int) (e2 >> c))), Math.round(Float.intBitsToFloat((int) (e2 & j))));
                                return jg7Var;
                            } else if (!cf6Var.m0.d().b()) {
                                jk3 d4 = cx4Var.d();
                                if (d4 != null) {
                                    j6 = kn2.a0(jk4.e(c2.d(), cf6Var.S0().J(d4, 0L)));
                                }
                                cx4.j(cx4Var, dx4Var, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                                return jg7Var;
                            } else {
                                cx4.j(cx4Var, dx4Var, 0, 0);
                                return jg7Var;
                            }
                        }
                        u34.w(d2, "Match State is configured, but current bounds is null. State = ");
                    } else {
                        u34.w(d2, "Match State is configured, but target data is null. State = ");
                    }
                    return null;
                } else {
                    cx4.j(cx4Var, dx4Var, 0, 0);
                    return jg7Var;
                }
            default:
                cx4 cx4Var2 = (cx4) obj;
                cx4.j(cx4Var2, dx4Var, 0, 0);
                gf6 e3 = cf6Var.m0.e();
                if6 if6Var2 = cf6Var.m0;
                mg5 mg5Var = e3.c;
                mg5Var.i();
                if (!nb3.k(mg5Var.d(), rf4.a) && if6Var2.h()) {
                    zg6 d5 = mg5Var.d();
                    if (if6Var2.d().b() && d5.b() && (d = cx4Var2.d()) != null) {
                        long S = qo2.S(d.m());
                        sg6 sg6Var = if6Var2.e().b;
                        jk3 jk3Var = if6Var2.e().b.Y;
                        if (jk3Var != null) {
                            long c4 = sg6Var.A.c(jk3Var, d);
                            sg6 sg6Var2 = if6Var2.e().b;
                            jk3 jk3Var2 = if6Var2.e().b.Y;
                            if (jk3Var2 != null) {
                                long i2 = jk3.i(jk3Var2, d, 2);
                                zg6 d6 = mg5Var.d();
                                gf6 gf6Var = (gf6) mg5Var.c;
                                cf6 cf6Var2 = (cf6) mg5Var.g;
                                cf6Var2.getClass();
                                ((vs4) mg5Var.d).setValue(d6.a(gf6Var, cf6Var2, S, c4, i2));
                                return jg7Var;
                            }
                            i.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        } else {
                            i.h("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        return null;
                    }
                    return jg7Var;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf6(dx4 dx4Var, cf6 cf6Var) {
        super(1);
        this.L = dx4Var;
        this.R = cf6Var;
    }
}
