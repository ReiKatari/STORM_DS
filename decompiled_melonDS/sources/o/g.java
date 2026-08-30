package o;

import a6.q;
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
import p.n;
import p.o;
import p.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f10454a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10461h;

    /* renamed from: i  reason: collision with root package name */
    public int f10462i;

    /* renamed from: j  reason: collision with root package name */
    public int f10463j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f10464k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f10465l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public char f10466n;

    /* renamed from: o  reason: collision with root package name */
    public int f10467o;

    /* renamed from: p  reason: collision with root package name */
    public char f10468p;

    /* renamed from: q  reason: collision with root package name */
    public int f10469q;

    /* renamed from: r  reason: collision with root package name */
    public int f10470r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10471s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10472t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10473u;

    /* renamed from: v  reason: collision with root package name */
    public int f10474v;

    /* renamed from: w  reason: collision with root package name */
    public int f10475w;

    /* renamed from: x  reason: collision with root package name */
    public String f10476x;

    /* renamed from: y  reason: collision with root package name */
    public String f10477y;

    /* renamed from: z  reason: collision with root package name */
    public o f10478z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b  reason: collision with root package name */
    public int f10455b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f10456c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f10457d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f10458e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10459f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10460g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f10454a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f10483c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.MenuItem$OnMenuItemClickListener, o.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z10;
        h hVar = this.E;
        Context context = hVar.f10483c;
        MenuItem enabled = menuItem.setChecked(this.f10471s).setVisible(this.f10472t).setEnabled(this.f10473u);
        boolean z11 = false;
        if (this.f10470r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f10465l).setIcon(this.m);
        int i2 = this.f10474v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.f10477y != null) {
            if (!context.isRestricted()) {
                if (hVar.f10484d == null) {
                    hVar.f10484d = h.a(context);
                }
                Object obj = hVar.f10484d;
                String str = this.f10477y;
                ?? obj2 = new Object();
                obj2.A = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.B = cls.getMethod(str, f.L);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e6) {
                    StringBuilder u4 = w.d.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    u4.append(cls.getName());
                    InflateException inflateException = new InflateException(u4.toString());
                    inflateException.initCause(e6);
                    throw inflateException;
                }
            } else {
                a0.j.p("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.f10470r >= 2) {
            if (menuItem instanceof n) {
                n nVar = (n) menuItem;
                nVar.f11155x = (nVar.f11155x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                s5.a aVar = sVar.f11162c;
                try {
                    if (sVar.f11163d == null) {
                        sVar.f11163d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f11163d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f10476x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f10479e, hVar.f10481a));
            z11 = true;
        }
        int i10 = this.f10475w;
        if (i10 > 0) {
            if (!z11) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f10478z;
        if (oVar != null) {
            if (menuItem instanceof s5.a) {
                ((s5.a) menuItem).a(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof s5.a;
        if (z12) {
            ((s5.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q.f(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((s5.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q.j(menuItem, charSequence2);
        }
        char c4 = this.f10466n;
        int i11 = this.f10467o;
        if (z12) {
            ((s5.a) menuItem).setAlphabeticShortcut(c4, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q.e(menuItem, c4, i11);
        }
        char c10 = this.f10468p;
        int i12 = this.f10469q;
        if (z12) {
            ((s5.a) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q.i(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((s5.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((s5.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.g(menuItem, colorStateList);
            }
        }
    }
}
