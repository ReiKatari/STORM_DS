package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va2  reason: default package */
/* loaded from: classes.dex */
public final class va2 implements in6 {
    public final wf3 A;
    public long B;
    public boolean L;

    public va2(wf3 wf3Var, long j) {
        this.A = wf3Var;
        this.B = j;
    }

    @Override // defpackage.in6
    public final b67 b() {
        return b67.d;
    }

    @Override // defpackage.in6
    public final long b0(k80 k80Var, long j) {
        long j2;
        long j3;
        int i;
        k80Var.getClass();
        if (!this.L) {
            wf3 wf3Var = this.A;
            long j4 = this.B;
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 < j5) {
                        o96 j0 = k80Var.j0(1);
                        byte[] bArr = j0.a;
                        int i2 = j0.c;
                        j2 = -1;
                        int min = (int) Math.min(j5 - j6, 8192 - i2);
                        synchronized (wf3Var) {
                            bArr.getClass();
                            wf3Var.R.seek(j6);
                            i = 0;
                            while (true) {
                                if (i >= min) {
                                    break;
                                }
                                int read = wf3Var.R.read(bArr, i2, min - i);
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
                            if (j0.b == j0.c) {
                                k80Var.A = j0.a();
                                r96.a(j0);
                            }
                            if (j4 == j6) {
                                j3 = -1;
                            }
                        } else {
                            j0.c += i;
                            long j7 = i;
                            j6 += j7;
                            k80Var.B += j7;
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
            i.f(lb1.h(j, "byteCount < 0: "));
            return 0L;
        }
        i.m("closed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wf3 wf3Var = this.A;
        if (this.L) {
            return;
        }
        this.L = true;
        ReentrantLock reentrantLock = wf3Var.L;
        reentrantLock.lock();
        try {
            int i = wf3Var.B - 1;
            wf3Var.B = i;
            if (i == 0) {
                if (wf3Var.A) {
                    synchronized (wf3Var) {
                        wf3Var.R.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
