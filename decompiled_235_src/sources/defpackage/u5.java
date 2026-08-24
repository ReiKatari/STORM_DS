package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u5  reason: default package */
/* loaded from: classes.dex */
public final class u5 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;

    public /* synthetic */ u5(int i, List list) {
        this.A = i;
        this.B = list;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        List list = this.B;
        int i4 = 16;
        int i5 = 2;
        switch (i3) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var).f(lp3Var)) {
                        i5 = 4;
                    }
                    i = intValue2 | i5;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var).d(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    xq2Var.b0(1082903077);
                    nc1.n(dj6.c(x64.a, 1.0f), (za5) ((ArrayList) list).get(intValue), xq2Var, 6);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var2 = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var2)) {
                        i5 = 4;
                    }
                    i2 = intValue4 | i5;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i2 & 1, z2)) {
                    v3 v3Var = (v3) list.get(intValue3);
                    xq2Var2.b0(-783345912);
                    if (v3Var instanceof k3) {
                        xq2Var2.b0(-2103478174);
                        hi2.i((k3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof l3) {
                        xq2Var2.b0(-2103475996);
                        lb4.a((l3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof o3) {
                        xq2Var2.b0(-2103473277);
                        ii2.j((o3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof p3) {
                        xq2Var2.b0(-2103470391);
                        hi2.d((p3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof r3) {
                        xq2Var2.b0(-2103467187);
                        kj2.a((r3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof q3) {
                        xq2Var2.b0(-2103463957);
                        oi2.b((q3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof m3) {
                        xq2Var2.b0(-2103461120);
                        jw2.c((m3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else if (v3Var instanceof u3) {
                        xq2Var2.b0(-2103458294);
                        hi2.j((u3) v3Var, xq2Var2, 0);
                        xq2Var2.p(false);
                    } else {
                        throw xg6.f(xq2Var2, -2103479205, false);
                    }
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
