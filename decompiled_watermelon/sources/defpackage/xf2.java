package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xf2  reason: default package */
/* loaded from: classes.dex */
public final class xf2 extends AnimationSet implements Runnable {
    public final ViewGroup A;
    public final View B;
    public boolean L;
    public boolean R;
    public boolean X;

    public xf2(Animation animation, ViewGroup viewGroup, View view) {
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
            hd4.a(this.A, this);
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
            hd4.a(this.A, this);
        }
        return true;
    }
}
