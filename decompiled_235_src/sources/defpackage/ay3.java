package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay3  reason: default package */
/* loaded from: classes.dex */
public abstract class ay3 {
    public static final py0 a = new py0(new pi3(8));

    public static id4 a(px0 px0Var) {
        id4 id4Var;
        id4 id4Var2;
        xq2 xq2Var = (xq2) px0Var;
        id4 id4Var3 = (id4) xq2Var.j(a);
        if (id4Var3 == null) {
            xq2Var.b0(950836184);
            View view = (View) xq2Var.j(kf.f);
            view.getClass();
            while (true) {
                id4Var = null;
                if (view == null) {
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                if (tag instanceof id4) {
                    id4Var2 = (id4) tag;
                } else {
                    id4Var2 = null;
                }
                if (id4Var2 != null) {
                    id4Var = id4Var2;
                    break;
                }
                ViewParent s = xk2.s(view);
                if (s instanceof View) {
                    view = (View) s;
                } else {
                    view = null;
                }
            }
            xq2Var.p(false);
            return id4Var;
        }
        xq2Var.b0(950834231);
        xq2Var.p(false);
        return id4Var3;
    }
}
