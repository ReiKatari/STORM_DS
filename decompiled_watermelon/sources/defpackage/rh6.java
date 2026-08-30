package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rh6  reason: default package */
/* loaded from: classes.dex */
public final class rh6 extends uw3 implements SubMenu {
    public final zw3 A;
    public final uw3 z;

    public rh6(Context context, uw3 uw3Var, zw3 zw3Var) {
        super(context);
        this.z = uw3Var;
        this.A = zw3Var;
    }

    @Override // defpackage.uw3
    public final boolean d(zw3 zw3Var) {
        return this.z.d(zw3Var);
    }

    @Override // defpackage.uw3
    public final boolean e(uw3 uw3Var, MenuItem menuItem) {
        if (!super.e(uw3Var, menuItem) && !this.z.e(uw3Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.uw3
    public final boolean f(zw3 zw3Var) {
        return this.z.f(zw3Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.uw3
    public final String j() {
        int i;
        zw3 zw3Var = this.A;
        if (zw3Var != null) {
            i = zw3Var.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return wh1.g(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.uw3
    public final uw3 k() {
        return this.z.k();
    }

    @Override // defpackage.uw3
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.uw3
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.uw3
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.uw3, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
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

    @Override // defpackage.uw3, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
