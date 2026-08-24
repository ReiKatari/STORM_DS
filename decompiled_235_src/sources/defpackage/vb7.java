package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb7  reason: default package */
/* loaded from: classes.dex */
final class vb7 extends e74 {
    public final pq3 a;

    public vb7(pq3 pq3Var) {
        this.a = pq3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, wb7] */
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
        if ((obj instanceof vb7) && nb3.k(this.a, ((vb7) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((wb7) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
