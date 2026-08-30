package id;

import ai.q0;
import ed.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yb.y;
import zc.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater R = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Y = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    public final int A;
    public final q0 B;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i2) {
        this.A = i2;
        if (i2 > 0) {
            if (i2 >= 0) {
                j jVar = new j(0L, null, 2);
                this.head$volatile = jVar;
                this.tail$volatile = jVar;
                this._availablePermits$volatile = i2;
                this.B = new q0(9, this);
                return;
            }
            a0.j.e(w.d.l(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        a0.j.e(w.d.l(i2, "Semaphore should have at least 1 permit, but had "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5.e(r3, r4.B);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ec.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = id.g.Z
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.A
            if (r1 > r2) goto L0
            yb.y r3 = yb.y.f14813a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            cc.c r5 = pc.a.A(r5)
            zc.h r5 = zc.x.p(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ai.q0 r0 = r4.B     // Catch: java.lang.Throwable -> L3f
            r5.e(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.u()
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.g.a(ec.c):java.lang.Object");
    }

    public final boolean b(v1 v1Var) {
        Object b10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = Y.getAndIncrement(this);
        e eVar = e.f7034b0;
        long j2 = andIncrement / i.f7041f;
        loop0: while (true) {
            b10 = ed.b.b(jVar, j2, eVar);
            if (!ed.b.e(b10)) {
                r c4 = ed.b.c(b10);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.L >= c4.L) {
                        break loop0;
                    } else if (!c4.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c4)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c4.f()) {
                                    c4.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) ed.b.c(b10);
        AtomicReferenceArray atomicReferenceArray = jVar2.X;
        int i2 = (int) (andIncrement % i.f7041f);
        while (!atomicReferenceArray.compareAndSet(i2, null, v1Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                a0.c cVar = i.f7037b;
                a0.c cVar2 = i.f7038c;
                while (!atomicReferenceArray.compareAndSet(i2, cVar, cVar2)) {
                    if (atomicReferenceArray.get(i2) != cVar) {
                        return false;
                    }
                }
                ((zc.g) v1Var).e(y.f14813a, this.B);
                return true;
            }
        }
        v1Var.b(jVar2, i2);
        return true;
    }

    public final void c() {
        int i2;
        Object b10;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Z;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.A;
            if (andIncrement < i10) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = L;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = R.getAndIncrement(this);
                    long j2 = andIncrement2 / i.f7041f;
                    f fVar = f.f7035b0;
                    while (true) {
                        b10 = ed.b.b(jVar, j2, fVar);
                        if (ed.b.e(b10)) {
                            break;
                        }
                        r c4 = ed.b.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.L >= c4.L) {
                                break;
                            } else if (!c4.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c4)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c4.f()) {
                                            c4.e();
                                        }
                                    }
                                }
                                if (rVar.f()) {
                                    rVar.e();
                                }
                            }
                        }
                    }
                    j jVar2 = (j) ed.b.c(b10);
                    AtomicReferenceArray atomicReferenceArray = jVar2.X;
                    jVar2.b();
                    int i11 = (jVar2.L > j2 ? 1 : (jVar2.L == j2 ? 0 : -1));
                    z10 = false;
                    if (i11 <= 0) {
                        int i12 = (int) (andIncrement2 % i.f7041f);
                        Object andSet = atomicReferenceArray.getAndSet(i12, i.f7037b);
                        if (andSet == null) {
                            int i13 = i.f7036a;
                            for (int i14 = 0; i14 < i13; i14++) {
                                if (atomicReferenceArray.get(i12) == i.f7038c) {
                                    z10 = true;
                                    continue;
                                    break;
                                }
                            }
                            a0.c cVar = i.f7037b;
                            a0.c cVar2 = i.f7039d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i12, cVar, cVar2)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i12) != cVar) {
                                    break;
                                }
                            }
                            z10 = !z10;
                            continue;
                        } else if (andSet == i.f7040e) {
                            continue;
                        } else {
                            boolean z11 = andSet instanceof zc.g;
                            y yVar = y.f14813a;
                            if (z11) {
                                zc.g gVar = (zc.g) andSet;
                                a0.c o5 = gVar.o(yVar, this.B);
                                if (o5 != null) {
                                    gVar.s(o5);
                                    z10 = true;
                                    continue;
                                    break;
                                }
                                continue;
                            } else if (andSet instanceof hd.e) {
                                if (((hd.e) andSet).g(this, yVar) != 0) {
                                    continue;
                                }
                                z10 = true;
                                continue;
                                break;
                            } else {
                                wa.b.e(andSet, "unexpected: ");
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i10));
                wa.b.c(i10, "The number of released permits cannot be greater than ");
                return;
            }
        } while (!z10);
    }
}
