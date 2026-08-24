package androidx.appcompat.view.menu;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements defpackage.c54, android.widget.AbsListView.SelectionBoundsAdjuster {
    public defpackage.o44 A;
    public android.widget.ImageView B;
    public android.widget.RadioButton L;
    public android.widget.TextView R;
    public android.widget.CheckBox d0;
    public android.widget.TextView e0;
    public android.widget.ImageView f0;
    public android.widget.ImageView g0;
    public android.widget.LinearLayout h0;
    public final android.graphics.drawable.Drawable i0;
    public final int j0;
    public final android.content.Context k0;
    public boolean l0;
    public final android.graphics.drawable.Drawable m0;
    public final boolean n0;
    public android.view.LayoutInflater o0;
    public boolean p0;

    public ListMenuItemView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            android.content.Context r0 = r4.getContext()
            int[] r1 = defpackage.m75.r
            r2 = 2130969413(0x7f040345, float:1.7547507E38)
            m44 r6 = defpackage.m44.A(r0, r6, r1, r2)
            r0 = 5
            android.graphics.drawable.Drawable r0 = r6.k(r0)
            r4.i0 = r0
            java.lang.Object r0 = r6.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 1
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            r4.j0 = r1
            r1 = 7
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r4.l0 = r0
            r4.k0 = r5
            r0 = 8
            android.graphics.drawable.Drawable r0 = r6.k(r0)
            r4.m0 = r0
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r0 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0}
            r1 = 2130969042(0x7f0401d2, float:1.7546755E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r3, r0, r1, r2)
            boolean r0 = r5.hasValue(r2)
            r4.n0 = r0
            r6.D()
            r5.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.o0
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.o0 = r0
        Le:
            android.view.LayoutInflater r1 = r1.o0
            return r1
    }

    private void setSubMenuArrowVisible(boolean r1) {
            r0 = this;
            android.widget.ImageView r0 = r0.f0
            if (r0 == 0) goto Ld
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = 8
        La:
            r0.setVisibility(r1)
        Ld:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect r4) {
            r3 = this;
            android.widget.ImageView r0 = r3.g0
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r3.g0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r4.top
            android.widget.ImageView r3 = r3.g0
            int r3 = r3.getHeight()
            int r2 = r0.topMargin
            int r3 = r3 + r2
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r3 = r3 + r1
            r4.top = r3
        L23:
            return
    }

    @Override // defpackage.c54
    public final void c(defpackage.o44 r11) {
            r10 = this;
            r10.A = r11
            boolean r0 = r11.isVisible()
            i44 r1 = r11.n
            r2 = 8
            r3 = 0
            if (r0 == 0) goto Lf
            r0 = r3
            goto L10
        Lf:
            r0 = r2
        L10:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            boolean r0 = r1.o()
            r4 = 1
            if (r0 == 0) goto L35
            boolean r0 = r1.n()
            if (r0 == 0) goto L2f
            char r0 = r11.j
            goto L31
        L2f:
            char r0 = r11.h
        L31:
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = r3
        L36:
            r1.n()
            if (r0 == 0) goto L53
            o44 r0 = r10.A
            i44 r1 = r0.n
            boolean r5 = r1.o()
            if (r5 == 0) goto L53
            boolean r1 = r1.n()
            if (r1 == 0) goto L4e
            char r0 = r0.j
            goto L50
        L4e:
            char r0 = r0.h
        L50:
            if (r0 == 0) goto L53
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 != 0) goto L10e
            android.widget.TextView r0 = r10.e0
            o44 r1 = r10.A
            i44 r5 = r1.n
            android.content.Context r6 = r5.a
            boolean r7 = r5.n()
            if (r7 == 0) goto L67
            char r7 = r1.j
            goto L69
        L67:
            char r7 = r1.h
        L69:
            if (r7 != 0) goto L6f
            java.lang.String r1 = ""
            goto L10b
        L6f:
            android.content.res.Resources r8 = r6.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L8c
            r6 = 2131951633(0x7f130011, float:1.9539686E38)
            java.lang.String r6 = r8.getString(r6)
            r9.append(r6)
        L8c:
            boolean r5 = r5.n()
            if (r5 == 0) goto L95
            int r1 = r1.k
            goto L97
        L95:
            int r1 = r1.i
        L97:
            r5 = 2131951629(0x7f13000d, float:1.9539678E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 65536(0x10000, float:9.1835E-41)
            defpackage.o44.b(r1, r6, r5, r9)
            r5 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 4096(0x1000, float:5.74E-42)
            defpackage.o44.b(r1, r6, r5, r9)
            r5 = 2131951624(0x7f130008, float:1.9539668E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 2
            defpackage.o44.b(r1, r6, r5, r9)
            r5 = 2131951630(0x7f13000e, float:1.953968E38)
            java.lang.String r5 = r8.getString(r5)
            defpackage.o44.b(r1, r4, r5, r9)
            r4 = 2131951632(0x7f130010, float:1.9539684E38)
            java.lang.String r4 = r8.getString(r4)
            r5 = 4
            defpackage.o44.b(r1, r5, r4, r9)
            r4 = 2131951628(0x7f13000c, float:1.9539676E38)
            java.lang.String r4 = r8.getString(r4)
            defpackage.o44.b(r1, r2, r4, r9)
            if (r7 == r2) goto Lfd
            r1 = 10
            if (r7 == r1) goto Lf2
            r1 = 32
            if (r7 == r1) goto Le7
            r9.append(r7)
            goto L107
        Le7:
            r1 = 2131951631(0x7f13000f, float:1.9539682E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L107
        Lf2:
            r1 = 2131951627(0x7f13000b, float:1.9539674E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L107
        Lfd:
            r1 = 2131951626(0x7f13000a, float:1.9539672E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
        L107:
            java.lang.String r1 = r9.toString()
        L10b:
            r0.setText(r1)
        L10e:
            android.widget.TextView r0 = r10.e0
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L11b
            android.widget.TextView r0 = r10.e0
            r0.setVisibility(r3)
        L11b:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.q
            r10.setContentDescription(r11)
            return
    }

    @Override // defpackage.c54
    public defpackage.o44 getItemData() {
            r0 = this;
            o44 r0 = r0.A
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.i0
            r3.setBackground(r0)
            r0 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.R = r0
            r1 = -1
            int r2 = r3.j0
            if (r2 == r1) goto L1d
            android.content.Context r1 = r3.k0
            r0.setTextAppearance(r1, r2)
        L1d:
            r0 = 2131427886(0x7f0b022e, float:1.84774E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.e0 = r0
            r0 = 2131427924(0x7f0b0254, float:1.8477478E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f0 = r0
            if (r0 == 0) goto L3a
            android.graphics.drawable.Drawable r1 = r3.m0
            r0.setImageDrawable(r1)
        L3a:
            r0 = 2131427602(0x7f0b0112, float:1.8476825E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.g0 = r0
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.h0 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.B
            if (r0 == 0) goto L1e
            boolean r0 = r3.l0
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.B
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r0.height
            if (r0 <= 0) goto L1e
            int r2 = r1.width
            if (r2 > 0) goto L1e
            r1.width = r0
        L1e:
            super.onMeasure(r4, r5)
            return
    }

    public void setCheckable(boolean r5) {
            r4 = this;
            if (r5 != 0) goto Lc
            android.widget.RadioButton r0 = r4.L
            if (r0 != 0) goto Lc
            android.widget.CheckBox r0 = r4.d0
            if (r0 != 0) goto Lc
            goto L8b
        Lc:
            o44 r0 = r4.A
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L39
            android.widget.RadioButton r0 = r4.L
            if (r0 != 0) goto L34
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131623953(0x7f0e0011, float:1.8875072E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.L = r0
            android.widget.LinearLayout r3 = r4.h0
            if (r3 == 0) goto L31
            r3.addView(r0, r1)
            goto L34
        L31:
            r4.addView(r0, r1)
        L34:
            android.widget.RadioButton r0 = r4.L
            android.widget.CheckBox r1 = r4.d0
            goto L5b
        L39:
            android.widget.CheckBox r0 = r4.d0
            if (r0 != 0) goto L57
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131623950(0x7f0e000e, float:1.8875066E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.d0 = r0
            android.widget.LinearLayout r3 = r4.h0
            if (r3 == 0) goto L54
            r3.addView(r0, r1)
            goto L57
        L54:
            r4.addView(r0, r1)
        L57:
            android.widget.CheckBox r0 = r4.d0
            android.widget.RadioButton r1 = r4.L
        L5b:
            r3 = 8
            if (r5 == 0) goto L7d
            o44 r4 = r4.A
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L71
            r0.setVisibility(r2)
        L71:
            if (r1 == 0) goto L8b
            int r4 = r1.getVisibility()
            if (r4 == r3) goto L8b
            r1.setVisibility(r3)
            return
        L7d:
            android.widget.CheckBox r5 = r4.d0
            if (r5 == 0) goto L84
            r5.setVisibility(r3)
        L84:
            android.widget.RadioButton r4 = r4.L
            if (r4 == 0) goto L8b
            r4.setVisibility(r3)
        L8b:
            return
    }

    public void setChecked(boolean r5) {
            r4 = this;
            o44 r0 = r4.A
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2b
            android.widget.RadioButton r0 = r4.L
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131623953(0x7f0e0011, float:1.8875072E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.L = r0
            android.widget.LinearLayout r2 = r4.h0
            if (r2 == 0) goto L25
            r2.addView(r0, r1)
            goto L28
        L25:
            r4.addView(r0, r1)
        L28:
            android.widget.RadioButton r4 = r4.L
            goto L4b
        L2b:
            android.widget.CheckBox r0 = r4.d0
            if (r0 != 0) goto L49
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131623950(0x7f0e000e, float:1.8875066E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.d0 = r0
            android.widget.LinearLayout r2 = r4.h0
            if (r2 == 0) goto L46
            r2.addView(r0, r1)
            goto L49
        L46:
            r4.addView(r0, r1)
        L49:
            android.widget.CheckBox r4 = r4.d0
        L4b:
            r4.setChecked(r5)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.p0 = r1
            r0.l0 = r1
            return
    }

    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.g0
            if (r0 == 0) goto L11
            boolean r1 = r1.n0
            if (r1 != 0) goto Lc
            if (r2 == 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            r1 = 8
        Le:
            r0.setVisibility(r1)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            o44 r0 = r4.A
            i44 r0 = r0.n
            boolean r0 = r4.p0
            if (r0 != 0) goto Ld
            boolean r1 = r4.l0
            if (r1 != 0) goto Ld
            goto L5a
        Ld:
            android.widget.ImageView r1 = r4.B
            if (r1 != 0) goto L18
            if (r5 != 0) goto L18
            boolean r2 = r4.l0
            if (r2 != 0) goto L18
            goto L5a
        L18:
            r2 = 0
            if (r1 != 0) goto L35
            android.view.LayoutInflater r1 = r4.getInflater()
            r3 = 2131623951(0x7f0e000f, float:1.8875068E38)
            android.view.View r1 = r1.inflate(r3, r4, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.B = r1
            android.widget.LinearLayout r3 = r4.h0
            if (r3 == 0) goto L32
            r3.addView(r1, r2)
            goto L35
        L32:
            r4.addView(r1, r2)
        L35:
            if (r5 != 0) goto L44
            boolean r1 = r4.l0
            if (r1 == 0) goto L3c
            goto L44
        L3c:
            android.widget.ImageView r4 = r4.B
            r5 = 8
            r4.setVisibility(r5)
            return
        L44:
            android.widget.ImageView r1 = r4.B
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r5 = 0
        L4a:
            r1.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.B
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L5a
            android.widget.ImageView r4 = r4.B
            r4.setVisibility(r2)
        L5a:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.R
            if (r2 == 0) goto L16
            r0.setText(r2)
            android.widget.TextView r2 = r1.R
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L23
            android.widget.TextView r1 = r1.R
            r2 = 0
            r1.setVisibility(r2)
            return
        L16:
            int r2 = r0.getVisibility()
            r0 = 8
            if (r2 == r0) goto L23
            android.widget.TextView r1 = r1.R
            r1.setVisibility(r0)
        L23:
            return
    }
}
