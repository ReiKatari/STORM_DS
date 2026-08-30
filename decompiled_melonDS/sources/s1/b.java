package s1;

import b3.p;
import f1.a1;
import f1.x0;
import i4.i;
import mc.q;
import n2.l;
import n2.m;
import n2.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements q {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ i R;
    public final /* synthetic */ mc.a X;

    public b(a1 a1Var, boolean z10, boolean z11, i iVar, mc.a aVar) {
        this.A = a1Var;
        this.B = z10;
        this.L = z11;
        this.R = iVar;
        this.X = aVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        ((Number) obj3).intValue();
        r rVar = (r) ((m) obj2);
        rVar.X(-1525724089);
        Object L = rVar.L();
        if (L == l.f9953a) {
            L = new j1.i();
            rVar.h0(L);
        }
        j1.i iVar = (j1.i) L;
        p f8 = x0.a(b3.m.f1770a, iVar, this.A).f(new a(this.B, iVar, null, false, this.L, this.R, this.X));
        rVar.p(false);
        return f8;
    }
}
