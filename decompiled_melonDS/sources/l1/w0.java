package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8640a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8641b;

    public w0(float f8, boolean z10) {
        this.f8640a = f8;
        this.f8641b = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l1.x0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f8645i0 = this.f8640a;
        oVar.f8646j0 = this.f8641b;
        return oVar;
    }

    public final boolean equals(Object obj) {
        w0 w0Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0Var = (w0) obj;
        } else {
            w0Var = null;
        }
        if (w0Var != null && this.f8640a == w0Var.f8640a && this.f8641b == w0Var.f8641b) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        x0 x0Var = (x0) oVar;
        x0Var.f8645i0 = this.f8640a;
        x0Var.f8646j0 = this.f8641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8641b) + (Float.hashCode(this.f8640a) * 31);
    }
}
