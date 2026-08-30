package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar3  reason: default package */
/* loaded from: classes.dex */
public abstract class ar3 {
    public static final tv0 a = new tv0(new vq3(3));

    public static lc4 a(tu0 tu0Var) {
        lc4 lc4Var;
        sk2 sk2Var = (sk2) tu0Var;
        lc4 lc4Var2 = (lc4) sk2Var.j(a);
        lc4 lc4Var3 = null;
        if (lc4Var2 == null) {
            sk2Var.X(1208426157);
            View view = (View) sk2Var.j(ue.f);
            view.getClass();
            while (true) {
                if (view != null) {
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    if (tag instanceof lc4) {
                        lc4Var = (lc4) tag;
                    } else {
                        lc4Var = null;
                    }
                    if (lc4Var != null) {
                        lc4Var2 = lc4Var;
                        break;
                    }
                    ViewParent z = hk2.z(view);
                    if (z instanceof View) {
                        view = (View) z;
                    } else {
                        view = null;
                    }
                } else {
                    lc4Var2 = null;
                    break;
                }
            }
        } else {
            sk2Var.X(1208423708);
        }
        sk2Var.p(false);
        if (lc4Var2 == null) {
            sk2Var.X(1208428160);
            Context context = (Context) sk2Var.j(ue.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof lc4) {
                    lc4Var3 = context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            lc4 lc4Var4 = lc4Var3;
            sk2Var.p(false);
            return lc4Var4;
        }
        sk2Var.X(1208423789);
        sk2Var.p(false);
        return lc4Var2;
    }
}
