package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i24  reason: default package */
/* loaded from: classes.dex */
public final class i24 extends defpackage.nq {
    public static final int A0 = 0;
    public static final int[] x0 = null;
    public static final int[] y0 = null;
    public static final int[][] z0 = null;
    public final java.util.LinkedHashSet d0;
    public final java.util.LinkedHashSet e0;
    public android.content.res.ColorStateList f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public java.lang.CharSequence j0;
    public android.graphics.drawable.Drawable k0;
    public android.graphics.drawable.Drawable l0;
    public boolean m0;
    public android.content.res.ColorStateList n0;
    public android.content.res.ColorStateList o0;
    public android.graphics.PorterDuff.Mode p0;
    public int q0;
    public int[] r0;
    public boolean s0;
    public java.lang.CharSequence t0;
    public android.widget.CompoundButton.OnCheckedChangeListener u0;
    public final defpackage.eo v0;
    public final defpackage.g24 w0;

    static {
            r0 = 2130969815(0x7f0404d7, float:1.7548323E38)
            int[] r0 = new int[]{r0}
            defpackage.i24.x0 = r0
            r0 = 2130969814(0x7f0404d6, float:1.754832E38)
            int[] r1 = new int[]{r0}
            defpackage.i24.y0 = r1
            r1 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r1, r0}
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r1, r2}
            r4 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r1 = new int[]{r1, r4}
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r2 = new int[]{r5, r2}
            int[] r4 = new int[]{r5, r4}
            int[][] r0 = new int[][]{r0, r3, r1, r2, r4}
            defpackage.i24.z0 = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = "android"
            java.lang.String r3 = "btn_check_material_anim"
            int r0 = r0.getIdentifier(r3, r1, r2)
            defpackage.i24.A0 = r0
            return
    }

    public i24(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2132018384(0x7f1404d0, float:1.9675073E38)
            r4 = 2130968770(0x7f0400c2, float:1.7546203E38)
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r4, r0)
            r7.<init>(r8, r9, r4)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.d0 = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.e0 = r8
            android.content.Context r8 = r7.getContext()
            eo r0 = new eo
            r0.<init>(r8)
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            java.lang.ThreadLocal r2 = defpackage.sl5.a
            r2 = 2131231017(0x7f080129, float:1.8078103E38)
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r2, r8)
            r0.A = r8
            ao r1 = r0.Y
            r8.setCallback(r1)
            co r8 = new co
            android.graphics.drawable.Drawable r1 = r0.A
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r8.<init>(r1)
            r7.v0 = r0
            g24 r8 = new g24
            r8.<init>(r7)
            r7.w0 = r8
            android.content.Context r1 = r7.getContext()
            android.graphics.drawable.Drawable r8 = r7.getButtonDrawable()
            r7.k0 = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.n0 = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            r0 = 0
            int[] r6 = new int[r0]
            r5 = 2132018384(0x7f1404d0, float:1.9675073E38)
            defpackage.f04.r(r1, r9, r4, r5)
            int[] r3 = defpackage.a75.o
            r2 = r9
            defpackage.f04.s(r1, r2, r3, r4, r5, r6)
            m44 r9 = new m44
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r9.<init>(r1, r2)
            r3 = 2
            android.graphics.drawable.Drawable r3 = r9.k(r3)
            r7.l0 = r3
            android.graphics.drawable.Drawable r3 = r7.k0
            r4 = 1
            if (r3 == 0) goto Lba
            r3 = 2130969277(0x7f0402bd, float:1.7547231E38)
            boolean r3 = defpackage.qo2.N(r1, r3, r0)
            if (r3 == 0) goto Lba
            int r3 = r2.getResourceId(r0, r0)
            int r5 = r2.getResourceId(r4, r0)
            int r6 = defpackage.i24.A0
            if (r3 != r6) goto Lba
            if (r5 != 0) goto Lba
            super.setButtonDrawable(r8)
            r8 = 2131231016(0x7f080128, float:1.8078101E38)
            android.graphics.drawable.Drawable r8 = defpackage.hf.S(r1, r8)
            r7.k0 = r8
            r7.m0 = r4
            android.graphics.drawable.Drawable r8 = r7.l0
            if (r8 != 0) goto Lba
            r8 = 2131231018(0x7f08012a, float:1.8078105E38)
            android.graphics.drawable.Drawable r8 = defpackage.hf.S(r1, r8)
            r7.l0 = r8
        Lba:
            r8 = 3
            android.content.res.ColorStateList r8 = defpackage.np2.R(r1, r9, r8)
            r7.o0 = r8
            r8 = 4
            r1 = -1
            int r8 = r2.getInt(r8, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = defpackage.qo2.E(r8, r1)
            r7.p0 = r8
            r8 = 10
            boolean r8 = r2.getBoolean(r8, r0)
            r7.g0 = r8
            r8 = 6
            boolean r8 = r2.getBoolean(r8, r4)
            r7.h0 = r8
            r8 = 9
            boolean r8 = r2.getBoolean(r8, r0)
            r7.i0 = r8
            r8 = 8
            java.lang.CharSequence r8 = r2.getText(r8)
            r7.j0 = r8
            r8 = 7
            boolean r1 = r2.hasValue(r8)
            if (r1 == 0) goto Lfc
            int r8 = r2.getInt(r8, r0)
            r7.setCheckedState(r8)
        Lfc:
            r9.D()
            r7.a()
            return
    }

    private java.lang.String getButtonStateDescription() {
            r2 = this;
            int r0 = r2.q0
            r1 = 1
            if (r0 != r1) goto L11
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131952228(0x7f130264, float:1.9540893E38)
            java.lang.String r2 = r2.getString(r0)
            return r2
        L11:
            if (r0 != 0) goto L1f
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131952230(0x7f130266, float:1.9540897E38)
            java.lang.String r2 = r2.getString(r0)
            return r2
        L1f:
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131952229(0x7f130265, float:1.9540895E38)
            java.lang.String r2 = r2.getString(r0)
            return r2
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r7 = this;
            android.content.res.ColorStateList r0 = r7.f0
            if (r0 != 0) goto L49
            r0 = 2130968847(0x7f04010f, float:1.754636E38)
            int r0 = defpackage.mp2.B(r7, r0)
            r1 = 2130968850(0x7f040112, float:1.7546365E38)
            int r1 = defpackage.mp2.B(r7, r1)
            r2 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r2 = defpackage.mp2.B(r7, r2)
            r3 = 2130968867(0x7f040123, float:1.75464E38)
            int r3 = defpackage.mp2.B(r7, r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = defpackage.mp2.Q(r4, r2, r1)
            int r0 = defpackage.mp2.Q(r4, r2, r0)
            r4 = 1057635697(0x3f0a3d71, float:0.54)
            int r4 = defpackage.mp2.Q(r4, r2, r3)
            r5 = 1052938076(0x3ec28f5c, float:0.38)
            int r6 = defpackage.mp2.Q(r5, r2, r3)
            int r2 = defpackage.mp2.Q(r5, r2, r3)
            int[] r0 = new int[]{r1, r0, r4, r6, r2}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = defpackage.i24.z0
            r1.<init>(r2, r0)
            r7.f0 = r1
        L49:
            android.content.res.ColorStateList r7 = r7.f0
            return r7
    }

    private android.content.res.ColorStateList getSuperButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L10
            android.content.res.ColorStateList r1 = super.getButtonTintList()
            return r1
        L10:
            android.content.res.ColorStateList r1 = r1.getSupportButtonTintList()
            return r1
    }

    public final void a() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.k0
            android.content.res.ColorStateList r1 = r7.n0
            android.graphics.PorterDuff$Mode r2 = r7.getButtonTintMode()
            r3 = 0
            if (r0 != 0) goto Ld
            r0 = r3
            goto L18
        Ld:
            if (r1 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L18
            r0.setTintMode(r2)
        L18:
            r7.k0 = r0
            android.graphics.drawable.Drawable r0 = r7.l0
            android.content.res.ColorStateList r1 = r7.o0
            android.graphics.PorterDuff$Mode r2 = r7.p0
            if (r0 != 0) goto L24
            r0 = r3
            goto L2f
        L24:
            if (r1 == 0) goto L2f
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L2f
            r0.setTintMode(r2)
        L2f:
            r7.l0 = r0
            boolean r0 = r7.m0
            r1 = 1
            if (r0 != 0) goto L38
            goto Ld6
        L38:
            eo r0 = r7.v0
            if (r0 == 0) goto Lb8
            bo r2 = r0.B
            android.graphics.drawable.Drawable r4 = r0.A
            g24 r5 = r7.w0
            if (r4 == 0) goto L56
            android.graphics.drawable.AnimatedVectorDrawable r4 = (android.graphics.drawable.AnimatedVectorDrawable) r4
            fn r6 = r5.a
            if (r6 != 0) goto L51
            fn r6 = new fn
            r6.<init>(r5)
            r5.a = r6
        L51:
            fn r6 = r5.a
            r4.unregisterAnimationCallback(r6)
        L56:
            java.util.ArrayList r4 = r0.X
            if (r4 == 0) goto L73
            if (r5 != 0) goto L5d
            goto L73
        L5d:
            r4.remove(r5)
            java.util.ArrayList r4 = r0.X
            int r4 = r4.size()
            if (r4 != 0) goto L73
            s7 r4 = r0.R
            if (r4 == 0) goto L73
            android.animation.AnimatorSet r6 = r2.b
            r6.removeListener(r4)
            r0.R = r3
        L73:
            android.graphics.drawable.Drawable r3 = r0.A
            if (r3 == 0) goto L8a
            android.graphics.drawable.AnimatedVectorDrawable r3 = (android.graphics.drawable.AnimatedVectorDrawable) r3
            fn r2 = r5.a
            if (r2 != 0) goto L84
            fn r2 = new fn
            r2.<init>(r5)
            r5.a = r2
        L84:
            fn r2 = r5.a
            r3.registerAnimationCallback(r2)
            goto Lb8
        L8a:
            if (r5 != 0) goto L8d
            goto Lb8
        L8d:
            java.util.ArrayList r3 = r0.X
            if (r3 != 0) goto L98
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.X = r3
        L98:
            java.util.ArrayList r3 = r0.X
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto La1
            goto Lb8
        La1:
            java.util.ArrayList r3 = r0.X
            r3.add(r5)
            s7 r3 = r0.R
            if (r3 != 0) goto Lb1
            s7 r3 = new s7
            r3.<init>(r0, r1)
            r0.R = r3
        Lb1:
            android.animation.AnimatorSet r2 = r2.b
            s7 r3 = r0.R
            r2.addListener(r3)
        Lb8:
            android.graphics.drawable.Drawable r2 = r7.k0
            boolean r3 = r2 instanceof android.graphics.drawable.AnimatedStateListDrawable
            if (r3 == 0) goto Ld6
            if (r0 == 0) goto Ld6
            android.graphics.drawable.AnimatedStateListDrawable r2 = (android.graphics.drawable.AnimatedStateListDrawable) r2
            r3 = 2131427496(0x7f0b00a8, float:1.847661E38)
            r4 = 2131428036(0x7f0b02c4, float:1.8477705E38)
            r5 = 0
            r2.addTransition(r3, r4, r0, r5)
            android.graphics.drawable.Drawable r2 = r7.k0
            android.graphics.drawable.AnimatedStateListDrawable r2 = (android.graphics.drawable.AnimatedStateListDrawable) r2
            r3 = 2131427634(0x7f0b0132, float:1.847689E38)
            r2.addTransition(r3, r4, r0, r5)
        Ld6:
            android.graphics.drawable.Drawable r0 = r7.k0
            if (r0 == 0) goto Le1
            android.content.res.ColorStateList r2 = r7.n0
            if (r2 == 0) goto Le1
            r0.setTintList(r2)
        Le1:
            android.graphics.drawable.Drawable r0 = r7.l0
            if (r0 == 0) goto Lec
            android.content.res.ColorStateList r2 = r7.o0
            if (r2 == 0) goto Lec
            r0.setTintList(r2)
        Lec:
            android.graphics.drawable.Drawable r0 = r7.k0
            android.graphics.drawable.Drawable r2 = r7.l0
            if (r0 != 0) goto Lf4
            r0 = r2
            goto L14f
        Lf4:
            if (r2 != 0) goto Lf7
            goto L14f
        Lf7:
            int r3 = r2.getIntrinsicWidth()
            r4 = -1
            if (r3 == r4) goto Lff
            goto L103
        Lff:
            int r3 = r0.getIntrinsicWidth()
        L103:
            int r5 = r2.getIntrinsicHeight()
            if (r5 == r4) goto L10a
            goto L10e
        L10a:
            int r5 = r0.getIntrinsicHeight()
        L10e:
            int r4 = r0.getIntrinsicWidth()
            if (r3 > r4) goto L11b
            int r4 = r0.getIntrinsicHeight()
            if (r5 > r4) goto L11b
            goto L13d
        L11b:
            float r3 = (float) r3
            float r4 = (float) r5
            float r3 = r3 / r4
            int r4 = r0.getIntrinsicWidth()
            float r4 = (float) r4
            int r5 = r0.getIntrinsicHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L136
            int r4 = r0.getIntrinsicWidth()
            float r5 = (float) r4
            float r5 = r5 / r3
            int r5 = (int) r5
            r3 = r4
            goto L13d
        L136:
            int r5 = r0.getIntrinsicHeight()
            float r4 = (float) r5
            float r3 = r3 * r4
            int r3 = (int) r3
        L13d:
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r2}
            r4.<init>(r0)
            r4.setLayerSize(r1, r3, r5)
            r0 = 17
            r4.setLayerGravity(r1, r0)
            r0 = r4
        L14f:
            super.setButtonDrawable(r0)
            r7.refreshDrawableState()
            return
    }

    @Override // android.widget.CompoundButton
    public android.graphics.drawable.Drawable getButtonDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.k0
            return r0
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.l0
            return r0
    }

    public android.content.res.ColorStateList getButtonIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.o0
            return r0
    }

    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.p0
            return r0
    }

    @Override // android.widget.CompoundButton
    public android.content.res.ColorStateList getButtonTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.n0
            return r0
    }

    public int getCheckedState() {
            r0 = this;
            int r0 = r0.q0
            return r0
    }

    public java.lang.CharSequence getErrorAccessibilityLabel() {
            r0 = this;
            java.lang.CharSequence r0 = r0.j0
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
            r1 = this;
            int r1 = r1.q0
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.g0
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = r1.n0
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.o0
            if (r0 != 0) goto L13
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L13:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r4) {
            r3 = this;
            r0 = 2
            int r4 = r4 + r0
            int[] r4 = super.onCreateDrawableState(r4)
            int r1 = r3.getCheckedState()
            if (r1 != r0) goto L11
            int[] r0 = defpackage.i24.x0
            android.view.View.mergeDrawableStates(r4, r0)
        L11:
            boolean r0 = r3.i0
            if (r0 == 0) goto L1a
            int[] r0 = defpackage.i24.y0
            android.view.View.mergeDrawableStates(r4, r0)
        L1a:
            r0 = 0
        L1b:
            int r1 = r4.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L35
            r1 = r4[r0]
            if (r1 != r2) goto L27
            r1 = r4
            goto L3f
        L27:
            if (r1 != 0) goto L32
            java.lang.Object r1 = r4.clone()
            int[] r1 = (int[]) r1
            r1[r0] = r2
            goto L3f
        L32:
            int r0 = r0 + 1
            goto L1b
        L35:
            int r0 = r4.length
            int r0 = r0 + 1
            int[] r1 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            r1[r0] = r2
        L3f:
            r3.r0 = r1
            return r4
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.h0
            if (r0 == 0) goto L53
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L53
            android.graphics.drawable.Drawable r0 = r5.getButtonDrawable()
            if (r0 == 0) goto L53
            int r1 = r5.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L1c
            r2 = -1
        L1c:
            int r1 = r5.getWidth()
            int r3 = r0.getIntrinsicWidth()
            int r1 = r1 - r3
            int r1 = r1 / 2
            int r1 = r1 * r2
            int r2 = r6.save()
            float r3 = (float) r1
            r4 = 0
            r6.translate(r3, r4)
            super.onDraw(r6)
            r6.restoreToCount(r2)
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 == 0) goto L52
            android.graphics.Rect r6 = r0.getBounds()
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            int r0 = r6.left
            int r0 = r0 + r1
            int r2 = r6.top
            int r3 = r6.right
            int r3 = r3 + r1
            int r6 = r6.bottom
            r5.setHotspotBounds(r0, r2, r3, r6)
        L52:
            return
        L53:
            super.onDraw(r6)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            if (r3 != 0) goto L6
            goto L27
        L6:
            boolean r0 = r2.i0
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.getText()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r2 = r2.j0
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.setText(r2)
        L27:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.h24
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            h24 r2 = (defpackage.h24) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r2 = r2.A
            r1.setCheckedState(r2)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            h24 r1 = new h24
            r1.<init>(r0)
            int r2 = r2.getCheckedState()
            r1.A = r2
            return r1
    }

    @Override // defpackage.nq, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // defpackage.nq, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.k0 = r1
            r1 = 0
            r0.m0 = r1
            r0.a()
            return
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.l0 = r1
            r0.a()
            return
    }

    public void setButtonIconDrawableResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r0, r2)
            r1.setButtonIconDrawable(r2)
            return
    }

    public void setButtonIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.o0
            if (r0 != r2) goto L5
            return
        L5:
            r1.o0 = r2
            r1.a()
            return
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.p0
            if (r0 != r2) goto L5
            return
        L5:
            r1.p0 = r2
            r1.a()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n0
            if (r0 != r2) goto L5
            return
        L5:
            r1.n0 = r2
            r1.a()
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setSupportButtonTintMode(r1)
            r0.a()
            return
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
            r0 = this;
            r0.h0 = r1
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
            r0 = this;
            r0.setCheckedState(r1)
            return
    }

    public void setCheckedState(int r4) {
            r3 = this;
            int r0 = r3.q0
            if (r0 == r4) goto L66
            r3.q0 = r4
            r0 = 0
            r1 = 1
            if (r4 != r1) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = r0
        Ld:
            super.setChecked(r4)
            r3.refreshDrawableState()
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r4 < r2) goto L24
            java.lang.CharSequence r2 = r3.t0
            if (r2 != 0) goto L24
            java.lang.String r2 = r3.getButtonStateDescription()
            super.setStateDescription(r2)
        L24:
            boolean r2 = r3.s0
            if (r2 == 0) goto L29
            goto L66
        L29:
            r3.s0 = r1
            java.util.LinkedHashSet r1 = r3.e0
            if (r1 == 0) goto L3f
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3a
            goto L3f
        L3a:
            java.lang.ClassCastException r3 = defpackage.i61.j(r1)
            throw r3
        L3f:
            int r1 = r3.q0
            r2 = 2
            if (r1 == r2) goto L4f
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r3.u0
            if (r1 == 0) goto L4f
            boolean r2 = r3.isChecked()
            r1.onCheckedChanged(r3, r2)
        L4f:
            r1 = 26
            if (r4 < r1) goto L64
            android.content.Context r4 = r3.getContext()
            java.lang.Class<android.view.autofill.AutofillManager> r1 = android.view.autofill.AutofillManager.class
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            if (r4 == 0) goto L64
            r4.notifyValueChanged(r3)
        L64:
            r3.s0 = r0
        L66:
            return
    }

    public void setErrorAccessibilityLabel(java.lang.CharSequence r1) {
            r0 = this;
            r0.j0 = r1
            return
    }

    public void setErrorAccessibilityLabelResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r2 = r0.getText(r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setErrorAccessibilityLabel(r2)
            return
    }

    public void setErrorShown(boolean r2) {
            r1 = this;
            boolean r0 = r1.i0
            if (r0 != r2) goto L5
            goto L16
        L5:
            r1.i0 = r2
            r1.refreshDrawableState()
            java.util.LinkedHashSet r1 = r1.d0
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L17
        L16:
            return
        L17:
            java.lang.ClassCastException r1 = defpackage.i61.j(r1)
            throw r1
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener r1) {
            r0 = this;
            r0.u0 = r1
            return
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(java.lang.CharSequence r3) {
            r2 = this;
            r2.t0 = r3
            if (r3 != 0) goto L14
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            if (r3 != 0) goto L13
            java.lang.String r3 = r2.getButtonStateDescription()
            super.setStateDescription(r3)
        L13:
            return
        L14:
            super.setStateDescription(r3)
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.g0 = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            r0.setButtonTintList(r1)
            return
        Lc:
            r1 = 0
            r0.setButtonTintList(r1)
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
}
