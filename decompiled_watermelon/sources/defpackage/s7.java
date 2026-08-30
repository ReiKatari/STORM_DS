package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s7  reason: default package */
/* loaded from: classes.dex */
public final class s7 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ActionBarOverlayLayout B;

    public /* synthetic */ s7(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
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
                actionBarOverlayLayout.u0 = actionBarOverlayLayout.R.animate().translationY(RecyclerView.A1).setListener(actionBarOverlayLayout.v0);
                return;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.u0 = actionBarOverlayLayout.R.animate().translationY(-actionBarOverlayLayout.R.getHeight()).setListener(actionBarOverlayLayout.v0);
                return;
        }
    }
}
