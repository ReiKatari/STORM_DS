package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xu3  reason: default package */
/* loaded from: classes.dex */
public final class xu3 {
    public tm a;
    public final /* synthetic */ zu3 b;

    public xu3(zu3 zu3Var) {
        this.b = zu3Var;
    }

    public final void a(Drawable drawable) {
        zu3 zu3Var = this.b;
        ColorStateList colorStateList = zu3Var.m0;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(zu3Var.q0, colorStateList.getDefaultColor()));
        }
    }
}
