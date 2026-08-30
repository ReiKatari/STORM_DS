package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tt2  reason: default package */
/* loaded from: classes.dex */
public final class tt2 implements g76 {
    public final boolean A;
    public final f60 B = new Object();
    public boolean L;
    public final /* synthetic */ wt2 R;

    /* JADX WARN: Type inference failed for: r1v1, types: [f60, java.lang.Object] */
    public tt2(wt2 wt2Var, boolean z) {
        this.R = wt2Var;
        this.A = z;
    }

    @Override // defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        wt2 wt2Var = this.R;
        TimeZone timeZone = ik7.a;
        synchronized (wt2Var) {
            if (this.L) {
                return;
            }
            if (wt2Var.f() == null) {
                z = true;
            } else {
                z = false;
            }
            wt2 wt2Var2 = this.R;
            if (!wt2Var2.d0.A) {
                if (this.B.B > 0) {
                    while (this.B.B > 0) {
                        d(true);
                    }
                } else if (z) {
                    wt2Var2.B.B(wt2Var2.A, true, null, 0L);
                }
            }
            wt2 wt2Var3 = this.R;
            synchronized (wt2Var3) {
                this.L = true;
                wt2Var3.notifyAll();
            }
            this.R.B.flush();
            this.R.a();
        }
    }

    public final void d(boolean z) {
        long min;
        boolean z2;
        boolean z3;
        wt2 wt2Var = this.R;
        synchronized (wt2Var) {
            wt2Var.f0.h();
            while (wt2Var.R >= wt2Var.X && !this.A && !this.L && wt2Var.f() == null) {
                try {
                    wt2Var.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            wt2Var.f0.l();
            wt2Var.b();
            min = Math.min(wt2Var.X - wt2Var.R, this.B.B);
            wt2Var.R += min;
            if (z && min == this.B.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        this.R.f0.h();
        try {
            wt2 wt2Var2 = this.R;
            wt2Var2.B.B(wt2Var2.A, z3, this.B, min);
        } finally {
            this.R.f0.l();
        }
    }

    @Override // defpackage.g76
    public final kt6 f() {
        return this.R.f0;
    }

    @Override // defpackage.g76, java.io.Flushable
    public final void flush() {
        wt2 wt2Var = this.R;
        TimeZone timeZone = ik7.a;
        synchronized (wt2Var) {
            wt2Var.b();
        }
        while (this.B.B > 0) {
            d(false);
            this.R.B.flush();
        }
    }

    @Override // defpackage.g76
    public final void l(f60 f60Var, long j) {
        TimeZone timeZone = ik7.a;
        f60 f60Var2 = this.B;
        f60Var2.l(f60Var, j);
        while (f60Var2.B >= 16384) {
            d(false);
        }
    }
}
