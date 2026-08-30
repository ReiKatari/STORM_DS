package p;

import android.widget.PopupWindow;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v A;

    public u(v vVar) {
        this.A = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A.c();
    }
}
