package fj;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b extends i0 {

    /* renamed from: h  reason: collision with root package name */
    public static final bk.a f4968h;

    /* renamed from: i  reason: collision with root package name */
    public static b f4969i;

    /* renamed from: j  reason: collision with root package name */
    public static final ReentrantLock f4970j;

    /* renamed from: k  reason: collision with root package name */
    public static final Condition f4971k;

    /* renamed from: l  reason: collision with root package name */
    public static final long f4972l;
    public static final long m;

    /* renamed from: e  reason: collision with root package name */
    public int f4973e;

    /* renamed from: f  reason: collision with root package name */
    public int f4974f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f4975g;

    static {
        bk.a aVar = new bk.a((char) 0, 1);
        aVar.L = new b[8];
        f4968h = aVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f4970j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        f4971k = newCondition;
        f4972l = 60000L;
        m = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void h() {
        long j2 = this.f4989c;
        boolean z10 = this.f4987a;
        if (j2 == 0 && !z10) {
            return;
        }
        ReentrantLock reentrantLock = f4970j;
        reentrantLock.lock();
        try {
            if (this.f4973e == 0) {
                this.f4973e = 1;
                x8.e.f(this);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f4970j;
        reentrantLock.lock();
        try {
            int i2 = this.f4973e;
            boolean z10 = false;
            this.f4973e = 0;
            if (i2 == 1) {
                f4968h.r(this);
                return false;
            }
            if (i2 == 2) {
                z10 = true;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
