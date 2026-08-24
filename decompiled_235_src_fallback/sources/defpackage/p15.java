package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p15  reason: default package */
/* loaded from: classes.dex */
public final class p15 {
    public static final defpackage.l15 d = null;
    public final defpackage.k15 a;
    public final defpackage.wh7 b;
    public final defpackage.yj1 c;

    static {
            l15 r0 = new l15
            r1 = 0
            r0.<init>(r1)
            defpackage.p15.d = r0
            return
    }

    public p15(defpackage.k15 r1, defpackage.wh7 r2, defpackage.yj1 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static void a(androidx.preference.Preference r4) {
            if (r4 != 0) goto L3
            return
        L3:
            l15 r0 = defpackage.p15.d
            defpackage.yh2.g(r4, r0)
            boolean r1 = r4 instanceof me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
            r2 = 0
            if (r1 == 0) goto L21
            r1 = r4
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r1 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r1
            android.content.Context r3 = r1.getContext()
            android.content.SharedPreferences r3 = defpackage.v15.a(r3)
            java.lang.String r1 = r1.getKey()
            java.util.Set r1 = r3.getStringSet(r1, r2)
            goto L4e
        L21:
            boolean r1 = r4 instanceof com.smp.masterswitchpreference.MasterSwitchPreference
            if (r1 == 0) goto L3e
            r1 = r4
            com.smp.masterswitchpreference.MasterSwitchPreference r1 = (com.smp.masterswitchpreference.MasterSwitchPreference) r1
            android.content.Context r2 = r1.getContext()
            android.content.SharedPreferences r2 = defpackage.v15.a(r2)
            java.lang.String r1 = r1.getKey()
            r3 = 0
            boolean r1 = r2.getBoolean(r1, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L4e
        L3e:
            android.content.Context r1 = r4.getContext()
            android.content.SharedPreferences r1 = defpackage.v15.a(r1)
            java.lang.String r3 = r4.getKey()
            java.lang.String r1 = r1.getString(r3, r2)
        L4e:
            r0.a(r4, r1)
            return
    }

    public static java.lang.String b(android.content.Context r1, java.lang.String r2) {
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r0 = defpackage.l.s(r1, r2)
            if (r0 != 0) goto L22
            qi6 r1 = defpackage.zl1.h(r1, r2)
            java.lang.String r1 = r1.i()
            if (r1 != 0) goto L21
            java.lang.String r1 = r2.getLastPathSegment()
            if (r1 != 0) goto L21
            java.lang.String r1 = r2.toString()
            r1.getClass()
        L21:
            return r1
        L22:
            return r0
    }

    public final void c(me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r6, defpackage.eo2 r7) {
            r5 = this;
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r0 = r6.B
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference$a r1 = me.magnum.melonds.ui.settings.preferences.StoragePickerPreference.a.FILE
            r2 = 3
            k15 r3 = r5.a
            if (r0 != r1) goto L35
            a(r6)
            zj1 r7 = new zj1
            sv4 r0 = r6.L
            r1 = 1
            r7.<init>(r0, r1)
            o15 r0 = new o15
            r0.<init>(r6)
            d9 r7 = r3.registerForActivityResult(r7, r0)
            r7.getClass()
            pk0 r0 = new pk0
            r0.<init>(r2, r7, r6)
            r6.setOnPreferenceClickListener(r0)
            boolean r7 = r6.R
            if (r7 == 0) goto L60
            n15 r7 = new n15
            r7.<init>(r5, r6, r1)
            defpackage.yh2.g(r6, r7)
            return
        L35:
            a(r6)
            zj1 r0 = new zj1
            sv4 r1 = r6.L
            r4 = 0
            r0.<init>(r1, r4)
            m15 r1 = new m15
            r1.<init>(r5, r6, r7)
            d9 r7 = r3.registerForActivityResult(r0, r1)
            r7.getClass()
            em2 r0 = new em2
            r0.<init>(r6, r5, r7, r2)
            r6.setOnPreferenceClickListener(r0)
            boolean r7 = r6.R
            if (r7 == 0) goto L60
            n15 r7 = new n15
            r7.<init>(r5, r6, r4)
            defpackage.yh2.g(r6, r7)
        L60:
            return
    }
}
