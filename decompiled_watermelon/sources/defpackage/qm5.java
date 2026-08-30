package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qm5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qm5 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ float B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ zy3 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ qm5(float f, ki2 ki2Var, ki2 ki2Var2, zy3 zy3Var, int i) {
        this.B = f;
        this.L = ki2Var;
        this.Y = ki2Var2;
        this.R = zy3Var;
        this.X = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.X;
        Object obj3 = this.Y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                f34.h(this.B, this.L, this.R, (wc2) obj3, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                f34.m(this.B, this.L, (ki2) obj3, this.R, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ qm5(float f, ki2 ki2Var, zy3 zy3Var, wc2 wc2Var, int i) {
        this.B = f;
        this.L = ki2Var;
        this.R = zy3Var;
        this.Y = wc2Var;
        this.X = i;
    }
}
