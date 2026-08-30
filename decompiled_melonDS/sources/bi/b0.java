package bi;

import ah.l0;
import androidx.lifecycle.s0;
import cd.y0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(me.magnum.melonds.ui.romlist.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            case 3:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            case 4:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((b0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b0(this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b0(this.Z, cVar, 1);
            case 2:
                return new b0(this.Z, cVar, 2);
            case 3:
                return new b0(this.Z, cVar, 3);
            case 4:
                return new b0(this.Z, cVar, 4);
            default:
                return new b0(this.Z, cVar, 5);
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
                    me.magnum.melonds.ui.romlist.a aVar2 = this.Z;
                    y0 y0Var = aVar2.j().f2299q;
                    a0 a0Var = new a0(aVar2, null, 0);
                    this.Y = 1;
                    if (cd.q.j(y0Var, a0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
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
                    me.magnum.melonds.ui.romlist.a aVar4 = this.Z;
                    androidx.lifecycle.x viewLifecycleOwner = aVar4.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
                    b0 b0Var = new b0(aVar4, null, 0);
                    this.Y = 1;
                    if (s0.j(viewLifecycleOwner, qVar, b0Var, this) == aVar3) {
                        return aVar3;
                    }
                }
                return yb.y.f14813a;
            case 2:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
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
                    me.magnum.melonds.ui.romlist.a aVar6 = this.Z;
                    l0 l0Var = new l0(aVar6.j().f2297o, 6);
                    a0 a0Var2 = new a0(aVar6, null, 1);
                    this.Y = 1;
                    if (cd.q.j(l0Var, a0Var2, this) == aVar5) {
                        return aVar5;
                    }
                }
                return yb.y.f14813a;
            case 3:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
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
                    me.magnum.melonds.ui.romlist.a aVar8 = this.Z;
                    androidx.lifecycle.x viewLifecycleOwner2 = aVar8.getViewLifecycleOwner();
                    viewLifecycleOwner2.getClass();
                    androidx.lifecycle.q qVar2 = androidx.lifecycle.q.STARTED;
                    b0 b0Var2 = new b0(aVar8, null, 2);
                    this.Y = 1;
                    if (s0.j(viewLifecycleOwner2, qVar2, b0Var2, this) == aVar7) {
                        return aVar7;
                    }
                }
                return yb.y.f14813a;
            case 4:
                dc.a aVar9 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    me.magnum.melonds.ui.romlist.a aVar10 = this.Z;
                    cd.x xVar = aVar10.j().f2298p;
                    a9.k kVar = new a9.k(2, null, aVar10);
                    this.Y = 1;
                    if (cd.q.j(xVar, kVar, this) == aVar9) {
                        return aVar9;
                    }
                }
                return yb.y.f14813a;
            default:
                dc.a aVar11 = dc.a.COROUTINE_SUSPENDED;
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
                    me.magnum.melonds.ui.romlist.a aVar12 = this.Z;
                    androidx.lifecycle.x viewLifecycleOwner3 = aVar12.getViewLifecycleOwner();
                    viewLifecycleOwner3.getClass();
                    androidx.lifecycle.q qVar3 = androidx.lifecycle.q.STARTED;
                    b0 b0Var3 = new b0(aVar12, null, 4);
                    this.Y = 1;
                    if (s0.j(viewLifecycleOwner3, qVar3, b0Var3, this) == aVar11) {
                        return aVar11;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
