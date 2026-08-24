package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo6  reason: default package */
/* loaded from: classes.dex */
public final class zo6 extends k8 implements g44 {
    public Context L;
    public ActionBarContextView R;
    public u63 X;
    public WeakReference Y;
    public boolean Z;
    public i44 d0;

    @Override // defpackage.g44
    public final void H(i44 i44Var) {
        g();
        g8 g8Var = this.R.R;
        if (g8Var != null) {
            g8Var.l();
        }
    }

    @Override // defpackage.k8
    public final void a() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.x(this);
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
        return this.d0;
    }

    @Override // defpackage.k8
    public final MenuInflater d() {
        return new ku6(this.R.getContext());
    }

    @Override // defpackage.k8
    public final CharSequence e() {
        return this.R.getSubtitle();
    }

    @Override // defpackage.k8
    public final CharSequence f() {
        return this.R.getTitle();
    }

    @Override // defpackage.k8
    public final void g() {
        this.X.y(this, this.d0);
    }

    @Override // defpackage.k8
    public final boolean h() {
        return this.R.r0;
    }

    @Override // defpackage.k8
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

    @Override // defpackage.k8
    public final void j(int i) {
        k(this.L.getString(i));
    }

    @Override // defpackage.k8
    public final void k(CharSequence charSequence) {
        this.R.setSubtitle(charSequence);
    }

    @Override // defpackage.k8
    public final void l(int i) {
        m(this.L.getString(i));
    }

    @Override // defpackage.k8
    public final void m(CharSequence charSequence) {
        this.R.setTitle(charSequence);
    }

    @Override // defpackage.g44
    public final boolean n(i44 i44Var, MenuItem menuItem) {
        return ((eb) this.X.B).J(this, menuItem);
    }

    @Override // defpackage.k8
    public final void o(boolean z) {
        this.B = z;
        this.R.setTitleOptional(z);
    }
}
