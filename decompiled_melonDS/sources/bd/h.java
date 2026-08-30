package bd;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h implements l {
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater L = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater R = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2165b0 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2166c0 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2167d0 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    public final int A;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public h(int i2) {
        long j2;
        this.A = i2;
        if (i2 >= 0) {
            p pVar = j.f2169a;
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    j2 = i2;
                } else {
                    j2 = Long.MAX_VALUE;
                }
            } else {
                j2 = 0;
            }
            this.bufferEnd$volatile = j2;
            this.completedExpandBuffersAndPauseFlag$volatile = R.get(this);
            p pVar2 = new p(0L, null, this, 3);
            this.sendSegment$volatile = pVar2;
            this.receiveSegment$volatile = pVar2;
            if (A()) {
                pVar2 = j.f2169a;
                pVar2.getClass();
            }
            this.bufferEndSegment$volatile = pVar2;
            this._closeCause$volatile = j.f2186s;
            return;
        }
        a0.j.e(w.d.m("Invalid channel capacity: ", i2, ", should be >=0"));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object D(bd.h r13, ec.c r14) {
        /*
            boolean r0 = r14 instanceof bd.f
            if (r0 == 0) goto L14
            r0 = r14
            bd.f r0 = (bd.f) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            bd.f r0 = new bd.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.R
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            p7.j.I(r14)
            bd.o r14 = (bd.o) r14
            java.lang.Object r13 = r14.f2192a
            return r13
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r13)
            r13 = 0
            return r13
        L34:
            p7.j.I(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = bd.h.Z
            java.lang.Object r14 = r14.get(r13)
            bd.p r14 = (bd.p) r14
        L3f:
            boolean r1 = r13.x()
            if (r1 == 0) goto L4f
            java.lang.Throwable r13 = r13.r()
            bd.m r14 = new bd.m
            r14.<init>(r13)
            return r14
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = bd.h.L
            long r4 = r1.getAndIncrement(r13)
            int r1 = bd.j.f2170b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.L
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6c
            bd.p r1 = r13.q(r9, r14)
            if (r1 != 0) goto L6a
            goto L3f
        L6a:
            r8 = r1
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.I(r8, r9, r10, r12)
            r1 = r7
            a0.c r14 = bd.j.m
            if (r13 == r14) goto L9f
            a0.c r14 = bd.j.f2182o
            if (r13 != r14) goto L8c
            long r13 = r1.u()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L89
            r8.b()
        L89:
            r13 = r1
            r14 = r8
            goto L3f
        L8c:
            a0.c r14 = bd.j.f2181n
            if (r13 != r14) goto L9b
            r6.Y = r2
            r2 = r8
            java.lang.Object r13 = r1.E(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            return r13
        L9b:
            r8.b()
            return r13
        L9f:
            java.lang.String r13 = "unexpected"
            a0.j.p(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.D(bd.h, ec.c):java.lang.Object");
    }

    public static final p c(h hVar, long j2, p pVar) {
        Object b10;
        h hVar2;
        p pVar2 = j.f2169a;
        i iVar = i.f2168b0;
        loop0: while (true) {
            b10 = ed.b.b(pVar, j2, iVar);
            if (!ed.b.e(b10)) {
                ed.r c4 = ed.b.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
                    ed.r rVar = (ed.r) atomicReferenceFieldUpdater.get(hVar);
                    if (rVar.L >= c4.L) {
                        break loop0;
                    } else if (!c4.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, rVar, c4)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != rVar) {
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
        boolean e6 = ed.b.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = L;
        if (e6) {
            hVar.y();
            if (pVar.L * j.f2170b < atomicLongFieldUpdater.get(hVar)) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) ed.b.c(b10);
            long j10 = pVar3.L;
            if (j10 > j2) {
                long j11 = j.f2170b * j10;
                while (true) {
                    long j12 = B.get(hVar);
                    long j13 = 1152921504606846975L & j12;
                    if (j13 >= j11) {
                        hVar2 = hVar;
                        break;
                    }
                    hVar2 = hVar;
                    if (B.compareAndSet(hVar2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                        break;
                    }
                    hVar = hVar2;
                }
                if (j10 * j.f2170b < atomicLongFieldUpdater.get(hVar2)) {
                    pVar3.b();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public static final void d(h hVar, Object obj, zc.h hVar2) {
        hVar2.h(new yb.k(hVar.t()));
    }

    public static final int e(h hVar, p pVar, int i2, Object obj, long j2, Object obj2, boolean z10) {
        pVar.n(i2, obj);
        if (z10) {
            return hVar.J(pVar, i2, obj, j2, obj2, z10);
        }
        Object l10 = pVar.l(i2);
        if (l10 == null) {
            if (hVar.f(j2)) {
                if (pVar.k(i2, null, j.f2172d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (pVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof v1) {
            pVar.n(i2, null);
            if (hVar.G(l10, obj)) {
                pVar.o(i2, j.f2177i);
                return 0;
            }
            a0.c cVar = j.f2179k;
            if (pVar.Y.getAndSet((i2 * 2) + 1, cVar) != cVar) {
                pVar.m(i2, true);
                return 5;
            }
            return 5;
        }
        return hVar.J(pVar, i2, obj, j2, obj2, z10);
    }

    public static void v(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0);
        }
    }

    public final boolean A() {
        long j2 = R.get(this);
        if (j2 != 0 && j2 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(long r5, bd.p r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.L
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ed.c r0 = r7.c()
            bd.p r0 = (bd.p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            ed.c r5 = r7.c()
            bd.p r5 = (bd.p) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = bd.h.f2165b0
            java.lang.Object r6 = r5.get(r4)
            ed.r r6 = (ed.r) r6
            long r0 = r6.L
            long r2 = r7.L
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.B(long, bd.p):void");
    }

    public final Object C(cc.c cVar, Object obj) {
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        hVar.h(new yb.k(t()));
        Object u4 = hVar.u();
        if (u4 == dc.a.COROUTINE_SUSPENDED) {
            return u4;
        }
        return yb.y.f14813a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(bd.p r11, int r12, long r13, ec.c r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.E(bd.p, int, long, ec.c):java.lang.Object");
    }

    public final void F(v1 v1Var, boolean z10) {
        Throwable t5;
        if (v1Var instanceof zc.g) {
            cc.c cVar = (cc.c) v1Var;
            if (z10) {
                t5 = s();
            } else {
                t5 = t();
            }
            cVar.h(new yb.k(t5));
        } else if (v1Var instanceof w) {
            ((w) v1Var).A.h(new o(new m(r())));
        } else if (v1Var instanceof c) {
            c cVar2 = (c) v1Var;
            zc.h hVar = cVar2.B;
            hVar.getClass();
            cVar2.B = null;
            cVar2.A = j.f2180l;
            Throwable r5 = cVar2.L.r();
            if (r5 == null) {
                hVar.h(Boolean.FALSE);
            } else {
                hVar.h(new yb.k(r5));
            }
        } else if (v1Var instanceof hd.e) {
            ((hd.e) v1Var).g(this, j.f2180l);
        } else {
            wa.b.e(v1Var, "Unexpected waiter: ");
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (obj instanceof hd.e) {
            if (((hd.e) obj).g(this, obj2) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof w) {
            return j.a(((w) obj).A, new o(obj2), null);
        } else {
            if (obj instanceof c) {
                c cVar = (c) obj;
                zc.h hVar = cVar.B;
                hVar.getClass();
                cVar.B = null;
                cVar.A = obj2;
                Boolean bool = Boolean.TRUE;
                cVar.L.getClass();
                return j.a(hVar, bool, null);
            } else if (obj instanceof zc.g) {
                return j.a((zc.g) obj, obj2, null);
            } else {
                wa.b.e(obj, "Unexpected receiver type: ");
                return false;
            }
        }
    }

    public final boolean H(Object obj, p pVar, int i2) {
        hd.h hVar;
        boolean z10 = obj instanceof zc.g;
        yb.y yVar = yb.y.f14813a;
        if (z10) {
            return j.a((zc.g) obj, yVar, null);
        }
        if (obj instanceof hd.e) {
            int g10 = ((hd.e) obj).g(this, yVar);
            if (g10 != 0) {
                if (g10 != 1) {
                    if (g10 != 2) {
                        if (g10 == 3) {
                            hVar = hd.h.ALREADY_SELECTED;
                        } else {
                            wa.b.c(g10, "Unexpected internal result: ");
                            return false;
                        }
                    } else {
                        hVar = hd.h.CANCELLED;
                    }
                } else {
                    hVar = hd.h.REREGISTER;
                }
            } else {
                hVar = hd.h.SUCCESSFUL;
            }
            if (hVar == hd.h.REREGISTER) {
                pVar.n(i2, null);
            }
            if (hVar == hd.h.SUCCESSFUL) {
                return true;
            }
            return false;
        }
        wa.b.e(obj, "Unexpected waiter: ");
        return false;
    }

    public final Object I(p pVar, int i2, long j2, Object obj) {
        Object l10 = pVar.l(i2);
        AtomicReferenceArray atomicReferenceArray = pVar.Y;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        if (l10 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f2181n;
                }
                if (pVar.k(i2, l10, obj)) {
                    o();
                    return j.m;
                }
            }
        } else if (l10 == j.f2172d && pVar.k(i2, l10, j.f2177i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            pVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l11 = pVar.l(i2);
            if (l11 != null && l11 != j.f2173e) {
                if (l11 == j.f2172d) {
                    if (pVar.k(i2, l11, j.f2177i)) {
                        o();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        pVar.n(i2, null);
                        return obj3;
                    }
                } else {
                    a0.c cVar = j.f2178j;
                    if (l11 == cVar) {
                        return j.f2182o;
                    }
                    if (l11 == j.f2176h) {
                        return j.f2182o;
                    }
                    if (l11 == j.f2180l) {
                        o();
                        return j.f2182o;
                    } else if (l11 != j.f2175g && pVar.k(i2, l11, j.f2174f)) {
                        boolean z10 = l11 instanceof y;
                        if (z10) {
                            l11 = ((y) l11).f2194a;
                        }
                        if (H(l11, pVar, i2)) {
                            pVar.o(i2, j.f2177i);
                            o();
                            Object obj4 = atomicReferenceArray.get(i2 * 2);
                            pVar.n(i2, null);
                            return obj4;
                        }
                        pVar.o(i2, cVar);
                        pVar.i();
                        if (z10) {
                            o();
                        }
                        return j.f2182o;
                    }
                }
            } else if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (pVar.k(i2, l11, j.f2176h)) {
                    o();
                    return j.f2182o;
                }
            } else if (obj == null) {
                return j.f2181n;
            } else {
                if (pVar.k(i2, l11, obj)) {
                    o();
                    return j.m;
                }
            }
        }
    }

    public final int J(p pVar, int i2, Object obj, long j2, Object obj2, boolean z10) {
        while (true) {
            Object l10 = pVar.l(i2);
            if (l10 == null) {
                if (f(j2) && !z10) {
                    if (pVar.k(i2, null, j.f2172d)) {
                        break;
                    }
                } else if (z10) {
                    if (pVar.k(i2, null, j.f2178j)) {
                        pVar.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (pVar.k(i2, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l10 == j.f2173e) {
                if (pVar.k(i2, l10, j.f2172d)) {
                    break;
                }
            } else {
                a0.c cVar = j.f2179k;
                if (l10 == cVar) {
                    pVar.n(i2, null);
                    return 5;
                } else if (l10 == j.f2176h) {
                    pVar.n(i2, null);
                    return 5;
                } else if (l10 == j.f2180l) {
                    pVar.n(i2, null);
                    y();
                    return 4;
                } else {
                    pVar.n(i2, null);
                    if (l10 instanceof y) {
                        l10 = ((y) l10).f2194a;
                    }
                    if (G(l10, obj)) {
                        pVar.o(i2, j.f2177i);
                        return 0;
                    }
                    if (pVar.Y.getAndSet((i2 * 2) + 1, cVar) != cVar) {
                        pVar.m(i2, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void K(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        h hVar = this;
        if (!hVar.A()) {
            while (true) {
                atomicLongFieldUpdater = R;
                if (atomicLongFieldUpdater.get(hVar) > j2) {
                    break;
                }
                hVar = this;
            }
            int i2 = j.f2171c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = X;
                if (i10 < i2) {
                    long j10 = atomicLongFieldUpdater.get(hVar);
                    if (j10 != (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) || j10 != atomicLongFieldUpdater.get(hVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j11 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        hVar = this;
                    }
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(hVar);
                        long j13 = atomicLongFieldUpdater2.get(hVar);
                        long j14 = j13 & 4611686018427387903L;
                        if ((j13 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j12 == j14 && j12 == atomicLongFieldUpdater.get(hVar)) {
                            break;
                        } else if (!z10) {
                            hVar = this;
                            atomicLongFieldUpdater2.compareAndSet(hVar, j13, 4611686018427387904L + j14);
                        } else {
                            hVar = this;
                        }
                    }
                    while (true) {
                        long j15 = atomicLongFieldUpdater2.get(hVar);
                        if (atomicLongFieldUpdater2.compareAndSet(hVar, j15, j15 & 4611686018427387903L)) {
                            return;
                        }
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // bd.x
    public Object a(Object obj) {
        boolean z10;
        v1 v1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z11 = false;
        long j10 = 1152921504606846975L;
        if (w(j2, false)) {
            z10 = false;
        } else {
            z10 = !f(j2 & 1152921504606846975L);
        }
        n nVar = o.f2191b;
        if (z10) {
            return nVar;
        }
        a0.c cVar = j.f2178j;
        p pVar = (p) Y.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean w10 = w(andIncrement, z11);
            int i2 = j.f2170b;
            long j12 = i2;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (pVar.L != j13) {
                p c4 = c(this, j13, pVar);
                if (c4 == null) {
                    if (w10) {
                        return new m(t());
                    }
                    z11 = false;
                    j10 = 1152921504606846975L;
                } else {
                    pVar = c4;
                }
            }
            int e6 = e(this, pVar, i10, obj, j11, cVar, w10);
            yb.y yVar = yb.y.f14813a;
            if (e6 != 0) {
                if (e6 != 1) {
                    if (e6 != 2) {
                        if (e6 != 3) {
                            if (e6 != 4) {
                                if (e6 == 5) {
                                    pVar.b();
                                }
                                z11 = false;
                                j10 = 1152921504606846975L;
                            } else {
                                if (j11 < L.get(this)) {
                                    pVar.b();
                                }
                                return new m(t());
                            }
                        } else {
                            a0.j.p("unexpected");
                            return null;
                        }
                    } else if (w10) {
                        pVar.i();
                        return new m(t());
                    } else {
                        if (cVar instanceof v1) {
                            v1Var = (v1) cVar;
                        } else {
                            v1Var = null;
                        }
                        if (v1Var != null) {
                            v1Var.b(pVar, i10 + i2);
                        }
                        pVar.i();
                        return nVar;
                    }
                } else {
                    return yVar;
                }
            } else {
                pVar.b();
                return yVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // bd.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(cc.c r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.b(cc.c, java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j2) {
        if (j2 >= R.get(this) && j2 >= L.get(this) + this.A) {
            return false;
        }
        return true;
    }

    public final boolean g(Throwable th2) {
        return h(th2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[LOOP:2: B:19:0x003c->B:20:0x0049, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[LOOP:5: B:22:0x004c->B:30:0x0067, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[LOOP:3: B:33:0x006e->B:53:0x006e, LOOP_LABEL: LOOP:3: B:33:0x006e->B:53:0x006e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = bd.h.B
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            bd.p r4 = bd.j.f2169a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            a0.c r5 = bd.j.f2186s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = bd.h.f2166c0
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.y()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = bd.h.f2167d0
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            a0.c r0 = bd.j.f2184q
            goto L7b
        L79:
            a0.c r0 = bd.j.f2185r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            nc.w.b(r9, r14)
            mc.l r14 = (mc.l) r14
            java.lang.Throwable r13 = r12.r()
            r14.k(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.h(java.lang.Throwable, boolean):boolean");
    }

    @Override // bd.l
    public final void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // bd.l
    public final c iterator() {
        return new c(this);
    }

    @Override // bd.l
    public final Object j(dd.p pVar) {
        return D(this, pVar);
    }

    @Override // bd.l
    public final a0.g k() {
        nc.w.b(3, d.f2163b0);
        nc.w.b(3, e.f2164b0);
        return new a0.g(this, (b) null);
    }

    @Override // bd.l
    public final Object l() {
        p pVar;
        v1 v1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = L;
        long j2 = atomicLongFieldUpdater.get(this);
        long j10 = B.get(this);
        if (w(j10, true)) {
            return new m(r());
        }
        int i2 = (j2 > (j10 & 1152921504606846975L) ? 1 : (j2 == (j10 & 1152921504606846975L) ? 0 : -1));
        n nVar = o.f2191b;
        if (i2 >= 0) {
            return nVar;
        }
        a0.c cVar = j.f2179k;
        p pVar2 = (p) Z.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = j.f2170b;
            long j12 = andIncrement / j11;
            int i10 = (int) (andIncrement % j11);
            if (pVar2.L != j12) {
                p q10 = q(j12, pVar2);
                if (q10 == null) {
                    continue;
                } else {
                    pVar = q10;
                }
            } else {
                pVar = pVar2;
            }
            Object I = I(pVar, i10, andIncrement, cVar);
            p pVar3 = pVar;
            if (I == j.m) {
                if (cVar instanceof v1) {
                    v1Var = (v1) cVar;
                } else {
                    v1Var = null;
                }
                if (v1Var != null) {
                    v1Var.b(pVar3, i10);
                }
                K(andIncrement);
                pVar3.i();
                return nVar;
            } else if (I == j.f2182o) {
                if (andIncrement < u()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else if (I != j.f2181n) {
                pVar3.b();
                return I;
            } else {
                a0.j.p("unexpected");
                return null;
            }
        }
        return new m(r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        r1 = (bd.p) ((ed.c) ed.c.B.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bd.p m(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.m(long):bd.p");
    }

    public final void n(long j2) {
        p pVar = (p) Z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = L;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.A + j10, R.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = j.f2170b;
                long j12 = j10 / j11;
                int i2 = (int) (j10 % j11);
                if (pVar.L != j12) {
                    p q10 = q(j12, pVar);
                    if (q10 != null) {
                        pVar = q10;
                    }
                }
                p pVar2 = pVar;
                if (I(pVar2, i2, j10, null) == j.f2182o) {
                    if (j10 < u()) {
                        pVar2.b();
                    }
                } else {
                    pVar2.b();
                }
                pVar = pVar2;
            }
        }
    }

    public final void o() {
        Object b10;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2165b0;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = R.getAndIncrement(this);
            long j2 = andIncrement / j.f2170b;
            if (u() <= andIncrement) {
                if (pVar.L < j2 && pVar.c() != null) {
                    B(j2, pVar);
                }
                v(this);
                return;
            }
            if (pVar.L != j2) {
                i iVar = i.f2168b0;
                while (true) {
                    b10 = ed.b.b(pVar, j2, iVar);
                    if (!ed.b.e(b10)) {
                        ed.r c4 = ed.b.c(b10);
                        while (true) {
                            ed.r rVar = (ed.r) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                p pVar2 = null;
                if (ed.b.e(b10)) {
                    y();
                    B(j2, pVar);
                    v(this);
                } else {
                    p pVar3 = (p) ed.b.c(b10);
                    long j10 = pVar3.L;
                    if (j10 > j2) {
                        long j11 = j10 * j.f2170b;
                        if (R.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            v(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i2 = (int) (andIncrement % j.f2170b);
            Object l10 = pVar.l(i2);
            boolean z10 = l10 instanceof v1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = L;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i2, l10, j.f2175g)) {
                while (true) {
                    Object l11 = pVar.l(i2);
                    if (l11 instanceof v1) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (pVar.k(i2, l11, new y((v1) l11))) {
                                break loop0;
                            }
                        } else if (pVar.k(i2, l11, j.f2175g)) {
                            if (H(l11, pVar, i2)) {
                                pVar.o(i2, j.f2172d);
                                break;
                            } else {
                                pVar.o(i2, j.f2178j);
                                pVar.i();
                            }
                        }
                    } else if (l11 != j.f2178j) {
                        if (l11 == null) {
                            if (pVar.k(i2, l11, j.f2173e)) {
                                break loop0;
                            }
                        } else if (l11 == j.f2172d || l11 == j.f2176h || l11 == j.f2177i || l11 == j.f2179k || l11 == j.f2180l) {
                            break loop0;
                        } else if (l11 != j.f2174f) {
                            wa.b.e(l11, "Unexpected cell state: ");
                            return;
                        }
                    } else {
                        break;
                    }
                }
            } else if (H(l10, pVar, i2)) {
                pVar.o(i2, j.f2172d);
                break;
            } else {
                pVar.o(i2, j.f2178j);
                pVar.i();
                v(this);
            }
        }
        v(this);
    }

    @Override // bd.l
    public final Object p(cc.c cVar) {
        p pVar;
        Throwable th2;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = L;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = j.f2170b;
            long j10 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (pVar3.L != j10) {
                p q10 = q(j10, pVar3);
                if (q10 == null) {
                    continue;
                } else {
                    pVar = q10;
                }
            } else {
                pVar = pVar3;
            }
            Object I = I(pVar, i2, andIncrement, null);
            a0.c cVar2 = j.m;
            if (I != cVar2) {
                a0.c cVar3 = j.f2182o;
                if (I == cVar3) {
                    if (andIncrement < u()) {
                        pVar.b();
                    }
                    pVar3 = pVar;
                } else if (I == j.f2181n) {
                    zc.h p10 = zc.x.p(pc.a.A(cVar));
                    h hVar = this;
                    try {
                        Object I2 = hVar.I(pVar, i2, andIncrement, p10);
                        if (I2 == cVar2) {
                            p10.b(pVar, i2);
                        } else {
                            if (I2 == cVar3) {
                                if (andIncrement < u()) {
                                    pVar.b();
                                }
                                p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (x()) {
                                        p10.h(new yb.k(s()));
                                        break;
                                    }
                                    zc.h hVar2 = p10;
                                    try {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j11 = j.f2170b;
                                        long j12 = andIncrement2 / j11;
                                        int i10 = (int) (andIncrement2 % j11);
                                        if (pVar4.L != j12) {
                                            try {
                                                p q11 = q(j12, pVar4);
                                                if (q11 == null) {
                                                    p10 = hVar2;
                                                } else {
                                                    pVar2 = q11;
                                                }
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                p10 = hVar2;
                                                p10.D();
                                                throw th2;
                                            }
                                        } else {
                                            pVar2 = pVar4;
                                        }
                                        I2 = hVar.I(pVar2, i10, andIncrement2, hVar2);
                                        p pVar5 = pVar2;
                                        p10 = hVar2;
                                        if (I2 == j.m) {
                                            p10.b(pVar5, i10);
                                            break;
                                        } else if (I2 == j.f2182o) {
                                            if (andIncrement2 < u()) {
                                                pVar5.b();
                                            }
                                            hVar = this;
                                            pVar4 = pVar5;
                                        } else if (I2 != j.f2181n) {
                                            pVar5.b();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        p10 = hVar2;
                                        th2 = th;
                                        p10.D();
                                        throw th2;
                                    }
                                }
                            } else {
                                pVar.b();
                            }
                            p10.e(I2, null);
                        }
                        Object u4 = p10.u();
                        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                        return u4;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    pVar.b();
                    return I;
                }
            } else {
                a0.j.p("unexpected");
                return null;
            }
        }
        Throwable s10 = s();
        int i11 = ed.s.f4467a;
        throw s10;
    }

    public final p q(long j2, p pVar) {
        Object b10;
        long j10;
        p pVar2 = j.f2169a;
        i iVar = i.f2168b0;
        loop0: while (true) {
            b10 = ed.b.b(pVar, j2, iVar);
            if (!ed.b.e(b10)) {
                ed.r c4 = ed.b.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
                    ed.r rVar = (ed.r) atomicReferenceFieldUpdater.get(this);
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
        if (ed.b.e(b10)) {
            y();
            if (pVar.L * j.f2170b < u()) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) ed.b.c(b10);
            long j11 = pVar3.L;
            if (!A() && j2 <= R.get(this) / j.f2170b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2165b0;
                    ed.r rVar2 = (ed.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.L >= j11 || !pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j11 > j2) {
                long j12 = j11 * j.f2170b;
                do {
                    j10 = L.get(this);
                    if (j10 >= j12) {
                        break;
                    }
                } while (!L.compareAndSet(this, j10, j12));
                if (j11 * j.f2170b < u()) {
                    pVar3.b();
                }
            } else {
                return pVar3;
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) f2166c0.get(this);
    }

    public final Throwable s() {
        Throwable r5 = r();
        if (r5 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return r5;
    }

    public final Throwable t() {
        Throwable r5 = r();
        if (r5 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return r5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
        r16 = r7;
        r3 = (bd.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b7 A[EDGE_INSN: B:103:0x01b7->B:85:0x01b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.toString():java.lang.String");
    }

    public final long u() {
        return B.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
        r0 = (bd.p) ((ed.c) ed.c.B.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.h.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(B.get(this), true);
    }

    public final boolean y() {
        return w(B.get(this), false);
    }

    public boolean z() {
        return false;
    }
}
