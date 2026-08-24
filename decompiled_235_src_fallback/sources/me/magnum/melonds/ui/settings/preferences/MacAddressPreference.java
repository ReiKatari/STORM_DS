package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MacAddressPreference extends androidx.preference.Preference {
    public final defpackage.fy7 A;
    public defpackage.zz3 B;

    public MacAddressPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            long r1 = java.lang.System.nanoTime()
            fy7 r1 = defpackage.yh2.d(r1)
            r0.A = r1
            return
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
            r7 = this;
            super.onClick()
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131623993(0x7f0e0039, float:1.8875153E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r1 = 2131427996(0x7f0b029c, float:1.8477624E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto Lf4
            yc1 r1 = new yc1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.<init>(r0, r2)
            java.lang.String r0 = r7.getPersistedString(r3)
            r2 = 6
            if (r0 == 0) goto L74
            java.util.List r4 = defpackage.zz3.b
            java.lang.String r4 = ":"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r0 = defpackage.qs6.K0(r0, r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r0, r5)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            r6 = 16
            ze7 r6 = defpackage.qo2.T(r6, r5)
            if (r6 == 0) goto L6a
            byte r5 = r6.A
            ze7 r6 = new ze7
            r6.<init>(r5)
            r4.add(r6)
            goto L48
        L6a:
            defpackage.xs6.a0(r5)
            throw r3
        L6e:
            zz3 r0 = new zz3
            r0.<init>(r4)
            goto L75
        L74:
            r0 = r3
        L75:
            r7.B = r0
            if (r0 == 0) goto L84
            java.util.ArrayList r0 = r0.a
            int r0 = r0.size()
            if (r0 != r2) goto L82
            goto L84
        L82:
            r7.B = r3
        L84:
            zz3 r0 = r7.B
            java.lang.Object r2 = r1.B
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r0 != 0) goto L9b
            android.content.Context r0 = r7.getContext()
            r4 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r0 = r0.getString(r4)
            r2.setText(r0)
            goto La2
        L9b:
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
        La2:
            zb r0 = new zb
            android.content.Context r2 = r7.getContext()
            r0.<init>(r2)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            java.lang.CharSequence r4 = r7.getTitle()
            r2.d = r4
            java.lang.Object r4 = r1.A
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.A(r4)
            ax r4 = new ax
            r5 = 2
            r4.<init>(r7, r5)
            r5 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r0.y(r5, r4)
            qo0 r4 = new qo0
            r5 = 4
            r4.<init>(r5)
            r5 = 2131951750(0x7f130086, float:1.9539923E38)
            r0.x(r5, r4)
            r4 = 2131952007(0x7f130187, float:1.9540445E38)
            android.view.ContextThemeWrapper r5 = r2.a
            java.lang.CharSequence r4 = r5.getText(r4)
            r2.k = r4
            r2.l = r3
            ac r0 = r0.B()
            r2 = -3
            android.widget.Button r0 = r0.h(r2)
            tc2 r2 = new tc2
            r3 = 1
            r2.<init>(r7, r1, r3)
            r0.setOnClickListener(r2)
            return
        Lf4:
            android.content.res.Resources r7 = r0.getResources()
            java.lang.String r7 = r7.getResourceName(r1)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r7 = r0.concat(r7)
            defpackage.u34.x(r7)
            return
    }
}
