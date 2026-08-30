package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bx3  reason: default package */
/* loaded from: classes.dex */
public final class bx3 extends FrameLayout implements mq0 {
    public final CollapsibleActionView A;

    public bx3(View view) {
        super(view.getContext());
        this.A = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.mq0
    public final void onActionViewCollapsed() {
        this.A.onActionViewCollapsed();
    }

    @Override // defpackage.mq0
    public final void onActionViewExpanded() {
        this.A.onActionViewExpanded();
    }
}
