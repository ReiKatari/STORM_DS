package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn7  reason: default package */
/* loaded from: classes.dex */
public final class rn7 implements View.OnApplyWindowInsetsListener {
    public vu7 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ zk4 c;

    public rn7(View view, zk4 zk4Var) {
        this.b = view;
        this.c = zk4Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        vu7 g = vu7.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        zk4 zk4Var = this.c;
        if (i < 30) {
            sn7.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return zk4Var.U(view, g).f();
            }
        }
        this.a = g;
        vu7 U = zk4Var.U(view, g);
        if (i >= 30) {
            return U.f();
        }
        WeakHashMap weakHashMap = ao7.a;
        view.requestApplyInsets();
        return U.f();
    }
}
