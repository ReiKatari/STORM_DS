package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ b3.p L;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ f0(boolean z10, b3.p pVar, boolean z11, Object obj, int i2, int i10) {
        this.A = i10;
        this.B = z10;
        this.L = pVar;
        this.R = z11;
        this.Y = obj;
        this.X = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.X | 1);
                boolean z10 = this.B;
                b3.p pVar = this.L;
                boolean z11 = this.R;
                k0.a(z10, pVar, z11, (x0) this.Y, (n2.m) obj, F);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.X | 1);
                boolean z12 = this.B;
                b3.p pVar2 = this.L;
                boolean z13 = this.R;
                p5.a(z12, pVar2, z13, (c1) this.Y, (n2.m) obj, F2);
                break;
        }
        return yb.y.f14813a;
    }
}
