package m0;

import j0.v0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {
    public static Object a(Future future) {
        boolean isDone = future.isDone();
        p7.m.o("Future was expected to be done, " + future, isDone);
        return b(future);
    }

    public static Object b(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static k c(Object obj) {
        if (obj == null) {
            return k.L;
        }
        return new k(0, obj);
    }

    public static ta.a d(ta.a aVar) {
        aVar.getClass();
        if (aVar.isDone()) {
            return aVar;
        }
        return a.a.A(new e(aVar, 1));
    }

    public static void e(ta.a aVar, b5.i iVar) {
        f(true, aVar, iVar, ij.a.D());
    }

    public static void f(boolean z10, ta.a aVar, b5.i iVar, l0.a aVar2) {
        aVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        aVar.a(new h(0, aVar, new v0(iVar, 1)), aVar2);
        if (z10) {
            iVar.a(new ad.g(11, aVar), ij.a.D());
        }
    }

    public static b g(ta.a aVar, a aVar2, Executor executor) {
        b bVar = new b(aVar2, aVar);
        aVar.a(bVar, executor);
        return bVar;
    }
}
