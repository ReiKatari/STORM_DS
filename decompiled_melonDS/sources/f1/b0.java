package f1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.i f4520a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.a f4521b;

    public b0(j1.i iVar, mc.a aVar) {
        this.f4520a = iVar;
        this.f4521b = aVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new e0(this.f4520a, this.f4521b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (nc.k.a(this.f4520a, b0Var.f4520a) && this.f4521b == b0Var.f4521b) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        boolean z10;
        v3.h0 h0Var;
        e0 e0Var = (e0) oVar;
        e0Var.getClass();
        if (!e0Var.p0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e0Var.c1(this.f4520a, null, false, true, null, null, this.f4521b);
        if (z10 && (h0Var = e0Var.f4555t0) != null) {
            h0Var.Q0();
        }
    }

    public final int hashCode() {
        int i2;
        j1.i iVar = this.f4520a;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        return Boolean.hashCode(true) + ((this.f4521b.hashCode() + w.d.e(w.d.e(i2 * 961, false, 31), true, 29791)) * 923521);
    }
}
