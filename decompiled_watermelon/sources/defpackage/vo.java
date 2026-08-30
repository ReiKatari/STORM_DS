package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vo implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ vo(int i, ej3 ej3Var, Object obj) {
        this.A = 7;
        this.L = ej3Var;
        this.B = i;
        this.R = obj;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        int i2 = this.B;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                xo.a((to) obj4, (List) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 1:
                ((Integer) obj2).intValue();
                dt3.j((zy3) obj4, (mi2) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                ((et0) obj4).b(obj3, (tu0) obj, ep2.I(i2) | 1);
                return o27Var;
            case 3:
                ((Integer) obj2).intValue();
                dk7.a((dq) obj4, (aj2) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 4:
                ((Integer) obj2).getClass();
                dk7.b((dq[]) obj4, (aj2) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 5:
                ((Integer) obj2).getClass();
                hi2.a((ki2) obj4, (et0) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case ig7.b /* 6 */:
                ((Integer) obj2).getClass();
                ((rh3) obj4).b(i2, obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 7:
                ej3 ej3Var = (ej3) obj4;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    ej3Var.b(i2, obj3, sk2Var, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 8:
                ((Integer) obj2).getClass();
                ((fk3) obj4).b(i2, obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 9:
                ((Integer) obj2).getClass();
                ((xh4) obj4).b(i2, obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            case 10:
                ((Integer) obj2).intValue();
                l07.g((zy3) obj4, (aj2) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 11:
                ((Integer) obj2).getClass();
                nl2.d((p96) obj4, (zy3) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case mj2.L /* 12 */:
                ((Integer) obj2).getClass();
                ir6.a((ds6) obj4, (et0) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            case 13:
                ((Integer) obj2).intValue();
                ((kx6) obj4).a(obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                oo2.n((String) obj4, (zy3) obj3, (tu0) obj, ep2.I(i2 | 1));
                return o27Var;
        }
    }

    public /* synthetic */ vo(int i, int i2, Object obj, Object obj2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = i;
    }

    public /* synthetic */ vo(ej3 ej3Var, int i, Object obj, int i2, int i3) {
        this.A = i3;
        this.L = ej3Var;
        this.B = i;
        this.R = obj;
    }
}
