package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q44  reason: default package */
/* loaded from: classes.dex */
public final class q44 extends android.widget.FrameLayout implements defpackage.zs0 {
    public final android.view.CollapsibleActionView A;

    public q44(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r0 = r2
            android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
            r1.A = r0
            r1.addView(r2)
            return
    }

    @Override // defpackage.zs0
    public final void onActionViewCollapsed() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.A
            r0.onActionViewCollapsed()
            return
    }

    @Override // defpackage.zs0
    public final void onActionViewExpanded() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.A
            r0.onActionViewExpanded()
            return
    }
}
