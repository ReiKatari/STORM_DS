package b5;

import java.util.concurrent.ExecutionException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int A;
    public final ta.a B;
    public final zc.h L;

    public /* synthetic */ o(ta.a aVar, zc.h hVar, int i2) {
        this.A = i2;
        this.B = aVar;
        this.L = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                ta.a aVar = this.B;
                boolean isCancelled = aVar.isCancelled();
                zc.h hVar = this.L;
                if (isCancelled) {
                    hVar.n(null);
                    return;
                }
                try {
                    hVar.h(h.f(aVar));
                    return;
                } catch (ExecutionException e6) {
                    Throwable cause = e6.getCause();
                    if (cause != null) {
                        hVar.h(new yb.k(cause));
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException();
                    nc.k.e(nullPointerException, nc.k.class.getName());
                    throw nullPointerException;
                }
            default:
                ta.a aVar2 = this.B;
                boolean isCancelled2 = aVar2.isCancelled();
                zc.h hVar2 = this.L;
                if (isCancelled2) {
                    hVar2.n(null);
                    return;
                }
                boolean z10 = false;
                while (true) {
                    try {
                        try {
                            Object obj = aVar2.get();
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            hVar2.h(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                    } catch (ExecutionException e10) {
                        Throwable cause2 = e10.getCause();
                        cause2.getClass();
                        hVar2.h(new yb.k(cause2));
                        return;
                    }
                }
        }
    }
}
