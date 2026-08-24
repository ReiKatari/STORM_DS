package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tn7  reason: default package */
/* loaded from: classes.dex */
public abstract class tn7 {
    public static vu7 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vu7 g = vu7.g(null, rootWindowInsets);
        ru7 ru7Var = g.a;
        ru7Var.w(g);
        View rootView = view.getRootView();
        ru7Var.d(rootView);
        ru7Var.o(rootView);
        ru7Var.p();
        return g;
    }
}
