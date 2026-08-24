package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n76  reason: default package */
/* loaded from: classes.dex */
public final class n76 extends z64 implements jm3, va6 {
    public s76 k0;
    public boolean l0;

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        fg3[] fg3VarArr = eb6.a;
        fb6 fb6Var = bb6.n;
        fg3[] fg3VarArr2 = eb6.a;
        fg3 fg3Var = fg3VarArr2[6];
        gb6Var.a(fb6Var, Boolean.TRUE);
        e76 e76Var = new e76(new on2(this) { // from class: m76
            public final /* synthetic */ n76 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int h;
                int i = r2;
                n76 n76Var = this.B;
                switch (i) {
                    case 0:
                        h = n76Var.k0.a.h();
                        break;
                    default:
                        h = n76Var.k0.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new on2(this) { // from class: m76
            public final /* synthetic */ n76 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int h;
                int i = r2;
                n76 n76Var = this.B;
                switch (i) {
                    case 0:
                        h = n76Var.k0.a.h();
                        break;
                    default:
                        h = n76Var.k0.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.l0) {
            fb6 fb6Var2 = bb6.w;
            fg3 fg3Var2 = fg3VarArr2[13];
            gb6Var.a(fb6Var2, e76Var);
            return;
        }
        fb6 fb6Var3 = bb6.v;
        fg3 fg3Var3 = fg3VarArr2[12];
        gb6Var.a(fb6Var3, e76Var);
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        if (!this.l0) {
            i = Integer.MAX_VALUE;
        }
        return x24Var.c(i);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        lo4 lo4Var;
        int g;
        qn2 qn2Var;
        int i;
        int i2;
        if (this.l0) {
            lo4Var = lo4.Vertical;
        } else {
            lo4Var = lo4.Horizontal;
        }
        mb3.s(j, lo4Var);
        int i3 = Integer.MAX_VALUE;
        if (this.l0) {
            g = Integer.MAX_VALUE;
        } else {
            g = q21.g(j);
        }
        if (this.l0) {
            i3 = q21.h(j);
        }
        dx4 y = x24Var.y(q21.a(j, 0, i3, 0, g, 5));
        int i4 = y.A;
        int h = q21.h(j);
        if (i4 > h) {
            i4 = h;
        }
        int i5 = y.B;
        int g2 = q21.g(j);
        if (i5 > g2) {
            i5 = g2;
        }
        int i6 = y.B - i5;
        int i7 = y.A - i4;
        if (!this.l0) {
            i6 = i7;
        }
        s76 s76Var = this.k0;
        ss4 ss4Var = s76Var.e;
        ss4 ss4Var2 = s76Var.a;
        ss4Var.i(i6);
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            if (ss4Var2.h() > i6) {
                ss4Var2.i(i6);
            }
            ln2.V(t, N, qn2Var);
            s76 s76Var2 = this.k0;
            if (this.l0) {
                i = i5;
            } else {
                i = i4;
            }
            s76Var2.b.i(i);
            s76 s76Var3 = this.k0;
            if (this.l0) {
                i2 = y.B;
            } else {
                i2 = y.A;
            }
            s76Var3.c.i(i2);
            return g34Var.K(i4, i5, zt1.A, new zu1(this, i6, 3, y));
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0) {
            i = Integer.MAX_VALUE;
        }
        return x24Var.u(i);
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        if (!this.l0) {
            i = Integer.MAX_VALUE;
        }
        return x24Var.V(i);
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0) {
            i = Integer.MAX_VALUE;
        }
        return x24Var.n(i);
    }
}
