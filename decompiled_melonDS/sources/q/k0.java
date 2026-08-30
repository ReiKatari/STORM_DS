package q;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ p.d A;
    public final /* synthetic */ l0 B;

    public k0(l0 l0Var, p.d dVar) {
        this.B = l0Var;
        this.A = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.B.A0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A);
        }
    }
}
