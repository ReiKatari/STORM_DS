package rh;

import android.os.Handler;
import cd.q1;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import oe.h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutEditorActivity B;

    public /* synthetic */ g(LayoutEditorActivity layoutEditorActivity, int i2) {
        this.A = i2;
        this.B = layoutEditorActivity;
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.Iterable] */
    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        me.magnum.melonds.ui.layouteditor.b bVar;
        LayoutEditorView layoutEditorView;
        c cVar2;
        me.magnum.melonds.ui.layouteditor.b bVar2;
        ve.l lVar;
        bf.a aVar;
        ve.k kVar;
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        LayoutEditorActivity layoutEditorActivity = this.B;
        switch (i2) {
            case 0:
                sh.a aVar2 = (sh.a) obj;
                if (aVar2 == null) {
                    me.magnum.melonds.ui.layouteditor.b bVar3 = layoutEditorActivity.C0;
                    if (bVar3 != null) {
                        bVar3.getLayoutEditorView().b();
                        c cVar3 = layoutEditorActivity.F0;
                        if (cVar3 != null && (bVar = cVar3.A) != null && (layoutEditorView = bVar.getLayoutEditorView()) != null) {
                            layoutEditorView.b();
                        }
                    } else {
                        nc.k.f("layoutEditorManager");
                        throw null;
                    }
                } else {
                    Handler handler = layoutEditorActivity.D0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        Handler handler2 = layoutEditorActivity.D0;
                        if (handler2 != null) {
                            handler2.post(new ad.c(25, layoutEditorActivity, aVar2));
                        } else {
                            nc.k.f("handler");
                            throw null;
                        }
                    } else {
                        nc.k.f("handler");
                        throw null;
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                h0 h0Var = (h0) obj;
                if (h0Var != null) {
                    me.magnum.melonds.ui.layouteditor.b bVar4 = layoutEditorActivity.C0;
                    if (bVar4 != null) {
                        bVar4.t(h0Var);
                    } else {
                        nc.k.f("layoutEditorManager");
                        throw null;
                    }
                }
                return yVar;
            case 2:
                h0 h0Var2 = (h0) obj;
                if (h0Var2 != null && (cVar2 = layoutEditorActivity.F0) != null && (bVar2 = cVar2.A) != null) {
                    bVar2.t(h0Var2);
                }
                return yVar;
            default:
                ?? r12 = ((j8.i) obj).f7776a;
                ArrayList arrayList = new ArrayList();
                for (j8.c cVar4 : r12) {
                    if (cVar4 instanceof j8.c) {
                        h8.b bVar5 = cVar4.f7764a;
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
                        lVar = new ve.l(aVar, kVar, new oe.b0(bVar5.c().left, bVar5.c().top, bVar5.c().width(), bVar5.c().height()));
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                int i10 = LayoutEditorActivity.K0;
                layoutEditorActivity.B();
                q1 q1Var = (q1) layoutEditorActivity.A().f12728d.f3843e;
                q1Var.getClass();
                q1Var.k(null, arrayList);
                return yVar;
        }
    }
}
