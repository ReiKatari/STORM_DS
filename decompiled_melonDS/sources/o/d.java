package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends a implements p.j {
    public Context L;
    public ActionBarContextView R;
    public jb.c X;
    public WeakReference Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public p.l f10451b0;

    @Override // o.a
    public final void a() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.s(this);
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
        i();
        q.j jVar = this.R.R;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // o.a
    public final p.l d() {
        return this.f10451b0;
    }

    @Override // p.j
    public final boolean e(p.l lVar, MenuItem menuItem) {
        return ((b9.e) this.X.B).E(this, menuItem);
    }

    @Override // o.a
    public final MenuInflater f() {
        return new h(this.R.getContext());
    }

    @Override // o.a
    public final CharSequence g() {
        return this.R.getSubtitle();
    }

    @Override // o.a
    public final CharSequence h() {
        return this.R.getTitle();
    }

    @Override // o.a
    public final void i() {
        this.X.t(this, this.f10451b0);
    }

    @Override // o.a
    public final boolean j() {
        return this.R.p0;
    }

    @Override // o.a
    public final void k(View view) {
        WeakReference weakReference;
        this.R.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.Y = weakReference;
    }

    @Override // o.a
    public final void l(int i2) {
        m(this.L.getString(i2));
    }

    @Override // o.a
    public final void m(CharSequence charSequence) {
        this.R.setSubtitle(charSequence);
    }

    @Override // o.a
    public final void n(int i2) {
        o(this.L.getString(i2));
    }

    @Override // o.a
    public final void o(CharSequence charSequence) {
        this.R.setTitle(charSequence);
    }

    @Override // o.a
    public final void p(boolean z10) {
        this.B = z10;
        this.R.setTitleOptional(z10);
    }
}
