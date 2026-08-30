package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends nc.l implements mc.p {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ b3.p L;
    public final /* synthetic */ c1 R;
    public final /* synthetic */ d1 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ v2.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f2382b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z10, b3.p pVar, c1 c1Var, d1 d1Var, String str, v2.c cVar, int i2, int i10) {
        super(2);
        this.B = z10;
        this.L = pVar;
        this.R = c1Var;
        this.X = d1Var;
        this.Y = str;
        this.Z = cVar;
        this.f2382b0 = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int F = n2.s.F(1572871);
        int i2 = this.f2382b0;
        e0.e(this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F, i2);
        return yb.y.f14813a;
    }
}
