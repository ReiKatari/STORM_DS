package ah;

import cd.q1;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.RuntimeLayoutView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ r(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, java.lang.Iterable] */
    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        RuntimeLayoutView runtimeLayoutView;
        ve.l lVar;
        bf.a aVar;
        ve.k kVar;
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        EmulatorActivity emulatorActivity = this.B;
        switch (i2) {
            case 0:
                oe.j jVar = (oe.j) obj;
                a0.m mVar = emulatorActivity.P0;
                if (mVar != null) {
                    emulatorActivity.Q0 = new b9.e(jVar, mVar, emulatorActivity.R0);
                    eh.c cVar2 = emulatorActivity.J0;
                    cVar2.getClass();
                    q1 q1Var = cVar2.f4485b;
                    q1Var.getClass();
                    q1Var.k(null, jVar);
                    return yVar;
                }
                nc.k.f("melonTouchHandler");
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                hh.c cVar3 = (hh.c) obj;
                d5.f fVar = emulatorActivity.f9504y0;
                if (fVar != null) {
                    ((RuntimeLayoutView) fVar.f3846h).setConnectedControllersState(cVar3);
                    ih.f fVar2 = emulatorActivity.G0;
                    if (fVar2 != null && (runtimeLayoutView = fVar2.B) != null) {
                        runtimeLayoutView.setConnectedControllersState(cVar3);
                    }
                    return yVar;
                }
                nc.k.f("binding");
                throw null;
            case 2:
                hh.d1 d1Var = (hh.d1) obj;
                if (d1Var instanceof hh.b1) {
                    a4.n nVar = emulatorActivity.L0;
                    if (nVar != null) {
                        ((cd.e1) ((a4.n) nVar.L).R).p(Boolean.TRUE);
                    } else {
                        nc.k.f("emulatorRumbleManager");
                        throw null;
                    }
                } else if (nc.k.a(d1Var, hh.c1.f6513a)) {
                    a4.n nVar2 = emulatorActivity.L0;
                    if (nVar2 != null) {
                        ((cd.e1) ((a4.n) nVar2.L).R).p(Boolean.FALSE);
                    } else {
                        nc.k.f("emulatorRumbleManager");
                        throw null;
                    }
                } else {
                    m9.o.o();
                    return null;
                }
                return yVar;
            case 3:
                ?? r12 = ((j8.i) obj).f7776a;
                ArrayList arrayList = new ArrayList();
                for (j8.c cVar4 : r12) {
                    if (cVar4 instanceof j8.c) {
                        h8.b bVar = cVar4.f7764a;
                        if (cVar4.a().equals(j8.b.f7757g)) {
                            aVar = bf.a.LANDSCAPE;
                        } else {
                            aVar = bf.a.PORTRAIT;
                        }
                        if (cVar4.b()) {
                            kVar = ve.k.SEAMLESS;
                        } else {
                            kVar = ve.k.GAP;
                        }
                        lVar = new ve.l(aVar, kVar, new oe.b0(bVar.c().left, bVar.c().top, bVar.c().width(), bVar.c().height()));
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                int i10 = EmulatorActivity.f9503a1;
                q1 q1Var2 = (q1) emulatorActivity.C().f772k.f3843e;
                q1Var2.getClass();
                q1Var2.k(null, arrayList);
                return yVar;
            case 4:
                yb.y yVar2 = (yb.y) obj;
                ih.f fVar3 = emulatorActivity.G0;
                if (fVar3 != null) {
                    fVar3.dismiss();
                }
                emulatorActivity.G0 = null;
                return yVar;
            default:
                emulatorActivity.U0.a(new String[]{(String) obj});
                return yVar;
        }
    }
}
