package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx2  reason: default package */
/* loaded from: classes.dex */
public abstract class tx2 extends o implements kr2 {
    public bo7 A;
    public volatile mt L;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;

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
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.T(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new bo7(super.getContext(), this);
            this.B = bl2.I(super.getContext());
        }
    }

    public final void i() {
        if (!this.X) {
            this.X = true;
            sb1 sb1Var = ((qb1) ((yy5) c())).a;
            kd6 kd6Var = (kd6) sb1Var.s.get();
            ((a) this).Y = (l06) sb1Var.N.get();
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
        h();
        i();
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new bo7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        i();
    }
}
