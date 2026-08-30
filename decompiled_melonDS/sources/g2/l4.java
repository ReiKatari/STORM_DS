package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l4 extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ float f5245b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ float f5246c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(float f8, float f10, float f11, cc.c cVar) {
        super(2, cVar);
        this.Z = f8;
        this.f5245b0 = f10;
        this.f5246c0 = f11;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((l4) t((cc.c) obj2, (m) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        l4 l4Var = new l4(this.Z, this.f5245b0, this.f5246c0, cVar);
        l4Var.Y = obj;
        return l4Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nc.q] */
    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            ?? obj2 = new Object();
            float f8 = this.Z;
            obj2.A = f8;
            d1.c a10 = d1.d.a(f8);
            Float f10 = new Float(this.f5245b0);
            d1.v1 v1Var = p4.f5346g;
            Float f11 = new Float(this.f5246c0);
            a7.l lVar = new a7.l(22, (m) this.Y, obj2);
            this.X = 1;
            if (a10.c(f10, v1Var, f11, lVar, this) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
