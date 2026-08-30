package d2;

import a4.r1;
import f2.b1;
import n2.f1;
import u1.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends b3.o implements a4.i, a4.q {

    /* renamed from: i0  reason: collision with root package name */
    public c f3751i0;

    /* renamed from: j0  reason: collision with root package name */
    public p0 f3752j0;

    /* renamed from: k0  reason: collision with root package name */
    public b1 f3753k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f1 f3754l0 = n2.s.w(null);

    public o(c cVar, p0 p0Var, b1 b1Var) {
        this.f3751i0 = cVar;
        this.f3752j0 = p0Var;
        this.f3753k0 = b1Var;
    }

    @Override // b3.o
    public final void G0() {
        c cVar = this.f3751i0;
        if (cVar.f3719a != null) {
            k1.b.c("Expected textInputModifierNode to be null");
        }
        cVar.f3719a = this;
    }

    @Override // b3.o
    public final void H0() {
        this.f3751i0.k(this);
    }

    @Override // a4.q
    public final void b0(r1 r1Var) {
        this.f3754l0.setValue(r1Var);
    }
}
