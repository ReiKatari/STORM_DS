package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw  reason: default package */
/* loaded from: classes.dex */
public class pw extends b67 {
    public static final zb h;
    public static pw i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f = -1;
    public long g;

    static {
        zb zbVar = new zb((char) 0, 11);
        zbVar.L = new pw[8];
        h = zbVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        k = newCondition;
        l = 60000L;
        m = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 == 0 && !z) {
            return;
        }
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            if (this.e == 0) {
                this.e = 1;
                cs1.n(this);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            boolean z = false;
            this.e = 0;
            if (i2 == 1) {
                h.u(this);
                return false;
            }
            if (i2 == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        throw null;
    }

    public void l() {
    }
}
