package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.j implements mc.l {
    public final /* synthetic */ p X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ mc.l Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, mc.l lVar, cc.c cVar) {
        super(1, cVar);
        this.X = pVar;
        this.Y = str;
        this.Z = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        String str = this.Y;
        mc.l lVar = this.Z;
        return new o(this.X, str, lVar, (cc.c) obj).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        t7.c T = this.X.f9328b.T(this.Y);
        try {
            Object k10 = this.Z.k(T);
            q8.r.q(T, null);
            return k10;
        } finally {
        }
    }
}
