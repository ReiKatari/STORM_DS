package p;

import a1.w0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a0 extends b4.b implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final l f11071c;

    public a0(Context context, l lVar) {
        super(context);
        if (lVar != null) {
            this.f11071c = lVar;
        } else {
            a0.j.h("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f11071c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f11071c.addIntentOptions(i2, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = g(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f11071c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        w0 w0Var = (w0) this.f1791b;
        if (w0Var != null) {
            w0Var.clear();
        }
        this.f11071c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f11071c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return g(this.f11071c.findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return g(this.f11071c.getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f11071c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f11071c.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i10) {
        return this.f11071c.performIdentifierAction(i2, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i10) {
        return this.f11071c.performShortcut(i2, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((w0) this.f1791b) != null) {
            int i10 = 0;
            while (true) {
                w0 w0Var = (w0) this.f1791b;
                if (i10 >= w0Var.L) {
                    break;
                }
                if (((s5.a) w0Var.f(i10)).getGroupId() == i2) {
                    ((w0) this.f1791b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f11071c.removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((w0) this.f1791b) != null) {
            int i10 = 0;
            while (true) {
                w0 w0Var = (w0) this.f1791b;
                if (i10 >= w0Var.L) {
                    break;
                } else if (((s5.a) w0Var.f(i10)).getItemId() == i2) {
                    ((w0) this.f1791b).g(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f11071c.removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z10, boolean z11) {
        this.f11071c.setGroupCheckable(i2, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z10) {
        this.f11071c.setGroupEnabled(i2, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z10) {
        this.f11071c.setGroupVisible(i2, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f11071c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f11071c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return this.f11071c.addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i10, int i11, CharSequence charSequence) {
        return this.f11071c.addSubMenu(i2, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i10, int i11, int i12) {
        return this.f11071c.addSubMenu(i2, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return g(this.f11071c.add(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i10, int i11, CharSequence charSequence) {
        return g(this.f11071c.a(i2, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i10, int i11, int i12) {
        return g(this.f11071c.add(i2, i10, i11, i12));
    }
}
