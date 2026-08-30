package q8;

import ai.b1;
import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12339a = p8.v.g("WorkerWrapper");

    public static final Object a(ta.a aVar, p8.u uVar, ec.j jVar) {
        Object obj;
        try {
            if (aVar.isDone()) {
                boolean z10 = false;
                while (true) {
                    try {
                        obj = aVar.get();
                        break;
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return obj;
            }
            zc.h hVar = new zc.h(1, pc.a.A(jVar));
            hVar.v();
            aVar.a(new b5.o(aVar, hVar, 1), p8.k.INSTANCE);
            hVar.x(new b1(6, uVar, aVar));
            Object u4 = hVar.u();
            dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
            return u4;
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
