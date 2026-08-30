package qa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f12413b;

    public /* synthetic */ b(c cVar, int i2) {
        this.f12412a = i2;
        this.f12413b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f12412a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f12413b.f12457b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f12412a) {
            case 0:
                this.f12413b.f12457b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
