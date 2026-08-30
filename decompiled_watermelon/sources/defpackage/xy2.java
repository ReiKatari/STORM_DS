package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy2  reason: default package */
/* loaded from: classes.dex */
public final class xy2 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ l40 a;

    public xy2(l40 l40Var) {
        this.a = l40Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        l40 l40Var = this.a;
        zd zdVar = (zd) l40Var.d;
        if (!l40Var.c) {
            int i = l40Var.b;
            int i2 = 2;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > RecyclerView.A1) {
                        i2 = 1;
                    }
                    ((nc2) zdVar.L.getFocusOwner()).g(i2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                if (f2 > RecyclerView.A1) {
                    i2 = 1;
                }
                ((nc2) zdVar.L.getFocusOwner()).g(i2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
