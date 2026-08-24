package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v73  reason: default package */
/* loaded from: classes.dex */
public final class v73 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ b63 L;
    public final /* synthetic */ qn2 R;
    public final /* synthetic */ qn2 X;

    public /* synthetic */ v73(List list, b63 b63Var, qn2 qn2Var, qn2 qn2Var2, int i) {
        this.A = i;
        this.B = list;
        this.L = b63Var;
        this.R = qn2Var;
        this.X = qn2Var2;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5 = this.A;
        jg7 jg7Var = jg7.a;
        b63 b63Var = this.L;
        List list = this.B;
        int i6 = 2;
        qn2 qn2Var = this.R;
        Object obj5 = ox0.a;
        qn2 qn2Var2 = this.X;
        switch (i5) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var).f(lp3Var)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var).d(intValue)) {
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
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    i63 i63Var = (i63) list.get(intValue);
                    xq2Var.b0(-867420325);
                    if (i63Var.a == b63Var) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f = xq2Var.f(qn2Var) | xq2Var.f(i63Var);
                    Object P = xq2Var.P();
                    if (f || P == obj5) {
                        P = new r73(qn2Var, i63Var);
                        xq2Var.l0(P);
                    }
                    on2 on2Var = (on2) P;
                    boolean f2 = xq2Var.f(qn2Var2) | xq2Var.f(i63Var);
                    Object P2 = xq2Var.P();
                    if (f2 || P2 == obj5) {
                        P2 = new s73(qn2Var2, i63Var);
                        xq2Var.l0(P2);
                    }
                    x73.a(i63Var, z2, on2Var, (on2) P2, xq2Var, 0);
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
                        i6 = 4;
                    }
                    i3 = intValue4 | i6;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i3 & 1, z3)) {
                    i63 i63Var2 = (i63) list.get(intValue3);
                    xq2Var2.b0(977837842);
                    if (i63Var2.a == b63Var) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f3 = xq2Var2.f(qn2Var) | xq2Var2.f(i63Var2);
                    Object P3 = xq2Var2.P();
                    if (f3 || P3 == obj5) {
                        P3 = new t73(qn2Var, i63Var2);
                        xq2Var2.l0(P3);
                    }
                    on2 on2Var2 = (on2) P3;
                    boolean f4 = xq2Var2.f(qn2Var2) | xq2Var2.f(i63Var2);
                    Object P4 = xq2Var2.P();
                    if (f4 || P4 == obj5) {
                        P4 = new u73(qn2Var2, i63Var2);
                        xq2Var2.l0(P4);
                    }
                    x73.a(i63Var2, z4, on2Var2, (on2) P4, xq2Var2, 0);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
