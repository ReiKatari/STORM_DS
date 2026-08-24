package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt7  reason: default package */
/* loaded from: classes.dex */
public final class mt7 extends k8 implements g44 {
    public final Context L;
    public final i44 R;
    public u63 X;
    public WeakReference Y;
    public final /* synthetic */ nt7 Z;

    public mt7(nt7 nt7Var, Context context, u63 u63Var) {
        this.Z = nt7Var;
        this.L = context;
        this.X = u63Var;
        i44 i44Var = new i44(context);
        i44Var.l = 1;
        this.R = i44Var;
        i44Var.e = this;
    }

    @Override // defpackage.g44
    public final void H(i44 i44Var) {
        if (this.X != null) {
            g();
            g8 g8Var = this.Z.q.R;
            if (g8Var != null) {
                g8Var.l();
            }
        }
    }

    @Override // defpackage.k8
    public final void a() {
        nt7 nt7Var = this.Z;
        if (nt7Var.t != this) {
            return;
        }
        boolean z = nt7Var.A;
        boolean z2 = nt7Var.B;
        if (!z && !z2) {
            this.X.x(this);
        } else {
            nt7Var.u = this;
            nt7Var.v = this.X;
        }
        this.X = null;
        nt7Var.L0(false);
        ActionBarContextView actionBarContextView = nt7Var.q;
        if (actionBarContextView.j0 == null) {
            actionBarContextView.e();
        }
        nt7Var.n.setHideOnContentScrollEnabled(nt7Var.G);
        nt7Var.t = null;
    }

    @Override // defpackage.k8
    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.k8
    public final i44 c() {
        return this.R;
    }

    @Override // defpackage.k8
    public final MenuInflater d() {
        return new ku6(this.L);
    }

    @Override // defpackage.k8
    public final CharSequence e() {
        return this.Z.q.getSubtitle();
    }

    @Override // defpackage.k8
    public final CharSequence f() {
        return this.Z.q.getTitle();
    }

    @Override // defpackage.k8
    public final void g() {
        if (this.Z.t != this) {
            return;
        }
        i44 i44Var = this.R;
        i44Var.w();
        try {
            this.X.y(this, i44Var);
        } finally {
            i44Var.v();
        }
    }

    @Override // defpackage.k8
    public final boolean h() {
        return this.Z.q.r0;
    }

    @Override // defpackage.k8
    public final void i(View view) {
        this.Z.q.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    @Override // defpackage.k8
    public final void j(int i) {
        k(this.Z.l.getResources().getString(i));
    }

    @Override // defpackage.k8
    public final void k(CharSequence charSequence) {
        this.Z.q.setSubtitle(charSequence);
    }

    @Override // defpackage.k8
    public final void l(int i) {
        m(this.Z.l.getResources().getString(i));
    }

    @Override // defpackage.k8
    public final void m(CharSequence charSequence) {
        this.Z.q.setTitle(charSequence);
    }

    @Override // defpackage.g44
    public final boolean n(i44 i44Var, MenuItem menuItem) {
        u63 u63Var = this.X;
        if (u63Var != null) {
            return ((eb) u63Var.B).J(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.k8
    public final void o(boolean z) {
        this.B = z;
        this.Z.q.setTitleOptional(z);
    }
}
