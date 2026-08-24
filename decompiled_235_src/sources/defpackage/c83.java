package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c83  reason: default package */
/* loaded from: classes.dex */
public final class c83 implements View.OnTouchListener {
    public final Dialog A;
    public final int B;
    public final int L;
    public final int R;

    public c83(Dialog dialog, Rect rect) {
        this.A = dialog;
        this.B = rect.left;
        this.L = rect.top;
        this.R = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.B;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.L;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.R;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.A.onTouchEvent(obtain);
    }
}
