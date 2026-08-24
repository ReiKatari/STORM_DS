package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends cp7 {
    public boolean b;
    public int d;
    public VelocityTracker f;
    public int c = -1;
    public int e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // defpackage.e51
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            int i = this.c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.d) > this.e) {
                    this.d = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.c = -1;
        motionEvent.getX();
        motionEvent.getY();
        u34.a();
        return false;
    }

    @Override // defpackage.cp7, defpackage.e51
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final void q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final Parcelable r(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final boolean s(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // defpackage.e51
    public final void t(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    @Override // defpackage.e51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.c = motionEvent.getPointerId(i);
                        this.d = (int) (motionEvent.getY(i) + 0.5f);
                    }
                    velocityTracker = this.f;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                    if (this.b) {
                        return false;
                    }
                    return true;
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                if (findPointerIndex != -1) {
                    this.d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    u34.a();
                    return false;
                }
                return false;
            }
        } else {
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f.computeCurrentVelocity(1000);
                this.f.getYVelocity(this.c);
                view.getClass();
                u34.a();
                return false;
            }
        }
        this.b = false;
        this.c = -1;
        VelocityTracker velocityTracker3 = this.f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f = null;
        }
        velocityTracker = this.f;
        if (velocityTracker != null) {
        }
        if (this.b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
