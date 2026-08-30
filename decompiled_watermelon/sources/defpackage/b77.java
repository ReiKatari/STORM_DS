package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b77  reason: default package */
/* loaded from: classes.dex */
public final class b77 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public b77(Drawable.ConstantState constantState) {
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
        c77 c77Var = new c77();
        c77Var.A = (VectorDrawable) this.a.newDrawable();
        return c77Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        c77 c77Var = new c77();
        c77Var.A = (VectorDrawable) this.a.newDrawable(resources);
        return c77Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        c77 c77Var = new c77();
        c77Var.A = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c77Var;
    }
}
