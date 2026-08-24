package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwareBirthdayPreference extends androidx.preference.Preference {
    public static final java.util.Map A = null;
    public static final java.text.NumberFormat B = null;

    static {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 29
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r3
            vr4 r3 = new vr4
            r3.<init>(r5, r4)
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r4
            vr4 r4 = new vr4
            r4.<init>(r5, r1)
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 30
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = r5
            vr4 r5 = new vr4
            r5.<init>(r7, r6)
            r7 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r6
            vr4 r6 = new vr4
            r6.<init>(r7, r1)
            r7 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = r7
            vr4 r7 = new vr4
            r7.<init>(r9, r8)
            r9 = 7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = r8
            vr4 r8 = new vr4
            r8.<init>(r9, r1)
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = r9
            vr4 r9 = new vr4
            r9.<init>(r11, r1)
            r11 = 9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = r10
            vr4 r10 = new vr4
            r10.<init>(r11, r12)
            r11 = 10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = r11
            vr4 r11 = new vr4
            r11.<init>(r13, r1)
            r13 = 11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = r12
            vr4 r12 = new vr4
            r12.<init>(r13, r14)
            r13 = 12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = r13
            vr4 r13 = new vr4
            r13.<init>(r14, r1)
            vr4[] r1 = new defpackage.vr4[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.Map r1 = defpackage.c14.m0(r1)
            me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.A = r1
            java.text.NumberFormat r1 = java.text.NumberFormat.getNumberInstance()
            r1.setMinimumIntegerDigits(r0)
            me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.B = r1
            return
    }

    public FirmwareBirthdayPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            return
    }

    public static int e(int r1, boolean r2, int r3) {
            java.util.Map r0 = me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.A
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 1
            if (r3 == 0) goto L14
            int r3 = r3.intValue()
            goto L15
        L14:
            r3 = r0
        L15:
            if (r2 == 0) goto L1e
            if (r1 <= r3) goto L1a
            return r0
        L1a:
            if (r1 >= r0) goto L1d
            return r3
        L1d:
            return r1
        L1e:
            int r1 = defpackage.gi2.q(r1, r0, r3)
            return r1
    }

    public static void f(android.widget.TextView r1, int r2) {
            java.text.NumberFormat r0 = me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r0.format(r2)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            return
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
            r13 = this;
            super.onClick()
            android.content.Context r0 = r13.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131623989(0x7f0e0035, float:1.8875145E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r1 = 2131427463(0x7f0b0087, float:1.8476543E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.Button r2 = (android.widget.Button) r2
            if (r2 == 0) goto Lff
            r1 = 2131427464(0x7f0b0088, float:1.8476545E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto Lff
            r1 = 2131427465(0x7f0b0089, float:1.8476547E38)
            android.view.View r5 = defpackage.gi2.B(r0, r1)
            android.widget.Button r5 = (android.widget.Button) r5
            if (r5 == 0) goto Lff
            r1 = 2131427466(0x7f0b008a, float:1.847655E38)
            android.view.View r6 = defpackage.gi2.B(r0, r1)
            android.widget.Button r6 = (android.widget.Button) r6
            if (r6 == 0) goto Lff
            r1 = 2131427959(0x7f0b0277, float:1.8477549E38)
            android.view.View r7 = defpackage.gi2.B(r0, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto Lff
            r1 = 2131427960(0x7f0b0278, float:1.847755E38)
            android.view.View r8 = defpackage.gi2.B(r0, r1)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto Lff
            yc1 r1 = new yc1
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.<init>()
            r1.A = r7
            r1.B = r8
            zb r9 = new zb
            android.content.Context r10 = r13.getContext()
            r9.<init>(r10)
            java.lang.CharSequence r10 = r13.getTitle()
            java.lang.Object r11 = r9.L
            wb r11 = (defpackage.wb) r11
            r11.d = r10
            r9.A(r0)
            nu1 r0 = new nu1
            r10 = 1
            r0.<init>(r10, r1, r13)
            r11 = 2131952357(0x7f1302e5, float:1.9541154E38)
            r9.y(r11, r0)
            qo0 r0 = new qo0
            r11 = 2
            r0.<init>(r11)
            r12 = 2131951750(0x7f130086, float:1.9539923E38)
            r9.x(r12, r0)
            r9.B()
            java.lang.String r0 = "01/01"
            java.lang.String r0 = r13.getPersistedString(r0)
            r0.getClass()
            java.lang.String r9 = "/"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            r12 = 6
            java.util.List r0 = defpackage.qs6.K0(r0, r9, r12)
            int r9 = r0.size()
            if (r9 == r11) goto Lb3
            f(r7, r10)
            f(r8, r10)
            goto Ldd
        Lb3:
            java.lang.Object r9 = r0.get(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Integer r9 = defpackage.xs6.h0(r9)
            if (r9 == 0) goto Lc4
            int r9 = r9.intValue()
            goto Lc5
        Lc4:
            r9 = r10
        Lc5:
            f(r7, r9)
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto Ld9
            int r0 = r0.intValue()
            goto Lda
        Ld9:
            r0 = r10
        Lda:
            f(r8, r0)
        Ldd:
            sc2 r0 = new sc2
            r0.<init>(r1, r13, r3)
            r4.setOnClickListener(r0)
            sc2 r0 = new sc2
            r0.<init>(r1, r13, r10)
            r2.setOnClickListener(r0)
            sc2 r0 = new sc2
            r0.<init>(r1, r13, r11)
            r6.setOnClickListener(r0)
            sc2 r0 = new sc2
            r2 = 3
            r0.<init>(r1, r13, r2)
            r5.setOnClickListener(r0)
            return
        Lff:
            android.content.res.Resources r13 = r0.getResources()
            java.lang.String r13 = r13.getResourceName(r1)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r13 = r0.concat(r13)
            defpackage.u34.x(r13)
            return
    }
}
