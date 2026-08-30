package defpackage;

import android.view.ActionProvider;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax3  reason: default package */
/* loaded from: classes.dex */
public final class ax3 implements ActionProvider.VisibilityListener {
    public ka3 a;
    public final ActionProvider b;

    public ax3(dx3 dx3Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ka3 ka3Var = this.a;
        if (ka3Var != null) {
            uw3 uw3Var = ((zw3) ka3Var.B).n;
            uw3Var.h = true;
            uw3Var.p(true);
        }
    }
}
