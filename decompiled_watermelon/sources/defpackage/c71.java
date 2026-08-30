package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c71  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c71 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ a71 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ mi2 R;
    public final /* synthetic */ aj2 X;
    public final /* synthetic */ int Y;

    public /* synthetic */ c71(a71 a71Var, ki2 ki2Var, mi2 mi2Var, aj2 aj2Var, int i, int i2) {
        this.A = i2;
        this.B = a71Var;
        this.L = ki2Var;
        this.R = mi2Var;
        this.X = aj2Var;
        this.Y = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ep2.I(i2 | 1);
                n40.n(this.B, this.L, this.R, this.X, (tu0) obj, I);
                return o27Var;
            case 1:
                ((Integer) obj2).intValue();
                int I2 = ep2.I(i2 | 1);
                n40.q(this.B, this.L, this.R, this.X, (tu0) obj, I2);
                return o27Var;
            default:
                ((Integer) obj2).intValue();
                int I3 = ep2.I(i2 | 1);
                n40.y(this.B, this.L, this.R, this.X, (tu0) obj, I3);
                return o27Var;
        }
    }
}
