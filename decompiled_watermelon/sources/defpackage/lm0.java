package defpackage;

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
import androidx.fragment.app.i;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lm0  reason: default package */
/* loaded from: classes.dex */
public final class lm0 extends i implements el2 {
    public ba7 l0;
    public volatile ws n0;
    public final va7 q0;
    public os r0;
    public boolean m0 = false;
    public final Object o0 = new Object();
    public boolean p0 = false;

    public lm0() {
        gh3 H = yf2.H(wk3.NONE, new dj(5, new dj(4, this)));
        this.q0 = new va7(q75.a(wm0.class), new km0(H, 0), new wd(4, this, H), new km0(H, 1));
    }

    @Override // defpackage.dl2
    public final Object d() {
        if (this.n0 == null) {
            synchronized (this.o0) {
                try {
                    if (this.n0 == null) {
                        this.n0 = new ws(this);
                    }
                } finally {
                }
            }
        }
        return this.n0.d();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.m0) {
            return null;
        }
        k();
        return this.l0;
    }

    @Override // androidx.fragment.app.o, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.N(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.i
    public final Dialog i() {
        View inflate = getLayoutInflater().inflate(R.layout.dialog_cheats_import_progress, (ViewGroup) null, false);
        int i = R.id.progress_bar_cheat_import;
        ProgressBar progressBar = (ProgressBar) ep2.r(inflate, R.id.progress_bar_cheat_import);
        if (progressBar != null) {
            i = R.id.text_cheat_import_item_name;
            TextView textView = (TextView) ep2.r(inflate, R.id.text_cheat_import_item_name);
            if (textView != null) {
                this.r0 = new os((LinearLayout) inflate, progressBar, textView, 12);
                sb sbVar = new sb(requireContext());
                sbVar.A(R.string.importing_cheats);
                os osVar = this.r0;
                if (osVar != null) {
                    sbVar.B((LinearLayout) osVar.B);
                    sbVar.z(R.string.move_to_background, new hm0(0));
                    ((pb) sbVar.L).m = false;
                    return sbVar.l();
                }
                b53.g0("binding");
                throw null;
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final void k() {
        if (this.l0 == null) {
            this.l0 = new ba7(super.getContext(), this);
            this.m0 = cg2.K(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ba7 ba7Var = this.l0;
        if (ba7Var != null && ws.c(ba7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        jk2.n(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        k();
        if (!this.p0) {
            this.p0 = true;
            ((mm0) d()).getClass();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ba7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        tq5.w(hk2.y(this), null, null, new jm0(this, null, 1), 3);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        k();
        if (this.p0) {
            return;
        }
        this.p0 = true;
        ((mm0) d()).getClass();
    }
}
