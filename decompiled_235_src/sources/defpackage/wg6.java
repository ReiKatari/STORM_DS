package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg6  reason: default package */
/* loaded from: classes.dex */
final class wg6 extends e74 {
    public final sg6 a;

    public wg6(sg6 sg6Var) {
        this.a = sg6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, yg6] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wg6) && nb3.k(this.a, ((wg6) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        yg6 yg6Var = (yg6) z64Var;
        sg6 sg6Var = yg6Var.k0;
        sg6 sg6Var2 = this.a;
        if (!nb3.k(sg6Var2, sg6Var)) {
            jx2.B(yg6Var, sg6Var2.R);
        }
        yg6Var.k0 = sg6Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ')';
    }
}
