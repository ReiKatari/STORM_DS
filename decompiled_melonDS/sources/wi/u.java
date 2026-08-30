package wi;

import fj.e0;
import fj.i0;
import java.io.InterruptedIOException;
import java.util.TimeZone;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements e0 {
    public final boolean A;
    public final fj.e B = new Object();
    public boolean L;
    public final /* synthetic */ x R;

    /* JADX WARN: Type inference failed for: r1v1, types: [fj.e, java.lang.Object] */
    public u(x xVar, boolean z10) {
        this.R = xVar;
        this.A = z10;
    }

    @Override // fj.e0
    public final void A(fj.e eVar, long j2) {
        TimeZone timeZone = qi.g.f12552a;
        fj.e eVar2 = this.B;
        eVar2.A(eVar, j2);
        while (eVar2.B >= 16384) {
            d(false);
        }
    }

    @Override // fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        x xVar = this.R;
        TimeZone timeZone = qi.g.f12552a;
        synchronized (xVar) {
            if (this.L) {
                return;
            }
            if (xVar.f() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            x xVar2 = this.R;
            if (!xVar2.f14286c0.A) {
                if (this.B.B > 0) {
                    while (this.B.B > 0) {
                        d(true);
                    }
                } else if (z10) {
                    xVar2.B.w(xVar2.A, true, null, 0L);
                }
            }
            x xVar3 = this.R;
            synchronized (xVar3) {
                this.L = true;
                xVar3.notifyAll();
            }
            this.R.B.flush();
            this.R.a();
        }
    }

    public final void d(boolean z10) {
        long min;
        boolean z11;
        boolean z12;
        x xVar = this.R;
        synchronized (xVar) {
            xVar.f14288e0.h();
            while (xVar.R >= xVar.X && !this.A && !this.L && xVar.f() == null) {
                try {
                    xVar.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            xVar.f14288e0.l();
            xVar.b();
            min = Math.min(xVar.X - xVar.R, this.B.B);
            xVar.R += min;
            if (z10 && min == this.B.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11;
        }
        this.R.f14288e0.h();
        try {
            x xVar2 = this.R;
            xVar2.B.w(xVar2.A, z12, this.B, min);
        } finally {
            this.R.f14288e0.l();
        }
    }

    @Override // fj.e0
    public final i0 f() {
        return this.R.f14288e0;
    }

    @Override // fj.e0, java.io.Flushable
    public final void flush() {
        x xVar = this.R;
        TimeZone timeZone = qi.g.f12552a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.B.B > 0) {
            d(false);
            this.R.B.flush();
        }
    }
}
