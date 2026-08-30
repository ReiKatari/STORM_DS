package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final q1 f2470a;

    public m1(q1 q1Var) {
        this.f2470a = q1Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new l1(this.f2470a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m1) || !this.f2470a.equals(((m1) obj).f2470a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        l1 l1Var = (l1) oVar;
        q1 q1Var = l1Var.f2464k0;
        q1 q1Var2 = this.f2470a;
        if (!q1Var2.equals(q1Var)) {
            l1Var.f2464k0.A.setValue(Boolean.FALSE);
            l1Var.f2464k0 = q1Var2;
            q1Var2.A.setValue(Boolean.valueOf(l1Var.f1777h0));
            if (l1Var.f1777h0) {
                l1Var.R0();
            }
        }
    }

    public final int hashCode() {
        return this.f2470a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f2470a + ')';
    }
}
