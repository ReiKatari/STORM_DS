package defpackage;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: de3  reason: default package */
/* loaded from: classes.dex */
public final class de3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutEditorActivity B;

    public /* synthetic */ de3(LayoutEditorActivity layoutEditorActivity, int i) {
        this.A = i;
        this.B = layoutEditorActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        LayoutEditorActivity layoutEditorActivity = this.B;
        switch (i) {
            case 0:
                return layoutEditorActivity.getDefaultViewModelProviderFactory();
            case 1:
                return layoutEditorActivity.getViewModelStore();
            default:
                return layoutEditorActivity.getDefaultViewModelCreationExtras();
        }
    }
}
