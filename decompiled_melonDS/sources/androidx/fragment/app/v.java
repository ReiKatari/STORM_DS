package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends r0 {
    public final /* synthetic */ r0 A;
    public final /* synthetic */ w B;

    public v(w wVar, r0 r0Var) {
        this.B = wVar;
        this.A = r0Var;
    }

    @Override // androidx.fragment.app.r0
    public final View d(int i2) {
        r0 r0Var = this.A;
        if (r0Var.e()) {
            return r0Var.d(i2);
        }
        Dialog dialog = this.B.f1432f0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // androidx.fragment.app.r0
    public final boolean e() {
        if (!this.A.e() && !this.B.f1436j0) {
            return false;
        }
        return true;
    }
}
