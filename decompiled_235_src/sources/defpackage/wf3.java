package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf3  reason: default package */
/* loaded from: classes.dex */
public final class wf3 implements Closeable {
    public boolean A;
    public int B;
    public final ReentrantLock L = new ReentrantLock();
    public final RandomAccessFile R;

    public wf3(RandomAccessFile randomAccessFile) {
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

    public final va2 e(long j) {
        ReentrantLock reentrantLock = this.L;
        reentrantLock.lock();
        try {
            if (!this.A) {
                this.B++;
                reentrantLock.unlock();
                return new va2(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
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
