package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l76  reason: default package */
/* loaded from: classes.dex */
public final class l76 extends ic3 implements mi2 {
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ vv3 X;
    public final /* synthetic */ yn4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l76(m76 m76Var, long j, int i, int i2, vv3 vv3Var, yn4 yn4Var) {
        super(1);
        this.B = j;
        this.L = i;
        this.R = i2;
        this.X = vv3Var;
        this.Y = yn4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        xn4 xn4Var = (xn4) obj;
        long j = (this.L << 32) | (this.R & 4294967295L);
        sd3 layoutDirection = this.X.getLayoutDirection();
        long j2 = this.B;
        float f2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f3 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        if (layoutDirection == sd3.Ltr) {
            f = -1.0f;
        } else {
            f = (-1.0f) * (-1.0f);
        }
        float f4 = (1.0f - 1.0f) * f3;
        int round = Math.round((f + 1.0f) * f2);
        xn4.l(xn4Var, this.Y, (Math.round(f4) & 4294967295L) | (round << 32));
        return o27.a;
    }
}
