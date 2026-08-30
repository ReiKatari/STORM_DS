package defpackage;

import android.animation.ValueAnimator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo0  reason: default package */
/* loaded from: classes.dex */
public final class jo0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ lo0 a;
    public final /* synthetic */ mo0 b;

    public jo0(mo0 mo0Var, lo0 lo0Var) {
        this.b = mo0Var;
        this.a = lo0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lo0 lo0Var = this.a;
        mo0.d(floatValue, lo0Var);
        mo0 mo0Var = this.b;
        mo0Var.a(floatValue, lo0Var, false);
        mo0Var.invalidateSelf();
    }
}
