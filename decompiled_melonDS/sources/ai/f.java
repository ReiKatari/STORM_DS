package ai;

import f1.f1;
import h1.u1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f825b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i2, cc.c cVar, int i10) {
        super(2, cVar);
        this.X = i10;
        this.f825b0 = obj;
        this.Z = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((f) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((f) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((f) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((f) t((cc.c) obj2, (u1) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new f((n1.x) this.f825b0, this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new f((lf.d) this.f825b0, this.Z, cVar, 1);
            case 2:
                return new f((p1.y0) this.f825b0, this.Z, cVar, 2);
            default:
                return new f((q1.a0) this.f825b0, this.Z, cVar, 3);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        int i10 = this.Z;
        Object obj2 = this.f825b0;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
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
                n1.x xVar = (n1.x) obj2;
                this.Y = 1;
                p1.a0 a0Var = n1.x.f9846x;
                xVar.getClass();
                Object c4 = xVar.c(f1.Default, new n1.u(xVar, i10, null), this);
                if (c4 != aVar) {
                    c4 = yVar;
                }
                if (c4 == aVar) {
                    return aVar;
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                lf.d dVar = (lf.d) obj2;
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
                    sd.h hVar = dVar.f9077c;
                    this.Y = 1;
                    if (hVar.a("android.permission.CAMERA", this) == aVar2) {
                        return aVar2;
                    }
                }
                dVar.a(i10);
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                p1.u0 u0Var = ((p1.y0) obj2).f11290j0;
                this.Y = 1;
                if (u0Var.d(i10, this) == aVar3) {
                    return aVar3;
                }
                return yVar;
            default:
                q1.a0 a0Var2 = (q1.a0) obj2;
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    this.Y = 1;
                    if (a0Var2.h(this) == aVar4) {
                        return aVar4;
                    }
                }
                double d4 = 0.0f;
                if (-0.5d > d4 || d4 > 0.5d) {
                    k1.b.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                a0Var2.u(a0Var2.j(i10), 0.0f, true);
                return yVar;
        }
    }
}
