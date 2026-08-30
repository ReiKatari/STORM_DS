package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class f {
    public final b0 a;

    public f(b0 b0Var) {
        b0Var.getClass();
        this.a = b0Var;
    }

    public final boolean a() {
        kc6 kc6Var;
        b0 b0Var = this.a;
        View view = b0Var.c.mView;
        if (view != null) {
            kc6.Companion.getClass();
            kc6Var = ic6.a(view);
        } else {
            kc6Var = null;
        }
        kc6 kc6Var2 = b0Var.a;
        if (kc6Var != kc6Var2) {
            kc6 kc6Var3 = kc6.VISIBLE;
            if (kc6Var == kc6Var3 || kc6Var2 == kc6Var3) {
                return false;
            }
            return true;
        }
        return true;
    }
}
