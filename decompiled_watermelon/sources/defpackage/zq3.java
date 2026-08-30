package defpackage;

import android.view.View;
import android.view.ViewParent;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zq3  reason: default package */
/* loaded from: classes.dex */
public abstract class zq3 {
    public static final tv0 a = new tv0(new vq3(2));

    public static c54 a(tu0 tu0Var) {
        c54 c54Var;
        c54 c54Var2;
        sk2 sk2Var = (sk2) tu0Var;
        c54 c54Var3 = (c54) sk2Var.j(a);
        if (c54Var3 == null) {
            sk2Var.X(950836184);
            View view = (View) sk2Var.j(ue.f);
            view.getClass();
            while (true) {
                c54Var = null;
                if (view == null) {
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                if (tag instanceof c54) {
                    c54Var2 = (c54) tag;
                } else {
                    c54Var2 = null;
                }
                if (c54Var2 != null) {
                    c54Var = c54Var2;
                    break;
                }
                ViewParent z = hk2.z(view);
                if (z instanceof View) {
                    view = (View) z;
                } else {
                    view = null;
                }
            }
            sk2Var.p(false);
            return c54Var;
        }
        sk2Var.X(950834231);
        sk2Var.p(false);
        return c54Var3;
    }
}
