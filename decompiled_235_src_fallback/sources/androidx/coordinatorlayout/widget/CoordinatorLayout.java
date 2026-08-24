package androidx.coordinatorlayout.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements defpackage.ke4, defpackage.le4 {
    public static final java.lang.String s0 = null;
    public static final java.lang.Class[] t0 = null;
    public static final java.lang.ThreadLocal u0 = null;
    public static final defpackage.zh2 v0 = null;
    public static final defpackage.uz4 w0 = null;
    public final java.util.ArrayList A;
    public final defpackage.eb B;
    public final java.util.ArrayList L;
    public final java.util.ArrayList R;
    public final int[] d0;
    public final int[] e0;
    public boolean f0;
    public boolean g0;
    public final int[] h0;
    public android.view.View i0;
    public android.view.View j0;
    public defpackage.i51 k0;
    public boolean l0;
    public defpackage.vu7 m0;
    public boolean n0;
    public android.graphics.drawable.Drawable o0;
    public android.view.ViewGroup.OnHierarchyChangeListener p0;
    public defpackage.d51 q0;
    public final defpackage.dy7 r0;

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.s0 = r0
            zh2 r0 = new zh2
            r1 = 10
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.v0 = r0
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            androidx.coordinatorlayout.widget.CoordinatorLayout.t0 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.u0 = r0
            uz4 r0 = new uz4
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.w0 = r0
            return
    }

    public CoordinatorLayout(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 2130968951(0x7f040177, float:1.754657E38)
            r5.<init>(r6, r7, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.A = r1
            eb r1 = new eb
            r2 = 8
            r1.<init>(r2)
            r5.B = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.L = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.R = r1
            r1 = 2
            int[] r2 = new int[r1]
            r5.d0 = r2
            int[] r1 = new int[r1]
            r5.e0 = r1
            dy7 r1 = new dy7
            r1.<init>()
            r5.r0 = r1
            int[] r1 = defpackage.f75.a
            r2 = 0
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L44
            defpackage.yz0.q(r5, r6, r1, r7, r0)
        L44:
            int r7 = r0.getResourceId(r2, r2)
            if (r7 == 0) goto L69
            android.content.res.Resources r6 = r6.getResources()
            int[] r7 = r6.getIntArray(r7)
            r5.h0 = r7
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r7 = r7.length
        L5b:
            if (r2 >= r7) goto L69
            int[] r1 = r5.h0
            r3 = r1[r2]
            float r3 = (float) r3
            float r3 = r3 * r6
            int r3 = (int) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5b
        L69:
            r6 = 1
            android.graphics.drawable.Drawable r7 = r0.getDrawable(r6)
            r5.o0 = r7
            r0.recycle()
            r5.w()
            g51 r7 = new g51
            r7.<init>(r5)
            super.setOnHierarchyChangeListener(r7)
            java.util.WeakHashMap r7 = defpackage.ao7.a
            int r7 = r5.getImportantForAccessibility()
            if (r7 != 0) goto L89
            r5.setImportantForAccessibility(r6)
        L89:
            return
    }

    public static android.graphics.Rect g() {
            uz4 r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.w0
            java.lang.Object r0 = r0.a()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto Lf
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        Lf:
            return r0
    }

    public static void l(int r6, android.graphics.Rect r7, android.graphics.Rect r8, defpackage.h51 r9, int r10, int r11) {
            int r0 = r9.c
            if (r0 != 0) goto L6
            r0 = 17
        L6:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r6)
            int r9 = r9.d
            r1 = r9 & 7
            if (r1 != 0) goto L14
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r9 = r9 | r1
        L14:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L1a
            r9 = r9 | 48
        L1a:
            int r6 = android.view.Gravity.getAbsoluteGravity(r9, r6)
            r9 = r0 & 7
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L32
            if (r1 == r2) goto L2f
            int r1 = r7.left
            goto L3b
        L2f:
            int r1 = r7.right
            goto L3b
        L32:
            int r1 = r7.left
            int r4 = r7.width()
            int r4 = r4 / 2
            int r1 = r1 + r4
        L3b:
            r4 = 80
            r5 = 16
            if (r6 == r5) goto L49
            if (r6 == r4) goto L46
            int r6 = r7.top
            goto L52
        L46:
            int r6 = r7.bottom
            goto L52
        L49:
            int r6 = r7.top
            int r7 = r7.height()
            int r7 = r7 / 2
            int r6 = r6 + r7
        L52:
            if (r9 == r3) goto L58
            if (r9 == r2) goto L5b
            int r1 = r1 - r10
            goto L5b
        L58:
            int r7 = r10 / 2
            int r1 = r1 - r7
        L5b:
            if (r0 == r5) goto L61
            if (r0 == r4) goto L64
            int r6 = r6 - r11
            goto L64
        L61:
            int r7 = r11 / 2
            int r6 = r6 - r7
        L64:
            int r10 = r10 + r1
            int r11 = r11 + r6
            r8.set(r1, r6, r10, r11)
            return
    }

    public static defpackage.h51 n(android.view.View r5) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L68
            java.lang.Class r5 = r5.getClass()
            r1 = 0
            r2 = r1
        L10:
            if (r5 == 0) goto L21
            java.lang.Class<f51> r2 = defpackage.f51.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            f51 r2 = (defpackage.f51) r2
            if (r2 != 0) goto L21
            java.lang.Class r5 = r5.getSuperclass()
            goto L10
        L21:
            r5 = 1
            if (r2 == 0) goto L66
            java.lang.Class r3 = r2.value()     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L45
            java.lang.Object r1 = r3.newInstance(r1)     // Catch: java.lang.Exception -> L45
            e51 r1 = (defpackage.e51) r1     // Catch: java.lang.Exception -> L45
            e51 r3 = r0.a     // Catch: java.lang.Exception -> L45
            if (r3 == r1) goto L66
            if (r3 == 0) goto L3b
            r3.i()     // Catch: java.lang.Exception -> L45
        L3b:
            r0.a = r1     // Catch: java.lang.Exception -> L45
            r0.b = r5     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L66
            r1.g(r0)     // Catch: java.lang.Exception -> L45
            goto L66
        L45:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Default behavior class "
            r3.<init>(r4)
            java.lang.Class r2 = r2.value()
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = " could not be instantiated. Did you forget a default constructor?"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "CoordinatorLayout"
            android.util.Log.e(r3, r2, r1)
        L66:
            r0.b = r5
        L68:
            return r0
    }

    public static void u(android.view.View r3, int r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            int r1 = r0.i
            if (r1 == r4) goto L13
            int r1 = r4 - r1
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r3.offsetLeftAndRight(r1)
            r0.i = r4
        L13:
            return
    }

    public static void v(android.view.View r3, int r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            int r1 = r0.j
            if (r1 == r4) goto L13
            int r1 = r4 - r1
            java.util.WeakHashMap r2 = defpackage.ao7.a
            r3.offsetTopAndBottom(r1)
            r0.j = r4
        L13:
            return
    }

    @Override // defpackage.le4
    public final void a(android.view.View r15, int r16, int r17, int r18, int r19, int r20, int[] r21) {
            r14 = this;
            int r15 = r14.getChildCount()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
        L9:
            r5 = 1
            if (r1 >= r15) goto L60
            android.view.View r8 = r14.getChildAt(r1)
            int r6 = r8.getVisibility()
            r7 = 8
            if (r6 != r7) goto L1b
            r13 = r20
            goto L5d
        L1b:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            h51 r6 = (defpackage.h51) r6
            r13 = r20
            boolean r7 = r6.a(r13)
            if (r7 != 0) goto L2a
            goto L5d
        L2a:
            e51 r6 = r6.a
            if (r6 == 0) goto L5d
            int[] r12 = r14.d0
            r12[r0] = r0
            r12[r5] = r0
            r7 = r14
            r9 = r17
            r10 = r18
            r11 = r19
            r6.o(r7, r8, r9, r10, r11, r12)
            if (r18 <= 0) goto L47
            r4 = r12[r0]
            int r2 = java.lang.Math.max(r2, r4)
            goto L4d
        L47:
            r4 = r12[r0]
            int r2 = java.lang.Math.min(r2, r4)
        L4d:
            if (r19 <= 0) goto L56
            r4 = r12[r5]
            int r3 = java.lang.Math.max(r3, r4)
            goto L5c
        L56:
            r4 = r12[r5]
            int r3 = java.lang.Math.min(r3, r4)
        L5c:
            r4 = r5
        L5d:
            int r1 = r1 + 1
            goto L9
        L60:
            r15 = r21[r0]
            int r15 = r15 + r2
            r21[r0] = r15
            r15 = r21[r5]
            int r15 = r15 + r3
            r21[r5] = r15
            if (r4 == 0) goto L6f
            r14.p(r5)
        L6f:
            return
    }

    @Override // defpackage.ke4
    public final void b(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.e0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.ke4
    public final boolean c(android.view.View r7, android.view.View r8, int r9, int r10) {
            r6 = this;
            int r7 = r6.getChildCount()
            r8 = 0
            r0 = r8
            r1 = r0
        L7:
            if (r0 >= r7) goto L3e
            android.view.View r2 = r6.getChildAt(r0)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L16
            goto L3b
        L16:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            h51 r3 = (defpackage.h51) r3
            e51 r4 = r3.a
            r5 = 1
            if (r4 == 0) goto L31
            boolean r2 = r4.s(r2, r9, r10)
            r1 = r1 | r2
            if (r10 == 0) goto L2e
            if (r10 == r5) goto L2b
            goto L3b
        L2b:
            r3.n = r2
            goto L3b
        L2e:
            r3.m = r2
            goto L3b
        L31:
            if (r10 == 0) goto L39
            if (r10 == r5) goto L36
            goto L3b
        L36:
            r3.n = r8
            goto L3b
        L39:
            r3.m = r8
        L3b:
            int r0 = r0 + 1
            goto L7
        L3e:
            return r1
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.h51
            if (r0 == 0) goto Lc
            boolean r1 = super.checkLayoutParams(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // defpackage.ke4
    public final void d(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            r2 = 1
            dy7 r0 = r1.r0
            if (r5 != r2) goto L8
            r0.b = r4
            goto La
        L8:
            r0.a = r4
        La:
            r1.j0 = r3
            int r2 = r1.getChildCount()
            r3 = 0
        L11:
            if (r3 >= r2) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            h51 r4 = (defpackage.h51) r4
            r4.getClass()
            int r3 = r3 + 1
            goto L11
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            e51 r0 = r0.a
            if (r0 == 0) goto Ld
            r0.getClass()
        Ld:
            boolean r1 = super.drawChild(r2, r3, r4)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.o0
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r0 = r1.setState(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1c
            r3.invalidate()
        L1c:
            return
    }

    @Override // defpackage.ke4
    public final void e(android.view.View r8, int r9) {
            r7 = this;
            dy7 r0 = r7.r0
            r1 = 0
            r2 = 1
            if (r9 != r2) goto L9
            r0.b = r1
            goto Lb
        L9:
            r0.a = r1
        Lb:
            int r0 = r7.getChildCount()
            r3 = r1
        L10:
            if (r3 >= r0) goto L37
            android.view.View r4 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            h51 r5 = (defpackage.h51) r5
            boolean r6 = r5.a(r9)
            if (r6 != 0) goto L23
            goto L34
        L23:
            e51 r6 = r5.a
            if (r6 == 0) goto L2a
            r6.t(r4, r8, r9)
        L2a:
            if (r9 == 0) goto L32
            if (r9 == r2) goto L2f
            goto L34
        L2f:
            r5.n = r1
            goto L34
        L32:
            r5.m = r1
        L34:
            int r3 = r3 + 1
            goto L10
        L37:
            r8 = 0
            r7.j0 = r8
            return
    }

    @Override // defpackage.ke4
    public final void f(android.view.View r15, int r16, int r17, int[] r18, int r19) {
            r14 = this;
            int r8 = r14.getChildCount()
            r9 = 0
            r0 = r9
            r10 = r0
            r11 = r10
            r12 = r11
        L9:
            r13 = 1
            if (r10 >= r8) goto L62
            android.view.View r2 = r14.getChildAt(r10)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L19
            goto L5f
        L19:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            h51 r3 = (defpackage.h51) r3
            r7 = r19
            boolean r4 = r3.a(r7)
            if (r4 != 0) goto L28
            goto L5f
        L28:
            e51 r3 = r3.a
            if (r3 == 0) goto L5f
            int[] r6 = r14.d0
            r6[r9] = r9
            r6[r13] = r9
            r1 = r14
            r4 = r16
            r5 = r17
            r0 = r3
            r3 = r15
            r0.n(r1, r2, r3, r4, r5, r6, r7)
            if (r16 <= 0) goto L46
            r0 = r6[r9]
            int r0 = java.lang.Math.max(r11, r0)
        L44:
            r11 = r0
            goto L4d
        L46:
            r0 = r6[r9]
            int r0 = java.lang.Math.min(r11, r0)
            goto L44
        L4d:
            if (r17 <= 0) goto L57
            r0 = r6[r13]
            int r0 = java.lang.Math.max(r12, r0)
        L55:
            r12 = r0
            goto L5e
        L57:
            r0 = r6[r13]
            int r0 = java.lang.Math.min(r12, r0)
            goto L55
        L5e:
            r0 = r13
        L5f:
            int r10 = r10 + 1
            goto L9
        L62:
            r18[r9] = r11
            r18[r13] = r12
            if (r0 == 0) goto L6b
            r14.p(r13)
        L6b:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            h51 r0 = new h51
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            h51 r0 = new h51
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.h51
            if (r0 == 0) goto Lc
            h51 r0 = new h51
            h51 r1 = (defpackage.h51) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            h51 r0 = new h51
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            h51 r0 = new h51
            r0.<init>(r1)
            return r0
    }

    public final java.util.List<android.view.View> getDependencySortedChildren() {
            r0 = this;
            r0.s()
            java.util.ArrayList r0 = r0.A
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final defpackage.vu7 getLastWindowInsets() {
            r0 = this;
            vu7 r0 = r0.m0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            dy7 r1 = r1.r0
            int r0 = r1.a
            int r1 = r1.b
            r1 = r1 | r0
            return r1
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.o0
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r2 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r2.getPaddingTop()
            int r2 = r2.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r2 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r2.getPaddingLeft()
            int r2 = r2.getPaddingRight()
            int r2 = r2 + r1
            int r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public final void h(defpackage.h51 r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r5 = r5.getPaddingBottom()
            int r1 = r1 - r5
            int r1 = r1 - r9
            int r5 = r6.bottomMargin
            int r1 = r1 - r5
            int r5 = java.lang.Math.min(r3, r1)
            int r5 = java.lang.Math.max(r2, r5)
            int r8 = r8 + r0
            int r9 = r9 + r5
            r7.set(r0, r5, r8, r9)
            return
    }

    public final void i(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r5 == 0) goto L15
            r2.k(r3, r4)
            return
        L15:
            int r2 = r3.getLeft()
            int r5 = r3.getTop()
            int r0 = r3.getRight()
            int r3 = r3.getBottom()
            r4.set(r2, r5, r0, r3)
            return
        L29:
            r4.setEmpty()
            return
    }

    public final java.util.ArrayList j(android.view.View r6) {
            r5 = this;
            eb r0 = r5.B
            java.lang.Object r0 = r0.L
            ci6 r0 = (defpackage.ci6) r0
            int r1 = r0.L
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L2b
            java.lang.Object r4 = r0.i(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L28
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L28
            if (r2 != 0) goto L21
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L21:
            java.lang.Object r4 = r0.f(r3)
            r2.add(r4)
        L28:
            int r3 = r3 + 1
            goto La
        L2b:
            java.util.ArrayList r5 = r5.R
            r5.clear()
            if (r2 == 0) goto L35
            r5.addAll(r2)
        L35:
            return r5
    }

    public final void k(android.view.View r4, android.graphics.Rect r5) {
            r3 = this;
            java.lang.ThreadLocal r0 = defpackage.ko7.a
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r2 = 0
            r5.set(r2, r2, r0, r1)
            java.lang.ThreadLocal r0 = defpackage.ko7.a
            java.lang.Object r1 = r0.get()
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L21
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.set(r1)
            goto L24
        L21:
            r1.reset()
        L24:
            defpackage.ko7.a(r3, r4, r1)
            java.lang.ThreadLocal r3 = defpackage.ko7.b
            java.lang.Object r4 = r3.get()
            android.graphics.RectF r4 = (android.graphics.RectF) r4
            if (r4 != 0) goto L39
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r3.set(r4)
        L39:
            r4.set(r5)
            r1.mapRect(r4)
            float r3 = r4.left
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            float r1 = r4.top
            float r1 = r1 + r0
            int r1 = (int) r1
            float r2 = r4.right
            float r2 = r2 + r0
            int r2 = (int) r2
            float r4 = r4.bottom
            float r4 = r4 + r0
            int r4 = (int) r4
            r5.set(r3, r1, r2, r4)
            return
    }

    public final int m(int r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "CoordinatorLayout"
            int[] r2 = r4.h0
            if (r2 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No keylines defined for "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " - attempted index lookup "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            android.util.Log.e(r1, r4)
            return r0
        L21:
            if (r5 < 0) goto L2a
            int r3 = r2.length
            if (r5 < r3) goto L27
            goto L2a
        L27:
            r4 = r2[r5]
            return r4
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Keyline index "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " out of range for "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            android.util.Log.e(r1, r4)
            return r0
    }

    public final boolean o(android.view.View r3, int r4, int r5) {
            r2 = this;
            uz4 r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.w0
            android.graphics.Rect r1 = g()
            r2.k(r3, r1)
            boolean r2 = r1.contains(r4, r5)     // Catch: java.lang.Throwable -> L14
            r1.setEmpty()
            r0.c(r1)
            return r2
        L14:
            r2 = move-exception
            r1.setEmpty()
            r0.c(r1)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.t(r0)
            boolean r0 = r2.l0
            if (r0 == 0) goto L1f
            i51 r0 = r2.k0
            if (r0 != 0) goto L16
            i51 r0 = new i51
            r0.<init>(r2)
            r2.k0 = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            i51 r1 = r2.k0
            r0.addOnPreDrawListener(r1)
        L1f:
            vu7 r0 = r2.m0
            if (r0 != 0) goto L2e
            java.util.WeakHashMap r0 = defpackage.ao7.a
            boolean r0 = r2.getFitsSystemWindows()
            if (r0 == 0) goto L2e
            r2.requestApplyInsets()
        L2e:
            r0 = 1
            r2.g0 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.t(r0)
            boolean r1 = r3.l0
            if (r1 == 0) goto L18
            i51 r1 = r3.k0
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            i51 r2 = r3.k0
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.j0
            if (r1 == 0) goto L1f
            r3.e(r1, r0)
        L1f:
            r3.g0 = r0
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.n0
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.o0
            if (r0 == 0) goto L26
            vu7 r0 = r4.m0
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.d()
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.o0
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r4 = r4.o0
            r4.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.t(r1)
        La:
            r2 = 0
            boolean r4 = r3.r(r4, r2)
            if (r0 == r1) goto L16
            r2 = 3
            if (r0 != r2) goto L15
            goto L16
        L15:
            return r4
        L16:
            r3.t(r1)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.util.WeakHashMap r3 = defpackage.ao7.a
            int r3 = r2.getLayoutDirection()
            java.util.ArrayList r4 = r2.A
            int r5 = r4.size()
            r6 = 0
        Ld:
            if (r6 >= r5) goto L34
            java.lang.Object r7 = r4.get(r6)
            android.view.View r7 = (android.view.View) r7
            int r0 = r7.getVisibility()
            r1 = 8
            if (r0 != r1) goto L1e
            goto L31
        L1e:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            e51 r0 = r0.a
            if (r0 == 0) goto L2e
            boolean r0 = r0.k(r2, r7, r3)
            if (r0 != 0) goto L31
        L2e:
            r2.q(r7, r3)
        L31:
            int r6 = r6 + 1
            goto Ld
        L34:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r27, int r28) {
            r26 = this;
            r0 = r26
            r0.s()
            int r1 = r0.getChildCount()
            r6 = 0
            r2 = r6
        Lb:
            r3 = 1
            if (r2 >= r1) goto L33
            android.view.View r4 = r0.getChildAt(r2)
            eb r5 = r0.B
            java.lang.Object r5 = r5.L
            ci6 r5 = (defpackage.ci6) r5
            int r7 = r5.L
            r8 = r6
        L1b:
            if (r8 >= r7) goto L30
            java.lang.Object r9 = r5.i(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L2d
            boolean r9 = r9.contains(r4)
            if (r9 == 0) goto L2d
            r1 = r3
            goto L34
        L2d:
            int r8 = r8 + 1
            goto L1b
        L30:
            int r2 = r2 + 1
            goto Lb
        L33:
            r1 = r6
        L34:
            boolean r2 = r0.l0
            if (r1 == r2) goto L66
            boolean r2 = r0.g0
            if (r1 == 0) goto L55
            if (r2 == 0) goto L52
            i51 r1 = r0.k0
            if (r1 != 0) goto L49
            i51 r1 = new i51
            r1.<init>(r0)
            r0.k0 = r1
        L49:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            i51 r2 = r0.k0
            r1.addOnPreDrawListener(r2)
        L52:
            r0.l0 = r3
            goto L66
        L55:
            if (r2 == 0) goto L64
            i51 r1 = r0.k0
            if (r1 == 0) goto L64
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            i51 r2 = r0.k0
            r1.removeOnPreDrawListener(r2)
        L64:
            r0.l0 = r6
        L66:
            int r7 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r8 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            java.util.WeakHashMap r4 = defpackage.ao7.a
            int r9 = r0.getLayoutDirection()
            if (r9 != r3) goto L80
            r10 = r3
            goto L81
        L80:
            r10 = r6
        L81:
            int r11 = android.view.View.MeasureSpec.getMode(r27)
            int r12 = android.view.View.MeasureSpec.getSize(r27)
            int r13 = android.view.View.MeasureSpec.getMode(r28)
            int r14 = android.view.View.MeasureSpec.getSize(r28)
            int r15 = r7 + r8
            int r16 = r1 + r2
            int r1 = r0.getSuggestedMinimumWidth()
            int r2 = r0.getSuggestedMinimumHeight()
            vu7 r4 = r0.m0
            if (r4 == 0) goto Laa
            boolean r4 = r0.getFitsSystemWindows()
            if (r4 == 0) goto Laa
            r17 = r3
            goto Lac
        Laa:
            r17 = r6
        Lac:
            java.util.ArrayList r3 = r0.A
            int r4 = r3.size()
            r5 = r6
            r18 = r5
        Lb5:
            if (r5 >= r4) goto L1da
            java.lang.Object r19 = r3.get(r5)
            android.view.View r19 = (android.view.View) r19
            int r6 = r19.getVisibility()
            r21 = r1
            r1 = 8
            if (r6 != r1) goto Ld7
            r23 = r3
            r22 = r4
            r19 = r5
            r20 = r7
            r1 = r21
            r24 = 0
            r21 = r8
            goto L1cc
        Ld7:
            android.view.ViewGroup$LayoutParams r1 = r19.getLayoutParams()
            r6 = r1
            h51 r6 = (defpackage.h51) r6
            int r1 = r6.e
            if (r1 < 0) goto L125
            if (r11 == 0) goto L125
            int r1 = r0.m(r1)
            r22 = r1
            int r1 = r6.c
            if (r1 != 0) goto Lf1
            r1 = 8388661(0x800035, float:1.1755018E-38)
        Lf1:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r9)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto Lfe
            if (r10 == 0) goto L103
        Lfe:
            r2 = 5
            if (r1 != r2) goto L112
            if (r10 == 0) goto L112
        L103:
            int r1 = r12 - r8
            int r1 = r1 - r22
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L10c:
            r25 = r4
            r4 = r1
            r1 = r25
            goto L12a
        L112:
            if (r1 != r2) goto L116
            if (r10 == 0) goto L11b
        L116:
            r2 = 3
            if (r1 != r2) goto L123
            if (r10 == 0) goto L123
        L11b:
            int r1 = r22 - r7
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            goto L10c
        L123:
            r2 = 0
            goto L128
        L125:
            r23 = r2
            goto L123
        L128:
            r1 = r4
            r4 = r2
        L12a:
            if (r17 == 0) goto L15d
            boolean r20 = r19.getFitsSystemWindows()
            if (r20 != 0) goto L15d
            vu7 r2 = r0.m0
            int r2 = r2.b()
            r22 = r1
            vu7 r1 = r0.m0
            int r1 = r1.c()
            int r1 = r1 + r2
            vu7 r2 = r0.m0
            int r2 = r2.d()
            r24 = r1
            vu7 r1 = r0.m0
            int r1 = r1.a()
            int r1 = r1 + r2
            int r2 = r12 - r24
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11)
            int r1 = r14 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            goto L163
        L15d:
            r22 = r1
            r2 = r27
            r1 = r28
        L163:
            e51 r0 = r6.a
            if (r0 == 0) goto L189
            r24 = 0
            r20 = r7
            r7 = r21
            r21 = r8
            r8 = r23
            r23 = r3
            r3 = r2
            r2 = r19
            r19 = r5
            r5 = r1
            r1 = r26
            boolean r0 = r0.l(r1, r2, r3, r4, r5)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            if (r0 != 0) goto L186
            goto L19b
        L186:
            r0 = r26
            goto L1a1
        L189:
            r20 = r7
            r7 = r21
            r24 = 0
            r21 = r8
            r8 = r23
            r23 = r3
            r3 = r4
            r4 = r1
            r1 = r19
            r19 = r5
        L19b:
            r5 = 0
            r0 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L1a1:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r15
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r6.rightMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r7, r2)
            int r3 = r1.getMeasuredHeight()
            int r3 = r3 + r16
            int r4 = r6.topMargin
            int r3 = r3 + r4
            int r4 = r6.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r8, r3)
            int r1 = r1.getMeasuredState()
            r6 = r18
            int r18 = android.view.View.combineMeasuredStates(r6, r1)
            r1 = r2
            r2 = r3
        L1cc:
            int r5 = r19 + 1
            r7 = r20
            r8 = r21
            r4 = r22
            r3 = r23
            r6 = r24
            goto Lb5
        L1da:
            r7 = r1
            r8 = r2
            r6 = r18
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            r2 = r27
            int r1 = android.view.View.resolveSizeAndState(r7, r2, r1)
            int r2 = r6 << 16
            r3 = r28
            int r2 = android.view.View.resolveSizeAndState(r8, r3, r2)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r3, float r4, float r5, boolean r6) {
            r2 = this;
            int r3 = r2.getChildCount()
            r4 = 0
            r5 = r4
        L6:
            if (r5 >= r3) goto L27
            android.view.View r6 = r2.getChildAt(r5)
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 != r1) goto L15
            goto L24
        L15:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            h51 r6 = (defpackage.h51) r6
            boolean r0 = r6.a(r4)
            if (r0 != 0) goto L22
            goto L24
        L22:
            e51 r6 = r6.a
        L24:
            int r5 = r5 + 1
            goto L6
        L27:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r6, float r7, float r8) {
            r5 = this;
            int r7 = r5.getChildCount()
            r8 = 0
            r0 = r8
            r1 = r0
        L7:
            if (r0 >= r7) goto L2f
            android.view.View r2 = r5.getChildAt(r0)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L16
            goto L2c
        L16:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            boolean r3 = r2.a(r8)
            if (r3 != 0) goto L23
            goto L2c
        L23:
            e51 r2 = r2.a
            if (r2 == 0) goto L2c
            boolean r2 = r2.m(r6)
            r1 = r1 | r2
        L2c:
            int r0 = r0 + 1
            goto L7
        L2f:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.f(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.b(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.d(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.j51
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            j51 r7 = (defpackage.j51) r7
            android.os.Parcelable r0 = r7.A
            super.onRestoreInstanceState(r0)
            android.util.SparseArray r7 = r7.L
            int r0 = r6.getChildCount()
            r1 = 0
        L16:
            if (r1 >= r0) goto L39
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            h51 r4 = n(r2)
            e51 r4 = r4.a
            r5 = -1
            if (r3 == r5) goto L36
            if (r4 == 0) goto L36
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L36
            r4.q(r2, r3)
        L36:
            int r1 = r1 + 1
            goto L16
        L39:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            j51 r0 = new j51
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L36
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            h51 r6 = (defpackage.h51) r6
            e51 r6 = r6.a
            r7 = -1
            if (r5 == r7) goto L33
            if (r6 == 0) goto L33
            android.os.Parcelable r4 = r6.r(r4)
            if (r4 == 0) goto L33
            r1.append(r5, r4)
        L33:
            int r3 = r3 + 1
            goto L13
        L36:
            r0.L = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r1 = r1.c(r2, r3, r4, r0)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.e(r2, r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.i0
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
            android.view.View r6 = r0.i0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            h51 r6 = (defpackage.h51) r6
            e51 r6 = r6.a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.i0
            boolean r6 = r6.u(r7, r1)
        L2a:
            android.view.View r7 = r0.i0
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
    }

    public final void p(int r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r3 = r0.getLayoutDirection()
            java.util.ArrayList r2 = r0.A
            int r9 = r2.size()
            android.graphics.Rect r10 = g()
            android.graphics.Rect r11 = g()
            android.graphics.Rect r12 = g()
            r14 = 0
        L1d:
            uz4 r15 = androidx.coordinatorlayout.widget.CoordinatorLayout.w0
            if (r14 >= r9) goto L2a9
            java.lang.Object r4 = r2.get(r14)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            h51 r5 = (defpackage.h51) r5
            if (r1 != 0) goto L3f
            int r6 = r4.getVisibility()
            r7 = 8
            if (r6 != r7) goto L3f
            r5 = r2
            r2 = r9
            r4 = r12
            r20 = r14
            r6 = 0
            goto L2a2
        L3f:
            r6 = 0
        L40:
            if (r6 >= r14) goto Lf8
            java.lang.Object r8 = r2.get(r6)
            android.view.View r8 = (android.view.View) r8
            android.view.View r7 = r5.l
            if (r7 != r8) goto Lde
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            h51 r7 = (defpackage.h51) r7
            android.view.View r8 = r7.k
            if (r8 == 0) goto Lde
            android.graphics.Rect r8 = g()
            android.graphics.Rect r13 = g()
            r17 = r5
            android.graphics.Rect r5 = g()
            r18 = r3
            android.view.View r3 = r7.k
            r0.k(r3, r8)
            r3 = 0
            r0.i(r4, r13, r3)
            r3 = r6
            r6 = r7
            int r7 = r4.getMeasuredWidth()
            r19 = r4
            r4 = r8
            int r8 = r19.getMeasuredHeight()
            r20 = r17
            r17 = r2
            r2 = r20
            r20 = r18
            r18 = r3
            r3 = r20
            r20 = r14
            r14 = r19
            l(r3, r4, r5, r6, r7, r8)
            r19 = r9
            int r9 = r5.left
            r21 = r12
            int r12 = r13.left
            if (r9 != r12) goto La3
            int r9 = r5.top
            int r12 = r13.top
            if (r9 == r12) goto La0
            goto La3
        La0:
            r16 = 0
            goto La5
        La3:
            r16 = 1
        La5:
            r0.h(r6, r5, r7, r8)
            int r7 = r5.left
            int r8 = r13.left
            int r7 = r7 - r8
            int r8 = r5.top
            int r9 = r13.top
            int r8 = r8 - r9
            if (r7 == 0) goto Lb9
            java.util.WeakHashMap r9 = defpackage.ao7.a
            r14.offsetLeftAndRight(r7)
        Lb9:
            if (r8 == 0) goto Lc0
            java.util.WeakHashMap r7 = defpackage.ao7.a
            r14.offsetTopAndBottom(r8)
        Lc0:
            if (r16 == 0) goto Lcb
            e51 r7 = r6.a
            if (r7 == 0) goto Lcb
            android.view.View r6 = r6.k
            r7.h(r0, r14, r6)
        Lcb:
            r4.setEmpty()
            r15.c(r4)
            r13.setEmpty()
            r15.c(r13)
            r5.setEmpty()
            r15.c(r5)
            goto Lea
        Lde:
            r17 = r2
            r2 = r5
            r18 = r6
            r19 = r9
            r21 = r12
            r20 = r14
            r14 = r4
        Lea:
            int r6 = r18 + 1
            r5 = r2
            r4 = r14
            r2 = r17
            r9 = r19
            r14 = r20
            r12 = r21
            goto L40
        Lf8:
            r17 = r2
            r2 = r5
            r19 = r9
            r21 = r12
            r20 = r14
            r14 = r4
            r4 = 1
            r0.i(r14, r11, r4)
            int r5 = r2.g
            r6 = 5
            r7 = 3
            r8 = 80
            r9 = 48
            if (r5 == 0) goto L15e
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L15e
            int r5 = r2.g
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r3)
            r12 = r5 & 112(0x70, float:1.57E-43)
            if (r12 == r9) goto L133
            if (r12 == r8) goto L123
            goto L13d
        L123:
            int r12 = r10.bottom
            int r13 = r0.getHeight()
            int r4 = r11.top
            int r13 = r13 - r4
            int r4 = java.lang.Math.max(r12, r13)
            r10.bottom = r4
            goto L13d
        L133:
            int r4 = r10.top
            int r12 = r11.bottom
            int r4 = java.lang.Math.max(r4, r12)
            r10.top = r4
        L13d:
            r4 = r5 & 7
            if (r4 == r7) goto L154
            if (r4 == r6) goto L144
            goto L15e
        L144:
            int r4 = r10.right
            int r5 = r0.getWidth()
            int r12 = r11.left
            int r5 = r5 - r12
            int r4 = java.lang.Math.max(r4, r5)
            r10.right = r4
            goto L15e
        L154:
            int r4 = r10.left
            int r5 = r11.right
            int r4 = java.lang.Math.max(r4, r5)
            r10.left = r4
        L15e:
            int r2 = r2.h
            if (r2 == 0) goto L258
            int r2 = r14.getVisibility()
            if (r2 != 0) goto L258
            java.util.WeakHashMap r2 = defpackage.ao7.a
            boolean r2 = r14.isLaidOut()
            if (r2 != 0) goto L172
            goto L258
        L172:
            int r2 = r14.getWidth()
            if (r2 <= 0) goto L258
            int r2 = r14.getHeight()
            if (r2 > 0) goto L180
            goto L258
        L180:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            e51 r4 = r2.a
            android.graphics.Rect r5 = g()
            android.graphics.Rect r12 = g()
            int r13 = r14.getLeft()
            int r6 = r14.getTop()
            int r7 = r14.getRight()
            int r8 = r14.getBottom()
            r12.set(r13, r6, r7, r8)
            if (r4 == 0) goto L1c2
            boolean r4 = r4.e(r14)
            if (r4 == 0) goto L1c2
            boolean r4 = r12.contains(r5)
            if (r4 == 0) goto L1b2
            goto L1c5
        L1b2:
            java.lang.String r0 = r5.toShortString()
            java.lang.String r1 = " | Bounds:"
            java.lang.String r2 = r12.toShortString()
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            defpackage.e41.k(r3, r0, r1, r2)
            return
        L1c2:
            r5.set(r12)
        L1c5:
            r12.setEmpty()
            r15.c(r12)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L1d9
            r5.setEmpty()
            r15.c(r5)
            goto L258
        L1d9:
            int r4 = r2.h
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r3)
            r6 = r4 & 48
            if (r6 != r9) goto L1f5
            int r6 = r5.top
            int r7 = r2.topMargin
            int r6 = r6 - r7
            int r7 = r2.j
            int r6 = r6 - r7
            int r7 = r10.top
            if (r6 >= r7) goto L1f5
            int r7 = r7 - r6
            v(r14, r7)
            r7 = 1
            goto L1f6
        L1f5:
            r7 = 0
        L1f6:
            r6 = r4 & 80
            r8 = 80
            if (r6 != r8) goto L212
            int r6 = r0.getHeight()
            int r8 = r5.bottom
            int r6 = r6 - r8
            int r8 = r2.bottomMargin
            int r6 = r6 - r8
            int r8 = r2.j
            int r6 = r6 + r8
            int r8 = r10.bottom
            if (r6 >= r8) goto L212
            int r6 = r6 - r8
            v(r14, r6)
            r7 = 1
        L212:
            if (r7 != 0) goto L218
            r6 = 0
            v(r14, r6)
        L218:
            r6 = r4 & 3
            r7 = 3
            if (r6 != r7) goto L22f
            int r6 = r5.left
            int r7 = r2.leftMargin
            int r6 = r6 - r7
            int r7 = r2.i
            int r6 = r6 - r7
            int r7 = r10.left
            if (r6 >= r7) goto L22f
            int r7 = r7 - r6
            u(r14, r7)
            r7 = 1
            goto L230
        L22f:
            r7 = 0
        L230:
            r4 = r4 & 5
            r6 = 5
            if (r4 != r6) goto L24b
            int r4 = r0.getWidth()
            int r6 = r5.right
            int r4 = r4 - r6
            int r6 = r2.rightMargin
            int r4 = r4 - r6
            int r2 = r2.i
            int r4 = r4 + r2
            int r2 = r10.right
            if (r4 >= r2) goto L24b
            int r4 = r4 - r2
            u(r14, r4)
            r7 = 1
        L24b:
            r6 = 0
            if (r7 != 0) goto L251
            u(r14, r6)
        L251:
            r5.setEmpty()
            r15.c(r5)
            goto L259
        L258:
            r6 = 0
        L259:
            r2 = 2
            if (r1 == r2) goto L280
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            android.graphics.Rect r2 = r2.o
            r4 = r21
            r4.set(r2)
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L274
            r5 = r17
            r2 = r19
            goto L2a2
        L274:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            android.graphics.Rect r2 = r2.o
            r2.set(r11)
            goto L282
        L280:
            r4 = r21
        L282:
            int r14 = r20 + 1
            r2 = r19
        L286:
            r5 = r17
            if (r14 >= r2) goto L2a2
            java.lang.Object r7 = r5.get(r14)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            h51 r8 = (defpackage.h51) r8
            e51 r8 = r8.a
            if (r8 == 0) goto L29d
            r8.f(r7)
        L29d:
            int r14 = r14 + 1
            r17 = r5
            goto L286
        L2a2:
            int r14 = r20 + 1
            r9 = r2
            r12 = r4
            r2 = r5
            goto L1d
        L2a9:
            r4 = r12
            r10.setEmpty()
            r15.c(r10)
            r11.setEmpty()
            r15.c(r11)
            r4.setEmpty()
            r15.c(r4)
            return
    }

    public final void q(android.view.View r13, int r14) {
            r12 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            android.view.View r1 = r0.k
            if (r1 != 0) goto L16
            int r2 = r0.f
            r3 = -1
            if (r2 != r3) goto L10
            goto L16
        L10:
            java.lang.String r12 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            defpackage.i.m(r12)
            return
        L16:
            uz4 r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.w0
            if (r1 == 0) goto L62
            android.graphics.Rect r4 = g()
            android.graphics.Rect r5 = g()
            r12.k(r1, r4)     // Catch: java.lang.Throwable -> L53
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()     // Catch: java.lang.Throwable -> L53
            r6 = r0
            h51 r6 = (defpackage.h51) r6     // Catch: java.lang.Throwable -> L53
            int r7 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L53
            int r8 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L53
            r3 = r14
            l(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L53
            r12.h(r6, r5, r7, r8)     // Catch: java.lang.Throwable -> L53
            int r12 = r5.left     // Catch: java.lang.Throwable -> L53
            int r14 = r5.top     // Catch: java.lang.Throwable -> L53
            int r0 = r5.right     // Catch: java.lang.Throwable -> L53
            int r1 = r5.bottom     // Catch: java.lang.Throwable -> L53
            r13.layout(r12, r14, r0, r1)     // Catch: java.lang.Throwable -> L53
            r4.setEmpty()
            r2.c(r4)
            r5.setEmpty()
            r2.c(r5)
            return
        L53:
            r0 = move-exception
            r12 = r0
            r4.setEmpty()
            r2.c(r4)
            r5.setEmpty()
            r2.c(r5)
            throw r12
        L62:
            r3 = r14
            int r14 = r0.e
            if (r14 < 0) goto Le5
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            int r1 = r0.c
            if (r1 != 0) goto L74
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L74:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r3)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r4 = r12.getWidth()
            int r5 = r12.getHeight()
            int r6 = r13.getMeasuredWidth()
            int r7 = r13.getMeasuredHeight()
            r8 = 1
            if (r3 != r8) goto L91
            int r14 = r4 - r14
        L91:
            int r14 = r12.m(r14)
            int r14 = r14 - r6
            if (r2 == r8) goto L9e
            r3 = 5
            if (r2 == r3) goto L9c
            goto La1
        L9c:
            int r14 = r14 + r6
            goto La1
        L9e:
            int r2 = r6 / 2
            int r14 = r14 + r2
        La1:
            r2 = 16
            if (r1 == r2) goto Lad
            r2 = 80
            if (r1 == r2) goto Lab
            r1 = 0
            goto Laf
        Lab:
            r1 = r7
            goto Laf
        Lad:
            int r1 = r7 / 2
        Laf:
            int r2 = r12.getPaddingLeft()
            int r3 = r0.leftMargin
            int r2 = r2 + r3
            int r3 = r12.getPaddingRight()
            int r4 = r4 - r3
            int r4 = r4 - r6
            int r3 = r0.rightMargin
            int r4 = r4 - r3
            int r14 = java.lang.Math.min(r14, r4)
            int r14 = java.lang.Math.max(r2, r14)
            int r2 = r12.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r12 = r12.getPaddingBottom()
            int r5 = r5 - r12
            int r5 = r5 - r7
            int r12 = r0.bottomMargin
            int r5 = r5 - r12
            int r12 = java.lang.Math.min(r1, r5)
            int r12 = java.lang.Math.max(r2, r12)
            int r6 = r6 + r14
            int r7 = r7 + r12
            r13.layout(r14, r12, r6, r7)
            return
        Le5:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            h51 r14 = (defpackage.h51) r14
            android.graphics.Rect r9 = g()
            int r0 = r12.getPaddingLeft()
            int r1 = r14.leftMargin
            int r0 = r0 + r1
            int r1 = r12.getPaddingTop()
            int r4 = r14.topMargin
            int r1 = r1 + r4
            int r4 = r12.getWidth()
            int r5 = r12.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r14.rightMargin
            int r4 = r4 - r5
            int r5 = r12.getHeight()
            int r6 = r12.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r14.bottomMargin
            int r5 = r5 - r6
            r9.set(r0, r1, r4, r5)
            vu7 r0 = r12.m0
            if (r0 == 0) goto L156
            java.util.WeakHashMap r0 = defpackage.ao7.a
            boolean r0 = r12.getFitsSystemWindows()
            if (r0 == 0) goto L156
            boolean r0 = r13.getFitsSystemWindows()
            if (r0 != 0) goto L156
            int r0 = r9.left
            vu7 r1 = r12.m0
            int r1 = r1.b()
            int r1 = r1 + r0
            r9.left = r1
            int r0 = r9.top
            vu7 r1 = r12.m0
            int r1 = r1.d()
            int r1 = r1 + r0
            r9.top = r1
            int r0 = r9.right
            vu7 r1 = r12.m0
            int r1 = r1.c()
            int r0 = r0 - r1
            r9.right = r0
            int r0 = r9.bottom
            vu7 r12 = r12.m0
            int r12 = r12.a()
            int r0 = r0 - r12
            r9.bottom = r0
        L156:
            android.graphics.Rect r10 = g()
            int r12 = r14.c
            r14 = r12 & 7
            if (r14 != 0) goto L164
            r14 = 8388611(0x800003, float:1.1754948E-38)
            r12 = r12 | r14
        L164:
            r14 = r12 & 112(0x70, float:1.57E-43)
            if (r14 != 0) goto L16a
            r12 = r12 | 48
        L16a:
            r6 = r12
            int r7 = r13.getMeasuredWidth()
            int r8 = r13.getMeasuredHeight()
            r11 = r3
            android.view.Gravity.apply(r6, r7, r8, r9, r10, r11)
            int r12 = r10.left
            int r14 = r10.top
            int r0 = r10.right
            int r1 = r10.bottom
            r13.layout(r12, r14, r0, r1)
            r9.setEmpty()
            r2.c(r9)
            r10.setEmpty()
            r2.c(r10)
            return
    }

    public final boolean r(android.view.MotionEvent r21, int r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r1.getActionMasked()
            java.util.ArrayList r4 = r0.L
            r4.clear()
            boolean r5 = r0.isChildrenDrawingOrderEnabled()
            int r6 = r0.getChildCount()
            int r7 = r6 + (-1)
        L19:
            if (r7 < 0) goto L2d
            if (r5 == 0) goto L22
            int r8 = r0.getChildDrawingOrder(r6, r7)
            goto L23
        L22:
            r8 = r7
        L23:
            android.view.View r8 = r0.getChildAt(r8)
            r4.add(r8)
            int r7 = r7 + (-1)
            goto L19
        L2d:
            zh2 r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.v0
            if (r5 == 0) goto L34
            java.util.Collections.sort(r4, r5)
        L34:
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = r7
            r7 = r6
        L3c:
            if (r6 >= r5) goto L8d
            java.lang.Object r9 = r4.get(r6)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            h51 r10 = (defpackage.h51) r10
            e51 r10 = r10.a
            r11 = 1
            if (r7 != 0) goto L50
            goto L74
        L50:
            if (r3 == 0) goto L74
            if (r10 == 0) goto L8a
            if (r8 != 0) goto L67
            long r12 = android.os.SystemClock.uptimeMillis()
            r18 = 0
            r19 = 0
            r16 = 3
            r17 = 0
            r14 = r12
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r12, r14, r16, r17, r18, r19)
        L67:
            if (r2 == 0) goto L70
            if (r2 == r11) goto L6c
            goto L8a
        L6c:
            r10.u(r9, r8)
            goto L8a
        L70:
            r10.j(r0, r9, r8)
            goto L8a
        L74:
            if (r7 != 0) goto L8a
            if (r10 == 0) goto L8a
            if (r2 == 0) goto L82
            if (r2 == r11) goto L7d
            goto L86
        L7d:
            boolean r7 = r10.u(r9, r1)
            goto L86
        L82:
            boolean r7 = r10.j(r0, r9, r1)
        L86:
            if (r7 == 0) goto L8a
            r0.i0 = r9
        L8a:
            int r6 = r6 + 1
            goto L3c
        L8d:
            r4.clear()
            return r7
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            e51 r0 = r0.a
            if (r0 == 0) goto Ld
            r0.p(r1, r2)
        Ld:
            boolean r1 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.f0
            if (r1 != 0) goto L10
            r1 = 0
            r0.t(r1)
            r1 = 1
            r0.f0 = r1
        L10:
            return
    }

    public final void s() {
            r15 = this;
            java.util.ArrayList r0 = r15.A
            r0.clear()
            eb r1 = r15.B
            java.lang.Object r2 = r1.L
            ci6 r2 = (defpackage.ci6) r2
            java.lang.Object r3 = r1.B
            tz4 r3 = (defpackage.tz4) r3
            java.lang.Object r4 = r1.L
            ci6 r4 = (defpackage.ci6) r4
            int r5 = r2.L
            r6 = 0
            r7 = r6
        L17:
            if (r7 >= r5) goto L2a
            java.lang.Object r8 = r2.i(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L27
            r8.clear()
            r3.c(r8)
        L27:
            int r7 = r7 + 1
            goto L17
        L2a:
            r2.clear()
            int r2 = r15.getChildCount()
            r5 = r6
        L32:
            if (r5 >= r2) goto L153
            android.view.View r7 = r15.getChildAt(r5)
            h51 r8 = n(r7)
            int r9 = r8.f
            r10 = -1
            r11 = 0
            if (r9 != r10) goto L48
            r8.l = r11
            r8.k = r11
            goto Lc3
        L48:
            android.view.View r10 = r8.k
            if (r10 == 0) goto L74
            int r10 = r10.getId()
            if (r10 == r9) goto L53
            goto L74
        L53:
            android.view.View r10 = r8.k
            android.view.ViewParent r12 = r10.getParent()
        L59:
            if (r12 == r15) goto L71
            if (r12 == 0) goto L6c
            if (r12 != r7) goto L60
            goto L6c
        L60:
            boolean r13 = r12 instanceof android.view.View
            if (r13 == 0) goto L67
            r10 = r12
            android.view.View r10 = (android.view.View) r10
        L67:
            android.view.ViewParent r12 = r12.getParent()
            goto L59
        L6c:
            r8.l = r11
            r8.k = r11
            goto L74
        L71:
            r8.l = r10
            goto Lc3
        L74:
            android.view.View r10 = r15.findViewById(r9)
            r8.k = r10
            if (r10 == 0) goto Lb9
            if (r10 != r15) goto L8f
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto L89
            r8.l = r11
            r8.k = r11
            goto Lc3
        L89:
            java.lang.String r15 = "View can not be anchored to the the parent CoordinatorLayout"
            defpackage.i.m(r15)
            return
        L8f:
            android.view.ViewParent r9 = r10.getParent()
        L93:
            if (r9 == r15) goto Lb6
            if (r9 == 0) goto Lb6
            if (r9 != r7) goto Laa
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto La4
            r8.l = r11
            r8.k = r11
            goto Lc3
        La4:
            java.lang.String r15 = "Anchor must not be a descendant of the anchored view"
            defpackage.i.m(r15)
            return
        Laa:
            boolean r12 = r9 instanceof android.view.View
            if (r12 == 0) goto Lb1
            r10 = r9
            android.view.View r10 = (android.view.View) r10
        Lb1:
            android.view.ViewParent r9 = r9.getParent()
            goto L93
        Lb6:
            r8.l = r10
            goto Lc3
        Lb9:
            boolean r10 = r15.isInEditMode()
            if (r10 == 0) goto L143
            r8.l = r11
            r8.k = r11
        Lc3:
            boolean r9 = r4.containsKey(r7)
            if (r9 != 0) goto Lcc
            r4.put(r7, r11)
        Lcc:
            r9 = r6
        Lcd:
            if (r9 >= r2) goto L13f
            if (r9 != r5) goto Ld2
            goto L136
        Ld2:
            android.view.View r10 = r15.getChildAt(r9)
            android.view.View r12 = r8.l
            if (r10 == r12) goto L100
            java.util.WeakHashMap r12 = defpackage.ao7.a
            int r12 = r15.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
            h51 r13 = (defpackage.h51) r13
            int r13 = r13.g
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r12)
            if (r13 == 0) goto Lf8
            int r14 = r8.h
            int r12 = android.view.Gravity.getAbsoluteGravity(r14, r12)
            r12 = r12 & r13
            if (r12 != r13) goto Lf8
            goto L100
        Lf8:
            e51 r10 = r8.a
            if (r10 == 0) goto L136
            r10.f(r7)
            goto L136
        L100:
            boolean r12 = r4.containsKey(r10)
            if (r12 != 0) goto L10f
            boolean r12 = r4.containsKey(r10)
            if (r12 != 0) goto L10f
            r4.put(r10, r11)
        L10f:
            boolean r12 = r4.containsKey(r10)
            if (r12 == 0) goto L139
            boolean r12 = r4.containsKey(r7)
            if (r12 == 0) goto L139
            java.lang.Object r12 = r4.get(r10)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L133
            java.lang.Object r12 = r3.a()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L130
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L130:
            r4.put(r10, r12)
        L133:
            r12.add(r7)
        L136:
            int r9 = r9 + 1
            goto Lcd
        L139:
            java.lang.String r15 = "All nodes must be present in the graph before being added as an edge"
            defpackage.i.h(r15)
            return
        L13f:
            int r5 = r5 + 1
            goto L32
        L143:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r9)
            java.lang.String r0 = " to anchor view "
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            defpackage.e41.r(r1, r15, r0, r7)
            return
        L153:
            java.lang.Object r15 = r1.R
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            r15.clear()
            java.lang.Object r2 = r1.X
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
            int r3 = r4.L
        L163:
            if (r6 >= r3) goto L16f
            java.lang.Object r5 = r4.f(r6)
            r1.u(r5, r15, r2)
            int r6 = r6 + 1
            goto L163
        L16f:
            r0.addAll(r15)
            java.util.Collections.reverse(r0)
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.w()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.p0 = r1
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.o0
            if (r0 == r3) goto L47
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.o0 = r1
            if (r1 == 0) goto L42
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.o0
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.o0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            int r0 = r2.getLayoutDirection()
            r3.setLayoutDirection(r0)
            android.graphics.drawable.Drawable r3 = r2.o0
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = r1
        L3a:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.o0
            r3.setCallback(r2)
        L42:
            java.util.WeakHashMap r3 = defpackage.ao7.a
            r2.postInvalidateOnAnimation()
        L47:
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStatusBarBackground(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.o0
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r2 = r2.o0
            r2.setVisible(r3, r0)
        L18:
            return
    }

    public final void t(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L32
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            h51 r4 = (defpackage.h51) r4
            e51 r4 = r4.a
            if (r4 == 0) goto L2f
            long r5 = android.os.SystemClock.uptimeMillis()
            r11 = 0
            r12 = 0
            r9 = 3
            r10 = 0
            r7 = r5
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L29
            r4.j(r13, r3, r5)
            goto L2c
        L29:
            r4.u(r3, r5)
        L2c:
            r5.recycle()
        L2f:
            int r2 = r2 + 1
            goto L6
        L32:
            r14 = r1
        L33:
            if (r14 >= r0) goto L45
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            r2.getClass()
            int r14 = r14 + 1
            goto L33
        L45:
            r14 = 0
            r13.i0 = r14
            r13.f0 = r1
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r1 = r1.o0
            if (r2 != r1) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public final void w() {
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.ao7.a
            boolean r0 = r2.getFitsSystemWindows()
            if (r0 == 0) goto L1f
            d51 r0 = r2.q0
            if (r0 != 0) goto L14
            d51 r0 = new d51
            r1 = 0
            r0.<init>(r2, r1)
            r2.q0 = r0
        L14:
            d51 r0 = r2.q0
            defpackage.sn7.c(r2, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r2.setSystemUiVisibility(r0)
            return
        L1f:
            r0 = 0
            defpackage.sn7.c(r2, r0)
            return
    }
}
