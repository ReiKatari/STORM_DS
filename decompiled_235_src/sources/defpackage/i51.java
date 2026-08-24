package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i51  reason: default package */
/* loaded from: classes.dex */
public final class i51 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A;

    public i51(CoordinatorLayout coordinatorLayout) {
        this.A = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A.p(0);
        return true;
    }
}
