package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk2  reason: default package */
/* loaded from: classes.dex */
public final class hk2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ik2 B;

    public /* synthetic */ hk2(ik2 ik2Var, int i) {
        this.A = i;
        this.B = ik2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ik2 ik2Var = this.B;
        switch (i) {
            case 0:
                ViewParent parent = ik2Var.R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                ik2Var.a();
                View view = ik2Var.R;
                if (view.isEnabled() && !view.isLongClickable() && ik2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    ik2Var.Z = true;
                    return;
                }
                return;
        }
    }
}
