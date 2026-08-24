package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb3  reason: default package */
/* loaded from: classes.dex */
public abstract class hb3 extends z64 implements jm3 {
    public final /* synthetic */ int k0;

    public abstract long R0(x24 x24Var, long j);

    public abstract boolean S0();

    public int Z(kz3 kz3Var, x24 x24Var, int i) {
        switch (this.k0) {
            case 0:
                return x24Var.c(i);
            default:
                return x24Var.c(i);
        }
    }

    public f34 c(g34 g34Var, x24 x24Var, long j) {
        long R0 = R0(x24Var, j);
        if (S0()) {
            R0 = s21.e(j, R0);
        }
        dx4 y = x24Var.y(R0);
        return g34Var.K(y.A, y.B, zt1.A, new jv(y, 5));
    }

    @Override // defpackage.jm3
    public int f(kz3 kz3Var, x24 x24Var, int i) {
        switch (this.k0) {
            case 0:
                return x24Var.u(i);
            default:
                return x24Var.u(i);
        }
    }

    public int h0(kz3 kz3Var, x24 x24Var, int i) {
        switch (this.k0) {
            case 0:
                return x24Var.V(i);
            default:
                return x24Var.V(i);
        }
    }

    @Override // defpackage.jm3
    public int s0(kz3 kz3Var, x24 x24Var, int i) {
        switch (this.k0) {
            case 0:
                return x24Var.n(i);
            default:
                return x24Var.n(i);
        }
    }
}
