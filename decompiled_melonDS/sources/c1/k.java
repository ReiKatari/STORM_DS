package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends nc.l implements mc.p {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ d1.q1 L;
    public final /* synthetic */ mc.l R;
    public final /* synthetic */ b3.p X;
    public final /* synthetic */ v2.c Y;
    public final /* synthetic */ int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2450b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f2451c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d1.q1 q1Var, b3.p pVar, mc.l lVar, b3.d dVar, mc.l lVar2, v2.c cVar, int i2) {
        super(2);
        this.L = q1Var;
        this.X = pVar;
        this.R = lVar;
        this.f2451c0 = dVar;
        this.f2450b0 = lVar2;
        this.Y = cVar;
        this.Z = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                ((Number) obj2).intValue();
                b3.d dVar = (b3.d) this.f2451c0;
                mc.l lVar = (mc.l) this.f2450b0;
                m.a(this.L, this.X, this.R, dVar, lVar, this.Y, (n2.m) obj, n2.s.F(this.Z | 1));
                return yb.y.f14813a;
            default:
                ((Number) obj2).intValue();
                c1 c1Var = (c1) this.f2450b0;
                d1 d1Var = (d1) this.f2451c0;
                e0.f(this.L, this.R, this.X, c1Var, d1Var, this.Y, (n2.m) obj, n2.s.F(this.Z | 1));
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d1.q1 q1Var, mc.l lVar, b3.p pVar, c1 c1Var, d1 d1Var, v2.c cVar, int i2) {
        super(2);
        this.L = q1Var;
        this.R = lVar;
        this.X = pVar;
        this.f2450b0 = c1Var;
        this.f2451c0 = d1Var;
        this.Y = cVar;
        this.Z = i2;
    }
}
