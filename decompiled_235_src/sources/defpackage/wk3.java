package defpackage;

import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk3  reason: default package */
/* loaded from: classes.dex */
public final class wk3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ LayoutEditorActivity B;

    public /* synthetic */ wk3(LayoutEditorActivity layoutEditorActivity, int i) {
        this.A = i;
        this.B = layoutEditorActivity;
    }

    @Override // defpackage.on2
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
