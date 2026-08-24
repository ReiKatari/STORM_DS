package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwareColourPickerPreference extends androidx.preference.Preference {
    public static final java.util.List B = null;
    public android.view.View A;

    static {
            r0 = 6390426(0x61829a, float:8.954894E-39)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 12208384(0xba4900, float:1.710759E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 16449560(0xfb0018, float:2.3050743E-38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 16485115(0xfb8afb, float:2.3100566E-38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 16486912(0xfb9200, float:2.3103084E-38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 15983360(0xf3e300, float:2.2397458E-38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 11205376(0xaafb00, float:1.5702076E-38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 64256(0xfb00, float:9.0042E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 41528(0xa238, float:5.8193E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 4840330(0x49db8a, float:6.782747E-39)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = 3193587(0x30baf3, float:4.475169E-39)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 23027(0x59f3, float:3.2268E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = 146(0x92, float:2.05E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r0 = 9044179(0x8a00d3, float:1.2673594E-38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = 13828331(0xd300eb, float:1.9377619E-38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r0 = 16449682(0xfb0092, float:2.3050914E-38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r0 = 1184792(0x121418, float:1.660247E-39)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r0 = 58879(0xe5ff, float:8.2507E-41)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            r0 = 16766720(0xffd700, float:2.3495179E-38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            r0 = 14684511(0xe0115f, float:2.0577383E-38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            r0 = 58998(0xe676, float:8.2674E-41)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r0)
            r0 = 16739904(0xff6e40, float:2.3457602E-38)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r0)
            r0 = 6627327(0x651fff, float:9.286863E-39)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.List r0 = defpackage.hf.c0(r0)
            me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference.B = r0
            return
    }

    public FirmwareColourPickerPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            r1 = 2131624077(0x7f0e008d, float:1.8875324E38)
            r0.setWidgetLayoutResource(r1)
            return
    }

    public final void e(int r5) {
            r4 = this;
            java.util.List r0 = me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference.B
            java.lang.Object r5 = defpackage.gt0.K0(r5, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto Lf
            int r5 = r5.intValue()
            goto L1a
        Lf:
            r5 = 0
            java.lang.Object r5 = r0.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L1a:
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            long r2 = (long) r5
            long r0 = r0 | r2
            android.view.View r4 = r4.A
            if (r4 == 0) goto L33
            if (r4 == 0) goto L2c
            int r5 = (int) r0
            r4.setBackgroundColor(r5)
            return
        L2c:
            java.lang.String r4 = "viewSelectedColour"
            defpackage.nb3.a0(r4)
            r4 = 0
            throw r4
        L33:
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r2) {
            r1 = this;
            r2.getClass()
            super.onBindViewHolder(r2)
            r0 = 2131428067(0x7f0b02e3, float:1.8477768E38)
            android.view.View r2 = r2.q(r0)
            r2.getClass()
            r1.A = r2
            r2 = 0
            int r2 = r1.getPersistedInt(r2)
            r1.e(r2)
            return
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
            r6 = this;
            super.onClick()
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131623990(0x7f0e0036, float:1.8875147E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r1 = 2131427647(0x7f0b013f, float:1.8476916E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427648(0x7f0b0140, float:1.8476918E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427649(0x7f0b0141, float:1.847692E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427650(0x7f0b0142, float:1.8476922E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427651(0x7f0b0143, float:1.8476924E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427652(0x7f0b0144, float:1.8476926E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131427655(0x7f0b0147, float:1.8476932E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            if (r2 == 0) goto L18e
            r1 = 2131428043(0x7f0b02cb, float:1.847772E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428044(0x7f0b02cc, float:1.8477721E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428045(0x7f0b02cd, float:1.8477723E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428046(0x7f0b02ce, float:1.8477725E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428047(0x7f0b02cf, float:1.8477727E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428048(0x7f0b02d0, float:1.847773E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428049(0x7f0b02d1, float:1.8477732E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428050(0x7f0b02d2, float:1.8477734E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428051(0x7f0b02d3, float:1.8477736E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428052(0x7f0b02d4, float:1.8477738E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428053(0x7f0b02d5, float:1.847774E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428054(0x7f0b02d6, float:1.8477742E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428055(0x7f0b02d7, float:1.8477744E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428056(0x7f0b02d8, float:1.8477746E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428057(0x7f0b02d9, float:1.8477748E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428059(0x7f0b02db, float:1.8477752E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428060(0x7f0b02dc, float:1.8477754E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428062(0x7f0b02de, float:1.8477758E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428063(0x7f0b02df, float:1.847776E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428064(0x7f0b02e0, float:1.8477762E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428065(0x7f0b02e1, float:1.8477764E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            r1 = 2131428066(0x7f0b02e2, float:1.8477766E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto L18e
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            zb r1 = new zb
            android.content.Context r4 = r6.getContext()
            r1.<init>(r4)
            java.lang.CharSequence r4 = r6.getTitle()
            java.lang.Object r5 = r1.L
            wb r5 = (defpackage.wb) r5
            r5.d = r4
            r1.A(r0)
            qo0 r0 = new qo0
            r4 = 3
            r0.<init>(r4)
            r4 = 2131951750(0x7f130086, float:1.9539923E38)
            r1.x(r4, r0)
            ac r0 = r1.B()
            ev r1 = new ev
            r4 = 5
            r1.<init>(r2, r4)
            bz1 r2 = new bz1
            r2.<init>(r4)
            qd2 r4 = new qd2
            tb6 r5 = defpackage.tb6.d0
            r4.<init>(r1, r2)
            oc2 r1 = new oc2
            r1.<init>(r4)
        L178:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18d
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            tc2 r4 = new tc2
            r4.<init>(r6, r0, r3)
            r2.setOnClickListener(r4)
            goto L178
        L18d:
            return
        L18e:
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r6 = r6.getResourceName(r1)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r6 = r0.concat(r6)
            defpackage.u34.x(r6)
            return
    }
}
