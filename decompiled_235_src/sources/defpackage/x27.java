package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x27  reason: default package */
/* loaded from: classes.dex */
final class x27 extends e74 {
    public final s47 a;

    public x27(s47 s47Var) {
        this.a = s47Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new y27(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        return nb3.k(this.a, ((x27) obj).a);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        y27 y27Var = (y27) z64Var;
        y27Var.getClass();
        s47 N = gi2.N(this.a, nc1.f0(y27Var).v0);
        y27Var.R0(N, (ki2) hf.K(y27Var, ky0.k));
        w27 w27Var = y27Var.m0;
        if (w27Var != null) {
            w27.a(w27Var, null, null, N, 23);
            xk2.w(y27Var);
            return;
        }
        throw lb1.c("Min size state is not set.");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
