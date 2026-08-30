package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n4 extends ec.j implements mc.q {
    public int X;
    public /* synthetic */ h1.r1 Y;
    public /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ boolean f5304b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ float f5305c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f5306d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ n2.s2 f5307e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(boolean z10, float f8, n2.w0 w0Var, n2.s2 s2Var, cc.c cVar) {
        super(3, cVar);
        this.f5304b0 = z10;
        this.f5305c0 = f8;
        this.f5306d0 = w0Var;
        this.f5307e0 = s2Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j2 = ((h3.b) obj2).f6050a;
        n2.w0 w0Var = this.f5306d0;
        n2.s2 s2Var = this.f5307e0;
        n4 n4Var = new n4(this.f5304b0, this.f5305c0, w0Var, s2Var, (cc.c) obj3);
        n4Var.Y = (h1.r1) obj;
        n4Var.Z = j2;
        return n4Var.v(yb.y.f14813a);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        float intBitsToFloat;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        n2.w0 w0Var = this.f5306d0;
        try {
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
                if (this.f5304b0) {
                    intBitsToFloat = this.f5305c0 - Float.intBitsToFloat((int) (j2 >> 32));
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                }
                w0Var.setValue(new Float(intBitsToFloat - ((Number) this.f5307e0.getValue()).floatValue()));
                this.X = 1;
                if (r1Var.a(this) == aVar) {
                    return aVar;
                }
            }
        } catch (h1.t0 unused) {
            w0Var.setValue(new Float(0.0f));
        }
        return yb.y.f14813a;
    }
}
