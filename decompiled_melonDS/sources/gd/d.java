package gd;

import ed.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m9.o;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Executor, Closeable {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5641b0 = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5642c0 = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5643d0 = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");

    /* renamed from: e0  reason: collision with root package name */
    public static final a0.c f5644e0 = new a0.c("NOT_IN_STACK", 1);
    public final int A;
    public final int B;
    public final long L;
    public final String R;
    public final g X;
    public final g Y;
    public final p Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v4, types: [ed.k, gd.g] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ed.k, gd.g] */
    public d(int i2, int i10, long j2, String str) {
        this.A = i2;
        this.B = i10;
        this.L = j2;
        this.R = str;
        if (i2 >= 1) {
            if (i10 >= i2) {
                if (i10 <= 2097150) {
                    if (j2 > 0) {
                        this.X = new ed.k();
                        this.Y = new ed.k();
                        this.Z = new p((i2 + 1) * 2);
                        this.controlState$volatile = i2 << 42;
                        return;
                    }
                    a0.j.i("Idle worker keep alive time ", j2, " must be positive");
                    throw null;
                }
                a0.j.e(w.d.m("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            a0.j.e(kc.a.d(i10, i2, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        a0.j.e(w.d.m("Core pool size ", i2, " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void m(d dVar, Runnable runnable, int i2) {
        boolean z10;
        if ((i2 & 4) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        dVar.i(runnable, false, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r1 == null) goto L48;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = gd.d.f5643d0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof gd.b
            r3 = 0
            if (r1 == 0) goto L17
            gd.b r0 = (gd.b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            gd.d r1 = r0.f5640b0
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            ed.p r1 = r8.Z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = gd.d.f5642c0     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            ed.p r5 = r8.Z
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            gd.b r5 = (gd.b) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            gd.m r5 = r5.A
            gd.g r6 = r8.Y
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = gd.m.f5652b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            gd.i r7 = (gd.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            gd.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            gd.g r1 = r8.Y
            r1.b()
            gd.g r1 = r8.X
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            gd.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            gd.g r1 = r8.X
            java.lang.Object r1 = r1.d()
            gd.i r1 = (gd.i) r1
            if (r1 != 0) goto Lb2
            gd.g r1 = r8.Y
            java.lang.Object r1 = r1.d()
            gd.i r1 = (gd.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            gd.c r1 = gd.c.TERMINATED
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = gd.d.f5641b0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = gd.d.f5642c0
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.d.close():void");
    }

    public final int d() {
        boolean z10;
        synchronized (this.Z) {
            try {
                if (f5643d0.get(this) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5642c0;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i10 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.A) {
                    return 0;
                }
                if (i2 >= this.B) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.Z.b(i11) == null) {
                    b bVar = new b(this, i11);
                    this.Z.c(i11, bVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        bVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m(this, runnable, 6);
    }

    public final void i(Runnable runnable, boolean z10, boolean z11) {
        i jVar;
        long j2;
        b bVar;
        boolean a10;
        c cVar;
        k.f5651f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.A = nanoTime;
            jVar.B = z10;
        } else {
            jVar = new j(runnable, nanoTime, z10);
        }
        boolean z12 = jVar.B;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5642c0;
        if (z12) {
            j2 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j2 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar == null || !bVar.f5640b0.equals(this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.L) != c.TERMINATED && (jVar.B || cVar != c.BLOCKING)) {
            bVar.Z = true;
            m mVar = bVar.A;
            if (z11) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f5652b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.B) {
                a10 = this.Y.a(jVar);
            } else {
                a10 = this.X.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(w.d.s(new StringBuilder(), this.R, " was terminated"));
            }
        }
        if (z12) {
            if (!w() && !v(j2)) {
                w();
            }
        } else if (w() || v(atomicLongFieldUpdater.get(this))) {
        } else {
            w();
        }
    }

    public final void t(b bVar, int i2, int i10) {
        while (true) {
            long j2 = f5641b0.get(this);
            int i11 = (int) (2097151 & j2);
            long j10 = (2097152 + j2) & (-2097152);
            if (i11 == i2) {
                if (i10 == 0) {
                    Object c4 = bVar.c();
                    while (true) {
                        if (c4 == f5644e0) {
                            i11 = -1;
                            break;
                        } else if (c4 == null) {
                            i11 = 0;
                            break;
                        } else {
                            b bVar2 = (b) c4;
                            int b10 = bVar2.b();
                            if (b10 != 0) {
                                i11 = b10;
                                break;
                            }
                            c4 = bVar2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f5641b0.compareAndSet(this, j2, i11 | j10)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        int i2;
        ArrayList arrayList = new ArrayList();
        p pVar = this.Z;
        int a10 = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            b bVar = (b) pVar.b(i15);
            if (bVar != null) {
                m mVar = bVar.A;
                mVar.getClass();
                if (m.f5652b.get(mVar) != null) {
                    i2 = (m.f5653c.get(mVar) - m.f5654d.get(mVar)) + 1;
                } else {
                    i2 = m.f5653c.get(mVar) - m.f5654d.get(mVar);
                }
                int i16 = a.f5638a[bVar.L.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5) {
                                    i14++;
                                } else {
                                    o.o();
                                    return null;
                                }
                            } else {
                                i13++;
                                if (i2 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i2);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i10++;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(i2);
                            sb3.append('c');
                            arrayList.add(sb3.toString());
                        }
                    } else {
                        i11++;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i2);
                        sb4.append('b');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    i12++;
                }
            }
        }
        long j2 = f5642c0.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.R);
        sb5.append('@');
        sb5.append(x.n(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.A;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.B);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.X.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.Y.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j2));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j2) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean v(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i10 = this.A;
        if (i2 < i10) {
            int d4 = d();
            if (d4 == 1 && i10 > 1) {
                d();
            }
            if (d4 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        a0.c cVar;
        int i2;
        while (true) {
            long j2 = f5641b0.get(this);
            b bVar = (b) this.Z.b((int) (2097151 & j2));
            if (bVar == null) {
                bVar = null;
            } else {
                long j10 = (2097152 + j2) & (-2097152);
                Object c4 = bVar.c();
                while (true) {
                    cVar = f5644e0;
                    if (c4 == cVar) {
                        i2 = -1;
                        break;
                    } else if (c4 == null) {
                        i2 = 0;
                        break;
                    } else {
                        b bVar2 = (b) c4;
                        i2 = bVar2.b();
                        if (i2 != 0) {
                            break;
                        }
                        c4 = bVar2.c();
                    }
                }
                if (i2 >= 0) {
                    if (f5641b0.compareAndSet(this, j2, i2 | j10)) {
                        bVar.g(cVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f5639c0.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }
}
