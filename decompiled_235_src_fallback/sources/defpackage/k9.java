package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements defpackage.a9 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ k9(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.a9
    public final void a(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.A
            r1 = 3
            java.lang.Object r13 = r13.B
            switch(r0) {
                case 0: goto Ld1;
                case 1: goto Lb1;
                case 2: goto L49;
                case 3: goto L2c;
                default: goto L8;
            }
        L8:
            r3 = r13
            me.magnum.melonds.ui.romlist.a r3 = (me.magnum.melonds.ui.romlist.a) r3
            r5 = r14
            android.net.Uri r5 = (android.net.Uri) r5
            pq5 r4 = r3.f0
            r6 = 0
            r3.f0 = r6
            if (r5 == 0) goto L2b
            if (r4 == 0) goto L2b
            hu3 r13 = r3.getViewLifecycleOwner()
            r13.getClass()
            au3 r13 = defpackage.bl2.C(r13)
            sy5 r2 = new sy5
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            defpackage.hv.L(r13, r6, r6, r2, r1)
        L2b:
            return
        L2c:
            r8 = r13
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r8 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r8
            r10 = r14
            android.net.Uri r10 = (android.net.Uri) r10
            pq5 r9 = r8.E0
            r11 = 0
            r8.E0 = r11
            if (r10 == 0) goto L48
            if (r9 == 0) goto L48
            au3 r13 = defpackage.bl2.C(r8)
            ev5 r7 = new ev5
            r12 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            defpackage.hv.L(r13, r11, r11, r7, r1)
        L48:
            return
        L49:
            wf4 r13 = (defpackage.wf4) r13
            android.net.Uri r14 = (android.net.Uri) r14
            if (r14 == 0) goto Lae
            uo7 r13 = r13.Y
            java.lang.Object r13 = r13.getValue()
            tz5 r13 = (defpackage.tz5) r13
            yj1 r0 = r13.f
            sv4 r1 = defpackage.sv4.READ_WRITE
            xj1 r0 = r0.a(r14, r1)
            xj1 r2 = defpackage.xj1.OK
            if (r0 != r2) goto La6
            wh7 r0 = r13.e
            r0.getClass()
            int r1 = r1.toFlags()
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L75
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L75
            r0.takePersistableUriPermission(r14, r1)     // Catch: java.lang.Throwable -> L75
        L75:
            kd6 r13 = r13.c
            ng6 r13 = (defpackage.ng6) r13
            r13.getClass()
            android.content.SharedPreferences r13 = r13.b
            android.content.SharedPreferences$Editor r0 = r13.edit()
            du1 r1 = defpackage.du1.A
            java.lang.String r2 = "rom_search_dirs"
            java.util.Set r13 = r13.getStringSet(r2, r1)
            if (r13 == 0) goto L93
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Set r13 = defpackage.gt0.o1(r13)
            goto L98
        L93:
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
        L98:
            java.lang.String r14 = r14.toString()
            r13.add(r14)
            r0.putStringSet(r2, r13)
            r0.apply()
            goto Lb0
        La6:
            of6 r13 = r13.z
            jg7 r14 = defpackage.jg7.a
            r13.k(r14)
            goto Lb0
        Lae:
            java.util.List r13 = defpackage.wf4.d0
        Lb0:
            return
        Lb1:
            me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment r13 = (me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment) r13
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto Ld0
            androidx.preference.ListPreference r13 = r13.Z
            if (r13 == 0) goto Ld0
            java.lang.String r14 = "DEVICE"
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r0)
            r14.getClass()
            r13.h(r14)
        Ld0:
            return
        Ld1:
            qa4 r13 = (defpackage.qa4) r13
            java.lang.Object r13 = r13.getValue()
            qn2 r13 = (defpackage.qn2) r13
            r13.g(r14)
            return
    }
}
