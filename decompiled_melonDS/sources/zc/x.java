package zc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a */
    public static final a0.c f15031a = new a0.c("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final a0.c f15032b = new a0.c("REMOVED_TASK", 1);

    /* renamed from: c */
    public static final a0.c f15033c = new a0.c("CLOSED_EMPTY", 1);

    /* renamed from: d */
    public static final a0.c f15034d = new a0.c("COMPLETING_ALREADY", 1);

    /* renamed from: e */
    public static final a0.c f15035e = new a0.c("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f */
    public static final a0.c f15036f = new a0.c("COMPLETING_RETRY", 1);

    /* renamed from: g */
    public static final a0.c f15037g = new a0.c("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h */
    public static final a0.c f15038h = new a0.c("SEALED", 1);

    /* renamed from: i */
    public static final k0 f15039i = new k0(false);

    /* renamed from: j */
    public static final k0 f15040j = new k0(true);

    public static final Object A(q1 q1Var, mc.p pVar) {
        r(q1Var, true, new j0(0, m(q1Var.R.g()).J(q1Var.X, q1Var, q1Var.L)));
        return a.a.W(q1Var, false, q1Var, pVar);
    }

    public static final String B(cc.c cVar) {
        Object kVar;
        if (cVar instanceof ed.f) {
            return ((ed.f) cVar).toString();
        }
        try {
            kVar = cVar + '@' + n(cVar);
        } catch (Throwable th2) {
            kVar = new yb.k(th2);
        }
        if (yb.l.a(kVar) != null) {
            kVar = cVar.getClass().getName() + '@' + n(cVar);
        }
        return (String) kVar;
    }

    public static final long C(long j2) {
        boolean z10;
        l7.a aVar = wc.b.B;
        if (j2 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return wc.b.d(wc.b.i(j2, wc.j.m(999999L, wc.e.NANOSECONDS)));
        }
        if (!z10) {
            return 0L;
        }
        m9.o.o();
        return 0L;
    }

    public static final Object D(Object obj) {
        w0 w0Var;
        v0 v0Var;
        if (obj instanceof w0) {
            w0Var = (w0) obj;
        } else {
            w0Var = null;
        }
        if (w0Var != null && (v0Var = w0Var.f15030a) != null) {
            return v0Var;
        }
        return obj;
    }

    public static final t1 E(cc.c cVar, cc.g gVar, Object obj) {
        t1 t1Var = null;
        if ((cVar instanceof ec.d) && gVar.t(u1.A) != null) {
            ec.d dVar = (ec.d) cVar;
            while (true) {
                if (!(dVar instanceof d0) && (dVar = dVar.f()) != null) {
                    if (dVar instanceof t1) {
                        t1Var = (t1) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (t1Var != null) {
                t1Var.n0(gVar, obj);
            }
        }
        return t1Var;
    }

    public static final Object F(cc.g gVar, mc.p pVar, cc.c cVar) {
        cc.g k10;
        Object D;
        cc.g g10 = cVar.g();
        if (!((Boolean) gVar.L(Boolean.FALSE, new mg.m(22, (byte) 0))).booleanValue()) {
            k10 = g10.H(gVar);
        } else {
            k10 = k(g10, gVar, false);
        }
        j(k10);
        if (k10 == g10) {
            ed.q qVar = new ed.q(cVar, k10);
            D = a.a.W(qVar, true, qVar, pVar);
        } else {
            cc.d dVar = cc.d.A;
            if (nc.k.a(k10.t(dVar), g10.t(dVar))) {
                t1 t1Var = new t1(cVar, k10);
                cc.g gVar2 = t1Var.L;
                Object n10 = ed.b.n(gVar2, null);
                try {
                    Object W = a.a.W(t1Var, true, t1Var, pVar);
                    ed.b.g(gVar2, n10);
                    D = W;
                } catch (Throwable th2) {
                    ed.b.g(gVar2, n10);
                    throw th2;
                }
            } else {
                ed.q qVar2 = new ed.q(cVar, k10);
                try {
                    ed.b.h(pc.a.A(pc.a.q(pVar, qVar2, qVar2)), yb.y.f14813a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d0.X;
                    while (true) {
                        int i2 = atomicIntegerFieldUpdater.get(qVar2);
                        if (i2 != 0) {
                            if (i2 == 2) {
                                D = D(f1.A.get(qVar2));
                                if (D instanceof o) {
                                    throw ((o) D).f15025a;
                                }
                            } else {
                                a0.j.p("Already suspended");
                                return null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1)) {
                            D = dc.a.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof c0) {
                        th = ((c0) th).A;
                    }
                    qVar2.h(p7.j.o(th));
                    throw th;
                }
            }
        }
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005e  */
    /* JADX WARN: Type inference failed for: r9v3, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(long r6, mc.p r8, ec.c r9) {
        /*
            boolean r0 = r9 instanceof zc.r1
            if (r0 == 0) goto L13
            r0 = r9
            zc.r1 r0 = (zc.r1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            zc.r1 r0 = new zc.r1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            nc.t r6 = r0.R
            p7.j.I(r9)     // Catch: zc.p1 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L32:
            p7.j.I(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3c
            goto L5c
        L3c:
            nc.t r9 = new nc.t
            r9.<init>()
            r0.R = r9     // Catch: zc.p1 -> L54
            r0.Y = r3     // Catch: zc.p1 -> L54
            zc.q1 r2 = new zc.q1     // Catch: zc.p1 -> L54
            r2.<init>(r6, r0)     // Catch: zc.p1 -> L54
            r9.A = r2     // Catch: zc.p1 -> L54
            java.lang.Object r6 = A(r2, r8)     // Catch: zc.p1 -> L54
            if (r6 != r1) goto L53
            return r1
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            zc.y0 r8 = r7.A
            java.lang.Object r6 = r6.A
            if (r8 != r6) goto L5e
        L5c:
            r6 = 0
            return r6
        L5e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x.G(long, mc.p, ec.c):java.lang.Object");
    }

    public static final ah.h0 a(cc.g gVar) {
        if (gVar.t(r.B) == null) {
            gVar = gVar.H(b());
        }
        return new ah.h0(gVar);
    }

    public static a1 b() {
        return new a1(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zc.a1, zc.m1] */
    public static m1 c() {
        return new a1(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dc.a d(ec.c r4) {
        /*
            boolean r0 = r4 instanceof zc.b0
            if (r0 == 0) goto L13
            r0 = r4
            zc.b0 r0 = (zc.b0) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            zc.b0 r0 = new zc.b0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
        L28:
            r4 = 0
            return r4
        L2a:
            p7.j.I(r4)
            goto L46
        L2e:
            p7.j.I(r4)
            r0.X = r3
            zc.h r4 = new zc.h
            cc.c r0 = pc.a.A(r0)
            r4.<init>(r3, r0)
            r4.v()
            java.lang.Object r4 = r4.u()
            if (r4 != r1) goto L46
            return r1
        L46:
            wa.b.a()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.x.d(ec.c):dc.a");
    }

    public static final void e(cc.g gVar, CancellationException cancellationException) {
        y0 y0Var = (y0) gVar.t(r.B);
        if (y0Var != null) {
            y0Var.i(cancellationException);
        }
    }

    public static final void f(u uVar, CancellationException cancellationException) {
        y0 y0Var = (y0) uVar.v().t(r.B);
        if (y0Var != null) {
            y0Var.i(cancellationException);
        } else {
            wa.b.e(uVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final Object g(mc.p pVar, cc.c cVar) {
        ed.q qVar = new ed.q(cVar, cVar.g());
        Object W = a.a.W(qVar, true, qVar, pVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return W;
    }

    public static final Object h(long j2, cc.c cVar) {
        if (j2 > 0) {
            h hVar = new h(1, pc.a.A(cVar));
            hVar.v();
            if (j2 < Long.MAX_VALUE) {
                m(hVar.X).v(j2, hVar);
            }
            Object u4 = hVar.u();
            if (u4 == dc.a.COROUTINE_SUSPENDED) {
                return u4;
            }
        }
        return yb.y.f14813a;
    }

    public static final Object i(long j2, ec.j jVar) {
        Object h2 = h(C(j2), jVar);
        if (h2 == dc.a.COROUTINE_SUSPENDED) {
            return h2;
        }
        return yb.y.f14813a;
    }

    public static final void j(cc.g gVar) {
        y0 y0Var = (y0) gVar.t(r.B);
        if (y0Var != null && !y0Var.d()) {
            throw y0Var.B();
        }
    }

    public static final cc.g k(cc.g gVar, cc.g gVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) gVar.L(bool, new mg.m(22, (byte) 0))).booleanValue();
        boolean booleanValue2 = ((Boolean) gVar2.L(bool, new mg.m(22, (byte) 0))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return gVar.H(gVar2);
        }
        mg.m mVar = new mg.m(23, (byte) 0);
        cc.h hVar = cc.h.A;
        cc.g gVar3 = (cc.g) gVar.L(hVar, mVar);
        cc.g gVar4 = gVar2;
        if (booleanValue2) {
            gVar4 = gVar2.L(hVar, new mg.m(24, (byte) 0));
        }
        return gVar3.H(gVar4);
    }

    public static final q l(Executor executor) {
        return new s0(executor);
    }

    public static final a0 m(cc.g gVar) {
        a0 a0Var;
        cc.e t5 = gVar.t(cc.d.A);
        if (t5 instanceof a0) {
            a0Var = (a0) t5;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return z.f15043a;
        }
        return a0Var;
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final y0 o(cc.g gVar) {
        y0 y0Var = (y0) gVar.t(r.B);
        if (y0Var != null) {
            return y0Var;
        }
        wa.b.e(gVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final h p(cc.c cVar) {
        h hVar;
        h hVar2;
        if (!(cVar instanceof ed.f)) {
            return new h(1, cVar);
        }
        ed.f fVar = (ed.f) cVar;
        a0.c cVar2 = ed.b.f4447c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed.f.f4453b0;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, cVar2);
                hVar2 = null;
                break;
            } else if (obj instanceof h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                hVar2 = (h) obj;
                break loop0;
            } else if (obj != cVar2 && !(obj instanceof Throwable)) {
                wa.b.e(obj, "Inconsistent state ");
                return null;
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.Z;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if ((obj2 instanceof n) && ((n) obj2).f15021d != null) {
                hVar2.q();
            } else {
                h.Y.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, b.A);
                hVar = hVar2;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new h(2, cVar);
    }

    public static final void q(cc.g gVar, Throwable th2) {
        if (th2 instanceof c0) {
            th2 = ((c0) th2).A;
        }
        try {
            s sVar = (s) gVar.t(r.A);
            if (sVar != null) {
                sVar.z(gVar, th2);
            } else {
                ed.b.d(gVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                p7.t.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ed.b.d(gVar, th2);
        }
    }

    public static final i0 r(y0 y0Var, boolean z10, b1 b1Var) {
        if (y0Var instanceof f1) {
            return ((f1) y0Var).T(z10, b1Var);
        }
        return y0Var.F(b1Var.j(), z10, new a2.g(1, b1Var, b1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 23));
    }

    public static final boolean s(cc.g gVar) {
        y0 y0Var = (y0) gVar.t(r.B);
        if (y0Var != null) {
            return y0Var.d();
        }
        return true;
    }

    public static final boolean t(u uVar) {
        y0 y0Var = (y0) uVar.v().t(r.B);
        if (y0Var != null) {
            return y0Var.d();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, cc.c, zc.l1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final l1 u(u uVar, cc.g gVar, w wVar, mc.p pVar) {
        g1 g1Var;
        cc.g w10 = w(uVar, gVar);
        if (wVar.isLazy()) {
            g1Var = new g1(w10, pVar);
        } else {
            g1Var = new a(w10, true);
        }
        wVar.invoke(pVar, g1Var, g1Var);
        return g1Var;
    }

    public static /* synthetic */ l1 v(u uVar, cc.g gVar, w wVar, mc.p pVar, int i2) {
        if ((i2 & 1) != 0) {
            gVar = cc.h.A;
        }
        if ((i2 & 2) != 0) {
            wVar = w.DEFAULT;
        }
        return u(uVar, gVar, wVar, pVar);
    }

    public static final cc.g w(u uVar, cc.g gVar) {
        cc.g k10 = k(uVar.v(), gVar, true);
        gd.f fVar = g0.f15015a;
        if (k10 != fVar && k10.t(cc.d.A) == null) {
            return k10.H(fVar);
        }
        return k10;
    }

    public static final Object x(Object obj) {
        if (obj instanceof o) {
            return p7.j.o(((o) obj).f15025a);
        }
        return obj;
    }

    public static final void y(h hVar, cc.c cVar, boolean z10) {
        Object i2;
        t1 t1Var;
        Object obj = h.Z.get(hVar);
        Throwable d4 = hVar.d(obj);
        if (d4 != null) {
            i2 = new yb.k(d4);
        } else {
            i2 = hVar.i(obj);
        }
        if (z10) {
            cVar.getClass();
            ed.f fVar = (ed.f) cVar;
            ec.c cVar2 = fVar.X;
            Object obj2 = fVar.Z;
            cc.g g10 = cVar2.g();
            Object n10 = ed.b.n(g10, obj2);
            if (n10 != ed.b.f4448d) {
                t1Var = E(cVar2, g10, n10);
            } else {
                t1Var = null;
            }
            try {
                cVar2.h(i2);
                if (t1Var != null && !t1Var.l0()) {
                    return;
                }
                ed.b.g(g10, n10);
                return;
            } catch (Throwable th2) {
                if (t1Var == null || t1Var.l0()) {
                    ed.b.g(g10, n10);
                }
                throw th2;
            }
        }
        cVar.h(i2);
    }

    public static final Object z(cc.g gVar, mc.p pVar) {
        l0 l0Var;
        cc.g k10;
        long e02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o oVar;
        Thread currentThread = Thread.currentThread();
        cc.f fVar = cc.d.A;
        q qVar = (q) gVar.t(fVar);
        cc.h hVar = cc.h.A;
        if (qVar == null) {
            l0Var = n1.a();
            k10 = k(hVar, gVar.H(l0Var), true);
            gd.f fVar2 = g0.f15015a;
            if (k10 != fVar2 && k10.t(fVar) == null) {
                k10 = k10.H(fVar2);
            }
        } else {
            if (qVar instanceof l0) {
                l0 l0Var2 = (l0) qVar;
            }
            l0Var = (l0) n1.f15023a.get();
            k10 = k(hVar, gVar, true);
            gd.f fVar3 = g0.f15015a;
            if (k10 != fVar3 && k10.t(fVar) == null) {
                k10 = k10.H(fVar3);
            }
        }
        c cVar = new c(k10, currentThread, l0Var);
        w.DEFAULT.invoke(pVar, cVar, cVar);
        l0 l0Var3 = cVar.X;
        if (l0Var3 != null) {
            int i2 = l0.Y;
            l0Var3.d0(false);
        }
        while (true) {
            if (l0Var3 != null) {
                try {
                    e02 = l0Var3.e0();
                } catch (Throwable th2) {
                    if (l0Var3 != null) {
                        int i10 = l0.Y;
                        l0Var3.b0(false);
                    }
                    throw th2;
                }
            } else {
                e02 = Long.MAX_VALUE;
            }
            atomicReferenceFieldUpdater = f1.A;
            if (!(atomicReferenceFieldUpdater.get(cVar) instanceof v0)) {
                break;
            }
            LockSupport.parkNanos(cVar, e02);
            if (Thread.interrupted()) {
                cVar.u(new InterruptedException());
            }
        }
        if (l0Var3 != null) {
            int i11 = l0.Y;
            l0Var3.b0(false);
        }
        Object D = D(atomicReferenceFieldUpdater.get(cVar));
        if (D instanceof o) {
            oVar = (o) D;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return D;
        }
        throw oVar.f15025a;
    }
}
