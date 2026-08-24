package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tc2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tc2 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.preference.Preference B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ tc2(androidx.preference.Preference r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.L
            androidx.preference.Preference r2 = r2.B
            switch(r0) {
                case 0: goto L23;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.settings.preferences.MacAddressPreference r2 = (me.magnum.melonds.ui.settings.preferences.MacAddressPreference) r2
            yc1 r1 = (defpackage.yc1) r1
            java.util.List r3 = defpackage.zz3.b
            fy7 r3 = r2.A
            zz3 r3 = defpackage.kn2.W(r3)
            r2.B = r3
            java.lang.Object r2 = r1.B
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            return
        L23:
            me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference r2 = (me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference) r2
            ac r1 = (defpackage.ac) r1
            java.util.List r0 = me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference.B
            java.lang.Object r3 = r3.getTag()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            r2.e(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.callChangeListener(r0)
            if (r0 == 0) goto L46
            r2.persistInt(r3)
        L46:
            r1.dismiss()
            return
    }
}
