package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q44  reason: default package */
/* loaded from: classes.dex */
public final class q44 extends FrameLayout implements zs0 {
    public final CollapsibleActionView A;

    public q44(View view) {
        super(view.getContext());
        this.A = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.zs0
    public final void onActionViewCollapsed() {
        this.A.onActionViewCollapsed();
    }

    @Override // defpackage.zs0
    public final void onActionViewExpanded() {
        this.A.onActionViewExpanded();
    }
}
