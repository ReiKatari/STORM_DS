package gi;

import cd.q1;
import ec.j;
import kf.z;
import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ e Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = eVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((c) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((c) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new c(this.Z, cVar, 0);
            default:
                return new c(this.Z, cVar, 1);
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
                    this.Y = 1;
                    if (e.e(this.Z, this) == aVar) {
                        return aVar;
                    }
                }
                return y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                e eVar = this.Z;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cf.b bVar = eVar.f5673b;
                    this.Y = 1;
                    if (((z) bVar).m(this) == aVar2) {
                        return aVar2;
                    }
                }
                q1 q1Var = eVar.f5674c;
                ei.b bVar2 = ei.b.f4502a;
                q1Var.getClass();
                q1Var.k(null, bVar2);
                return y.f14813a;
        }
    }
}
