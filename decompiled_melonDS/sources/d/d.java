package d;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.v {
    public final /* synthetic */ a0 A;
    public final /* synthetic */ k B;

    public /* synthetic */ d(a0 a0Var, k kVar) {
        this.A = a0Var;
        this.B = kVar;
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        if (pVar == androidx.lifecycle.p.ON_CREATE) {
            OnBackInvokedDispatcher q10 = b6.c.q(this.B);
            q10.getClass();
            this.A.d(q10);
        }
    }
}
