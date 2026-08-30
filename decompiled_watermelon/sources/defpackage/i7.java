package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ i7(f03 f03Var, boolean z, ki2 ki2Var, ki2 ki2Var2, int i) {
        this.R = f03Var;
        this.B = z;
        this.L = ki2Var;
        this.X = ki2Var2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.X;
        Object obj4 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(1);
                b53.p((zy3) obj4, (c6) obj3, this.B, this.L, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(1);
                q13.a((f03) obj4, this.B, this.L, (ki2) obj3, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ i7(zy3 zy3Var, c6 c6Var, boolean z, ki2 ki2Var, int i) {
        this.R = zy3Var;
        this.X = c6Var;
        this.B = z;
        this.L = ki2Var;
    }
}
