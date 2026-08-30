package bi;

import androidx.lifecycle.s0;
import cd.e1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(RomListActivity romListActivity, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = romListActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case 3:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case 4:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((n) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new n(this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new n(this.Z, cVar, 1);
            case 2:
                return new n(this.Z, cVar, 2);
            case 3:
                return new n(this.Z, cVar, 3);
            case 4:
                return new n(this.Z, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new n(this.Z, cVar, 5);
            case l1.c.f8509e /* 6 */:
                return new n(this.Z, cVar, 6);
            default:
                return new n(this.Z, cVar, 7);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        RomListActivity romListActivity = this.Z;
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
                int i11 = RomListActivity.D0;
                e1 e1Var = romListActivity.B().f2294k;
                m mVar = new m(romListActivity, null, 0);
                this.Y = 1;
                if (cd.q.j(e1Var, mVar, this) == aVar) {
                    return aVar;
                }
                return yVar;
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
                androidx.lifecycle.q qVar = androidx.lifecycle.q.STARTED;
                n nVar = new n(romListActivity, null, 0);
                this.Y = 1;
                if (s0.j(romListActivity, qVar, nVar, this) == aVar2) {
                    return aVar2;
                }
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
                int i14 = RomListActivity.D0;
                e1 e1Var2 = romListActivity.B().m;
                a9.k kVar = new a9.k(1, null, romListActivity);
                this.Y = 1;
                if (cd.q.j(e1Var2, kVar, this) == aVar3) {
                    return aVar3;
                }
                return yVar;
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
                androidx.lifecycle.q qVar2 = androidx.lifecycle.q.STARTED;
                n nVar2 = new n(romListActivity, null, 2);
                this.Y = 1;
                if (s0.j(romListActivity, qVar2, nVar2, this) == aVar4) {
                    return aVar4;
                }
                return yVar;
            case 4:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                int i17 = RomListActivity.D0;
                cd.d dVar = romListActivity.A().f2303e;
                p pVar = new p(romListActivity, null, 0);
                this.Y = 1;
                if (cd.q.j(dVar, pVar, this) == aVar5) {
                    return aVar5;
                }
                return yVar;
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
                androidx.lifecycle.q qVar3 = androidx.lifecycle.q.STARTED;
                n nVar3 = new n(romListActivity, null, 4);
                this.Y = 1;
                if (s0.j(romListActivity, qVar3, nVar3, this) == aVar6) {
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
                int i20 = RomListActivity.D0;
                cd.d dVar2 = romListActivity.A().f2305g;
                p pVar2 = new p(romListActivity, null, 1);
                this.Y = 1;
                if (cd.q.j(dVar2, pVar2, this) == aVar7) {
                    return aVar7;
                }
                return yVar;
            default:
                dc.a aVar8 = dc.a.COROUTINE_SUSPENDED;
                int i21 = this.Y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        p7.j.I(obj);
                        return yVar;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                androidx.lifecycle.q qVar4 = androidx.lifecycle.q.STARTED;
                n nVar4 = new n(romListActivity, null, 6);
                this.Y = 1;
                if (s0.j(romListActivity, qVar4, nVar4, this) == aVar8) {
                    return aVar8;
                }
                return yVar;
        }
    }
}
