package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t97  reason: default package */
/* loaded from: classes.dex */
public abstract class t97 {
    public static vf7 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vf7 g = vf7.g(null, rootWindowInsets);
        rf7 rf7Var = g.a;
        rf7Var.w(g);
        View rootView = view.getRootView();
        rf7Var.d(rootView);
        rf7Var.o(rootView);
        rf7Var.p();
        return g;
    }
}
