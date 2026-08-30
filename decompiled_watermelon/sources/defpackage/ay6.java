package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ay6  reason: default package */
/* loaded from: classes.dex */
final class ay6 extends dz3 {
    public final qj3 a;

    public ay6(qj3 qj3Var) {
        this.a = qj3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, by6] */
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
        if ((obj instanceof ay6) && b53.x(this.a, ((ay6) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((by6) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
