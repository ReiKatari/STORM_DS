package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c62  reason: default package */
/* loaded from: classes.dex */
public final class c62 implements sb6 {
    public final c93 A;
    public long B;
    public boolean L;

    public c62(c93 c93Var, long j) {
        this.A = c93Var;
        this.B = j;
    }

    @Override // defpackage.sb6
    public final long L(f60 f60Var, long j) {
        long j2;
        long j3;
        int i;
        f60Var.getClass();
        if (!this.L) {
            c93 c93Var = this.A;
            long j4 = this.B;
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 < j5) {
                        cy5 f0 = f60Var.f0(1);
                        byte[] bArr = f0.a;
                        int i2 = f0.c;
                        j2 = -1;
                        int min = (int) Math.min(j5 - j6, 8192 - i2);
                        synchronized (c93Var) {
                            bArr.getClass();
                            c93Var.R.seek(j6);
                            i = 0;
                            while (true) {
                                if (i >= min) {
                                    break;
                                }
                                int read = c93Var.R.read(bArr, i2, min - i);
                                if (read == -1) {
                                    if (i == 0) {
                                        i = -1;
                                    }
                                } else {
                                    i += read;
                                }
                            }
                        }
                        if (i == -1) {
                            if (f0.b == f0.c) {
                                f60Var.A = f0.a();
                                fy5.a(f0);
                            }
                            if (j4 == j6) {
                                j3 = -1;
                            }
                        } else {
                            f0.c += i;
                            long j7 = i;
                            j6 += j7;
                            f60Var.B += j7;
                        }
                    } else {
                        j2 = -1;
                        break;
                    }
                }
                j3 = j6 - j4;
                if (j3 != j2) {
                    this.B += j3;
                }
                return j3;
            }
            i.g(wh1.h(j, "byteCount < 0: "));
            return 0L;
        }
        i.n("closed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c93 c93Var = this.A;
        if (this.L) {
            return;
        }
        this.L = true;
        ReentrantLock reentrantLock = c93Var.L;
        reentrantLock.lock();
        try {
            int i = c93Var.B - 1;
            c93Var.B = i;
            if (i == 0) {
                if (c93Var.A) {
                    synchronized (c93Var) {
                        c93Var.R.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.sb6
    public final kt6 f() {
        return kt6.d;
    }
}
