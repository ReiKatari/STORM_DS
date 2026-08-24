package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public final class ac extends defpackage.hr implements android.content.DialogInterface {
    public final defpackage.yb Z;

    public ac(android.view.ContextThemeWrapper r2, int r3) {
            r1 = this;
            int r3 = i(r2, r3)
            r1.<init>(r2, r3)
            yb r2 = new yb
            android.content.Context r3 = r1.getContext()
            android.view.Window r0 = r1.getWindow()
            r2.<init>(r3, r1, r0)
            r1.Z = r2
            return
    }

    public static int i(android.content.Context r2, int r3) {
            int r0 = r3 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 < r1) goto L8
            return r3
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r0 = 2130968624(0x7f040030, float:1.7545907E38)
            r2.resolveAttribute(r0, r3, r1)
            int r2 = r3.resourceId
            return r2
    }

    public final android.widget.Button h(int r2) {
            r1 = this;
            r0 = -3
            yb r1 = r1.Z
            if (r2 == r0) goto L16
            r0 = -2
            if (r2 == r0) goto L13
            r0 = -1
            if (r2 == r0) goto L10
            r1.getClass()
            r1 = 0
            return r1
        L10:
            android.widget.Button r1 = r1.j
            return r1
        L13:
            android.widget.Button r1 = r1.m
            return r1
        L16:
            android.widget.Button r1 = r1.p
            return r1
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
    public final void onCreate(android.os.Bundle r17) {
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            yb r0 = r0.Z
            int r1 = r0.A
            ac r2 = r0.b
            r2.setContentView(r1)
            android.content.Context r1 = r0.a
            android.view.Window r2 = r0.c
            r3 = 2131427799(0x7f0b01d7, float:1.8477224E38)
            android.view.View r3 = r2.findViewById(r3)
            r4 = 2131428018(0x7f0b02b2, float:1.8477669E38)
            android.view.View r5 = r3.findViewById(r4)
            r6 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r7 = r3.findViewById(r6)
            r8 = 2131427469(0x7f0b008d, float:1.8476555E38)
            android.view.View r9 = r3.findViewById(r8)
            r10 = 2131427524(0x7f0b00c4, float:1.8476667E38)
            android.view.View r3 = r3.findViewById(r10)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r10 = r0.g
            r12 = 0
            if (r10 == 0) goto L3d
            goto L4d
        L3d:
            int r10 = r0.h
            if (r10 == 0) goto L4c
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r1)
            int r13 = r0.h
            android.view.View r10 = r10.inflate(r13, r3, r12)
            goto L4d
        L4c:
            r10 = 0
        L4d:
            if (r10 == 0) goto L51
            r14 = 1
            goto L52
        L51:
            r14 = r12
        L52:
            if (r14 == 0) goto L5a
            boolean r15 = defpackage.yb.a(r10)
            if (r15 != 0) goto L5f
        L5a:
            r15 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r15, r15)
        L5f:
            r15 = 8
            r11 = -1
            if (r14 == 0) goto L8a
            r14 = 2131427523(0x7f0b00c3, float:1.8476665E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r11, r11)
            r14.addView(r10, r13)
            boolean r10 = r0.i
            if (r10 == 0) goto L7c
            r14.setPadding(r12, r12, r12, r12)
        L7c:
            androidx.appcompat.app.AlertController$RecycleListView r10 = r0.f
            if (r10 == 0) goto L8d
            android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
            cv3 r10 = (defpackage.cv3) r10
            r13 = 0
            r10.weight = r13
            goto L8d
        L8a:
            r3.setVisibility(r15)
        L8d:
            android.view.View r4 = r3.findViewById(r4)
            android.view.View r6 = r3.findViewById(r6)
            android.view.View r8 = r3.findViewById(r8)
            android.view.ViewGroup r4 = defpackage.yb.b(r4, r5)
            android.view.ViewGroup r5 = defpackage.yb.b(r6, r7)
            android.view.ViewGroup r6 = defpackage.yb.b(r8, r9)
            r7 = 2131427859(0x7f0b0213, float:1.8477346E38)
            android.view.View r7 = r2.findViewById(r7)
            androidx.core.widget.NestedScrollView r7 = (androidx.core.widget.NestedScrollView) r7
            r0.s = r7
            r7.setFocusable(r12)
            androidx.core.widget.NestedScrollView r7 = r0.s
            r7.setNestedScrollingEnabled(r12)
            r7 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.w = r7
            if (r7 != 0) goto Lc6
            goto Lfb
        Lc6:
            java.lang.CharSequence r8 = r0.e
            if (r8 == 0) goto Lce
            r7.setText(r8)
            goto Lfb
        Lce:
            r7.setVisibility(r15)
            androidx.core.widget.NestedScrollView r7 = r0.s
            android.widget.TextView r8 = r0.w
            r7.removeView(r8)
            androidx.appcompat.app.AlertController$RecycleListView r7 = r0.f
            if (r7 == 0) goto Lf8
            androidx.core.widget.NestedScrollView r7 = r0.s
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            androidx.core.widget.NestedScrollView r8 = r0.s
            int r8 = r7.indexOfChild(r8)
            r7.removeViewAt(r8)
            androidx.appcompat.app.AlertController$RecycleListView r9 = r0.f
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r10.<init>(r11, r11)
            r7.addView(r9, r8, r10)
            goto Lfb
        Lf8:
            r5.setVisibility(r15)
        Lfb:
            r7 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r0.j = r7
            r7 r8 = r0.H
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r0.k
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            android.widget.Button r9 = r0.j
            if (r7 == 0) goto L11a
            r9.setVisibility(r15)
            r7 = r12
            goto L125
        L11a:
            java.lang.CharSequence r7 = r0.k
            r9.setText(r7)
            android.widget.Button r7 = r0.j
            r7.setVisibility(r12)
            r7 = 1
        L125:
            r9 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r0.m = r9
            r9.setOnClickListener(r8)
            java.lang.CharSequence r9 = r0.n
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            android.widget.Button r10 = r0.m
            if (r9 == 0) goto L141
            r10.setVisibility(r15)
            goto L14d
        L141:
            java.lang.CharSequence r9 = r0.n
            r10.setText(r9)
            android.widget.Button r9 = r0.m
            r9.setVisibility(r12)
            r7 = r7 | 2
        L14d:
            r9 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r0.p = r9
            r9.setOnClickListener(r8)
            java.lang.CharSequence r8 = r0.q
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            android.widget.Button r9 = r0.p
            if (r8 == 0) goto L169
            r9.setVisibility(r15)
            goto L175
        L169:
            java.lang.CharSequence r8 = r0.q
            r9.setText(r8)
            android.widget.Button r8 = r0.p
            r8.setVisibility(r12)
            r7 = r7 | 4
        L175:
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r9 = 2130968622(0x7f04002e, float:1.7545903E38)
            r10 = 1
            r1.resolveAttribute(r9, r8, r10)
            int r1 = r8.data
            r8 = 2
            if (r1 == 0) goto L1c2
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r7 != r10) goto L19e
            android.widget.Button r9 = r0.j
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            r13.gravity = r10
            r13.weight = r1
            r9.setLayoutParams(r13)
            goto L1c2
        L19e:
            if (r7 != r8) goto L1b0
            android.widget.Button r9 = r0.m
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            r13.gravity = r10
            r13.weight = r1
            r9.setLayoutParams(r13)
            goto L1c2
        L1b0:
            r9 = 4
            if (r7 != r9) goto L1c2
            android.widget.Button r9 = r0.p
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            r13.gravity = r10
            r13.weight = r1
            r9.setLayoutParams(r13)
        L1c2:
            if (r7 == 0) goto L1c5
            goto L1c8
        L1c5:
            r6.setVisibility(r15)
        L1c8:
            android.view.View r1 = r0.x
            r7 = 2131428014(0x7f0b02ae, float:1.847766E38)
            if (r1 == 0) goto L1e2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r1.<init>(r11, r9)
            android.view.View r9 = r0.x
            r4.addView(r9, r12, r1)
            android.view.View r1 = r2.findViewById(r7)
            r1.setVisibility(r15)
            goto L245
        L1e2:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.u = r1
            java.lang.CharSequence r1 = r0.d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L236
            boolean r1 = r0.F
            if (r1 == 0) goto L236
            r1 = 2131427416(0x7f0b0058, float:1.8476448E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.v = r1
            java.lang.CharSequence r7 = r0.d
            r1.setText(r7)
            android.graphics.drawable.Drawable r1 = r0.t
            if (r1 == 0) goto L213
            android.widget.ImageView r7 = r0.u
            r7.setImageDrawable(r1)
            goto L245
        L213:
            android.widget.TextView r1 = r0.v
            android.widget.ImageView r7 = r0.u
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r9 = r0.u
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r10 = r0.u
            int r10 = r10.getPaddingRight()
            android.widget.ImageView r13 = r0.u
            int r13 = r13.getPaddingBottom()
            r1.setPadding(r7, r9, r10, r13)
            android.widget.ImageView r1 = r0.u
            r1.setVisibility(r15)
            goto L245
        L236:
            android.view.View r1 = r2.findViewById(r7)
            r1.setVisibility(r15)
            android.widget.ImageView r1 = r0.u
            r1.setVisibility(r15)
            r4.setVisibility(r15)
        L245:
            int r1 = r3.getVisibility()
            if (r1 == r15) goto L24d
            r10 = 1
            goto L24e
        L24d:
            r10 = r12
        L24e:
            if (r4 == 0) goto L258
            int r1 = r4.getVisibility()
            if (r1 == r15) goto L258
            r1 = 1
            goto L259
        L258:
            r1 = r12
        L259:
            int r3 = r6.getVisibility()
            if (r3 == r15) goto L261
            r3 = 1
            goto L262
        L261:
            r3 = r12
        L262:
            if (r3 != 0) goto L270
            r6 = 2131427981(0x7f0b028d, float:1.8477594E38)
            android.view.View r6 = r5.findViewById(r6)
            if (r6 == 0) goto L270
            r6.setVisibility(r12)
        L270:
            if (r1 == 0) goto L292
            androidx.core.widget.NestedScrollView r6 = r0.s
            if (r6 == 0) goto L27a
            r7 = 1
            r6.setClipToPadding(r7)
        L27a:
            java.lang.CharSequence r6 = r0.e
            if (r6 != 0) goto L285
            androidx.appcompat.app.AlertController$RecycleListView r6 = r0.f
            if (r6 == 0) goto L283
            goto L285
        L283:
            r4 = 0
            goto L28c
        L285:
            r6 = 2131428013(0x7f0b02ad, float:1.8477658E38)
            android.view.View r4 = r4.findViewById(r6)
        L28c:
            if (r4 == 0) goto L29e
            r4.setVisibility(r12)
            goto L29e
        L292:
            r4 = 2131427982(0x7f0b028e, float:1.8477596E38)
            android.view.View r4 = r5.findViewById(r4)
            if (r4 == 0) goto L29e
            r4.setVisibility(r12)
        L29e:
            androidx.appcompat.app.AlertController$RecycleListView r4 = r0.f
            if (r4 == 0) goto L2c3
            if (r3 == 0) goto L2a6
            if (r1 != 0) goto L2c3
        L2a6:
            int r6 = r4.getPaddingLeft()
            if (r1 == 0) goto L2b1
            int r7 = r4.getPaddingTop()
            goto L2b3
        L2b1:
            int r7 = r4.A
        L2b3:
            int r9 = r4.getPaddingRight()
            if (r3 == 0) goto L2be
            int r13 = r4.getPaddingBottom()
            goto L2c0
        L2be:
            int r13 = r4.B
        L2c0:
            r4.setPadding(r6, r7, r9, r13)
        L2c3:
            if (r10 != 0) goto L2f0
            androidx.appcompat.app.AlertController$RecycleListView r4 = r0.f
            if (r4 == 0) goto L2ca
            goto L2cc
        L2ca:
            androidx.core.widget.NestedScrollView r4 = r0.s
        L2cc:
            if (r4 == 0) goto L2f0
            if (r3 == 0) goto L2d1
            r12 = r8
        L2d1:
            r1 = r1 | r12
            r3 = 2131427858(0x7f0b0212, float:1.8477344E38)
            android.view.View r3 = r2.findViewById(r3)
            r6 = 2131427857(0x7f0b0211, float:1.8477342E38)
            android.view.View r2 = r2.findViewById(r6)
            java.util.WeakHashMap r6 = defpackage.ao7.a
            r6 = 3
            r4.setScrollIndicators(r1, r6)
            if (r3 == 0) goto L2eb
            r5.removeView(r3)
        L2eb:
            if (r2 == 0) goto L2f0
            r5.removeView(r2)
        L2f0:
            androidx.appcompat.app.AlertController$RecycleListView r1 = r0.f
            if (r1 == 0) goto L306
            android.widget.ListAdapter r2 = r0.y
            if (r2 == 0) goto L306
            r1.setAdapter(r2)
            int r0 = r0.z
            if (r0 <= r11) goto L306
            r7 = 1
            r1.setItemChecked(r0, r7)
            r1.setSelection(r0)
        L306:
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            yb r0 = r1.Z
            androidx.core.widget.NestedScrollView r0 = r0.s
            if (r0 == 0) goto Le
            boolean r0 = r0.i(r3)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyDown(r2, r3)
            return r1
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            yb r0 = r1.Z
            androidx.core.widget.NestedScrollView r0 = r0.s
            if (r0 == 0) goto Le
            boolean r0 = r0.i(r3)
            if (r0 == 0) goto Le
            r1 = 1
            return r1
        Le:
            boolean r1 = super.onKeyUp(r2, r3)
            return r1
    }

    @Override // defpackage.hr, android.app.Dialog
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            yb r0 = r0.Z
            r0.d = r1
            android.widget.TextView r0 = r0.v
            if (r0 == 0) goto Le
            r0.setText(r1)
        Le:
            return
    }
}
