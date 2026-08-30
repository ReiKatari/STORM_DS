package me.magnum.melonds.ui.settings.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class Hilt_CustomFirmwarePreferencesFragment extends BasePreferenceFragment implements mb.c {
    public kb.i A;
    public volatile kb.g L;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;

    @Override // mb.b
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new kb.g(this);
                    }
                } finally {
                }
            }
        }
        return this.L.d();
    }

    @Override // androidx.fragment.app.j0
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.j0, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return k0.d.z(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new kb.i(super.getContext(), this);
            this.B = l0.f.r(super.getContext());
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Activity activity) {
        boolean z10;
        super.onAttach(activity);
        kb.i iVar = this.A;
        if (iVar != null && kb.g.c(iVar) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        aj.g.l(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (!this.X) {
            this.X = true;
            ((CustomFirmwarePreferencesFragment_GeneratedInjector) d()).e((CustomFirmwarePreferencesFragment) this);
        }
    }

    @Override // androidx.fragment.app.j0
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new kb.i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.X) {
            return;
        }
        this.X = true;
        ((CustomFirmwarePreferencesFragment_GeneratedInjector) d()).e((CustomFirmwarePreferencesFragment) this);
    }
}
