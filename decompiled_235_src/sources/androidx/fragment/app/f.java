package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class f {
    public final b0 a;

    public f(b0 b0Var) {
        b0Var.getClass();
        this.a = b0Var;
    }

    public final boolean a() {
        ao6 ao6Var;
        b0 b0Var = this.a;
        View view = b0Var.c.mView;
        if (view != null) {
            ao6.Companion.getClass();
            ao6Var = yn6.a(view);
        } else {
            ao6Var = null;
        }
        ao6 ao6Var2 = b0Var.a;
        if (ao6Var != ao6Var2) {
            ao6 ao6Var3 = ao6.VISIBLE;
            if (ao6Var == ao6Var3 || ao6Var2 == ao6Var3) {
                return false;
            }
            return true;
        }
        return true;
    }
}
