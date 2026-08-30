package defpackage;

import android.content.Context;
import android.content.res.Resources;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g42  reason: default package */
/* loaded from: classes.dex */
public final class g42 extends h11 implements k9 {
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(LayoutEditorActivity layoutEditorActivity, Context context) {
        super(context);
        Resources.Theme theme = layoutEditorActivity.getTheme();
        this.B = theme;
        this.Z = layoutEditorActivity;
    }

    @Override // defpackage.k9
    public final i9 l() {
        return this.Z.d0;
    }
}
