package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k56  reason: default package */
/* loaded from: classes.dex */
final class k56 extends dz3 {
    public final g56 a;

    public k56(g56 g56Var) {
        this.a = g56Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, l56] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k56) && b53.x(this.a, ((k56) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        l56 l56Var = (l56) yy3Var;
        g56 g56Var = l56Var.j0;
        g56 g56Var2 = this.a;
        if (!b53.x(g56Var2, g56Var)) {
            nk2.Q(l56Var, g56Var2.R);
        }
        l56Var.j0 = g56Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ')';
    }
}
