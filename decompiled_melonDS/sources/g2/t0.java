package g2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ j1.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ z2.p f5401b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(j1.i iVar, z2.p pVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = iVar;
        this.f5401b0 = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((t0) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((t0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((t0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new t0(this.Z, this.f5401b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new t0(this.Z, this.f5401b0, cVar, 1);
            default:
                return new t0(this.Z, this.f5401b0, cVar, 2);
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
                    cd.e1 e1Var = this.Z.f7335a;
                    s0 s0Var = new s0(this.f5401b0, 0);
                    this.Y = 1;
                    e1Var.getClass();
                    if (cd.e1.k(e1Var, s0Var, this) == aVar) {
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
                    cd.e1 e1Var2 = this.Z.f7335a;
                    s0 s0Var2 = new s0(this.f5401b0, 1);
                    this.Y = 1;
                    e1Var2.getClass();
                    if (cd.e1.k(e1Var2, s0Var2, this) == aVar2) {
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
                    cd.e1 e1Var3 = this.Z.f7335a;
                    s0 s0Var3 = new s0(this.f5401b0, 2);
                    this.Y = 1;
                    e1Var3.getClass();
                    if (cd.e1.k(e1Var3, s0Var3, this) == aVar3) {
                        return aVar3;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
