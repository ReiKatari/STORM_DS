package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v4 extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ d1.c Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ d1.v1 f5436b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(d1.c cVar, boolean z10, d1.v1 v1Var, cc.c cVar2) {
        super(2, cVar2);
        this.Y = cVar;
        this.Z = z10;
        this.f5436b0 = v1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((v4) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new v4(this.Y, this.Z, this.f5436b0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        float f8;
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
            if (this.Z) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            Float f10 = new Float(f8);
            this.X = 1;
            if (d1.c.d(this.Y, f10, this.f5436b0, null, this, 12) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
