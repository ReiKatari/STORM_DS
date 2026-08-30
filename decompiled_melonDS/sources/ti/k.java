package ti;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final pi.h A;
    public volatile AtomicInteger B = new AtomicInteger(0);
    public final /* synthetic */ n L;

    public k(n nVar, pi.h hVar) {
        this.L = nVar;
        this.A = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9.e eVar;
        String concat = "OkHttp ".concat(((pi.r) this.L.B.f14089b).g());
        n nVar = this.L;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            nVar.R.h();
            boolean z10 = false;
            try {
                try {
                    this.A.h(nVar, nVar.h());
                    eVar = nVar.A.f11827a;
                } catch (IOException e6) {
                    e = e6;
                    z10 = true;
                    if (z10) {
                        zi.f fVar = zi.f.f15151a;
                        zi.f.f15151a.i("Callback failure for ".concat(n.a(nVar)), 4, e);
                    } else {
                        this.A.m(nVar, e);
                    }
                    eVar = nVar.A.f11827a;
                    eVar.getClass();
                    b9.e.H(eVar, null, null, this, 3);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                    nVar.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.initCause(th);
                        this.A.m(nVar, iOException);
                    }
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                        eVar = nVar.A.f11827a;
                        eVar.getClass();
                        b9.e.H(eVar, null, null, this, 3);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th3) {
                th = th3;
            }
            eVar.getClass();
            b9.e.H(eVar, null, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
