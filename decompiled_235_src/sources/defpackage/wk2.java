package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk2  reason: default package */
/* loaded from: classes.dex */
public final class wk2 extends AnimationSet implements Runnable {
    public final ViewGroup A;
    public final View B;
    public boolean L;
    public boolean R;
    public boolean X;

    public wk2(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.X = true;
        this.A = viewGroup;
        this.B = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.X = true;
        if (this.L) {
            return !this.R;
        }
        if (!super.getTransformation(j, transformation)) {
            this.L = true;
            fm4.a(this.A, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.L;
        ViewGroup viewGroup = this.A;
        if (!z && this.X) {
            this.X = false;
            viewGroup.post(this);
            return;
        }
        viewGroup.endViewTransition(this.B);
        this.R = true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.X = true;
        if (this.L) {
            return !this.R;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.L = true;
            fm4.a(this.A, this);
        }
        return true;
    }
}
