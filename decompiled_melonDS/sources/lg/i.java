package lg;

import a7.d0;
import jg.u;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ u Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ d0 f9091b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(u uVar, d0 d0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = uVar;
        this.f9091b0 = d0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((i) t(cVar, uVar)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((i) t(cVar, uVar)).v(y.f14813a);
            case 2:
                return ((i) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((i) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new i(this.Z, this.f9091b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new i(this.Z, this.f9091b0, cVar, 1);
            case 2:
                return new i(this.Z, this.f9091b0, cVar, 2);
            default:
                return new i(this.Z, this.f9091b0, cVar, 3);
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
                    cd.d dVar = this.Z.m;
                    h hVar = new h(this.f9091b0, 0);
                    this.Y = 1;
                    if (dVar.c(hVar, this) == aVar) {
                        return aVar;
                    }
                }
                return y.f14813a;
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
                    cd.d dVar2 = this.Z.f7888o;
                    h hVar2 = new h(this.f9091b0, 1);
                    this.Y = 1;
                    if (dVar2.c(hVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return y.f14813a;
            case 2:
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
                    cd.d dVar3 = this.Z.f7890q;
                    h hVar3 = new h(this.f9091b0, 2);
                    this.Y = 1;
                    if (dVar3.c(hVar3, this) == aVar3) {
                        return aVar3;
                    }
                }
                return y.f14813a;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
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
                    cd.d dVar4 = this.Z.f7892s;
                    h hVar4 = new h(this.f9091b0, 3);
                    this.Y = 1;
                    if (dVar4.c(hVar4, this) == aVar4) {
                        return aVar4;
                    }
                }
                return y.f14813a;
        }
    }
}
