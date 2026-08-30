package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public Object Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ h1 f817b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ long f818c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(h1 h1Var, long j2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f817b0 = h1Var;
        this.f818c0 = j2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((x0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((x0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new x0(this.f817b0, this.f818c0, cVar, 0);
            default:
                return new x0(this.f817b0, this.f818c0, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object d4;
        oi.b bVar;
        Object d10;
        oi.b bVar2;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                h1 h1Var = this.f817b0;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            return yb.y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                    d4 = ((yb.l) obj).A;
                } else {
                    p7.j.I(obj);
                    cf.b bVar3 = h1Var.f766e;
                    this.Z = 1;
                    d4 = ((kf.z) bVar3).d(this.f818c0, this);
                    if (d4 == aVar) {
                        return aVar;
                    }
                }
                if (!(d4 instanceof yb.k) && (bVar = (oi.b) d4) != null) {
                    cd.e1 e1Var = h1Var.F;
                    hh.j0 j0Var = new hh.j0(bVar);
                    this.Y = d4;
                    this.Z = 2;
                    if (e1Var.a(j0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Z;
                h1 h1Var2 = this.f817b0;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            p7.j.I(obj);
                            return yb.y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                    d10 = ((yb.l) obj).A;
                } else {
                    p7.j.I(obj);
                    cf.b bVar4 = h1Var2.f766e;
                    this.Z = 1;
                    d10 = ((kf.z) bVar4).d(this.f818c0, this);
                    if (d10 == aVar2) {
                        return aVar2;
                    }
                }
                if (!(d10 instanceof yb.k) && (bVar2 = (oi.b) d10) != null) {
                    cd.e1 e1Var2 = h1Var2.F;
                    hh.n0 n0Var = new hh.n0(bVar2);
                    this.Y = d10;
                    this.Z = 2;
                    if (e1Var2.a(n0Var, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
