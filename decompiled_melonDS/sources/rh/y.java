package rh;

import cd.q1;
import cd.u0;
import cd.y0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ e0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e0 e0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = e0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            case 3:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            case 4:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((y) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new y(this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new y(this.Z, cVar, 1);
            case 2:
                return new y(this.Z, cVar, 2);
            case 3:
                return new y(this.Z, cVar, 3);
            case 4:
                return new y(this.Z, cVar, 4);
            default:
                return new y(this.Z, cVar, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // ec.a
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                yb.y yVar = yb.y.f14813a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    e0 e0Var = this.Z;
                    q1 q1Var = e0Var.f12731g;
                    x xVar = new x(e0Var, 0);
                    this.Y = 1;
                    Object c4 = q1Var.c(new a9.h(xVar, 8), this);
                    if (c4 != aVar) {
                        c4 = yVar;
                    }
                    if (c4 == aVar) {
                        return aVar;
                    }
                }
                return yVar;
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
                    e0 e0Var2 = this.Z;
                    x xVar2 = new x(e0Var2, 1);
                    this.Y = 1;
                    if (((u0) e0Var2.f12728d.f3846h).c(xVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return yb.y.f14813a;
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
                    e0 e0Var3 = this.Z;
                    cd.f n10 = cd.q.n(e0Var3.m, new od.x(14));
                    x xVar3 = new x(e0Var3, 2);
                    this.Y = 1;
                    if (n10.c(xVar3, this) == aVar3) {
                        return aVar3;
                    }
                }
                return yb.y.f14813a;
            case 3:
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
                    e0 e0Var4 = this.Z;
                    cd.f n11 = cd.q.n(e0Var4.m, new od.x(15));
                    x xVar4 = new x(e0Var4, 3);
                    this.Y = 1;
                    if (n11.c(xVar4, this) == aVar4) {
                        return aVar4;
                    }
                }
                return yb.y.f14813a;
            case 4:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                yb.y yVar2 = yb.y.f14813a;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    e0 e0Var5 = this.Z;
                    y0 y0Var = e0Var5.f12737n;
                    q1 q1Var2 = e0Var5.f12738o;
                    this.Y = 1;
                    Object c10 = y0Var.A.c(new a9.h(new a9.h(q1Var2, 22), 8), this);
                    if (c10 != aVar5) {
                        c10 = yVar2;
                    }
                    if (c10 != aVar5) {
                        c10 = yVar2;
                    }
                    if (c10 == aVar5) {
                        return aVar5;
                    }
                }
                return yVar2;
            default:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                yb.y yVar3 = yb.y.f14813a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    e0 e0Var6 = this.Z;
                    y0 y0Var2 = e0Var6.f12737n;
                    q1 q1Var3 = e0Var6.f12740q;
                    this.Y = 1;
                    Object c11 = y0Var2.A.c(new a9.h(new a9.h(q1Var3, 23), 8), this);
                    if (c11 != aVar6) {
                        c11 = yVar3;
                    }
                    if (c11 != aVar6) {
                        c11 = yVar3;
                    }
                    if (c11 == aVar6) {
                        return aVar6;
                    }
                }
                return yVar3;
        }
    }
}
