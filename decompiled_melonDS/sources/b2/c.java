package b2;

import a2.o;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import ec.j;
import g2.n;
import g2.n0;
import java.util.ArrayList;
import mc.l;
import mc.p;
import mc.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.f1;
import nc.t;
import yb.y;
import z2.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends j implements l {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f1744b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, cc.c cVar, int i2) {
        super(1, cVar);
        this.X = i2;
        this.Z = obj;
        this.f1744b0 = obj2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        cc.c cVar = (cc.c) obj;
        switch (this.X) {
            case 0:
                return new c((d) this.Z, (b) this.f1744b0, cVar, 0).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c((cd.i) this.Z, (t) this.f1744b0, cVar, 1).v(y.f14813a);
            case 2:
                return new c((n) this.Z, (q) this.f1744b0, cVar, 2).v(y.f14813a);
            case 3:
                return new c((he.t) this.Z, (ArrayList) this.f1744b0, cVar, 3).v(y.f14813a);
            case 4:
                return new c((k7.t) this.Z, (l) this.f1744b0, cVar, 4).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                return new c((z1.f) this.Z, (g) this.f1744b0, cVar, 5).v(y.f14813a);
            default:
                return new c((p) this.Z, (ze.a) this.f1744b0, cVar, 6).v(y.f14813a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [z2.u] */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.os.Handler] */
    @Override // ec.a
    public final Object v(Object obj) {
        Looper myLooper;
        Handler handler;
        Looper looper;
        Looper looper2;
        z1.d dVar;
        Looper looper3;
        switch (this.X) {
            case 0:
                b bVar = (b) this.f1744b0;
                f1 f1Var = ((d) this.Z).f1747c;
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                y yVar = y.f14813a;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            p7.j.I(obj);
                        } else {
                            a0.j.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        p7.j.I(obj);
                        f1Var.setValue(bVar);
                        this.Y = 1;
                        Object p10 = bVar.f1743b.p(this);
                        if (p10 != aVar) {
                            p10 = yVar;
                        }
                        if (p10 == aVar) {
                            return aVar;
                        }
                    }
                    return yVar;
                } finally {
                    f1Var.setValue(null);
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                t tVar = (t) this.f1744b0;
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
                    cd.i iVar = (cd.i) this.Z;
                    a0.c cVar = dd.c.f4036b;
                    Object obj2 = tVar.A;
                    if (obj2 == cVar) {
                        obj2 = null;
                    }
                    this.Y = 1;
                    if (iVar.a(obj2, this) == aVar2) {
                        return aVar2;
                    }
                }
                tVar.A = null;
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
                    n nVar = (n) this.Z;
                    g2.g gVar = new g2.g(nVar, 3);
                    o oVar = new o((q) this.f1744b0, nVar, (cc.c) null, 19);
                    this.Y = 1;
                    if (n0.k(gVar, oVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return y.f14813a;
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
                    this.Y = 1;
                    if (he.n.B((he.t) this.Z, (ArrayList) this.f1744b0, this) == aVar4) {
                        return aVar4;
                    }
                }
                return y.f14813a;
            case 4:
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                k7.t tVar2 = (k7.t) this.Z;
                p7.g gVar2 = new p7.g(tVar2, null, (l) this.f1744b0, 0);
                this.Y = 1;
                Object q10 = tVar2.q(false, gVar2, this);
                if (q10 == aVar5) {
                    return aVar5;
                }
                return q10;
            case l1.c.f8511g /* 5 */:
                z1.f fVar = (z1.f) this.Z;
                u uVar = fVar.f14871e;
                View view = fVar.f14867a;
                dc.a aVar6 = dc.a.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                y yVar2 = y.f14813a;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            p7.j.I(obj);
                        } else {
                            a0.j.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        p7.j.I(obj);
                        z1.e eVar = new z1.e();
                        g gVar3 = (g) this.f1744b0;
                        z1.d dVar2 = new z1.d(eVar, new z1.b(fVar, gVar3, 0), new z1.b(fVar, gVar3, 1), view);
                        l lVar = fVar.f14868b;
                        if (lVar != null && (dVar = (z1.d) lVar.k(dVar2)) != null) {
                            dVar2 = dVar;
                        }
                        Looper myLooper2 = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (handler2 != null) {
                            looper2 = handler2.getLooper();
                        } else {
                            looper2 = null;
                        }
                        if (myLooper2 != looper2) {
                            a0.i iVar2 = fVar.f14875i;
                            if (iVar2 == null) {
                                iVar2 = new a0.i(fVar, dVar2, eVar, 17);
                                fVar.f14875i = iVar2;
                            }
                            view.post(iVar2);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new z1.l(dVar2), 1);
                            if (startActionMode != null) {
                                fVar.f14874h = startActionMode;
                            }
                            return yVar2;
                        }
                        this.Y = 1;
                        Object p11 = eVar.f14866a.p(this);
                        if (p11 != aVar6) {
                            p11 = yVar2;
                        }
                        if (p11 == aVar6) {
                            return aVar6;
                        }
                    }
                    if (handler != 0) {
                        looper3 = handler.getLooper();
                    } else {
                        looper3 = null;
                    }
                    if (myLooper != looper3) {
                        Runnable runnable = fVar.f14876j;
                        if (runnable == null) {
                            runnable = new r0.b(12, fVar);
                            fVar.f14876j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = fVar.f14874h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    a0.i iVar3 = fVar.f14875i;
                    if (iVar3 != null) {
                        view.removeCallbacks(iVar3);
                    }
                    fVar.f14874h = null;
                    return yVar2;
                } finally {
                    uVar.a();
                    myLooper = Looper.myLooper();
                    handler = view.getHandler();
                    if (handler != null) {
                        looper = handler.getLooper();
                    } else {
                        looper = null;
                    }
                    if (myLooper != looper) {
                        Runnable runnable2 = fVar.f14876j;
                        if (runnable2 == null) {
                            runnable2 = new r0.b(12, fVar);
                            fVar.f14876j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = fVar.f14874h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    a0.i iVar4 = fVar.f14875i;
                    if (iVar4 != null) {
                        view.removeCallbacks(iVar4);
                    }
                    fVar.f14874h = null;
                }
            default:
                dc.a aVar7 = dc.a.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Object j2 = ((p) this.Z).j((ze.a) this.f1744b0, this);
                if (j2 == aVar7) {
                    return aVar7;
                }
                return j2;
        }
    }
}
