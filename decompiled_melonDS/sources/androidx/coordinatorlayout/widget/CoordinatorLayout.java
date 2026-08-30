package androidx.coordinatorlayout.widget;

import a0.j;
import a1.w0;
import a6.i2;
import a6.n0;
import a6.p0;
import a6.s;
import a6.t;
import a6.u;
import a6.x0;
import ah.b0;
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
import b9.e;
import j5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k5.b;
import k5.c;
import k5.f;
import k5.g;
import m9.o;
import me.magnum.melonds.R;
import z5.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements s, t {

    /* renamed from: q0  reason: collision with root package name */
    public static final String f1167q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final Class[] f1168r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final ThreadLocal f1169s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final b0 f1170t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final d f1171u0;
    public final ArrayList A;
    public final e B;
    public final ArrayList L;
    public final ArrayList R;

    /* renamed from: b0  reason: collision with root package name */
    public final int[] f1172b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f1173c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1174d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1175e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f1176f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1177g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f1178h0;

    /* renamed from: i0  reason: collision with root package name */
    public k5.e f1179i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1180j0;

    /* renamed from: k0  reason: collision with root package name */
    public i2 f1181k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1182l0;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f1183m0;

    /* renamed from: n0  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1184n0;

    /* renamed from: o0  reason: collision with root package name */
    public d2.t f1185o0;
    public final u p0;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f1167q0 = str;
        f1170t0 = new b0(9);
        f1168r0 = new Class[]{Context.class, AttributeSet.class};
        f1169s0 = new ThreadLocal();
        f1171u0 = new d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [a6.u, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.A = new ArrayList();
        this.B = new e(15);
        this.L = new ArrayList();
        this.R = new ArrayList();
        this.f1172b0 = new int[2];
        this.f1173c0 = new int[2];
        this.p0 = new Object();
        int[] iArr = a.f7449a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            i3.a.m(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1176f0 = intArray;
            float f8 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f1176f0;
                iArr2[i2] = (int) (iArr2[i2] * f8);
            }
        }
        this.f1183m0 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        WeakHashMap weakHashMap = x0.f533a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1171u0.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, k5.d dVar, int i10, int i11) {
        int width;
        int height;
        int i12 = dVar.f7970c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i2);
        int i13 = dVar.f7971d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i2);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i10;
            }
        } else {
            width -= i10 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i11;
            }
        } else {
            height -= i11 / 2;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static k5.d n(View view) {
        k5.d dVar = (k5.d) view.getLayoutParams();
        if (!dVar.f7969b) {
            b bVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                bVar = (b) cls.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    k5.a aVar = (k5.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    k5.a aVar2 = dVar.f7968a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f7968a = aVar;
                        dVar.f7969b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            dVar.f7969b = true;
        }
        return dVar;
    }

    public static void u(View view, int i2) {
        k5.d dVar = (k5.d) view.getLayoutParams();
        int i10 = dVar.f7976i;
        if (i10 != i2) {
            WeakHashMap weakHashMap = x0.f533a;
            view.offsetLeftAndRight(i2 - i10);
            dVar.f7976i = i2;
        }
    }

    public static void v(View view, int i2) {
        k5.d dVar = (k5.d) view.getLayoutParams();
        int i10 = dVar.f7977j;
        if (i10 != i2) {
            WeakHashMap weakHashMap = x0.f533a;
            view.offsetTopAndBottom(i2 - i10);
            dVar.f7977j = i2;
        }
    }

    @Override // a6.s
    public final void a(View view, View view2, int i2, int i10) {
        u uVar = this.p0;
        if (i10 == 1) {
            uVar.f516b = i2;
        } else {
            uVar.f515a = i2;
        }
        this.f1178h0 = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((k5.d) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // a6.s
    public final void b(View view, int i2) {
        u uVar = this.p0;
        if (i2 == 1) {
            uVar.f516b = 0;
        } else {
            uVar.f515a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            k5.d dVar = (k5.d) childAt.getLayoutParams();
            if (dVar.a(i2)) {
                k5.a aVar = dVar.f7968a;
                if (aVar != null) {
                    aVar.p(childAt, view, i2);
                }
                if (i2 != 0) {
                    if (i2 == 1) {
                        dVar.f7980n = false;
                    }
                } else {
                    dVar.m = false;
                }
            }
        }
        this.f1178h0 = null;
    }

    @Override // a6.s
    public final void c(View view, int i2, int i10, int[] iArr, int i11) {
        k5.a aVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                k5.d dVar = (k5.d) childAt.getLayoutParams();
                if (dVar.a(i11) && (aVar = dVar.f7968a) != null) {
                    int[] iArr2 = this.f1172b0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i2, i10, iArr2, i11);
                    if (i2 > 0) {
                        min = Math.max(i12, iArr2[0]);
                    } else {
                        min = Math.min(i12, iArr2[0]);
                    }
                    i12 = min;
                    if (i10 > 0) {
                        min2 = Math.max(i13, iArr2[1]);
                    } else {
                        min2 = Math.min(i13, iArr2[1]);
                    }
                    i13 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z10) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof k5.d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // a6.t
    public final void d(View view, int i2, int i10, int i11, int i12, int i13, int[] iArr) {
        k5.a aVar;
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                k5.d dVar = (k5.d) childAt.getLayoutParams();
                if (dVar.a(i13) && (aVar = dVar.f7968a) != null) {
                    int[] iArr2 = this.f1172b0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i10, i11, i12, iArr2);
                    if (i11 > 0) {
                        i14 = Math.max(i14, iArr2[0]);
                    } else {
                        i14 = Math.min(i14, iArr2[0]);
                    }
                    if (i12 > 0) {
                        i15 = Math.max(i15, iArr2[1]);
                    } else {
                        i15 = Math.min(i15, iArr2[1]);
                    }
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        k5.a aVar = ((k5.d) view.getLayoutParams()).f7968a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1183m0;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // a6.s
    public final void e(View view, int i2, int i10, int i11, int i12, int i13) {
        d(view, i2, i10, i11, i12, 0, this.f1173c0);
    }

    @Override // a6.s
    public final boolean f(View view, View view2, int i2, int i10) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                k5.d dVar = (k5.d) childAt.getLayoutParams();
                k5.a aVar = dVar.f7968a;
                if (aVar != null) {
                    boolean o5 = aVar.o(childAt, i2, i10);
                    z10 |= o5;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dVar.f7980n = o5;
                        }
                    } else {
                        dVar.m = o5;
                    }
                } else if (i10 != 0) {
                    if (i10 == 1) {
                        dVar.f7980n = false;
                    }
                } else {
                    dVar.m = false;
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k5.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof k5.d) {
            return new k5.d((k5.d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new k5.d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new k5.d(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.A);
    }

    public final i2 getLastWindowInsets() {
        return this.f1181k0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        u uVar = this.p0;
        return uVar.f516b | uVar.f515a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1183m0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(k5.d dVar, Rect rect, int i2, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(max, max2, i2 + max, i10 + max2);
    }

    public final void i(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
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
        w0 w0Var = (w0) this.B.L;
        int i2 = w0Var.L;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i2; i10++) {
            ArrayList arrayList2 = (ArrayList) w0Var.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(w0Var.f(i10));
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
        ThreadLocal threadLocal = g.f7982a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f7982a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f7983b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        int[] iArr = this.f1176f0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i2, int i10) {
        d dVar = f1171u0;
        Rect g10 = g();
        k(view, g10);
        try {
            return g10.contains(i2, i10);
        } finally {
            g10.setEmpty();
            dVar.c(g10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1180j0) {
            if (this.f1179i0 == null) {
                this.f1179i0 = new k5.e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1179i0);
        }
        if (this.f1181k0 == null) {
            WeakHashMap weakHashMap = x0.f533a;
            if (getFitsSystemWindows()) {
                n0.c(this);
            }
        }
        this.f1175e0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1180j0 && this.f1179i0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1179i0);
        }
        View view = this.f1178h0;
        if (view != null) {
            b(view, 0);
        }
        this.f1175e0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.f1182l0 && this.f1183m0 != null) {
            i2 i2Var = this.f1181k0;
            if (i2Var != null) {
                i2 = i2Var.d();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.f1183m0.setBounds(0, 0, getWidth(), i2);
                this.f1183m0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r5 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r5;
        }
        t(true);
        return r5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        k5.a aVar;
        WeakHashMap weakHashMap = x0.f533a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((aVar = ((k5.d) view.getLayoutParams()).f7968a) == null || !aVar.g(this, view, layoutDirection))) {
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
    public final boolean onNestedFling(View view, float f8, float f10, boolean z10) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                k5.d dVar = (k5.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    k5.a aVar = dVar.f7968a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f10) {
        k5.a aVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                k5.d dVar = (k5.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f7968a) != null) {
                    z10 |= aVar.i(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i10, int[] iArr) {
        c(view, i2, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i10, int i11, int i12) {
        e(view, i2, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.A);
        SparseArray sparseArray = fVar.L;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id2 = childAt.getId();
            k5.a aVar = n(childAt).f7968a;
            if (id2 != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i6.b, k5.f, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n10;
        ?? bVar = new i6.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id2 = childAt.getId();
            k5.a aVar = ((k5.d) childAt.getLayoutParams()).f7968a;
            if (id2 != -1 && aVar != null && (n10 = aVar.n(childAt)) != null) {
                sparseArray.append(id2, n10);
            }
        }
        bVar.L = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
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
            android.view.View r3 = r0.f1177g0
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
            android.view.View r6 = r0.f1177g0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            k5.d r6 = (k5.d) r6
            k5.a r6 = r6.f7968a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1177g0
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f1177g0
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        Rect g10;
        Rect g11;
        int i10;
        k5.d dVar = (k5.d) view.getLayoutParams();
        View view2 = dVar.f7978k;
        if (view2 == null && dVar.f7973f != -1) {
            j.p("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        d dVar2 = f1171u0;
        if (view2 != null) {
            g10 = g();
            g11 = g();
            try {
                k(view2, g10);
                k5.d dVar3 = (k5.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i2, g10, g11, dVar3, measuredWidth, measuredHeight);
                h(dVar3, g11, measuredWidth, measuredHeight);
                view.layout(g11.left, g11.top, g11.right, g11.bottom);
                return;
            } finally {
                g10.setEmpty();
                dVar2.c(g10);
                g11.setEmpty();
                dVar2.c(g11);
            }
        }
        int i11 = dVar.f7972e;
        if (i11 >= 0) {
            k5.d dVar4 = (k5.d) view.getLayoutParams();
            int i12 = dVar4.f7970c;
            if (i12 == 0) {
                i12 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i2);
            int i13 = absoluteGravity & 7;
            int i14 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i11 = width - i11;
            }
            int m = m(i11) - measuredWidth2;
            if (i13 != 1) {
                if (i13 == 5) {
                    m += measuredWidth2;
                }
            } else {
                m += measuredWidth2 / 2;
            }
            if (i14 != 16) {
                if (i14 != 80) {
                    i10 = 0;
                } else {
                    i10 = measuredHeight2;
                }
            } else {
                i10 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        k5.d dVar5 = (k5.d) view.getLayoutParams();
        g10 = g();
        g10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin);
        if (this.f1181k0 != null) {
            WeakHashMap weakHashMap = x0.f533a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g10.left = this.f1181k0.b() + g10.left;
                g10.top = this.f1181k0.d() + g10.top;
                g10.right -= this.f1181k0.c();
                g10.bottom -= this.f1181k0.a();
            }
        }
        g11 = g();
        int i15 = dVar5.f7970c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), g10, g11, i2);
        view.layout(g11.left, g11.top, g11.right, g11.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.L;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            arrayList.add(getChildAt(i10));
        }
        b0 b0Var = f1170t0;
        if (b0Var != null) {
            Collections.sort(arrayList, b0Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            k5.a aVar = ((k5.d) view.getLayoutParams()).f7968a;
            if (z10 && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            aVar.q(view, motionEvent2);
                        }
                    } else {
                        aVar.f(this, view, motionEvent2);
                    }
                }
            } else if (!z10 && aVar != null) {
                if (i2 != 0) {
                    if (i2 == 1) {
                        z10 = aVar.q(view, motionEvent);
                    }
                } else {
                    z10 = aVar.f(this, view, motionEvent);
                }
                if (z10) {
                    this.f1177g0 = view;
                }
            }
        }
        arrayList.clear();
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        k5.a aVar = ((k5.d) view.getLayoutParams()).f7968a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1174d0) {
            t(false);
            this.f1174d0 = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.A;
        arrayList.clear();
        e eVar = this.B;
        w0 w0Var = (w0) eVar.L;
        c5.d dVar = (c5.d) eVar.B;
        w0 w0Var2 = (w0) eVar.L;
        int i2 = w0Var.L;
        for (int i10 = 0; i10 < i2; i10++) {
            ArrayList arrayList2 = (ArrayList) w0Var.i(i10);
            if (arrayList2 != null) {
                arrayList2.clear();
                dVar.c(arrayList2);
            }
        }
        w0Var.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            k5.d n10 = n(childAt);
            int i12 = n10.f7973f;
            if (i12 == -1) {
                n10.f7979l = null;
                n10.f7978k = null;
            } else {
                View view = n10.f7978k;
                if (view != null && view.getId() == i12) {
                    View view2 = n10.f7978k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        } else {
                            n10.f7979l = null;
                            n10.f7978k = null;
                        }
                    }
                    n10.f7979l = view2;
                }
                View findViewById = findViewById(i12);
                n10.f7978k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            n10.f7979l = null;
                            n10.f7978k = null;
                        } else {
                            j.p("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n10.f7979l = null;
                                    n10.f7978k = null;
                                } else {
                                    j.p("Anchor must not be a descendant of the anchored view");
                                    return;
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        n10.f7979l = findViewById;
                    }
                } else if (isInEditMode()) {
                    n10.f7979l = null;
                    n10.f7978k = null;
                } else {
                    o.j("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i12), " to anchor view ", childAt);
                    return;
                }
            }
            if (!w0Var2.containsKey(childAt)) {
                w0Var2.put(childAt, null);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i11) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != n10.f7979l) {
                        WeakHashMap weakHashMap = x0.f533a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((k5.d) childAt2.getLayoutParams()).f7974g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n10.f7975h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            k5.a aVar = n10.f7968a;
                            if (aVar != null) {
                                aVar.b(childAt);
                            }
                        }
                    }
                    if (!w0Var2.containsKey(childAt2) && !w0Var2.containsKey(childAt2)) {
                        w0Var2.put(childAt2, null);
                    }
                    if (w0Var2.containsKey(childAt2) && w0Var2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) w0Var2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) dVar.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            w0Var2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        j.h("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) eVar.R;
        arrayList4.clear();
        HashSet hashSet = (HashSet) eVar.X;
        hashSet.clear();
        int i14 = w0Var2.L;
        for (int i15 = 0; i15 < i14; i15++) {
            eVar.o(w0Var2.f(i15), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1184n0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f1183m0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1183m0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1183m0.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1183m0;
                WeakHashMap weakHashMap = x0.f533a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f1183m0;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f1183m0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = x0.f533a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = getContext().getDrawable(i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z10;
        super.setVisibility(i2);
        if (i2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f1183m0;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f1183m0.setVisible(z10, false);
        }
    }

    public final void t(boolean z10) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            k5.a aVar = ((k5.d) childAt.getLayoutParams()).f7968a;
            if (aVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    aVar.f(this, childAt, obtain);
                } else {
                    aVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((k5.d) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f1177g0 = null;
        this.f1174d0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1183m0) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = x0.f533a;
        if (getFitsSystemWindows()) {
            if (this.f1185o0 == null) {
                this.f1185o0 = new d2.t(26, this);
            }
            p0.k(this, this.f1185o0);
            setSystemUiVisibility(1280);
            return;
        }
        p0.k(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k5.d(getContext(), attributeSet);
    }
}
