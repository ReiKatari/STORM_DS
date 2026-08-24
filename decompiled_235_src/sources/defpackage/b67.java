package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b67  reason: default package */
/* loaded from: classes.dex */
public class b67 {
    public static final a67 d = new Object();
    public boolean a;
    public long b;
    public long c;

    public b67 a() {
        this.a = false;
        return this;
    }

    public b67 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        i.m("No deadline");
        return 0L;
    }

    public b67 d(long j) {
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

    public b67 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        i.f(lb1.h(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
