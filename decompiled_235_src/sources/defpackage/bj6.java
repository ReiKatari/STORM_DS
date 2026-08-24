package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj6  reason: default package */
/* loaded from: classes.dex */
public final class bj6 extends hb3 {
    public io6 l0;
    public long m0;
    public long n0;
    public boolean o0;
    public final vs4 p0;

    public bj6(io6 io6Var) {
        super(1);
        this.l0 = io6Var;
        this.m0 = -9223372034707292160L;
        this.n0 = s21.b(0, 0, 0, 0, 15);
        this.p0 = np2.Y(null);
    }

    @Override // defpackage.z64
    public final void J0() {
        this.m0 = -9223372034707292160L;
        this.o0 = false;
    }

    @Override // defpackage.z64
    public final void L0() {
        this.p0.setValue(null);
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        long j2;
        dx4 y;
        long j3;
        char c;
        long j4;
        zi6 zi6Var;
        long d;
        zi6 zi6Var2;
        boolean z = true;
        if (g34Var.a0()) {
            this.n0 = j;
            this.o0 = true;
            y = x24Var.y(j);
        } else {
            if (this.o0) {
                j2 = this.n0;
            } else {
                j2 = j;
            }
            y = x24Var.y(j2);
        }
        dx4 dx4Var = y;
        long j5 = (dx4Var.B & 4294967295L) | (dx4Var.A << 32);
        if (g34Var.a0()) {
            this.m0 = j5;
            c = ' ';
            d = j5;
            j4 = d;
        } else {
            if (!q93.b(this.m0, -9223372034707292160L)) {
                j3 = this.m0;
            } else {
                j3 = j5;
            }
            vs4 vs4Var = this.p0;
            zi6 zi6Var3 = (zi6) vs4Var.getValue();
            if (zi6Var3 != null) {
                gn gnVar = zi6Var3.a;
                c = ' ';
                j4 = j5;
                z = (q93.b(j3, ((q93) gnVar.d()).a) || ((Boolean) gnVar.d.getValue()).booleanValue()) ? false : false;
                if (q93.b(j3, ((q93) gnVar.e.getValue()).a) && !z) {
                    zi6Var2 = zi6Var3;
                } else {
                    zi6Var3.b = ((q93) gnVar.d()).a;
                    zi6Var2 = zi6Var3;
                    hv.L(F0(), null, null, new wk0(zi6Var2, j3, this, null), 3);
                }
                zi6Var = zi6Var2;
            } else {
                long j6 = j3;
                c = ' ';
                j4 = j5;
                zi6Var = new zi6(new gn(new q93(j6), nw7.l0, new q93(4294967297L), 8), j6);
            }
            vs4Var.setValue(zi6Var);
            d = s21.d(j, ((q93) zi6Var.a.d()).a);
        }
        int i = (int) (d >> c);
        int i2 = (int) (d & 4294967295L);
        return g34Var.K(i, i2, zt1.A, new aj6(this, j4, i, i2, g34Var, dx4Var));
    }
}
