package androidx.preference;

import a1.w0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final w0 A;
    public final ArrayList B;
    public boolean L;
    public int R;
    public boolean X;
    public int Y;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i10) {
        super(context, attributeSet, i2, 0);
        this.A = new w0(0);
        new Handler(Looper.getMainLooper());
        this.L = true;
        this.R = 0;
        this.X = false;
        this.Y = Preference.DEFAULT_ORDER;
        this.B = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1579i, i2, 0);
        this.L = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i11 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Preference.DEFAULT_ORDER));
            if (i11 != Integer.MAX_VALUE && !hasKey()) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.Y = i11;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void dispatchRestoreInstanceState(Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(i2).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(i2).dispatchSaveInstanceState(bundle);
        }
    }

    public final void e(Preference preference) {
        long j2;
        if (this.B.contains(preference)) {
            return;
        }
        if (preference.getKey() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.getParent() != null) {
                preferenceGroup = preferenceGroup.getParent();
            }
            String key = preference.getKey();
            if (preferenceGroup.f(key) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.L) {
                int i2 = this.R;
                this.R = i2 + 1;
                preference.setOrder(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).L = this.L;
            }
        }
        int binarySearch = Collections.binarySearch(this.B, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        preference.onParentChanged(this, shouldDisableDependents());
        synchronized (this) {
            this.B.add(binarySearch, preference);
        }
        f0 preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 != null && this.A.containsKey(key2)) {
            j2 = ((Long) this.A.get(key2)).longValue();
            this.A.remove(key2);
        } else {
            synchronized (preferenceManager) {
                j2 = preferenceManager.f1552b;
                preferenceManager.f1552b = 1 + j2;
            }
        }
        preference.onAttachedToHierarchy(preferenceManager, j2);
        preference.assignParent(this);
        if (this.X) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
    }

    public final Preference f(CharSequence charSequence) {
        Preference f8;
        if (charSequence != null) {
            if (TextUtils.equals(getKey(), charSequence)) {
                return this;
            }
            int size = this.B.size();
            for (int i2 = 0; i2 < size; i2++) {
                Preference g10 = g(i2);
                if (TextUtils.equals(g10.getKey(), charSequence)) {
                    return g10;
                }
                if ((g10 instanceof PreferenceGroup) && (f8 = ((PreferenceGroup) g10).f(charSequence)) != null) {
                    return f8;
                }
            }
            return null;
        }
        a0.j.h("Key cannot be null");
        return null;
    }

    public final Preference g(int i2) {
        return (Preference) this.B.get(i2);
    }

    @Override // androidx.preference.Preference
    public final void notifyDependencyChange(boolean z10) {
        super.notifyDependencyChange(z10);
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(i2).onParentChanged(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        a();
        this.X = true;
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(i2).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public final void onDetached() {
        super.onDetached();
        this.X = false;
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            g(i2).onDetached();
        }
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(b0.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b0 b0Var = (b0) parcelable;
        this.Y = b0Var.A;
        super.onRestoreInstanceState(b0Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new b0(this.Y);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
