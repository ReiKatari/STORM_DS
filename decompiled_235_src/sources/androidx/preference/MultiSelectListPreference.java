package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.stormds.emulator.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] Z;
    public final CharSequence[] d0;
    public final HashSet e0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int l = xk2.l(context, R.attr.dialogPreferenceStyle, 16842897);
        this.e0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.f, l, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.Z = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.d0 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    public final void e(Set set) {
        HashSet hashSet = this.e0;
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
        if (!parcelable.getClass().equals(z84.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z84 z84Var = (z84) parcelable;
        super.onRestoreInstanceState(z84Var.getSuperState());
        e(z84Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        z84 z84Var = new z84();
        z84Var.A = this.e0;
        return z84Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        e(getPersistedStringSet((Set) obj));
    }
}
