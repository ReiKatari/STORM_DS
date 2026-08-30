package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ mc.a B;
    public final /* synthetic */ b3.p L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ g0(k4.a aVar, mc.a aVar2, b3.p pVar, boolean z10, x0 x0Var, int i2) {
        this.Y = aVar;
        this.B = aVar2;
        this.L = pVar;
        this.R = z10;
        this.Z = x0Var;
        this.X = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.X | 1);
                mc.a aVar = this.B;
                b3.p pVar = this.L;
                boolean z10 = this.R;
                k0.c((k4.a) this.Y, aVar, pVar, z10, (x0) this.Z, (n2.m) obj, F);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.X | 1);
                mc.a aVar2 = this.B;
                b3.p pVar2 = this.L;
                boolean z11 = this.R;
                i2.b(aVar2, pVar2, z11, (l1.d1) this.Y, (mc.q) this.Z, (n2.m) obj, F2);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ g0(mc.a aVar, b3.p pVar, boolean z10, l1.d1 d1Var, mc.q qVar, int i2) {
        this.B = aVar;
        this.L = pVar;
        this.R = z10;
        this.Y = d1Var;
        this.Z = qVar;
        this.X = i2;
    }
}
