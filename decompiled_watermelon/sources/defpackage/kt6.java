package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kt6  reason: default package */
/* loaded from: classes.dex */
public class kt6 {
    public static final jt6 d = new Object();
    public boolean a;
    public long b;
    public long c;

    public kt6 a() {
        this.a = false;
        return this;
    }

    public kt6 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        i.n("No deadline");
        return 0L;
    }

    public kt6 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public kt6 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        i.g(wh1.h(j, "timeout < 0: "));
        return null;
    }
}
