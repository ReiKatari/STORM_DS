package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c93  reason: default package */
/* loaded from: classes.dex */
public final class c93 implements Closeable {
    public boolean A;
    public int B;
    public final ReentrantLock L = new ReentrantLock();
    public final RandomAccessFile R;

    public c93(RandomAccessFile randomAccessFile) {
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

    public final c62 d(long j) {
        ReentrantLock reentrantLock = this.L;
        reentrantLock.lock();
        try {
            if (!this.A) {
                this.B++;
                reentrantLock.unlock();
                return new c62(this, j);
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
