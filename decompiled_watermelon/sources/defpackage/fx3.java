package defpackage;

import android.widget.PopupWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fx3  reason: default package */
/* loaded from: classes.dex */
public final class fx3 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ gx3 A;

    public fx3(gx3 gx3Var) {
        this.A = gx3Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A.c();
    }
}
