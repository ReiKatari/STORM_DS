package com.smp.masterswitchpreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MasterSwitchPreferenceFragment extends defpackage.k15 {
    public static final com.smp.masterswitchpreference.MasterSwitchPreferenceFragment.Companion Companion = null;
    private final defpackage.go3 attrs$delegate;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(defpackage.id1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.smp.masterswitchpreference.MasterSwitchPreferenceFragment newInstance(com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r3) {
                r2 = this;
                r3.getClass()
                com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r2 = new com.smp.masterswitchpreference.MasterSwitchPreferenceFragment
                r2.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "MasterSwitchAttrs"
                r0.putParcelable(r1, r3)
                r2.setArguments(r0)
                return r2
        }
    }

    static {
            com.smp.masterswitchpreference.MasterSwitchPreferenceFragment$Companion r0 = new com.smp.masterswitchpreference.MasterSwitchPreferenceFragment$Companion
            r1 = 0
            r0.<init>(r1)
            com.smp.masterswitchpreference.MasterSwitchPreferenceFragment.Companion = r0
            return
    }

    public MasterSwitchPreferenceFragment() {
            r2 = this;
            r2.<init>()
            er2 r0 = new er2
            r1 = 8
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.attrs$delegate = r1
            return
    }

    private static final com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs attrs_delegate$lambda$0(com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r2) {
            android.os.Bundle r2 = r2.requireArguments()
            java.lang.String r0 = "MasterSwitchAttrs"
            java.lang.Class<com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs> r1 = com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.class
            java.lang.Object r2 = defpackage.nc1.R(r2, r0, r1)
            r2.getClass()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = (com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs) r2
            return r2
    }

    public static /* synthetic */ com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs h(com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r0) {
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = attrs_delegate$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ boolean i(com.smp.masterswitchpreference.MasterSwitchSwitchPreference r0, com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r1, androidx.preference.Preference r2, java.util.List r3, androidx.preference.Preference r4, java.lang.Object r5) {
            boolean r0 = setupMasterSwitch$lambda$1$1(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private final void setupExplanationText(androidx.preference.Preference r1) {
            r0 = this;
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r0.getAttrs()
            java.lang.Integer r0 = r0.getExplanationIcon()
            if (r0 == 0) goto L11
            int r0 = r0.intValue()
            r1.setIcon(r0)
        L11:
            return
    }

    private final void setupMasterSwitch(com.smp.masterswitchpreference.MasterSwitchSwitchPreference r2, androidx.preference.Preference r3, java.util.List<? extends androidx.preference.Preference> r4) {
            r1 = this;
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            r2.getClass()
            r0.getClass()
            r2.e0 = r0
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r2.h()
            java.lang.String r0 = r0.getKey()
            r2.setKey(r0)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r2.h()
            boolean r0 = r0.getDefaultValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setDefaultValue(r0)
            boolean r0 = r2.A
            java.lang.String r0 = setupMasterSwitch$titleValue(r1, r0)
            r2.setTitle(r0)
            boolean r0 = r2.A
            setupMasterSwitch$handleExplanationText(r1, r3, r4, r0)
            i14 r0 = new i14
            r0.<init>(r2, r1, r3, r4)
            r2.setOnPreferenceChangeListener(r0)
            return
    }

    private static final void setupMasterSwitch$handleExplanationText(com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r1, androidx.preference.Preference r2, java.util.List<? extends androidx.preference.Preference> r3, boolean r4) {
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            boolean r0 = r0.getHideExplanation()
            if (r0 == 0) goto Lf
            r0 = r4 ^ 1
            r2.setVisible(r0)
        Lf:
            if (r4 == 0) goto L1a
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r1 = r1.getAttrs()
            java.lang.String r1 = r1.getSwitchOnExplanationText()
            goto L22
        L1a:
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r1 = r1.getAttrs()
            java.lang.String r1 = r1.getSwitchOffExplanationText()
        L22:
            r2.setSummary(r1)
            java.util.Iterator r1 = r3.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            r2.setVisible(r4)
            goto L29
        L39:
            return
    }

    private static final boolean setupMasterSwitch$lambda$1$1(com.smp.masterswitchpreference.MasterSwitchSwitchPreference r0, com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r1, androidx.preference.Preference r2, java.util.List r3, androidx.preference.Preference r4, java.lang.Object r5) {
            r4.getClass()
            r5.getClass()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            java.lang.String r4 = setupMasterSwitch$titleValue(r1, r4)
            r0.setTitle(r4)
            boolean r4 = r5.booleanValue()
            setupMasterSwitch$handleExplanationText(r1, r2, r3, r4)
            boolean r1 = r5.booleanValue()
            setupMasterSwitch$lambda$1$setBackgroundColor(r0, r1)
            r0 = 1
            return r0
    }

    private static final void setupMasterSwitch$lambda$1$setBackgroundColor(com.smp.masterswitchpreference.MasterSwitchSwitchPreference r2, boolean r3) {
            r0 = 0
            java.lang.String r1 = "background"
            if (r3 == 0) goto L19
            android.view.View r3 = r2.f0
            if (r3 == 0) goto L15
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = r2.h()
            int r2 = r2.getSwitchOnBackgroundColor()
            r3.setBackgroundColor(r2)
            return
        L15:
            defpackage.nb3.a0(r1)
            throw r0
        L19:
            android.view.View r3 = r2.f0
            if (r3 == 0) goto L29
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = r2.h()
            int r2 = r2.getSwitchOffBackgroundColor()
            r3.setBackgroundColor(r2)
            return
        L29:
            defpackage.nb3.a0(r1)
            throw r0
    }

    private static final java.lang.String setupMasterSwitch$titleValue(com.smp.masterswitchpreference.MasterSwitchPreferenceFragment r0, boolean r1) {
            if (r1 == 0) goto Lb
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r0.getAttrs()
            java.lang.String r0 = r0.getSwitchOnText()
            return r0
        Lb:
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r0.getAttrs()
            java.lang.String r0 = r0.getSwitchOffText()
            return r0
    }

    public final com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs getAttrs() {
            r0 = this;
            go3 r0 = r0.attrs$delegate
            java.lang.Object r0 = r0.getValue()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = (com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs) r0
            return r0
    }

    @Override // defpackage.k15
    public void onCreatePreferences(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            r5 = 2132148224(0x7f160000, float:1.993842E38)
            r4.addPreferencesFromResource(r5)
            com.smp.masterswitchpreference.MasterSwitchSwitchPreference r5 = new com.smp.masterswitchpreference.MasterSwitchSwitchPreference
            android.content.Context r6 = r4.requireContext()
            r6.getClass()
            r0 = 0
            r5.<init>(r6, r0)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r6 = r4.getAttrs()
            java.lang.String r6 = r6.getKey()
            r5.setKey(r6)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r6 = r4.getAttrs()
            boolean r6 = r6.getDefaultValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.setDefaultValue(r6)
            androidx.preference.PreferenceScreen r6 = r4.getPreferenceScreen()
            r6.e(r5)
            r6 = 2132148225(0x7f160001, float:1.9938422E38)
            r4.addPreferencesFromResource(r6)
            java.lang.String r6 = "com_smp_explanation_key"
            androidx.preference.Preference r6 = r4.findPreference(r6)
            r6.getClass()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r4.getAttrs()
            java.lang.Integer r0 = r0.getIncludedPrefScreen()
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            r4.addPreferencesFromResource(r0)
        L53:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.preference.PreferenceScreen r1 = r4.getPreferenceScreen()
            java.util.ArrayList r1 = r1.B
            int r1 = r1.size()
            r2 = 2
        L63:
            if (r2 >= r1) goto L76
            androidx.preference.PreferenceScreen r3 = r4.getPreferenceScreen()
            androidx.preference.Preference r3 = r3.g(r2)
            r3.getClass()
            r0.add(r3)
            int r2 = r2 + 1
            goto L63
        L76:
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r1 = r4.getAttrs()
            java.lang.Integer r1 = r1.getExcludedPrefScreen()
            if (r1 == 0) goto L87
            int r1 = r1.intValue()
            r4.addPreferencesFromResource(r1)
        L87:
            r4.setupMasterSwitch(r5, r6, r0)
            r4.setupExplanationText(r6)
            return
    }

    @Override // defpackage.k15
    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            androidx.recyclerview.widget.RecyclerView r0 = super.onCreateRecyclerView(r1, r2, r3)
            r1 = 0
            r0.setItemAnimator(r1)
            r0.setLayoutAnimation(r1)
            return r0
    }
}
