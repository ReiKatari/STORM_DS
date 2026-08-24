package com.google.android.material.sidesheet;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends defpackage.e51 implements defpackage.r14 {
    public defpackage.ln2 a;
    public final defpackage.p24 b;
    public final android.content.res.ColorStateList c;
    public final defpackage.me6 d;
    public final defpackage.k60 e;
    public final float f;
    public final boolean g;
    public int h;
    public defpackage.ho7 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public java.lang.ref.WeakReference p;
    public java.lang.ref.WeakReference q;
    public final int r;
    public android.view.VelocityTracker s;
    public defpackage.r24 t;
    public int u;
    public final java.util.LinkedHashSet v;
    public final defpackage.h60 w;

    public SideSheetBehavior() {
            r2 = this;
            r2.<init>()
            k60 r0 = new k60
            r0.<init>(r2)
            r2.e = r0
            r0 = 1
            r2.g = r0
            r0 = 5
            r2.h = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r2.k = r0
            r0 = -1
            r2.r = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.v = r0
            h60 r0 = new h60
            r1 = 1
            r0.<init>(r2, r1)
            r2.w = r0
            return
    }

    public SideSheetBehavior(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>()
            k60 r0 = new k60
            r0.<init>(r6)
            r6.e = r0
            r0 = 1
            r6.g = r0
            r1 = 5
            r6.h = r1
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r6.k = r2
            r2 = -1
            r6.r = r2
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r6.v = r3
            h60 r3 = new h60
            r3.<init>(r6, r0)
            r6.w = r3
            int[] r3 = defpackage.a75.z
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r3)
            r4 = 3
            boolean r5 = r3.hasValue(r4)
            if (r5 == 0) goto L39
            android.content.res.ColorStateList r4 = defpackage.np2.S(r7, r3, r4)
            r6.c = r4
        L39:
            r4 = 6
            boolean r4 = r3.hasValue(r4)
            if (r4 == 0) goto L4e
            r4 = 0
            r5 = 2132018305(0x7f140481, float:1.9674913E38)
            le6 r8 = defpackage.me6.b(r7, r8, r4, r5)
            me6 r8 = r8.a()
            r6.d = r8
        L4e:
            boolean r8 = r3.hasValue(r1)
            if (r8 == 0) goto L79
            int r8 = r3.getResourceId(r1, r2)
            r6.r = r8
            java.lang.ref.WeakReference r1 = r6.q
            if (r1 == 0) goto L61
            r1.clear()
        L61:
            r1 = 0
            r6.q = r1
            java.lang.ref.WeakReference r1 = r6.p
            if (r1 == 0) goto L79
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r8 == r2) goto L79
            boolean r8 = r1.isLaidOut()
            if (r8 == 0) goto L79
            r1.requestLayout()
        L79:
            me6 r8 = r6.d
            if (r8 != 0) goto L7e
            goto La8
        L7e:
            p24 r1 = new p24
            r1.<init>(r8)
            r6.b = r1
            r1.k(r7)
            android.content.res.ColorStateList r8 = r6.c
            if (r8 == 0) goto L92
            p24 r1 = r6.b
            r1.n(r8)
            goto La8
        L92:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r1.resolveAttribute(r2, r8, r0)
            p24 r1 = r6.b
            int r8 = r8.data
            r1.setTint(r8)
        La8:
            r8 = 2
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r3.getDimension(r8, r1)
            r6.f = r8
            r8 = 4
            boolean r8 = r3.getBoolean(r8, r0)
            r6.g = r8
            r3.recycle()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r7)
            r6.getScaledMaximumFlingVelocity()
            return
    }

    @Override // defpackage.r14
    public final void a() {
            r12 = this;
            r24 r0 = r12.t
            if (r0 != 0) goto L5
            return
        L5:
            b00 r1 = r0.f
            r2 = 0
            r0.f = r2
            r3 = 5
            if (r1 == 0) goto Lbb
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 >= r5) goto L15
            goto Lbb
        L15:
            ln2 r4 = r12.a
            r5 = 3
            if (r4 == 0) goto L22
            int r4 = r4.B()
            if (r4 != 0) goto L21
            goto L22
        L21:
            r3 = r5
        L22:
            s7 r4 = new s7
            r6 = 7
            r4.<init>(r12, r6)
            java.lang.ref.WeakReference r6 = r12.q
            if (r6 == 0) goto L33
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L34
        L33:
            r6 = r2
        L34:
            if (r6 != 0) goto L37
            goto L4c
        L37:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r7 != 0) goto L40
            goto L4c
        L40:
            ln2 r2 = r12.a
            int r2 = r2.s(r7)
            nh6 r8 = new nh6
            r8.<init>(r12, r7, r2, r6)
            r2 = r8
        L4c:
            android.view.View r12 = r0.b
            int r6 = r1.d
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L56
            r6 = r7
            goto L57
        L56:
            r6 = r8
        L57:
            int r9 = r12.getLayoutDirection()
            int r9 = android.view.Gravity.getAbsoluteGravity(r3, r9)
            r9 = r9 & r5
            if (r9 != r5) goto L64
            r5 = r7
            goto L65
        L64:
            r5 = r8
        L65:
            int r9 = r12.getWidth()
            float r9 = (float) r9
            float r10 = r12.getScaleX()
            float r10 = r10 * r9
            android.view.ViewGroup$LayoutParams r9 = r12.getLayoutParams()
            boolean r11 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L81
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r5 == 0) goto L7e
            int r9 = r9.leftMargin
            goto L82
        L7e:
            int r9 = r9.rightMargin
            goto L82
        L81:
            r9 = r8
        L82:
            float r9 = (float) r9
            float r10 = r10 + r9
            android.util.Property r9 = android.view.View.TRANSLATION_X
            if (r5 == 0) goto L89
            float r10 = -r10
        L89:
            float[] r5 = new float[r7]
            r5[r8] = r10
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r12, r9, r5)
            if (r2 == 0) goto L96
            r12.addUpdateListener(r2)
        L96:
            q92 r2 = new q92
            r2.<init>(r7)
            r12.setInterpolator(r2)
            int r2 = r0.c
            int r5 = r0.d
            float r1 = r1.c
            int r1 = defpackage.vo.c(r1, r2, r5)
            long r1 = (long) r1
            r12.setDuration(r1)
            q24 r1 = new q24
            r1.<init>(r0, r6, r3)
            r12.addListener(r1)
            r12.addListener(r4)
            r12.start()
            return
        Lbb:
            r12.v(r3)
            return
    }

    @Override // defpackage.r14
    public final void b(defpackage.b00 r5) {
            r4 = this;
            r24 r0 = r4.t
            if (r0 != 0) goto L6
            goto L72
        L6:
            ln2 r1 = r4.a
            if (r1 == 0) goto L13
            int r1 = r1.B()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 3
            goto L14
        L13:
            r1 = 5
        L14:
            b00 r2 = r0.f
            if (r2 != 0) goto L1f
            java.lang.String r2 = "MaterialBackHelper"
            java.lang.String r3 = "Must call startBackProgress() before updateBackProgress()"
            android.util.Log.w(r2, r3)
        L1f:
            b00 r2 = r0.f
            r0.f = r5
            if (r2 != 0) goto L26
            goto L32
        L26:
            int r2 = r5.d
            if (r2 != 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            float r5 = r5.c
            r0.a(r5, r1, r2)
        L32:
            java.lang.ref.WeakReference r5 = r4.p
            if (r5 == 0) goto L72
            java.lang.Object r5 = r5.get()
            if (r5 != 0) goto L3d
            goto L72
        L3d:
            java.lang.ref.WeakReference r5 = r4.p
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            java.lang.ref.WeakReference r0 = r4.q
            if (r0 == 0) goto L50
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L54
            goto L72
        L54:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 != 0) goto L5d
            goto L72
        L5d:
            int r2 = r4.l
            float r2 = (float) r2
            float r5 = r5.getScaleX()
            float r5 = r5 * r2
            int r2 = r4.o
            float r2 = (float) r2
            float r5 = r5 + r2
            int r5 = (int) r5
            ln2 r4 = r4.a
            r4.g0(r1, r5)
            r0.requestLayout()
        L72:
            return
    }

    @Override // defpackage.r14
    public final void c(defpackage.b00 r1) {
            r0 = this;
            r24 r0 = r0.t
            if (r0 != 0) goto L5
            return
        L5:
            r0.f = r1
            return
    }

    @Override // defpackage.r14
    public final void d() {
            r9 = this;
            r24 r9 = r9.t
            if (r9 != 0) goto L5
            goto L19
        L5:
            android.view.View r0 = r9.b
            b00 r1 = r9.f
            if (r1 != 0) goto L12
            java.lang.String r1 = "MaterialBackHelper"
            java.lang.String r2 = "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"
            android.util.Log.w(r1, r2)
        L12:
            b00 r1 = r9.f
            r2 = 0
            r9.f = r2
            if (r1 != 0) goto L1a
        L19:
            return
        L1a:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.util.Property r2 = android.view.View.SCALE_X
            r3 = 1
            float[] r4 = new float[r3]
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4[r5] = r6
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r2, r4)
            android.util.Property r4 = android.view.View.SCALE_Y
            float[] r7 = new float[r3]
            r7[r5] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
            r7 = 2
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            r7[r5] = r2
            r7[r3] = r4
            r1.playTogether(r7)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L66
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = r5
        L48:
            int r4 = r0.getChildCount()
            if (r2 >= r4) goto L66
            android.view.View r4 = r0.getChildAt(r2)
            android.util.Property r7 = android.view.View.SCALE_Y
            float[] r8 = new float[r3]
            r8[r5] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r7, r8)
            android.animation.Animator[] r7 = new android.animation.Animator[r3]
            r7[r5] = r4
            r1.playTogether(r7)
            int r2 = r2 + 1
            goto L48
        L66:
            int r9 = r9.e
            long r2 = (long) r9
            r1.setDuration(r2)
            r1.start()
            return
    }

    @Override // defpackage.e51
    public final void g(defpackage.h51 r1) {
            r0 = this;
            r1 = 0
            r0.p = r1
            r0.i = r1
            r0.t = r1
            return
    }

    @Override // defpackage.e51
    public final void i() {
            r1 = this;
            r0 = 0
            r1.p = r0
            r1.i = r0
            r1.t = r0
            return
    }

    @Override // defpackage.e51
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto Le
            java.lang.CharSequence r3 = defpackage.ao7.f(r4)
            if (r3 == 0) goto L57
        Le:
            boolean r3 = r2.g
            if (r3 == 0) goto L57
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L22
            android.view.VelocityTracker r4 = r2.s
            if (r4 == 0) goto L22
            r4.recycle()
            r4 = 0
            r2.s = r4
        L22:
            android.view.VelocityTracker r4 = r2.s
            if (r4 != 0) goto L2c
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.s = r4
        L2c:
            android.view.VelocityTracker r4 = r2.s
            r4.addMovement(r5)
            if (r3 == 0) goto L40
            if (r3 == r0) goto L39
            r4 = 3
            if (r3 == r4) goto L39
            goto L47
        L39:
            boolean r3 = r2.j
            if (r3 == 0) goto L47
            r2.j = r1
            return r1
        L40:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.u = r3
        L47:
            boolean r3 = r2.j
            if (r3 != 0) goto L56
            ho7 r2 = r2.i
            if (r2 == 0) goto L56
            boolean r2 = r2.p(r5)
            if (r2 == 0) goto L56
            return r0
        L56:
            return r1
        L57:
            r2.j = r0
            return r1
    }

    @Override // defpackage.e51
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
            r10 = this;
            boolean r0 = r11.getFitsSystemWindows()
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r12.getFitsSystemWindows()
            if (r0 != 0) goto L10
            r12.setFitsSystemWindows(r1)
        L10:
            java.lang.ref.WeakReference r0 = r10.p
            p24 r2 = r10.b
            r3 = 5
            r4 = 0
            if (r0 != 0) goto L74
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            r10.p = r0
            r24 r0 = new r24
            r0.<init>(r12)
            r10.t = r0
            if (r2 == 0) goto L3b
            r12.setBackground(r2)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r10.f
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L37
            float r5 = r12.getElevation()
        L37:
            r2.m(r5)
            goto L44
        L3b:
            android.content.res.ColorStateList r0 = r10.c
            if (r0 == 0) goto L44
            java.util.WeakHashMap r5 = defpackage.ao7.a
            r12.setBackgroundTintList(r0)
        L44:
            int r0 = r10.h
            if (r0 != r3) goto L4a
            r0 = 4
            goto L4b
        L4a:
            r0 = r4
        L4b:
            int r5 = r12.getVisibility()
            if (r5 == r0) goto L54
            r12.setVisibility(r0)
        L54:
            r10.z()
            int r0 = r12.getImportantForAccessibility()
            if (r0 != 0) goto L60
            r12.setImportantForAccessibility(r1)
        L60:
            java.lang.CharSequence r0 = defpackage.ao7.f(r12)
            if (r0 != 0) goto L74
            android.content.res.Resources r0 = r12.getResources()
            r5 = 2131952659(0x7f130413, float:1.9541767E38)
            java.lang.String r0 = r0.getString(r5)
            defpackage.ao7.o(r12, r0)
        L74:
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            h51 r0 = (defpackage.h51) r0
            int r0 = r0.c
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r13)
            r5 = 3
            if (r0 != r5) goto L85
            r0 = r1
            goto L86
        L85:
            r0 = r4
        L86:
            ln2 r6 = r10.a
            if (r6 == 0) goto L90
            int r6 = r6.B()
            if (r6 == r0) goto L125
        L90:
            r6 = 0
            r7 = 0
            me6 r8 = r10.d
            if (r0 != 0) goto Ldd
            ct3 r0 = new ct3
            r0.<init>(r10, r1)
            r10.a = r0
            if (r8 == 0) goto L125
            java.lang.ref.WeakReference r0 = r10.p
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Lba
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.h51
            if (r9 == 0) goto Lba
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r6 = r0
            h51 r6 = (defpackage.h51) r6
        Lba:
            if (r6 == 0) goto Lc1
            int r0 = r6.rightMargin
            if (r0 <= 0) goto Lc1
            goto L125
        Lc1:
            le6 r0 = r8.f()
            t r6 = new t
            r6.<init>(r7)
            r0.f = r6
            t r6 = new t
            r6.<init>(r7)
            r0.g = r6
            me6 r0 = r0.a()
            if (r2 == 0) goto L125
            r2.setShapeAppearanceModel(r0)
            goto L125
        Ldd:
            if (r0 != r1) goto L1ca
            ct3 r0 = new ct3
            r0.<init>(r10, r4)
            r10.a = r0
            if (r8 == 0) goto L125
            java.lang.ref.WeakReference r0 = r10.p
            if (r0 == 0) goto L103
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L103
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            boolean r9 = r9 instanceof defpackage.h51
            if (r9 == 0) goto L103
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r6 = r0
            h51 r6 = (defpackage.h51) r6
        L103:
            if (r6 == 0) goto L10a
            int r0 = r6.leftMargin
            if (r0 <= 0) goto L10a
            goto L125
        L10a:
            le6 r0 = r8.f()
            t r6 = new t
            r6.<init>(r7)
            r0.e = r6
            t r6 = new t
            r6.<init>(r7)
            r0.h = r6
            me6 r0 = r0.a()
            if (r2 == 0) goto L125
            r2.setShapeAppearanceModel(r0)
        L125:
            ho7 r0 = r10.i
            if (r0 != 0) goto L136
            ho7 r0 = new ho7
            android.content.Context r2 = r11.getContext()
            h60 r6 = r10.w
            r0.<init>(r2, r11, r6)
            r10.i = r0
        L136:
            ln2 r0 = r10.a
            int r0 = r0.y(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.m = r13
            ln2 r13 = r10.a
            int r13 = r13.z(r11)
            r10.n = r13
            int r13 = r12.getWidth()
            r10.l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L162
            ln2 r2 = r10.a
            int r13 = r2.i(r13)
            goto L163
        L162:
            r13 = r4
        L163:
            r10.o = r13
            int r13 = r10.h
            if (r13 == r1) goto L18f
            r2 = 2
            if (r13 == r2) goto L18f
            if (r13 == r5) goto L18d
            if (r13 != r3) goto L177
            ln2 r13 = r10.a
            int r13 = r13.v()
            goto L197
        L177:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            int r10 = r10.h
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L18d:
            r13 = r4
            goto L197
        L18f:
            ln2 r13 = r10.a
            int r13 = r13.y(r12)
            int r13 = r0 - r13
        L197:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r12.offsetLeftAndRight(r13)
            java.lang.ref.WeakReference r12 = r10.q
            if (r12 != 0) goto L1b2
            r12 = -1
            int r13 = r10.r
            if (r13 == r12) goto L1b2
            android.view.View r11 = r11.findViewById(r13)
            if (r11 == 0) goto L1b2
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.q = r12
        L1b2:
            java.util.LinkedHashSet r10 = r10.v
            java.util.Iterator r10 = r10.iterator()
        L1b8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1c9
            java.lang.Object r11 = r10.next()
            if (r11 != 0) goto L1c5
            goto L1b8
        L1c5:
            defpackage.u34.a()
            return r4
        L1c9:
            return r1
        L1ca:
            java.lang.String r10 = "Invalid sheet edge position value: "
            java.lang.String r11 = ". Must be 0 or 1."
            java.lang.String r10 = defpackage.lb1.k(r10, r0, r11)
            defpackage.i.h(r10)
            return r4
    }

    @Override // defpackage.e51
    public final boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5, int r6, int r7) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r2.leftMargin
            int r1 = r1 + r0
            int r0 = r2.rightMargin
            int r1 = r1 + r0
            int r1 = r1 + r6
            int r6 = r2.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r1, r6)
            int r6 = r3.getPaddingTop()
            int r3 = r3.getPaddingBottom()
            int r3 = r3 + r6
            int r6 = r2.topMargin
            int r3 = r3 + r6
            int r6 = r2.bottomMargin
            int r3 = r3 + r6
            int r2 = r2.height
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r7, r3, r2)
            r4.measure(r5, r2)
            r2 = 1
            return r2
    }

    @Override // defpackage.e51
    public final void q(android.view.View r1, android.os.Parcelable r2) {
            r0 = this;
            oh6 r2 = (defpackage.oh6) r2
            int r1 = r2.L
            r2 = 1
            if (r1 == r2) goto La
            r2 = 2
            if (r1 != r2) goto Lb
        La:
            r1 = 5
        Lb:
            r0.h = r1
            return
    }

    @Override // defpackage.e51
    public final android.os.Parcelable r(android.view.View r2) {
            r1 = this;
            oh6 r2 = new oh6
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // defpackage.e51
    public final boolean u(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            boolean r0 = r5.isShown()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r6.getActionMasked()
            int r1 = r4.h
            r2 = 1
            if (r1 != r2) goto L14
            if (r0 != 0) goto L14
            return r2
        L14:
            boolean r1 = r4.x()
            if (r1 == 0) goto L1f
            ho7 r1 = r4.i
            r1.j(r6)
        L1f:
            if (r0 != 0) goto L2b
            android.view.VelocityTracker r1 = r4.s
            if (r1 == 0) goto L2b
            r1.recycle()
            r1 = 0
            r4.s = r1
        L2b:
            android.view.VelocityTracker r1 = r4.s
            if (r1 != 0) goto L35
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r4.s = r1
        L35:
            android.view.VelocityTracker r1 = r4.s
            r1.addMovement(r6)
            boolean r1 = r4.x()
            if (r1 == 0) goto L6e
            r1 = 2
            if (r0 != r1) goto L6e
            boolean r0 = r4.j
            if (r0 != 0) goto L6e
            boolean r0 = r4.x()
            if (r0 != 0) goto L4e
            goto L6e
        L4e:
            int r0 = r4.u
            float r0 = (float) r0
            float r1 = r6.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            ho7 r1 = r4.i
            int r3 = r1.b
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6e
            int r0 = r6.getActionIndex()
            int r6 = r6.getPointerId(r0)
            r1.b(r5, r6)
        L6e:
            boolean r4 = r4.j
            r4 = r4 ^ r2
            return r4
    }

    public final void v(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L3e
            r1 = 2
            if (r4 != r1) goto L7
            goto L3e
        L7:
            java.lang.ref.WeakReference r0 = r3.p
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.lang.ref.WeakReference r0 = r3.p
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            om r1 = new om
            r2 = 6
            r1.<init>(r3, r4, r2)
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L36
            boolean r3 = r3.isLayoutRequested()
            if (r3 == 0) goto L36
            boolean r3 = r0.isAttachedToWindow()
            if (r3 == 0) goto L36
            r0.post(r1)
            return
        L36:
            r1.run()
            return
        L3a:
            r3.w(r4)
            return
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "STATE_"
            r1.<init>(r2)
            if (r4 != r0) goto L4c
            java.lang.String r4 = "DRAGGING"
            goto L4e
        L4c:
            java.lang.String r4 = "SETTLING"
        L4e:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = defpackage.i61.n(r1, r4, r0)
            r3.<init>(r4)
            throw r3
    }

    public final void w(int r3) {
            r2 = this;
            int r0 = r2.h
            if (r0 != r3) goto L5
            goto L16
        L5:
            r2.h = r3
            r0 = 3
            r1 = 5
            java.lang.ref.WeakReference r3 = r2.p
            if (r3 != 0) goto Le
            goto L16
        Le:
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L17
        L16:
            return
        L17:
            int r0 = r2.h
            if (r0 != r1) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r3.getVisibility()
            if (r1 == r0) goto L27
            r3.setVisibility(r0)
        L27:
            java.util.LinkedHashSet r3 = r2.v
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L37
            r2.z()
            return
        L37:
            java.lang.ClassCastException r2 = defpackage.i61.j(r3)
            throw r2
    }

    public final boolean x() {
            r2 = this;
            ho7 r0 = r2.i
            if (r0 == 0) goto Le
            boolean r0 = r2.g
            r1 = 1
            if (r0 != 0) goto Ld
            int r2 = r2.h
            if (r2 != r1) goto Le
        Ld:
            return r1
        Le:
            r2 = 0
            return r2
    }

    public final void y(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            ln2 r0 = r2.a
            int r0 = r0.v()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.lb1.g(r4, r2)
            defpackage.i.h(r2)
            return
        L17:
            ln2 r0 = r2.a
            int r0 = r0.u()
        L1d:
            ho7 r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.w(r3)
            k60 r2 = r2.e
            r2.a(r4)
            return
        L55:
            r2.w(r4)
            return
    }

    public final void z() {
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.p
            if (r0 != 0) goto L5
            goto L3d
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L3d
        Le:
            r1 = 262144(0x40000, float:3.67342E-40)
            defpackage.ao7.k(r0, r1)
            r1 = 0
            defpackage.ao7.i(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ao7.k(r0, r2)
            defpackage.ao7.i(r0, r1)
            int r1 = r4.h
            r2 = 5
            if (r1 == r2) goto L2e
            p2 r1 = defpackage.p2.l
            mh6 r3 = new mh6
            r3.<init>(r4, r2)
            defpackage.ao7.l(r0, r1, r3)
        L2e:
            int r1 = r4.h
            r2 = 3
            if (r1 == r2) goto L3d
            p2 r1 = defpackage.p2.j
            mh6 r3 = new mh6
            r3.<init>(r4, r2)
            defpackage.ao7.l(r0, r1, r3)
        L3d:
            return
    }
}
