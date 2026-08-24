package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj6  reason: default package */
/* loaded from: classes.dex */
public final class aj6 extends aj3 implements qn2 {
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ g34 X;
    public final /* synthetic */ dx4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj6(bj6 bj6Var, long j, int i, int i2, g34 g34Var, dx4 dx4Var) {
        super(1);
        this.B = j;
        this.L = i;
        this.R = i2;
        this.X = g34Var;
        this.Y = dx4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        cx4 cx4Var = (cx4) obj;
        long j = (this.L << 32) | (this.R & 4294967295L);
        kk3 layoutDirection = this.X.getLayoutDirection();
        long j2 = this.B;
        float f2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f3 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        if (layoutDirection == kk3.Ltr) {
            f = -1.0f;
        } else {
            f = (-1.0f) * (-1.0f);
        }
        float f4 = (1.0f - 1.0f) * f3;
        int round = Math.round((f + 1.0f) * f2);
        cx4.k(cx4Var, this.Y, (Math.round(f4) & 4294967295L) | (round << 32));
        return jg7.a;
    }
}
