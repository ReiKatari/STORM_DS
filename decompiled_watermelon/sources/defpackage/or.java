package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: or  reason: default package */
/* loaded from: classes.dex */
public final class or implements PopupWindow.OnDismissListener {
    public final /* synthetic */ jr A;
    public final /* synthetic */ pr B;

    public or(pr prVar, jr jrVar) {
        this.B = prVar;
        this.A = jrVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.B.B0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A);
        }
    }
}
