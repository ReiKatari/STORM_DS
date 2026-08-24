package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al7  reason: default package */
/* loaded from: classes.dex */
public final class al7 extends android.graphics.drawable.Drawable.ConstantState {
    public final android.graphics.drawable.Drawable.ConstantState a;

    public al7(android.graphics.drawable.Drawable.ConstantState r1) {
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
    public int getChangingConfigurations() {
            r0 = this;
            android.graphics.drawable.Drawable$ConstantState r0 = r0.a
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            bl7 r0 = new bl7
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.a
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
            r0.A = r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            r1 = this;
            bl7 r0 = new bl7
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.a
            android.graphics.drawable.Drawable r1 = r1.newDrawable(r2)
            android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
            r0.A = r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2, android.content.res.Resources.Theme r3) {
            r1 = this;
            bl7 r0 = new bl7
            r0.<init>()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.a
            android.graphics.drawable.Drawable r1 = r1.newDrawable(r2, r3)
            android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
            r0.A = r1
            return r0
    }
}
