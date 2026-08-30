package defpackage;

import me.magnum.melonds.ui.cheats.CheatsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fm0  reason: default package */
/* loaded from: classes.dex */
public final class fm0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CheatsActivity B;

    public /* synthetic */ fm0(CheatsActivity cheatsActivity, int i) {
        this.A = i;
        this.B = cheatsActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        CheatsActivity cheatsActivity = this.B;
        switch (i) {
            case 0:
                return cheatsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return cheatsActivity.getViewModelStore();
            default:
                return cheatsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
