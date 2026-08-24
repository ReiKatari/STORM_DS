package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwarePreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_FirmwarePreferencesFragment implements defpackage.q15 {
    public final defpackage.ex6 Z;
    public defpackage.wh7 d0;
    public defpackage.yj1 e0;

    public FirmwarePreferencesFragment() {
            r2 = this;
            r2.<init>()
            a5 r0 = new a5
            r1 = 27
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.Z = r1
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952081(0x7f1301d1, float:1.9540595E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r2, java.lang.String r3) {
            r1 = this;
            r2 = 2132148240(0x7f160010, float:1.9938452E38)
            r1.setPreferencesFromResource(r2, r3)
            ex6 r2 = r1.Z
            java.lang.Object r3 = r2.getValue()
            p15 r3 = (defpackage.p15) r3
            java.lang.String r0 = "firmware_settings_birthday"
            androidx.preference.Preference r0 = r1.findPreference(r0)
            r3.getClass()
            defpackage.p15.a(r0)
            java.lang.Object r2 = r2.getValue()
            p15 r2 = (defpackage.p15) r2
            java.lang.String r3 = "internal_mac_address"
            androidx.preference.Preference r0 = r1.findPreference(r3)
            r2.getClass()
            defpackage.p15.a(r0)
            java.lang.String[] r2 = new java.lang.String[]{r3}
            r3 = 0
            java.lang.String r0 = "internal_randomize_mac_address"
            r1.h(r0, r2, r3)
            return
    }
}
