package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cp6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cp6 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ cp6(long j, ds6 ds6Var, aj2 aj2Var, int i, int i2) {
        this.B = j;
        this.X = ds6Var;
        this.Y = aj2Var;
        this.L = i;
        this.R = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.L;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                jk2.c(this.B, (ds6) obj4, (aj2) obj3, (tu0) obj, I, this.R);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                f34.g((String) obj4, (zy3) obj3, this.B, (tu0) obj, I2, this.R);
                return o27Var;
        }
    }

    public /* synthetic */ cp6(String str, zy3 zy3Var, long j, int i, int i2) {
        this.X = str;
        this.Y = zy3Var;
        this.B = j;
        this.L = i;
        this.R = i2;
    }
}
