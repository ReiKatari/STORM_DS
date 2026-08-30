package bd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends zc.a implements l, x {
    public final h R;

    public v(cc.g gVar, h hVar) {
        super(gVar, true);
        this.R = hVar;
    }

    @Override // bd.x
    public final Object a(Object obj) {
        return this.R.a(obj);
    }

    @Override // bd.x
    public final Object b(cc.c cVar, Object obj) {
        return this.R.b(cVar, obj);
    }

    @Override // zc.f1, zc.y0, bd.l
    public final void i(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new z0(A(), null, this);
        }
        x(cancellationException);
    }

    @Override // zc.a
    public final void i0(Throwable th2, boolean z10) {
        if (!this.R.h(th2, false) && !z10) {
            zc.x.q(this.L, th2);
        }
    }

    @Override // bd.l
    public final c iterator() {
        h hVar = this.R;
        hVar.getClass();
        return new c(hVar);
    }

    @Override // bd.l
    public final Object j(dd.p pVar) {
        h hVar = this.R;
        hVar.getClass();
        Object D = h.D(hVar, pVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return D;
    }

    @Override // zc.a
    public final void j0(Object obj) {
        yb.y yVar = (yb.y) obj;
        this.R.g(null);
    }

    @Override // bd.l
    public final a0.g k() {
        return this.R.k();
    }

    public final boolean k0(Throwable th2) {
        return this.R.h(th2, false);
    }

    @Override // bd.l
    public final Object l() {
        return this.R.l();
    }

    public final void l0(u uVar) {
        h hVar = this.R;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f2167d0;
        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, null, uVar)) {
            if (atomicReferenceFieldUpdater.get(hVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(hVar);
                    a0.c cVar = j.f2184q;
                    if (obj == cVar) {
                        a0.c cVar2 = j.f2185r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, cVar2)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != cVar) {
                                break;
                            }
                        }
                        uVar.k(hVar.r());
                        return;
                    } else if (obj == j.f2185r) {
                        a0.j.p("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        wa.b.e(obj, "Another handler is already registered: ");
                        return;
                    }
                }
            }
        }
    }

    @Override // bd.l
    public final Object p(cc.c cVar) {
        return this.R.p(cVar);
    }

    @Override // zc.f1
    public final void x(CancellationException cancellationException) {
        this.R.h(cancellationException, true);
        u(cancellationException);
    }
}
