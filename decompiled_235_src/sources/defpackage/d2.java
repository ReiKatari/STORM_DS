package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d2  reason: default package */
/* loaded from: classes.dex */
public abstract class d2 {
    public Object a;
    public Object b;

    public d2(int i) {
        switch (i) {
            case 4:
                this.a = g04.t(1);
                this.b = new tu0();
                return;
            default:
                this.b = new int[2];
                return;
        }
    }

    public void d() {
        cr crVar = (cr) this.a;
        if (crVar != null) {
            try {
                ((fr) this.b).g0.unregisterReceiver(crVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (menuItem instanceof lu6) {
            lu6 lu6Var = (lu6) menuItem;
            if (((ci6) this.b) == null) {
                this.b = new ci6(0);
            }
            MenuItem menuItem2 = (MenuItem) ((ci6) this.b).get(lu6Var);
            if (menuItem2 == null) {
                s44 s44Var = new s44((Context) this.a, lu6Var);
                ((ci6) this.b).put(lu6Var, s44Var);
                return s44Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int[] i(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = (int[]) this.b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    public String j() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        nb3.a0("text");
        throw null;
    }

    public boolean k() {
        if (((d00) this.a).b && ((c00) this.b).b) {
            return true;
        }
        return false;
    }

    public abstract void m();

    public abstract void p();

    public abstract int[] q(int i);

    public void r() {
        d();
        IntentFilter e = e();
        if (e.countActions() == 0) {
            return;
        }
        if (((cr) this.a) == null) {
            this.a = new cr(this, 0);
        }
        ((fr) this.b).g0.registerReceiver((cr) this.a, e);
    }

    public void l() {
    }

    public void o() {
    }

    public void n(b00 b00Var) {
    }

    public d2(kj2 kj2Var) {
        this.a = new d00(this, 0);
        this.b = new c00(this, kj2Var);
    }

    public d2(Context context) {
        this.a = context;
    }

    public d2(fr frVar) {
        this.b = frVar;
    }
}
