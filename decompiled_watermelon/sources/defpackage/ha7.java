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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ha7  reason: default package */
/* loaded from: classes.dex */
public final class ha7 {
    public static final d65 v = new d65(1);
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
    public final yf2 q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public int c = -1;
    public final es4 u = new es4(27, this);

    public ha7(Context context, CoordinatorLayout coordinatorLayout, yf2 yf2Var) {
        if (yf2Var != null) {
            this.t = coordinatorLayout;
            this.q = yf2Var;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
            return;
        }
        i.i("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, (float) RecyclerView.A1);
            Arrays.fill(this.e, (float) RecyclerView.A1);
            Arrays.fill(this.f, (float) RecyclerView.A1);
            Arrays.fill(this.g, (float) RecyclerView.A1);
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
            this.q.L(view, i);
            n(1);
            return;
        }
        c44.x(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L41
        L4:
            yf2 r1 = r3.q
            int r4 = r1.x(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.y()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            int r3 = r3.b
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L29:
            if (r4 == 0) goto L35
            float r4 = java.lang.Math.abs(r5)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L35:
            if (r1 == 0) goto L41
            float r4 = java.lang.Math.abs(r6)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
        L40:
            return r2
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha7.c(android.view.View, float, float):boolean");
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
                WeakHashMap weakHashMap = aa7.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = aa7.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.N(this.r, currX, currY);
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
        yf2 yf2Var = this.q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, yf2Var.y()) * f6) + (e(i5, i3, yf2Var.x(view)) * f5)));
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
                yf2 yf2Var = this.q;
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
                        yf2Var.O(this.r, RecyclerView.A1, RecyclerView.A1);
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
                        left = yf2Var.k(this.r, left);
                        WeakHashMap weakHashMap = aa7.a;
                        this.r.offsetLeftAndRight(left - left2);
                    }
                    if (i8 != 0) {
                        top = yf2Var.l(this.r, top);
                        WeakHashMap weakHashMap2 = aa7.a;
                        this.r.offsetTopAndBottom(top - top2);
                    }
                    if (i7 != 0 || i8 != 0) {
                        yf2Var.N(this.r, left, top);
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
            if (xVelocity > RecyclerView.A1) {
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
            if (yVelocity <= RecyclerView.A1) {
                f = -f;
            }
        } else {
            f = yVelocity;
        }
        this.s = true;
        this.q.O(this.r, xVelocity, f);
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
            this.q.M(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean o(int i, int i2) {
        if (this.s) {
            return h(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        i.n("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha7.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view != null && this.q.W(view, i)) {
            this.c = i;
            b(view, i);
            return true;
        }
        return false;
    }
}
