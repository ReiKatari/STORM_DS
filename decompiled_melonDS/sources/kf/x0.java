package kf;

import java.lang.reflect.Type;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ b1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(b1 b1Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cd.i iVar = (cd.i) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((x0) t(cVar, iVar)).v(yb.y.f14813a);
            default:
                return ((x0) t(cVar, iVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new x0(this.Z, cVar, 0);
            default:
                return new x0(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        b1 b1Var = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Type type = b1.f8142g;
                if (b1Var.c(this) == aVar) {
                    return aVar;
                }
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
                this.Y = 1;
                Type type2 = b1.f8142g;
                if (b1Var.c(this) == aVar2) {
                    return aVar2;
                }
                return yVar;
        }
    }
}
