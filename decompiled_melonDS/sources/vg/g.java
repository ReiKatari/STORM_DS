package vg;

import a7.v;
import androidx.lifecycle.q;
import androidx.lifecycle.s0;
import androidx.lifecycle.z;
import b4.g3;
import cd.x0;
import ec.j;
import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ v Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(v vVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = vVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((g) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((g) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new g(this.Z, cVar, 0);
            default:
                return new g(this.Z, cVar, 1);
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
                    v vVar = this.Z;
                    x0 x0Var = ((c) ((v) vVar.L).getValue()).f13833d;
                    g3 g3Var = new g3(12, vVar);
                    this.Y = 1;
                    if (x0Var.A.c(g3Var, this) == aVar) {
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
                    v vVar2 = this.Z;
                    z zVar = ((l.i) vVar2.A).A;
                    q qVar = q.CREATED;
                    g gVar = new g(vVar2, null, 0);
                    this.Y = 1;
                    if (s0.i(zVar, qVar, gVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
        }
    }
}
