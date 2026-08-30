package a6;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f448a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f449b;

    public /* synthetic */ d1(l.i0 i0Var, View view) {
        this.f449b = i0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f448a) {
            case 0:
                ((View) ((l.k0) ((l.i0) this.f449b).B).f8427o.getParent()).invalidate();
                return;
            default:
                ((qa.j) this.f449b).f12459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ d1(qa.j jVar) {
        this.f449b = jVar;
    }
}
