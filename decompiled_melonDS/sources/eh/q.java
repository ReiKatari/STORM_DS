package eh;

import android.view.MotionEvent;
import android.view.View;
import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends h {
    public final s L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k kVar, s sVar, boolean z10, ce.c cVar) {
        super(kVar, z10, cVar);
        kVar.getClass();
        sVar.getClass();
        cVar.getClass();
        this.L = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k kVar = this.A;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        s sVar = this.L;
        if (action != 0) {
            if (action != 1) {
                return true;
            }
            kVar.d(sVar);
            a(view, f.KEY_RELEASE);
            return true;
        }
        kVar.e(sVar);
        a(view, f.KEY_PRESS);
        return true;
    }
}
