package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju6  reason: default package */
/* loaded from: classes.dex */
public final class ju6 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ ku6 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public p44 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public ju6(ku6 ku6Var, Menu menu) {
        this.E = ku6Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z;
        ku6 ku6Var = this.E;
        Context context = ku6Var.c;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z2 = false;
        if (this.r >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (!context.isRestricted()) {
                if (ku6Var.d == null) {
                    ku6Var.d = ku6.a(context);
                }
                Object obj = ku6Var.d;
                String str = this.y;
                iu6 iu6Var = new iu6();
                iu6Var.B = obj;
                Class<?> cls = obj.getClass();
                try {
                    iu6Var.L = cls.getMethod(str, iu6.R);
                    menuItem.setOnMenuItemClickListener(iu6Var);
                } catch (Exception e) {
                    StringBuilder t = i61.t("Couldn't resolve menu item onClick handler ", str, " in class ");
                    t.append(cls.getName());
                    InflateException inflateException = new InflateException(t.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                i.m("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof o44) {
                o44 o44Var = (o44) menuItem;
                o44Var.x = (o44Var.x & (-5)) | 4;
            } else if (menuItem instanceof s44) {
                s44 s44Var = (s44) menuItem;
                lu6 lu6Var = s44Var.c;
                try {
                    if (s44Var.d == null) {
                        s44Var.d = lu6Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    s44Var.d.invoke(lu6Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, ku6.e, ku6Var.a));
            z2 = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z2) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        p44 p44Var = this.z;
        if (p44Var != null) {
            if (menuItem instanceof lu6) {
                ((lu6) menuItem).a(p44Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof lu6;
        if (z3) {
            ((lu6) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            pt0.q(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((lu6) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            pt0.D(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z3) {
            ((lu6) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            pt0.o(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z3) {
            ((lu6) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            pt0.x(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((lu6) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                pt0.v(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z3) {
                ((lu6) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                pt0.u(menuItem, colorStateList);
            }
        }
    }
}
