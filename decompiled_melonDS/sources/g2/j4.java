package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j4 extends ec.j implements mc.q {
    public /* synthetic */ float X;
    public final /* synthetic */ n2.w0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(n2.w0 w0Var, cc.c cVar) {
        super(3, cVar);
        this.Y = w0Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        zc.u uVar = (zc.u) obj;
        float floatValue = ((Number) obj2).floatValue();
        j4 j4Var = new j4(this.Y, (cc.c) obj3);
        j4Var.X = floatValue;
        yb.y yVar = yb.y.f14813a;
        j4Var.v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        ((mc.l) this.Y.getValue()).k(new Float(this.X));
        return yb.y.f14813a;
    }
}
