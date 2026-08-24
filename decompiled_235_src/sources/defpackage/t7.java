package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t7  reason: default package */
/* loaded from: classes.dex */
public final class t7 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ActionBarOverlayLayout B;

    public /* synthetic */ t7(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.A = i;
        this.B = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ActionBarOverlayLayout actionBarOverlayLayout = this.B;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.v0 = actionBarOverlayLayout.R.animate().translationY(RecyclerView.B1).setListener(actionBarOverlayLayout.w0);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.v0 = actionBarOverlayLayout.R.animate().translationY(-actionBarOverlayLayout.R.getHeight()).setListener(actionBarOverlayLayout.w0);
                return;
        }
    }
}
