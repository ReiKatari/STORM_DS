package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr  reason: default package */
/* loaded from: classes.dex */
public class nr extends android.widget.ImageView {
    public final defpackage.z9 A;
    public final defpackage.ei B;
    public boolean L;

    public nr(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.h67.a(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.L = r1
            android.content.Context r1 = r0.getContext()
            defpackage.h57.a(r0, r1)
            z9 r1 = new z9
            r1.<init>(r0)
            r0.A = r1
            r1.k(r2, r3)
            ei r1 = new ei
            r1.<init>(r0)
            r0.B = r1
            r1.j(r2, r3)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            z9 r0 = r1.A
            if (r0 == 0) goto La
            r0.a()
        La:
            ei r1 = r1.B
            if (r1 == 0) goto L11
            r1.b()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.h()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.i()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            r0 = 0
            ei r1 = r1.B
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.R
            wz0 r1 = (defpackage.wz0) r1
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            return r1
        L10:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            r0 = 0
            ei r1 = r1.B
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.R
            wz0 r1 = (defpackage.wz0) r1
            if (r1 == 0) goto L10
            java.io.Serializable r1 = r1.d
            android.graphics.PorterDuff$Mode r1 = (android.graphics.PorterDuff.Mode) r1
            return r1
        L10:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
            r1 = this;
            ei r0 = r1.B
            java.lang.Object r0 = r0.L
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 != 0) goto L16
            boolean r1 = super.hasOverlappingRendering()
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.n()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.o(r1)
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            super.setImageBitmap(r1)
            ei r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            ei r0 = r2.B
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            boolean r1 = r2.L
            if (r1 != 0) goto L10
            int r1 = r3.getLevel()
            r0.B = r1
        L10:
            super.setImageDrawable(r3)
            if (r0 == 0) goto L2f
            r0.b()
            boolean r2 = r2.L
            if (r2 != 0) goto L2f
            java.lang.Object r2 = r0.L
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 == 0) goto L2f
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            int r3 = r0.B
            r2.setLevel(r3)
        L2f:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
            r0 = this;
            super.setImageLevel(r1)
            r1 = 1
            r0.L = r1
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r3) {
            r2 = this;
            ei r2 = r2.B
            if (r2 == 0) goto L22
            java.lang.Object r0 = r2.L
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r3 == 0) goto L1b
            android.content.Context r1 = r0.getContext()
            android.graphics.drawable.Drawable r3 = defpackage.hf.S(r1, r3)
            if (r3 == 0) goto L17
            defpackage.bp1.a(r3)
        L17:
            r0.setImageDrawable(r3)
            goto L1f
        L1b:
            r3 = 0
            r0.setImageDrawable(r3)
        L1f:
            r2.b()
        L22:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            ei r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.t(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.u(r1)
        L7:
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            ei r1 = r1.B
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r1.R
            wz0 r0 = (defpackage.wz0) r0
            if (r0 != 0) goto L11
            wz0 r0 = new wz0
            r0.<init>()
            r1.R = r0
        L11:
            java.lang.Object r0 = r1.R
            wz0 r0 = (defpackage.wz0) r0
            r0.c = r2
            r2 = 1
            r0.b = r2
            r1.b()
        L1d:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            ei r1 = r1.B
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r1.R
            wz0 r0 = (defpackage.wz0) r0
            if (r0 != 0) goto L11
            wz0 r0 = new wz0
            r0.<init>()
            r1.R = r0
        L11:
            java.lang.Object r0 = r1.R
            wz0 r0 = (defpackage.wz0) r0
            r0.d = r2
            r2 = 1
            r0.a = r2
            r1.b()
        L1d:
            return
    }
}
