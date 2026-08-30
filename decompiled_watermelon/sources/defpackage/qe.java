package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qe  reason: default package */
/* loaded from: classes.dex */
public final class qe {
    public static final qe a = new Object();

    public final void a(View view, pp4 pp4Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (pp4Var instanceof gj) {
            systemIcon = PointerIcon.getSystemIcon(context, ((gj) pp4Var).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!b53.x(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
