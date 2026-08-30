package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u5  reason: default package */
/* loaded from: classes.dex */
public final class u5 implements cj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;

    public /* synthetic */ u5(int i, List list) {
        this.A = i;
        this.B = list;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3 = this.A;
        o27 o27Var = o27.a;
        List list = this.B;
        int i4 = 16;
        int i5 = 2;
        switch (i3) {
            case 0:
                ni3 ni3Var = (ni3) obj;
                int intValue = ((Number) obj2).intValue();
                tu0 tu0Var = (tu0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var).f(ni3Var)) {
                        i5 = 4;
                    }
                    i = intValue2 | i5;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((sk2) tu0Var).d(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(i & 1, z)) {
                    sk2Var.X(1082903077);
                    n40.s(o76.c(wy3.a, 1.0f), (p15) ((ArrayList) list).get(intValue), sk2Var, 6);
                    sk2Var.p(false);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                ni3 ni3Var2 = (ni3) obj;
                int intValue3 = ((Number) obj2).intValue();
                tu0 tu0Var2 = (tu0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ni3Var2)) {
                        i5 = 4;
                    }
                    i2 = intValue4 | i5;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((sk2) tu0Var2).d(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(i2 & 1, z2)) {
                    t3 t3Var = (t3) list.get(intValue3);
                    sk2Var2.X(-783345912);
                    if (t3Var instanceof i3) {
                        sk2Var2.X(-2103478174);
                        oo2.i((i3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof j3) {
                        sk2Var2.X(-2103475996);
                        iq2.a((j3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof m3) {
                        sk2Var2.X(-2103473277);
                        me2.a((m3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof n3) {
                        sk2Var2.X(-2103470391);
                        ep2.c((n3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof p3) {
                        sk2Var2.X(-2103467187);
                        cg2.e((p3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof o3) {
                        sk2Var2.X(-2103463957);
                        ve2.d((o3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof k3) {
                        sk2Var2.X(-2103461120);
                        se.b((k3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else if (t3Var instanceof s3) {
                        sk2Var2.X(-2103458294);
                        cg2.j((s3) t3Var, sk2Var2, 0);
                        sk2Var2.p(false);
                    } else {
                        throw ej6.d(sk2Var2, -2103479205, false);
                    }
                    sk2Var2.p(false);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
