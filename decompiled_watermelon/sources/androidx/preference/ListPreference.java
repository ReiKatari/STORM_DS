package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] Z;
    public CharSequence[] c0;
    public String d0;
    public String e0;
    public boolean f0;

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xx4.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.Z = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.c0 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (jo1.L == null) {
                jo1.L = new jo1(12);
            }
            setSummaryProvider(jo1.L);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, xx4.g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.e0 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int e(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.c0) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.c0[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public final CharSequence f() {
        CharSequence[] charSequenceArr;
        int e = e(this.d0);
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
            return getSummaryProvider().k(this);
        }
        CharSequence f = f();
        CharSequence summary = super.getSummary();
        String str = this.e0;
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
        boolean equals = TextUtils.equals(this.d0, str);
        if (!equals || !this.f0) {
            this.d0 = str;
            this.f0 = true;
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
        if (!parcelable.getClass().equals(zp3.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zp3 zp3Var = (zp3) parcelable;
        super.onRestoreInstanceState(zp3Var.getSuperState());
        h(zp3Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        zp3 zp3Var = new zp3();
        zp3Var.A = this.d0;
        return zp3Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        h(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.e0 = null;
        } else {
            this.e0 = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gk2.M(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }
}
