package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if2  reason: default package */
/* loaded from: classes.dex */
public final class if2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ jf2 B;

    public /* synthetic */ if2(jf2 jf2Var, int i) {
        this.A = i;
        this.B = jf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        jf2 jf2Var = this.B;
        switch (i) {
            case 0:
                ViewParent parent = jf2Var.R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                jf2Var.a();
                View view = jf2Var.R;
                if (view.isEnabled() && !view.isLongClickable() && jf2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A1, RecyclerView.A1, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    jf2Var.Z = true;
                    return;
                }
                return;
        }
    }
}
