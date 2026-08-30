package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xp3  reason: default package */
/* loaded from: classes.dex */
public final class xp3 implements View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ xp3(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                yp3 yp3Var = (yp3) obj;
                vp3 vp3Var = yp3Var.m0;
                Handler handler = yp3Var.q0;
                cr crVar = yp3Var.u0;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && crVar != null && crVar.isShowing() && x >= 0 && x < crVar.getWidth() && y >= 0 && y < crVar.getHeight()) {
                    handler.postDelayed(vp3Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(vp3Var);
                }
                return false;
            default:
                if (!((Checkable) view).isChecked()) {
                    return false;
                }
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
        }
    }
}
