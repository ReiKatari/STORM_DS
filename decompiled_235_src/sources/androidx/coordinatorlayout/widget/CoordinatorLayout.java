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
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ke4, le4 {
    public static final String s0;
    public static final Class[] t0;
    public static final ThreadLocal u0;
    public static final zh2 v0;
    public static final uz4 w0;
    public final ArrayList A;
    public final eb B;
    public final ArrayList L;
    public final ArrayList R;
    public final int[] d0;
    public final int[] e0;
    public boolean f0;
    public boolean g0;
    public final int[] h0;
    public View i0;
    public View j0;
    public i51 k0;
    public boolean l0;
    public vu7 m0;
    public boolean n0;
    public Drawable o0;
    public ViewGroup.OnHierarchyChangeListener p0;
    public d51 q0;
    public final dy7 r0;

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        s0 = str;
        v0 = new zh2(10);
        t0 = new Class[]{Context.class, AttributeSet.class};
        u0 = new ThreadLocal();
        w0 = new uz4();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [dy7, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.A = new ArrayList();
        this.B = new eb(8);
        this.L = new ArrayList();
        this.R = new ArrayList();
        this.d0 = new int[2];
        this.e0 = new int[2];
        this.r0 = new Object();
        int[] iArr = f75.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            yz0.q(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.h0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.h0;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.o0 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new g51(this));
        WeakHashMap weakHashMap = ao7.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) w0.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i, Rect rect, Rect rect2, h51 h51Var, int i2, int i3) {
        int width;
        int height;
        int i4 = h51Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = h51Var.d;
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

    public static h51 n(View view) {
        h51 h51Var = (h51) view.getLayoutParams();
        if (!h51Var.b) {
            f51 f51Var = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                f51Var = (f51) cls.getAnnotation(f51.class);
                if (f51Var != null) {
                    break;
                }
            }
            if (f51Var != null) {
                try {
                    e51 e51Var = (e51) f51Var.value().getDeclaredConstructor(null).newInstance(null);
                    e51 e51Var2 = h51Var.a;
                    if (e51Var2 != e51Var) {
                        if (e51Var2 != null) {
                            e51Var2.i();
                        }
                        h51Var.a = e51Var;
                        h51Var.b = true;
                        if (e51Var != null) {
                            e51Var.g(h51Var);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + f51Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            h51Var.b = true;
        }
        return h51Var;
    }

    public static void u(View view, int i) {
        h51 h51Var = (h51) view.getLayoutParams();
        int i2 = h51Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = ao7.a;
            view.offsetLeftAndRight(i - i2);
            h51Var.i = i;
        }
    }

    public static void v(View view, int i) {
        h51 h51Var = (h51) view.getLayoutParams();
        int i2 = h51Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = ao7.a;
            view.offsetTopAndBottom(i - i2);
            h51Var.j = i;
        }
    }

    @Override // defpackage.le4
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e51 e51Var;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                h51 h51Var = (h51) childAt.getLayoutParams();
                if (h51Var.a(i5) && (e51Var = h51Var.a) != null) {
                    int[] iArr2 = this.d0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e51Var.o(this, childAt, i2, i3, i4, iArr2);
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

    @Override // defpackage.ke4
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.e0);
    }

    @Override // defpackage.ke4
    public final boolean c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                h51 h51Var = (h51) childAt.getLayoutParams();
                e51 e51Var = h51Var.a;
                if (e51Var != null) {
                    boolean s = e51Var.s(childAt, i, i2);
                    z |= s;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            h51Var.n = s;
                        }
                    } else {
                        h51Var.m = s;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        h51Var.n = false;
                    }
                } else {
                    h51Var.m = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof h51) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ke4
    public final void d(View view, View view2, int i, int i2) {
        dy7 dy7Var = this.r0;
        if (i2 == 1) {
            dy7Var.b = i;
        } else {
            dy7Var.a = i;
        }
        this.j0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((h51) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e51 e51Var = ((h51) view.getLayoutParams()).a;
        if (e51Var != null) {
            e51Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o0;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // defpackage.ke4
    public final void e(View view, int i) {
        dy7 dy7Var = this.r0;
        if (i == 1) {
            dy7Var.b = 0;
        } else {
            dy7Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            h51 h51Var = (h51) childAt.getLayoutParams();
            if (h51Var.a(i)) {
                e51 e51Var = h51Var.a;
                if (e51Var != null) {
                    e51Var.t(childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        h51Var.n = false;
                    }
                } else {
                    h51Var.m = false;
                }
            }
        }
        this.j0 = null;
    }

    @Override // defpackage.ke4
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        e51 e51Var;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                h51 h51Var = (h51) childAt.getLayoutParams();
                if (h51Var.a(i3) && (e51Var = h51Var.a) != null) {
                    int[] iArr2 = this.d0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e51Var.n(this, childAt, view, i, i2, iArr2, i3);
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
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h51();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof h51) {
            return new h51((h51) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new h51((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new h51(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.A);
    }

    public final vu7 getLastWindowInsets() {
        return this.m0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        dy7 dy7Var = this.r0;
        return dy7Var.b | dy7Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.o0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(h51 h51Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h51Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) h51Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) h51Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) h51Var).bottomMargin));
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
        ci6 ci6Var = (ci6) this.B.L;
        int i = ci6Var.L;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ci6Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ci6Var.f(i2));
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
        ThreadLocal threadLocal = ko7.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ko7.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ko7.a(this, view, matrix);
        ThreadLocal threadLocal3 = ko7.b;
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
        int[] iArr = this.h0;
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
        uz4 uz4Var = w0;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            uz4Var.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.l0) {
            if (this.k0 == null) {
                this.k0 = new i51(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.k0);
        }
        if (this.m0 == null) {
            WeakHashMap weakHashMap = ao7.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.g0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.l0 && this.k0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k0);
        }
        View view = this.j0;
        if (view != null) {
            e(view, 0);
        }
        this.g0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.n0 && this.o0 != null) {
            vu7 vu7Var = this.m0;
            if (vu7Var != null) {
                i = vu7Var.d();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.o0.setBounds(0, 0, getWidth(), i);
                this.o0.draw(canvas);
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
        e51 e51Var;
        WeakHashMap weakHashMap = ao7.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((e51Var = ((h51) view.getLayoutParams()).a) == null || !e51Var.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        e51 e51Var;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        View view;
        int i15;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 < childCount) {
                View childAt = coordinatorLayout.getChildAt(i16);
                ci6 ci6Var = (ci6) coordinatorLayout.B.L;
                int i17 = ci6Var.L;
                for (int i18 = 0; i18 < i17; i18++) {
                    ArrayList arrayList2 = (ArrayList) ci6Var.i(i18);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z = true;
                        break loop0;
                    }
                }
                i16++;
            } else {
                z = false;
                break;
            }
        }
        if (z != coordinatorLayout.l0) {
            boolean z5 = coordinatorLayout.g0;
            if (z) {
                if (z5) {
                    if (coordinatorLayout.k0 == null) {
                        coordinatorLayout.k0 = new i51(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.k0);
                }
                coordinatorLayout.l0 = true;
            } else {
                if (z5 && coordinatorLayout.k0 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.k0);
                }
                coordinatorLayout.l0 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = ao7.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.m0 != null && coordinatorLayout.getFitsSystemWindows()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList3 = coordinatorLayout.A;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i15 = i21;
                i9 = paddingLeft;
                suggestedMinimumWidth = i23;
                z4 = false;
                i11 = paddingRight;
            } else {
                h51 h51Var = (h51) view2.getLayoutParams();
                int i24 = h51Var.e;
                if (i24 >= 0 && mode != 0) {
                    int m = coordinatorLayout.m(i24);
                    int i25 = h51Var.c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z2) || (absoluteGravity == 5 && z2)) {
                        max = Math.max(0, (size - paddingRight) - m);
                    } else if ((absoluteGravity == 5 && !z2) || (absoluteGravity == 3 && z2)) {
                        max = Math.max(0, m - paddingLeft);
                    }
                    int i26 = size3;
                    i5 = max;
                    i4 = i26;
                    if (!z3 && !view2.getFitsSystemWindows()) {
                        i6 = i4;
                        int c = coordinatorLayout.m0.c() + coordinatorLayout.m0.b();
                        int a = coordinatorLayout.m0.a() + coordinatorLayout.m0.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    } else {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    }
                    e51Var = h51Var.a;
                    if (e51Var == null) {
                        z4 = false;
                        i9 = paddingLeft;
                        i10 = i23;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        int i27 = i7;
                        i15 = i21;
                        int i28 = i8;
                        boolean l = e51Var.l(this, view2, i27, i5, i28);
                        view = view2;
                        i7 = i27;
                        i13 = i5;
                        i14 = i28;
                        if (l) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) h51Var).leftMargin + ((ViewGroup.MarginLayoutParams) h51Var).rightMargin);
                            int max3 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) h51Var).topMargin + ((ViewGroup.MarginLayoutParams) h51Var).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i9 = paddingLeft;
                        i10 = i23;
                        z4 = false;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        i13 = i5;
                        i14 = i8;
                        view = view2;
                        i15 = i21;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                    int max22 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) h51Var).leftMargin + ((ViewGroup.MarginLayoutParams) h51Var).rightMargin);
                    int max32 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) h51Var).topMargin + ((ViewGroup.MarginLayoutParams) h51Var).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                } else {
                    i3 = suggestedMinimumHeight;
                }
                i4 = size3;
                i5 = 0;
                if (!z3) {
                }
                i6 = i4;
                i7 = i;
                i8 = i2;
                e51Var = h51Var.a;
                if (e51Var == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                int max222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) h51Var).leftMargin + ((ViewGroup.MarginLayoutParams) h51Var).rightMargin);
                int max322 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) h51Var).topMargin + ((ViewGroup.MarginLayoutParams) h51Var).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i21 = i15 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i29 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                h51 h51Var = (h51) childAt.getLayoutParams();
                if (h51Var.a(0)) {
                    e51 e51Var = h51Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        e51 e51Var;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                h51 h51Var = (h51) childAt.getLayoutParams();
                if (h51Var.a(0) && (e51Var = h51Var.a) != null) {
                    z |= e51Var.m(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof j51)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j51 j51Var = (j51) parcelable;
        super.onRestoreInstanceState(j51Var.A);
        SparseArray sparseArray = j51Var.L;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            e51 e51Var = n(childAt).a;
            if (id != -1 && e51Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e51Var.q(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s, android.os.Parcelable, j51] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable r;
        ?? sVar = new s(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            e51 e51Var = ((h51) childAt.getLayoutParams()).a;
            if (id != -1 && e51Var != null && (r = e51Var.r(childAt)) != null) {
                sparseArray.append(id, r);
            }
        }
        sVar.L = sparseArray;
        return sVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
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
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean u;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.i0 == null) {
            z = r(motionEvent, 1);
        } else {
            z = false;
        }
        e51 e51Var = ((h51) this.i0.getLayoutParams()).a;
        if (e51Var != null) {
            u = e51Var.u(this.i0, motionEvent);
            motionEvent2 = null;
            if (this.i0 != null) {
                u |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return u;
            }
            t(false);
            return u;
        }
        u = false;
        motionEvent2 = null;
        if (this.i0 != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return u;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        int i4;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList2;
        h51 h51Var;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        View view;
        boolean z3;
        e51 e51Var;
        WeakHashMap weakHashMap = ao7.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.A;
        int size = arrayList3.size();
        Rect g = g();
        Rect g2 = g();
        Rect g3 = g();
        int i14 = 0;
        while (true) {
            uz4 uz4Var = w0;
            if (i14 < size) {
                View view2 = (View) arrayList3.get(i14);
                h51 h51Var2 = (h51) view2.getLayoutParams();
                if (i == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i4 = size;
                    rect = g3;
                    i2 = i14;
                } else {
                    int i15 = 0;
                    while (i15 < i14) {
                        if (h51Var2.l == ((View) arrayList3.get(i15))) {
                            h51 h51Var3 = (h51) view2.getLayoutParams();
                            if (h51Var3.k != null) {
                                Rect g4 = g();
                                Rect g5 = g();
                                h51 h51Var4 = h51Var2;
                                Rect g6 = g();
                                k(h51Var3.k, g4);
                                i(view2, g5, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                View view3 = view2;
                                int measuredHeight = view3.getMeasuredHeight();
                                arrayList2 = arrayList3;
                                h51Var = h51Var4;
                                i11 = i15;
                                layoutDirection = layoutDirection;
                                i13 = i14;
                                view = view3;
                                l(layoutDirection, g4, g6, h51Var3, measuredWidth, measuredHeight);
                                i12 = size;
                                rect2 = g3;
                                if (g6.left == g5.left && g6.top == g5.top) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                h(h51Var3, g6, measuredWidth, measuredHeight);
                                int i16 = g6.left - g5.left;
                                int i17 = g6.top - g5.top;
                                if (i16 != 0) {
                                    WeakHashMap weakHashMap2 = ao7.a;
                                    view.offsetLeftAndRight(i16);
                                }
                                if (i17 != 0) {
                                    WeakHashMap weakHashMap3 = ao7.a;
                                    view.offsetTopAndBottom(i17);
                                }
                                if (z3 && (e51Var = h51Var3.a) != null) {
                                    e51Var.h(this, view, h51Var3.k);
                                }
                                g4.setEmpty();
                                uz4Var.c(g4);
                                g5.setEmpty();
                                uz4Var.c(g5);
                                g6.setEmpty();
                                uz4Var.c(g6);
                                i15 = i11 + 1;
                                h51Var2 = h51Var;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i12;
                                i14 = i13;
                                g3 = rect2;
                            }
                        }
                        arrayList2 = arrayList3;
                        h51Var = h51Var2;
                        i11 = i15;
                        i12 = size;
                        rect2 = g3;
                        i13 = i14;
                        view = view2;
                        i15 = i11 + 1;
                        h51Var2 = h51Var;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i12;
                        i14 = i13;
                        g3 = rect2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    h51 h51Var5 = h51Var2;
                    int i18 = size;
                    Rect rect3 = g3;
                    i2 = i14;
                    View view4 = view2;
                    i(view4, g2, true);
                    if (h51Var5.g != 0 && !g2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(h51Var5.g, layoutDirection);
                        int i19 = absoluteGravity & 112;
                        if (i19 != 48) {
                            if (i19 == 80) {
                                g.bottom = Math.max(g.bottom, getHeight() - g2.top);
                            }
                        } else {
                            g.top = Math.max(g.top, g2.bottom);
                        }
                        int i20 = absoluteGravity & 7;
                        if (i20 != 3) {
                            if (i20 == 5) {
                                g.right = Math.max(g.right, getWidth() - g2.left);
                            }
                        } else {
                            g.left = Math.max(g.left, g2.right);
                        }
                    }
                    if (h51Var5.h != 0 && view4.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = ao7.a;
                        if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                            h51 h51Var6 = (h51) view4.getLayoutParams();
                            e51 e51Var2 = h51Var6.a;
                            Rect g7 = g();
                            Rect g8 = g();
                            g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                            if (e51Var2 != null && e51Var2.e(view4)) {
                                if (!g8.contains(g7)) {
                                    e41.k("Rect should be within the child's bounds. Rect:", g7.toShortString(), " | Bounds:", g8.toShortString());
                                    return;
                                }
                            } else {
                                g7.set(g8);
                            }
                            g8.setEmpty();
                            uz4Var.c(g8);
                            if (g7.isEmpty()) {
                                g7.setEmpty();
                                uz4Var.c(g7);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(h51Var6.h, layoutDirection);
                                if ((absoluteGravity2 & 48) == 48 && (i9 = (g7.top - ((ViewGroup.MarginLayoutParams) h51Var6).topMargin) - h51Var6.j) < (i10 = g.top)) {
                                    v(view4, i10 - i9);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g7.bottom) - ((ViewGroup.MarginLayoutParams) h51Var6).bottomMargin) + h51Var6.j) < (i8 = g.bottom)) {
                                    v(view4, height - i8);
                                    z = true;
                                }
                                if (!z) {
                                    v(view4, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i6 = (g7.left - ((ViewGroup.MarginLayoutParams) h51Var6).leftMargin) - h51Var6.i) < (i7 = g.left)) {
                                    u(view4, i7 - i6);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g7.right) - ((ViewGroup.MarginLayoutParams) h51Var6).rightMargin) + h51Var6.i) < (i5 = g.right)) {
                                    u(view4, width - i5);
                                    z2 = true;
                                }
                                if (!z2) {
                                    u(view4, 0);
                                }
                                g7.setEmpty();
                                uz4Var.c(g7);
                                if (i == 2) {
                                    rect = rect3;
                                    rect.set(((h51) view4.getLayoutParams()).o);
                                    if (rect.equals(g2)) {
                                        arrayList = arrayList4;
                                        i4 = i18;
                                    } else {
                                        ((h51) view4.getLayoutParams()).o.set(g2);
                                    }
                                } else {
                                    rect = rect3;
                                }
                                i3 = i2 + 1;
                                i4 = i18;
                                while (true) {
                                    arrayList = arrayList4;
                                    if (i3 >= i4) {
                                        View view5 = (View) arrayList.get(i3);
                                        e51 e51Var3 = ((h51) view5.getLayoutParams()).a;
                                        if (e51Var3 != null) {
                                            e51Var3.f(view5);
                                        }
                                        i3++;
                                        arrayList4 = arrayList;
                                    }
                                }
                            }
                        }
                    }
                    if (i == 2) {
                    }
                    i3 = i2 + 1;
                    i4 = i18;
                    while (true) {
                        arrayList = arrayList4;
                        if (i3 >= i4) {
                            break;
                        }
                        i3++;
                        arrayList4 = arrayList;
                    }
                }
                i14 = i2 + 1;
                size = i4;
                g3 = rect;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = g3;
                g.setEmpty();
                uz4Var.c(g);
                g2.setEmpty();
                uz4Var.c(g2);
                rect4.setEmpty();
                uz4Var.c(rect4);
                return;
            }
        }
    }

    public final void q(View view, int i) {
        Rect g;
        Rect g2;
        int i2;
        h51 h51Var = (h51) view.getLayoutParams();
        View view2 = h51Var.k;
        if (view2 == null && h51Var.f != -1) {
            i.m("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        uz4 uz4Var = w0;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                h51 h51Var2 = (h51) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, h51Var2, measuredWidth, measuredHeight);
                h(h51Var2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                uz4Var.c(g);
                g2.setEmpty();
                uz4Var.c(g2);
            }
        }
        int i3 = h51Var.e;
        if (i3 >= 0) {
            h51 h51Var3 = (h51) view.getLayoutParams();
            int i4 = h51Var3.c;
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
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h51Var3).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) h51Var3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) h51Var3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) h51Var3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        h51 h51Var4 = (h51) view.getLayoutParams();
        g = g();
        g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h51Var4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) h51Var4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) h51Var4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) h51Var4).bottomMargin);
        if (this.m0 != null) {
            WeakHashMap weakHashMap = ao7.a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g.left = this.m0.b() + g.left;
                g.top = this.m0.d() + g.top;
                g.right -= this.m0.c();
                g.bottom -= this.m0.a();
            }
        }
        g2 = g();
        int i7 = h51Var4.c;
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
        zh2 zh2Var = v0;
        if (zh2Var != null) {
            Collections.sort(arrayList, zh2Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            e51 e51Var = ((h51) view.getLayoutParams()).a;
            if (z && actionMasked != 0) {
                if (e51Var != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            e51Var.u(view, motionEvent2);
                        }
                    } else {
                        e51Var.j(this, view, motionEvent2);
                    }
                }
            } else if (!z && e51Var != null) {
                if (i != 0) {
                    if (i == 1) {
                        z = e51Var.u(view, motionEvent);
                    }
                } else {
                    z = e51Var.j(this, view, motionEvent);
                }
                if (z) {
                    this.i0 = view;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        e51 e51Var = ((h51) view.getLayoutParams()).a;
        if (e51Var != null) {
            e51Var.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f0) {
            t(false);
            this.f0 = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.A;
        arrayList.clear();
        eb ebVar = this.B;
        ci6 ci6Var = (ci6) ebVar.L;
        tz4 tz4Var = (tz4) ebVar.B;
        ci6 ci6Var2 = (ci6) ebVar.L;
        int i = ci6Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ci6Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                tz4Var.c(arrayList2);
            }
        }
        ci6Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            h51 n = n(childAt);
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
                            i.m("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n.l = null;
                                    n.k = null;
                                } else {
                                    i.m("Anchor must not be a descendant of the anchored view");
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
                    e41.r("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                }
            }
            if (!ci6Var2.containsKey(childAt)) {
                ci6Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = ao7.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((h51) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n.h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            e51 e51Var = n.a;
                            if (e51Var != null) {
                                e51Var.f(childAt);
                            }
                        }
                    }
                    if (!ci6Var2.containsKey(childAt2) && !ci6Var2.containsKey(childAt2)) {
                        ci6Var2.put(childAt2, null);
                    }
                    if (ci6Var2.containsKey(childAt2) && ci6Var2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) ci6Var2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) tz4Var.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            ci6Var2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        i.h("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) ebVar.R;
        arrayList4.clear();
        HashSet hashSet = (HashSet) ebVar.X;
        hashSet.clear();
        int i6 = ci6Var2.L;
        for (int i7 = 0; i7 < i6; i7++) {
            ebVar.u(ci6Var2.f(i7), arrayList4, hashSet);
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
        this.p0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.o0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.o0.setState(getDrawableState());
                }
                Drawable drawable4 = this.o0;
                WeakHashMap weakHashMap = ao7.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.o0;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.o0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ao7.a;
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
        Drawable drawable = this.o0;
        if (drawable != null && drawable.isVisible() != z) {
            this.o0.setVisible(z, false);
        }
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e51 e51Var = ((h51) childAt.getLayoutParams()).a;
            if (e51Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                if (z) {
                    e51Var.j(this, childAt, obtain);
                } else {
                    e51Var.u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((h51) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.i0 = null;
        this.f0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.o0) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = ao7.a;
        if (getFitsSystemWindows()) {
            if (this.q0 == null) {
                this.q0 = new d51(this, 0);
            }
            sn7.c(this, this.q0);
            setSystemUiVisibility(1280);
            return;
        }
        sn7.c(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new h51(getContext(), attributeSet);
    }
}
