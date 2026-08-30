package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mc.p {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ mc.a B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ yb.d f5376b0;

    public /* synthetic */ r(String str, mc.a aVar, v2.c cVar, mc.p pVar, boolean z10, int i2, int i10) {
        this.Y = str;
        this.B = aVar;
        this.Z = cVar;
        this.f5376b0 = pVar;
        this.L = z10;
        this.R = i2;
        this.X = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.R | 1);
                mc.a aVar = this.B;
                boolean z10 = this.L;
                s.b(aVar, (b3.p) this.Y, z10, (l1.d1) this.Z, (mc.q) this.f5376b0, (n2.m) obj, F, this.X);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.R | 1);
                mc.a aVar2 = this.B;
                p7.l.a((String) this.Y, aVar2, (v2.c) this.Z, (mc.p) this.f5376b0, this.L, (n2.m) obj, F2, this.X);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ r(mc.a aVar, b3.p pVar, boolean z10, l1.d1 d1Var, mc.q qVar, int i2, int i10) {
        this.B = aVar;
        this.Y = pVar;
        this.L = z10;
        this.Z = d1Var;
        this.f5376b0 = qVar;
        this.R = i2;
        this.X = i10;
    }
}
