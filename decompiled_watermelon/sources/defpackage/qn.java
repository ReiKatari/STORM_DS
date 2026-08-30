package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn  reason: default package */
/* loaded from: classes.dex */
public final class qn extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public qn(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        rn rnVar = new rn(null);
        Drawable newDrawable = this.a.newDrawable();
        rnVar.A = newDrawable;
        newDrawable.setCallback(rnVar.Y);
        return rnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        rn rnVar = new rn(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        rnVar.A = newDrawable;
        newDrawable.setCallback(rnVar.Y);
        return rnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        rn rnVar = new rn(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        rnVar.A = newDrawable;
        newDrawable.setCallback(rnVar.Y);
        return rnVar;
    }
}
