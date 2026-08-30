package fj;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements g0 {
    public final s A;
    public long B;
    public boolean L;

    public i(s sVar, long j2) {
        this.A = sVar;
        this.B = j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.A;
        if (this.L) {
            return;
        }
        this.L = true;
        ReentrantLock reentrantLock = sVar.L;
        reentrantLock.lock();
        try {
            int i2 = sVar.B - 1;
            sVar.B = i2;
            if (i2 == 0) {
                if (sVar.A) {
                    synchronized (sVar) {
                        sVar.R.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // fj.g0
    public final i0 f() {
        return i0.f4986d;
    }

    @Override // fj.g0
    public final long k(e eVar, long j2) {
        long j10;
        long j11;
        int i2;
        eVar.getClass();
        if (!this.L) {
            s sVar = this.A;
            long j12 = this.B;
            if (j2 >= 0) {
                long j13 = j2 + j12;
                long j14 = j12;
                while (true) {
                    if (j14 < j13) {
                        b0 a02 = eVar.a0(1);
                        byte[] bArr = a02.f4976a;
                        int i10 = a02.f4978c;
                        j10 = -1;
                        int min = (int) Math.min(j13 - j14, 8192 - i10);
                        synchronized (sVar) {
                            bArr.getClass();
                            sVar.R.seek(j14);
                            i2 = 0;
                            while (true) {
                                if (i2 >= min) {
                                    break;
                                }
                                int read = sVar.R.read(bArr, i10, min - i2);
                                if (read == -1) {
                                    if (i2 == 0) {
                                        i2 = -1;
                                    }
                                } else {
                                    i2 += read;
                                }
                            }
                        }
                        if (i2 == -1) {
                            if (a02.f4977b == a02.f4978c) {
                                eVar.A = a02.a();
                                c0.a(a02);
                            }
                            if (j12 == j14) {
                                j11 = -1;
                            }
                        } else {
                            a02.f4978c += i2;
                            long j15 = i2;
                            j14 += j15;
                            eVar.B += j15;
                        }
                    } else {
                        j10 = -1;
                        break;
                    }
                }
                j11 = j14 - j12;
                if (j11 != j10) {
                    this.B += j11;
                }
                return j11;
            }
            a0.j.e(kc.a.e(j2, "byteCount < 0: "));
            return 0L;
        }
        a0.j.p("closed");
        return 0L;
    }
}
