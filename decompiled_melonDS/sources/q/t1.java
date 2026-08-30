package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ u1 B;

    public /* synthetic */ t1(u1 u1Var, int i2) {
        this.A = i2;
        this.B = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ViewParent parent = this.B.R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                u1 u1Var = this.B;
                u1Var.a();
                View view = u1Var.R;
                if (view.isEnabled() && !view.isLongClickable() && u1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    u1Var.Z = true;
                    return;
                }
                return;
        }
    }
}
