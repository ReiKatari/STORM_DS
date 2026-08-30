package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be3  reason: default package */
/* loaded from: classes.dex */
public final class be3 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutEditorActivity B;

    public /* synthetic */ be3(LayoutEditorActivity layoutEditorActivity, int i) {
        this.A = i;
        this.B = layoutEditorActivity;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        b bVar;
        LayoutEditorView layoutEditorView;
        h42 h42Var;
        b bVar2;
        kv5 kv5Var;
        if4 if4Var;
        jv5 jv5Var;
        int i = this.A;
        o27 o27Var = o27.a;
        LayoutEditorActivity layoutEditorActivity = this.B;
        switch (i) {
            case 0:
                m41 m41Var = (m41) obj;
                if (m41Var == null) {
                    b bVar3 = layoutEditorActivity.E0;
                    if (bVar3 != null) {
                        bVar3.getLayoutEditorView().b();
                        h42 h42Var2 = layoutEditorActivity.H0;
                        if (h42Var2 != null && (bVar = h42Var2.A) != null && (layoutEditorView = bVar.getLayoutEditorView()) != null) {
                            layoutEditorView.b();
                        }
                    } else {
                        b53.g0("layoutEditorManager");
                        throw null;
                    }
                } else {
                    Handler handler = layoutEditorActivity.F0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        Handler handler2 = layoutEditorActivity.F0;
                        if (handler2 != null) {
                            handler2.post(new we(25, layoutEditorActivity, m41Var));
                        } else {
                            b53.g0("handler");
                            throw null;
                        }
                    } else {
                        b53.g0("handler");
                        throw null;
                    }
                }
                return o27Var;
            case 1:
                bs5 bs5Var = (bs5) obj;
                if (bs5Var != null) {
                    b bVar4 = layoutEditorActivity.E0;
                    if (bVar4 != null) {
                        bVar4.D(bs5Var);
                    } else {
                        b53.g0("layoutEditorManager");
                        throw null;
                    }
                }
                return o27Var;
            case 2:
                bs5 bs5Var2 = (bs5) obj;
                if (bs5Var2 != null && (h42Var = layoutEditorActivity.H0) != null && (bVar2 = h42Var.A) != null) {
                    bVar2.D(bs5Var2);
                }
                return o27Var;
            default:
                List<kq2> list = ((kg7) obj).a;
                ArrayList arrayList = new ArrayList();
                for (kq2 kq2Var : list) {
                    if (kq2Var instanceof kq2) {
                        t40 t40Var = kq2Var.a;
                        if (kq2Var.a() != an1.c0) {
                            if4Var = if4.PORTRAIT;
                        } else {
                            if4Var = if4.LANDSCAPE;
                        }
                        if (kq2Var.b()) {
                            jv5Var = jv5.SEAMLESS;
                        } else {
                            jv5Var = jv5.GAP;
                        }
                        kv5Var = new kv5(if4Var, jv5Var, new Rect(t40Var.c().left, t40Var.c().top, t40Var.c().width(), t40Var.c().height()));
                    } else {
                        kv5Var = null;
                    }
                    if (kv5Var != null) {
                        arrayList.add(kv5Var);
                    }
                }
                int i2 = LayoutEditorActivity.M0;
                layoutEditorActivity.C();
                ee6 ee6Var = (ee6) layoutEditorActivity.B().d.X;
                ee6Var.getClass();
                ee6Var.l(null, arrayList);
                return o27Var;
        }
    }
}
