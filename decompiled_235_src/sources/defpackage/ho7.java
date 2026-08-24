package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho7  reason: default package */
/* loaded from: classes.dex */
public final class ho7 {
    public static final tf5 v = new tf5(1);
    public int a;
    public final int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final oi2 q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public int c = -1;
    public final g15 u = new g15(this, 26);

    public ho7(Context context, CoordinatorLayout coordinatorLayout, oi2 oi2Var) {
        if (oi2Var != null) {
            this.t = coordinatorLayout;
            this.q = oi2Var;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
            return;
        }
        i.h("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, (float) RecyclerView.B1);
            Arrays.fill(this.e, (float) RecyclerView.B1);
            Arrays.fill(this.f, (float) RecyclerView.B1);
            Arrays.fill(this.g, (float) RecyclerView.B1);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.t;
        if (parent == coordinatorLayout) {
            this.r = view;
            this.c = i;
            this.q.P(view, i);
            n(1);
            return;
        }
        u34.C(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view != null) {
            oi2 oi2Var = this.q;
            if (oi2Var.E(view) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (oi2Var.F() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = this.b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = ao7.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = ao7.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.R(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.u);
            }
        }
        if (this.a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            if (i4 > 0) {
                i4 = i8;
            } else {
                i4 = -i8;
            }
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        oi2 oi2Var = this.q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, oi2Var.F()) * f6) + (e(i5, i3, oi2Var.E(view)) * f5)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                oi2 oi2Var = this.q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View g = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.r;
                                                if (g == view && q(view, pointerId2)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        l(x, y, pointerId3);
                        if (this.a == 0) {
                            q(g((int) x, (int) y), pointerId3);
                            int i3 = this.h[pointerId3];
                            return;
                        }
                        int i4 = (int) x;
                        int i5 = (int) y;
                        View view2 = this.r;
                        if (view2 != null && i4 >= view2.getLeft() && i4 < view2.getRight() && i5 >= view2.getTop() && i5 < view2.getBottom()) {
                            q(this.r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.a == 1) {
                        this.s = true;
                        oi2Var.S(this.r, RecyclerView.B1, RecyclerView.B1);
                        this.s = false;
                        if (this.a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                } else if (this.a == 1) {
                    if (!i(this.c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.c);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f;
                    int i6 = this.c;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.g[i6]);
                    int left = this.r.getLeft() + i7;
                    int top = this.r.getTop() + i8;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i7 != 0) {
                        left = oi2Var.m(this.r, left);
                        WeakHashMap weakHashMap = ao7.a;
                        this.r.offsetLeftAndRight(left - left2);
                    }
                    if (i8 != 0) {
                        top = oi2Var.n(this.r, top);
                        WeakHashMap weakHashMap2 = ao7.a;
                        this.r.offsetTopAndBottom(top - top2);
                    }
                    if (i7 != 0 || i8 != 0) {
                        oi2Var.R(this.r, left, top);
                    }
                    m(motionEvent);
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (i(pointerId4)) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.d[pointerId4];
                            float f2 = y3 - this.e[pointerId4];
                            Math.abs(f);
                            Math.abs(f2);
                            int i9 = this.h[pointerId4];
                            Math.abs(f2);
                            Math.abs(f);
                            int i10 = this.h[pointerId4];
                            Math.abs(f);
                            Math.abs(f2);
                            int i11 = this.h[pointerId4];
                            Math.abs(f2);
                            Math.abs(f);
                            int i12 = this.h[pointerId4];
                            if (this.a != 1) {
                                View g2 = g((int) x3, (int) y3);
                                if (c(g2, f, f2) && q(g2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    m(motionEvent);
                    return;
                }
            }
            if (this.a == 1) {
                k();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g3 = g((int) x4, (int) y4);
        l(x4, y4, pointerId5);
        q(g3, pointerId5);
        int i13 = this.h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f2 = this.n;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > RecyclerView.B1) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 > f) {
            if (yVelocity <= RecyclerView.B1) {
                f = -f;
            }
        } else {
            f = yVelocity;
        }
        this.s = true;
        this.q.S(this.r, xVelocity, f);
        this.s = false;
        if (this.a == 1) {
            n(0);
        }
    }

    public final void l(float f, float f2, int i) {
        float[] fArr = this.d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i4 = (int) f;
        int i5 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.t;
        int left = coordinatorLayout.getLeft();
        int i6 = this.o;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < coordinatorLayout.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > coordinatorLayout.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > coordinatorLayout.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void n(int i) {
        this.t.removeCallbacks(this.u);
        if (this.a != i) {
            this.a = i;
            this.q.Q(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean o(int i, int i2) {
        if (this.s) {
            return h(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        i.m("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        boolean z;
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                d(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            l(x, y, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                int i2 = this.h[pointerId];
                            } else if (i == 2 && (g = g((int) x, (int) y)) == this.r) {
                                q(g, pointerId);
                            }
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (i(pointerId2)) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y2 - this.e[pointerId2];
                            View g2 = g((int) x2, (int) y2);
                            if (g2 != null && c(g2, f, f2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int left = g2.getLeft();
                                oi2 oi2Var = this.q;
                                int m = oi2Var.m(g2, ((int) f) + left);
                                int top = g2.getTop();
                                int n = oi2Var.n(g2, ((int) f2) + top);
                                int E = oi2Var.E(g2);
                                int F = oi2Var.F();
                                if (E != 0) {
                                    if (E > 0) {
                                    }
                                }
                                if (F == 0) {
                                    break;
                                } else if (F > 0 && n == top) {
                                    break;
                                }
                            }
                            Math.abs(f);
                            Math.abs(f2);
                            int i4 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i5 = this.h[pointerId2];
                            Math.abs(f);
                            Math.abs(f2);
                            int i6 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i7 = this.h[pointerId2];
                            if (this.a != 1) {
                                if (z && q(g2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x3, y3, pointerId3);
            View g3 = g((int) x3, (int) y3);
            if (g3 == this.r && this.a == 2) {
                q(g3, pointerId3);
            }
            int i8 = this.h[pointerId3];
        }
        if (this.a != 1) {
            return false;
        }
        return true;
    }

    public final boolean q(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view != null && this.q.a0(view, i)) {
            this.c = i;
            b(view, i);
            return true;
        }
        return false;
    }
}
