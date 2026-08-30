package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b2  reason: default package */
/* loaded from: classes.dex */
public abstract class b2 {
    public Object a;
    public Object b;

    public b2(int i) {
        switch (i) {
            case 4:
                this.a = w81.f(1);
                this.b = new gs0();
                return;
            default:
                this.b = new int[2];
                return;
        }
    }

    public void d() {
        qq qqVar = (qq) this.a;
        if (qqVar != null) {
            try {
                ((tq) this.b).f0.unregisterReceiver(qqVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (menuItem instanceof ri6) {
            ri6 ri6Var = (ri6) menuItem;
            if (((m66) this.b) == null) {
                this.b = new m66(0);
            }
            MenuItem menuItem2 = (MenuItem) ((m66) this.b).get(ri6Var);
            if (menuItem2 == null) {
                dx3 dx3Var = new dx3((Context) this.a, ri6Var);
                ((m66) this.b).put(ri6Var, dx3Var);
                return dx3Var;
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
        b53.g0("text");
        throw null;
    }

    public boolean k() {
        if (((my) this.a).b && ((ly) this.b).b) {
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
        if (((qq) this.a) == null) {
            this.a = new qq(0, this);
        }
        ((tq) this.b).f0.registerReceiver((qq) this.a, e);
    }

    public void l() {
    }

    public void o() {
    }

    public b2(ve2 ve2Var) {
        this.a = new my(0, this);
        this.b = new ly(this, ve2Var);
    }

    public void n(ky kyVar) {
    }

    public b2(Context context) {
        this.a = context;
    }

    public b2(tq tqVar) {
        this.b = tqVar;
    }
}
