package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements aj2 {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    public /* synthetic */ v3(o31 o31Var, ri5 ri5Var, int i, int i2, ki3 ki3Var, pk3 pk3Var, za6 za6Var) {
        this.B = o31Var;
        this.X = ri5Var;
        this.L = i;
        this.R = i2;
        this.Y = ki3Var;
        this.Z = pk3Var;
        this.c0 = za6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        Object obj3 = this.X;
        o27 o27Var = o27.a;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(this.L | 1);
                pu.a((zy3) obj7, this.X, (os) obj6, (xq0) obj5, (bj2) obj4, (tu0) obj, I, this.R);
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(1573303);
                wg7.a((zy3) obj7, (nt) obj3, (qt) obj6, (i20) obj5, this.L, this.R, (et0) obj4, (tu0) obj, I2);
                return o27Var;
            default:
                int intValue = ((Integer) obj).intValue();
                ((Character) obj2).getClass();
                tq5.w((o31) obj7, null, null, new ni5((ri5) obj3, this.L, intValue, this.R, (ki3) obj6, (pk3) obj5, (za6) obj4, null), 3);
                return o27Var;
        }
    }

    public /* synthetic */ v3(zy3 zy3Var, nt ntVar, qt qtVar, i20 i20Var, int i, int i2, et0 et0Var, int i3) {
        this.B = zy3Var;
        this.X = ntVar;
        this.Y = qtVar;
        this.Z = i20Var;
        this.L = i;
        this.R = i2;
        this.c0 = et0Var;
    }

    public /* synthetic */ v3(zy3 zy3Var, Object obj, os osVar, xq0 xq0Var, bj2 bj2Var, int i, int i2) {
        this.B = zy3Var;
        this.X = obj;
        this.Y = osVar;
        this.Z = xq0Var;
        this.c0 = bj2Var;
        this.L = i;
        this.R = i2;
    }
}
