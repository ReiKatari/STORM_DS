package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g24  reason: default package */
/* loaded from: classes.dex */
public final class g24 {
    public fn a;
    public final /* synthetic */ i24 b;

    public g24(i24 i24Var) {
        this.b = i24Var;
    }

    public final void a(Drawable drawable) {
        i24 i24Var = this.b;
        ColorStateList colorStateList = i24Var.n0;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(i24Var.r0, colorStateList.getDefaultColor()));
        }
    }
}
