package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ cd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ h1 f803b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(h1 h1Var, cc.c cVar, int i2) {
        super(3, cVar);
        this.X = i2;
        this.f803b0 = h1Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        cd.i iVar = (cd.i) obj;
        Throwable th2 = (Throwable) obj2;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                o0 o0Var = new o0(this.f803b0, cVar, 0);
                o0Var.Z = iVar;
                return o0Var.v(yb.y.f14813a);
            default:
                o0 o0Var2 = new o0(this.f803b0, cVar, 1);
                o0Var2.Z = iVar;
                return o0Var2.v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                cd.i iVar = this.Z;
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
                    l0 e6 = this.f803b0.f768g.e(ve.f.f13797h);
                    this.Z = null;
                    this.Y = 1;
                    if (cd.q.o(iVar, e6, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            default:
                cd.i iVar2 = this.Z;
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
                    dd.k n10 = this.f803b0.n();
                    this.Z = null;
                    this.Y = 1;
                    if (cd.q.o(iVar2, n10, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
