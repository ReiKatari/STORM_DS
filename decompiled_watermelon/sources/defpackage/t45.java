package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t45  reason: default package */
/* loaded from: classes.dex */
public final class t45 implements Runnable {
    public final f90 A;
    public volatile AtomicInteger B = new AtomicInteger(0);
    public final /* synthetic */ w45 L;

    public t45(w45 w45Var, f90 f90Var) {
        this.L = w45Var;
        this.A = f90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q9 q9Var;
        String concat = "OkHttp ".concat(((hu2) this.L.B.B).g());
        w45 w45Var = this.L;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            w45Var.R.h();
            boolean z = false;
            try {
                try {
                    this.A.d(w45Var, w45Var.h());
                    q9Var = w45Var.A.a;
                } catch (IOException e) {
                    e = e;
                    z = true;
                    if (z) {
                        fo4 fo4Var = fo4.a;
                        fo4.a.i(4, "Callback failure for ".concat(w45.a(w45Var)), e);
                    } else {
                        this.A.k(w45Var, e);
                    }
                    q9Var = w45Var.A.a;
                    q9Var.getClass();
                    q9.K(q9Var, null, null, this, 3);
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    w45Var.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.initCause(th);
                        this.A.k(w45Var, iOException);
                    }
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                        q9Var = w45Var.A.a;
                        q9Var.getClass();
                        q9.K(q9Var, null, null, this, 3);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            q9Var.getClass();
            q9.K(q9Var, null, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
