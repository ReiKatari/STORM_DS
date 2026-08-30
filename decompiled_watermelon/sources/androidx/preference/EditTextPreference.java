package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969046(0x7f0401d6, float:1.7546763E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = defpackage.gk2.M(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = defpackage.xx4.d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2e
            vn1 r5 = defpackage.vn1.B
            if (r5 != 0) goto L29
            vn1 r5 = new vn1
            r5.<init>(r2)
            defpackage.vn1.B = r5
        L29:
            vn1 r5 = defpackage.vn1.B
            r3.setSummaryProvider(r5)
        L2e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void e(String str) {
        boolean shouldDisableDependents = shouldDisableDependents();
        this.Z = str;
        persistString(str);
        boolean shouldDisableDependents2 = shouldDisableDependents();
        if (shouldDisableDependents2 != shouldDisableDependents) {
            notifyDependencyChange(shouldDisableDependents2);
        }
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(un1.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        un1 un1Var = (un1) parcelable;
        super.onRestoreInstanceState(un1Var.getSuperState());
        e(un1Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        un1 un1Var = new un1();
        un1Var.A = this.Z;
        return un1Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        e(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
        if (!TextUtils.isEmpty(this.Z) && !super.shouldDisableDependents()) {
            return false;
        }
        return true;
    }
}
