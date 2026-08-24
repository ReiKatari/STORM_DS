package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    public boolean A;
    public java.lang.CharSequence B;
    public java.lang.CharSequence L;
    public boolean R;
    public boolean X;

    public TwoStatePreference(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public final void e(boolean r4) {
            r3 = this;
            boolean r0 = r3.A
            r1 = 1
            if (r0 == r4) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Le
            boolean r2 = r3.R
            if (r2 != 0) goto L21
        Le:
            r3.A = r4
            r3.R = r1
            r3.persistBoolean(r4)
            if (r0 == 0) goto L21
            boolean r4 = r3.shouldDisableDependents()
            r3.notifyDependencyChange(r4)
            r3.notifyChanged()
        L21:
            return
    }

    public final void f(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.B
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.A
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.L
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.getSummary()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
    }

    @Override // androidx.preference.Preference
    public void onClick() {
            r2 = this;
            super.onClick()
            boolean r0 = r2.A
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.callChangeListener(r1)
            if (r1 == 0) goto L14
            r2.e(r0)
        L14:
            return
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object onGetDefaultValue(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<vc7> r1 = defpackage.vc7.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            vc7 r3 = (defpackage.vc7) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r3 = r3.A
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
            vc7 r0 = new vc7
            r0.<init>()
            boolean r2 = r2.A
            r0.A = r2
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(java.lang.Object r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L4:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r1 = r0.getPersistedBoolean(r1)
            r0.e(r1)
            return
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
            r4 = this;
            boolean r0 = r4.X
            boolean r1 = r4.A
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L9
            goto Le
        L9:
            if (r1 != 0) goto Ld
            r1 = r3
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 != 0) goto L18
            boolean r4 = super.shouldDisableDependents()
            if (r4 == 0) goto L17
            goto L18
        L17:
            return r2
        L18:
            return r3
    }
}
