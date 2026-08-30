package zc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q0 extends l0 implements a0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_queue$volatile");

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15027b0 = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_delayed$volatile");

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15028c0 = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // zc.a0
    public i0 J(long j2, Runnable runnable, cc.g gVar) {
        return z.f15043a.J(j2, runnable, gVar);
    }

    @Override // zc.q
    public final void X(cc.g gVar, Runnable runnable) {
        g0(runnable);
    }

    @Override // zc.l0
    public final long e0() {
        o0 o0Var;
        Runnable runnable;
        long j2;
        a0.c cVar = x.f15033c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
        if (!f0()) {
            h0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                o0Var = null;
                if (obj == null) {
                    break;
                } else if (obj instanceof ed.m) {
                    ed.m mVar = (ed.m) obj;
                    Object d4 = mVar.d();
                    if (d4 != ed.m.f4460g) {
                        runnable = (Runnable) d4;
                        break;
                    }
                    ed.m c4 = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else if (obj != cVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                } else {
                    break;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            zb.j jVar = this.X;
            if (jVar == null || jVar.isEmpty()) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 0;
            }
            if (j2 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof ed.m) {
                        long j10 = ed.m.f4459f.get((ed.m) obj2);
                        if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == cVar) {
                        return Long.MAX_VALUE;
                    }
                }
                p0 p0Var = (p0) f15027b0.get(this);
                if (p0Var != null) {
                    synchronized (p0Var) {
                        o0[] o0VarArr = p0Var.f4470a;
                        if (o0VarArr != null) {
                            o0Var = o0VarArr[0];
                        }
                    }
                    if (o0Var != null) {
                        long nanoTime = o0Var.A - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void g0(Runnable runnable) {
        h0();
        if (i0(runnable)) {
            Thread j02 = j0();
            if (Thread.currentThread() != j02) {
                LockSupport.unpark(j02);
                return;
            }
            return;
        }
        y.f15041d0.g0(runnable);
    }

    public final void h0() {
        o0 o0Var;
        o0 o0Var2;
        boolean z10;
        p0 p0Var = (p0) f15027b0.get(this);
        if (p0Var == null || ed.w.f4469b.get(p0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (p0Var) {
                try {
                    o0[] o0VarArr = p0Var.f4470a;
                    o0Var = null;
                    if (o0VarArr != null) {
                        o0Var2 = o0VarArr[0];
                    } else {
                        o0Var2 = null;
                    }
                    if (o0Var2 == null) {
                        continue;
                    } else {
                        if (nanoTime - o0Var2.A >= 0) {
                            z10 = i0(o0Var2);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            o0Var = p0Var.b(0);
                        }
                        continue;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (o0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i0(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = zc.q0.Z
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = zc.q0.f15028c0
            int r2 = r2.get(r5)
            r3 = 1
            if (r2 != r3) goto L10
            goto L4a
        L10:
            if (r1 != 0) goto L21
        L12:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L1a
            goto L62
        L1a:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L12
            goto L0
        L21:
            boolean r2 = r1 instanceof ed.m
            if (r2 == 0) goto L46
            r2 = r1
            ed.m r2 = (ed.m) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L62
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            ed.m r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            a0.c r2 = zc.x.f15033c
            if (r1 != r2) goto L4c
        L4a:
            r6 = 0
            return r6
        L4c:
            ed.m r2 = new ed.m
            r4 = 8
            r2.<init>(r4, r3)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.a(r4)
            r2.a(r6)
        L5c:
            boolean r4 = r0.compareAndSet(r5, r1, r2)
            if (r4 == 0) goto L63
        L62:
            return r3
        L63:
            java.lang.Object r4 = r0.get(r5)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.q0.i0(java.lang.Runnable):boolean");
    }

    public abstract Thread j0();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r0 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k0() {
        /*
            r7 = this;
            zb.j r0 = r7.X
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = zc.q0.f15027b0
            java.lang.Object r0 = r0.get(r7)
            zc.p0 r0 = (zc.p0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = ed.w.f4469b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = zc.q0.Z
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof ed.m
            if (r3 == 0) goto L4f
            ed.m r0 = (ed.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = ed.m.f4459f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            a0.c r3 = zc.x.f15033c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.q0.k0():boolean");
    }

    public void l0(long j2, o0 o0Var) {
        y.f15041d0.m0(j2, o0Var);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [zc.p0, java.lang.Object] */
    public final void m0(long j2, o0 o0Var) {
        int b10;
        Thread j02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15027b0;
        o0 o0Var2 = null;
        if (f15028c0.get(this) == 1) {
            b10 = 1;
        } else {
            p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
            if (p0Var == null) {
                ?? obj = new Object();
                obj.f15026c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                obj2.getClass();
                p0Var = (p0) obj2;
            }
            b10 = o0Var.b(j2, p0Var, this);
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    a0.j.p("unexpected result");
                    return;
                }
                return;
            }
            l0(j2, o0Var);
            return;
        }
        p0 p0Var2 = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var2 != null) {
            synchronized (p0Var2) {
                o0[] o0VarArr = p0Var2.f4470a;
                if (o0VarArr != null) {
                    o0Var2 = o0VarArr[0];
                }
            }
        }
        if (o0Var2 == o0Var && Thread.currentThread() != (j02 = j0())) {
            LockSupport.unpark(j02);
        }
    }

    @Override // zc.l0
    public void shutdown() {
        o0 o0Var;
        n1.f15023a.set(null);
        f15028c0.set(this, 1);
        a0.c cVar = x.f15033c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof ed.m) {
                ((ed.m) obj).b();
                break;
            } else if (obj != cVar) {
                ed.m mVar = new ed.m(8, true);
                mVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (e0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            p0 p0Var = (p0) f15027b0.get(this);
            if (p0Var != null) {
                synchronized (p0Var) {
                    if (ed.w.f4469b.get(p0Var) > 0) {
                        o0Var = p0Var.b(0);
                    } else {
                        o0Var = null;
                    }
                }
                if (o0Var != null) {
                    l0(nanoTime, o0Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // zc.a0
    public final void v(long j2, h hVar) {
        long j10 = 0;
        if (j2 > 0) {
            if (j2 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j2;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            m0 m0Var = new m0(this, j10 + nanoTime, hVar);
            m0(nanoTime, m0Var);
            hVar.y(new e(2, m0Var));
        }
    }
}
