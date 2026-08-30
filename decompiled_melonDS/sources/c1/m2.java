package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m2 extends nc.l implements mc.l {
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ y3.x0 X;
    public final /* synthetic */ y3.i1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 n2Var, long j2, int i2, int i10, y3.x0 x0Var, y3.i1 i1Var) {
        super(1);
        this.B = j2;
        this.L = i2;
        this.R = i10;
        this.X = x0Var;
        this.Y = i1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        float f8;
        y3.h1 h1Var = (y3.h1) obj;
        long j2 = (this.L << 32) | (this.R & 4294967295L);
        x4.m layoutDirection = this.X.getLayoutDirection();
        long j10 = this.B;
        float f10 = (((int) (j2 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j2 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        if (layoutDirection == x4.m.Ltr) {
            f8 = -1.0f;
        } else {
            f8 = (-1) * (-1.0f);
        }
        float f12 = 1;
        float f13 = (f12 - 1.0f) * f11;
        y3.h1.l(h1Var, this.Y, (Math.round(f13) & 4294967295L) | (Math.round((f8 + f12) * f10) << 32));
        return yb.y.f14813a;
    }
}
