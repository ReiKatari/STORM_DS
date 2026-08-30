package androidx.swiperefreshlayout.widget;

import a6.p0;
import a6.r;
import a6.s;
import a6.t;
import a6.u;
import a6.x0;
import a8.a;
import a8.d;
import a8.e;
import a8.f;
import a8.g;
import a8.h;
import a8.i;
import a8.j;
import a8.k;
import a8.m;
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
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements t, s {
    public static final int[] H0 = {16842766};
    public View A;
    public i A0;
    public k B;
    public boolean B0;
    public int C0;
    public boolean D0;
    public final g E0;
    public final h F0;
    public final h G0;
    public boolean L;
    public final int R;

    /* renamed from: b0  reason: collision with root package name */
    public float f1677b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f1678c0;

    /* renamed from: d0  reason: collision with root package name */
    public final u f1679d0;

    /* renamed from: e0  reason: collision with root package name */
    public final r f1680e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f1681f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int[] f1682g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int[] f1683h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1684i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f1685j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1686k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f1687l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f1688m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1689n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1690o0;
    public final DecelerateInterpolator p0;

    /* renamed from: q0  reason: collision with root package name */
    public final a f1691q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f1692r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1693s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f1694t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f1695u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f1696v0;

    /* renamed from: w0  reason: collision with root package name */
    public final e f1697w0;

    /* renamed from: x0  reason: collision with root package name */
    public h f1698x0;

    /* renamed from: y0  reason: collision with root package name */
    public h f1699y0;

    /* renamed from: z0  reason: collision with root package name */
    public i f1700z0;

    /* JADX WARN: Type inference failed for: r1v14, types: [a6.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [a8.a, android.widget.ImageView, android.view.View] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.f1677b0 = -1.0f;
        this.f1681f0 = new int[2];
        this.f1682g0 = new int[2];
        this.f1683h0 = new int[2];
        this.f1690o0 = -1;
        this.f1692r0 = -1;
        this.E0 = new g(this, 0);
        this.F0 = new h(this, 2);
        this.G0 = new h(this, 3);
        this.R = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1685j0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.p0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C0 = (int) (displayMetrics.density * 40.0f);
        ?? imageView = new ImageView(getContext());
        float f8 = imageView.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(z7.a.f14968a);
        imageView.B = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = x0.f533a;
        p0.j(imageView, f8 * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.B);
        imageView.setBackground(shapeDrawable);
        this.f1691q0 = imageView;
        e eVar = new e(getContext());
        this.f1697w0 = eVar;
        eVar.c(1);
        this.f1691q0.setImageDrawable(this.f1697w0);
        this.f1691q0.setVisibility(8);
        addView(this.f1691q0);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f1695u0 = i2;
        this.f1677b0 = i2;
        this.f1679d0 = new Object();
        this.f1680e0 = new r(this);
        setNestedScrollingEnabled(true);
        int i10 = -this.C0;
        this.f1686k0 = i10;
        this.f1694t0 = i10;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, H0);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i2) {
        this.f1691q0.getBackground().setAlpha(i2);
        this.f1697w0.setAlpha(i2);
    }

    @Override // a6.s
    public final void a(View view, View view2, int i2, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // a6.s
    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a6.s
    public final void c(View view, int i2, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i2, i10, iArr);
        }
    }

    @Override // a6.t
    public final void d(View view, int i2, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        if (i13 == 0) {
            int i15 = iArr[1];
            if (i13 == 0) {
                this.f1680e0.d(i2, i10, i11, i12, this.f1682g0, i13, iArr);
            }
            int i16 = i12 - (iArr[1] - i15);
            if (i16 == 0) {
                i14 = i12 + this.f1682g0[1];
            } else {
                i14 = i16;
            }
            if (i14 < 0 && !g()) {
                float abs = this.f1678c0 + Math.abs(i14);
                this.f1678c0 = abs;
                j(abs);
                iArr[1] = iArr[1] + i16;
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
    public final boolean dispatchNestedFling(float f8, float f10, boolean z10) {
        return this.f1680e0.a(f8, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f10) {
        return this.f1680e0.b(f8, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i10, int[] iArr, int[] iArr2) {
        return this.f1680e0.c(i2, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i10, int i11, int i12, int[] iArr) {
        return this.f1680e0.d(i2, i10, i11, i12, iArr, 0, null);
    }

    @Override // a6.s
    public final void e(View view, int i2, int i10, int i11, int i12, int i13) {
        d(view, i2, i10, i11, i12, i13, this.f1683h0);
    }

    @Override // a6.s
    public final boolean f(View view, View view2, int i2, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i2);
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
    public final int getChildDrawingOrder(int i2, int i10) {
        int i11 = this.f1692r0;
        if (i11 >= 0) {
            if (i10 == i2 - 1) {
                return i11;
            }
            if (i10 >= i11) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        u uVar = this.f1679d0;
        return uVar.f516b | uVar.f515a;
    }

    public int getProgressCircleDiameter() {
        return this.C0;
    }

    public int getProgressViewEndOffset() {
        return this.f1695u0;
    }

    public int getProgressViewStartOffset() {
        return this.f1694t0;
    }

    public final void h() {
        if (this.A == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f1691q0)) {
                    this.A = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1680e0.f(0);
    }

    public final void i(float f8) {
        if (f8 > this.f1677b0) {
            m(true, true);
            return;
        }
        this.L = false;
        e eVar = this.f1697w0;
        d dVar = eVar.A;
        dVar.f646e = 0.0f;
        dVar.f647f = 0.0f;
        eVar.invalidateSelf();
        g gVar = new g(this, 1);
        this.f1693s0 = this.f1686k0;
        h hVar = this.G0;
        hVar.reset();
        hVar.setDuration(200L);
        hVar.setInterpolator(this.p0);
        a aVar = this.f1691q0;
        aVar.A = gVar;
        aVar.clearAnimation();
        this.f1691q0.startAnimation(hVar);
        e eVar2 = this.f1697w0;
        d dVar2 = eVar2.A;
        if (dVar2.f654n) {
            dVar2.f654n = false;
        }
        eVar2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1680e0.f512d;
    }

    public final void j(float f8) {
        i iVar;
        i iVar2;
        e eVar = this.f1697w0;
        d dVar = eVar.A;
        if (!dVar.f654n) {
            dVar.f654n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f8 / this.f1677b0));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f8) - this.f1677b0;
        int i2 = this.f1696v0;
        if (i2 <= 0) {
            i2 = this.f1695u0;
        }
        float f10 = i2;
        double max2 = Math.max(0.0f, Math.min(abs, f10 * 2.0f) / f10) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i10 = this.f1694t0 + ((int) ((f10 * min) + (f10 * pow * 2.0f)));
        if (this.f1691q0.getVisibility() != 0) {
            this.f1691q0.setVisibility(0);
        }
        this.f1691q0.setScaleX(1.0f);
        this.f1691q0.setScaleY(1.0f);
        int i11 = (f8 > this.f1677b0 ? 1 : (f8 == this.f1677b0 ? 0 : -1));
        e eVar2 = this.f1697w0;
        if (i11 < 0) {
            if (eVar2.A.f660t > 76 && ((iVar2 = this.f1700z0) == null || !iVar2.hasStarted() || iVar2.hasEnded())) {
                i iVar3 = new i(this, this.f1697w0.A.f660t, 76);
                iVar3.setDuration(300L);
                a aVar = this.f1691q0;
                aVar.A = null;
                aVar.clearAnimation();
                this.f1691q0.startAnimation(iVar3);
                this.f1700z0 = iVar3;
            }
        } else if (eVar2.A.f660t < 255 && ((iVar = this.A0) == null || !iVar.hasStarted() || iVar.hasEnded())) {
            i iVar4 = new i(this, this.f1697w0.A.f660t, 255);
            iVar4.setDuration(300L);
            a aVar2 = this.f1691q0;
            aVar2.A = null;
            aVar2.clearAnimation();
            this.f1691q0.startAnimation(iVar4);
            this.A0 = iVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        e eVar3 = this.f1697w0;
        d dVar2 = eVar3.A;
        dVar2.f646e = 0.0f;
        dVar2.f647f = min2;
        eVar3.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        e eVar4 = this.f1697w0;
        d dVar3 = eVar4.A;
        if (min3 != dVar3.f656p) {
            dVar3.f656p = min3;
        }
        eVar4.invalidateSelf();
        e eVar5 = this.f1697w0;
        eVar5.A.f648g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        eVar5.invalidateSelf();
        setTargetOffsetTopAndBottom(i10 - this.f1686k0);
    }

    public final void k(float f8) {
        int i2 = this.f1693s0;
        setTargetOffsetTopAndBottom((i2 + ((int) ((this.f1694t0 - i2) * f8))) - this.f1691q0.getTop());
    }

    public final void l() {
        this.f1691q0.clearAnimation();
        this.f1697w0.stop();
        this.f1691q0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f1694t0 - this.f1686k0);
        this.f1686k0 = this.f1691q0.getTop();
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L != z10) {
            this.B0 = z11;
            h();
            this.L = z10;
            g gVar = this.E0;
            if (z10) {
                this.f1693s0 = this.f1686k0;
                h hVar = this.F0;
                hVar.reset();
                hVar.setDuration(200L);
                hVar.setInterpolator(this.p0);
                if (gVar != null) {
                    this.f1691q0.A = gVar;
                }
                this.f1691q0.clearAnimation();
                this.f1691q0.startAnimation(hVar);
                return;
            }
            h hVar2 = new h(this, 1);
            this.f1699y0 = hVar2;
            hVar2.setDuration(150L);
            a aVar = this.f1691q0;
            aVar.A = gVar;
            aVar.clearAnimation();
            this.f1691q0.startAnimation(this.f1699y0);
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z10 && this.L != z10) {
            this.L = z10;
            setTargetOffsetTopAndBottom((this.f1695u0 + this.f1694t0) - this.f1686k0);
            this.B0 = z11;
            this.f1691q0.setVisibility(0);
            this.f1697w0.setAlpha(255);
            h hVar = new h(this, 0);
            this.f1698x0 = hVar;
            hVar.setDuration(this.f1685j0);
            g gVar = this.E0;
            if (gVar != null) {
                this.f1691q0.A = gVar;
            }
            this.f1691q0.clearAnimation();
            this.f1691q0.startAnimation(this.f1698x0);
            return;
        }
        m(z10, false);
    }

    public final void o(float f8) {
        float f10 = this.f1688m0;
        float f11 = this.R;
        if (f8 - f10 > f11 && !this.f1689n0) {
            this.f1687l0 = f10 + f11;
            this.f1689n0 = true;
            this.f1697w0.setAlpha(76);
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
        int i2 = 0;
        if (isEnabled() && !g() && !this.L && !this.f1684i0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.f1690o0) {
                                    if (actionIndex == 0) {
                                        i2 = 1;
                                    }
                                    this.f1690o0 = motionEvent.getPointerId(i2);
                                }
                            }
                        }
                    } else {
                        int i10 = this.f1690o0;
                        if (i10 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.f1689n0;
                }
                this.f1689n0 = false;
                this.f1690o0 = -1;
                return this.f1689n0;
            }
            setTargetOffsetTopAndBottom(this.f1694t0 - this.f1691q0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f1690o0 = pointerId;
            this.f1689n0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.f1688m0 = motionEvent.getY(findPointerIndex2);
                return this.f1689n0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
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
            int measuredWidth2 = this.f1691q0.getMeasuredWidth();
            int measuredHeight2 = this.f1691q0.getMeasuredHeight();
            int i13 = measuredWidth / 2;
            int i14 = measuredWidth2 / 2;
            int i15 = this.f1686k0;
            this.f1691q0.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        if (this.A == null) {
            h();
        }
        View view = this.A;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1691q0.measure(View.MeasureSpec.makeMeasureSpec(this.C0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.C0, 1073741824));
            this.f1692r0 = -1;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                if (getChildAt(i11) == this.f1691q0) {
                    this.f1692r0 = i11;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f10, boolean z10) {
        return this.f1680e0.a(f8, f10, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f10) {
        return this.f1680e0.b(f8, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i10, int[] iArr) {
        if (i10 > 0) {
            float f8 = this.f1678c0;
            if (f8 > 0.0f) {
                float f10 = i10;
                if (f10 > f8) {
                    iArr[1] = (int) f8;
                    this.f1678c0 = 0.0f;
                } else {
                    this.f1678c0 = f8 - f10;
                    iArr[1] = i10;
                }
                j(this.f1678c0);
            }
        }
        int[] iArr2 = this.f1681f0;
        if (dispatchNestedPreScroll(i2 - iArr[0], i10 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i10, int i11, int i12) {
        d(view, i2, i10, i11, i12, 0, this.f1683h0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1679d0.f515a = i2;
        startNestedScroll(i2 & 2);
        this.f1678c0 = 0.0f;
        this.f1684i0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        setRefreshing(mVar.A);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new m(super.onSaveInstanceState(), this.L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if (isEnabled() && !this.L && (i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f1679d0.f515a = 0;
        this.f1684i0 = false;
        float f8 = this.f1678c0;
        if (f8 > 0.0f) {
            i(f8);
            this.f1678c0 = 0.0f;
        } else {
            post(new f(0, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (isEnabled() && !g() && !this.L && !this.f1684i0) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.f1690o0) {
                                        if (actionIndex == 0) {
                                            i2 = 1;
                                        }
                                        this.f1690o0 = motionEvent.getPointerId(i2);
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
                            this.f1690o0 = motionEvent.getPointerId(actionIndex2);
                            return true;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1690o0);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y10 = motionEvent.getY(findPointerIndex);
                        o(y10);
                        if (this.f1689n0) {
                            float f8 = (y10 - this.f1687l0) * 0.5f;
                            if (f8 > 0.0f) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                j(f8);
                            }
                        }
                        return true;
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f1690o0);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.f1689n0) {
                        this.f1689n0 = false;
                        i((motionEvent.getY(findPointerIndex2) - this.f1687l0) * 0.5f);
                    }
                    this.f1690o0 = -1;
                    return false;
                }
            } else {
                this.f1690o0 = motionEvent.getPointerId(0);
                this.f1689n0 = false;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        if (this.D0 && (view = this.A) != null) {
            WeakHashMap weakHashMap = x0.f533a;
            if (!p0.g(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f8) {
        this.f1691q0.setScaleX(f8);
        this.f1691q0.setScaleY(f8);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        e eVar = this.f1697w0;
        d dVar = eVar.A;
        dVar.f650i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = context.getColor(iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f1677b0 = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            l();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.D0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        r rVar = this.f1680e0;
        if (rVar.f512d) {
            ViewGroup viewGroup = rVar.f511c;
            WeakHashMap weakHashMap = x0.f533a;
            p0.m(viewGroup);
        }
        rVar.f512d = z10;
    }

    public void setOnRefreshListener(k kVar) {
        this.B = kVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.f1691q0.setBackgroundColor(i2);
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i2));
    }

    public void setRefreshing(boolean z10) {
        n(z10, false);
    }

    public void setSize(int i2) {
        if (i2 != 0 && i2 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i2 == 0) {
            this.C0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.C0 = (int) (displayMetrics.density * 40.0f);
        }
        this.f1691q0.setImageDrawable(null);
        this.f1697w0.c(i2);
        this.f1691q0.setImageDrawable(this.f1697w0);
    }

    public void setSlingshotDistance(int i2) {
        this.f1696v0 = i2;
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        a aVar = this.f1691q0;
        aVar.bringToFront();
        WeakHashMap weakHashMap = x0.f533a;
        aVar.offsetTopAndBottom(i2);
        this.f1686k0 = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1680e0.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f1680e0.h(0);
    }

    public void setOnChildScrollUpCallback(j jVar) {
    }
}
