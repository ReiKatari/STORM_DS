package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import b4.r0;
import me.magnum.melonds.R;
import n2.b0;
import n2.m;
import n2.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f4144a = new b0(new a3.g(16));

    public static d.b0 a(m mVar) {
        d.b0 b0Var;
        r rVar = (r) mVar;
        d.b0 b0Var2 = (d.b0) rVar.j(f4144a);
        d.b0 b0Var3 = null;
        if (b0Var2 == null) {
            rVar.X(1208426157);
            View view = (View) rVar.j(r0.f1941f);
            view.getClass();
            while (true) {
                if (view != null) {
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    if (tag instanceof d.b0) {
                        b0Var = (d.b0) tag;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        b0Var2 = b0Var;
                        break;
                    }
                    ViewParent D = a.a.D(view);
                    if (D instanceof View) {
                        view = (View) D;
                    } else {
                        view = null;
                    }
                } else {
                    b0Var2 = null;
                    break;
                }
            }
            rVar.p(false);
        } else {
            rVar.X(1208423708);
            rVar.p(false);
        }
        if (b0Var2 == null) {
            rVar.X(1208428160);
            Context context = (Context) rVar.j(r0.f1937b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof d.b0) {
                    b0Var3 = context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            d.b0 b0Var4 = b0Var3;
            rVar.p(false);
            return b0Var4;
        }
        rVar.X(1208423789);
        rVar.p(false);
        return b0Var2;
    }
}
