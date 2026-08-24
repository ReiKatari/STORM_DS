package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gt implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;

    public /* synthetic */ gt(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r1, java.lang.String r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L39;
                case 1: goto L1d;
                default: goto L5;
            }
        L5:
            r1.getClass()
            java.lang.String r0 = "rom_display_name_mode"
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L1c
            java.lang.String r2 = "file_name"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r2 = r0
        L1a:
            defpackage.gi2.c = r2
        L1c:
            return
        L1d:
            r1.getClass()
            java.lang.String r0 = "button_color_theme"
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L38
            java.lang.String r2 = "cyber_cyan"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L31
            goto L32
        L31:
            r2 = r0
        L32:
            j90 r0 = defpackage.n90.b(r2)
            defpackage.n90.a = r0
        L38:
            return
        L39:
            r1.getClass()
            java.lang.String r0 = "theme"
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L5c
            java.lang.String r2 = "dark"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L4d
            goto L4e
        L4d:
            r2 = r0
        L4e:
            vs4 r0 = defpackage.ht.a
            e57 r1 = defpackage.g57.Companion
            r1.getClass()
            g57 r1 = defpackage.e57.a(r2)
            r0.setValue(r1)
        L5c:
            return
    }
}
