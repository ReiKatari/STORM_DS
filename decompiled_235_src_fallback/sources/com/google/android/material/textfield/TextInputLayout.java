package com.google.android.material.textfield;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] z1 = null;
    public final android.widget.FrameLayout A;
    public android.content.res.ColorStateList A0;
    public final defpackage.fp6 B;
    public android.content.res.ColorStateList B0;
    public boolean C0;
    public java.lang.CharSequence D0;
    public boolean E0;
    public defpackage.p24 F0;
    public defpackage.p24 G0;
    public android.graphics.drawable.StateListDrawable H0;
    public boolean I0;
    public defpackage.p24 J0;
    public defpackage.p24 K0;
    public final defpackage.n42 L;
    public defpackage.me6 L0;
    public boolean M0;
    public final int N0;
    public int O0;
    public int P0;
    public int Q0;
    public final int R;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public final android.graphics.Rect V0;
    public final android.graphics.Rect W0;
    public final android.graphics.RectF X0;
    public android.graphics.Typeface Y0;
    public android.graphics.drawable.ColorDrawable Z0;
    public int a1;
    public final java.util.LinkedHashSet b1;
    public android.graphics.drawable.ColorDrawable c1;
    public android.widget.EditText d0;
    public int d1;
    public java.lang.CharSequence e0;
    public android.graphics.drawable.Drawable e1;
    public int f0;
    public android.content.res.ColorStateList f1;
    public int g0;
    public android.content.res.ColorStateList g1;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public final defpackage.q43 j0;
    public int j1;
    public boolean k0;
    public android.content.res.ColorStateList k1;
    public int l0;
    public int l1;
    public boolean m0;
    public int m1;
    public defpackage.m37 n0;
    public int n1;
    public defpackage.qs o0;
    public int o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public java.lang.CharSequence r0;
    public boolean r1;
    public boolean s0;
    public final defpackage.at0 s1;
    public defpackage.qs t0;
    public boolean t1;
    public android.content.res.ColorStateList u0;
    public boolean u1;
    public int v0;
    public android.animation.ValueAnimator v1;
    public defpackage.h92 w0;
    public boolean w1;
    public defpackage.h92 x0;
    public boolean x1;
    public android.content.res.ColorStateList y0;
    public boolean y1;
    public android.content.res.ColorStateList z0;

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            r1 = 0
            int[] r1 = new int[r1]
            int[][] r0 = new int[][]{r0, r1}
            com.google.android.material.textfield.TextInputLayout.z1 = r0
            return
    }

    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23) {
            r21 = this;
            r0 = r21
            r2 = r23
            r4 = 2130969960(0x7f040568, float:1.7548617E38)
            r7 = 2132018138(0x7f1403da, float:1.9674574E38)
            r1 = r22
            android.content.Context r1 = defpackage.q60.e0(r1, r2, r4, r7)
            r0.<init>(r1, r2, r4)
            r8 = -1
            r0.f0 = r8
            r0.g0 = r8
            r0.h0 = r8
            r0.i0 = r8
            q43 r1 = new q43
            r1.<init>(r0)
            r0.j0 = r1
            fa6 r1 = new fa6
            r9 = 7
            r1.<init>(r9)
            r0.n0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.V0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.W0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.X0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.b1 = r1
            at0 r1 = new at0
            r1.<init>(r0)
            r0.s1 = r1
            r10 = 0
            r0.y1 = r10
            android.content.Context r3 = r0.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            r12.<init>(r3)
            r0.A = r12
            r12.setAddStatesFromChildren(r11)
            android.view.animation.LinearInterpolator r5 = defpackage.vo.a
            r1.R = r5
            r1.j(r10)
            r1.Q = r5
            r1.j(r10)
            int r5 = r1.g
            r6 = 8388659(0x800033, float:1.1755015E-38)
            if (r5 == r6) goto L81
            r1.g = r6
            r1.j(r10)
        L81:
            r13 = 22
            r14 = 20
            r15 = 40
            r1 = 45
            r5 = 50
            int[] r6 = new int[]{r13, r14, r15, r1, r5}
            r16 = r5
            r5 = 2132018138(0x7f1403da, float:1.9674574E38)
            defpackage.f04.r(r3, r2, r4, r5)
            r17 = r1
            r1 = r3
            int[] r3 = defpackage.a75.D
            r13 = r16
            r14 = r17
            defpackage.f04.s(r1, r2, r3, r4, r5, r6)
            m44 r6 = new m44
            android.content.res.TypedArray r3 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r6.<init>(r1, r3)
            fp6 r5 = new fp6
            r5.<init>(r0, r6)
            r0.B = r5
            r14 = 48
            boolean r14 = r3.getBoolean(r14, r11)
            r0.C0 = r14
            r14 = 4
            java.lang.CharSequence r14 = r3.getText(r14)
            r0.setHint(r14)
            r14 = 47
            boolean r14 = r3.getBoolean(r14, r11)
            r0.u1 = r14
            r14 = 42
            boolean r14 = r3.getBoolean(r14, r11)
            r0.t1 = r14
            r14 = 6
            boolean r18 = r3.hasValue(r14)
            if (r18 == 0) goto Le2
            int r14 = r3.getInt(r14, r8)
            r0.setMinEms(r14)
            goto Lf0
        Le2:
            r14 = 3
            boolean r18 = r3.hasValue(r14)
            if (r18 == 0) goto Lf0
            int r14 = r3.getDimensionPixelSize(r14, r8)
            r0.setMinWidth(r14)
        Lf0:
            r14 = 5
            boolean r18 = r3.hasValue(r14)
            r15 = 2
            if (r18 == 0) goto L100
            int r14 = r3.getInt(r14, r8)
            r0.setMaxEms(r14)
            goto L10d
        L100:
            boolean r14 = r3.hasValue(r15)
            if (r14 == 0) goto L10d
            int r14 = r3.getDimensionPixelSize(r15, r8)
            r0.setMaxWidth(r14)
        L10d:
            le6 r2 = defpackage.me6.b(r1, r2, r4, r7)
            me6 r2 = r2.a()
            r0.L0 = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131166179(0x7f0703e3, float:1.7946596E38)
            int r2 = r2.getDimensionPixelOffset(r4)
            r0.N0 = r2
            r2 = 9
            int r2 = r3.getDimensionPixelOffset(r2, r10)
            r0.P0 = r2
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131165820(0x7f07027c, float:1.7945868E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r0.R = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131166180(0x7f0703e4, float:1.7946598E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 16
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.R0 = r2
            android.content.res.Resources r2 = r1.getResources()
            r4 = 2131166181(0x7f0703e5, float:1.79466E38)
            int r2 = r2.getDimensionPixelSize(r4)
            r4 = 17
            int r2 = r3.getDimensionPixelSize(r4, r2)
            r0.S0 = r2
            int r2 = r0.R0
            r0.Q0 = r2
            r2 = 13
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r3.getDimension(r2, r4)
            r7 = 12
            float r7 = r3.getDimension(r7, r4)
            r14 = 10
            float r14 = r3.getDimension(r14, r4)
            r15 = 11
            float r4 = r3.getDimension(r15, r4)
            me6 r15 = r0.L0
            le6 r15 = r15.f()
            r19 = 0
            int r20 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r20 < 0) goto L190
            t r13 = new t
            r13.<init>(r2)
            r15.e = r13
        L190:
            int r2 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r2 < 0) goto L19b
            t r2 = new t
            r2.<init>(r7)
            r15.f = r2
        L19b:
            int r2 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r2 < 0) goto L1a6
            t r2 = new t
            r2.<init>(r14)
            r15.g = r2
        L1a6:
            int r2 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r2 < 0) goto L1b1
            t r2 = new t
            r2.<init>(r4)
            r15.h = r2
        L1b1:
            me6 r2 = r15.a()
            r0.L0 = r2
            android.content.res.ColorStateList r2 = defpackage.np2.R(r1, r6, r9)
            if (r2 == 0) goto L216
            int r4 = r2.getDefaultColor()
            r0.l1 = r4
            r0.U0 = r4
            boolean r4 = r2.isStateful()
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r9 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L1f6
            int[] r4 = new int[]{r9}
            int r4 = r2.getColorForState(r4, r8)
            r0.m1 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r9 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r9}
            int r4 = r2.getColorForState(r4, r8)
            r0.n1 = r4
            int[] r4 = new int[]{r7, r9}
            int r2 = r2.getColorForState(r4, r8)
            r0.o1 = r2
            goto L220
        L1f6:
            int r2 = r0.l1
            r0.n1 = r2
            r2 = 2131100564(0x7f060394, float:1.7813513E38)
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r1, r2)
            int[] r4 = new int[]{r9}
            int r4 = r2.getColorForState(r4, r8)
            r0.m1 = r4
            int[] r4 = new int[]{r7}
            int r2 = r2.getColorForState(r4, r8)
            r0.o1 = r2
            goto L220
        L216:
            r0.U0 = r10
            r0.l1 = r10
            r0.m1 = r10
            r0.n1 = r10
            r0.o1 = r10
        L220:
            boolean r2 = r3.hasValue(r11)
            if (r2 == 0) goto L22e
            android.content.res.ColorStateList r2 = r6.g(r11)
            r0.g1 = r2
            r0.f1 = r2
        L22e:
            r2 = 14
            android.content.res.ColorStateList r4 = defpackage.np2.R(r1, r6, r2)
            int r2 = r3.getColor(r2, r10)
            r0.j1 = r2
            r2 = 2131100591(0x7f0603af, float:1.7813568E38)
            int r2 = r1.getColor(r2)
            r0.h1 = r2
            r2 = 2131100592(0x7f0603b0, float:1.781357E38)
            int r2 = r1.getColor(r2)
            r0.p1 = r2
            r2 = 2131100595(0x7f0603b3, float:1.7813576E38)
            int r2 = r1.getColor(r2)
            r0.i1 = r2
            if (r4 == 0) goto L25a
            r0.setBoxStrokeColorStateList(r4)
        L25a:
            r2 = 15
            boolean r4 = r3.hasValue(r2)
            if (r4 == 0) goto L269
            android.content.res.ColorStateList r1 = defpackage.np2.R(r1, r6, r2)
            r0.setBoxStrokeErrorColor(r1)
        L269:
            r13 = 50
            int r1 = r3.getResourceId(r13, r8)
            if (r1 == r8) goto L278
            int r1 = r3.getResourceId(r13, r10)
            r0.setHintTextAppearance(r1)
        L278:
            r1 = 24
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.A0 = r1
            r1 = 25
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.B0 = r1
            r1 = 40
            int r1 = r3.getResourceId(r1, r10)
            r2 = 35
            java.lang.CharSequence r2 = r3.getText(r2)
            r4 = 34
            int r4 = r3.getInt(r4, r11)
            r7 = 36
            boolean r7 = r3.getBoolean(r7, r10)
            r14 = 45
            int r9 = r3.getResourceId(r14, r10)
            r13 = 44
            boolean r13 = r3.getBoolean(r13, r10)
            r14 = 43
            java.lang.CharSequence r14 = r3.getText(r14)
            r15 = 58
            int r15 = r3.getResourceId(r15, r10)
            r11 = 57
            java.lang.CharSequence r11 = r3.getText(r11)
            r8 = 18
            boolean r8 = r3.getBoolean(r8, r10)
            r10 = 19
            r23 = r14
            r14 = -1
            int r10 = r3.getInt(r10, r14)
            r0.setCounterMaxLength(r10)
            r10 = 0
            r14 = 22
            int r14 = r3.getResourceId(r14, r10)
            r0.q0 = r14
            r14 = 20
            int r14 = r3.getResourceId(r14, r10)
            r0.p0 = r14
            r14 = 8
            int r14 = r3.getInt(r14, r10)
            r0.setBoxBackgroundMode(r14)
            r0.setErrorContentDescription(r2)
            r0.setErrorAccessibilityLiveRegion(r4)
            int r2 = r0.p0
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r1)
            int r1 = r0.q0
            r0.setCounterTextAppearance(r1)
            r0.setPlaceholderText(r11)
            r0.setPlaceholderTextAppearance(r15)
            r1 = 41
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L315
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setErrorTextColor(r1)
        L315:
            r1 = 46
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L324
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setHelperTextColor(r1)
        L324:
            r1 = 51
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L333
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setHintTextColor(r1)
        L333:
            r1 = 23
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L342
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setCounterTextColor(r1)
        L342:
            r1 = 21
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L351
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setCounterOverflowTextColor(r1)
        L351:
            r1 = 59
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L360
            android.content.res.ColorStateList r1 = r6.g(r1)
            r0.setPlaceholderTextColor(r1)
        L360:
            n42 r1 = new n42
            r1.<init>(r0, r6)
            r0.L = r1
            r2 = 1
            r10 = 0
            boolean r4 = r3.getBoolean(r10, r2)
            r9 = 49
            int r2 = r3.getInt(r9, r2)
            r0.setHintMaxLines(r2)
            r6.D()
            r2 = 2
            r0.setImportantForAccessibility(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L386
            defpackage.q66.y(r0)
        L386:
            r12.addView(r5)
            r12.addView(r1)
            r0.addView(r12)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r13)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r8)
            r1 = r23
            r0.setHelperText(r1)
            return
    }

    private android.graphics.drawable.Drawable getEditTextBoxBackground() {
            r9 = this;
            android.widget.EditText r0 = r9.d0
            boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
            if (r1 == 0) goto L9b
            int r0 = r0.getInputType()
            if (r0 == 0) goto Le
            goto L9b
        Le:
            android.widget.EditText r0 = r9.d0
            r1 = 2130968848(0x7f040110, float:1.7546361E38)
            int r0 = defpackage.mp2.B(r0, r1)
            int r1 = r9.O0
            r2 = 1
            r3 = 2
            r4 = 1036831949(0x3dcccccd, float:0.1)
            int[][] r5 = com.google.android.material.textfield.TextInputLayout.z1
            if (r1 != r3) goto L80
            android.content.Context r1 = r9.getContext()
            p24 r9 = r9.F0
            java.lang.String r6 = "TextInputLayout"
            r7 = 2130968890(0x7f04013a, float:1.7546446E38)
            android.util.TypedValue r6 = defpackage.qo2.O(r1, r7, r6)
            int r7 = r6.resourceId
            if (r7 == 0) goto L3a
            int r1 = r1.getColor(r7)
            goto L3c
        L3a:
            int r1 = r6.data
        L3c:
            p24 r6 = new p24
            n24 r7 = r9.B
            me6 r7 = r7.a
            r6.<init>(r7)
            int r0 = defpackage.mp2.Q(r4, r0, r1)
            r4 = 0
            int[] r7 = new int[]{r0, r4}
            android.content.res.ColorStateList r8 = new android.content.res.ColorStateList
            r8.<init>(r5, r7)
            r6.n(r8)
            r6.setTint(r1)
            int[] r0 = new int[]{r0, r1}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r5, r0)
            p24 r0 = new p24
            n24 r5 = r9.B
            me6 r5 = r5.a
            r0.<init>(r5)
            r5 = -1
            r0.setTint(r5)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            r5.<init>(r1, r6, r0)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r3]
            r0[r4] = r5
            r0[r2] = r9
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r9.<init>(r0)
            return r9
        L80:
            if (r1 != r2) goto L99
            p24 r1 = r9.F0
            int r9 = r9.U0
            int r0 = defpackage.mp2.Q(r4, r0, r9)
            int[] r9 = new int[]{r0, r9}
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r5, r9)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            r9.<init>(r0, r1, r1)
            return r9
        L99:
            r9 = 0
            return r9
        L9b:
            p24 r9 = r9.F0
            return r9
    }

    private android.graphics.drawable.Drawable getOrCreateFilledDropDownMenuBackground() {
            r3 = this;
            android.graphics.drawable.StateListDrawable r0 = r3.H0
            if (r0 != 0) goto L25
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable
            r0.<init>()
            r3.H0 = r0
            r1 = 16842922(0x10100aa, float:2.3694034E-38)
            int[] r1 = new int[]{r1}
            android.graphics.drawable.Drawable r2 = r3.getOrCreateOutlinedDropDownMenuBackground()
            r0.addState(r1, r2)
            android.graphics.drawable.StateListDrawable r0 = r3.H0
            r1 = 0
            int[] r2 = new int[r1]
            p24 r1 = r3.h(r1)
            r0.addState(r2, r1)
        L25:
            android.graphics.drawable.StateListDrawable r3 = r3.H0
            return r3
    }

    private android.graphics.drawable.Drawable getOrCreateOutlinedDropDownMenuBackground() {
            r1 = this;
            p24 r0 = r1.G0
            if (r0 != 0) goto Lb
            r0 = 1
            p24 r0 = r1.h(r0)
            r1.G0 = r0
        Lb:
            p24 r1 = r1.G0
            return r1
    }

    public static void m(android.view.ViewGroup r4, boolean r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            r2.setEnabled(r5)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L17
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            m(r2, r5)
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            return
    }

    private void setEditText(android.widget.EditText r6) {
            r5 = this;
            android.widget.EditText r0 = r5.d0
            if (r0 != 0) goto L114
            int r0 = r5.getEndIconMode()
            r1 = 3
            if (r0 == r1) goto L16
            boolean r0 = r6 instanceof com.google.android.material.textfield.TextInputEditText
            if (r0 != 0) goto L16
            java.lang.String r0 = "TextInputLayout"
            java.lang.String r1 = "EditText added is not a TextInputEditText. Please switch to using that class instead."
            android.util.Log.i(r0, r1)
        L16:
            r5.d0 = r6
            int r0 = r5.f0
            r1 = -1
            if (r0 == r1) goto L21
            r5.setMinEms(r0)
            goto L26
        L21:
            int r0 = r5.h0
            r5.setMinWidth(r0)
        L26:
            int r0 = r5.g0
            if (r0 == r1) goto L2e
            r5.setMaxEms(r0)
            goto L33
        L2e:
            int r0 = r5.i0
            r5.setMaxWidth(r0)
        L33:
            r0 = 0
            r5.I0 = r0
            r5.k()
            l37 r1 = new l37
            r1.<init>(r5)
            r5.setTextInputAccessibilityDelegate(r1)
            android.widget.EditText r1 = r5.d0
            android.graphics.Typeface r1 = r1.getTypeface()
            at0 r2 = r5.s1
            r2.n(r1)
            android.widget.EditText r1 = r5.d0
            float r1 = r1.getTextSize()
            float r3 = r2.h
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L5d
            r2.h = r1
            r2.j(r0)
        L5d:
            android.widget.EditText r1 = r5.d0
            float r1 = r1.getLetterSpacing()
            float r3 = r2.X
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L6e
            r2.X = r1
            r2.j(r0)
        L6e:
            android.widget.EditText r1 = r5.d0
            int r1 = r1.getGravity()
            r3 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r3 = r3 | 48
            int r4 = r2.g
            if (r4 == r3) goto L81
            r2.g = r3
            r2.j(r0)
        L81:
            int r3 = r2.f
            if (r3 == r1) goto L8a
            r2.f = r1
            r2.j(r0)
        L8a:
            int r1 = r6.getMinimumHeight()
            r5.q1 = r1
            android.widget.EditText r1 = r5.d0
            k37 r2 = new k37
            r2.<init>(r5, r6)
            r1.addTextChangedListener(r2)
            android.content.res.ColorStateList r1 = r5.f1
            if (r1 != 0) goto La6
            android.widget.EditText r1 = r5.d0
            android.content.res.ColorStateList r1 = r1.getHintTextColors()
            r5.f1 = r1
        La6:
            boolean r1 = r5.C0
            r2 = 1
            if (r1 == 0) goto Lc6
            java.lang.CharSequence r1 = r5.D0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lc4
            android.widget.EditText r1 = r5.d0
            java.lang.CharSequence r1 = r1.getHint()
            r5.e0 = r1
            r5.setHint(r1)
            android.widget.EditText r1 = r5.d0
            r3 = 0
            r1.setHint(r3)
        Lc4:
            r5.E0 = r2
        Lc6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto Lcf
            r5.r()
        Lcf:
            qs r1 = r5.o0
            if (r1 == 0) goto Ldc
            android.widget.EditText r1 = r5.d0
            android.text.Editable r1 = r1.getText()
            r5.p(r1)
        Ldc:
            r5.t()
            q43 r1 = r5.j0
            r1.b()
            fp6 r1 = r5.B
            r1.bringToFront()
            n42 r1 = r5.L
            r1.bringToFront()
            java.util.LinkedHashSet r3 = r5.b1
            java.util.Iterator r3 = r3.iterator()
        Lf4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L104
            java.lang.Object r4 = r3.next()
            l42 r4 = (defpackage.l42) r4
            r4.a(r5)
            goto Lf4
        L104:
            r1.m()
            boolean r1 = r5.isEnabled()
            if (r1 != 0) goto L110
            r6.setEnabled(r0)
        L110:
            r5.w(r0, r2)
            return
        L114:
            java.lang.String r5 = "We already have an EditText, can only have one"
            defpackage.i.h(r5)
            return
    }

    private void setHintInternal(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.CharSequence r0 = r2.D0
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L26
            r2.D0 = r3
            at0 r0 = r2.s1
            if (r3 == 0) goto L16
            java.lang.CharSequence r1 = r0.B
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L1f
        L16:
            r0.B = r3
            r3 = 0
            r0.C = r3
            r3 = 0
            r0.j(r3)
        L1f:
            boolean r3 = r2.r1
            if (r3 != 0) goto L26
            r2.l()
        L26:
            return
    }

    private void setPlaceholderTextEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.s0
            if (r0 != r3) goto L5
            return
        L5:
            qs r0 = r2.t0
            if (r3 == 0) goto L17
            if (r0 == 0) goto L21
            android.widget.FrameLayout r1 = r2.A
            r1.addView(r0)
            qs r0 = r2.t0
            r1 = 0
            r0.setVisibility(r1)
            goto L21
        L17:
            if (r0 == 0) goto L1e
            r1 = 8
            r0.setVisibility(r1)
        L1e:
            r0 = 0
            r2.t0 = r0
        L21:
            r2.s0 = r3
            return
    }

    public final void a() {
            r5 = this;
            android.widget.EditText r0 = r5.d0
            if (r0 == 0) goto L9d
            int r0 = r5.O0
            r1 = 1
            if (r0 == r1) goto Lb
            goto L9d
        Lb:
            int r0 = r5.getHintMaxLines()
            r2 = 2131165980(0x7f07031c, float:1.7946192E38)
            if (r0 != r1) goto L7b
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4e
            android.widget.EditText r0 = r5.d0
            int r1 = r0.getPaddingStart()
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131165983(0x7f07031f, float:1.7946199E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r5.d0
            int r3 = r3.getPaddingEnd()
            android.content.res.Resources r5 = r5.getResources()
            r4 = 2131165982(0x7f07031e, float:1.7946196E38)
            int r5 = r5.getDimensionPixelSize(r4)
            r0.setPaddingRelative(r1, r2, r3, r5)
            return
        L4e:
            android.content.Context r0 = r5.getContext()
            boolean r0 = defpackage.np2.W(r0)
            if (r0 == 0) goto L9d
            android.widget.EditText r0 = r5.d0
            int r1 = r0.getPaddingStart()
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2131165981(0x7f07031d, float:1.7946194E38)
            int r3 = r3.getDimensionPixelSize(r4)
            android.widget.EditText r4 = r5.d0
            int r4 = r4.getPaddingEnd()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r2)
            r0.setPaddingRelative(r1, r3, r4, r5)
            return
        L7b:
            android.widget.EditText r0 = r5.d0
            int r1 = r0.getPaddingStart()
            at0 r3 = r5.s1
            float r3 = r3.f()
            int r4 = r5.R
            float r4 = (float) r4
            float r3 = r3 + r4
            int r3 = (int) r3
            android.widget.EditText r4 = r5.d0
            int r4 = r4.getPaddingEnd()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r2)
            r0.setPaddingRelative(r1, r3, r4, r5)
        L9d:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.EditText
            if (r0 == 0) goto L22
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4)
            int r0 = r3.gravity
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            r0 = r0 | 16
            r3.gravity = r0
            android.widget.FrameLayout r0 = r1.A
            r0.addView(r2, r3)
            r0.setLayoutParams(r4)
            r1.v()
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1.setEditText(r2)
            return
        L22:
            super.addView(r2, r3, r4)
            return
    }

    public final void b(float r7) {
            r6 = this;
            at0 r0 = r6.s1
            float r1 = r0.b
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L9
            return
        L9:
            android.animation.ValueAnimator r1 = r6.v1
            r2 = 2
            if (r1 != 0) goto L42
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r6.v1 = r1
            android.content.Context r3 = r6.getContext()
            r4 = 2130969539(0x7f0403c3, float:1.7547763E38)
            q92 r5 = defpackage.vo.b
            android.animation.TimeInterpolator r3 = defpackage.kj2.X(r3, r4, r5)
            r1.setInterpolator(r3)
            android.animation.ValueAnimator r1 = r6.v1
            android.content.Context r3 = r6.getContext()
            r4 = 2130969529(0x7f0403b9, float:1.7547742E38)
            r5 = 167(0xa7, float:2.34E-43)
            int r3 = defpackage.kj2.W(r3, r4, r5)
            long r3 = (long) r3
            r1.setDuration(r3)
            android.animation.ValueAnimator r1 = r6.v1
            f60 r3 = new f60
            r3.<init>(r6, r2)
            r1.addUpdateListener(r3)
        L42:
            android.animation.ValueAnimator r1 = r6.v1
            float r0 = r0.b
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r7
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r6 = r6.v1
            r6.start()
            return
    }

    public final void c() {
            r5 = this;
            p24 r0 = r5.F0
            if (r0 != 0) goto L5
            return
        L5:
            n24 r1 = r0.B
            me6 r1 = r1.a
            me6 r2 = r5.L0
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r5.O0
            r1 = 2
            r2 = -1
            if (r0 != r1) goto L3b
            int r0 = r5.Q0
            if (r0 <= r2) goto L3b
            int r1 = r5.T0
            if (r1 == 0) goto L3b
            p24 r3 = r5.F0
            float r0 = (float) r0
            n24 r4 = r3.B
            r4.k = r0
            r3.invalidateSelf()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            n24 r1 = r3.B
            android.content.res.ColorStateList r4 = r1.e
            if (r4 == r0) goto L3b
            r1.e = r0
            int[] r0 = r3.getState()
            r3.onStateChange(r0)
        L3b:
            int r0 = r5.U0
            int r1 = r5.O0
            r3 = 1
            if (r1 != r3) goto L54
            r0 = 0
            android.content.Context r1 = r5.getContext()
            r3 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r0 = defpackage.mp2.A(r1, r3, r0)
            int r1 = r5.U0
            int r0 = defpackage.tt0.b(r1, r0)
        L54:
            r5.U0 = r0
            p24 r1 = r5.F0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.n(r0)
            p24 r0 = r5.J0
            if (r0 == 0) goto L96
            p24 r1 = r5.K0
            if (r1 != 0) goto L68
            goto L96
        L68:
            int r1 = r5.Q0
            if (r1 <= r2) goto L93
            int r1 = r5.T0
            if (r1 == 0) goto L93
            android.widget.EditText r1 = r5.d0
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L7f
            int r1 = r5.h1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L85
        L7f:
            int r1 = r5.T0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L85:
            r0.n(r1)
            p24 r0 = r5.K0
            int r1 = r5.T0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.n(r1)
        L93:
            r5.invalidate()
        L96:
            r5.u()
            return
    }

    public final android.graphics.Rect d(android.graphics.Rect r6) {
            r5 = this;
            android.widget.EditText r0 = r5.d0
            if (r0 == 0) goto L68
            int r0 = r5.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = 0
        Le:
            int r2 = r6.bottom
            android.graphics.Rect r3 = r5.W0
            r3.bottom = r2
            int r2 = r5.O0
            if (r2 == r1) goto L50
            int r1 = r6.left
            r4 = 2
            if (r2 == r4) goto L32
            int r1 = r5.i(r1, r0)
            r3.left = r1
            int r1 = r5.getPaddingTop()
            r3.top = r1
            int r6 = r6.right
            int r5 = r5.j(r6, r0)
            r3.right = r5
            return r3
        L32:
            android.widget.EditText r0 = r5.d0
            int r0 = r0.getPaddingLeft()
            int r0 = r0 + r1
            r3.left = r0
            int r0 = r6.top
            int r1 = r5.e()
            int r0 = r0 - r1
            r3.top = r0
            int r6 = r6.right
            android.widget.EditText r5 = r5.d0
            int r5 = r5.getPaddingRight()
            int r6 = r6 - r5
            r3.right = r6
            return r3
        L50:
            int r1 = r6.left
            int r1 = r5.i(r1, r0)
            r3.left = r1
            int r1 = r6.top
            int r2 = r5.P0
            int r1 = r1 + r2
            r3.top = r1
            int r6 = r6.right
            int r5 = r5.j(r6, r0)
            r3.right = r5
            return r3
        L68:
            defpackage.e41.m()
            r5 = 0
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure r6, int r7) {
            r5 = this;
            android.widget.EditText r0 = r5.d0
            if (r0 != 0) goto L8
            super.dispatchProvideAutofillStructure(r6, r7)
            return
        L8:
            java.lang.CharSequence r1 = r5.e0
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = r5.E0
            r5.E0 = r2
            java.lang.CharSequence r0 = r0.getHint()
            android.widget.EditText r2 = r5.d0
            java.lang.CharSequence r3 = r5.e0
            r2.setHint(r3)
            super.dispatchProvideAutofillStructure(r6, r7)     // Catch: java.lang.Throwable -> L27
            android.widget.EditText r6 = r5.d0
            r6.setHint(r0)
            r5.E0 = r1
            return
        L27:
            r6 = move-exception
            android.widget.EditText r7 = r5.d0
            r7.setHint(r0)
            r5.E0 = r1
            throw r6
        L30:
            android.view.autofill.AutofillId r0 = r5.getAutofillId()
            r6.setAutofillId(r0)
            r5.onProvideAutofillStructure(r6, r7)
            r5.onProvideAutofillVirtualStructure(r6, r7)
            android.widget.FrameLayout r0 = r5.A
            int r1 = r0.getChildCount()
            r6.setChildCount(r1)
        L46:
            int r1 = r0.getChildCount()
            if (r2 >= r1) goto L65
            android.view.View r1 = r0.getChildAt(r2)
            android.view.ViewStructure r3 = r6.newChild(r2)
            r1.dispatchProvideAutofillStructure(r3, r7)
            android.widget.EditText r4 = r5.d0
            if (r1 != r4) goto L62
            java.lang.CharSequence r1 = r5.getHint()
            r3.setHint(r1)
        L62:
            int r2 = r2 + 1
            goto L46
        L65:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(android.util.SparseArray r2) {
            r1 = this;
            r0 = 1
            r1.x1 = r0
            super.dispatchRestoreInstanceState(r2)
            r2 = 0
            r1.x1 = r2
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            super.draw(r18)
            boolean r2 = r0.C0
            at0 r8 = r0.s1
            if (r2 == 0) goto L116
            android.text.TextPaint r7 = r8.O
            android.graphics.RectF r2 = r8.e
            int r9 = r1.save()
            java.lang.CharSequence r3 = r8.C
            if (r3 == 0) goto L116
            float r3 = r2.width()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L116
            float r2 = r2.height()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L116
            float r2 = r8.G
            r7.setTextSize(r2)
            float r2 = r8.q
            float r3 = r8.r
            float r4 = r8.F
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L3e
            r1.scale(r4, r4, r2, r3)
        L3e:
            int r4 = r8.e0
            r10 = 1
            if (r4 > r10) goto L47
            int r4 = r8.f0
            if (r4 <= r10) goto L10b
        L47:
            boolean r4 = r8.D
            if (r4 == 0) goto L4d
            goto L10b
        L4d:
            boolean r4 = r8.o()
            if (r4 == 0) goto L10b
            float r2 = r8.q
            android.text.StaticLayout r4 = r8.Z
            r11 = 0
            int r4 = r4.getLineStart(r11)
            float r4 = (float) r4
            float r2 = r2 - r4
            int r12 = r7.getAlpha()
            r1.translate(r2, r3)
            float r2 = r8.c0
            float r3 = (float) r12
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 31
            if (r13 < r14) goto L8e
            float r2 = r8.H
            float r4 = r8.I
            float r5 = r8.J
            int r6 = r8.K
            int r15 = r7.getAlpha()
            int r16 = android.graphics.Color.alpha(r6)
            int r15 = r15 * r16
            int r15 = r15 / 255
            int r6 = defpackage.tt0.d(r6, r15)
            r7.setShadowLayer(r2, r4, r5, r6)
        L8e:
            android.text.StaticLayout r2 = r8.Z
            r2.draw(r1)
            float r2 = r8.b0
            float r2 = r2 * r3
            int r2 = (int) r2
            r7.setAlpha(r2)
            if (r13 < r14) goto Lb6
            float r2 = r8.H
            float r3 = r8.I
            float r4 = r8.J
            int r5 = r8.K
            int r6 = r7.getAlpha()
            int r15 = android.graphics.Color.alpha(r5)
            int r15 = r15 * r6
            int r15 = r15 / 255
            int r5 = defpackage.tt0.d(r5, r15)
            r7.setShadowLayer(r2, r3, r4, r5)
        Lb6:
            android.text.StaticLayout r2 = r8.Z
            int r2 = r2.getLineBaseline(r11)
            java.lang.CharSequence r3 = r8.d0
            int r4 = r3.length()
            float r6 = (float) r2
            r2 = r3
            r3 = 0
            r5 = 0
            r1.drawText(r2, r3, r4, r5, r6, r7)
            if (r13 < r14) goto Ld6
            float r1 = r8.H
            float r2 = r8.I
            float r3 = r8.J
            int r4 = r8.K
            r7.setShadowLayer(r1, r2, r3, r4)
        Ld6:
            java.lang.CharSequence r1 = r8.d0
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = "…"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto Lf1
            int r2 = r1.length()
            int r2 = r2 - r10
            java.lang.String r1 = r1.substring(r11, r2)
        Lf1:
            r2 = r1
            r7.setAlpha(r12)
            android.text.StaticLayout r1 = r8.Z
            int r1 = r1.getLineEnd(r11)
            int r3 = r2.length()
            int r4 = java.lang.Math.min(r1, r3)
            r5 = 0
            r3 = 0
            r1 = r18
            r1.drawText(r2, r3, r4, r5, r6, r7)
            goto L113
        L10b:
            r1.translate(r2, r3)
            android.text.StaticLayout r2 = r8.Z
            r2.draw(r1)
        L113:
            r1.restoreToCount(r9)
        L116:
            p24 r2 = r0.K0
            if (r2 == 0) goto L150
            p24 r2 = r0.J0
            if (r2 == 0) goto L150
            r2.draw(r1)
            android.widget.EditText r2 = r0.d0
            boolean r2 = r2.isFocused()
            if (r2 == 0) goto L150
            p24 r2 = r0.K0
            android.graphics.Rect r2 = r2.getBounds()
            p24 r3 = r0.J0
            android.graphics.Rect r3 = r3.getBounds()
            float r4 = r8.b
            int r5 = r3.centerX()
            int r6 = r3.left
            int r6 = defpackage.vo.c(r4, r5, r6)
            r2.left = r6
            int r3 = r3.right
            int r3 = defpackage.vo.c(r4, r5, r3)
            r2.right = r3
            p24 r0 = r0.K0
            r0.draw(r1)
        L150:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            boolean r0 = r4.w1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.w1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            at0 r3 = r4.s1
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.d0
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.w1 = r2
            return
    }

    public final int e() {
            r5 = this;
            boolean r0 = r5.C0
            r1 = 0
            if (r0 != 0) goto L6
            goto Lf
        L6:
            int r0 = r5.O0
            at0 r2 = r5.s1
            if (r0 == 0) goto L42
            r3 = 2
            if (r0 == r3) goto L10
        Lf:
            return r1
        L10:
            int r5 = r5.getHintMaxLines()
            r0 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r5 != r0) goto L20
            float r5 = r2.f()
            float r5 = r5 / r3
            int r5 = (int) r5
            return r5
        L20:
            float r5 = r2.f()
            android.text.TextPaint r0 = r2.P
            float r4 = r2.i
            r0.setTextSize(r4)
            android.graphics.Typeface r4 = r2.s
            r0.setTypeface(r4)
            float r2 = r2.W
            r0.setLetterSpacing(r2)
            float r0 = r0.ascent()
            float r0 = -r0
            float r0 = r0 / r3
            float r5 = r5 - r0
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r1, r5)
            return r5
        L42:
            float r5 = r2.f()
            int r5 = (int) r5
            return r5
    }

    public final defpackage.h92 f() {
            r4 = this;
            h92 r0 = new h92
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            r2 = 2130969531(0x7f0403bb, float:1.7547747E38)
            r3 = 87
            int r1 = defpackage.kj2.W(r1, r2, r3)
            long r1 = (long) r1
            r0.L = r1
            android.content.Context r4 = r4.getContext()
            r1 = 2130969541(0x7f0403c5, float:1.7547767E38)
            android.view.animation.LinearInterpolator r2 = defpackage.vo.a
            android.animation.TimeInterpolator r4 = defpackage.kj2.X(r4, r1, r2)
            r0.R = r4
            return r0
    }

    public final boolean g() {
            r1 = this;
            boolean r0 = r1.C0
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r1.D0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            p24 r1 = r1.F0
            boolean r1 = r1 instanceof defpackage.o81
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
            r2 = this;
            android.widget.EditText r0 = r2.d0
            if (r0 == 0) goto L13
            int r0 = r0.getBaseline()
            int r1 = r2.getPaddingTop()
            int r1 = r1 + r0
            int r2 = r2.e()
            int r2 = r2 + r1
            return r2
        L13:
            int r2 = super.getBaseline()
            return r2
    }

    public defpackage.p24 getBoxBackground() {
            r2 = this;
            int r0 = r2.O0
            r1 = 1
            if (r0 == r1) goto Le
            r1 = 2
            if (r0 != r1) goto L9
            goto Le
        L9:
            defpackage.e41.m()
            r2 = 0
            return r2
        Le:
            p24 r2 = r2.F0
            return r2
    }

    public int getBoxBackgroundColor() {
            r0 = this;
            int r0 = r0.U0
            return r0
    }

    public int getBoxBackgroundMode() {
            r0 = this;
            int r0 = r0.O0
            return r0
    }

    public int getBoxCollapsedPaddingTop() {
            r0 = this;
            int r0 = r0.P0
            return r0
    }

    public float getBoxCornerRadiusBottomEnd() {
            r3 = this;
            int r0 = r3.getLayoutDirection()
            me6 r1 = r3.L0
            android.graphics.RectF r3 = r3.X0
            r2 = 1
            if (r0 != r2) goto L12
            f61 r0 = r1.h
            float r3 = r0.a(r3)
            return r3
        L12:
            f61 r0 = r1.g
            float r3 = r0.a(r3)
            return r3
    }

    public float getBoxCornerRadiusBottomStart() {
            r3 = this;
            int r0 = r3.getLayoutDirection()
            me6 r1 = r3.L0
            android.graphics.RectF r3 = r3.X0
            r2 = 1
            if (r0 != r2) goto L12
            f61 r0 = r1.g
            float r3 = r0.a(r3)
            return r3
        L12:
            f61 r0 = r1.h
            float r3 = r0.a(r3)
            return r3
    }

    public float getBoxCornerRadiusTopEnd() {
            r3 = this;
            int r0 = r3.getLayoutDirection()
            me6 r1 = r3.L0
            android.graphics.RectF r3 = r3.X0
            r2 = 1
            if (r0 != r2) goto L12
            f61 r0 = r1.e
            float r3 = r0.a(r3)
            return r3
        L12:
            f61 r0 = r1.f
            float r3 = r0.a(r3)
            return r3
    }

    public float getBoxCornerRadiusTopStart() {
            r3 = this;
            int r0 = r3.getLayoutDirection()
            me6 r1 = r3.L0
            android.graphics.RectF r3 = r3.X0
            r2 = 1
            if (r0 != r2) goto L12
            f61 r0 = r1.f
            float r3 = r0.a(r3)
            return r3
        L12:
            f61 r0 = r1.e
            float r3 = r0.a(r3)
            return r3
    }

    public int getBoxStrokeColor() {
            r0 = this;
            int r0 = r0.j1
            return r0
    }

    public android.content.res.ColorStateList getBoxStrokeErrorColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.k1
            return r0
    }

    public int getBoxStrokeWidth() {
            r0 = this;
            int r0 = r0.R0
            return r0
    }

    public int getBoxStrokeWidthFocused() {
            r0 = this;
            int r0 = r0.S0
            return r0
    }

    public int getCounterMaxLength() {
            r0 = this;
            int r0 = r0.l0
            return r0
    }

    public java.lang.CharSequence getCounterOverflowDescription() {
            r1 = this;
            boolean r0 = r1.k0
            if (r0 == 0) goto L11
            boolean r0 = r1.m0
            if (r0 == 0) goto L11
            qs r1 = r1.o0
            if (r1 == 0) goto L11
            java.lang.CharSequence r1 = r1.getContentDescription()
            return r1
        L11:
            r1 = 0
            return r1
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.z0
            return r0
    }

    public android.content.res.ColorStateList getCounterTextColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.y0
            return r0
    }

    public android.content.res.ColorStateList getCursorColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.A0
            return r0
    }

    public android.content.res.ColorStateList getCursorErrorColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.B0
            return r0
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f1
            return r0
    }

    public android.widget.EditText getEditText() {
            r0 = this;
            android.widget.EditText r0 = r0.d0
            return r0
    }

    public java.lang.CharSequence getEndIconContentDescription() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getEndIconMinSize() {
            r0 = this;
            n42 r0 = r0.L
            int r0 = r0.l0
            return r0
    }

    public int getEndIconMode() {
            r0 = this;
            n42 r0 = r0.L
            int r0 = r0.h0
            return r0
    }

    public android.widget.ImageView.ScaleType getEndIconScaleType() {
            r0 = this;
            n42 r0 = r0.L
            android.widget.ImageView$ScaleType r0 = r0.m0
            return r0
    }

    public com.google.android.material.internal.CheckableImageButton getEndIconView() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            return r0
    }

    public java.lang.CharSequence getError() {
            r1 = this;
            q43 r1 = r1.j0
            boolean r0 = r1.q
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r1.p
            return r1
        L9:
            r1 = 0
            return r1
    }

    public int getErrorAccessibilityLiveRegion() {
            r0 = this;
            q43 r0 = r0.j0
            int r0 = r0.t
            return r0
    }

    public java.lang.CharSequence getErrorContentDescription() {
            r0 = this;
            q43 r0 = r0.j0
            java.lang.CharSequence r0 = r0.s
            return r0
    }

    public int getErrorCurrentTextColors() {
            r0 = this;
            q43 r0 = r0.j0
            qs r0 = r0.r
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.L
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getHelperText() {
            r1 = this;
            q43 r1 = r1.j0
            boolean r0 = r1.x
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r1.w
            return r1
        L9:
            r1 = 0
            return r1
    }

    public int getHelperTextCurrentTextColor() {
            r0 = this;
            q43 r0 = r0.j0
            qs r0 = r0.y
            if (r0 == 0) goto Lb
            int r0 = r0.getCurrentTextColor()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            boolean r0 = r1.C0
            if (r0 == 0) goto L7
            java.lang.CharSequence r1 = r1.D0
            return r1
        L7:
            r1 = 0
            return r1
    }

    public final float getHintCollapsedTextHeight() {
            r0 = this;
            at0 r0 = r0.s1
            float r0 = r0.f()
            return r0
    }

    public final int getHintCurrentCollapsedTextColor() {
            r1 = this;
            at0 r1 = r1.s1
            android.content.res.ColorStateList r0 = r1.k
            int r1 = r1.g(r0)
            return r1
    }

    public int getHintMaxLines() {
            r0 = this;
            at0 r0 = r0.s1
            int r0 = r0.e0
            return r0
    }

    public android.content.res.ColorStateList getHintTextColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.g1
            return r0
    }

    public defpackage.m37 getLengthCounter() {
            r0 = this;
            m37 r0 = r0.n0
            return r0
    }

    public int getMaxEms() {
            r0 = this;
            int r0 = r0.g0
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.i0
            return r0
    }

    public int getMinEms() {
            r0 = this;
            int r0 = r0.f0
            return r0
    }

    public int getMinWidth() {
            r0 = this;
            int r0 = r0.h0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public java.lang.CharSequence getPlaceholderText() {
            r1 = this;
            boolean r0 = r1.s0
            if (r0 == 0) goto L7
            java.lang.CharSequence r1 = r1.r0
            return r1
        L7:
            r1 = 0
            return r1
    }

    public int getPlaceholderTextAppearance() {
            r0 = this;
            int r0 = r0.v0
            return r0
    }

    public android.content.res.ColorStateList getPlaceholderTextColor() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.u0
            return r0
    }

    public java.lang.CharSequence getPrefixText() {
            r0 = this;
            fp6 r0 = r0.B
            java.lang.CharSequence r0 = r0.L
            return r0
    }

    public android.content.res.ColorStateList getPrefixTextColor() {
            r0 = this;
            fp6 r0 = r0.B
            qs r0 = r0.B
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getPrefixTextView() {
            r0 = this;
            fp6 r0 = r0.B
            qs r0 = r0.B
            return r0
    }

    public defpackage.me6 getShapeAppearanceModel() {
            r0 = this;
            me6 r0 = r0.L0
            return r0
    }

    public java.lang.CharSequence getStartIconContentDescription() {
            r0 = this;
            fp6 r0 = r0.B
            com.google.android.material.internal.CheckableImageButton r0 = r0.R
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
            r0 = this;
            fp6 r0 = r0.B
            com.google.android.material.internal.CheckableImageButton r0 = r0.R
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public int getStartIconMinSize() {
            r0 = this;
            fp6 r0 = r0.B
            int r0 = r0.f0
            return r0
    }

    public android.widget.ImageView.ScaleType getStartIconScaleType() {
            r0 = this;
            fp6 r0 = r0.B
            android.widget.ImageView$ScaleType r0 = r0.g0
            return r0
    }

    public java.lang.CharSequence getSuffixText() {
            r0 = this;
            n42 r0 = r0.L
            java.lang.CharSequence r0 = r0.o0
            return r0
    }

    public android.content.res.ColorStateList getSuffixTextColor() {
            r0 = this;
            n42 r0 = r0.L
            qs r0 = r0.p0
            android.content.res.ColorStateList r0 = r0.getTextColors()
            return r0
    }

    public android.widget.TextView getSuffixTextView() {
            r0 = this;
            n42 r0 = r0.L
            qs r0 = r0.p0
            return r0
    }

    public android.graphics.Typeface getTypeface() {
            r0 = this;
            android.graphics.Typeface r0 = r0.Y0
            return r0
    }

    public final defpackage.p24 h(boolean r17) {
            r16 = this;
            r0 = r16
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131166153(0x7f0703c9, float:1.7946543E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
            if (r17 == 0) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = 0
        L13:
            android.widget.EditText r3 = r0.d0
            boolean r4 = r3 instanceof defpackage.p14
            if (r4 == 0) goto L20
            p14 r3 = (defpackage.p14) r3
            float r3 = r3.getPopupElevation()
            goto L2c
        L20:
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131165638(0x7f0701c6, float:1.7945499E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            float r3 = (float) r3
        L2c:
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131166090(0x7f07038a, float:1.7946416E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            a26 r5 = new a26
            r5.<init>()
            a26 r6 = new a26
            r6.<init>()
            a26 r7 = new a26
            r7.<init>()
            a26 r8 = new a26
            r8.<init>()
            cs1 r9 = new cs1
            r10 = 0
            r9.<init>(r10)
            cs1 r11 = new cs1
            r11.<init>(r10)
            cs1 r12 = new cs1
            r12.<init>(r10)
            cs1 r13 = new cs1
            r13.<init>(r10)
            t r14 = new t
            r14.<init>(r2)
            t r15 = new t
            r15.<init>(r2)
            t r2 = new t
            r2.<init>(r1)
            t r10 = new t
            r10.<init>(r1)
            me6 r1 = new me6
            r1.<init>()
            r1.a = r5
            r1.b = r6
            r1.c = r7
            r1.d = r8
            r1.e = r14
            r1.f = r15
            r1.g = r10
            r1.h = r2
            r1.i = r9
            r1.j = r11
            r1.k = r12
            r1.l = r13
            android.widget.EditText r2 = r0.d0
            boolean r5 = r2 instanceof defpackage.p14
            if (r5 == 0) goto L9e
            p14 r2 = (defpackage.p14) r2
            android.content.res.ColorStateList r2 = r2.getDropDownBackgroundTintList()
            goto L9f
        L9e:
            r2 = 0
        L9f:
            android.content.Context r0 = r0.getContext()
            if (r2 != 0) goto Lc3
            android.graphics.Paint r2 = defpackage.p24.A0
            java.lang.Class<p24> r2 = defpackage.p24.class
            java.lang.String r2 = r2.getSimpleName()
            r5 = 2130968890(0x7f04013a, float:1.7546446E38)
            android.util.TypedValue r2 = defpackage.qo2.O(r0, r5, r2)
            int r5 = r2.resourceId
            if (r5 == 0) goto Lbd
            int r2 = r0.getColor(r5)
            goto Lbf
        Lbd:
            int r2 = r2.data
        Lbf:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        Lc3:
            p24 r5 = new p24
            r5.<init>()
            r5.k(r0)
            r5.n(r2)
            r5.m(r3)
            r5.setShapeAppearanceModel(r1)
            n24 r0 = r5.B
            android.graphics.Rect r1 = r0.h
            if (r1 != 0) goto Le1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.h = r1
        Le1:
            n24 r0 = r5.B
            android.graphics.Rect r0 = r0.h
            r1 = 0
            r0.set(r1, r4, r1, r4)
            r5.invalidateSelf()
            return r5
    }

    public final int i(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getPrefixText()
            if (r0 == 0) goto L10
            fp6 r1 = r1.B
            int r1 = r1.a()
        Le:
            int r1 = r1 + r2
            return r1
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getSuffixText()
            if (r3 == 0) goto L1f
            n42 r1 = r1.L
            int r1 = r1.c()
            goto Le
        L1f:
            android.widget.EditText r1 = r1.d0
            int r1 = r1.getCompoundPaddingLeft()
            goto Le
    }

    public final int j(int r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L10
            java.lang.CharSequence r0 = r1.getSuffixText()
            if (r0 == 0) goto L10
            n42 r1 = r1.L
            int r1 = r1.c()
        Le:
            int r2 = r2 - r1
            return r2
        L10:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r3 = r1.getPrefixText()
            if (r3 == 0) goto L1f
            fp6 r1 = r1.B
            int r1 = r1.a()
            goto Le
        L1f:
            android.widget.EditText r1 = r1.d0
            int r1 = r1.getCompoundPaddingRight()
            goto Le
    }

    public final void k() {
            r6 = this;
            int r0 = r6.O0
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L6c
            if (r0 == r2) goto L54
            if (r0 != r1) goto L43
            boolean r0 = r6.C0
            if (r0 == 0) goto L35
            p24 r0 = r6.F0
            boolean r0 = r0 instanceof defpackage.o81
            if (r0 != 0) goto L35
            me6 r0 = r6.L0
            int r4 = defpackage.o81.D0
            n81 r4 = new n81
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            me6 r0 = new me6
            r0.<init>()
        L23:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            o81 r0 = new o81
            r0.<init>(r4)
            r0.C0 = r4
            r6.F0 = r0
            goto L3e
        L35:
            p24 r0 = new p24
            me6 r4 = r6.L0
            r0.<init>(r4)
            r6.F0 = r0
        L3e:
            r6.J0 = r3
            r6.K0 = r3
            goto L72
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r6 = r6.O0
            java.lang.String r1 = " is illegal; only @BoxBackgroundMode constants are supported."
            java.lang.String r6 = defpackage.lb1.o(r0, r6, r1)
            defpackage.i.h(r6)
            return
        L54:
            p24 r0 = new p24
            me6 r3 = r6.L0
            r0.<init>(r3)
            r6.F0 = r0
            p24 r0 = new p24
            r0.<init>()
            r6.J0 = r0
            p24 r0 = new p24
            r0.<init>()
            r6.K0 = r0
            goto L72
        L6c:
            r6.F0 = r3
            r6.J0 = r3
            r6.K0 = r3
        L72:
            r6.u()
            r6.z()
            int r0 = r6.O0
            if (r0 != r2) goto Lb5
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L9e
            android.content.res.Resources r0 = r6.getResources()
            r3 = 2131165985(0x7f070321, float:1.7946203E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r6.P0 = r0
            goto Lb5
        L9e:
            android.content.Context r0 = r6.getContext()
            boolean r0 = defpackage.np2.W(r0)
            if (r0 == 0) goto Lb5
            android.content.res.Resources r0 = r6.getResources()
            r3 = 2131165984(0x7f070320, float:1.79462E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r6.P0 = r0
        Lb5:
            r6.a()
            int r0 = r6.O0
            if (r0 == 0) goto Lbf
            r6.v()
        Lbf:
            android.widget.EditText r0 = r6.d0
            boolean r3 = r0 instanceof android.widget.AutoCompleteTextView
            if (r3 != 0) goto Lc6
            goto Le3
        Lc6:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r3 = r0.getDropDownBackground()
            if (r3 != 0) goto Le3
            int r3 = r6.O0
            if (r3 != r1) goto Lda
            android.graphics.drawable.Drawable r6 = r6.getOrCreateOutlinedDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r6)
            return
        Lda:
            if (r3 != r2) goto Le3
            android.graphics.drawable.Drawable r6 = r6.getOrCreateFilledDropDownMenuBackground()
            r0.setDropDownBackgroundDrawable(r6)
        Le3:
            return
    }

    public final void l() {
            r12 = this;
            boolean r0 = r12.g()
            if (r0 != 0) goto L8
            goto L11c
        L8:
            android.widget.EditText r0 = r12.d0
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.d0
            int r1 = r1.getGravity()
            at0 r2 = r12.s1
            java.lang.CharSequence r3 = r2.B
            boolean r3 = r2.c(r3)
            r2.D = r3
            android.graphics.Rect r4 = r2.d
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            r7 = 5
            r8 = 8388613(0x800005, float:1.175495E-38)
            r9 = 17
            if (r1 == r9) goto L51
            r10 = r1 & 7
            if (r10 != r6) goto L30
            goto L51
        L30:
            r10 = r1 & r8
            if (r10 == r8) goto L46
            r10 = r1 & 5
            if (r10 != r7) goto L39
            goto L46
        L39:
            if (r3 == 0) goto L42
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.a0
        L40:
            float r3 = r3 - r10
            goto L57
        L42:
            int r3 = r4.left
        L44:
            float r3 = (float) r3
            goto L57
        L46:
            if (r3 == 0) goto L4b
            int r3 = r4.left
            goto L44
        L4b:
            int r3 = r4.right
            float r3 = (float) r3
            float r10 = r2.a0
            goto L40
        L51:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.a0
            float r10 = r10 / r5
            goto L40
        L57:
            int r10 = r4.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.X0
            r10.left = r3
            int r11 = r4.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r9) goto L8d
            r9 = r1 & 7
            if (r9 != r6) goto L6e
            goto L8d
        L6e:
            r0 = r1 & r8
            if (r0 == r8) goto L83
            r0 = r1 & 5
            if (r0 != r7) goto L77
            goto L83
        L77:
            boolean r0 = r2.D
            if (r0 == 0) goto L7f
            int r0 = r4.right
        L7d:
            float r0 = (float) r0
            goto L93
        L7f:
            float r0 = r2.a0
        L81:
            float r0 = r0 + r3
            goto L93
        L83:
            boolean r0 = r2.D
            if (r0 == 0) goto L8a
            float r0 = r2.a0
            goto L81
        L8a:
            int r0 = r4.right
            goto L7d
        L8d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.a0
            float r1 = r1 / r5
            float r0 = r0 + r1
        L93:
            int r1 = r4.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r4.top
            float r0 = (float) r0
            float r1 = r2.f()
            float r1 = r1 + r0
            r10.bottom = r1
            android.text.StaticLayout r0 = r2.Z
            if (r0 == 0) goto Ld0
            boolean r0 = r2.o()
            if (r0 != 0) goto Ld0
            android.text.StaticLayout r0 = r2.Z
            int r1 = r0.getLineCount()
            int r1 = r1 - r6
            float r0 = r0.getLineWidth(r1)
            float r1 = r2.i
            float r3 = r2.h
            float r1 = r1 / r3
            float r1 = r1 * r0
            boolean r0 = r2.D
            if (r0 == 0) goto Lcb
            float r0 = r10.right
            float r0 = r0 - r1
            r10.left = r0
            goto Ld0
        Lcb:
            float r0 = r10.left
            float r0 = r0 + r1
            r10.right = r0
        Ld0:
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L11c
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Le2
            goto L11c
        Le2:
            float r0 = r10.left
            int r2 = r12.N0
            float r2 = (float) r2
            float r0 = r0 - r2
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r2
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r10.height()
            float r3 = r3 / r5
            float r2 = r2 - r3
            int r3 = r12.Q0
            float r3 = (float) r3
            float r2 = r2 + r3
            r10.offset(r0, r2)
            r10.top = r1
            p24 r12 = r12.F0
            o81 r12 = (defpackage.o81) r12
            r12.getClass()
            float r0 = r10.left
            float r1 = r10.top
            float r2 = r10.right
            float r3 = r10.bottom
            r12.t(r0, r1, r2, r3)
        L11c:
            return
    }

    public final void n(defpackage.qs r2, int r3) {
            r1 = this;
            r2.setTextAppearance(r3)     // Catch: java.lang.Exception -> L12
            android.content.res.ColorStateList r3 = r2.getTextColors()     // Catch: java.lang.Exception -> L12
            int r3 = r3.getDefaultColor()     // Catch: java.lang.Exception -> L12
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            if (r3 != r0) goto L11
            goto L12
        L11:
            return
        L12:
            r3 = 2132017660(0x7f1401fc, float:1.9673605E38)
            r2.setTextAppearance(r3)
            android.content.Context r1 = r1.getContext()
            r3 = 2131099743(0x7f06005f, float:1.7811848E38)
            int r1 = r1.getColor(r3)
            r2.setTextColor(r1)
            return
    }

    public final boolean o() {
            r2 = this;
            q43 r2 = r2.j0
            int r0 = r2.o
            r1 = 1
            if (r0 != r1) goto L14
            qs r0 = r2.r
            if (r0 == 0) goto L14
            java.lang.CharSequence r2 = r2.p
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L14
            return r1
        L14:
            r2 = 0
            return r2
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            at0 r0 = r0.s1
            r0.i(r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r3 = this;
            n42 r0 = r3.L
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r3)
            r1 = 0
            r3.y1 = r1
            android.widget.EditText r2 = r3.d0
            if (r2 != 0) goto L11
            goto L2d
        L11:
            int r0 = r0.getMeasuredHeight()
            fp6 r2 = r3.B
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.d0
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L2d
            android.widget.EditText r1 = r3.d0
            r1.setMinimumHeight(r0)
            r1 = 1
        L2d:
            boolean r0 = r3.s()
            if (r1 != 0) goto L37
            if (r0 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            android.widget.EditText r0 = r3.d0
            rk3 r1 = new rk3
            r2 = 16
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            android.widget.EditText r7 = r6.d0
            if (r7 == 0) goto L179
            android.graphics.Rect r8 = r6.V0
            defpackage.ji1.a(r6, r7, r8)
            p24 r7 = r6.J0
            if (r7 == 0) goto L1d
            int r9 = r8.bottom
            int r10 = r6.R0
            int r10 = r9 - r10
            int r11 = r8.left
            int r0 = r8.right
            r7.setBounds(r11, r10, r0, r9)
        L1d:
            p24 r7 = r6.K0
            if (r7 == 0) goto L2e
            int r9 = r8.bottom
            int r10 = r6.S0
            int r10 = r9 - r10
            int r11 = r8.left
            int r0 = r8.right
            r7.setBounds(r11, r10, r0, r9)
        L2e:
            boolean r7 = r6.C0
            if (r7 == 0) goto L179
            android.widget.EditText r7 = r6.d0
            float r7 = r7.getTextSize()
            at0 r9 = r6.s1
            float r10 = r9.h
            android.text.TextPaint r11 = r9.P
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r0 = 0
            if (r10 == 0) goto L48
            r9.h = r7
            r9.j(r0)
        L48:
            android.widget.EditText r7 = r6.d0
            int r7 = r7.getGravity()
            r10 = r7 & (-113(0xffffffffffffff8f, float:NaN))
            r10 = r10 | 48
            int r1 = r9.g
            if (r1 == r10) goto L5b
            r9.g = r10
            r9.j(r0)
        L5b:
            int r10 = r9.f
            if (r10 == r7) goto L64
            r9.f = r7
            r9.j(r0)
        L64:
            android.graphics.Rect r7 = r6.d(r8)
            int r10 = r7.left
            int r1 = r7.top
            int r2 = r7.right
            int r7 = r7.bottom
            android.graphics.Rect r3 = r9.d
            int r4 = r3.left
            r5 = 1
            if (r4 != r10) goto L84
            int r4 = r3.top
            if (r4 != r1) goto L84
            int r4 = r3.right
            if (r4 != r2) goto L84
            int r4 = r3.bottom
            if (r4 != r7) goto L84
            goto L89
        L84:
            r3.set(r10, r1, r2, r7)
            r9.N = r5
        L89:
            android.widget.EditText r7 = r6.d0
            if (r7 == 0) goto L176
            int r7 = r6.getHintMaxLines()
            if (r7 != r5) goto La8
            float r7 = r9.h
            r11.setTextSize(r7)
            android.graphics.Typeface r7 = r9.v
            r11.setTypeface(r7)
            float r7 = r9.X
            r11.setLetterSpacing(r7)
            float r7 = r11.ascent()
            float r7 = -r7
            goto Lc5
        La8:
            float r7 = r9.h
            r11.setTextSize(r7)
            android.graphics.Typeface r7 = r9.v
            r11.setTypeface(r7)
            float r7 = r9.X
            r11.setLetterSpacing(r7)
            float r7 = r11.ascent()
            float r7 = -r7
            float r10 = r11.descent()
            float r10 = r10 + r7
            int r7 = r9.l
            float r7 = (float) r7
            float r7 = r7 * r10
        Lc5:
            int r10 = r8.left
            android.widget.EditText r1 = r6.d0
            int r1 = r1.getCompoundPaddingLeft()
            int r1 = r1 + r10
            android.graphics.Rect r10 = r6.W0
            r10.left = r1
            int r1 = r6.O0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto Lea
            android.widget.EditText r1 = r6.d0
            int r1 = r1.getMinLines()
            if (r1 > r5) goto Lea
            int r11 = r8.centerY()
            float r11 = (float) r11
            float r1 = r7 / r2
            float r11 = r11 - r1
            int r11 = (int) r11
            goto L118
        Lea:
            int r1 = r6.O0
            if (r1 != 0) goto L10c
            int r1 = r6.getHintMaxLines()
            if (r1 != r5) goto Lf5
            goto L10c
        Lf5:
            float r1 = r9.h
            r11.setTextSize(r1)
            android.graphics.Typeface r1 = r9.v
            r11.setTypeface(r1)
            float r1 = r9.X
            r11.setLetterSpacing(r1)
            float r11 = r11.ascent()
            float r11 = -r11
            float r11 = r11 / r2
            int r11 = (int) r11
            goto L10d
        L10c:
            r11 = r0
        L10d:
            int r1 = r8.top
            android.widget.EditText r2 = r6.d0
            int r2 = r2.getCompoundPaddingTop()
            int r2 = r2 + r1
            int r11 = r2 - r11
        L118:
            r10.top = r11
            int r11 = r8.right
            android.widget.EditText r1 = r6.d0
            int r1 = r1.getCompoundPaddingRight()
            int r11 = r11 - r1
            r10.right = r11
            int r11 = r6.O0
            if (r11 != r5) goto L137
            android.widget.EditText r11 = r6.d0
            int r11 = r11.getMinLines()
            if (r11 > r5) goto L137
            int r8 = r10.top
            float r8 = (float) r8
            float r8 = r8 + r7
            int r7 = (int) r8
            goto L140
        L137:
            int r7 = r8.bottom
            android.widget.EditText r8 = r6.d0
            int r8 = r8.getCompoundPaddingBottom()
            int r7 = r7 - r8
        L140:
            r10.bottom = r7
            int r8 = r10.left
            int r11 = r10.top
            int r10 = r10.right
            android.graphics.Rect r1 = r9.c
            int r2 = r1.left
            if (r2 != r8) goto L15e
            int r2 = r1.top
            if (r2 != r11) goto L15e
            int r2 = r1.right
            if (r2 != r10) goto L15e
            int r2 = r1.bottom
            if (r2 != r7) goto L15e
            boolean r2 = r9.k0
            if (r5 == r2) goto L165
        L15e:
            r1.set(r8, r11, r10, r7)
            r9.N = r5
            r9.k0 = r5
        L165:
            r9.j(r0)
            boolean r7 = r6.g()
            if (r7 == 0) goto L179
            boolean r7 = r6.r1
            if (r7 != 0) goto L179
            r6.l()
            return
        L176:
            defpackage.e41.m()
        L179:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            boolean r8 = r7.y1
            r9 = 1
            n42 r0 = r7.L
            if (r8 != 0) goto L13
            android.view.ViewTreeObserver r8 = r0.getViewTreeObserver()
            r8.addOnGlobalLayoutListener(r7)
            r7.y1 = r9
        L13:
            qs r8 = r7.t0
            if (r8 == 0) goto L41
            android.widget.EditText r8 = r7.d0
            if (r8 == 0) goto L41
            int r8 = r8.getGravity()
            qs r1 = r7.t0
            r1.setGravity(r8)
            qs r8 = r7.t0
            android.widget.EditText r1 = r7.d0
            int r1 = r1.getCompoundPaddingLeft()
            android.widget.EditText r2 = r7.d0
            int r2 = r2.getCompoundPaddingTop()
            android.widget.EditText r3 = r7.d0
            int r3 = r3.getCompoundPaddingRight()
            android.widget.EditText r4 = r7.d0
            int r4 = r4.getCompoundPaddingBottom()
            r8.setPadding(r1, r2, r3, r4)
        L41:
            r0.m()
            int r8 = r7.getHintMaxLines()
            if (r8 != r9) goto L4c
            goto L18e
        L4c:
            android.widget.EditText r8 = r7.d0
            int r8 = r8.getMeasuredWidth()
            android.widget.EditText r0 = r7.d0
            int r0 = r0.getCompoundPaddingLeft()
            int r8 = r8 - r0
            android.widget.EditText r0 = r7.d0
            int r0 = r0.getCompoundPaddingRight()
            int r8 = r8 - r0
            at0 r0 = r7.s1
            android.text.TextPaint r2 = r0.P
            float r1 = r0.i
            r2.setTextSize(r1)
            android.graphics.Typeface r1 = r0.s
            r2.setTypeface(r1)
            float r1 = r0.W
            r2.setLetterSpacing(r1)
            int r1 = r0.f0
            java.lang.CharSequence r3 = r0.B
            float r6 = (float) r8
            float r4 = r0.i
            float r5 = r0.h
            float r4 = r4 / r5
            float r4 = r4 * r6
            boolean r5 = r0.D
            android.text.StaticLayout r1 = r0.e(r1, r2, r3, r4, r5)
            int r1 = r1.getHeight()
            r0.i0 = r1
            float r1 = r0.h
            r2.setTextSize(r1)
            android.graphics.Typeface r1 = r0.v
            r2.setTypeface(r1)
            float r1 = r0.X
            r2.setLetterSpacing(r1)
            int r1 = r0.e0
            java.lang.CharSequence r3 = r0.B
            boolean r5 = r0.D
            r4 = r6
            android.text.StaticLayout r1 = r0.e(r1, r2, r3, r4, r5)
            int r1 = r1.getHeight()
            r0.j0 = r1
            android.widget.EditText r1 = r7.d0
            android.graphics.Rect r2 = r7.V0
            defpackage.ji1.a(r7, r1, r2)
            android.graphics.Rect r1 = r7.d(r2)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            android.graphics.Rect r5 = r0.d
            int r6 = r5.left
            if (r6 != r2) goto Ld0
            int r6 = r5.top
            if (r6 != r3) goto Ld0
            int r6 = r5.right
            if (r6 != r4) goto Ld0
            int r6 = r5.bottom
            if (r6 != r1) goto Ld0
            goto Ld5
        Ld0:
            r5.set(r2, r3, r4, r1)
            r0.N = r9
        Ld5:
            r7.v()
            r7.a()
            android.widget.EditText r1 = r7.d0
            if (r1 != 0) goto Le1
            goto L18e
        Le1:
            int r1 = r0.j0
            r2 = -1
            if (r1 == r2) goto Le8
            float r1 = (float) r1
            goto Lfe
        Le8:
            android.text.TextPaint r1 = r0.P
            float r2 = r0.h
            r1.setTextSize(r2)
            android.graphics.Typeface r2 = r0.v
            r1.setTypeface(r2)
            float r2 = r0.X
            r1.setLetterSpacing(r2)
            float r1 = r1.ascent()
            float r1 = -r1
        Lfe:
            java.lang.CharSequence r2 = r7.r0
            r3 = 0
            if (r2 == 0) goto L176
            android.text.TextPaint r2 = new android.text.TextPaint
            r4 = 129(0x81, float:1.81E-43)
            r2.<init>(r4)
            qs r4 = r7.t0
            android.text.TextPaint r4 = r4.getPaint()
            r2.set(r4)
            qs r4 = r7.t0
            float r4 = r4.getTextSize()
            r2.setTextSize(r4)
            qs r4 = r7.t0
            android.graphics.Typeface r4 = r4.getTypeface()
            r2.setTypeface(r4)
            qs r4 = r7.t0
            float r4 = r4.getLetterSpacing()
            r2.setLetterSpacing(r4)
            java.lang.CharSequence r4 = r7.r0
            mq6 r5 = new mq6
            r5.<init>(r4, r2, r8)
            int r8 = r7.getLayoutDirection()
            if (r8 != r9) goto L13d
            r8 = r9
            goto L13e
        L13d:
            r8 = 0
        L13e:
            r5.k = r8
            r5.j = r9
            qs r8 = r7.t0
            float r8 = r8.getLineSpacingExtra()
            qs r2 = r7.t0
            float r2 = r2.getLineSpacingMultiplier()
            r5.g = r8
            r5.h = r2
            h61 r8 = new h61
            r2 = 22
            r8.<init>(r7, r2)
            r5.m = r8
            android.text.StaticLayout r8 = r5.a()
            int r2 = r7.O0
            if (r2 != r9) goto L170
            float r9 = r0.f()
            int r0 = r7.P0
            float r0 = (float) r0
            float r9 = r9 + r0
            int r0 = r7.R
            float r0 = (float) r0
            float r3 = r9 + r0
        L170:
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r3 = r3 + r8
        L176:
            float r8 = java.lang.Math.max(r1, r3)
            android.widget.EditText r9 = r7.d0
            int r9 = r9.getMeasuredHeight()
            float r9 = (float) r9
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 >= 0) goto L18e
            android.widget.EditText r7 = r7.d0
            int r8 = java.lang.Math.round(r8)
            r7.setMinimumHeight(r8)
        L18e:
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.n37
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            n37 r2 = (defpackage.n37) r2
            android.os.Parcelable r0 = r2.A
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r2.L
            r1.setError(r0)
            boolean r2 = r2.R
            if (r2 == 0) goto L22
            g15 r2 = new g15
            r0 = 23
            r2.<init>(r1, r0)
            r1.post(r2)
        L22:
            r1.requestLayout()
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int r14) {
            r13 = this;
            super.onRtlPropertiesChanged(r14)
            r0 = 1
            if (r14 != r0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r14 = r13.M0
            if (r0 == r14) goto L86
            me6 r14 = r13.L0
            f61 r14 = r14.e
            android.graphics.RectF r1 = r13.X0
            float r14 = r14.a(r1)
            me6 r2 = r13.L0
            f61 r2 = r2.f
            float r2 = r2.a(r1)
            me6 r3 = r13.L0
            f61 r3 = r3.h
            float r3 = r3.a(r1)
            me6 r4 = r13.L0
            f61 r4 = r4.g
            float r1 = r4.a(r1)
            me6 r4 = r13.L0
            q60 r5 = r4.a
            q60 r6 = r4.b
            q60 r7 = r4.d
            q60 r4 = r4.c
            cs1 r8 = new cs1
            r9 = 0
            r8.<init>(r9)
            cs1 r9 = new cs1
            r10 = 0
            r9.<init>(r10)
            cs1 r10 = new cs1
            r11 = 0
            r10.<init>(r11)
            cs1 r11 = new cs1
            r12 = 0
            r11.<init>(r12)
            t r12 = new t
            r12.<init>(r2)
            t r2 = new t
            r2.<init>(r14)
            t r14 = new t
            r14.<init>(r1)
            t r1 = new t
            r1.<init>(r3)
            me6 r3 = new me6
            r3.<init>()
            r3.a = r6
            r3.b = r5
            r3.c = r7
            r3.d = r4
            r3.e = r12
            r3.f = r2
            r3.g = r1
            r3.h = r14
            r3.i = r8
            r3.j = r9
            r3.k = r10
            r3.l = r11
            r13.M0 = r0
            r13.setShapeAppearanceModel(r3)
        L86:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            n37 r1 = new n37
            r1.<init>(r0)
            boolean r0 = r2.o()
            if (r0 == 0) goto L15
            java.lang.CharSequence r0 = r2.getError()
            r1.L = r0
        L15:
            n42 r2 = r2.L
            int r0 = r2.h0
            if (r0 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r2 = r2.f0
            boolean r2 = r2.R
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            r1.R = r2
            return r1
    }

    public final void p(android.text.Editable r10) {
            r9 = this;
            m37 r0 = r9.n0
            fa6 r0 = (defpackage.fa6) r0
            r0.getClass()
            r0 = 0
            if (r10 == 0) goto Lf
            int r10 = r10.length()
            goto L10
        Lf:
            r10 = r0
        L10:
            boolean r1 = r9.m0
            int r2 = r9.l0
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L2a
            qs r2 = r9.o0
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.setText(r10)
            qs r10 = r9.o0
            r10.setContentDescription(r4)
            r9.m0 = r0
            goto L9e
        L2a:
            r3 = 1
            if (r10 <= r2) goto L2f
            r2 = r3
            goto L30
        L2f:
            r2 = r0
        L30:
            r9.m0 = r2
            android.content.Context r2 = r9.getContext()
            qs r5 = r9.o0
            int r6 = r9.l0
            boolean r7 = r9.m0
            if (r7 == 0) goto L42
            r7 = 2131951774(0x7f13009e, float:1.9539972E38)
            goto L45
        L42:
            r7 = 2131951773(0x7f13009d, float:1.953997E38)
        L45:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r2 = r2.getString(r7, r6)
            r5.setContentDescription(r2)
            boolean r2 = r9.m0
            if (r1 == r2) goto L5f
            r9.q()
        L5f:
            java.lang.String r2 = defpackage.g40.b
            java.util.Locale r2 = java.util.Locale.getDefault()
            int r2 = android.text.TextUtils.getLayoutDirectionFromLocale(r2)
            if (r2 != r3) goto L6e
            g40 r2 = defpackage.g40.e
            goto L70
        L6e:
            g40 r2 = defpackage.g40.d
        L70:
            qs r3 = r9.o0
            android.content.Context r5 = r9.getContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r6 = r9.l0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r6}
            r6 = 2131951775(0x7f13009f, float:1.9539974E38)
            java.lang.String r10 = r5.getString(r6, r10)
            r2.getClass()
            g60 r5 = defpackage.f17.a
            if (r10 != 0) goto L93
            goto L9b
        L93:
            android.text.SpannableStringBuilder r10 = r2.c(r10)
            java.lang.String r4 = r10.toString()
        L9b:
            r3.setText(r4)
        L9e:
            android.widget.EditText r10 = r9.d0
            if (r10 == 0) goto Laf
            boolean r10 = r9.m0
            if (r1 == r10) goto Laf
            r9.w(r0, r0)
            r9.z()
            r9.t()
        Laf:
            return
    }

    public final void q() {
            r2 = this;
            qs r0 = r2.o0
            if (r0 == 0) goto L2a
            boolean r1 = r2.m0
            if (r1 == 0) goto Lb
            int r1 = r2.p0
            goto Ld
        Lb:
            int r1 = r2.q0
        Ld:
            r2.n(r0, r1)
            boolean r0 = r2.m0
            if (r0 != 0) goto L1d
            android.content.res.ColorStateList r0 = r2.y0
            if (r0 == 0) goto L1d
            qs r1 = r2.o0
            r1.setTextColor(r0)
        L1d:
            boolean r0 = r2.m0
            if (r0 == 0) goto L2a
            android.content.res.ColorStateList r0 = r2.z0
            if (r0 == 0) goto L2a
            qs r2 = r2.o0
            r2.setTextColor(r0)
        L2a:
            return
    }

    public final void r() {
            r4 = this;
            android.content.res.ColorStateList r0 = r4.A0
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968847(0x7f04010f, float:1.754636E38)
            android.util.TypedValue r1 = defpackage.qo2.M(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = defpackage.ge7.A(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.d0
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = defpackage.r74.h(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.d0
            android.graphics.drawable.Drawable r1 = defpackage.r74.h(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            qs r2 = r4.o0
            if (r2 == 0) goto L4e
            boolean r2 = r4.m0
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r4 = r4.B0
            if (r4 == 0) goto L4e
            r0 = r4
        L4e:
            r1.setTintList(r0)
        L51:
            return
    }

    public final boolean s() {
            r10 = this;
            android.widget.EditText r0 = r10.d0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L20
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L5f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5f
        L20:
            fp6 r0 = r10.B
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L5f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.d0
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.Z0
            if (r6 == 0) goto L3b
            int r6 = r10.a1
            if (r6 == r0) goto L47
        L3b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.Z0 = r6
            r10.a1 = r0
            r6.setBounds(r1, r1, r0, r5)
        L47:
            android.widget.EditText r0 = r10.d0
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.Z0
            if (r6 == r7) goto L78
            android.widget.EditText r6 = r10.d0
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L76
        L5f:
            android.graphics.drawable.ColorDrawable r0 = r10.Z0
            if (r0 == 0) goto L78
            android.widget.EditText r0 = r10.d0
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.d0
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.Z0 = r2
        L76:
            r0 = r5
            goto L79
        L78:
            r0 = r1
        L79:
            n42 r6 = r10.L
            boolean r7 = r6.e()
            if (r7 != 0) goto L8f
            int r7 = r6.h0
            if (r7 == 0) goto L8b
            boolean r7 = r6.d()
            if (r7 != 0) goto L8f
        L8b:
            java.lang.CharSequence r7 = r6.o0
            if (r7 == 0) goto L10d
        L8f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L10d
            qs r7 = r6.p0
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.d0
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto Lab
            com.google.android.material.internal.CheckableImageButton r2 = r6.L
            goto Lb7
        Lab:
            int r8 = r6.h0
            if (r8 == 0) goto Lb7
            boolean r8 = r6.d()
            if (r8 == 0) goto Lb7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f0
        Lb7:
            if (r2 == 0) goto Lca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        Lca:
            android.widget.EditText r2 = r10.d0
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.c1
            if (r6 == 0) goto Leb
            int r8 = r10.d1
            if (r8 == r7) goto Leb
            r10.d1 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.d0
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r10 = r10.c1
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r10, r2)
            return r5
        Leb:
            if (r6 != 0) goto Lf9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.c1 = r6
            r10.d1 = r7
            r6.setBounds(r1, r1, r7, r5)
        Lf9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.c1
            if (r3 == r6) goto L12f
            r10.e1 = r3
            android.widget.EditText r10 = r10.d0
            r0 = r2[r1]
            r1 = r2[r5]
            r2 = r2[r4]
            r10.setCompoundDrawablesRelative(r0, r1, r6, r2)
            return r5
        L10d:
            android.graphics.drawable.ColorDrawable r6 = r10.c1
            if (r6 == 0) goto L12f
            android.widget.EditText r6 = r10.d0
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.c1
            if (r3 != r7) goto L12b
            android.widget.EditText r0 = r10.d0
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.e1
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L12c
        L12b:
            r5 = r0
        L12c:
            r10.c1 = r2
            return r5
        L12f:
            return r0
    }

    public void setBoxBackgroundColor(int r2) {
            r1 = this;
            int r0 = r1.U0
            if (r0 == r2) goto Lf
            r1.U0 = r2
            r1.l1 = r2
            r1.n1 = r2
            r1.o1 = r2
            r1.c()
        Lf:
            return
    }

    public void setBoxBackgroundColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = r0.getColor(r2)
            r1.setBoxBackgroundColor(r2)
            return
    }

    public void setBoxBackgroundColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            int r0 = r4.getDefaultColor()
            r3.l1 = r0
            r3.U0 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.m1 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.n1 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.o1 = r4
            r3.c()
            return
    }

    public void setBoxBackgroundMode(int r2) {
            r1 = this;
            int r0 = r1.O0
            if (r2 != r0) goto L5
            goto Le
        L5:
            r1.O0 = r2
            android.widget.EditText r2 = r1.d0
            if (r2 == 0) goto Le
            r1.k()
        Le:
            return
    }

    public void setBoxCollapsedPaddingTop(int r1) {
            r0 = this;
            r0.P0 = r1
            return
    }

    public void setBoxCornerFamily(int r4) {
            r3 = this;
            me6 r0 = r3.L0
            le6 r0 = r0.f()
            me6 r1 = r3.L0
            f61 r1 = r1.e
            q60 r2 = defpackage.jx2.r(r4)
            r0.a = r2
            r0.e = r1
            me6 r1 = r3.L0
            f61 r1 = r1.f
            q60 r2 = defpackage.jx2.r(r4)
            r0.b = r2
            r0.f = r1
            me6 r1 = r3.L0
            f61 r1 = r1.h
            q60 r2 = defpackage.jx2.r(r4)
            r0.d = r2
            r0.h = r1
            me6 r1 = r3.L0
            f61 r1 = r1.g
            q60 r4 = defpackage.jx2.r(r4)
            r0.c = r4
            r0.g = r1
            me6 r4 = r0.a()
            r3.L0 = r4
            r3.c()
            return
    }

    public void setBoxStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.j1
            if (r0 == r2) goto L9
            r1.j1 = r2
            r1.z()
        L9:
            return
    }

    public void setBoxStrokeColorStateList(android.content.res.ColorStateList r4) {
            r3 = this;
            boolean r0 = r4.isStateful()
            if (r0 == 0) goto L38
            int r0 = r4.getDefaultColor()
            r3.h1 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            r1 = -1
            int r0 = r4.getColorForState(r0, r1)
            r3.p1 = r0
            r0 = 16843623(0x1010367, float:2.3696E-38)
            r2 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0, r2}
            int r0 = r4.getColorForState(r0, r1)
            r3.i1 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0, r2}
            int r4 = r4.getColorForState(r0, r1)
            r3.j1 = r4
            goto L46
        L38:
            int r0 = r3.j1
            int r1 = r4.getDefaultColor()
            if (r0 == r1) goto L46
            int r4 = r4.getDefaultColor()
            r3.j1 = r4
        L46:
            r3.z()
            return
    }

    public void setBoxStrokeErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.k1
            if (r0 == r2) goto L9
            r1.k1 = r2
            r1.z()
        L9:
            return
    }

    public void setBoxStrokeWidth(int r1) {
            r0 = this;
            r0.R0 = r1
            r0.z()
            return
    }

    public void setBoxStrokeWidthFocused(int r1) {
            r0 = this;
            r0.S0 = r1
            r0.z()
            return
    }

    public void setBoxStrokeWidthFocusedResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidthFocused(r2)
            return
    }

    public void setBoxStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setBoxStrokeWidth(r2)
            return
    }

    public void setCounterEnabled(boolean r6) {
            r5 = this;
            boolean r0 = r5.k0
            if (r0 == r6) goto L62
            r0 = 2
            q43 r1 = r5.j0
            r2 = 0
            if (r6 == 0) goto L59
            qs r3 = new qs
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4, r2)
            r5.o0 = r3
            r4 = 2131428005(0x7f0b02a5, float:1.8477642E38)
            r3.setId(r4)
            android.graphics.Typeface r3 = r5.Y0
            if (r3 == 0) goto L24
            qs r4 = r5.o0
            r4.setTypeface(r3)
        L24:
            qs r3 = r5.o0
            r4 = 1
            r3.setMaxLines(r4)
            qs r3 = r5.o0
            r1.a(r3, r0)
            qs r0 = r5.o0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.res.Resources r1 = r5.getResources()
            r3 = 2131166182(0x7f0703e6, float:1.7946602E38)
            int r1 = r1.getDimensionPixelOffset(r3)
            r0.setMarginStart(r1)
            r5.q()
            qs r0 = r5.o0
            if (r0 == 0) goto L60
            android.widget.EditText r0 = r5.d0
            if (r0 != 0) goto L51
            goto L55
        L51:
            android.text.Editable r2 = r0.getText()
        L55:
            r5.p(r2)
            goto L60
        L59:
            qs r3 = r5.o0
            r1.g(r3, r0)
            r5.o0 = r2
        L60:
            r5.k0 = r6
        L62:
            return
    }

    public void setCounterMaxLength(int r2) {
            r1 = this;
            int r0 = r1.l0
            if (r0 == r2) goto L21
            if (r2 <= 0) goto L9
            r1.l0 = r2
            goto Lc
        L9:
            r2 = -1
            r1.l0 = r2
        Lc:
            boolean r2 = r1.k0
            if (r2 == 0) goto L21
            qs r2 = r1.o0
            if (r2 == 0) goto L21
            android.widget.EditText r2 = r1.d0
            if (r2 != 0) goto L1a
            r2 = 0
            goto L1e
        L1a:
            android.text.Editable r2 = r2.getText()
        L1e:
            r1.p(r2)
        L21:
            return
    }

    public void setCounterOverflowTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.p0
            if (r0 == r2) goto L9
            r1.p0 = r2
            r1.q()
        L9:
            return
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.z0
            if (r0 == r2) goto L9
            r1.z0 = r2
            r1.q()
        L9:
            return
    }

    public void setCounterTextAppearance(int r2) {
            r1 = this;
            int r0 = r1.q0
            if (r0 == r2) goto L9
            r1.q0 = r2
            r1.q()
        L9:
            return
    }

    public void setCounterTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.y0
            if (r0 == r2) goto L9
            r1.y0 = r2
            r1.q()
        L9:
            return
    }

    public void setCursorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.A0
            if (r0 == r2) goto L9
            r1.A0 = r2
            r1.r()
        L9:
            return
    }

    public void setCursorErrorColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.B0
            if (r0 == r2) goto L19
            r1.B0 = r2
            boolean r2 = r1.o()
            if (r2 != 0) goto L16
            qs r2 = r1.o0
            if (r2 == 0) goto L15
            boolean r2 = r1.m0
            if (r2 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            r1.r()
        L19:
            return
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f1 = r1
            r0.g1 = r1
            android.widget.EditText r1 = r0.d0
            if (r1 == 0) goto Lc
            r1 = 0
            r0.w(r1, r1)
        Lc:
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            m(r0, r1)
            super.setEnabled(r1)
            return
    }

    public void setEndIconActivated(boolean r1) {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.setActivated(r1)
            return
    }

    public void setEndIconCheckable(boolean r1) {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.setCheckable(r1)
            return
    }

    public void setEndIconContentDescription(int r2) {
            r1 = this;
            n42 r1 = r1.L
            if (r2 == 0) goto Ld
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 == r2) goto L19
            r1.setContentDescription(r2)
        L19:
            return
    }

    public void setEndIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            n42 r1 = r1.L
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 == r2) goto Ld
            r1.setContentDescription(r2)
        Ld:
            return
    }

    public void setEndIconDrawable(int r4) {
            r3 = this;
            n42 r3 = r3.L
            if (r4 == 0) goto Ld
            android.content.Context r0 = r3.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.hf.S(r0, r4)
            goto Le
        Ld:
            r4 = 0
        Le:
            com.google.android.material.textfield.TextInputLayout r0 = r3.A
            com.google.android.material.internal.CheckableImageButton r1 = r3.f0
            r1.setImageDrawable(r4)
            if (r4 == 0) goto L23
            android.content.res.ColorStateList r4 = r3.j0
            android.graphics.PorterDuff$Mode r2 = r3.k0
            defpackage.kj2.p(r0, r1, r4, r2)
            android.content.res.ColorStateList r3 = r3.j0
            defpackage.kj2.V(r0, r1, r3)
        L23:
            return
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable r4) {
            r3 = this;
            n42 r3 = r3.L
            com.google.android.material.textfield.TextInputLayout r0 = r3.A
            com.google.android.material.internal.CheckableImageButton r1 = r3.f0
            r1.setImageDrawable(r4)
            if (r4 == 0) goto L17
            android.content.res.ColorStateList r4 = r3.j0
            android.graphics.PorterDuff$Mode r2 = r3.k0
            defpackage.kj2.p(r0, r1, r4, r2)
            android.content.res.ColorStateList r3 = r3.j0
            defpackage.kj2.V(r0, r1, r3)
        L17:
            return
    }

    public void setEndIconMinSize(int r2) {
            r1 = this;
            n42 r1 = r1.L
            if (r2 < 0) goto L1b
            int r0 = r1.l0
            if (r2 == r0) goto L1a
            r1.l0 = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.f0
            r0.setMinimumWidth(r2)
            r0.setMinimumHeight(r2)
            com.google.android.material.internal.CheckableImageButton r1 = r1.L
            r1.setMinimumWidth(r2)
            r1.setMinimumHeight(r2)
        L1a:
            return
        L1b:
            r1.getClass()
            java.lang.String r1 = "endIconSize cannot be less than 0"
            defpackage.i.h(r1)
            return
    }

    public void setEndIconMode(int r1) {
            r0 = this;
            n42 r0 = r0.L
            r0.g(r1)
            return
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            n42 r1 = r1.L
            com.google.android.material.internal.CheckableImageButton r0 = r1.f0
            android.view.View$OnLongClickListener r1 = r1.n0
            r0.setOnClickListener(r2)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener r1) {
            r0 = this;
            n42 r0 = r0.L
            r0.n0 = r1
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.setOnLongClickListener(r1)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setEndIconScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            n42 r1 = r1.L
            r1.m0 = r2
            com.google.android.material.internal.CheckableImageButton r0 = r1.f0
            r0.setScaleType(r2)
            com.google.android.material.internal.CheckableImageButton r1 = r1.L
            r1.setScaleType(r2)
            return
    }

    public void setEndIconTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            n42 r2 = r2.L
            android.content.res.ColorStateList r0 = r2.j0
            if (r0 == r3) goto L11
            r2.j0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.f0
            android.graphics.PorterDuff$Mode r2 = r2.k0
            defpackage.kj2.p(r0, r1, r3, r2)
        L11:
            return
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            n42 r2 = r2.L
            android.graphics.PorterDuff$Mode r0 = r2.k0
            if (r0 == r3) goto L11
            r2.k0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.f0
            android.content.res.ColorStateList r2 = r2.j0
            defpackage.kj2.p(r0, r1, r2, r3)
        L11:
            return
    }

    public void setEndIconVisible(boolean r1) {
            r0 = this;
            n42 r0 = r0.L
            r0.h(r1)
            return
    }

    public void setError(java.lang.CharSequence r4) {
            r3 = this;
            q43 r0 = r3.j0
            boolean r1 = r0.q
            r2 = 1
            if (r1 != 0) goto L11
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Le
            return
        Le:
            r3.setErrorEnabled(r2)
        L11:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L33
            r0.c()
            r0.p = r4
            qs r3 = r0.r
            r3.setText(r4)
            int r3 = r0.n
            if (r3 == r2) goto L27
            r0.o = r2
        L27:
            int r1 = r0.o
            qs r2 = r0.r
            boolean r4 = r0.h(r2, r4)
            r0.i(r3, r4, r1)
            return
        L33:
            r0.f()
            return
    }

    public void setErrorAccessibilityLiveRegion(int r1) {
            r0 = this;
            q43 r0 = r0.j0
            r0.t = r1
            qs r0 = r0.r
            if (r0 == 0) goto Lb
            r0.setAccessibilityLiveRegion(r1)
        Lb:
            return
    }

    public void setErrorContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            q43 r0 = r0.j0
            r0.s = r1
            qs r0 = r0.r
            if (r0 == 0) goto Lb
            r0.setContentDescription(r1)
        Lb:
            return
    }

    public void setErrorEnabled(boolean r5) {
            r4 = this;
            q43 r4 = r4.j0
            com.google.android.material.textfield.TextInputLayout r0 = r4.h
            boolean r1 = r4.q
            if (r1 != r5) goto L9
            return
        L9:
            r4.c()
            r1 = 0
            r2 = 0
            if (r5 == 0) goto L6a
            qs r0 = new qs
            android.content.Context r3 = r4.g
            r0.<init>(r3, r2)
            r4.r = r0
            r2 = 2131428006(0x7f0b02a6, float:1.8477644E38)
            r0.setId(r2)
            qs r0 = r4.r
            r2 = 5
            r0.setTextAlignment(r2)
            android.graphics.Typeface r0 = r4.B
            if (r0 == 0) goto L2e
            qs r2 = r4.r
            r2.setTypeface(r0)
        L2e:
            int r0 = r4.u
            r4.u = r0
            qs r2 = r4.r
            if (r2 == 0) goto L3b
            com.google.android.material.textfield.TextInputLayout r3 = r4.h
            r3.n(r2, r0)
        L3b:
            android.content.res.ColorStateList r0 = r4.v
            r4.v = r0
            qs r2 = r4.r
            if (r2 == 0) goto L48
            if (r0 == 0) goto L48
            r2.setTextColor(r0)
        L48:
            java.lang.CharSequence r0 = r4.s
            r4.s = r0
            qs r2 = r4.r
            if (r2 == 0) goto L53
            r2.setContentDescription(r0)
        L53:
            int r0 = r4.t
            r4.t = r0
            qs r2 = r4.r
            if (r2 == 0) goto L5e
            r2.setAccessibilityLiveRegion(r0)
        L5e:
            qs r0 = r4.r
            r2 = 4
            r0.setVisibility(r2)
            qs r0 = r4.r
            r4.a(r0, r1)
            goto L7a
        L6a:
            r4.f()
            qs r3 = r4.r
            r4.g(r3, r1)
            r4.r = r2
            r0.t()
            r0.z()
        L7a:
            r4.q = r5
            return
    }

    public void setErrorIconDrawable(int r2) {
            r1 = this;
            n42 r1 = r1.L
            if (r2 == 0) goto Ld
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            r1.i(r2)
            com.google.android.material.textfield.TextInputLayout r2 = r1.A
            com.google.android.material.internal.CheckableImageButton r0 = r1.L
            android.content.res.ColorStateList r1 = r1.R
            defpackage.kj2.V(r2, r0, r1)
            return
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            n42 r0 = r0.L
            r0.i(r1)
            return
    }

    public void setErrorIconOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            n42 r1 = r1.L
            com.google.android.material.internal.CheckableImageButton r0 = r1.L
            android.view.View$OnLongClickListener r1 = r1.e0
            r0.setOnClickListener(r2)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setErrorIconOnLongClickListener(android.view.View.OnLongClickListener r1) {
            r0 = this;
            n42 r0 = r0.L
            r0.e0 = r1
            com.google.android.material.internal.CheckableImageButton r0 = r0.L
            r0.setOnLongClickListener(r1)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setErrorIconTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            n42 r2 = r2.L
            android.content.res.ColorStateList r0 = r2.R
            if (r0 == r3) goto L11
            r2.R = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.L
            android.graphics.PorterDuff$Mode r2 = r2.d0
            defpackage.kj2.p(r0, r1, r3, r2)
        L11:
            return
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            n42 r2 = r2.L
            android.graphics.PorterDuff$Mode r0 = r2.d0
            if (r0 == r3) goto L11
            r2.d0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.L
            android.content.res.ColorStateList r2 = r2.R
            defpackage.kj2.p(r0, r1, r2, r3)
        L11:
            return
    }

    public void setErrorTextAppearance(int r2) {
            r1 = this;
            q43 r1 = r1.j0
            r1.u = r2
            qs r0 = r1.r
            if (r0 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r1 = r1.h
            r1.n(r0, r2)
        Ld:
            return
    }

    public void setErrorTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            q43 r0 = r0.j0
            r0.v = r1
            qs r0 = r0.r
            if (r0 == 0) goto Ld
            if (r1 == 0) goto Ld
            r0.setTextColor(r1)
        Ld:
            return
    }

    public void setExpandedHintEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.t1
            if (r0 == r2) goto La
            r1.t1 = r2
            r2 = 0
            r1.w(r2, r2)
        La:
            return
    }

    public void setHelperText(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            q43 r1 = r3.j0
            if (r0 == 0) goto L11
            boolean r4 = r1.x
            if (r4 == 0) goto L10
            r4 = 0
            r3.setHelperTextEnabled(r4)
        L10:
            return
        L11:
            boolean r0 = r1.x
            if (r0 != 0) goto L19
            r0 = 1
            r3.setHelperTextEnabled(r0)
        L19:
            r1.c()
            r1.w = r4
            qs r3 = r1.y
            r3.setText(r4)
            int r3 = r1.n
            r0 = 2
            if (r3 == r0) goto L2a
            r1.o = r0
        L2a:
            int r0 = r1.o
            qs r2 = r1.y
            boolean r4 = r1.h(r2, r4)
            r1.i(r3, r4, r0)
            return
    }

    public void setHelperTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            q43 r0 = r0.j0
            r0.A = r1
            qs r0 = r0.y
            if (r0 == 0) goto Ld
            if (r1 == 0) goto Ld
            r0.setTextColor(r1)
        Ld:
            return
    }

    public void setHelperTextEnabled(boolean r8) {
            r7 = this;
            q43 r7 = r7.j0
            com.google.android.material.textfield.TextInputLayout r0 = r7.h
            boolean r1 = r7.x
            if (r1 != r8) goto L9
            return
        L9:
            r7.c()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L61
            qs r0 = new qs
            android.content.Context r3 = r7.g
            r0.<init>(r3, r1)
            r7.y = r0
            r1 = 2131428007(0x7f0b02a7, float:1.8477646E38)
            r0.setId(r1)
            qs r0 = r7.y
            r1 = 5
            r0.setTextAlignment(r1)
            android.graphics.Typeface r0 = r7.B
            if (r0 == 0) goto L2e
            qs r1 = r7.y
            r1.setTypeface(r0)
        L2e:
            qs r0 = r7.y
            r1 = 4
            r0.setVisibility(r1)
            qs r0 = r7.y
            r0.setAccessibilityLiveRegion(r2)
            int r0 = r7.z
            r7.z = r0
            qs r1 = r7.y
            if (r1 == 0) goto L44
            r1.setTextAppearance(r0)
        L44:
            android.content.res.ColorStateList r0 = r7.A
            r7.A = r0
            qs r1 = r7.y
            if (r1 == 0) goto L51
            if (r0 == 0) goto L51
            r1.setTextColor(r0)
        L51:
            qs r0 = r7.y
            r7.a(r0, r2)
            qs r0 = r7.y
            p43 r1 = new p43
            r1.<init>(r7)
            r0.setAccessibilityDelegate(r1)
            goto L86
        L61:
            r7.c()
            int r3 = r7.n
            r4 = 2
            if (r3 != r4) goto L6c
            r4 = 0
            r7.o = r4
        L6c:
            int r4 = r7.o
            qs r5 = r7.y
            java.lang.String r6 = ""
            boolean r5 = r7.h(r5, r6)
            r7.i(r3, r5, r4)
            qs r3 = r7.y
            r7.g(r3, r2)
            r7.y = r1
            r0.t()
            r0.z()
        L86:
            r7.x = r8
            return
    }

    public void setHelperTextTextAppearance(int r1) {
            r0 = this;
            q43 r0 = r0.j0
            r0.z = r1
            qs r0 = r0.y
            if (r0 == 0) goto Lb
            r0.setTextAppearance(r1)
        Lb:
            return
    }

    public void setHint(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setHint(r2)
            return
    }

    public void setHint(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.C0
            if (r0 == 0) goto Lc
            r1.setHintInternal(r2)
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        Lc:
            return
    }

    public void setHintAnimationEnabled(boolean r1) {
            r0 = this;
            r0.u1 = r1
            return
    }

    public void setHintEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.C0
            if (r3 == r0) goto L51
            r2.C0 = r3
            r0 = 0
            if (r3 != 0) goto L2b
            r3 = 0
            r2.E0 = r3
            java.lang.CharSequence r3 = r2.D0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            android.widget.EditText r3 = r2.d0
            java.lang.CharSequence r3 = r3.getHint()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L27
            android.widget.EditText r3 = r2.d0
            java.lang.CharSequence r1 = r2.D0
            r3.setHint(r1)
        L27:
            r2.setHintInternal(r0)
            goto L4a
        L2b:
            android.widget.EditText r3 = r2.d0
            java.lang.CharSequence r3 = r3.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L47
            java.lang.CharSequence r1 = r2.D0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L42
            r2.setHint(r3)
        L42:
            android.widget.EditText r3 = r2.d0
            r3.setHint(r0)
        L47:
            r3 = 1
            r2.E0 = r3
        L4a:
            android.widget.EditText r3 = r2.d0
            if (r3 == 0) goto L51
            r2.v()
        L51:
            return
    }

    public void setHintMaxLines(int r4) {
            r3 = this;
            at0 r0 = r3.s1
            int r1 = r0.f0
            r2 = 0
            if (r4 == r1) goto Lc
            r0.f0 = r4
            r0.j(r2)
        Lc:
            int r1 = r0.e0
            if (r4 == r1) goto L15
            r0.e0 = r4
            r0.j(r2)
        L15:
            r3.requestLayout()
            return
    }

    public void setHintTextAppearance(int r6) {
            r5 = this;
            g07 r0 = new g07
            at0 r1 = r5.s1
            com.google.android.material.textfield.TextInputLayout r2 = r1.a
            android.content.Context r3 = r2.getContext()
            r0.<init>(r3, r6)
            android.content.res.ColorStateList r6 = r0.k
            if (r6 == 0) goto L13
            r1.k = r6
        L13:
            float r6 = r0.l
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L1c
            r1.i = r6
        L1c:
            android.content.res.ColorStateList r6 = r0.a
            if (r6 == 0) goto L22
            r1.V = r6
        L22:
            float r6 = r0.f
            r1.T = r6
            float r6 = r0.g
            r1.U = r6
            float r6 = r0.h
            r1.S = r6
            float r6 = r0.j
            r1.W = r6
            pj0 r6 = r1.z
            if (r6 == 0) goto L39
            r3 = 1
            r6.g = r3
        L39:
            pj0 r6 = new pj0
            os0 r3 = new os0
            r4 = 24
            r3.<init>(r1, r4)
            r0.a()
            android.graphics.Typeface r4 = r0.p
            r6.<init>(r3, r4)
            r1.z = r6
            android.content.Context r6 = r2.getContext()
            pj0 r2 = r1.z
            r0.b(r6, r2)
            r6 = 0
            r1.j(r6)
            android.content.res.ColorStateList r0 = r1.k
            r5.g1 = r0
            android.widget.EditText r0 = r5.d0
            if (r0 == 0) goto L67
            r5.w(r6, r6)
            r5.v()
        L67:
            return
    }

    public void setHintTextColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.g1
            if (r0 == r4) goto L1d
            android.content.res.ColorStateList r0 = r3.f1
            r1 = 0
            if (r0 != 0) goto L14
            at0 r0 = r3.s1
            android.content.res.ColorStateList r2 = r0.k
            if (r2 == r4) goto L14
            r0.k = r4
            r0.j(r1)
        L14:
            r3.g1 = r4
            android.widget.EditText r4 = r3.d0
            if (r4 == 0) goto L1d
            r3.w(r1, r1)
        L1d:
            return
    }

    public void setLengthCounter(defpackage.m37 r1) {
            r0 = this;
            r0.n0 = r1
            return
    }

    public void setMaxEms(int r2) {
            r1 = this;
            r1.g0 = r2
            android.widget.EditText r1 = r1.d0
            if (r1 == 0) goto Lc
            r0 = -1
            if (r2 == r0) goto Lc
            r1.setMaxEms(r2)
        Lc:
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            r1.i0 = r2
            android.widget.EditText r1 = r1.d0
            if (r1 == 0) goto Lc
            r0 = -1
            if (r2 == r0) goto Lc
            r1.setMaxWidth(r2)
        Lc:
            return
    }

    public void setMaxWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMaxWidth(r2)
            return
    }

    public void setMinEms(int r2) {
            r1 = this;
            r1.f0 = r2
            android.widget.EditText r1 = r1.d0
            if (r1 == 0) goto Lc
            r0 = -1
            if (r2 == r0) goto Lc
            r1.setMinEms(r2)
        Lc:
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            r1.h0 = r2
            android.widget.EditText r1 = r1.d0
            if (r1 == 0) goto Lc
            r0 = -1
            if (r2 == r0) goto Lc
            r1.setMinWidth(r2)
        Lc:
            return
    }

    public void setMinWidthResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setMinWidth(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int r2) {
            r1 = this;
            n42 r1 = r1.L
            if (r2 == 0) goto Ld
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            r1.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.setContentDescription(r1)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int r2) {
            r1 = this;
            n42 r1 = r1.L
            if (r2 == 0) goto Ld
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto Le
        Ld:
            r2 = 0
        Le:
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            r1.setImageDrawable(r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.setImageDrawable(r1)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean r3) {
            r2 = this;
            n42 r2 = r2.L
            if (r3 == 0) goto Ld
            int r0 = r2.h0
            r1 = 1
            if (r0 == r1) goto Ld
            r2.g(r1)
            return
        Ld:
            if (r3 != 0) goto L14
            r3 = 0
            r2.g(r3)
            return
        L14:
            r2.getClass()
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            n42 r2 = r2.L
            r2.j0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.f0
            android.graphics.PorterDuff$Mode r2 = r2.k0
            defpackage.kj2.p(r0, r1, r3, r2)
            return
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            n42 r2 = r2.L
            r2.k0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.f0
            android.content.res.ColorStateList r2 = r2.j0
            defpackage.kj2.p(r0, r1, r2, r3)
            return
    }

    public void setPlaceholderText(java.lang.CharSequence r6) {
            r5 = this;
            qs r0 = r5.t0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L46
            qs r0 = new qs
            android.content.Context r3 = r5.getContext()
            r0.<init>(r3, r1)
            r5.t0 = r0
            r3 = 2131428008(0x7f0b02a8, float:1.8477648E38)
            r0.setId(r3)
            qs r0 = r5.t0
            r0.setImportantForAccessibility(r2)
            qs r0 = r5.t0
            r0.setAccessibilityLiveRegion(r2)
            h92 r0 = r5.f()
            r5.w0 = r0
            r3 = 67
            r0.B = r3
            h92 r0 = r5.f()
            r5.x0 = r0
            int r0 = r5.v0
            r5.setPlaceholderTextAppearance(r0)
            android.content.res.ColorStateList r0 = r5.u0
            r5.setPlaceholderTextColor(r0)
            qs r0 = r5.t0
            c24 r3 = new c24
            r4 = 4
            r3.<init>(r4)
            defpackage.ao7.n(r0, r3)
        L46:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L51
            r6 = 0
            r5.setPlaceholderTextEnabled(r6)
            goto L5a
        L51:
            boolean r0 = r5.s0
            if (r0 != 0) goto L58
            r5.setPlaceholderTextEnabled(r2)
        L58:
            r5.r0 = r6
        L5a:
            android.widget.EditText r6 = r5.d0
            if (r6 != 0) goto L5f
            goto L63
        L5f:
            android.text.Editable r1 = r6.getText()
        L63:
            r5.x(r1)
            return
    }

    public void setPlaceholderTextAppearance(int r1) {
            r0 = this;
            r0.v0 = r1
            qs r0 = r0.t0
            if (r0 == 0) goto L9
            r0.setTextAppearance(r1)
        L9:
            return
    }

    public void setPlaceholderTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.u0
            if (r0 == r2) goto Lf
            r1.u0 = r2
            qs r1 = r1.t0
            if (r1 == 0) goto Lf
            if (r2 == 0) goto Lf
            r1.setTextColor(r2)
        Lf:
            return
    }

    public void setPrefixText(java.lang.CharSequence r2) {
            r1 = this;
            fp6 r1 = r1.B
            r1.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = r2
        Le:
            r1.L = r0
            qs r0 = r1.B
            r0.setText(r2)
            r1.e()
            return
    }

    public void setPrefixTextAppearance(int r1) {
            r0 = this;
            fp6 r0 = r0.B
            qs r0 = r0.B
            r0.setTextAppearance(r1)
            return
    }

    public void setPrefixTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            fp6 r0 = r0.B
            qs r0 = r0.B
            r0.setTextColor(r1)
            return
    }

    public void setShapeAppearanceModel(defpackage.me6 r2) {
            r1 = this;
            p24 r0 = r1.F0
            if (r0 == 0) goto Lf
            n24 r0 = r0.B
            me6 r0 = r0.a
            if (r0 == r2) goto Lf
            r1.L0 = r2
            r1.c()
        Lf:
            return
    }

    public void setStartIconCheckable(boolean r1) {
            r0 = this;
            fp6 r0 = r0.B
            com.google.android.material.internal.CheckableImageButton r0 = r0.R
            r0.setCheckable(r1)
            return
    }

    public void setStartIconContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconContentDescription(r2)
            return
    }

    public void setStartIconContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            fp6 r1 = r1.B
            com.google.android.material.internal.CheckableImageButton r1 = r1.R
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 == r2) goto Ld
            r1.setContentDescription(r2)
        Ld:
            return
    }

    public void setStartIconDrawable(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStartIconDrawable(r2)
            return
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            fp6 r0 = r0.B
            r0.b(r1)
            return
    }

    public void setStartIconMinSize(int r2) {
            r1 = this;
            fp6 r1 = r1.B
            if (r2 < 0) goto L13
            int r0 = r1.f0
            if (r2 == r0) goto L12
            r1.f0 = r2
            com.google.android.material.internal.CheckableImageButton r1 = r1.R
            r1.setMinimumWidth(r2)
            r1.setMinimumHeight(r2)
        L12:
            return
        L13:
            r1.getClass()
            java.lang.String r1 = "startIconSize cannot be less than 0"
            defpackage.i.h(r1)
            return
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            fp6 r1 = r1.B
            com.google.android.material.internal.CheckableImageButton r0 = r1.R
            android.view.View$OnLongClickListener r1 = r1.h0
            r0.setOnClickListener(r2)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener r1) {
            r0 = this;
            fp6 r0 = r0.B
            r0.h0 = r1
            com.google.android.material.internal.CheckableImageButton r0 = r0.R
            r0.setOnLongClickListener(r1)
            defpackage.kj2.Y(r0, r1)
            return
    }

    public void setStartIconScaleType(android.widget.ImageView.ScaleType r1) {
            r0 = this;
            fp6 r0 = r0.B
            r0.g0 = r1
            com.google.android.material.internal.CheckableImageButton r0 = r0.R
            r0.setScaleType(r1)
            return
    }

    public void setStartIconTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            fp6 r2 = r2.B
            android.content.res.ColorStateList r0 = r2.d0
            if (r0 == r3) goto L11
            r2.d0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.R
            android.graphics.PorterDuff$Mode r2 = r2.e0
            defpackage.kj2.p(r0, r1, r3, r2)
        L11:
            return
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            fp6 r2 = r2.B
            android.graphics.PorterDuff$Mode r0 = r2.e0
            if (r0 == r3) goto L11
            r2.e0 = r3
            com.google.android.material.textfield.TextInputLayout r0 = r2.A
            com.google.android.material.internal.CheckableImageButton r1 = r2.R
            android.content.res.ColorStateList r2 = r2.d0
            defpackage.kj2.p(r0, r1, r2, r3)
        L11:
            return
    }

    public void setStartIconVisible(boolean r1) {
            r0 = this;
            fp6 r0 = r0.B
            r0.c(r1)
            return
    }

    public void setSuffixText(java.lang.CharSequence r2) {
            r1 = this;
            n42 r1 = r1.L
            r1.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = r2
        Le:
            r1.o0 = r0
            qs r0 = r1.p0
            r0.setText(r2)
            r1.n()
            return
    }

    public void setSuffixTextAppearance(int r1) {
            r0 = this;
            n42 r0 = r0.L
            qs r0 = r0.p0
            r0.setTextAppearance(r1)
            return
    }

    public void setSuffixTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            n42 r0 = r0.L
            qs r0 = r0.p0
            r0.setTextColor(r1)
            return
    }

    public void setTextInputAccessibilityDelegate(defpackage.l37 r1) {
            r0 = this;
            android.widget.EditText r0 = r0.d0
            if (r0 == 0) goto L7
            defpackage.ao7.n(r0, r1)
        L7:
            return
    }

    public void setTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.graphics.Typeface r0 = r2.Y0
            if (r3 == r0) goto L28
            r2.Y0 = r3
            at0 r0 = r2.s1
            r0.n(r3)
            q43 r0 = r2.j0
            android.graphics.Typeface r1 = r0.B
            if (r3 == r1) goto L21
            r0.B = r3
            qs r1 = r0.r
            if (r1 == 0) goto L1a
            r1.setTypeface(r3)
        L1a:
            qs r0 = r0.y
            if (r0 == 0) goto L21
            r0.setTypeface(r3)
        L21:
            qs r2 = r2.o0
            if (r2 == 0) goto L28
            r2.setTypeface(r3)
        L28:
            return
    }

    public final void t() {
            r2 = this;
            android.widget.EditText r0 = r2.d0
            if (r0 == 0) goto L48
            int r1 = r2.O0
            if (r1 == 0) goto L9
            goto L48
        L9:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L10
            goto L48
        L10:
            int[] r1 = defpackage.bp1.a
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.o()
            if (r1 == 0) goto L2a
            int r2 = r2.getErrorCurrentTextColors()
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r2 = defpackage.ir.c(r2, r1)
            r0.setColorFilter(r2)
            return
        L2a:
            boolean r1 = r2.m0
            if (r1 == 0) goto L40
            qs r1 = r2.o0
            if (r1 == 0) goto L40
            int r2 = r1.getCurrentTextColor()
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r2 = defpackage.ir.c(r2, r1)
            r0.setColorFilter(r2)
            return
        L40:
            r0.clearColorFilter()
            android.widget.EditText r2 = r2.d0
            r2.refreshDrawableState()
        L48:
            return
    }

    public final void u() {
            r2 = this;
            android.widget.EditText r0 = r2.d0
            if (r0 == 0) goto L23
            p24 r1 = r2.F0
            if (r1 == 0) goto L23
            boolean r1 = r2.I0
            if (r1 != 0) goto L12
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L23
        L12:
            int r0 = r2.O0
            if (r0 != 0) goto L17
            goto L23
        L17:
            android.graphics.drawable.Drawable r0 = r2.getEditTextBoxBackground()
            android.widget.EditText r1 = r2.d0
            r1.setBackground(r0)
            r0 = 1
            r2.I0 = r0
        L23:
            return
    }

    public final void v() {
            r3 = this;
            int r0 = r3.O0
            r1 = 1
            if (r0 == r1) goto L1a
            android.widget.FrameLayout r0 = r3.A
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r3 = r3.e()
            int r2 = r1.topMargin
            if (r3 == r2) goto L1a
            r1.topMargin = r3
            r0.requestLayout()
        L1a:
            return
    }

    public final void w(boolean r10, boolean r11) {
            r9 = this;
            boolean r0 = r9.isEnabled()
            android.widget.EditText r1 = r9.d0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            android.widget.EditText r4 = r9.d0
            if (r4 == 0) goto L23
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            android.content.res.ColorStateList r5 = r9.f1
            at0 r6 = r9.s1
            if (r5 == 0) goto L2d
            r6.k(r5)
        L2d:
            r5 = 0
            if (r0 != 0) goto L49
            android.content.res.ColorStateList r0 = r9.f1
            int r7 = r9.p1
            if (r0 == 0) goto L41
            r8 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r8 = new int[]{r8}
            int r7 = r0.getColorForState(r8, r7)
        L41:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r7)
            r6.k(r0)
            goto L7e
        L49:
            boolean r0 = r9.o()
            if (r0 == 0) goto L5f
            q43 r0 = r9.j0
            qs r0 = r0.r
            if (r0 == 0) goto L5a
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L5b
        L5a:
            r0 = r5
        L5b:
            r6.k(r0)
            goto L7e
        L5f:
            boolean r0 = r9.m0
            if (r0 == 0) goto L6f
            qs r0 = r9.o0
            if (r0 == 0) goto L6f
            android.content.res.ColorStateList r0 = r0.getTextColors()
            r6.k(r0)
            goto L7e
        L6f:
            if (r4 == 0) goto L7e
            android.content.res.ColorStateList r0 = r9.g1
            if (r0 == 0) goto L7e
            android.content.res.ColorStateList r7 = r6.k
            if (r7 == r0) goto L7e
            r6.k = r0
            r6.j(r2)
        L7e:
            n42 r0 = r9.L
            fp6 r7 = r9.B
            if (r1 != 0) goto Lfa
            boolean r1 = r9.t1
            if (r1 == 0) goto Lfa
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L91
            if (r4 == 0) goto L91
            goto Lfa
        L91:
            if (r11 != 0) goto L97
            boolean r11 = r9.r1
            if (r11 != 0) goto L101
        L97:
            android.animation.ValueAnimator r11 = r9.v1
            if (r11 == 0) goto La6
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto La6
            android.animation.ValueAnimator r11 = r9.v1
            r11.cancel()
        La6:
            r11 = 0
            if (r10 == 0) goto Lb1
            boolean r10 = r9.u1
            if (r10 == 0) goto Lb1
            r9.b(r11)
            goto Lb4
        Lb1:
            r6.m(r11)
        Lb4:
            boolean r10 = r9.g()
            if (r10 == 0) goto Ld5
            p24 r10 = r9.F0
            o81 r10 = (defpackage.o81) r10
            n81 r10 = r10.C0
            android.graphics.RectF r10 = r10.r
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Ld5
            boolean r10 = r9.g()
            if (r10 == 0) goto Ld5
            p24 r10 = r9.F0
            o81 r10 = (defpackage.o81) r10
            r10.t(r11, r11, r11, r11)
        Ld5:
            r9.r1 = r3
            qs r10 = r9.t0
            if (r10 == 0) goto Lef
            boolean r11 = r9.s0
            if (r11 == 0) goto Lef
            r10.setText(r5)
            android.widget.FrameLayout r10 = r9.A
            h92 r11 = r9.x0
            defpackage.oa7.a(r10, r11)
            qs r9 = r9.t0
            r10 = 4
            r9.setVisibility(r10)
        Lef:
            r7.i0 = r3
            r7.e()
            r0.q0 = r3
            r0.n()
            return
        Lfa:
            if (r11 != 0) goto L102
            boolean r11 = r9.r1
            if (r11 == 0) goto L101
            goto L102
        L101:
            return
        L102:
            android.animation.ValueAnimator r11 = r9.v1
            if (r11 == 0) goto L111
            boolean r11 = r11.isRunning()
            if (r11 == 0) goto L111
            android.animation.ValueAnimator r11 = r9.v1
            r11.cancel()
        L111:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L11d
            boolean r10 = r9.u1
            if (r10 == 0) goto L11d
            r9.b(r11)
            goto L120
        L11d:
            r6.m(r11)
        L120:
            r9.r1 = r2
            boolean r10 = r9.g()
            if (r10 == 0) goto L12b
            r9.l()
        L12b:
            android.widget.EditText r10 = r9.d0
            if (r10 != 0) goto L130
            goto L134
        L130:
            android.text.Editable r5 = r10.getText()
        L134:
            r9.x(r5)
            r7.i0 = r2
            r7.e()
            r0.q0 = r2
            r0.n()
            return
    }

    public final void x(android.text.Editable r4) {
            r3 = this;
            m37 r0 = r3.n0
            fa6 r0 = (defpackage.fa6) r0
            r0.getClass()
            r0 = 0
            if (r4 == 0) goto Lf
            int r4 = r4.length()
            goto L10
        Lf:
            r4 = r0
        L10:
            android.widget.FrameLayout r1 = r3.A
            if (r4 != 0) goto L3f
            boolean r4 = r3.r1
            if (r4 != 0) goto L3f
            qs r4 = r3.t0
            if (r4 == 0) goto L56
            boolean r4 = r3.s0
            if (r4 == 0) goto L56
            java.lang.CharSequence r4 = r3.r0
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L56
            qs r4 = r3.t0
            java.lang.CharSequence r2 = r3.r0
            r4.setText(r2)
            h92 r4 = r3.w0
            defpackage.oa7.a(r1, r4)
            qs r4 = r3.t0
            r4.setVisibility(r0)
            qs r3 = r3.t0
            r3.bringToFront()
            return
        L3f:
            qs r4 = r3.t0
            if (r4 == 0) goto L56
            boolean r0 = r3.s0
            if (r0 == 0) goto L56
            r0 = 0
            r4.setText(r0)
            h92 r4 = r3.x0
            defpackage.oa7.a(r1, r4)
            qs r3 = r3.t0
            r4 = 4
            r3.setVisibility(r4)
        L56:
            return
    }

    public final void y(boolean r6, boolean r7) {
            r5 = this;
            android.content.res.ColorStateList r0 = r5.k1
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r1 = r5.k1
            r2 = 16843623(0x1010367, float:2.3696E-38)
            r3 = 16842910(0x101009e, float:2.3694E-38)
            int[] r2 = new int[]{r2, r3}
            int r1 = r1.getColorForState(r2, r0)
            android.content.res.ColorStateList r2 = r5.k1
            r4 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r3 = new int[]{r4, r3}
            int r2 = r2.getColorForState(r3, r0)
            if (r6 == 0) goto L28
            r5.T0 = r2
            return
        L28:
            if (r7 == 0) goto L2d
            r5.T0 = r1
            return
        L2d:
            r5.T0 = r0
            return
    }

    public final void z() {
            r9 = this;
            p24 r0 = r9.F0
            if (r0 == 0) goto L130
            int r0 = r9.O0
            if (r0 != 0) goto La
            goto L130
        La:
            boolean r0 = r9.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            android.widget.EditText r0 = r9.d0
            if (r0 == 0) goto L1d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = r9.isHovered()
            if (r3 != 0) goto L30
            android.widget.EditText r3 = r9.d0
            if (r3 == 0) goto L31
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r9.isEnabled()
            if (r3 != 0) goto L3c
            int r3 = r9.p1
            r9.T0 = r3
            goto L7a
        L3c:
            boolean r3 = r9.o()
            if (r3 == 0) goto L51
            android.content.res.ColorStateList r3 = r9.k1
            if (r3 == 0) goto L4a
            r9.y(r0, r1)
            goto L7a
        L4a:
            int r3 = r9.getErrorCurrentTextColors()
            r9.T0 = r3
            goto L7a
        L51:
            boolean r3 = r9.m0
            if (r3 == 0) goto L68
            qs r3 = r9.o0
            if (r3 == 0) goto L68
            android.content.res.ColorStateList r4 = r9.k1
            if (r4 == 0) goto L61
            r9.y(r0, r1)
            goto L7a
        L61:
            int r3 = r3.getCurrentTextColor()
            r9.T0 = r3
            goto L7a
        L68:
            if (r0 == 0) goto L6f
            int r3 = r9.j1
            r9.T0 = r3
            goto L7a
        L6f:
            if (r1 == 0) goto L76
            int r3 = r9.i1
            r9.T0 = r3
            goto L7a
        L76:
            int r3 = r9.h1
            r9.T0 = r3
        L7a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L83
            r9.r()
        L83:
            n42 r3 = r9.L
            com.google.android.material.textfield.TextInputLayout r4 = r3.A
            com.google.android.material.internal.CheckableImageButton r5 = r3.f0
            com.google.android.material.textfield.TextInputLayout r6 = r3.A
            r3.l()
            com.google.android.material.internal.CheckableImageButton r7 = r3.L
            android.content.res.ColorStateList r8 = r3.R
            defpackage.kj2.V(r6, r7, r8)
            android.content.res.ColorStateList r7 = r3.j0
            defpackage.kj2.V(r6, r5, r7)
            o42 r6 = r3.b()
            boolean r6 = r6 instanceof defpackage.vp1
            if (r6 == 0) goto Lc8
            boolean r6 = r4.o()
            if (r6 == 0) goto Lc1
            android.graphics.drawable.Drawable r6 = r5.getDrawable()
            if (r6 == 0) goto Lc1
            android.graphics.drawable.Drawable r3 = r5.getDrawable()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            int r4 = r4.getErrorCurrentTextColors()
            r3.setTint(r4)
            r5.setImageDrawable(r3)
            goto Lc8
        Lc1:
            android.content.res.ColorStateList r6 = r3.j0
            android.graphics.PorterDuff$Mode r3 = r3.k0
            defpackage.kj2.p(r4, r5, r6, r3)
        Lc8:
            fp6 r3 = r9.B
            com.google.android.material.textfield.TextInputLayout r4 = r3.A
            com.google.android.material.internal.CheckableImageButton r5 = r3.R
            android.content.res.ColorStateList r3 = r3.d0
            defpackage.kj2.V(r4, r5, r3)
            int r3 = r9.O0
            r4 = 2
            if (r3 != r4) goto L10a
            int r3 = r9.Q0
            if (r0 == 0) goto Le7
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto Le7
            int r4 = r9.S0
            r9.Q0 = r4
            goto Leb
        Le7:
            int r4 = r9.R0
            r9.Q0 = r4
        Leb:
            int r4 = r9.Q0
            if (r4 == r3) goto L10a
            boolean r3 = r9.g()
            if (r3 == 0) goto L10a
            boolean r3 = r9.r1
            if (r3 != 0) goto L10a
            boolean r3 = r9.g()
            if (r3 == 0) goto L107
            p24 r3 = r9.F0
            o81 r3 = (defpackage.o81) r3
            r4 = 0
            r3.t(r4, r4, r4, r4)
        L107:
            r9.l()
        L10a:
            int r3 = r9.O0
            if (r3 != r2) goto L12d
            boolean r2 = r9.isEnabled()
            if (r2 != 0) goto L119
            int r0 = r9.m1
            r9.U0 = r0
            goto L12d
        L119:
            if (r1 == 0) goto L122
            if (r0 != 0) goto L122
            int r0 = r9.o1
            r9.U0 = r0
            goto L12d
        L122:
            if (r0 == 0) goto L129
            int r0 = r9.n1
            r9.U0 = r0
            goto L12d
        L129:
            int r0 = r9.l1
            r9.U0 = r0
        L12d:
            r9.c()
        L130:
            return
    }
}
