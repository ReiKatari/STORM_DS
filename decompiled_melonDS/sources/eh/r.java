package eh;

import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.MelonEmulator;
import oe.a0;
import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends a {
    public final a0 B;

    public r(k kVar) {
        kVar.getClass();
        this.A = kVar;
        this.B = new a0(0, 0);
    }

    public final a0 a(MotionEvent motionEvent, int i2, int i10) {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        int pointerCount = motionEvent.getPointerCount();
        float f8 = 0.0f;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            motionEvent.getPointerCoords(i11, pointerCoords);
            f8 += pointerCoords.x;
            f10 += pointerCoords.y;
        }
        float pointerCount2 = f10 / motionEvent.getPointerCount();
        int g10 = p7.j.g((int) (((f8 / motionEvent.getPointerCount()) / i2) * 256), 0, 255);
        a0 a0Var = this.B;
        a0Var.f10908a = g10;
        a0Var.f10909b = p7.j.g((int) ((pointerCount2 / i10) * 192), 0, 191);
        return a0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k kVar = this.A;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return true;
                }
                kVar.b(a(motionEvent, view.getWidth(), view.getHeight()));
                return true;
            }
            kVar.d(s.TOUCHSCREEN);
            MelonEmulator.f9466a.onScreenRelease();
            return true;
        }
        kVar.e(s.TOUCHSCREEN);
        kVar.b(a(motionEvent, view.getWidth(), view.getHeight()));
        return true;
    }
}
