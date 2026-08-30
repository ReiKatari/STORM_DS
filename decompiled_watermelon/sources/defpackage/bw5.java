package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bw5  reason: default package */
/* loaded from: classes.dex */
public final class bw5 extends yy3 implements mf3, gz5 {
    public fw5 j0;
    public boolean k0;

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        if (!this.k0) {
            i = Preference.DEFAULT_ORDER;
        }
        return mv3Var.g0(i);
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0) {
            i = Preference.DEFAULT_ORDER;
        }
        return mv3Var.T(i);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        jf4 jf4Var;
        int g;
        mi2 mi2Var;
        int i;
        int i2;
        if (this.k0) {
            jf4Var = jf4.Vertical;
        } else {
            jf4Var = jf4.Horizontal;
        }
        n40.D(j, jf4Var);
        boolean z = this.k0;
        int i3 = Preference.DEFAULT_ORDER;
        if (z) {
            g = Integer.MAX_VALUE;
        } else {
            g = lz0.g(j);
        }
        if (this.k0) {
            i3 = lz0.h(j);
        }
        yn4 c = mv3Var.c(lz0.a(j, 0, i3, 0, g, 5));
        int i4 = c.A;
        int h = lz0.h(j);
        if (i4 > h) {
            i4 = h;
        }
        int i5 = c.B;
        int g2 = lz0.g(j);
        if (i5 > g2) {
            i5 = g2;
        }
        int i6 = c.B - i5;
        int i7 = c.A - i4;
        if (!this.k0) {
            i6 = i7;
        }
        fw5 fw5Var = this.j0;
        qj4 qj4Var = fw5Var.e;
        qj4 qj4Var2 = fw5Var.a;
        qj4Var.i(i6);
        ga6 z2 = io2.z();
        if (z2 != null) {
            mi2Var = z2.e();
        } else {
            mi2Var = null;
        }
        ga6 Y = io2.Y(z2);
        try {
            if (qj4Var2.h() > i6) {
                qj4Var2.i(i6);
            }
            io2.l0(z2, Y, mi2Var);
            fw5 fw5Var2 = this.j0;
            if (this.k0) {
                i = i5;
            } else {
                i = i4;
            }
            fw5Var2.b.i(i);
            fw5 fw5Var3 = this.j0;
            if (this.k0) {
                i2 = c.B;
            } else {
                i2 = c.A;
            }
            fw5Var3.c.i(i2);
            return vv3Var.s0(i4, i5, qp1.A, new lq1(i6, 3, this, c));
        } catch (Throwable th) {
            io2.l0(z2, Y, mi2Var);
            throw th;
        }
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        if (this.k0) {
            i = Preference.DEFAULT_ORDER;
        }
        return mv3Var.e0(i);
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        l93[] l93VarArr = pz5.a;
        qz5 qz5Var = mz5.n;
        l93[] l93VarArr2 = pz5.a;
        l93 l93Var = l93VarArr2[6];
        rz5Var.b(qz5Var, Boolean.TRUE);
        rv5 rv5Var = new rv5(new ki2(this) { // from class: aw5
            public final /* synthetic */ bw5 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int h;
                int i = r2;
                bw5 bw5Var = this.B;
                switch (i) {
                    case 0:
                        h = bw5Var.j0.a.h();
                        break;
                    default:
                        h = bw5Var.j0.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new ki2(this) { // from class: aw5
            public final /* synthetic */ bw5 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int h;
                int i = r2;
                bw5 bw5Var = this.B;
                switch (i) {
                    case 0:
                        h = bw5Var.j0.a.h();
                        break;
                    default:
                        h = bw5Var.j0.e.h();
                        break;
                }
                return Float.valueOf(h);
            }
        });
        if (this.k0) {
            qz5 qz5Var2 = mz5.w;
            l93 l93Var2 = l93VarArr2[13];
            rz5Var.b(qz5Var2, rv5Var);
            return;
        }
        qz5 qz5Var3 = mz5.v;
        l93 l93Var3 = l93VarArr2[12];
        rz5Var.b(qz5Var3, rv5Var);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        if (!this.k0) {
            i = Preference.DEFAULT_ORDER;
        }
        return mv3Var.f(i);
    }
}
