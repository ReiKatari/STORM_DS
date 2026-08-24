package defpackage;

import me.magnum.melonds.ui.cheats.CheatsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no0  reason: default package */
/* loaded from: classes.dex */
public final class no0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CheatsActivity B;

    public /* synthetic */ no0(CheatsActivity cheatsActivity, int i) {
        this.A = i;
        this.B = cheatsActivity;
    }

    @Override // defpackage.on2
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
