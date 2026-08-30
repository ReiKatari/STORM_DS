package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ke7  reason: default package */
/* loaded from: classes.dex */
public final class ke7 extends j8 implements sw3 {
    public final Context L;
    public final uw3 R;
    public q03 X;
    public WeakReference Y;
    public final /* synthetic */ le7 Z;

    public ke7(le7 le7Var, Context context, q03 q03Var) {
        this.Z = le7Var;
        this.L = context;
        this.X = q03Var;
        uw3 uw3Var = new uw3(context);
        uw3Var.l = 1;
        this.R = uw3Var;
        uw3Var.e = this;
    }

    @Override // defpackage.sw3
    public final void D(uw3 uw3Var) {
        if (this.X != null) {
            g();
            f8 f8Var = this.Z.t0.R;
            if (f8Var != null) {
                f8Var.l();
            }
        }
    }

    @Override // defpackage.j8
    public final void a() {
        le7 le7Var = this.Z;
        if (le7Var.w0 != this) {
            return;
        }
        boolean z = le7Var.D0;
        boolean z2 = le7Var.E0;
        if (!z && !z2) {
            this.X.u(this);
        } else {
            le7Var.x0 = this;
            le7Var.y0 = this.X;
        }
        this.X = null;
        le7Var.Y0(false);
        ActionBarContextView actionBarContextView = le7Var.t0;
        if (actionBarContextView.i0 == null) {
            actionBarContextView.e();
        }
        le7Var.q0.setHideOnContentScrollEnabled(le7Var.J0);
        le7Var.w0 = null;
    }

    @Override // defpackage.j8
    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.j8
    public final uw3 c() {
        return this.R;
    }

    @Override // defpackage.j8
    public final MenuInflater d() {
        return new qi6(this.L);
    }

    @Override // defpackage.j8
    public final CharSequence e() {
        return this.Z.t0.getSubtitle();
    }

    @Override // defpackage.j8
    public final CharSequence f() {
        return this.Z.t0.getTitle();
    }

    @Override // defpackage.j8
    public final void g() {
        if (this.Z.w0 != this) {
            return;
        }
        uw3 uw3Var = this.R;
        uw3Var.w();
        try {
            this.X.v(this, uw3Var);
        } finally {
            uw3Var.v();
        }
    }

    @Override // defpackage.j8
    public final boolean h() {
        return this.Z.t0.q0;
    }

    @Override // defpackage.j8
    public final void i(View view) {
        this.Z.t0.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    @Override // defpackage.j8
    public final void j(int i) {
        k(this.Z.o0.getResources().getString(i));
    }

    @Override // defpackage.j8
    public final void k(CharSequence charSequence) {
        this.Z.t0.setSubtitle(charSequence);
    }

    @Override // defpackage.j8
    public final void l(int i) {
        m(this.Z.o0.getResources().getString(i));
    }

    @Override // defpackage.j8
    public final void m(CharSequence charSequence) {
        this.Z.t0.setTitle(charSequence);
    }

    @Override // defpackage.j8
    public final void n(boolean z) {
        this.B = z;
        this.Z.t0.setTitleOptional(z);
    }

    @Override // defpackage.sw3
    public final boolean t(uw3 uw3Var, MenuItem menuItem) {
        q03 q03Var = this.X;
        if (q03Var != null) {
            return ((q9) q03Var.B).I(this, menuItem);
        }
        return false;
    }
}
