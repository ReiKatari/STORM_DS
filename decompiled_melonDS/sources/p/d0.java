package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends l implements SubMenu {
    public final n A;

    /* renamed from: z  reason: collision with root package name */
    public final l f11087z;

    public d0(Context context, l lVar, n nVar) {
        super(context);
        this.f11087z = lVar;
        this.A = nVar;
    }

    @Override // p.l
    public final boolean d(n nVar) {
        return this.f11087z.d(nVar);
    }

    @Override // p.l
    public final boolean e(l lVar, MenuItem menuItem) {
        if (!super.e(lVar, menuItem) && !this.f11087z.e(lVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // p.l
    public final boolean f(n nVar) {
        return this.f11087z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // p.l
    public final String j() {
        int i2;
        n nVar = this.A;
        if (nVar != null) {
            i2 = nVar.f11133a;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        return w.d.l(i2, "android:menu:actionviewstates:");
    }

    @Override // p.l
    public final l k() {
        return this.f11087z.k();
    }

    @Override // p.l
    public final boolean m() {
        return this.f11087z.m();
    }

    @Override // p.l
    public final boolean n() {
        return this.f11087z.n();
    }

    @Override // p.l
    public final boolean o() {
        return this.f11087z.o();
    }

    @Override // p.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f11087z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // p.l, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f11087z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.A.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        u(i2, null, 0, null, null);
        return this;
    }
}
