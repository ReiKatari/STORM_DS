package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionMenuView extends defpackage.dv3 implements defpackage.h44, defpackage.d54 {
    public defpackage.i44 o0;
    public android.content.Context p0;
    public int q0;
    public boolean r0;
    public defpackage.g8 s0;
    public defpackage.g60 t0;
    public defpackage.g44 u0;
    public boolean v0;
    public int w0;
    public final int x0;
    public final int y0;
    public defpackage.j8 z0;

    public ActionMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r4, r0)
            r2.setBaselineAligned(r0)
            android.content.res.Resources r4 = r3.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r4
            int r1 = (int) r1
            r2.x0 = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.y0 = r4
            r2.p0 = r3
            r2.q0 = r0
            return
    }

    public static defpackage.i8 j() {
            i8 r0 = new i8
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.a = r1
            r1 = 16
            r0.gravity = r1
            return r0
    }

    public static defpackage.i8 k(android.view.ViewGroup.LayoutParams r1) {
            if (r1 == 0) goto L20
            boolean r0 = r1 instanceof defpackage.i8
            if (r0 == 0) goto L12
            i8 r0 = new i8
            i8 r1 = (defpackage.i8) r1
            r0.<init>(r1)
            boolean r1 = r1.a
            r0.a = r1
            goto L17
        L12:
            i8 r0 = new i8
            r0.<init>(r1)
        L17:
            int r1 = r0.gravity
            if (r1 > 0) goto L1f
            r1 = 16
            r0.gravity = r1
        L1f:
            return r0
        L20:
            i8 r1 = j()
            return r1
    }

    @Override // defpackage.h44
    public final boolean a(defpackage.o44 r3) {
            r2 = this;
            i44 r2 = r2.o0
            r0 = 0
            r1 = 0
            boolean r2 = r2.q(r3, r1, r0)
            return r2
    }

    @Override // defpackage.d54
    public final void b(defpackage.i44 r1) {
            r0 = this;
            r0.o0 = r1
            return
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.i8
            return r0
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.dv3
    public final /* bridge */ /* synthetic */ defpackage.cv3 f() {
            r0 = this;
            i8 r0 = j()
            return r0
    }

    @Override // defpackage.dv3
    public final defpackage.cv3 g(android.util.AttributeSet r2) {
            r1 = this;
            i8 r0 = new i8
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            i8 r0 = j()
            return r0
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            i8 r0 = new i8
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.dv3, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            i8 r0 = k(r1)
            return r0
    }

    public android.view.Menu getMenu() {
            r4 = this;
            i44 r0 = r4.o0
            if (r0 != 0) goto L40
            android.content.Context r0 = r4.getContext()
            i44 r1 = new i44
            r1.<init>(r0)
            r4.o0 = r1
            os0 r2 = new os0
            r3 = 6
            r2.<init>(r4, r3)
            r1.e = r2
            g8 r1 = new g8
            r1.<init>(r0)
            r4.s0 = r1
            r0 = 1
            r1.h0 = r0
            r1.i0 = r0
            g60 r0 = r4.t0
            if (r0 == 0) goto L28
            goto L2f
        L28:
            xd5 r0 = new xd5
            r2 = 21
            r0.<init>(r2)
        L2f:
            r1.X = r0
            i44 r0 = r4.o0
            android.content.Context r2 = r4.p0
            r0.b(r1, r2)
            g8 r0 = r4.s0
            r0.d0 = r4
            i44 r0 = r0.L
            r4.o0 = r0
        L40:
            i44 r4 = r4.o0
            return r4
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.getMenu()
            g8 r1 = r1.s0
            f8 r0 = r1.e0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            return r1
        Le:
            boolean r0 = r1.g0
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r1 = r1.f0
            return r1
        L15:
            r1 = 0
            return r1
    }

    public int getPopupTheme() {
            r0 = this;
            int r0 = r0.q0
            return r0
    }

    public int getWindowAnimations() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.dv3
    public final /* bridge */ /* synthetic */ defpackage.cv3 h(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            i8 r0 = k(r1)
            return r0
    }

    public final boolean l(int r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4 + (-1)
            android.view.View r1 = r3.getChildAt(r1)
            android.view.View r2 = r3.getChildAt(r4)
            int r3 = r3.getChildCount()
            if (r4 >= r3) goto L1e
            boolean r3 = r1 instanceof defpackage.h8
            if (r3 == 0) goto L1e
            h8 r1 = (defpackage.h8) r1
            boolean r0 = r1.a()
        L1e:
            if (r4 <= 0) goto L2c
            boolean r3 = r2 instanceof defpackage.h8
            if (r3 == 0) goto L2c
            h8 r2 = (defpackage.h8) r2
            boolean r3 = r2.b()
            r3 = r3 | r0
            return r3
        L2c:
            return r0
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            g8 r1 = r0.s0
            if (r1 == 0) goto L1c
            r1.i()
            g8 r1 = r0.s0
            boolean r1 = r1.j()
            if (r1 == 0) goto L1c
            g8 r1 = r0.s0
            r1.e()
            g8 r0 = r0.s0
            r0.l()
        L1c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            g8 r1 = r1.s0
            if (r1 == 0) goto L19
            r1.e()
            d8 r1 = r1.p0
            if (r1 == 0) goto L19
            boolean r0 = r1.b()
            if (r0 == 0) goto L19
            t44 r1 = r1.i
            r1.dismiss()
        L19:
            return
    }

    @Override // defpackage.dv3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.v0
            if (r1 != 0) goto La
            super.onLayout(r18, r19, r20, r21, r22)
            return
        La:
            int r1 = r0.getChildCount()
            int r2 = r22 - r20
            int r2 = r2 / 2
            int r3 = r0.getDividerWidth()
            int r4 = r21 - r19
            int r5 = r0.getPaddingRight()
            int r5 = r4 - r5
            int r6 = r0.getPaddingLeft()
            int r5 = r5 - r6
            boolean r6 = defpackage.eq7.a
            int r6 = r0.getLayoutDirection()
            r7 = 1
            if (r6 != r7) goto L2e
            r6 = r7
            goto L2f
        L2e:
            r6 = 0
        L2f:
            r9 = 0
            r10 = 0
            r11 = 0
        L32:
            r12 = 8
            if (r9 >= r1) goto L94
            android.view.View r13 = r0.getChildAt(r9)
            int r14 = r13.getVisibility()
            if (r14 != r12) goto L41
            goto L91
        L41:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            i8 r12 = (defpackage.i8) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L81
            int r10 = r13.getMeasuredWidth()
            boolean r14 = r0.l(r9)
            if (r14 == 0) goto L56
            int r10 = r10 + r3
        L56:
            int r14 = r13.getMeasuredHeight()
            if (r6 == 0) goto L66
            int r15 = r0.getPaddingLeft()
            int r12 = r12.leftMargin
            int r15 = r15 + r12
            int r12 = r15 + r10
            goto L76
        L66:
            int r15 = r0.getWidth()
            int r16 = r0.getPaddingRight()
            int r15 = r15 - r16
            int r12 = r12.rightMargin
            int r12 = r15 - r12
            int r15 = r12 - r10
        L76:
            int r16 = r14 / 2
            int r8 = r2 - r16
            int r14 = r14 + r8
            r13.layout(r15, r8, r12, r14)
            int r5 = r5 - r10
            r10 = r7
            goto L91
        L81:
            int r8 = r13.getMeasuredWidth()
            int r13 = r12.leftMargin
            int r8 = r8 + r13
            int r12 = r12.rightMargin
            int r8 = r8 + r12
            int r5 = r5 - r8
            r0.l(r9)
            int r11 = r11 + 1
        L91:
            int r9 = r9 + 1
            goto L32
        L94:
            if (r1 != r7) goto Lb3
            if (r10 != 0) goto Lb3
            r3 = 0
            android.view.View r0 = r0.getChildAt(r3)
            int r1 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            int r4 = r4 / 2
            int r5 = r1 / 2
            int r4 = r4 - r5
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r1 = r1 + r4
            int r3 = r3 + r2
            r0.layout(r4, r2, r1, r3)
            return
        Lb3:
            r3 = r10 ^ 1
            int r11 = r11 - r3
            if (r11 <= 0) goto Lbc
            int r3 = r5 / r11
        Lba:
            r4 = 0
            goto Lbe
        Lbc:
            r3 = 0
            goto Lba
        Lbe:
            int r3 = java.lang.Math.max(r4, r3)
            if (r6 == 0) goto L102
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            r8 = r4
        Lce:
            if (r8 >= r1) goto L13c
            android.view.View r4 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            i8 r6 = (defpackage.i8) r6
            int r7 = r4.getVisibility()
            if (r7 == r12) goto Lff
            boolean r7 = r6.a
            if (r7 == 0) goto Le5
            goto Lff
        Le5:
            int r7 = r6.rightMargin
            int r5 = r5 - r7
            int r7 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r11 = r5 - r7
            int r9 = r9 + r10
            r4.layout(r11, r10, r5, r9)
            int r4 = r6.leftMargin
            int r7 = r7 + r4
            int r7 = r7 + r3
            int r5 = r5 - r7
        Lff:
            int r8 = r8 + 1
            goto Lce
        L102:
            int r5 = r0.getPaddingLeft()
            r8 = r4
        L107:
            if (r8 >= r1) goto L13c
            android.view.View r4 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            i8 r6 = (defpackage.i8) r6
            int r7 = r4.getVisibility()
            if (r7 == r12) goto L139
            boolean r7 = r6.a
            if (r7 == 0) goto L11e
            goto L139
        L11e:
            int r7 = r6.leftMargin
            int r5 = r5 + r7
            int r7 = r4.getMeasuredWidth()
            int r9 = r4.getMeasuredHeight()
            int r10 = r9 / 2
            int r10 = r2 - r10
            int r11 = r5 + r7
            int r9 = r9 + r10
            r4.layout(r5, r10, r11, r9)
            int r4 = r6.rightMargin
            int r7 = r7 + r4
            int r7 = r7 + r3
            int r7 = r7 + r5
            r5 = r7
        L139:
            int r8 = r8 + 1
            goto L107
        L13c:
            return
    }

    @Override // defpackage.dv3, android.view.View
    public final void onMeasure(int r31, int r32) {
            r30 = this;
            r0 = r30
            boolean r1 = r0.v0
            int r2 = android.view.View.MeasureSpec.getMode(r31)
            r3 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 != r5) goto L10
            r2 = r3
            goto L11
        L10:
            r2 = r4
        L11:
            r0.v0 = r2
            if (r1 == r2) goto L17
            r0.w0 = r4
        L17:
            int r1 = android.view.View.MeasureSpec.getSize(r31)
            boolean r2 = r0.v0
            if (r2 == 0) goto L2c
            i44 r2 = r0.o0
            if (r2 == 0) goto L2c
            int r6 = r0.w0
            if (r1 == r6) goto L2c
            r0.w0 = r1
            r2.p(r3)
        L2c:
            int r1 = r0.getChildCount()
            boolean r2 = r0.v0
            if (r2 == 0) goto L2fb
            if (r1 <= 0) goto L2fb
            int r1 = android.view.View.MeasureSpec.getMode(r32)
            int r2 = android.view.View.MeasureSpec.getSize(r31)
            int r6 = android.view.View.MeasureSpec.getSize(r32)
            int r7 = r0.getPaddingLeft()
            int r8 = r0.getPaddingRight()
            int r8 = r8 + r7
            int r7 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r9 = r9 + r7
            r7 = -2
            r10 = r32
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r10, r9, r7)
            int r2 = r2 - r8
            int r8 = r0.x0
            int r10 = r2 / r8
            int r11 = r2 % r8
            if (r10 != 0) goto L68
            r0.setMeasuredDimension(r2, r4)
            return
        L68:
            int r11 = r11 / r10
            int r11 = r11 + r8
            int r8 = r0.getChildCount()
            r3 = r4
            r12 = r3
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r31 = 0
            r18 = 0
        L79:
            int r5 = r0.y0
            if (r14 >= r8) goto L166
            android.view.View r4 = r0.getChildAt(r14)
            r21 = r6
            int r6 = r4.getVisibility()
            r22 = r9
            r9 = 8
            if (r6 != r9) goto L91
            r23 = r11
            goto L15b
        L91:
            boolean r6 = r4 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r12 = r12 + 1
            r9 = 0
            if (r6 == 0) goto L9b
            r4.setPadding(r5, r9, r5, r9)
        L9b:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            i8 r5 = (defpackage.i8) r5
            r5.f = r9
            r5.c = r9
            r5.b = r9
            r5.d = r9
            r5.leftMargin = r9
            r5.rightMargin = r9
            if (r6 == 0) goto Lbe
            r9 = r4
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            java.lang.CharSequence r9 = r9.getText()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto Lbe
            r9 = 1
            goto Lbf
        Lbe:
            r9 = 0
        Lbf:
            r5.e = r9
            boolean r9 = r5.a
            if (r9 == 0) goto Lc7
            r9 = 1
            goto Lc8
        Lc7:
            r9 = r10
        Lc8:
            android.view.ViewGroup$LayoutParams r23 = r4.getLayoutParams()
            r24 = r6
            r6 = r23
            i8 r6 = (defpackage.i8) r6
            int r23 = android.view.View.MeasureSpec.getSize(r7)
            r25 = r10
            int r10 = r23 - r22
            r23 = r11
            int r11 = android.view.View.MeasureSpec.getMode(r7)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            if (r24 == 0) goto Lea
            r11 = r4
            androidx.appcompat.view.menu.ActionMenuItemView r11 = (androidx.appcompat.view.menu.ActionMenuItemView) r11
            goto Leb
        Lea:
            r11 = 0
        Leb:
            if (r11 == 0) goto Lf9
            java.lang.CharSequence r11 = r11.getText()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto Lf9
            r11 = 1
            goto Lfa
        Lf9:
            r11 = 0
        Lfa:
            r24 = r11
            if (r9 <= 0) goto L121
            if (r11 == 0) goto L103
            r11 = 2
            if (r9 < r11) goto L121
        L103:
            int r11 = r23 * r9
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r9)
            r4.measure(r9, r10)
            int r9 = r4.getMeasuredWidth()
            int r11 = r9 / r23
            int r9 = r9 % r23
            if (r9 == 0) goto L11a
            int r11 = r11 + 1
        L11a:
            if (r24 == 0) goto L122
            r9 = 2
            if (r11 >= r9) goto L122
            r11 = 2
            goto L122
        L121:
            r11 = 0
        L122:
            boolean r9 = r6.a
            if (r9 != 0) goto L12a
            if (r24 == 0) goto L12a
            r9 = 1
            goto L12b
        L12a:
            r9 = 0
        L12b:
            r6.d = r9
            r6.b = r11
            int r6 = r11 * r23
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r4.measure(r6, r10)
            int r13 = java.lang.Math.max(r13, r11)
            boolean r6 = r5.d
            if (r6 == 0) goto L144
            int r16 = r16 + 1
        L144:
            boolean r5 = r5.a
            if (r5 == 0) goto L149
            r15 = 1
        L149:
            int r10 = r25 - r11
            int r4 = r4.getMeasuredHeight()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 1
            if (r11 != r4) goto L15b
            int r5 = r4 << r14
            long r4 = (long) r5
            long r18 = r18 | r4
        L15b:
            int r14 = r14 + 1
            r6 = r21
            r9 = r22
            r11 = r23
            r4 = 0
            goto L79
        L166:
            r21 = r6
            r25 = r10
            r23 = r11
            if (r15 == 0) goto L173
            r9 = 2
            if (r12 != r9) goto L173
            r4 = 1
            goto L174
        L173:
            r4 = 0
        L174:
            r10 = r25
            r6 = 0
        L177:
            r24 = 1
            if (r16 <= 0) goto L208
            if (r10 <= 0) goto L208
            r9 = 2147483647(0x7fffffff, float:NaN)
            r26 = r31
            r11 = 0
            r14 = 0
        L184:
            if (r14 >= r8) goto L1b4
            android.view.View r22 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r22 = r22.getLayoutParams()
            r28 = r3
            r3 = r22
            i8 r3 = (defpackage.i8) r3
            r22 = r4
            boolean r4 = r3.d
            if (r4 != 0) goto L19b
            goto L1ad
        L19b:
            int r3 = r3.b
            if (r3 >= r9) goto L1a4
            long r26 = r24 << r14
            r9 = r3
            r11 = 1
            goto L1ad
        L1a4:
            if (r3 != r9) goto L1ad
            long r3 = r24 << r14
            long r26 = r26 | r3
            int r3 = r11 + 1
            r11 = r3
        L1ad:
            int r14 = r14 + 1
            r4 = r22
            r3 = r28
            goto L184
        L1b4:
            r28 = r3
            r22 = r4
            long r18 = r18 | r26
            if (r11 <= r10) goto L1bf
        L1bc:
            r29 = r15
            goto L20b
        L1bf:
            int r9 = r9 + 1
            r3 = 0
        L1c2:
            if (r3 >= r8) goto L201
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            i8 r6 = (defpackage.i8) r6
            r17 = 1
            int r11 = r17 << r3
            r29 = r15
            long r14 = (long) r11
            long r24 = r26 & r14
            int r11 = (r24 > r31 ? 1 : (r24 == r31 ? 0 : -1))
            if (r11 != 0) goto L1e2
            int r4 = r6.b
            if (r4 != r9) goto L1fc
            long r18 = r18 | r14
            goto L1fc
        L1e2:
            if (r22 == 0) goto L1f2
            boolean r11 = r6.e
            if (r11 == 0) goto L1f2
            r11 = 1
            if (r10 != r11) goto L1f3
            int r14 = r5 + r23
            r15 = 0
            r4.setPadding(r14, r15, r5, r15)
            goto L1f3
        L1f2:
            r11 = 1
        L1f3:
            int r4 = r6.b
            int r4 = r4 + r11
            r6.b = r4
            r6.f = r11
            int r10 = r10 + (-1)
        L1fc:
            int r3 = r3 + 1
            r15 = r29
            goto L1c2
        L201:
            r4 = r22
            r3 = r28
            r6 = 1
            goto L177
        L208:
            r28 = r3
            goto L1bc
        L20b:
            r4 = 1
            if (r29 != 0) goto L212
            if (r12 != r4) goto L212
            r3 = r4
            goto L213
        L212:
            r3 = 0
        L213:
            if (r10 <= 0) goto L2c5
            int r5 = (r18 > r31 ? 1 : (r18 == r31 ? 0 : -1))
            if (r5 == 0) goto L2c5
            int r12 = r12 - r4
            if (r10 < r12) goto L220
            if (r3 != 0) goto L220
            if (r13 <= r4) goto L2c5
        L220:
            int r4 = java.lang.Long.bitCount(r18)
            float r4 = (float) r4
            if (r3 != 0) goto L25b
            long r11 = r18 & r24
            int r3 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L23f
            r15 = 0
            android.view.View r3 = r0.getChildAt(r15)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            i8 r3 = (defpackage.i8) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L23f
            float r4 = r4 - r5
        L23f:
            int r3 = r8 + (-1)
            r17 = 1
            int r9 = r17 << r3
            long r11 = (long) r9
            long r11 = r18 & r11
            int r9 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r9 == 0) goto L25b
            android.view.View r3 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            i8 r3 = (defpackage.i8) r3
            boolean r3 = r3.e
            if (r3 != 0) goto L25b
            float r4 = r4 - r5
        L25b:
            r3 = 0
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L266
            int r10 = r10 * r23
            float r3 = (float) r10
            float r3 = r3 / r4
            int r9 = (int) r3
            goto L267
        L266:
            r9 = 0
        L267:
            r4 = r6
            r3 = 0
        L269:
            if (r3 >= r8) goto L2c4
            r17 = 1
            int r5 = r17 << r3
            long r5 = (long) r5
            long r5 = r18 & r5
            int r5 = (r5 > r31 ? 1 : (r5 == r31 ? 0 : -1))
            if (r5 != 0) goto L27a
            r11 = 1
            r20 = 2
            goto L2c1
        L27a:
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            i8 r6 = (defpackage.i8) r6
            boolean r5 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r5 == 0) goto L2a0
            r6.c = r9
            r4 = 1
            r6.f = r4
            if (r3 != 0) goto L29b
            boolean r4 = r6.e
            if (r4 != 0) goto L29b
            int r4 = -r9
            r20 = 2
            int r4 = r4 / 2
            r6.leftMargin = r4
            goto L29d
        L29b:
            r20 = 2
        L29d:
            r4 = 1
            r11 = 1
            goto L2c1
        L2a0:
            r20 = 2
            boolean r5 = r6.a
            if (r5 == 0) goto L2b2
            r6.c = r9
            r11 = 1
            r6.f = r11
            int r4 = -r9
            int r4 = r4 / 2
            r6.rightMargin = r4
            r4 = r11
            goto L2c1
        L2b2:
            r11 = 1
            if (r3 == 0) goto L2b9
            int r5 = r9 / 2
            r6.leftMargin = r5
        L2b9:
            int r5 = r8 + (-1)
            if (r3 == r5) goto L2c1
            int r5 = r9 / 2
            r6.rightMargin = r5
        L2c1:
            int r3 = r3 + 1
            goto L269
        L2c4:
            r6 = r4
        L2c5:
            if (r6 == 0) goto L2ee
            r4 = 0
        L2c8:
            if (r4 >= r8) goto L2ee
            android.view.View r3 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            i8 r5 = (defpackage.i8) r5
            boolean r6 = r5.f
            if (r6 != 0) goto L2db
            r9 = 1073741824(0x40000000, float:2.0)
            goto L2eb
        L2db:
            int r6 = r5.b
            int r6 = r6 * r23
            int r5 = r5.c
            int r6 = r6 + r5
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r3.measure(r5, r7)
        L2eb:
            int r4 = r4 + 1
            goto L2c8
        L2ee:
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r9) goto L2f5
            r6 = r28
            goto L2f7
        L2f5:
            r6 = r21
        L2f7:
            r0.setMeasuredDimension(r2, r6)
            return
        L2fb:
            r10 = r32
            r9 = 0
        L2fe:
            if (r9 >= r1) goto L312
            android.view.View r2 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            i8 r2 = (defpackage.i8) r2
            r15 = 0
            r2.rightMargin = r15
            r2.leftMargin = r15
            int r9 = r9 + 1
            goto L2fe
        L312:
            super.onMeasure(r31, r32)
            return
    }

    public void setExpandedActionViewsExclusive(boolean r1) {
            r0 = this;
            g8 r0 = r0.s0
            r0.m0 = r1
            return
    }

    public void setOnMenuItemClickListener(defpackage.j8 r1) {
            r0 = this;
            r0.z0 = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.getMenu()
            g8 r1 = r1.s0
            f8 r0 = r1.e0
            if (r0 == 0) goto Ld
            r0.setImageDrawable(r2)
            return
        Ld:
            r0 = 1
            r1.g0 = r0
            r1.f0 = r2
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.q0
            if (r0 == r3) goto L1a
            r2.q0 = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.p0 = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.p0 = r0
        L1a:
            return
    }

    public void setPresenter(defpackage.g8 r1) {
            r0 = this;
            r0.s0 = r1
            r1.d0 = r0
            i44 r1 = r1.L
            r0.o0 = r1
            return
    }
}
