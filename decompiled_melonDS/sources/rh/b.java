package rh;

import android.content.Context;
import android.content.res.Resources;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends o.c implements h.i {
    public final /* synthetic */ LayoutEditorActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LayoutEditorActivity layoutEditorActivity, Context context) {
        super(context);
        Resources.Theme theme = layoutEditorActivity.getTheme();
        this.B = theme;
        this.Z = layoutEditorActivity;
    }

    @Override // h.i
    public final h.h m() {
        return this.Z.f3294c0;
    }
}
