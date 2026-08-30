package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends ec.j implements mc.p {
    public /* synthetic */ Object X;
    public final /* synthetic */ v3.w Y;
    public final /* synthetic */ v0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ f2.b1 f13465b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v3.w wVar, v0 v0Var, f2.b1 b1Var, cc.c cVar) {
        super(2, cVar);
        this.Y = wVar;
        this.Z = v0Var;
        this.f13465b0 = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        yb.y yVar = yb.y.f14813a;
        ((z) t(cVar, (zc.u) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        z zVar = new z(this.Y, this.Z, this.f13465b0, cVar);
        zVar.X = obj;
        return zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        zc.u uVar = (zc.u) this.X;
        zc.w wVar = zc.w.UNDISPATCHED;
        v0 v0Var = this.Z;
        v3.w wVar2 = this.Y;
        zc.x.v(uVar, null, wVar, new y(wVar2, v0Var, null, 0), 1);
        zc.x.v(uVar, null, wVar, new mh.m(wVar2, this.f13465b0, null, 12), 1);
        return yb.y.f14813a;
    }
}
