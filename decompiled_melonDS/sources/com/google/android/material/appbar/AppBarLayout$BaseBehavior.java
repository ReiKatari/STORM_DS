package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m9.o;
import v9.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2910b;

    /* renamed from: d  reason: collision with root package name */
    public int f2912d;

    /* renamed from: f  reason: collision with root package name */
    public VelocityTracker f2914f;

    /* renamed from: c  reason: collision with root package name */
    public int f2911c = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f2913e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // k5.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2913e < 0) {
            this.f2913e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2910b) {
            int i2 = this.f2911c;
            if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y10 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y10 - this.f2912d) > this.f2913e) {
                    this.f2912d = y10;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2914f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2911c = -1;
        motionEvent.getX();
        motionEvent.getY();
        o.b();
        return false;
    }

    @Override // v9.a, k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i10, int[] iArr, int i11) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final boolean o(View view, int i2, int i10) {
        throw new ClassCastException();
    }

    @Override // k5.a
    public final void p(View view, View view2, int i2) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[RETURN] */
    @Override // k5.a
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
            if (r0 == r3) goto L45
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L49
            r6 = 6
            if (r0 == r6) goto L13
            goto L57
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r3
            goto L1c
        L1b:
            r6 = r2
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.f2911c = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f2912d = r6
            goto L57
        L2d:
            int r0 = r5.f2911c
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L62
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f2912d = r7
            r6.getClass()
            m9.o.b()
        L43:
            r6 = 0
            return r6
        L45:
            android.view.VelocityTracker r0 = r5.f2914f
            if (r0 != 0) goto L64
        L49:
            r5.f2910b = r2
            r5.f2911c = r1
            android.view.VelocityTracker r6 = r5.f2914f
            if (r6 == 0) goto L57
            r6.recycle()
            r6 = 0
            r5.f2914f = r6
        L57:
            android.view.VelocityTracker r6 = r5.f2914f
            if (r6 == 0) goto L5e
            r6.addMovement(r7)
        L5e:
            boolean r6 = r5.f2910b
            if (r6 != 0) goto L63
        L62:
            return r2
        L63:
            return r3
        L64:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f2914f
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f2914f
            int r0 = r5.f2911c
            r7.getYVelocity(r0)
            r6.getClass()
            m9.o.b()
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.q(android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
