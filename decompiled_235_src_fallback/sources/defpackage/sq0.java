package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq0  reason: default package */
/* loaded from: classes.dex */
public final class sq0 extends android.widget.ImageView {
    public android.view.animation.Animation.AnimationListener A;
    public int B;

    @Override // android.view.View
    public final void onAnimationEnd() {
            r1 = this;
            super.onAnimationEnd()
            android.view.animation.Animation$AnimationListener r0 = r1.A
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r1.getAnimation()
            r0.onAnimationEnd(r1)
        Le:
            return
    }

    @Override // android.view.View
    public final void onAnimationStart() {
            r1 = this;
            super.onAnimationStart()
            android.view.animation.Animation$AnimationListener r0 = r1.A
            if (r0 == 0) goto Le
            android.view.animation.Animation r1 = r1.getAnimation()
            r0.onAnimationStart(r1)
        Le:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            android.graphics.drawable.ShapeDrawable r0 = (android.graphics.drawable.ShapeDrawable) r0
            android.graphics.Paint r0 = r0.getPaint()
            r0.setColor(r2)
            r1.B = r2
        L17:
            return
    }
}
