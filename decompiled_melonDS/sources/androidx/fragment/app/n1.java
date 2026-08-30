package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A;

    public n1(View view) {
        this.A = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.A;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = a6.x0.f533a;
        a6.n0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
