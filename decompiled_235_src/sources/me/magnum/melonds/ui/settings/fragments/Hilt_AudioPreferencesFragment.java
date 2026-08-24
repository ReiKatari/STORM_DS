package me.magnum.melonds.ui.settings.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Hilt_AudioPreferencesFragment extends BasePreferenceFragment implements kr2 {
    public bo7 B;
    public volatile mt R;
    public boolean L = false;
    public final Object X = new Object();
    public boolean Y = false;

    @Override // defpackage.jr2
    public final Object c() {
        if (this.R == null) {
            synchronized (this.X) {
                try {
                    if (this.R == null) {
                        this.R = new mt(this);
                    }
                } finally {
                }
            }
        }
        return this.R.c();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.L) {
            return null;
        }
        j();
        return this.B;
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.T(this, super.getDefaultViewModelProviderFactory());
    }

    public final void j() {
        if (this.B == null) {
            this.B = new bo7(super.getContext(), this);
            this.L = bl2.I(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        bo7 bo7Var = this.B;
        if (bo7Var != null && mt.d(bo7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        qo2.o(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j();
        if (!this.Y) {
            this.Y = true;
            AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) this;
            ((AudioPreferencesFragment_GeneratedInjector) c()).getClass();
        }
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new bo7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        j();
        if (this.Y) {
            return;
        }
        this.Y = true;
        AudioPreferencesFragment audioPreferencesFragment = (AudioPreferencesFragment) this;
        ((AudioPreferencesFragment_GeneratedInjector) c()).getClass();
    }
}
