package defpackage;

import android.animation.ValueAnimator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq0  reason: default package */
/* loaded from: classes.dex */
public final class tq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ vq0 a;
    public final /* synthetic */ wq0 b;

    public tq0(wq0 wq0Var, vq0 vq0Var) {
        this.b = wq0Var;
        this.a = vq0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vq0 vq0Var = this.a;
        wq0.d(floatValue, vq0Var);
        wq0 wq0Var = this.b;
        wq0Var.a(floatValue, vq0Var, false);
        wq0Var.invalidateSelf();
    }
}
