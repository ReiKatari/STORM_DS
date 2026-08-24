package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv3  reason: default package */
/* loaded from: classes.dex */
public abstract class dv3 extends android.view.ViewGroup {
    public boolean A;
    public int B;
    public int L;
    public int R;
    public int d0;
    public int e0;
    public float f0;
    public boolean g0;
    public int[] h0;
    public int[] i0;
    public android.graphics.drawable.Drawable j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;

    public dv3(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 1
            r10.A = r0
            r1 = -1
            r10.B = r1
            r2 = 0
            r10.L = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r10.d0 = r3
            int[] r6 = defpackage.m75.n
            m44 r3 = defpackage.m44.A(r11, r12, r6, r13)
            java.lang.Object r4 = r3.L
            r8 = r4
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r4 = r10
            r5 = r11
            r7 = r12
            r9 = r13
            defpackage.ao7.m(r4, r5, r6, r7, r8, r9)
            java.lang.Object r10 = r3.L
            android.content.res.TypedArray r10 = (android.content.res.TypedArray) r10
            int r11 = r10.getInt(r0, r1)
            if (r11 < 0) goto L30
            r4.setOrientation(r11)
        L30:
            int r11 = r10.getInt(r2, r1)
            if (r11 < 0) goto L39
            r4.setGravity(r11)
        L39:
            r11 = 2
            boolean r11 = r10.getBoolean(r11, r0)
            if (r11 != 0) goto L43
            r4.setBaselineAligned(r11)
        L43:
            r11 = 4
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r10.getFloat(r11, r12)
            r4.f0 = r11
            r11 = 3
            int r11 = r10.getInt(r11, r1)
            r4.B = r11
            r11 = 7
            boolean r11 = r10.getBoolean(r11, r2)
            r4.g0 = r11
            r11 = 5
            android.graphics.drawable.Drawable r11 = r3.k(r11)
            r4.setDividerDrawable(r11)
            r11 = 8
            int r11 = r10.getInt(r11, r2)
            r4.m0 = r11
            r11 = 6
            int r10 = r10.getDimensionPixelSize(r11, r2)
            r4.n0 = r10
            r3.D()
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.cv3
            return r0
    }

    public final void d(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.j0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.n0
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.n0
            int r2 = r2 - r3
            int r3 = r4.l0
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r4 = r4.j0
            r4.draw(r5)
            return
    }

    public final void e(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.j0
            int r1 = r5.getPaddingTop()
            int r2 = r5.n0
            int r1 = r1 + r2
            int r2 = r5.k0
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.n0
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r5 = r5.j0
            r5.draw(r6)
            return
    }

