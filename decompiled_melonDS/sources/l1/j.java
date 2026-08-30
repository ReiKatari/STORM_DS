package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends a4.j1 {
    /* JADX WARN: Type inference failed for: r0v0, types: [l1.k, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8579i0 = 1.0f;
        return oVar;
    }

    public final boolean equals(Object obj) {
        j jVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            jVar = (j) obj;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return false;
        }
        ((j) obj).getClass();
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((k) oVar).f8579i0 = 1.0f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }
}
