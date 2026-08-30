package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends ec.j implements mc.l {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ x0 f3679b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ q1 f3680c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ float f3681d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Object obj, Object obj2, x0 x0Var, q1 q1Var, float f8, cc.c cVar) {
        super(1, cVar);
        this.Y = obj;
        this.Z = obj2;
        this.f3679b0 = x0Var;
        this.f3680c0 = q1Var;
        this.f3681d0 = f8;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        q1 q1Var = this.f3680c0;
        float f8 = this.f3681d0;
        return new u0(this.Y, this.Z, this.f3679b0, q1Var, f8, (cc.c) obj).v(yb.y.f14813a);
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
            t0 t0Var = new t0(this.Y, this.Z, this.f3679b0, this.f3680c0, this.f3681d0, null);
            this.X = 1;
            if (zc.x.g(t0Var, this) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
