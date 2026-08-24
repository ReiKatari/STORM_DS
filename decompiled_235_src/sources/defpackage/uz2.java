package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz2  reason: default package */
/* loaded from: classes.dex */
public final class uz2 implements ui6 {
    public final boolean A;
    public final k80 B = new Object();
    public boolean L;
    public final /* synthetic */ xz2 R;

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    public uz2(xz2 xz2Var, boolean z) {
        this.R = xz2Var;
        this.A = z;
    }

    @Override // defpackage.ui6
    public final void O(k80 k80Var, long j) {
        TimeZone timeZone = az7.a;
        k80 k80Var2 = this.B;
        k80Var2.O(k80Var, j);
        while (k80Var2.B >= 16384) {
            e(false);
        }
    }

    @Override // defpackage.ui6
    public final b67 b() {
        return this.R.g0;
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        xz2 xz2Var = this.R;
        TimeZone timeZone = az7.a;
        synchronized (xz2Var) {
            if (this.L) {
                return;
            }
            if (xz2Var.f() == null) {
                z = true;
            } else {
                z = false;
            }
            xz2 xz2Var2 = this.R;
            if (!xz2Var2.e0.A) {
                if (this.B.B > 0) {
                    while (this.B.B > 0) {
                        e(true);
                    }
                } else if (z) {
                    xz2Var2.B.u(xz2Var2.A, true, null, 0L);
                }
            }
            xz2 xz2Var3 = this.R;
            synchronized (xz2Var3) {
                this.L = true;
                xz2Var3.notifyAll();
            }
            this.R.B.flush();
            this.R.a();
        }
    }

    public final void e(boolean z) {
        long min;
        boolean z2;
        boolean z3;
        xz2 xz2Var = this.R;
        synchronized (xz2Var) {
            xz2Var.g0.i();
            while (xz2Var.R >= xz2Var.X && !this.A && !this.L && xz2Var.f() == null) {
                try {
                    xz2Var.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            xz2Var.g0.m();
            xz2Var.b();
            min = Math.min(xz2Var.X - xz2Var.R, this.B.B);
            xz2Var.R += min;
            if (z && min == this.B.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        this.R.g0.i();
        try {
            xz2 xz2Var2 = this.R;
            xz2Var2.B.u(xz2Var2.A, z3, this.B, min);
        } finally {
            this.R.g0.m();
        }
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
        xz2 xz2Var = this.R;
        TimeZone timeZone = az7.a;
        synchronized (xz2Var) {
            xz2Var.b();
        }
        while (this.B.B > 0) {
            e(false);
            this.R.B.flush();
        }
    }
}
