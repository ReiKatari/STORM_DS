package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v43  reason: default package */
/* loaded from: classes.dex */
public abstract class v43 extends yy3 implements mf3 {
    public final /* synthetic */ int j0;

    public int H(fs3 fs3Var, mv3 mv3Var, int i) {
        switch (this.j0) {
            case 0:
                return mv3Var.g0(i);
            default:
                return mv3Var.g0(i);
        }
    }

    public abstract long R0(mv3 mv3Var, long j);

    public abstract boolean S0();

    @Override // defpackage.mf3
    public int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        switch (this.j0) {
            case 0:
                return mv3Var.T(i);
            default:
                return mv3Var.T(i);
        }
    }

    public uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        long R0 = R0(mv3Var, j);
        if (S0()) {
            R0 = nz0.e(j, R0);
        }
        yn4 c = mv3Var.c(R0);
        return vv3Var.s0(c.A, c.B, qp1.A, new ru(c, 5));
    }

    @Override // defpackage.mf3
    public int h(fs3 fs3Var, mv3 mv3Var, int i) {
        switch (this.j0) {
            case 0:
                return mv3Var.e0(i);
            default:
                return mv3Var.e0(i);
        }
    }

    public int r(fs3 fs3Var, mv3 mv3Var, int i) {
        switch (this.j0) {
            case 0:
                return mv3Var.f(i);
            default:
                return mv3Var.f(i);
        }
    }
}
