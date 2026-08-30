package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements mc.q {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ i4.i L;
    public final /* synthetic */ mc.a R;

    public x(a1 a1Var, boolean z10, i4.i iVar, mc.a aVar) {
        this.A = a1Var;
        this.B = z10;
        this.L = iVar;
        this.R = aVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        b3.p pVar = (b3.p) obj;
        ((Number) obj3).intValue();
        n2.r rVar = (n2.r) ((n2.m) obj2);
        rVar.X(-1525724089);
        Object L = rVar.L();
        if (L == n2.l.f9953a) {
            L = new j1.i();
            rVar.h0(L);
        }
        j1.i iVar = (j1.i) L;
        b3.p f8 = x0.a(b3.m.f1770a, iVar, this.A).f(new w(iVar, null, false, this.B, null, this.L, this.R));
        rVar.p(false);
        return f8;
    }
}
