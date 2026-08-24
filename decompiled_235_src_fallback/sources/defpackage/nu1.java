package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nu1 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ nu1(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r10, int r11) {
            r9 = this;
            int r0 = r9.A
            r1 = 0
            java.lang.Object r2 = r9.L
            java.lang.Object r9 = r9.B
            switch(r0) {
                case 0: goto Lb7;
                case 1: goto L6c;
                case 2: goto L64;
                case 3: goto L50;
                default: goto La;
            }
        La:
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r9 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment) r9
            yc1 r2 = (defpackage.yc1) r2
            sn5 r4 = r9.k()
            java.lang.Object r9 = r2.B
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            android.text.Editable r9 = r9.getText()
            java.lang.String r11 = ""
            if (r9 == 0) goto L27
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L25
            goto L27
        L25:
            r5 = r9
            goto L28
        L27:
            r5 = r11
        L28:
            java.lang.Object r9 = r2.A
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            android.text.Editable r9 = r9.getText()
            if (r9 == 0) goto L3b
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L39
            goto L3b
        L39:
            r6 = r9
            goto L3c
        L3b:
            r6 = r11
        L3c:
            as0 r9 = defpackage.to7.a(r4)
            u12 r3 = new u12
            r8 = 25
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r11 = 3
            defpackage.hv.L(r9, r7, r7, r3, r11)
            r10.dismiss()
            return
        L50:
            java.util.List r9 = (java.util.List) r9
            d9 r2 = (defpackage.d9) r2
            java.lang.Object r9 = defpackage.gt0.J0(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L60
            android.net.Uri r1 = android.net.Uri.parse(r9)
        L60:
            r2.a(r1)
            return
        L64:
            me.magnum.melonds.ui.layouteditor.b r9 = (me.magnum.melonds.ui.layouteditor.b) r9
            java.util.List r2 = (java.util.List) r2
            me.magnum.melonds.ui.layouteditor.b.h(r9, r2, r11)
            return
        L6c:
            yc1 r9 = (defpackage.yc1) r9
            me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference r2 = (me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference) r2
            java.util.Map r11 = me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.A
            java.lang.Object r11 = r9.A
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            int r11 = java.lang.Integer.parseInt(r11)
            java.lang.Object r9 = r9.B
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            java.text.NumberFormat r0 = me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference.B
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = r0.format(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r9 = r0.format(r9)
            java.lang.String r0 = "/"
            java.lang.String r9 = defpackage.lb1.m(r11, r0, r9)
            boolean r11 = r2.callChangeListener(r9)
            if (r11 == 0) goto Lb3
            r2.persistString(r9)
        Lb3:
            r10.dismiss()
            return
        Lb7:
            qn2 r9 = (defpackage.qn2) r9
            android.widget.EditText r2 = (android.widget.EditText) r2
            int r10 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            android.text.Editable r10 = r2.getText()
            java.lang.String r10 = r10.toString()
            boolean r11 = defpackage.qs6.v0(r10)
            if (r11 == 0) goto Lcc
            goto Lcd
        Lcc:
            r1 = r10
        Lcd:
            r9.g(r1)
            return
    }
}
