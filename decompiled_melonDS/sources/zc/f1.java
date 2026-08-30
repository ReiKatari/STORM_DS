package zc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f1 implements y0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f1(boolean z10) {
        k0 k0Var;
        if (z10) {
            k0Var = x.f15040j;
        } else {
            k0Var = x.f15039i;
        }
        this._state$volatile = k0Var;
    }

    public static l Y(ed.j jVar) {
        while (jVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed.j.B;
            ed.j c4 = jVar.c();
            if (c4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (ed.j) obj;
                    if (!jVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = c4;
            }
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.h()) {
                if (jVar instanceof l) {
                    return (l) jVar;
                }
                if (jVar instanceof h1) {
                    return null;
                }
            }
        }
    }

    public static String f0(Object obj) {
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (e1Var.c()) {
                return "Cancelling";
            }
            if (e1.B.get(e1Var) != 1) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof v0) {
            if (((v0) obj).d()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof o) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public String A() {
        return "Job was cancelled";
    }

    @Override // zc.y0
    public final CancellationException B() {
        Object obj = A.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof e1) {
            Throwable b10 = ((e1) obj).b();
            if (b10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (b10 instanceof CancellationException) {
                    cancellationException = (CancellationException) b10;
                }
                if (cancellationException == null) {
                    return new z0(concat, b10, this);
                }
                return cancellationException;
            }
            wa.b.e(this, "Job is still new or active: ");
            return null;
        } else if (!(obj instanceof v0)) {
            if (obj instanceof o) {
                Throwable th2 = ((o) obj).f15025a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new z0(A(), th2, this);
                }
                return cancellationException;
            }
            return new z0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            wa.b.e(this, "Job is still new or active: ");
            return null;
        }
    }

    public boolean C(Throwable th2) {
        if (!(th2 instanceof CancellationException)) {
            if (u(th2) && N()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.g0, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, androidx.fragment.app.g0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [zc.f1, java.lang.Object] */
    public final void D(v0 v0Var, Object obj) {
        o oVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.dispose();
            atomicReferenceFieldUpdater.set(this, j1.A);
        }
        ?? r12 = 0;
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            th2 = oVar.f15025a;
        } else {
            th2 = null;
        }
        if (v0Var instanceof b1) {
            try {
                ((b1) v0Var).k(th2);
                return;
            } catch (Throwable th3) {
                R(new RuntimeException("Exception in completion handler " + v0Var + " for " + ((Object) this), th3));
                return;
            }
        }
        h1 e6 = v0Var.e();
        if (e6 != null) {
            e6.b(new ed.h(1), 1);
            Object obj2 = ed.j.A.get(e6);
            obj2.getClass();
            ed.j jVar = (ed.j) obj2;
            while (!jVar.equals(e6)) {
                if (jVar instanceof b1) {
                    try {
                        ((b1) jVar).k(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            p7.t.a(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th4);
                        }
                    }
                }
                jVar = jVar.g();
                r12 = r12;
            }
            if (r12 != 0) {
                R(r12);
            }
        }
    }

    public final Throwable E(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        f1 f1Var = (f1) obj;
        Object obj2 = A.get(f1Var);
        CancellationException cancellationException = null;
        if (obj2 instanceof e1) {
            th2 = ((e1) obj2).b();
        } else if (obj2 instanceof o) {
            th2 = ((o) obj2).f15025a;
        } else if (!(obj2 instanceof v0)) {
            th2 = null;
        } else {
            wa.b.e(obj2, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new z0("Parent job is ".concat(f0(obj2)), th2, f1Var);
        }
        return cancellationException;
    }

    @Override // zc.y0
    public final i0 F(boolean z10, boolean z11, a2.g gVar) {
        b1 j0Var;
        if (z10) {
            j0Var = new x0(gVar);
        } else {
            j0Var = new j0(1, gVar);
        }
        return T(z11, j0Var);
    }

    @Override // zc.y0
    public final Object G(ec.c cVar) {
        Object obj;
        yb.y yVar;
        do {
            obj = A.get(this);
            boolean z10 = obj instanceof v0;
            yVar = yb.y.f14813a;
            if (!z10) {
                x.j(cVar.g());
                return yVar;
            }
        } while (e0(obj) < 0);
        h hVar = new h(1, pc.a.A(cVar));
        hVar.v();
        hVar.y(new e(2, x.r(this, true, new j(hVar, 1))));
        Object u4 = hVar.u();
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        if (u4 != aVar) {
            u4 = yVar;
        }
        if (u4 == aVar) {
            return u4;
        }
        return yVar;
    }

    @Override // cc.g
    public final cc.g H(cc.g gVar) {
        return pc.a.G(this, gVar);
    }

    @Override // zc.y0
    public final i0 I(mc.l lVar) {
        return T(true, new j0(1, lVar));
    }

    public final Object J(e1 e1Var, Object obj) {
        o oVar;
        Throwable M;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            th2 = oVar.f15025a;
        }
        synchronized (e1Var) {
            e1Var.c();
            ArrayList f8 = e1Var.f(th2);
            M = M(e1Var, f8);
            if (M != null && f8.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f8.size()));
                int size = f8.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = f8.get(i2);
                    i2++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != M && th3 != M && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        p7.t.a(M, th3);
                    }
                }
            }
        }
        if (M != null && M != th2) {
            obj = new o(M, false);
        }
        if (M != null && (y(M) || Q(M))) {
            obj.getClass();
            o.f15024b.compareAndSet((o) obj, 0, 1);
        }
        a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (obj instanceof v0) {
            obj2 = new w0((v0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e1Var, obj2) && atomicReferenceFieldUpdater.get(this) == e1Var) {
        }
        D(e1Var, obj);
        return obj;
    }

    @Override // cc.g
    public final Object L(Object obj, mc.p pVar) {
        return pVar.j(obj, this);
    }

    public final Throwable M(e1 e1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!e1Var.c()) {
                return null;
            }
            return new z0(A(), null, this);
        }
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof p1) {
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof p1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean N() {
        return true;
    }

    public boolean O() {
        return this instanceof m;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ed.j, zc.h1] */
    public final h1 P(v0 v0Var) {
        h1 e6 = v0Var.e();
        if (e6 == null) {
            if (v0Var instanceof k0) {
                return new ed.j();
            }
            if (v0Var instanceof b1) {
                d0((b1) v0Var);
                return null;
            }
            wa.b.e(v0Var, "State should have list: ");
            return null;
        }
        return e6;
    }

    public boolean Q(Throwable th2) {
        return false;
    }

    public final void S(y0 y0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        j1 j1Var = j1.A;
        if (y0Var == null) {
            atomicReferenceFieldUpdater.set(this, j1Var);
            return;
        }
        y0Var.start();
        k w10 = y0Var.w(this);
        atomicReferenceFieldUpdater.set(this, w10);
        if (!(A.get(this) instanceof v0)) {
            w10.dispose();
            atomicReferenceFieldUpdater.set(this, j1Var);
        }
    }

    public final i0 T(boolean z10, b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        boolean z11;
        Throwable th2;
        o oVar;
        boolean b10;
        e1 e1Var;
        Throwable th3;
        b1Var.R = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof k0;
            j1Var = j1.A;
            z11 = true;
            th2 = null;
            if (z12) {
                k0 k0Var = (k0) obj;
                if (k0Var.A) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(k0Var);
            } else if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                h1 e6 = v0Var.e();
                if (e6 == null) {
                    d0((b1) obj);
                } else {
                    if (b1Var.j()) {
                        if (v0Var instanceof e1) {
                            e1Var = (e1) v0Var;
                        } else {
                            e1Var = null;
                        }
                        if (e1Var != null) {
                            th3 = e1Var.b();
                        } else {
                            th3 = null;
                        }
                        if (th3 == null) {
                            b10 = e6.b(b1Var, 5);
                        } else if (z10) {
                            b1Var.k(th3);
                            return j1Var;
                        }
                    } else {
                        b10 = e6.b(b1Var, 1);
                    }
                    if (b10) {
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return b1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o) {
                oVar = (o) obj2;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                th2 = oVar.f15025a;
            }
            b1Var.k(th2);
        }
        return j1Var;
    }

    public boolean U() {
        return this instanceof c;
    }

    public final boolean V(Object obj) {
        Object g02;
        do {
            g02 = g0(A.get(this), obj);
            if (g02 == x.f15034d) {
                return false;
            }
            if (g02 == x.f15035e) {
                return true;
            }
        } while (g02 == x.f15036f);
        c(g02);
        return true;
    }

    public final Object W(Object obj) {
        Object g02;
        o oVar;
        do {
            g02 = g0(A.get(this), obj);
            if (g02 == x.f15034d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof o) {
                    oVar = (o) obj;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    th2 = oVar.f15025a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (g02 == x.f15036f);
        return g02;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, androidx.fragment.app.g0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [zc.f1, java.lang.Object] */
    public final void Z(h1 h1Var, Throwable th2) {
        h1Var.b(new ed.h(4), 4);
        Object obj = ed.j.A.get(h1Var);
        obj.getClass();
        ed.j jVar = (ed.j) obj;
        ?? r12 = 0;
        while (!jVar.equals(h1Var)) {
            if ((jVar instanceof b1) && ((b1) jVar).j()) {
                try {
                    ((b1) jVar).k(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        p7.t.a(r12, th3);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th3);
                    }
                }
            }
            jVar = jVar.g();
            r12 = r12;
        }
        if (r12 != 0) {
            R(r12);
        }
        y(th2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ed.j, zc.h1] */
    public final void c0(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? jVar = new ed.j();
        u0 u0Var = jVar;
        if (!k0Var.A) {
            u0Var = new u0(jVar);
        }
        do {
            atomicReferenceFieldUpdater = A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, u0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    @Override // zc.y0
    public boolean d() {
        Object obj = A.get(this);
        if ((obj instanceof v0) && ((v0) obj).d()) {
            return true;
        }
        return false;
    }

    public final void d0(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ed.j jVar = new ed.j();
        b1Var.getClass();
        ed.j.B.set(jVar, b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ed.j.A;
        atomicReferenceFieldUpdater2.set(jVar, b1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b1Var) == b1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b1Var, b1Var, jVar)) {
                    if (atomicReferenceFieldUpdater2.get(b1Var) != b1Var) {
                        break;
                    }
                }
                jVar.f(b1Var);
                break loop0;
            }
            break;
        }
        ed.j g10 = b1Var.g();
        do {
            atomicReferenceFieldUpdater = A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b1Var);
    }

    public final int e0(Object obj) {
        boolean z10 = obj instanceof k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (z10) {
            if (!((k0) obj).A) {
                k0 k0Var = x.f15040j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                b0();
                return 1;
            }
            return 0;
        } else if (obj instanceof u0) {
            h1 h1Var = ((u0) obj).A;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            b0();
            return 1;
        } else {
            return 0;
        }
    }

    public final Object g0(Object obj, Object obj2) {
        w0 w0Var;
        e1 e1Var;
        boolean z10;
        o oVar;
        if (!(obj instanceof v0)) {
            return x.f15034d;
        }
        if (((obj instanceof k0) || (obj instanceof b1)) && !(obj instanceof l) && !(obj2 instanceof o)) {
            v0 v0Var = (v0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            if (obj2 instanceof v0) {
                w0Var = new w0((v0) obj2);
            } else {
                w0Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, v0Var, w0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != v0Var) {
                    return x.f15036f;
                }
            }
            a0(obj2);
            D(v0Var, obj2);
            return obj2;
        }
        v0 v0Var2 = (v0) obj;
        h1 P = P(v0Var2);
        if (P == null) {
            return x.f15036f;
        }
        Throwable th2 = null;
        if (v0Var2 instanceof e1) {
            e1Var = (e1) v0Var2;
        } else {
            e1Var = null;
        }
        if (e1Var == null) {
            e1Var = new e1(P, null);
        }
        synchronized (e1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e1.B;
            if (atomicIntegerFieldUpdater.get(e1Var) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return x.f15034d;
            }
            atomicIntegerFieldUpdater.set(e1Var, 1);
            if (e1Var != v0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, v0Var2, e1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != v0Var2) {
                        return x.f15036f;
                    }
                }
            }
            boolean c4 = e1Var.c();
            if (obj2 instanceof o) {
                oVar = (o) obj2;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                e1Var.a(oVar.f15025a);
            }
            Throwable b10 = e1Var.b();
            if (!c4) {
                th2 = b10;
            }
            if (th2 != null) {
                Z(P, th2);
            }
            l Y = Y(P);
            if (Y != null && h0(e1Var, Y, obj2)) {
                return x.f15035e;
            }
            P.b(new ed.h(2), 2);
            l Y2 = Y(P);
            if (Y2 != null && h0(e1Var, Y2, obj2)) {
                return x.f15035e;
            }
            return J(e1Var, obj2);
        }
    }

    @Override // cc.e
    public final cc.f getKey() {
        return r.B;
    }

    public final boolean h0(e1 e1Var, l lVar, Object obj) {
        while (x.r(lVar.X, false, new d1(this, e1Var, lVar, obj)) == j1.A) {
            lVar = Y(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // zc.y0, bd.l
    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new z0(A(), null, this);
        }
        x(cancellationException);
    }

    @Override // zc.y0
    public final boolean isCancelled() {
        Object obj = A.get(this);
        if (!(obj instanceof o)) {
            if (!(obj instanceof e1) || !((e1) obj).c()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // cc.g
    public final cc.g m(cc.f fVar) {
        return pc.a.F(this, fVar);
    }

    public void q(Object obj) {
        c(obj);
    }

    public final Object r(ec.c cVar) {
        Object obj;
        do {
            obj = A.get(this);
            if (!(obj instanceof v0)) {
                if (!(obj instanceof o)) {
                    return x.D(obj);
                }
                throw ((o) obj).f15025a;
            }
        } while (e0(obj) < 0);
        c1 c1Var = new c1(pc.a.A(cVar), this);
        c1Var.v();
        c1Var.y(new e(2, x.r(this, true, new j0(2, c1Var))));
        Object u4 = c1Var.u();
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return u4;
    }

    @Override // zc.y0
    public final boolean start() {
        int e02;
        do {
            e02 = e0(A.get(this));
            if (e02 == 0) {
                return false;
            }
        } while (e02 != 1);
        return true;
    }

    @Override // cc.g
    public final cc.e t(cc.f fVar) {
        return pc.a.w(this, fVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(X() + '{' + f0(A.get(this)) + '}');
        sb2.append('@');
        sb2.append(x.n(this));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 == zc.x.f15035e) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.f1.u(java.lang.Object):boolean");
    }

    @Override // zc.y0
    public final k w(f1 f1Var) {
        o oVar;
        o oVar2;
        l lVar = new l(f1Var);
        lVar.R = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (k0Var.A) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(k0Var);
            } else {
                boolean z10 = obj instanceof v0;
                j1 j1Var = j1.A;
                Throwable th2 = null;
                if (z10) {
                    h1 e6 = ((v0) obj).e();
                    if (e6 == null) {
                        d0((b1) obj);
                    } else if (!e6.b(lVar, 7)) {
                        boolean b10 = e6.b(lVar, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof e1) {
                            th2 = ((e1) obj2).b();
                        } else {
                            if (obj2 instanceof o) {
                                oVar2 = (o) obj2;
                            } else {
                                oVar2 = null;
                            }
                            if (oVar2 != null) {
                                th2 = oVar2.f15025a;
                            }
                        }
                        lVar.k(th2);
                        if (b10) {
                            break loop0;
                        }
                        return j1Var;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof o) {
                        oVar = (o) obj3;
                    } else {
                        oVar = null;
                    }
                    if (oVar != null) {
                        th2 = oVar.f15025a;
                    }
                    lVar.k(th2);
                    return j1Var;
                }
            }
        }
        return lVar;
    }

    public void x(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final boolean y(Throwable th2) {
        if (!U()) {
            boolean z10 = th2 instanceof CancellationException;
            k kVar = (k) B.get(this);
            if (kVar != null && kVar != j1.A) {
                if (!kVar.a(th2) && !z10) {
                    return false;
                }
                return true;
            }
            return z10;
        }
        return true;
    }

    public void b0() {
    }

    public void R(androidx.fragment.app.g0 g0Var) {
        throw g0Var;
    }

    public void a0(Object obj) {
    }

    public void c(Object obj) {
    }
}
