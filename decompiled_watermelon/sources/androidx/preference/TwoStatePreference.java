package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.B
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.A
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.L
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.getSummary()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.f(android.view.View):void");
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
        if (!parcelable.getClass().equals(az6.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        az6 az6Var = (az6) parcelable;
        super.onRestoreInstanceState(az6Var.getSuperState());
        e(az6Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        az6 az6Var = new az6();
        az6Var.A = this.A;
        return az6Var;
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
