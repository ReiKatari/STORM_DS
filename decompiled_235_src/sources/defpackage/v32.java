package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v32  reason: default package */
/* loaded from: classes.dex */
public final class v32 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;

    public /* synthetic */ v32(List list, qn2 qn2Var, int i) {
        this.A = i;
        this.B = list;
        this.L = qn2Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
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
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        List list = this.B;
        qn2 qn2Var = this.L;
        switch (i13) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var).f(lp3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
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
                    co0 co0Var = (co0) list.get(intValue);
                    xq2Var.b0(1158729181);
                    a74 c = dj6.c(x64Var, 1.0f);
                    boolean f = xq2Var.f(qn2Var) | xq2Var.f(co0Var);
                    Object P = xq2Var.P();
                    if (f || P == vs0Var) {
                        P = new i5(4, qn2Var, co0Var);
                        xq2Var.l0(P);
                    }
                    ge7.d(c, co0Var, (on2) P, xq2Var, 6);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                lp3 lp3Var2 = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
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
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i4 & 1, z2)) {
                    an0 an0Var = (an0) list.get(intValue3);
                    xq2Var2.b0(-476599689);
                    a74 c2 = dj6.c(x64Var, 1.0f);
                    boolean f2 = xq2Var2.f(qn2Var) | xq2Var2.h(an0Var);
                    Object P2 = xq2Var2.P();
                    if (f2 || P2 == vs0Var) {
                        P2 = new i5(5, qn2Var, an0Var);
                        xq2Var2.l0(P2);
                    }
                    gi2.c(c2, an0Var, (on2) P2, xq2Var2, 6);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                lp3 lp3Var3 = (lp3) obj;
                int intValue5 = ((Number) obj2).intValue();
                px0 px0Var3 = (px0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (((xq2) px0Var3).f(lp3Var3)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue6 | i9;
                } else {
                    i7 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((xq2) px0Var3).d(intValue5)) {
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
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(i7 & 1, z3)) {
                    cp2 cp2Var = (cp2) list.get(intValue5);
                    xq2Var3.b0(-196696351);
                    a74 c3 = dj6.c(x64Var, 1.0f);
                    boolean f3 = xq2Var3.f(qn2Var) | xq2Var3.h(cp2Var);
                    Object P3 = xq2Var3.P();
                    if (f3 || P3 == vs0Var) {
                        P3 = new i5(6, qn2Var, cp2Var);
                        xq2Var3.l0(P3);
                    }
                    mp2.a(c3, cp2Var, (on2) P3, xq2Var3, 6);
                    xq2Var3.p(false);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var4 = (lp3) obj;
                int intValue7 = ((Number) obj2).intValue();
                px0 px0Var4 = (px0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (((xq2) px0Var4).f(lp3Var4)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i10 = intValue8 | i12;
                } else {
                    i10 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (((xq2) px0Var4).d(intValue7)) {
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
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(i10 & 1, z4)) {
                    qe4 qe4Var = (qe4) list.get(intValue7);
                    xq2Var4.b0(-567447365);
                    boolean f4 = xq2Var4.f(qn2Var) | xq2Var4.f(qe4Var);
                    Object P4 = xq2Var4.P();
                    if (f4 || P4 == vs0Var) {
                        P4 = new i5(8, qn2Var, qe4Var);
                        xq2Var4.l0(P4);
                    }
                    bl2.h(qe4Var, (on2) P4, xq2Var4, 0);
                    xq2Var4.p(false);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
        }
    }
}
