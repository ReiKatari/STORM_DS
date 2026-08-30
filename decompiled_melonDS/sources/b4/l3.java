package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l3 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ n3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(n3 n3Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = n3Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((l3) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((l3) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new l3(this.Z, cVar, 0);
            default:
                return new l3(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                yb.y yVar = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    x xVar = this.Z.A;
                    this.Y = 1;
                    Object l10 = xVar.f1995v0.l(this);
                    if (l10 != aVar) {
                        l10 = yVar;
                    }
                    if (l10 == aVar) {
                        return aVar;
                    }
                }
                return yVar;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                yb.y yVar2 = yb.y.f14813a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    x xVar2 = this.Z.A;
                    this.Y = 1;
                    Object a10 = xVar2.f1997w0.a(this);
                    if (a10 != aVar2) {
                        a10 = yVar2;
                    }
                    if (a10 == aVar2) {
                        return aVar2;
                    }
                }
                return yVar2;
        }
    }
}
