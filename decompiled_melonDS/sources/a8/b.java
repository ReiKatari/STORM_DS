package a8;

import android.animation.ValueAnimator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f639b;

    public b(e eVar, d dVar) {
        this.f639b = eVar;
        this.f638a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f638a;
        e.d(floatValue, dVar);
        e eVar = this.f639b;
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
