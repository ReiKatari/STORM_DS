package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n42  reason: default package */
/* loaded from: classes.dex */
public final class n42 extends android.widget.LinearLayout {
    public final com.google.android.material.textfield.TextInputLayout A;
    public final android.widget.FrameLayout B;
    public final com.google.android.material.internal.CheckableImageButton L;
    public android.content.res.ColorStateList R;
    public android.graphics.PorterDuff.Mode d0;
    public android.view.View.OnLongClickListener e0;
    public final com.google.android.material.internal.CheckableImageButton f0;
    public final defpackage.m42 g0;
    public int h0;
    public final java.util.LinkedHashSet i0;
    public android.content.res.ColorStateList j0;
    public android.graphics.PorterDuff.Mode k0;
    public int l0;
    public android.widget.ImageView.ScaleType m0;
    public android.view.View.OnLongClickListener n0;
    public java.lang.CharSequence o0;
    public final defpackage.qs p0;
    public boolean q0;
    public android.widget.EditText r0;
    public final android.view.accessibility.AccessibilityManager s0;
    public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener t0;
    public final defpackage.k42 u0;

    public n42(com.google.android.material.textfield.TextInputLayout r19, defpackage.m44 r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            android.content.Context r3 = r1.getContext()
            r0.<init>(r3)
            r3 = 0
            r0.h0 = r3
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r0.i0 = r4
            k42 r4 = new k42
            r4.<init>(r0)
            r0.u0 = r4
            l42 r4 = new l42
            r4.<init>(r0)
            android.content.Context r5 = r0.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0.s0 = r5
            r0.A = r1
            r5 = 8
            r0.setVisibility(r5)
            r0.setOrientation(r3)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = 8388613(0x800005, float:1.175495E-38)
            r8 = -2
            r9 = -1
            r6.<init>(r8, r9, r7)
            r0.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r7 = r0.getContext()
            r6.<init>(r7)
            r0.B = r6
            r6.setVisibility(r5)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r8, r9)
            r6.setLayoutParams(r7)
            android.content.Context r7 = r0.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r10 = 2131427994(0x7f0b029a, float:1.847762E38)
            com.google.android.material.internal.CheckableImageButton r10 = r0.a(r0, r7, r10)
            r0.L = r10
            r11 = 2131427993(0x7f0b0299, float:1.8477618E38)
            com.google.android.material.internal.CheckableImageButton r7 = r0.a(r6, r7, r11)
            r0.f0 = r7
            m42 r11 = new m42
            r11.<init>(r0, r2)
            r0.g0 = r11
            qs r11 = new qs
            android.content.Context r12 = r0.getContext()
            r13 = 0
            r11.<init>(r12, r13)
            r0.p0 = r11
            java.lang.Object r12 = r2.L
            android.content.res.TypedArray r12 = (android.content.res.TypedArray) r12
            r14 = 38
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto La1
            android.content.Context r15 = r0.getContext()
            android.content.res.ColorStateList r14 = defpackage.np2.R(r15, r2, r14)
            r0.R = r14
        La1:
            r14 = 39
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto Lb3
            int r14 = r12.getInt(r14, r9)
            android.graphics.PorterDuff$Mode r14 = defpackage.qo2.E(r14, r13)
            r0.d0 = r14
        Lb3:
            r14 = 37
            boolean r15 = r12.hasValue(r14)
            if (r15 == 0) goto Lc2
            android.graphics.drawable.Drawable r14 = r2.k(r14)
            r0.i(r14)
        Lc2:
            android.content.res.Resources r14 = r0.getResources()
            r15 = 2131951946(0x7f13014a, float:1.954032E38)
            java.lang.CharSequence r14 = r14.getText(r15)
            r10.setContentDescription(r14)
            r14 = 2
            r10.setImportantForAccessibility(r14)
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setCheckable(r3)
            r10.setFocusable(r3)
            r15 = 54
            boolean r16 = r12.hasValue(r15)
            if (r16 != 0) goto L10c
            r14 = 32
            boolean r17 = r12.hasValue(r14)
            if (r17 == 0) goto Lfa
            android.content.Context r8 = r0.getContext()
            android.content.res.ColorStateList r8 = defpackage.np2.R(r8, r2, r14)
            r0.j0 = r8
        Lfa:
            r8 = 33
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L10c
            int r8 = r12.getInt(r8, r9)
            android.graphics.PorterDuff$Mode r8 = defpackage.qo2.E(r8, r13)
            r0.k0 = r8
        L10c:
            r8 = 30
            boolean r14 = r12.hasValue(r8)
            r5 = 1
            if (r14 == 0) goto L13b
            int r8 = r12.getInt(r8, r3)
            r0.g(r8)
            r8 = 27
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L131
            java.lang.CharSequence r8 = r12.getText(r8)
            java.lang.CharSequence r14 = r7.getContentDescription()
            if (r14 == r8) goto L131
            r7.setContentDescription(r8)
        L131:
            r8 = 26
            boolean r8 = r12.getBoolean(r8, r5)
            r7.setCheckable(r8)
            goto L17b
        L13b:
            boolean r8 = r12.hasValue(r15)
            if (r8 == 0) goto L17b
            r8 = 55
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L153
            android.content.Context r14 = r0.getContext()
            android.content.res.ColorStateList r8 = defpackage.np2.R(r14, r2, r8)
            r0.j0 = r8
        L153:
            r8 = 56
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L165
            int r8 = r12.getInt(r8, r9)
            android.graphics.PorterDuff$Mode r8 = defpackage.qo2.E(r8, r13)
            r0.k0 = r8
        L165:
            boolean r8 = r12.getBoolean(r15, r3)
            r0.g(r8)
            r8 = 52
            java.lang.CharSequence r8 = r12.getText(r8)
            java.lang.CharSequence r14 = r7.getContentDescription()
            if (r14 == r8) goto L17b
            r7.setContentDescription(r8)
        L17b:
            android.content.res.Resources r8 = r0.getResources()
            r14 = 2131166119(0x7f0703a7, float:1.7946474E38)
            int r8 = r8.getDimensionPixelSize(r14)
            r14 = 29
            int r8 = r12.getDimensionPixelSize(r14, r8)
            if (r8 < 0) goto L221
            int r14 = r0.l0
            if (r8 == r14) goto L1a0
            r0.l0 = r8
            r7.setMinimumWidth(r8)
            r7.setMinimumHeight(r8)
            r10.setMinimumWidth(r8)
            r10.setMinimumHeight(r8)
        L1a0:
            r8 = 31
            boolean r14 = r12.hasValue(r8)
            if (r14 == 0) goto L1b8
            int r8 = r12.getInt(r8, r9)
            android.widget.ImageView$ScaleType r8 = defpackage.kj2.r(r8)
            r0.m0 = r8
            r7.setScaleType(r8)
            r10.setScaleType(r8)
        L1b8:
            r8 = 8
            r11.setVisibility(r8)
            r8 = 2131428010(0x7f0b02aa, float:1.8477652E38)
            r11.setId(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 1117782016(0x42a00000, float:80.0)
            r14 = -2
            r8.<init>(r14, r14, r9)
            r11.setLayoutParams(r8)
            r11.setAccessibilityLiveRegion(r5)
            r5 = 73
            int r3 = r12.getResourceId(r5, r3)
            r11.setTextAppearance(r3)
            r3 = 74
            boolean r5 = r12.hasValue(r3)
            if (r5 == 0) goto L1e9
            android.content.res.ColorStateList r2 = r2.g(r3)
            r11.setTextColor(r2)
        L1e9:
            r2 = 72
            java.lang.CharSequence r2 = r12.getText(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1f6
            goto L1f7
        L1f6:
            r13 = r2
        L1f7:
            r0.o0 = r13
            r11.setText(r2)
            r0.n()
            r6.addView(r7)
            r0.addView(r11)
            r0.addView(r6)
            r0.addView(r10)
            java.util.LinkedHashSet r2 = r1.b1
            r2.add(r4)
            android.widget.EditText r2 = r1.d0
            if (r2 == 0) goto L217
            r4.a(r1)
        L217:
            wh r1 = new wh
            r2 = 2
            r1.<init>(r0, r2)
            r0.addOnAttachStateChangeListener(r1)
            return
        L221:
            java.lang.String r0 = "endIconSize cannot be less than 0"
            defpackage.i.h(r0)
            throw r13
    }

    public final com.google.android.material.internal.CheckableImageButton a(android.view.ViewGroup r3, android.view.LayoutInflater r4, int r5) {
            r2 = this;
            r0 = 2131623982(0x7f0e002e, float:1.887513E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r3.setId(r5)
            android.content.Context r2 = r2.getContext()
            boolean r2 = defpackage.np2.W(r2)
            if (r2 == 0) goto L20
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMarginStart(r1)
        L20:
            return r3
    }

    public final defpackage.o42 b() {
            r4 = this;
            int r0 = r4.h0
            m42 r4 = r4.g0
            java.lang.Object r1 = r4.d
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            java.lang.Object r2 = r1.get(r0)
            o42 r2 = (defpackage.o42) r2
            if (r2 != 0) goto L52
            java.lang.Object r2 = r4.e
            n42 r2 = (defpackage.n42) r2
            r3 = -1
            if (r0 == r3) goto L48
            r3 = 1
            if (r0 == 0) goto L42
            if (r0 == r3) goto L39
            r4 = 2
            if (r0 == r4) goto L33
            r4 = 3
            if (r0 != r4) goto L28
            vp1 r4 = new vp1
            r4.<init>(r2)
            goto L4e
        L28:
            java.lang.String r4 = "Invalid end icon mode: "
            java.lang.String r4 = defpackage.lb1.g(r0, r4)
            defpackage.i.h(r4)
            r4 = 0
            return r4
        L33:
            lr0 r4 = new lr0
            r4.<init>(r2)
            goto L4e
        L39:
            it4 r3 = new it4
            int r4 = r4.c
            r3.<init>(r2, r4)
            r4 = r3
            goto L4e
        L42:
            h81 r4 = new h81
            r4.<init>(r2, r3)
            goto L4e
        L48:
            h81 r4 = new h81
            r3 = 0
            r4.<init>(r2, r3)
        L4e:
            r1.append(r0, r4)
            return r4
        L52:
            return r2
    }

    public final int c() {
            r2 = this;
            boolean r0 = r2.d()
            if (r0 != 0) goto Lf
            boolean r0 = r2.e()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L20
        Lf:
            com.google.android.material.internal.CheckableImageButton r0 = r2.f0
            int r1 = r0.getMeasuredWidth()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginStart()
            int r0 = r0 + r1
        L20:
            int r1 = r2.getPaddingEnd()
            qs r2 = r2.p0
            int r2 = r2.getPaddingEnd()
            int r2 = r2 + r1
            int r2 = r2 + r0
            return r2
    }

    public final boolean d() {
            r1 = this;
            android.widget.FrameLayout r0 = r1.B
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r1 = r1.f0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final boolean e() {
            r0 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r0.L
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void f(boolean r6) {
            r5 = this;
            o42 r0 = r5.b()
            boolean r1 = r0.j()
            com.google.android.material.internal.CheckableImageButton r2 = r5.f0
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r2.R
            boolean r4 = r0.k()
            if (r1 == r4) goto L1b
            r1 = r1 ^ r3
            r2.setChecked(r1)
            r1 = r3
            goto L1c
        L1b:
            r1 = 0
        L1c:
            boolean r4 = r0 instanceof defpackage.vp1
            if (r4 == 0) goto L30
            boolean r4 = r2.isActivated()
            vp1 r0 = (defpackage.vp1) r0
            boolean r0 = r0.l
            if (r4 == r0) goto L30
            r0 = r4 ^ 1
            r2.setActivated(r0)
            goto L31
        L30:
            r3 = r1
        L31:
            if (r6 != 0) goto L37
            if (r3 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            com.google.android.material.textfield.TextInputLayout r6 = r5.A
            android.content.res.ColorStateList r5 = r5.j0
            defpackage.kj2.V(r6, r2, r5)
            return
    }

    public final void g(int r9) {
            r8 = this;
            int r0 = r8.h0
            if (r0 != r9) goto L5
            return
        L5:
            o42 r0 = r8.b()
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r1 = r8.t0
            android.view.accessibility.AccessibilityManager r2 = r8.s0
            if (r1 == 0) goto L14
            if (r2 == 0) goto L14
            r2.removeTouchExplorationStateChangeListener(r1)
        L14:
            r1 = 0
            r8.t0 = r1
            r0.r()
            r8.h0 = r9
            java.util.LinkedHashSet r0 = r8.i0
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Le1
            r0 = 1
            if (r9 == 0) goto L2d
            r3 = r0
            goto L2e
        L2d:
            r3 = 0
        L2e:
            r8.h(r3)
            o42 r3 = r8.b()
            m42 r4 = r8.g0
            int r4 = r4.b
            if (r4 != 0) goto L3f
            int r4 = r3.d()
        L3f:
            if (r4 == 0) goto L4a
            android.content.Context r5 = r8.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.hf.S(r5, r4)
            goto L4b
        L4a:
            r4 = r1
        L4b:
            com.google.android.material.internal.CheckableImageButton r5 = r8.f0
            r5.setImageDrawable(r4)
            com.google.android.material.textfield.TextInputLayout r6 = r8.A
            if (r4 == 0) goto L60
            android.content.res.ColorStateList r4 = r8.j0
            android.graphics.PorterDuff$Mode r7 = r8.k0
            defpackage.kj2.p(r6, r5, r4, r7)
            android.content.res.ColorStateList r4 = r8.j0
            defpackage.kj2.V(r6, r5, r4)
        L60:
            int r4 = r3.c()
            if (r4 == 0) goto L6e
            android.content.res.Resources r1 = r8.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
        L6e:
            java.lang.CharSequence r4 = r5.getContentDescription()
            if (r4 == r1) goto L77
            r5.setContentDescription(r1)
        L77:
            boolean r1 = r3.j()
            r5.setCheckable(r1)
            int r1 = r6.getBoxBackgroundMode()
            boolean r1 = r3.i(r1)
            if (r1 == 0) goto Lc1
            r3.q()
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r9 = r3.h()
            r8.t0 = r9
            if (r9 == 0) goto La0
            if (r2 == 0) goto La0
            boolean r9 = r8.isAttachedToWindow()
            if (r9 == 0) goto La0
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r9 = r8.t0
            r2.addTouchExplorationStateChangeListener(r9)
        La0:
            android.view.View$OnClickListener r9 = r3.f()
            android.view.View$OnLongClickListener r1 = r8.n0
            r5.setOnClickListener(r9)
            defpackage.kj2.Y(r5, r1)
            android.widget.EditText r9 = r8.r0
            if (r9 == 0) goto Lb6
            r3.l(r9)
            r8.j(r3)
        Lb6:
            android.content.res.ColorStateList r9 = r8.j0
            android.graphics.PorterDuff$Mode r1 = r8.k0
            defpackage.kj2.p(r6, r5, r9, r1)
            r8.f(r0)
            return
        Lc1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            int r0 = r6.getBoxBackgroundMode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The current box background mode "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " is not supported by the end icon mode "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        Le1:
            java.lang.ClassCastException r8 = defpackage.i61.j(r0)
            throw r8
    }

    public final void h(boolean r2) {
            r1 = this;
            boolean r0 = r1.d()
            if (r0 == r2) goto L1c
            if (r2 == 0) goto La
            r2 = 0
            goto Lc
        La:
            r2 = 8
        Lc:
            com.google.android.material.internal.CheckableImageButton r0 = r1.f0
            r0.setVisibility(r2)
            r1.k()
            r1.m()
            com.google.android.material.textfield.TextInputLayout r1 = r1.A
            r1.s()
        L1c:
            return
    }

    public final void i(android.graphics.drawable.Drawable r3) {
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.L
            r0.setImageDrawable(r3)
            r2.l()
            android.content.res.ColorStateList r3 = r2.R
            android.graphics.PorterDuff$Mode r1 = r2.d0
            com.google.android.material.textfield.TextInputLayout r2 = r2.A
            defpackage.kj2.p(r2, r0, r3, r1)
            return
    }

    public final void j(defpackage.o42 r3) {
            r2 = this;
            android.widget.EditText r0 = r2.r0
            if (r0 != 0) goto L5
            goto L23
        L5:
            android.view.View$OnFocusChangeListener r0 = r3.e()
            if (r0 == 0) goto L14
            android.widget.EditText r0 = r2.r0
            android.view.View$OnFocusChangeListener r1 = r3.e()
            r0.setOnFocusChangeListener(r1)
        L14:
            android.view.View$OnFocusChangeListener r0 = r3.g()
            if (r0 == 0) goto L23
            com.google.android.material.internal.CheckableImageButton r2 = r2.f0
            android.view.View$OnFocusChangeListener r3 = r3.g()
            r2.setOnFocusChangeListener(r3)
        L23:
            return
    }

    public final void k() {
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.f0
            int r0 = r0.getVisibility()
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L13
            boolean r0 = r4.e()
            if (r0 != 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            android.widget.FrameLayout r3 = r4.B
            r3.setVisibility(r0)
            java.lang.CharSequence r0 = r4.o0
            if (r0 == 0) goto L23
            boolean r0 = r4.q0
            if (r0 != 0) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            boolean r3 = r4.d()
            if (r3 != 0) goto L32
            boolean r3 = r4.e()
            if (r3 != 0) goto L32
            if (r0 != 0) goto L33
        L32:
            r1 = r2
        L33:
            r4.setVisibility(r1)
            return
    }

    public final void l() {
            r3 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r3.L
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            com.google.android.material.textfield.TextInputLayout r2 = r3.A
            if (r1 == 0) goto L18
            q43 r1 = r2.j0
            boolean r1 = r1.q
            if (r1 == 0) goto L18
            boolean r1 = r2.o()
            if (r1 == 0) goto L18
            r1 = 0
            goto L1a
        L18:
            r1 = 8
        L1a:
            r0.setVisibility(r1)
            r3.k()
            r3.m()
            int r3 = r3.h0
            if (r3 == 0) goto L28
            return
        L28:
            r2.s()
            return
    }

    public final void m() {
            r4 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r4.A
            android.widget.EditText r1 = r0.d0
            if (r1 != 0) goto L7
            return
        L7:
            boolean r1 = r4.d()
            if (r1 != 0) goto L1b
            boolean r1 = r4.e()
            if (r1 == 0) goto L14
            goto L1b
        L14:
            android.widget.EditText r1 = r0.d0
            int r1 = r1.getPaddingEnd()
            goto L1c
        L1b:
            r1 = 0
        L1c:
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165989(0x7f070325, float:1.794621E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r0.d0
            int r3 = r3.getPaddingTop()
            android.widget.EditText r0 = r0.d0
            int r0 = r0.getPaddingBottom()
            qs r4 = r4.p0
            r4.setPaddingRelative(r2, r3, r1, r0)
            return
    }

    public final void n() {
            r4 = this;
            qs r0 = r4.p0
            int r1 = r0.getVisibility()
            java.lang.CharSequence r2 = r4.o0
            r3 = 0
            if (r2 == 0) goto L11
            boolean r2 = r4.q0
            if (r2 != 0) goto L11
            r2 = r3
            goto L13
        L11:
            r2 = 8
        L13:
            if (r1 == r2) goto L1f
            o42 r1 = r4.b()
            if (r2 != 0) goto L1c
            r3 = 1
        L1c:
            r1.o(r3)
        L1f:
            r4.k()
            r0.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r4 = r4.A
            r4.s()
            return
    }
}
