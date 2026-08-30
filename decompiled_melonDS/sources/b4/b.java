package b4;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f1790a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1791b;

    public b(d0.d dVar) {
        this.f1790a = new a7.n(3, this);
        this.f1791b = new f.a(this, dVar);
    }

    public void c() {
        com.squareup.picasso.l lVar = (com.squareup.picasso.l) this.f1790a;
        if (lVar != null) {
            try {
                ((l.x) this.f1791b).f8467e0.unregisterReceiver(lVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1790a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i2);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (menuItem instanceof s5.a) {
            s5.a aVar = (s5.a) menuItem;
            if (((a1.w0) this.f1791b) == null) {
                this.f1791b = new a1.w0(0);
            }
            MenuItem menuItem2 = (MenuItem) ((a1.w0) this.f1791b).get(aVar);
            if (menuItem2 == null) {
                p.s sVar = new p.s((Context) this.f1790a, aVar);
                ((a1.w0) this.f1791b).put(aVar, sVar);
                return sVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int[] h(int i2, int i10) {
        if (i2 >= 0 && i10 >= 0 && i2 != i10) {
            int[] iArr = (int[]) this.f1791b;
            iArr[0] = i2;
            iArr[1] = i10;
            return iArr;
        }
        return null;
    }

    public String i() {
        String str = (String) this.f1790a;
        if (str != null) {
            return str;
        }
        nc.k.f("text");
        throw null;
    }

    public boolean j() {
        if (((a7.n) this.f1790a).f3314b && ((f.a) this.f1791b).f4932b) {
            return true;
        }
        return false;
    }

    public abstract void l();

    public abstract void o();

    public abstract int[] p(int i2);

    public void q() {
        c();
        IntentFilter d4 = d();
        if (d4.countActions() == 0) {
            return;
        }
        if (((com.squareup.picasso.l) this.f1790a) == null) {
            this.f1790a = new com.squareup.picasso.l(2, this);
        }
        ((l.x) this.f1791b).f8467e0.registerReceiver((com.squareup.picasso.l) this.f1790a, d4);
    }

    public b(Context context) {
        this.f1790a = context;
    }

    public b() {
        this.f1791b = new int[2];
    }

    public b(l.x xVar) {
        this.f1791b = xVar;
    }

    public void k() {
    }

    public void n() {
    }

    public void m(d.a aVar) {
    }
}
