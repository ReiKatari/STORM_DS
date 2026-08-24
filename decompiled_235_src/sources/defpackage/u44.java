package defpackage;

import android.widget.PopupWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u44  reason: default package */
/* loaded from: classes.dex */
public final class u44 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v44 A;

    public u44(v44 v44Var) {
        this.A = v44Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A.c();
    }
}
