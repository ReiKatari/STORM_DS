package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements s5.a {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f11056a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f11057b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f11058c;

    /* renamed from: d  reason: collision with root package name */
    public char f11059d;

    /* renamed from: e  reason: collision with root package name */
    public int f11060e;

    /* renamed from: f  reason: collision with root package name */
    public char f11061f;

    /* renamed from: g  reason: collision with root package name */
    public int f11062g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f11063h;

    /* renamed from: i  reason: collision with root package name */
    public Context f11064i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f11065j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f11066k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f11067l;
    public PorterDuff.Mode m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11068n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11069o;

    /* renamed from: p  reason: collision with root package name */
    public int f11070p;

    @Override // s5.a
    public final s5.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f11063h;
        if (drawable != null) {
            if (this.f11068n || this.f11069o) {
                this.f11063h = drawable;
                Drawable mutate = drawable.mutate();
                this.f11063h = mutate;
                if (this.f11068n) {
                    mutate.setTintList(this.f11067l);
                }
                if (this.f11069o) {
                    this.f11063h.setTintMode(this.m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // s5.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f11062g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f11061f;
    }

    @Override // s5.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f11065j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f11063h;
    }

    @Override // s5.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f11067l;
    }

    @Override // s5.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f11058c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s5.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f11060e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f11059d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f11056a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11057b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11056a;
    }

    @Override // s5.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f11066k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f11070p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f11070p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f11070p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f11070p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i2) {
        this.f11061f = Character.toLowerCase(c4);
        this.f11062g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f11070p = (z10 ? 1 : 0) | (this.f11070p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i2;
        int i10 = this.f11070p & (-3);
        if (z10) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f11070p = i2 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11065j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i2;
        int i10 = this.f11070p & (-17);
        if (z10) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.f11070p = i2 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f11063h = this.f11064i.getDrawable(i2);
        c();
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11067l = colorStateList;
        this.f11068n = true;
        c();
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.f11069o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f11058c = intent;
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i2) {
        this.f11059d = c4;
        this.f11060e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10, int i2, int i10) {
        this.f11059d = c4;
        this.f11060e = KeyEvent.normalizeMetaState(i2);
        this.f11061f = Character.toLowerCase(c10);
        this.f11062g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f11056a = this.f11064i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11057b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11066k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i2 = 8;
        int i10 = this.f11070p & 8;
        if (z10) {
            i2 = 0;
        }
        this.f11070p = i10 | i2;
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final s5.a setContentDescription(CharSequence charSequence) {
        this.f11065j = charSequence;
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final s5.a setTooltipText(CharSequence charSequence) {
        this.f11066k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f11059d = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f11063h = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f11061f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11056a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10) {
        this.f11059d = c4;
        this.f11061f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
