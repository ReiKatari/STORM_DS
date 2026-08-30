package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ cd.h Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ m1 f9987b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(cd.h hVar, m1 m1Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = hVar;
        this.f9987b0 = m1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((p2) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((p2) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((p2) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new p2(this.Z, this.f9987b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new p2(this.Z, this.f9987b0, cVar, 1);
            default:
                return new p2(this.Z, this.f9987b0, cVar, 2);
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
                    o2 o2Var = new o2(this.f9987b0, 1);
                    this.Y = 1;
                    if (this.Z.c(o2Var, this) == aVar) {
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
                    o2 o2Var2 = new o2(this.f9987b0, 3);
                    this.Y = 1;
                    if (this.Z.c(o2Var2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    cc.h hVar = cc.h.A;
                    boolean equals = hVar.equals(hVar);
                    m1 m1Var = this.f9987b0;
                    cd.h hVar2 = this.Z;
                    if (equals) {
                        o2 o2Var3 = new o2(m1Var, 2);
                        this.Y = 1;
                        if (hVar2.c(o2Var3, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        p2 p2Var = new p2(hVar2, m1Var, null, 1);
                        this.Y = 2;
                        if (zc.x.F(hVar, p2Var, this) == aVar3) {
                            return aVar3;
                        }
                    }
                }
                return yb.y.f14813a;
        }
    }
}
