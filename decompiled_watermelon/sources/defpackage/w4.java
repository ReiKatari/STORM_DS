package defpackage;

import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements aj2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ mi2 R;
    public final /* synthetic */ ki2 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ wi2 d0;
    public final /* synthetic */ wi2 e0;

    public /* synthetic */ w4(zy3 zy3Var, pp5 pp5Var, aj2 aj2Var, mi2 mi2Var, aj2 aj2Var2, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var2, int i) {
        this.Z = zy3Var;
        this.c0 = pp5Var;
        this.d0 = aj2Var;
        this.B = mi2Var;
        this.e0 = aj2Var2;
        this.L = ki2Var;
        this.X = ki2Var2;
        this.R = mi2Var2;
        this.Y = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.Y;
        wi2 wi2Var = this.e0;
        wi2 wi2Var2 = this.d0;
        Object obj3 = this.c0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                n40.a((zy3) obj4, (pp5) obj3, (aj2) wi2Var2, this.B, (aj2) wi2Var, this.L, this.X, this.R, (tu0) obj, I);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                nl2.g((List) obj4, (UUID) obj3, this.B, this.L, this.R, (mi2) wi2Var2, (mi2) wi2Var, this.X, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ w4(List list, UUID uuid, mi2 mi2Var, ki2 ki2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, ki2 ki2Var2, int i) {
        this.Z = list;
        this.c0 = uuid;
        this.B = mi2Var;
        this.L = ki2Var;
        this.R = mi2Var2;
        this.d0 = mi2Var3;
        this.e0 = mi2Var4;
        this.X = ki2Var2;
        this.Y = i;
    }
}
