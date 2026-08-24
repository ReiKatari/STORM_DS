package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk4  reason: default package */
/* loaded from: classes.dex */
public final class pk4 extends e74 {
    public final qn2 a;

    public pk4(qn2 qn2Var) {
        this.a = qn2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, rk4] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = true;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        pk4 pk4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof pk4) {
            pk4Var = (pk4) obj;
        } else {
            pk4Var = null;
        }
        if (pk4Var != null && this.a == pk4Var.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        rk4 rk4Var = (rk4) z64Var;
        qn2 qn2Var = rk4Var.k0;
        qn2 qn2Var2 = this.a;
        if (qn2Var != qn2Var2 || !rk4Var.l0) {
            nc1.f0(rk4Var).U(false);
        }
        rk4Var.k0 = qn2Var2;
        rk4Var.l0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
