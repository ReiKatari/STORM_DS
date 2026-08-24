package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz2  reason: default package */
/* loaded from: classes.dex */
public final class vz2 implements in6 {
    public final long A;
    public boolean B;
    public final k80 L = new Object();
    public final k80 R = new Object();
    public boolean X;
    public final /* synthetic */ xz2 Y;

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [k80, java.lang.Object] */
    public vz2(xz2 xz2Var, long j, boolean z) {
        this.Y = xz2Var;
        this.A = j;
        this.B = z;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return this.Y.f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:48:0x00c5, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x008b, B:39:0x00a4, B:42:0x00ae, B:44:0x00b4, B:45:0x00c0, B:59:0x00e3, B:60:0x00ea), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: all -> 0x004b, TryCatch #2 {, blocks: (B:6:0x0010, B:8:0x001d, B:14:0x0027, B:48:0x00c5, B:18:0x0030, B:20:0x0036, B:22:0x003a, B:24:0x003e, B:28:0x004f, B:30:0x0053, B:32:0x005d, B:34:0x007a, B:36:0x008b, B:39:0x00a4, B:42:0x00ae, B:44:0x00b4, B:45:0x00c0, B:59:0x00e3, B:60:0x00ea), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // defpackage.in6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b0(k80 k80Var, long j) {
        boolean z;
        boolean z2;
        Throwable th;
        long j2;
        long j3;
        k80Var.getClass();
        long j4 = 0;
        if (j < 0) {
            i.f(lb1.h(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            xz2 xz2Var = this.Y;
            synchronized (xz2Var) {
                xz2Var.B.getClass();
                uz2 uz2Var = xz2Var.e0;
                z = true;
                if (!uz2Var.L && !uz2Var.A) {
                    z2 = false;
                    if (z2) {
                        xz2Var.f0.i();
                    }
                    if (xz2Var.f() == null && !this.B) {
                        th = xz2Var.i0;
                        if (th == null) {
                            a62 f = xz2Var.f();
                            f.getClass();
                            th = new lr6(f);
                        }
                    } else {
                        th = null;
                    }
                    if (this.X) {
                        k80 k80Var2 = this.R;
                        long j5 = k80Var2.B;
                        if (j5 > j4) {
                            j3 = k80Var2.b0(k80Var, Math.min(j, j5));
                            tc7.c(xz2Var.L, j3, 0L, 2);
                            long b = xz2Var.L.b();
                            if (th == null) {
                                j2 = j4;
                                if (b >= xz2Var.B.m0.a() / 2) {
                                    xz2Var.B.x(xz2Var.A, b);
                                    tc7.c(xz2Var.L, 0L, b, 1);
                                }
                            } else {
                                j2 = j4;
                            }
                            z = false;
                        } else {
                            j2 = j4;
                            if (!this.B && th == null) {
                                try {
                                    xz2Var.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            } else {
                                z = false;
                            }
                            j3 = -1;
                        }
                        if (z2) {
                            xz2Var.f0.m();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                }
                z2 = true;
                if (z2) {
                }
                if (xz2Var.f() == null) {
                }
                th = null;
                if (this.X) {
                }
            }
            this.Y.B.l0.getClass();
            if (z) {
                j4 = j2;
            } else if (j3 != -1) {
                return j3;
            } else {
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        xz2 xz2Var = this.Y;
        synchronized (xz2Var) {
            this.X = true;
            k80 k80Var = this.R;
            j = k80Var.B;
            k80Var.e();
            xz2Var.notifyAll();
        }
        if (j > 0) {
            xz2 xz2Var2 = this.Y;
            TimeZone timeZone = az7.a;
            xz2Var2.B.r(j);
        }
        this.Y.a();
    }
}
