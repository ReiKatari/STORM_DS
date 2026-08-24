package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk3  reason: default package */
/* loaded from: classes.dex */
public final class uk3 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutEditorActivity B;

    public /* synthetic */ uk3(LayoutEditorActivity layoutEditorActivity, int i) {
        this.A = i;
        this.B = layoutEditorActivity;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        b bVar;
        LayoutEditorView layoutEditorView;
        z82 z82Var;
        b bVar2;
        x66 x66Var;
        ko4 ko4Var;
        w66 w66Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        LayoutEditorActivity layoutEditorActivity = this.B;
        switch (i) {
            case 0:
                w71 w71Var = (w71) obj;
                if (w71Var == null) {
                    b bVar3 = layoutEditorActivity.F0;
                    if (bVar3 != null) {
                        bVar3.getLayoutEditorView().b();
                        z82 z82Var2 = layoutEditorActivity.I0;
                        if (z82Var2 != null && (bVar = z82Var2.A) != null && (layoutEditorView = bVar.getLayoutEditorView()) != null) {
                            layoutEditorView.b();
                        }
                    } else {
                        nb3.a0("layoutEditorManager");
                        throw null;
                    }
                } else {
                    Handler handler = layoutEditorActivity.G0;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        Handler handler2 = layoutEditorActivity.G0;
                        if (handler2 != null) {
                            handler2.post(new mf(25, layoutEditorActivity, w71Var));
                        } else {
                            nb3.a0("handler");
                            throw null;
                        }
                    } else {
                        nb3.a0("handler");
                        throw null;
                    }
                }
                return jg7Var;
            case 1:
                t26 t26Var = (t26) obj;
                if (t26Var != null) {
                    b bVar4 = layoutEditorActivity.F0;
                    if (bVar4 != null) {
                        bVar4.C(t26Var);
                    } else {
                        nb3.a0("layoutEditorManager");
                        throw null;
                    }
                }
                return jg7Var;
            case 2:
                t26 t26Var2 = (t26) obj;
                if (t26Var2 != null && (z82Var = layoutEditorActivity.I0) != null && (bVar2 = z82Var.A) != null) {
                    bVar2.C(t26Var2);
                }
                return jg7Var;
            default:
                List<lw2> list = ((kv7) obj).a;
                ArrayList arrayList = new ArrayList();
                for (lw2 lw2Var : list) {
                    if (lw2Var instanceof lw2) {
                        w60 w60Var = lw2Var.a;
                        if (lw2Var.a() != gr1.d0) {
                            ko4Var = ko4.PORTRAIT;
                        } else {
                            ko4Var = ko4.LANDSCAPE;
                        }
                        if (lw2Var.b()) {
                            w66Var = w66.SEAMLESS;
                        } else {
                            w66Var = w66.GAP;
                        }
                        x66Var = new x66(ko4Var, w66Var, new Rect(w60Var.c().left, w60Var.c().top, w60Var.c().width(), w60Var.c().height()));
                    } else {
                        x66Var = null;
                    }
                    if (x66Var != null) {
                        arrayList.add(x66Var);
                    }
                }
                int i2 = LayoutEditorActivity.N0;
                layoutEditorActivity.D();
                layoutEditorActivity.C().d.n(arrayList);
                return jg7Var;
        }
    }
}
