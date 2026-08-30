package ed;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.c0;
import zc.l0;
import zc.n1;
import zc.t1;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a0.c f4445a = new a0.c("CLOSED", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final a0.c f4446b = new a0.c("UNDEFINED", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final a0.c f4447c = new a0.c("REUSABLE_CLAIMED", 1);

    /* renamed from: d  reason: collision with root package name */
    public static final a0.c f4448d = new a0.c("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final ai.l f4449e = new ai.l(11);

    /* renamed from: f  reason: collision with root package name */
    public static final ai.l f4450f = new ai.l(12);

    /* renamed from: g  reason: collision with root package name */
    public static final ai.l f4451g = new ai.l(13);

    public static final void a(int i2) {
        if (i2 >= 1) {
            return;
        }
        a0.j.e(w.d.l(i2, "Expected positive parallelism level, but got "));
    }

    public static final Object b(r rVar, long j2, mc.p pVar) {
        while (true) {
            if (rVar.L >= j2 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.A;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            a0.c cVar = f4445a;
            if (obj == cVar) {
                return cVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.j(Long.valueOf(rVar.L + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f4445a) {
            return (r) obj;
        }
        a0.j.p("Does not contain segment");
        return null;
    }

    public static final void d(cc.g gVar, Throwable th2) {
        Throwable runtimeException;
        for (zc.s sVar : d.f4452a) {
            try {
                sVar.z(gVar, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    p7.t.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            p7.t.a(th2, new e(gVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean e(Object obj) {
        if (obj == f4445a) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(cc.g gVar, Object obj) {
        if (obj != f4448d) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                u[] uVarArr = xVar.f4473c;
                int length = uVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i2 = length - 1;
                    u uVar = uVarArr[length];
                    uVar.getClass();
                    uVar.B.set(xVar.f4472b[length]);
                    if (i2 >= 0) {
                        length = i2;
                    } else {
                        return;
                    }
                }
            } else {
                Object L = gVar.L(null, f4450f);
                L.getClass();
                ((u) L).B.set(obj);
            }
        }
    }

    public static final void h(cc.c cVar, Object obj) {
        Object oVar;
        t1 t1Var;
        if (cVar instanceof f) {
            f fVar = (f) cVar;
            zc.q qVar = fVar.R;
            ec.c cVar2 = fVar.X;
            Throwable a10 = yb.l.a(obj);
            if (a10 == null) {
                oVar = obj;
            } else {
                oVar = new zc.o(a10, false);
            }
            if (j(qVar, cVar2.g())) {
                fVar.Y = oVar;
                fVar.L = 1;
                i(qVar, cVar2.g(), fVar);
                return;
            }
            l0 a11 = n1.a();
            if (a11.L >= 4294967296L) {
                fVar.Y = oVar;
                fVar.L = 1;
                a11.c0(fVar);
                return;
            }
            a11.d0(true);
            try {
                y0 y0Var = (y0) cVar2.g().t(zc.r.B);
                if (y0Var != null && !y0Var.d()) {
                    fVar.h(p7.j.o(y0Var.B()));
                } else {
                    Object obj2 = fVar.Z;
                    cc.g g10 = cVar2.g();
                    Object n10 = n(g10, obj2);
                    if (n10 != f4448d) {
                        t1Var = zc.x.E(cVar2, g10, n10);
                    } else {
                        t1Var = null;
                    }
                    cVar2.h(obj);
                    if (t1Var == null || t1Var.l0()) {
                        g(g10, n10);
                    }
                }
                do {
                } while (a11.f0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.h(obj);
    }

    public static final void i(zc.q qVar, cc.g gVar, Runnable runnable) {
        try {
            qVar.X(gVar, runnable);
        } catch (Throwable th2) {
            throw new c0(th2, qVar, gVar);
        }
    }

    public static final boolean j(zc.q qVar, cc.g gVar) {
        try {
            return qVar.Z(gVar);
        } catch (Throwable th2) {
            throw new c0(th2, qVar, gVar);
        }
    }

    public static final long k(String str, long j2, long j10, long j11) {
        String str2;
        int i2 = t.f4468a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        Long X = vc.o.X(str2);
        if (X != null) {
            long longValue = X.longValue();
            if (j10 <= longValue && longValue <= j11) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int l(int i2, int i10, String str) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Preference.DEFAULT_ORDER;
        } else {
            i11 = 2097150;
        }
        return (int) k(str, i2, 1, i11);
    }

    public static final Object m(cc.g gVar) {
        Object L = gVar.L(0, f4449e);
        L.getClass();
        return L;
    }

    public static final Object n(cc.g gVar, Object obj) {
        if (obj == null) {
            obj = m(gVar);
        }
        if (obj == 0) {
            return f4448d;
        }
        if (obj instanceof Integer) {
            return gVar.L(new x(((Number) obj).intValue(), gVar), f4451g);
        }
        u uVar = (u) obj;
        ThreadLocal threadLocal = uVar.B;
        Object obj2 = threadLocal.get();
        threadLocal.set(uVar.A);
        return obj2;
    }
}
