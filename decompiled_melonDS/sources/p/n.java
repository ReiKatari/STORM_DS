package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import l.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements s5.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f11133a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11134b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11135c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11136d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f11137e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f11138f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f11139g;

    /* renamed from: h  reason: collision with root package name */
    public char f11140h;

    /* renamed from: j  reason: collision with root package name */
    public char f11142j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f11144l;

    /* renamed from: n  reason: collision with root package name */
    public final l f11145n;

    /* renamed from: o  reason: collision with root package name */
    public d0 f11146o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f11147p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f11148q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f11149r;

    /* renamed from: y  reason: collision with root package name */
    public int f11156y;

    /* renamed from: z  reason: collision with root package name */
    public View f11157z;

    /* renamed from: i  reason: collision with root package name */
    public int f11141i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f11143k = 4096;
    public int m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f11150s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f11151t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11152u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11153v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11154w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f11155x = 16;
    public boolean C = false;

    public n(l lVar, int i2, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f11145n = lVar;
        this.f11133a = i10;
        this.f11134b = i2;
        this.f11135c = i11;
        this.f11136d = i12;
        this.f11137e = charSequence;
        this.f11156y = i13;
    }

    public static void c(int i2, int i10, String str, StringBuilder sb2) {
        if ((i2 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // s5.a
    public final s5.a a(o oVar) {
        this.f11157z = null;
        this.A = oVar;
        this.f11145n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f11158a = new i0(17, this);
            oVar2.f11159b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // s5.a
    public final o b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f11156y & 8) != 0) {
            if (this.f11157z == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
                return false;
            }
            return this.f11145n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11154w && (this.f11152u || this.f11153v)) {
            drawable = drawable.mutate();
            if (this.f11152u) {
                drawable.setTintList(this.f11150s);
            }
            if (this.f11153v) {
                drawable.setTintMode(this.f11151t);
            }
            this.f11154w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f11156y & 8) != 0) {
            if (this.f11157z == null && (oVar = this.A) != null) {
                this.f11157z = oVar.f11159b.onCreateActionView(this);
            }
            if (this.f11157z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f11145n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        int i2 = this.f11155x;
        if (z10) {
            this.f11155x = i2 | 32;
        } else {
            this.f11155x = i2 & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f11157z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar != null) {
            View onCreateActionView = oVar.f11159b.onCreateActionView(this);
            this.f11157z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // s5.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f11143k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f11142j;
    }

    @Override // s5.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f11148q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f11134b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f11144l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.m;
        if (i2 != 0) {
            Drawable p10 = k7.w.p(this.f11145n.f11110a, i2);
            this.m = 0;
            this.f11144l = p10;
            return d(p10);
        }
        return null;
    }

    @Override // s5.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f11150s;
    }

    @Override // s5.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11151t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f11139g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f11133a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s5.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f11141i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f11140h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f11135c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f11146o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f11137e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11138f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11137e;
    }

    @Override // s5.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f11149r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f11146o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f11155x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f11155x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f11155x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        if (oVar != null && oVar.f11159b.overridesItemVisibility()) {
            if ((this.f11155x & 8) != 0 || !this.A.f11159b.isVisible()) {
                return false;
            }
            return true;
        } else if ((this.f11155x & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i10;
        l lVar = this.f11145n;
        Context context = lVar.f11110a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f11157z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f11133a) > 0) {
            inflate.setId(i10);
        }
        lVar.f11120k = true;
        lVar.p(true);
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i2) {
        if (this.f11142j == c4 && this.f11143k == i2) {
            return this;
        }
        this.f11142j = Character.toLowerCase(c4);
        this.f11143k = KeyEvent.normalizeMetaState(i2);
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i2 = this.f11155x;
        int i10 = (z10 ? 1 : 0) | (i2 & (-2));
        this.f11155x = i10;
        if (i2 != i10) {
            this.f11145n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i2;
        int i10 = this.f11155x;
        int i11 = i10 & 4;
        int i12 = 2;
        l lVar = this.f11145n;
        if (i11 != 0) {
            ArrayList arrayList = lVar.f11115f;
            int size = arrayList.size();
            lVar.w();
            for (int i13 = 0; i13 < size; i13++) {
                n nVar = (n) arrayList.get(i13);
                if (nVar.f11134b == this.f11134b && (nVar.f11155x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i14 = nVar.f11155x;
                    int i15 = i14 & (-3);
                    if (z11) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    int i16 = i2 | i15;
                    nVar.f11155x = i16;
                    if (i14 != i16) {
                        nVar.f11145n.p(false);
                    }
                }
            }
            lVar.v();
            return this;
        }
        int i17 = i10 & (-3);
        if (!z10) {
            i12 = 0;
        }
        int i18 = i17 | i12;
        this.f11155x = i18;
        if (i10 != i18) {
            lVar.p(false);
        }
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final s5.a setContentDescription(CharSequence charSequence) {
        this.f11148q = charSequence;
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i2 = this.f11155x;
        if (z10) {
            this.f11155x = i2 | 16;
        } else {
            this.f11155x = i2 & (-17);
        }
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f11144l = null;
        this.m = i2;
        this.f11154w = true;
        this.f11145n.p(false);
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11150s = colorStateList;
        this.f11152u = true;
        this.f11154w = true;
        this.f11145n.p(false);
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11151t = mode;
        this.f11153v = true;
        this.f11154w = true;
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f11139g = intent;
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i2) {
        if (this.f11140h == c4 && this.f11141i == i2) {
            return this;
        }
        this.f11140h = c4;
        this.f11141i = KeyEvent.normalizeMetaState(i2);
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11147p = onMenuItemClickListener;
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10, int i2, int i10) {
        this.f11140h = c4;
        this.f11141i = KeyEvent.normalizeMetaState(i2);
        this.f11142j = Character.toLowerCase(c10);
        this.f11143k = KeyEvent.normalizeMetaState(i10);
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i10 = i2 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            a0.j.h("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f11156y = i2;
        l lVar = this.f11145n;
        lVar.f11120k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11137e = charSequence;
        this.f11145n.p(false);
        d0 d0Var = this.f11146o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11138f = charSequence;
        this.f11145n.p(false);
        return this;
    }

    @Override // s5.a, android.view.MenuItem
    public final s5.a setTooltipText(CharSequence charSequence) {
        this.f11149r = charSequence;
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i2;
        int i10 = this.f11155x;
        int i11 = i10 & (-9);
        if (z10) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i12 = i2 | i11;
        this.f11155x = i12;
        if (i10 != i12) {
            l lVar = this.f11145n;
            lVar.f11117h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f11137e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.f11144l = drawable;
        this.f11154w = true;
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f11145n.f11110a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f11140h == c4) {
            return this;
        }
        this.f11140h = c4;
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10) {
        this.f11140h = c4;
        this.f11142j = Character.toLowerCase(c10);
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f11142j == c4) {
            return this;
        }
        this.f11142j = Character.toLowerCase(c4);
        this.f11145n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f11157z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f11133a) > 0) {
            view.setId(i2);
        }
        l lVar = this.f11145n;
        lVar.f11120k = true;
        lVar.p(true);
        return this;
    }
}
