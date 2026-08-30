package a8;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ImageView {
    public Animation.AnimationListener A;
    public int B;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.A;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.A;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
            this.B = i2;
        }
    }
}
