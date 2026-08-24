package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.mc1(c = "me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1", f = "CustomFirmwarePreferencesFragment.kt", l = {63}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class CustomFirmwarePreferencesFragment$onCreatePreferences$1$1 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment Y;
    public final /* synthetic */ android.app.ProgressDialog Z;
    public final /* synthetic */ me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference d0;

    public CustomFirmwarePreferencesFragment$onCreatePreferences$1$1(me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r1, android.app.ProgressDialog r2, me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r3, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1 r0 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1 r4 = new me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$1$1
            android.app.ProgressDialog r0 = r2.Z
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r1 = r2.d0
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r2 = r2.Y
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            android.app.ProgressDialog r2 = r7.Z
            r3 = 0
            r4 = 1
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r5 = r7.Y
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L16
            defpackage.oi2.Y(r8)
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r8 = r8.A
            goto L32
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L1c:
            defpackage.oi2.Y(r8)
            m40 r8 = r5.g0
            if (r8 == 0) goto Lb0
            i81 r1 = new i81
            r6 = 0
            r1.<init>(r5, r2, r6)
            r7.X = r4
            java.lang.Object r8 = r8.e(r1, r7)
            if (r8 != r0) goto L32
            return r0
        L32:
            r2.dismiss()
            boolean r0 = r8 instanceof defpackage.em5
            r1 = 2131952357(0x7f1302e5, float:1.9541154E38)
            if (r0 != 0) goto L82
            defpackage.oi2.Y(r8)
            java.io.File r8 = (java.io.File) r8
            android.net.Uri r0 = android.net.Uri.fromFile(r8)
            java.lang.String r2 = "use_custom_bios"
            androidx.preference.Preference r2 = r5.findPreference(r2)
            androidx.preference.SwitchPreference r2 = (androidx.preference.SwitchPreference) r2
            if (r2 == 0) goto L52
            r2.e(r4)
        L52:
            me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference r7 = r7.d0
            r7.f(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r7.setSummary(r0)
            zb r7 = new zb
            android.content.Context r0 = r5.requireContext()
            r7.<init>(r0)
            java.lang.Object r0 = r7.L
            wb r0 = (defpackage.wb) r0
            java.lang.String r2 = "Успешно"
            r0.d = r2
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.String r2 = "Файлы BIOS DS (bios7.bin, bios9.bin, firmware.bin) успешно скачаны и настроены!\n\nПапка: "
            java.lang.String r8 = defpackage.i61.m(r2, r8)
            r0.f = r8
            r7.y(r1, r3)
            r7.B()
            goto Lad
        L82:
            zb r7 = new zb
            android.content.Context r0 = r5.requireContext()
            r7.<init>(r0)
            java.lang.Object r0 = r7.L
            wb r0 = (defpackage.wb) r0
            java.lang.String r2 = "Ошибка"
            r0.d = r2
            java.lang.Throwable r8 = defpackage.hm5.a(r8)
            if (r8 == 0) goto L9e
            java.lang.String r8 = r8.getLocalizedMessage()
            goto L9f
        L9e:
            r8 = r3
        L9f:
            java.lang.String r2 = "Не удалось скачать файлы BIOS: "
            java.lang.String r8 = defpackage.i61.m(r2, r8)
            r0.f = r8
            r7.y(r1, r3)
            r7.B()
        Lad:
            jg7 r7 = defpackage.jg7.a
            return r7
        Lb0:
            java.lang.String r7 = "biosDownloadManager"
            defpackage.nb3.a0(r7)
            throw r3
    }
}
