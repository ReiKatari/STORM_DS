package k5;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A;

    public e(CoordinatorLayout coordinatorLayout) {
        this.A = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A.p(0);
        return true;
    }
}
