package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ long L;
    public final /* synthetic */ long R;
    public final /* synthetic */ float X;
    public final /* synthetic */ v2.c Y;
    public final /* synthetic */ int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f5455b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f5456c0;

    public /* synthetic */ x(long j2, long j10, float f8, l1.d1 d1Var, l1.b2 b2Var, b3.p pVar, v2.c cVar, int i2) {
        this.L = j2;
        this.R = j10;
        this.X = f8;
        this.f5455b0 = d1Var;
        this.f5456c0 = b2Var;
        this.B = pVar;
        this.Y = cVar;
        this.Z = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.Z | 1);
                long j2 = this.L;
                long j10 = this.R;
                float f8 = this.X;
                a0.a(j2, j10, f8, (l1.d1) this.f5455b0, (l1.b2) this.f5456c0, this.B, this.Y, (n2.m) obj, F);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.Z | 1);
                b3.p pVar = this.B;
                e5.b(pVar, (mc.p) this.f5455b0, (i3.n0) this.f5456c0, this.L, this.R, this.X, this.Y, (n2.m) obj, F2);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ x(b3.p pVar, mc.p pVar2, i3.n0 n0Var, long j2, long j10, float f8, v2.c cVar, int i2) {
        this.B = pVar;
        this.f5455b0 = pVar2;
        this.f5456c0 = n0Var;
        this.L = j2;
        this.R = j10;
        this.X = f8;
        this.Y = cVar;
        this.Z = i2;
    }
}
