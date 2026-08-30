package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lx0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lx0 implements aj2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ lx0(String str, boolean z, boolean z2, ki2 ki2Var, int i, int i2) {
        this.Y = str;
        this.B = z;
        this.L = z2;
        this.Z = ki2Var;
        this.R = i;
        this.X = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.R;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                n40.h((String) obj4, this.B, this.L, (ki2) obj3, (tu0) obj, I, this.X);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                oo2.o(this.B, (mi2) obj4, (zy3) obj3, this.L, (tu0) obj, I2, this.X);
                return o27Var;
        }
    }

    public /* synthetic */ lx0(boolean z, mi2 mi2Var, zy3 zy3Var, boolean z2, int i, int i2) {
        this.B = z;
        this.Y = mi2Var;
        this.Z = zy3Var;
        this.L = z2;
        this.R = i;
        this.X = i2;
    }
}
