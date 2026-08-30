package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements f64, e64 {
    public static final int[] G0 = {16842766};
    public View A;
    public yk6 A0;
    public boolean B;
    public int B0;
    public boolean C0;
    public final wk6 D0;
    public final xk6 E0;
    public final xk6 F0;
    public final int L;
    public float R;
    public float c0;
    public final hj7 d0;
    public final d64 e0;
    public final int[] f0;
    public final int[] g0;
    public final int[] h0;
    public boolean i0;
    public final int j0;
    public int k0;
    public float l0;
    public float m0;
    public boolean n0;
    public int o0;
    public final DecelerateInterpolator p0;
    public final io0 q0;
    public int r0;
    public int s0;
    public final int t0;
    public final int u0;
    public int v0;
    public final mo0 w0;
    public xk6 x0;
    public xk6 y0;
    public yk6 z0;

    /* JADX WARN: Type inference failed for: r1v14, types: [hj7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.widget.ImageView, android.view.View, io0] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = false;
        this.R = -1.0f;
        this.f0 = new int[2];
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.o0 = -1;
        this.r0 = -1;
        this.D0 = new wk6(this, 0);
        this.E0 = new xk6(this, 2);
        this.F0 = new xk6(this, 3);
        this.L = ViewConfiguration.get(context).getScaledTouchSlop();
        this.j0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.p0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.B0 = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(zx4.a);
        imageView.B = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = aa7.a;
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.B);
        imageView.setBackground(shapeDrawable);
        this.q0 = imageView;
        mo0 mo0Var = new mo0(getContext());
        this.w0 = mo0Var;
        mo0Var.c(1);
        this.q0.setImageDrawable(this.w0);
        this.q0.setVisibility(8);
        addView(this.q0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.u0 = i;
        this.R = i;
        this.d0 = new Object();
        this.e0 = new d64(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.B0;
        this.k0 = i2;
        this.t0 = i2;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, G0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.q0.getBackground().setAlpha(i);
        this.w0.setAlpha(i);
    }

    @Override // defpackage.e64
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.e64
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.e64
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.f64
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            if (i5 == 0) {
                this.e0.d(i, i2, i3, i4, this.g0, i5, iArr);
            }
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = this.g0[1] + i4;
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !g()) {
                float abs = this.c0 + Math.abs(i6);
                this.c0 = abs;
                j(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            n(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.e0.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.e0.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.e0.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.e0.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.e64
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, i5, this.h0);
    }

    @Override // defpackage.e64
    public final boolean f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final boolean g() {
        View view = this.A;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.r0;
        if (i3 >= 0) {
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        hj7 hj7Var = this.d0;
        return hj7Var.b | hj7Var.a;
    }

    public int getProgressCircleDiameter() {
        return this.B0;
    }

    public int getProgressViewEndOffset() {
        return this.u0;
    }

    public int getProgressViewStartOffset() {
        return this.t0;
    }

    public final void h() {
        if (this.A == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.q0)) {
                    this.A = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.e0.f(0);
    }

    public final void i(float f) {
        if (f > this.R) {
            m(true, true);
            return;
        }
        this.B = false;
        mo0 mo0Var = this.w0;
        lo0 lo0Var = mo0Var.A;
        lo0Var.e = RecyclerView.A1;
        lo0Var.f = RecyclerView.A1;
        mo0Var.invalidateSelf();
        wk6 wk6Var = new wk6(this, 1);
        this.s0 = this.k0;
        xk6 xk6Var = this.F0;
        xk6Var.reset();
        xk6Var.setDuration(200L);
        xk6Var.setInterpolator(this.p0);
        io0 io0Var = this.q0;
        io0Var.A = wk6Var;
        io0Var.clearAnimation();
        io0Var.startAnimation(xk6Var);
        lo0 lo0Var2 = mo0Var.A;
        if (lo0Var2.n) {
            lo0Var2.n = false;
        }
        mo0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.e0.d;
    }

    public final void j(float f) {
        yk6 yk6Var;
        yk6 yk6Var2;
        mo0 mo0Var = this.w0;
        lo0 lo0Var = mo0Var.A;
        if (!lo0Var.n) {
            lo0Var.n = true;
        }
        mo0Var.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.R));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.R;
        int i = this.v0;
        if (i <= 0) {
            i = this.u0;
        }
        float f2 = i;
        double max2 = Math.max((float) RecyclerView.A1, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.t0 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        io0 io0Var = this.q0;
        if (io0Var.getVisibility() != 0) {
            io0Var.setVisibility(0);
        }
        io0Var.setScaleX(1.0f);
        io0Var.setScaleY(1.0f);
        if (f < this.R) {
            if (mo0Var.A.t > 76 && ((yk6Var2 = this.z0) == null || !yk6Var2.hasStarted() || yk6Var2.hasEnded())) {
                yk6 yk6Var3 = new yk6(this, mo0Var.A.t, 76);
                yk6Var3.setDuration(300L);
                io0Var.A = null;
                io0Var.clearAnimation();
                io0Var.startAnimation(yk6Var3);
                this.z0 = yk6Var3;
            }
        } else if (mo0Var.A.t < 255 && ((yk6Var = this.A0) == null || !yk6Var.hasStarted() || yk6Var.hasEnded())) {
            yk6 yk6Var4 = new yk6(this, mo0Var.A.t, 255);
            yk6Var4.setDuration(300L);
            io0Var.A = null;
            io0Var.clearAnimation();
            io0Var.startAnimation(yk6Var4);
            this.A0 = yk6Var4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        lo0 lo0Var2 = mo0Var.A;
        lo0Var2.e = RecyclerView.A1;
        lo0Var2.f = min2;
        mo0Var.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        lo0 lo0Var3 = mo0Var.A;
        if (min3 != lo0Var3.p) {
            lo0Var3.p = min3;
        }
        mo0Var.invalidateSelf();
        mo0Var.A.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        mo0Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.k0);
    }

    public final void k(float f) {
        int i = this.s0;
        setTargetOffsetTopAndBottom((i + ((int) ((this.t0 - i) * f))) - this.q0.getTop());
    }

    public final void l() {
        this.q0.clearAnimation();
        this.w0.stop();
        this.q0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.t0 - this.k0);
        this.k0 = this.q0.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.B != z) {
            h();
            this.B = z;
            io0 io0Var = this.q0;
            wk6 wk6Var = this.D0;
            if (z) {
                this.s0 = this.k0;
                xk6 xk6Var = this.E0;
                xk6Var.reset();
                xk6Var.setDuration(200L);
                xk6Var.setInterpolator(this.p0);
                if (wk6Var != null) {
                    io0Var.A = wk6Var;
                }
                io0Var.clearAnimation();
                io0Var.startAnimation(xk6Var);
                return;
            }
            xk6 xk6Var2 = new xk6(this, 1);
            this.y0 = xk6Var2;
            xk6Var2.setDuration(150L);
            io0Var.A = wk6Var;
            io0Var.clearAnimation();
            io0Var.startAnimation(this.y0);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z && this.B != z) {
            this.B = z;
            setTargetOffsetTopAndBottom((this.u0 + this.t0) - this.k0);
            io0 io0Var = this.q0;
            io0Var.setVisibility(0);
            this.w0.setAlpha(255);
            xk6 xk6Var = new xk6(this, 0);
            this.x0 = xk6Var;
            xk6Var.setDuration(this.j0);
            wk6 wk6Var = this.D0;
            if (wk6Var != null) {
                io0Var.A = wk6Var;
            }
            io0Var.clearAnimation();
            io0Var.startAnimation(this.x0);
            return;
        }
        m(z, false);
    }

    public final void o(float f) {
        float f2 = this.m0;
        float f3 = this.L;
        if (f - f2 > f3 && !this.n0) {
            this.l0 = f2 + f3;
            this.n0 = true;
            this.w0.setAlpha(76);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (isEnabled() && !g() && !this.B && !this.i0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.o0) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.o0 = motionEvent.getPointerId(i);
                                }
                            }
                        }
                    } else {
                        int i2 = this.o0;
                        if (i2 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.n0;
                }
                this.n0 = false;
                this.o0 = -1;
                return this.n0;
            }
            setTargetOffsetTopAndBottom(this.t0 - this.q0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.o0 = pointerId;
            this.n0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.m0 = motionEvent.getY(findPointerIndex2);
                return this.n0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A == null) {
                h();
            }
            View view = this.A;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.q0.getMeasuredWidth();
            int measuredHeight2 = this.q0.getMeasuredHeight();
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.k0;
            this.q0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A == null) {
            h();
        }
        View view = this.A;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.q0.measure(View.MeasureSpec.makeMeasureSpec(this.B0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.B0, 1073741824));
            this.r0 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.q0) {
                    this.r0 = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.e0.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.e0.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.c0;
            if (f > RecyclerView.A1) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.c0 = RecyclerView.A1;
                } else {
                    this.c0 = f - f2;
                    iArr[1] = i2;
                }
                j(this.c0);
            }
        }
        int[] iArr2 = this.f0;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0, this.h0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.d0.a = i;
        startNestedScroll(i & 2);
        this.c0 = RecyclerView.A1;
        this.i0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        bl6 bl6Var = (bl6) parcelable;
        super.onRestoreInstanceState(bl6Var.getSuperState());
        setRefreshing(bl6Var.A);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new bl6(super.onSaveInstanceState(), this.B);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.B && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.d0.a = 0;
        this.i0 = false;
        float f = this.c0;
        if (f > RecyclerView.A1) {
            i(f);
            this.c0 = RecyclerView.A1;
        } else {
            post(new tm3(11, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (isEnabled() && !g() && !this.B && !this.i0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.o0) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        this.o0 = motionEvent.getPointerId(i);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.o0 = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.o0);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y = motionEvent.getY(findPointerIndex);
                        o(y);
                        if (this.n0) {
                            float f = (y - this.l0) * 0.5f;
                            if (f > RecyclerView.A1) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.o0);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.n0) {
                        this.n0 = false;
                        i((motionEvent.getY(findPointerIndex2) - this.l0) * 0.5f);
                    }
                    this.o0 = -1;
                    return false;
                }
            } else {
                this.o0 = motionEvent.getPointerId(0);
                this.n0 = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.C0 && (view = this.A) != null) {
            WeakHashMap weakHashMap = aa7.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.q0.setScaleX(f);
        this.q0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        mo0 mo0Var = this.w0;
        lo0 lo0Var = mo0Var.A;
        lo0Var.i = iArr;
        lo0Var.a(0);
        lo0Var.a(0);
        mo0Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.R = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.C0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        d64 d64Var = this.e0;
        if (d64Var.d) {
            ViewGroup viewGroup = d64Var.c;
            WeakHashMap weakHashMap = aa7.a;
            viewGroup.stopNestedScroll();
        }
        d64Var.d = z;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.q0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.B0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.B0 = (int) (displayMetrics.density * 40.0f);
        }
        this.q0.setImageDrawable(null);
        this.w0.c(i);
        this.q0.setImageDrawable(this.w0);
    }

    public void setSlingshotDistance(int i) {
        this.v0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        io0 io0Var = this.q0;
        io0Var.bringToFront();
        WeakHashMap weakHashMap = aa7.a;
        io0Var.offsetTopAndBottom(i);
        this.k0 = io0Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.e0.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.e0.h(0);
    }

    public void setOnChildScrollUpCallback(zk6 zk6Var) {
    }

    public void setOnRefreshListener(al6 al6Var) {
    }
}
