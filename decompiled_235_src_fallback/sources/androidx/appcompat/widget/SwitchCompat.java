package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {
    public static final defpackage.ml0 Q0 = null;
    public static final int[] R0 = null;
    public android.graphics.drawable.Drawable A;
    public int A0;
    public android.content.res.ColorStateList B;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public final android.text.TextPaint H0;
    public final android.content.res.ColorStateList I0;
    public android.text.StaticLayout J0;
    public android.text.StaticLayout K0;
    public android.graphics.PorterDuff.Mode L;
    public final defpackage.oc L0;
    public android.animation.ObjectAnimator M0;
    public defpackage.lr N0;
    public defpackage.ww6 O0;
    public final android.graphics.Rect P0;
    public boolean R;
    public boolean d0;
    public android.graphics.drawable.Drawable e0;
    public android.content.res.ColorStateList f0;
    public android.graphics.PorterDuff.Mode g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public java.lang.CharSequence n0;
    public java.lang.CharSequence o0;
    public java.lang.CharSequence p0;
    public java.lang.CharSequence q0;
    public boolean r0;
    public int s0;
    public final int t0;
    public float u0;
    public float v0;
    public final android.view.VelocityTracker w0;
    public final int x0;
    public float y0;
    public int z0;

    static {
            ml0 r0 = new ml0
            java.lang.String r1 = "thumbPos"
            r2 = 5
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.SwitchCompat.Q0 = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.SwitchCompat.R0 = r0
            return
    }

    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r5 = 2130969851(0x7f0404fb, float:1.7548396E38)
            r12.<init>(r13, r14, r5)
            r6 = 0
            r12.B = r6
            r12.L = r6
            r7 = 0
            r12.R = r7
            r12.d0 = r7
            r12.f0 = r6
            r12.g0 = r6
            r12.h0 = r7
            r12.i0 = r7
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.w0 = r0
            r8 = 1
            r12.G0 = r8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.P0 = r0
            android.content.Context r0 = r12.getContext()
            defpackage.h57.a(r12, r0)
            android.text.TextPaint r9 = new android.text.TextPaint
            r9.<init>(r8)
            r12.H0 = r9
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r9.density = r0
            int[] r2 = defpackage.m75.w
            m44 r10 = defpackage.m44.A(r13, r14, r2, r5)
            java.lang.Object r0 = r10.L
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r12
            r1 = r13
            r3 = r14
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            r12 = 2
            android.graphics.drawable.Drawable r13 = r10.k(r12)
            r0.A = r13
            if (r13 == 0) goto L5f
            r13.setCallback(r0)
        L5f:
            r13 = 11
            android.graphics.drawable.Drawable r13 = r10.k(r13)
            r0.e0 = r13
            if (r13 == 0) goto L6c
            r13.setCallback(r0)
        L6c:
            java.lang.CharSequence r13 = r4.getText(r7)
            r0.setTextOnInternal(r13)
            java.lang.CharSequence r13 = r4.getText(r8)
            r0.setTextOffInternal(r13)
            r13 = 3
            boolean r14 = r4.getBoolean(r13, r8)
            r0.r0 = r14
            r14 = 8
            int r14 = r4.getDimensionPixelSize(r14, r7)
            r0.j0 = r14
            r14 = 5
            int r14 = r4.getDimensionPixelSize(r14, r7)
            r0.k0 = r14
            r14 = 6
            int r14 = r4.getDimensionPixelSize(r14, r7)
            r0.l0 = r14
            r14 = 4
            boolean r14 = r4.getBoolean(r14, r7)
            r0.m0 = r14
            r14 = 9
            android.content.res.ColorStateList r14 = r10.g(r14)
            if (r14 == 0) goto Laa
            r0.B = r14
            r0.R = r8
        Laa:
            r14 = 10
            r2 = -1
            int r14 = r4.getInt(r14, r2)
            android.graphics.PorterDuff$Mode r14 = defpackage.bp1.c(r14, r6)
            android.graphics.PorterDuff$Mode r11 = r0.L
            if (r11 == r14) goto Lbd
            r0.L = r14
            r0.d0 = r8
        Lbd:
            boolean r14 = r0.R
            if (r14 != 0) goto Lc5
            boolean r14 = r0.d0
            if (r14 == 0) goto Lc8
        Lc5:
            r0.a()
        Lc8:
            r14 = 12
            android.content.res.ColorStateList r14 = r10.g(r14)
            if (r14 == 0) goto Ld4
            r0.f0 = r14
            r0.h0 = r8
        Ld4:
            r14 = 13
            int r14 = r4.getInt(r14, r2)
            android.graphics.PorterDuff$Mode r14 = defpackage.bp1.c(r14, r6)
            android.graphics.PorterDuff$Mode r11 = r0.g0
            if (r11 == r14) goto Le6
            r0.g0 = r14
            r0.i0 = r8
        Le6:
            boolean r14 = r0.h0
            if (r14 != 0) goto Lee
            boolean r14 = r0.i0
            if (r14 == 0) goto Lf1
        Lee:
            r0.b()
        Lf1:
            r14 = 7
            int r14 = r4.getResourceId(r14, r7)
            if (r14 == 0) goto L1b2
            int[] r4 = defpackage.m75.x
            android.content.res.TypedArray r14 = r1.obtainStyledAttributes(r14, r4)
            boolean r4 = r14.hasValue(r13)
            if (r4 == 0) goto L111
            int r4 = r14.getResourceId(r13, r7)
            if (r4 == 0) goto L111
            android.content.res.ColorStateList r4 = defpackage.ge7.A(r1, r4)
            if (r4 == 0) goto L111
            goto L115
        L111:
            android.content.res.ColorStateList r4 = r14.getColorStateList(r13)
        L115:
            if (r4 == 0) goto L11a
            r0.I0 = r4
            goto L120
        L11a:
            android.content.res.ColorStateList r4 = r0.getTextColors()
            r0.I0 = r4
        L120:
            int r4 = r14.getDimensionPixelSize(r7, r7)
            if (r4 == 0) goto L135
            float r4 = (float) r4
            float r11 = r9.getTextSize()
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 == 0) goto L135
            r9.setTextSize(r4)
            r0.requestLayout()
        L135:
            int r4 = r14.getInt(r8, r2)
            int r2 = r14.getInt(r12, r2)
            if (r4 == r8) goto L14b
            if (r4 == r12) goto L148
            if (r4 == r13) goto L145
            r13 = r6
            goto L14d
        L145:
            android.graphics.Typeface r13 = android.graphics.Typeface.MONOSPACE
            goto L14d
        L148:
            android.graphics.Typeface r13 = android.graphics.Typeface.SERIF
            goto L14d
        L14b:
            android.graphics.Typeface r13 = android.graphics.Typeface.SANS_SERIF
        L14d:
            r4 = 0
            if (r2 <= 0) goto L17a
            if (r13 != 0) goto L157
            android.graphics.Typeface r13 = android.graphics.Typeface.defaultFromStyle(r2)
            goto L15b
        L157:
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r2)
        L15b:
            r0.setSwitchTypeface(r13)
            if (r13 == 0) goto L165
            int r13 = r13.getStyle()
            goto L166
        L165:
            r13 = r7
        L166:
            int r13 = ~r13
            r13 = r13 & r2
            r2 = r13 & 1
            if (r2 == 0) goto L16d
            goto L16e
        L16d:
            r8 = r7
        L16e:
            r9.setFakeBoldText(r8)
            r12 = r12 & r13
            if (r12 == 0) goto L176
            r4 = -1098907648(0xffffffffbe800000, float:-0.25)
        L176:
            r9.setTextSkewX(r4)
            goto L183
        L17a:
            r9.setFakeBoldText(r7)
            r9.setTextSkewX(r4)
            r0.setSwitchTypeface(r13)
        L183:
            r12 = 14
            boolean r12 = r14.getBoolean(r12, r7)
            if (r12 == 0) goto L1a3
            oc r12 = new oc
            android.content.Context r13 = r0.getContext()
            r12.<init>()
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            java.util.Locale r13 = r13.locale
            r12.A = r13
            r0.L0 = r12
            goto L1a5
        L1a3:
            r0.L0 = r6
        L1a5:
            java.lang.CharSequence r12 = r0.n0
            r0.setTextOnInternal(r12)
            java.lang.CharSequence r12 = r0.p0
            r0.setTextOffInternal(r12)
            r14.recycle()
        L1b2:
            ms r12 = new ms
            r12.<init>(r0)
            r12.f(r3, r5)
            r10.D()
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r1)
            int r13 = r12.getScaledTouchSlop()
            r0.t0 = r13
            int r12 = r12.getScaledMinimumFlingVelocity()
            r0.x0 = r12
            lr r12 = r0.getEmojiTextViewHelper()
            r12.b(r3, r5)
            r0.refreshDrawableState()
            boolean r12 = r0.isChecked()
            r0.setChecked(r12)
            return
    }

    private defpackage.lr getEmojiTextViewHelper() {
            r1 = this;
            lr r0 = r1.N0
            if (r0 != 0) goto Lb
            lr r0 = new lr
            r0.<init>(r1)
            r1.N0 = r0
        Lb:
            lr r1 = r1.N0
            return r1
    }

    private boolean getTargetCheckedState() {
            r1 = this;
            float r1 = r1.y0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private int getThumbOffset() {
            r3 = this;
            boolean r0 = defpackage.eq7.a
            int r0 = r3.getLayoutDirection()
            float r1 = r3.y0
            r2 = 1
            if (r0 != r2) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r1
        Lf:
            int r3 = r3.getThumbScrollRange()
            float r3 = (float) r3
            float r1 = r1 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r3 = (int) r1
            return r3
    }

    private int getThumbScrollRange() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.e0
            if (r0 == 0) goto L26
            android.graphics.Rect r1 = r3.P0
            r0.getPadding(r1)
            android.graphics.drawable.Drawable r0 = r3.A
            if (r0 == 0) goto L12
            android.graphics.Rect r0 = defpackage.bp1.b(r0)
            goto L14
        L12:
            android.graphics.Rect r0 = defpackage.bp1.c
        L14:
            int r2 = r3.z0
            int r3 = r3.B0
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r1.right
            int r2 = r2 - r3
            int r3 = r0.left
            int r2 = r2 - r3
            int r3 = r0.right
            int r2 = r2 - r3
            return r2
        L26:
            r3 = 0
            return r3
    }

    private void setTextOffInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.p0 = r3
            lr r0 = r2.getEmojiTextViewHelper()
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            oc r1 = r2.L0
            android.text.method.TransformationMethod r0 = r0.I(r1)
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L18:
            r2.q0 = r3
            r3 = 0
            r2.K0 = r3
            boolean r3 = r2.r0
            if (r3 == 0) goto L24
            r2.d()
        L24:
            return
    }

    private void setTextOnInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.n0 = r3
            lr r0 = r2.getEmojiTextViewHelper()
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            oc r1 = r2.L0
            android.text.method.TransformationMethod r0 = r0.I(r1)
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L18:
            r2.o0 = r3
            r3 = 0
            r2.J0 = r3
            boolean r3 = r2.r0
            if (r3 == 0) goto L24
            r2.d()
        L24:
            return
    }

    public final void a() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L37
            boolean r1 = r2.R
            if (r1 != 0) goto Lc
            boolean r1 = r2.d0
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.A = r0
            boolean r1 = r2.R
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.B
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.d0
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.A
            android.graphics.PorterDuff$Mode r1 = r2.L
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.A
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.A
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L37:
            return
    }

    public final void b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e0
            if (r0 == 0) goto L37
            boolean r1 = r2.h0
            if (r1 != 0) goto Lc
            boolean r1 = r2.i0
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.e0 = r0
            boolean r1 = r2.h0
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f0
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.i0
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.e0
            android.graphics.PorterDuff$Mode r1 = r2.g0
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.e0
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.e0
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L37:
            return
    }

    public final void c() {
            r1 = this;
            java.lang.CharSequence r0 = r1.n0
            r1.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r1.p0
            r1.setTextOffInternal(r0)
            r1.requestLayout()
            return
    }

    public final void d() {
            r3 = this;
            ww6 r0 = r3.O0
            if (r0 != 0) goto L30
            lr r0 = r3.N0
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            boolean r0 = r0.u()
            if (r0 != 0) goto L13
            goto L30
        L13:
            boolean r0 = defpackage.ws1.d()
            if (r0 == 0) goto L30
            ws1 r0 = defpackage.ws1.a()
            int r1 = r0.c()
            r2 = 3
            if (r1 == r2) goto L26
            if (r1 != 0) goto L30
        L26:
            ww6 r1 = new ww6
            r1.<init>(r3)
            r3.O0 = r1
            r0.h(r1)
        L30:
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.C0
            int r1 = r10.D0
            int r2 = r10.E0
            int r3 = r10.F0
            int r4 = r10.getThumbOffset()
            int r4 = r4 + r0
            android.graphics.drawable.Drawable r5 = r10.A
            if (r5 == 0) goto L16
            android.graphics.Rect r5 = defpackage.bp1.b(r5)
            goto L18
        L16:
            android.graphics.Rect r5 = defpackage.bp1.c
        L18:
            android.graphics.drawable.Drawable r6 = r10.e0
            android.graphics.Rect r7 = r10.P0
            if (r6 == 0) goto L51
            r6.getPadding(r7)
            int r6 = r7.left
            int r4 = r4 + r6
            if (r5 == 0) goto L4a
            int r8 = r5.left
            if (r8 <= r6) goto L2c
            int r8 = r8 - r6
            int r0 = r0 + r8
        L2c:
            int r6 = r5.top
            int r8 = r7.top
            if (r6 <= r8) goto L35
            int r6 = r6 - r8
            int r6 = r6 + r1
            goto L36
        L35:
            r6 = r1
        L36:
            int r8 = r5.right
            int r9 = r7.right
            if (r8 <= r9) goto L3e
            int r8 = r8 - r9
            int r2 = r2 - r8
        L3e:
            int r5 = r5.bottom
            int r8 = r7.bottom
            if (r5 <= r8) goto L48
            int r5 = r5 - r8
            int r5 = r3 - r5
            goto L4c
        L48:
            r5 = r3
            goto L4c
        L4a:
            r6 = r1
            goto L48
        L4c:
            android.graphics.drawable.Drawable r8 = r10.e0
            r8.setBounds(r0, r6, r2, r5)
        L51:
            android.graphics.drawable.Drawable r0 = r10.A
            if (r0 == 0) goto L70
            r0.getPadding(r7)
            int r0 = r7.left
            int r0 = r4 - r0
            int r2 = r10.B0
            int r4 = r4 + r2
            int r2 = r7.right
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r2 = r10.A
            r2.setBounds(r0, r1, r4, r3)
            android.graphics.drawable.Drawable r2 = r10.getBackground()
            if (r2 == 0) goto L70
            r2.setHotspotBounds(r0, r1, r4, r3)
        L70:
            super.draw(r11)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto La
            r0.setHotspot(r2, r3)
        La:
            android.graphics.drawable.Drawable r1 = r1.e0
            if (r1 == 0) goto L11
            r1.setHotspot(r2, r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.A
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r1 = r1.setState(r0)
            goto L17
        L16:
            r1 = 0
        L17:
            android.graphics.drawable.Drawable r2 = r4.e0
            if (r2 == 0) goto L26
            boolean r3 = r2.isStateful()
            if (r3 == 0) goto L26
            boolean r0 = r2.setState(r0)
            r1 = r1 | r0
        L26:
            if (r1 == 0) goto L2b
            r4.invalidate()
        L2b:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            boolean r0 = defpackage.eq7.a
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L1e
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.z0
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1d
            int r2 = r2.l0
            int r0 = r0 + r2
        L1d:
            return r0
        L1e:
            int r2 = super.getCompoundPaddingLeft()
            return r2
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            boolean r0 = defpackage.eq7.a
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Le
            int r2 = super.getCompoundPaddingRight()
            return r2
        Le:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.z0
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L22
            int r2 = r2.l0
            int r0 = r0 + r2
        L22:
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = defpackage.ii2.Z(r0)
            return r0
    }

    public boolean getShowText() {
            r0 = this;
            boolean r0 = r0.r0
            return r0
    }

    public boolean getSplitTrack() {
            r0 = this;
            boolean r0 = r0.m0
            return r0
    }

    public int getSwitchMinWidth() {
            r0 = this;
            int r0 = r0.k0
            return r0
    }

    public int getSwitchPadding() {
            r0 = this;
            int r0 = r0.l0
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r0 = this;
            java.lang.CharSequence r0 = r0.p0
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r0 = this;
            java.lang.CharSequence r0 = r0.n0
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            return r0
    }

    public final float getThumbPosition() {
            r0 = this;
            float r0 = r0.y0
            return r0
    }

    public int getThumbTextPadding() {
            r0 = this;
            int r0 = r0.j0
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.B
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.L
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.e0
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f0
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.g0
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.e0
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.animation.ObjectAnimator r0 = r1.M0
            if (r0 == 0) goto L23
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r1.M0
            r0.end()
            r0 = 0
            r1.M0 = r0
        L23:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r1) {
            r0 = this;
            int r1 = r1 + 1
            int[] r1 = super.onCreateDrawableState(r1)
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.appcompat.widget.SwitchCompat.R0
            android.view.View.mergeDrawableStates(r1, r0)
        L11:
            return r1
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.graphics.drawable.Drawable r0 = r9.e0
            android.graphics.Rect r1 = r9.P0
            if (r0 == 0) goto Ld
            r0.getPadding(r1)
            goto L10
        Ld:
            r1.setEmpty()
        L10:
            int r2 = r9.D0
            int r3 = r9.F0
            int r4 = r1.top
            int r2 = r2 + r4
            int r4 = r1.bottom
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r9.A
            if (r0 == 0) goto L4c
            boolean r5 = r9.m0
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            android.graphics.Rect r5 = defpackage.bp1.b(r4)
            r4.copyBounds(r1)
            int r6 = r1.left
            int r7 = r5.left
            int r6 = r6 + r7
            r1.left = r6
            int r6 = r1.right
            int r5 = r5.right
            int r6 = r6 - r5
            r1.right = r6
            int r5 = r10.save()
            android.graphics.Region$Op r6 = android.graphics.Region.Op.DIFFERENCE
            r10.clipRect(r1, r6)
            r0.draw(r10)
            r10.restoreToCount(r5)
            goto L4c
        L49:
            r0.draw(r10)
        L4c:
            int r0 = r10.save()
            if (r4 == 0) goto L55
            r4.draw(r10)
        L55:
            boolean r1 = r9.getTargetCheckedState()
            if (r1 == 0) goto L5e
            android.text.StaticLayout r1 = r9.J0
            goto L60
        L5e:
            android.text.StaticLayout r1 = r9.K0
        L60:
            if (r1 == 0) goto La1
            int[] r5 = r9.getDrawableState()
            android.text.TextPaint r6 = r9.H0
            android.content.res.ColorStateList r7 = r9.I0
            if (r7 == 0) goto L74
            r8 = 0
            int r7 = r7.getColorForState(r5, r8)
            r6.setColor(r7)
        L74:
            r6.drawableState = r5
            if (r4 == 0) goto L82
            android.graphics.Rect r9 = r4.getBounds()
            int r4 = r9.left
            int r9 = r9.right
            int r4 = r4 + r9
            goto L86
        L82:
            int r4 = r9.getWidth()
        L86:
            int r4 = r4 / 2
            int r9 = r1.getWidth()
            int r9 = r9 / 2
            int r4 = r4 - r9
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r2 = r2 - r9
            float r9 = (float) r4
            float r2 = (float) r2
            r10.translate(r9, r2)
            r1.draw(r10)
        La1:
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.String r0 = "android.widget.Switch"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = "android.widget.Switch"
            r3.setClassName(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L40
            boolean r0 = r2.isChecked()
            if (r0 == 0) goto L17
            java.lang.CharSequence r2 = r2.n0
            goto L19
        L17:
            java.lang.CharSequence r2 = r2.p0
        L19:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L40
            java.lang.CharSequence r0 = r3.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2d
            r3.setText(r2)
            return
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            r3.setText(r1)
        L40:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r1.A
            r3 = 0
            if (r2 == 0) goto L2e
            android.graphics.drawable.Drawable r2 = r1.e0
            android.graphics.Rect r4 = r1.P0
            if (r2 == 0) goto L12
            r2.getPadding(r4)
            goto L15
        L12:
            r4.setEmpty()
        L15:
            android.graphics.drawable.Drawable r2 = r1.A
            android.graphics.Rect r2 = defpackage.bp1.b(r2)
            int r5 = r2.left
            int r6 = r4.left
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r3, r5)
            int r2 = r2.right
            int r4 = r4.right
            int r2 = r2 - r4
            int r3 = java.lang.Math.max(r3, r2)
            goto L2f
        L2e:
            r5 = r3
        L2f:
            boolean r2 = defpackage.eq7.a
            int r2 = r1.getLayoutDirection()
            r4 = 1
            if (r2 != r4) goto L43
            int r2 = r1.getPaddingLeft()
            int r2 = r2 + r5
            int r4 = r1.z0
            int r4 = r4 + r2
            int r4 = r4 - r5
            int r4 = r4 - r3
            goto L54
        L43:
            int r2 = r1.getWidth()
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            int r4 = r2 - r3
            int r2 = r1.z0
            int r2 = r4 - r2
            int r2 = r2 + r5
            int r2 = r2 + r3
        L54:
            int r3 = r1.getGravity()
            r3 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r3 == r5) goto L79
            r5 = 80
            if (r3 == r5) goto L6a
            int r3 = r1.getPaddingTop()
            int r5 = r1.A0
            int r5 = r5 + r3
            goto L92
        L6a:
            int r3 = r1.getHeight()
            int r5 = r1.getPaddingBottom()
            int r5 = r3 - r5
            int r3 = r1.A0
            int r3 = r5 - r3
            goto L92
        L79:
            int r3 = r1.getPaddingTop()
            int r5 = r1.getHeight()
            int r5 = r5 + r3
            int r3 = r1.getPaddingBottom()
            int r5 = r5 - r3
            int r5 = r5 / 2
            int r3 = r1.A0
            int r6 = r3 / 2
            int r5 = r5 - r6
            int r3 = r3 + r5
            r0 = r5
            r5 = r3
            r3 = r0
        L92:
            r1.C0 = r2
            r1.D0 = r3
            r1.F0 = r5
            r1.E0 = r4
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            boolean r0 = r10.r0
            r1 = 0
            if (r0 == 0) goto L4b
            android.text.StaticLayout r0 = r10.J0
            android.text.TextPaint r4 = r10.H0
            if (r0 != 0) goto L29
            java.lang.CharSequence r3 = r10.o0
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L1d
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L1e
        L1d:
            r5 = r1
        L1e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8 = 0
            r9 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.J0 = r2
        L29:
            android.text.StaticLayout r0 = r10.K0
            if (r0 != 0) goto L4b
            java.lang.CharSequence r3 = r10.q0
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L3f
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L40
        L3f:
            r5 = r1
        L40:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8 = 0
            r9 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.K0 = r2
        L4b:
            android.graphics.drawable.Drawable r0 = r10.A
            android.graphics.Rect r2 = r10.P0
            if (r0 == 0) goto L67
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.A
            int r0 = r0.getIntrinsicWidth()
            int r3 = r2.left
            int r0 = r0 - r3
            int r3 = r2.right
            int r0 = r0 - r3
            android.graphics.drawable.Drawable r3 = r10.A
            int r3 = r3.getIntrinsicHeight()
            goto L69
        L67:
            r0 = r1
            r3 = r0
        L69:
            boolean r4 = r10.r0
            if (r4 == 0) goto L83
            android.text.StaticLayout r4 = r10.J0
            int r4 = r4.getWidth()
            android.text.StaticLayout r5 = r10.K0
            int r5 = r5.getWidth()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r10.j0
            int r5 = r5 * 2
            int r5 = r5 + r4
            goto L84
        L83:
            r5 = r1
        L84:
            int r0 = java.lang.Math.max(r5, r0)
            r10.B0 = r0
            android.graphics.drawable.Drawable r0 = r10.e0
            if (r0 == 0) goto L98
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.e0
            int r1 = r0.getIntrinsicHeight()
            goto L9b
        L98:
            r2.setEmpty()
        L9b:
            int r0 = r2.left
            int r2 = r2.right
            android.graphics.drawable.Drawable r4 = r10.A
            if (r4 == 0) goto Lb3
            android.graphics.Rect r4 = defpackage.bp1.b(r4)
            int r5 = r4.left
            int r0 = java.lang.Math.max(r0, r5)
            int r4 = r4.right
            int r2 = java.lang.Math.max(r2, r4)
        Lb3:
            boolean r4 = r10.G0
            int r5 = r10.k0
            if (r4 == 0) goto Lc3
            int r4 = r10.B0
            int r4 = r4 * 2
            int r4 = r4 + r0
            int r4 = r4 + r2
            int r5 = java.lang.Math.max(r5, r4)
        Lc3:
            int r0 = java.lang.Math.max(r1, r3)
            r10.z0 = r5
            r10.A0 = r0
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredHeight()
            if (r11 >= r0) goto Ldb
            int r11 = r10.getMeasuredWidthAndState()
            r10.setMeasuredDimension(r11, r0)
        Ldb:
            return
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onPopulateAccessibilityEvent(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r1 = r1.n0
            goto Le
        Lc:
            java.lang.CharSequence r1 = r1.p0
        Le:
            if (r1 == 0) goto L17
            java.util.List r2 = r2.getText()
            r2.add(r1)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            android.view.VelocityTracker r0 = r9.w0
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.t0
            r3 = 1
            if (r1 == 0) goto Lf8
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L8e
            if (r1 == r6) goto L19
            if (r1 == r4) goto L8e
            goto L144
        L19:
            int r0 = r9.s0
            if (r0 == r3) goto L5f
            if (r0 == r6) goto L21
            goto L144
        L21:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.u0
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L34
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L3d
        L34:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r1 = r2
            goto L3d
        L3a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L3d:
            boolean r0 = defpackage.eq7.a
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L46
            float r1 = -r1
        L46:
            float r0 = r9.y0
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L4e
            goto L55
        L4e:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L54
            r5 = r2
            goto L55
        L54:
            r5 = r1
        L55:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L5e
            r9.u0 = r10
            r9.setThumbPosition(r5)
        L5e:
            return r3
        L5f:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.u0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L80
            float r4 = r9.v0
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L144
        L80:
            r9.s0 = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.u0 = r0
            r9.v0 = r1
            return r3
        L8e:
            int r1 = r9.s0
            r2 = 0
            if (r1 != r6) goto Lf2
            r9.s0 = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto La3
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto La3
            r1 = r3
            goto La4
        La3:
            r1 = r2
        La4:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto Ld8
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.x0
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto Ld3
            boolean r1 = defpackage.eq7.a
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto Lce
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lcc
        Lca:
            r0 = r3
            goto Ld9
        Lcc:
            r0 = r2
            goto Ld9
        Lce:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lcc
            goto Lca
        Ld3:
            boolean r0 = r9.getTargetCheckedState()
            goto Ld9
        Ld8:
            r0 = r6
        Ld9:
            if (r0 == r6) goto Lde
            r9.playSoundEffect(r2)
        Lde:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        Lf2:
            r9.s0 = r2
            r0.clear()
            goto L144
        Lf8:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L144
            android.graphics.drawable.Drawable r4 = r9.A
            if (r4 != 0) goto L10b
            goto L144
        L10b:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.A
            android.graphics.Rect r6 = r9.P0
            r5.getPadding(r6)
            int r5 = r9.D0
            int r5 = r5 - r2
            int r7 = r9.C0
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.B0
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.F0
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L144
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L144
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L144
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L144
            r9.s0 = r3
            r9.u0 = r0
            r9.v0 = r1
        L144:
            boolean r9 = super.onTouchEvent(r10)
            return r9
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            lr r0 = r0.getEmojiTextViewHelper()
            r0.c(r1)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r8) {
            r7 = this;
            super.setChecked(r8)
            boolean r8 = r7.isChecked()
            r3 = 64
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r1 = 2131427951(0x7f0b026f, float:1.8477533E38)
            r4 = 30
            if (r8 == 0) goto L32
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L51
            java.lang.CharSequence r0 = r7.n0
            if (r0 != 0) goto L25
            android.content.res.Resources r0 = r7.getResources()
            r5 = 2131951623(0x7f130007, float:1.9539666E38)
            java.lang.String r0 = r0.getString(r5)
        L25:
            r6 = r0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            on7 r0 = new on7
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f(r7, r6)
            goto L51
        L32:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L51
            java.lang.CharSequence r0 = r7.p0
            if (r0 != 0) goto L45
            android.content.res.Resources r0 = r7.getResources()
            r5 = 2131951622(0x7f130006, float:1.9539664E38)
            java.lang.String r0 = r0.getString(r5)
        L45:
            r6 = r0
            java.util.WeakHashMap r0 = defpackage.ao7.a
            on7 r0 = new on7
            r5 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f(r7, r6)
        L51:
            android.os.IBinder r0 = r7.getWindowToken()
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L81
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L81
            if (r8 == 0) goto L63
            r1 = r2
        L63:
            r8 = 1
            float[] r0 = new float[r8]
            r2 = 0
            r0[r2] = r1
            ml0 r1 = androidx.appcompat.widget.SwitchCompat.Q0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r1, r0)
            r7.M0 = r0
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r7.M0
            r0.setAutoCancel(r8)
            android.animation.ObjectAnimator r7 = r7.M0
            r7.start()
            return
        L81:
            android.animation.ObjectAnimator r0 = r7.M0
            if (r0 == 0) goto L88
            r0.cancel()
        L88:
            if (r8 == 0) goto L8b
            r1 = r2
        L8b:
            r7.setThumbPosition(r1)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.ii2.c0(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            lr r0 = r1.getEmojiTextViewHelper()
            r0.d(r2)
            java.lang.CharSequence r2 = r1.n0
            r1.setTextOnInternal(r2)
            java.lang.CharSequence r2 = r1.p0
            r1.setTextOffInternal(r2)
            r1.requestLayout()
            return
    }

    public final void setEnforceSwitchWidth(boolean r1) {
            r0 = this;
            r0.G0 = r1
            r0.invalidate()
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            lr r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.a(r2)
            super.setFilters(r2)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.r0
            if (r0 == r2) goto Le
            r1.r0 = r2
            r1.requestLayout()
            if (r2 == 0) goto Le
            r1.d()
        Le:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.m0 = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.k0 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.l0 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.H0
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 == 0) goto L12
            android.graphics.Typeface r1 = r0.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a
        L12:
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 != 0) goto L23
            if (r3 == 0) goto L23
        L1a:
            r0.setTypeface(r3)
            r2.requestLayout()
            r2.invalidate()
        L23:
            return
    }

    public void setTextOff(java.lang.CharSequence r7) {
            r6 = this;
            r6.setTextOffInternal(r7)
            r6.requestLayout()
            boolean r7 = r6.isChecked()
            if (r7 != 0) goto L33
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r7 < r4) goto L33
            java.lang.CharSequence r7 = r6.p0
            if (r7 != 0) goto L21
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131951622(0x7f130006, float:1.9539664E38)
            java.lang.String r7 = r7.getString(r0)
        L21:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            on7 r0 = new on7
            r3 = 64
            r5 = 2
            r1 = 2131427951(0x7f0b026f, float:1.8477533E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f(r6, r7)
        L33:
            return
    }

    public void setTextOn(java.lang.CharSequence r7) {
            r6 = this;
            r6.setTextOnInternal(r7)
            r6.requestLayout()
            boolean r7 = r6.isChecked()
            if (r7 == 0) goto L33
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r7 < r4) goto L33
            java.lang.CharSequence r7 = r6.n0
            if (r7 != 0) goto L21
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131951623(0x7f130007, float:1.9539666E38)
            java.lang.String r7 = r7.getString(r0)
        L21:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            on7 r0 = new on7
            r3 = 64
            r5 = 2
            r1 = 2131427951(0x7f0b026f, float:1.8477533E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f(r6, r7)
        L33:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.A = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setThumbPosition(float r1) {
            r0 = this;
            r0.y0 = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setThumbDrawable(r2)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.j0 = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.B = r1
            r1 = 1
            r0.R = r1
            r0.a()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.L = r1
            r1 = 1
            r0.d0 = r1
            r0.a()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.e0
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.e0 = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setTrackDrawable(r2)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f0 = r1
            r1 = 1
            r0.h0 = r1
            r0.b()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.g0 = r1
            r1 = 1
            r0.i0 = r1
            r0.b()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.A
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r1 = r1.e0
            if (r2 != r1) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }
}
