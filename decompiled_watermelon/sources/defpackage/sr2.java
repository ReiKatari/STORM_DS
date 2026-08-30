package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sr2  reason: default package */
/* loaded from: classes.dex */
public abstract class sr2 extends o implements el2 {
    public ba7 A;
    public volatile ws L;
    public boolean B = false;
    public final Object R = new Object();
    public boolean X = false;

    @Override // defpackage.dl2
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = new ws(this);
                    }
                } finally {
                }
            }
        }
        return this.L.d();
    }

    @Override // androidx.fragment.app.o
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        h();
        return this.A;
    }

    @Override // androidx.fragment.app.o, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.N(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.A == null) {
            this.A = new ba7(super.getContext(), this);
            this.B = cg2.K(super.getContext());
        }
    }

    public final void i() {
        if (!this.X) {
            this.X = true;
            b81 b81Var = ((z71) ((eo5) d())).a;
            w16 w16Var = (w16) b81Var.s.get();
            ((a) this).Y = (rp5) b81Var.N.get();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ba7 ba7Var = this.A;
        if (ba7Var != null && ws.c(ba7Var) != activity) {
            z = false;
        } else {
            z = true;
        }
        jk2.n(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        i();
    }

    @Override // androidx.fragment.app.o
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ba7(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        i();
    }
}
