package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends FrameLayout implements o.b {
    public final CollapsibleActionView A;

    public p(View view) {
        super(view.getContext());
        this.A = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // o.b
    public final void onActionViewCollapsed() {
        this.A.onActionViewCollapsed();
    }

    @Override // o.b
    public final void onActionViewExpanded() {
        this.A.onActionViewExpanded();
    }
}
