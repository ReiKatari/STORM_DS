package gk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5798d;

    /* renamed from: e  reason: collision with root package name */
    public final g f5799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(q0 q0Var, pi.x xVar, n nVar, g gVar, int i2) {
        super(q0Var, xVar, nVar);
        this.f5798d = i2;
        this.f5799e = gVar;
    }

    @Override // gk.t
    public final Object a(a0 a0Var, Object[] objArr) {
        int i2 = this.f5798d;
        g gVar = this.f5799e;
        switch (i2) {
            case 0:
                return gVar.d(a0Var);
            default:
                e eVar = (e) gVar.d(a0Var);
                cc.c cVar = (cc.c) objArr[objArr.length - 1];
                try {
                    zc.h hVar = new zc.h(1, pc.a.A(cVar));
                    hVar.v();
                    hVar.x(new v(eVar, 2));
                    eVar.d(new w(hVar, 2));
                    Object u4 = hVar.u();
                    dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                    return u4;
                } catch (Exception e6) {
                    return y0.q(e6, cVar);
                }
        }
    }
}
