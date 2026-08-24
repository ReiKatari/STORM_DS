package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s44  reason: default package */
/* loaded from: classes.dex */
public final class s44 extends defpackage.d2 implements android.view.MenuItem {
    public final defpackage.lu6 c;
    public java.lang.reflect.Method d;

    public s44(android.content.Context r1, defpackage.lu6 r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.c = r2
            return
        L8:
            java.lang.String r0 = "Wrapped Object can not be null."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r0 = this;
            lu6 r0 = r0.c
            p44 r0 = r0.c()
            if (r0 == 0) goto Lb
            android.view.ActionProvider r0 = r0.b
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r1 = this;
            lu6 r1 = r1.c
            android.view.View r1 = r1.getActionView()
            boolean r0 = r1 instanceof defpackage.q44
            if (r0 == 0) goto L10
            q44 r1 = (defpackage.q44) r1
            android.view.CollapsibleActionView r1 = r1.A
            android.view.View r1 = (android.view.View) r1
        L10:
            return r1
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            lu6 r0 = r0.c
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            lu6 r0 = r0.c
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            lu6 r0 = r0.c
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            lu6 r0 = r0.c
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            lu6 r0 = r0.c
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            lu6 r0 = r0.c
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            lu6 r0 = r0.c
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            lu6 r0 = r0.c
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            lu6 r0 = r0.c
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            lu6 r0 = r0.c
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
            r0 = this;
            lu6 r0 = r0.c
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            lu6 r0 = r0.c
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            lu6 r0 = r0.c
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            lu6 r0 = r0.c
            android.view.SubMenu r0 = r0.getSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            lu6 r0 = r0.c
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r0 = this;
            lu6 r0 = r0.c
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            lu6 r0 = r0.c
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r0 = this;
            lu6 r0 = r0.c
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            p44 r0 = new p44
            r0.<init>(r1, r2)
            if (r2 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            lu6 r2 = r1.c
            r2.a(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r3) {
            r2 = this;
            lu6 r0 = r2.c
            r0.setActionView(r3)
            android.view.View r3 = r0.getActionView()
            boolean r1 = r3 instanceof android.view.CollapsibleActionView
            if (r1 == 0) goto L15
            q44 r1 = new q44
            r1.<init>(r3)
            r0.setActionView(r1)
        L15:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            q44 r0 = new q44
            r0.<init>(r2)
            r2 = r0
        La:
            lu6 r0 = r1.c
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r44 r0 = new r44
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            lu6 r2 = r1.c
            r2.setOnActionExpandListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            iu6 r0 = new iu6
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            lu6 r2 = r1.c
            r2.setOnMenuItemClickListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
            r0 = this;
            lu6 r0 = r0.c
            r0.setShowAsAction(r1)
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            lu6 r0 = r1.c
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            lu6 r0 = r0.c
            android.view.MenuItem r0 = r0.setVisible(r1)
            return r0
    }
}
