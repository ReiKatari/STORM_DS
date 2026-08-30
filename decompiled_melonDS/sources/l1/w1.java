package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class w1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8642a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8643b;

    public w1(float f8, float f10) {
        this.f8642a = f8;
        this.f8643b = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.x1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8647i0 = this.f8642a;
        oVar.f8648j0 = this.f8643b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (x4.f.b(this.f8642a, w1Var.f8642a) && x4.f.b(this.f8643b, w1Var.f8643b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        x1 x1Var = (x1) oVar;
        x1Var.f8647i0 = this.f8642a;
        x1Var.f8648j0 = this.f8643b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8643b) + (Float.hashCode(this.f8642a) * 31);
    }
}
