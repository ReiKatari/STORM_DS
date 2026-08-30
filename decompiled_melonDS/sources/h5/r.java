package h5;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ViewGroup B;

    public /* synthetic */ r(ViewGroup viewGroup, int i2) {
        this.A = i2;
        this.B = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.setNestedScrollingEnabled(true);
                return;
            default:
                ((MotionLayout) this.B).f1082h1.a();
                return;
        }
    }
}
