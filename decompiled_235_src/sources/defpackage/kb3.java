package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kb3  reason: default package */
/* loaded from: classes.dex */
public final class kb3 extends hb3 {
    public gb3 l0;
    public boolean m0;

    @Override // defpackage.hb3
    public final long R0(x24 x24Var, long j) {
        int u;
        if (this.l0 == gb3.Min) {
            u = x24Var.n(q21.g(j));
        } else {
            u = x24Var.u(q21.g(j));
        }
        if (u < 0) {
            u = 0;
        }
        if (u < 0) {
            r53.a("width must be >= 0");
        }
        return s21.h(u, u, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.hb3
    public final boolean S0() {
        return this.m0;
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0 == gb3.Min) {
            return x24Var.n(i);
        }
        return x24Var.u(i);
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        if (this.l0 == gb3.Min) {
            return x24Var.n(i);
        }
        return x24Var.u(i);
    }
}
