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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pi6  reason: default package */
/* loaded from: classes.dex */
public final class pi6 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ qi6 E;
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
    public ax3 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public pi6(qi6 qi6Var, Menu menu) {
        this.E = qi6Var;
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
        qi6 qi6Var = this.E;
        Context context = qi6Var.c;
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
                if (qi6Var.d == null) {
                    qi6Var.d = qi6.a(context);
                }
                Object obj = qi6Var.d;
                String str = this.y;
                oi6 oi6Var = new oi6();
                oi6Var.B = obj;
                Class<?> cls = obj.getClass();
                try {
                    oi6Var.L = cls.getMethod(str, oi6.R);
                    menuItem.setOnMenuItemClickListener(oi6Var);
                } catch (Exception e) {
                    StringBuilder u = b31.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    u.append(cls.getName());
                    InflateException inflateException = new InflateException(u.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                i.n("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof zw3) {
                zw3 zw3Var = (zw3) menuItem;
                zw3Var.x = (zw3Var.x & (-5)) | 4;
            } else if (menuItem instanceof dx3) {
                dx3 dx3Var = (dx3) menuItem;
                ri6 ri6Var = dx3Var.c;
                try {
                    if (dx3Var.d == null) {
                        dx3Var.d = ri6Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    dx3Var.d.invoke(ri6Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, qi6.e, qi6Var.a));
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
        ax3 ax3Var = this.z;
        if (ax3Var != null) {
            if (menuItem instanceof ri6) {
                ((ri6) menuItem).b(ax3Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof ri6;
        if (z3) {
            ((ri6) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cr0.o(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((ri6) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cr0.B(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z3) {
            ((ri6) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cr0.m(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z3) {
            ((ri6) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cr0.v(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((ri6) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                cr0.t(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z3) {
                ((ri6) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                cr0.s(menuItem, colorStateList);
            }
        }
    }
}
