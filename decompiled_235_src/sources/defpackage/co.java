package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co  reason: default package */
/* loaded from: classes.dex */
public final class co extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public co(Drawable.ConstantState constantState) {
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
        eo eoVar = new eo(null);
        Drawable newDrawable = this.a.newDrawable();
        eoVar.A = newDrawable;
        newDrawable.setCallback(eoVar.Y);
        return eoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        eo eoVar = new eo(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        eoVar.A = newDrawable;
        newDrawable.setCallback(eoVar.Y);
        return eoVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        eo eoVar = new eo(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        eoVar.A = newDrawable;
        newDrawable.setCallback(eoVar.Y);
        return eoVar;
    }
}
