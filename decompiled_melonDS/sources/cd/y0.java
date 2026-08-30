package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 implements o1, h, dd.s {
    public final /* synthetic */ o1 A;

    public y0(q1 q1Var) {
        this.A = q1Var;
    }

    @Override // dd.s
    public final h b(cc.g gVar, int i2, bd.a aVar) {
        if (((i2 >= 0 && i2 < 2) || i2 == -2) && aVar == bd.a.DROP_OLDEST) {
            return this;
        }
        return q.u(this, gVar, i2, aVar);
    }

    @Override // cd.h
    public final Object c(i iVar, cc.c cVar) {
        return this.A.c(iVar, cVar);
    }

    @Override // cd.o1
    public final Object getValue() {
        return this.A.getValue();
    }
}
