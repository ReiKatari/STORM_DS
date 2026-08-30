package z2;

import l1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14929a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14930b = new Object();

    public static final void a(int i2, int i10) {
        if (i2 >= 0 && i2 < i10) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i10 + ')');
    }

    public static final boolean b(v vVar, int i2, r2.c cVar, boolean z10) {
        boolean z11;
        synchronized (f14929a) {
            try {
                int i10 = vVar.f14956d;
                if (i10 == i2) {
                    vVar.f14955c = cVar;
                    z11 = true;
                    if (z10) {
                        vVar.f14957e++;
                    }
                    vVar.f14956d = i10 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i10 = (i2 + length) >>> 1;
            int i11 = (j2 > jArr[i10] ? 1 : (j2 == jArr[i10] ? 0 : -1));
            if (i11 > 0) {
                i2 = i10 + 1;
            } else if (i11 < 0) {
                length = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i2 + 1);
    }

    public static f e() {
        return (f) l.f14918b.d();
    }

    public static final v f(p pVar) {
        v vVar = pVar.A;
        vVar.getClass();
        return (v) l.t(vVar, pVar);
    }

    public static final int g(p pVar) {
        v vVar = pVar.A;
        vVar.getClass();
        return ((v) l.h(vVar)).f14957e;
    }

    public static f h(f fVar) {
        if (fVar instanceof d0) {
            d0 d0Var = (d0) fVar;
            if (d0Var.f14902t == v2.h.b()) {
                d0Var.f14900r = null;
                return fVar;
            }
        }
        if (fVar instanceof e0) {
            e0 e0Var = (e0) fVar;
            if (e0Var.f14909i == v2.h.b()) {
                e0Var.f14908h = null;
                return fVar;
            }
        }
        f g10 = l.g(fVar, null, false);
        g10.j();
        return g10;
    }

    public static final boolean i(p pVar, mc.l lVar) {
        int i2;
        r2.c cVar;
        Object k10;
        f j2;
        boolean b10;
        do {
            synchronized (f14929a) {
                v vVar = pVar.A;
                vVar.getClass();
                v vVar2 = (v) l.h(vVar);
                i2 = vVar2.f14956d;
                cVar = vVar2.f14955c;
            }
            cVar.getClass();
            r2.f e6 = cVar.e();
            k10 = lVar.k(e6);
            r2.c c4 = e6.c();
            if (nc.k.a(c4, cVar)) {
                break;
            }
            v vVar3 = pVar.A;
            vVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                b10 = b((v) l.w(vVar3, pVar, j2), i2, c4, true);
            }
            l.n(j2, pVar);
        } while (!b10);
        return ((Boolean) k10).booleanValue();
    }

    public static Object j(n1 n1Var, mc.a aVar) {
        b bVar;
        f d0Var;
        f fVar = (f) l.f14918b.d();
        if (fVar instanceof d0) {
            d0 d0Var2 = (d0) fVar;
            if (d0Var2.f14902t == v2.h.b()) {
                mc.l lVar = d0Var2.f14900r;
                mc.l lVar2 = d0Var2.f14901s;
                try {
                    ((d0) fVar).f14900r = l.k(n1Var, lVar, true);
                    ((d0) fVar).f14901s = lVar2;
                    return aVar.b();
                } finally {
                    d0Var2.f14900r = lVar;
                    d0Var2.f14901s = lVar2;
                }
            }
        }
        if (fVar != null && !(fVar instanceof b)) {
            d0Var = fVar.u(n1Var);
        } else {
            if (fVar instanceof b) {
                bVar = (b) fVar;
            } else {
                bVar = null;
            }
            d0Var = new d0(bVar, n1Var, null, true, false);
        }
        try {
            f j2 = d0Var.j();
            Object b10 = aVar.b();
            f.q(j2);
            d0Var.c();
            return b10;
        } catch (Throwable th2) {
            d0Var.c();
            throw th2;
        }
    }

    public static void k(f fVar, f fVar2, mc.l lVar) {
        if (fVar == fVar2) {
            if (fVar instanceof d0) {
                ((d0) fVar).f14900r = lVar;
                return;
            } else if (fVar instanceof e0) {
                ((e0) fVar).f14908h = lVar;
                return;
            } else {
                wa.b.e(fVar, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        fVar2.getClass();
        f.q(fVar);
        fVar2.c();
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