    public defpackage.cv3 f() {
            r2 = this;
            int r2 = r2.R
            r0 = -2
            if (r2 != 0) goto Lb
            cv3 r2 = new cv3
            r2.<init>(r0, r0)
            return r2
        Lb:
            r1 = 1
            if (r2 != r1) goto L15
            cv3 r2 = new cv3
            r1 = -1
            r2.<init>(r1, r0)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public defpackage.cv3 g(android.util.AttributeSet r2) {
            r1 = this;
            cv3 r0 = new cv3
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            cv3 r0 = r0.f()
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            cv3 r0 = r0.g(r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            cv3 r0 = r0.h(r1)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r5 = this;
            int r0 = r5.B
            if (r0 >= 0) goto L9
            int r5 = super.getBaseline()
            return r5
        L9:
            int r0 = r5.getChildCount()
            int r1 = r5.B
            r2 = 0
            if (r0 <= r1) goto L76
            android.view.View r0 = r5.getChildAt(r1)
            int r1 = r0.getBaseline()
            r3 = -1
            if (r1 != r3) goto L28
            int r5 = r5.B
            if (r5 != 0) goto L22
            return r3
        L22:
            java.lang.String r5 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            defpackage.u34.j(r5)
            return r2
        L28:
            int r2 = r5.L
            int r3 = r5.R
            r4 = 1
            if (r3 != r4) goto L6b
            int r3 = r5.d0
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6b
            r4 = 16
            if (r3 == r4) goto L52
            r4 = 80
            if (r3 == r4) goto L40
            goto L6b
        L40:
            int r2 = r5.getBottom()
            int r3 = r5.getTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r5.e0
            int r2 = r2 - r5
            goto L6b
        L52:
            int r3 = r5.getBottom()
            int r4 = r5.getTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r5 = r5.e0
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r2 = r2 + r3
        L6b:
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            cv3 r5 = (defpackage.cv3) r5
            int r5 = r5.topMargin
            int r2 = r2 + r5
            int r2 = r2 + r1
            return r2
        L76:
            java.lang.String r5 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            defpackage.u34.j(r5)
            return r2
    }

    public int getBaselineAlignedChildIndex() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.j0
            return r0
    }

    public int getDividerPadding() {
            r0 = this;
            int r0 = r0.n0
            return r0
    }

    public int getDividerWidth() {
            r0 = this;
            int r0 = r0.k0
            return r0
    }

    public int getGravity() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    public int getOrientation() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    public int getShowDividers() {
            r0 = this;
            int r0 = r0.m0
            return r0
    }

    public int getVirtualChildCount() {
            r0 = this;
            int r0 = r0.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r0 = this;
            float r0 = r0.f0
            return r0
    }

    public defpackage.cv3 h(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.cv3
            if (r0 == 0) goto Lc
            cv3 r0 = new cv3
            cv3 r1 = (defpackage.cv3) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            cv3 r0 = new cv3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            cv3 r0 = new cv3
            r0.<init>(r1)
            return r0
    }

    public final boolean i(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r4 = r4.m0
            r4 = r4 & r1
            if (r4 == 0) goto La
            return r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            int r3 = r4.m0
            if (r5 != r2) goto L19
            r4 = r3 & 4
            if (r4 == 0) goto L18
            return r1
        L18:
            return r0
        L19:
            r2 = r3 & 2
            if (r2 == 0) goto L30
            int r5 = r5 - r1
        L1e:
            if (r5 < 0) goto L30
            android.view.View r2 = r4.getChildAt(r5)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L2d
            return r1
        L2d:
            int r5 = r5 + (-1)
            goto L1e
        L30:
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.j0
            if (r0 != 0) goto L6
            goto Le7
        L6:
            int r0 = r7.R
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L67
            int r0 = r7.getVirtualChildCount()
        L12:
            if (r2 >= r0) goto L3c
            android.view.View r4 = r7.getChildAt(r2)
            if (r4 == 0) goto L39
            int r5 = r4.getVisibility()
            if (r5 == r1) goto L39
            boolean r5 = r7.i(r2)
            if (r5 == 0) goto L39
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            cv3 r5 = (defpackage.cv3) r5
            int r4 = r4.getTop()
            int r5 = r5.topMargin
            int r4 = r4 - r5
            int r5 = r7.l0
            int r4 = r4 - r5
            r7.d(r8, r4)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            boolean r1 = r7.i(r0)
            if (r1 == 0) goto Le7
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto L56
            int r0 = r7.getHeight()
            int r1 = r7.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r7.l0
            int r0 = r0 - r1
            goto L63
        L56:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            cv3 r1 = (defpackage.cv3) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L63:
            r7.d(r8, r0)
            return
        L67:
            int r0 = r7.getVirtualChildCount()
            boolean r4 = defpackage.eq7.a
            int r4 = r7.getLayoutDirection()
            if (r4 != r3) goto L75
            r4 = r3
            goto L76
        L75:
            r4 = r2
        L76:
            if (r2 >= r0) goto Laa
            android.view.View r5 = r7.getChildAt(r2)
            if (r5 == 0) goto La7
            int r6 = r5.getVisibility()
            if (r6 == r1) goto La7
            boolean r6 = r7.i(r2)
            if (r6 == 0) goto La7
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            cv3 r6 = (defpackage.cv3) r6
            if (r4 == 0) goto L9a
            int r5 = r5.getRight()
            int r6 = r6.rightMargin
            int r5 = r5 + r6
            goto La4
        L9a:
            int r5 = r5.getLeft()
            int r6 = r6.leftMargin
            int r5 = r5 - r6
            int r6 = r7.k0
            int r5 = r5 - r6
        La4:
            r7.e(r8, r5)
        La7:
            int r2 = r2 + 1
            goto L76
        Laa:
            boolean r1 = r7.i(r0)
            if (r1 == 0) goto Le7
            int r0 = r0 - r3
            android.view.View r0 = r7.getChildAt(r0)
            if (r0 != 0) goto Lcb
            if (r4 == 0) goto Lbe
            int r0 = r7.getPaddingLeft()
            goto Le4
        Lbe:
            int r0 = r7.getWidth()
            int r1 = r7.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r7.k0
        Lc9:
            int r0 = r0 - r1
            goto Le4
        Lcb:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            cv3 r1 = (defpackage.cv3) r1
            if (r4 == 0) goto Ldd
            int r0 = r0.getLeft()
            int r1 = r1.leftMargin
            int r0 = r0 - r1
            int r1 = r7.k0
            goto Lc9
        Ldd:
            int r0 = r0.getRight()
            int r1 = r1.rightMargin
            int r0 = r0 + r1
        Le4:
            r7.e(r8, r0)
        Le7:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
            r22 = this;
            r0 = r22
            int r1 = r0.R
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 16
            r7 = 8388615(0x800007, float:1.1754953E-38)
            r8 = 2
            r9 = 1
            if (r1 != r9) goto Lb5
            int r1 = r0.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r0.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r0.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r0.getVirtualChildCount()
            int r13 = r0.d0
            r14 = r13 & 112(0x70, float:1.57E-43)
            r7 = r7 & r13
            if (r14 == r6) goto L42
            if (r14 == r5) goto L36
            int r5 = r0.getPaddingTop()
            goto L4d
        L36:
            int r5 = r0.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r6 = r0.e0
            int r5 = r5 - r6
            goto L4d
        L42:
            int r5 = r0.getPaddingTop()
            int r6 = r27 - r25
            int r13 = r0.e0
            int r6 = r6 - r13
            int r6 = r6 / r8
            int r5 = r5 + r6
        L4d:
            r4 = 0
        L4e:
            if (r4 >= r12) goto L1cc
            android.view.View r6 = r0.getChildAt(r4)
            if (r6 != 0) goto L59
        L56:
            r23 = r8
            goto Lae
        L59:
            int r13 = r6.getVisibility()
            if (r13 == r3) goto L56
            int r13 = r6.getMeasuredWidth()
            int r14 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r6.getLayoutParams()
            cv3 r15 = (defpackage.cv3) r15
            r23 = r8
            int r8 = r15.gravity
            if (r8 >= 0) goto L74
            r8 = r7
        L74:
            int r3 = r0.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r8, r3)
            r3 = r3 & 7
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L86
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L97
        L86:
            int r3 = r11 - r13
            int r8 = r15.rightMargin
        L8a:
            int r3 = r3 - r8
            goto L97
        L8c:
            int r3 = r10 - r13
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r8 = r15.leftMargin
            int r3 = r3 + r8
            int r8 = r15.rightMargin
            goto L8a
        L97:
            boolean r8 = r0.i(r4)
            if (r8 == 0) goto La0
            int r8 = r0.l0
            int r5 = r5 + r8
        La0:
            int r8 = r15.topMargin
            int r5 = r5 + r8
            int r13 = r13 + r3
            int r8 = r5 + r14
            r6.layout(r3, r5, r13, r8)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        Lae:
            int r4 = r4 + 1
            r8 = r23
            r3 = 8
            goto L4e
        Lb5:
            r23 = r8
            boolean r1 = defpackage.eq7.a
            int r1 = r0.getLayoutDirection()
            if (r1 != r9) goto Lc1
            r1 = r9
            goto Lc2
        Lc1:
            r1 = 0
        Lc2:
            int r3 = r0.getPaddingTop()
            int r8 = r27 - r25
            int r10 = r0.getPaddingBottom()
            int r10 = r8 - r10
            int r8 = r8 - r3
            int r11 = r0.getPaddingBottom()
            int r8 = r8 - r11
            int r11 = r0.getVirtualChildCount()
            int r12 = r0.d0
            r7 = r7 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.A
            int[] r14 = r0.h0
            int[] r15 = r0.i0
            int r4 = r0.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r7, r4)
            if (r4 == r9) goto L100
            if (r4 == r2) goto Lf4
            int r2 = r0.getPaddingLeft()
            goto L10c
        Lf4:
            int r2 = r0.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.e0
            int r2 = r2 - r4
            goto L10c
        L100:
            int r2 = r0.getPaddingLeft()
            int r4 = r26 - r24
            int r7 = r0.e0
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r2 = r2 + r4
        L10c:
            if (r1 == 0) goto L112
            int r1 = r11 + (-1)
            r7 = -1
            goto L114
        L112:
            r7 = r9
            r1 = 0
        L114:
            r17 = r9
            r9 = 0
        L117:
            if (r9 >= r11) goto L1cc
            int r18 = r7 * r9
            int r5 = r18 + r1
            android.view.View r6 = r0.getChildAt(r5)
            if (r6 != 0) goto L129
            r25 = r1
        L125:
            r19 = r3
            goto L1c0
        L129:
            int r4 = r6.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L1bc
            int r4 = r6.getMeasuredWidth()
            int r16 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r6.getLayoutParams()
            r1 = r19
            cv3 r1 = (defpackage.cv3) r1
            r27 = r2
            if (r13 == 0) goto L153
            int r2 = r1.height
            r19 = r3
            r3 = -1
            if (r2 == r3) goto L155
            int r3 = r6.getBaseline()
            goto L156
        L153:
            r19 = r3
        L155:
            r3 = -1
        L156:
            int r2 = r1.gravity
            if (r2 >= 0) goto L15b
            r2 = r12
        L15b:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r20 = r4
            r4 = 16
            if (r2 == r4) goto L191
            r4 = 48
            if (r2 == r4) goto L183
            r4 = 80
            if (r2 == r4) goto L16f
            r2 = r19
            r4 = -1
            goto L19e
        L16f:
            int r2 = r10 - r16
            int r4 = r1.bottomMargin
            int r2 = r2 - r4
            r4 = -1
            if (r3 == r4) goto L19e
            int r21 = r6.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = r15[r23]
            int r3 = r3 - r21
        L181:
            int r2 = r2 - r3
            goto L19e
        L183:
            r4 = -1
            int r2 = r1.topMargin
            int r2 = r19 + r2
            if (r3 == r4) goto L19e
            r21 = r14[r17]
            int r21 = r21 - r3
            int r2 = r21 + r2
            goto L19e
        L191:
            r4 = -1
            int r2 = r8 - r16
            int r2 = r2 / 2
            int r2 = r2 + r19
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r3 = r1.bottomMargin
            goto L181
        L19e:
            boolean r3 = r0.i(r5)
            if (r3 == 0) goto L1a9
            int r3 = r0.k0
            int r3 = r27 + r3
            goto L1ab
        L1a9:
            r3 = r27
        L1ab:
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r3 + r20
            int r4 = r2 + r16
            r6.layout(r3, r2, r5, r4)
            int r1 = r1.rightMargin
            int r4 = r20 + r1
            int r4 = r4 + r3
            r2 = r4
            goto L1c0
        L1bc:
            r27 = r2
            goto L125
        L1c0:
            int r9 = r9 + 1
            r1 = r25
            r3 = r19
            r5 = 80
            r6 = 16
            goto L117
        L1cc:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r39, int r40) {
            r38 = this;
            r0 = r38
            int r1 = r0.R
            r7 = -2
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            r14 = 1
            if (r1 != r14) goto L34d
            r0.e0 = r9
            int r15 = r0.getVirtualChildCount()
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r2 = android.view.View.MeasureSpec.getMode(r40)
            int r3 = r0.B
            boolean r4 = r0.g0
            r5 = r9
            r6 = r5
            r8 = r6
            r19 = r8
            r22 = r19
            r23 = r22
            r20 = r14
            r24 = r20
            r16 = 0
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r14 = r23
        L35:
            if (r5 >= r15) goto L15f
            r25 = r1
            android.view.View r1 = r0.getChildAt(r5)
            if (r1 != 0) goto L51
            int r1 = r0.e0
            r0.e0 = r1
        L43:
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r12 = r25
            r2 = r39
            r4 = r40
            goto L150
        L51:
            int r12 = r1.getVisibility()
            if (r12 != r11) goto L58
            goto L43
        L58:
            boolean r12 = r0.i(r5)
            if (r12 == 0) goto L65
            int r12 = r0.e0
            int r11 = r0.l0
            int r12 = r12 + r11
            r0.e0 = r12
        L65:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            cv3 r11 = (defpackage.cv3) r11
            float r12 = r11.weight
            float r16 = r16 + r12
            if (r2 != r10) goto L98
            int r10 = r11.height
            if (r10 != 0) goto L98
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto L98
            int r10 = r0.e0
            int r12 = r11.topMargin
            int r12 = r12 + r10
            int r13 = r11.bottomMargin
            int r12 = r12 + r13
            int r10 = java.lang.Math.max(r10, r12)
            r0.e0 = r10
            r30 = r1
            r29 = r2
            r7 = r3
            r28 = r4
            r13 = r5
            r19 = r20
            r12 = r25
            r2 = r39
            r4 = r40
            goto Le6
        L98:
            int r10 = r11.height
            if (r10 != 0) goto La4
            int r10 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r10 <= 0) goto La4
            r11.height = r7
            r10 = 0
            goto La6
        La4:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        La6:
            int r12 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r12 != 0) goto Lb1
            int r12 = r0.e0
            r13 = r12
            r12 = r5
            r5 = r13
        Laf:
            r13 = r3
            goto Lb4
        Lb1:
            r12 = r5
            r5 = 0
            goto Laf
        Lb4:
            r3 = 0
            r29 = r2
            r28 = r4
            r7 = r13
            r2 = r39
            r4 = r40
            r13 = r12
            r12 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto Lca
            r11.height = r10
        Lca:
            int r3 = r1.getMeasuredHeight()
            int r5 = r0.e0
            int r10 = r5 + r3
            r30 = r1
            int r1 = r11.topMargin
            int r10 = r10 + r1
            int r1 = r11.bottomMargin
            int r10 = r10 + r1
            int r1 = java.lang.Math.max(r5, r10)
            r0.e0 = r1
            if (r28 == 0) goto Le6
            int r14 = java.lang.Math.max(r3, r14)
        Le6:
            if (r7 < 0) goto Lf0
            int r5 = r13 + 1
            if (r7 != r5) goto Lf0
            int r1 = r0.e0
            r0.L = r1
        Lf0:
            if (r13 >= r7) goto Lf8
            float r1 = r11.weight
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 > 0) goto Lfb
        Lf8:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L101
        Lfb:
            java.lang.String r0 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            defpackage.u34.j(r0)
            return
        L101:
            if (r12 == r1) goto L10d
            int r1 = r11.width
            r3 = -1
            if (r1 != r3) goto L10d
            r1 = r20
            r23 = r1
            goto L10e
        L10d:
            r1 = 0
        L10e:
            int r3 = r11.leftMargin
            int r5 = r11.rightMargin
            int r3 = r3 + r5
            int r5 = r30.getMeasuredWidth()
            int r5 = r5 + r3
            int r9 = java.lang.Math.max(r9, r5)
            int r10 = r30.getMeasuredState()
            r30 = r1
            r1 = r22
            int r1 = android.view.View.combineMeasuredStates(r1, r10)
            if (r24 == 0) goto L134
            int r10 = r11.width
            r22 = r1
            r1 = -1
            if (r10 != r1) goto L136
            r1 = r20
            goto L137
        L134:
            r22 = r1
        L136:
            r1 = 0
        L137:
            float r10 = r11.weight
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 <= 0) goto L146
            if (r30 == 0) goto L140
            goto L141
        L140:
            r3 = r5
        L141:
            int r8 = java.lang.Math.max(r8, r3)
            goto L14e
        L146:
            if (r30 == 0) goto L149
            goto L14a
        L149:
            r3 = r5
        L14a:
            int r6 = java.lang.Math.max(r6, r3)
        L14e:
            r24 = r1
        L150:
            int r5 = r13 + 1
            r3 = r7
            r1 = r12
            r4 = r28
            r2 = r29
            r7 = -2
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 8
            goto L35
        L15f:
            r12 = r1
            r29 = r2
            r28 = r4
            r1 = r22
            r2 = r39
            r4 = r40
            int r3 = r0.e0
            if (r3 <= 0) goto L17b
            boolean r3 = r0.i(r15)
            if (r3 == 0) goto L17b
            int r3 = r0.e0
            int r5 = r0.l0
            int r3 = r3 + r5
            r0.e0 = r3
        L17b:
            r3 = r29
            if (r28 == 0) goto L1b8
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L185
            if (r3 != 0) goto L1b8
        L185:
            r5 = 0
            r0.e0 = r5
            r5 = 0
        L189:
            if (r5 >= r15) goto L1b8
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L196
            int r7 = r0.e0
            r0.e0 = r7
            goto L1b5
        L196:
            int r10 = r7.getVisibility()
            r11 = 8
            if (r10 != r11) goto L19f
            goto L1b5
        L19f:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            cv3 r7 = (defpackage.cv3) r7
            int r10 = r0.e0
            int r11 = r10 + r14
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r7 = r7.bottomMargin
            int r11 = r11 + r7
            int r7 = java.lang.Math.max(r10, r11)
            r0.e0 = r7
        L1b5:
            int r5 = r5 + 1
            goto L189
        L1b8:
            int r5 = r0.e0
            int r7 = r0.getPaddingTop()
            int r10 = r0.getPaddingBottom()
            int r10 = r10 + r7
            int r10 = r10 + r5
            r0.e0 = r10
            int r5 = r0.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r10, r5)
            r7 = 0
            int r5 = android.view.View.resolveSizeAndState(r5, r4, r7)
            r7 = r5 & r17
            int r10 = r0.e0
            int r7 = r7 - r10
            if (r19 != 0) goto L21d
            if (r7 == 0) goto L1e1
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 <= 0) goto L1e1
            goto L21d
        L1e1:
            int r6 = java.lang.Math.max(r6, r8)
            if (r28 == 0) goto L2f1
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 == r7) goto L2f1
            r3 = 0
        L1ec:
            if (r3 >= r15) goto L2f1
            android.view.View r7 = r0.getChildAt(r3)
            if (r7 == 0) goto L21a
            int r8 = r7.getVisibility()
            r11 = 8
            if (r8 != r11) goto L1fd
            goto L21a
        L1fd:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            cv3 r8 = (defpackage.cv3) r8
            float r8 = r8.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L21a
            int r8 = r7.getMeasuredWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r10)
            r7.measure(r8, r11)
        L21a:
            int r3 = r3 + 1
            goto L1ec
        L21d:
            float r8 = r0.f0
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L225
            r16 = r8
        L225:
            r8 = 0
            r0.e0 = r8
            r8 = r1
            r1 = 0
        L22a:
            if (r1 >= r15) goto L2e2
            android.view.View r10 = r0.getChildAt(r1)
            int r11 = r10.getVisibility()
            r13 = 8
            if (r11 != r13) goto L23c
            r17 = r1
            goto L2de
        L23c:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            cv3 r11 = (defpackage.cv3) r11
            float r13 = r11.weight
            int r14 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r14 <= 0) goto L29c
            float r14 = (float) r7
            float r14 = r14 * r13
            float r14 = r14 / r16
            int r14 = (int) r14
            float r16 = r16 - r13
            int r7 = r7 - r14
            int r13 = r0.getPaddingLeft()
            int r17 = r0.getPaddingRight()
            int r17 = r17 + r13
            int r13 = r11.leftMargin
            int r17 = r17 + r13
            int r13 = r11.rightMargin
            int r13 = r17 + r13
            r17 = r1
            int r1 = r11.width
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r13, r1)
            int r13 = r11.height
            if (r13 != 0) goto L27f
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r13) goto L273
            goto L281
        L273:
            if (r14 <= 0) goto L276
            goto L277
        L276:
            r14 = 0
        L277:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
            goto L291
        L27f:
            r13 = 1073741824(0x40000000, float:2.0)
        L281:
            int r19 = r10.getMeasuredHeight()
            int r14 = r19 + r14
            if (r14 >= 0) goto L28a
            r14 = 0
        L28a:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r10.measure(r1, r14)
        L291:
            int r1 = r10.getMeasuredState()
            r1 = r1 & (-256(0xffffffffffffff00, float:NaN))
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L29e
        L29c:
            r17 = r1
        L29e:
            int r1 = r11.leftMargin
            int r13 = r11.rightMargin
            int r1 = r1 + r13
            int r13 = r10.getMeasuredWidth()
            int r13 = r13 + r1
            int r9 = java.lang.Math.max(r9, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r12 == r14) goto L2ba
            int r14 = r11.width
            r19 = r1
            r1 = -1
            if (r14 != r1) goto L2bb
            r13 = r19
            goto L2bb
        L2ba:
            r1 = -1
        L2bb:
            int r6 = java.lang.Math.max(r6, r13)
            if (r24 == 0) goto L2c8
            int r13 = r11.width
            if (r13 != r1) goto L2c8
            r1 = r20
            goto L2c9
        L2c8:
            r1 = 0
        L2c9:
            int r13 = r0.e0
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r13
            int r14 = r11.topMargin
            int r10 = r10 + r14
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            int r10 = java.lang.Math.max(r13, r10)
            r0.e0 = r10
            r24 = r1
        L2de:
            int r1 = r17 + 1
            goto L22a
        L2e2:
            int r1 = r0.e0
            int r3 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r0.e0 = r7
            r1 = r8
        L2f1:
            if (r24 != 0) goto L2f8
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 == r13) goto L2f8
            goto L2f9
        L2f8:
            r6 = r9
        L2f9:
            int r3 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r3
            int r7 = r7 + r6
            int r3 = r0.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r7, r3)
            int r1 = android.view.View.resolveSizeAndState(r3, r2, r1)
            r0.setMeasuredDimension(r1, r5)
            if (r23 == 0) goto L85a
            int r1 = r0.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = 0
        L31f:
            if (r9 >= r15) goto L85a
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L348
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r6 = r3
            cv3 r6 = (defpackage.cv3) r6
            int r3 = r6.width
            r5 = -1
            if (r3 != r5) goto L348
            int r7 = r6.height
            int r3 = r1.getMeasuredHeight()
            r6.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r6.height = r7
        L348:
            int r9 = r9 + 1
            r4 = r40
            goto L31f
        L34d:
            r2 = r39
            r5 = r9
            r20 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r18 = 0
            r0.e0 = r5
            int r6 = r0.getVirtualChildCount()
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r8 = android.view.View.MeasureSpec.getMode(r40)
            int[] r1 = r0.h0
            r9 = 4
            if (r1 == 0) goto L36e
            int[] r1 = r0.i0
            if (r1 != 0) goto L376
        L36e:
            int[] r1 = new int[r9]
            r0.h0 = r1
            int[] r1 = new int[r9]
            r0.i0 = r1
        L376:
            int[] r10 = r0.h0
            int[] r11 = r0.i0
            r12 = 3
            r26 = -1
            r10[r12] = r26
            r13 = 2
            r10[r13] = r26
            r10[r20] = r26
            r21 = 0
            r10[r21] = r26
            r11[r12] = r26
            r11[r13] = r26
            r11[r20] = r26
            r11[r21] = r26
            boolean r14 = r0.A
            boolean r15 = r0.g0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L39b
            r16 = r20
            goto L39d
        L39b:
            r16 = 0
        L39d:
            r23 = r9
            r24 = r12
            r28 = r18
            r29 = r20
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r12 = 0
            r19 = 0
            r22 = 0
        L3af:
            if (r1 >= r6) goto L560
            r30 = r13
            android.view.View r13 = r0.getChildAt(r1)
            if (r13 != 0) goto L3cc
            int r13 = r0.e0
            r0.e0 = r13
            r33 = r1
            r1 = r4
            r31 = r10
            r32 = r11
            r34 = r14
            r35 = r15
            r4 = r40
            goto L550
        L3cc:
            int r2 = r13.getVisibility()
            r31 = r3
            r3 = 8
            if (r2 != r3) goto L3e9
            r2 = r39
            r33 = r1
            r1 = r4
            r32 = r11
            r34 = r14
            r35 = r15
            r3 = r31
            r4 = r40
            r31 = r10
            goto L550
        L3e9:
            boolean r2 = r0.i(r1)
            if (r2 == 0) goto L3f6
            int r2 = r0.e0
            int r3 = r0.k0
            int r2 = r2 + r3
            r0.e0 = r2
        L3f6:
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            cv3 r2 = (defpackage.cv3) r2
            float r3 = r2.weight
            float r28 = r28 + r3
            r32 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L46a
            int r1 = r2.width
            if (r1 != 0) goto L46a
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L46a
            int r1 = r0.e0
            int r3 = r2.leftMargin
            if (r16 == 0) goto L41e
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r3 = r3 + r1
            r0.e0 = r3
            goto L42e
        L41e:
            r33 = r3
            int r3 = r1 + r33
            r33 = r3
            int r3 = r2.rightMargin
            int r3 = r33 + r3
            int r1 = java.lang.Math.max(r1, r3)
            r0.e0 = r1
        L42e:
            if (r14 == 0) goto L44f
            r1 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            r13.measure(r3, r3)
            r36 = r13
            r34 = r14
            r35 = r15
            r13 = r31
            r33 = r32
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4ce
        L44f:
            r36 = r13
            r34 = r14
            r35 = r15
            r22 = r20
            r13 = r31
            r33 = r32
            r1 = 1073741824(0x40000000, float:2.0)
            r14 = r2
            r31 = r10
            r32 = r11
            r2 = r39
            r10 = r4
            r11 = r5
            r4 = r40
            goto L4d0
        L46a:
            int r1 = r2.width
            if (r1 != 0) goto L477
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 <= 0) goto L477
            r1 = -2
            r2.width = r1
            r1 = 0
            goto L479
        L477:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L479:
            int r3 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r3 != 0) goto L482
            int r3 = r0.e0
        L47f:
            r33 = r5
            goto L484
        L482:
            r3 = 0
            goto L47f
        L484:
            r5 = 0
            r34 = r32
            r32 = r11
            r11 = r33
            r33 = r34
            r34 = r14
            r35 = r15
            r15 = r1
            r14 = r2
            r1 = r13
            r13 = r31
            r2 = r39
            r31 = r10
            r10 = r4
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r3) goto L4a6
            r14.width = r15
        L4a6:
            int r3 = r1.getMeasuredWidth()
            int r5 = r0.e0
            int r15 = r14.leftMargin
            if (r16 == 0) goto L4ba
            int r15 = r15 + r3
            r36 = r1
            int r1 = r14.rightMargin
            int r15 = r15 + r1
            int r15 = r15 + r5
            r0.e0 = r15
            goto L4c8
        L4ba:
            r36 = r1
            int r1 = r5 + r3
            int r1 = r1 + r15
            int r15 = r14.rightMargin
            int r1 = r1 + r15
            int r1 = java.lang.Math.max(r5, r1)
            r0.e0 = r1
        L4c8:
            if (r35 == 0) goto L4ce
            int r9 = java.lang.Math.max(r3, r9)
        L4ce:
            r1 = 1073741824(0x40000000, float:2.0)
        L4d0:
            if (r8 == r1) goto L4dc
            int r1 = r14.height
            r3 = -1
            if (r1 != r3) goto L4dc
            r1 = r20
            r19 = r1
            goto L4dd
        L4dc:
            r1 = 0
        L4dd:
            int r3 = r14.topMargin
            int r5 = r14.bottomMargin
            int r3 = r3 + r5
            int r5 = r36.getMeasuredHeight()
            int r5 = r5 + r3
            int r15 = r36.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r15)
            if (r34 == 0) goto L51f
            int r15 = r36.getBaseline()
            r36 = r1
            r1 = -1
            if (r15 == r1) goto L521
            int r1 = r14.gravity
            if (r1 >= 0) goto L500
            int r1 = r0.d0
        L500:
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 4
            r25 = -2
            r1 = r1 & (-2)
            int r1 = r1 >> 1
            r37 = r1
            r1 = r31[r37]
            int r1 = java.lang.Math.max(r1, r15)
            r31[r37] = r1
            r1 = r32[r37]
            int r15 = r5 - r15
            int r1 = java.lang.Math.max(r1, r15)
            r32[r37] = r1
            goto L521
        L51f:
            r36 = r1
        L521:
            int r1 = java.lang.Math.max(r13, r5)
            if (r29 == 0) goto L52f
            int r13 = r14.height
            r15 = -1
            if (r13 != r15) goto L52f
            r13 = r20
            goto L530
        L52f:
            r13 = 0
        L530:
            float r14 = r14.weight
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 <= 0) goto L540
            if (r36 == 0) goto L539
            goto L53a
        L539:
            r3 = r5
        L53a:
            int r5 = java.lang.Math.max(r11, r3)
            r3 = r10
            goto L549
        L540:
            if (r36 == 0) goto L543
            goto L544
        L543:
            r3 = r5
        L544:
            int r3 = java.lang.Math.max(r10, r3)
            r5 = r11
        L549:
            r29 = r3
            r3 = r1
            r1 = r29
            r29 = r13
        L550:
            int r10 = r33 + 1
            r4 = r1
            r1 = r10
            r13 = r30
            r10 = r31
            r11 = r32
            r14 = r34
            r15 = r35
            goto L3af
        L560:
            r31 = r10
            r32 = r11
            r30 = r13
            r34 = r14
            r35 = r15
            r13 = r3
            r10 = r4
            r11 = r5
            r4 = r40
            int r1 = r0.e0
            if (r1 <= 0) goto L580
            boolean r1 = r0.i(r6)
            if (r1 == 0) goto L580
            int r1 = r0.e0
            int r3 = r0.k0
            int r1 = r1 + r3
            r0.e0 = r1
        L580:
            r1 = r31[r20]
            r3 = -1
            if (r1 != r3) goto L596
            r21 = 0
            r5 = r31[r21]
            if (r5 != r3) goto L596
            r5 = r31[r30]
            if (r5 != r3) goto L596
            r5 = r31[r24]
            if (r5 == r3) goto L594
            goto L596
        L594:
            r3 = r13
            goto L5c3
        L596:
            r3 = r31[r24]
            r21 = 0
            r5 = r31[r21]
            r14 = r31[r30]
            int r1 = java.lang.Math.max(r1, r14)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r32[r24]
            r5 = r32[r21]
            r14 = r32[r20]
            r15 = r32[r30]
            int r14 = java.lang.Math.max(r14, r15)
            int r5 = java.lang.Math.max(r5, r14)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 + r1
            int r3 = java.lang.Math.max(r13, r3)
        L5c3:
            if (r35 == 0) goto L60a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L5cb
            if (r7 != 0) goto L60a
        L5cb:
            r5 = 0
            r0.e0 = r5
            r1 = 0
        L5cf:
            if (r1 >= r6) goto L60a
            android.view.View r5 = r0.getChildAt(r1)
            if (r5 != 0) goto L5dc
            int r5 = r0.e0
            r0.e0 = r5
            goto L607
        L5dc:
            int r13 = r5.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5e5
            goto L607
        L5e5:
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            cv3 r5 = (defpackage.cv3) r5
            int r13 = r0.e0
            if (r16 == 0) goto L5f9
            int r14 = r5.leftMargin
            int r14 = r14 + r9
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r14 = r14 + r13
            r0.e0 = r14
            goto L607
        L5f9:
            int r14 = r13 + r9
            int r15 = r5.leftMargin
            int r14 = r14 + r15
            int r5 = r5.rightMargin
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r13, r14)
            r0.e0 = r5
        L607:
            int r1 = r1 + 1
            goto L5cf
        L60a:
            int r1 = r0.e0
            int r5 = r0.getPaddingLeft()
            int r13 = r0.getPaddingRight()
            int r13 = r13 + r5
            int r13 = r13 + r1
            r0.e0 = r13
            int r1 = r0.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r13, r1)
            r5 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r5)
            r5 = r1 & r17
            int r13 = r0.e0
            int r5 = r5 - r13
            if (r22 != 0) goto L677
            if (r5 == 0) goto L633
            int r14 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r14 <= 0) goto L633
            goto L677
        L633:
            int r5 = java.lang.Math.max(r10, r11)
            if (r35 == 0) goto L66f
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L66f
            r7 = 0
        L63e:
            if (r7 >= r6) goto L66f
            android.view.View r10 = r0.getChildAt(r7)
            if (r10 == 0) goto L66c
            int r11 = r10.getVisibility()
            r14 = 8
            if (r11 != r14) goto L64f
            goto L66c
        L64f:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            cv3 r11 = (defpackage.cv3) r11
            float r11 = r11.weight
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto L66c
            r14 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            int r15 = r10.getMeasuredHeight()
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r10.measure(r11, r15)
        L66c:
            int r7 = r7 + 1
            goto L63e
        L66f:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = 0
            goto L7f4
        L677:
            float r3 = r0.f0
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto L67f
            r28 = r3
        L67f:
            r26 = -1
            r31[r24] = r26
            r31[r30] = r26
            r31[r20] = r26
            r3 = 0
            r31[r3] = r26
            r32[r24] = r26
            r32[r30] = r26
            r32[r20] = r26
            r32[r3] = r26
            r0.e0 = r3
            r3 = -1
            r9 = 0
        L696:
            if (r9 >= r6) goto L79c
            android.view.View r11 = r0.getChildAt(r9)
            if (r11 == 0) goto L6a6
            int r14 = r11.getVisibility()
            r15 = 8
            if (r14 != r15) goto L6ae
        L6a6:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r25 = -2
            goto L796
        L6ae:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            cv3 r14 = (defpackage.cv3) r14
            float r15 = r14.weight
            int r17 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r17 <= 0) goto L710
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            float r13 = (float) r5
            float r13 = r13 * r15
            float r13 = r13 / r28
            int r13 = (int) r13
            float r28 = r28 - r15
            int r5 = r5 - r13
            int r15 = r0.getPaddingTop()
            int r22 = r0.getPaddingBottom()
            int r22 = r22 + r15
            int r15 = r14.topMargin
            int r22 = r22 + r15
            int r15 = r14.bottomMargin
            int r15 = r22 + r15
            r22 = r1
            int r1 = r14.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r15, r1)
            int r15 = r14.width
            if (r15 != 0) goto L6f3
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L6e7
            goto L6f5
        L6e7:
            if (r13 <= 0) goto L6ea
            goto L6eb
        L6ea:
            r13 = 0
        L6eb:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
            goto L705
        L6f3:
            r15 = 1073741824(0x40000000, float:2.0)
        L6f5:
            int r27 = r11.getMeasuredWidth()
            int r13 = r27 + r13
            if (r13 >= 0) goto L6fe
            r13 = 0
        L6fe:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r11.measure(r13, r1)
        L705:
            int r1 = r11.getMeasuredState()
            r1 = r1 & r17
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            goto L714
        L710:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L714:
            int r1 = r0.e0
            if (r16 == 0) goto L728
            int r13 = r11.getMeasuredWidth()
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r13 = r13 + r1
            r0.e0 = r13
        L725:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L73a
        L728:
            int r13 = r11.getMeasuredWidth()
            int r13 = r13 + r1
            int r15 = r14.leftMargin
            int r13 = r13 + r15
            int r15 = r14.rightMargin
            int r13 = r13 + r15
            int r1 = java.lang.Math.max(r1, r13)
            r0.e0 = r1
            goto L725
        L73a:
            if (r8 == r1) goto L744
            int r1 = r14.height
            r15 = -1
            if (r1 != r15) goto L744
            r1 = r20
            goto L745
        L744:
            r1 = 0
        L745:
            int r13 = r14.topMargin
            int r15 = r14.bottomMargin
            int r13 = r13 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            if (r1 == 0) goto L756
            goto L757
        L756:
            r13 = r15
        L757:
            int r1 = java.lang.Math.max(r10, r13)
            if (r29 == 0) goto L765
            int r10 = r14.height
            r13 = -1
            if (r10 != r13) goto L766
            r10 = r20
            goto L767
        L765:
            r13 = -1
        L766:
            r10 = 0
        L767:
            if (r34 == 0) goto L791
            int r11 = r11.getBaseline()
            if (r11 == r13) goto L791
            int r13 = r14.gravity
            if (r13 >= 0) goto L775
            int r13 = r0.d0
        L775:
            r13 = r13 & 112(0x70, float:1.57E-43)
            int r13 = r13 >> 4
            r25 = -2
            r13 = r13 & (-2)
            int r13 = r13 >> 1
            r14 = r31[r13]
            int r14 = java.lang.Math.max(r14, r11)
            r31[r13] = r14
            r14 = r32[r13]
            int r15 = r15 - r11
            int r11 = java.lang.Math.max(r14, r15)
            r32[r13] = r11
            goto L793
        L791:
            r25 = -2
        L793:
            r29 = r10
            r10 = r1
        L796:
            int r9 = r9 + 1
            r1 = r22
            goto L696
        L79c:
            r22 = r1
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r1 = r0.e0
            int r5 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r0.e0 = r7
            r1 = r31[r20]
            r15 = -1
            if (r1 != r15) goto L7c5
            r21 = 0
            r5 = r31[r21]
            if (r5 != r15) goto L7c5
            r5 = r31[r30]
            if (r5 != r15) goto L7c5
            r5 = r31[r24]
            if (r5 == r15) goto L7c2
            goto L7c5
        L7c2:
            r21 = 0
            goto L7f3
        L7c5:
            r5 = r31[r24]
            r21 = 0
            r7 = r31[r21]
            r9 = r31[r30]
            int r1 = java.lang.Math.max(r1, r9)
            int r1 = java.lang.Math.max(r7, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r32[r24]
            r7 = r32[r21]
            r9 = r32[r20]
            r11 = r32[r30]
            int r9 = java.lang.Math.max(r9, r11)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r3, r5)
            r3 = r1
        L7f3:
            r5 = r10
        L7f4:
            if (r29 != 0) goto L7fb
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == r1) goto L7fb
            r3 = r5
        L7fb:
            int r1 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r3
            int r1 = r0.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r5, r1)
            r3 = r12 & r17
            r3 = r22 | r3
            int r5 = r12 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r5)
            r0.setMeasuredDimension(r3, r1)
            if (r19 == 0) goto L85a
            int r1 = r0.getMeasuredHeight()
            r13 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            r9 = r21
        L828:
            if (r9 >= r6) goto L85a
            android.view.View r1 = r0.getChildAt(r9)
            int r3 = r1.getVisibility()
            r11 = 8
            if (r3 == r11) goto L852
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r7 = r3
            cv3 r7 = (defpackage.cv3) r7
            int r3 = r7.height
            r15 = -1
            if (r3 != r15) goto L853
            int r8 = r7.width
            int r3 = r1.getMeasuredWidth()
            r7.width = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r7.width = r8
            goto L853
        L852:
            r15 = -1
        L853:
            int r9 = r9 + 1
            r0 = r38
            r2 = r39
            goto L828
        L85a:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.getChildCount()
            if (r2 >= r0) goto Lb
            r1.B = r2
            return
        Lb:
            int r1 = r1.getChildCount()
            java.lang.String r2 = ")"
            java.lang.String r0 = "base aligned child index out of range (0, "
            defpackage.i.i(r0, r1, r2)
            return
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.j0
            if (r3 != r0) goto L5
            return
        L5:
            r2.j0 = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.k0 = r1
            int r1 = r3.getIntrinsicHeight()
            r2.l0 = r1
            goto L1b
        L17:
            r2.k0 = r0
            r2.l0 = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.n0 = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.d0
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.d0 = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r3) {
            r2 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            int r1 = r2.d0
            r0 = r0 & r1
            if (r0 == r3) goto L13
            r0 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r1
            r3 = r3 | r0
            r2.d0 = r3
            r2.requestLayout()
        L13:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.g0 = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.R
            if (r0 == r2) goto L9
            r1.R = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.m0
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.m0 = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r0 = r2.d0
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L10
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | r0
            r2.d0 = r3
            r2.requestLayout()
        L10:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            r1.f0 = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
