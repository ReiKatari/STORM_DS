package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lz1  reason: default package */
/* loaded from: classes.dex */
public final class lz1 implements cj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ Object L;

    public /* synthetic */ lz1(List list, Object obj, int i) {
        this.A = i;
        this.B = list;
        this.L = obj;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13 = this.A;
        o27 o27Var = o27.a;
        Object obj5 = this.L;
        sn1 sn1Var = su0.a;
        wy3 wy3Var = wy3.a;
        List list = this.B;
        switch (i13) {
            case 0:
                ni3 ni3Var = (ni3) obj;
                int intValue = ((Number) obj2).intValue();
                tu0 tu0Var = (tu0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                mi2 mi2Var = (mi2) obj5;
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var).f(ni3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((sk2) tu0Var).d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(i & 1, z)) {
                    ul0 ul0Var = (ul0) list.get(intValue);
                    sk2Var.X(1158729181);
                    zy3 c = o76.c(wy3Var, 1.0f);
                    boolean f = sk2Var.f(mi2Var) | sk2Var.f(ul0Var);
                    Object L = sk2Var.L();
                    if (f || L == sn1Var) {
                        L = new j5(4, mi2Var, ul0Var);
                        sk2Var.h0(L);
                    }
                    dt3.n(c, ul0Var, (ki2) L, sk2Var, 6);
                    sk2Var.p(false);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ni3 ni3Var2 = (ni3) obj;
                int intValue3 = ((Number) obj2).intValue();
                tu0 tu0Var2 = (tu0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                mi2 mi2Var2 = (mi2) obj5;
                if ((intValue4 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ni3Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((sk2) tu0Var2).d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(i4 & 1, z2)) {
                    sk0 sk0Var = (sk0) list.get(intValue3);
                    sk2Var2.X(-476599689);
                    zy3 c2 = o76.c(wy3Var, 1.0f);
                    boolean f2 = sk2Var2.f(mi2Var2) | sk2Var2.h(sk0Var);
                    Object L2 = sk2Var2.L();
                    if (f2 || L2 == sn1Var) {
                        L2 = new j5(5, mi2Var2, sk0Var);
                        sk2Var2.h0(L2);
                    }
                    ji7.a(c2, sk0Var, (ki2) L2, sk2Var2, 6);
                    sk2Var2.p(false);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                ni3 ni3Var3 = (ni3) obj;
                int intValue5 = ((Number) obj2).intValue();
                tu0 tu0Var3 = (tu0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                mi2 mi2Var3 = (mi2) obj5;
                if ((intValue6 & 6) == 0) {
                    if (((sk2) tu0Var3).f(ni3Var3)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue6 | i9;
                } else {
                    i7 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((sk2) tu0Var3).d(intValue5)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(i7 & 1, z3)) {
                    yj2 yj2Var = (yj2) list.get(intValue5);
                    sk2Var3.X(-196696351);
                    zy3 c3 = o76.c(wy3Var, 1.0f);
                    boolean f3 = sk2Var3.f(mi2Var3) | sk2Var3.h(yj2Var);
                    Object L3 = sk2Var3.L();
                    if (f3 || L3 == sn1Var) {
                        L3 = new j5(6, mi2Var3, yj2Var);
                        sk2Var3.h0(L3);
                    }
                    gk2.f(c3, yj2Var, (ki2) L3, sk2Var3, 6);
                    sk2Var3.p(false);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            default:
                ni3 ni3Var4 = (ni3) obj;
                int intValue7 = ((Number) obj2).intValue();
                tu0 tu0Var4 = (tu0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (((sk2) tu0Var4).f(ni3Var4)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = intValue8 | i12;
                } else {
                    i10 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (((sk2) tu0Var4).d(intValue7)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(i10 & 1, z4)) {
                    j15 j15Var = (j15) list.get(intValue7);
                    sk2Var4.X(-822009669);
                    zy3 c4 = o76.c(wy3Var, 1.0f);
                    boolean h = sk2Var4.h(j15Var);
                    Object L4 = sk2Var4.L();
                    if (h || L4 == sn1Var) {
                        L4 = new j5(1, j15Var, (k24) obj5);
                        sk2Var4.h0(L4);
                    }
                    n40.u(c4, j15Var, (ki2) L4, sk2Var4, 6);
                    sk2Var4.p(false);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
        }
    }
}
