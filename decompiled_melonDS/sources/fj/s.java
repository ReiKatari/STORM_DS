package fj;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements Closeable {
    public boolean A;
    public int B;
    public final ReentrantLock L = new ReentrantLock();
    public final RandomAccessFile R;

    public s(RandomAccessFile randomAccessFile) {
        this.R = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.L;
        reentrantLock.lock();
        try {
            if (this.A) {
                return;
            }
            this.A = true;
            if (this.B != 0) {
                return;
            }
            synchronized (this) {
                this.R.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final i d(long j2) {
        ReentrantLock reentrantLock = this.L;
        reentrantLock.lock();
        try {
            if (!this.A) {
                this.B++;
                reentrantLock.unlock();
                return new i(this, j2);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.L;
        reentrantLock.lock();
        try {
            if (!this.A) {
                synchronized (this) {
                    length = this.R.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }
}
