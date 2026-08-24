package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru3  reason: default package */
/* loaded from: classes.dex */
public final class ru3 extends n61 implements ug1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d0 = AtomicIntegerFieldUpdater.newUpdater(ru3.class, "runningWorkers$volatile");
    public final /* synthetic */ ug1 L;
    public final n61 R;
    public final int X;
    public final ly3 Y;
    public final Object Z;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public ru3(n61 n61Var, int i) {
        ug1 ug1Var;
        if (n61Var instanceof ug1) {
            ug1Var = (ug1) n61Var;
        } else {
            ug1Var = null;
        }
        this.L = ug1Var == null ? td1.a : ug1Var;
        this.R = n61Var;
        this.X = i;
        this.Y = new ly3();
        this.Z = new Object();
    }

    @Override // defpackage.ug1
    public final il1 A(long j, Runnable runnable, l61 l61Var) {
        return this.L.A(j, runnable, l61Var);
    }

    @Override // defpackage.ug1
    public final void J(long j, rj0 rj0Var) {
        this.L.J(j, rj0Var);
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        Runnable n0;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && o0() && (n0 = n0()) != null) {
            try {
                ok1.b(this.R, this, new uo2(12, this, n0, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.n61
    public final void k0(l61 l61Var, Runnable runnable) {
        Runnable n0;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && o0() && (n0 = n0()) != null) {
            try {
                this.R.k0(this, new uo2(12, this, n0, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.n61
    public final n61 m0(int i) {
        kn2.u(1);
        if (1 >= this.X) {
            return this;
        }
        return super.m0(1);
    }

    public final Runnable n0() {
        while (true) {
            Runnable runnable = (Runnable) this.Y.d();
            if (runnable == null) {
                synchronized (this.Z) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0;
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

    public final boolean o0() {
        synchronized (this.Z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0;
            if (atomicIntegerFieldUpdater.get(this) >= this.X) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.n61
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.R);
        sb.append(".limitedParallelism(");
        return xg6.q(sb, this.X, ')');
    }
}
