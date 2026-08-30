package zc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends e0 implements g, ec.d, v1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15016b0 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    public final cc.c R;
    public final cc.g X;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h(int i2, cc.c cVar) {
        super(i2);
        this.R = cVar;
        this.X = cVar.g();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.A;
    }

    public static void B(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(k1 k1Var, Object obj, int i2, mc.q qVar) {
        f fVar;
        if (obj instanceof o) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (qVar == null && !(k1Var instanceof f)) {
            return obj;
        }
        if (k1Var instanceof f) {
            fVar = (f) k1Var;
        } else {
            fVar = null;
        }
        return new n(obj, fVar, qVar, (Throwable) null, 16);
    }

    public final boolean A() {
        if (this.L == 2) {
            if (ed.f.f4453b0.get((ed.f) this.R) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        ed.f fVar;
        cc.c cVar = this.R;
        Throwable th2 = null;
        if (cVar instanceof ed.f) {
            fVar = (ed.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed.f.f4453b0;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                a0.c cVar2 = ed.b.f4447c;
                if (obj == cVar2) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, cVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != cVar2) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            a0.j.h("Failed requirement.");
                            return;
                        }
                    }
                    th2 = (Throwable) obj;
                } else {
                    wa.b.e(obj, "Inconsistent state ");
                    return;
                }
            }
            if (th2 != null) {
                q();
                n(th2);
            }
        }
    }

    public final void E(Object obj, int i2, mc.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k1) {
                Object G = G((k1) obj2, obj, i2, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    q();
                }
                r(i2);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f15017c.compareAndSet(iVar, 0, 1)) {
                    if (qVar != null) {
                        m(qVar, iVar.f15025a, obj);
                        return;
                    }
                    return;
                }
            }
            wa.b.e(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void F(q qVar, Object obj) {
        ed.f fVar;
        q qVar2;
        int i2;
        cc.c cVar = this.R;
        if (cVar instanceof ed.f) {
            fVar = (ed.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            qVar2 = fVar.R;
        } else {
            qVar2 = null;
        }
        if (qVar2 == qVar) {
            i2 = 4;
        } else {
            i2 = this.L;
        }
        E(obj, i2, null);
    }

    @Override // zc.e0
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k1)) {
                if (!(obj instanceof o)) {
                    if (obj instanceof n) {
                        n nVar = (n) obj;
                        if (nVar.f15022e == null) {
                            n a10 = n.a(nVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            f fVar = nVar.f15019b;
                            if (fVar != null) {
                                l(fVar, cancellationException);
                            }
                            mc.q qVar = nVar.f15020c;
                            if (qVar != null) {
                                m(qVar, cancellationException, nVar.f15018a);
                                return;
                            }
                            return;
                        }
                        a0.j.p("Must be called at most once");
                        return;
                    }
                    cancellationException2 = cancellationException;
                    n nVar2 = new n(obj, (f) null, (mc.q) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                a0.j.p("Not completed");
                return;
            }
        }
    }

    @Override // zc.v1
    public final void b(ed.r rVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = Y;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                a0.j.p("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i2));
        y(rVar);
    }

    @Override // zc.e0
    public final cc.c c() {
        return this.R;
    }

    @Override // zc.e0
    public final Throwable d(Object obj) {
        Throwable d4 = super.d(obj);
        if (d4 != null) {
            return d4;
        }
        return null;
    }

    @Override // zc.g
    public final void e(Object obj, mc.q qVar) {
        E(obj, this.L, qVar);
    }

    @Override // ec.d
    public final ec.d f() {
        cc.c cVar = this.R;
        if (cVar instanceof ec.d) {
            return (ec.d) cVar;
        }
        return null;
    }

    @Override // cc.c
    public final cc.g g() {
        return this.X;
    }

    @Override // cc.c
    public final void h(Object obj) {
        Throwable a10 = yb.l.a(obj);
        if (a10 != null) {
            obj = new o(a10, false);
        }
        E(obj, this.L, null);
    }

    @Override // zc.e0
    public final Object i(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).f15018a;
        }
        return obj;
    }

    @Override // zc.e0
    public final Object k() {
        return Z.get(this);
    }

    public final void l(f fVar, Throwable th2) {
        try {
            fVar.a(th2);
        } catch (Throwable th3) {
            x.q(this.X, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(mc.q qVar, Throwable th2, Object obj) {
        cc.g gVar = this.X;
        try {
            qVar.i(th2, obj, gVar);
        } catch (Throwable th3) {
            x.q(gVar, new RuntimeException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // zc.g
    public final boolean n(Throwable th2) {
        Throwable th3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof k1)) {
                return false;
            }
            if ((obj instanceof f) || (obj instanceof ed.r)) {
                z10 = true;
            }
            if (th2 == null) {
                th3 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th3 = th2;
            }
            o oVar = new o(th3, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k1 k1Var = (k1) obj;
            if (k1Var instanceof f) {
                l((f) obj, th2);
            } else if (k1Var instanceof ed.r) {
                p((ed.r) obj, th2);
            }
            if (!A()) {
                q();
            }
            r(this.L);
            return true;
        }
    }

    @Override // zc.g
    public final a0.c o(Object obj, mc.q qVar) {
        a0.c cVar = x.f15031a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k1) {
                Object G = G((k1) obj2, obj, this.L, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    q();
                }
                return cVar;
            }
            return null;
        }
    }

    public final void p(ed.r rVar, Throwable th2) {
        cc.g gVar = this.X;
        int i2 = Y.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                rVar.h(i2, gVar);
                return;
            } catch (Throwable th3) {
                x.q(gVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        a0.j.p("The index for Segment.onCancellation(..) is broken");
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15016b0;
        i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var == null) {
            return;
        }
        i0Var.dispose();
        atomicReferenceFieldUpdater.set(this, j1.A);
    }

    public final void r(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = Y;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z12 = false;
                    if (i2 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cc.c cVar = this.R;
                    if (!z10 && (cVar instanceof ed.f)) {
                        if (i2 != 1 && i2 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i12 = this.L;
                        if (i12 == 1 || i12 == 2) {
                            z12 = true;
                        }
                        if (z11 == z12) {
                            ed.f fVar = (ed.f) cVar;
                            q qVar = fVar.R;
                            cc.g g10 = fVar.X.g();
                            if (ed.b.j(qVar, g10)) {
                                ed.b.i(qVar, g10, this);
                                return;
                            }
                            l0 a10 = n1.a();
                            if (a10.L >= 4294967296L) {
                                a10.c0(this);
                                return;
                            }
                            a10.d0(true);
                            try {
                                x.y(this, cVar, true);
                                do {
                                } while (a10.f0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    x.y(this, cVar, z10);
                    return;
                }
                a0.j.p("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    @Override // zc.g
    public final void s(Object obj) {
        r(this.L);
    }

    public Throwable t(f1 f1Var) {
        return f1Var.B();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C());
        sb2.append('(');
        sb2.append(x.B(this.R));
        sb2.append("){");
        Object obj = Z.get(this);
        if (obj instanceof k1) {
            str = "Active";
        } else if (obj instanceof i) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(x.n(this));
        return sb2.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        y0 y0Var;
        boolean A = A();
        do {
            atomicIntegerFieldUpdater = Y;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i10 = i2 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (A) {
                        D();
                    }
                    Object obj = Z.get(this);
                    if (!(obj instanceof o)) {
                        int i11 = this.L;
                        if ((i11 == 1 || i11 == 2) && (y0Var = (y0) this.X.t(r.B)) != null && !y0Var.d()) {
                            CancellationException B = y0Var.B();
                            a(B);
                            throw B;
                        }
                        return i(obj);
                    }
                    throw ((o) obj).f15025a;
                }
                a0.j.p("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((i0) f15016b0.get(this)) == null) {
            w();
        }
        if (A) {
            D();
        }
        return dc.a.COROUTINE_SUSPENDED;
    }

    public final void v() {
        i0 w10 = w();
        if (w10 != null && !(Z.get(this) instanceof k1)) {
            w10.dispose();
            f15016b0.set(this, j1.A);
        }
    }

    public final i0 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y0 y0Var = (y0) this.X.t(r.B);
        if (y0Var == null) {
            return null;
        }
        i0 r5 = x.r(y0Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = f15016b0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, r5)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return r5;
    }

    public final void x(mc.l lVar) {
        y(new e(1, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
        B(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(zc.k1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = zc.h.Z
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof zc.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof zc.f
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof ed.r
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof zc.o
            if (r1 == 0) goto L50
            r0 = r2
            zc.o r0 = (zc.o) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = zc.o.f15024b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4c
            boolean r1 = r2 instanceof zc.i
            if (r1 == 0) goto La1
            java.lang.Throwable r0 = r0.f15025a
            boolean r1 = r8 instanceof zc.f
            if (r1 == 0) goto L43
            zc.f r8 = (zc.f) r8
            r7.l(r8, r0)
            return
        L43:
            r8.getClass()
            ed.r r8 = (ed.r) r8
            r7.p(r8, r0)
            return
        L4c:
            B(r8, r2)
            throw r3
        L50:
            boolean r1 = r2 instanceof zc.n
            if (r1 == 0) goto L87
            r1 = r2
            zc.n r1 = (zc.n) r1
            zc.f r4 = r1.f15019b
            if (r4 != 0) goto L83
            boolean r4 = r8 instanceof ed.r
            if (r4 == 0) goto L60
            return
        L60:
            r8.getClass()
            r4 = r8
            zc.f r4 = (zc.f) r4
            java.lang.Throwable r5 = r1.f15022e
            if (r5 == 0) goto L6e
            r7.l(r4, r5)
            return
        L6e:
            r5 = 29
            zc.n r1 = zc.n.a(r1, r4, r3, r5)
        L74:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7b
            goto La1
        L7b:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L74
            goto L0
        L83:
            B(r8, r2)
            throw r3
        L87:
            boolean r1 = r8 instanceof ed.r
            if (r1 == 0) goto L8c
            return
        L8c:
            r8.getClass()
            r3 = r8
            zc.f r3 = (zc.f) r3
            zc.n r1 = new zc.n
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            B(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.h.y(zc.k1):void");
    }

    public final boolean z() {
        return Z.get(this) instanceof k1;
    }
}
