package x0;

import androidx.lifecycle.q;
import androidx.lifecycle.x;
import d0.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f14312f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static e f14313g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f14314a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14315b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14316c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f14317d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public b0.a f14318e;

    public final void a(b bVar, b1 b1Var, b0.a aVar) {
        boolean z10;
        synchronized (this.f14314a) {
            try {
                m.h(!((List) b1Var.f3334d).isEmpty());
                this.f14318e = aVar;
                x n10 = bVar.n();
                d c4 = c(n10);
                if (c4 == null) {
                    return;
                }
                Set<a> set = (Set) this.f14316c.get(c4);
                b0.a aVar2 = this.f14318e;
                if (aVar2 == null || aVar2.b() != 2) {
                    for (a aVar3 : set) {
                        b bVar2 = (b) this.f14315b.get(aVar3);
                        bVar2.getClass();
                        if (!bVar2.equals(bVar) && !bVar2.q().isEmpty()) {
                            synchronized (bVar2.A) {
                                b1 b1Var2 = bVar2.X;
                                if (b1Var2 == null) {
                                    z10 = false;
                                } else {
                                    z10 = b1Var2.f3331a;
                                }
                            }
                            if (!z10 && !b1Var.f3331a) {
                                bVar2.s();
                            } else {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                        }
                    }
                }
                try {
                    bVar.l(b1Var);
                    if (n10.getLifecycle().b().isAtLeast(q.STARTED)) {
                        f(n10);
                    }
                } catch (n0.d e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b b(x xVar, n0.f fVar) {
        boolean z10;
        synchronized (this.f14314a) {
            try {
                if (this.f14315b.get(new a(System.identityHashCode(xVar), fVar.R)) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m.g("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z10);
                b bVar = new b(xVar, fVar);
                if (((ArrayList) fVar.z()).isEmpty()) {
                    bVar.r();
                }
                if (xVar.getLifecycle().b() == q.DESTROYED) {
                    return bVar;
                }
                e(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final d c(x xVar) {
        synchronized (this.f14314a) {
            try {
                for (d dVar : this.f14316c.keySet()) {
                    if (xVar.equals(dVar.B)) {
                        return dVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(x xVar) {
        synchronized (this.f14314a) {
            try {
                d c4 = c(xVar);
                if (c4 == null) {
                    return false;
                }
                for (a aVar : (Set) this.f14316c.get(c4)) {
                    b bVar = (b) this.f14315b.get(aVar);
                    bVar.getClass();
                    if (!bVar.q().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(b bVar) {
        Set hashSet;
        synchronized (this.f14314a) {
            try {
                x n10 = bVar.n();
                a aVar = new a(System.identityHashCode(n10), bVar.L.R);
                d c4 = c(n10);
                if (c4 != null) {
                    hashSet = (Set) this.f14316c.get(c4);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(aVar);
                this.f14315b.put(aVar, bVar);
                if (c4 == null) {
                    d dVar = new d(n10, this);
                    this.f14316c.put(dVar, hashSet);
                    n10.getLifecycle().a(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(x xVar) {
        synchronized (this.f14314a) {
            try {
                if (!d(xVar)) {
                    return;
                }
                if (this.f14317d.isEmpty()) {
                    this.f14317d.push(xVar);
                } else {
                    b0.a aVar = this.f14318e;
                    if (aVar == null || aVar.b() != 2) {
                        x xVar2 = (x) this.f14317d.peek();
                        if (!xVar.equals(xVar2)) {
                            h(xVar2);
                            this.f14317d.remove(xVar);
                            this.f14317d.push(xVar);
                        }
                    }
                }
                l(xVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(x xVar) {
        synchronized (this.f14314a) {
            try {
                this.f14317d.remove(xVar);
                h(xVar);
                if (!this.f14317d.isEmpty()) {
                    l((x) this.f14317d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(x xVar) {
        synchronized (this.f14314a) {
            try {
                d c4 = c(xVar);
                if (c4 == null) {
                    return;
                }
                for (a aVar : (Set) this.f14316c.get(c4)) {
                    b bVar = (b) this.f14315b.get(aVar);
                    bVar.getClass();
                    bVar.r();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void i(HashSet hashSet) {
        HashSet<a> hashSet2 = hashSet;
        synchronized (this.f14314a) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.f14315b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : hashSet2) {
                b bVar = (b) this.f14315b.get(aVar);
                if (bVar != null) {
                    bVar.s();
                    g(bVar.n());
                }
            }
        }
    }

    public final void j(b bVar) {
        synchronized (this.f14314a) {
            try {
                x n10 = bVar.n();
                a aVar = new a(System.identityHashCode(n10), bVar.L.R);
                this.f14315b.remove(aVar);
                HashSet hashSet = new HashSet();
                for (d dVar : this.f14316c.keySet()) {
                    if (n10.equals(dVar.B)) {
                        Set set = (Set) this.f14316c.get(dVar);
                        set.remove(aVar);
                        if (set.isEmpty()) {
                            hashSet.add(dVar.B);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k((x) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(x xVar) {
        synchronized (this.f14314a) {
            try {
                d c4 = c(xVar);
                if (c4 == null) {
                    return;
                }
                g(xVar);
                for (a aVar : (Set) this.f14316c.get(c4)) {
                    this.f14315b.remove(aVar);
                }
                this.f14316c.remove(c4);
                c4.B.getLifecycle().c(c4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(x xVar) {
        synchronized (this.f14314a) {
            try {
                for (a aVar : (Set) this.f14316c.get(c(xVar))) {
                    b bVar = (b) this.f14315b.get(aVar);
                    bVar.getClass();
                    if (!bVar.q().isEmpty()) {
                        bVar.t();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
