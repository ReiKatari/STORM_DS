package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
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
            int r0 = p5.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.preference.j0.f1574d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L30
            x8.e r5 = x8.e.B
            if (r5 != 0) goto L2b
            x8.e r5 = new x8.e
            r0 = 8
            r5.<init>(r0)
            x8.e.B = r5
        L2b:
            x8.e r5 = x8.e.B
            r3.setSummaryProvider(r5)
        L30:
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
    public final Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        e(cVar.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        c cVar = new c();
        cVar.A = this.Z;
        return cVar;
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
