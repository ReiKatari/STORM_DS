package bd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements v1 {
    public Object A = j.f2183p;
    public zc.h B;
    public final /* synthetic */ h L;

    public c(h hVar) {
        this.L = hVar;
    }

    public final Object a(ec.c cVar) {
        p pVar;
        Object obj = this.A;
        boolean z10 = true;
        if (obj == j.f2183p || obj == j.f2180l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.Z;
            h hVar = this.L;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar);
            while (true) {
                if (hVar.x()) {
                    this.A = j.f2180l;
                    Throwable r5 = hVar.r();
                    if (r5 == null) {
                        z10 = false;
                    } else {
                        int i2 = ed.s.f4467a;
                        throw r5;
                    }
                } else {
                    long andIncrement = h.L.getAndIncrement(hVar);
                    long j2 = j.f2170b;
                    long j10 = andIncrement / j2;
                    int i10 = (int) (andIncrement % j2);
                    if (pVar2.L != j10) {
                        pVar = hVar.q(j10, pVar2);
                        if (pVar == null) {
                            continue;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    Object I = hVar.I(pVar, i10, andIncrement, null);
                    a0.c cVar2 = j.m;
                    if (I != cVar2) {
                        a0.c cVar3 = j.f2182o;
                        if (I == cVar3) {
                            if (andIncrement < hVar.u()) {
                                pVar.b();
                            }
                            pVar2 = pVar;
                        } else if (I == j.f2181n) {
                            h hVar2 = this.L;
                            zc.h p10 = zc.x.p(pc.a.A(cVar));
                            try {
                                this.B = p10;
                                Object I2 = hVar2.I(pVar, i10, andIncrement, this);
                                if (I2 == cVar2) {
                                    b(pVar, i10);
                                } else {
                                    if (I2 == cVar3) {
                                        if (andIncrement < hVar2.u()) {
                                            pVar.b();
                                        }
                                        p pVar3 = (p) h.Z.get(hVar2);
                                        while (true) {
                                            if (hVar2.x()) {
                                                zc.h hVar3 = this.B;
                                                hVar3.getClass();
                                                this.B = null;
                                                this.A = j.f2180l;
                                                Throwable r10 = hVar.r();
                                                if (r10 == null) {
                                                    hVar3.h(Boolean.FALSE);
                                                } else {
                                                    hVar3.h(new yb.k(r10));
                                                }
                                            } else {
                                                long andIncrement2 = h.L.getAndIncrement(hVar2);
                                                long j11 = j.f2170b;
                                                long j12 = andIncrement2 / j11;
                                                int i11 = (int) (andIncrement2 % j11);
                                                if (pVar3.L != j12) {
                                                    p q10 = hVar2.q(j12, pVar3);
                                                    if (q10 != null) {
                                                        pVar3 = q10;
                                                    }
                                                }
                                                Object I3 = hVar2.I(pVar3, i11, andIncrement2, this);
                                                if (I3 == j.m) {
                                                    b(pVar3, i11);
                                                    break;
                                                } else if (I3 == j.f2182o) {
                                                    if (andIncrement2 < hVar2.u()) {
                                                        pVar3.b();
                                                    }
                                                } else if (I3 != j.f2181n) {
                                                    pVar3.b();
                                                    this.A = I3;
                                                    this.B = null;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        pVar.b();
                                        this.A = I2;
                                        this.B = null;
                                    }
                                    p10.e(Boolean.TRUE, null);
                                }
                                Object u4 = p10.u();
                                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                                return u4;
                            } catch (Throwable th2) {
                                p10.D();
                                throw th2;
                            }
                        } else {
                            pVar.b();
                            this.A = I;
                        }
                    } else {
                        a0.j.p("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // zc.v1
    public final void b(ed.r rVar, int i2) {
        zc.h hVar = this.B;
        if (hVar != null) {
            hVar.b(rVar, i2);
        }
    }

    public final Object c() {
        Object obj = this.A;
        a0.c cVar = j.f2183p;
        if (obj != cVar) {
            this.A = cVar;
            if (obj != j.f2180l) {
                return obj;
            }
            Throwable s10 = this.L.s();
            int i2 = ed.s.f4467a;
            throw s10;
        }
        a0.j.p("`hasNext()` has not been invoked");
        return null;
    }
}
