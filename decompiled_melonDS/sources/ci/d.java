package ci;

import a4.m0;
import a4.n0;
import a7.v;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.w;
import androidx.lifecycle.a1;
import androidx.lifecycle.s0;
import m9.o;
import me.magnum.melonds.R;
import nc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends w implements mb.c {

    /* renamed from: k0  reason: collision with root package name */
    public kb.i f2883k0;

    /* renamed from: m0  reason: collision with root package name */
    public volatile kb.g f2885m0;
    public final v p0;

    /* renamed from: q0  reason: collision with root package name */
    public a4.n f2888q0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2884l0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public final Object f2886n0 = new Object();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2887o0 = false;

    public d() {
        yb.f s10 = p7.a.s(yb.h.NONE, new m0(8, new m0(7, this)));
        this.p0 = new v(u.a(gi.a.class), new c(s10, 0), new n0(6, this, s10), new c(s10, 1));
    }

    @Override // mb.b
    public final Object d() {
        if (this.f2885m0 == null) {
            synchronized (this.f2886n0) {
                try {
                    if (this.f2885m0 == null) {
                        this.f2885m0 = new kb.g(this);
                    }
                } finally {
                }
            }
        }
        return this.f2885m0.d();
    }

    @Override // androidx.fragment.app.j0
    public final Context getContext() {
        if (super.getContext() == null && !this.f2884l0) {
            return null;
        }
        k();
        return this.f2883k0;
    }

    @Override // androidx.fragment.app.j0, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return k0.d.z(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.w
    public final Dialog i() {
        View inflate = getLayoutInflater().inflate(R.layout.dialog_cheats_import_progress, (ViewGroup) null, false);
        int i2 = R.id.progress_bar_cheat_import;
        ProgressBar progressBar = (ProgressBar) k7.w.k(inflate, R.id.progress_bar_cheat_import);
        if (progressBar != null) {
            i2 = R.id.text_cheat_import_item_name;
            TextView textView = (TextView) k7.w.k(inflate, R.id.text_cheat_import_item_name);
            if (textView != null) {
                this.f2888q0 = new a4.n((LinearLayout) inflate, progressBar, textView, 21);
                bk.a aVar = new bk.a(requireContext());
                aVar.w(R.string.importing_cheats);
                a4.n nVar = this.f2888q0;
                if (nVar != null) {
                    aVar.x((LinearLayout) nVar.B);
                    aVar.v(R.string.move_to_background, new ah.m(2));
                    ((l.d) aVar.L).m = false;
                    return aVar.i();
                }
                nc.k.f("binding");
                throw null;
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void k() {
        if (this.f2883k0 == null) {
            this.f2883k0 = new kb.i(super.getContext(), this);
            this.f2884l0 = l0.f.r(super.getContext());
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Activity activity) {
        boolean z10;
        super.onAttach(activity);
        kb.i iVar = this.f2883k0;
        if (iVar != null && kb.g.c(iVar) != activity) {
            z10 = false;
        } else {
            z10 = true;
        }
        aj.g.l(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k();
        if (!this.f2887o0) {
            this.f2887o0 = true;
            ((e) d()).getClass();
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new kb.i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onStart() {
        super.onStart();
        x.v(s0.f(this), null, null, new b(this, null, 1), 3);
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.j0
    public final void onAttach(Context context) {
        super.onAttach(context);
        k();
        if (this.f2887o0) {
            return;
        }
        this.f2887o0 = true;
        ((e) d()).getClass();
    }
}
