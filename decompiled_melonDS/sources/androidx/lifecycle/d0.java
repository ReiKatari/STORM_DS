package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f1459k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1460a;

    /* renamed from: b  reason: collision with root package name */
    public final s.f f1461b;

    /* renamed from: c  reason: collision with root package name */
    public int f1462c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1463d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1464e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1465f;

    /* renamed from: g  reason: collision with root package name */
    public int f1466g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1467h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1468i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f1469j;

    public d0() {
        this.f1460a = new Object();
        this.f1461b = new s.f();
        this.f1462c = 0;
        Object obj = f1459k;
        this.f1465f = obj;
        this.f1469j = new b0(this);
        this.f1464e = obj;
        this.f1466g = -1;
    }

    public static void a(String str) {
        r.a.D().f12557b.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        a0.j.p(kc.a.g("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(c0 c0Var) {
        if (this.f1467h) {
            this.f1468i = true;
            return;
        }
        this.f1467h = true;
        do {
            this.f1468i = false;
            if (c0Var != null) {
                if (c0Var.f1451b) {
                    int i2 = c0Var.f1452c;
                    int i10 = this.f1466g;
                    if (i2 < i10) {
                        c0Var.f1452c = i10;
                        c0Var.f1450a.a(this.f1464e);
                    }
                }
                c0Var = null;
            } else {
                s.f fVar = this.f1461b;
                fVar.getClass();
                s.d dVar = new s.d(fVar);
                fVar.L.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    c0 c0Var2 = (c0) ((Map.Entry) dVar.next()).getValue();
                    if (c0Var2.f1451b) {
                        int i11 = c0Var2.f1452c;
                        int i12 = this.f1466g;
                        if (i11 < i12) {
                            c0Var2.f1452c = i12;
                            c0Var2.f1450a.a(this.f1464e);
                        }
                    }
                    if (this.f1468i) {
                        break;
                    }
                }
            }
        } while (this.f1468i);
        this.f1467h = false;
    }

    public Object c() {
        Object obj = this.f1464e;
        if (obj != f1459k) {
            return obj;
        }
        return null;
    }

    public final void d(g0 g0Var) {
        Object obj;
        a("observeForever");
        c0 c0Var = new c0(this, g0Var);
        s.f fVar = this.f1461b;
        s.c a10 = fVar.a(g0Var);
        if (a10 != null) {
            obj = a10.B;
        } else {
            s.c cVar = new s.c(g0Var, c0Var);
            fVar.R++;
            s.c cVar2 = fVar.B;
            if (cVar2 == null) {
                fVar.A = cVar;
                fVar.B = cVar;
            } else {
                cVar2.L = cVar;
                cVar.R = cVar2;
                fVar.B = cVar;
            }
            obj = null;
        }
        if (((c0) obj) != null) {
            return;
        }
        c0Var.a(true);
    }

    public final void g(g0 g0Var) {
        a("removeObserver");
        c0 c0Var = (c0) this.f1461b.b(g0Var);
        if (c0Var == null) {
            return;
        }
        c0Var.a(false);
    }

    public abstract void h(Object obj);

    public void e() {
    }

    public void f() {
    }

    public d0(Object obj) {
        this.f1460a = new Object();
        this.f1461b = new s.f();
        this.f1462c = 0;
        this.f1465f = f1459k;
        this.f1469j = new b0(this);
        this.f1464e = obj;
        this.f1466g = 0;
    }
}
