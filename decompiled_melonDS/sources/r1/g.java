package r1;

import a4.n0;
import a4.r1;
import ec.j;
import h1.x2;
import mc.p;
import mh.m;
import yb.y;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends j implements p {
    public /* synthetic */ Object X;
    public final /* synthetic */ h Y;
    public final /* synthetic */ r1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ n0 f12610b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ ai.p f12611c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, r1 r1Var, n0 n0Var, ai.p pVar, cc.c cVar) {
        super(2, cVar);
        this.Y = hVar;
        this.Z = r1Var;
        this.f12610b0 = n0Var;
        this.f12611c0 = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((g) t((cc.c) obj2, (u) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        g gVar = new g(this.Y, this.Z, this.f12610b0, this.f12611c0, cVar);
        gVar.X = obj;
        return gVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        u uVar = (u) this.X;
        n0 n0Var = this.f12610b0;
        h hVar = this.Y;
        x.v(uVar, null, null, new x2(hVar, this.Z, n0Var, null, 19), 3);
        return x.v(uVar, null, null, new m(hVar, this.f12611c0, null, 6), 3);
    }
}
