package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f3673b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ x0 f3674c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ q1 f3675d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ float f3676e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Object obj, Object obj2, x0 x0Var, q1 q1Var, float f8, cc.c cVar) {
        super(2, cVar);
        this.Z = obj;
        this.f3673b0 = obj2;
        this.f3674c0 = x0Var;
        this.f3675d0 = q1Var;
        this.f3676e0 = f8;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((t0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        t0 t0Var = new t0(this.Z, this.f3673b0, this.f3674c0, this.f3675d0, this.f3676e0, cVar);
        t0Var.Y = obj;
        return t0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        x0 x0Var = this.f3674c0;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            zc.u uVar = (zc.u) this.Y;
            Object obj2 = this.Z;
            Object obj3 = this.f3673b0;
            if (!nc.k.a(obj2, obj3)) {
                x0.j(x0Var);
            } else {
                x0Var.f3705n = null;
                if (nc.k.a(x0Var.f3695c.getValue(), obj2)) {
                    return yVar;
                }
            }
            boolean a10 = nc.k.a(obj2, obj3);
            float f8 = this.f3676e0;
            if (!a10) {
                q1 q1Var = this.f3675d0;
                q1Var.p(obj2);
                q1Var.n(0L);
                x0Var.f3694b.setValue(obj2);
                q1Var.j(f8);
            }
            x0Var.s(f8);
            if (x0Var.m.i()) {
                zc.x.v(uVar, null, null, new a9.b(6, null, x0Var), 3);
            } else {
                x0Var.f3704l = Long.MIN_VALUE;
            }
            this.X = 1;
            if (x0.m(x0Var, this) == aVar) {
                return aVar;
            }
        }
        x0Var.r();
        return yVar;
    }
}
