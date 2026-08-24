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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements le4, ke4 {
    public static final int[] H0 = {16842766};
    public View A;
    public sw6 A0;
    public boolean B;
    public sw6 B0;
    public int C0;
    public boolean D0;
    public final qw6 E0;
    public final rw6 F0;
    public final rw6 G0;
    public final int L;
    public float R;
    public float d0;
    public final dy7 e0;
    public final je4 f0;
    public final int[] g0;
    public final int[] h0;
    public final int[] i0;
    public boolean j0;
    public final int k0;
    public int l0;
    public float m0;
    public float n0;
    public boolean o0;
    public int p0;
    public final DecelerateInterpolator q0;
    public final sq0 r0;
    public int s0;
    public int t0;
    public final int u0;
    public final int v0;
    public int w0;
    public final wq0 x0;
    public rw6 y0;
    public rw6 z0;

    /* JADX WARN: Type inference failed for: r1v14, types: [dy7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [sq0, android.widget.ImageView, android.view.View] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = false;
        this.R = -1.0f;
        this.g0 = new int[2];
        this.h0 = new int[2];
        this.i0 = new int[2];
        this.p0 = -1;
        this.s0 = -1;
        this.E0 = new qw6(this, 0);
        this.F0 = new rw6(this, 2);
        this.G0 = new rw6(this, 3);
        this.L = ViewConfiguration.get(context).getScaledTouchSlop();
        this.k0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.q0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C0 = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(k75.a);
        imageView.B = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = ao7.a;
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.B);
        imageView.setBackground(shapeDrawable);
        this.r0 = imageView;
        wq0 wq0Var = new wq0(getContext());
        this.x0 = wq0Var;
        wq0Var.c(1);
        this.r0.setImageDrawable(this.x0);
        this.r0.setVisibility(8);
        addView(this.r0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.v0 = i;
        this.R = i;
        this.e0 = new Object();
        this.f0 = new je4(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.C0;
        this.l0 = i2;
        this.u0 = i2;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, H0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.r0.getBackground().setAlpha(i);
        this.x0.setAlpha(i);
    }

    @Override // defpackage.le4
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            if (i5 == 0) {
                this.f0.d(i, i2, i3, i4, this.h0, i5, iArr);
            }
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = this.h0[1] + i4;
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !g()) {
                float abs = this.d0 + Math.abs(i6);
                this.d0 = abs;
                j(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    @Override // defpackage.ke4
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, i5, this.i0);
    }

    @Override // defpackage.ke4
    public final boolean c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.ke4
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
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
        return this.f0.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f0.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f0.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f0.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.ke4
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.ke4
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
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
        int i3 = this.s0;
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
        dy7 dy7Var = this.e0;
        return dy7Var.b | dy7Var.a;
    }

    public int getProgressCircleDiameter() {
        return this.C0;
    }

    public int getProgressViewEndOffset() {
        return this.v0;
    }

    public int getProgressViewStartOffset() {
        return this.u0;
    }

    public final void h() {
        if (this.A == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.r0)) {
                    this.A = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f0.f(0);
    }

    public final void i(float f) {
        if (f > this.R) {
            m(true, true);
            return;
        }
        this.B = false;
        wq0 wq0Var = this.x0;
        vq0 vq0Var = wq0Var.A;
        vq0Var.e = RecyclerView.B1;
        vq0Var.f = RecyclerView.B1;
        wq0Var.invalidateSelf();
        qw6 qw6Var = new qw6(this, 1);
        this.t0 = this.l0;
        rw6 rw6Var = this.G0;
        rw6Var.reset();
        rw6Var.setDuration(200L);
        rw6Var.setInterpolator(this.q0);
        sq0 sq0Var = this.r0;
        sq0Var.A = qw6Var;
        sq0Var.clearAnimation();
        sq0Var.startAnimation(rw6Var);
        vq0 vq0Var2 = wq0Var.A;
        if (vq0Var2.n) {
            vq0Var2.n = false;
        }
        wq0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f0.d;
    }

    public final void j(float f) {
        sw6 sw6Var;
        sw6 sw6Var2;
        wq0 wq0Var = this.x0;
        vq0 vq0Var = wq0Var.A;
        if (!vq0Var.n) {
            vq0Var.n = true;
        }
        wq0Var.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.R));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.R;
        int i = this.w0;
        if (i <= 0) {
            i = this.v0;
        }
        float f2 = i;
        double max2 = Math.max((float) RecyclerView.B1, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.u0 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        sq0 sq0Var = this.r0;
        if (sq0Var.getVisibility() != 0) {
            sq0Var.setVisibility(0);
        }
        sq0Var.setScaleX(1.0f);
        sq0Var.setScaleY(1.0f);
        if (f < this.R) {
            if (wq0Var.A.t > 76 && ((sw6Var2 = this.A0) == null || !sw6Var2.hasStarted() || sw6Var2.hasEnded())) {
                sw6 sw6Var3 = new sw6(this, wq0Var.A.t, 76);
                sw6Var3.setDuration(300L);
                sq0Var.A = null;
                sq0Var.clearAnimation();
                sq0Var.startAnimation(sw6Var3);
                this.A0 = sw6Var3;
            }
        } else if (wq0Var.A.t < 255 && ((sw6Var = this.B0) == null || !sw6Var.hasStarted() || sw6Var.hasEnded())) {
            sw6 sw6Var4 = new sw6(this, wq0Var.A.t, 255);
            sw6Var4.setDuration(300L);
            sq0Var.A = null;
            sq0Var.clearAnimation();
            sq0Var.startAnimation(sw6Var4);
            this.B0 = sw6Var4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        vq0 vq0Var2 = wq0Var.A;
        vq0Var2.e = RecyclerView.B1;
        vq0Var2.f = min2;
        wq0Var.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        vq0 vq0Var3 = wq0Var.A;
        if (min3 != vq0Var3.p) {
            vq0Var3.p = min3;
        }
        wq0Var.invalidateSelf();
        wq0Var.A.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        wq0Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.l0);
    }

    public final void k(float f) {
        int i = this.t0;
        setTargetOffsetTopAndBottom((i + ((int) ((this.u0 - i) * f))) - this.r0.getTop());
    }

    public final void l() {
        this.r0.clearAnimation();
        this.x0.stop();
        this.r0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.u0 - this.l0);
        this.l0 = this.r0.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.B != z) {
            h();
            this.B = z;
            sq0 sq0Var = this.r0;
            qw6 qw6Var = this.E0;
            if (z) {
                this.t0 = this.l0;
                rw6 rw6Var = this.F0;
                rw6Var.reset();
                rw6Var.setDuration(200L);
                rw6Var.setInterpolator(this.q0);
                if (qw6Var != null) {
                    sq0Var.A = qw6Var;
                }
                sq0Var.clearAnimation();
                sq0Var.startAnimation(rw6Var);
                return;
            }
            rw6 rw6Var2 = new rw6(this, 1);
            this.z0 = rw6Var2;
            rw6Var2.setDuration(150L);
            sq0Var.A = qw6Var;
            sq0Var.clearAnimation();
            sq0Var.startAnimation(this.z0);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z && this.B != z) {
            this.B = z;
            setTargetOffsetTopAndBottom((this.v0 + this.u0) - this.l0);
            sq0 sq0Var = this.r0;
            sq0Var.setVisibility(0);
            this.x0.setAlpha(255);
            rw6 rw6Var = new rw6(this, 0);
            this.y0 = rw6Var;
            rw6Var.setDuration(this.k0);
            qw6 qw6Var = this.E0;
            if (qw6Var != null) {
                sq0Var.A = qw6Var;
            }
            sq0Var.clearAnimation();
            sq0Var.startAnimation(this.y0);
            return;
        }
        m(z, false);
    }

    public final void o(float f) {
        float f2 = this.n0;
        float f3 = this.L;
        if (f - f2 > f3 && !this.o0) {
            this.m0 = f2 + f3;
            this.o0 = true;
            this.x0.setAlpha(76);
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
        if (isEnabled() && !g() && !this.B && !this.j0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.p0) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.p0 = motionEvent.getPointerId(i);
                                }
                            }
                        }
                    } else {
                        int i2 = this.p0;
                        if (i2 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.o0;
                }
                this.o0 = false;
                this.p0 = -1;
                return this.o0;
            }
            setTargetOffsetTopAndBottom(this.u0 - this.r0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.p0 = pointerId;
            this.o0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.n0 = motionEvent.getY(findPointerIndex2);
                return this.o0;
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
            int measuredWidth2 = this.r0.getMeasuredWidth();
            int measuredHeight2 = this.r0.getMeasuredHeight();
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.l0;
            this.r0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
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
            this.r0.measure(View.MeasureSpec.makeMeasureSpec(this.C0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.C0, 1073741824));
            this.s0 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.r0) {
                    this.s0 = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f0.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f0.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.d0;
            if (f > RecyclerView.B1) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.d0 = RecyclerView.B1;
                } else {
                    this.d0 = f - f2;
                    iArr[1] = i2;
                }
                j(this.d0);
            }
        }
        int[] iArr2 = this.g0;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(view, i, i2, i3, i4, 0, this.i0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.e0.a = i;
        startNestedScroll(i & 2);
        this.d0 = RecyclerView.B1;
        this.j0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        vw6 vw6Var = (vw6) parcelable;
        super.onRestoreInstanceState(vw6Var.getSuperState());
        setRefreshing(vw6Var.A);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new vw6(super.onSaveInstanceState(), this.B);
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
        this.e0.a = 0;
        this.j0 = false;
        float f = this.d0;
        if (f > RecyclerView.B1) {
            i(f);
            this.d0 = RecyclerView.B1;
        } else {
            post(new rk3(this, 13));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (isEnabled() && !g() && !this.B && !this.j0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.p0) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        this.p0 = motionEvent.getPointerId(i);
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
                            this.p0 = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.p0);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y = motionEvent.getY(findPointerIndex);
                        o(y);
                        if (this.o0) {
                            float f = (y - this.m0) * 0.5f;
                            if (f > RecyclerView.B1) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.p0);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.o0) {
                        this.o0 = false;
                        i((motionEvent.getY(findPointerIndex2) - this.m0) * 0.5f);
                    }
                    this.p0 = -1;
                    return false;
                }
            } else {
                this.p0 = motionEvent.getPointerId(0);
                this.o0 = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.D0 && (view = this.A) != null) {
            WeakHashMap weakHashMap = ao7.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.r0.setScaleX(f);
        this.r0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        wq0 wq0Var = this.x0;
        vq0 vq0Var = wq0Var.A;
        vq0Var.i = iArr;
        vq0Var.a(0);
        vq0Var.a(0);
        wq0Var.invalidateSelf();
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
        this.D0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        je4 je4Var = this.f0;
        if (je4Var.d) {
            ViewGroup viewGroup = je4Var.c;
            WeakHashMap weakHashMap = ao7.a;
            viewGroup.stopNestedScroll();
        }
        je4Var.d = z;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.r0.setBackgroundColor(i);
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
            this.C0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.C0 = (int) (displayMetrics.density * 40.0f);
        }
        this.r0.setImageDrawable(null);
        this.x0.c(i);
        this.r0.setImageDrawable(this.x0);
    }

    public void setSlingshotDistance(int i) {
        this.w0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        sq0 sq0Var = this.r0;
        sq0Var.bringToFront();
        WeakHashMap weakHashMap = ao7.a;
        sq0Var.offsetTopAndBottom(i);
        this.l0 = sq0Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f0.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f0.h(0);
    }

    public void setOnChildScrollUpCallback(tw6 tw6Var) {
    }

    public void setOnRefreshListener(uw6 uw6Var) {
    }
}
