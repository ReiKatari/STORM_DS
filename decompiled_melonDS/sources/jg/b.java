package jg;

import androidx.lifecycle.s0;
import androidx.lifecycle.z;
import me.magnum.melonds.ui.cheats.CheatsActivity;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ CheatsActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CheatsActivity cheatsActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = cheatsActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((b) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((b) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b(this.Z, cVar, 0);
            default:
                return new b(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        y yVar = y.f14813a;
        CheatsActivity cheatsActivity = this.Z;
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
                int i11 = CheatsActivity.f9493y0;
                cd.d dVar = ((u) cheatsActivity.f9497x0.getValue()).f7896w;
                bi.m mVar = new bi.m(cheatsActivity, null, 1);
                this.Y = 1;
                if (cd.q.j(dVar, mVar, this) == aVar) {
                    return aVar;
                }
                return yVar;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                z zVar = cheatsActivity.A;
                androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
                b bVar = new b(cheatsActivity, null, 0);
                this.Y = 1;
                if (s0.i(zVar, qVar, bVar, this) == aVar2) {
                    return aVar2;
                }
                return yVar;
        }
    }
}
