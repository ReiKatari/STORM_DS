package defpackage;

import me.magnum.melonds.ui.layouts.LayoutListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm3  reason: default package */
/* loaded from: classes.dex */
public final class fm3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutListActivity B;

    public /* synthetic */ fm3(LayoutListActivity layoutListActivity, int i) {
        this.A = i;
        this.B = layoutListActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        LayoutListActivity layoutListActivity = this.B;
        switch (i) {
            case 0:
                return layoutListActivity.getDefaultViewModelProviderFactory();
            case 1:
                return layoutListActivity.getViewModelStore();
            default:
                return layoutListActivity.getDefaultViewModelCreationExtras();
        }
    }
}
