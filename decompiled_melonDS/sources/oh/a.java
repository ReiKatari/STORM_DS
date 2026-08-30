package oh;

import ec.j;
import mc.p;
import n2.w0;
import yb.y;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(w0 w0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = w0Var;
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
                return new a(this.Z, cVar, 0);
            default:
                return new a(this.Z, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                w0 w0Var = this.Z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            p7.j.I(obj);
                            w0Var.setValue(e.SHOW_DESCRIPTION);
                            return y.f14813a;
                        }
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    this.Y = 1;
                    if (x.h(500L, this) == aVar) {
                        return aVar;
                    }
                }
                w0Var.setValue(e.SHOW_TITLE);
                this.Y = 2;
                if (x.h(2000L, this) == aVar) {
                    return aVar;
                }
                w0Var.setValue(e.SHOW_DESCRIPTION);
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
                    this.Y = 1;
                    if (x.h(500L, this) == aVar2) {
                        return aVar2;
                    }
                }
                this.Z.setValue(d.SHOW_FULL);
                return y.f14813a;
        }
    }
}
