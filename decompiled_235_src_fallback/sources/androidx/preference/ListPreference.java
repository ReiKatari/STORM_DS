package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ListPreference extends androidx.preference.DialogPreference {
    public java.lang.CharSequence[] Z;
    public java.lang.CharSequence[] d0;
    public java.lang.String e0;
    public java.lang.String f0;
    public boolean g0;

    public ListPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969007(0x7f0401af, float:1.7546684E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ListPreference(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            int[] r7 = defpackage.i75.e
            r0 = 0
            android.content.res.TypedArray r7 = r4.obtainStyledAttributes(r5, r7, r6, r0)
            r1 = 2
            java.lang.CharSequence[] r1 = r7.getTextArray(r1)
            if (r1 != 0) goto L15
            java.lang.CharSequence[] r1 = r7.getTextArray(r0)
        L15:
            r3.Z = r1
            r1 = 3
            java.lang.CharSequence[] r1 = r7.getTextArray(r1)
            if (r1 != 0) goto L23
            r1 = 1
            java.lang.CharSequence[] r1 = r7.getTextArray(r1)
        L23:
            r3.d0 = r1
            r1 = 4
            boolean r2 = r7.getBoolean(r1, r0)
            boolean r1 = r7.getBoolean(r1, r2)
            if (r1 == 0) goto L42
            x31 r1 = defpackage.x31.L
            if (r1 != 0) goto L3d
            x31 r1 = new x31
            r2 = 14
            r1.<init>(r2)
            defpackage.x31.L = r1
        L3d:
            x31 r1 = defpackage.x31.L
            r3.setSummaryProvider(r1)
        L42:
            r7.recycle()
            int[] r7 = defpackage.i75.g
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r7, r6, r0)
            r5 = 33
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L58
            r5 = 7
            java.lang.String r5 = r4.getString(r5)
        L58:
            r3.f0 = r5
            r4.recycle()
            return
    }

    public final int e(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L1d
            java.lang.CharSequence[] r0 = r2.d0
            if (r0 == 0) goto L1d
            int r0 = r0.length
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L1d
            java.lang.CharSequence[] r1 = r2.d0
            r1 = r1[r0]
            java.lang.String r1 = r1.toString()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L9
        L1d:
            r2 = -1
            return r2
    }

    public final java.lang.CharSequence f() {
            r1 = this;
            java.lang.String r0 = r1.e0
            int r0 = r1.e(r0)
            if (r0 < 0) goto Lf
            java.lang.CharSequence[] r1 = r1.Z
            if (r1 == 0) goto Lf
            r1 = r1[r0]
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public void g(java.lang.CharSequence[] r1) {
            r0 = this;
            r0.Z = r1
            return
    }

    @Override // androidx.preference.Preference
    public final java.lang.CharSequence getSummary() {
            r2 = this;
            a15 r0 = r2.getSummaryProvider()
            if (r0 == 0) goto Lf
            a15 r0 = r2.getSummaryProvider()
            java.lang.CharSequence r2 = r0.i(r2)
            return r2
        Lf:
            java.lang.CharSequence r0 = r2.f()
            java.lang.CharSequence r1 = super.getSummary()
            java.lang.String r2 = r2.f0
            if (r2 != 0) goto L1c
            goto L2e
        L1c:
            if (r0 != 0) goto L20
            java.lang.String r0 = ""
        L20:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = java.lang.String.format(r2, r0)
            boolean r0 = android.text.TextUtils.equals(r2, r1)
            if (r0 == 0) goto L2f
        L2e:
            return r1
        L2f:
            java.lang.String r0 = "ListPreference"
            java.lang.String r1 = "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead."
            android.util.Log.w(r0, r1)
            return r2
    }

    public final void h(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.e0
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto Lc
            boolean r1 = r2.g0
            if (r1 != 0) goto L19
        Lc:
            r2.e0 = r3
            r1 = 1
            r2.g0 = r1
            r2.persistString(r3)
            if (r0 != 0) goto L19
            r2.notifyChanged()
        L19:
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
            java.lang.Class<bx3> r1 = defpackage.bx3.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            bx3 r3 = (defpackage.bx3) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r3 = r3.A
            r2.h(r3)
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
            bx3 r0 = new bx3
            r0.<init>()
            java.lang.String r2 = r2.e0
            r0.A = r2
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r0.getPersistedString(r1)
            r0.h(r1)
            return
    }

    @Override // androidx.preference.Preference
    public final void setSummary(java.lang.CharSequence r1) {
            r0 = this;
            super.setSummary(r1)
            if (r1 != 0) goto L9
            r1 = 0
            r0.f0 = r1
            return
        L9:
            java.lang.String r1 = r1.toString()
            r0.f0 = r1
            return
    }
}
