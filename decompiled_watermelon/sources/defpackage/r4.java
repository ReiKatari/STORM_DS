package defpackage;

import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ r4(kx6 kx6Var, gx6 gx6Var, Object obj, Object obj2, y72 y72Var, int i) {
        this.A = 4;
        this.R = kx6Var;
        this.Y = gx6Var;
        this.X = obj;
        this.Z = obj2;
        this.B = y72Var;
        this.L = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        Object obj3 = this.X;
        Object obj4 = this.Z;
        Object obj5 = this.B;
        Object obj6 = this.Y;
        o27 o27Var = o27.a;
        int i2 = this.L;
        Object obj7 = this.R;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                n40.i((List) obj7, this.X, (mi2) obj6, (bj2) obj4, (zy3) obj5, (tu0) obj, I);
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                jv3.e((zy3) obj5, (Cheat) obj7, (ki2) obj3, (ki2) obj6, (ki2) obj4, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                ((et0) obj7).l(this.X, this.Y, this.Z, this.B, (tu0) obj, ep2.I(i2) | 1);
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                wg7.b((zy3) obj5, (nt) obj7, (qt) obj3, (sb2) obj6, (et0) obj4, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                a53.i((kx6) obj7, (gx6) obj6, this.X, this.Z, (y72) obj5, (tu0) obj, I2);
                return o27Var;
        }
    }

    public /* synthetic */ r4(zy3 zy3Var, Object obj, Object obj2, Object obj3, wi2 wi2Var, int i, int i2) {
        this.A = i2;
        this.B = zy3Var;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = wi2Var;
        this.L = i;
    }

    public /* synthetic */ r4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A = i2;
        this.R = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.B = obj5;
        this.L = i;
    }
}
