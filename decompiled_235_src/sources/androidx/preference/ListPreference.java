package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] Z;
    public CharSequence[] d0;
    public String e0;
    public String f0;
    public boolean g0;

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.Z = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.d0 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (x31.L == null) {
                x31.L = new x31(14);
            }
            setSummaryProvider(x31.L);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i75.g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f0 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int e(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.d0) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.d0[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public final CharSequence f() {
        CharSequence[] charSequenceArr;
        int e = e(this.e0);
        if (e >= 0 && (charSequenceArr = this.Z) != null) {
            return charSequenceArr[e];
        }
        return null;
    }

    public void g(CharSequence[] charSequenceArr) {
        this.Z = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    public final CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().i(this);
        }
        CharSequence f = f();
        CharSequence summary = super.getSummary();
        String str = this.f0;
        if (str != null) {
            if (f == null) {
                f = "";
            }
            String format = String.format(str, f);
            if (!TextUtils.equals(format, summary)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return summary;
    }

    public final void h(String str) {
        boolean equals = TextUtils.equals(this.e0, str);
        if (!equals || !this.g0) {
            this.e0 = str;
            this.g0 = true;
            persistString(str);
            if (!equals) {
                notifyChanged();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(bx3.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bx3 bx3Var = (bx3) parcelable;
        super.onRestoreInstanceState(bx3Var.getSuperState());
        h(bx3Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        bx3 bx3Var = new bx3();
        bx3Var.A = this.e0;
        return bx3Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        h(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.f0 = null;
        } else {
            this.f0 = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xk2.l(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }
}
