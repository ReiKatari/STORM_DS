package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 extends ec.j implements mc.l {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ x0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f3661b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ q1 f3662c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, Object obj, q1 q1Var, cc.c cVar) {
        super(1, cVar);
        this.Z = x0Var;
        this.f3661b0 = obj;
        this.f3662c0 = q1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        cc.c cVar = (cc.c) obj;
        switch (this.X) {
            case 0:
                return new r0(this.f3662c0, this.Z, this.f3661b0, cVar).v(yb.y.f14813a);
            default:
                return new r0(this.Z, this.f3661b0, this.f3662c0, cVar).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        float f8;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                q1 q1Var = this.f3662c0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    b7.z zVar = new b7.z(this.Z, this.f3661b0, q1Var, (cc.c) null);
                    this.Y = 1;
                    if (zc.x.g(zVar, this) == aVar) {
                        return aVar;
                    }
                }
                q1Var.i();
                return yb.y.f14813a;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                q1 q1Var2 = this.f3662c0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    x0 x0Var = this.Z;
                    x0Var.o();
                    n2.f1 f1Var = x0Var.f3694b;
                    x0Var.f3704l = Long.MIN_VALUE;
                    x0Var.s(0.0f);
                    Object value = x0Var.f3695c.getValue();
                    Object obj2 = this.f3661b0;
                    if (obj2.equals(value)) {
                        f8 = -4.0f;
                    } else if (obj2.equals(f1Var.getValue())) {
                        f8 = -5.0f;
                    } else {
                        f8 = -3.0f;
                    }
                    q1Var2.p(obj2);
                    q1Var2.n(0L);
                    f1Var.setValue(obj2);
                    x0Var.s(0.0f);
                    x0Var.g(obj2);
                    q1Var2.j(f8);
                    if (f8 == -3.0f) {
                        this.Y = 1;
                        if (x0.m(x0Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                q1Var2.i();
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q1 q1Var, x0 x0Var, Object obj, cc.c cVar) {
        super(1, cVar);
        this.f3662c0 = q1Var;
        this.Z = x0Var;
        this.f3661b0 = obj;
    }
}
