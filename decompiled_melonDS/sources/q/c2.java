package q;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c2 implements View.OnTouchListener {
    public final /* synthetic */ d2 A;

    public c2(d2 d2Var) {
        this.A = d2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d2 d2Var = this.A;
        a2 a2Var = d2Var.f11875l0;
        Handler handler = d2Var.p0;
        y yVar = d2Var.f11882t0;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && yVar != null && yVar.isShowing() && x9 >= 0 && x9 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
            handler.postDelayed(a2Var, 250L);
            return false;
        } else if (action == 1) {
            handler.removeCallbacks(a2Var);
            return false;
        } else {
            return false;
        }
    }
}
