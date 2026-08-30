package ed;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zc.a0;
import zc.i0;
import zc.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends zc.q implements a0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4454b0 = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final /* synthetic */ a0 L;
    public final zc.q R;
    public final int X;
    public final k Y;
    public final Object Z;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public g(zc.q qVar, int i2) {
        a0 a0Var;
        if (qVar instanceof a0) {
            a0Var = (a0) qVar;
        } else {
            a0Var = null;
        }
        this.L = a0Var == null ? z.f15043a : a0Var;
        this.R = qVar;
        this.X = i2;
        this.Y = new k();
        this.Z = new Object();
    }

    @Override // zc.a0
    public final i0 J(long j2, Runnable runnable, cc.g gVar) {
        return this.L.J(j2, runnable, gVar);
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        Runnable b02;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4454b0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && c0() && (b02 = b0()) != null) {
            try {
                b.i(this.R, this, new m0.h(1, this, b02, false));
            } catch (Throwable th2) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th2;
            }
        }
    }

    @Override // zc.q
    public final void Y(cc.g gVar, Runnable runnable) {
        Runnable b02;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4454b0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && c0() && (b02 = b0()) != null) {
            try {
                this.R.Y(this, new m0.h(1, this, b02, false));
            } catch (Throwable th2) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th2;
            }
        }
    }

    @Override // zc.q
    public final zc.q a0(int i2) {
        b.a(1);
        if (1 >= this.X) {
            return this;
        }
        return super.a0(1);
    }

    public final Runnable b0() {
        while (true) {
            Runnable runnable = (Runnable) this.Y.d();
            if (runnable == null) {
                synchronized (this.Z) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4454b0;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.Y.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean c0() {
        synchronized (this.Z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4454b0;
            if (atomicIntegerFieldUpdater.get(this) >= this.X) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // zc.q
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.R);
        sb2.append(".limitedParallelism(");
        return w.d.p(sb2, this.X, ')');
    }

    @Override // zc.a0
    public final void v(long j2, zc.h hVar) {
        this.L.v(j2, hVar);
    }
}
