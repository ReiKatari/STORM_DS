package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd6  reason: default package */
/* loaded from: classes.dex */
public final class jd6 extends j8 implements sw3 {
    public Context L;
    public ActionBarContextView R;
    public q03 X;
    public WeakReference Y;
    public boolean Z;
    public uw3 c0;

    @Override // defpackage.sw3
    public final void D(uw3 uw3Var) {
        g();
        f8 f8Var = this.R.R;
        if (f8Var != null) {
            f8Var.l();
        }
    }

    @Override // defpackage.j8
    public final void a() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.u(this);
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
        return this.c0;
    }

    @Override // defpackage.j8
    public final MenuInflater d() {
        return new qi6(this.R.getContext());
    }

    @Override // defpackage.j8
    public final CharSequence e() {
        return this.R.getSubtitle();
    }

    @Override // defpackage.j8
    public final CharSequence f() {
        return this.R.getTitle();
    }

    @Override // defpackage.j8
    public final void g() {
        this.X.v(this, this.c0);
    }

    @Override // defpackage.j8
    public final boolean h() {
        return this.R.q0;
    }

    @Override // defpackage.j8
    public final void i(View view) {
        WeakReference weakReference;
        this.R.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.Y = weakReference;
    }

    @Override // defpackage.j8
    public final void j(int i) {
        k(this.L.getString(i));
    }

    @Override // defpackage.j8
    public final void k(CharSequence charSequence) {
        this.R.setSubtitle(charSequence);
    }

    @Override // defpackage.j8
    public final void l(int i) {
        m(this.L.getString(i));
    }

    @Override // defpackage.j8
    public final void m(CharSequence charSequence) {
        this.R.setTitle(charSequence);
    }

    @Override // defpackage.j8
    public final void n(boolean z) {
        this.B = z;
        this.R.setTitleOptional(z);
    }

    @Override // defpackage.sw3
    public final boolean t(uw3 uw3Var, MenuItem menuItem) {
        return ((q9) this.X.B).I(this, menuItem);
    }
}
