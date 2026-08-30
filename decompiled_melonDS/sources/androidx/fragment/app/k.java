package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final e2 f1343a;

    public k(e2 e2Var) {
        e2Var.getClass();
        this.f1343a = e2Var;
    }

    public final boolean a() {
        i2 i2Var;
        e2 e2Var = this.f1343a;
        View view = e2Var.f1273c.mView;
        if (view != null) {
            i2.Companion.getClass();
            i2Var = g2.a(view);
        } else {
            i2Var = null;
        }
        i2 i2Var2 = e2Var.f1271a;
        if (i2Var != i2Var2) {
            i2 i2Var3 = i2.VISIBLE;
            if (i2Var == i2Var3 || i2Var2 == i2Var3) {
                return false;
            }
            return true;
        }
        return true;
    }
}
