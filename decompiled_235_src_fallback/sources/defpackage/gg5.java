package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg5  reason: default package */
/* loaded from: classes.dex */
public abstract class gg5 {
    public defpackage.dk0 a;
    public androidx.recyclerview.widget.RecyclerView b;
    public final defpackage.rr6 c;
    public final defpackage.rr6 d;
    public defpackage.iv3 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public gg5() {
            r3 = this;
            r3.<init>()
            eg5 r0 = new eg5
            r1 = 0
            r0.<init>(r3, r1)
            eg5 r1 = new eg5
            r2 = 1
            r1.<init>(r3, r2)
            rr6 r2 = new rr6
            r2.<init>(r0)
            r3.c = r2
            rr6 r0 = new rr6
            r0.<init>(r1)
            r3.d = r0
            r0 = 0
            r3.f = r0
            r3.g = r0
            r0 = 1
            r3.h = r0
            r3.i = r0
            return
    }

    public static int A(android.view.View r2) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            android.graphics.Rect r0 = r0.b
            int r2 = r2.getMeasuredWidth()
            int r1 = r0.left
            int r2 = r2 + r1
            int r0 = r0.right
            int r2 = r2 + r0
            return r2
    }

    public static int G(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            wg5 r0 = r0.a
            int r0 = r0.b()
            return r0
    }

    public static defpackage.fg5 H(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            fg5 r0 = new fg5
            r0.<init>()
            int[] r1 = defpackage.j75.a
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
            r3 = 0
            r4 = 1
            int r5 = r2.getInt(r3, r4)
            r0.a = r5
            r5 = 10
            int r4 = r2.getInt(r5, r4)
            r0.b = r4
            r4 = 9
            boolean r4 = r2.getBoolean(r4, r3)
            r0.c = r4
            r4 = 11
            boolean r3 = r2.getBoolean(r4, r3)
            r0.d = r3
            r2.recycle()
            return r0
    }

    public static boolean M(int r3, int r4, int r5) {
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 == r5) goto Le
            return r1
        Le:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r0 == r5) goto L1f
            if (r0 == 0) goto L1e
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 == r5) goto L1a
            return r1
        L1a:
            if (r4 != r3) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            return r2
        L1f:
            if (r4 < r3) goto L22
            return r2
        L22:
            return r1
    }

    public static void N(android.view.View r3, int r4, int r5, int r6, int r7) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            android.graphics.Rect r1 = r0.b
            int r2 = r1.left
            int r4 = r4 + r2
            int r2 = r0.leftMargin
            int r4 = r4 + r2
            int r2 = r1.top
            int r5 = r5 + r2
            int r2 = r0.topMargin
            int r5 = r5 + r2
            int r2 = r1.right
            int r6 = r6 - r2
            int r2 = r0.rightMargin
            int r6 = r6 - r2
            int r1 = r1.bottom
            int r7 = r7 - r1
            int r0 = r0.bottomMargin
            int r7 = r7 - r0
            r3.layout(r4, r5, r6, r7)
            return
    }

    public static int g(int r2, int r3, int r4) {
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L15
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            int r2 = java.lang.Math.max(r3, r4)
        L14:
            return r2
        L15:
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
    }

    public static int z(android.view.View r2) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            android.graphics.Rect r0 = r0.b
            int r2 = r2.getMeasuredHeight()
            int r1 = r0.top
            int r2 = r2 + r1
            int r0 = r0.bottom
            int r2 = r2 + r0
            return r2
    }

    public abstract void A0(androidx.recyclerview.widget.RecyclerView r1, int r2);

    public final int B() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L9
            wf5 r0 = r0.getAdapter()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            int r0 = r0.a()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final void B0(defpackage.iv3 r4) {
            r3 = this;
            iv3 r0 = r3.e
            if (r0 == 0) goto Ld
            if (r4 == r0) goto Ld
            boolean r1 = r0.e
            if (r1 == 0) goto Ld
            r0.i()
        Ld:
            r3.e = r4
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            vg5 r1 = r0.a1
            androidx.recyclerview.widget.RecyclerView r2 = r1.Z
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.L
            r1.abortAnimation()
            boolean r1 = r4.h
            if (r1 == 0) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An instance of "
            r1.<init>(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " was started more than once. Each instance of"
            r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " is intended to only be used once. You should create a new instance for each use."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
        L51:
            r4.b = r0
            r4.c = r3
            int r3 = r4.a
            r1 = -1
            if (r3 == r1) goto L75
            sg5 r1 = r0.d1
            r1.a = r3
            r1 = 1
            r4.e = r1
            r4.d = r1
            gg5 r0 = r0.m0
            android.view.View r3 = r0.q(r3)
            r4.f = r3
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            vg5 r3 = r3.a1
            r3.b()
            r4.h = r1
            return
        L75:
            java.lang.String r3 = "Invalid target position"
            defpackage.i.h(r3)
            return
    }

    public final int C() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingBottom()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean C0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final int D() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingLeft()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int E() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingRight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int F() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingTop()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int I(defpackage.mg5 r1, defpackage.sg5 r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 == 0) goto L18
            wf5 r1 = r1.l0
            if (r1 != 0) goto L9
            goto L18
        L9:
            boolean r1 = r0.e()
            if (r1 == 0) goto L18
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            wf5 r0 = r0.l0
            int r0 = r0.a()
            return r0
        L18:
            r0 = 1
            return r0
    }

    public final void J(android.view.View r6, android.graphics.Rect r7) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            android.graphics.Rect r0 = r0.b
            int r1 = r0.left
            int r1 = -r1
            int r2 = r0.top
            int r2 = -r2
            int r3 = r6.getWidth()
            int r4 = r0.right
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r0 = r0.bottom
            int r4 = r4 + r0
            r7.set(r1, r2, r3, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            if (r0 == 0) goto L5c
            android.graphics.Matrix r0 = r6.getMatrix()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.RecyclerView r5 = r5.b
            android.graphics.RectF r5 = r5.k0
            r5.set(r7)
            r0.mapRect(r5)
            float r0 = r5.left
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            float r1 = r5.top
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            float r2 = r5.right
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r5 = r5.bottom
            double r3 = (double) r5
            double r3 = java.lang.Math.ceil(r3)
            int r5 = (int) r3
            r7.set(r0, r1, r2, r5)
        L5c:
            int r5 = r6.getLeft()
            int r6 = r6.getTop()
            r7.offset(r5, r6)
            return
    }

    public abstract boolean K();

    public boolean L() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void O(int r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            if (r3 == 0) goto L19
            dk0 r0 = r3.e0
            int r0 = r0.q()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            dk0 r2 = r3.e0
            android.view.View r2 = r2.p(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    public void P(int r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            if (r3 == 0) goto L19
            dk0 r0 = r3.e0
            int r0 = r0.q()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            dk0 r2 = r3.e0
            android.view.View r2 = r2.p(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    public void Q() {
            r0 = this;
            return
    }

    public void R(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public abstract void S(androidx.recyclerview.widget.RecyclerView r1);

    public abstract android.view.View T(android.view.View r1, int r2, defpackage.mg5 r3, defpackage.sg5 r4);

    public void U(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            mg5 r1 = r0.L
            if (r4 != 0) goto L7
            goto L39
        L7:
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            r4.setScrollable(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            wf5 r3 = r3.l0
            if (r3 == 0) goto L39
            int r3 = r3.a()
            r4.setItemCount(r3)
        L39:
            return
    }

    public void V(defpackage.mg5 r5, defpackage.sg5 r6, defpackage.v2 r7) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = 1
            if (r0 != 0) goto L14
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L1f
        L14:
            r0 = 8192(0x2000, float:1.148E-41)
            r7.a(r0)
            r7.l(r3)
            r7.h(r2, r3)
        L1f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != 0) goto L2f
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L3a
        L2f:
            r0 = 4096(0x1000, float:5.74E-42)
            r7.a(r0)
            r7.l(r3)
            r7.h(r2, r3)
        L3a:
            int r0 = r4.I(r5, r6)
            int r4 = r4.x(r5, r6)
            r5 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r4 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r0, r4, r5, r5)
            android.view.accessibility.AccessibilityNodeInfo r5 = r7.a
            r5.setCollectionInfo(r4)
            return
    }

    public void W(defpackage.mg5 r1, defpackage.sg5 r2, android.view.View r3, defpackage.v2 r4) {
            r0 = this;
            boolean r1 = r0.e()
            r2 = 0
            if (r1 == 0) goto Lc
            int r1 = G(r3)
            goto Ld
        Lc:
            r1 = r2
        Ld:
            boolean r0 = r0.d()
            if (r0 == 0) goto L18
            int r0 = G(r3)
            goto L19
        L18:
            r0 = r2
        L19:
            r3 = 1
            u2 r0 = defpackage.u2.b(r2, r1, r3, r0, r3)
            r4.k(r0)
            return
    }

    public final void X(android.view.View r3, defpackage.v2 r4) {
            r2 = this;
            wg5 r0 = androidx.recyclerview.widget.RecyclerView.N(r3)
            if (r0 == 0) goto L23
            boolean r1 = r0.h()
            if (r1 != 0) goto L23
            dk0 r1 = r2.a
            android.view.View r0 = r0.a
            java.lang.Object r1 = r1.B
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            androidx.recyclerview.widget.RecyclerView r0 = r2.b
            mg5 r1 = r0.L
            sg5 r0 = r0.d1
            r2.W(r1, r0, r3, r4)
        L23:
            return
    }

    public void Y(int r1, int r2) {
            r0 = this;
            return
    }

    public void Z() {
            r0 = this;
            return
    }

    public void a0(int r1, int r2) {
            r0 = this;
            return
    }

    public final void b(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            wg5 r0 = androidx.recyclerview.widget.RecyclerView.N(r9)
            r1 = 1
            if (r11 != 0) goto L16
            boolean r11 = r0.h()
            if (r11 == 0) goto Le
            goto L16
        Le:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            rr6 r11 = r11.f0
            r11.m(r0)
            goto L32
        L16:
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            rr6 r11 = r11.f0
            java.lang.Object r11 = r11.B
            ci6 r11 = (defpackage.ci6) r11
            java.lang.Object r2 = r11.get(r0)
            lo7 r2 = (defpackage.lo7) r2
            if (r2 != 0) goto L2d
            lo7 r2 = defpackage.lo7.a()
            r11.put(r0, r2)
        L2d:
            int r11 = r2.a
            r11 = r11 | r1
            r2.a = r11
        L32:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            hg5 r11 = (defpackage.hg5) r11
            boolean r2 = r0.p()
            java.lang.String r3 = "RecyclerView"
            r4 = 0
            if (r2 != 0) goto L139
            boolean r2 = r0.i()
            if (r2 == 0) goto L49
            goto L139
        L49:
            android.view.ViewParent r2 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            dk0 r6 = r8.a
            r7 = -1
            if (r2 != r5) goto L10d
            java.lang.Object r2 = r6.X
            kk r2 = (defpackage.kk) r2
            java.lang.Object r5 = r6.R
            uf5 r5 = (defpackage.uf5) r5
            androidx.recyclerview.widget.RecyclerView r5 = r5.A
            int r5 = r5.indexOfChild(r9)
            if (r5 != r7) goto L65
            goto L6b
        L65:
            boolean r6 = r2.d(r5)
            if (r6 == 0) goto L6d
        L6b:
            r5 = r7
            goto L72
        L6d:
            int r2 = r2.b(r5)
            int r5 = r5 - r2
        L72:
            if (r10 != r7) goto L7a
            dk0 r10 = r8.a
            int r10 = r10.q()
        L7a:
            if (r5 == r7) goto Lea
            if (r5 == r10) goto L154
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            gg5 r8 = r8.m0
            android.view.View r9 = r8.u(r5)
            if (r9 == 0) goto Lcd
            r8.u(r5)
            dk0 r2 = r8.a
            r2.k(r5)
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            wg5 r5 = androidx.recyclerview.widget.RecyclerView.N(r9)
            boolean r6 = r5.h()
            androidx.recyclerview.widget.RecyclerView r7 = r8.b
            if (r6 == 0) goto Lbd
            rr6 r6 = r7.f0
            java.lang.Object r6 = r6.B
            ci6 r6 = (defpackage.ci6) r6
            java.lang.Object r7 = r6.get(r5)
            lo7 r7 = (defpackage.lo7) r7
            if (r7 != 0) goto Lb7
            lo7 r7 = defpackage.lo7.a()
            r6.put(r5, r7)
        Lb7:
            int r6 = r7.a
            r1 = r1 | r6
            r7.a = r1
            goto Lc2
        Lbd:
            rr6 r1 = r7.f0
            r1.m(r5)
        Lc2:
            dk0 r8 = r8.a
            boolean r1 = r5.h()
            r8.h(r9, r10, r2, r1)
            goto L154
        Lcd:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Cannot move a child from non-existing index:"
            r10.<init>(r11)
            r10.append(r5)
            java.lang.String r8 = r8.toString()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        Lea:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            androidx.recyclerview.widget.RecyclerView r11 = r8.b
            int r9 = r11.indexOfChild(r9)
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            java.lang.String r8 = r8.C()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8)
            throw r10
        L10d:
            r6.g(r9, r10, r4)
            r11.c = r1
            iv3 r8 = r8.e
            if (r8 == 0) goto L154
            boolean r10 = r8.e
            if (r10 == 0) goto L154
            androidx.recyclerview.widget.RecyclerView r10 = r8.b
            r10.getClass()
            wg5 r10 = androidx.recyclerview.widget.RecyclerView.N(r9)
            if (r10 == 0) goto L129
            int r7 = r10.b()
        L129:
            int r10 = r8.a
            if (r7 != r10) goto L154
            r8.f = r9
            boolean r8 = androidx.recyclerview.widget.RecyclerView.z1
            if (r8 == 0) goto L154
            java.lang.String r8 = "smooth scroll target view has been attached"
            android.util.Log.d(r3, r8)
            goto L154
        L139:
            boolean r1 = r0.i()
            if (r1 == 0) goto L145
            mg5 r1 = r0.n
            r1.p(r0)
            goto L14b
        L145:
            int r1 = r0.j
            r1 = r1 & (-33)
            r0.j = r1
        L14b:
            dk0 r8 = r8.a
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            r8.h(r9, r10, r1, r4)
        L154:
            boolean r8 = r11.d
            if (r8 == 0) goto L176
            boolean r8 = androidx.recyclerview.widget.RecyclerView.z1
            if (r8 == 0) goto L16f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "consuming pending invalidate on child "
            r8.<init>(r9)
            wg5 r9 = r11.a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L16f:
            android.view.View r8 = r0.a
            r8.invalidate()
            r11.d = r4
        L176:
            return
    }

    public void b0(int r1, int r2) {
            r0 = this;
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L7
            r0.k(r1)
        L7:
            return
    }

    public void c0(int r1, int r2) {
            r0 = this;
            return
    }

    public abstract boolean d();

    public abstract void d0(defpackage.mg5 r1, defpackage.sg5 r2);

    public abstract boolean e();

    public abstract void e0(defpackage.sg5 r1);

    public boolean f(defpackage.hg5 r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    public void f0(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    public android.os.Parcelable g0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void h(int r1, int r2, defpackage.sg5 r3, defpackage.ls0 r4) {
            r0 = this;
            return
    }

    public void h0(int r1) {
            r0 = this;
            return
    }

    public void i(int r1, defpackage.ls0 r2) {
            r0 = this;
            return
    }

    public boolean i0(int r10, android.os.Bundle r11) {
            r9 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r9.b
            mg5 r0 = r0.L
            int r0 = r9.o
            int r1 = r9.n
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            androidx.recyclerview.widget.RecyclerView r3 = r9.b
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView r3 = r9.b
            boolean r3 = r3.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L29
            int r0 = r2.height()
            int r1 = r2.width()
        L29:
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 1
            r5 = 0
            if (r10 == r3) goto L62
            if (r10 == r2) goto L36
            r0 = r5
            r1 = r0
            goto L88
        L36:
            androidx.recyclerview.widget.RecyclerView r6 = r9.b
            r7 = -1
            boolean r6 = r6.canScrollVertically(r7)
            if (r6 == 0) goto L4b
            int r6 = r9.F()
            int r0 = r0 - r6
            int r6 = r9.C()
            int r0 = r0 - r6
            int r0 = -r0
            goto L4c
        L4b:
            r0 = r5
        L4c:
            androidx.recyclerview.widget.RecyclerView r6 = r9.b
            boolean r6 = r6.canScrollHorizontally(r7)
            if (r6 == 0) goto L60
            int r6 = r9.D()
            int r1 = r1 - r6
            int r6 = r9.E()
            int r1 = r1 - r6
            int r1 = -r1
            goto L88
        L60:
            r1 = r5
            goto L88
        L62:
            androidx.recyclerview.widget.RecyclerView r6 = r9.b
            boolean r6 = r6.canScrollVertically(r4)
            if (r6 == 0) goto L75
            int r6 = r9.F()
            int r0 = r0 - r6
            int r6 = r9.C()
            int r0 = r0 - r6
            goto L76
        L75:
            r0 = r5
        L76:
            androidx.recyclerview.widget.RecyclerView r6 = r9.b
            boolean r6 = r6.canScrollHorizontally(r4)
            if (r6 == 0) goto L60
            int r6 = r9.D()
            int r1 = r1 - r6
            int r6 = r9.E()
            int r1 = r1 - r6
        L88:
            if (r0 != 0) goto L8d
            if (r1 != 0) goto L8d
            goto Lc9
        L8d:
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto Lba
            java.lang.String r8 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"
            float r11 = r11.getFloat(r8, r7)
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lbb
            boolean r9 = androidx.recyclerview.widget.RecyclerView.y1
            if (r9 != 0) goto La1
            goto Lc9
        La1:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r11 = ")"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lba:
            r11 = r7
        Lbb:
            r8 = 2139095040(0x7f800000, float:Infinity)
            int r8 = java.lang.Float.compare(r11, r8)
            if (r8 != 0) goto Ldc
            androidx.recyclerview.widget.RecyclerView r9 = r9.b
            wf5 r11 = r9.l0
            if (r11 != 0) goto Lca
        Lc9:
            return r5
        Lca:
            if (r10 == r3) goto Ld3
            if (r10 == r2) goto Lcf
            return r4
        Lcf:
            r9.k0(r5)
            return r4
        Ld3:
            int r10 = r11.a()
            int r10 = r10 - r4
            r9.k0(r10)
            return r4
        Ldc:
            int r10 = java.lang.Float.compare(r7, r11)
            if (r10 == 0) goto Lee
            int r10 = java.lang.Float.compare(r6, r11)
            if (r10 == 0) goto Lee
            float r10 = (float) r1
            float r10 = r10 * r11
            int r1 = (int) r10
            float r10 = (float) r0
            float r10 = r10 * r11
            int r0 = (int) r10
        Lee:
            androidx.recyclerview.widget.RecyclerView r9 = r9.b
            r9.j0(r1, r4, r0)
            return r4
    }

    public abstract int j(defpackage.sg5 r1);

    public final void j0(defpackage.mg5 r3) {
            r2 = this;
            int r0 = r2.v()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L23
            android.view.View r1 = r2.u(r0)
            wg5 r1 = androidx.recyclerview.widget.RecyclerView.N(r1)
            boolean r1 = r1.o()
            if (r1 != 0) goto L20
            android.view.View r1 = r2.u(r0)
            r2.m0(r0)
            r3.l(r1)
        L20:
            int r0 = r0 + (-1)
            goto L6
        L23:
            return
    }

    public abstract int k(defpackage.sg5 r1);

    public final void k0(defpackage.mg5 r7) {
            r6 = this;
            java.lang.Object r0 = r7.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r1 = r0 + (-1)
        La:
            java.lang.Object r2 = r7.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r1 < 0) goto L54
            java.lang.Object r2 = r2.get(r1)
            wg5 r2 = (defpackage.wg5) r2
            android.view.View r2 = r2.a
            wg5 r3 = androidx.recyclerview.widget.RecyclerView.N(r2)
            boolean r4 = r3.o()
            if (r4 == 0) goto L23
            goto L51
        L23:
            r4 = 0
            r3.n(r4)
            boolean r5 = r3.j()
            if (r5 == 0) goto L32
            androidx.recyclerview.widget.RecyclerView r5 = r6.b
            r5.removeDetachedView(r2, r4)
        L32:
            androidx.recyclerview.widget.RecyclerView r5 = r6.b
            cg5 r5 = r5.L0
            if (r5 == 0) goto L3b
            r5.d(r3)
        L3b:
            r5 = 1
            r3.n(r5)
            wg5 r2 = androidx.recyclerview.widget.RecyclerView.N(r2)
            r3 = 0
            r2.n = r3
            r2.o = r4
            int r3 = r2.j
            r3 = r3 & (-33)
            r2.j = r3
            r7.m(r2)
        L51:
            int r1 = r1 + (-1)
            goto La
        L54:
            r2.clear()
            java.lang.Object r7 = r7.d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L60
            r7.clear()
        L60:
            if (r0 <= 0) goto L67
            androidx.recyclerview.widget.RecyclerView r6 = r6.b
            r6.invalidate()
        L67:
            return
    }

    public abstract int l(defpackage.sg5 r1);

    public final void l0(android.view.View r6, defpackage.mg5 r7) {
            r5 = this;
            dk0 r5 = r5.a
            java.lang.Object r0 = r5.R
            uf5 r0 = (defpackage.uf5) r0
            int r1 = r5.L
            r2 = 1
            if (r1 == r2) goto L44
            r3 = 2
            if (r1 == r3) goto L3e
            r1 = 0
            r3 = 0
            r5.L = r2     // Catch: java.lang.Throwable -> L2f
            r5.Y = r6     // Catch: java.lang.Throwable -> L2f
            androidx.recyclerview.widget.RecyclerView r2 = r0.A     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.indexOfChild(r6)     // Catch: java.lang.Throwable -> L2f
            if (r2 >= 0) goto L21
        L1c:
            r5.L = r3
            r5.Y = r1
            goto L35
        L21:
            java.lang.Object r4 = r5.X     // Catch: java.lang.Throwable -> L2f
            kk r4 = (defpackage.kk) r4     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.h(r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            r5.z(r6)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r6 = move-exception
            goto L39
        L31:
            r0.j(r2)     // Catch: java.lang.Throwable -> L2f
            goto L1c
        L35:
            r7.l(r6)
            return
        L39:
            r5.L = r3
            r5.Y = r1
            throw r6
        L3e:
            java.lang.String r5 = "Cannot call removeView(At) within removeViewIfHidden"
            defpackage.i.m(r5)
            return
        L44:
            java.lang.String r5 = "Cannot call removeView(At) within removeView(At)"
            defpackage.i.m(r5)
            return
    }

    public abstract int m(defpackage.sg5 r1);

    public final void m0(int r6) {
            r5 = this;
            android.view.View r0 = r5.u(r6)
            if (r0 == 0) goto L53
            dk0 r5 = r5.a
            java.lang.Object r0 = r5.R
            uf5 r0 = (defpackage.uf5) r0
            int r1 = r5.L
            r2 = 1
            if (r1 == r2) goto L4e
            r3 = 2
            if (r1 == r3) goto L48
            r1 = 0
            r3 = 0
            int r6 = r5.r(r6)     // Catch: java.lang.Throwable -> L39
            androidx.recyclerview.widget.RecyclerView r4 = r0.A     // Catch: java.lang.Throwable -> L39
            android.view.View r4 = r4.getChildAt(r6)     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L27
            r5.L = r3
            r5.Y = r1
            return
        L27:
            r5.L = r2     // Catch: java.lang.Throwable -> L39
            r5.Y = r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r5.X     // Catch: java.lang.Throwable -> L39
            kk r2 = (defpackage.kk) r2     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.h(r6)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3b
            r5.z(r4)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r6 = move-exception
            goto L43
        L3b:
            r0.j(r6)     // Catch: java.lang.Throwable -> L39
            r5.L = r3
            r5.Y = r1
            return
        L43:
            r5.L = r3
            r5.Y = r1
            throw r6
        L48:
            java.lang.String r5 = "Cannot call removeView(At) within removeViewIfHidden"
            defpackage.i.m(r5)
            return
        L4e:
            java.lang.String r5 = "Cannot call removeView(At) within removeView(At)"
            defpackage.i.m(r5)
        L53:
            return
    }

    public abstract int n(defpackage.sg5 r1);

    public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            r8 = this;
            int r0 = r8.D()
            int r1 = r8.F()
            int r2 = r8.n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.D()
            int r2 = r8.F()
            int r3 = r8.n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.i0
            r8.y(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.j0(r11, r0, r10)
            return r7
    }

    public abstract int o(defpackage.sg5 r1);

    public final void o0() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            if (r0 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public final void p(defpackage.mg5 r5) {
            r4 = this;
            int r0 = r4.v()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L5e
            android.view.View r1 = r4.u(r0)
            wg5 r2 = androidx.recyclerview.widget.RecyclerView.N(r1)
            boolean r3 = r2.o()
            if (r3 == 0) goto L2e
            boolean r1 = androidx.recyclerview.widget.RecyclerView.z1
            if (r1 == 0) goto L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "ignoring view "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
            goto L5b
        L2e:
            boolean r3 = r2.f()
            if (r3 == 0) goto L49
            boolean r3 = r2.h()
            if (r3 != 0) goto L49
            androidx.recyclerview.widget.RecyclerView r3 = r4.b
            wf5 r3 = r3.l0
            boolean r3 = r3.b
            if (r3 != 0) goto L49
            r4.m0(r0)
            r5.m(r2)
            goto L5b
        L49:
            r4.u(r0)
            dk0 r3 = r4.a
            r3.k(r0)
            r5.n(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.b
            rr6 r1 = r1.f0
            r1.m(r2)
        L5b:
            int r0 = r0 + (-1)
            goto L6
        L5e:
            return
    }

    public abstract int p0(int r1, defpackage.mg5 r2, defpackage.sg5 r3);

    public android.view.View q(int r6) {
            r5 = this;
            int r0 = r5.v()
            r1 = 0
        L5:
            if (r1 >= r0) goto L30
            android.view.View r2 = r5.u(r1)
            wg5 r3 = androidx.recyclerview.widget.RecyclerView.N(r2)
            if (r3 != 0) goto L12
            goto L2d
        L12:
            int r4 = r3.b()
            if (r4 != r6) goto L2d
            boolean r4 = r3.o()
            if (r4 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r4 = r5.b
            sg5 r4 = r4.d1
            boolean r4 = r4.g
            if (r4 != 0) goto L2c
            boolean r3 = r3.h()
            if (r3 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r1 = r1 + 1
            goto L5
        L30:
            r5 = 0
            return r5
    }

    public abstract void q0(int r1);

    public abstract defpackage.hg5 r();

    public abstract int r0(int r1, defpackage.mg5 r2, defpackage.sg5 r3);

    public defpackage.hg5 s(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            hg5 r0 = new hg5
            r0.<init>(r1, r2)
            return r0
    }

    public final void s0(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            int r0 = r3.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r3 = r3.getHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r2.t0(r0, r3)
            return
    }

    public defpackage.hg5 t(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.hg5
            if (r0 == 0) goto Lc
            hg5 r0 = new hg5
            hg5 r1 = (defpackage.hg5) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            hg5 r0 = new hg5
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            hg5 r0 = new hg5
            r0.<init>(r1)
            return r0
    }

    public final void t0(int r2, int r3) {
            r1 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r2)
            r1.n = r0
            int r2 = android.view.View.MeasureSpec.getMode(r2)
            r1.l = r2
            r0 = 0
            if (r2 != 0) goto L15
            boolean r2 = androidx.recyclerview.widget.RecyclerView.C1
            if (r2 != 0) goto L15
            r1.n = r0
        L15:
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            r1.o = r2
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            r1.m = r2
            if (r2 != 0) goto L29
            boolean r2 = androidx.recyclerview.widget.RecyclerView.C1
            if (r2 != 0) goto L29
            r1.o = r0
        L29:
            return
    }

    public final android.view.View u(int r1) {
            r0 = this;
            dk0 r0 = r0.a
            if (r0 == 0) goto L9
            android.view.View r0 = r0.p(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void u0(android.graphics.Rect r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.width()
            int r1 = r3.D()
            int r1 = r1 + r0
            int r0 = r3.E()
            int r0 = r0 + r1
            int r4 = r4.height()
            int r1 = r3.F()
            int r1 = r1 + r4
            int r4 = r3.C()
            int r4 = r4 + r1
            androidx.recyclerview.widget.RecyclerView r1 = r3.b
            java.util.WeakHashMap r2 = defpackage.ao7.a
            int r1 = r1.getMinimumWidth()
            int r5 = g(r5, r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.b
            int r0 = r0.getMinimumHeight()
            int r4 = g(r6, r4, r0)
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            androidx.recyclerview.widget.RecyclerView.g(r3, r5, r4)
            return
    }

    public final int v() {
            r0 = this;
            dk0 r0 = r0.a
            if (r0 == 0) goto L9
            int r0 = r0.q()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void v0(int r9, int r10) {
            r8 = this;
            int r0 = r8.v()
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            r8.q(r9, r10)
            return
        Lc:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = r2
            r5 = r3
            r2 = r1
            r3 = r4
        L16:
            if (r5 >= r0) goto L3a
            android.view.View r6 = r8.u(r5)
            androidx.recyclerview.widget.RecyclerView r7 = r8.b
            android.graphics.Rect r7 = r7.i0
            r8.y(r6, r7)
            int r6 = r7.left
            if (r6 >= r3) goto L28
            r3 = r6
        L28:
            int r6 = r7.right
            if (r6 <= r1) goto L2d
            r1 = r6
        L2d:
            int r6 = r7.top
            if (r6 >= r4) goto L32
            r4 = r6
        L32:
            int r6 = r7.bottom
            if (r6 <= r2) goto L37
            r2 = r6
        L37:
            int r5 = r5 + 1
            goto L16
        L3a:
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            android.graphics.Rect r0 = r0.i0
            r0.set(r3, r4, r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            android.graphics.Rect r0 = r0.i0
            r8.u0(r0, r9, r10)
            return
    }

    public final void w0(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            r2 = 0
            r1.b = r2
            r1.a = r2
            r2 = 0
            r1.n = r2
            r1.o = r2
            goto L1f
        Ld:
            r1.b = r2
            dk0 r0 = r2.e0
            r1.a = r0
            int r0 = r2.getWidth()
            r1.n = r0
            int r2 = r2.getHeight()
            r1.o = r2
        L1f:
            r2 = 1073741824(0x40000000, float:2.0)
            r1.l = r2
            r1.m = r2
            return
    }

    public int x(defpackage.mg5 r1, defpackage.sg5 r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r0.b
            if (r1 == 0) goto L18
            wf5 r1 = r1.l0
            if (r1 != 0) goto L9
            goto L18
        L9:
            boolean r1 = r0.d()
            if (r1 == 0) goto L18
            androidx.recyclerview.widget.RecyclerView r0 = r0.b
            wf5 r0 = r0.l0
            int r0 = r0.a()
            return r0
        L18:
            r0 = 1
            return r0
    }

    public final boolean x0(android.view.View r2, int r3, int r4, defpackage.hg5 r5) {
            r1 = this;
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L25
            boolean r1 = r1.h
            if (r1 == 0) goto L25
            int r1 = r2.getWidth()
            int r0 = r5.width
            boolean r1 = M(r1, r3, r0)
            if (r1 == 0) goto L25
            int r1 = r2.getHeight()
            int r2 = r5.height
            boolean r1 = M(r1, r4, r2)
            if (r1 != 0) goto L23
            goto L25
        L23:
            r1 = 0
            return r1
        L25:
            r1 = 1
            return r1
    }

    public void y(android.view.View r6, android.graphics.Rect r7) {
            r5 = this;
            boolean r5 = androidx.recyclerview.widget.RecyclerView.y1
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            hg5 r5 = (defpackage.hg5) r5
            android.graphics.Rect r0 = r5.b
            int r1 = r6.getLeft()
            int r2 = r0.left
            int r1 = r1 - r2
            int r2 = r5.leftMargin
            int r1 = r1 - r2
            int r2 = r6.getTop()
            int r3 = r0.top
            int r2 = r2 - r3
            int r3 = r5.topMargin
            int r2 = r2 - r3
            int r3 = r6.getRight()
            int r4 = r0.right
            int r3 = r3 + r4
            int r4 = r5.rightMargin
            int r3 = r3 + r4
            int r6 = r6.getBottom()
            int r0 = r0.bottom
            int r6 = r6 + r0
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            r7.set(r1, r2, r3, r6)
            return
    }

    public boolean y0() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean z0(android.view.View r2, int r3, int r4, defpackage.hg5 r5) {
            r1 = this;
            boolean r1 = r1.h
            if (r1 == 0) goto L1f
            int r1 = r2.getMeasuredWidth()
            int r0 = r5.width
            boolean r1 = M(r1, r3, r0)
            if (r1 == 0) goto L1f
            int r1 = r2.getMeasuredHeight()
            int r2 = r5.height
            boolean r1 = M(r1, r4, r2)
            if (r1 != 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }
}
