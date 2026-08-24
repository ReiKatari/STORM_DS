package defpackage;

import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c10  reason: default package */
/* loaded from: classes.dex */
public final class c10 implements go2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ List B;
    public final /* synthetic */ UUID L;
    public final /* synthetic */ qn2 R;
    public final /* synthetic */ qn2 X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    public c10(List list, UUID uuid, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, na4 na4Var, qn2 qn2Var4) {
        this.B = list;
        this.L = uuid;
        this.R = qn2Var;
        this.X = qn2Var2;
        this.Y = qn2Var3;
        this.Z = na4Var;
        this.d0 = qn2Var4;
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
        int i7 = this.A;
        jg7 jg7Var = jg7.a;
        UUID uuid = this.L;
        List list = this.B;
        Object obj5 = ox0.a;
        qn2 qn2Var = this.R;
        qn2 qn2Var2 = this.X;
        qn2 qn2Var3 = this.Y;
        Object obj6 = this.Z;
        Object obj7 = this.d0;
        boolean z3 = true;
        switch (i7) {
            case 0:
                ro3 ro3Var = (ro3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var).f(ro3Var)) {
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
                    n00 n00Var = (n00) list.get(intValue);
                    xq2Var.b0(673656973);
                    if (n00Var == null) {
                        xq2Var.b0(673656817);
                        if (uuid != null) {
                            z3 = false;
                        }
                        boolean f = xq2Var.f(qn2Var);
                        Object P = xq2Var.P();
                        if (f || P == obj5) {
                            P = new a10(qn2Var, 0);
                            xq2Var.l0(P);
                        }
                        ak7.A(z3, (on2) P, xq2Var, 0);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(673861665);
                        boolean k = nb3.k(uuid, n00Var.a);
                        sg6 sg6Var = (sg6) obj6;
                        sn snVar = (sn) obj7;
                        boolean f2 = xq2Var.f(qn2Var) | xq2Var.h(n00Var);
                        Object P2 = xq2Var.P();
                        if (f2 || P2 == obj5) {
                            P2 = new b10(qn2Var, n00Var, 0);
                            xq2Var.l0(P2);
                        }
                        on2 on2Var = (on2) P2;
                        boolean f3 = xq2Var.f(qn2Var2) | xq2Var.h(n00Var);
                        Object P3 = xq2Var.P();
                        if (f3 || P3 == obj5) {
                            P3 = new b10(qn2Var2, n00Var, 1);
                            xq2Var.l0(P3);
                        }
                        on2 on2Var2 = (on2) P3;
                        boolean f4 = xq2Var.f(qn2Var3) | xq2Var.h(n00Var);
                        Object P4 = xq2Var.P();
                        if (f4 || P4 == obj5) {
                            P4 = new b10(qn2Var3, n00Var, 2);
                            xq2Var.l0(P4);
                        }
                        ak7.g(n00Var, k, sg6Var, snVar, on2Var, on2Var2, (on2) P4, xq2Var, 0);
                        xq2Var.p(false);
                    }
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                qn2 qn2Var4 = (qn2) obj7;
                na4 na4Var = (na4) obj6;
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var)) {
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
                    fk3 fk3Var = (fk3) list.get(intValue3);
                    xq2Var2.b0(-1339358008);
                    boolean k2 = nb3.k(fk3Var.a, uuid);
                    boolean f5 = xq2Var2.f(qn2Var) | xq2Var2.h(fk3Var);
                    Object P5 = xq2Var2.P();
                    if (f5 || P5 == obj5) {
                        P5 = new bo3(qn2Var, fk3Var, 0);
                        xq2Var2.l0(P5);
                    }
                    on2 on2Var3 = (on2) P5;
                    boolean h = xq2Var2.h(fk3Var) | xq2Var2.f(qn2Var2);
                    Object P6 = xq2Var2.P();
                    if (h || P6 == obj5) {
                        P6 = new bo3(fk3Var, qn2Var2);
                        xq2Var2.l0(P6);
                    }
                    on2 on2Var4 = (on2) P6;
                    boolean f6 = xq2Var2.f(qn2Var3) | xq2Var2.h(fk3Var);
                    Object P7 = xq2Var2.P();
                    if (f6 || P7 == obj5) {
                        P7 = new bo3(qn2Var3, fk3Var, 2);
                        xq2Var2.l0(P7);
                    }
                    on2 on2Var5 = (on2) P7;
                    boolean h2 = xq2Var2.h(na4Var) | xq2Var2.h(fk3Var) | xq2Var2.f(qn2Var4);
                    Object P8 = xq2Var2.P();
                    if (h2 || P8 == obj5) {
                        P8 = new co3(na4Var, fk3Var, qn2Var4);
                        xq2Var2.l0(P8);
                    }
                    np2.b(fk3Var, k2, on2Var3, on2Var4, on2Var5, (on2) P8, xq2Var2, 0);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public c10(List list, UUID uuid, qn2 qn2Var, sg6 sg6Var, sn snVar, qn2 qn2Var2, qn2 qn2Var3) {
        this.B = list;
        this.L = uuid;
        this.R = qn2Var;
        this.Z = sg6Var;
        this.d0 = snVar;
        this.X = qn2Var2;
        this.Y = qn2Var3;
    }
}
