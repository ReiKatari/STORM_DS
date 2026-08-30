package defpackage;

import me.magnum.melonds.ui.layouts.LayoutSelectorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qg3  reason: default package */
/* loaded from: classes.dex */
public final class qg3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutSelectorActivity B;

    public /* synthetic */ qg3(LayoutSelectorActivity layoutSelectorActivity, int i) {
        this.A = i;
        this.B = layoutSelectorActivity;
    }

    @Override // defpackage.ki2
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
