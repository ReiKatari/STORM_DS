package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RewindPreferencesFragment extends com.smp.masterswitchpreference.MasterSwitchPreferenceFragment implements defpackage.q15 {
    public static final /* synthetic */ int A = 0;

    public RewindPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952499(0x7f130373, float:1.9541442E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    public final void j(androidx.preference.Preference r7, int r8, int r9, defpackage.lj6 r10) {
            r6 = this;
            r0 = 10
            int r9 = r9 * r0
            if (r10 == 0) goto L13
            hj6 r1 = new hj6
            long r2 = r10.A
            float r10 = (float) r2
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            float r10 = r10 * r2
            long r2 = (long) r10
            r1.<init>(r2)
            goto L14
        L13:
            r1 = 0
        L14:
            int r9 = r9 / r8
            hj6 r8 = new hj6
            long r9 = (long) r9
            r2 = 20971520(0x1400000, double:1.03613076E-316)
            long r2 = r2 * r9
            r8.<init>(r2)
            android.content.Context r9 = r6.requireContext()
            r9.getClass()
            r10 = 2
            java.lang.String r8 = defpackage.oi2.x(r9, r8, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 2131952502(0x7f130376, float:1.9541449E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r6.getString(r10, r8)
            r9.append(r8)
            if (r1 == 0) goto L55
            long r4 = r1.A
            int r8 = defpackage.nb3.q(r2, r4)
            if (r8 <= 0) goto L55
            r9.append(r0)
            r8 = 2131952503(0x7f130377, float:1.954145E38)
            java.lang.String r6 = r6.getString(r8)
            r9.append(r6)
        L55:
            java.lang.String r6 = r9.toString()
            r7.setSummary(r6)
            return
    }

    @Override // com.smp.masterswitchpreference.MasterSwitchPreferenceFragment, defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r9, java.lang.String r10) {
            r8 = this;
            super.onCreatePreferences(r9, r10)
            java.lang.String r9 = "rewind_period"
            androidx.preference.Preference r9 = r8.findPreference(r9)
            r9.getClass()
            r3 = r9
            androidx.preference.SeekBarPreference r3 = (androidx.preference.SeekBarPreference) r3
            java.lang.String r9 = "rewind_window"
            androidx.preference.Preference r9 = r8.findPreference(r9)
            r9.getClass()
            r5 = r9
            androidx.preference.SeekBarPreference r5 = (androidx.preference.SeekBarPreference) r5
            java.lang.String r9 = "rewind_info"
            androidx.preference.Preference r2 = r8.findPreference(r9)
            r2.getClass()
            android.content.Context r9 = r8.requireContext()
            r9.getClass()
            java.lang.Class<android.app.ActivityManager> r10 = android.app.ActivityManager.class
            java.lang.Object r9 = r9.getSystemService(r10)
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9
            if (r9 == 0) goto L46
            android.app.ActivityManager$MemoryInfo r10 = new android.app.ActivityManager$MemoryInfo
            r10.<init>()
            r9.getMemoryInfo(r10)
            hj6 r9 = new hj6
            long r0 = r10.totalMem
            r9.<init>(r0)
        L44:
            r4 = r9
            goto L48
        L46:
            r9 = 0
            goto L44
        L48:
            up5 r0 = new up5
            r6 = 0
            r1 = r5
            r5 = r3
            r3 = r1
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = r5
            r5 = r3
            r3 = r7
            r3.setOnPreferenceChangeListener(r0)
            up5 r0 = new up5
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5.setOnPreferenceChangeListener(r0)
            int r8 = r3.A
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r9 = 2131952508(0x7f13037c, float:1.954146E38)
            java.lang.String r8 = r1.getString(r9, r8)
            r3.setSummary(r8)
            int r8 = r5.A
            int r8 = r8 * 10
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r1.getString(r9, r8)
            r5.setSummary(r8)
            int r8 = r3.A
            int r9 = r5.A
            r1.j(r2, r8, r9, r4)
            return
    }
}
