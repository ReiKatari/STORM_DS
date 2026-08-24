package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m46  reason: default package */
/* loaded from: classes.dex */
public final class m46 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String L;
    public final /* synthetic */ List R;
    public final /* synthetic */ nh2 X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ qa4 d0;
    public final /* synthetic */ qa4 e0;

    public m46(List list, boolean z, String str, List list2, nh2 nh2Var, qn2 qn2Var, qn2 qn2Var2, qa4 qa4Var, qa4 qa4Var2) {
        this.A = list;
        this.B = z;
        this.L = str;
        this.R = list2;
        this.X = nh2Var;
        this.Y = qn2Var;
        this.Z = qn2Var2;
        this.d0 = qa4Var;
        this.e0 = qa4Var2;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        nh2 nh2Var;
        int i2;
        int i3;
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
            i = i3 | intValue2;
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
            c46 c46Var = (c46) this.A.get(intValue);
            xq2Var.b0(1604867247);
            c46 c46Var2 = (c46) gt0.J0(this.R);
            if (c46Var2 != null && c46Var.a == c46Var2.a) {
                nh2Var = this.X;
            } else {
                nh2Var = null;
            }
            nh2 nh2Var2 = nh2Var;
            qn2 qn2Var = this.Y;
            boolean f = xq2Var.f(qn2Var) | xq2Var.h(c46Var);
            Object P = xq2Var.P();
            Object obj5 = ox0.a;
            if (f || P == obj5) {
                P = new k46(qn2Var, c46Var, 0);
                xq2Var.l0(P);
            }
            on2 on2Var = (on2) P;
            qn2 qn2Var2 = this.Z;
            boolean f2 = xq2Var.f(qn2Var2) | xq2Var.h(c46Var);
            Object P2 = xq2Var.P();
            if (f2 || P2 == obj5) {
                P2 = new k46(qn2Var2, c46Var, 1);
                xq2Var.l0(P2);
            }
            on2 on2Var2 = (on2) P2;
            boolean h = xq2Var.h(c46Var);
            Object P3 = xq2Var.P();
            if (h || P3 == obj5) {
                P3 = new l46(c46Var, this.d0, 0);
                xq2Var.l0(P3);
            }
            on2 on2Var3 = (on2) P3;
            boolean h2 = xq2Var.h(c46Var);
            Object P4 = xq2Var.P();
            if (h2 || P4 == obj5) {
                P4 = new l46(c46Var, this.e0, 1);
                xq2Var.l0(P4);
            }
            nc1.x(c46Var, this.B, this.L, nh2Var2, on2Var, on2Var2, on2Var3, (on2) P4, xq2Var, 0);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
