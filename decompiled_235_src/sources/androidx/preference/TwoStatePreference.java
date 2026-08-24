package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean A;
    public CharSequence B;
    public CharSequence L;
    public boolean R;
    public boolean X;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public final void e(boolean z) {
        boolean z2;
        if (this.A != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !this.R) {
            this.A = z;
            this.R = true;
            persistBoolean(z);
            if (z2) {
                notifyDependencyChange(shouldDisableDependents());
                notifyChanged();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(View view) {
        boolean z;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.A && !TextUtils.isEmpty(this.B)) {
                textView.setText(this.B);
            } else if (!this.A && !TextUtils.isEmpty(this.L)) {
                textView.setText(this.L);
            } else {
                z = true;
                if (z) {
                    CharSequence summary = getSummary();
                    if (!TextUtils.isEmpty(summary)) {
                        textView.setText(summary);
                        z = false;
                    }
                }
                if (z) {
                    i = 8;
                }
                if (i == textView.getVisibility()) {
                    textView.setVisibility(i);
                    return;
                }
                return;
            }
            z = false;
            if (z) {
            }
            if (z) {
            }
            if (i == textView.getVisibility()) {
            }
        }
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        super.onClick();
        boolean z = !this.A;
        if (callChangeListener(Boolean.valueOf(z))) {
            e(z);
        }
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(vc7.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vc7 vc7Var = (vc7) parcelable;
        super.onRestoreInstanceState(vc7Var.getSuperState());
        e(vc7Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        vc7 vc7Var = new vc7();
        vc7Var.A = this.A;
        return vc7Var;
    }

    @Override // androidx.preference.Preference
    public final void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        e(getPersistedBoolean(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean shouldDisableDependents() {
        boolean z = this.X;
        boolean z2 = this.A;
        if (!z) {
            if (!z2) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z2 && !super.shouldDisableDependents()) {
            return false;
        }
        return true;
    }
}
