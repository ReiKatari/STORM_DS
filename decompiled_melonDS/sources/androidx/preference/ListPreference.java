package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] Z;

    /* renamed from: b0  reason: collision with root package name */
    public final CharSequence[] f1517b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f1518c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f1519d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1520e0;

    /* JADX WARN: Type inference failed for: r2v10, types: [na.f, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1575e, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.Z = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f1517b0 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (na.f.A == null) {
                na.f.A = new Object();
            }
            setSummaryProvider(na.f.A);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j0.f1577g, i2, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f1519d0 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int e(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.f1517b0) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void f(String str) {
        boolean equals = TextUtils.equals(this.f1518c0, str);
        if (!equals || !this.f1520e0) {
            this.f1518c0 = str;
            this.f1520e0 = true;
            persistString(str);
            if (!equals) {
                notifyChanged();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence getSummary() {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        if (getSummaryProvider() != null) {
            return getSummaryProvider().c(this);
        }
        int e6 = e(this.f1518c0);
        if (e6 >= 0 && (charSequenceArr = this.Z) != null) {
            charSequence = charSequenceArr[e6];
        } else {
            charSequence = null;
        }
        CharSequence summary = super.getSummary();
        String str = this.f1519d0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String format = String.format(str, charSequence);
            if (!TextUtils.equals(format, summary)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return summary;
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(f.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        f(fVar.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        f fVar = new f();
        fVar.A = this.f1518c0;
        return fVar;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        f(getPersistedString((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.f1519d0 = null;
        } else {
            this.f1519d0 = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5.b.b(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
