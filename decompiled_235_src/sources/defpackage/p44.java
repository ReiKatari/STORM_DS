package defpackage;

import android.view.ActionProvider;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p44  reason: default package */
/* loaded from: classes.dex */
public final class p44 implements ActionProvider.VisibilityListener {
    public s63 a;
    public final ActionProvider b;

    public p44(s44 s44Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        s63 s63Var = this.a;
        if (s63Var != null) {
            i44 i44Var = ((o44) s63Var.B).n;
            i44Var.h = true;
            i44Var.p(true);
        }
    }
}
