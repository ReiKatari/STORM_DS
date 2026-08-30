package xh;

import ec.j;
import java.util.UUID;
import kf.b1;
import mc.p;
import nc.k;
import ve.f;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends j implements p {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ f Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ b f14622b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, b bVar, cc.c cVar) {
        super(2, cVar);
        this.Z = fVar;
        this.f14622b0 = bVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((a) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((a) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new a(this.f14622b0, this.Z, cVar);
            default:
                return new a(this.Z, this.f14622b0, cVar);
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
                    b1 b1Var = this.f14622b0.f14623b;
                    this.Y = 1;
                    if (b1Var.f(this.Z, this) == aVar) {
                        return aVar;
                    }
                }
                return y.f14813a;
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
                    f fVar = this.Z;
                    UUID uuid = fVar.f13798a;
                    b bVar = this.f14622b0;
                    if (k.a(uuid, bVar.f().A.getValue())) {
                        bVar.e();
                    }
                    b1 b1Var2 = bVar.f14623b;
                    this.Y = 1;
                    if (b1Var2.b(fVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, f fVar, cc.c cVar) {
        super(2, cVar);
        this.f14622b0 = bVar;
        this.Z = fVar;
    }
}
