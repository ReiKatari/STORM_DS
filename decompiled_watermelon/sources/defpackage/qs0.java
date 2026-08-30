package defpackage;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qs0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qs0 implements dn3 {
    public final /* synthetic */ kc4 A;
    public final /* synthetic */ ys0 B;

    public /* synthetic */ qs0(kc4 kc4Var, ys0 ys0Var) {
        this.A = kc4Var;
        this.B = ys0Var;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (pm3Var == pm3.ON_CREATE) {
            onBackInvokedDispatcher = this.B.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.A.d(onBackInvokedDispatcher);
        }
    }
}
