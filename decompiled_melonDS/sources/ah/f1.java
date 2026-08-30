package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 extends ec.j implements mc.t {
    public /* synthetic */ ve.f X;
    public /* synthetic */ yb.j Y;
    public /* synthetic */ ue.a Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ boolean f758b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ int f759c0;

    public f1(cc.c cVar) {
        super(6, cVar);
    }

    @Override // mc.t
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        int intValue = ((Number) obj5).intValue();
        f1 f1Var = new f1((cc.c) obj6);
        f1Var.X = (ve.f) obj;
        f1Var.Y = (yb.j) obj2;
        f1Var.Z = (ue.a) obj3;
        f1Var.f758b0 = booleanValue;
        f1Var.f759c0 = intValue;
        return f1Var.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        ve.n nVar;
        ve.f fVar = this.X;
        yb.j jVar = this.Y;
        ue.a aVar = this.Z;
        boolean z10 = this.f758b0;
        int i2 = this.f759c0;
        dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        if (jVar != null) {
            nVar = (ve.n) jVar.B;
        } else {
            nVar = null;
        }
        if (fVar == null || nVar == null) {
            return null;
        }
        if (fVar.f13802e) {
            i2 = fVar.f13803f;
        }
        return new hh.e1(aVar, i2, z10, fVar.f13801d, nVar);
    }
}
