package v3;

import a4.h2;
import a4.o1;
import a4.o2;
import a4.q2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f extends b3.o implements q2, h2, a4.i {

    /* renamed from: i0  reason: collision with root package name */
    public a4.o f13646i0;

    /* renamed from: j0  reason: collision with root package name */
    public a f13647j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13648k0;

    public f(a aVar, a4.o oVar) {
        this.f13646i0 = oVar;
        this.f13647j0 = aVar;
    }

    @Override // b3.o
    public final void H0() {
        S0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [nc.l, mc.l] */
    public final void O0() {
        a aVar;
        ?? obj = new Object();
        a4.l.x(this, new nc.l(1));
        f fVar = (f) obj.A;
        if (fVar == null || (aVar = fVar.f13647j0) == null) {
            aVar = this.f13647j0;
        }
        P0(aVar);
    }

    public abstract void P0(q qVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.p, java.lang.Object] */
    public final void Q0() {
        ?? obj = new Object();
        obj.A = true;
        a4.l.z(this, new e3.e(obj));
        if (obj.A) {
            O0();
        }
    }

    public abstract boolean R0(int i2);

    /* JADX WARN: Type inference failed for: r0v3, types: [nc.t, java.lang.Object] */
    public final void S0() {
        if (this.f13648k0) {
            this.f13648k0 = false;
            if (this.f1777h0) {
                ?? obj = new Object();
                a4.l.x(this, new b4.p(obj, 2));
                f fVar = (f) obj.A;
                if (fVar != null) {
                    fVar.O0();
                } else {
                    P0(null);
                }
            }
        }
    }

    @Override // a4.h2
    public final void g0() {
        S0();
    }

    @Override // a4.h2
    public final long n() {
        a4.o oVar = this.f13646i0;
        if (oVar != null) {
            x4.c cVar = a4.l.t(this).f295t0;
            int i2 = o2.f304b;
            return o1.c(cVar.O(oVar.f274a), cVar.O(oVar.f275b), cVar.O(oVar.f276c), cVar.O(oVar.f277d));
        }
        return o2.f303a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // a4.h2
    public final void s0(k kVar, l lVar, long j2) {
        if (lVar == l.Main) {
            ?? r32 = kVar.f13678a;
            int size = r32.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (R0(((t) r32.get(i2)).f13699i)) {
                    int i10 = kVar.f13683f;
                    if (i10 == 4) {
                        this.f13648k0 = true;
                        Q0();
                        return;
                    } else if (i10 == 5) {
                        S0();
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
