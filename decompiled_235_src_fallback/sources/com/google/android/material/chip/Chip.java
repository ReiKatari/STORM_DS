package com.google.android.material.chip;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Chip extends defpackage.nq implements defpackage.xe6, android.widget.Checkable {
    public static final android.graphics.Rect v0 = null;
    public static final int[] w0 = null;
    public static final int[] x0 = null;
    public defpackage.nq0 d0;
    public android.graphics.drawable.InsetDrawable e0;
    public android.graphics.drawable.RippleDrawable f0;
    public android.view.View.OnClickListener g0;
    public android.widget.CompoundButton.OnCheckedChangeListener h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public java.lang.CharSequence p0;
    public final defpackage.mq0 q0;
    public boolean r0;
    public final android.graphics.Rect s0;
    public final android.graphics.RectF t0;
    public final defpackage.kq0 u0;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.google.android.material.chip.Chip.v0 = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.w0 = r0
            r0 = 16842911(0x101009f, float:2.3694004E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.chip.Chip.x0 = r0
            return
    }

    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = 2132018374(0x7f1404c6, float:1.9675053E38)
            r4 = 2130968800(0x7f0400e0, float:1.7546264E38)
            r3 = r17
            android.content.Context r1 = defpackage.q60.e0(r3, r2, r4, r1)
            r0.<init>(r1, r2, r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.s0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.t0 = r1
            kq0 r1 = new kq0
            r7 = 0
            r1.<init>(r0, r7)
            r0.u0 = r1
            android.content.Context r8 = r0.getContext()
            r10 = 8388627(0x800013, float:1.175497E-38)
            r11 = 1
            if (r2 != 0) goto L34
            goto L94
        L34:
            java.lang.String r1 = "background"
            java.lang.String r3 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            java.lang.String r5 = "Chip"
            if (r1 == 0) goto L45
            java.lang.String r1 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r5, r1)
        L45:
            java.lang.String r1 = "drawableLeft"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L3c9
            java.lang.String r1 = "drawableStart"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L3c1
            java.lang.String r1 = "drawableEnd"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            java.lang.String r6 = "Please set end drawable using R.attr#closeIcon."
            if (r1 != 0) goto L3bb
            java.lang.String r1 = "drawableRight"
            java.lang.String r1 = r2.getAttributeValue(r3, r1)
            if (r1 != 0) goto L3b5
            java.lang.String r1 = "singleLine"
            boolean r1 = r2.getAttributeBooleanValue(r3, r1, r11)
            if (r1 == 0) goto L3ad
            java.lang.String r1 = "lines"
            int r1 = r2.getAttributeIntValue(r3, r1, r11)
            if (r1 != r11) goto L3ad
            java.lang.String r1 = "minLines"
            int r1 = r2.getAttributeIntValue(r3, r1, r11)
            if (r1 != r11) goto L3ad
            java.lang.String r1 = "maxLines"
            int r1 = r2.getAttributeIntValue(r3, r1, r11)
            if (r1 != r11) goto L3ad
            java.lang.String r1 = "gravity"
            int r1 = r2.getAttributeIntValue(r3, r1, r10)
            if (r1 == r10) goto L94
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r5, r1)
        L94:
            nq0 r12 = new nq0
            r12.<init>(r8, r2)
            int[] r6 = new int[r7]
            android.content.Context r1 = r12.j1
            int[] r3 = defpackage.a75.c
            r5 = 2132018374(0x7f1404c6, float:1.9675053E38)
            android.content.res.TypedArray r1 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            r13 = 37
            boolean r5 = r1.hasValue(r13)
            r12.J1 = r5
            r5 = 24
            android.content.Context r6 = r12.j1
            android.content.res.ColorStateList r5 = defpackage.np2.S(r6, r1, r5)
            android.content.res.ColorStateList r14 = r12.C0
            if (r14 == r5) goto Lc3
            r12.C0 = r5
            int[] r5 = r12.getState()
            r12.onStateChange(r5)
        Lc3:
            r5 = 11
            android.content.res.ColorStateList r5 = defpackage.np2.S(r6, r1, r5)
            android.content.res.ColorStateList r14 = r12.D0
            if (r14 == r5) goto Ld6
            r12.D0 = r5
            int[] r5 = r12.getState()
            r12.onStateChange(r5)
        Ld6:
            r5 = 19
            r14 = 0
            float r5 = r1.getDimension(r5, r14)
            float r15 = r12.E0
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 == 0) goto Leb
            r12.E0 = r5
            r12.invalidateSelf()
            r12.A()
        Leb:
            r5 = 12
            boolean r15 = r1.hasValue(r5)
            if (r15 == 0) goto Lfa
            float r5 = r1.getDimension(r5, r14)
            r12.G(r5)
        Lfa:
            r5 = 22
            android.content.res.ColorStateList r5 = defpackage.np2.S(r6, r1, r5)
            r12.L(r5)
            r5 = 23
            float r5 = r1.getDimension(r5, r14)
            r12.M(r5)
            r5 = 36
            android.content.res.ColorStateList r5 = defpackage.np2.S(r6, r1, r5)
            r12.W(r5)
            r15 = 5
            java.lang.CharSequence r5 = r1.getText(r15)
            if (r5 != 0) goto L11e
            java.lang.String r5 = ""
        L11e:
            r17 = 0
            java.lang.CharSequence r9 = r12.J0
            boolean r9 = android.text.TextUtils.equals(r9, r5)
            if (r9 != 0) goto L134
            r12.J0 = r5
            h17 r5 = r12.p1
            r5.d = r11
            r12.invalidateSelf()
            r12.A()
        L134:
            boolean r5 = r1.hasValue(r7)
            if (r5 == 0) goto L146
            int r5 = r1.getResourceId(r7, r7)
            if (r5 == 0) goto L146
            g07 r9 = new g07
            r9.<init>(r6, r5)
            goto L148
        L146:
            r9 = r17
        L148:
            float r5 = r9.l
            float r5 = r1.getDimension(r11, r5)
            r9.l = r5
            r12.X(r9)
            r5 = 3
            int r9 = r1.getInt(r5, r7)
            if (r9 == r11) goto L16a
            r10 = 2
            if (r9 == r10) goto L165
            if (r9 == r5) goto L160
            goto L16e
        L160:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r12.G1 = r5
            goto L16e
        L165:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r12.G1 = r5
            goto L16e
        L16a:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
            r12.G1 = r5
        L16e:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r7)
            r12.K(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r2 == 0) goto L194
            java.lang.String r9 = "chipIconEnabled"
            java.lang.String r9 = r2.getAttributeValue(r5, r9)
            if (r9 == 0) goto L194
            java.lang.String r9 = "chipIconVisible"
            java.lang.String r9 = r2.getAttributeValue(r5, r9)
            if (r9 != 0) goto L194
            r9 = 15
            boolean r9 = r1.getBoolean(r9, r7)
            r12.K(r9)
        L194:
            r9 = 14
            android.graphics.drawable.Drawable r9 = defpackage.np2.T(r6, r1, r9)
            r12.H(r9)
            r9 = 17
            boolean r10 = r1.hasValue(r9)
            if (r10 == 0) goto L1ac
            android.content.res.ColorStateList r9 = defpackage.np2.S(r6, r1, r9)
            r12.J(r9)
        L1ac:
            r9 = 16
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r9 = r1.getDimension(r9, r10)
            r12.I(r9)
            r9 = 31
            boolean r9 = r1.getBoolean(r9, r7)
            r12.T(r9)
            if (r2 == 0) goto L1db
            java.lang.String r9 = "closeIconEnabled"
            java.lang.String r9 = r2.getAttributeValue(r5, r9)
            if (r9 == 0) goto L1db
            java.lang.String r9 = "closeIconVisible"
            java.lang.String r9 = r2.getAttributeValue(r5, r9)
            if (r9 != 0) goto L1db
            r9 = 26
            boolean r9 = r1.getBoolean(r9, r7)
            r12.T(r9)
        L1db:
            r9 = 25
            android.graphics.drawable.Drawable r9 = defpackage.np2.T(r6, r1, r9)
            r12.N(r9)
            r9 = 30
            android.content.res.ColorStateList r9 = defpackage.np2.S(r6, r1, r9)
            r12.S(r9)
            r9 = 28
            float r9 = r1.getDimension(r9, r14)
            r12.P(r9)
            r9 = 6
            boolean r9 = r1.getBoolean(r9, r7)
            r12.C(r9)
            r9 = 10
            boolean r9 = r1.getBoolean(r9, r7)
            r12.F(r9)
            if (r2 == 0) goto L222
            java.lang.String r9 = "checkedIconEnabled"
            java.lang.String r9 = r2.getAttributeValue(r5, r9)
            if (r9 == 0) goto L222
            java.lang.String r9 = "checkedIconVisible"
            java.lang.String r5 = r2.getAttributeValue(r5, r9)
            if (r5 != 0) goto L222
            r5 = 8
            boolean r5 = r1.getBoolean(r5, r7)
            r12.F(r5)
        L222:
            r5 = 7
            android.graphics.drawable.Drawable r5 = defpackage.np2.T(r6, r1, r5)
            r12.D(r5)
            r5 = 9
            boolean r9 = r1.hasValue(r5)
            if (r9 == 0) goto L239
            android.content.res.ColorStateList r5 = defpackage.np2.S(r6, r1, r5)
            r12.E(r5)
        L239:
            r5 = 39
            boolean r9 = r1.hasValue(r5)
            if (r9 == 0) goto L24c
            int r5 = r1.getResourceId(r5, r7)
            if (r5 == 0) goto L24c
            f84 r5 = defpackage.f84.a(r6, r5)
            goto L24e
        L24c:
            r5 = r17
        L24e:
            r12.Z0 = r5
            r5 = 33
            boolean r9 = r1.hasValue(r5)
            if (r9 == 0) goto L263
            int r5 = r1.getResourceId(r5, r7)
            if (r5 == 0) goto L263
            f84 r9 = defpackage.f84.a(r6, r5)
            goto L265
        L263:
            r9 = r17
        L265:
            r12.a1 = r9
            r5 = 21
            float r5 = r1.getDimension(r5, r14)
            float r6 = r12.b1
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L27b
            r12.b1 = r5
            r12.invalidateSelf()
            r12.A()
        L27b:
            r5 = 35
            float r5 = r1.getDimension(r5, r14)
            r12.V(r5)
            r5 = 34
            float r5 = r1.getDimension(r5, r14)
            r12.U(r5)
            r5 = 41
            float r5 = r1.getDimension(r5, r14)
            float r6 = r12.e1
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L2a1
            r12.e1 = r5
            r12.invalidateSelf()
            r12.A()
        L2a1:
            r5 = 40
            float r5 = r1.getDimension(r5, r14)
            float r6 = r12.f1
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L2b5
            r12.f1 = r5
            r12.invalidateSelf()
            r12.A()
        L2b5:
            r5 = 29
            float r5 = r1.getDimension(r5, r14)
            r12.Q(r5)
            r5 = 27
            float r5 = r1.getDimension(r5, r14)
            r12.O(r5)
            r5 = 13
            float r5 = r1.getDimension(r5, r14)
            float r6 = r12.i1
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 == 0) goto L2db
            r12.i1 = r5
            r12.invalidateSelf()
            r12.A()
        L2db:
            r5 = 4
            r6 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r12.I1 = r5
            r1.recycle()
            int[] r6 = new int[r7]
            r5 = 2132018374(0x7f1404c6, float:1.9675053E38)
            defpackage.f04.r(r8, r2, r4, r5)
            r1 = r8
            defpackage.f04.s(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6 = 32
            boolean r6 = r5.getBoolean(r6, r7)
            r0.m0 = r6
            r6 = 2130969509(0x7f0403a5, float:1.7547702E38)
            android.util.TypedValue r6 = defpackage.qo2.M(r1, r6)
            if (r6 == 0) goto L31c
            int r8 = r6.type
            if (r8 == r15) goto L30e
            goto L31c
        L30e:
            android.content.res.Resources r8 = r1.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r6 = r6.getDimension(r8)
        L31a:
            int r6 = (int) r6
            goto L328
        L31c:
            android.content.res.Resources r6 = r1.getResources()
            r8 = 2131166119(0x7f0703a7, float:1.7946474E38)
            float r6 = r6.getDimension(r8)
            goto L31a
        L328:
            float r6 = (float) r6
            r8 = 20
            float r6 = r5.getDimension(r8, r6)
            double r8 = (double) r6
            double r8 = java.lang.Math.ceil(r8)
            int r6 = (int) r8
            r0.o0 = r6
            r5.recycle()
            r0.setChipDrawable(r12)
            float r5 = r0.getElevation()
            r12.m(r5)
            int[] r6 = new int[r7]
            r5 = 2132018374(0x7f1404c6, float:1.9675053E38)
            defpackage.f04.r(r1, r2, r4, r5)
            defpackage.f04.s(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            boolean r2 = r1.hasValue(r13)
            r1.recycle()
            mq0 r1 = new mq0
            r1.<init>(r0, r0)
            r0.q0 = r1
            r0.d()
            if (r2 != 0) goto L36e
            lq0 r1 = new lq0
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L36e:
            boolean r1 = r0.i0
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r12.J0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.G1
            r0.setEllipsize(r1)
            r0.g()
            nq0 r1 = r0.d0
            boolean r1 = r1.H1
            if (r1 != 0) goto L38c
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L38c:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r0.f()
            boolean r1 = r0.m0
            if (r1 == 0) goto L39e
            int r1 = r0.o0
            r0.setMinHeight(r1)
        L39e:
            int r1 = r0.getLayoutDirection()
            r0.n0 = r1
            jq0 r1 = new jq0
            r1.<init>(r0, r7)
            super.setOnCheckedChangeListener(r1)
            return
        L3ad:
            r17 = 0
            java.lang.String r0 = "Chip does not support multi-line text"
            defpackage.fa6.h(r0)
            throw r17
        L3b5:
            r17 = 0
            defpackage.fa6.h(r6)
            throw r17
        L3bb:
            r17 = 0
            defpackage.fa6.h(r6)
            throw r17
        L3c1:
            r17 = 0
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            throw r17
        L3c9:
            r17 = 0
            java.lang.String r0 = "Please set left drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            throw r17
    }

    public static /* synthetic */ android.graphics.Rect a(com.google.android.material.chip.Chip r0) {
            android.graphics.Rect r0 = r0.getCloseIconTouchBoundsInt()
            return r0
    }

    private android.graphics.RectF getCloseIconTouchBounds() {
            r4 = this;
            android.graphics.RectF r0 = r4.t0
            r0.setEmpty()
            boolean r1 = r4.c()
            if (r1 == 0) goto L4d
            android.view.View$OnClickListener r1 = r4.g0
            if (r1 == 0) goto L4d
            nq0 r4 = r4.d0
            android.graphics.Rect r1 = r4.getBounds()
            r0.setEmpty()
            boolean r2 = r4.a0()
            if (r2 == 0) goto L4d
            float r2 = r4.i1
            float r3 = r4.h1
            float r2 = r2 + r3
            float r3 = r4.T0
            float r2 = r2 + r3
            float r3 = r4.g1
            float r2 = r2 + r3
            float r3 = r4.f1
            float r2 = r2 + r3
            int r4 = r4.getLayoutDirection()
            if (r4 != 0) goto L3b
            int r4 = r1.right
            float r4 = (float) r4
            r0.right = r4
            float r4 = r4 - r2
            r0.left = r4
            goto L43
        L3b:
            int r4 = r1.left
            float r4 = (float) r4
            r0.left = r4
            float r4 = r4 + r2
            r0.right = r4
        L43:
            int r4 = r1.top
            float r4 = (float) r4
            r0.top = r4
            int r4 = r1.bottom
            float r4 = (float) r4
            r0.bottom = r4
        L4d:
            return r0
    }

    private android.graphics.Rect getCloseIconTouchBoundsInt() {
            r4 = this;
            android.graphics.RectF r0 = r4.getCloseIconTouchBounds()
            float r1 = r0.left
            int r1 = (int) r1
            float r2 = r0.top
            int r2 = (int) r2
            float r3 = r0.right
            int r3 = (int) r3
            float r0 = r0.bottom
            int r0 = (int) r0
            android.graphics.Rect r4 = r4.s0
            r4.set(r1, r2, r3, r0)
            return r4
    }

    private defpackage.g07 getTextAppearance() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L9
            h17 r0 = r0.p1
            g07 r0 = r0.f
            return r0
        L9:
            r0 = 0
            return r0
    }

    private void setCloseIconHovered(boolean r2) {
            r1 = this;
            boolean r0 = r1.k0
            if (r0 == r2) goto L9
            r1.k0 = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    private void setCloseIconPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 == r2) goto L9
            r1.j0 = r2
            r1.refreshDrawableState()
        L9:
            return
    }

    public final void b(int r11) {
            r10 = this;
            r10.o0 = r11
            boolean r0 = r10.m0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L23
            android.graphics.drawable.InsetDrawable r11 = r10.e0
            if (r11 == 0) goto L1f
            if (r11 == 0) goto L54
            r10.e0 = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            r10.e()
            return
        L1f:
            r10.e()
            return
        L23:
            nq0 r0 = r10.d0
            float r0 = r0.E0
            int r0 = (int) r0
            int r0 = r11 - r0
            int r0 = java.lang.Math.max(r2, r0)
            nq0 r3 = r10.d0
            int r3 = r3.getIntrinsicWidth()
            int r3 = r11 - r3
            int r3 = java.lang.Math.max(r2, r3)
            if (r3 > 0) goto L59
            if (r0 > 0) goto L59
            android.graphics.drawable.InsetDrawable r11 = r10.e0
            if (r11 == 0) goto L55
            if (r11 == 0) goto L54
            r10.e0 = r1
            r10.setMinWidth(r2)
            float r11 = r10.getChipMinHeight()
            int r11 = (int) r11
            r10.setMinHeight(r11)
            r10.e()
        L54:
            return
        L55:
            r10.e()
            return
        L59:
            if (r3 <= 0) goto L5f
            int r3 = r3 / 2
            r6 = r3
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r0 <= 0) goto L64
            int r2 = r0 / 2
        L64:
            r7 = r2
            android.graphics.drawable.InsetDrawable r0 = r10.e0
            if (r0 == 0) goto L87
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r1 = r10.e0
            r1.getPadding(r0)
            int r1 = r0.top
            if (r1 != r7) goto L87
            int r1 = r0.bottom
            if (r1 != r7) goto L87
            int r1 = r0.left
            if (r1 != r6) goto L87
            int r0 = r0.right
            if (r0 != r6) goto L87
            r10.e()
            return
        L87:
            int r0 = r10.getMinHeight()
            if (r0 == r11) goto L90
            r10.setMinHeight(r11)
        L90:
            int r0 = r10.getMinWidth()
            if (r0 == r11) goto L99
            r10.setMinWidth(r11)
        L99:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            nq0 r5 = r10.d0
            r8 = r6
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)
            r10.e0 = r4
            r10.e()
            return
    }

    public final boolean c() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r0.Q0
            if (r0 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void d() {
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L1b
            nq0 r0 = r1.d0
            if (r0 == 0) goto L1b
            boolean r0 = r0.P0
            if (r0 == 0) goto L1b
            android.view.View$OnClickListener r0 = r1.g0
            if (r0 == 0) goto L1b
            mq0 r0 = r1.q0
            defpackage.ao7.n(r1, r0)
            r0 = 1
            r1.r0 = r0
            return
        L1b:
            r0 = 0
            defpackage.ao7.n(r1, r0)
            r0 = 0
            r1.r0 = r0
            return
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent r8) {
            r7 = this;
            boolean r0 = r7.r0
            if (r0 != 0) goto L9
            boolean r7 = super.dispatchHoverEvent(r8)
            return r7
        L9:
            mq0 r0 = r7.q0
            android.view.accessibility.AccessibilityManager r1 = r0.d0
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r8.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.i0 = r2
            r0.r(r2, r6)
            r0.r(r1, r5)
            return r4
        L42:
            float r7 = r8.getX()
            float r8 = r8.getY()
            com.google.android.material.chip.Chip r1 = r0.j0
            boolean r2 = r1.c()
            if (r2 == 0) goto L5d
            android.graphics.RectF r1 = r1.getCloseIconTouchBounds()
            boolean r7 = r1.contains(r7, r8)
            if (r7 == 0) goto L5d
            r3 = r4
        L5d:
            int r7 = r0.i0
            if (r7 != r3) goto L62
            goto L71
        L62:
            r0.i0 = r3
            r0.r(r3, r6)
            r0.r(r7, r5)
            return r4
        L6b:
            boolean r7 = super.dispatchHoverEvent(r8)
            if (r7 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
            r9 = this;
            boolean r0 = r9.r0
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            mq0 r0 = r9.q0
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.h0
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.j0
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.g0
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.r0
            if (r1 == 0) goto L85
            mq0 r1 = r5.q0
            r1.r(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.h0
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
    }

    @Override // defpackage.nq, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            nq0 r0 = r4.d0
            r1 = 0
            if (r0 == 0) goto L6e
            android.graphics.drawable.Drawable r0 = r0.Q0
            boolean r0 = defpackage.nq0.z(r0)
            if (r0 == 0) goto L6e
            nq0 r0 = r4.d0
            boolean r2 = r4.isEnabled()
            boolean r3 = r4.l0
            if (r3 == 0) goto L1c
            int r2 = r2 + 1
        L1c:
            boolean r3 = r4.k0
            if (r3 == 0) goto L22
            int r2 = r2 + 1
        L22:
            boolean r3 = r4.j0
            if (r3 == 0) goto L28
            int r2 = r2 + 1
        L28:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L30
            int r2 = r2 + 1
        L30:
            int[] r2 = new int[r2]
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L3e
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r1 = 1
        L3e:
            boolean r3 = r4.l0
            if (r3 == 0) goto L49
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L49:
            boolean r3 = r4.k0
            if (r3 == 0) goto L54
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L54:
            boolean r3 = r4.j0
            if (r3 == 0) goto L5f
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L5f:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L6a
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r1] = r3
        L6a:
            boolean r1 = r0.R(r2)
        L6e:
            if (r1 == 0) goto L73
            r4.invalidate()
        L73:
            return
    }

    public final void e() {
            r4 = this;
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            nq0 r1 = r4.d0
            android.content.res.ColorStateList r1 = r1.I0
            android.content.res.ColorStateList r1 = defpackage.lq5.a(r1)
            android.graphics.drawable.Drawable r2 = r4.getBackgroundDrawable()
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.f0 = r0
            nq0 r0 = r4.d0
            r0.getClass()
            android.graphics.drawable.RippleDrawable r0 = r4.f0
            r4.setBackground(r0)
            r4.f()
            return
    }

    public final void f() {
            r4 = this;
            java.lang.CharSequence r0 = r4.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            nq0 r0 = r4.d0
            if (r0 != 0) goto Lf
            goto L46
        Lf:
            float r1 = r0.i1
            float r2 = r0.f1
            float r1 = r1 + r2
            float r0 = r0.w()
            float r0 = r0 + r1
            int r0 = (int) r0
            nq0 r1 = r4.d0
            float r2 = r1.b1
            float r3 = r1.e1
            float r2 = r2 + r3
            float r1 = r1.v()
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r4.e0
            if (r2 == 0) goto L3b
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r4.e0
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L3b:
            int r2 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            r4.setPaddingRelative(r1, r2, r0, r3)
        L46:
            return
    }

    public final void g() {
            r3 = this;
            android.text.TextPaint r0 = r3.getPaint()
            nq0 r1 = r3.d0
            if (r1 == 0) goto Le
            int[] r1 = r1.getState()
            r0.drawableState = r1
        Le:
            g07 r1 = r3.getTextAppearance()
            if (r1 == 0) goto L1d
            android.content.Context r2 = r3.getContext()
            kq0 r3 = r3.u0
            r1.d(r2, r0, r3)
        L1d:
            return
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r2 = this;
            java.lang.CharSequence r0 = r2.p0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.CharSequence r2 = r2.p0
            return r2
        Lb:
            nq0 r0 = r2.d0
            java.lang.String r1 = "android.widget.Button"
            if (r0 == 0) goto L19
            boolean r0 = r0.V0
            if (r0 == 0) goto L19
            r2.getParent()
            return r1
        L19:
            boolean r2 = r2.isClickable()
            if (r2 == 0) goto L20
            return r1
        L20:
            java.lang.String r2 = "android.view.View"
            return r2
    }

    public android.graphics.drawable.Drawable getBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.InsetDrawable r0 = r1.e0
            if (r0 != 0) goto L7
            nq0 r1 = r1.d0
            return r1
        L7:
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.graphics.drawable.Drawable r0 = r0.X0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.Y0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.D0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipCornerRadius() {
            r1 = this;
            nq0 r1 = r1.d0
            r0 = 0
            if (r1 == 0) goto Le
            float r1 = r1.x()
            float r1 = java.lang.Math.max(r0, r1)
            return r1
        Le:
            return r0
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
            r0 = this;
            nq0 r0 = r0.d0
            return r0
    }

    public float getChipEndPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.i1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getChipIcon() {
            r1 = this;
            nq0 r1 = r1.d0
            r0 = 0
            if (r1 == 0) goto La
            android.graphics.drawable.Drawable r1 = r1.L0
            if (r1 == 0) goto La
            return r1
        La:
            return r0
    }

    public float getChipIconSize() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.N0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipIconTint() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.M0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipMinHeight() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.E0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStartPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.b1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.G0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getChipStrokeWidth() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.H0
            return r0
        L7:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public android.graphics.drawable.Drawable getCloseIcon() {
            r1 = this;
            nq0 r1 = r1.d0
            r0 = 0
            if (r1 == 0) goto La
            android.graphics.drawable.Drawable r1 = r1.Q0
            if (r1 == 0) goto La
            return r1
        La:
            return r0
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.text.SpannableStringBuilder r0 = r0.U0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconEndPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.h1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconSize() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.T0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getCloseIconStartPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.g1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getCloseIconTint() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.S0
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.text.TextUtils$TruncateAt r0 = r0.G1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(android.graphics.Rect r4) {
            r3 = this;
            boolean r0 = r3.r0
            if (r0 == 0) goto L17
            mq0 r0 = r3.q0
            int r1 = r0.h0
            r2 = 1
            if (r1 == r2) goto Lf
            int r0 = r0.g0
            if (r0 != r2) goto L17
        Lf:
            android.graphics.Rect r3 = r3.getCloseIconTouchBoundsInt()
            r4.set(r3)
            return
        L17:
            super.getFocusedRect(r4)
            return
    }

    public defpackage.f84 getHideMotionSpec() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            f84 r0 = r0.a1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconEndPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.d1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getIconStartPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.c1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.I0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public defpackage.me6 getShapeAppearanceModel() {
            r0 = this;
            nq0 r0 = r0.d0
            n24 r0 = r0.B
            me6 r0 = r0.a
            return r0
    }

    public defpackage.f84 getShowMotionSpec() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            f84 r0 = r0.Z0
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextEndPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.f1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public float getTextStartPadding() {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            float r0 = r0.e1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            nq0 r0 = r1.d0
            defpackage.jx2.P(r1, r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 2
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.chip.Chip.w0
            android.view.View.mergeDrawableStates(r2, r0)
        L11:
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1e
            boolean r1 = r1.V0
            if (r1 == 0) goto L1e
            int[] r1 = com.google.android.material.chip.Chip.x0
            android.view.View.mergeDrawableStates(r2, r1)
        L1e:
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r3, int r4, android.graphics.Rect r5) {
            r2 = this;
            super.onFocusChanged(r3, r4, r5)
            boolean r0 = r2.r0
            if (r0 == 0) goto L17
            mq0 r2 = r2.q0
            int r0 = r2.h0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L12
            r2.j(r0)
        L12:
            if (r3 == 0) goto L17
            r2.m(r4, r5)
        L17:
            return
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L11
            r1 = 10
            if (r0 == r1) goto Lc
            goto L24
        Lc:
            r0 = 0
            r3.setCloseIconHovered(r0)
            goto L24
        L11:
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            r3.setCloseIconHovered(r0)
        L24:
            boolean r3 = super.onHoverEvent(r4)
            return r3
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.CharSequence r0 = r1.getAccessibilityClassName()
            r2.setClassName(r0)
            nq0 r0 = r1.d0
            if (r0 == 0) goto L14
            boolean r0 = r0.V0
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.setCheckable(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            r1.getParent()
            return
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r4, int r5) {
            r3 = this;
            android.graphics.RectF r0 = r3.getCloseIconTouchBounds()
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.contains(r1, r2)
            if (r0 == 0) goto L23
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L23
            android.content.Context r3 = r3.getContext()
            r4 = 1002(0x3ea, float:1.404E-42)
            android.view.PointerIcon r3 = android.view.PointerIcon.getSystemIcon(r3, r4)
            return r3
        L23:
            android.view.PointerIcon r3 = super.onResolvePointerIcon(r4, r5)
            return r3
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            int r0 = r1.n0
            if (r0 == r2) goto Lc
            r1.n0 = r2
            r1.f()
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.j0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.j0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.g0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.r0
            if (r0 == 0) goto L43
            mq0 r0 = r5.q0
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
    }

    public void setAccessibilityClassName(java.lang.CharSequence r1) {
            r0 = this;
            r0.p0 = r1
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.f0
            if (r2 == r0) goto L12
            java.lang.String r1 = "Chip"
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r1, r2)
            return
        L12:
            super.setBackground(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r1) {
            r0 = this;
            java.lang.String r0 = "Chip"
            java.lang.String r1 = "Do not set the background color; Chip manages its own background drawable."
            android.util.Log.w(r0, r1)
            return
    }

    @Override // defpackage.nq, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackgroundDrawable()
            if (r2 == r0) goto L12
            android.graphics.drawable.RippleDrawable r0 = r1.f0
            if (r2 == r0) goto L12
            java.lang.String r1 = "Chip"
            java.lang.String r2 = "Do not set the background drawable; Chip manages its own background drawable."
            android.util.Log.w(r1, r2)
            return
        L12:
            super.setBackgroundDrawable(r2)
            return
    }

    @Override // defpackage.nq, android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            java.lang.String r0 = "Chip"
            java.lang.String r1 = "Do not set the background resource; Chip manages its own background drawable."
            android.util.Log.w(r0, r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            java.lang.String r0 = "Chip"
            java.lang.String r1 = "Do not set the background tint list; Chip manages its own background drawable."
            android.util.Log.w(r0, r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            java.lang.String r0 = "Chip"
            java.lang.String r1 = "Do not set the background tint mode; Chip manages its own background drawable."
            android.util.Log.w(r0, r1)
            return
    }

    public void setCheckable(boolean r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.C(r1)
        L7:
            return
    }

    public void setCheckableResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.C(r2)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 != 0) goto L7
            r1.i0 = r2
            return
        L7:
            boolean r0 = r0.V0
            if (r0 == 0) goto Le
            super.setChecked(r2)
        Le:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.D(r1)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int r1) {
            r0 = this;
            r0.setCheckedIconVisible(r1)
            return
    }

    public void setCheckedIconResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.D(r2)
        Ld:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.E(r1)
        L7:
            return
    }

    public void setCheckedIconTintResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.E(r2)
        Ld:
            return
    }

    public void setCheckedIconVisible(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.F(r2)
        L11:
            return
    }

    public void setCheckedIconVisible(boolean r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.F(r1)
        L7:
            return
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.res.ColorStateList r0 = r1.D0
            if (r0 == r2) goto L11
            r1.D0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L11:
            return
    }

    public void setChipBackgroundColorResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L17
            android.content.Context r0 = r1.j1
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            android.content.res.ColorStateList r0 = r1.D0
            if (r0 == r2) goto L17
            r1.D0 = r2
            int[] r2 = r1.getState()
            r1.onStateChange(r2)
        L17:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadius(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.G(r1)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipCornerRadiusResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.G(r2)
        L11:
            return
    }

    public void setChipDrawable(defpackage.nq0 r4) {
            r3 = this;
            nq0 r0 = r3.d0
            if (r0 == r4) goto L1f
            if (r0 == 0) goto Le
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r0.F1 = r1
        Le:
            r3.d0 = r4
            r0 = 0
            r4.H1 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r4.F1 = r0
            int r4 = r3.o0
            r3.b(r4)
        L1f:
            return
    }

    public void setChipEndPadding(float r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            float r0 = r1.i1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.i1 = r2
            r1.invalidateSelf()
            r1.A()
        L12:
            return
    }

    public void setChipEndPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            float r0 = r1.i1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1.i1 = r2
            r1.invalidateSelf()
            r1.A()
        L1c:
            return
    }

    public void setChipIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.H(r1)
        L7:
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int r1) {
            r0 = this;
            r0.setChipIconVisible(r1)
            return
    }

    public void setChipIconResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.H(r2)
        Ld:
            return
    }

    public void setChipIconSize(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.I(r1)
        L7:
            return
    }

    public void setChipIconSizeResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.I(r2)
        L11:
            return
    }

    public void setChipIconTint(android.content.res.ColorStateList r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.J(r1)
        L7:
            return
    }

    public void setChipIconTintResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.J(r2)
        Ld:
            return
    }

    public void setChipIconVisible(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.K(r2)
        L11:
            return
    }

    public void setChipIconVisible(boolean r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.K(r1)
        L7:
            return
    }

    public void setChipMinHeight(float r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            float r0 = r1.E0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.E0 = r2
            r1.invalidateSelf()
            r1.A()
        L12:
            return
    }

    public void setChipMinHeightResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            float r0 = r1.E0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1.E0 = r2
            r1.invalidateSelf()
            r1.A()
        L1c:
            return
    }

    public void setChipStartPadding(float r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            float r0 = r1.b1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.b1 = r2
            r1.invalidateSelf()
            r1.A()
        L12:
            return
    }

    public void setChipStartPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            float r0 = r1.b1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1.b1 = r2
            r1.invalidateSelf()
            r1.A()
        L1c:
            return
    }

    public void setChipStrokeColor(android.content.res.ColorStateList r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.L(r1)
        L7:
            return
    }

    public void setChipStrokeColorResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.L(r2)
        Ld:
            return
    }

    public void setChipStrokeWidth(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.M(r1)
        L7:
            return
    }

    public void setChipStrokeWidthResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.M(r2)
        L11:
            return
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setText(r1)
            return
    }

    @java.lang.Deprecated
    public void setChipTextResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            return
    }

    public void setCloseIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 == 0) goto L7
            r0.N(r2)
        L7:
            r1.d()
            return
    }

    public void setCloseIconContentDescription(java.lang.CharSequence r3) {
            r2 = this;
            nq0 r2 = r2.d0
            if (r2 == 0) goto L28
            android.text.SpannableStringBuilder r0 = r2.U0
            if (r0 == r3) goto L28
            java.lang.String r0 = defpackage.g40.b
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            r1 = 1
            if (r0 != r1) goto L18
            g40 r0 = defpackage.g40.e
            goto L1a
        L18:
            g40 r0 = defpackage.g40.d
        L1a:
            r0.getClass()
            g60 r1 = defpackage.f17.a
            android.text.SpannableStringBuilder r3 = r0.c(r3)
            r2.U0 = r3
            r2.invalidateSelf()
        L28:
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int r1) {
            r0 = this;
            r0.setCloseIconVisible(r1)
            return
    }

    public void setCloseIconEndPadding(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.O(r1)
        L7:
            return
    }

    public void setCloseIconEndPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.O(r2)
        L11:
            return
    }

    public void setCloseIconResource(int r3) {
            r2 = this;
            nq0 r0 = r2.d0
            if (r0 == 0) goto Ld
            android.content.Context r1 = r0.j1
            android.graphics.drawable.Drawable r3 = defpackage.hf.S(r1, r3)
            r0.N(r3)
        Ld:
            r2.d()
            return
    }

    public void setCloseIconSize(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.P(r1)
        L7:
            return
    }

    public void setCloseIconSizeResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.P(r2)
        L11:
            return
    }

    public void setCloseIconStartPadding(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.Q(r1)
        L7:
            return
    }

    public void setCloseIconStartPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.Q(r2)
        L11:
            return
    }

    public void setCloseIconTint(android.content.res.ColorStateList r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.S(r1)
        L7:
            return
    }

    public void setCloseIconTintResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Ld
            android.content.Context r0 = r1.j1
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r0, r2)
            r1.S(r2)
        Ld:
            return
    }

    public void setCloseIconVisible(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setCloseIconVisible(r2)
            return
    }

    public void setCloseIconVisible(boolean r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 == 0) goto L7
            r0.T(r2)
        L7:
            r1.d()
            return
    }

    @Override // defpackage.nq, android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawables(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // defpackage.nq, android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            if (r1 != 0) goto Le
            if (r3 != 0) goto L8
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            return
        L8:
            java.lang.String r0 = "Please set right drawable using R.attr#closeIcon."
            defpackage.fa6.h(r0)
            return
        Le:
            java.lang.String r0 = "Please set left drawable using R.attr#chipIcon."
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            nq0 r0 = r0.d0
            if (r0 == 0) goto La
            r0.m(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 != 0) goto L5
            goto L12
        L5:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            if (r2 == r0) goto L13
            super.setEllipsize(r2)
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            r1.G1 = r2
        L12:
            return
        L13:
            java.lang.String r1 = "Text within a chip are not allowed to scroll."
            defpackage.fa6.h(r1)
            return
    }

    public void setEnsureMinTouchTargetSize(boolean r1) {
            r0 = this;
            r0.m0 = r1
            int r1 = r0.o0
            r0.b(r1)
            return
    }

    @Override // android.widget.TextView
    public void setGravity(int r2) {
            r1 = this;
            r0 = 8388627(0x800013, float:1.175497E-38)
            if (r2 == r0) goto Ld
            java.lang.String r1 = "Chip"
            java.lang.String r2 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r1, r2)
            return
        Ld:
            super.setGravity(r2)
            return
    }

    public void setHideMotionSpec(defpackage.f84 r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L6
            r0.a1 = r1
        L6:
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Lc
            android.content.Context r0 = r1.j1
            f84 r2 = defpackage.f84.a(r0, r2)
            r1.a1 = r2
        Lc:
            return
    }

    public void setIconEndPadding(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.U(r1)
        L7:
            return
    }

    public void setIconEndPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.U(r2)
        L11:
            return
    }

    public void setIconStartPadding(float r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L7
            r0.V(r1)
        L7:
            return
    }

    public void setIconStartPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L11
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            r1.V(r2)
        L11:
            return
    }

    public void setInternalOnCheckedChangeListener(defpackage.j24 r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setLayoutDirection(int r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 != 0) goto L5
            return
        L5:
            super.setLayoutDirection(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setLines(r2)
            return
        L7:
            java.lang.String r1 = "Chip does not support multi-line text"
            defpackage.fa6.h(r1)
            return
    }

    @Override // android.widget.TextView
    public void setMaxLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMaxLines(r2)
            return
        L7:
            java.lang.String r1 = "Chip does not support multi-line text"
            defpackage.fa6.h(r1)
            return
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int r1) {
            r0 = this;
            super.setMaxWidth(r1)
            nq0 r0 = r0.d0
            if (r0 == 0) goto L9
            r0.I1 = r1
        L9:
            return
    }

    @Override // android.widget.TextView
    public void setMinLines(int r2) {
            r1 = this;
            r0 = 1
            if (r2 > r0) goto L7
            super.setMinLines(r2)
            return
        L7:
            java.lang.String r1 = "Chip does not support multi-line text"
            defpackage.fa6.h(r1)
            return
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.g0 = r1
            r0.d()
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 == 0) goto L7
            r0.W(r2)
        L7:
            nq0 r2 = r1.d0
            r2.getClass()
            r1.e()
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            nq0 r0 = r2.d0
            if (r0 == 0) goto L15
            android.content.Context r1 = r0.j1
            android.content.res.ColorStateList r3 = defpackage.ge7.A(r1, r3)
            r0.W(r3)
            nq0 r3 = r2.d0
            r3.getClass()
            r2.e()
        L15:
            return
    }

    @Override // defpackage.xe6
    public void setShapeAppearanceModel(defpackage.me6 r1) {
            r0 = this;
            nq0 r0 = r0.d0
            r0.setShapeAppearanceModel(r1)
            return
    }

    public void setShowMotionSpec(defpackage.f84 r1) {
            r0 = this;
            nq0 r0 = r0.d0
            if (r0 == 0) goto L6
            r0.Z0 = r1
        L6:
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto Lc
            android.content.Context r0 = r1.j1
            f84 r2 = defpackage.f84.a(r0, r2)
            r1.Z0 = r2
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            super.setSingleLine(r1)
            return
        L6:
            java.lang.String r0 = "Chip does not support multi-line text"
            defpackage.fa6.h(r0)
            return
    }

    @Override // android.widget.TextView
    public final void setText(java.lang.CharSequence r2, android.widget.TextView.BufferType r3) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 != 0) goto L5
            goto L2c
        L5:
            if (r2 != 0) goto L9
            java.lang.String r2 = ""
        L9:
            boolean r0 = r0.H1
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = r2
        L10:
            super.setText(r0, r3)
            nq0 r1 = r1.d0
            if (r1 == 0) goto L2c
            java.lang.CharSequence r3 = r1.J0
            boolean r3 = android.text.TextUtils.equals(r3, r2)
            if (r3 != 0) goto L2c
            r1.J0 = r2
            h17 r2 = r1.p1
            r3 = 1
            r2.d = r3
            r1.invalidateSelf()
            r1.A()
        L2c:
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int r4) {
            r3 = this;
            super.setTextAppearance(r4)
            nq0 r0 = r3.d0
            if (r0 == 0) goto L11
            g07 r1 = new g07
            android.content.Context r2 = r0.j1
            r1.<init>(r2, r4)
            r0.X(r1)
        L11:
            r3.g()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r3, int r4) {
            r2 = this;
            super.setTextAppearance(r3, r4)
            nq0 r3 = r2.d0
            if (r3 == 0) goto L11
            g07 r0 = new g07
            android.content.Context r1 = r3.j1
            r0.<init>(r1, r4)
            r3.X(r0)
        L11:
            r2.g()
            return
    }

    public void setTextAppearance(defpackage.g07 r2) {
            r1 = this;
            nq0 r0 = r1.d0
            if (r0 == 0) goto L7
            r0.X(r2)
        L7:
            r1.g()
            return
    }

    public void setTextAppearanceResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            r1.setTextAppearance(r0, r2)
            return
    }

    public void setTextEndPadding(float r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            float r0 = r1.f1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.f1 = r2
            r1.invalidateSelf()
            r1.A()
        L12:
            return
    }

    public void setTextEndPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            float r0 = r1.f1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1.f1 = r2
            r1.invalidateSelf()
            r1.A()
        L1c:
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
            r2 = this;
            super.setTextSize(r3, r4)
            nq0 r0 = r2.d0
            if (r0 == 0) goto L26
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r1)
            h17 r4 = r0.p1
            g07 r1 = r4.f
            if (r1 == 0) goto L26
            r1.l = r3
            android.text.TextPaint r4 = r4.a
            r4.setTextSize(r3)
            r0.A()
            r0.invalidateSelf()
        L26:
            r2.g()
            return
    }

    public void setTextStartPadding(float r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L12
            float r0 = r1.e1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.e1 = r2
            r1.invalidateSelf()
            r1.A()
        L12:
            return
    }

    public void setTextStartPaddingResource(int r2) {
            r1 = this;
            nq0 r1 = r1.d0
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.j1
            android.content.res.Resources r0 = r0.getResources()
            float r2 = r0.getDimension(r2)
            float r0 = r1.e1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1.e1 = r2
            r1.invalidateSelf()
            r1.A()
        L1c:
            return
    }
}
