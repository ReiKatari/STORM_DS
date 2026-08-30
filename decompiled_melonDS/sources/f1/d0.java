package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ec.j implements mc.q {
    public int X;
    public /* synthetic */ h1.r1 Y;
    public /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ e0 f4530b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, cc.c cVar) {
        super(3, cVar);
        this.f4530b0 = e0Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j2 = ((h3.b) obj2).f6050a;
        d0 d0Var = new d0(this.f4530b0, (cc.c) obj3);
        d0Var.Y = (h1.r1) obj;
        d0Var.Z = j2;
        return d0Var.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object obj2;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        yb.y yVar = yb.y.f14813a;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            h1.r1 r1Var = this.Y;
            long j2 = this.Z;
            e0 e0Var = this.f4530b0;
            if (e0Var.p0) {
                this.X = 1;
                j1.i iVar = e0Var.f4547k0;
                if (iVar == null || (obj2 = zc.x.g(new c(r1Var, j2, iVar, e0Var, null), this)) != aVar) {
                    obj2 = yVar;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
        }
        return yVar;
    }
}
