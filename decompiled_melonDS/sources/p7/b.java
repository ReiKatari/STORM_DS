package p7;

import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mc.l Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, cc.c cVar, mc.l lVar) {
        super(2, cVar);
        this.X = i2;
        this.Z = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        m7.k kVar = (m7.k) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((b) t(cVar, kVar)).v(y.f14813a);
            default:
                return ((b) t(cVar, kVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                b bVar = new b(0, cVar, this.Z);
                bVar.Y = obj;
                return bVar;
            default:
                b bVar2 = new b(1, cVar, this.Z);
                bVar2.Y = obj;
                return bVar2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        mc.l lVar = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                j.I(obj);
                m7.k kVar = (m7.k) this.Y;
                kVar.getClass();
                return lVar.k(kVar.b());
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                j.I(obj);
                m7.k kVar2 = (m7.k) this.Y;
                kVar2.getClass();
                return lVar.k(kVar2.b());
        }
    }
}
