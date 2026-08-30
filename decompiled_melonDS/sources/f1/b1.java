package f1;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final f2.g1 f4522a;

    /* renamed from: b  reason: collision with root package name */
    public final f2.e1 f4523b;

    /* renamed from: c  reason: collision with root package name */
    public final o1 f4524c;

    public b1(f2.g1 g1Var, f2.e1 e1Var, o1 o1Var) {
        this.f4522a = g1Var;
        this.f4523b = e1Var;
        this.f4524c = o1Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new d1(this.f4522a, this.f4523b, this.f4524c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        d1 d1Var = (d1) oVar;
        d1Var.getClass();
        o1 o1Var = d1Var.f4533k0;
        View view = d1Var.f4534l0;
        x4.c cVar = d1Var.f4535m0;
        d1Var.f4531i0 = this.f4522a;
        d1Var.f4532j0 = this.f4523b;
        o1 o1Var2 = this.f4524c;
        d1Var.f4533k0 = o1Var2;
        View v10 = a4.l.v(d1Var);
        x4.c cVar2 = a4.l.t(d1Var).f295t0;
        if (d1Var.f4536n0 != null) {
            i4.w wVar = e1.f4542a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !o1Var2.a()) || !x4.f.b(Float.NaN, Float.NaN) || !x4.f.b(Float.NaN, Float.NaN) || !o1Var2.equals(o1Var) || !v10.equals(view) || !nc.k.a(cVar2, cVar)) {
                d1Var.P0();
            }
        }
        d1Var.Q0();
    }

    public final int hashCode() {
        int e6 = w.d.e(w.d.b(Float.NaN, w.d.b(Float.NaN, w.d.f(9205357640488583168L, w.d.e(w.d.b(Float.NaN, this.f4522a.hashCode() * 961, 31), true, 31), 31), 31), 31), true, 31);
        return this.f4524c.hashCode() + ((this.f4523b.hashCode() + e6) * 31);
    }
}
