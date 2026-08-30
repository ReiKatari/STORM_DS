package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn3  reason: default package */
/* loaded from: classes.dex */
public final class pn3 extends g31 implements sc1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c0 = AtomicIntegerFieldUpdater.newUpdater(pn3.class, "runningWorkers$volatile");
    public final /* synthetic */ sc1 L;
    public final g31 R;
    public final int X;
    public final kr3 Y;
    public final Object Z;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public pn3(g31 g31Var, int i) {
        sc1 sc1Var;
        if (g31Var instanceof sc1) {
            sc1Var = (sc1) g31Var;
        } else {
            sc1Var = null;
        }
        this.L = sc1Var == null ? x91.a : sc1Var;
        this.R = g31Var;
        this.X = i;
        this.Y = new kr3();
        this.Z = new Object();
    }

    @Override // defpackage.sc1
    public final eh1 Q(long j, Runnable runnable, e31 e31Var) {
        return this.L.Q(j, runnable, e31Var);
    }

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        Runnable n0;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && o0() && (n0 = n0()) != null) {
            try {
                kg1.b(this.R, this, new qj2(9, this, n0, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.g31
    public final void k0(e31 e31Var, Runnable runnable) {
        Runnable n0;
        this.Y.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0;
        if (atomicIntegerFieldUpdater.get(this) < this.X && o0() && (n0 = n0()) != null) {
            try {
                this.R.k0(this, new qj2(9, this, n0, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.g31
    public final g31 m0(int i) {
        jk2.m(1);
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
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0;
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c0;
            if (atomicIntegerFieldUpdater.get(this) >= this.X) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.g31
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.R);
        sb.append(".limitedParallelism(");
        return ej6.g(sb, this.X, ')');
    }

    @Override // defpackage.sc1
    public final void w(long j, ih0 ih0Var) {
        this.L.w(j, ih0Var);
    }
}
