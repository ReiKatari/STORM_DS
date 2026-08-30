package c1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j2 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final d1.a1 f2449a;

    public j2(d1.a1 a1Var) {
        this.f2449a = a1Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new n2(this.f2449a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j2) && ((j2) obj).f2449a.equals(this.f2449a)) {
            b3.h hVar = b3.c.A;
            if (hVar.equals(hVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        ((n2) oVar).f2480j0 = this.f2449a;
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f2449a.hashCode() * 31)) * 31;
    }
}
