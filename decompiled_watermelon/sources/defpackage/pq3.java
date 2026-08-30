package defpackage;

import android.os.Looper;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq3  reason: default package */
/* loaded from: classes.dex */
public abstract class pq3 {
    public static final Object k = new Object();
    public final Object a;
    public final ws5 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final es4 j;

    public pq3() {
        this.a = new Object();
        this.b = new ws5();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new es4(15, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        kt.L().h.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        i.n(wh1.A("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(oq3 oq3Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (oq3Var != null) {
                if (oq3Var.b) {
                    int i = oq3Var.c;
                    int i2 = this.g;
                    if (i < i2) {
                        oq3Var.c = i2;
                        oq3Var.a.a(this.e);
                    }
                }
                oq3Var = null;
            } else {
                ws5 ws5Var = this.b;
                ws5Var.getClass();
                us5 us5Var = new us5(ws5Var);
                ws5Var.L.put(us5Var, Boolean.FALSE);
                while (us5Var.hasNext()) {
                    oq3 oq3Var2 = (oq3) ((Map.Entry) us5Var.next()).getValue();
                    if (oq3Var2.b) {
                        int i3 = oq3Var2.c;
                        int i4 = this.g;
                        if (i3 < i4) {
                            oq3Var2.c = i4;
                            oq3Var2.a.a(this.e);
                        }
                    }
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object c() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void d(l94 l94Var) {
        Object obj;
        a("observeForever");
        oq3 oq3Var = new oq3(this, l94Var);
        ws5 ws5Var = this.b;
        ts5 b = ws5Var.b(l94Var);
        if (b != null) {
            obj = b.B;
        } else {
            ts5 ts5Var = new ts5(l94Var, oq3Var);
            ws5Var.R++;
            ts5 ts5Var2 = ws5Var.B;
            if (ts5Var2 == null) {
                ws5Var.A = ts5Var;
                ws5Var.B = ts5Var;
            } else {
                ts5Var2.L = ts5Var;
                ts5Var.R = ts5Var2;
                ws5Var.B = ts5Var;
            }
            obj = null;
        }
        if (((oq3) obj) != null) {
            return;
        }
        oq3Var.a(true);
    }

    public final void e(l94 l94Var) {
        a("removeObserver");
        oq3 oq3Var = (oq3) this.b.c(l94Var);
        if (oq3Var == null) {
            return;
        }
        oq3Var.a(false);
    }

    public abstract void f(Object obj);

    public pq3(Object obj) {
        this.a = new Object();
        this.b = new ws5();
        this.c = 0;
        this.f = k;
        this.j = new es4(15, this);
        this.e = obj;
        this.g = 0;
    }
}
