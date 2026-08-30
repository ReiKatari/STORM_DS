package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a21  reason: default package */
/* loaded from: classes.dex */
public final class a21 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A;

    public a21(CoordinatorLayout coordinatorLayout) {
        this.A = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A.p(0);
        return true;
    }
}
