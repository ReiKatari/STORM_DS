package j6;

import a0.j;
import a6.x0;
import ad.g;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: v  reason: collision with root package name */
    public static final c f7465v = new c(0);

    /* renamed from: a  reason: collision with root package name */
    public int f7466a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7467b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f7469d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f7470e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f7471f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f7472g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f7473h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f7474i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f7475j;

    /* renamed from: k  reason: collision with root package name */
    public int f7476k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f7477l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public final float f7478n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7479o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f7480p;

    /* renamed from: q  reason: collision with root package name */
    public final ij.a f7481q;

    /* renamed from: r  reason: collision with root package name */
    public View f7482r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7483s;

    /* renamed from: t  reason: collision with root package name */
    public final CoordinatorLayout f7484t;

    /* renamed from: c  reason: collision with root package name */
    public int f7468c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final g f7485u = new g(4, this);

    public d(Context context, CoordinatorLayout coordinatorLayout, ij.a aVar) {
        if (aVar != null) {
            this.f7484t = coordinatorLayout;
            this.f7481q = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f7479o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f7467b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f7478n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f7480p = new OverScroller(context, f7465v);
            return;
        }
        j.h("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.f7468c = -1;
        float[] fArr = this.f7469d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7470e, 0.0f);
            Arrays.fill(this.f7471f, 0.0f);
            Arrays.fill(this.f7472g, 0.0f);
            Arrays.fill(this.f7473h, 0);
            Arrays.fill(this.f7474i, 0);
            Arrays.fill(this.f7475j, 0);
            this.f7476k = 0;
        }
        VelocityTracker velocityTracker = this.f7477l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7477l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f7484t;
        if (parent == coordinatorLayout) {
            this.f7482r = view;
            this.f7468c = i2;
            this.f7481q.q0(view, i2);
            n(1);
            return;
        }
        fj.j.q(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            ij.a r1 = r3.f7481q
            int r4 = r1.i0(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.j0()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f7467b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f7467b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f7467b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.c(android.view.View, float, float):boolean");
    }

    public final void d(int i2) {
        float[] fArr = this.f7469d;
        if (fArr != null) {
            int i10 = this.f7476k;
            int i11 = 1 << i2;
            if ((i10 & i11) != 0) {
                fArr[i2] = 0.0f;
                this.f7470e[i2] = 0.0f;
                this.f7471f[i2] = 0.0f;
                this.f7472g[i2] = 0.0f;
                this.f7473h[i2] = 0;
                this.f7474i[i2] = 0;
                this.f7475j[i2] = 0;
                this.f7476k = (~i11) & i10;
            }
        }
    }

    public final int e(int i2, int i10, int i11) {
        int width;
        int abs;
        if (i2 == 0) {
            return 0;
        }
        float width2 = this.f7484t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i2) / i11) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f7466a == 2) {
            OverScroller overScroller = this.f7480p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7482r.getLeft();
            int top = currY - this.f7482r.getTop();
            if (left != 0) {
                View view = this.f7482r;
                WeakHashMap weakHashMap = x0.f533a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7482r;
                WeakHashMap weakHashMap2 = x0.f533a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f7481q.s0(this.f7482r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f7484t.post(this.f7485u);
            }
        }
        if (this.f7466a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i2, int i10) {
        CoordinatorLayout coordinatorLayout = this.f7484t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7481q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i2, int i10, int i11, int i12) {
        float f8;
        float f10;
        float f11;
        float f12;
        int left = this.f7482r.getLeft();
        int top = this.f7482r.getTop();
        int i13 = i2 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f7480p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f7482r;
        int i15 = (int) this.f7478n;
        int i16 = (int) this.m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            if (i11 > 0) {
                i11 = i16;
            } else {
                i11 = -i16;
            }
        }
        int abs2 = Math.abs(i12);
        if (abs2 < i15) {
            i12 = 0;
        } else if (abs2 > i16) {
            if (i12 > 0) {
                i12 = i16;
            } else {
                i12 = -i16;
            }
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i11 != 0) {
            f8 = abs5;
            f10 = i17;
        } else {
            f8 = abs3;
            f10 = i18;
        }
        float f13 = f8 / f10;
        if (i12 != 0) {
            f11 = abs6;
            f12 = i17;
        } else {
            f11 = abs4;
            f12 = i18;
        }
        float f14 = f11 / f12;
        ij.a aVar = this.f7481q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, aVar.j0()) * f14) + (e(i13, i11, aVar.i0(view)) * f13)));
        n(2);
        return true;
    }

    public final boolean i(int i2) {
        if ((this.f7476k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f7477l == null) {
            this.f7477l = VelocityTracker.obtain();
        }
        this.f7477l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                ij.a aVar = this.f7481q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f7466a == 1 && pointerId == this.f7468c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i10);
                                            if (pointerId2 != this.f7468c) {
                                                View g10 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                                View view = this.f7482r;
                                                if (g10 == view && q(view, pointerId2)) {
                                                    i2 = this.f7468c;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            i2 = -1;
                                            break;
                                        }
                                    }
                                    if (i2 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x9 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        l(x9, y10, pointerId3);
                        if (this.f7466a == 0) {
                            q(g((int) x9, (int) y10), pointerId3);
                            int i11 = this.f7473h[pointerId3];
                            return;
                        }
                        int i12 = (int) x9;
                        int i13 = (int) y10;
                        View view2 = this.f7482r;
                        if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            q(this.f7482r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f7466a == 1) {
                        this.f7483s = true;
                        aVar.t0(this.f7482r, 0.0f, 0.0f);
                        this.f7483s = false;
                        if (this.f7466a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                } else if (this.f7466a == 1) {
                    if (!i(this.f7468c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7468c);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f7471f;
                    int i14 = this.f7468c;
                    int i15 = (int) (x10 - fArr[i14]);
                    int i16 = (int) (y11 - this.f7472g[i14]);
                    int left = this.f7482r.getLeft() + i15;
                    int top = this.f7482r.getTop() + i16;
                    int left2 = this.f7482r.getLeft();
                    int top2 = this.f7482r.getTop();
                    if (i15 != 0) {
                        left = aVar.B(this.f7482r, left);
                        WeakHashMap weakHashMap = x0.f533a;
                        this.f7482r.offsetLeftAndRight(left - left2);
                    }
                    if (i16 != 0) {
                        top = aVar.C(this.f7482r, top);
                        WeakHashMap weakHashMap2 = x0.f533a;
                        this.f7482r.offsetTopAndBottom(top - top2);
                    }
                    if (i15 != 0 || i16 != 0) {
                        aVar.s0(this.f7482r, left, top);
                    }
                    m(motionEvent);
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i10 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i10);
                        if (i(pointerId4)) {
                            float x11 = motionEvent.getX(i10);
                            float y12 = motionEvent.getY(i10);
                            float f8 = x11 - this.f7469d[pointerId4];
                            float f10 = y12 - this.f7470e[pointerId4];
                            Math.abs(f8);
                            Math.abs(f10);
                            int i17 = this.f7473h[pointerId4];
                            Math.abs(f10);
                            Math.abs(f8);
                            int i18 = this.f7473h[pointerId4];
                            Math.abs(f8);
                            Math.abs(f10);
                            int i19 = this.f7473h[pointerId4];
                            Math.abs(f10);
                            Math.abs(f8);
                            int i20 = this.f7473h[pointerId4];
                            if (this.f7466a != 1) {
                                View g11 = g((int) x11, (int) y12);
                                if (c(g11, f8, f10) && q(g11, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                    m(motionEvent);
                    return;
                }
            }
            if (this.f7466a == 1) {
                k();
            }
            a();
            return;
        }
        float x12 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g12 = g((int) x12, (int) y13);
        l(x12, y13, pointerId5);
        q(g12, pointerId5);
        int i21 = this.f7473h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f7477l;
        float f8 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f8);
        float xVelocity = this.f7477l.getXVelocity(this.f7468c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f7478n;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f8) {
            if (xVelocity > 0.0f) {
                xVelocity = f8;
            } else {
                xVelocity = -f8;
            }
        }
        float yVelocity = this.f7477l.getYVelocity(this.f7468c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f8 = 0.0f;
        } else if (abs2 > f8) {
            if (yVelocity <= 0.0f) {
                f8 = -f8;
            }
        } else {
            f8 = yVelocity;
        }
        this.f7483s = true;
        this.f7481q.t0(this.f7482r, xVelocity, f8);
        this.f7483s = false;
        if (this.f7466a == 1) {
            n(0);
        }
    }

    public final void l(float f8, float f10, int i2) {
        float[] fArr = this.f7469d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i11 = i2 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7470e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7471f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7472g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7473h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7474i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f7475j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7469d = fArr2;
            this.f7470e = fArr3;
            this.f7471f = fArr4;
            this.f7472g = fArr5;
            this.f7473h = iArr;
            this.f7474i = iArr2;
            this.f7475j = iArr3;
        }
        float[] fArr9 = this.f7469d;
        this.f7471f[i2] = f8;
        fArr9[i2] = f8;
        float[] fArr10 = this.f7470e;
        this.f7472g[i2] = f10;
        fArr10[i2] = f10;
        int[] iArr7 = this.f7473h;
        int i12 = (int) f8;
        int i13 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f7484t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f7479o;
        if (i12 < left + i14) {
            i10 = 1;
        }
        if (i13 < coordinatorLayout.getTop() + i14) {
            i10 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i10 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i10 |= 8;
        }
        iArr7[i2] = i10;
        this.f7476k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x9 = motionEvent.getX(i2);
                float y10 = motionEvent.getY(i2);
                this.f7471f[pointerId] = x9;
                this.f7472g[pointerId] = y10;
            }
        }
    }

    public final void n(int i2) {
        this.f7484t.removeCallbacks(this.f7485u);
        if (this.f7466a != i2) {
            this.f7466a = i2;
            this.f7481q.r0(i2);
            if (this.f7466a == 0) {
                this.f7482r = null;
            }
        }
    }

    public final boolean o(int i2, int i10) {
        if (this.f7483s) {
            return h(i2, i10, (int) this.f7477l.getXVelocity(this.f7468c), (int) this.f7477l.getYVelocity(this.f7468c));
        }
        j.p("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
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
        throw new UnsupportedOperationException("Method not decompiled: j6.d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i2) {
        if (view == this.f7482r && this.f7468c == i2) {
            return true;
        }
        if (view != null && this.f7481q.z0(view, i2)) {
            this.f7468c = i2;
            b(view, i2);
            return true;
        }
        return false;
    }
}
