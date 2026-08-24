package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it6  reason: default package */
/* loaded from: classes.dex */
public final class it6 extends i44 implements SubMenu {
    public final o44 A;
    public final i44 z;

    public it6(Context context, i44 i44Var, o44 o44Var) {
        super(context);
        this.z = i44Var;
        this.A = o44Var;
    }

    @Override // defpackage.i44
    public final boolean d(o44 o44Var) {
        return this.z.d(o44Var);
    }

    @Override // defpackage.i44
    public final boolean e(i44 i44Var, MenuItem menuItem) {
        if (!super.e(i44Var, menuItem) && !this.z.e(i44Var, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i44
    public final boolean f(o44 o44Var) {
        return this.z.f(o44Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.i44
    public final String j() {
        int i;
        o44 o44Var = this.A;
        if (o44Var != null) {
            i = o44Var.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return lb1.g(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.i44
    public final i44 k() {
        return this.z.k();
    }

    @Override // defpackage.i44
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.i44
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.i44
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.i44, android.view.Menu
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

    @Override // defpackage.i44, android.view.Menu
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
