package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge5  reason: default package */
/* loaded from: classes.dex */
public final class ge5 implements Runnable {
    public final nb0 A;
    public volatile AtomicInteger B = new AtomicInteger(0);
    public final /* synthetic */ je5 L;

    public ge5(je5 je5Var, nb0 nb0Var) {
        this.L = je5Var;
        this.A = nb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eb ebVar;
        String concat = "OkHttp ".concat(((i03) this.L.B.B).g());
        je5 je5Var = this.L;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            je5Var.X.i();
            boolean z = false;
            try {
                try {
                    this.A.f(je5Var, je5Var.g());
                    ebVar = je5Var.A.a;
                } catch (IOException e) {
                    e = e;
                    z = true;
                    if (z) {
                        kx4 kx4Var = kx4.a;
                        kx4.a.i("Callback failure for ".concat(je5.a(je5Var)), 4, e);
                    } else {
                        this.A.k(je5Var, e);
                    }
                    ebVar = je5Var.A.a;
                    ebVar.getClass();
                    eb.L(ebVar, null, null, this, 3);
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    je5Var.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.initCause(th);
                        this.A.k(je5Var, iOException);
                    }
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                        ebVar = je5Var.A.a;
                        ebVar.getClass();
                        eb.L(ebVar, null, null, this, 3);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            ebVar.getClass();
            eb.L(ebVar, null, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
