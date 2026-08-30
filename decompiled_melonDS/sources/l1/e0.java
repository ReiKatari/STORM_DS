package l1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f8548a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8549b;

    public e0(c0 c0Var, float f8) {
        this.f8548a = c0Var;
        this.f8549b = f8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.f0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8551i0 = this.f8548a;
        oVar.f8552j0 = this.f8549b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f8548a == e0Var.f8548a && this.f8549b == e0Var.f8549b) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        f0 f0Var = (f0) oVar;
        f0Var.f8551i0 = this.f8548a;
        f0Var.f8552j0 = this.f8549b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8549b) + (this.f8548a.hashCode() * 31);
    }
}
