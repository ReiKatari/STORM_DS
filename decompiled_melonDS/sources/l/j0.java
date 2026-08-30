package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends o.a implements p.j {
    public final Context L;
    public final p.l R;
    public jb.c X;
    public WeakReference Y;
    public final /* synthetic */ k0 Z;

    public j0(k0 k0Var, Context context, jb.c cVar) {
        this.Z = k0Var;
        this.L = context;
        this.X = cVar;
        p.l lVar = new p.l(context);
        lVar.f11121l = 1;
        this.R = lVar;
        lVar.f11114e = this;
    }

    @Override // o.a
    public final void a() {
        k0 k0Var = this.Z;
        if (k0Var.f8432t != this) {
            return;
        }
        if (k0Var.A) {
            k0Var.f8433u = this;
            k0Var.f8434v = this.X;
        } else {
            this.X.s(this);
        }
        this.X = null;
        k0Var.C0(false);
        ActionBarContextView actionBarContextView = k0Var.f8429q;
        if (actionBarContextView.f915h0 == null) {
            actionBarContextView.e();
        }
        k0Var.f8426n.setHideOnContentScrollEnabled(k0Var.F);
        k0Var.f8432t = null;
    }

    @Override // o.a
    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p.j
    public final void c(p.l lVar) {
        if (this.X != null) {
            i();
            q.j jVar = this.Z.f8429q.R;
            if (jVar != null) {
                jVar.l();
            }
        }
    }

    @Override // o.a
    public final p.l d() {
        return this.R;
    }

    @Override // p.j
    public final boolean e(p.l lVar, MenuItem menuItem) {
        jb.c cVar = this.X;
        if (cVar != null) {
            return ((b9.e) cVar.B).E(this, menuItem);
        }
        return false;
    }

    @Override // o.a
    public final MenuInflater f() {
        return new o.h(this.L);
    }

    @Override // o.a
    public final CharSequence g() {
        return this.Z.f8429q.getSubtitle();
    }

    @Override // o.a
    public final CharSequence h() {
        return this.Z.f8429q.getTitle();
    }

    @Override // o.a
    public final void i() {
        if (this.Z.f8432t != this) {
            return;
        }
        p.l lVar = this.R;
        lVar.w();
        try {
            this.X.t(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // o.a
    public final boolean j() {
        return this.Z.f8429q.p0;
    }

    @Override // o.a
    public final void k(View view) {
        this.Z.f8429q.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    @Override // o.a
    public final void l(int i2) {
        m(this.Z.f8425l.getResources().getString(i2));
    }

    @Override // o.a
    public final void m(CharSequence charSequence) {
        this.Z.f8429q.setSubtitle(charSequence);
    }

    @Override // o.a
    public final void n(int i2) {
        o(this.Z.f8425l.getResources().getString(i2));
    }

    @Override // o.a
    public final void o(CharSequence charSequence) {
        this.Z.f8429q.setTitle(charSequence);
    }

    @Override // o.a
    public final void p(boolean z10) {
        this.B = z10;
        this.Z.f8429q.setTitleOptional(z10);
    }
}
