package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al7  reason: default package */
/* loaded from: classes.dex */
public final class al7 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public al7(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bl7 bl7Var = new bl7();
        bl7Var.A = (VectorDrawable) this.a.newDrawable();
        return bl7Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bl7 bl7Var = new bl7();
        bl7Var.A = (VectorDrawable) this.a.newDrawable(resources);
        return bl7Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bl7 bl7Var = new bl7();
        bl7Var.A = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bl7Var;
    }
}
