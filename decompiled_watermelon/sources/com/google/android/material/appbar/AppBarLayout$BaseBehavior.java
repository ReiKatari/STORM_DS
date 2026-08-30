package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends bb7 {
    public boolean b;
    public int d;
    public VelocityTracker f;
    public int c = -1;
    public int e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // defpackage.w11
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
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
        c44.b();
        return false;
    }

    @Override // defpackage.bb7, defpackage.w11
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final boolean o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // defpackage.w11
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    @Override // defpackage.w11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L44
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L48
            r6 = 6
            if (r0 == r6) goto L13
            goto L56
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r3
            goto L1c
        L1b:
            r6 = r2
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.d = r6
            goto L56
        L2d:
            int r0 = r5.c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L61
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.d = r7
            r6.getClass()
            defpackage.c44.b()
            return r2
        L44:
            android.view.VelocityTracker r0 = r5.f
            if (r0 != 0) goto L63
        L48:
            r5.b = r2
            r5.c = r1
            android.view.VelocityTracker r6 = r5.f
            if (r6 == 0) goto L56
            r6.recycle()
            r6 = 0
            r5.f = r6
        L56:
            android.view.VelocityTracker r6 = r5.f
            if (r6 == 0) goto L5d
            r6.addMovement(r7)
        L5d:
            boolean r5 = r5.b
            if (r5 != 0) goto L62
        L61:
            return r2
        L62:
            return r3
        L63:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f
            int r5 = r5.c
            r7.getYVelocity(r5)
            r6.getClass()
            defpackage.c44.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
