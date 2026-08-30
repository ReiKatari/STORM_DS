package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r97  reason: default package */
/* loaded from: classes.dex */
public final class r97 implements View.OnApplyWindowInsetsListener {
    public vf7 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ bc4 c;

    public r97(View view, bc4 bc4Var) {
        this.b = view;
        this.c = bc4Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        vf7 g = vf7.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        bc4 bc4Var = this.c;
        if (i < 30) {
            s97.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return bc4Var.G(view, g).f();
            }
        }
        this.a = g;
        vf7 G = bc4Var.G(view, g);
        if (i >= 30) {
            return G.f();
        }
        WeakHashMap weakHashMap = aa7.a;
        view.requestApplyInsets();
        return G.f();
    }
}
