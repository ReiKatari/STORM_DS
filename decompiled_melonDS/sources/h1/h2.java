package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h2 extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ i2 Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ float f5910b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(i2 i2Var, float f8, float f10, cc.c cVar) {
        super(2, cVar);
        this.Y = i2Var;
        this.Z = f8;
        this.f5910b0 = f10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((h2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new h2(this.Y, this.Z, this.f5910b0, cVar);
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
            p2 p2Var = this.Y.H0;
            long floatToRawIntBits = Float.floatToRawIntBits(this.Z);
            this.X = 1;
            if (b2.a(p2Var, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(this.f5910b0) & 4294967295L), this) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }
}
