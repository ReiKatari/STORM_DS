package q;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ActionBarOverlayLayout B;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.A = i2;
        this.B = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.B;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f942t0 = actionBarOverlayLayout.R.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f943u0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.B;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f942t0 = actionBarOverlayLayout2.R.animate().translationY(-actionBarOverlayLayout2.R.getHeight()).setListener(actionBarOverlayLayout2.f943u0);
                return;
        }
    }
}
