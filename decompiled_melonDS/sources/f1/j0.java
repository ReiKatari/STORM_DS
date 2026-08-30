package f1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.i f4599a;

    public j0(j1.i iVar) {
        this.f4599a = iVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new l0(this.f4599a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        if (nc.k.a(this.f4599a, ((j0) obj).f4599a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((l0) oVar).T0(this.f4599a);
    }

    public final int hashCode() {
        j1.i iVar = this.f4599a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }
}
