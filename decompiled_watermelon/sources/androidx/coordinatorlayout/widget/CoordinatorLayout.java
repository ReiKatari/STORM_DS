package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements e64, f64 {
    public static final String r0;
    public static final Class[] s0;
    public static final ThreadLocal t0;
    public static final hd2 u0;
    public static final qq4 v0;
    public final ArrayList A;
    public final q9 B;
    public final ArrayList L;
    public final ArrayList R;
    public final int[] c0;
    public final int[] d0;
    public boolean e0;
    public boolean f0;
    public final int[] g0;
    public View h0;
    public View i0;
    public a21 j0;
    public boolean k0;
    public vf7 l0;
    public boolean m0;
    public Drawable n0;
    public ViewGroup.OnHierarchyChangeListener o0;
    public bq0 p0;
    public final hj7 q0;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        r0 = str;
        u0 = new hd2(10);
        s0 = new Class[]{Context.class, AttributeSet.class};
        t0 = new ThreadLocal();
        v0 = new qq4();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [hj7, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.A = new ArrayList();
        this.B = new q9(8);
        this.L = new ArrayList();
        this.R = new ArrayList();
        this.c0 = new int[2];
        this.d0 = new int[2];
        this.q0 = new Object();
        int[] iArr = ux4.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            v11.q(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.g0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.g0;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.n0 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new y11(this));
        WeakHashMap weakHashMap = aa7.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) v0.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, z11 z11Var, int i2, int i3) {
        int width;
        int height;
        int i4 = z11Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = z11Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static z11 n(View view) {
        z11 z11Var = (z11) view.getLayoutParams();
        if (!z11Var.b) {
            x11 x11Var = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                x11Var = (x11) cls.getAnnotation(x11.class);
                if (x11Var != null) {
                    break;
                }
            }
            if (x11Var != null) {
                try {
                    w11 w11Var = (w11) x11Var.value().getDeclaredConstructor(null).newInstance(null);
                    w11 w11Var2 = z11Var.a;
                    if (w11Var2 != w11Var) {
                        if (w11Var2 != null) {
                            w11Var2.e();
                        }
                        z11Var.a = w11Var;
                        z11Var.b = true;
                        if (w11Var != null) {
                            w11Var.c(z11Var);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + x11Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            z11Var.b = true;
        }
        return z11Var;
    }

    public static void u(View view, int i) {
        z11 z11Var = (z11) view.getLayoutParams();
        int i2 = z11Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = aa7.a;
            view.offsetLeftAndRight(i - i2);
            z11Var.i = i;
        }
    }

    public static void v(View view, int i) {
        z11 z11Var = (z11) view.getLayoutParams();
        int i2 = z11Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = aa7.a;
            view.offsetTopAndBottom(i - i2);
            z11Var.j = i;
        }
    }

    @Override // defpackage.e64
    public final void a(View view, View view2, int i, int i2) {
        hj7 hj7Var = this.q0;
        if (i2 == 1) {
            hj7Var.b = i;
        } else {
            hj7Var.a = i;
        }
        this.i0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((z11) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.e64
    public final void b(View view, int i) {
        hj7 hj7Var = this.q0;
        if (i == 1) {
            hj7Var.b = 0;
        } else {
            hj7Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            z11 z11Var = (z11) childAt.getLayoutParams();
            if (z11Var.a(i)) {
                w11 w11Var = z11Var.a;
                if (w11Var != null) {
                    w11Var.p(childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        z11Var.n = false;
                    }
                } else {
                    z11Var.m = false;
                }
            }
        }
        this.i0 = null;
    }

    @Override // defpackage.e64
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        w11 w11Var;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                z11 z11Var = (z11) childAt.getLayoutParams();
                if (z11Var.a(i3) && (w11Var = z11Var.a) != null) {
                    int[] iArr2 = this.c0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    w11Var.j(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof z11) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f64
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        w11 w11Var;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                z11 z11Var = (z11) childAt.getLayoutParams();
                if (z11Var.a(i5) && (w11Var = z11Var.a) != null) {
                    int[] iArr2 = this.c0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    w11Var.k(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i6, iArr2[0]);
                    } else {
                        i6 = Math.min(i6, iArr2[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i7, iArr2[1]);
                    } else {
                        i7 = Math.min(i7, iArr2[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        w11 w11Var = ((z11) view.getLayoutParams()).a;
        if (w11Var != null) {
            w11Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.n0;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // defpackage.e64
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.d0);
    }

    @Override // defpackage.e64
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                z11 z11Var = (z11) childAt.getLayoutParams();
                w11 w11Var = z11Var.a;
                if (w11Var != null) {
                    boolean o = w11Var.o(childAt, i, i2);
                    z |= o;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z11Var.n = o;
                        }
                    } else {
                        z11Var.m = o;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        z11Var.n = false;
                    }
                } else {
                    z11Var.m = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new z11();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof z11) {
            return new z11((z11) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new z11((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new z11(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.A);
    }

    public final vf7 getLastWindowInsets() {
        return this.l0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        hj7 hj7Var = this.q0;
        return hj7Var.b | hj7Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.n0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(z11 z11Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) z11Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) z11Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) z11Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) z11Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        m66 m66Var = (m66) this.B.L;
        int i = m66Var.L;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) m66Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m66Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.R;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = ka7.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ka7.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ka7.a(this, view, matrix);
        ThreadLocal threadLocal3 = ka7.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.g0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i, int i2) {
        qq4 qq4Var = v0;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            qq4Var.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.k0) {
            if (this.j0 == null) {
                this.j0 = new a21(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.j0);
        }
        if (this.l0 == null) {
            WeakHashMap weakHashMap = aa7.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.k0 && this.j0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.j0);
        }
        View view = this.i0;
        if (view != null) {
            b(view, 0);
        }
        this.f0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.m0 && this.n0 != null) {
            vf7 vf7Var = this.l0;
            if (vf7Var != null) {
                i = vf7Var.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.n0.setBounds(0, 0, getWidth(), i);
                this.n0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        w11 w11Var;
        WeakHashMap weakHashMap = aa7.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((w11Var = ((z11) view.getLayoutParams()).a) == null || !w11Var.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                z11 z11Var = (z11) childAt.getLayoutParams();
                if (z11Var.a(0)) {
                    w11 w11Var = z11Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        w11 w11Var;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                z11 z11Var = (z11) childAt.getLayoutParams();
                if (z11Var.a(0) && (w11Var = z11Var.a) != null) {
                    z |= w11Var.i(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof b21)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b21 b21Var = (b21) parcelable;
        super.onRestoreInstanceState(b21Var.A);
        SparseArray sparseArray = b21Var.L;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            w11 w11Var = n(childAt).a;
            if (id != -1 && w11Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                w11Var.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b21, r, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        ?? rVar = new r(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            w11 w11Var = ((z11) childAt.getLayoutParams()).a;
            if (id != -1 && w11Var != null && (n = w11Var.n(childAt)) != null) {
                sparseArray.append(id, n);
            }
        }
        rVar.L = sparseArray;
        return rVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.h0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.h0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            z11 r6 = (defpackage.z11) r6
            w11 r6 = r6.a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.h0
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.h0
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect g;
        Rect g2;
        int i2;
        z11 z11Var = (z11) view.getLayoutParams();
        View view2 = z11Var.k;
        if (view2 == null && z11Var.f != -1) {
            i.n("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        qq4 qq4Var = v0;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                z11 z11Var2 = (z11) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, z11Var2, measuredWidth, measuredHeight);
                h(z11Var2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                qq4Var.c(g);
                g2.setEmpty();
                qq4Var.c(g2);
            }
        }
        int i3 = z11Var.e;
        if (i3 >= 0) {
            z11 z11Var3 = (z11) view.getLayoutParams();
            int i4 = z11Var3.c;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int m = m(i3) - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    m += measuredWidth2;
                }
            } else {
                m += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 != 80) {
                    i2 = 0;
                } else {
                    i2 = measuredHeight2;
                }
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) z11Var3).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) z11Var3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) z11Var3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) z11Var3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        z11 z11Var4 = (z11) view.getLayoutParams();
        g = g();
        g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) z11Var4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) z11Var4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) z11Var4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) z11Var4).bottomMargin);
        if (this.l0 != null) {
            WeakHashMap weakHashMap = aa7.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g.left = this.l0.b() + g.left;
                g.top = this.l0.d() + g.top;
                g.right -= this.l0.c();
                g.bottom -= this.l0.a();
            }
        }
        g2 = g();
        int i7 = z11Var4.c;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
        view.layout(g2.left, g2.top, g2.right, g2.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.L;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        hd2 hd2Var = u0;
        if (hd2Var != null) {
            Collections.sort(arrayList, hd2Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            w11 w11Var = ((z11) view.getLayoutParams()).a;
            if (z && actionMasked != 0) {
                if (w11Var != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A1, RecyclerView.A1, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            w11Var.q(view, motionEvent2);
                        }
                    } else {
                        w11Var.f(this, view, motionEvent2);
                    }
                }
            } else if (!z && w11Var != null) {
                if (i != 0) {
                    if (i == 1) {
                        z = w11Var.q(view, motionEvent);
                    }
                } else {
                    z = w11Var.f(this, view, motionEvent);
                }
                if (z) {
                    this.h0 = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        w11 w11Var = ((z11) view.getLayoutParams()).a;
        if (w11Var != null) {
            w11Var.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.e0) {
            t(false);
            this.e0 = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.A;
        arrayList.clear();
        q9 q9Var = this.B;
        m66 m66Var = (m66) q9Var.L;
        pq4 pq4Var = (pq4) q9Var.B;
        m66 m66Var2 = (m66) q9Var.L;
        int i = m66Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) m66Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                pq4Var.c(arrayList2);
            }
        }
        m66Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            z11 n = n(childAt);
            int i4 = n.f;
            if (i4 == -1) {
                n.l = null;
                n.k = null;
            } else {
                View view = n.k;
                if (view != null && view.getId() == i4) {
                    View view2 = n.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        } else {
                            n.l = null;
                            n.k = null;
                        }
                    }
                    n.l = view2;
                }
                View findViewById = findViewById(i4);
                n.k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            n.l = null;
                            n.k = null;
                        } else {
                            i.n("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n.l = null;
                                    n.k = null;
                                } else {
                                    i.n("Anchor must not be a descendant of the anchored view");
                                    return;
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        n.l = findViewById;
                    }
                } else if (isInEditMode()) {
                    n.l = null;
                    n.k = null;
                } else {
                    f81.r("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                }
            }
            if (!m66Var2.containsKey(childAt)) {
                m66Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = aa7.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((z11) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            w11 w11Var = n.a;
                            if (w11Var != null) {
                                w11Var.b(childAt);
                            }
                        }
                    }
                    if (!m66Var2.containsKey(childAt2) && !m66Var2.containsKey(childAt2)) {
                        m66Var2.put(childAt2, null);
                    }
                    if (m66Var2.containsKey(childAt2) && m66Var2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) m66Var2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) pq4Var.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            m66Var2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        i.i("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) q9Var.R;
        arrayList4.clear();
        HashSet hashSet = (HashSet) q9Var.X;
        hashSet.clear();
        int i6 = m66Var2.L;
        for (int i7 = 0; i7 < i6; i7++) {
            q9Var.u(m66Var2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.o0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.n0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.n0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.n0.setState(getDrawableState());
                }
                Drawable drawable4 = this.n0;
                WeakHashMap weakHashMap = aa7.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.n0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.n0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = aa7.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.n0;
        if (drawable != null && drawable.isVisible() != z) {
            this.n0.setVisible(z, false);
        }
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            w11 w11Var = ((z11) childAt.getLayoutParams()).a;
            if (w11Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A1, RecyclerView.A1, 0);
                if (z) {
                    w11Var.f(this, childAt, obtain);
                } else {
                    w11Var.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((z11) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.h0 = null;
        this.e0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.n0) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = aa7.a;
        if (getFitsSystemWindows()) {
            if (this.p0 == null) {
                this.p0 = new bq0(28, this);
            }
            s97.c(this, this.p0);
            setSystemUiVisibility(1280);
            return;
        }
        s97.c(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new z11(getContext(), attributeSet);
    }
}
