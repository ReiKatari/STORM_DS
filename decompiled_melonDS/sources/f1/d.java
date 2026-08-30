package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ec.j implements mc.p {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ j1.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ j1.k f4529b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j1.i iVar, j1.k kVar, cc.c cVar) {
        super(2, cVar);
        this.Z = iVar;
        this.f4529b0 = kVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((d) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((d) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new d(this.f4529b0, this.Z, cVar);
            default:
                return new d(this.Z, this.f4529b0, cVar);
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
                    j1.l lVar = new j1.l(this.f4529b0);
                    this.Y = 1;
                    if (this.Z.a(lVar, this) == aVar) {
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
                    this.Y = 1;
                    if (this.Z.a(this.f4529b0, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j1.k kVar, j1.i iVar, cc.c cVar) {
        super(2, cVar);
        this.f4529b0 = kVar;
        this.Z = iVar;
    }
}
