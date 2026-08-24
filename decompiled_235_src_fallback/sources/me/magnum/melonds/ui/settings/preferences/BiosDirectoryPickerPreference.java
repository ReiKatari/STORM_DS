package me.magnum.melonds.ui.settings.preferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BiosDirectoryPickerPreference extends me.magnum.melonds.ui.settings.preferences.StoragePickerPreference {
    public me.magnum.melonds.domain.model.ConsoleType Y;
    public me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 Z;
    public defpackage.dz0 d0;
    public android.widget.ImageView e0;

    public BiosDirectoryPickerPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            r1 = 2131624074(0x7f0e008a, float:1.8875317E38)
            r0.setWidgetLayoutResource(r1)
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r1 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.DIRECTORY
            r1.getClass()
            r0.B = r1
            sv4 r1 = defpackage.sv4.READ_WRITE
            r1.getClass()
            r0.L = r1
            r1 = 1
            r0.R = r1
            return
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void e(android.util.AttributeSet r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = defpackage.c75.a
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r2, r2)
            r4.getClass()
            t52 r0 = me.magnum.melonds.domain.model.ConsoleType.getEntries()
            boolean r1 = r4.hasValue(r2)
            if (r1 == 0) goto L31
            int r1 = r4.getInt(r2, r2)
            u52 r0 = (defpackage.u52) r0
            java.lang.Object r0 = r0.get(r1)
            me.magnum.melonds.domain.model.ConsoleType r0 = (me.magnum.melonds.domain.model.ConsoleType) r0
            r3.Y = r0
            r4.recycle()
            return
        L31:
            java.lang.String r3 = "Attribute not defined in set."
            defpackage.i.h(r3)
            return
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void f(android.net.Uri r1) {
            r0 = this;
            super.f(r1)
            if (r1 != 0) goto L6
            return
        L6:
            r0.h(r1)
            return
    }

    public final void g() {
            r7 = this;
            android.widget.ImageView r0 = r7.e0
            if (r0 != 0) goto L6
            goto L96
        L6:
            boolean r1 = r7.isEnabled()
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L11
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            r0.setVisibility(r1)
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L1d
            goto L96
        L1d:
            dz0 r1 = r7.d0
            if (r1 == 0) goto L96
            cz0 r4 = r1.b
            int[] r5 = defpackage.i40.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            r5 = 1
            r6 = 2
            if (r4 == r5) goto L82
            if (r4 == r6) goto L5d
            r2 = 3
            if (r4 != r2) goto L59
            android.view.ViewParent r2 = r0.getParent()
            r2.getClass()
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r3)
            r2 = 2131230978(0x7f080102, float:1.8078024E38)
            r0.setImageResource(r2)
            android.content.Context r2 = r7.getContext()
            r3 = 2131100621(0x7f0603cd, float:1.7813629E38)
            int r2 = r2.getColor(r3)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setImageTintList(r2)
            goto L8e
        L59:
            defpackage.i.d()
            return
        L5d:
            android.view.ViewParent r2 = r0.getParent()
            r2.getClass()
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r3)
            r2 = 2131230980(0x7f080104, float:1.8078028E38)
            r0.setImageResource(r2)
            android.content.Context r2 = r7.getContext()
            r3 = 2131100623(0x7f0603cf, float:1.7813633E38)
            int r2 = r2.getColor(r3)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setImageTintList(r2)
            goto L8e
        L82:
            android.view.ViewParent r3 = r0.getParent()
            r3.getClass()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r2)
        L8e:
            ru1 r2 = new ru1
            r2.<init>(r7, r1, r0, r6)
            r0.setOnClickListener(r2)
        L96:
            return
    }

    public final void h(android.net.Uri r4) {
            r3 = this;
            boolean r0 = r3.isEnabled()
            android.widget.ImageView r1 = r3.e0
            if (r0 != 0) goto L10
            if (r1 == 0) goto Lf
            r3 = 8
            r1.setVisibility(r3)
        Lf:
            return
        L10:
            if (r1 == 0) goto L16
            r0 = 0
            r1.setVisibility(r0)
        L16:
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 r0 = r3.Z
            if (r0 == 0) goto L4e
            me.magnum.melonds.domain.model.ConsoleType r1 = r3.Y
            r1.getClass()
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r0 = r0.a
            uo7 r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            k81 r0 = (defpackage.k81) r0
            fb2 r0 = r0.b
            r0.getClass()
            int[] r2 = defpackage.ez0.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L47
            r2 = 2
            if (r1 != r2) goto L43
            me.magnum.melonds.domain.model.ConsoleType r1 = me.magnum.melonds.domain.model.ConsoleType.DSi
            dz0 r4 = r0.a(r1, r4)
            goto L4f
        L43:
            defpackage.i.d()
            return
        L47:
            me.magnum.melonds.domain.model.ConsoleType r1 = me.magnum.melonds.domain.model.ConsoleType.DS
            dz0 r4 = r0.a(r1, r4)
            goto L4f
        L4e:
            r4 = 0
        L4f:
            r3.d0 = r4
            r3.g()
            return
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
            r1 = this;
            r1.a()
            du1 r0 = defpackage.du1.A
            java.util.Set r0 = r1.getPersistedStringSet(r0)
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = defpackage.gt0.I0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r1.h(r0)
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r2) {
            r1 = this;
            r2.getClass()
            super.onBindViewHolder(r2)
            r0 = 2131427629(0x7f0b012d, float:1.847688E38)
            android.view.View r2 = r2.q(r0)
            r2.getClass()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.e0 = r2
            r1.g()
            return
    }

    @Override // androidx.preference.Preference
    public final void onDependencyChanged(androidx.preference.Preference r1, boolean r2) {
            r0 = this;
            r1.getClass()
            super.onDependencyChanged(r1, r2)
            android.widget.ImageView r0 = r0.e0
            if (r0 == 0) goto L13
            if (r2 == 0) goto Lf
            r1 = 8
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.setVisibility(r1)
        L13:
            return
    }
}
