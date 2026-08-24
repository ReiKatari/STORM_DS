package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr7  reason: default package */
/* loaded from: classes.dex */
public final class nr7 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Map L;
    public final /* synthetic */ List R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ qn2 d0;

    public nr7(List list, String str, Map map, List list2, boolean z, String str2, qn2 qn2Var, qn2 qn2Var2) {
        this.A = list;
        this.B = str;
        this.L = map;
        this.R = list2;
        this.X = z;
        this.Y = str2;
        this.Z = qn2Var;
        this.d0 = qn2Var2;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        int i3;
        int i4;
        lp3 lp3Var = (lp3) obj;
        int intValue = ((Number) obj2).intValue();
        px0 px0Var = (px0) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((xq2) px0Var).f(lp3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i = i4 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((xq2) px0Var).d(intValue)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i |= i3;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            hm4 hm4Var = (hm4) this.A.get(intValue);
            xq2Var.b0(-1192284838);
            boolean k = nb3.k(this.B, hm4Var.a);
            Integer num = (Integer) this.L.get(hm4Var.a);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            zq7 h0 = vy7.h0(hm4Var, this.R);
            if (this.X && (str = this.Y) != null && h0 != null && str.equals(h0.a)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (h0 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object obj5 = this.Z;
            boolean f = xq2Var.f(obj5) | xq2Var.h(hm4Var);
            Object P = xq2Var.P();
            Object obj6 = ox0.a;
            if (f || P == obj6) {
                P = new i5(13, obj5, hm4Var);
                xq2Var.l0(P);
            }
            on2 on2Var = (on2) P;
            boolean f2 = xq2Var.f(h0);
            qn2 qn2Var = this.d0;
            boolean f3 = f2 | xq2Var.f(qn2Var);
            Object P2 = xq2Var.P();
            if (f3 || P2 == obj6) {
                P2 = new lr7(h0, qn2Var);
                xq2Var.l0(P2);
            }
            vy7.y(hm4Var, k, i2, z3, z2, on2Var, (on2) P2, xq2Var, 0);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
