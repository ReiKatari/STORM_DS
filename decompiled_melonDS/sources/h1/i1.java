package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i2, int i10, cc.c cVar) {
        super(i2, cVar);
        this.X = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((i1) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((i1) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                i1 i1Var = new i1(2, 0, cVar);
                i1Var.Z = obj;
                return i1Var;
            default:
                i1 i1Var2 = new i1(2, 1, cVar);
                i1Var2.Z = obj;
                return i1Var2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        zc.u uVar;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uVar = (zc.u) this.Z;
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    uVar = (zc.u) this.Z;
                }
                while (zc.x.s(uVar.v())) {
                    d1.x1 x1Var = new d1.x1(14);
                    this.Z = uVar;
                    this.Y = 1;
                    cc.g gVar = this.B;
                    gVar.getClass();
                    if (n2.s.t(gVar).a(x1Var, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            default:
                cd.i iVar = (cd.i) this.Z;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                yb.y yVar = yb.y.f14813a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    this.Z = null;
                    this.Y = 1;
                    if (iVar.a(yVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yVar;
        }
    }
}
