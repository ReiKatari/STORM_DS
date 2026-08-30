package g7;

import android.view.View;
import android.view.ViewParent;
import b4.r0;
import f7.c;
import g2.v3;
import me.magnum.melonds.R;
import n2.b0;
import n2.m;
import n2.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f5602a = new b0(new v3(3));

    public static c a(m mVar) {
        c cVar;
        c cVar2;
        r rVar = (r) mVar;
        c cVar3 = (c) rVar.j(f5602a);
        if (cVar3 == null) {
            rVar.X(950836184);
            View view = (View) rVar.j(r0.f1941f);
            view.getClass();
            while (true) {
                cVar = null;
                if (view == null) {
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                if (tag instanceof c) {
                    cVar2 = (c) tag;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                ViewParent D = a.a.D(view);
                if (D instanceof View) {
                    view = (View) D;
                } else {
                    view = null;
                }
            }
            rVar.p(false);
            return cVar;
        }
        rVar.X(950834231);
        rVar.p(false);
        return cVar3;
    }
}
