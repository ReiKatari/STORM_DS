package uh;

import androidx.lifecycle.q;
import androidx.lifecycle.s0;
import androidx.lifecycle.z;
import b4.g3;
import cd.y0;
import ec.j;
import mc.p;
import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ LayoutSelectorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LayoutSelectorActivity layoutSelectorActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = layoutSelectorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((e) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new e(this.Z, cVar, 0);
            default:
                return new e(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        LayoutSelectorActivity layoutSelectorActivity = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    int i11 = LayoutSelectorActivity.f9561y0;
                    y0 y0Var = ((xh.c) layoutSelectorActivity.f9565x0.getValue()).f14627f;
                    g3 g3Var = new g3(11, layoutSelectorActivity);
                    this.Y = 1;
                    if (y0Var.A.c(g3Var, this) == aVar) {
                        return aVar;
                    }
                }
                wa.b.a();
                return null;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    z zVar = layoutSelectorActivity.A;
                    q qVar = q.STARTED;
                    e eVar = new e(layoutSelectorActivity, null, 0);
                    this.Y = 1;
                    if (s0.i(zVar, qVar, eVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }
}
