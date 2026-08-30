package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
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

    public final void e(boolean z10) {
        boolean z11;
        if (this.A != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || !this.R) {
            this.A = z10;
            this.R = true;
            persistBoolean(z10);
            if (z11) {
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
    public final void f(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.B
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.A
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.L
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.getSummary()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.f(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        super.onClick();
        boolean z10 = !this.A;
        if (callChangeListener(Boolean.valueOf(z10))) {
            e(z10);
        }
    }

    @Override // androidx.preference.Preference
    public final Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(n0.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        e(n0Var.A);
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (isPersistent()) {
            return absSavedState;
        }
        n0 n0Var = new n0();
        n0Var.A = this.A;
        return n0Var;
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
        boolean z10 = this.X;
        boolean z11 = this.A;
        if (!z10) {
            if (!z11) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (!z11 && !super.shouldDisableDependents()) {
            return false;
        }
        return true;
    }
}
