package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx6  reason: default package */
/* loaded from: classes.dex */
public final class qx6 extends e74 {
    public final qn2 a;

    public qx6(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rx6, n83, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? n83Var = new n83(hv.k);
        n83Var.n0 = this.a;
        return n83Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qx6) {
                if (this.a == ((qx6) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        rx6 rx6Var = (rx6) z64Var;
        qn2 qn2Var = rx6Var.n0;
        qn2 qn2Var2 = this.a;
        if (qn2Var != qn2Var2) {
            rx6Var.n0 = qn2Var2;
            dv7 dv7Var = rx6Var.o0;
            if (dv7Var != null) {
                tt7 tt7Var = (tt7) qn2Var2.g(dv7Var);
                if (!nb3.k(tt7Var, rx6Var.m0)) {
                    rx6Var.m0 = tt7Var;
                    rx6Var.S0();
                }
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
