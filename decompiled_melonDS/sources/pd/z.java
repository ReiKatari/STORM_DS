package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends ec.i implements mc.q {
    public int L;
    public /* synthetic */ yb.b R;
    public final /* synthetic */ bk.a X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bk.a aVar, cc.c cVar) {
        super(3, cVar);
        this.X = aVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        yb.y yVar = (yb.y) obj2;
        z zVar = new z(this.X, (cc.c) obj3);
        zVar.R = (yb.b) obj;
        return zVar.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        bk.a aVar = this.X;
        a aVar2 = (a) aVar.L;
        yb.b bVar = this.R;
        dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.L;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            byte u4 = aVar2.u();
            if (u4 == 1) {
                return aVar.p(true);
            }
            if (u4 == 0) {
                return aVar.p(false);
            }
            if (u4 == 6) {
                this.R = null;
                this.L = 1;
                obj = bk.a.e(aVar, bVar, this);
                if (obj == aVar3) {
                    return aVar3;
                }
            } else if (u4 == 8) {
                return aVar.o();
            } else {
                a.p(aVar2, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (od.l) obj;
    }
}
