package defpackage;

import me.magnum.melonds.ui.layouts.LayoutListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if3  reason: default package */
/* loaded from: classes.dex */
public final class if3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutListActivity B;

    public /* synthetic */ if3(LayoutListActivity layoutListActivity, int i) {
        this.A = i;
        this.B = layoutListActivity;
    }

    @Override // defpackage.ki2
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
