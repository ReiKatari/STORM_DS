package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {
    public final defpackage.q A;
    public final android.content.Context B;
    public androidx.appcompat.widget.ActionMenuView L;
    public defpackage.g8 R;
    public int d0;
    public defpackage.ip7 e0;
    public boolean f0;
    public boolean g0;
    public java.lang.CharSequence h0;
    public java.lang.CharSequence i0;
    public android.view.View j0;
    public android.view.View k0;
    public android.view.View l0;
    public android.widget.LinearLayout m0;
    public android.widget.TextView n0;
    public android.widget.TextView o0;
    public final int p0;
    public final int q0;
    public boolean r0;
    public final int s0;

    public ActionBarContextView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2130968607(0x7f04001f, float:1.7545872E38)
            r6.<init>(r7, r8, r0)
            q r1 = new q
            r1.<init>()
            r1.c = r6
            r2 = 0
            r1.b = r2
            r6.A = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r7.getTheme()
            r4 = 2130968581(0x7f040005, float:1.754582E38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r1, r5)
            if (r3 == 0) goto L33
            int r3 = r1.resourceId
            if (r3 == 0) goto L33
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r3.<init>(r7, r1)
            r6.B = r3
            goto L35
        L33:
            r6.B = r7
        L35:
            int[] r1 = defpackage.m75.d
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r1, r0, r2)
            boolean r0 = r8.hasValue(r2)
            if (r0 == 0) goto L4c
            int r0 = r8.getResourceId(r2, r2)
            if (r0 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = defpackage.hf.S(r7, r0)
            goto L50
        L4c:
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r2)
        L50:
            r6.setBackground(r7)
            r7 = 5
            int r7 = r8.getResourceId(r7, r2)
            r6.p0 = r7
            r7 = 4
            int r7 = r8.getResourceId(r7, r2)
            r6.q0 = r7
            r7 = 3
            int r7 = r8.getLayoutDimension(r7, r2)
            r6.d0 = r7
            r7 = 2
            r0 = 2131623941(0x7f0e0005, float:1.8875048E38)
            int r7 = r8.getResourceId(r7, r0)
            r6.s0 = r7
            r8.recycle()
            return
    }

    public static /* synthetic */ void a(androidx.appcompat.widget.ActionBarContextView r1) {
            r0 = 0
            super.setVisibility(r0)
            return
    }

    public static /* synthetic */ void b(androidx.appcompat.widget.ActionBarContextView r0, int r1) {
            super.setVisibility(r1)
            return
    }

    public static int f(android.view.View r1, int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r1.measure(r0, r3)
            int r1 = r1.getMeasuredWidth()
            int r2 = r2 - r1
            r1 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public static int g(android.view.View r2, int r3, int r4, int r5, boolean r6) {
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getMeasuredHeight()
            int r5 = r5 - r1
            int r5 = r5 / 2
            int r5 = r5 + r4
            if (r6 == 0) goto L15
            int r4 = r3 - r0
            int r1 = r1 + r5
            r2.layout(r4, r5, r3, r1)
            goto L1b
        L15:
            int r4 = r3 + r0
            int r1 = r1 + r5
            r2.layout(r3, r5, r4, r1)
        L1b:
            if (r6 == 0) goto L1f
            int r2 = -r0
            return r2
        L1f:
            return r0
    }

    public final void c(defpackage.k8 r6) {
            r5 = this;
            android.view.View r0 = r5.j0
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.s0
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.j0 = r0
            r5.addView(r0)
            goto L24
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L24
            android.view.View r0 = r5.j0
            r5.addView(r0)
        L24:
            android.view.View r0 = r5.j0
            r2 = 2131427399(0x7f0b0047, float:1.8476413E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.k0 = r0
            r7 r2 = new r7
            r2.<init>(r6, r1)
            r0.setOnClickListener(r2)
            i44 r6 = r6.c()
            g8 r0 = r5.R
            if (r0 == 0) goto L51
            r0.e()
            d8 r0 = r0.p0
            if (r0 == 0) goto L51
            boolean r2 = r0.b()
            if (r2 == 0) goto L51
            t44 r0 = r0.i
            r0.dismiss()
        L51:
            g8 r0 = new g8
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.R = r0
            r2 = 1
            r0.h0 = r2
            r0.i0 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            g8 r2 = r5.R
            android.content.Context r3 = r5.B
            r6.b(r2, r3)
            g8 r6 = r5.R
            d54 r2 = r6.d0
            if (r2 != 0) goto L89
            android.view.LayoutInflater r3 = r6.R
            int r4 = r6.Y
            android.view.View r1 = r3.inflate(r4, r5, r1)
            d54 r1 = (defpackage.d54) r1
            r6.d0 = r1
            i44 r3 = r6.L
            r1.b(r3)
            r6.i()
        L89:
            d54 r1 = r6.d0
            if (r2 == r1) goto L93
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L93:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.L = r1
            r6 = 0
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.L
            r5.addView(r6, r0)
            return
    }

    public final void d() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.m0
            if (r0 != 0) goto L51
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131623936(0x7f0e0000, float:1.8875038E38)
            r0.inflate(r1, r6)
            int r0 = r6.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r6.getChildAt(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.m0 = r0
            r1 = 2131427386(0x7f0b003a, float:1.8476387E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.n0 = r0
            android.widget.LinearLayout r0 = r6.m0
            r1 = 2131427385(0x7f0b0039, float:1.8476385E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.o0 = r0
            int r0 = r6.p0
            if (r0 == 0) goto L44
            android.widget.TextView r1 = r6.n0
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L44:
            int r0 = r6.q0
            if (r0 == 0) goto L51
            android.widget.TextView r1 = r6.o0
            android.content.Context r2 = r6.getContext()
            r1.setTextAppearance(r2, r0)
        L51:
            android.widget.TextView r0 = r6.n0
            java.lang.CharSequence r1 = r6.h0
            r0.setText(r1)
            android.widget.TextView r0 = r6.o0
            java.lang.CharSequence r1 = r6.i0
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.h0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r1 = r6.i0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r2 = r6.o0
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L74
            r5 = r4
            goto L75
        L74:
            r5 = r3
        L75:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.m0
            if (r0 == 0) goto L7e
            if (r1 != 0) goto L7f
        L7e:
            r3 = r4
        L7f:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r6.m0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L8f
            android.widget.LinearLayout r0 = r6.m0
            r6.addView(r0)
        L8f:
            return
    }

    public final void e() {
            r1 = this;
            r1.removeAllViews()
            r0 = 0
            r1.l0 = r0
            r1.L = r0
            r1.R = r0
            android.view.View r1 = r1.k0
            if (r1 == 0) goto L11
            r1.setOnClickListener(r0)
        L11:
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1 = -2
            r2.<init>(r0, r1)
            return r2
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r2) {
            r1 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            return r0
    }

    public int getAnimatedVisibility() {
            r1 = this;
            ip7 r0 = r1.e0
            if (r0 == 0) goto L9
            q r1 = r1.A
            int r1 = r1.a
            return r1
        L9:
            int r1 = r1.getVisibility()
            return r1
    }

    public int getContentHeight() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.i0
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.h0
            return r0
    }

    public final void h(int r2) {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r2 == r0) goto L10
            ip7 r0 = r1.e0
            if (r0 == 0) goto Ld
            r0.b()
        Ld:
            super.setVisibility(r2)
        L10:
            return
    }

    public final defpackage.ip7 i(int r4, long r5) {
            r3 = this;
            ip7 r0 = r3.e0
            if (r0 == 0) goto L7
            r0.b()
        L7:
            q r0 = r3.A
            r1 = 0
            if (r4 != 0) goto L2d
            int r2 = r3.getVisibility()
            if (r2 == 0) goto L15
            r3.setAlpha(r1)
        L15:
            ip7 r3 = defpackage.ao7.b(r3)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.a(r1)
            r3.c(r5)
            java.lang.Object r5 = r0.c
            androidx.appcompat.widget.ActionBarContextView r5 = (androidx.appcompat.widget.ActionBarContextView) r5
            r5.e0 = r3
            r0.a = r4
            r3.d(r0)
            return r3
        L2d:
            ip7 r3 = defpackage.ao7.b(r3)
            r3.a(r1)
            r3.c(r5)
            java.lang.Object r5 = r0.c
            androidx.appcompat.widget.ActionBarContextView r5 = (androidx.appcompat.widget.ActionBarContextView) r5
            r5.e0 = r3
            r0.a = r4
            r3.d(r0)
            return r3
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
            r4 = this;
            super.onConfigurationChanged(r5)
            android.content.Context r5 = r4.getContext()
            r0 = 0
            int[] r1 = defpackage.m75.a
            r2 = 2130968584(0x7f040008, float:1.7545826E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r0, r1, r2, r3)
            r0 = 13
            int r0 = r5.getLayoutDimension(r0, r3)
            r4.setContentHeight(r0)
            r5.recycle()
            g8 r4 = r4.R
            if (r4 == 0) goto L6b
            android.content.Context r5 = r4.B
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r1 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r2 = 600(0x258, float:8.41E-43)
            if (r5 > r2) goto L60
            if (r0 > r2) goto L60
            r5 = 720(0x2d0, float:1.009E-42)
            r2 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r2) goto L40
            if (r1 > r5) goto L60
        L40:
            if (r0 <= r5) goto L45
            if (r1 <= r2) goto L45
            goto L60
        L45:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L5e
            r5 = 480(0x1e0, float:6.73E-43)
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L51
            if (r1 > r5) goto L5e
        L51:
            if (r0 <= r5) goto L56
            if (r1 <= r2) goto L56
            goto L5e
        L56:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5c
            r5 = 3
            goto L61
        L5c:
            r5 = 2
            goto L61
        L5e:
            r5 = 4
            goto L61
        L60:
            r5 = 5
        L61:
            r4.l0 = r5
            i44 r4 = r4.L
            if (r4 == 0) goto L6b
            r5 = 1
            r4.p(r5)
        L6b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            g8 r0 = r1.R
            if (r0 == 0) goto L1b
            r0.e()
            g8 r1 = r1.R
            d8 r1 = r1.p0
            if (r1 == 0) goto L1b
            boolean r0 = r1.b()
            if (r0 == 0) goto L1b
            t44 r1 = r1.i
            r1.dismiss()
        L1b:
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.g0 = r1
        Lb:
            boolean r3 = r5.g0
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.g0 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.g0 = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            boolean r6 = defpackage.eq7.a
            int r6 = r5.getLayoutDirection()
            r0 = 1
            if (r6 != r0) goto Lb
            r6 = r0
            goto Lc
        Lb:
            r6 = 0
        Lc:
            if (r6 == 0) goto L16
            int r1 = r9 - r7
            int r2 = r5.getPaddingRight()
            int r1 = r1 - r2
            goto L1a
        L16:
            int r1 = r5.getPaddingLeft()
        L1a:
            int r2 = r5.getPaddingTop()
            int r10 = r10 - r8
            int r8 = r5.getPaddingTop()
            int r10 = r10 - r8
            int r8 = r5.getPaddingBottom()
            int r10 = r10 - r8
            android.view.View r8 = r5.j0
            r3 = 8
            if (r8 == 0) goto L5e
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L5e
            android.view.View r8 = r5.j0
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            if (r6 == 0) goto L42
            int r4 = r8.rightMargin
            goto L44
        L42:
            int r4 = r8.leftMargin
        L44:
            if (r6 == 0) goto L49
            int r8 = r8.leftMargin
            goto L4b
        L49:
            int r8 = r8.rightMargin
        L4b:
            if (r6 == 0) goto L4f
            int r1 = r1 - r4
            goto L50
        L4f:
            int r1 = r1 + r4
        L50:
            android.view.View r4 = r5.j0
            int r4 = g(r4, r1, r2, r10, r6)
            int r4 = r4 + r1
            if (r6 == 0) goto L5c
            int r4 = r4 - r8
        L5a:
            r1 = r4
            goto L5e
        L5c:
            int r4 = r4 + r8
            goto L5a
        L5e:
            android.widget.LinearLayout r8 = r5.m0
            if (r8 == 0) goto L73
            android.view.View r4 = r5.l0
            if (r4 != 0) goto L73
            int r8 = r8.getVisibility()
            if (r8 == r3) goto L73
            android.widget.LinearLayout r8 = r5.m0
            int r8 = g(r8, r1, r2, r10, r6)
            int r1 = r1 + r8
        L73:
            android.view.View r8 = r5.l0
            if (r8 == 0) goto L7a
            g(r8, r1, r2, r10, r6)
        L7a:
            if (r6 == 0) goto L81
            int r7 = r5.getPaddingLeft()
            goto L88
        L81:
            int r9 = r9 - r7
            int r7 = r5.getPaddingRight()
            int r7 = r9 - r7
        L88:
            androidx.appcompat.widget.ActionMenuView r5 = r5.L
            if (r5 == 0) goto L90
            r6 = r6 ^ r0
            g(r5, r7, r2, r10, r6)
        L90:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Lf4
            int r0 = android.view.View.MeasureSpec.getMode(r12)
            if (r0 == 0) goto Le2
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.d0
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L1b:
            int r12 = r10.getPaddingTop()
            int r2 = r10.getPaddingBottom()
            int r2 = r2 + r12
            int r12 = r10.getPaddingLeft()
            int r12 = r11 - r12
            int r3 = r10.getPaddingRight()
            int r12 = r12 - r3
            int r3 = r0 - r2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            android.view.View r6 = r10.j0
            if (r6 == 0) goto L4d
            int r12 = f(r6, r12, r5)
            android.view.View r6 = r10.j0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r12 = r12 - r7
        L4d:
            androidx.appcompat.widget.ActionMenuView r6 = r10.L
            if (r6 == 0) goto L5d
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != r10) goto L5d
            androidx.appcompat.widget.ActionMenuView r6 = r10.L
            int r12 = f(r6, r12, r5)
        L5d:
            android.widget.LinearLayout r6 = r10.m0
            r7 = 0
            if (r6 == 0) goto L91
            android.view.View r8 = r10.l0
            if (r8 != 0) goto L91
            boolean r8 = r10.r0
            if (r8 == 0) goto L8d
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r7)
            android.widget.LinearLayout r8 = r10.m0
            r8.measure(r6, r5)
            android.widget.LinearLayout r5 = r10.m0
            int r5 = r5.getMeasuredWidth()
            if (r5 > r12) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r6 == 0) goto L81
            int r12 = r12 - r5
        L81:
            android.widget.LinearLayout r5 = r10.m0
            if (r6 == 0) goto L87
            r6 = r7
            goto L89
        L87:
            r6 = 8
        L89:
            r5.setVisibility(r6)
            goto L91
        L8d:
            int r12 = f(r6, r12, r5)
        L91:
            android.view.View r5 = r10.l0
            if (r5 == 0) goto Lc0
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r6 = r5.width
            r8 = -2
            if (r6 == r8) goto La0
            r9 = r1
            goto La1
        La0:
            r9 = r4
        La1:
            if (r6 < 0) goto La7
            int r12 = java.lang.Math.min(r6, r12)
        La7:
            int r5 = r5.height
            if (r5 == r8) goto Lac
            goto Lad
        Lac:
            r1 = r4
        Lad:
            if (r5 < 0) goto Lb3
            int r3 = java.lang.Math.min(r5, r3)
        Lb3:
            android.view.View r4 = r10.l0
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r12, r1)
        Lc0:
            int r12 = r10.d0
            if (r12 > 0) goto Lde
            int r12 = r10.getChildCount()
            r0 = r7
        Lc9:
            if (r7 >= r12) goto Lda
            android.view.View r1 = r10.getChildAt(r7)
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            if (r1 <= r0) goto Ld7
            r0 = r1
        Ld7:
            int r7 = r7 + 1
            goto Lc9
        Lda:
            r10.setMeasuredDimension(r11, r0)
            return
        Lde:
            r10.setMeasuredDimension(r11, r0)
            return
        Le2:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.String r10 = r10.concat(r11)
            defpackage.i.m(r10)
            return
        Lf4:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.String r10 = r10.concat(r11)
            defpackage.i.m(r10)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.f0 = r1
        L9:
            boolean r2 = r4.f0
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.f0 = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.f0 = r1
            return r3
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.d0 = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.l0
            if (r0 == 0) goto L7
            r1.removeView(r0)
        L7:
            r1.l0 = r2
            if (r2 == 0) goto L15
            android.widget.LinearLayout r0 = r1.m0
            if (r0 == 0) goto L15
            r1.removeView(r0)
            r0 = 0
            r1.m0 = r0
        L15:
            if (r2 == 0) goto L1a
            r1.addView(r2)
        L1a:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.i0 = r1
            r0.d()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.h0 = r1
            r0.d()
            defpackage.ao7.o(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.r0
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.r0 = r2
            return
    }

    @Override // android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            r0.h(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }
}
