package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq7  reason: default package */
/* loaded from: classes.dex */
public abstract class rq7 extends gx2 {
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public boolean B0 = false;
    public int C0 = 0;
    public int D0 = 0;
    public final e30 E0 = new Object();
    public p11 F0 = null;

    @Override // defpackage.gx2
    public final void U() {
        for (int i = 0; i < this.u0; i++) {
            l21 l21Var = this.t0[i];
            if (l21Var != null) {
                l21Var.F = true;
            }
        }
    }

    public abstract void V(int i, int i2, int i3, int i4);

    public final void W(l21 l21Var, k21 k21Var, int i, k21 k21Var2, int i2) {
        p11 p11Var;
        l21 l21Var2;
        while (true) {
            p11Var = this.F0;
            if (p11Var != null || (l21Var2 = this.U) == null) {
                break;
            }
            this.F0 = ((m21) l21Var2).x0;
        }
        e30 e30Var = this.E0;
        e30Var.a = k21Var;
        e30Var.b = k21Var2;
        e30Var.c = i;
        e30Var.d = i2;
        p11Var.b(l21Var, e30Var);
        l21Var.P(e30Var.e);
        l21Var.M(e30Var.f);
        l21Var.E = e30Var.h;
        l21Var.J(e30Var.g);
    }
}
