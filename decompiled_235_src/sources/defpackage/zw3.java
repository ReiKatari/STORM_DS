package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw3  reason: default package */
/* loaded from: classes.dex */
public final class zw3 implements View.OnTouchListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ zw3(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ax3 ax3Var = (ax3) obj;
                xw3 xw3Var = ax3Var.n0;
                Handler handler = ax3Var.r0;
                pr prVar = ax3Var.v0;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && prVar != null && prVar.isShowing() && x >= 0 && x < prVar.getWidth() && y >= 0 && y < prVar.getHeight()) {
                    handler.postDelayed(xw3Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(xw3Var);
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
