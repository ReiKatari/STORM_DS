package defpackage;

import android.os.Looper;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx3  reason: default package */
/* loaded from: classes.dex */
public abstract class qx3 {
    public static final Object k = new Object();
    public final Object a;
    public final s36 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final g15 j;

    public qx3() {
        this.a = new Object();
        this.b = new s36();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new g15(this, 15);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        zt.l0().e.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        i.m(lb1.A("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(px3 px3Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (px3Var != null) {
                if (px3Var.b) {
                    int i = px3Var.c;
                    int i2 = this.g;
                    if (i < i2) {
                        px3Var.c = i2;
                        px3Var.a.a(this.e);
                    }
                }
                px3Var = null;
            } else {
                s36 s36Var = this.b;
                s36Var.getClass();
                q36 q36Var = new q36(s36Var);
                s36Var.L.put(q36Var, Boolean.FALSE);
                while (q36Var.hasNext()) {
                    px3 px3Var2 = (px3) ((Map.Entry) q36Var.next()).getValue();
                    if (px3Var2.b) {
                        int i3 = px3Var2.c;
                        int i4 = this.g;
                        if (i3 < i4) {
                            px3Var2.c = i4;
                            px3Var2.a.a(this.e);
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

    public final void d(fi4 fi4Var) {
        Object obj;
        a("observeForever");
        px3 px3Var = new px3(this, fi4Var);
        s36 s36Var = this.b;
        p36 a = s36Var.a(fi4Var);
        if (a != null) {
            obj = a.B;
        } else {
            p36 p36Var = new p36(fi4Var, px3Var);
            s36Var.R++;
            p36 p36Var2 = s36Var.B;
            if (p36Var2 == null) {
                s36Var.A = p36Var;
                s36Var.B = p36Var;
            } else {
                p36Var2.L = p36Var;
                p36Var.R = p36Var2;
                s36Var.B = p36Var;
            }
            obj = null;
        }
        if (((px3) obj) != null) {
            return;
        }
        px3Var.a(true);
    }

    public final void e(fi4 fi4Var) {
        a("removeObserver");
        px3 px3Var = (px3) this.b.b(fi4Var);
        if (px3Var == null) {
            return;
        }
        px3Var.a(false);
    }

    public abstract void f(Object obj);

    public qx3(Object obj) {
        this.a = new Object();
        this.b = new s36();
        this.c = 0;
        this.f = k;
        this.j = new g15(this, 15);
        this.e = obj;
        this.g = 0;
    }
}
