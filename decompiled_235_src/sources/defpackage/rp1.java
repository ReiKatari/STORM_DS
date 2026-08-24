package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rp1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp1(vp1 vp1Var) {
        this.b = vp1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vp1) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((View) ((nt7) ((j97) obj).B).o.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ rp1(j97 j97Var, View view) {
        this.b = j97Var;
    }
}
