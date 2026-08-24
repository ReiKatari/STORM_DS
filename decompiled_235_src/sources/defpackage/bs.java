package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs  reason: default package */
/* loaded from: classes.dex */
public final class bs implements PopupWindow.OnDismissListener {
    public final /* synthetic */ wr A;
    public final /* synthetic */ cs B;

    public bs(cs csVar, wr wrVar) {
        this.B = csVar;
        this.A = wrVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.B.C0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A);
        }
    }
}
