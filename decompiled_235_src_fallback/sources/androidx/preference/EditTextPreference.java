package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    public java.lang.String Z;

    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130969049(0x7f0401d9, float:1.7546769E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.xk2.l(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.i75.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2f
            w31 r5 = defpackage.w31.B
            if (r5 != 0) goto L2a
            w31 r5 = new w31
            r0 = 2
            r5.<init>(r0)
            defpackage.w31.B = r5
        L2a:
            w31 r5 = defpackage.w31.B
            r3.setSummaryProvider(r5)
        L2f:
            r4.recycle()
            return
    }

    public final void e(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.shouldDisableDependents()
            r1.Z = r2
            r1.persistString(r2)
            boolean r2 = r1.shouldDisableDependents()
            if (r2 == r0) goto L12
            r1.notifyDependencyChange(r2)
        L12:
            r1.notifyChanged()
            return
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object onGetDefaultValue(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            java.lang.String r0 = r1.getString(r2)
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<es1> r1 = defpackage.es1.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            es1 r3 = (defpackage.es1) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r3 = r3.A
            r2.e(r3)
            return
    }

    @Override // androidx.preference.Preference
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            super.onSaveInstanceState()
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            boolean r1 = r2.isPersistent()
            if (r1 == 0) goto Lc
            return r0
        Lc:
            es1 r0 = new es1
            r0.<init>()
            java.lang.String r2 = r2.Z
            r0.A = r2
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r0.getPersistedString(r1)
            r0.e(r1)
            return
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
            r1 = this;
            java.lang.String r0 = r1.Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            boolean r1 = super.shouldDisableDependents()
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }
}
