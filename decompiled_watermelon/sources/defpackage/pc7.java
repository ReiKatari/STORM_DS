package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pc7  reason: default package */
/* loaded from: classes.dex */
public abstract class pc7 extends fr2 {
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public boolean B0 = false;
    public int C0 = 0;
    public int D0 = 0;
    public final k10 E0 = new Object();
    public ky0 F0 = null;

    @Override // defpackage.fr2
    public final void U() {
        for (int i = 0; i < this.u0; i++) {
            gz0 gz0Var = this.t0[i];
            if (gz0Var != null) {
                gz0Var.F = true;
            }
        }
    }

    public abstract void V(int i, int i2, int i3, int i4);

    public final void W(gz0 gz0Var, fz0 fz0Var, int i, fz0 fz0Var2, int i2) {
        ky0 ky0Var;
        gz0 gz0Var2;
        while (true) {
            ky0Var = this.F0;
            if (ky0Var != null || (gz0Var2 = this.U) == null) {
                break;
            }
            this.F0 = ((hz0) gz0Var2).x0;
        }
        k10 k10Var = this.E0;
        k10Var.a = fz0Var;
        k10Var.b = fz0Var2;
        k10Var.c = i;
        k10Var.d = i2;
        ky0Var.b(gz0Var, k10Var);
        gz0Var.P(k10Var.e);
        gz0Var.M(k10Var.f);
        gz0Var.E = k10Var.h;
        gz0Var.J(k10Var.g);
    }
}
