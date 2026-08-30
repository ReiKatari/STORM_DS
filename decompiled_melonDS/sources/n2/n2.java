package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.p f9962b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ w0 f9963c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(mc.p pVar, w0 w0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f9962b0 = pVar;
        this.f9963c0 = w0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((n2) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((n2) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((n2) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                n2 n2Var = new n2(this.f9962b0, this.f9963c0, cVar, 0);
                n2Var.Z = obj;
                return n2Var;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2 n2Var2 = new n2(this.f9962b0, this.f9963c0, cVar, 1);
                n2Var2.Z = obj;
                return n2Var2;
            default:
                n2 n2Var3 = new n2(this.f9962b0, this.f9963c0, cVar, 2);
                n2Var3.Z = obj;
                return n2Var3;
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
                    m1 m1Var = new m1(this.f9963c0, ((zc.u) this.Z).v());
                    this.Y = 1;
                    if (this.f9962b0.j(m1Var, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
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
                    m1 m1Var2 = new m1(this.f9963c0, ((zc.u) this.Z).v());
                    this.Y = 1;
                    if (this.f9962b0.j(m1Var2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    m1 m1Var3 = new m1(this.f9963c0, ((zc.u) this.Z).v());
                    this.Y = 1;
                    if (this.f9962b0.j(m1Var3, this) == aVar3) {
                        return aVar3;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
