package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends AnimationSet implements Runnable {
    public final ViewGroup A;
    public final View B;
    public boolean L;
    public boolean R;
    public boolean X;

    public q0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.X = true;
        this.A = viewGroup;
        this.B = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.X = true;
        if (this.L) {
            return !this.R;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.L = true;
            a6.x.a(this.A, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.L;
        ViewGroup viewGroup = this.A;
        if (!z10 && this.X) {
            this.X = false;
            viewGroup.post(this);
            return;
        }
        viewGroup.endViewTransition(this.B);
        this.R = true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f8) {
        this.X = true;
        if (this.L) {
            return !this.R;
        }
        if (!super.getTransformation(j2, transformation, f8)) {
            this.L = true;
            a6.x.a(this.A, this);
        }
        return true;
    }
}
