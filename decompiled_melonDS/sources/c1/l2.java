package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l2 extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f2467b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ b3.o f2468c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(k2 k2Var, long j2, n2 n2Var, cc.c cVar) {
        super(2, cVar);
        this.f2467b0 = k2Var;
        this.Z = j2;
        this.f2468c0 = n2Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((l2) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((l2) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new l2((k2) this.f2467b0, this.Z, (n2) this.f2468c0, cVar);
            default:
                l2 l2Var = new l2((h1.o0) this.f2468c0, this.Z, cVar);
                l2Var.f2467b0 = obj;
                return l2Var;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object d4;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        long j2 = this.Z;
        b3.o oVar = this.f2468c0;
        switch (i2) {
            case 0:
                n2 n2Var = (n2) oVar;
                k2 k2Var = (k2) this.f2467b0;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                        d4 = obj;
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    d1.c cVar = k2Var.f2456a;
                    x4.l lVar = new x4.l(j2);
                    d1.a1 a1Var = n2Var.f2480j0;
                    this.Y = 1;
                    d4 = d1.c.d(cVar, lVar, a1Var, null, this, 12);
                    if (d4 == aVar) {
                        return aVar;
                    }
                }
                d1.g gVar = ((d1.h) d4).f3573b;
                d1.g gVar2 = d1.g.BoundReached;
                return yVar;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                mc.q qVar = ((h1.o0) oVar).F0;
                h3.b bVar = new h3.b(j2);
                this.Y = 1;
                if (qVar.i((zc.u) this.f2467b0, bVar, this) == aVar2) {
                    return aVar2;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(h1.o0 o0Var, long j2, cc.c cVar) {
        super(2, cVar);
        this.f2468c0 = o0Var;
        this.Z = j2;
    }
}
