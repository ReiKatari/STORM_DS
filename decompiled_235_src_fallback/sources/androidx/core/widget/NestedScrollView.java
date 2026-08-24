package androidx.core.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements defpackage.le4 {
    public static final float C0 = 0.0f;
    public static final defpackage.c24 D0 = null;
    public static final int[] E0 = null;
    public final float A;
    public defpackage.he4 A0;
    public long B;
    public final defpackage.nj1 B0;
    public final android.graphics.Rect L;
    public final android.widget.OverScroller R;
    public final android.widget.EdgeEffect d0;
    public final android.widget.EdgeEffect e0;
    public defpackage.l76 f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public android.view.View j0;
    public boolean k0;
    public android.view.VelocityTracker l0;
    public boolean m0;
    public boolean n0;
    public final int o0;
    public final int p0;
    public final int q0;
    public int r0;
    public final int[] s0;
    public final int[] t0;
    public int u0;
    public int v0;
    public defpackage.ie4 w0;
    public final defpackage.dy7 x0;
    public final defpackage.je4 y0;
    public float z0;

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.C0 = r0
            c24 r0 = new c24
            r1 = 3
            r0.<init>(r1)
            androidx.core.widget.NestedScrollView.D0 = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.E0 = r0
            return
    }

    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2130969593(0x7f0403f9, float:1.7547872E38)
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.L = r1
            r1 = 1
            r6.h0 = r1
            r2 = 0
            r6.i0 = r2
            r3 = 0
            r6.j0 = r3
            r6.k0 = r2
            r6.n0 = r1
            r3 = -1
            r6.r0 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.s0 = r4
            int[] r3 = new int[r3]
            r6.t0 = r3
            s63 r3 = new s63
            r4 = 20
            r3.<init>(r6, r4)
            nj1 r4 = new nj1
            android.content.Context r5 = r6.getContext()
            r4.<init>(r5, r3)
            r6.B0 = r4
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L43
            android.widget.EdgeEffect r5 = defpackage.kr1.a(r7, r8)
            goto L48
        L43:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L48:
            r6.d0 = r5
            if (r3 < r4) goto L51
            android.widget.EdgeEffect r3 = defpackage.kr1.a(r7, r8)
            goto L56
        L51:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L56:
            r6.e0 = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.A = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.R = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.o0 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.p0 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.q0 = r3
            int[] r3 = androidx.core.widget.NestedScrollView.E0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            dy7 r7 = new dy7
            r7.<init>()
            r6.x0 = r7
            je4 r7 = new je4
            r7.<init>(r6)
            r6.y0 = r7
            r6.setNestedScrollingEnabled(r1)
            c24 r7 = androidx.core.widget.NestedScrollView.D0
            defpackage.ao7.n(r6, r7)
            return
    }

    private defpackage.l76 getScrollFeedbackProvider() {
            r1 = this;
            l76 r0 = r1.f0
            if (r0 != 0) goto Lb
            l76 r0 = new l76
            r0.<init>(r1)
            r1.f0 = r0
        Lb:
            l76 r1 = r1.f0
            return r1
    }

    public static boolean l(android.view.View r1, androidx.core.widget.NestedScrollView r2) {
            if (r1 != r2) goto L3
            goto L13
        L3:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L15
            android.view.View r1 = (android.view.View) r1
            boolean r1 = l(r1, r2)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // defpackage.le4
    public final void a(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.n(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            defpackage.i.m(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            defpackage.i.m(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            defpackage.i.m(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.String r1 = "ScrollView can host only one direct child"
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.ke4
    public final void b(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.n(r5, r6, r1)
            return
    }

    @Override // defpackage.ke4
    public final boolean c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
            r0 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
            r0 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
            r0 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public final void computeScroll() {
            r18 = this;
            r0 = r18
            android.widget.OverScroller r1 = r0.R
            boolean r2 = r1.isFinished()
            if (r2 == 0) goto Lb
            return
        Lb:
            r1.computeScrollOffset()
            int r2 = r1.getCurrY()
            int r3 = r0.v0
            int r3 = r2 - r3
            int r4 = r0.getHeight()
            android.widget.EdgeEffect r5 = r0.d0
            android.widget.EdgeEffect r6 = r0.e0
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r3 <= 0) goto L46
            float r10 = defpackage.nw7.g0(r5)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 == 0) goto L46
            int r8 = -r3
            float r8 = (float) r8
            float r8 = r8 * r9
            float r10 = (float) r4
            float r8 = r8 / r10
            int r4 = -r4
            float r4 = (float) r4
            float r4 = r4 / r9
            float r7 = defpackage.nw7.j0(r5, r8, r7)
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            if (r4 == r3) goto L43
            r5.finish()
        L43:
            int r3 = r3 - r4
        L44:
            r9 = r3
            goto L64
        L46:
            if (r3 >= 0) goto L44
            float r10 = defpackage.nw7.g0(r6)
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 == 0) goto L44
            float r8 = (float) r3
            float r8 = r8 * r9
            float r4 = (float) r4
            float r8 = r8 / r4
            float r4 = r4 / r9
            float r7 = defpackage.nw7.j0(r6, r8, r7)
            float r7 = r7 * r4
            int r4 = java.lang.Math.round(r7)
            if (r4 == r3) goto L43
            r6.finish()
            goto L43
        L64:
            r0.v0 = r2
            int[] r11 = r0.t0
            r2 = 1
            r3 = 0
            r11[r2] = r3
            r12 = 0
            je4 r7 = r0.y0
            r8 = 0
            r10 = 1
            r7.c(r8, r9, r10, r11, r12)
            r17 = r11
            r4 = r17[r2]
            int r9 = r9 - r4
            int r4 = r0.getScrollRange()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 35
            if (r7 < r8) goto L8e
            float r7 = r1.getCurrVelocity()
            float r7 = java.lang.Math.abs(r7)
            defpackage.js1.a(r0, r7)
        L8e:
            if (r9 == 0) goto Lb4
            int r7 = r0.getScrollY()
            int r8 = r0.getScrollX()
            r0.p(r9, r8, r7, r4)
            int r8 = r0.getScrollY()
            int r12 = r8 - r7
            int r14 = r9 - r12
            r17[r2] = r3
            r13 = 0
            je4 r10 = r0.y0
            r11 = 0
            int[] r15 = r0.s0
            r16 = 1
            r10.d(r11, r12, r13, r14, r15, r16, r17)
            r3 = r17[r2]
            int r9 = r14 - r3
        Lb4:
            if (r9 == 0) goto Le5
            int r3 = r0.getOverScrollMode()
            if (r3 == 0) goto Lc0
            if (r3 != r2) goto Ldf
            if (r4 <= 0) goto Ldf
        Lc0:
            if (r9 >= 0) goto Ld1
            boolean r3 = r5.isFinished()
            if (r3 == 0) goto Ldf
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r5.onAbsorb(r3)
            goto Ldf
        Ld1:
            boolean r3 = r6.isFinished()
            if (r3 == 0) goto Ldf
            float r3 = r1.getCurrVelocity()
            int r3 = (int) r3
            r6.onAbsorb(r3)
        Ldf:
            r1.abortAnimation()
            r0.w(r2)
        Le5:
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lef
            r0.postInvalidateOnAnimation()
            return
        Lef:
            r0.w(r2)
            return
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
            r0 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
            r1 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r4 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r4 >= 0) goto L35
            int r2 = r2 - r4
            return r2
        L35:
            if (r4 <= r0) goto L3a
            int r4 = r4 - r0
            int r4 = r4 + r2
            return r4
        L3a:
            return r2
    }

    @Override // defpackage.ke4
    public final void d(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = 1
            dy7 r2 = r0.x0
            if (r4 != r1) goto L8
            r2.b = r3
            goto La
        L8:
            r2.a = r3
        La:
            r1 = 2
            je4 r0 = r0.y0
            r0.g(r1, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r1 = r1.i(r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r1, float r2, boolean r3) {
            r0 = this;
            je4 r0 = r0.y0
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r1, float r2) {
            r0 = this;
            je4 r0 = r0.y0
            boolean r0 = r0.b(r1, r2)
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r3 = 0
            je4 r0 = r6.y0
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = r0.c(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            je4 r0 = r8.y0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r8 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            super.draw(r11)
            int r0 = r10.getScrollY()
            android.widget.EdgeEffect r1 = r10.d0
            boolean r2 = r1.isFinished()
            r3 = 0
            if (r2 != 0) goto L59
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = java.lang.Math.min(r3, r0)
            boolean r7 = r10.getClipToPadding()
            if (r7 == 0) goto L44
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r8 = r8 + r7
            int r4 = r4 - r8
            int r7 = r10.getPaddingLeft()
            int r8 = r10.getPaddingTop()
            int r9 = r10.getPaddingBottom()
            int r9 = r9 + r8
            int r5 = r5 - r9
            int r8 = r10.getPaddingTop()
            int r6 = r6 + r8
            goto L45
        L44:
            r7 = r3
        L45:
            float r7 = (float) r7
            float r6 = (float) r6
            r11.translate(r7, r6)
            r1.setSize(r4, r5)
            boolean r1 = r1.draw(r11)
            if (r1 == 0) goto L56
            r10.postInvalidateOnAnimation()
        L56:
            r11.restoreToCount(r2)
        L59:
            android.widget.EdgeEffect r1 = r10.e0
            boolean r2 = r1.isFinished()
            if (r2 != 0) goto Lbb
            int r2 = r11.save()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getScrollRange()
            int r0 = java.lang.Math.max(r6, r0)
            int r0 = r0 + r5
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L8a
            int r3 = r10.getPaddingLeft()
            int r6 = r10.getPaddingRight()
            int r6 = r6 + r3
            int r4 = r4 - r6
            int r3 = r10.getPaddingLeft()
        L8a:
            boolean r6 = r10.getClipToPadding()
            if (r6 == 0) goto L9f
            int r6 = r10.getPaddingTop()
            int r7 = r10.getPaddingBottom()
            int r7 = r7 + r6
            int r5 = r5 - r7
            int r6 = r10.getPaddingBottom()
            int r0 = r0 - r6
        L9f:
            int r3 = r3 - r4
            float r3 = (float) r3
            float r0 = (float) r0
            r11.translate(r3, r0)
            float r0 = (float) r4
            r3 = 0
            r6 = 1127481344(0x43340000, float:180.0)
            r11.rotate(r6, r0, r3)
            r1.setSize(r4, r5)
            boolean r0 = r1.draw(r11)
            if (r0 == 0) goto Lb8
            r10.postInvalidateOnAnimation()
        Lb8:
            r11.restoreToCount(r2)
        Lbb:
            return
    }

    @Override // defpackage.ke4
    public final void e(android.view.View r3, int r4) {
            r2 = this;
            r3 = 1
            dy7 r0 = r2.x0
            r1 = 0
            if (r4 != r3) goto L9
            r0.b = r1
            goto Lb
        L9:
            r0.a = r1
        Lb:
            r2.w(r4)
            return
    }

    @Override // defpackage.ke4
    public final void f(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = 0
            je4 r0 = r0.y0
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    public final boolean g(int r11) {
            r10 = this;
            android.view.View r1 = r10.findFocus()
            if (r1 != r10) goto L7
            r1 = 0
        L7:
            r7 = r1
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r1.findNextFocus(r10, r7, r11)
            int r1 = r10.getMaxScrollAmount()
            r9 = 0
            if (r8 == 0) goto L3a
            int r2 = r10.getHeight()
            boolean r2 = r10.m(r8, r1, r2)
            if (r2 == 0) goto L3a
            android.graphics.Rect r1 = r10.L
            r8.getDrawingRect(r1)
            r10.offsetDescendantRectToMyCoords(r8, r1)
            int r1 = r10.h(r1)
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r0 = r10
            r0.s(r1, r2, r3, r4, r5, r6)
            r8.requestFocus(r11)
            goto L87
        L3a:
            r2 = 33
            r3 = 130(0x82, float:1.82E-43)
            if (r11 != r2) goto L4b
            int r2 = r10.getScrollY()
            if (r2 >= r1) goto L4b
            int r1 = r10.getScrollY()
            goto L77
        L4b:
            if (r11 != r3) goto L77
            int r2 = r10.getChildCount()
            if (r2 <= 0) goto L77
            android.view.View r2 = r10.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r2 = r2.getBottom()
            int r4 = r4.bottomMargin
            int r2 = r2 + r4
            int r4 = r10.getScrollY()
            int r5 = r10.getHeight()
            int r5 = r5 + r4
            int r4 = r10.getPaddingBottom()
            int r5 = r5 - r4
            int r2 = r2 - r5
            int r1 = java.lang.Math.min(r2, r1)
        L77:
            if (r1 != 0) goto L7a
            return r9
        L7a:
            if (r11 != r3) goto L7d
            goto L7e
        L7d:
            int r1 = -r1
        L7e:
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 1
            r0 = r10
            r0.s(r1, r2, r3, r4, r5, r6)
        L87:
            r1 = 1
            if (r7 == 0) goto La9
            boolean r2 = r7.isFocused()
            if (r2 == 0) goto La9
            int r2 = r10.getHeight()
            boolean r2 = r10.m(r7, r9, r2)
            if (r2 != 0) goto La9
            int r2 = r10.getDescendantFocusability()
            r3 = 131072(0x20000, float:1.83671E-40)
            r10.setDescendantFocusability(r3)
            r10.requestFocus()
            r10.setDescendantFocusability(r2)
        La9:
            return r1
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r5 = r5.getScrollY()
            int r0 = r0 - r5
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r5 = (float) r0
            float r0 = (float) r2
            float r5 = r5 / r0
            return r5
        L33:
            r5 = 1065353216(0x3f800000, float:1.0)
            return r5
    }

    public int getMaxScrollAmount() {
            r1 = this;
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = (int) r1
            return r1
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            dy7 r1 = r1.x0
            int r0 = r1.a
            int r1 = r1.b
            r1 = r1 | r0
            return r1
    }

    public int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2f
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            int r0 = r0 - r2
            int r4 = java.lang.Math.max(r1, r0)
            return r4
        L2f:
            return r1
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.getVerticalFadingEdgeLength()
            int r1 = r1.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
    }

    public float getVerticalScrollFactorCompat() {
            r6 = this;
            float r0 = r6.z0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r2 = r6.getContext()
            android.content.res.Resources$Theme r3 = r2.getTheme()
            r4 = 16842829(0x101004d, float:2.3693774E-38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r5)
            if (r3 == 0) goto L2d
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r6.z0 = r0
            goto L33
        L2d:
            java.lang.String r6 = "Expected theme to define listPreferredItemHeight."
            defpackage.i.m(r6)
            return r1
        L33:
            float r6 = r6.z0
            return r6
    }

    public final int h(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L59
            int r8 = r11.top
            if (r8 <= r2) goto L59
            int r10 = r11.height()
            if (r10 <= r0) goto L49
            int r10 = r11.top
            int r10 = r10 - r2
            goto L4c
        L49:
            int r10 = r11.bottom
            int r10 = r10 - r4
        L4c:
            int r11 = r5.getBottom()
            int r0 = r6.bottomMargin
            int r11 = r11 + r0
            int r11 = r11 - r3
            int r10 = java.lang.Math.min(r10, r11)
            return r10
        L59:
            int r3 = r11.top
            if (r3 >= r2) goto L78
            if (r7 >= r4) goto L78
            int r3 = r11.height()
            if (r3 <= r0) goto L6a
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L6e
        L6a:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L6e:
            int r10 = r10.getScrollY()
            int r10 = -r10
            int r10 = java.lang.Math.max(r1, r10)
            return r10
        L78:
            return r1
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            je4 r1 = r1.y0
            boolean r1 = r1.f(r0)
            return r1
    }

    public final boolean i(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.L
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 130(0x82, float:1.82E-43)
            r2 = 0
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.q(r1)
            return r2
        L5f:
            r5.q(r4)
            return r2
        L63:
            boolean r5 = r5.k(r1)
            return r5
        L68:
            boolean r5 = r5.k(r4)
            return r5
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r1 = r4
        L74:
            r5.q(r1)
            return r2
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r5 = r5.k(r1)
            return r5
        L83:
            boolean r5 = r5.g(r1)
            return r5
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r5 = r5.k(r4)
            return r5
        L93:
            boolean r5 = r5.g(r4)
            return r5
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r1)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r5 = r6.requestFocus(r1)
            if (r5 == 0) goto Lc0
            r5 = 1
            return r5
        Lc0:
            return r2
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            je4 r0 = r0.y0
            boolean r0 = r0.d
            return r0
    }

    public final void j(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L41
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            android.widget.OverScroller r1 = r12.R
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 2
            je4 r0 = r12.y0
            r1 = 1
            r0.g(r13, r1)
            int r13 = r12.getScrollY()
            r12.v0 = r13
            r12.postInvalidateOnAnimation()
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r13 < r0) goto L41
            android.widget.OverScroller r13 = r12.R
            float r13 = r13.getCurrVelocity()
            float r13 = java.lang.Math.abs(r13)
            defpackage.js1.a(r12, r13)
        L41:
            return
    }

    public final boolean k(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.L
            r4.top = r1
            r4.bottom = r3
            if (r0 == 0) goto L37
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L37
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            r4.bottom = r1
            int r1 = r1 - r3
            r4.top = r1
        L37:
            int r0 = r4.top
            int r1 = r4.bottom
            boolean r5 = r5.r(r6, r0, r1)
            return r5
    }

    public final boolean m(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.L
            r3.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r3, r0)
            int r3 = r0.bottom
            int r3 = r3 + r4
            int r1 = r2.getScrollY()
            if (r3 < r1) goto L1d
            int r3 = r0.top
            int r3 = r3 - r4
            int r2 = r2.getScrollY()
            int r2 = r2 + r5
            if (r3 > r2) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup
    public final void measureChild(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            int r0 = r1.getPaddingLeft()
            int r1 = r1.getPaddingRight()
            int r1 = r1 + r0
            int r4 = r4.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r3, r1, r4)
            r3 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r5 = r0.getPaddingLeft()
            int r0 = r0.getPaddingRight()
            int r0 = r0 + r5
            int r5 = r4.leftMargin
            int r0 = r0 + r5
            int r5 = r4.rightMargin
            int r0 = r0 + r5
            int r0 = r0 + r3
            int r3 = r4.width
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r0, r3)
            int r2 = r4.topMargin
            int r3 = r4.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r0, r2)
            return
    }

    public final void n(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            r5 = 0
            r7 = 0
            je4 r2 = r10.y0
            r3 = 0
            r8 = r12
            r9 = r13
            r2.d(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public final void o(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.r0
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.g0 = r1
            int r4 = r4.getPointerId(r0)
            r3.r0 = r4
            android.view.VelocityTracker r3 = r3.l0
            if (r3 == 0) goto L25
            r3.clear()
        L25:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.i0 = r0
            return
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L5e
            boolean r0 = r12.k0
            if (r0 != 0) goto L5e
            r0 = 2
            boolean r1 = defpackage.ej2.J(r13, r0)
            r3 = 0
            if (r1 == 0) goto L23
            r0 = 9
            float r1 = r13.getAxisValue(r0)
            float r4 = r13.getX()
            int r4 = (int) r4
            r7 = r0
            r9 = r4
            goto L3e
        L23:
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = defpackage.ej2.J(r13, r1)
            if (r1 == 0) goto L3b
            r1 = 26
            float r4 = r13.getAxisValue(r1)
            int r5 = r12.getWidth()
            int r0 = r5 / 2
            r9 = r0
            r7 = r1
            r1 = r4
            goto L3e
        L3b:
            r7 = r2
            r9 = r7
            r1 = r3
        L3e:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L5e
            float r0 = r12.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r11 = defpackage.ej2.J(r13, r1)
            int r6 = -r0
            r10 = 1
            r5 = r12
            r8 = r13
            r5.s(r6, r7, r8, r9, r10, r11)
            if (r7 == 0) goto L5c
            nj1 r12 = r5.B0
            r12.a(r8, r7)
        L5c:
            r12 = 1
            return r12
        L5e:
            return r2
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.k0
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Laf
            r5 = -1
            if (r0 == r1) goto L83
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L83
            r1 = 6
            if (r0 == r1) goto L20
            goto L130
        L20:
            r12.o(r13)
            goto L130
        L25:
            int r0 = r12.r0
            if (r0 != r5) goto L2b
            goto L130
        L2b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L4b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L130
        L4b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.g0
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.o0
            if (r3 <= r5) goto L130
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L130
            r12.k0 = r1
            r12.g0 = r0
            android.view.VelocityTracker r0 = r12.l0
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l0 = r0
        L71:
            android.view.VelocityTracker r0 = r12.l0
            r0.addMovement(r13)
            r12.u0 = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L130
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L130
        L83:
            r12.k0 = r4
            r12.r0 = r5
            android.view.VelocityTracker r13 = r12.l0
            if (r13 == 0) goto L90
            r13.recycle()
            r12.l0 = r3
        L90:
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            android.widget.OverScroller r5 = r12.R
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Laa
            r12.postInvalidateOnAnimation()
        Laa:
            r12.w(r4)
            goto L130
        Laf:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            android.widget.OverScroller r7 = r12.R
            if (r6 <= 0) goto L117
            int r6 = r12.getScrollY()
            android.view.View r8 = r12.getChildAt(r4)
            int r9 = r8.getTop()
            int r9 = r9 - r6
            if (r0 < r9) goto L117
            int r9 = r8.getBottom()
            int r9 = r9 - r6
            if (r0 >= r9) goto L117
            int r6 = r8.getLeft()
            if (r5 < r6) goto L117
            int r6 = r8.getRight()
            if (r5 >= r6) goto L117
            r12.g0 = r0
            int r0 = r13.getPointerId(r4)
            r12.r0 = r0
            android.view.VelocityTracker r0 = r12.l0
            if (r0 != 0) goto Lf6
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.l0 = r0
            goto Lf9
        Lf6:
            r0.clear()
        Lf9:
            android.view.VelocityTracker r0 = r12.l0
            r0.addMovement(r13)
            r7.computeScrollOffset()
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L10f
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L10e
            goto L10f
        L10e:
            r1 = r4
        L10f:
            r12.k0 = r1
            je4 r13 = r12.y0
            r13.g(r2, r4)
            goto L130
        L117:
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L125
            boolean r13 = r7.isFinished()
            if (r13 != 0) goto L124
            goto L125
        L124:
            r1 = r4
        L125:
            r12.k0 = r1
            android.view.VelocityTracker r13 = r12.l0
            if (r13 == 0) goto L130
            r13.recycle()
            r12.l0 = r3
        L130:
            boolean r12 = r12.k0
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.h0 = r2
            android.view.View r3 = r1.j0
            if (r3 == 0) goto L23
            boolean r3 = l(r3, r1)
            if (r3 == 0) goto L23
            android.view.View r3 = r1.j0
            android.graphics.Rect r5 = r1.L
            r3.getDrawingRect(r5)
            r1.offsetDescendantRectToMyCoords(r3, r5)
            int r3 = r1.h(r5)
            if (r3 == 0) goto L23
            r1.scrollBy(r2, r3)
        L23:
            r3 = 0
            r1.j0 = r3
            boolean r5 = r1.i0
            if (r5 != 0) goto L7c
            ie4 r5 = r1.w0
            if (r5 == 0) goto L3b
            int r5 = r1.getScrollX()
            ie4 r0 = r1.w0
            int r0 = r0.A
            r1.scrollTo(r5, r0)
            r1.w0 = r3
        L3b:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L56
            android.view.View r3 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r3 = r3.getMeasuredHeight()
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r5 = r5.bottomMargin
            int r3 = r3 + r5
            goto L57
        L56:
            r3 = r2
        L57:
            int r6 = r6 - r4
            int r4 = r1.getPaddingTop()
            int r6 = r6 - r4
            int r4 = r1.getPaddingBottom()
            int r6 = r6 - r4
            int r4 = r1.getScrollY()
            if (r6 >= r3) goto L73
            if (r4 >= 0) goto L6b
            goto L73
        L6b:
            int r2 = r6 + r4
            if (r2 <= r3) goto L72
            int r2 = r3 - r6
            goto L73
        L72:
            r2 = r4
        L73:
            if (r2 == r4) goto L7c
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L7c:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.i0 = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.m0
            if (r0 != 0) goto L8
            goto L58
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            goto L58
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r4 = r4.getPaddingRight()
            int r4 = r4 + r1
            int r1 = r0.leftMargin
            int r4 = r4 + r1
            int r1 = r0.rightMargin
            int r4 = r4 + r1
            int r0 = r0.width
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r5, r4, r0)
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r6.measure(r4, r5)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.j(r1)
            return r2
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            je4 r0 = r0.y0
            boolean r0 = r0.b(r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            je4 r0 = r6.y0
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r0.c(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.n(r5, r1, r2)
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
    public final void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L23
            goto L2d
        L23:
            int r2 = r3.getHeight()
            boolean r3 = r3.m(r0, r1, r2)
            if (r3 != 0) goto L2e
        L2d:
            return r1
        L2e:
            boolean r3 = r0.requestFocus(r4, r5)
            return r3
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ie4
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            ie4 r2 = (defpackage.ie4) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.w0 = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            ie4 r1 = new ie4
            r1.<init>(r0)
            int r2 = r2.getScrollY()
            r1.A = r2
            return r1
    }

    @Override // android.view.View
    public final void onScrollChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onScrollChanged(r1, r2, r3, r4)
            he4 r0 = r0.A0
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L2c
            if (r0 != r1) goto Lc
            goto L2c
        Lc:
            r2 = 0
            boolean r3 = r0.m(r1, r2, r4)
            if (r3 == 0) goto L2c
            android.graphics.Rect r3 = r0.L
            r1.getDrawingRect(r3)
            r0.offsetDescendantRectToMyCoords(r1, r3)
            int r1 = r0.h(r3)
            if (r1 == 0) goto L2c
            boolean r3 = r0.n0
            if (r3 == 0) goto L29
            r0.u(r2, r2, r1)
            return
        L29:
            r0.scrollBy(r2, r1)
        L2c:
            return
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
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
            r20 = this;
            r0 = r20
            r3 = r21
            android.view.VelocityTracker r1 = r0.l0
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.l0 = r1
        Le:
            int r1 = r3.getActionMasked()
            r2 = 0
            if (r1 != 0) goto L17
            r0.u0 = r2
        L17:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r3)
            int r4 = r0.u0
            float r4 = (float) r4
            r5 = 0
            r7.offsetLocation(r5, r4)
            je4 r4 = r0.y0
            r6 = 2
            r8 = 1
            if (r1 == 0) goto L1e5
            r9 = 0
            r10 = -1
            android.widget.EdgeEffect r11 = r0.d0
            android.widget.EdgeEffect r12 = r0.e0
            if (r1 == r8) goto L15b
            if (r1 == r6) goto La1
            r4 = 3
            if (r1 == r4) goto L62
            r2 = 5
            if (r1 == r2) goto L4f
            r2 = 6
            if (r1 == r2) goto L3d
            goto L217
        L3d:
            r20.o(r21)
            int r1 = r0.r0
            int r1 = r3.findPointerIndex(r1)
            float r1 = r3.getY(r1)
            int r1 = (int) r1
            r0.g0 = r1
            goto L217
        L4f:
            int r1 = r3.getActionIndex()
            float r2 = r3.getY(r1)
            int r2 = (int) r2
            r0.g0 = r2
            int r1 = r3.getPointerId(r1)
            r0.r0 = r1
            goto L217
        L62:
            boolean r1 = r0.k0
            if (r1 == 0) goto L89
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L89
            int r14 = r0.getScrollX()
            int r15 = r0.getScrollY()
            r18 = 0
            int r19 = r0.getScrollRange()
            android.widget.OverScroller r13 = r0.R
            r16 = 0
            r17 = 0
            boolean r1 = r13.springBack(r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L89
            r0.postInvalidateOnAnimation()
        L89:
            r0.r0 = r10
            r0.k0 = r2
            android.view.VelocityTracker r1 = r0.l0
            if (r1 == 0) goto L96
            r1.recycle()
            r0.l0 = r9
        L96:
            r0.w(r2)
            r11.onRelease()
            r12.onRelease()
            goto L217
        La1:
            int r1 = r0.r0
            int r1 = r3.findPointerIndex(r1)
            if (r1 != r10) goto Lc5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.r0
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L217
        Lc5:
            float r2 = r3.getY(r1)
            int r9 = (int) r2
            int r2 = r0.g0
            int r2 = r2 - r9
            float r4 = r3.getX(r1)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r2
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r6 = r6 / r10
            float r10 = defpackage.nw7.g0(r11)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto Lf9
            float r6 = -r6
            float r4 = defpackage.nw7.j0(r11, r6, r4)
            float r4 = -r4
            float r6 = defpackage.nw7.g0(r11)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf7
            r11.onRelease()
        Lf7:
            r5 = r4
            goto L114
        Lf9:
            float r10 = defpackage.nw7.g0(r12)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto L114
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r4
            float r4 = defpackage.nw7.j0(r12, r6, r10)
            float r6 = defpackage.nw7.g0(r12)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf7
            r12.onRelease()
            goto Lf7
        L114:
            int r4 = r0.getHeight()
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            if (r4 == 0) goto L123
            r0.invalidate()
        L123:
            int r2 = r2 - r4
            boolean r4 = r0.k0
            if (r4 != 0) goto L140
            int r4 = java.lang.Math.abs(r2)
            int r5 = r0.o0
            if (r4 <= r5) goto L140
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L139
            r4.requestDisallowInterceptTouchEvent(r8)
        L139:
            r0.k0 = r8
            if (r2 <= 0) goto L13f
            int r2 = r2 - r5
            goto L140
        L13f:
            int r2 = r2 + r5
        L140:
            boolean r4 = r0.k0
            if (r4 == 0) goto L217
            float r1 = r3.getX(r1)
            int r4 = (int) r1
            r5 = 0
            r6 = 0
            r1 = r2
            r2 = 1
            int r1 = r0.s(r1, r2, r3, r4, r5, r6)
            int r9 = r9 - r1
            r0.g0 = r9
            int r2 = r0.u0
            int r2 = r2 + r1
            r0.u0 = r2
            goto L217
        L15b:
            android.view.VelocityTracker r1 = r0.l0
            int r3 = r0.q0
            float r3 = (float) r3
            r6 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r6, r3)
            int r3 = r0.r0
            float r1 = r1.getYVelocity(r3)
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r6 = r0.p0
            if (r3 < r6) goto L1b1
            float r3 = defpackage.nw7.g0(r11)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L18b
            boolean r3 = r0.t(r11, r1)
            if (r3 == 0) goto L186
            r11.onAbsorb(r1)
            goto L1ce
        L186:
            int r1 = -r1
            r0.j(r1)
            goto L1ce
        L18b:
            float r3 = defpackage.nw7.g0(r12)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L1a2
            int r1 = -r1
            boolean r3 = r0.t(r12, r1)
            if (r3 == 0) goto L19e
            r12.onAbsorb(r1)
            goto L1ce
        L19e:
            r0.j(r1)
            goto L1ce
        L1a2:
            int r1 = -r1
            float r3 = (float) r1
            boolean r4 = r4.b(r5, r3)
            if (r4 != 0) goto L1ce
            r0.dispatchNestedFling(r5, r3, r8)
            r0.j(r1)
            goto L1ce
        L1b1:
            int r14 = r0.getScrollX()
            int r15 = r0.getScrollY()
            r18 = 0
            int r19 = r0.getScrollRange()
            android.widget.OverScroller r13 = r0.R
            r16 = 0
            r17 = 0
            boolean r1 = r13.springBack(r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L1ce
            r0.postInvalidateOnAnimation()
        L1ce:
            r0.r0 = r10
            r0.k0 = r2
            android.view.VelocityTracker r1 = r0.l0
            if (r1 == 0) goto L1db
            r1.recycle()
            r0.l0 = r9
        L1db:
            r0.w(r2)
            r11.onRelease()
            r12.onRelease()
            goto L217
        L1e5:
            int r1 = r0.getChildCount()
            if (r1 != 0) goto L1ec
            return r2
        L1ec:
            boolean r1 = r0.k0
            if (r1 == 0) goto L1f9
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L1f9
            r1.requestDisallowInterceptTouchEvent(r8)
        L1f9:
            android.widget.OverScroller r1 = r0.R
            boolean r5 = r1.isFinished()
            if (r5 != 0) goto L207
            r1.abortAnimation()
            r0.w(r8)
        L207:
            float r1 = r3.getY()
            int r1 = (int) r1
            int r3 = r3.getPointerId(r2)
            r0.g0 = r1
            r0.r0 = r3
            r4.g(r6, r2)
        L217:
            android.view.VelocityTracker r0 = r0.l0
            if (r0 == 0) goto L21e
            r0.addMovement(r7)
        L21e:
            r7.recycle()
            return r8
    }

    public final boolean p(int r10, int r11, int r12, int r13) {
            r9 = this;
            int r0 = r9.getOverScrollMode()
            super.computeHorizontalScrollRange()
            super.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            super.computeVerticalScrollExtent()
            r1 = 1
            int r12 = r12 + r10
            r10 = 0
            if (r11 <= 0) goto L18
        L15:
            r3 = r10
            r11 = r1
            goto L1d
        L18:
            if (r11 >= 0) goto L1b
            goto L15
        L1b:
            r3 = r11
            r11 = r10
        L1d:
            if (r12 <= r13) goto L22
            r4 = r13
        L20:
            r12 = r1
            goto L28
        L22:
            if (r12 >= 0) goto L26
            r4 = r10
            goto L20
        L26:
            r4 = r12
            r12 = r10
        L28:
            if (r12 == 0) goto L3e
            je4 r13 = r9.y0
            boolean r13 = r13.f(r1)
            if (r13 != 0) goto L3e
            r7 = 0
            int r8 = r9.getScrollRange()
            android.widget.OverScroller r2 = r9.R
            r5 = 0
            r6 = 0
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L3e:
            super.scrollTo(r3, r4)
            if (r11 != 0) goto L47
            if (r12 == 0) goto L46
            goto L47
        L46:
            return r10
        L47:
            return r1
    }

    public final void q(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.L
            if (r0 == 0) goto L3e
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r4.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L49
            int r0 = r0 - r2
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r4.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L49
            int r1 = r1 - r3
            r4.top = r1
            goto L49
        L3e:
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r4.top = r0
            if (r0 >= 0) goto L49
            r4.top = r1
        L49:
            int r0 = r4.top
            int r3 = r3 + r0
            r4.bottom = r3
            r5.r(r6, r0, r3)
            return
    }

    public final boolean r(int r19, int r20, int r21) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.s(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.h0
            if (r0 != 0) goto L17
            android.graphics.Rect r0 = r2.L
            r4.getDrawingRect(r0)
            r2.offsetDescendantRectToMyCoords(r4, r0)
            int r0 = r2.h(r0)
            if (r0 == 0) goto L19
            r1 = 0
            r2.scrollBy(r1, r0)
            goto L19
        L17:
            r2.j0 = r4
        L19:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            int r3 = r2.h(r4)
            r4 = 0
            if (r3 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 == 0) goto L2a
            if (r5 == 0) goto L27
            r2.scrollBy(r4, r3)
            return r0
        L27:
            r2.u(r4, r4, r3)
        L2a:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.l0
            if (r0 == 0) goto Lc
            r0.recycle()
            r0 = 0
            r1.l0 = r0
        Lc:
            super.requestDisallowInterceptTouchEvent(r2)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h0 = r0
            super.requestLayout()
            return
    }

    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r9 = r25
            je4 r10 = r0.y0
            r11 = 1
            if (r9 != r11) goto L11
            r3 = 2
            r10.g(r3, r9)
        L11:
            int[] r8 = r0.s0
            je4 r3 = r0.y0
            r4 = 0
            int[] r7 = r0.t0
            r5 = r21
            r6 = r9
            boolean r3 = r3.c(r4, r5, r6, r7, r8)
            int[] r12 = r0.s0
            int[] r4 = r0.t0
            r13 = 0
            if (r3 == 0) goto L2f
            r3 = r4[r11]
            int r3 = r21 - r3
            r5 = r12[r11]
            r14 = r3
            r15 = r5
            goto L32
        L2f:
            r14 = r21
            r15 = r13
        L32:
            int r3 = r0.getScrollY()
            int r5 = r0.getScrollRange()
            int r6 = r0.getOverScrollMode()
            if (r6 == 0) goto L48
            if (r6 != r11) goto L4d
            int r6 = r0.getScrollRange()
            if (r6 <= 0) goto L4d
        L48:
            if (r26 != 0) goto L4d
            r16 = r11
            goto L4f
        L4d:
            r16 = r13
        L4f:
            boolean r6 = r0.p(r14, r13, r3, r5)
            if (r6 == 0) goto L5e
            boolean r6 = r10.f(r9)
            if (r6 != 0) goto L5e
            r17 = r11
            goto L60
        L5e:
            r17 = r13
        L60:
            int r6 = r0.getScrollY()
            int r6 = r6 - r3
            if (r23 == 0) goto L7a
            if (r6 == 0) goto L7a
            l76 r7 = r0.getScrollFeedbackProvider()
            int r8 = r23.getDeviceId()
            int r10 = r23.getSource()
            k76 r7 = r7.a
            r7.onScrollProgress(r8, r10, r1, r6)
        L7a:
            int r7 = r14 - r6
            r4[r11] = r13
            r8 = r5
            r5 = r6
            r6 = 0
            r10 = r3
            je4 r3 = r0.y0
            r18 = r10
            r10 = r4
            r4 = 0
            r19 = r8
            int[] r8 = r0.s0
            r13 = r19
            r3.d(r4, r5, r6, r7, r8, r9, r10)
            r3 = r12[r11]
            int r15 = r15 + r3
            r3 = r10[r11]
            int r14 = r14 - r3
            int r3 = r18 + r14
            android.widget.EdgeEffect r4 = r0.e0
            android.widget.EdgeEffect r5 = r0.d0
            if (r3 >= 0) goto Ld1
            if (r16 == 0) goto Lcf
            int r3 = -r14
            float r3 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            defpackage.nw7.j0(r5, r3, r2)
            if (r23 == 0) goto Lc6
            l76 r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            k76 r2 = r2.a
            r2.onScrollLimit(r3, r6, r1, r11)
        Lc6:
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto Lcf
            r4.onRelease()
        Lcf:
            r7 = 0
            goto L108
        Ld1:
            if (r3 <= r13) goto Lcf
            if (r16 == 0) goto Lcf
            float r3 = (float) r14
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r2
            defpackage.nw7.j0(r4, r3, r6)
            if (r23 == 0) goto Lfe
            l76 r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            k76 r2 = r2.a
            r7 = 0
            r2.onScrollLimit(r3, r6, r1, r7)
            goto Lff
        Lfe:
            r7 = 0
        Lff:
            boolean r1 = r5.isFinished()
            if (r1 != 0) goto L108
            r5.onRelease()
        L108:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L118
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto L115
            goto L118
        L115:
            r13 = r17
            goto L11c
        L118:
            r0.postInvalidateOnAnimation()
            r13 = r7
        L11c:
            if (r13 == 0) goto L127
            if (r9 != 0) goto L127
            android.view.VelocityTracker r1 = r0.l0
            if (r1 == 0) goto L127
            r1.clear()
        L127:
            if (r9 != r11) goto L132
            r0.w(r9)
            r5.onRelease()
            r4.onRelease()
        L132:
            return r15
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L6a
            r0 = 0
            android.view.View r1 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r7.getWidth()
            int r4 = r7.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r7.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r1.getWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1.getHeight()
            int r6 = r2.topMargin
            int r1 = r1 + r6
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            if (r3 >= r4) goto L4d
            if (r8 >= 0) goto L46
            goto L4d
        L46:
            int r2 = r3 + r8
            if (r2 <= r4) goto L4e
            int r8 = r4 - r3
            goto L4e
        L4d:
            r8 = r0
        L4e:
            if (r5 >= r1) goto L5a
            if (r9 >= 0) goto L53
            goto L5a
        L53:
            int r0 = r5 + r9
            if (r0 <= r1) goto L5b
            int r9 = r1 - r5
            goto L5b
        L5a:
            r9 = r0
        L5b:
            int r0 = r7.getScrollX()
            if (r8 != r0) goto L67
            int r0 = r7.getScrollY()
            if (r9 == r0) goto L6a
        L67:
            super.scrollTo(r8, r9)
        L6a:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.m0
            if (r2 == r0) goto L9
            r1.m0 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r3) {
            r2 = this;
            je4 r2 = r2.y0
            boolean r0 = r2.d
            if (r0 == 0) goto Ld
            android.view.ViewGroup r0 = r2.c
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.stopNestedScroll()
        Ld:
            r2.d = r3
            return
    }

    public void setOnScrollChangeListener(defpackage.he4 r1) {
            r0 = this;
            r0.A0 = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.n0 = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            je4 r1 = r1.y0
            boolean r1 = r1.g(r2, r0)
            return r1
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.w(r0)
            return
    }

    public final boolean t(android.widget.EdgeEffect r10, int r11) {
            r9 = this;
            r0 = 1
            if (r11 <= 0) goto L4
            return r0
        L4:
            float r10 = defpackage.nw7.g0(r10)
            int r1 = r9.getHeight()
            float r1 = (float) r1
            float r10 = r10 * r1
            int r11 = -r11
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r11 = r11 * r1
            r1 = 1014350479(0x3c75c28f, float:0.015)
            float r9 = r9.A
            float r9 = r9 * r1
            float r11 = r11 / r9
            double r1 = (double) r11
            double r1 = java.lang.Math.log(r1)
            float r11 = androidx.core.widget.NestedScrollView.C0
            double r3 = (double) r11
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r3 - r5
            double r7 = (double) r9
            double r3 = r3 / r5
            double r3 = r3 * r1
            double r1 = java.lang.Math.exp(r3)
            double r1 = r1 * r7
            float r9 = (float) r1
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L39
            return r0
        L39:
            r9 = 0
            return r9
    }

    public final void u(int r10, boolean r11, int r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r9.B
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L6e
            r10 = 0
            android.view.View r0 = r9.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r9.getHeight()
            int r3 = r9.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r9.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r9.getScrollY()
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r10, r0)
            int r12 = r12 + r5
            int r12 = java.lang.Math.min(r12, r0)
            int r10 = java.lang.Math.max(r10, r12)
            int r7 = r10 - r5
            int r4 = r9.getScrollX()
            r6 = 0
            android.widget.OverScroller r3 = r9.R
            r8 = 250(0xfa, float:3.5E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            if (r11 == 0) goto L61
            r10 = 2
            je4 r11 = r9.y0
            r11.g(r10, r1)
            goto L64
        L61:
            r9.w(r1)
        L64:
            int r10 = r9.getScrollY()
            r9.v0 = r10
            r9.postInvalidateOnAnimation()
            goto L7f
        L6e:
            android.widget.OverScroller r11 = r9.R
            boolean r0 = r11.isFinished()
            if (r0 != 0) goto L7c
            r11.abortAnimation()
            r9.w(r1)
        L7c:
            r9.scrollBy(r10, r12)
        L7f:
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.B = r10
            return
    }

    public final boolean v(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.d0
            float r1 = defpackage.nw7.g0(r0)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r1 = r1 / r4
            defpackage.nw7.j0(r0, r2, r1)
            r0 = r3
            goto L1c
        L1b:
            r0 = 0
        L1c:
            android.widget.EdgeEffect r1 = r5.e0
            float r4 = defpackage.nw7.g0(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L37
            float r6 = r6.getX()
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r6 = r6 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            defpackage.nw7.j0(r1, r2, r5)
            return r3
        L37:
            return r0
    }

    public final void w(int r1) {
            r0 = this;
            je4 r0 = r0.y0
            r0.h(r1)
            return
    }
}
