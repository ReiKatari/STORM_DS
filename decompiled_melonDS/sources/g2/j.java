package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ec.j implements mc.l {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f5191b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ yb.d f5192c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m7.p pVar, k7.b0 b0Var, mc.p pVar2, cc.c cVar) {
        super(1, cVar);
        this.Z = pVar;
        this.f5191b0 = b0Var;
        this.f5192c0 = (ec.j) pVar2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ec.j, mc.p] */
    @Override // mc.l
    public final Object k(Object obj) {
        cc.c cVar = (cc.c) obj;
        switch (this.X) {
            case 0:
                return new j((n) this.Z, this.f5191b0, (mc.r) this.f5192c0, cVar).v(yb.y.f14813a);
            default:
                return new j((m7.p) this.Z, (k7.b0) this.f5191b0, (mc.p) ((ec.j) this.f5192c0), cVar).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ec.j, mc.p] */
    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                n nVar = (n) this.Z;
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
                    nVar.f5274l.setValue(this.f5191b0);
                    g gVar = new g(nVar, 4);
                    a2.o oVar = new a2.o((mc.r) this.f5192c0, nVar, (cc.c) null, 20);
                    this.Y = 1;
                    if (n0.k(gVar, oVar, this) == aVar) {
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
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Object e6 = ((m7.p) this.Z).e((k7.b0) this.f5191b0, (ec.j) this.f5192c0, this);
                if (e6 == aVar2) {
                    return aVar2;
                }
                return e6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Object obj, mc.r rVar, cc.c cVar) {
        super(1, cVar);
        this.Z = nVar;
        this.f5191b0 = obj;
        this.f5192c0 = rVar;
    }
}
