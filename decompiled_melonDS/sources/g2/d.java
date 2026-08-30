package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ec.j implements mc.r {
    public int X;
    public /* synthetic */ k Y;
    public /* synthetic */ g2 Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f5087b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ n f5088c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ float f5089d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, float f8, cc.c cVar) {
        super(4, cVar);
        this.f5088c0 = nVar;
        this.f5089d0 = f8;
    }

    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f5088c0, this.f5089d0, (cc.c) obj4);
        dVar.Y = (k) obj;
        dVar.Z = (g2) obj2;
        dVar.f5087b0 = obj3;
        return dVar.v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nc.q] */
    @Override // ec.a
    public final Object v(Object obj) {
        float g10;
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
            k kVar = this.Y;
            float c4 = this.Z.c(this.f5087b0);
            if (!Float.isNaN(c4)) {
                ?? obj2 = new Object();
                n nVar = this.f5088c0;
                if (Float.isNaN(nVar.f5272j.g())) {
                    g10 = 0.0f;
                } else {
                    g10 = nVar.f5272j.g();
                }
                obj2.A = g10;
                d1.j jVar = nVar.f5265c;
                ai.r0 r0Var = new ai.r0(7, kVar, obj2);
                this.Y = null;
                this.Z = null;
                this.X = 1;
                if (d1.d.c(g10, c4, this.f5089d0, jVar, r0Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return yb.y.f14813a;
    }
}
