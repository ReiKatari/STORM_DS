package q1;

import b4.v0;
import f1.f1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ a0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a0 a0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = a0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((o) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((o) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((o) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new o(this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new o(this.Z, cVar, 1);
            default:
                return new o(this.Z, cVar, 2);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object obj2;
        Object obj3;
        int i2 = this.X;
        a0 a0Var = this.Z;
        yb.y yVar = yb.y.f14813a;
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
                float f8 = d0.f12126a;
                if (a0Var.k() - 1 < 0 || (obj2 = a0Var.f(a0Var.k() - 1, d1.d.q(7, null), this)) != aVar) {
                    obj2 = yVar;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
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
                float f10 = d0.f12126a;
                if (a0Var.k() + 1 >= a0Var.n() || (obj3 = a0Var.f(a0Var.k() + 1, d1.d.q(7, null), this)) != aVar2) {
                    obj3 = yVar;
                }
                if (obj3 == aVar2) {
                    return aVar2;
                }
                return yVar;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
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
                this.Y = 1;
                f1 f1Var = f1.Default;
                v0 v0Var = new v0(2, 2, null);
                a0Var.getClass();
                Object t5 = a0.t(a0Var, f1Var, v0Var, this);
                if (t5 != aVar3) {
                    t5 = yVar;
                }
                if (t5 == aVar3) {
                    return aVar3;
                }
                return yVar;
        }
    }
}
