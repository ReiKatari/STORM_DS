package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kl1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kl1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl1(ol1 ol1Var) {
        this.b = ol1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ol1) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((le7) ((u57) obj).B).r0.getParent()).invalidate();
                return;
        }
    }
}
