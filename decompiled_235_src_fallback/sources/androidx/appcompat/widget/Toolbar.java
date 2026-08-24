package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements defpackage.l44 {
    public androidx.appcompat.widget.ActionMenuView A;
    public boolean A0;
    public defpackage.qs B;
    public boolean B0;
    public final java.util.ArrayList C0;
    public final java.util.ArrayList D0;
    public final int[] E0;
    public final defpackage.m44 F0;
    public java.util.ArrayList G0;
    public defpackage.f87 H0;
    public final defpackage.r9 I0;
    public defpackage.l87 J0;
    public defpackage.g8 K0;
    public defpackage.qs L;
    public defpackage.d87 L0;
    public defpackage.g60 M0;
    public defpackage.h87 N0;
    public boolean O0;
    public android.window.OnBackInvokedCallback P0;
    public android.window.OnBackInvokedDispatcher Q0;
    public defpackage.mr R;
    public boolean R0;
    public final defpackage.g15 S0;
    public defpackage.nr d0;
    public final android.graphics.drawable.Drawable e0;
    public final java.lang.CharSequence f0;
    public defpackage.mr g0;
    public android.view.View h0;
    public android.content.Context i0;
    public int j0;
    public int k0;
    public int l0;
    public final int m0;
    public final int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public defpackage.o26 s0;
    public int t0;
    public int u0;
    public final int v0;
    public java.lang.CharSequence w0;
    public java.lang.CharSequence x0;
    public android.content.res.ColorStateList y0;
    public android.content.res.ColorStateList z0;

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r5 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r9.<init>(r10, r11, r5)
            r12 = 8388627(0x800013, float:1.175497E-38)
            r9.v0 = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.C0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.D0 = r0
            r6 = 2
            int[] r0 = new int[r6]
            r9.E0 = r0
            m44 r0 = new m44
            b87 r1 = new b87
            r2 = 1
            r1.<init>(r9, r2)
            r0.<init>(r1)
            r9.F0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.G0 = r0
            r9 r0 = new r9
            r0.<init>(r9)
            r9.I0 = r0
            g15 r0 = new g15
            r7 = 24
            r0.<init>(r9, r7)
            r9.S0 = r0
            android.content.Context r0 = r9.getContext()
            int[] r2 = defpackage.m75.y
            m44 r8 = defpackage.m44.A(r0, r11, r2, r5)
            java.lang.Object r0 = r8.L
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r9
            r1 = r10
            r3 = r11
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            java.lang.Object r9 = r8.L
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 28
            r11 = 0
            int r10 = r9.getResourceId(r10, r11)
            r0.k0 = r10
            r10 = 19
            int r10 = r9.getResourceId(r10, r11)
            r0.l0 = r10
            int r10 = r9.getInteger(r11, r12)
            r0.v0 = r10
            r10 = 48
            int r10 = r9.getInteger(r6, r10)
            r0.m0 = r10
            r10 = 22
            int r10 = r9.getDimensionPixelOffset(r10, r11)
            r12 = 27
            boolean r1 = r9.hasValue(r12)
            if (r1 == 0) goto L8c
            int r10 = r9.getDimensionPixelOffset(r12, r10)
        L8c:
            r0.r0 = r10
            r0.q0 = r10
            r0.p0 = r10
            r0.o0 = r10
            r10 = 25
            r12 = -1
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            if (r10 < 0) goto L9f
            r0.o0 = r10
        L9f:
            int r10 = r9.getDimensionPixelOffset(r7, r12)
            if (r10 < 0) goto La7
            r0.p0 = r10
        La7:
            r10 = 26
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            if (r10 < 0) goto Lb1
            r0.q0 = r10
        Lb1:
            r10 = 23
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            if (r10 < 0) goto Lbb
            r0.r0 = r10
        Lbb:
            r10 = 13
            int r10 = r9.getDimensionPixelSize(r10, r12)
            r0.n0 = r10
            r10 = 9
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            r1 = 5
            int r1 = r9.getDimensionPixelOffset(r1, r12)
            r2 = 7
            int r2 = r9.getDimensionPixelSize(r2, r11)
            r3 = 8
            int r3 = r9.getDimensionPixelSize(r3, r11)
            r0.d()
            o26 r4 = r0.s0
            r4.h = r11
            if (r2 == r12) goto Le8
            r4.e = r2
            r4.a = r2
        Le8:
            if (r3 == r12) goto Lee
            r4.f = r3
            r4.b = r3
        Lee:
            if (r10 != r12) goto Lf2
            if (r1 == r12) goto Lf5
        Lf2:
            r4.a(r10, r1)
        Lf5:
            r10 = 10
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            r0.t0 = r10
            r10 = 6
            int r10 = r9.getDimensionPixelOffset(r10, r12)
            r0.u0 = r10
            r10 = 4
            android.graphics.drawable.Drawable r10 = r8.k(r10)
            r0.e0 = r10
            r10 = 3
            java.lang.CharSequence r10 = r9.getText(r10)
            r0.f0 = r10
            r10 = 21
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L121
            r0.setTitle(r10)
        L121:
            r10 = 18
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L130
            r0.setSubtitle(r10)
        L130:
            android.content.Context r10 = r0.getContext()
            r0.i0 = r10
            r10 = 17
            int r10 = r9.getResourceId(r10, r11)
            r0.setPopupTheme(r10)
            r10 = 16
            android.graphics.drawable.Drawable r10 = r8.k(r10)
            if (r10 == 0) goto L14a
            r0.setNavigationIcon(r10)
        L14a:
            r10 = 15
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L159
            r0.setNavigationContentDescription(r10)
        L159:
            r10 = 11
            android.graphics.drawable.Drawable r10 = r8.k(r10)
            if (r10 == 0) goto L164
            r0.setLogo(r10)
        L164:
            r10 = 12
            java.lang.CharSequence r10 = r9.getText(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L173
            r0.setLogoDescription(r10)
        L173:
            r10 = 29
            boolean r12 = r9.hasValue(r10)
            if (r12 == 0) goto L182
            android.content.res.ColorStateList r10 = r8.g(r10)
            r0.setTitleTextColor(r10)
        L182:
            r10 = 20
            boolean r12 = r9.hasValue(r10)
            if (r12 == 0) goto L191
            android.content.res.ColorStateList r10 = r8.g(r10)
            r0.setSubtitleTextColor(r10)
        L191:
            r10 = 14
            boolean r12 = r9.hasValue(r10)
            if (r12 == 0) goto L1a8
            int r9 = r9.getResourceId(r10, r11)
            android.view.MenuInflater r10 = r0.getMenuInflater()
            android.view.Menu r11 = r0.getMenu()
            r10.inflate(r9, r11)
        L1a8:
            r8.D()
            return
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r3 = r3.getMenu()
            r1 = 0
        La:
            int r2 = r3.size()
            if (r1 >= r2) goto L1a
            android.view.MenuItem r2 = r3.getItem(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r1 = this;
            ku6 r0 = new ku6
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    public static defpackage.e87 h() {
            e87 r0 = new e87
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 0
            r0.b = r1
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.a = r1
            return r0
    }

    public static defpackage.e87 j(android.view.ViewGroup.LayoutParams r2) {
            boolean r0 = r2 instanceof defpackage.e87
            r1 = 0
            if (r0 == 0) goto L13
            e87 r0 = new e87
            e87 r2 = (defpackage.e87) r2
            r0.<init>(r2)
            r0.b = r1
            int r2 = r2.b
            r0.b = r2
            return r0
        L13:
            if (r0 == 0) goto L1f
            e87 r0 = new e87
            e87 r2 = (defpackage.e87) r2
            r0.<init>(r2)
            r0.b = r1
            return r0
        L1f:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L3d
            e87 r0 = new e87
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            r0.b = r1
            int r1 = r2.leftMargin
            r0.leftMargin = r1
            int r1 = r2.topMargin
            r0.topMargin = r1
            int r1 = r2.rightMargin
            r0.rightMargin = r1
            int r2 = r2.bottomMargin
            r0.bottomMargin = r2
            return r0
        L3d:
            e87 r0 = new e87
            r0.<init>(r2)
            r0.b = r1
            return r0
    }

    public static int l(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
            int r1 = r1.getMarginEnd()
            int r1 = r1 + r0
            return r1
    }

    public static int n(android.view.View r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.topMargin
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            return r0
    }

    public final void a(int r9, java.util.ArrayList r10) {
            r8 = this;
            int r0 = r8.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r8.getChildCount()
            int r4 = r8.getLayoutDirection()
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r4)
            r10.clear()
            r4 = 3
            r5 = 5
            if (r0 == 0) goto L54
            int r3 = r3 - r2
        L1f:
            if (r3 < 0) goto L89
            android.view.View r0 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            e87 r1 = (defpackage.e87) r1
            int r6 = r1.b
            if (r6 != 0) goto L51
            boolean r6 = r8.v(r0)
            if (r6 == 0) goto L51
            int r1 = r1.a
            int r6 = r8.getLayoutDirection()
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r6)
            r1 = r1 & 7
            if (r1 == r2) goto L4c
            if (r1 == r4) goto L4c
            if (r1 == r5) goto L4c
            if (r6 != r2) goto L4b
            r1 = r5
            goto L4c
        L4b:
            r1 = r4
        L4c:
            if (r1 != r9) goto L51
            r10.add(r0)
        L51:
            int r3 = r3 + (-1)
            goto L1f
        L54:
            if (r1 >= r3) goto L89
            android.view.View r0 = r8.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            e87 r6 = (defpackage.e87) r6
            int r7 = r6.b
            if (r7 != 0) goto L86
            boolean r7 = r8.v(r0)
            if (r7 == 0) goto L86
            int r6 = r6.a
            int r7 = r8.getLayoutDirection()
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            if (r6 == r2) goto L81
            if (r6 == r4) goto L81
            if (r6 == r5) goto L81
            if (r7 != r2) goto L80
            r6 = r5
            goto L81
        L80:
            r6 = r4
        L81:
            if (r6 != r9) goto L86
            r10.add(r0)
        L86:
            int r1 = r1 + 1
            goto L54
        L89:
            return
    }

    public final void b(android.view.View r3, boolean r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Lb
            e87 r0 = h()
            goto L18
        Lb:
            boolean r1 = r2.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            e87 r0 = j(r0)
            goto L18
        L16:
            e87 r0 = (defpackage.e87) r0
        L18:
            r1 = 1
            r0.b = r1
            if (r4 == 0) goto L2a
            android.view.View r4 = r2.h0
            if (r4 == 0) goto L2a
            r3.setLayoutParams(r0)
            java.util.ArrayList r2 = r2.D0
            r2.add(r3)
            return
        L2a:
            r2.addView(r3, r0)
            return
    }

    public final void c() {
            r4 = this;
            mr r0 = r4.g0
            if (r0 != 0) goto L40
            mr r0 = new mr
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130970019(0x7f0405a3, float:1.7548736E38)
            r0.<init>(r1, r2, r3)
            r4.g0 = r0
            android.graphics.drawable.Drawable r1 = r4.e0
            r0.setImageDrawable(r1)
            mr r0 = r4.g0
            java.lang.CharSequence r1 = r4.f0
            r0.setContentDescription(r1)
            e87 r0 = h()
            int r1 = r4.m0
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.a = r1
            r1 = 2
            r0.b = r1
            mr r1 = r4.g0
            r1.setLayoutParams(r0)
            mr r0 = r4.g0
            r7 r1 = new r7
            r2 = 5
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
        L40:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = super.checkLayoutParams(r1)
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof defpackage.e87
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void d() {
            r3 = this;
            o26 r0 = r3.s0
            if (r0 != 0) goto L1e
            o26 r0 = new o26
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.c = r2
            r0.d = r2
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r0.h = r1
            r3.s0 = r0
        L1e:
            return
    }

    public final void e() {
            r3 = this;
            r3.f()
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            i44 r1 = r0.o0
            if (r1 != 0) goto L2a
            android.view.Menu r0 = r0.getMenu()
            i44 r0 = (defpackage.i44) r0
            d87 r1 = r3.L0
            if (r1 != 0) goto L1a
            d87 r1 = new d87
            r1.<init>(r3)
            r3.L0 = r1
        L1a:
            androidx.appcompat.widget.ActionMenuView r1 = r3.A
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            d87 r1 = r3.L0
            android.content.Context r2 = r3.i0
            r0.b(r1, r2)
            r3.x()
        L2a:
            return
    }

    public final void f() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            if (r0 != 0) goto L42
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
            r3.A = r0
            int r1 = r3.j0
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            r9 r1 = r3.I0
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            g60 r1 = r3.M0
            r9 r2 = new r9
            r2.<init>(r3)
            r0.t0 = r1
            r0.u0 = r2
            e87 r0 = h()
            int r1 = r3.m0
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.a = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.A
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            r1 = 0
            r3.b(r0, r1)
        L42:
            return
    }

    public final void g() {
            r4 = this;
            mr r0 = r4.R
            if (r0 != 0) goto L26
            mr r0 = new mr
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 2130970019(0x7f0405a3, float:1.7548736E38)
            r0.<init>(r1, r2, r3)
            r4.R = r0
            e87 r0 = h()
            int r1 = r4.m0
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.a = r1
            mr r4 = r4.R
            r4.setLayoutParams(r0)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r0 = this;
            e87 r0 = h()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r4) {
            r3 = this;
            e87 r0 = new e87
            android.content.Context r3 = r3.getContext()
            r0.<init>(r3, r4)
            r1 = 0
            r0.a = r1
            int[] r2 = defpackage.m75.b
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r2)
            int r4 = r3.getInt(r1, r1)
            r0.a = r4
            r3.recycle()
            r0.b = r1
            return r0
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            e87 r0 = j(r1)
            return r0
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r0 = this;
            mr r0 = r0.g0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r0 = this;
            mr r0 = r0.g0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int getContentInsetEnd() {
            r1 = this;
            o26 r1 = r1.s0
            if (r1 == 0) goto Le
            boolean r0 = r1.g
            if (r0 == 0) goto Lb
            int r1 = r1.a
            return r1
        Lb:
            int r1 = r1.b
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.u0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r2 = r2.getContentInsetEnd()
            return r2
    }

    public int getContentInsetLeft() {
            r0 = this;
            o26 r0 = r0.s0
            if (r0 == 0) goto L7
            int r0 = r0.a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetRight() {
            r0 = this;
            o26 r0 = r0.s0
            if (r0 == 0) goto L7
            int r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getContentInsetStart() {
            r1 = this;
            o26 r1 = r1.s0
            if (r1 == 0) goto Le
            boolean r0 = r1.g
            if (r0 == 0) goto Lb
            int r1 = r1.b
            return r1
        Lb:
            int r1 = r1.a
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.t0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            int r2 = r2.getContentInsetStart()
            return r2
    }

    public int getCurrentContentInsetEnd() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r2.A
            if (r0 == 0) goto L1e
            i44 r0 = r0.o0
            if (r0 == 0) goto L1e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L1e
            int r0 = r2.getContentInsetEnd()
            int r2 = r2.u0
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
        L1e:
            int r2 = r2.getContentInsetEnd()
            return r2
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetEnd()
            return r2
        Lc:
            int r2 = r2.getCurrentContentInsetStart()
            return r2
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = r2.getCurrentContentInsetStart()
            return r2
        Lc:
            int r2 = r2.getCurrentContentInsetEnd()
            return r2
    }

    public int getCurrentContentInsetStart() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r2.getContentInsetStart()
            int r2 = r2.t0
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            return r2
        L16:
            int r2 = r2.getContentInsetStart()
            return r2
    }

    public android.graphics.drawable.Drawable getLogo() {
            r0 = this;
            nr r0 = r0.d0
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r0 = this;
            nr r0 = r0.d0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.view.Menu getMenu() {
            r0 = this;
            r0.e()
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    public android.view.View getNavButtonView() {
            r0 = this;
            mr r0 = r0.R
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r0 = this;
            mr r0 = r0.R
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r0 = this;
            mr r0 = r0.R
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public defpackage.g8 getOuterActionMenuPresenter() {
            r0 = this;
            g8 r0 = r0.K0
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r0 = this;
            r0.e()
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.i0
            return r0
    }

    public int getPopupTheme() {
            r0 = this;
            int r0 = r0.j0
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.x0
            return r0
    }

    public final android.widget.TextView getSubtitleTextView() {
            r0 = this;
            qs r0 = r0.L
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.w0
            return r0
    }

    public int getTitleMarginBottom() {
            r0 = this;
            int r0 = r0.r0
            return r0
    }

    public int getTitleMarginEnd() {
            r0 = this;
            int r0 = r0.p0
            return r0
    }

    public int getTitleMarginStart() {
            r0 = this;
            int r0 = r0.o0
            return r0
    }

    public int getTitleMarginTop() {
            r0 = this;
            int r0 = r0.q0
            return r0
    }

    public final android.widget.TextView getTitleTextView() {
            r0 = this;
            qs r0 = r0.B
            return r0
    }

    public defpackage.tc1 getWrapper() {
            r2 = this;
            l87 r0 = r2.J0
            if (r0 != 0) goto Lc
            l87 r0 = new l87
            r1 = 1
            r0.<init>(r2, r1)
            r2.J0 = r0
        Lc:
            l87 r2 = r2.J0
            return r2
    }

    @Override // defpackage.l44
    public final void i(defpackage.fl2 r2) {
            r1 = this;
            m44 r1 = r1.F0
            java.lang.Object r0 = r1.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.remove(r2)
            java.lang.Object r0 = r1.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.remove(r2)
            if (r2 != 0) goto L1b
            java.lang.Object r1 = r1.B
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
        L1b:
            defpackage.u34.a()
            return
    }

    public final int k(android.view.View r7, int r8) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            e87 r0 = (defpackage.e87) r0
            int r7 = r7.getMeasuredHeight()
            r1 = 0
            if (r8 <= 0) goto L12
            int r8 = r7 - r8
            int r8 = r8 / 2
            goto L13
        L12:
            r8 = r1
        L13:
            int r2 = r0.a
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 16
            r4 = 80
            r5 = 48
            if (r2 == r3) goto L27
            if (r2 == r5) goto L27
            if (r2 == r4) goto L27
            int r2 = r6.v0
            r2 = r2 & 112(0x70, float:1.57E-43)
        L27:
            if (r2 == r5) goto L62
            if (r2 == r4) goto L53
            int r8 = r6.getPaddingTop()
            int r2 = r6.getPaddingBottom()
            int r6 = r6.getHeight()
            int r3 = r6 - r8
            int r3 = r3 - r2
            int r3 = r3 - r7
            int r3 = r3 / 2
            int r4 = r0.topMargin
            if (r3 >= r4) goto L43
            r3 = r4
            goto L51
        L43:
            int r6 = r6 - r2
            int r6 = r6 - r7
            int r6 = r6 - r3
            int r6 = r6 - r8
            int r7 = r0.bottomMargin
            if (r6 >= r7) goto L51
            int r7 = r7 - r6
            int r3 = r3 - r7
            int r3 = java.lang.Math.max(r1, r3)
        L51:
            int r8 = r8 + r3
            return r8
        L53:
            int r1 = r6.getHeight()
            int r6 = r6.getPaddingBottom()
            int r1 = r1 - r6
            int r1 = r1 - r7
            int r6 = r0.bottomMargin
            int r1 = r1 - r6
            int r1 = r1 - r8
            return r1
        L62:
            int r6 = r6.getPaddingTop()
            int r6 = r6 - r8
            return r6
    }

    @Override // defpackage.l44
    public final void m(defpackage.fl2 r2) {
            r1 = this;
            m44 r1 = r1.F0
            java.lang.Object r0 = r1.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r2)
            java.lang.Object r1 = r1.B
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            return
    }

    public final void o() {
            r5 = this;
            java.util.ArrayList r0 = r5.G0
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            android.view.Menu r4 = r5.getMenu()
            int r3 = r3.getItemId()
            r4.removeItem(r3)
            goto L7
        L1d:
            android.view.Menu r0 = r5.getMenu()
            java.util.ArrayList r1 = r5.getCurrentMenuItems()
            android.view.MenuInflater r2 = r5.getMenuInflater()
            m44 r3 = r5.F0
            java.lang.Object r3 = r3.L
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()
            fl2 r4 = (defpackage.fl2) r4
            androidx.fragment.app.u r4 = r4.a
            r4.k(r0, r2)
            goto L33
        L45:
            java.util.ArrayList r0 = r5.getCurrentMenuItems()
            r0.removeAll(r1)
            r5.G0 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.x()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            g15 r0 = r1.S0
            r1.removeCallbacks(r0)
            r1.x()
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.B0 = r1
        Lb:
            boolean r3 = r5.B0
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r6 != 0) goto L1a
            r5.B0 = r4
        L1a:
            r6 = 10
            if (r0 == r6) goto L23
            r6 = 3
            if (r0 != r6) goto L22
            goto L23
        L22:
            return r4
        L23:
            r5.B0 = r1
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
            r19 = this;
            r0 = r19
            int r1 = r0.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.E0
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = defpackage.ao7.a
            int r12 = r0.getMinimumHeight()
            if (r12 < 0) goto L3c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = r2
        L3d:
            mr r13 = r0.R
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L56
            mr r13 = r0.R
            if (r1 == 0) goto L50
            int r13 = r0.s(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L58
        L50:
            int r13 = r0.r(r13, r6, r12, r11)
        L54:
            r14 = r10
            goto L58
        L56:
            r13 = r6
            goto L54
        L58:
            mr r15 = r0.g0
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L6d
            mr r15 = r0.g0
            if (r1 == 0) goto L69
            int r14 = r0.s(r15, r14, r12, r11)
            goto L6d
        L69:
            int r13 = r0.r(r15, r13, r12, r11)
        L6d:
            androidx.appcompat.widget.ActionMenuView r15 = r0.A
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L82
            androidx.appcompat.widget.ActionMenuView r15 = r0.A
            if (r1 == 0) goto L7e
            int r13 = r0.r(r15, r13, r12, r11)
            goto L82
        L7e:
            int r14 = r0.s(r15, r14, r12, r11)
        L82:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r20 = r3
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r20] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.h0
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto Lbd
            android.view.View r13 = r0.h0
            if (r1 == 0) goto Lb9
            int r10 = r0.s(r13, r10, r12, r11)
            goto Lbd
        Lb9:
            int r3 = r0.r(r13, r3, r12, r11)
        Lbd:
            nr r13 = r0.d0
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto Ld2
            nr r13 = r0.d0
            if (r1 == 0) goto Lce
            int r10 = r0.s(r13, r10, r12, r11)
            goto Ld2
        Lce:
            int r3 = r0.r(r13, r3, r12, r11)
        Ld2:
            qs r13 = r0.B
            boolean r13 = r0.v(r13)
            qs r14 = r0.L
            boolean r14 = r0.v(r14)
            if (r13 == 0) goto Lf7
            qs r15 = r0.B
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            e87 r15 = (defpackage.e87) r15
            int r2 = r15.topMargin
            r23 = r1
            qs r1 = r0.B
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r15.bottomMargin
            int r1 = r1 + r2
            goto Lfa
        Lf7:
            r23 = r1
            r1 = 0
        Lfa:
            if (r14 == 0) goto L115
            qs r2 = r0.L
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            e87 r2 = (defpackage.e87) r2
            int r15 = r2.topMargin
            r22 = r1
            qs r1 = r0.L
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r1 = r1 + r22
            goto L117
        L115:
            r22 = r1
        L117:
            if (r13 != 0) goto L11b
            if (r14 == 0) goto L277
        L11b:
            if (r13 == 0) goto L120
            qs r2 = r0.B
            goto L122
        L120:
            qs r2 = r0.L
        L122:
            if (r14 == 0) goto L127
            qs r15 = r0.L
            goto L129
        L127:
            qs r15 = r0.B
        L129:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            e87 r2 = (defpackage.e87) r2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            e87 r15 = (defpackage.e87) r15
            r22 = r1
            if (r13 == 0) goto L141
            qs r1 = r0.B
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L14b
        L141:
            if (r14 == 0) goto L14e
            qs r1 = r0.L
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L14e
        L14b:
            r24 = r20
            goto L150
        L14e:
            r24 = 0
        L150:
            int r1 = r0.v0
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r3
            r3 = 48
            if (r1 == r3) goto L193
            r3 = 80
            if (r1 == r3) goto L189
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r3 = r2.topMargin
            r17 = r3
            int r3 = r0.q0
            int r3 = r17 + r3
            if (r1 >= r3) goto L171
            r1 = r3
            goto L187
        L171:
            int r5 = r5 - r9
            int r5 = r5 - r22
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r2.bottomMargin
            int r3 = r0.r0
            int r2 = r2 + r3
            if (r5 >= r2) goto L187
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L187:
            int r8 = r8 + r1
            goto L19e
        L189:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.r0
            int r5 = r5 - r1
            int r8 = r5 - r22
            goto L19e
        L193:
            int r1 = r0.getPaddingTop()
            int r2 = r2.topMargin
            int r1 = r1 + r2
            int r2 = r0.q0
            int r8 = r1 + r2
        L19e:
            if (r23 == 0) goto L20e
            if (r24 == 0) goto L1a5
            int r1 = r0.o0
            goto L1a6
        L1a5:
            r1 = 0
        L1a6:
            r2 = r11[r20]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r20] = r1
            if (r13 == 0) goto L1dc
            qs r1 = r0.B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            e87 r1 = (defpackage.e87) r1
            qs r2 = r0.B
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            qs r3 = r0.B
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            qs r5 = r0.B
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.p0
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1dd
        L1dc:
            r2 = r10
        L1dd:
            if (r14 == 0) goto L203
            qs r1 = r0.L
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            e87 r1 = (defpackage.e87) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            qs r1 = r0.L
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            qs r3 = r0.L
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            qs r5 = r0.L
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.p0
            int r1 = r10 - r1
            goto L204
        L203:
            r1 = r10
        L204:
            if (r24 == 0) goto L20b
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L20b:
            r3 = r16
            goto L277
        L20e:
            if (r24 == 0) goto L214
            int r1 = r0.o0
        L212:
            r2 = 0
            goto L216
        L214:
            r1 = 0
            goto L212
        L216:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r16
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L24b
            qs r1 = r0.B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            e87 r1 = (defpackage.e87) r1
            qs r2 = r0.B
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            qs r5 = r0.B
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            qs r9 = r0.B
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.p0
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L24c
        L24b:
            r2 = r3
        L24c:
            if (r14 == 0) goto L270
            qs r1 = r0.L
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            e87 r1 = (defpackage.e87) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            qs r1 = r0.L
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            qs r5 = r0.L
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            qs r9 = r0.L
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.p0
            int r1 = r1 + r5
            goto L271
        L270:
            r1 = r3
        L271:
            if (r24 == 0) goto L277
            int r3 = java.lang.Math.max(r2, r1)
        L277:
            r1 = 3
            java.util.ArrayList r2 = r0.C0
            r0.a(r1, r2)
            int r1 = r2.size()
            r5 = r3
            r3 = 0
        L283:
            if (r3 >= r1) goto L292
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.r(r8, r5, r12, r11)
            int r3 = r3 + 1
            goto L283
        L292:
            r1 = 5
            r0.a(r1, r2)
            int r1 = r2.size()
            r3 = 0
        L29b:
            if (r3 >= r1) goto L2aa
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.s(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L29b
        L2aa:
            r3 = r20
            r0.a(r3, r2)
            r1 = 0
            r8 = r11[r1]
            r1 = r11[r3]
            int r3 = r2.size()
            r13 = r8
            r8 = 0
            r9 = 0
        L2bb:
            if (r8 >= r3) goto L2f6
            java.lang.Object r14 = r2.get(r8)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            e87 r15 = (defpackage.e87) r15
            r20 = r1
            int r1 = r15.leftMargin
            int r1 = r1 - r13
            int r13 = r15.rightMargin
            int r13 = r13 - r20
            r15 = 0
            int r16 = java.lang.Math.max(r15, r1)
            int r17 = java.lang.Math.max(r15, r13)
            int r1 = -r1
            int r1 = java.lang.Math.max(r15, r1)
            int r13 = -r13
            int r13 = java.lang.Math.max(r15, r13)
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 + r16
            int r14 = r14 + r17
            int r9 = r9 + r14
            int r8 = r8 + 1
            r18 = r13
            r13 = r1
            r1 = r18
            goto L2bb
        L2f6:
            r15 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r1 = r9 / 2
            int r4 = r4 - r1
            int r9 = r9 + r4
            if (r4 >= r5) goto L303
            goto L30a
        L303:
            if (r9 <= r10) goto L309
            int r9 = r9 - r10
            int r5 = r4 - r9
            goto L30a
        L309:
            r5 = r4
        L30a:
            int r1 = r2.size()
        L30e:
            if (r15 >= r1) goto L31d
            java.lang.Object r3 = r2.get(r15)
            android.view.View r3 = (android.view.View) r3
            int r5 = r0.r(r3, r5, r12, r11)
            int r15 = r15 + 1
            goto L30e
        L31d:
            r2.clear()
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r15, int r16) {
            r14 = this;
            boolean r1 = defpackage.eq7.a
            int r1 = r14.getLayoutDirection()
            r7 = 0
            r2 = 1
            if (r1 != r2) goto Ld
            r6 = r2
            r8 = r7
            goto Lf
        Ld:
            r8 = r2
            r6 = r7
        Lf:
            mr r1 = r14.R
            boolean r1 = r14.v(r1)
            r3 = 0
            if (r1 == 0) goto L4e
            mr r1 = r14.R
            int r5 = r14.n0
            r0 = r14
            r2 = r15
            r4 = r16
            r0.u(r1, r2, r3, r4, r5)
            mr r1 = r14.R
            int r1 = r1.getMeasuredWidth()
            mr r2 = r14.R
            int r2 = l(r2)
            int r2 = r2 + r1
            mr r1 = r14.R
            int r1 = r1.getMeasuredHeight()
            mr r4 = r14.R
            int r4 = n(r4)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r7, r4)
            mr r4 = r14.R
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r7, r4)
            r9 = r1
            r10 = r4
            goto L51
        L4e:
            r2 = r7
            r9 = r2
            r10 = r9
        L51:
            mr r1 = r14.g0
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto L8c
            mr r1 = r14.g0
            int r5 = r14.n0
            r0 = r14
            r2 = r15
            r4 = r16
            r0.u(r1, r2, r3, r4, r5)
            mr r1 = r14.g0
            int r1 = r1.getMeasuredWidth()
            mr r2 = r14.g0
            int r2 = l(r2)
            int r2 = r2 + r1
            mr r1 = r14.g0
            int r1 = r1.getMeasuredHeight()
            mr r3 = r14.g0
            int r3 = n(r3)
            int r3 = r3 + r1
            int r9 = java.lang.Math.max(r9, r3)
            mr r1 = r14.g0
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L8c:
            int r1 = r14.getCurrentContentInsetStart()
            int r3 = java.lang.Math.max(r1, r2)
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r2 = r6
            int[] r6 = r14.E0
            r6[r2] = r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.A
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto Lda
            androidx.appcompat.widget.ActionMenuView r1 = r14.A
            int r5 = r14.n0
            r0 = r14
            r2 = r15
            r4 = r16
            r0.u(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionMenuView r1 = r14.A
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r2 = r14.A
            int r2 = l(r2)
            int r2 = r2 + r1
            androidx.appcompat.widget.ActionMenuView r1 = r14.A
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r4 = r14.A
            int r4 = n(r4)
            int r4 = r4 + r1
            int r9 = java.lang.Math.max(r9, r4)
            androidx.appcompat.widget.ActionMenuView r1 = r14.A
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            goto Ldb
        Lda:
            r2 = r7
        Ldb:
            int r1 = r14.getCurrentContentInsetEnd()
            int r4 = java.lang.Math.max(r1, r2)
            int r3 = r3 + r4
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r7, r1)
            r6[r8] = r1
            android.view.View r1 = r14.h0
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto L11a
            android.view.View r1 = r14.h0
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.t(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.view.View r1 = r14.h0
            int r1 = r1.getMeasuredHeight()
            android.view.View r2 = r14.h0
            int r2 = n(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            android.view.View r1 = r14.h0
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L11a:
            nr r1 = r14.d0
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto L149
            nr r1 = r14.d0
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.t(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            nr r1 = r14.d0
            int r1 = r1.getMeasuredHeight()
            nr r2 = r14.d0
            int r2 = n(r2)
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
            nr r1 = r14.d0
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
        L149:
            int r8 = r14.getChildCount()
            r11 = r7
        L14e:
            if (r11 >= r8) goto L18e
            android.view.View r1 = r14.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            e87 r2 = (defpackage.e87) r2
            int r2 = r2.b
            if (r2 != 0) goto L164
            boolean r2 = r14.v(r1)
            if (r2 != 0) goto L166
        L164:
            r12 = r3
            goto L18a
        L166:
            r5 = 0
            r0 = r14
            r2 = r15
            r4 = r16
            int r5 = r0.t(r1, r2, r3, r4, r5, r6)
            r12 = r3
            int r3 = r12 + r5
            int r2 = r1.getMeasuredHeight()
            int r4 = n(r1)
            int r4 = r4 + r2
            int r2 = java.lang.Math.max(r9, r4)
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r10, r1)
            r10 = r1
            r9 = r2
            goto L18b
        L18a:
            r3 = r12
        L18b:
            int r11 = r11 + 1
            goto L14e
        L18e:
            r12 = r3
            int r1 = r14.q0
            int r2 = r14.r0
            int r5 = r1 + r2
            int r1 = r14.o0
            int r2 = r14.p0
            int r8 = r1 + r2
            qs r1 = r14.B
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto L1d6
            qs r1 = r14.B
            int r3 = r12 + r8
            r0 = r14
            r2 = r15
            r4 = r16
            r0.t(r1, r2, r3, r4, r5, r6)
            qs r1 = r14.B
            int r1 = r1.getMeasuredWidth()
            qs r2 = r14.B
            int r2 = l(r2)
            int r2 = r2 + r1
            qs r1 = r14.B
            int r1 = r1.getMeasuredHeight()
            qs r3 = r14.B
            int r3 = n(r3)
            int r3 = r3 + r1
            qs r1 = r14.B
            int r1 = r1.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            r11 = r3
            r13 = r10
            r10 = r2
            goto L1d9
        L1d6:
            r11 = r7
            r13 = r10
            r10 = r11
        L1d9:
            qs r1 = r14.L
            boolean r1 = r14.v(r1)
            if (r1 == 0) goto L20a
            qs r1 = r14.L
            int r3 = r12 + r8
            int r5 = r5 + r11
            r0 = r14
            r2 = r15
            r4 = r16
            int r1 = r0.t(r1, r2, r3, r4, r5, r6)
            int r10 = java.lang.Math.max(r10, r1)
            qs r1 = r14.L
            int r1 = r1.getMeasuredHeight()
            qs r2 = r14.L
            int r2 = n(r2)
            int r2 = r2 + r1
            int r11 = r11 + r2
            qs r1 = r14.L
            int r1 = r1.getMeasuredState()
            int r13 = android.view.View.combineMeasuredStates(r13, r1)
        L20a:
            int r3 = r12 + r10
            int r1 = java.lang.Math.max(r9, r11)
            int r2 = r14.getPaddingLeft()
            int r4 = r14.getPaddingRight()
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r1
            int r1 = r14.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r13
            int r1 = android.view.View.resolveSizeAndState(r1, r15, r2)
            int r2 = r14.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r13 << 16
            r4 = r16
            int r2 = android.view.View.resolveSizeAndState(r2, r4, r3)
            boolean r3 = r14.O0
            if (r3 != 0) goto L248
            goto L265
        L248:
            int r3 = r14.getChildCount()
            r4 = r7
        L24d:
            if (r4 >= r3) goto L26a
            android.view.View r5 = r14.getChildAt(r4)
            boolean r6 = r14.v(r5)
            if (r6 == 0) goto L267
            int r6 = r5.getMeasuredWidth()
            if (r6 <= 0) goto L267
            int r5 = r5.getMeasuredHeight()
            if (r5 <= 0) goto L267
        L265:
            r7 = r2
            goto L26a
        L267:
            int r4 = r4 + 1
            goto L24d
        L26a:
            r14.setMeasuredDimension(r1, r7)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.g87
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            g87 r4 = (defpackage.g87) r4
            android.os.Parcelable r0 = r4.A
            super.onRestoreInstanceState(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r3.A
            if (r0 == 0) goto L16
            i44 r0 = r0.o0
            goto L17
        L16:
            r0 = 0
        L17:
            int r1 = r4.L
            if (r1 == 0) goto L2a
            d87 r2 = r3.L0
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            android.view.MenuItem r0 = r0.findItem(r1)
            if (r0 == 0) goto L2a
            r0.expandActionView()
        L2a:
            boolean r4 = r4.R
            if (r4 == 0) goto L36
            g15 r4 = r3.S0
            r3.removeCallbacks(r4)
            r3.post(r4)
        L36:
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            r1.d()
            o26 r1 = r1.s0
            r0 = 1
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            boolean r2 = r1.g
            if (r0 != r2) goto L12
            return
        L12:
            r1.g = r0
            boolean r2 = r1.h
            if (r2 == 0) goto L42
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L2f
            int r0 = r1.d
            if (r0 == r2) goto L21
            goto L23
        L21:
            int r0 = r1.e
        L23:
            r1.a = r0
            int r0 = r1.c
            if (r0 == r2) goto L2a
            goto L2c
        L2a:
            int r0 = r1.f
        L2c:
            r1.b = r0
            return
        L2f:
            int r0 = r1.c
            if (r0 == r2) goto L34
            goto L36
        L34:
            int r0 = r1.e
        L36:
            r1.a = r0
            int r0 = r1.d
            if (r0 == r2) goto L3d
            goto L3f
        L3d:
            int r0 = r1.f
        L3f:
            r1.b = r0
            return
        L42:
            int r2 = r1.e
            r1.a = r2
            int r2 = r1.f
            r1.b = r2
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            g87 r0 = new g87
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            d87 r1 = r2.L0
            if (r1 == 0) goto L15
            o44 r1 = r1.B
            if (r1 == 0) goto L15
            int r1 = r1.a
            r0.L = r1
        L15:
            boolean r2 = r2.q()
            r0.R = r2
            return r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.A0 = r1
        L9:
            boolean r2 = r4.A0
            r3 = 1
            if (r2 != 0) goto L18
            boolean r5 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r5 != 0) goto L18
            r4.A0 = r3
        L18:
            if (r0 == r3) goto L1f
            r5 = 3
            if (r0 != r5) goto L1e
            goto L1f
        L1e:
            return r3
        L1f:
            r4.A0 = r1
            return r3
    }

    public final boolean p(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList r1 = r1.D0
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    public final boolean q() {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L10
            g8 r0 = r0.s0
            if (r0 == 0) goto L10
            boolean r0 = r0.j()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final int r(android.view.View r5, int r6, int r7, int[] r8) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            e87 r0 = (defpackage.e87) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r8[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r6
            int r6 = -r1
            int r6 = java.lang.Math.max(r2, r6)
            r8[r2] = r6
            int r4 = r4.k(r5, r7)
            int r6 = r5.getMeasuredWidth()
            int r7 = r3 + r6
            int r8 = r5.getMeasuredHeight()
            int r8 = r8 + r4
            r5.layout(r3, r4, r7, r8)
            int r4 = r0.rightMargin
            int r6 = r6 + r4
            int r6 = r6 + r3
            return r6
    }

    public final int s(android.view.View r6, int r7, int r8, int[] r9) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            e87 r0 = (defpackage.e87) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r9[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r7 = r7 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r9[r2] = r1
            int r5 = r5.k(r6, r8)
            int r8 = r6.getMeasuredWidth()
            int r9 = r7 - r8
            int r1 = r6.getMeasuredHeight()
            int r1 = r1 + r5
            r6.layout(r9, r5, r7, r1)
            int r5 = r0.leftMargin
            int r8 = r8 + r5
            int r7 = r7 - r8
            return r7
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.R0
            if (r0 == r2) goto L9
            r1.R0 = r2
            r1.x()
        L9:
            return
    }

    public void setCollapseContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setCollapseContentDescription(r2)
            return
    }

    public void setCollapseContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.c()
        L9:
            mr r1 = r1.g0
            if (r1 == 0) goto L10
            r1.setContentDescription(r2)
        L10:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setCollapseIcon(r2)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            r0.c()
            mr r0 = r0.g0
            r0.setImageDrawable(r1)
            return
        Lb:
            mr r1 = r0.g0
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.e0
            r1.setImageDrawable(r0)
        L14:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.O0 = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.u0
            if (r2 == r0) goto L13
            r1.u0 = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.t0
            if (r2 == r0) goto L13
            r1.t0 = r2
            android.graphics.drawable.Drawable r2 = r1.getNavigationIcon()
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setLogo(r2)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r5) {
            r4 = this;
            nr r0 = r4.d0
            if (r5 == 0) goto L22
            if (r0 != 0) goto L13
            nr r0 = new nr
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.d0 = r0
        L13:
            nr r0 = r4.d0
            boolean r0 = r4.p(r0)
            if (r0 != 0) goto L36
            nr r0 = r4.d0
            r1 = 1
            r4.b(r0, r1)
            goto L36
        L22:
            if (r0 == 0) goto L36
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L36
            nr r0 = r4.d0
            r4.removeView(r0)
            java.util.ArrayList r0 = r4.D0
            nr r1 = r4.d0
            r0.remove(r1)
        L36:
            nr r4 = r4.d0
            if (r4 == 0) goto L3d
            r4.setImageDrawable(r5)
        L3d:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setLogoDescription(r2)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L17
            nr r0 = r4.d0
            if (r0 != 0) goto L17
            nr r0 = new nr
            android.content.Context r1 = r4.getContext()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.d0 = r0
        L17:
            nr r4 = r4.d0
            if (r4 == 0) goto L1e
            r4.setContentDescription(r5)
        L1e:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setNavigationContentDescription(r2)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.g()
        L9:
            mr r0 = r1.R
            if (r0 == 0) goto L15
            r0.setContentDescription(r2)
            mr r1 = r1.R
            defpackage.bl2.R(r1, r2)
        L15:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setNavigationIcon(r2)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.g()
            mr r0 = r2.R
            boolean r0 = r2.p(r0)
            if (r0 != 0) goto L2a
            mr r0 = r2.R
            r1 = 1
            r2.b(r0, r1)
            goto L2a
        L14:
            mr r0 = r2.R
            if (r0 == 0) goto L2a
            boolean r0 = r2.p(r0)
            if (r0 == 0) goto L2a
            mr r0 = r2.R
            r2.removeView(r0)
            java.util.ArrayList r0 = r2.D0
            mr r1 = r2.R
            r0.remove(r1)
        L2a:
            mr r2 = r2.R
            if (r2 == 0) goto L31
            r2.setImageDrawable(r3)
        L31:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.g()
            mr r0 = r0.R
            r0.setOnClickListener(r1)
            return
    }

    public void setOnMenuItemClickListener(defpackage.f87 r1) {
            r0 = this;
            r0.H0 = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.e()
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            r0.setOverflowIcon(r1)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.j0
            if (r0 == r3) goto L1a
            r2.j0 = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.i0 = r3
            return
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.i0 = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setSubtitle(r2)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            qs r1 = r3.L
            if (r0 != 0) goto L41
            if (r1 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            qs r1 = new qs
            r2 = 0
            r1.<init>(r0, r2)
            r3.L = r1
            r1.setSingleLine()
            qs r1 = r3.L
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.l0
            if (r1 == 0) goto L29
            qs r2 = r3.L
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.z0
            if (r0 == 0) goto L32
            qs r1 = r3.L
            r1.setTextColor(r0)
        L32:
            qs r0 = r3.L
            boolean r0 = r3.p(r0)
            if (r0 != 0) goto L55
            qs r0 = r3.L
            r1 = 1
            r3.b(r0, r1)
            goto L55
        L41:
            if (r1 == 0) goto L55
            boolean r0 = r3.p(r1)
            if (r0 == 0) goto L55
            qs r0 = r3.L
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.D0
            qs r1 = r3.L
            r0.remove(r1)
        L55:
            qs r0 = r3.L
            if (r0 == 0) goto L5c
            r0.setText(r4)
        L5c:
            r3.x0 = r4
            return
    }

    public void setSubtitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setSubtitleTextColor(r1)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.z0 = r1
            qs r0 = r0.L
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
        L9:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            qs r1 = r3.B
            if (r0 != 0) goto L41
            if (r1 != 0) goto L32
            android.content.Context r0 = r3.getContext()
            qs r1 = new qs
            r2 = 0
            r1.<init>(r0, r2)
            r3.B = r1
            r1.setSingleLine()
            qs r1 = r3.B
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.k0
            if (r1 == 0) goto L29
            qs r2 = r3.B
            r2.setTextAppearance(r0, r1)
        L29:
            android.content.res.ColorStateList r0 = r3.y0
            if (r0 == 0) goto L32
            qs r1 = r3.B
            r1.setTextColor(r0)
        L32:
            qs r0 = r3.B
            boolean r0 = r3.p(r0)
            if (r0 != 0) goto L55
            qs r0 = r3.B
            r1 = 1
            r3.b(r0, r1)
            goto L55
        L41:
            if (r1 == 0) goto L55
            boolean r0 = r3.p(r1)
            if (r0 == 0) goto L55
            qs r0 = r3.B
            r3.removeView(r0)
            java.util.ArrayList r0 = r3.D0
            qs r1 = r3.B
            r0.remove(r1)
        L55:
            qs r0 = r3.B
            if (r0 == 0) goto L5c
            r0.setText(r4)
        L5c:
            r3.w0 = r4
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.r0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.p0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.o0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.q0 = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTitleTextColor(r1)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.y0 = r1
            qs r0 = r0.B
            if (r0 == 0) goto L9
            r0.setTextColor(r1)
        L9:
            return
    }

    public final int t(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r13[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r13[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r6 = r6 + r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r13[r2] = r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r2, r1)
            r13[r4] = r1
            int r13 = r7.getPaddingLeft()
            int r1 = r7.getPaddingRight()
            int r1 = r1 + r13
            int r1 = r1 + r6
            int r1 = r1 + r10
            int r10 = r0.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r1, r10)
            int r10 = r7.getPaddingTop()
            int r7 = r7.getPaddingBottom()
            int r7 = r7 + r10
            int r10 = r0.topMargin
            int r7 = r7 + r10
            int r10 = r0.bottomMargin
            int r7 = r7 + r10
            int r7 = r7 + r12
            int r10 = r0.height
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r11, r7, r10)
            r8.measure(r9, r7)
            int r7 = r8.getMeasuredWidth()
            int r7 = r7 + r6
            return r7
    }

    public final void u(android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r6
            int r6 = r0.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r2, r6)
            int r6 = r3.getPaddingTop()
            int r3 = r3.getPaddingBottom()
            int r3 = r3 + r6
            int r6 = r0.topMargin
            int r3 = r3 + r6
            int r6 = r0.bottomMargin
            int r3 = r3 + r6
            int r6 = r0.height
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r3, r6)
            int r6 = android.view.View.MeasureSpec.getMode(r3)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L49
            if (r8 < 0) goto L49
            if (r6 == 0) goto L45
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r8 = java.lang.Math.min(r3, r8)
        L45:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
        L49:
            r4.measure(r5, r3)
            return
    }

    public final boolean v(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L12
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L12
            int r1 = r2.getVisibility()
            r2 = 8
            if (r1 == r2) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final boolean w() {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L10
            g8 r0 = r0.s0
            if (r0 == 0) goto L10
            boolean r0 = r0.l()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final void x() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4d
            android.window.OnBackInvokedDispatcher r0 = defpackage.c87.a(r4)
            d87 r1 = r4.L0
            r2 = 0
            if (r1 == 0) goto L21
            o44 r1 = r1.B
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L21
            boolean r1 = r4.R0
            if (r1 == 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = r2
        L22:
            if (r1 == 0) goto L3f
            android.window.OnBackInvokedDispatcher r3 = r4.Q0
            if (r3 != 0) goto L3f
            android.window.OnBackInvokedCallback r1 = r4.P0
            if (r1 != 0) goto L37
            b87 r1 = new b87
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = defpackage.c87.b(r1)
            r4.P0 = r1
        L37:
            android.window.OnBackInvokedCallback r1 = r4.P0
            defpackage.c87.c(r0, r1)
            r4.Q0 = r0
            return
        L3f:
            if (r1 != 0) goto L4d
            android.window.OnBackInvokedDispatcher r0 = r4.Q0
            if (r0 == 0) goto L4d
            android.window.OnBackInvokedCallback r1 = r4.P0
            defpackage.c87.d(r0, r1)
            r0 = 0
            r4.Q0 = r0
        L4d:
            return
    }
}
