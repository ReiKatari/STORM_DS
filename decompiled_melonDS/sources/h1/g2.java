package h1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ i2 Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ long f5904b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(i2 i2Var, long j2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = i2Var;
        this.f5904b0 = j2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((g2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((g2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                long j2 = ((h3.b) obj).f6050a;
                g2 g2Var = new g2(this.Z, (cc.c) obj2);
                g2Var.f5904b0 = j2;
                return g2Var.v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new g2(this.Z, this.f5904b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new g2(this.Z, this.f5904b0, cVar, 1);
            default:
                g2 g2Var = new g2(this.Z, cVar);
                g2Var.f5904b0 = ((h3.b) obj).f6050a;
                return g2Var;
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
                    p2 p2Var = this.Z.H0;
                    f1.f1 f1Var = f1.f1.UserInput;
                    f2 f2Var = new f2(this.f5904b0, null);
                    this.Y = 1;
                    if (p2Var.f(f1Var, f2Var, this) == aVar) {
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
                    p2 p2Var2 = this.Z.H0;
                    long j2 = this.f5904b0;
                    this.Y = 1;
                    if (p2Var2.b(j2, true, this) == aVar2) {
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
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                long j10 = this.f5904b0;
                p2 p2Var3 = this.Z.H0;
                this.Y = 1;
                Object a10 = b2.a(p2Var3, j10, this);
                if (a10 == aVar3) {
                    return aVar3;
                }
                return a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, cc.c cVar) {
        super(2, cVar);
        this.X = 2;
        this.Z = i2Var;
    }
}
