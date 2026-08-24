package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a8  reason: default package */
/* loaded from: classes.dex */
public final class a8 implements defpackage.lu6 {
    public java.lang.CharSequence a;
    public java.lang.CharSequence b;
    public android.content.Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public android.graphics.drawable.Drawable h;
    public android.content.Context i;
    public java.lang.CharSequence j;
    public java.lang.CharSequence k;
    public android.content.res.ColorStateList l;
    public android.graphics.PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    @Override // defpackage.lu6
    public final defpackage.lu6 a(defpackage.p44 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final void b() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.h
            if (r0 == 0) goto L28
            boolean r1 = r2.n
            if (r1 != 0) goto Lc
            boolean r1 = r2.o
            if (r1 == 0) goto L28
        Lc:
            r2.h = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.h = r0
            boolean r1 = r2.n
            if (r1 == 0) goto L1d
            android.content.res.ColorStateList r1 = r2.l
            r0.setTintList(r1)
        L1d:
            boolean r0 = r2.o
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r2.h
            android.graphics.PorterDuff$Mode r2 = r2.m
            r0.setTintMode(r2)
        L28:
            return
    }

    @Override // defpackage.lu6
    public final defpackage.p44 c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.g
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.f
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.j
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.h
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.l
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.m
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.c
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final int getNumericModifiers() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            char r0 = r0.d
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.a
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r1 = r1.a
            return r1
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.k
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            int r1 = r1.p
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r0 = this;
            int r0 = r0.p
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r0 = this;
            int r0 = r0.p
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r0 = this;
            int r0 = r0.p
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f = r1
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.p
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.p
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final defpackage.lu6 setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.p
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.p = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.i
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.h = r2
            r1.b()
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.h = r1
            r0.b()
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.l = r1
            r1 = 1
            r0.n = r1
            r0.b()
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.m = r1
            r1 = 1
            r0.o = r1
            r0.b()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.d = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.e = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.d = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f = r1
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.d = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.e = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
            r0 = this;
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.i
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.a = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.b = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.k = r1
            return r0
    }

    @Override // defpackage.lu6, android.view.MenuItem
    public final defpackage.lu6 setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.k = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.p
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.p = r3
            return r2
    }
}
