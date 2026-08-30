package m7;

import kf.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements b {
    public final t7.b A;
    public final String B;
    public final nc.i L;
    public final yb.n R = new yb.n(new s0(4, this));

    public r(t7.b bVar, String str, mc.p pVar) {
        this.A = bVar;
        this.B = str;
        this.L = (nc.i) pVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yb.n nVar = this.R;
        if (nVar.B != yb.v.f14812a) {
            ((t7.a) nVar.getValue()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [nc.i, mc.p] */
    @Override // m7.b
    public final Object y(boolean z10, mc.p pVar, ec.c cVar) {
        p pVar2;
        q qVar = (q) cVar.g().t(q.B);
        if (qVar != null) {
            pVar2 = qVar.A;
        } else {
            pVar2 = null;
        }
        if (pVar2 != null) {
            return pVar.j(pVar2, cVar);
        }
        p pVar3 = new p(this.L, (t7.a) this.R.getValue());
        return zc.x.F(new q(pVar3), new di.b(pVar, pVar3, (cc.c) null), cVar);
    }
}
