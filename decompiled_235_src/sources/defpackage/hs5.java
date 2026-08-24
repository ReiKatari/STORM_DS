package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs5  reason: default package */
/* loaded from: classes.dex */
public final class hs5 implements go2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ Map L;
    public final /* synthetic */ int R;
    public final /* synthetic */ qn2 X;
    public final /* synthetic */ ss5 Y;
    public final /* synthetic */ qn2 Z;
    public final /* synthetic */ Map d0;
    public final /* synthetic */ Map e0;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ Set h0;
    public final /* synthetic */ qn2 i0;
    public final /* synthetic */ qn2 j0;
    public final /* synthetic */ qn2 k0;

    public hs5(List list, qn2 qn2Var, Map map, int i, qn2 qn2Var2, ss5 ss5Var, qn2 qn2Var3, Map map2, Map map3, boolean z, boolean z2, Set set, qn2 qn2Var4, qn2 qn2Var5, qn2 qn2Var6) {
        this.A = list;
        this.B = qn2Var;
        this.L = map;
        this.R = i;
        this.X = qn2Var2;
        this.Y = ss5Var;
        this.Z = qn2Var3;
        this.d0 = map2;
        this.e0 = map3;
        this.f0 = z;
        this.g0 = z2;
        this.h0 = set;
        this.i0 = qn2Var4;
        this.j0 = qn2Var5;
        this.k0 = qn2Var6;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
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
        boolean z5 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(i & 1, z)) {
            int i4 = i & 126;
            Object obj5 = (nr5) this.A.get(intValue);
            xq2Var.b0(-646432882);
            boolean z6 = obj5 instanceof lr5;
            ss5 ss5Var = this.Y;
            Object obj6 = ox0.a;
            if (z6) {
                xq2Var.b0(-1406325702);
                lr5 lr5Var = (lr5) obj5;
                String str2 = lr5Var.b;
                String str3 = lr5Var.c;
                Object obj7 = this.B;
                boolean f = xq2Var.f(obj5) | xq2Var.f(obj7);
                Object P = xq2Var.P();
                if (f || P == obj6) {
                    P = new i5(12, obj7, lr5Var);
                    xq2Var.l0(P);
                }
                on2 on2Var = (on2) P;
                a74 o0 = nw7.o0(intValue, i61.m("folder:", lr5Var.a), this.L, this.R, this.X, xq2Var, (i4 >> 3) & 14);
                if (intValue != ss5Var.a.size() - 1) {
                    z5 = false;
                }
                hv.f(str2, str3, on2Var, nw7.N(o0, z5), xq2Var, 0);
                xq2Var.p(false);
                z4 = false;
            } else if (obj5 instanceof mr5) {
                xq2Var.b0(-645678095);
                mr5 mr5Var = (mr5) obj5;
                pq5 pq5Var = mr5Var.a;
                String str4 = pq5Var.i;
                Uri uri = pq5Var.d;
                qn2 qn2Var = this.Z;
                boolean f2 = xq2Var.f(qn2Var) | xq2Var.f(obj5);
                Object P2 = xq2Var.P();
                if (f2 || P2 == obj6) {
                    P2 = new ds5(qn2Var, mr5Var, null, 1);
                    xq2Var.l0(P2);
                }
                mb3.i(xq2Var, (eo2) P2, uri);
                String str5 = (String) this.d0.get(str4);
                String uri2 = uri.toString();
                Map map = this.e0;
                String str6 = (String) map.get(uri2);
                if (str6 != null && str6.length() > 0) {
                    str = str6;
                } else {
                    str = null;
                }
                if (map.get(uri.toString()) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.g0 && (this.h0.contains(str4) || (!qs6.v0(str4) && !pq5Var.c()))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qn2 qn2Var2 = this.i0;
                boolean f3 = xq2Var.f(qn2Var2) | xq2Var.f(obj5);
                Object P3 = xq2Var.P();
                if (f3 || P3 == obj6) {
                    P3 = new es5(qn2Var2, mr5Var, 2);
                    xq2Var.l0(P3);
                }
                on2 on2Var2 = (on2) P3;
                qn2 qn2Var3 = this.j0;
                boolean f4 = xq2Var.f(qn2Var3) | xq2Var.f(obj5);
                Object P4 = xq2Var.P();
                if (f4 || P4 == obj6) {
                    P4 = new es5(qn2Var3, mr5Var, 3);
                    xq2Var.l0(P4);
                }
                on2 on2Var3 = (on2) P4;
                qn2 qn2Var4 = this.k0;
                boolean f5 = xq2Var.f(obj5) | xq2Var.f(qn2Var4);
                Object P5 = xq2Var.P();
                if (f5 || P5 == obj6) {
                    P5 = new es5(qn2Var4, mr5Var, 4);
                    xq2Var.l0(P5);
                }
                on2 on2Var4 = (on2) P5;
                a74 o02 = nw7.o0(intValue, nw7.a0(mr5Var), this.L, this.R, this.X, xq2Var, (i4 >> 3) & 14);
                if (intValue != ss5Var.a.size() - 1) {
                    z5 = false;
                }
                hv.g(pq5Var, str5, str, z2, this.f0, z3, on2Var2, on2Var3, on2Var4, nw7.N(o02, z5), xq2Var, 0);
                z4 = false;
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, -1406325995, false);
            }
            xq2Var.p(z4);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
