package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k24  reason: default package */
/* loaded from: classes.dex */
public class k24<S> extends androidx.fragment.app.i {
    public final java.util.LinkedHashSet A;
    public final java.util.LinkedHashSet B;
    public int L;
    public defpackage.xw4 R;
    public defpackage.fb0 X;
    public defpackage.f24 Y;
    public int Z;
    public java.lang.CharSequence d0;
    public boolean e0;
    public int f0;
    public int g0;
    public java.lang.CharSequence h0;
    public int i0;
    public java.lang.CharSequence j0;
    public int k0;
    public java.lang.CharSequence l0;
    public int m0;
    public java.lang.CharSequence n0;
    public android.widget.TextView o0;
    public com.google.android.material.internal.CheckableImageButton p0;
    public defpackage.p24 q0;
    public boolean r0;
    public java.lang.CharSequence s0;
    public java.lang.CharSequence t0;

    public k24() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.A = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.B = r0
            return
    }

    public static int j(android.content.Context r6) {
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131166043(0x7f07035b, float:1.794632E38)
            int r0 = r6.getDimensionPixelOffset(r0)
            java.util.Calendar r1 = defpackage.uj7.b()
            r2 = 5
            r3 = 1
            r1.set(r2, r3)
            java.util.Calendar r1 = defpackage.uj7.a(r1)
            r4 = 2
            r1.get(r4)
            r1.get(r3)
            r5 = 7
            int r5 = r1.getMaximum(r5)
            r1.getActualMaximum(r2)
            r1.getTimeInMillis()
            r1 = 2131166049(0x7f070361, float:1.7946332E38)
            int r1 = r6.getDimensionPixelSize(r1)
            r2 = 2131166063(0x7f07036f, float:1.794636E38)
            int r6 = r6.getDimensionPixelOffset(r2)
            int r0 = r0 * r4
            int r1 = r1 * r5
            int r1 = r1 + r0
            int r5 = r5 - r3
            int r5 = r5 * r6
            int r5 = r5 + r1
            return r5
    }

    public static boolean k(android.content.Context r2, int r3) {
            java.lang.Class<f24> r0 = defpackage.f24.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969456(0x7f040370, float:1.7547594E38)
            android.util.TypedValue r0 = defpackage.qo2.O(r2, r1, r0)
            int r0 = r0.data
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r0, r3)
            r3 = 0
            boolean r3 = r2.getBoolean(r3, r3)
            r2.recycle()
            return r3
    }

    public final void i() {
            r1 = this;
            android.os.Bundle r1 = r1.getArguments()
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            if (r1 != 0) goto Ld
            return
        Ld:
            defpackage.u34.a()
            return
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r2) {
            r1 = this;
            java.util.LinkedHashSet r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            android.content.DialogInterface$OnCancelListener r0 = (android.content.DialogInterface.OnCancelListener) r0
            r0.onCancel(r2)
            goto L6
        L16:
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            if (r4 != 0) goto L9
            android.os.Bundle r4 = r3.getArguments()
        L9:
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r0 = r4.getInt(r0)
            r3.L = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            if (r0 != 0) goto Lb4
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            fb0 r0 = (defpackage.fb0) r0
            r3.X = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.Z = r0
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.d0 = r0
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r0 = r4.getInt(r0)
            r3.f0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.g0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.h0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.i0 = r0
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.j0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.k0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.l0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r0 = r4.getInt(r0)
            r3.m0 = r0
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r4 = r4.getCharSequence(r0)
            r3.n0 = r4
            java.lang.CharSequence r4 = r3.d0
            if (r4 == 0) goto L88
            goto L96
        L88:
            android.content.Context r4 = r3.requireContext()
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r3.Z
            java.lang.CharSequence r4 = r4.getText(r0)
        L96:
            r3.s0 = r4
            if (r4 == 0) goto Lac
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "\n"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r1)
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto Lad
            r4 = 0
            r4 = r0[r4]
            goto Lad
        Lac:
            r4 = 0
        Lad:
            r3.t0 = r4
            return
        Lb0:
            defpackage.u34.a()
            return
        Lb4:
            defpackage.u34.a()
            return
    }

    @Override // androidx.fragment.app.i
    public final android.app.Dialog onCreateDialog(android.os.Bundle r6) {
            r5 = this;
            android.app.Dialog r6 = new android.app.Dialog
            android.content.Context r0 = r5.requireContext()
            r5.requireContext()
            int r1 = r5.L
            r2 = 0
            if (r1 == 0) goto L5a
            r6.<init>(r0, r1)
            android.content.Context r0 = r6.getContext()
            r1 = 16843277(0x101020d, float:2.369503E-38)
            boolean r1 = k(r0, r1)
            r5.e0 = r1
            p24 r1 = new p24
            r3 = 2130969456(0x7f040370, float:1.7547594E38)
            r4 = 2132018393(0x7f1404d9, float:1.9675091E38)
            r1.<init>(r0, r2, r3, r4)
            r5.q0 = r1
            int[] r1 = defpackage.a75.m
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1, r3, r4)
            r2 = 1
            r3 = 0
            int r2 = r1.getColor(r2, r3)
            r1.recycle()
            p24 r1 = r5.q0
            r1.k(r0)
            p24 r0 = r5.q0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r0.n(r1)
            p24 r5 = r5.q0
            android.view.Window r0 = r6.getWindow()
            android.view.View r0 = r0.getDecorView()
            float r0 = r0.getElevation()
            r5.m(r0)
            return r6
        L5a:
            r5.i()
            throw r2
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
            r5 = this;
            boolean r8 = r5.e0
            if (r8 == 0) goto L8
            r8 = 2131624054(0x7f0e0076, float:1.8875277E38)
            goto Lb
        L8:
            r8 = 2131624053(0x7f0e0075, float:1.8875275E38)
        Lb:
            android.view.View r6 = r6.inflate(r8, r7)
            android.content.Context r7 = r6.getContext()
            boolean r8 = r5.e0
            if (r8 == 0) goto L2c
            r8 = 2131427729(0x7f0b0191, float:1.8477082E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = j(r7)
            r2 = -2
            r0.<init>(r1, r2)
            r8.setLayoutParams(r0)
            goto L40
        L2c:
            r8 = 2131427730(0x7f0b0192, float:1.8477084E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = j(r7)
            r2 = -1
            r0.<init>(r1, r2)
            r8.setLayoutParams(r0)
        L40:
            r8 = 2131427741(0x7f0b019d, float:1.8477107E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 1
            r8.setAccessibilityLiveRegion(r0)
            r8 = 2131427743(0x7f0b019f, float:1.847711E38)
            android.view.View r8 = r6.findViewById(r8)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r5.p0 = r8
            r8 = 2131427747(0x7f0b01a3, float:1.8477119E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5.o0 = r8
            com.google.android.material.internal.CheckableImageButton r8 = r5.p0
            java.lang.String r1 = "TOGGLE_BUTTON_TAG"
            r8.setTag(r1)
            com.google.android.material.internal.CheckableImageButton r8 = r5.p0
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r2}
            r3 = 2131231006(0x7f08011e, float:1.807808E38)
            android.graphics.drawable.Drawable r3 = defpackage.hf.S(r7, r3)
            r1.addState(r2, r3)
            r2 = 0
            int[] r3 = new int[r2]
            r4 = 2131231008(0x7f080120, float:1.8078085E38)
            android.graphics.drawable.Drawable r7 = defpackage.hf.S(r7, r4)
            r1.addState(r3, r7)
            r8.setImageDrawable(r1)
            com.google.android.material.internal.CheckableImageButton r7 = r5.p0
            int r8 = r5.f0
            if (r8 == 0) goto L99
            r2 = r0
        L99:
            r7.setChecked(r2)
            com.google.android.material.internal.CheckableImageButton r7 = r5.p0
            r8 = 0
            defpackage.ao7.n(r7, r8)
            com.google.android.material.internal.CheckableImageButton r7 = r5.p0
            int r1 = r5.f0
            if (r1 != r0) goto Lb4
            android.content.Context r7 = r7.getContext()
            r0 = 2131952267(0x7f13028b, float:1.9540972E38)
            java.lang.String r7 = r7.getString(r0)
            goto Lbf
        Lb4:
            android.content.Context r7 = r7.getContext()
            r0 = 2131952269(0x7f13028d, float:1.9540976E38)
            java.lang.String r7 = r7.getString(r0)
        Lbf:
            com.google.android.material.internal.CheckableImageButton r0 = r5.p0
            r0.setContentDescription(r7)
            com.google.android.material.internal.CheckableImageButton r7 = r5.p0
            hr0 r0 = new hr0
            r1 = 3
            r0.<init>(r5, r1)
            r7.setOnClickListener(r0)
            r7 = 2131427509(0x7f0b00b5, float:1.8476636E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.Button r6 = (android.widget.Button) r6
            r5.i()
            throw r8
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.LinkedHashSet r0 = r2.B
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L21
            r0.removeAllViews()
        L21:
            super.onDismiss(r3)
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r15) {
            r14 = this;
            super.onSaveInstanceState(r15)
            java.lang.String r0 = "OVERRIDE_THEME_RES_ID"
            int r1 = r14.L
            r15.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1 = 0
            r15.putParcelable(r0, r1)
            eb0 r0 = new eb0
            fb0 r2 = r14.X
            r0.<init>()
            i74 r3 = r2.A
            long r3 = r3.Y
            i74 r5 = r2.B
            long r5 = r5.Y
            i74 r7 = r2.R
            long r7 = r7.Y
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a = r7
            int r13 = r2.X
            dc1 r2 = r2.L
            f24 r7 = r14.Y
            if (r7 != 0) goto L33
            r7 = r1
            goto L35
        L33:
            i74 r7 = r7.R
        L35:
            if (r7 == 0) goto L3f
            long r7 = r7.Y
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a = r7
        L3f:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "DEEP_COPY_VALIDATOR_KEY"
            r7.putParcelable(r8, r2)
            r2 = r8
            fb0 r8 = new fb0
            i74 r9 = defpackage.i74.b(r3)
            i74 r10 = defpackage.i74.b(r5)
            android.os.Parcelable r2 = r7.getParcelable(r2)
            r11 = r2
            dc1 r11 = (defpackage.dc1) r11
            java.lang.Long r0 = r0.a
            if (r0 != 0) goto L61
            r12 = r1
            goto L6a
        L61:
            long r2 = r0.longValue()
            i74 r0 = defpackage.i74.b(r2)
            r12 = r0
        L6a:
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            r15.putParcelable(r0, r8)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            r15.putParcelable(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_RES_ID_KEY"
            int r1 = r14.Z
            r15.putInt(r0, r1)
            java.lang.String r0 = "TITLE_TEXT_KEY"
            java.lang.CharSequence r1 = r14.d0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "INPUT_MODE_KEY"
            int r1 = r14.f0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r14.g0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r14.h0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r14.i0
            r15.putInt(r0, r1)
            java.lang.String r0 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r1 = r14.j0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
            int r1 = r14.k0
            r15.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_TEXT_KEY"
            java.lang.CharSequence r1 = r14.l0
            r15.putCharSequence(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
            int r1 = r14.m0
            r15.putInt(r0, r1)
            java.lang.String r0 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
            java.lang.CharSequence r14 = r14.n0
            r15.putCharSequence(r0, r14)
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
            r13 = this;
            super.onStart()
            android.app.Dialog r0 = r13.requireDialog()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r13.e0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11e
            r1 = -1
            r0.setLayout(r1, r1)
            p24 r1 = r13.q0
            r0.setBackgroundDrawable(r1)
            boolean r1 = r13.r0
            if (r1 != 0) goto L14f
            android.view.View r1 = r13.requireView()
            r4 = 2131427596(0x7f0b010c, float:1.8476813E38)
            android.view.View r6 = r1.findViewById(r4)
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.content.res.ColorStateList r1 = defpackage.u24.r(r1)
            if (r1 == 0) goto L3c
            int r1 = r1.getDefaultColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L3d
        L3c:
            r1 = r2
        L3d:
            r4 = 0
            if (r1 == 0) goto L49
            int r5 = r1.intValue()
            if (r5 != 0) goto L47
            goto L49
        L47:
            r5 = r4
            goto L4a
        L49:
            r5 = r3
        L4a:
            android.content.Context r7 = r0.getContext()
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = defpackage.mp2.A(r7, r8, r9)
            if (r5 == 0) goto L5d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L5d:
            defpackage.kt7.a(r0, r4)
            r0.getContext()
            android.content.Context r5 = r0.getContext()
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 27
            if (r8 >= r10) goto L7b
            r10 = 16843858(0x1010452, float:2.3696658E-38)
            int r5 = defpackage.mp2.A(r5, r10, r9)
            r9 = 128(0x80, float:1.8E-43)
            int r5 = defpackage.tt0.d(r5, r9)
            goto L7c
        L7b:
            r5 = r4
        L7c:
            r0.setStatusBarColor(r4)
            r0.setNavigationBarColor(r5)
            int r1 = r1.intValue()
            boolean r1 = defpackage.mp2.L(r1)
            boolean r9 = defpackage.mp2.L(r4)
            if (r9 != 0) goto L95
            if (r1 == 0) goto L93
            goto L95
        L93:
            r1 = r4
            goto L96
        L95:
            r1 = r3
        L96:
            android.view.View r9 = r0.getDecorView()
            s35 r10 = new s35
            r10.<init>(r9)
            r9 = 26
            r11 = 30
            r12 = 35
            if (r8 < r12) goto Lad
            av7 r8 = new av7
            r8.<init>(r0, r10)
            goto Lc2
        Lad:
            if (r8 < r11) goto Lb5
            zu7 r8 = new zu7
            r8.<init>(r0, r10)
            goto Lc2
        Lb5:
            if (r8 < r9) goto Lbd
            xu7 r8 = new xu7
            r8.<init>(r0, r10)
            goto Lc2
        Lbd:
            wu7 r8 = new wu7
            r8.<init>(r0, r10)
        Lc2:
            r8.d(r1)
            boolean r1 = defpackage.mp2.L(r7)
            boolean r7 = defpackage.mp2.L(r5)
            if (r7 != 0) goto Ld3
            if (r5 != 0) goto Ld4
            if (r1 == 0) goto Ld4
        Ld3:
            r4 = r3
        Ld4:
            android.view.View r1 = r0.getDecorView()
            s35 r5 = new s35
            r5.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r12) goto Le7
            av7 r1 = new av7
            r1.<init>(r0, r5)
            goto Lfc
        Le7:
            if (r1 < r11) goto Lef
            zu7 r1 = new zu7
            r1.<init>(r0, r5)
            goto Lfc
        Lef:
            if (r1 < r9) goto Lf7
            xu7 r1 = new xu7
            r1.<init>(r0, r5)
            goto Lfc
        Lf7:
            wu7 r1 = new wu7
            r1.<init>(r0, r5)
        Lfc:
            r1.c(r4)
            int r9 = r6.getPaddingTop()
            int r8 = r6.getPaddingLeft()
            int r10 = r6.getPaddingRight()
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r7 = r0.height
            gs1 r5 = new gs1
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.WeakHashMap r0 = defpackage.ao7.a
            defpackage.sn7.c(r6, r5)
            r13.r0 = r3
            goto L14f
        L11e:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r13.getResources()
            r4 = 2131166051(0x7f070363, float:1.7946336E38)
            int r7 = r1.getDimensionPixelOffset(r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r7, r7, r7, r7)
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            p24 r6 = r13.q0
            r8 = r7
            r9 = r7
            r10 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setBackgroundDrawable(r5)
            android.view.View r0 = r0.getDecorView()
            c83 r4 = new c83
            android.app.Dialog r5 = r13.requireDialog()
            r4.<init>(r5, r1)
            r0.setOnTouchListener(r4)
        L14f:
            r13.requireContext()
            int r0 = r13.L
            if (r0 == 0) goto L1ca
            r13.i()
            fb0 r1 = r13.X
            f24 r4 = new f24
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r2)
            java.lang.String r7 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r8 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r8, r2)
            java.lang.String r8 = "CURRENT_MONTH_KEY"
            i74 r1 = r1.R
            r5.putParcelable(r8, r1)
            r4.setArguments(r5)
            r13.Y = r4
            int r1 = r13.f0
            if (r1 != r3) goto L1a6
            r13.i()
            fb0 r1 = r13.X
            s24 r4 = new s24
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r5.putParcelable(r0, r2)
            r5.putParcelable(r7, r1)
            r4.setArguments(r5)
        L1a6:
            r13.R = r4
            android.widget.TextView r0 = r13.o0
            int r1 = r13.f0
            if (r1 != r3) goto L1be
            android.content.res.Resources r1 = r13.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r3 = 2
            if (r1 != r3) goto L1be
            java.lang.CharSequence r1 = r13.t0
            goto L1c0
        L1be:
            java.lang.CharSequence r1 = r13.s0
        L1c0:
            r0.setText(r1)
            r13.i()
            r13.getContext()
            throw r2
        L1ca:
            r13.i()
            throw r2
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
            r1 = this;
            xw4 r0 = r1.R
            java.util.LinkedHashSet r0 = r0.A
            r0.clear()
            super.onStop()
            return
    }
}
