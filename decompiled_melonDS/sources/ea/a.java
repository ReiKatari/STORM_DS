package ea;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {
    public final Dialog A;
    public final int B;
    public final int L;
    public final int R;

    public a(Dialog dialog, Rect rect) {
        this.A = dialog;
        this.B = rect.left;
        this.L = rect.top;
        this.R = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int top;
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.B;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.L, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f8 = (-this.R) - 1;
            obtain.setLocation(f8, f8);
        }
        view.performClick();
        return this.A.onTouchEvent(obtain);
    }
}
