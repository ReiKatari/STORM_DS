package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ g Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = gVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((f) t(cVar, uVar)).v(yVar);
                return yVar;
            default:
                yb.y yVar2 = yb.y.f14813a;
                ((f) t(cVar, uVar)).v(yVar2);
                return yVar2;
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new f(this.Y, cVar, 0);
            default:
                return new f(this.Y, cVar, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, j1.f] */
    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        g gVar = this.Y;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                if (gVar.f4558w0 == null) {
                    ?? obj2 = new Object();
                    j1.i iVar = gVar.f4547k0;
                    if (iVar != null) {
                        zc.x.v(gVar.C0(), null, null, new di.b(iVar, obj2, null, 3), 3);
                    }
                    gVar.f4558w0 = obj2;
                }
                return yVar;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                j1.f fVar = gVar.f4558w0;
                if (fVar != null) {
                    j1.g gVar2 = new j1.g(fVar);
                    j1.i iVar2 = gVar.f4547k0;
                    if (iVar2 != null) {
                        zc.x.v(gVar.C0(), null, null, new di.b(iVar2, gVar2, null, 4), 3);
                    }
                    gVar.f4558w0 = null;
                }
                return yVar;
        }
    }
}
