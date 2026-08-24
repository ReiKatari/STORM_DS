package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx2  reason: default package */
/* loaded from: classes.dex */
final class cx2 extends e74 {
    public final s47 a;
    public final int b;
    public final int c;

    public cx2(s47 s47Var, int i, int i2) {
        this.a = s47Var;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, ex2] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.o0 = -1;
        z64Var.p0 = -1;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cx2) {
                cx2 cx2Var = (cx2) obj;
                if (!nb3.k(this.a, cx2Var.a) || this.b != cx2Var.b || this.c != cx2Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ex2 ex2Var = (ex2) z64Var;
        s47 s47Var = ex2Var.k0;
        s47 s47Var2 = this.a;
        boolean k = nb3.k(s47Var, s47Var2);
        int i = this.b;
        int i2 = this.c;
        if (k && ex2Var.l0 == i && ex2Var.m0 == i2) {
            return;
        }
        ex2Var.k0 = s47Var2;
        ex2Var.l0 = i;
        ex2Var.m0 = i2;
        ex2Var.q0 = gi2.N(s47Var2, nc1.f0(ex2Var).v0);
        ex2Var.n0 = true;
        xk2.w(ex2Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
