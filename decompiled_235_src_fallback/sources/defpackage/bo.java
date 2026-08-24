package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo  reason: default package */
/* loaded from: classes.dex */
public final class bo extends android.graphics.drawable.Drawable.ConstantState {
    public defpackage.bl7 a;
    public android.animation.AnimatorSet b;
    public java.util.ArrayList c;
    public defpackage.wu d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "No constant state support for SDK < 24."
            r1.<init>(r0)
            throw r1
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No constant state support for SDK < 24."
            r0.<init>(r1)
            throw r0
    }
}
