package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SaveFilesPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_SaveFilesPreferencesFragment implements defpackage.q15 {
    public final defpackage.ex6 Z;
    public defpackage.wh7 d0;
    public defpackage.yj1 e0;
    public defpackage.jd6 f0;

    public SaveFilesPreferencesFragment() {
            r2 = this;
            r2.<init>()
            er2 r0 = new er2
            r1 = 28
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.Z = r1
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131951759(0x7f13008f, float:1.9539942E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final defpackage.jd6 k() {
            r0 = this;
            jd6 r0 = r0.f0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "settingsBackupManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            r3 = 2132148245(0x7f160015, float:1.9938463E38)
            r2.setPreferencesFromResource(r3, r4)
            java.lang.String r3 = "sram_dir"
            androidx.preference.Preference r3 = r2.findPreference(r3)
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r3 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r3
            if (r3 == 0) goto L21
            ex6 r4 = r2.Z
            java.lang.Object r4 = r4.getValue()
            p15 r4 = (defpackage.p15) r4
            y36 r0 = new y36
            r1 = 0
            r0.<init>(r2, r1)
            r4.c(r3, r0)
        L21:
            return
    }
}
