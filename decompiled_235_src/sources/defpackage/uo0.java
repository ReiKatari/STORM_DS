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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo0  reason: default package */
/* loaded from: classes.dex */
public final class uo0 extends i implements kr2 {
    public bo7 A;
    public volatile mt L;
    public final uo7 Y;
    public bt Z;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;

    public uo0() {
        go3 M = kj2.M(xr3.NONE, new pj(new pj(this, 4), 5));
        this.Y = new uo7(gh5.a(gp0.class), new to0(M, 0), new le(4, this, M), new to0(M, 1));
    }

    @Override // defpackage.jr2
    public final Object c() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new mt(this);
                    }
                } finally {
                }
            }
        }
        return this.L.c();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        i();
        return this.A;
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.T(this, super.getDefaultViewModelProviderFactory());
    }

    public final void i() {
        if (this.A == null) {
            this.A = new bo7(super.getContext(), this);
            this.B = bl2.I(super.getContext());
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        bo7 bo7Var = this.A;
        if (bo7Var != null && mt.d(bo7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        qo2.o(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        i();
        if (!this.X) {
            this.X = true;
            ((vo0) c()).getClass();
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = getLayoutInflater().inflate(R.layout.dialog_cheats_import_progress, (ViewGroup) null, false);
        int i = R.id.progress_bar_cheat_import;
        ProgressBar progressBar = (ProgressBar) gi2.B(inflate, R.id.progress_bar_cheat_import);
        if (progressBar != null) {
            i = R.id.text_cheat_import_item_name;
            TextView textView = (TextView) gi2.B(inflate, R.id.text_cheat_import_item_name);
            if (textView != null) {
                this.Z = new bt((LinearLayout) inflate, progressBar, textView, 16);
                zb zbVar = new zb(requireContext());
                zbVar.z(R.string.importing_cheats);
                bt btVar = this.Z;
                if (btVar != null) {
                    zbVar.A((LinearLayout) btVar.B);
                    zbVar.y(R.string.move_to_background, new qo0(0));
                    ((wb) zbVar.L).m = false;
                    return zbVar.l();
                }
                nb3.a0("binding");
                throw null;
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new bo7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        hv.L(bl2.C(this), null, null, new so0(this, null, 1), 3);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        i();
        if (this.X) {
            return;
        }
        this.X = true;
        ((vo0) c()).getClass();
    }
}
