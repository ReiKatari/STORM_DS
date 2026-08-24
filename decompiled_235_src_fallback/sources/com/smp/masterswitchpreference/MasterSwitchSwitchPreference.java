package com.smp.masterswitchpreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MasterSwitchSwitchPreference extends androidx.preference.SwitchPreferenceCompat {
    public com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs e0;
    public android.view.View f0;
    public androidx.appcompat.widget.SwitchCompat g0;
    public android.widget.TextView h0;

    public MasterSwitchSwitchPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            return
    }

    public final com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs h() {
            r0 = this;
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r0.e0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "attrs"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r4) {
            r3 = this;
            r4.getClass()
            super.onBindViewHolder(r4)
            android.view.View r4 = r4.a
            r4.getClass()
            r3.f0 = r4
            r0 = 2131427939(0x7f0b0263, float:1.8477508E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.getClass()
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r3.g0 = r0
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r4.findViewById(r0)
            r4.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.h0 = r4
            androidx.appcompat.widget.SwitchCompat r4 = r3.g0
            r0 = 0
            java.lang.String r1 = "switch"
            if (r4 == 0) goto La5
            android.graphics.drawable.Drawable r4 = r4.getThumbDrawable()
            if (r4 == 0) goto L41
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = r3.h()
            int r2 = r2.getSwitchThumbColor()
            r4.setTint(r2)
        L41:
            androidx.appcompat.widget.SwitchCompat r4 = r3.g0
            if (r4 == 0) goto La1
            android.graphics.drawable.Drawable r4 = r4.getTrackDrawable()
            if (r4 == 0) goto L56
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = r3.h()
            int r2 = r2.getSwitchTrackColor()
            r4.setTint(r2)
        L56:
            androidx.appcompat.widget.SwitchCompat r4 = r3.g0
            if (r4 == 0) goto L9d
            boolean r4 = r4.isChecked()
            android.view.View r1 = r3.f0
            java.lang.String r2 = "background"
            if (r4 == 0) goto L76
            if (r1 == 0) goto L72
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r4 = r3.h()
            int r4 = r4.getSwitchOnBackgroundColor()
            r1.setBackgroundColor(r4)
            goto L83
        L72:
            defpackage.nb3.a0(r2)
            throw r0
        L76:
            if (r1 == 0) goto L99
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r4 = r3.h()
            int r4 = r4.getSwitchOffBackgroundColor()
            r1.setBackgroundColor(r4)
        L83:
            android.widget.TextView r4 = r3.h0
            if (r4 == 0) goto L93
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r3 = r3.h()
            int r3 = r3.getSwitchTextColor()
            r4.setTextColor(r3)
            return
        L93:
            java.lang.String r3 = "text"
            defpackage.nb3.a0(r3)
            throw r0
        L99:
            defpackage.nb3.a0(r2)
            throw r0
        L9d:
            defpackage.nb3.a0(r1)
            throw r0
        La1:
            defpackage.nb3.a0(r1)
            throw r0
        La5:
            defpackage.nb3.a0(r1)
            throw r0
    }
}
