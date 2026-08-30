package g2;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ec.j implements mc.q {
    public final /* synthetic */ int X = 1;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Serializable f5228b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a0.g gVar, mc.p pVar, cc.c cVar) {
        super(3, cVar);
        this.Z = gVar;
        this.f5228b0 = (ec.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[], java.io.Serializable] */
    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                k kVar = (k) obj;
                g2 g2Var = (g2) obj2;
                return new l((a0.g) this.Z, (ec.j) this.f5228b0, (cc.c) obj3).v(yb.y.f14813a);
            default:
                l lVar = new l(3, (cc.c) obj3);
                lVar.Z = (cd.i) obj;
                lVar.f5228b0 = (Object[]) obj2;
                return lVar.v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ec.j, mc.p] */
    @Override // ec.a
    public final Object v(Object obj) {
        t8.c cVar;
        t8.c cVar2;
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
                    ?? r12 = (ec.j) this.f5228b0;
                    this.Y = 1;
                    if (r12.j((m) ((a0.g) this.Z).B, this) == aVar) {
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
                    cd.i iVar = (cd.i) this.Z;
                    t8.c[] cVarArr = (t8.c[]) ((Object[]) this.f5228b0);
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        cVar = t8.a.f13135a;
                        if (i11 < length) {
                            cVar2 = cVarArr[i11];
                            if (nc.k.a(cVar2, cVar)) {
                                i11++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.Y = 1;
                    if (iVar.a(cVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ l(int i2, cc.c cVar) {
        super(i2, cVar);
    }
}
