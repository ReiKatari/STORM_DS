package fj;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f4986d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4987a;

    /* renamed from: b  reason: collision with root package name */
    public long f4988b;

    /* renamed from: c  reason: collision with root package name */
    public long f4989c;

    public i0 a() {
        this.f4987a = false;
        return this;
    }

    public i0 b() {
        this.f4989c = 0L;
        return this;
    }

    public long c() {
        if (this.f4987a) {
            return this.f4988b;
        }
        a0.j.p("No deadline");
        return 0L;
    }

    public i0 d(long j2) {
        this.f4987a = true;
        this.f4988b = j2;
        return this;
    }

    public boolean e() {
        return this.f4987a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f4987a && this.f4988b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public i0 g(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j2 >= 0) {
            this.f4989c = timeUnit.toNanos(j2);
            return this;
        }
        a0.j.e(kc.a.e(j2, "timeout < 0: "));
        return null;
    }
}
