package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it6  reason: default package */
/* loaded from: classes.dex */
public final class it6 extends defpackage.i44 implements android.view.SubMenu {
    public final defpackage.o44 A;
    public final defpackage.i44 z;

    public it6(android.content.Context r1, defpackage.i44 r2, defpackage.o44 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.z = r2
            r0.A = r3
            return
    }

    @Override // defpackage.i44
    public final boolean d(defpackage.o44 r1) {
            r0 = this;
            i44 r0 = r0.z
            boolean r0 = r0.d(r1)
            return r0
    }

    @Override // defpackage.i44
    public final boolean e(defpackage.i44 r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.e(r2, r3)
            if (r0 != 0) goto L11
            i44 r1 = r1.z
            boolean r1 = r1.e(r2, r3)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    @Override // defpackage.i44
    public final boolean f(defpackage.o44 r1) {
            r0 = this;
            i44 r0 = r0.z
            boolean r0 = r0.f(r1)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r0 = this;
            o44 r0 = r0.A
            return r0
    }

    @Override // defpackage.i44
    public final java.lang.String j() {
            r1 = this;
            o44 r1 = r1.A
            if (r1 == 0) goto L7
            int r1 = r1.a
            goto L8
        L7:
            r1 = 0
        L8:
            if (r1 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.String r0 = "android:menu:actionviewstates:"
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            return r1
    }

    @Override // defpackage.i44
    public final defpackage.i44 k() {
            r0 = this;
            i44 r0 = r0.z
            i44 r0 = r0.k()
            return r0
    }

    @Override // defpackage.i44
    public final boolean m() {
            r0 = this;
            i44 r0 = r0.z
            boolean r0 = r0.m()
            return r0
    }

    @Override // defpackage.i44
    public final boolean n() {
            r0 = this;
            i44 r0 = r0.z
            boolean r0 = r0.n()
            return r0
    }

    @Override // defpackage.i44
    public final boolean o() {
            r0 = this;
            i44 r0 = r0.z
            boolean r0 = r0.o()
            return r0
    }

    @Override // defpackage.i44, android.view.Menu
    public final void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            i44 r0 = r0.z
            r0.setGroupDividerEnabled(r1)
            return
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r3 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r3 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r4 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View r7) {
            r6 = this;
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r5 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            o44 r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            o44 r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // defpackage.i44, android.view.Menu
    public final void setQwertyMode(boolean r1) {
            r0 = this;
            i44 r0 = r0.z
            r0.setQwertyMode(r1)
            return
    }
}
