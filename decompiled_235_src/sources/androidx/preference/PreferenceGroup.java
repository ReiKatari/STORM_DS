package androidx.preference;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final ci6 A;
    public final ArrayList B;
    public boolean L;
    public int R;
    public boolean X;
    public int Y;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.A = new ci6(0);
        new Handler(Looper.getMainLooper());
        this.L = true;
        this.R = 0;
        this.X = false;
        this.Y = Integer.MAX_VALUE;
        this.B = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i75.i, i, 0);
        this.L = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && !hasKey()) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.Y = i3;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void dispatchRestoreInstanceState(Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            g(i).dispatchRestoreInstanceState(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            g(i).dispatchSaveInstanceState(bundle);
        }
    }

    public final void e(Preference preference) {
        long j;
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
                int i = this.R;
                this.R = i + 1;
                preference.setOrder(i);
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
        v15 preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 != null && this.A.containsKey(key2)) {
            j = ((Long) this.A.get(key2)).longValue();
            this.A.remove(key2);
        } else {
            synchronized (preferenceManager) {
                j = preferenceManager.b;
                preferenceManager.b = 1 + j;
            }
        }
        preference.onAttachedToHierarchy(preferenceManager, j);
        preference.assignParent(this);
        if (this.X) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
    }

    public final Preference f(CharSequence charSequence) {
        Preference f;
        if (charSequence != null) {
            if (TextUtils.equals(getKey(), charSequence)) {
                return this;
            }
            int size = this.B.size();
            for (int i = 0; i < size; i++) {
                Preference g = g(i);
                if (TextUtils.equals(g.getKey(), charSequence)) {
                    return g;
                }
                if ((g instanceof PreferenceGroup) && (f = ((PreferenceGroup) g).f(charSequence)) != null) {
                    return f;
                }
            }
            return null;
        }
        i.h("Key cannot be null");
        return null;
    }

    public final Preference g(int i) {
        return (Preference) this.B.get(i);
    }

    @Override // androidx.preference.Preference
    public final void notifyDependencyChange(boolean z) {
        super.notifyDependencyChange(z);
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            g(i).onParentChanged(this, z);
        }
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        a();
        this.X = true;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            g(i).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public final void onDetached() {
        super.onDetached();
        this.X = false;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            g(i).onDetached();
        }
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(r15.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r15 r15Var = (r15) parcelable;
        this.Y = r15Var.A;
        super.onRestoreInstanceState(r15Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new r15(this.Y);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
