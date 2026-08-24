package com.smp.masterswitchpreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MasterSwitchPreference extends androidx.preference.Preference {
    public MasterSwitchPreference(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2)
            r0.inflateAttrs(r2)
            return
    }

    public MasterSwitchPreference(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            r1.inflateAttrs(r3)
            return
    }

    public MasterSwitchPreference(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r2, r3, r4)
            r0.inflateAttrs(r2)
            return
    }

    public MasterSwitchPreference(android.content.Context r2, com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1.<init>(r2, r0)
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r2 = "MasterSwitchAttrs"
            r1.putParcelable(r2, r3)
            return
    }

    private final com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs getAttrs() {
            r2 = this;
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r0 = "MasterSwitchAttrs"
            java.lang.Class<com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs> r1 = com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs.class
            java.lang.Object r2 = defpackage.nc1.R(r2, r0, r1)
            r2.getClass()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r2 = (com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs) r2
            return r2
    }

    private final void inflateAttrs(android.util.AttributeSet r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int[] r3 = defpackage.b75.a
            r4 = 0
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r1, r3, r4, r4)
            r2.getClass()
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int[] r5 = defpackage.i75.g
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r1, r5, r4, r4)
            r1.getClass()
            r3 = 3
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r5 = r2.getString(r4)
            r6 = 1
            java.lang.String r6 = r2.getString(r6)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r7 = new com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs
            r24 = 65535(0xffff, float:9.1834E-41)
            r25 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 12
            int r9 = r7.getSwitchThumbColor()
            int r11 = r2.getColor(r8, r9)
            int r8 = r7.getSwitchTrackColor()
            r9 = 13
            int r12 = r2.getColor(r9, r8)
            r8 = 8
            int r10 = r7.getSwitchOnBackgroundColor()
            int r13 = r2.getColor(r8, r10)
            r8 = 5
            int r10 = r7.getSwitchOffBackgroundColor()
            int r14 = r2.getColor(r8, r10)
            int r8 = r7.getSwitchTextColor()
            r10 = 11
            int r15 = r2.getColor(r10, r8)
            r8 = 6
            java.lang.String r8 = r2.getString(r8)
            if (r8 != 0) goto L93
            java.lang.String r8 = r7.getSwitchOffExplanationText()
        L93:
            r16 = r8
            r8 = 9
            java.lang.String r8 = r2.getString(r8)
            if (r8 != 0) goto La1
            java.lang.String r8 = r7.getSwitchOnExplanationText()
        La1:
            r17 = r8
            java.lang.String r8 = "xml"
            java.lang.Integer r3 = inflateAttrs$lambda$0$resInt(r0, r3, r8)
            if (r3 != 0) goto Laf
            java.lang.Integer r3 = r7.getIncludedPrefScreen()
        Laf:
            r18 = r3
            java.lang.Integer r3 = inflateAttrs$lambda$0$resInt(r0, r5, r8)
            if (r3 != 0) goto Lbb
            java.lang.Integer r3 = r7.getExcludedPrefScreen()
        Lbb:
            r19 = r3
            r3 = 10
            java.lang.String r3 = r2.getString(r3)
            if (r3 != 0) goto Lc9
            java.lang.String r3 = r7.getSwitchOnText()
        Lc9:
            r20 = r3
            r3 = 7
            java.lang.String r3 = r2.getString(r3)
            if (r3 != 0) goto Ld6
            java.lang.String r3 = r7.getSwitchOffText()
        Ld6:
            r21 = r3
            java.lang.String r3 = r0.getKey()
            if (r3 != 0) goto Le2
            java.lang.String r3 = r7.getKey()
        Le2:
            r23 = r3
            r3 = 18
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto Lf3
            boolean r3 = r1.getBoolean(r3, r4)
        Lf0:
            r24 = r3
            goto L103
        Lf3:
            boolean r3 = r1.hasValue(r10)
            if (r3 == 0) goto Lfe
            boolean r3 = r1.getBoolean(r10, r4)
            goto Lf0
        Lfe:
            boolean r3 = r7.getDefaultValue()
            goto Lf0
        L103:
            r3 = 2
            boolean r4 = r7.getHideExplanation()
            boolean r22 = r2.getBoolean(r3, r4)
            java.lang.String r3 = "drawable"
            java.lang.Integer r3 = inflateAttrs$lambda$0$resInt(r0, r6, r3)
            if (r3 != 0) goto L118
            java.lang.Integer r3 = r7.getExplanationIcon()
        L118:
            r25 = r3
            r3 = 4
            boolean r4 = r7.getShowStatus()
            boolean r26 = r2.getBoolean(r3, r4)
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r10 = new com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = 22
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L135
            java.lang.String r3 = r1.getString(r3)
            goto L14a
        L135:
            boolean r3 = r1.hasValue(r9)
            if (r3 == 0) goto L140
            java.lang.String r3 = r1.getString(r9)
            goto L14a
        L140:
            java.lang.Class<com.smp.masterswitchpreference.MasterSwitchPreferenceFragment> r3 = com.smp.masterswitchpreference.MasterSwitchPreferenceFragment.class
            ar0 r3 = defpackage.gh5.a(r3)
            java.lang.String r3 = r3.b()
        L14a:
            boolean r4 = r10.getDefaultValue()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.setDefaultValue(r4)
            java.lang.String r4 = r10.getKey()
            r0.setKey(r4)
            r0.setFragment(r3)
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r3 = "MasterSwitchAttrs"
            r0.putParcelable(r3, r10)
            r2.recycle()
            r1.recycle()
            return
    }

    private static final java.lang.Integer inflateAttrs$lambda$0$resInt(com.smp.masterswitchpreference.MasterSwitchPreference r3, java.lang.String r4, java.lang.String r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = r0.getName()
            r4.getClass()
            java.lang.String r0 = "."
            r1 = 6
            r2 = 0
            int r0 = defpackage.qs6.y0(r4, r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto L1c
            goto L20
        L1c:
            java.lang.String r4 = r4.substring(r2, r0)
        L20:
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = r3.getPackageName()
            int r3 = r0.getIdentifier(r4, r5, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    private final void setupStatus() {
            r1 = this;
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            boolean r0 = r0.getShowStatus()
            if (r0 == 0) goto L2c
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            boolean r0 = r0.getDefaultValue()
            boolean r0 = r1.getPersistedBoolean(r0)
            if (r0 == 0) goto L21
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            java.lang.String r0 = r0.getSwitchOnText()
            goto L29
        L21:
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r0 = r1.getAttrs()
            java.lang.String r0 = r0.getSwitchOffText()
        L29:
            r1.setSummary(r0)
        L2c:
            return
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
            r0 = this;
            r0.a()
            r0.setupStatus()
            return
    }

    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            if (r3 == 0) goto L24
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<cz7> r1 = defpackage.cz7.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            cz7 r3 = (defpackage.cz7) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            android.os.Bundle r2 = r2.getExtras()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r3 = r3.A
            java.lang.String r0 = "MasterSwitchAttrs"
            r2.putParcelable(r0, r3)
            return
        L24:
            super.onRestoreInstanceState(r3)
            return
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            super.onSaveInstanceState()
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            cz7 r0 = new cz7
            r0.<init>()
            com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs r1 = r1.getAttrs()
            r0.A = r1
            return r0
    }
}
