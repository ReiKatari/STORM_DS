package b4;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 implements GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a2 f2034a;

    public z1(a2 a2Var) {
        this.f2034a = a2Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f10) {
        a2 a2Var = this.f2034a;
        r rVar = (r) a2Var.f1788d;
        if (!a2Var.f1787c) {
            int i2 = a2Var.f1786b;
            int i10 = 2;
            if (i2 == 1) {
                if (Math.abs(f8) > Math.abs(f10)) {
                    if (f8 > 0.0f) {
                        i10 = 1;
                    }
                    ((g3.p) rVar.L.getFocusOwner()).g(i10, false);
                    return true;
                }
            } else if (i2 == 2 && Math.abs(f10) > Math.abs(f8)) {
                if (f10 > 0.0f) {
                    i10 = 1;
                }
                ((g3.p) rVar.L.getFocusOwner()).g(i10, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f10) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
