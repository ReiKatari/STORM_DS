package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p36  reason: default package */
/* loaded from: classes.dex */
public final class p36 extends ic3 implements mi2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ yn4 L;
    public final /* synthetic */ q36 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p36(q36 q36Var, yn4 yn4Var) {
        super(1);
        this.R = q36Var;
        this.L = yn4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j;
        long j2;
        char c;
        long j3;
        long j4;
        y55 b;
        long j5;
        rd3 e;
        int i = this.B;
        o27 o27Var = o27.a;
        q36 q36Var = this.R;
        yn4 yn4Var = this.L;
        mb4 mb4Var = null;
        switch (i) {
            case 0:
                xn4 xn4Var = (xn4) obj;
                q36Var.k0 = true;
                q36Var.j0 = null;
                m56 d = q36Var.l0.e().c.d();
                if (!q36Var.l0.h()) {
                    xn4.k(xn4Var, yn4Var, 0, 0);
                    return o27Var;
                } else if (d.d()) {
                    q9 e2 = d.e();
                    if (e2 != null) {
                        y55 c2 = d.c();
                        if (c2 != null) {
                            long j6 = 0;
                            if (q36Var.l0.e().b.b()) {
                                rd3 e3 = xn4Var.e();
                                if (e3 == null) {
                                    xn4.k(xn4Var, yn4Var, 0, 0);
                                    return o27Var;
                                }
                                boolean b2 = q36Var.l0.e().c.d().b();
                                long y = q36Var.S0().y(e3, 0L);
                                sn2.A(e2);
                                w36 w36Var = q36Var.l0;
                                if (!b2) {
                                    j = 4294967295L;
                                    w36Var.d().a(c2, sn2.A(e2), new o36(0));
                                } else {
                                    j = 4294967295L;
                                    w36Var.d().a(c2, sn2.A(e2), null);
                                }
                                y55 c3 = q36Var.l0.d().c();
                                if (c3 != null) {
                                    j2 = y;
                                    c = ' ';
                                    mb4Var = new mb4(mb4.e(mb4.d(c3.d(), ((mb4) ((tj4) e2.L).getValue()).a), ((mb4) ((tj4) e2.X).getValue()).a));
                                } else {
                                    j2 = y;
                                    c = ' ';
                                }
                                if (!q36Var.l0.d().b() && b2) {
                                    if (mb4Var != null) {
                                        j5 = mb4Var.a;
                                    } else {
                                        j5 = c2.d();
                                    }
                                    j4 = j2;
                                } else {
                                    if (mb4Var != null) {
                                        j3 = mb4Var.a;
                                    } else {
                                        j3 = j2;
                                    }
                                    if (mb4Var == null) {
                                        j4 = j2;
                                        b = yf2.b(j4, hk2.U(e3.O()));
                                    } else {
                                        j4 = j2;
                                        b = yf2.b(mb4Var.a, c3.c());
                                    }
                                    q36Var.l0.e().c.d().i(b);
                                    j5 = j3;
                                }
                                long d2 = mb4.d(j5, j4);
                                xn4.k(xn4Var, yn4Var, Math.round(Float.intBitsToFloat((int) (d2 >> c))), Math.round(Float.intBitsToFloat((int) (d2 & j))));
                                return o27Var;
                            } else if (!q36Var.l0.d().b()) {
                                rd3 e4 = xn4Var.e();
                                if (e4 != null) {
                                    j6 = mj2.P(mb4.d(c2.d(), q36Var.S0().y(e4, 0L)));
                                }
                                xn4.k(xn4Var, yn4Var, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                                return o27Var;
                            } else {
                                xn4.k(xn4Var, yn4Var, 0, 0);
                                return o27Var;
                            }
                        }
                        c44.u(d, "Match State is configured, but current bounds is null. State = ");
                    } else {
                        c44.u(d, "Match State is configured, but target data is null. State = ");
                    }
                    return null;
                } else {
                    xn4.k(xn4Var, yn4Var, 0, 0);
                    return o27Var;
                }
            default:
                xn4 xn4Var2 = (xn4) obj;
                xn4.k(xn4Var2, yn4Var, 0, 0);
                u36 e5 = q36Var.l0.e();
                w36 w36Var2 = q36Var.l0;
                w65 w65Var = e5.c;
                w65Var.i();
                if (!b53.x(w65Var.d(), c74.a) && w36Var2.h()) {
                    m56 d3 = w65Var.d();
                    if (w36Var2.d().b() && d3.b() && (e = xn4Var2.e()) != null) {
                        long U = hk2.U(e.O());
                        g56 g56Var = w36Var2.e().b;
                        rd3 rd3Var = w36Var2.e().b.Y;
                        if (rd3Var != null) {
                            long c4 = g56Var.A.c(rd3Var, e);
                            g56 g56Var2 = w36Var2.e().b;
                            rd3 rd3Var2 = w36Var2.e().b.Y;
                            if (rd3Var2 != null) {
                                long s = rd3.s(rd3Var2, e, 2);
                                m56 d4 = w65Var.d();
                                u36 u36Var = (u36) w65Var.c;
                                q36 q36Var2 = (q36) w65Var.g;
                                q36Var2.getClass();
                                ((tj4) w65Var.d).setValue(d4.a(u36Var, q36Var2, U, c4, s));
                                return o27Var;
                            }
                            i.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        } else {
                            i.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        return null;
                    }
                    return o27Var;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p36(yn4 yn4Var, q36 q36Var) {
        super(1);
        this.L = yn4Var;
        this.R = q36Var;
    }
}
