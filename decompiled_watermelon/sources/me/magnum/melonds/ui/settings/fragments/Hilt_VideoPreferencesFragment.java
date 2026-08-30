package me.magnum.melonds.ui.settings.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class Hilt_VideoPreferencesFragment extends BasePreferenceFragment implements el2 {
    public ba7 B;
    public volatile ws R;
    public boolean L = false;
    public final Object X = new Object();
    public boolean Y = false;

    @Override // defpackage.dl2
    public final Object d() {
        if (this.R == null) {
            synchronized (this.X) {
                try {
                    if (this.R == null) {
                        this.R = new ws(this);
                    }
                } finally {
                }
            }
        }
        return this.R.d();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.L) {
            return null;
        }
        j();
        return this.B;
    }

    @Override // androidx.fragment.app.o, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.N(this, super.getDefaultViewModelProviderFactory());
    }

    public final void j() {
        if (this.B == null) {
            this.B = new ba7(super.getContext(), this);
            this.L = cg2.K(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ba7 ba7Var = this.B;
        if (ba7Var != null && ws.c(ba7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        jk2.n(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j();
        if (!this.Y) {
            this.Y = true;
            ((VideoPreferencesFragment_GeneratedInjector) d()).h((VideoPreferencesFragment) this);
        }
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ba7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        j();
        if (this.Y) {
            return;
        }
        this.Y = true;
        ((VideoPreferencesFragment_GeneratedInjector) d()).h((VideoPreferencesFragment) this);
    }
}
