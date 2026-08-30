package b4;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f1865a = new Object();

    public final void a(View view, v3.q qVar) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (qVar instanceof v3.a) {
            systemIcon = PointerIcon.getSystemIcon(context, ((v3.a) qVar).f13629b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!nc.k.a(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
