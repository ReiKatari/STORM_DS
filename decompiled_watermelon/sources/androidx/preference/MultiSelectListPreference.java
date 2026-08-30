package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] Z;
    public final CharSequence[] c0;
    public final HashSet d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969004(0x7f0401ac, float:1.7546678E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.gk2.M(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.d0 = r1
            int[] r1 = defpackage.xx4.f
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
            r3.c0 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void e(Set set) {
        HashSet hashSet = this.d0;
        hashSet.clear();
        hashSet.addAll(set);
        persistStringSet(set);
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(t04.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t04 t04Var = (t04) parcelable;
        super.onRestoreInstanceState(t04Var.getSuperState());
        e(t04Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        t04 t04Var = new t04();
        t04Var.A = this.d0;
        return t04Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        e(getPersistedStringSet((Set) obj));
    }
}
