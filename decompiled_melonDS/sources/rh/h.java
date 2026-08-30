package rh;

import androidx.lifecycle.s0;
import cd.y0;
import h1.x2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(LayoutEditorActivity layoutEditorActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = layoutEditorActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case 3:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case 4:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((h) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new h(this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new h(this.Z, cVar, 1);
            case 2:
                return new h(this.Z, cVar, 2);
            case 3:
                return new h(this.Z, cVar, 3);
            case 4:
                return new h(this.Z, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new h(this.Z, cVar, 5);
            case l1.c.f8509e /* 6 */:
                return new h(this.Z, cVar, 6);
            default:
                return new h(this.Z, cVar, 7);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        LayoutEditorActivity layoutEditorActivity = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    int i11 = LayoutEditorActivity.K0;
                    y0 y0Var = layoutEditorActivity.A().f12737n;
                    g gVar = new g(layoutEditorActivity, 0);
                    this.Y = 1;
                    if (y0Var.A.c(gVar, this) == aVar) {
                        return aVar;
                    }
                }
                wa.b.a();
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
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
                androidx.lifecycle.z zVar = layoutEditorActivity.A;
                androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
                h hVar = new h(layoutEditorActivity, null, 0);
                this.Y = 1;
                if (s0.i(zVar, qVar, hVar, this) == aVar2) {
                    return aVar2;
                }
                return yVar;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    int i14 = LayoutEditorActivity.K0;
                    y0 y0Var2 = layoutEditorActivity.A().f12734j;
                    g gVar2 = new g(layoutEditorActivity, 1);
                    this.Y = 1;
                    if (y0Var2.A.c(gVar2, this) == aVar3) {
                        return aVar3;
                    }
                }
                wa.b.a();
                return null;
            case 3:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                androidx.lifecycle.z zVar2 = layoutEditorActivity.A;
                androidx.lifecycle.q qVar2 = androidx.lifecycle.q.STARTED;
                h hVar2 = new h(layoutEditorActivity, null, 2);
                this.Y = 1;
                if (s0.i(zVar2, qVar2, hVar2, this) == aVar4) {
                    return aVar4;
                }
                return yVar;
            case 4:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 != 1) {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7.j.I(obj);
                } else {
                    p7.j.I(obj);
                    int i17 = LayoutEditorActivity.K0;
                    y0 y0Var3 = layoutEditorActivity.A().f12736l;
                    g gVar3 = new g(layoutEditorActivity, 2);
                    this.Y = 1;
                    if (y0Var3.A.c(gVar3, this) == aVar5) {
                        return aVar5;
                    }
                }
                wa.b.a();
                return null;
            case l1.c.f8511g /* 5 */:
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                androidx.lifecycle.z zVar3 = layoutEditorActivity.A;
                androidx.lifecycle.q qVar3 = androidx.lifecycle.q.STARTED;
                h hVar3 = new h(layoutEditorActivity, null, 4);
                this.Y = 1;
                if (s0.i(zVar3, qVar3, hVar3, this) == aVar6) {
                    return aVar6;
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                j8.g.f7773a.getClass();
                cd.c h2 = cd.q.h(new x2(j8.f.a(layoutEditorActivity), layoutEditorActivity, null, 3));
                gd.f fVar = g0.f15015a;
                cd.h t5 = cd.q.t(h2, ed.n.f4465a);
                g gVar4 = new g(layoutEditorActivity, 3);
                this.Y = 1;
                if (t5.c(gVar4, this) == aVar7) {
                    return aVar7;
                }
                return yVar;
            default:
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                androidx.lifecycle.z zVar4 = layoutEditorActivity.A;
                androidx.lifecycle.q qVar4 = androidx.lifecycle.q.STARTED;
                h hVar4 = new h(layoutEditorActivity, null, 6);
                this.Y = 1;
                if (s0.i(zVar4, qVar4, hVar4, this) == aVar8) {
                    return aVar8;
                }
                return yVar;
        }
    }
}
