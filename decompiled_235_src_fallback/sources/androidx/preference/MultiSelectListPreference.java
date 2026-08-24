package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    public final java.lang.CharSequence[] Z;
    public final java.lang.CharSequence[] d0;
    public final java.util.HashSet e0;

    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130969007(0x7f0401af, float:1.7546684E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.xk2.l(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.e0 = r1
            int[] r1 = defpackage.i75.f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L26
            java.lang.CharSequence[] r5 = r4.getTextArray(r2)
        L26:
            r3.Z = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L34
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L34:
            r3.d0 = r5
            r4.recycle()
            return
    }

    public final void e(java.util.Set r2) {
            r1 = this;
            java.util.HashSet r0 = r1.e0
            r0.clear()
            r0.addAll(r2)
            r1.persistStringSet(r2)
            r1.notifyChanged()
            return
    }

    @Override // androidx.preference.Preference
    public final java.lang.Object onGetDefaultValue(android.content.res.TypedArray r3, int r4) {
            r2 = this;
            java.lang.CharSequence[] r2 = r3.getTextArray(r4)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r4 = r2.length
            r0 = 0
        Lb:
            if (r0 >= r4) goto L19
            r1 = r2[r0]
            java.lang.String r1 = r1.toString()
            r3.add(r1)
            int r0 = r0 + 1
            goto Lb
        L19:
            return r3
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<z84> r1 = defpackage.z84.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            z84 r3 = (defpackage.z84) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            java.util.HashSet r3 = r3.A
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
            z84 r0 = new z84
            r0.<init>()
            java.util.HashSet r2 = r2.e0
            r0.A = r2
            return r0
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = r0.getPersistedStringSet(r1)
            r0.e(r1)
            return
    }
}
