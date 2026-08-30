package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends ec.j implements mc.q {
    public int X;
    public /* synthetic */ h1.r1 Y;
    public /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ zc.u f13285b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f13286c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ j1.i f13287d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(zc.u uVar, n2.w0 w0Var, j1.i iVar, cc.c cVar) {
        super(3, cVar);
        this.f13285b0 = uVar;
        this.f13286c0 = w0Var;
        this.f13287d0 = iVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j2 = ((h3.b) obj2).f6050a;
        n2.w0 w0Var = this.f13286c0;
        j1.i iVar = this.f13287d0;
        b1 b1Var = new b1(this.f13285b0, w0Var, iVar, (cc.c) obj3);
        b1Var.Y = (h1.r1) obj;
        b1Var.Z = j2;
        return b1Var.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        zc.u uVar = this.f13285b0;
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
            zc.x.v(uVar, null, null, new a2.j(this.f13286c0, this.Z, this.f13287d0, (cc.c) null, 8), 3);
            this.X = 1;
            obj = r1Var.h(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zc.x.v(uVar, null, null, new bi.v(this.f13286c0, ((Boolean) obj).booleanValue(), this.f13287d0, null), 3);
        return yb.y.f14813a;
    }
}
