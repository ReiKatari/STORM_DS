package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m76  reason: default package */
/* loaded from: classes.dex */
public final class m76 extends v43 {
    public sc6 k0;
    public long l0;
    public long m0;
    public boolean n0;
    public final tj4 o0;

    public m76(sc6 sc6Var) {
        super(1);
        this.k0 = sc6Var;
        this.l0 = -9223372034707292160L;
        this.m0 = nz0.b(0, 0, 0, 0, 15);
        this.o0 = me2.G(null);
    }

    @Override // defpackage.yy3
    public final void J0() {
        this.l0 = -9223372034707292160L;
        this.n0 = false;
    }

    @Override // defpackage.yy3
    public final void L0() {
        this.o0.setValue(null);
    }

    @Override // defpackage.v43, defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        long j2;
        yn4 c;
        long j3;
        char c2;
        long j4;
        k76 k76Var;
        long d;
        k76 k76Var2;
        boolean z = true;
        if (vv3Var.w()) {
            this.m0 = j;
            this.n0 = true;
            c = mv3Var.c(j);
        } else {
            if (this.n0) {
                j2 = this.m0;
            } else {
                j2 = j;
            }
            c = mv3Var.c(j2);
        }
        yn4 yn4Var = c;
        long j5 = (yn4Var.B & 4294967295L) | (yn4Var.A << 32);
        if (vv3Var.w()) {
            this.l0 = j5;
            c2 = ' ';
            d = j5;
            j4 = d;
        } else {
            if (!i33.b(this.l0, -9223372034707292160L)) {
                j3 = this.l0;
            } else {
                j3 = j5;
            }
            tj4 tj4Var = this.o0;
            k76 k76Var3 = (k76) tj4Var.getValue();
            if (k76Var3 != null) {
                um umVar = k76Var3.a;
                c2 = ' ';
                j4 = j5;
                z = (i33.b(j3, ((i33) umVar.d()).a) || ((Boolean) umVar.d.getValue()).booleanValue()) ? false : false;
                if (i33.b(j3, ((i33) umVar.e.getValue()).a) && !z) {
                    k76Var2 = k76Var3;
                } else {
                    k76Var3.b = ((i33) umVar.d()).a;
                    k76Var2 = k76Var3;
                    tq5.w(F0(), null, null, new oi0(k76Var2, j3, this, null), 3);
                }
                k76Var = k76Var2;
            } else {
                long j6 = j3;
                c2 = ' ';
                j4 = j5;
                k76Var = new k76(new um(new i33(j6), dt3.n0, new i33(4294967297L), 8), j6);
            }
            tj4Var.setValue(k76Var);
            d = nz0.d(j, ((i33) k76Var.a.d()).a);
        }
        int i = (int) (d >> c2);
        int i2 = (int) (d & 4294967295L);
        return vv3Var.s0(i, i2, qp1.A, new l76(this, j4, i, i2, vv3Var, yn4Var));
    }
}
