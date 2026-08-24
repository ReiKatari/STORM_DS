package defpackage;

import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: on3  reason: default package */
/* loaded from: classes.dex */
public final class on3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutSelectorActivity B;

    public /* synthetic */ on3(LayoutSelectorActivity layoutSelectorActivity, int i) {
        this.A = i;
        this.B = layoutSelectorActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        LayoutSelectorActivity layoutSelectorActivity = this.B;
        switch (i) {
            case 0:
                return layoutSelectorActivity.getDefaultViewModelProviderFactory();
            case 1:
                return layoutSelectorActivity.getViewModelStore();
            default:
                return layoutSelectorActivity.getDefaultViewModelCreationExtras();
        }
    }
}
