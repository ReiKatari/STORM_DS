package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public final class ff {
    public static final ff a = new Object();

    public final void a(View view, ty4 ty4Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (ty4Var instanceof sj) {
            systemIcon = PointerIcon.getSystemIcon(context, ((sj) ty4Var).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!nb3.k(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
