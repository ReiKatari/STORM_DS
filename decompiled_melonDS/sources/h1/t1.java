package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ d1.j f6009b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ nc.q f6010c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(float f8, d1.j jVar, nc.q qVar, cc.c cVar) {
        super(2, cVar);
        this.Z = f8;
        this.f6009b0 = jVar;
        this.f6010c0 = qVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((t1) t((cc.c) obj2, (u1) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        t1 t1Var = new t1(this.Z, this.f6009b0, this.f6010c0, cVar);
        t1Var.Y = obj;
        return t1Var;
    }

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
            ai.r0 r0Var = new ai.r0(13, this.f6010c0, (u1) this.Y);
            this.X = 1;
            if (d1.d.e(0.0f, this.Z, 0.0f, this.f6009b0, r0Var, this, 4) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
