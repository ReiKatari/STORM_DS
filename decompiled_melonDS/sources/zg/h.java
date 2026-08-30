package zg;

import android.content.Context;
import cd.x0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ xg.h Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Context f15095b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(xg.h hVar, Context context, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = hVar;
        this.f15095b0 = context;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((h) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((h) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new h(this.Z, this.f15095b0, cVar, 0);
            default:
                return new h(this.Z, this.f15095b0, cVar, 1);
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
                    x0 x0Var = this.Z.f14615j;
                    mh.l lVar = new mh.l(this.f15095b0, null, 1);
                    this.Y = 1;
                    if (cd.q.j(x0Var, lVar, this) == aVar) {
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
                    x0 x0Var2 = this.Z.f14617l;
                    mh.l lVar2 = new mh.l(this.f15095b0, null, 2);
                    this.Y = 1;
                    if (cd.q.j(x0Var2, lVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }
}
