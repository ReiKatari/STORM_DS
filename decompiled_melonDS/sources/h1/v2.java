package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ mc.q Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ r1 f6020b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ v3.t f6021c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(mc.q qVar, r1 r1Var, v3.t tVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = qVar;
        this.f6020b0 = r1Var;
        this.f6021c0 = tVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((v2) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((v2) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new v2(this.Z, this.f6020b0, this.f6021c0, cVar, 0);
            default:
                return new v2(this.Z, this.f6020b0, this.f6021c0, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    h3.b bVar = new h3.b(this.f6021c0.f13693c);
                    this.Y = 1;
                    if (this.Z.i(this.f6020b0, bVar, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    h3.b bVar2 = new h3.b(this.f6021c0.f13693c);
                    this.Y = 1;
                    if (this.Z.i(this.f6020b0, bVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
