package defpackage;

import android.content.Context;
import android.content.res.Resources;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y82  reason: default package */
/* loaded from: classes.dex */
public final class y82 extends p41 implements l9 {
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(LayoutEditorActivity layoutEditorActivity, Context context) {
        super(context);
        Resources.Theme theme = layoutEditorActivity.getTheme();
        this.B = theme;
        this.Z = layoutEditorActivity;
    }

    @Override // defpackage.l9
    public final j9 g() {
        return this.Z.e0;
    }
}
