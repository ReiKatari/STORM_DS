package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f61 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zy3 B;
    public final /* synthetic */ ih4 L;
    public final /* synthetic */ List R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ aj2 Y;
    public final /* synthetic */ aj2 Z;
    public final /* synthetic */ mi2 c0;
    public final /* synthetic */ int d0;

    public /* synthetic */ f61(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, aj2 aj2Var, aj2 aj2Var2, mi2 mi2Var2, int i, int i2) {
        this.A = i2;
        this.B = zy3Var;
        this.L = ih4Var;
        this.R = list;
        this.X = mi2Var;
        this.Y = aj2Var;
        this.Z = aj2Var2;
        this.c0 = mi2Var2;
        this.d0 = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.d0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ep2.I(i2 | 1);
                b53.t(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).intValue();
                int I2 = ep2.I(i2 | 1);
                b53.k(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj, I2);
                return o27Var;
        }
    }
}
