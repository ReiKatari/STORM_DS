package defpackage;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ev0 implements fu3 {
    public final /* synthetic */ il4 A;
    public final /* synthetic */ mv0 B;

    public /* synthetic */ ev0(il4 il4Var, mv0 mv0Var) {
        this.A = il4Var;
        this.B = mv0Var;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (st3Var == st3.ON_CREATE) {
            onBackInvokedDispatcher = this.B.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.A.d(onBackInvokedDispatcher);
        }
    }
}
