package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co  reason: default package */
/* loaded from: classes.dex */
public final class co extends android.graphics.drawable.Drawable.ConstantState {
    public final android.graphics.drawable.Drawable.ConstantState a;

    public co(android.graphics.drawable.Drawable.ConstantState r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
            r0 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r0.a
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r0 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r0.a
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r2 = this;
            eo r0 = new eo
            r1 = 0
            r0.<init>(r1)
            android.graphics.drawable.Drawable$ConstantState r2 = r2.a
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            r0.A = r2
            ao r1 = r0.Y
            r2.setCallback(r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
            r2 = this;
            eo r0 = new eo
            r1 = 0
            r0.<init>(r1)
            android.graphics.drawable.Drawable$ConstantState r2 = r2.a
            android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
            r0.A = r2
            ao r3 = r0.Y
            r2.setCallback(r3)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
            r2 = this;
            eo r0 = new eo
            r1 = 0
            r0.<init>(r1)
            android.graphics.drawable.Drawable$ConstantState r2 = r2.a
            android.graphics.drawable.Drawable r2 = r2.newDrawable(r3, r4)
            r0.A = r2
            ao r3 = r0.Y
            r2.setCallback(r3)
            return r0
    }
}
