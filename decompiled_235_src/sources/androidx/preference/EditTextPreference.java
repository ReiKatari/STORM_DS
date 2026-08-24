package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int l = xk2.l(context, R.attr.editTextPreferenceStyle, 16842898);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.d, l, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (w31.B == null) {
                w31.B = new w31(2);
            }
            setSummaryProvider(w31.B);
        }
        obtainStyledAttributes.recycle();
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
        if (!parcelable.getClass().equals(es1.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        es1 es1Var = (es1) parcelable;
        super.onRestoreInstanceState(es1Var.getSuperState());
        e(es1Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        es1 es1Var = new es1();
        es1Var.A = this.Z;
        return es1Var;
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
